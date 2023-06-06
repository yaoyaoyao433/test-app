package com.meituan.android.cashier.bridge;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.webview.WebViewActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallThirdPayJsHandler extends HybridBusinessJsHandler implements FinanceJsHandler {
    private static final String ALI_PAY_CANCEL = "6001";
    private static final String ALI_PAY_SUCC = "9000";
    private static final String ARG_PAY_TYPE = "payType";
    private static final String ARG_TRADE_NO = "tradeNo";
    private static final String ARG_URL = "url";
    private static final int CAT_PARAMS_ERROR = 9001;
    public static final int CODE_ENV_ERROR = 110;
    private static final String NAME = "pay.callThirdPay";
    private static final String PAYBIZ_CALL_THIRD_PAY_BY_H5 = "paybiz_call_third_pay_by_h5";
    private static final int PAY_STATUS_DEFAULT_VALUE = -2;
    private static final int REQUEST_CODE_CALL_PAY_MIDDLE = 407;
    private static final int REQUEST_CODE_WEBVIEW = 408;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HashMap<String, String> msg;
    private String payType;
    private String tradeNo;
    private String url;

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public String getMethodName() {
        return NAME;
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler
    public String getName() {
        return NAME;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "l6cwSLzfayFjkRiYTtLkl8GA8KvGqatHi5sj5Kk1LM0HoviE4Nfl184GyAsJCwSf7akO3U+XEBu7UU/xBzsSeA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        msg = hashMap;
        hashMap.put("8000", "正在处理中");
        msg.put("4000", "订单支付失败");
        msg.put("5000", "重复请求");
        msg.put("6002", "网络连接出错");
        msg.put("6004", "支付结果未知");
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler, com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b4dbf7d681c47aa1fa289fd5adda017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b4dbf7d681c47aa1fa289fd5adda017");
            return;
        }
        super.exec();
        if (jsBean() != null && jsBean().argsJson != null && jsHost() != null && jsHost().getActivity() != null) {
            Activity activity = jsHost().getActivity();
            this.url = jsBean().argsJson.optString("url");
            this.payType = jsBean().argsJson.optString(ARG_PAY_TYPE);
            this.tradeNo = jsBean().argsJson.optString(ARG_TRADE_NO);
            if (TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.payType)) {
                callJsHandlerError();
            } else {
                loadAndOverrideUrl(this.payType, this.url, activity);
            }
        } else {
            callJsHandlerError();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_18pyi38s_mv", getAnalyseMap());
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fbb971cb2fb37a38933af576aeca60c", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fbb971cb2fb37a38933af576aeca60c") : getClass();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "541269153983e6ed62a4c58440e98bec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "541269153983e6ed62a4c58440e98bec");
            return;
        }
        super.onDestroy();
        if (jsHost() != null) {
            a.a(jsHost().getActivity());
        }
    }

    private void loadAndOverrideUrl(String str, String str2, final Activity activity) {
        Object[] objArr = {str, str2, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8950fbe81b88fbd19d8bb1b24f48fda8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8950fbe81b88fbd19d8bb1b24f48fda8");
        } else if (TextUtils.equals("alipaywap", str)) {
            WebViewActivity.b(activity, str2, 408);
        } else {
            a.a(activity, str, str2, this.tradeNo, new PayActionListener() { // from class: com.meituan.android.cashier.bridge.CallThirdPayJsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
                public final void b(String str3) {
                }

                @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
                public final void a(String str3, int i, PayFailInfo payFailInfo) {
                    Object[] objArr2 = {str3, Integer.valueOf(i), payFailInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "575d7d991bdab597e1bfc7605094e729", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "575d7d991bdab597e1bfc7605094e729");
                        return;
                    }
                    CallThirdPayJsHandler.this.handleThirdPayResult(i, payFailInfo);
                    a.a(activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleThirdPayResult(int i, PayFailInfo payFailInfo) {
        Object[] objArr = {Integer.valueOf(i), payFailInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddab568d281dcf1d4c26c9e1a737cc04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddab568d281dcf1d4c26c9e1a737cc04");
            return;
        }
        String str = "";
        if (payFailInfo != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("errorCode", Integer.valueOf(payFailInfo.getErrorCode()));
            jsonObject.addProperty("errorCodeString", payFailInfo.getErrorCodeString());
            jsonObject.addProperty("msg", payFailInfo.getMsg());
            str = jsonObject.toString();
        }
        callbackThirdPayResult(i, str);
    }

    private void jsCallbackPayCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd4a4d9a0e79133860b6064f3ed1e5af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd4a4d9a0e79133860b6064f3ed1e5af");
        } else {
            jsCallbackPayError("", 12);
        }
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler
    public void jsCallbackPayError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d4718692f9c10bcf320de717f6385b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d4718692f9c10bcf320de717f6385b");
        } else {
            jsCallbackPayError("", 11);
        }
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler
    public void jsCallbackPayError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6943eb86a07b3f342ac9c52ef78f600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6943eb86a07b3f342ac9c52ef78f600");
        } else {
            jsCallbackPayError(str, 11);
        }
    }

    @Override // com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler
    public void jsCallbackPayError(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02d7823e4010ef449e4c77ad0406b567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02d7823e4010ef449e4c77ad0406b567");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorCode", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("response", new JSONObject(str));
            }
            if (!TextUtils.isEmpty(this.payType)) {
                jSONObject.put(ARG_PAY_TYPE, this.payType);
            }
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "CallThirdPayJsHandler_jsCallbackPayError", (Map<String, Object>) null);
        }
        jsCallback(jSONObject);
    }

    private void callJsHandlerError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b0ac0975a7fd0326c3accc23ad6956f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b0ac0975a7fd0326c3accc23ad6956f");
            return;
        }
        jsCallbackPayError("");
        if (TextUtils.equals("alipaywap", this.payType)) {
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_call_alipay_by_h5", -9753);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_xyzb0yc6_mv", getAnalyseMap());
            return;
        }
        com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_THIRD_PAY_BY_H5, 9001);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_rra7im8r_mv", getAnalyseMap());
    }

    private HashMap<String, Object> getAnalyseMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f929e6043c089bbc2e827d9877aba939", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f929e6043c089bbc2e827d9877aba939") : new a.c().a("url", this.url).a(ARG_PAY_TYPE, this.payType).a("tradeno", this.tradeNo).b;
    }

    private void callbackAlipayResult(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c85b2ce60a018f2e06f038172272b198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c85b2ce60a018f2e06f038172272b198");
            return;
        }
        try {
            String optString = new JSONObject(str).optString(Constant.KEY_RESULT_CODE);
            if (TextUtils.equals(ALI_PAY_SUCC, optString)) {
                jsCallback();
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay_by_h5", 200);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_f2mac3pm_mv", (Map<String, Object>) null);
            } else if (TextUtils.equals(ALI_PAY_CANCEL, optString)) {
                jsCallbackPayCancel();
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay_by_h5", -9854);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_1eit1e27_mv", (Map<String, Object>) null);
            } else {
                jsCallbackPayError(str);
                try {
                    i = Integer.parseInt(optString);
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "CallThirdPayJsHandler_callBackAlipayResult1", (Map<String, Object>) null);
                    i = -9753;
                }
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay_by_h5", i);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_9jodsudd_mv", new a.c().a("msg", msg.get(String.valueOf(i))).a("response", str).b);
            }
        } catch (JSONException e2) {
            jsCallbackPayError(str);
            com.meituan.android.paybase.common.analyse.a.a(e2, "CallThirdPayJsHandler_callBackAlipayResult2", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay_by_h5", -9753);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_9jodsudd_mv", new a.c().a("response", str).b);
        }
    }

    private void callbackThirdPayResult(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50ec68ca898afca821593c49a3b0cac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50ec68ca898afca821593c49a3b0cac5");
        } else if (i != 12) {
            switch (i) {
                case -1:
                    jsCallbackPayCancel();
                    com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_THIRD_PAY_BY_H5, -9854);
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_aamvhtyl_mv", getAnalyseMap());
                    return;
                case 0:
                    jsCallbackError(11, str);
                    com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_THIRD_PAY_BY_H5, -9753);
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_tw5y57ul_mv", getAnalyseMap());
                    return;
                case 1:
                    jsCallback();
                    com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_THIRD_PAY_BY_H5, 200);
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_z8qus941_mv", getAnalyseMap());
                    return;
                default:
                    jsCallbackErrorMsg(str);
                    com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_THIRD_PAY_BY_H5, -9753);
                    return;
            }
        } else {
            jsCallbackError(110, str);
            com.meituan.android.paybase.common.analyse.cat.a.a(PAYBIZ_CALL_THIRD_PAY_BY_H5, 9001);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f8debe988295c7bb9ee1ba38e3a7d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f8debe988295c7bb9ee1ba38e3a7d64");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (a.a(this.payType)) {
            Activity activity = jsHost() != null ? jsHost().getActivity() : null;
            if (i == 408 && i2 == -1 && intent != null) {
                String a = f.a(intent, "result");
                if (TextUtils.isEmpty(a)) {
                    jsCallbackPayError();
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_yc6458cc_mv", (Map<String, Object>) null);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_alipay_by_h5", -9753);
                    return;
                }
                callbackAlipayResult(a);
            } else if (a.a(activity, i, i2, intent)) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_dy80lex4_mv", getAnalyseMap());
            }
        }
    }
}
