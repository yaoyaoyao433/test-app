package com.meituan.android.paycommon.lib.webview.jshandler;

import android.app.Activity;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.e;
import com.meituan.android.paybase.fingerprint.util.c;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GetFingerprintParamJsHandler extends PayBaseJSHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07194bded65411a5d50344301d65ae23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07194bded65411a5d50344301d65ae23");
            return;
        }
        Activity activity = jsHost().getActivity();
        jsHost().getContext();
        if (activity != null) {
            String f = com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.f();
            String valueOf = String.valueOf(com.meituan.android.paybase.fingerprint.util.a.a(activity));
            String c = c.c();
            String o = com.meituan.android.paycommon.lib.config.a.a().o();
            String valueOf2 = String.valueOf(e.a(jsHost().getContext(), ""));
            String str = com.meituan.android.paybase.fingerprint.util.b.c(com.meituan.android.paybase.config.a.d().i()) ? "0" : "1";
            String d = c.d();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("model_key", f);
                jSONObject.put("support_finger_type", valueOf);
                jSONObject.put("has_touchid", c);
                jSONObject.put("nb_fingerprint", o);
                jSONObject.put("nb_version", "10.1.0");
                jSONObject.put("need_update_soter_key", valueOf2);
                jSONObject.put("google_fingerprint_locked", str);
                jSONObject.put("hardware_detected", d);
                jsCallback(jSONObject);
                return;
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "GetFingerprintParamJsHandler_exec").a("message", e.getMessage()).b);
                resultError();
                return;
            }
        }
        resultError();
    }

    private void resultError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "693921b7fb4ef94074fc3cc43f4262cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "693921b7fb4ef94074fc3cc43f4262cd");
        } else {
            jsCallbackPayError(11);
        }
    }
}
