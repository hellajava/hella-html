package sh.hella.html.handler;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.hella.html.document.Model;

import java.io.IOException;

/**
 * The type Web socket handler.
 */
@WebSocket
public class WebSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketHandler.class.getName());

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
    }

    /**
     * On message.
     *
     * @param session the session
     * @param message the message
     * @throws IOException the io exception
     */
    @OnWebSocketMessage
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void onMessage(Session session, String message) throws IOException {
        logger.debug("Received message from {}: {}", session.getRemoteAddress(), message);

        // TODO: get UUID more directly instead of deserializing twice
        Model newModel = Model.OBJECT_MAPPER.readValue(message, Model.class);
        Model oldModel = Model.get(newModel.uuid);
        Model.OBJECT_MAPPER.readerForUpdating(oldModel).readValue(message);
        if (oldModel.onUpdate() != null) {
            oldModel.onUpdate().accept(oldModel);
        }

        UpdateModelResponse response = new UpdateModelResponse(oldModel.uuid, oldModel.render().toString());
        session.getRemote().sendString(Model.OBJECT_MAPPER.writeValueAsString(response));
    }
}
