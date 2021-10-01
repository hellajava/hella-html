var messageQ = [];
var webSocket;
initWebSocket();

function initWebSocket() {
    webSocket = new WebSocket("ws://" + location.hostname + ":" + location.port + "/hella-ws");

    webSocket.onopen = function(event) {
        while (messageQ.length != 0) {
            var msg = messageQ.shift();
            webSocket.send(msg);
        }
    }

    webSocket.onmessage = function (msg) {
        var data = JSON.parse(msg.data);
        document.getElementById(data.uuid).innerHTML = data.body;
    };

    webSocket.onerror = function(event) {
        console.error("WebSocket error: " + event);
    }
}

function _hella_update_model(json) {
    var msg = JSON.stringify(json);
    if (webSocket.readyState === WebSocket.CLOSED) {
        initWebSocket();
        this.messageQ.push(msg);
    } else {
        webSocket.send(msg);
    }
}
