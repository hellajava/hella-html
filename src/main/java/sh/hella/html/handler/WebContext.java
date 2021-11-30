package sh.hella.html.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.websocket.api.Session;
import sh.hella.html.event.Event;
import sh.hella.html.event.EventDispatcher;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type Web context.
 */
public class WebContext {
    private String id;
    private Session webSocketSession;
    private final Map<String, Object> attributes = new ConcurrentHashMap<>();
    private final Map<String, EventDispatcher<? extends Event>> eventDispatcherMap = new ConcurrentHashMap<>();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Instantiates a new Web context.
     *
     * @param id the page id
     */
    public WebContext(String id) {
        this.id = id;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        SetUrlMessage message = new SetUrlMessage(url);
        try {
            this.webSocketSession.getRemote().sendString(objectMapper.writeValueAsString(message));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Gets web socket session.
     *
     * @return the web socket session
     */
    public Session getWebSocketSession() {
        return webSocketSession;
    }

    /**
     * Sets web socket session.
     *
     * @param webSocketSession the web socket session
     */
    public void setWebSocketSession(Session webSocketSession) {
        this.webSocketSession = webSocketSession;
    }

    /**
     * Sets an attribute.
     *
     * @param key   the key
     * @param value the value
     */
    public void attribute(String key, Object value) {
        attributes.put(key, value);
    }

    /**
     * Gets an attribute.
     *
     * @param key the key
     * @return the object
     */
    @SuppressWarnings("unchecked")
    public <T> T attribute(String key) {
        return (T) attributes.get(key);
    }

    /**
     * Gets ID.
     *
     * @return the ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID.
     *
     * @param id the ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets event dispatcher map.
     *
     * @return the event dispatcher map
     */
    public Map<String, EventDispatcher<? extends Event>> getEventDispatcherMap() {
        return eventDispatcherMap;
    }
}
