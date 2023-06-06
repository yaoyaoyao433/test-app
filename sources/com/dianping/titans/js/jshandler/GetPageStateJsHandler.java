package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetPageStateJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 2;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9046baa8b09ae014a8cefebfe2313e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9046baa8b09ae014a8cefebfe2313e09");
            return;
        }
        try {
            JsHost jsHost = jsHost();
            if (jsHost == null) {
                jsCallbackErrorMsg("no host");
            } else if (jsHost instanceof KNBJsHost) {
                JSONObject hostState = ((KNBJsHost) jsHost).getHostState();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appear", hostState.optBoolean("appear"));
                jSONObject.put("foreground", hostState.optBoolean("foreground"));
                jsCallback(jSONObject);
            }
        } catch (Throwable th) {
            jsCallbackErrorMsg("inner err: " + th.getMessage());
        }
    }
}
