var messageQ = [];
var webSocket;
initWebSocket();

function initWebSocket() {
    webSocket = new WebSocket("ws://" + location.hostname + ":" + location.port + "/hella-ws");

    webSocket.onopen = function(event) {
        var pageId = document.documentElement.getAttribute("page-id");
        var json = JSON.stringify({ action: "set-page-id", data: pageId });
        webSocket.send(json);
        while (messageQ.length != 0) {
            var msg = messageQ.shift();
            webSocket.send(msg);
        }
    }

    webSocket.onmessage = function (msg) {
        var data = JSON.parse(msg.data);
        document.querySelector("[data-uuid=\"" + data.uuid + "\"]").innerHTML = data.body;
    };

    webSocket.onerror = function(event) {
        console.error("WebSocket error: " + event);
    }
}

function _hella_rpc(uuid, data) {
    // TODO: there has to be a better way...
    var dataString = JSON.stringify(data);
    var rpcString = JSON.stringify({ uuid: uuid, data: dataString });
    var jsonString = JSON.stringify({ action: "rpc", data: rpcString });
    if (webSocket.readyState === WebSocket.CLOSED) {
        initWebSocket();
        this.messageQ.push(jsonString);
    } else {
        webSocket.send(jsonString);
    }
}
