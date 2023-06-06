package com.meituan.android.ocr;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OpenCameraJsHandler extends PayBaseJSHandler implements FinanceJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.openScanBankCardCamera";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "C8oZS4fIF1BUq0IgdSbwPG+HvrZ8OefNpQ4LoDdeNqPznAfsnbtTMquPsL3TrFkyz4HVA0wk+cqhuzkyr/8n8Q==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa8033ce814a3f2f8e7948974c9aad12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa8033ce814a3f2f8e7948974c9aad12");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity == null) {
            resultError();
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("meituanpayment://pay/scancardnumber/launch").buildUpon().appendQueryParameter("trans_id", jsBean().argsJson.optString("trans_id")).appendQueryParameter("pay_token", jsBean().argsJson.optString("pay_token")).appendQueryParameter("userid", jsBean().argsJson.optString("userid")).appendQueryParameter("business_platform", jsBean().argsJson.optString("business_platform")).appendQueryParameter("report_params", jsBean().argsJson.optString("report_params")).build());
        intent.setPackage(activity.getPackageName());
        try {
            activity.startActivityForResult(intent, 403);
        } catch (ActivityNotFoundException e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OpenCameraJsHandler_exec").a("message", e.getMessage()).b);
            resultError();
            com.meituan.android.paybase.common.analyse.a.e("i版调起扫卡页失败", Build.DEVICE, null);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9edebc0c6f0e439c8fe359c2d17782f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9edebc0c6f0e439c8fe359c2d17782f");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 403) {
            if (i2 != -1) {
                if (i2 == 0) {
                    resultCancel();
                }
            } else if (intent != null) {
                String a = com.sankuai.waimai.platform.utils.f.a(intent, "cardNum");
                if (!TextUtils.isEmpty(a)) {
                    handleResult(a);
                } else {
                    resultError();
                }
            } else {
                resultError();
            }
        }
    }

    private void handleResult(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a1cf72b9131d767fa3fa44c77929289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a1cf72b9131d767fa3fa44c77929289");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bank_card_num", str);
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OpenCameraJsHandler_handleResult").a("message", e.getMessage()).b);
            resultError();
        }
    }

    private void resultError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37d60dc137f4453d098150e76f065485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37d60dc137f4453d098150e76f065485");
        } else {
            jsCallbackPayError(11);
        }
    }

    private void resultCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36a1be2550a4762292b0c2332d265333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36a1be2550a4762292b0c2332d265333");
        } else {
            jsCallbackPayError(12);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6452d19cacddd74f43c5069eabe1c627", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6452d19cacddd74f43c5069eabe1c627") : getClass();
    }
}
