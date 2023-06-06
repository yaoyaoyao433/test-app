package com.sankuai.titans.adapter.base.observers.jsinject;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SankuaiJS {
    public static final String JS_FUNCTION_DEFAULT = "javascript:(function(){var event = document.createEvent(\"HTMLEvents\");event.initEvent(\"DPJSBridgeReady\",true,false);document.dispatchEvent(event);document.dpReadyState='complete';})();";
    public static final String JS_FUNCTION_DP = "javascript:(function(){var event = document.createEvent(\"HTMLEvents\");event.osName = \"android\";%sevent.initEvent(\"DPJSBridgeReady\",true,false);document.dispatchEvent(event);document.dpReadyState='complete';})();";
    public static final String JS_INJECT = "javascript:(function () {\n  var script = document.createElement('script');\n  script.src = 'https://static.meituan.net/bs/mbs-patch/master/%s.js';\n  document.body.appendChild(script);\n}());";
    public static final String JS_INJECT_BY_SRC = "javascript:(function(){\nvar script = document.createElement('script');\nscript.src = '%s';\ndocument.head.appendChild(script);\n})();";
    public static ChangeQuickRedirect changeQuickRedirect;
}
