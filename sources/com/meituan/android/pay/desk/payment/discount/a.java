package com.meituan.android.pay.desk.payment.discount;

import android.text.TextUtils;
import com.meituan.android.pay.common.payment.bean.DeductSwitchDiscount;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.pay.common.promotion.utils.b;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(int i) {
        return i == 1 || i == 2;
    }

    private static boolean b(int i) {
        return i == 0 || i == 2;
    }

    public static Material a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ded3ce712cd291960f8bc65e949b08d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Material) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ded3ce712cd291960f8bc65e949b08d");
        }
        if (dVar instanceof MTPayment) {
            return ((MTPayment) dVar).getMaterial();
        }
        return null;
    }

    public static Object[] a(WalletPayment walletPayment, List<FinanceServiceBean> list) {
        Object[] objArr = {walletPayment, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        FinanceServiceBean financeServiceBean = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89436aad0f599b7be97c5f05069e541f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89436aad0f599b7be97c5f05069e541f");
        }
        float f = 0.0f;
        List<MTPayment> recommendPayment = walletPayment.getRecommendPayment();
        Object[] objArr2 = new Object[2];
        if (!i.a((Collection) list)) {
            for (FinanceServiceBean financeServiceBean2 : list) {
                if (financeServiceBean2 != null && !financeServiceBean2.isFolded() && b(financeServiceBean2.getStatus())) {
                    List<CombineLabel> bottomLabels = financeServiceBean2.getBottomLabels();
                    if (!i.a((Collection) bottomLabels)) {
                        for (CombineLabel combineLabel : bottomLabels) {
                            if (combineLabel != null && !i.a((Collection) combineLabel.getChildrenLabel()) && combineLabel.getDiscount() > f) {
                                f = combineLabel.getDiscount();
                                financeServiceBean = financeServiceBean2;
                            }
                        }
                    }
                }
            }
        }
        if (!i.a((Collection) recommendPayment)) {
            for (MTPayment mTPayment : recommendPayment) {
                if (mTPayment != null && b(mTPayment.getStatus())) {
                    List<CombineLabel> bottomLabels2 = mTPayment.getBottomLabels();
                    if (!i.a((Collection) bottomLabels2)) {
                        for (CombineLabel combineLabel2 : bottomLabels2) {
                            if (combineLabel2 != null && !i.a((Collection) combineLabel2.getChildrenLabel()) && combineLabel2.getDiscount() > f) {
                                f = combineLabel2.getDiscount();
                                financeServiceBean = mTPayment;
                            }
                        }
                    }
                }
            }
        }
        objArr2[0] = financeServiceBean;
        objArr2[1] = Float.valueOf(f);
        return objArr2;
    }

    public static Object[] b(WalletPayment walletPayment, List<FinanceServiceBean> list) {
        Object[] objArr = {walletPayment, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d064ae833d2bcacd8f57497804217c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Object[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d064ae833d2bcacd8f57497804217c7");
        }
        Object[] objArr2 = new Object[2];
        if (!i.a((Collection) list)) {
            for (FinanceServiceBean financeServiceBean : list) {
                if (financeServiceBean != null && !financeServiceBean.isFolded() && b(financeServiceBean.getStatus())) {
                    ArrayList<FloatingLayer> floatingLayers = financeServiceBean.getFloatingLayers();
                    if (i.a((Collection) floatingLayers)) {
                        continue;
                    } else {
                        for (FloatingLayer floatingLayer : floatingLayers) {
                            if (floatingLayer.isGuideType()) {
                                objArr2[0] = financeServiceBean;
                                objArr2[1] = floatingLayer;
                                return objArr2;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        List<MTPayment> recommendPayment = walletPayment.getRecommendPayment();
        if (!i.a((Collection) recommendPayment)) {
            for (MTPayment mTPayment : recommendPayment) {
                if (mTPayment != null && b(mTPayment.getStatus())) {
                    ArrayList<FloatingLayer> floatingLayers2 = mTPayment.getFloatingLayers();
                    if (i.a((Collection) floatingLayers2)) {
                        continue;
                    } else {
                        for (FloatingLayer floatingLayer2 : floatingLayers2) {
                            if (floatingLayer2.isGuideType()) {
                                objArr2[0] = mTPayment;
                                objArr2[1] = floatingLayer2;
                                return objArr2;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return objArr2;
    }

    public static FloatingLayer b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "791f6ea454bc177f67bf66eac075afc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (FloatingLayer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "791f6ea454bc177f67bf66eac075afc6");
        }
        if (dVar instanceof MTPayment) {
            return a(((MTPayment) dVar).getFloatingLayers());
        }
        return null;
    }

    public static FloatingLayer a(List<FloatingLayer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40a1735d16566b66054c306b3da29019", RobustBitConfig.DEFAULT_VALUE)) {
            return (FloatingLayer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40a1735d16566b66054c306b3da29019");
        }
        if (!i.a((Collection) list)) {
            for (FloatingLayer floatingLayer : list) {
                if (floatingLayer.isDiscountType()) {
                    return floatingLayer;
                }
            }
        }
        return null;
    }

    public static boolean a(WalletPayment walletPayment) {
        WalletPaymentListPage walletPaymentListPage;
        Object[] objArr = {walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "526cbd012dfbb21995c6ea8ef3fcfda4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "526cbd012dfbb21995c6ea8ef3fcfda4")).booleanValue();
        }
        if (walletPayment == null || (walletPaymentListPage = walletPayment.getWalletPaymentListPage()) == null || walletPaymentListPage.getLabelAbTest() == null) {
            return false;
        }
        return walletPaymentListPage.getLabelAbTest().isSaveMoneyStyle();
    }

    public static BigDecimal a(WalletPayment walletPayment, d dVar) {
        Object[] objArr = {walletPayment, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2e18ec67b8a9d126132fdceebbf4ae2", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2e18ec67b8a9d126132fdceebbf4ae2");
        }
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        if (dVar instanceof MTPayment) {
            return walletPayment != null ? e(dVar) : valueOf;
        }
        return d(dVar);
    }

    public static BigDecimal a(WalletPayment walletPayment, d dVar, boolean z) {
        Object[] objArr = {walletPayment, dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68409d59be4021df077d5ec130a1bf72", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68409d59be4021df077d5ec130a1bf72");
        }
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        if (dVar instanceof MTPayment) {
            return walletPayment != null ? a(dVar, z) : valueOf;
        }
        return d(dVar);
    }

    private static BigDecimal d(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "647f0c912a5e4935bb213eb1d72756c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "647f0c912a5e4935bb213eb1d72756c9");
        }
        BigDecimal a2 = com.meituan.android.paybase.utils.d.a("0.00");
        return dVar != null ? com.meituan.android.paybase.utils.d.a(a2, Float.valueOf(b.a(dVar.getPaymentReduce()))) : a2;
    }

    private static BigDecimal e(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f1b50ceebc48c509f889c66062d006b", RobustBitConfig.DEFAULT_VALUE) ? (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f1b50ceebc48c509f889c66062d006b") : com.meituan.android.pay.common.promotion.utils.a.d(c(dVar));
    }

    private static BigDecimal a(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a20bc8ca4e43c3980a5d81636eb99df2", RobustBitConfig.DEFAULT_VALUE) ? (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a20bc8ca4e43c3980a5d81636eb99df2") : com.meituan.android.pay.common.promotion.utils.a.a(c(dVar), z);
    }

    public static List<CombineLabel> c(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21fd5058d0d9adf19fd32226a8d98adc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21fd5058d0d9adf19fd32226a8d98adc");
        }
        List<CombineLabel> bottomLabels = dVar.getBottomLabels();
        return (i.a((Collection) bottomLabels) && (dVar instanceof com.meituan.android.pay.common.payment.data.a)) ? ((com.meituan.android.pay.common.payment.data.a) dVar).getLabels() : bottomLabels;
    }

    private static BigDecimal b(float f, WalletPayment walletPayment, d dVar) {
        Object[] objArr = {Float.valueOf(f), walletPayment, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f7636edfd0c27b7c3f90b1ae940a197", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f7636edfd0c27b7c3f90b1ae940a197");
        }
        BigDecimal a2 = com.meituan.android.paybase.utils.d.a((Number) 0);
        return (walletPayment.getBalanceCombineDeduct() != null && com.meituan.android.pay.common.payment.utils.d.a(dVar) && walletPayment.getBalanceCombineDeduct().isSwitchOn()) ? a(f, walletPayment.getBalanceCombineDeduct().getBalance(), a(walletPayment, dVar)) : a2;
    }

    public static BigDecimal a(float f, float f2, BigDecimal bigDecimal) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), bigDecimal};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80dd7531e7725d4d1e5b025e0f9ea614", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80dd7531e7725d4d1e5b025e0f9ea614");
        }
        BigDecimal a2 = com.meituan.android.paybase.utils.d.a((Number) 0);
        if (com.meituan.android.paybase.utils.d.c(Float.valueOf(f), bigDecimal) > 0) {
            if (com.meituan.android.paybase.utils.d.c(Float.valueOf(f), com.meituan.android.paybase.utils.d.a(bigDecimal, Float.valueOf(f2))) > 0) {
                return com.meituan.android.paybase.utils.d.a(Float.valueOf(f2));
            }
            if (com.meituan.android.paybase.utils.d.c((Number) bigDecimal, (Number) 0) > 0) {
                return com.meituan.android.paybase.utils.d.b(com.meituan.android.paybase.utils.d.b(Float.valueOf(f), bigDecimal), Double.valueOf(0.01d));
            }
            return com.meituan.android.paybase.utils.d.a(Float.valueOf(f));
        }
        return a2;
    }

    public static DeductSwitchDiscount a(float f, WalletPayment walletPayment, d dVar) {
        Object[] objArr = {Float.valueOf(f), walletPayment, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87106b1c406116a2ffc818915a0215c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DeductSwitchDiscount) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87106b1c406116a2ffc818915a0215c4");
        }
        if (com.meituan.android.pay.common.payment.utils.d.a(dVar)) {
            DeductSwitchDiscount deductSwitchDiscount = new DeductSwitchDiscount();
            deductSwitchDiscount.setReduce(b(f, walletPayment, dVar).floatValue());
            return deductSwitchDiscount;
        }
        return null;
    }

    public static boolean a(PayLabel payLabel, String str) {
        Object[] objArr = {payLabel, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ac60522fc29dba312cdf500b323191a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ac60522fc29dba312cdf500b323191a")).booleanValue() : !TextUtils.equals(payLabel.getLabelType(), "total") && TextUtils.equals(payLabel.getItemType(), str) && payLabel.getLabelSwitch() != null && a(payLabel.getLabelSwitch().getCheck());
    }

    public static String a(ArrayList<PayLabel> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6b1ae7160b0c4f2471cf0d51bbf3a77", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6b1ae7160b0c4f2471cf0d51bbf3a77");
        }
        if (i.a((Collection) arrayList)) {
            return "0.00";
        }
        BigDecimal bigDecimal = new BigDecimal("0.00");
        Iterator<PayLabel> it = arrayList.iterator();
        while (it.hasNext()) {
            PayLabel next = it.next();
            if (a(next, PayLabel.ITEM_TYPE_DISCOUNT)) {
                bigDecimal = com.meituan.android.paybase.utils.d.a(bigDecimal, Float.valueOf(next.getDiscount()));
            }
        }
        return ag.a(bigDecimal.doubleValue());
    }

    public static BigDecimal a(float f, PaymentReduce paymentReduce) {
        Object[] objArr = {Float.valueOf(f), paymentReduce};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3964b85b42b39c48b95b75e85d90fd5", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3964b85b42b39c48b95b75e85d90fd5");
        }
        BigDecimal b = com.meituan.android.paybase.utils.d.b(BigDecimal.valueOf(f), a(paymentReduce));
        return com.meituan.android.paybase.utils.d.c((Number) b, (Number) 0) <= 0 ? BigDecimal.valueOf(0.0d) : b;
    }

    private static BigDecimal a(PaymentReduce paymentReduce) {
        Object[] objArr = {paymentReduce};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d76683b0f9eb3847ff4c186d14872be7", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d76683b0f9eb3847ff4c186d14872be7");
        }
        if (paymentReduce != null) {
            return com.meituan.android.paybase.utils.d.a(Float.valueOf(b.a(paymentReduce)));
        }
        return com.meituan.android.paybase.utils.d.a("0.00");
    }
}
