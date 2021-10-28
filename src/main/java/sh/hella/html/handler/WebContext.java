package sh.hella.html.handler;

import org.eclipse.jetty.websocket.api.Session;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type Web context.
 */
public class WebContext {
    private Session webSocketSession;
    private String pageId;
    private final Map<String, RpcMessageDecoder<?>> rpcMessageDecoderMap = new ConcurrentHashMap<>();
    private final Map<String, Object> attributes = new ConcurrentHashMap<>();

    /**
     * Instantiates a new Web context.
     *
     * @param pageId the page id
     */
    public WebContext(String pageId) {
        this.pageId = pageId;
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
     * Gets page id.
     *
     * @return the page id
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * Sets page id.
     *
     * @param pageId the page id
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * Gets rpc message decoder map.
     *
     * @return the rpc message decoder map
     */
    public Map<String, RpcMessageDecoder<?>> getRpcMessageDecoderMap() {
        return rpcMessageDecoderMap;
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
    public Object attribute(String key) {
        return attributes.get(key);
    }
}
