package com.meituan.android.pay.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SetMeituanPayResultJSHandler extends PayBaseJSHandler implements FinanceJsHandler {
    public static final String ARG_BIND_SUCCESS = "BIND_SUCCESS";
    private static final String ARG_ERROR_PARAMS = "参数错误";
    private static final String ARG_ERROR_UNKNOWN = "未知错误";
    public static final String ARG_PARAM_ERROR = "error";
    public static final String ARG_PARAM_STATUS = "status";
    private static final String ARG_SCENE = "scene";
    public static final String ARG_STATUS_PAYED = "PAYED";
    public static final String ARG_STATUS_PAY_CANCEL = "PAY_CANCEL";
    public static final String ARG_STATUS_PAY_FAIL = "PAY_FAIL";
    public static final String ARG_STATUS_PAY_SUCCESS = "PAY_SUCCESS";
    private static final String ARG_URI_TO_PAY_ACTIVITY = "meituanpayment://meituanpay/launch";
    public static final String OPT_SCENE_SET_MPAY_RESULT = "setMeituanPayResult";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.setMeituanPayResult";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Ux019JIFU4W65HkOaIanq4Mjh1E1B4Qqkzpy1dV6mtHXJfo2G0KkQLSQnD7Qg1YkABHiqJwdf+Iy8ZzF60cRWw==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d33c977cb9614ae551ff8404480e7b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d33c977cb9614ae551ff8404480e7b6");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            JSONObject jSONObject = jsBean().argsJson;
            if (jSONObject != null) {
                String optString = jSONObject.optString("status");
                PayException payException = null;
                if (ag.a(optString, ARG_STATUS_PAY_SUCCESS, ARG_STATUS_PAY_FAIL, ARG_BIND_SUCCESS)) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                    if (optJSONObject != null) {
                        try {
                            payException = new PayException(new JsonParser().parse(optJSONObject.toString()));
                        } catch (JsonSyntaxException unused) {
                            jsCallbackError(11, ARG_ERROR_PARAMS);
                            return;
                        } catch (Exception unused2) {
                            jsCallbackError(11, ARG_ERROR_UNKNOWN);
                            return;
                        }
                    }
                    jumpToPayActivity(activity, optString, payException);
                    return;
                }
                jsCallbackError(11, ARG_ERROR_PARAMS);
                return;
            }
            jsCallbackError(11, ARG_ERROR_PARAMS);
            return;
        }
        jsCallbackError(11, ARG_ERROR_UNKNOWN);
    }

    private void jumpToPayActivity(Activity activity, String str, PayException payException) {
        Object[] objArr = {activity, str, payException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f56aa838a84c891bc19a25af7fcf0328", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f56aa838a84c891bc19a25af7fcf0328");
        } else if (activity != null) {
            Intent intent = new Intent();
            intent.setData(Uri.parse(ARG_URI_TO_PAY_ACTIVITY));
            intent.setFlags(603979776);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("scene", OPT_SCENE_SET_MPAY_RESULT);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("status", str);
            }
            if (payException != null) {
                intent.putExtra("error", payException);
            }
            activity.startActivity(intent);
        } else {
            jsCallbackError(11, ARG_ERROR_UNKNOWN);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6fe1f7e633373a7a478ad116f850108", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6fe1f7e633373a7a478ad116f850108") : getClass();
    }
}
