package com.sankuai.eh.component.web.bridge;

import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHFinParamsJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93b1efd2e349017120b3939d66436855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93b1efd2e349017120b3939d66436855");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String optString = jsBean().argsJson.optString("type");
            com.sankuai.eh.component.service.utils.b.a(jSONObject, jsBean().argsJson.getJSONObject("custom"));
            if ("risk".equals(optString)) {
                jSONObject.put("appName", com.sankuai.eh.component.service.a.c().j().get("ch_name"));
                jSONObject.put("version", com.sankuai.eh.component.service.a.c().i());
                jSONObject.put(FingerprintManager.TAG, com.sankuai.eh.component.service.a.c().g());
                jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, com.sankuai.eh.component.service.a.c().b());
                jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, com.sankuai.eh.component.service.a.c().c());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", jSONObject);
                jsCallback(jSONObject2);
                return;
            }
            jsCallbackError(30101, "invalid params");
        } catch (Exception e) {
            jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, e.getMessage());
        }
    }
}
