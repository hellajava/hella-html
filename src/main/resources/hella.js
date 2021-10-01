function _hella_update_model(id, json) {
    var url = '/_hella_model/' + id;
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState == XMLHttpRequest.DONE) {
           if (xhr.status == 200) {
               document.getElementById(id).innerHTML = xhr.responseText;
           } else {
               alert('Error: ' + xhr.status);
           }
        }
    };
    xhr.open("PUT", url, true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(JSON.stringify(json));
}
