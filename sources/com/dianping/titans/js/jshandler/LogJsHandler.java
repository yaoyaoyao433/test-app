package com.dianping.titans.js.jshandler;

import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LogJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb00310461a7ef5181ad804bd8497fcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb00310461a7ef5181ad804bd8497fcf");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        int optInt = jSONObject.optInt("type", 14);
        String optString = jSONObject.optString("text", "");
        if (jSONObject.isNull("tags")) {
            c.a(optString, optInt);
            jsCallback();
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("tags");
        if (optJSONArray == null) {
            jsCallbackError(521, "tags should be an array");
            return;
        }
        int length = optJSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = optJSONArray.optString(i);
        }
        c.a(optString, optInt, strArr);
        jsCallback();
    }
}
