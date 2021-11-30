package sh.hella.html;

import sh.hella.html.handler.WebContext;
import sh.hella.html.handler.WebContextInitializer;
import sh.hella.html.handler.WebSocketHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static spark.Spark.before;
import static spark.Spark.webSocket;

/**
 * The interface Hella.
 */
public interface Hella {
    ThreadLocal<WebContext> CONTEXT = new ThreadLocal<>();
    Map<String, WebContext> WEB_CONTEXT_MAP = new ConcurrentHashMap<>();

    /**
     * Sets up the framework.
     */
    static void setup() {
        webSocket("/hella-ws", new WebSocketHandler());
        before("*", new WebContextInitializer());
    }
}
