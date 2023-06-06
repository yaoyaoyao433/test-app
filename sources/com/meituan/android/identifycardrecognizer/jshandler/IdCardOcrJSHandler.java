package com.meituan.android.identifycardrecognizer.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.identifycardrecognizer.CleanOcrCacheService;
import com.meituan.android.identifycardrecognizer.utils.b;
import com.meituan.android.identifycardrecognizer.utils.d;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IdCardOcrJSHandler extends BaseJsHandler implements FinanceJsHandler {
    public static final int CODE_CANCEL = 12;
    public static final int CODE_ERROR = 11;
    private static final int REQUEST_OPEN_DEMO_H5 = 404;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.identifyIdCard";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "NK9me3oVzKKU6JBcBEfhHbA7OAEmR3IVDmyMCNkZWo8amYEVkuFy9UTpURMu/YR+HJsMUUKOke5Nq+WjgjWsEA==";
    }

    private void initStaticsParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11adb814c94b8857f40c047b8ab28cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11adb814c94b8857f40c047b8ab28cd1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", b.a());
        hashMap.put("customerId", b.e);
        d.a(hashMap);
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5053be980c5e2bfbb38e6cdc8b92a588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5053be980c5e2bfbb38e6cdc8b92a588");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 404) {
            if (i2 == -1) {
                if (!TextUtils.isEmpty(f.a(intent, "resultData"))) {
                    try {
                        str = new JSONObject(f.a(intent, "resultData")).getString("status");
                    } catch (JSONException e) {
                        a.a(e, "IdCardOcrJSHandler_onActivityResult", (Map<String, Object>) null);
                        str = null;
                    }
                    if (TextUtils.equals(str, "success")) {
                        handleResult();
                    } else if (TextUtils.equals(str, "fail")) {
                        resultError();
                    }
                } else if (TextUtils.equals(f.a(intent, "status"), "fail")) {
                    resultError();
                }
            } else if (i2 == 0) {
                resultCancel();
            }
            if (jsHost() == null || jsHost().getActivity() == null) {
                return;
            }
            Activity activity = jsHost().getActivity();
            try {
                activity.startService(new Intent(activity, CleanOcrCacheService.class));
            } catch (Exception e2) {
                a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "IdCardOcrJSHandler_onActivityResult_activity.startService").a("message", e2.getMessage()).b);
            }
        }
    }

    private void handleResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "903893417671edc70fbca6c5ce4ebd00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "903893417671edc70fbca6c5ce4ebd00");
        } else {
            jsCallback();
        }
    }

    private void resultError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "737ef3e0145e103a63901cd12b75531a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "737ef3e0145e103a63901cd12b75531a");
        } else {
            jsCallbackPayError(11);
        }
    }

    private void resultCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49937666b93c5dd1f97fefd09425681d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49937666b93c5dd1f97fefd09425681d");
        } else {
            jsCallbackPayError(12);
        }
    }

    public void jsCallbackPayError(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b44156fa56d3fb72504a9010b3b694af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b44156fa56d3fb72504a9010b3b694af");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorMsg", str);
            jSONObject.put("errorCode", i);
        } catch (JSONException e) {
            a.a(e, "IdCardOcrJSHandler_jsCallbackPayError", (Map<String, Object>) null);
        }
        jsCallback(jSONObject);
    }

    public void jsCallbackPayError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f74b556ebc6ce478cc1b427bbee57ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f74b556ebc6ce478cc1b427bbee57ca");
        } else {
            jsCallbackPayError(str, 0);
        }
    }

    public void jsCallbackPayError(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42cdb539f1fe58d9fec404fca570ca0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42cdb539f1fe58d9fec404fca570ca0b");
        } else {
            jsCallbackPayError("", i);
        }
    }

    public void jsCallbackPayError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "113db1bee047f93b719379e84b233150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "113db1bee047f93b719379e84b233150");
        } else {
            jsCallbackPayError("", 0);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f2764a24b22f7a3b7dddeabb7814862", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f2764a24b22f7a3b7dddeabb7814862") : getClass();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e431d8caa98f7cee28343ba7f886eed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e431d8caa98f7cee28343ba7f886eed9");
            return;
        }
        b.b = null;
        b.e = null;
        b.d = null;
        b.c = null;
        try {
            String optString = jsBean().argsJson.optString("bizId");
            String optString2 = jsBean().argsJson.optString("customerId");
            String optString3 = jsBean().argsJson.optString("needHandIdPhoto");
            jsBean().argsJson.optString("debugEnv");
            b.b = optString;
            b.e = optString2;
            b.c = optString3;
            initStaticsParams();
            d.a("b_pay_identitycard_begin_sc", null);
            String str = "?bizId=" + b.a() + "&customId=" + b.e + "&needHandIdPhoto=" + b.c;
            Activity activity = jsHost().getActivity();
            if (activity == null) {
                resultError();
                com.meituan.android.paybase.common.analyse.cat.a.a("startIdCardOcrError", "身份证OCR调起异常");
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_verify_ocr", -9753);
                return;
            }
            al.a(activity, "https://npay.meituan.com/resource/sdk-inside-pages/index.html" + str, 404);
        } catch (Exception e) {
            a.a(e, "IdCardOcrJSHandler_exec", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a("startIdCardOcrError", "身份证OCR调起异常");
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_verify_ocr", -9753);
        }
    }
}
