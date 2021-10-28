package sh.hella.html;

import sh.hella.html.handler.WebSocketHandler;

import static sh.hella.html.Html.*;
import static sh.hella.html.Utilities.*;
import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.webSocket;

/**
 * The interface Hella.
 */
public interface Hella {

    static void main(String[] args) {
        setup();
        get("/", (req, res) -> html(
            head(
                script(fromResource("hella.js"))
            ),
            body(
                text("Hello world"),
                button(text("Test"), onclick(event -> {
                    System.out.println("Clicked");
                }))
            )
        ).toString());
    }

    /**
     * Sets up the framework.
     */
    static void setup() {
        webSocket("/hella-ws", new WebSocketHandler());
    }
}
