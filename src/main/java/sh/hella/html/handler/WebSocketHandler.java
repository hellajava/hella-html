package sh.hella.html.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.hella.html.document.Model;

import java.io.IOException;

@WebSocket
public class WebSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketHandler.class.getName());

    @OnWebSocketConnect
    public void onConnect(Session session) {
        logger.debug("WebSocket session connected from {}", session.getRemoteAddress());
    }

    @OnWebSocketClose
    public void onClose(Session session, int statusCode, String reason) {
        logger.debug("WebSocket session closed from {}, statusCode={}, reason={}",
                session.getRemoteAddress(), statusCode, reason);
    }

    @OnWebSocketMessage
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void onMessage(Session session, String message) throws IOException {
        logger.info("Received message from {}: {}", session.getRemoteAddress(), message);

        // TODO: get UUID more directly instead of deserializing twice
        Model newModel = Model.OBJECT_MAPPER.readValue(message, Model.class);
        Model oldModel = Model.get(newModel.uuid);
        Model.OBJECT_MAPPER.readerForUpdating(oldModel).readValue(message);

        UpdateModelResponse response = new UpdateModelResponse(oldModel.uuid, oldModel.render().toString());
        session.getRemote().sendString(Model.OBJECT_MAPPER.writeValueAsString(response));
    }
}
