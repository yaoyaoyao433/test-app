package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetServiceInfoJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        String optString;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68c3c6907c3a467cacfa07b267747aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68c3c6907c3a467cacfa07b267747aec");
            return;
        }
        String str = null;
        try {
            optString = jsBean().argsJson.optString("name");
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(optString)) {
            jsCallbackErrorMsg("empty name");
            return;
        }
        Object invoke = Class.forName(optString + ".VersionInfo").getDeclaredMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
        if (invoke instanceof String) {
            str = (String) invoke;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", str);
            jsCallback(jSONObject);
        } catch (JSONException unused2) {
        }
    }
}
