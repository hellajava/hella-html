package sh.hella.html.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type Web socket handler.
 */
@WebSocket
public class WebSocketHandler {
    private static final Map<Session, WebContext> sessionContextMap = new ConcurrentHashMap<>();
    private static final Map<String, WebContext> pageIdContextMap = new ConcurrentHashMap<>();
    private static final Logger logger = LoggerFactory.getLogger(WebSocketHandler.class.getName());
    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * On connect.
     *
     * @param session the session
     */
    @OnWebSocketConnect
    public void onConnect(Session session) {
        logger.info("WebSocket session connected from {}", session.getRemoteAddress());
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
        WebContext context = sessionContextMap.get(session);
        pageIdContextMap.remove(context.getPageId());
        sessionContextMap.remove(session);

        logger.info("WebSocket session closed from {}, statusCode={}, reason={}",
                session.getRemoteAddress(), statusCode, reason);
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
        logger.info("Received message from {}: {}", session.getRemoteAddress(), data);
        Message message = objectMapper.readValue(data, Message.class);
        if (message.action.equals("set-page-id")) {
            String pageId = message.data;
            WebContext webContext = pageIdContextMap.get(pageId);
            webContext.setWebSocketSession(session);
            sessionContextMap.put(session, webContext);
        } else if (message.action.equals("rpc")) {
            RpcMessage rpcMessage = objectMapper.readValue(message.data, RpcMessage.class);
            WebContext context = sessionContextMap.get(session);
            context.getRpcMessageDecoderMap().get(rpcMessage.uuid).handle(rpcMessage);
        }
    }

    /**
     * Gets a web context for a page ID.
     * @param pageId The page ID
     * @return The web context
     */
    public static WebContext getContextForPageId(String pageId) {
        return pageIdContextMap.get(pageId);
    }

    /**
     * Sets context for page id.
     *
     * @param pageId     the page id
     * @param webContext the web context
     * @return the context for page id
     */
    public static WebContext setContextForPageId(String pageId, WebContext webContext) {
        pageIdContextMap.put(pageId, webContext);
        return webContext;
    }
}
