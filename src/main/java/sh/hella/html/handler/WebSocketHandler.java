package sh.hella.html.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type Web socket handler.
 */
@WebSocket
public class WebSocketHandler {
    public static final Map<String, List<Session>> SESSION_MAP = new ConcurrentHashMap<>();
    public static final Map<String, RpcMessageDecoder<?>> RPC_DECODER_MAP = new ConcurrentHashMap<>();
    private static final Logger logger = LoggerFactory.getLogger(WebSocketHandler.class.getName());
    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * On connect.
     *
     * @param session the session
     */
    @OnWebSocketConnect
    public void onConnect(Session session) {
        logger.debug("WebSocket session connected from {}", session.getRemoteAddress());
    }

    /**
     * On close.
     *
     * @param session    the session
     * @param statusCode the status code
     * @param reason     the reason
     */
    @OnWebSocketClose
    public void onClose(Session session, int statusCode, String reason) {
        logger.debug("WebSocket session closed from {}, statusCode={}, reason={}",
                session.getRemoteAddress(), statusCode, reason);

        // Remove the session map entry
        SESSION_MAP.entrySet().stream()
                .filter(entry -> entry.getValue().contains(session))
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(SESSION_MAP::remove);
    }

    /**
     * On message.
     *
     * @param session the session
     * @param data the data
     * @throws IOException the io exception
     */
    @OnWebSocketMessage
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void onMessage(Session session, String data) throws IOException {
        logger.debug("Received message from {}: {}", session.getRemoteAddress(), data);
        Message message = objectMapper.readValue(data, Message.class);
        if (message.action.equals("set-page-id")) {
            SESSION_MAP.computeIfAbsent(message.data, k -> new ArrayList<>()).add(session);
        } else if (message.action.equals("rpc")) {
            RpcMessage rpcMessage = objectMapper.readValue(message.data, RpcMessage.class);
            if (RPC_DECODER_MAP.containsKey(rpcMessage.uuid)) {
                RPC_DECODER_MAP.get(rpcMessage.uuid).handle(rpcMessage);
                // TODO: find a way to clean up this map
            }
        }
    }
}
