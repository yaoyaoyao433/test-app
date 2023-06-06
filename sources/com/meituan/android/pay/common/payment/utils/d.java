package com.meituan.android.pay.common.payment.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.pay.common.payment.data.g;
import com.meituan.android.pay.common.selectdialog.bean.MtPaymentListPage;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static boolean a(int i) {
        return i == 1 || i == 4;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        USEABLE,
        NULL,
        ALL_OVER_AMOUNT,
        ALL_INVALID;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a799b528737d687562a51daa8a1a4776", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a799b528737d687562a51daa8a1a4776");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f76c0690a329e10db165114bfd3daeef", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f76c0690a329e10db165114bfd3daeef") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f550b512f8e9a2d0b84a87892a072dc", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f550b512f8e9a2d0b84a87892a072dc") : (a[]) values().clone();
        }
    }

    public static boolean a(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "806d721d2b8aae414325703b04d322a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "806d721d2b8aae414325703b04d322a4")).booleanValue() : aVar.getStatus() == 4 || aVar.getStatus() == 1;
    }

    public static boolean a(com.meituan.android.pay.common.selectdialog.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb1bbd68621d2237b3118c0eec92d3fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb1bbd68621d2237b3118c0eec92d3fc")).booleanValue();
        }
        List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
        if (!i.a((Collection) mtPaymentList)) {
            for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                if (aVar != null && (TextUtils.equals(aVar.getPayType(), "quickbank") || TextUtils.equals(aVar.getPayType(), "foreigncardpay"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int a(com.meituan.android.pay.common.payment.data.a aVar, com.meituan.android.pay.common.selectdialog.b bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60ca7c9913672a98363e73f5dc811e83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60ca7c9913672a98363e73f5dc811e83")).intValue();
        }
        List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
        if (i.a((Collection) mtPaymentList) || aVar == null) {
            return -1;
        }
        return mtPaymentList.indexOf(aVar);
    }

    @Nullable
    public static com.meituan.android.pay.common.payment.data.a b(com.meituan.android.pay.common.selectdialog.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12923bc32268f3e4413d163e2bfb4cfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12923bc32268f3e4413d163e2bfb4cfe");
        }
        List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
        if (!i.a((Collection) mtPaymentList)) {
            if (c(bVar)) {
                for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                    if (!g.a.contains(aVar.getPayType())) {
                        return aVar;
                    }
                }
            } else {
                for (com.meituan.android.pay.common.payment.data.a aVar2 : mtPaymentList) {
                    if (!a(aVar2.getStatus())) {
                        return aVar2;
                    }
                }
            }
        }
        return null;
    }

    public static boolean c(com.meituan.android.pay.common.selectdialog.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8c65df981c36b3cf3725975e7339477", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8c65df981c36b3cf3725975e7339477")).booleanValue();
        }
        List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
        if (!i.a((Collection) mtPaymentList)) {
            for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                if (!g.a.contains(aVar.getPayType()) && !a(aVar.getStatus())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static com.meituan.android.pay.common.payment.data.a d(com.meituan.android.pay.common.selectdialog.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb98c28ecfa1ca7dd43c3b2d43ef3b8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb98c28ecfa1ca7dd43c3b2d43ef3b8d");
        }
        List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
        if (i.a((Collection) mtPaymentList)) {
            return null;
        }
        return mtPaymentList.get(0);
    }

    public static com.meituan.android.pay.common.payment.data.a e(com.meituan.android.pay.common.selectdialog.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db0ceb1d646c59d7601647582f2a849f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db0ceb1d646c59d7601647582f2a849f");
        }
        List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
        if (i.a((Collection) mtPaymentList)) {
            return null;
        }
        for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
            if (aVar != null && TextUtils.equals("cardpay", aVar.getPayType())) {
                return aVar;
            }
        }
        return null;
    }

    public static boolean f(com.meituan.android.pay.common.selectdialog.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78c4816f7ddbe0378dc0071fe16b3ae2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78c4816f7ddbe0378dc0071fe16b3ae2")).booleanValue();
        }
        List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
        if (!i.a((Collection) mtPaymentList)) {
            for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                if (!a(aVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Payment a(MTPayment mTPayment) {
        Payment payment;
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be8b1d61915ac0cb98ad51705f644d14", RobustBitConfig.DEFAULT_VALUE)) {
            return (Payment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be8b1d61915ac0cb98ad51705f644d14");
        }
        MtPaymentListPage mtPaymentListPage = mTPayment.getMtPaymentListPage();
        if (mtPaymentListPage != null) {
            Object[] objArr2 = {mTPayment};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8b2d08573ce2d310b0ee68ba2f39e1bc", RobustBitConfig.DEFAULT_VALUE)) {
                payment = (Payment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8b2d08573ce2d310b0ee68ba2f39e1bc");
            } else {
                MtPaymentListPage mtPaymentListPage2 = mTPayment.getMtPaymentListPage();
                if (mtPaymentListPage2 != null && !i.a((Collection) mtPaymentListPage2.getMtPaymentList())) {
                    for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentListPage2.getMtPaymentList()) {
                        if (aVar.isSelected()) {
                            payment = (Payment) aVar;
                            break;
                        }
                    }
                }
                payment = null;
            }
            if (payment == null || a(payment)) {
                Payment payment2 = (Payment) b(mtPaymentListPage);
                if (payment2 == null || a(payment2)) {
                    Object[] objArr3 = {mTPayment};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3a83eefee330ee4c43677c6b416849fc", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Payment) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3a83eefee330ee4c43677c6b416849fc");
                    }
                    MtPaymentListPage mtPaymentListPage3 = mTPayment.getMtPaymentListPage();
                    if (mtPaymentListPage3 == null || i.a((Collection) mtPaymentListPage3.getMtPaymentList())) {
                        return null;
                    }
                    for (com.meituan.android.pay.common.payment.data.a aVar2 : mtPaymentListPage3.getMtPaymentList()) {
                        if (TextUtils.equals(aVar2.getPayType(), "cardpay")) {
                            return (Payment) aVar2;
                        }
                    }
                    return null;
                }
                return payment2;
            }
            return payment;
        }
        return null;
    }

    public static boolean a(com.meituan.android.pay.common.payment.data.d dVar) {
        Period a2;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f769eaaa8371d5b811a453470b71392f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f769eaaa8371d5b811a453470b71392f")).booleanValue();
        }
        if (dVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) dVar;
            if ((c.e(mTPayment.getPayType()) || e.a((com.meituan.android.pay.common.payment.data.d) mTPayment)) && (a2 = e.a(mTPayment)) != null && a2.getPeriod() > 0) {
                return false;
            }
            return mTPayment.isSupportBalanceCombine();
        }
        return false;
    }

    public static boolean b(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5580cf6babf470d3f643577e99682e9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5580cf6babf470d3f643577e99682e9")).booleanValue() : (dVar instanceof MTPayment) && c.c(dVar.getPayType()) && a((MTPayment) dVar) != null;
    }
}
