package sh.hella.html;

import sh.hella.html.handler.WebSocketHandler;

import static spark.Spark.webSocket;

/**
 * The interface Hella.
 */
public interface Hella {

    /**
     * Sets up the framework.
     */
    static void setup() {
        webSocket("/hella-ws", new WebSocketHandler());
    }

}
