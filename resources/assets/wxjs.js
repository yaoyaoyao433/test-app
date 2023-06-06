(function() {
    /* ========== REAL WXJS START ========== */
    window.__wxjs_environment = 'miniprogram';

    var _MESSAGE_TYPE = '__msg_type',
        _callback_map = {},
        _callback_count = 1000,
        _CALLBACK_ID = '__callback_id',
        _event_hook_map_for3rd = {},
        _EVENT_ID = '__event_id';

    var __wx = window.__wx;
    delete window.__wx;

    // on 事件 event name 存储
    var ON_PAGE_STATE_CHANGE = 'onPageStateChange'

    function _sendMessage(msg) {
        var msgArray = [];
        msgArray.push(msg);
        var msgArrayString = JSON.stringify(msgArray);
        //window.webkit.messageHandlers.invokeHandler.postMessage(msgArrayString); //ios 使用
        __wx._sendMessage(msgArrayString);
    };

    function _handleMessageFromWeixin(message) {
        var msgWrap = message;

        switch (msgWrap[_MESSAGE_TYPE]) {
            case 'callback':
                {
                    if (typeof msgWrap[_CALLBACK_ID] === 'string' && typeof _callback_map[msgWrap[_CALLBACK_ID]] === 'function') {
                        var ret = _callback_map[msgWrap[_CALLBACK_ID]](msgWrap['__params']);
                        delete _callback_map[msgWrap[_CALLBACK_ID]]; // can only call once
                        return JSON.stringify(ret);
                    }
                }
                break;
            case 'event':
                {
                    var result = []
                    if (typeof _event_hook_map_for3rd[msgWrap[_EVENT_ID]] === 'function') {
                        result.push(_event_hook_map_for3rd[msgWrap[_EVENT_ID]](msgWrap['__params']));
                        return JSON.stringify(result);
                    } else if (Array.isArray(_event_hook_map_for3rd[msgWrap[_EVENT_ID]])) {
                        _event_hook_map_for3rd[msgWrap[_EVENT_ID]].forEach(function(callback){
                            result.push(callback(msgWrap['__params']))
                        })
                        return JSON.stringify(result);
                    }
                }
        }
    };

    function _call(func, params, callback) {
        if (!func || typeof func !== 'string') {
            return;
        };
        if (typeof params !== 'object') {
            params = {};
        };

        var callbackID = (_callback_count++).toString();

        if (typeof callback === 'function') {
            _callback_map[callbackID] = callback;
        };

        var msgObj = {
            'func': func,
            'params': params
        };
        msgObj[_MESSAGE_TYPE] = 'call';
        msgObj[_CALLBACK_ID] = callbackID;
        try {
            _sendMessage(JSON.stringify(msgObj));
        } catch (e) {
            console.log("_call error", e);
        }
    }

    function _onfor3rd(event, callback) {
        if (!event || typeof event !== 'string') {
            return;
        }
        if (typeof callback !== 'function') {
            return;
        }
        if (event == ON_PAGE_STATE_CHANGE) {
            _event_hook_map_for3rd[event] = callback
        } else {
            if (!_event_hook_map_for3rd[event]) {
                _event_hook_map_for3rd[event] = []
            }
            _event_hook_map_for3rd[event].push(callback)
        }
    }

    var __WeixinJSBridge = {
        invoke: _call,
        call: _call,
        on: _onfor3rd,
    };

    try {
        Object.defineProperty(__WeixinJSBridge, '_handleMessageFromWeixin', {
            value: _handleMessageFromWeixin,
            writable: false,
            configurable: false
        });
    } catch (e) {
        console.error(e)
        return
    }

    try {
        Object.defineProperty(window, 'WeixinJSBridge', {
            value: __WeixinJSBridge,
            writable: false,
            configurable: false
        });
    } catch (e) {
        console.error(e)
        return;
    }

    // bridge ready
    var readyEvent = new Event('WeixinJSBridgeReady');
    document.dispatchEvent(readyEvent);
})();