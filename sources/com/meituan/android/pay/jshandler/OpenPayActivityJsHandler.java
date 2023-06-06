package com.meituan.android.pay.jshandler;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.common.analyse.b;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OpenPayActivityJsHandler extends PayBaseJSHandler implements FinanceJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.callMeituanPay";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return null;
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e21b6342d1814d611cc51bdfb18bc152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e21b6342d1814d611cc51bdfb18bc152");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            String optString = jsBean().argsJson.optString("trans_id");
            String optString2 = jsBean().argsJson.optString("pay_token");
            Uri.Builder buildUpon = Uri.parse("meituanpayment://conchpay/launch").buildUpon();
            buildUpon.appendQueryParameter("trans_id", optString);
            buildUpon.appendQueryParameter("pay_token", optString2);
            Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
            intent.setPackage(activity.getPackageName());
            try {
                activity.startActivityForResult(intent, 401);
                return;
            } catch (ActivityNotFoundException e) {
                b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OpenPayActivityJsHandler_exec").a("message", e.getMessage()).b, ak.a(activity));
                jsCallbackPayError("未知错误", 3);
                return;
            }
        }
        jsCallbackPayError("未知错误", 3);
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea74136f665f69689c12b75bb6beb004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea74136f665f69689c12b75bb6beb004");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 401) {
            if (i2 != -1) {
                if (i2 == 0) {
                    jsCallbackPayResult("cancel");
                }
            } else if (intent == null) {
                jsCallbackPayError("未知错误", 3);
            } else if (f.a(intent, "pay_result", -1) == 1) {
                jsCallbackPayResult("success");
            } else {
                jsCallbackPayResult("failed");
            }
        }
    }

    private void jsCallbackPayResult(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99dbe4e8a2a7bd6f650ba8102042eab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99dbe4e8a2a7bd6f650ba8102042eab3");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        str2 = "";
        try {
            str2 = jsHost() != null ? ak.a(jsHost().getActivity()) : "";
            jSONObject.put("pay_result", str);
            jSONObject.put("status", "success");
            jSONObject.put("errorMsg", "");
            jSONObject.put("errorCode", 0);
        } catch (JSONException e) {
            b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OpenPayActivityJsHandler_jsCallbackPayResult").a("message", e.getMessage()).b, str2);
        }
        jsCallback(jSONObject);
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb95079c3bbb5540603293a810f5d5df", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb95079c3bbb5540603293a810f5d5df") : getClass();
    }
}
