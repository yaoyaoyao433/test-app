;(function() {
    if (window.nvmidas && window.nvmidas.isAvailable) { return }
    var messageHandlers = {};
    var responseCallbacks = {};
    var uniqueId = 1;
    function init(messageHandler) {
        if (nvmidas._messageHandler) { throw new Error('nvmidas.init called twice'); }
        nvmidas._messageHandler = messageHandler;
    }
    function send(data, responseCallback) {
        _doSend({ data:data }, responseCallback);
    }
    function registerHandler(handlerName, handler) {
        messageHandlers[handlerName] = handler;
    }

    function callHandler(handlerName, data, responseCallback) {
        _doSend({ handlerName:handlerName, data:data }, responseCallback);
    }
    function _doSend(message, responseCallback) {

        if (responseCallback) {
            var callbackId = 'cb_'+(uniqueId++)+'_'+new Date().getTime();
            responseCallbacks[callbackId] = responseCallback;
            message['callbackId'] = callbackId;
            }
        prompt(JSON.stringify(message));
    }

    function _dispatchMessageFromJava(messageJSON) {
            var message = messageJSON;
            if (message.responseId) {

                var responseCallback = responseCallbacks[message.responseId];
                if (!responseCallback) { return; }
                responseCallback(message.responseData);
                delete responseCallbacks[message.responseId];
            } else {
                var responseCallback;
                if (message.callbackId) {
                    var callbackResponseId = message.callbackId;
                    responseCallback = function(responseData) {
                        _doSend({ responseId:callbackResponseId, responseData:responseData })
                    };
                }
                var handler = nvmidas._messageHandler;
                if (message.handlerName) {
                    handler = messageHandlers[message.handlerName];
                }
                try {
                    message.data = JSON.parse(message.data);
                    handler(message.data, responseCallback);
                } catch(exception) {
                   console.log(exception.message);
                   if (typeof console != 'undefined') {
                       console.log("nvmidas: WARNING: javascript handler threw.", message, exception);
                   }
                }
            }
    }

    function _getApiVer() {
        return "1.0.0";
    }

    function _openUrl(url){
        prompt(url, 'openUrl');
    }

    function _fail(reason) {
        prompt(reason, 'fail');
    }

    function _loadView(size){
        prompt(JSON.stringify(size), 'loadView');
    }

    function _getEnvironmentInfo(handler) {
        handler(JSON.parse(prompt('getEnvironmentInfo', 'getEnvironmentInfo')));
    }

    function _getPageInfo(handler) {
        handler(JSON.parse(prompt('getPageInfo', 'getPageInfo')));
    }

    function _registerScrollEndListener(handler){
        registerHandler("onScrollEnd", handler);
    }

    function _doFeedback(act, feedbackStringArray){
        prompt('{"act":'+act+',"feedback":['+ feedbackStringArray+']}', 'doFeedback');
    }

    function _getAdData(handler){
        registerHandler("getData", handler);
        prompt(1,'getAdData');
    }

    function _handleMessageFromJava(messageJSON) {
        _dispatchMessageFromJava(messageJSON);
    }

    function _error(desc,info) {
        var messageJSON='{"desc":"'+desc+'","info":"'+info+'"}';
        prompt(messageJSON,'error');
    }

    function _warning(desc,info) {
        var messageJSON='{"desc":"'+desc+'","info":"'+info+'"}';
        prompt(messageJSON,'warning');
    }

    window.nvmidas = {
        init: init,
        send: send,
        registerHandler: registerHandler,
        callHandler: callHandler,
        isAvailable: true,
        fail:_fail,
        getApiVer:_getApiVer,
        openUrl: _openUrl,
        getEnvironmentInfo:_getEnvironmentInfo,
        getPageInfo:_getPageInfo,
        loadView:_loadView,
        registerScrollEndListener: _registerScrollEndListener,
        doFeedback:_doFeedback,
        getData:_getAdData,
        _handleMessageFromJava: _handleMessageFromJava,
        error:_error,
        warning:_warning
    };

    var doc = document;
    var readyEvent = doc.createEvent('Events');
    readyEvent.initEvent('nvmidasReady');
    readyEvent.bridge = nvmidas;
    doc.dispatchEvent(readyEvent);
})();