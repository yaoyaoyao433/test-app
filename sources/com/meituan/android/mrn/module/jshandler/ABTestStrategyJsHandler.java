package com.meituan.android.mrn.module.jshandler;

import android.text.TextUtils;
import com.facebook.common.logging.a;
import com.meituan.android.mrn.config.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ABTestStrategyJsHandler extends MRNBaseJsHandler {
    public static final String KEY = "MRN.getABStrategy";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "e6nwZSQD+422r9RZy4kJ3RsNaFCB8myItvqlgzXeYHXtfzj7NS76q0Y8psxcqn5fZSW83D8NAJFx3xNUTB1DSA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef353c871512602aea6f5cb4788aeba0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef353c871512602aea6f5cb4788aeba0");
            return;
        }
        JSONObject paramJSONObject = getParamJSONObject();
        if (paramJSONObject == null) {
            jsCallbackErrorMsg("ABTestStrategyJsHandler: params should not null");
            return;
        }
        String optString = paramJSONObject.optString("key");
        if (TextUtils.isEmpty(optString)) {
            jsCallbackErrorMsg("ABTest key should not empty");
            return;
        }
        try {
            String a = z.a().a(optString);
            if (a == null) {
                a = "";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", a);
            jsCallback(jSONObject);
        } catch (Exception e) {
            jsCallbackErrorMsg(e.getMessage());
            a.d("ABTestStrategyJsHandler", e.getMessage(), e);
        }
    }
}
