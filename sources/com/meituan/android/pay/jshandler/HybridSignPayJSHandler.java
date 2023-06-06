package com.meituan.android.pay.jshandler;

import android.app.Activity;
import com.meituan.android.pay.common.analyse.b;
import com.meituan.android.pay.jshandler.mediator.a;
import com.meituan.android.pay.utils.d;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.fingerprint.util.c;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HybridSignPayJSHandler extends PayBaseJSHandler implements FinanceJsHandler {
    public static final String ARG_PAY_PARAMS = "pay_params";
    public static final String ARG_SIGN_PAY_SOURCE = "signpay_entry_code";
    public static final String ARG_TRADE_NO = "trade_no";
    public static final String DATA_KEY = "data";
    public static final String DATA_KEY_ERROR = "error";
    public static final String DATA_KEY_PARAM = "param";
    public static final String DATA_KEY_PATH = "path";
    public static final String DATA_KEY_REASON = "reason";
    private static final String DATA_KEY_RESULT_CODE = "resultCode";
    private static final String DATA_KEY_RESULT_DATA = "resultData";
    private static final String PARAM_HAS_TOUCHID = "has_touchid";
    private static final String PARAM_NB_CHANNEL = "nb_channel";
    private static final String PARAM_NB_DEVICE_ID = "nb_deviceid";
    private static final int RESULT_DOWNGRADE = 10100;
    private static final int RESULT_H5_GET_PARAM = 11000;
    private static final int RESULT_RENDER_DONE = 10200;
    private static final int RESULT_SIGN_PAY = 11001;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return "pay.hybridMeituanPay";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "c7QNGjRWkl1lviPmWWuzT/0wguTEtfdvVVVpJga742Cmbd3eQrh/33VZJyI7qy+APxm7O5goK2x+UipMv4XchA==";
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa681c27347066f0efa149bb7c8ef3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa681c27347066f0efa149bb7c8ef3d0");
            return;
        }
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            JSONObject jSONObject = jsBean().argsJson;
            if (jSONObject != null) {
                try {
                    a.InterfaceC0326a a = a.a().a(activity);
                    int optInt = jSONObject.optInt("resultCode");
                    JSONObject optJSONObject = jSONObject.optJSONObject("resultData");
                    b.b("c_pay_emhyaxrm", "b_pay_l272ki0a_mc", "", new a.c().a("type", Integer.valueOf(optInt)).a("resultCode", Integer.valueOf(optInt)).a("argsJson", jSONObject.toString()).b, ak.a(activity));
                    d.a("paybiz_hybrid_mtpay_bridage_native_receive_h5", optInt);
                    if (optInt == RESULT_H5_GET_PARAM) {
                        jsCallback(getParam());
                    } else if (a == null) {
                        jsCallbackError(11, "单例获取失败");
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_5y5irc49_mc", new a.c().a("info", "单例获取失败").a("argsJson", jSONObject.toString()).b);
                        return;
                    }
                    if (optInt == 10100) {
                        a.a(optJSONObject.optString("reason"));
                        jsCallback();
                    } else if (optInt == RESULT_RENDER_DONE) {
                        a.a();
                        jsCallback();
                    } else if (optInt == RESULT_SIGN_PAY) {
                        a.a(optJSONObject.optString("data"), optJSONObject.optString("error"), optJSONObject.optString("param"), optJSONObject.optString("path"));
                        jsCallback();
                    }
                    b.b("c_pay_emhyaxrm", "b_pay_an06oxz9_mc", "", new a.c().a("type", Integer.valueOf(optInt)).b, ak.a(activity));
                    d.a("paybiz_hybrid_mtpay_bridage_native_call_h5", optInt);
                    return;
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "HybridCouponDialogJsHandler_exec", (Map<String, Object>) null);
                    jsCallbackError(11, "数据解析异常");
                    return;
                }
            }
            jsCallbackError(11, "root接收的数据为空");
            return;
        }
        jsCallbackError(11, "activity为空");
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f04ce91e5a401215c8794acec0848d0", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f04ce91e5a401215c8794acec0848d0") : getClass();
    }

    private JSONObject getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "147567f995afb82dafd7094d44b9e5eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "147567f995afb82dafd7094d44b9e5eb");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(com.meituan.android.pay.common.payment.utils.b.c(jsHost().getActivity()));
            jSONObject2.put(PARAM_HAS_TOUCHID, c.c());
            jSONObject2.put(PARAM_NB_CHANNEL, com.meituan.android.paybase.config.a.d().c());
            jSONObject2.put(PARAM_NB_DEVICE_ID, com.meituan.android.paybase.config.a.d().j());
            jSONObject.put("pay_params", jSONObject2);
            jSONObject.put(ARG_SIGN_PAY_SOURCE, d.a());
            jSONObject.put(ARG_TRADE_NO, com.meituan.android.paybase.common.analyse.a.b);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5y5irc49_mc", new a.c().a("params", jSONObject.toString()).a("source", Integer.valueOf(d.a())).b);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "HybridCouponDialogJsHandler_getParam", (Map<String, Object>) null);
        }
        return jSONObject;
    }
}
