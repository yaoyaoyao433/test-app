package com.meituan.android.pay.jshandler;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.c;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
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
public class GetMeituanPayParamsJSHandler extends PayBaseJSHandler implements FinanceJsHandler {
    private static final String ARG_ERROR_PARAM_EMPTY = "获取参数为空";
    private static final String ARG_ERROR_UNKNOWN = "未知错误";
    public static final String ARG_PAY_PARAMS = "pay_params";
    private static final String ARG_SCENE = "scene";
    private static final String ARG_URI_TO_PAY_ACTIVITY = "meituanpayment://meituanpay/launch";
    private static final boolean DEBUG = false;
    public static final String OPT_SCENE_GET_MPAY_PARAMS = "getMeituanPayParams";
    public static final int REQ_PAY_REQUEST_PARAMS = 2746;
    private static final String TAG = "GetMeituanPayParams";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<String, String> payParams = new HashMap();

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.getMeituanPayParams";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "WxrQ+eJk+3dsrqYVvDSnBvK7sLORlH51mu043RE2rwKZdN6YFhJo7xqI12a+uAJTlIkWsXXiaVoPaUwzKxpriw==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41955abb8e7581c32cb731676cd919d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41955abb8e7581c32cb731676cd919d3");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.setData(Uri.parse(ARG_URI_TO_PAY_ACTIVITY));
            intent.setPackage(activity.getPackageName());
            intent.putExtra("scene", OPT_SCENE_GET_MPAY_PARAMS);
            activity.startActivityForResult(intent, REQ_PAY_REQUEST_PARAMS);
            return;
        }
        jsCallbackError(11, ARG_ERROR_UNKNOWN);
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dad2fdbeef3315d8a136b27f46eaf42f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dad2fdbeef3315d8a136b27f46eaf42f");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            try {
                putParamsToWeb((Map) f.c(intent, "pay_params"));
            } catch (ClassCastException unused) {
                jsCallbackError(11, ARG_ERROR_UNKNOWN);
            } catch (Exception unused2) {
                jsCallbackError(11, ARG_ERROR_UNKNOWN);
            }
            if (!i.a(payParams)) {
                try {
                    jsCallback(new JSONObject().put("pay_params", c.a(new JSONObject(payParams).toString().getBytes())));
                    return;
                } catch (JSONException | Exception unused3) {
                }
            } else {
                jsCallbackError(11, ARG_ERROR_PARAM_EMPTY);
                return;
            }
        }
        jsCallbackError(11, ARG_ERROR_UNKNOWN);
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47fbe5e4f1db0df04f761e32b777c141", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47fbe5e4f1db0df04f761e32b777c141") : getClass();
    }

    public static void putParamsToWeb(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ecf088a9db793eec94a1b9a33b81b292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ecf088a9db793eec94a1b9a33b81b292");
        } else if (i.a(map) || payParams == null) {
        } else {
            payParams.clear();
            payParams.putAll(map);
        }
    }
}
