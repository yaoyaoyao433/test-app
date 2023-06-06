package com.meituan.android.pay.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.pay.fragment.VerifyFingerprintFragment;
import com.meituan.android.pay.process.a;
import com.meituan.android.pay.process.ntv.pay.n;
import com.meituan.android.pay.utils.k;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.android.paycommon.lib.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BiologicalValidationJSHandler extends PayBaseJSHandler implements a, FinanceJsHandler {
    private static final int CODE_ERROR_TYPE = -404;
    private static final String KEY_FINGER_TYPE = "finger_type";
    private static final String KEY_SOTER_CHALLENGE = "challenge";
    private static final String KEY_VERIFY_BEGIN = "verify_begin";
    private static final String KEY_VERIFY_TYPE = "verify_type";
    private static final String TAG = "VerifyFingerprint";
    private static final int TYPE_CANCEL_FINGERPRINT = -1;
    private static final int TYPE_FINGERPRINT = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity activity;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.verifyBiometricInfo";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "dMrcIJMPZd07qT+GbEa9jXvXpP5RX1e0H/pLE5Q7fN0APfN498IvxoD8kD/7XCw7E8Q1kGSlU55BRfms/Olfjg==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54b7983d1cfc36f41b86f3e83e60c589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54b7983d1cfc36f41b86f3e83e60c589");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            this.activity = activity;
            JSONObject jSONObject = jsBean().argsJson;
            if (jSONObject != null) {
                int optInt = jSONObject.optInt(KEY_FINGER_TYPE);
                String optString = jSONObject.optString(KEY_SOTER_CHALLENGE);
                int optInt2 = jSONObject.optInt(KEY_VERIFY_TYPE);
                if (optInt2 == 1) {
                    k.a().c = this;
                    h.c((FragmentActivity) activity, VerifyFingerprintFragment.a(optInt, optString, ""));
                    return;
                } else if (-1 == optInt2) {
                    n.a().c();
                    h.b((FragmentActivity) activity);
                    return;
                } else {
                    jsCallbackError(CODE_ERROR_TYPE, "未识别到该验证方式");
                    return;
                }
            }
            return;
        }
        jsCallbackError(11, "activity为空");
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09990bf070a0382554d40f49cef7c734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09990bf070a0382554d40f49cef7c734");
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5084256ed37d346bc5420a93d217a070", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5084256ed37d346bc5420a93d217a070") : getClass();
    }

    @Override // com.meituan.android.pay.process.a
    public void callBackFingerprintData(int i, boolean z, HashMap<String, String> hashMap) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96e624766b1972060fc0f0b50915bd71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96e624766b1972060fc0f0b50915bd71");
            return;
        }
        if (i == 3 || i == 0 || i == 4) {
            n.a().c();
            h.b((FragmentActivity) this.activity);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("verify_state", i);
            jSONObject.put("fail_too_many_times", z);
            if (!i.a(hashMap)) {
                jSONObject.put("verify_result", new JSONObject(hashMap));
            }
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HybridMeituanPayJsHandler_exec", (Map<String, Object>) null);
            jsCallbackError(1000, "数据有误");
        }
    }
}
