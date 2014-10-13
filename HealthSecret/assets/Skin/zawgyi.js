//

var DOMContentLoaded;

function bindReady() {
    if (document.readyState === "complete") {
        return setTimeout(ready, 1);
    }

    if (document.addEventListener) {
        document.addEventListener("DOMContentLoaded", DOMContentLoaded, false);
        window.addEventListener("load", ready, false);
    } else if (document.attachEvent) {
        document.attachEvent("onreadystatechange", DOMContentLoaded);
        window.attachEvent("onload", ready);
    }
}

if (document.addEventListener) {
    DOMContentLoaded = function() {
        document.removeEventListener("DOMContentLoaded", DOMContentLoaded, false);
        ready();
    };

} else if (document.attachEvent) {
    DOMContentLoaded = function() {
        // Make sure body exists, at least, in case IE gets a little overzealous (ticket #5443).
        if (document.readyState === "complete") {
            document.detachEvent("onreadystatechange", DOMContentLoaded);
            ready();
        }
    };
}

function ready() {
    var text = document.body.innerHTML;
    for (i = 0; i < 0x9F; i++) {
        text = text.replace(String.fromCharCode(0x1000 + i), String.fromCharCode(0xFA00 + i));
    }
    document.body.innerHTML = text;
}

bindReady();