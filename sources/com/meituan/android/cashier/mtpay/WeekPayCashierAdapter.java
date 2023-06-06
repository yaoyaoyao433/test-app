package com.meituan.android.cashier.mtpay;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.u;
import com.meituan.android.cashier.model.bean.MTPaymentURL;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.cashier.retrofit.CashierRequestService;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.e;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MTPayBaseClass
/* loaded from: classes2.dex */
public class WeekPayCashierAdapter extends u implements PayActionListener {
    public static ChangeQuickRedirect a;
    private CashierParams b;
    private MTCashierActivity c;
    private String d;
    private String e;
    private String f;
    private Call<MTPaymentURL> g;

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void b(String str) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "weekpay";
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & i & b> ICashier.a a(T t, CashierParams cashierParams) {
        String productType;
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab5e23653daa8f88e35361e1c3bcaae9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab5e23653daa8f88e35361e1c3bcaae9");
        }
        if (t == null || cashierParams == null || TextUtils.isEmpty(cashierParams.getTradeNo()) || TextUtils.isEmpty(cashierParams.getPayToken())) {
            return new ICashier.a(false);
        }
        this.b = cashierParams;
        this.c = (MTCashierActivity) t;
        this.d = cashierParams.getTradeNo();
        this.e = cashierParams.getPayToken();
        Uri uri = cashierParams.getUri();
        if (uri != null) {
            this.f = uri.getQueryParameter("merchant_no");
        }
        Object[] objArr2 = {cashierParams};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cead117ad280f0a3e093b8bb359fa415", RobustBitConfig.DEFAULT_VALUE)) {
            productType = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cead117ad280f0a3e093b8bb359fa415");
        } else {
            productType = cashierParams == null ? "" : cashierParams.getProductType();
        }
        return new ICashier.a("weekpay".equals(productType));
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        PayParams payParams;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaff21fc055b22c6d4046a4fd03d5587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaff21fc055b22c6d4046a4fd03d5587");
            return;
        }
        com.meituan.android.pay.common.analyse.b.a(this.f);
        com.meituan.android.pay.common.analyse.b.b(this.p);
        com.meituan.android.pay.desk.component.analyse.a.a("paybiz_gohellopay_start", "6");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28f3e6389eb781320d10e91b21d4eedc", RobustBitConfig.DEFAULT_VALUE)) {
            payParams = (PayParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28f3e6389eb781320d10e91b21d4eedc");
        } else {
            payParams = new PayParams();
            payParams.tradeNo = this.d;
            payParams.payToken = this.e;
            payParams.cashierType = "preorder-cashier";
        }
        Object[] objArr3 = {payParams};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35f8e12ba6582da8f1416f5ed117e7ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35f8e12ba6582da8f1416f5ed117e7ef");
            return;
        }
        HashMap<String, String> a2 = com.meituan.android.cashier.retrofit.a.a(payParams);
        a2.put("pay_type", "weekpay");
        m.a(this.c, a2);
        this.g = ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this.c, 3)).goHelloPay(a2);
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dfde817d86e2e8ae70d0925413c05f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dfde817d86e2e8ae70d0925413c05f9");
            return;
        }
        com.meituan.android.paymentchannel.b.a().a(this.c, this);
        if (com.meituan.android.paymentchannel.b.a().a(this.c, i, i2, intent)) {
            com.meituan.android.paybase.common.analyse.a.a("WeekPayCashier", "consumeActivityResult", "requestCode:" + i, "");
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8036c9293ff8c0676c21284c35cc7577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8036c9293ff8c0676c21284c35cc7577");
        } else if (this.g == null || this.g.c()) {
        } else {
            this.g.cancel();
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3fd3d68d1dc02aa3b662bf3a4ff8cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3fd3d68d1dc02aa3b662bf3a4ff8cd9");
        } else if (this.c != null) {
            this.c.b("weekpay", RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER, str);
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4fa1f599d33b03e180d99434f0deadc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4fa1f599d33b03e180d99434f0deadc");
        } else {
            a(str);
        }
    }

    private static String a(PayException payException) {
        Object[] objArr = {payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a248593f992ea38f5dd93725dd2acb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a248593f992ea38f5dd93725dd2acb8");
        }
        if (payException == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        int code = payException.getCode();
        String message = payException.getMessage();
        if (code != -1) {
            try {
                jSONObject.put("pay_err_code", code);
                if (!TextUtils.isEmpty(message)) {
                    jSONObject.put("pay_err_msg", message);
                }
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "MTHalfPageCashier_getPreComponentFailInfo", (Map<String, Object>) null);
            }
        }
        jSONObject.put("jump_from_product", "weekpay");
        return jSONObject.toString();
    }

    private static String a(PayFailInfo payFailInfo) {
        Object[] objArr = {payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3af15d2508f40ab201b4378911d8de5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3af15d2508f40ab201b4378911d8de5e");
        }
        if (payFailInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        int errorCode = payFailInfo.getErrorCode();
        String msg = payFailInfo.getMsg();
        if (errorCode != -1) {
            try {
                jSONObject.put("pay_err_code", errorCode);
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "MTHalfPageCashier_getPreComponentFailInfo", (Map<String, Object>) null);
            }
        }
        if (!TextUtils.isEmpty(msg)) {
            jSONObject.put("pay_err_msg", msg);
        }
        jSONObject.put("jump_from_product", "weekpay");
        return jSONObject.toString();
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void a(String str, int i, PayFailInfo payFailInfo) {
        boolean z;
        Object[] objArr = {str, Integer.valueOf(i), payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab106bbce9b26ef582ce60792a2a7c38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab106bbce9b26ef582ce60792a2a7c38");
        } else if ("quickbank".equals(str)) {
            Object[] objArr2 = {str, Integer.valueOf(i), payFailInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d3bc11af0d04cc12d82d2a6142b1f33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d3bc11af0d04cc12d82d2a6142b1f33");
            } else if (i == 1) {
                com.meituan.android.pay.desk.component.analyse.a.a(this.p);
                q.a("b_pay_ydxzmlrc_mv", new a.b().a("pay_type", str).b, this.p);
                b(payFailInfo);
            } else if (i == -1) {
                a((String) null);
            } else {
                Object[] objArr3 = {payFailInfo};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c6acc1cb47237ad1f2eb40c74d7ccbdc", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c6acc1cb47237ad1f2eb40c74d7ccbdc")).booleanValue();
                } else {
                    z = payFailInfo != null && payFailInfo.getErrorCode() == -11037;
                }
                if (z) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(KnbConstants.PARAMS_SCENE, "cancel");
                    a(false, (Map<String, Object>) hashMap);
                    a((String) null);
                } else if (c(payFailInfo)) {
                    c(a(payFailInfo));
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "842bd1bc0e8eb042f29aa6a5501a1d33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "842bd1bc0e8eb042f29aa6a5501a1d33");
                    } else {
                        this.c.j();
                    }
                }
            }
        }
    }

    private void b(PayFailInfo payFailInfo) {
        Promotion promotion;
        Object[] objArr = {payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5bbc1a639423c9a0a4df6bf683b83b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5bbc1a639423c9a0a4df6bf683b83b4");
        } else if (this.c == null) {
        } else {
            if (e.a()) {
                this.c.f = "success";
                this.c.w_();
                this.c.a(1);
            } else if (payFailInfo == null) {
                this.c.a((Promotion) null);
            } else {
                try {
                    promotion = (Promotion) n.a().fromJson(new JSONObject(payFailInfo.getExtra()).optString("pay_promotion"), (Class<Object>) Promotion.class);
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "WeekPayCashierAdapter_onMeituanPaySuccess", (Map<String, Object>) null);
                    promotion = null;
                }
                this.c.a(promotion);
            }
        }
    }

    private boolean c(PayFailInfo payFailInfo) {
        Object[] objArr = {payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9946ae379bb1b7810764453abcaa589", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9946ae379bb1b7810764453abcaa589")).booleanValue();
        }
        JSONObject jSONObject = null;
        if (payFailInfo != null) {
            try {
                if (!TextUtils.isEmpty(payFailInfo.getExtra())) {
                    jSONObject = new JSONObject(payFailInfo.getExtra());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return !(jSONObject != null && jSONObject.has("action") && TextUtils.equals(jSONObject.optString("action"), "downgrade_to_business"));
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final PayBaseActivity.a a(int i) {
        return PayBaseActivity.a.CASHIER;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b797eac284acb60b327babd7aa3282cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b797eac284acb60b327babd7aa3282cd");
        } else if (i == 3) {
            q.c("weekpay_gohellopay_succ", null, this.p);
            q.b("cashier/gohellopay", "b_pay_weekpay_gohellopay_succ_sc", null, this.p);
            MTPaymentURL mTPaymentURL = (MTPaymentURL) obj;
            q.a("b_271k132t", new a.c().a("pay_type", mTPaymentURL.getPayType()).b, this.p);
            Object[] objArr2 = {mTPaymentURL};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a654ce0a4ebc937db0fc63a39b95dde", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a654ce0a4ebc937db0fc63a39b95dde");
            } else if (mTPaymentURL != null) {
                if (mTPaymentURL.getOverLoadInfo() != null && mTPaymentURL.getOverLoadInfo().isStatus()) {
                    a(false, (Map<String, Object>) null);
                    q.a("b_pay_6f1taqcl_mv", new a.b().a("type", mTPaymentURL.getPayType()).b, this.p);
                    c((String) null);
                    return;
                }
                a(true, (Map<String, Object>) null);
                com.meituan.android.paymentchannel.b.a().a(this.c, "quickbank", mTPaymentURL.getUrl(), this.b.getTradeNo(), this);
                com.meituan.android.cashier.utils.a.a(mTPaymentURL, "native", this.p);
            }
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f809b02223b162517aa5b6fd92c5fb26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f809b02223b162517aa5b6fd92c5fb26");
        } else if (i == 3) {
            q.a("weekpay_gohellopay_fail", exc, this.p);
            q.a("cashier/gohellopay", "b_pay_weekpay_gohellopay_fail_sc", exc, this.p);
            a(false, (Map<String, Object>) null);
            if (exc instanceof PayException) {
                a(a((PayException) exc));
            } else {
                a((String) null);
            }
        }
    }
}
