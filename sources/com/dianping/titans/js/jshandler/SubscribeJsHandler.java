package com.dianping.titans.js.jshandler;

import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SubscribeJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34becc2df9cf17c8fbba7e4fd9cbcd21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34becc2df9cf17c8fbba7e4fd9cbcd21");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jsHost().subscribe(jsBean().argsJson.optString("action"), this);
        } catch (Throwable th) {
            try {
                jSONObject.put("status", "fail");
            } catch (Exception unused) {
            }
            c.a(Log.getStackTraceString(th), 35, new String[]{"SubscribeJsHandler"});
        }
        jsCallback(jSONObject);
    }
}
