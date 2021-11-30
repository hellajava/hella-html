var messageQ = [];
var webSocket;
initWebSocket();

function getCookie(name) {
  const value = `; ${document.cookie}`;
  const parts = value.split(`; ${name}=`);
  if (parts.length === 2) return parts.pop().split(';').shift();
}

function initWebSocket() {
    webSocket = new WebSocket("ws://" + location.hostname + ":" + location.port + "/hella-ws");

    webSocket.onopen = function(event) {
        webSocket.send(JSON.stringify({
            eventId: "__hella_setWebContextId",
            eventBody: getCookie("X-Hella-WebContext-ID")
        }));
        while (messageQ.length != 0) {
            var msg = messageQ.shift();
            webSocket.send(msg);
        }
    }

    webSocket.onmessage = function (msg) {
        var data = JSON.parse(msg.data);
        document.querySelector("[data-component-id=\"" + data.componentId + "\"]").innerHTML = data.body;
    };

    webSocket.onerror = function(event) {
        console.error("WebSocket error: " + event);
    }
}

function _hella_event(eventId) {
    var jsonString = JSON.stringify({
        eventId: eventId,
        eventBody: JSON.stringify({
            value: document.querySelector('[data-event-id="' + eventId + '"]').value
        })
    });
    if (webSocket.readyState === WebSocket.CLOSED) {
        initWebSocket();
        this.messageQ.push(jsonString);
    } else {
        webSocket.send(jsonString);
    }
}
