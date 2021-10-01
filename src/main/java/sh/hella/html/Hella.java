package sh.hella.html;

import sh.hella.html.handler.WebSocketHandler;

import static spark.Spark.webSocket;

public interface Hella {

    static void setup() {
        webSocket("/hella-ws", new WebSocketHandler());
    }

}
