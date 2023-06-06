package com.meituan.android.cashier.bridge.icashier;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.bridge.HybridBusinessJsHandler;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.pay.utils.g;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.moduleinterface.FinanceJsHandler;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.android.paycommon.lib.utils.m;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ICashierJSHandler extends HybridBusinessJsHandler implements FinanceJsHandler, m.a {
    public static final String JS_CALLBACK_BACKGROUND_ERROR = "后端返回参数错误:";
    public static final String JS_CALLBACK_ILLEGAL_STATE = "非法状态错误:";
    public static final String JS_CALLBACK_PARAMS_CHECK_ERROR = "参数校验错误:";
    public static final String JS_CALLBACK_PARAMS_PARSER_ERROR = "参数解析失败:";
    private static final String KEY_ACTION = "action";
    private static final String KEY_ACTION_START_GO_HELLO_PAY = "start_go_hello_pay";
    private static final String KEY_ACTION_START_SELECT_BANK = "start_select_bank";
    private static final String KEY_ACTION_START_SELECT_PAYMENT = "start_select_payment";
    private static final String KEY_DATA = "data";
    private static final String KEY_DATA_CASHIER_PAYMENT = "cashier_payment";
    private static final String KEY_DATA_CIF = "cif";
    private static final String KEY_DATA_ENTRY = "entry";
    private static final String KEY_DATA_EXTRA_DATA = "extra_data";
    private static final String KEY_DATA_EXTRA_STATICS = "extra_statics";
    private static final String KEY_DATA_OPEN_SOURCE = "open_source";
    private static final String KEY_DATA_PAY_TOKEN = "pay_token";
    private static final String KEY_DATA_POP_WINDOW = "pop_window";
    private static final String KEY_DATA_SELECT_BANK_INDEX = "bank_index";
    private static final String KEY_DATA_SELECT_MT_PAYMENT = "mt_payment";
    private static final String KEY_DATA_SELECT_PAYMENT_INDEX = "payment_index";
    private static final String KEY_DATA_TRADE_NO = "tradeno";
    private static final String KEY_MERCHANT_NO = "merchant_no";
    public static final String KEY_NEW_CREDITPAY_OPEN_VERIFY_SCENE = "verify_scene";
    private static final String KEY_PAY_RESULT = "pay_result";
    public static final String KEY_PROMOTION = "promotion";
    private static final String KEY_STATUS = "status";
    private static final String KEY_TRANSMISSION_PARAM = "transmission_param";
    private static final String NAME = "pay.selectBank";
    public static final int VALUE_CODE_COMMON_BACK_CANCEL = -11025;
    public static final String VALUE_STATUS_SELECT_BANK_CLOSE = "select_bank_close";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String cif;
    private String extraData;
    private boolean isCreditOpen;
    private String merchantNo;
    private String openSource;
    private String payToken;
    private b payerHandler;
    private c selectHandler;
    private String tradeNo;
    private String verifyScene;

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
        return "Y5b9L7KCtVLGS2MoCmqcPtxHZUzhuyId363JHQD/IOaJ9fmE6/4Uoq0Qdo8xZEj2QXdiHjry+KHOEjeKG7WXRg==";
    }

    public ICashierJSHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "743f7554eca13f2d4858f656be43d1bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "743f7554eca13f2d4858f656be43d1bf");
        } else {
            this.isCreditOpen = false;
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.FinanceJsHandler
    public Class<?> getHandlerClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d887d98f81def6d889e1f0fc913fe01", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d887d98f81def6d889e1f0fc913fe01") : getClass();
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler, com.meituan.android.paybase.webview.jshandler.PayBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7e80c469e53ee8c7098d772d9203b78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7e80c469e53ee8c7098d772d9203b78");
            return;
        }
        super.exec();
        if (jsBean() != null && jsBean().argsJson != null && jsHost() != null && jsHost().getActivity() != null) {
            JSONObject jSONObject = jsBean().argsJson;
            String optString = jSONObject.optString("action");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            logSC("b_pay_2hdickb8_sc", null);
            handleActionAndData(optString, optJSONObject);
            return;
        }
        jsCallbackError(this, JS_CALLBACK_ILLEGAL_STATE, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "exec").b("reason", "jsHost is null"));
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79a5a5cbbdd0a2fa84577d2a9c88226c", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79a5a5cbbdd0a2fa84577d2a9c88226c") : jsHost().getActivity();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        JSONObject jSONObject;
        String optString;
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b5594bdbde43c3c6ef12ecb20925e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b5594bdbde43c3c6ef12ecb20925e1c");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 4) {
            HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.cashier.bridge.icashier.ICashierJSHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(int i3, String str) {
                    Object[] objArr2 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6123bceb483dd04d52c3ad8447eceba2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6123bceb483dd04d52c3ad8447eceba2");
                        return;
                    }
                    if (ICashierJSHandler.this.jsHost() != null && ICashierJSHandler.this.jsHost().getActivity() != null) {
                        e.a(ICashierJSHandler.this.jsHost().getActivity(), (Object) ICashierJSHandler.this.jsHost().getActivity().getString(R.string.mpay__open_credit_pay_error));
                    }
                    q.b("b_pay_credit_open_back_to_cashier_sc", new a.c().a("errorCode", Integer.valueOf(i3)).a("errorMessage", str).a(KnbConstants.PARAMS_SCENE, 3).a("url", ICashierJSHandler.this.selectHandler != null ? ICashierJSHandler.this.selectHandler.c() : "").b, ICashierJSHandler.this.getUniqueId());
                    ICashierJSHandler.jsCallbackPaySucc(ICashierJSHandler.this, b.b, 0, "", "", ICashierJSHandler.this.isCreditOpen);
                }

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(@Nullable String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d31dc684809edd621ae6cf2480dfc87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d31dc684809edd621ae6cf2480dfc87");
                        return;
                    }
                    ICashierJSHandler.this.dealCreditPayOpenResult(str);
                    q.b("b_pay_credit_open_back_to_cashier_sc", new a.c().a("result", str).a(KnbConstants.PARAMS_SCENE, 3).a("url", ICashierJSHandler.this.selectHandler != null ? ICashierJSHandler.this.selectHandler.c() : "").b, ICashierJSHandler.this.getUniqueId());
                }
            });
            return;
        }
        boolean z2 = this.isCreditOpen;
        Object[] objArr2 = {this, Integer.valueOf(i), Integer.valueOf(i2), intent, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "d63b688ea1d5eadbc23a0e37bcaedaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "d63b688ea1d5eadbc23a0e37bcaedaca");
        } else if (i == 1314) {
            logSC(this, "b_pay_b1w0hzjh_sc", null);
            if (i2 != -1 || intent == null) {
                if (i2 != 0) {
                    jsCallbackError(this, JS_CALLBACK_ILLEGAL_STATE, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handlePayResultCode").a(Constant.KEY_RESULT_CODE, Integer.valueOf(i2)).b("reason", "resultCode error"));
                    return;
                }
                if (intent == null) {
                    z = z2 ? 1 : 0;
                } else if (z2 || f.a(intent, "openCreditPayStatus", false)) {
                    z = true;
                }
                jsCallbackPaySucc(this, b.b, -11025, "点击back键退出", z);
                return;
            }
            boolean z3 = z2 || f.a(intent, "openCreditPayStatus", false);
            int a = f.a(intent, KEY_PAY_RESULT, -1);
            String a2 = f.a(intent, "pay_msg");
            int a3 = f.a(intent, "pay_error_code", 0);
            boolean a4 = f.a(intent, "pay_result_cancel", false);
            String a5 = f.a(intent, "pay_failed_extra");
            if (a != 1) {
                if (a == 3) {
                    jsCallbackPaySucc(this, a4 ? b.b : b.c, a3, a2, a5, z3);
                    return;
                } else if (a == 4) {
                    jsCallbackPaySucc(this, "pay_overtime", z3);
                    return;
                } else if (a == 5) {
                    jsCallbackPaySucc(this, "pay_fatal_error", z3);
                    return;
                } else {
                    jsCallbackError(this, JS_CALLBACK_ILLEGAL_STATE, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handlePayResultCode").a("payResultCode", Integer.valueOf(a)).b("reason", "payResultCode error"));
                    return;
                }
            }
            try {
                optString = new JSONObject(a5).optString("pay_promotion");
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(optString)) {
                jSONObject = new JSONObject(optString);
                jsCallbackPaySucc(this, "pay_success", z3, jSONObject);
                logCat(this, "hybrid_cashier_mtpay_succ", null);
                logMV(this, "b_pay_hybrid_cashier_mtpay_succ_mv", "c_pay_7c9fc4b4", null);
            }
            jSONObject = null;
            jsCallbackPaySucc(this, "pay_success", z3, jSONObject);
            logCat(this, "hybrid_cashier_mtpay_succ", null);
            logMV(this, "b_pay_hybrid_cashier_mtpay_succ_mv", "c_pay_7c9fc4b4", null);
        }
    }

    public String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca2b40fd251834098f3997643ba51f44", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca2b40fd251834098f3997643ba51f44");
        }
        Activity activity = getActivity();
        if (activity instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
            return TextUtils.isEmpty(payBaseActivity.p()) ? payBaseActivity.p() : "";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealCreditPayOpenResult(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5af70d307bd58eea75e94578c1a781eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5af70d307bd58eea75e94578c1a781eb");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                int i = new JSONObject(str).getInt("fd_maidan_opened_status");
                if (i == 3) {
                    g.b();
                    this.isCreditOpen = true;
                    if (this.selectHandler != null) {
                        this.selectHandler.a();
                        return;
                    }
                    return;
                } else if (i == 2) {
                    e.a(jsHost().getActivity(), (Object) jsHost().getActivity().getString(R.string.mpay__open_credit_pay_fail));
                    jsCallbackPaySucc(this, b.b, 0, "", "", this.isCreditOpen);
                    return;
                } else {
                    jsCallbackPaySucc(this, b.b, 0, "", "", this.isCreditOpen);
                    return;
                }
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "dealCreditPayOpenResult", new a.c().a("message", e.getMessage()).b);
            }
        }
        jsCallbackPaySucc(this, b.b, 0, "", "", this.isCreditOpen);
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public String getExtraStatics() {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e4f4977c3fbcc853a5c51e8415fa742", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e4f4977c3fbcc853a5c51e8415fa742");
        }
        try {
            return (jsBean() == null || (jSONObject = jsBean().argsJson) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) ? "" : optJSONObject.optString(KEY_DATA_EXTRA_STATICS);
        } catch (Exception unused) {
            return "";
        }
    }

    private void handleActionAndData(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "346b0e0bc63524e33e330825f4f91d4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "346b0e0bc63524e33e330825f4f91d4b");
        } else if (jSONObject == null || !ag.a(str, KEY_ACTION_START_SELECT_PAYMENT, KEY_ACTION_START_SELECT_BANK, KEY_ACTION_START_GO_HELLO_PAY)) {
            jsCallbackError(this, "参数校验错误:action不符合要求", com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleActionAndData").a("action", str).b("reason", "action isn't at scope"));
        } else {
            try {
                this.tradeNo = jSONObject.optString(KEY_DATA_TRADE_NO);
                this.payToken = jSONObject.optString(KEY_DATA_PAY_TOKEN);
                this.merchantNo = jSONObject.optString(KEY_MERCHANT_NO);
                this.openSource = jSONObject.optString(KEY_DATA_OPEN_SOURCE);
                if (!ag.a(this.tradeNo, this.payToken)) {
                    jsCallbackError(this, "参数校验错误:tradeNo或payToken为空", com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleActionAndData").a(HybridSignPayJSHandler.ARG_TRADE_NO, this.tradeNo).a(KEY_DATA_PAY_TOKEN, this.payToken).b("reason", "tradeNo or payToken is empty"));
                    return;
                }
                logSC("b_pay_i0q5t1fy_sc", new a.c().a("action", str).b);
                String str2 = "";
                if (jSONObject.has(KEY_DATA_ENTRY)) {
                    String optString = jSONObject.optString(KEY_DATA_ENTRY);
                    if (!TextUtils.isEmpty(optString)) {
                        str2 = optString;
                    }
                }
                this.extraData = jSONObject.optString(KEY_DATA_EXTRA_DATA);
                this.cif = jSONObject.optString(KEY_DATA_CIF);
                this.verifyScene = jSONObject.optString(KEY_NEW_CREDITPAY_OPEN_VERIFY_SCENE);
                if (TextUtils.equals(KEY_ACTION_START_SELECT_PAYMENT, str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "cashier_change_paytype";
                    }
                    u.a().e = str2;
                    logSC("b_pay_euobxq7v_sc", null);
                    handleSelectPayment(jSONObject);
                } else if (TextUtils.equals(KEY_ACTION_START_SELECT_BANK, str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "cashier_change_paytype";
                    }
                    u.a().e = str2;
                    logSC("b_pay_hd17hnjg_sc", null);
                    handleSelectBank(jSONObject);
                } else if (TextUtils.equals(KEY_ACTION_START_GO_HELLO_PAY, str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "cashier_button";
                    }
                    u.a().e = str2;
                    u.a().f = this.openSource;
                    logSC("b_pay_rcywdj1v_sc", null);
                    handleGoHelloPay(jSONObject);
                } else {
                    jsCallbackError(this, "非法状态错误:action类型异常", com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleActionAndData").b("action", str));
                }
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.a a = com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleActionAndData").a(HybridSignPayJSHandler.ARG_TRADE_NO, this.tradeNo).a(KEY_DATA_PAY_TOKEN, this.payToken);
                jsCallbackError(this, "参数解析失败:tradeNo或payToken异常", a.b("reason", "catch exception" + e.getMessage()));
            }
        }
    }

    private void handleSelectPayment(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3df1d4a1c1a748edb546f3231816be41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3df1d4a1c1a748edb546f3231816be41");
        } else if (jSONObject == null) {
            jsCallbackError(this, "参数校验错误:更多支付方式data为空", com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleSelectPayment").b("reason", "data is null"));
        } else {
            try {
                int optInt = jSONObject.optInt(KEY_DATA_SELECT_PAYMENT_INDEX);
                WalletPayment walletPayment = getWalletPayment(jSONObject);
                if (walletPayment == null || walletPayment.getWalletPaymentListPage() == null) {
                    jsCallbackError(this, "参数校验错误:更多支付方式data内容异常", com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleSelectPayment").b("reason", "walletPayment or ListPage is null"));
                    return;
                }
                WalletPaymentListPage walletPaymentListPage = walletPayment.getWalletPaymentListPage();
                Object[] objArr2 = {walletPayment, this, walletPaymentListPage, Integer.valueOf(optInt)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "683874ddd6c882cf078772425f4b003d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "683874ddd6c882cf078772425f4b003d");
                } else if (walletPaymentListPage == null) {
                    jsCallbackError(this, JS_CALLBACK_PARAMS_CHECK_ERROR, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "startSelectPayment").b("reason", "listPage is null"));
                } else {
                    c cVar = new c(this);
                    setSelectHandler(cVar);
                    cVar.a(walletPayment, null, walletPaymentListPage, optInt, 1);
                }
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.a c = com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleSelectPayment");
                jsCallbackError(this, "参数解析失败:更多支付方式解析异常", c.b("reason", "catch exception" + e.getMessage()));
            }
        }
    }

    private void handleSelectBank(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0be450944dbe4ce54fd166733c265bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0be450944dbe4ce54fd166733c265bf");
        } else if (jSONObject == null) {
            jsCallbackError(this, "参数校验错误:更多银行卡data异常", com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleSelectBank").b("reason", "data is null"));
        } else {
            try {
                MTPayment mTPayment = (MTPayment) n.a().fromJson(jSONObject.optJSONObject(KEY_DATA_SELECT_MT_PAYMENT).toString(), (Class<Object>) MTPayment.class);
                int optInt = jSONObject.optInt(KEY_DATA_SELECT_BANK_INDEX);
                WalletPayment walletPayment = getWalletPayment(jSONObject);
                Object[] objArr2 = {walletPayment, this, mTPayment, Integer.valueOf(optInt)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "d5e8ba14bee3d62d7369c1f2b5f1e876", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "d5e8ba14bee3d62d7369c1f2b5f1e876");
                } else if (mTPayment == null || mTPayment.getMtPaymentListPage() == null) {
                    jsCallbackError(this, JS_CALLBACK_PARAMS_CHECK_ERROR, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "startSelectBank").b("reason", "checkedMTPayment or listPage is null"));
                } else {
                    c cVar = new c(this);
                    setSelectHandler(cVar);
                    cVar.a(walletPayment, mTPayment, mTPayment.getMtPaymentListPage(), optInt, 0);
                }
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.a c = com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleSelectBank");
                jsCallbackError(this, "参数解析失败:更多银行卡解析异常", c.b("reason", "catch exception" + e.getMessage()));
            }
        }
    }

    private void handleGoHelloPay(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a1d1d6bb10f137f410ec16ff8e82a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a1d1d6bb10f137f410ec16ff8e82a3e");
        } else if (jSONObject == null) {
            jsCallbackError(this, "参数校验错误:请求GoHelloPay时data为空", com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleGoHelloPay").b("reason", "data is null"));
        } else {
            try {
                b.a(getWalletPayment(jSONObject), this, (MTPayment) n.a().fromJson(jSONObject.optJSONObject(KEY_DATA_SELECT_MT_PAYMENT).toString(), (Class<Object>) MTPayment.class), this.extraData, getPopWindowBean(jSONObject), jSONObject.optJSONObject(KEY_TRANSMISSION_PARAM));
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.a c = com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "handleGoHelloPay");
                jsCallbackError(this, "参数解析失败:GoHelloPay解析异常", c.b("reason", "catch exception" + e.getMessage()));
            }
        }
    }

    private WalletPayment getWalletPayment(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf3e68e589560b86198def280d311286", RobustBitConfig.DEFAULT_VALUE)) {
            return (WalletPayment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf3e68e589560b86198def280d311286");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(KEY_DATA_CASHIER_PAYMENT);
        if (optJSONObject != null) {
            return (WalletPayment) n.a().fromJson(optJSONObject.toString(), (Class<Object>) CashierPayment.class);
        }
        return null;
    }

    private CashierPopWindowBean getPopWindowBean(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edad8bed17787563316030ffc351bfb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierPopWindowBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edad8bed17787563316030ffc351bfb0");
        }
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(KEY_DATA_POP_WINDOW)) == null) {
            return null;
        }
        return (CashierPopWindowBean) n.a().fromJson(optJSONObject.toString(), (Class<Object>) CashierPopWindowBean.class);
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public String getTradeNo() {
        return this.tradeNo;
    }

    public String getPayToken() {
        return this.payToken;
    }

    public String getVerifyScene() {
        return this.verifyScene;
    }

    public void setPayerHandler(b bVar) {
        this.payerHandler = bVar;
    }

    public void setSelectHandler(c cVar) {
        this.selectHandler = cVar;
    }

    public b getPayerHandler() {
        return this.payerHandler;
    }

    public c getSelectHandler() {
        return this.selectHandler;
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public String getExtraData() {
        return this.extraData;
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public String getMerchantNo() {
        return this.merchantNo;
    }

    @SuppressLint({"LoopDetector"})
    public static void jsCallbackError(ICashierJSHandler iCashierJSHandler, String str, Map<String, Object> map) {
        Object[] objArr = {iCashierJSHandler, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a29fe5b9e0fba199c66f1d72da19d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a29fe5b9e0fba199c66f1d72da19d82");
        } else if (iCashierJSHandler == null) {
        } else {
            iCashierJSHandler.jsCallbackError(11, str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("error", str);
            logSC(iCashierJSHandler, "b_pay_n3s0fgth_sc", map);
        }
    }

    public static void jsCallbackPaySucc(ICashierJSHandler iCashierJSHandler, String str, boolean z) {
        Object[] objArr = {iCashierJSHandler, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb94d37fc58a6241d3695df8c2b90594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb94d37fc58a6241d3695df8c2b90594");
        } else {
            jsCallbackPaySucc(iCashierJSHandler, str, 0, null, null, z);
        }
    }

    public static void jsCallbackPaySucc(ICashierJSHandler iCashierJSHandler, String str, boolean z, JSONObject jSONObject) {
        Object[] objArr = {iCashierJSHandler, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c988a0d30a0451b1e28c7a9035be96ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c988a0d30a0451b1e28c7a9035be96ab");
        } else {
            jsCallbackPaySucc(iCashierJSHandler, str, 0, null, null, z, jSONObject);
        }
    }

    public static void jsCallbackPaySucc(ICashierJSHandler iCashierJSHandler, String str, int i, String str2, boolean z) {
        Object[] objArr = {iCashierJSHandler, str, Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e63d6b4b7eaf7fbc14a5b3630c6c8c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e63d6b4b7eaf7fbc14a5b3630c6c8c8");
        } else {
            jsCallbackPaySucc(iCashierJSHandler, str, i, str2, null, z);
        }
    }

    public static void jsCallbackPaySucc(ICashierJSHandler iCashierJSHandler, String str, int i, String str2, String str3, boolean z, JSONObject jSONObject) {
        Object[] objArr = {iCashierJSHandler, str, Integer.valueOf(i), str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfadf47a3001bc7b57c221eb38b9cd43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfadf47a3001bc7b57c221eb38b9cd43");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (i != 0) {
                jSONObject3.put("code", i);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject3.put("message", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject3.put("extra", str3);
            }
            if (z) {
                jSONObject3.put("openCreditPayStatus", "success");
            }
            if (jSONObject3.length() != 0) {
                jSONObject2.put("data", jSONObject3);
            }
            jSONObject2.put("status", str);
            if (jSONObject != null) {
                jSONObject2.put(KEY_PROMOTION, jSONObject);
            }
            if (TextUtils.equals(str, "pay_success")) {
                logSC(iCashierJSHandler, "b_pay_o9mas1is_sc", new a.c().a("payResult", str).b);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_bridge_meituanpay_callback", 200);
            } else {
                logSC(iCashierJSHandler, "b_pay_8x7od2op_sc", new a.c().a("payResult", str).b);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_bridge_meituanpay_callback", (int) ConnectionResult.NETWORK_ERROR);
            }
            jsCallbackSucc(iCashierJSHandler, jSONObject2);
        } catch (JSONException e) {
            com.meituan.android.neohybrid.neo.report.a c = com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "jsCallbackPaySucc");
            jsCallbackError(iCashierJSHandler, "参数解析失败: exception", c.b("reason", "catch exception" + e.getMessage()));
        }
    }

    public static void jsCallbackPaySucc(ICashierJSHandler iCashierJSHandler, String str, int i, String str2, String str3, boolean z) {
        Object[] objArr = {iCashierJSHandler, str, Integer.valueOf(i), str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a76ddc6d1fc121b5d97a50b89efd5a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a76ddc6d1fc121b5d97a50b89efd5a37");
        } else {
            jsCallbackPaySucc(iCashierJSHandler, str, i, str2, str3, z, null);
        }
    }

    public static void jsCallbackNotPaySucc(ICashierJSHandler iCashierJSHandler, String str, Object obj) {
        Object[] objArr = {iCashierJSHandler, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad4997a806be190dd4049306434be1bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad4997a806be190dd4049306434be1bc");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof JSONObject) {
                jSONObject.put("data", obj);
            } else if (obj != null) {
                jSONObject.put("data", new JSONObject(n.a().toJson(obj)));
            }
            jSONObject.put("status", str);
            jsCallbackSucc(iCashierJSHandler, jSONObject);
        } catch (JSONException e) {
            com.meituan.android.neohybrid.neo.report.a c = com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "jsCallbackNotPaySucc");
            jsCallbackError(iCashierJSHandler, "参数解析失败: exception", c.b("reason", "catch exception:" + e.getMessage()));
        }
    }

    private static void jsCallbackSucc(ICashierJSHandler iCashierJSHandler, JSONObject jSONObject) {
        Object[] objArr = {iCashierJSHandler, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07d1b497c9374a87eb7c11add7fcd5ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07d1b497c9374a87eb7c11add7fcd5ea");
        } else if (iCashierJSHandler == null) {
        } else {
            try {
                JSONObject put = new JSONObject().put(KEY_PAY_RESULT, jSONObject);
                logSC(iCashierJSHandler, "b_pay_n3s0fgth_sc", new a.c().a("result", put).b);
                iCashierJSHandler.jsCallback(put);
            } catch (JSONException e) {
                com.meituan.android.neohybrid.neo.report.a c = com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "jsCallbackSucc");
                jsCallbackError(iCashierJSHandler, "参数解析失败: exception", c.b("reason", "catch exception: " + e.getMessage()));
            }
        }
    }

    public String getDowngradeErrorInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6e4871045f5c9e4c02597fc8a331107", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6e4871045f5c9e4c02597fc8a331107");
        }
        String valueOf = String.valueOf(com.meituan.android.neohybrid.neo.tunnel.a.a().a(getNeoCompat(), "ext_param"));
        return TextUtils.isEmpty(valueOf) ? "" : valueOf;
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public HashMap<String, String> getExtendTransmissionParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5146561884b64e864d3738ecc481e461", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5146561884b64e864d3738ecc481e461");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(this.cif) && !TextUtils.equals(StringUtil.NULL, this.cif.toLowerCase())) {
            hashMap.put(KEY_DATA_CIF, this.cif);
        }
        return hashMap;
    }
}
