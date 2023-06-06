package com.meituan.android.cashier.base.utils;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.ReduceInfo;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ce3742a1cb95c311f949a33ac9d6566", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ce3742a1cb95c311f949a33ac9d6566")).intValue();
        }
        List<CashierPayment> paymentDataList = cashier.getPaymentDataList();
        if (!i.a((Collection) paymentDataList)) {
            for (int i = 0; i < paymentDataList.size(); i++) {
                CashierPayment cashierPayment = paymentDataList.get(i);
                if (com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType())) {
                    List<MTPayment> recommendPayment = cashierPayment.getRecommendPayment();
                    if (i.a((Collection) recommendPayment)) {
                        continue;
                    } else {
                        for (MTPayment mTPayment : recommendPayment) {
                            if (com.meituan.android.pay.common.payment.utils.c.e(mTPayment.getPayType())) {
                                if (mTPayment.getStatus() == 0 || mTPayment.getStatus() == 2) {
                                    return mTPayment.getAgreement() != null ? 2 : 3;
                                }
                                return 1;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return 0;
    }

    public static int b(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb4f666032f9a94d2eded2376accb7ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb4f666032f9a94d2eded2376accb7ff")).intValue();
        }
        List<CashierPayment> paymentDataList = cashier.getPaymentDataList();
        if (i.a((Collection) paymentDataList)) {
            return -1;
        }
        for (int i = 0; i < paymentDataList.size(); i++) {
            CashierPayment cashierPayment = paymentDataList.get(i);
            if (com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType())) {
                List<MTPayment> recommendPayment = cashierPayment.getRecommendPayment();
                if (i.a((Collection) recommendPayment)) {
                    continue;
                } else {
                    for (MTPayment mTPayment : recommendPayment) {
                        if (com.meituan.android.pay.common.payment.utils.c.e(mTPayment.getPayType())) {
                            return mTPayment.getRealNameAuthType();
                        }
                    }
                    continue;
                }
            }
        }
        return -1;
    }

    public static String c(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "471d988765d5b38c0fe70708ace7fff6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "471d988765d5b38c0fe70708ace7fff6");
        }
        StringBuilder sb = new StringBuilder();
        List<CashierPayment> paymentDataList = cashier.getPaymentDataList();
        if (!i.a((Collection) paymentDataList)) {
            for (int i = 0; i < paymentDataList.size(); i++) {
                CashierPayment cashierPayment = paymentDataList.get(i);
                sb.append(cashierPayment.getPayType());
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                if (com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType())) {
                    List<MTPayment> recommendPayment = cashierPayment.getRecommendPayment();
                    if (!i.a((Collection) recommendPayment)) {
                        for (MTPayment mTPayment : recommendPayment) {
                            sb.append(mTPayment.getPayType());
                            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public static Map<String, Object> a(com.meituan.android.pay.common.payment.data.d dVar) {
        ReduceInfo noBalanceReduceInfo;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e854b2d1b8e60f23076b1cec52aacc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e854b2d1b8e60f23076b1cec52aacc5");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
        hashMap.put("platform", "android");
        hashMap.put("pay_type", dVar.getPayType());
        hashMap.put("is_select", Boolean.valueOf(dVar.isSelected()));
        if (dVar.getPaymentReduce() != null && (noBalanceReduceInfo = dVar.getPaymentReduce().getNoBalanceReduceInfo()) != null) {
            hashMap.put("activity_id", noBalanceReduceInfo.getCampaignId());
        }
        ArrayList arrayList = new ArrayList();
        List<CombineLabel> rightLabels = dVar.getRightLabels();
        if (!b.a(rightLabels)) {
            for (CombineLabel combineLabel : rightLabels) {
                arrayList.add(combineLabel.getContent());
            }
        }
        List<CombineLabel> bottomLabels = dVar.getBottomLabels();
        if (!b.a(bottomLabels)) {
            for (CombineLabel combineLabel2 : bottomLabels) {
                arrayList.add(combineLabel2.getContent());
            }
        }
        if (!b.a(arrayList)) {
            hashMap.put("activity_tip", arrayList);
        }
        if (dVar instanceof CashierPayment) {
            hashMap.put("is_folded", Boolean.valueOf(((CashierPayment) dVar).isFolded()));
        }
        return hashMap;
    }

    public static void a(Context context, Cashier cashier) {
        Object[] objArr = {context, cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40e4ba16c61aa0ab3cedb15fa96f0c75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40e4ba16c61aa0ab3cedb15fa96f0c75");
        } else if (cashier != null && context != null) {
            List<CashierPayment> paymentDataList = cashier.getPaymentDataList();
            if (b.a(paymentDataList)) {
                return;
            }
            CashierPayment cashierPayment = null;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < paymentDataList.size(); i3++) {
                if (paymentDataList.get(i3) != null) {
                    if (com.meituan.android.pay.common.payment.utils.c.b(paymentDataList.get(i3).getPayType())) {
                        List<MTPayment> recommendPayment = paymentDataList.get(i3).getRecommendPayment();
                        if (!b.a(recommendPayment)) {
                            for (MTPayment mTPayment : recommendPayment) {
                                if (mTPayment.isSelected()) {
                                    i++;
                                }
                            }
                        }
                    } else if (paymentDataList.get(i3).isSelected()) {
                        i++;
                    }
                    if (!com.meituan.android.pay.common.payment.utils.d.a(paymentDataList.get(i3).getStatus())) {
                        i2++;
                    }
                    if (com.meituan.android.pay.common.payment.utils.c.b(paymentDataList.get(i3).getPayType())) {
                        cashierPayment = paymentDataList.get(i3);
                    }
                }
            }
            if (i == 0) {
                com.meituan.android.paybase.common.analyse.cat.a.a("noSelectedPayType", context.getString(R.string.cashier__no_selected_pay_type));
                com.meituan.android.paybase.common.analyse.a.a("b_zsalpxsl", (Map<String, Object>) null);
            } else if (i > 2) {
                com.meituan.android.paybase.common.analyse.cat.a.a("multiSelectedPayTypes", context.getString(R.string.cashier__multi_selected_pay_types));
                com.meituan.android.paybase.common.analyse.a.a("b_pay_8c8s2vxw_mv", (Map<String, Object>) null);
            }
            if (i2 == 0) {
                com.meituan.android.paybase.common.analyse.cat.a.a("allPayTypesInvalid", context.getString(R.string.cashier__all_pay_types_invalid));
            }
            if (cashierPayment != null) {
                Object[] objArr2 = {cashierPayment};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e7a5f047630c6911acf88e43f81fbdd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e7a5f047630c6911acf88e43f81fbdd4");
                } else if (cashierPayment != null) {
                    int status = cashierPayment.getStatus();
                    if (status == 1) {
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_mt_pay_status", 1140052);
                    } else if (status == 2) {
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_mt_pay_status", 1140054);
                    } else if (status == 4) {
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_mt_pay_status", 1140053);
                    } else {
                        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_mt_pay_status", 1140051);
                    }
                }
            }
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75ca643a8c99dc51cba5cfcc87971101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75ca643a8c99dc51cba5cfcc87971101");
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("refresh_scene", str);
        q.a("b_pay_4gjqy71v_sc", hashMap, str2);
    }

    public static int a(WalletPayment walletPayment) {
        Object[] objArr = {walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "220168c25d65c428d73041030ff58cb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "220168c25d65c428d73041030ff58cb5")).intValue();
        }
        if (walletPayment == null || walletPayment.getWalletPaymentListPage() == null || b.a(walletPayment.getWalletPaymentListPage().getMtPaymentList())) {
            return 0;
        }
        for (com.meituan.android.pay.common.payment.data.a aVar : walletPayment.getWalletPaymentListPage().getMtPaymentList()) {
            if (com.meituan.android.pay.common.payment.utils.c.a(aVar.getPayType())) {
                return aVar.getStatus();
            }
        }
        return 0;
    }

    public static int d(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0a0b06f531f0528d2a28a17d4461890", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0a0b06f531f0528d2a28a17d4461890")).intValue();
        }
        if (cashier == null || b.a(cashier.getPaymentDataList())) {
            return 0;
        }
        for (CashierPayment cashierPayment : cashier.getPaymentDataList()) {
            if (TextUtils.equals("alipaysimple", cashierPayment.getPayType())) {
                if (cashierPayment.getStatus() == 0) {
                    return cashierPayment.isFolded() ? 0 : 1;
                }
                return 2;
            }
        }
        return 3;
    }

    public static com.meituan.android.pay.common.payment.data.a b(WalletPayment walletPayment) {
        Object[] objArr = {walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5238a19201fab0ee90a404dfeab1adf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5238a19201fab0ee90a404dfeab1adf");
        }
        if (walletPayment == null || walletPayment.getWalletPaymentListPage() == null || b.a(walletPayment.getWalletPaymentListPage().getMtPaymentList())) {
            return null;
        }
        for (com.meituan.android.pay.common.payment.data.a aVar : walletPayment.getWalletPaymentListPage().getMtPaymentList()) {
            if (com.meituan.android.pay.common.payment.utils.c.g(aVar.getPayType())) {
                return aVar;
            }
        }
        return null;
    }

    public static com.meituan.android.pay.common.payment.data.d c(WalletPayment walletPayment) {
        Object[] objArr = {walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6843dca5e2af073f37ee49c291e1b2d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6843dca5e2af073f37ee49c291e1b2d2");
        }
        if (walletPayment == null || b.a(walletPayment.getRecommendPayment())) {
            return null;
        }
        for (MTPayment mTPayment : walletPayment.getRecommendPayment()) {
            if (com.meituan.android.pay.common.payment.utils.c.g(mTPayment.getPayType())) {
                return mTPayment;
            }
        }
        return null;
    }

    public static boolean a(CashierPopWindowBean cashierPopWindowBean) {
        Object[] objArr = {cashierPopWindowBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8a3dde5b6516f5c3ff46f4a02f58fa0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8a3dde5b6516f5c3ff46f4a02f58fa0")).booleanValue();
        }
        if (cashierPopWindowBean != null) {
            return cashierPopWindowBean.getType() == 5 || cashierPopWindowBean.getType() == 6;
        }
        return false;
    }
}
