package sh.hella.html;

import org.junit.jupiter.api.Test;

import static sh.hella.html.Html.span;
import static sh.hella.html.Utilities.fromResource;
import static sh.hella.html.Utilities.when;

public class ComponentTest {


    @Test
    public void model_onClick_setState_should_generate_correct_output() {
        /*
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
                "        document.querySelector(\"[data-uuid=\\\"\" + data.uuid + \"\\\"]\").innerHTML = data.body;\n" +
                "    };\n" +
                "\n" +
                "    webSocket.onerror = function(event) {\n" +
                "        console.error(\"WebSocket error: \" + event);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "function _hella_rpc(uuid, data) {\n" +
                "    var dataString = JSON.stringify(data);\n" +
                "    var json = { uuid: uuid, data: dataString };\n" +
                "    var msg = JSON.stringify(json);\n" +
                "    if (webSocket.readyState === WebSocket.CLOSED) {\n" +
                "        initWebSocket();\n" +
                "        this.messageQ.push(msg);\n" +
                "    } else {\n" +
                "        webSocket.send(msg);\n" +
                "    }\n" +
                "}</script><body><div><input id=\"test-field\" type=\"text\"></input><span>Test string: Test Button has not been clicked</span><button onclick=\"function(event) { _hella_rpc('";
        final String expected2 = "', event); }\">Test Button</button></div></body></html>";

        Assertions.assertEquals(expected, document, "Expected HTML is generated");
        */
    }

}
