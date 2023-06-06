package com.meituan.android.mrn.module.jshandler;

import android.text.TextUtils;
import com.facebook.common.logging.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNInfoJsHandler extends MRNBaseJsHandler {
    public static final String KEY = "MRN.getBundleInfo";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "uYcojslOfdlYmsXURU0bbDry+9SeLs8QUjA0CO8QVZq9CLUXu5ybCg5JeRT2Smj4Ep5iI52do3siv/Og23pdRg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        JSONObject optJSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40b11a63b9dfc1d928110363cbce6622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40b11a63b9dfc1d928110363cbce6622");
            return;
        }
        JSONObject jSONObject = this.mJsBean.argsJson;
        String str = "";
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("mrnInfo")) != null) {
            String optString = optJSONObject.optString("status");
            if ("success".equals(optString)) {
                str = optJSONObject.optString("data");
            } else if ("fail".equals(optString) && !TextUtils.isEmpty(optJSONObject.optString("errorMsg"))) {
                jsCallbackErrorMsg(optJSONObject.optString("errorMsg"));
                return;
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", str);
            jsCallback(jSONObject2);
        } catch (Exception e) {
            jsCallbackErrorMsg(e.getMessage());
            a.d("MRNInfoJsHandler", e.getMessage(), e);
        }
    }
}
