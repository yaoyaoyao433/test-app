package com.meituan.android.cashier.utils;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.pay.common.payment.data.g;
import com.meituan.android.pay.common.payment.utils.c;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public Cashier c;

    public final HashMap<String, Object> a(d dVar) {
        int b;
        int i;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a07470059421b075ba3d235d901f72", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a07470059421b075ba3d235d901f72");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("platform", "android");
        hashMap.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        if (this.c != null && !TextUtils.isEmpty(this.c.getTradeNo())) {
            hashMap.put("tradeNo", this.c.getTradeNo());
        }
        if (!TextUtils.isEmpty(this.b)) {
            hashMap.put("merchant_no", this.b);
        }
        if (dVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) dVar;
            hashMap.put("cardPayTitle", mTPayment.getName());
            if (!i.a((Collection) mTPayment.getBottomLabels()) || !i.a((Collection) mTPayment.getRightLabels())) {
                hashMap.put("cardPayLabels", Boolean.TRUE);
            } else {
                hashMap.put("cardPayLabels", Boolean.FALSE);
            }
            CashierPayment b2 = b();
            if (b2 != null && b2.getWalletPaymentListPage() != null) {
                List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = b2.getWalletPaymentListPage().getMtPaymentList();
                if (i.a((Collection) mtPaymentList)) {
                    i = 0;
                } else {
                    i = 0;
                    for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                        if (g.b.contains(aVar.getPayType())) {
                            i++;
                        }
                    }
                }
                hashMap.put("binding_card_num", Integer.valueOf(i));
            }
        }
        if (this.c != null) {
            hashMap.put("creditPay_status", Integer.valueOf(com.meituan.android.cashier.base.utils.a.a(this.c)));
        }
        if (this.c != null) {
            hashMap.put("sub_pay_type", com.meituan.android.cashier.base.utils.a.c(this.c));
        }
        if (this.c != null && (b = com.meituan.android.cashier.base.utils.a.b(this.c)) != -1) {
            hashMap.put("real_name_auth_type", Integer.valueOf(b));
        }
        if (dVar != null) {
            hashMap.put("payType", dVar.getPayType());
            hashMap.put("pay_type", dVar.getPayType());
            hashMap.put("default_sub_pay_type", dVar.getPayType());
            if (!i.a((Collection) dVar.getRightLabels()) && dVar.getRightLabels().get(0) != null) {
                hashMap.put("recommendStyle", Integer.valueOf(dVar.getRightLabels().get(0).getStyle()));
            }
            if (!i.a((Collection) dVar.getBottomLabels())) {
                hashMap.put("mtBottomLabel", Boolean.TRUE);
            } else {
                hashMap.put("mtBottomLabel", Boolean.FALSE);
            }
        } else {
            hashMap.put("payType", "");
            hashMap.put("pay_type", "");
        }
        hashMap.put("sub_type", "0");
        a(hashMap);
        a(hashMap, a());
        hashMap.put("open_source", "standardPayCashierIndex");
        return hashMap;
    }

    private MTPayment a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8114fbc58d31300733a69ba0a8823e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTPayment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8114fbc58d31300733a69ba0a8823e5");
        }
        if (this.c != null && !i.a((Collection) this.c.getPaymentDataList())) {
            for (CashierPayment cashierPayment : this.c.getPaymentDataList()) {
                if (c.b(cashierPayment.getPayType())) {
                    List<MTPayment> recommendPayment = cashierPayment.getRecommendPayment();
                    if (i.a((Collection) recommendPayment)) {
                        return null;
                    }
                    for (MTPayment mTPayment : recommendPayment) {
                        if (com.meituan.android.pay.utils.g.a(mTPayment)) {
                            return mTPayment;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public static void a(Map<String, Object> map, d dVar) {
        Object[] objArr = {map, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bd2ba4ef87c28bd203376ebc995c95e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bd2ba4ef87c28bd203376ebc995c95e");
            return;
        }
        if (dVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) dVar;
            if (com.meituan.android.pay.utils.g.a(mTPayment)) {
                map.put("credit_style", com.meituan.android.pay.utils.g.c(mTPayment) ? "1" : "0");
                map.put("mtcreditpay_status", com.meituan.android.pay.utils.g.b(mTPayment) ? "1" : "0");
                return;
            }
        }
        map.put("credit_style", "-999");
        map.put("mtcreditpay_status", "-999");
    }

    @MTPaySuppressFBWarnings({"NP_NULL_ON_SOME_PATH"})
    private CashierPayment b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3751129bf6dbcfca358ca7cd35d882", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierPayment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3751129bf6dbcfca358ca7cd35d882");
        }
        if (this.c == null || i.a((Collection) this.c.getPaymentDataList())) {
            return null;
        }
        for (CashierPayment cashierPayment : this.c.getPaymentDataList()) {
            if (c.b(cashierPayment.getPayType())) {
                return cashierPayment;
            }
        }
        return null;
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e8b4551c07e9ddcb53e0d588aa3504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e8b4551c07e9ddcb53e0d588aa3504");
        } else {
            map.put("reduction_switch", StringUtil.NULL);
        }
    }

    public final void a(d dVar, String str, String str2) {
        Object[] objArr = {dVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7191aa3ac808027482a194a227aa6834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7191aa3ac808027482a194a227aa6834");
            return;
        }
        HashMap<String, Object> hashMap = new a.b().a().a("merchant_no", this.b).a("pay_type", dVar.getPayType()).a("status", String.valueOf(dVar.getStatus())).a("open_source", str).b;
        a(hashMap, dVar);
        q.b("c_PJmoK", "b_pay_jvsgexor_mc", "切换支付方式", hashMap, str2);
    }

    public final void b(d dVar, String str, String str2) {
        Object[] objArr = {dVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1ab5cd434458c1b7644c493920c7d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1ab5cd434458c1b7644c493920c7d0");
            return;
        }
        String payType = dVar != null ? dVar.getPayType() : "-999";
        Context a2 = com.meituan.android.paybase.config.a.d().a();
        HashMap<String, Object> hashMap = new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("pay_type", payType).a("tradeNo", this.c.getTradeNo()).a("merchant_no", this.b).a("creditPay_status", Integer.valueOf(com.meituan.android.cashier.base.utils.a.a(this.c))).a("open_source", str).a("sub_type", "0").b;
        a(hashMap, dVar);
        q.b("c_PJmoK", "b_xgald577", a2.getString(R.string.cashier__mge_act_click_pay), hashMap, str2);
    }
}
