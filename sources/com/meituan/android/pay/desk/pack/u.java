package com.meituan.android.pay.desk.pack;

import android.app.Activity;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.pay.common.payment.bean.installment.PeriodCoupon;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.desk.payment.bean.standarddesk.RefreshInstallment;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.pay.desk.retrofit.PayDeskRequestService;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u {
    public static ChangeQuickRedirect a = null;
    public static final String b = "1";
    public static final String c = "0";
    private static volatile u h;
    public long d;
    public String e;
    public String f;
    public String g;
    private int i;

    public u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115a5ec0db4f53f0bced2fbf67733579", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115a5ec0db4f53f0bced2fbf67733579");
            return;
        }
        this.e = "cashier";
        this.f = "-999";
    }

    public static u a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3efd563f79ef18699977e19239d82845", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3efd563f79ef18699977e19239d82845");
        }
        if (h == null) {
            synchronized (u.class) {
                if (h == null) {
                    h = new u();
                }
            }
        }
        return h;
    }

    public final Map<String, String> a(Activity activity, com.meituan.android.pay.common.payment.data.f fVar, com.meituan.android.pay.common.payment.data.d dVar, String str) {
        Object[] objArr = {activity, fVar, dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6047ec032ea05402acedf2feca0e1b86", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6047ec032ea05402acedf2feca0e1b86");
        }
        Map<String, String> b2 = b(activity, fVar, dVar, str);
        if ("cashier_select_bank_dialog_params".equals(str)) {
            a(b2, dVar);
        } else if (!"cashier_params".equals(str) && "mt_balance_insufficient_params".equals(str)) {
            b2.remove("combine_type");
            b2.remove("installment_available_flag");
            b2.remove("installment_info");
            b2.remove("selected_promo_info");
        }
        a(fVar, dVar, b2);
        return b2;
    }

    public static void a(Map<String, String> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0a035ddf48457209df546e92e3d5ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0a035ddf48457209df546e92e3d5ab6");
            return;
        }
        String str2 = map.get("ext_dim_stat");
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "ICashierPayerHandler_appendOpenSource", (Map<String, Object>) null);
            }
        }
        try {
            jSONObject.put("open_source", str);
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "ICashierPayerHandler_appendOpenSource", (Map<String, Object>) null);
        }
        map.put("ext_dim_stat", jSONObject.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.String> b(android.app.Activity r28, com.meituan.android.pay.common.payment.data.f r29, com.meituan.android.pay.common.payment.data.d r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.desk.pack.u.b(android.app.Activity, com.meituan.android.pay.common.payment.data.f, com.meituan.android.pay.common.payment.data.d, java.lang.String):java.util.Map");
    }

    private void a(com.meituan.android.pay.common.payment.data.d dVar, Map<String, String> map) {
        Object[] objArr = {dVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ac842bd58ce208a686ba1cc7cf9589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ac842bd58ce208a686ba1cc7cf9589");
            return;
        }
        JSONObject a2 = com.meituan.android.pay.common.promotion.utils.c.a().a(map);
        if (a2 == null || !(dVar instanceof MTPayment)) {
            return;
        }
        MTPayment mTPayment = (MTPayment) dVar;
        try {
            a2.put("installment_available_flag", mTPayment.getIsSupportInstallment());
            Installment installment = mTPayment.getInstallment();
            if (installment != null) {
                JSONObject jSONObject = new JSONObject();
                Period a3 = com.meituan.android.pay.common.payment.utils.e.a(installment.getPeriodList());
                if (a3 != null) {
                    jSONObject.put("installment_selected_period", a3.getPeriod());
                    jSONObject.put("repay_amount", com.meituan.android.paybase.utils.d.a(Float.valueOf(a3.getRepayAmount())));
                    jSONObject.put("service_fee", com.meituan.android.paybase.utils.d.a(Float.valueOf(a3.getServiceFee())));
                    jSONObject.put("principal_amount", com.meituan.android.paybase.utils.d.a(Float.valueOf(a3.getPrincipalAmount())));
                    jSONObject.put("discount_amount", com.meituan.android.paybase.utils.d.a(Float.valueOf(a3.getDiscountAmount())));
                    List<PeriodCoupon> coupons = a3.getCoupons();
                    StringBuilder sb = new StringBuilder();
                    if (!com.meituan.android.paybase.utils.i.a((Collection) coupons)) {
                        for (PeriodCoupon periodCoupon : coupons) {
                            if (periodCoupon.isSelected()) {
                                sb.append(periodCoupon.getCode());
                                sb.append(CommonConstant.Symbol.COMMA);
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    if (sb2.endsWith(CommonConstant.Symbol.COMMA)) {
                        sb2 = sb2.substring(0, sb2.length() - 1);
                    }
                    jSONObject.put("coupon_ids", sb2);
                    if (com.meituan.android.pay.common.payment.utils.e.a((com.meituan.android.pay.common.payment.data.d) mTPayment) && com.meituan.android.paybase.utils.d.c(Float.valueOf(a3.getTotalRepayAmount()), Double.valueOf(0.0d)) > 0) {
                        jSONObject.put("total_repay_amount", com.meituan.android.paybase.utils.d.a(Float.valueOf(a3.getTotalRepayAmount())));
                    }
                    if (com.meituan.android.pay.common.payment.utils.e.a((com.meituan.android.pay.common.payment.data.d) mTPayment) && !TextUtils.isEmpty(a3.getPriceId())) {
                        jSONObject.put("price_id", a3.getPriceId());
                    }
                }
                jSONObject.put("installment_periods", installment.getAllPeriods());
                a2.put("installment_info", jSONObject.toString());
                JSONObject a4 = com.meituan.android.pay.common.promotion.utils.c.a().a(dVar);
                if (a4 != null && a4.length() > 0) {
                    a2.put("selected_promo_info", a4.toString());
                }
            }
            map.put("payExtendParams", a2.toString());
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "WalletPayManager-appendInstallmentParams", (Map<String, Object>) null);
        }
    }

    public final void a(Activity activity, com.meituan.android.pay.common.payment.data.d dVar, com.meituan.android.pay.common.payment.data.a aVar, Map<String, String> map) {
        Object[] objArr = {activity, dVar, aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44022afe0058cdc29fd9b8df0b6da61f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44022afe0058cdc29fd9b8df0b6da61f");
        } else if (dVar == null || aVar == null) {
        } else {
            a(activity, aVar, map);
            a(dVar, aVar, map);
        }
    }

    private void a(com.meituan.android.pay.common.payment.data.d dVar, com.meituan.android.pay.common.payment.data.a aVar, Map<String, String> map) {
        Object[] objArr = {dVar, aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eb5429dbbc1998cf2a5067443056bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eb5429dbbc1998cf2a5067443056bb6");
        } else if (dVar == null || aVar == null || map == null || !com.meituan.android.pay.common.payment.utils.d.b(dVar)) {
        } else {
            map.put("combine_type", dVar.getPayType() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + aVar.getPayType());
        }
    }

    public final void a(Activity activity, com.meituan.android.pay.common.payment.data.a aVar, Map<String, String> map) {
        JSONObject jSONObject;
        Object[] objArr = {activity, aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19fc6e1642671e495162a22202db23bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19fc6e1642671e495162a22202db23bd");
        } else if (aVar == null || map == null) {
        } else {
            if (!TextUtils.isEmpty(aVar.getPayType())) {
                map.put("pay_type", aVar.getPayType());
            } else {
                map.remove("pay_type");
            }
            if (!TextUtils.isEmpty(aVar.getBankType())) {
                map.put("bank_type", aVar.getBankType());
            } else {
                map.remove("bank_type");
            }
            if (!TextUtils.isEmpty(aVar.getBankTypeId())) {
                map.put("bank_type_id", aVar.getBankTypeId());
            } else {
                map.remove("bank_type_id");
            }
            if (!TextUtils.isEmpty(aVar.getPayTypeId())) {
                map.put("paytype_id", aVar.getPayTypeId());
            } else {
                map.remove("paytype_id");
            }
            if (TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "ext_dim_stat"))) {
                jSONObject = new JSONObject();
            } else {
                try {
                    String optString = new JSONObject(com.meituan.android.pay.common.payment.utils.b.b(activity, "ext_dim_stat")).optString("outer_business_statics");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("outer_business_statics", optString);
                    jSONObject = jSONObject2;
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "WalletPayManager_updateBankcardParams", (Map<String, Object>) null);
                    jSONObject = new JSONObject();
                }
            }
            try {
                jSONObject.put("business_entry", "cashier");
                jSONObject.put("entry", this.e);
                jSONObject.put("id_bindcard", UUID.randomUUID().toString());
                if (!TextUtils.isEmpty(aVar.getBankTypeId())) {
                    jSONObject.put("bankTypeId", aVar.getBankTypeId());
                }
            } catch (JSONException e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "MTCashierRevisionFragment-payParams.extDimStat", (Map<String, Object>) null);
            }
            map.put("ext_dim_stat", jSONObject.toString());
            if (aVar.getCardInfo() != null && !TextUtils.isEmpty(aVar.getCardInfo().getBankCard())) {
                map.put("bank_card", aVar.getCardInfo().getBankCard());
            } else {
                map.remove("bank_card");
            }
        }
    }

    private void a(com.meituan.android.pay.common.payment.data.f fVar, com.meituan.android.pay.common.payment.data.d dVar, Map<String, String> map) {
        Object[] objArr = {fVar, dVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "921ff73cb43804693e5633668f704aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "921ff73cb43804693e5633668f704aed");
        } else if (fVar instanceof com.meituan.android.pay.common.payment.data.c) {
            com.meituan.android.pay.common.promotion.utils.c.a().a(dVar, map);
        }
    }

    private void a(Map<String, String> map, com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {map, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c493a13fded1b6fe5745ec14bcb24f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c493a13fded1b6fe5745ec14bcb24f");
        } else if (com.meituan.android.pay.common.payment.utils.c.e(dVar.getPayType())) {
            try {
                String str = map.get("payExtendParams");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.isNull("credit_pay_no_pwd_upgrade_flag")) {
                    return;
                }
                jSONObject.remove("credit_pay_no_pwd_upgrade_flag");
                map.put("payExtendParams", jSONObject.toString());
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "WalletPayManager-removeCreditPayNoPwdUpdateFlag", (Map<String, Object>) null);
            }
        }
    }

    public final com.meituan.android.pay.common.payment.data.d a(WalletPayment walletPayment) {
        Object[] objArr = {walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb447c7687bac5f0b3b7a865992f61b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb447c7687bac5f0b3b7a865992f61b2");
        }
        List<MTPayment> recommendPayment = walletPayment.getRecommendPayment();
        if (com.meituan.android.paybase.utils.i.a((Collection) recommendPayment)) {
            return null;
        }
        for (MTPayment mTPayment : recommendPayment) {
            if (mTPayment.isSelected()) {
                return mTPayment;
            }
        }
        return null;
    }

    public final com.meituan.android.pay.common.payment.data.d b(WalletPayment walletPayment) {
        Object[] objArr = {walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb3ab5224f7eb1efe99faf491774887", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb3ab5224f7eb1efe99faf491774887");
        }
        List<MTPayment> recommendPayment = walletPayment.getRecommendPayment();
        if (com.meituan.android.paybase.utils.i.a((Collection) recommendPayment)) {
            return null;
        }
        return recommendPayment.get(0);
    }

    public final Call<RefreshInstallment> a(Activity activity, com.meituan.android.paybase.retrofit.b bVar, String str, String str2, com.meituan.android.pay.common.payment.data.d dVar, boolean z, String str3, String str4, HashMap<String, String> hashMap) {
        Object[] objArr = {activity, bVar, str, str2, dVar, (byte) 0, str3, str4, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4669bf046ea30eece9c769b31914dfe0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4669bf046ea30eece9c769b31914dfe0");
        }
        if (dVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) dVar;
            String payType = mTPayment.getPayType();
            JSONObject jSONObject = new JSONObject();
            Installment installment = mTPayment.getInstallment();
            try {
                jSONObject.put("installment_available_flag", mTPayment.getIsSupportInstallment());
                if (installment != null) {
                    jSONObject.put("installment_periods", installment.getAllPeriods());
                    int c2 = com.meituan.android.pay.common.payment.utils.e.c(mTPayment);
                    if (c2 >= 0) {
                        jSONObject.put("installment_selected_period", c2);
                    }
                }
                if (com.meituan.android.pay.common.payment.utils.e.a((com.meituan.android.pay.common.payment.data.d) mTPayment) && mTPayment.getCardInfo() != null && !TextUtils.isEmpty(mTPayment.getCardInfo().getBankCard())) {
                    jSONObject.put("bankcard", mTPayment.getCardInfo().getBankCard());
                }
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "WalletPayManager_refreshInstallment", (Map<String, Object>) null);
            }
            String jSONObject2 = jSONObject.length() > 0 ? jSONObject.toString() : "";
            JSONObject a2 = com.meituan.android.pay.common.promotion.utils.c.a().a(dVar);
            Call<RefreshInstallment> refreshInstallment = ((PayDeskRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayDeskRequestService.class, bVar, 562)).refreshInstallment(str, str2, payType, jSONObject2, (a2 == null || a2.length() <= 0) ? "" : a2.toString(), com.meituan.android.paycommon.lib.config.a.a().o(), str3, str4, hashMap);
            a.c cVar = new a.c();
            int i = this.i + 1;
            this.i = i;
            com.meituan.android.paybase.common.analyse.a.a("b_pay_mwc8z335_mc", cVar.a("request_number", Integer.valueOf(i)).b);
            this.d = System.currentTimeMillis();
            return refreshInstallment;
        }
        return null;
    }

    public final void a(RefreshInstallment refreshInstallment, WalletPayment walletPayment, MTPayment mTPayment) {
        Object[] objArr = {refreshInstallment, walletPayment, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7354bfede0a075c0b6032a5872ef1f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7354bfede0a075c0b6032a5872ef1f5");
        } else if (refreshInstallment != null && walletPayment != null && mTPayment != null) {
            MTPayment mTPayment2 = null;
            if (TextUtils.equals(mTPayment.getPayType(), refreshInstallment.getPayType())) {
                WalletPaymentListPage walletPaymentListPage = walletPayment.getWalletPaymentListPage();
                if (walletPaymentListPage != null && !com.meituan.android.paybase.utils.i.a((Collection) walletPaymentListPage.getMtPaymentList())) {
                    for (com.meituan.android.pay.common.payment.data.a aVar : walletPaymentListPage.getMtPaymentList()) {
                        if (aVar instanceof MTPayment) {
                            MTPayment mTPayment3 = (MTPayment) aVar;
                            if (TextUtils.equals(mTPayment3.getPayType(), mTPayment.getPayType()) && (com.meituan.android.pay.common.payment.utils.c.e(mTPayment3.getPayType()) || (com.meituan.android.pay.common.payment.utils.c.a(mTPayment3) && mTPayment3.getCardInfo() != null && mTPayment.getCardInfo() != null && TextUtils.equals(mTPayment3.getCardInfo().getBankCard(), mTPayment.getCardInfo().getBankCard())))) {
                                mTPayment2 = mTPayment3;
                            }
                        }
                    }
                }
                MTPayment mTPayment4 = mTPayment2;
                Object[] objArr2 = {mTPayment, mTPayment4, refreshInstallment};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "235c0d5988344ffed88daed20cb78ad4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "235c0d5988344ffed88daed20cb78ad4");
                    return;
                }
                a(mTPayment, refreshInstallment, true);
                a(mTPayment4, refreshInstallment, false);
            }
        }
    }

    private static void a(MTPayment mTPayment, RefreshInstallment refreshInstallment, boolean z) {
        Object[] objArr = {mTPayment, refreshInstallment, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "070f245c7eed09ef7d67935e3051c17b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "070f245c7eed09ef7d67935e3051c17b");
        } else if (mTPayment == null || refreshInstallment == null) {
        } else {
            mTPayment.setIsSupportInstallment(refreshInstallment.getIsSupportInstallment());
            mTPayment.setUnsupportedInstallmentReason(refreshInstallment.getUnsupportedInstallmentReason());
            mTPayment.setInstallment(refreshInstallment.getInstallment());
            mTPayment.setCommonAgreement(refreshInstallment.getCommonAgreement());
            mTPayment.setInstallmentRateDescBean(refreshInstallment.getInstallmentRateDescBean());
            mTPayment.setPaymentReduce(refreshInstallment.getPaymentReduce());
            if (z) {
                mTPayment.setBottomLabels(refreshInstallment.getLabels());
            } else {
                mTPayment.setLabels(refreshInstallment.getLabels());
            }
        }
    }

    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac155fb49abd5a0e4b43b7ab4405ad5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac155fb49abd5a0e4b43b7ab4405ad5");
            return;
        }
        com.meituan.android.pay.common.promotion.utils.c.a().b();
        h = null;
    }
}
