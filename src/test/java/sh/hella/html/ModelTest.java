package sh.hella.html;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sh.hella.html.document.Model;
import sh.hella.html.document.Section;
import static sh.hella.html.Html.*;
import static sh.hella.html.Utilities.*;

public class ModelTest {

    public static class TestModel extends Model<TestModel> {
        public String testString = "Test Button has not been clicked";
        public boolean testSucceeded = false;

        @Override
        public Section render() {
            return div(
                input(id("test-field"), type("text")),
                span(text("Test string: " + testString)),
                when(testSucceeded, span(text("Test succeeded!"))),
                button(
                    text("Test Button"),
                    onclick(updateState((testModel) -> {
                        testModel.testString = valueOf("test-field");
                        testModel.testSucceeded = true;
                    }))
                )
            );
        }
    }

    @Test
    public void model_onClick_setState_should_generate_correct_output() {
        TestModel testModel = new TestModel();

        final String document = html(
            script(fromResource("hella.js")),
            body(testModel)
        ).toString();

        final String expected = "<!DOCTYPE html><html><script>var messageQ = [];\n" +
                "var webSocket;\n" +
                "initWebSocket();\n" +
                "\n" +
                "function initWebSocket() {\n" +
                "    webSocket = new WebSocket(\"ws://\" + location.hostname + \":\" + location.port + \"/hella-ws\");\n" +
                "\n" +
                "    webSocket.onopen = function(event) {\n" +
                "        while (messageQ.length != 0) {\n" +
                "            var msg = messageQ.shift();\n" +
                "            webSocket.send(msg);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    webSocket.onmessage = function (msg) {\n" +
                "        var data = JSON.parse(msg.data);\n" +
                "        document.getElementById(data.uuid).innerHTML = data.body;\n" +
                "    };\n" +
                "\n" +
                "    webSocket.onerror = function(event) {\n" +
                "        console.error(\"WebSocket error: \" + event);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "function _hella_update_model(json) {\n" +
                "    var msg = JSON.stringify(json);\n" +
                "    if (webSocket.readyState === WebSocket.CLOSED) {\n" +
                "        initWebSocket();\n" +
                "        this.messageQ.push(msg);\n" +
                "    } else {\n" +
                "        webSocket.send(msg);\n" +
                "    }\n" +
                "}</script>" +
                "<body>" +
                    "<div id=\"" + testModel.uuid + "\">" +
                        "<input id=\"test-field\" type=\"text\"></input>" +
                        "<span>Test string: Test Button has not been clicked</span>" +
                        "<button onclick=\"_hella_update_model({&quot;@modelType&quot;:&quot;ModelTest$TestModel&quot;,&quot;uuid&quot;:&quot;" + testModel.uuid + "&quot;,&quot;testString&quot;:document.getElementById('test-field').value,&quot;testSucceeded&quot;:true})\">" +
                            "Test Button" +
                        "</button>" +
                    "</div>" +
                "</body>" +
                "</html>";

        Assertions.assertEquals(expected, document, "Expected HTML is generated");
    }

}
