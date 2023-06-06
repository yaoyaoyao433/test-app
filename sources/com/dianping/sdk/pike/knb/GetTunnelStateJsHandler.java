package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.h;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetTunnelStateJsHandler extends BaseJsHandler {
    private static final String TAG = "GetTunnelStateJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "uRMYC1r4zKKDEB/PY7uZFHUz3JRbs95FkRxQ/JHMTeVODM4Q37KPo74xRL+lrGS2Zu9LS8x9vyz5lTzNxjElyQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc0810e77bbf6214a45169a1cdad9f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc0810e77bbf6214a45169a1cdad9f6f");
            return;
        }
        try {
            i.a(TAG, "knb get tunnel state exec");
            String optString = jsBean().argsJson.optString("bzId");
            a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "8fdacda6003ee147de291ea54140f523", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "8fdacda6003ee147de291ea54140f523");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("isReady", h.b(optString));
                    jsCallback(jSONObject);
                } catch (Exception unused) {
                    jsCallbackErrorMsg("get tunnel state error");
                }
            }
        } catch (Throwable th) {
            i.a(TAG, "knb get tunnel state ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
