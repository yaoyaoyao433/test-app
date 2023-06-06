package com.meituan.android.cashier.bridge.icashier;

import android.app.Activity;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.cashier.bridge.icashier.a;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.MTPaymentURL;
import com.meituan.android.cashier.model.bean.PayLaterSubmitBean;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.cashier.retrofit.CashierRequestService;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.pay.utils.p;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paycommon.lib.utils.m;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a = null;
    public static final String b = "pay_cancel";
    static final String c = "pay_fail";
    private ICashierJSHandler d;

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
    }

    private b(ICashierJSHandler iCashierJSHandler) {
        Object[] objArr = {iCashierJSHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cda71a208de6a47c5e3c94f3fc8bbb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cda71a208de6a47c5e3c94f3fc8bbb1");
        } else {
            this.d = iCashierJSHandler;
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Activity activity;
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7beaa12fc6ca229dfe8d25015444c55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7beaa12fc6ca229dfe8d25015444c55");
        } else if (i == 563) {
            ICashierJSHandler.logCat(this.d, "hybrid_cashier_gohellopay_request_succ", null);
            ICashierJSHandler.logMV(this.d, "b_pay_hybrid_cashier_gohellopay_request_succ_mv", "c_pay_7c9fc4b4", null);
            MTPaymentURL mTPaymentURL = (MTPaymentURL) obj;
            if (mTPaymentURL == null) {
                ICashierJSHandler.jsCallbackError(this.d, ICashierJSHandler.JS_CALLBACK_BACKGROUND_ERROR, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "onRequestSucc").b("reason", "mtPaymentURL is null"));
            } else if (mTPaymentURL.getOverLoadInfo() != null && mTPaymentURL.getOverLoadInfo().isStatus()) {
                ICashierJSHandler.logCat(this.d, "go_hello_pay_overload", null);
                ICashierJSHandler.logSC(this.d, "b_pay_ki1dsw33_sc", null);
                ICashierJSHandler.jsCallbackNotPaySucc(this.d, "go_hello_pay_overload", mTPaymentURL.getOverLoadInfo());
            } else {
                String a2 = a(mTPaymentURL.getUrl());
                String tradeNo = this.d != null ? this.d.getTradeNo() : "";
                Object[] objArr2 = {a2, tradeNo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17539d15cfacbad1ec9bd2115999df0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17539d15cfacbad1ec9bd2115999df0a");
                } else if (this.d == null || TextUtils.isEmpty(a2)) {
                    ICashierJSHandler.jsCallbackError(this.d, ICashierJSHandler.JS_CALLBACK_ILLEGAL_STATE, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "startMeituanPay").b("reason", "url is null"));
                } else if (this.d != null && this.d.jsHost() != null && (activity = this.d.jsHost().getActivity()) != null) {
                    ICashierJSHandler.logSC(this.d, "b_pay_amw28c23_sc", com.meituan.android.neohybrid.neo.report.a.c(HybridSignPayJSHandler.ARG_TRADE_NO, tradeNo).b);
                    p.a(activity, a2, tradeNo, 1314);
                    activity.overridePendingTransition(0, 0);
                } else {
                    ICashierJSHandler.jsCallbackError(this.d, ICashierJSHandler.JS_CALLBACK_ILLEGAL_STATE, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "startMeituanPay").b("reason", "activity is null"));
                }
                Object[] objArr3 = {mTPaymentURL};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "25b519932b64ebd859d10cf278d1d19d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "25b519932b64ebd859d10cf278d1d19d");
                } else {
                    com.meituan.android.cashier.utils.a.a(mTPaymentURL, "hybrid", this.d != null ? this.d.getUniqueId() : "");
                }
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3508fccd9b65fc59b5e655f0e3245e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3508fccd9b65fc59b5e655f0e3245e");
        } else if (i == 563) {
            ICashierJSHandler.logSC(this.d, "b_pay_v2gbavsa_sc", null);
            Object[] objArr2 = {exc};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "198c0b028688dc2804a1b73b139e511b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "198c0b028688dc2804a1b73b139e511b");
            } else if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                ICashierJSHandler.logCat(this.d, "hybrid_cashier_gohellopay_request_fail", null);
                ICashierJSHandler.logMV(this.d, "b_pay_hybrid_cashier_gohellopay_request_fail_mv", "c_pay_7c9fc4b4", com.meituan.android.neohybrid.neo.report.a.c("errorCode", Integer.valueOf(payException.getCode())).b);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", payException.getCode());
                    jSONObject.put("message", payException.getMessage());
                    jSONObject.put("level", payException.getLevel());
                    jSONObject.put("type", payException.getType());
                    jSONObject.put("extra", payException.getExtra());
                    ICashierJSHandler.jsCallbackNotPaySucc(this.d, "pay_exception", jSONObject);
                } catch (Exception e) {
                    ICashierJSHandler iCashierJSHandler = this.d;
                    com.meituan.android.neohybrid.neo.report.a c2 = com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleException");
                    ICashierJSHandler.jsCallbackError(iCashierJSHandler, ICashierJSHandler.JS_CALLBACK_PARAMS_PARSER_ERROR, c2.b("reason", "catch exception: " + e.getMessage()));
                }
            } else {
                ICashierJSHandler.logCat(this.d, "hybrid_cashier_gohellopay_request_fail", null);
                ICashierJSHandler.logMV(this.d, "b_pay_hybrid_cashier_gohellopay_request_fail_mv", "c_pay_7c9fc4b4", com.meituan.android.neohybrid.neo.report.a.c("errorCode", 0).b);
                ICashierJSHandler.jsCallbackNotPaySucc(this.d, "native_exception", null);
            }
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083bd367c4bef30531b64d9373f68b9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083bd367c4bef30531b64d9373f68b9b");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            JsonObject asJsonObject = new JsonParser().parse(new String(com.meituan.android.paybase.utils.c.a(str))).getAsJsonObject();
            if (asJsonObject != null) {
                asJsonObject.addProperty("nb_container", "hybrid");
                return com.meituan.android.paybase.utils.c.a(asJsonObject.toString().getBytes());
            }
            return str;
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "ICashierPayerHandler_addParamsInBase64Url", (Map<String, Object>) null);
            return str;
        }
    }

    public static void a(ICashierJSHandler iCashierJSHandler, PayParams payParams) {
        Object[] objArr = {iCashierJSHandler, payParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76560621da6eb571846713b64f118135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76560621da6eb571846713b64f118135");
        } else if (iCashierJSHandler == null || payParams == null) {
            ICashierJSHandler.jsCallbackError(iCashierJSHandler, ICashierJSHandler.JS_CALLBACK_PARAMS_CHECK_ERROR, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "startGoHelloPay").b("reason", "payParams is null"));
        } else {
            HashMap<String, String> a2 = com.meituan.android.cashier.retrofit.a.a(payParams);
            if (a2 == null) {
                a2 = new HashMap<>();
            }
            a2.put("nb_container", "hybrid");
            b bVar = new b(iCashierJSHandler);
            iCashierJSHandler.setPayerHandler(bVar);
            ICashierJSHandler.logSC(iCashierJSHandler, "b_pay_srn4qt5c_sc", null);
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b2fb49def2baccf9ffbaca2ee4a454fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b2fb49def2baccf9ffbaca2ee4a454fd");
            } else {
                u.a(a2, u.a().f);
            }
            ICashierJSHandler.logCat(iCashierJSHandler, "hybrid_cashier_gohellopay_request_start", null);
            ICashierJSHandler.logMV(iCashierJSHandler, "b_pay_hybrid_cashier_gohellopay_request_start_mv", "c_pay_7c9fc4b4", null);
            m.a(iCashierJSHandler, a2);
            ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, bVar, 563)).goHelloPay(a2);
            com.meituan.android.pay.desk.component.analyse.a.a("paybiz_gohellopay_start", "1");
        }
    }

    public static void a(WalletPayment walletPayment, ICashierJSHandler iCashierJSHandler, MTPayment mTPayment, String str, CashierPopWindowBean cashierPopWindowBean, JSONObject jSONObject) {
        PayParams payParams;
        PayParams a2;
        PayLaterSubmitBean payLaterSubmitBean;
        Object[] objArr = {walletPayment, iCashierJSHandler, mTPayment, str, cashierPopWindowBean, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2aff42362b65ccb02b5d4c15fd08aad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2aff42362b65ccb02b5d4c15fd08aad5");
        } else if (mTPayment == null) {
            ICashierJSHandler.jsCallbackError(iCashierJSHandler, ICashierJSHandler.JS_CALLBACK_PARAMS_CHECK_ERROR, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "startGoHelloPay").b("reason", "mtPayment is null"));
        } else {
            Object[] objArr2 = {walletPayment, iCashierJSHandler, mTPayment, str, cashierPopWindowBean};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8d391fa3873e27d08cc4beaeb4328949", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (PayParams) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8d391fa3873e27d08cc4beaeb4328949");
            } else {
                if (cashierPopWindowBean == null || cashierPopWindowBean.getType() != 2 || cashierPopWindowBean.getPayLaterPopDetailInfoBean() == null || (payLaterSubmitBean = cashierPopWindowBean.getPayLaterPopDetailInfoBean().getPayLaterSubmitBean()) == null || !(payLaterSubmitBean.openCreditPay() || payLaterSubmitBean.bindNewCard())) {
                    payParams = null;
                } else {
                    String tradeNo = iCashierJSHandler.getTradeNo();
                    String payToken = iCashierJSHandler.getPayToken();
                    Object[] objArr3 = {tradeNo, payToken};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "81af93a4153239f770b5fa7e66f451f8", RobustBitConfig.DEFAULT_VALUE)) {
                        payParams = (PayParams) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "81af93a4153239f770b5fa7e66f451f8");
                    } else {
                        payParams = new PayParams();
                        payParams.tradeNo = tradeNo;
                        payParams.payToken = payToken;
                        payParams.cashierType = "wallet";
                    }
                }
                a2 = payParams == null ? a.a(iCashierJSHandler.getActivity(), walletPayment, mTPayment, null, a.C0187a.a(iCashierJSHandler.getTradeNo(), iCashierJSHandler.getPayToken(), "wallet", 0, 0)) : payParams;
                a.a(a2, str);
                if (cashierPopWindowBean != null && cashierPopWindowBean.getPayLaterPopDetailInfoBean() != null) {
                    PayLaterSubmitBean payLaterSubmitBean2 = cashierPopWindowBean.getPayLaterPopDetailInfoBean().getPayLaterSubmitBean();
                    String guideRequestNo = cashierPopWindowBean.getPayLaterPopDetailInfoBean().getGuideRequestNo();
                    if (guideRequestNo == null) {
                        guideRequestNo = "";
                    }
                    String utmSource = cashierPopWindowBean.getPayLaterPopDetailInfoBean().getUtmSource();
                    if (!TextUtils.isEmpty(utmSource)) {
                        payLaterSubmitBean2.setPromotionInfo("{\"utmSource\":\"" + utmSource + "\"}");
                    }
                    String ext = cashierPopWindowBean.getPayLaterPopDetailInfoBean().getExt();
                    if (!TextUtils.isEmpty(ext)) {
                        payLaterSubmitBean2.setExt(ext);
                    }
                    a2.openWithholdInfoBefore = n.a().toJson(payLaterSubmitBean2);
                    if (a2.walletPayParams == null) {
                        a2.walletPayParams = new HashMap();
                    }
                    com.meituan.android.cashier.retrofit.a.a(a2.walletPayParams, guideRequestNo, iCashierJSHandler.getDowngradeErrorInfo());
                }
            }
            PayParams payParams2 = a2;
            if (jSONObject != null && payParams2 != null) {
                try {
                    Map<String, String> map = payParams2.walletPayParams;
                    if (!i.a(map)) {
                        String str2 = map.get("payExtendParams");
                        JSONObject jSONObject2 = TextUtils.isEmpty(str2) ? new JSONObject() : new JSONObject(str2);
                        String optString = jSONObject2.optString("transmission_param");
                        JSONObject jSONObject3 = TextUtils.isEmpty(optString) ? new JSONObject() : new JSONObject(optString);
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!TextUtils.isEmpty(next)) {
                                jSONObject3.put(next, jSONObject.opt(next));
                            }
                        }
                        jSONObject2.put("transmission_param", jSONObject3.toString());
                        map.put("payExtendParams", jSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
            }
            Object[] objArr4 = {payParams2, iCashierJSHandler};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "18c7bbd85f2d2a01ac5293403213594a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "18c7bbd85f2d2a01ac5293403213594a");
            } else if (payParams2 != null && iCashierJSHandler != null) {
                try {
                    if (!TextUtils.isEmpty(iCashierJSHandler.getVerifyScene())) {
                        Map<String, String> map2 = payParams2.walletPayParams;
                        if (!i.a(map2)) {
                            String str3 = map2.get("payExtendParams");
                            JSONObject jSONObject4 = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
                            jSONObject4.put(ICashierJSHandler.KEY_NEW_CREDITPAY_OPEN_VERIFY_SCENE, iCashierJSHandler.getVerifyScene());
                            map2.put("payExtendParams", jSONObject4.toString());
                        }
                    }
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "appendNewCreditPayOpenResultParams", (Map<String, Object>) null);
                }
            }
            a(iCashierJSHandler, payParams2);
        }
    }
}
