package com.meituan.android.mrn.module.jshandler;

import com.meituan.android.mrn.module.utils.a;
import com.meituan.android.mrn.module.utils.c;
import com.meituan.android.mrn.network.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RequestJSHandler extends MRNBaseJsHandler {
    public static final String KEY = "MRN.request";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "itPKyPlQZPZWfpsQla1e953rA2m1WAPWQmlNx7I7EqURDBxblilBLQxAfDh/4HTbyjN+ofKHh8SxoFEMXVBHnQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e450c7140a4ae0249dea7454034f14d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e450c7140a4ae0249dea7454034f14d1");
            return;
        }
        JSONObject paramJSONObject = getParamJSONObject();
        if (paramJSONObject == null) {
            jsCallbackErrorMsg("RequestJSHandler: paramsObj should not null");
        } else {
            new h(getCurrentActivity()).a(paramJSONObject, new c() { // from class: com.meituan.android.mrn.module.jshandler.RequestJSHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6b0b5e1b13ab12e51d227d28689c8c1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6b0b5e1b13ab12e51d227d28689c8c1e");
                    } else {
                        RequestJSHandler.this.jsCallback(jSONObject);
                    }
                }

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(String str, Throwable th, JSONObject jSONObject) {
                    Object[] objArr2 = {str, th, jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3f497c436f518d035001281b0e95693d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3f497c436f518d035001281b0e95693d");
                    } else {
                        RequestJSHandler.this.jsCallback(a.a(str, th, jSONObject));
                    }
                }
            });
        }
    }
}
