package sh.hella.html.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.hella.html.Hella;
import sh.hella.html.event.EventEnvelope;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type Web socket handler.
 */
@WebSocket
public class WebSocketHandler {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketHandler.class.getName());
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final Map<Session, WebContext> sessionMap = new ConcurrentHashMap<>();

    /**
     * On connect.
     *
     * @param session the session
     */
    @OnWebSocketConnect
    public void onConnect(Session session) {
        logger.info("{} connected", session.getRemoteAddress());
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
        logger.info("{} closed, statusCode={}, reason={}", session.getRemoteAddress(), statusCode, reason);
        sessionMap.remove(session);
    }

    /**
     * On message.
     *
     * @param session the session
     * @param data the data
     * @throws IOException the io exception
     */
    @OnWebSocketMessage
    public void onMessage(Session session, String data) throws IOException {
        logger.info("{} {}", session.getRemoteAddress(), data);
        EventEnvelope event = objectMapper.readValue(data, EventEnvelope.class);

        WebContext webContext;
        if (event.getEventId().equals("__hella_setWebContextId")) {
            webContext = Hella.WEB_CONTEXT_MAP.get(event.getEventBody());
            webContext.setWebSocketSession(session);
            sessionMap.put(session, webContext);
        } else {
            webContext = sessionMap.get(session);
            Hella.CONTEXT.set(webContext);
            webContext.getEventDispatcherMap().get(event.getEventId()).dispatch(event.getEventBody());
        }
    }
}
