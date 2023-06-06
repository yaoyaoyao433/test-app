package com.meituan.android.pay.desk.component.data;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.payment.data.c;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.desk.component.bean.precomponent.AdjustCreditGuide;
import com.meituan.android.pay.desk.component.bean.precomponent.PayGuide;
import com.meituan.android.pay.desk.component.bean.standardcomponent.BalanceCombinePayment;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CombineDetailItem;
import com.meituan.android.pay.desk.component.bean.standardcomponent.HelloPayTransInfo;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.fingerprint.bean.FingerprintPayResponse;
import com.meituan.android.paybase.fingerprint.bean.PasswordVerify;
import com.meituan.android.paybase.utils.d;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.DetainmentDialogInfo;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static boolean b;

    public static AdjustCreditGuide a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "886f4849f0d12bd6cd8da3b8fda779cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdjustCreditGuide) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "886f4849f0d12bd6cd8da3b8fda779cc");
        }
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            if (cashDesk.getPayGuide() != null) {
                return cashDesk.getPayGuide().getAdjustCreditGuide();
            }
            return null;
        }
        return null;
    }

    public static CommonGuide b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c18fd4fb5536d2e7f81364a06099bd5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonGuide) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c18fd4fb5536d2e7f81364a06099bd5a");
        }
        PayGuide payGuide = cVar instanceof CashDesk ? ((CashDesk) cVar).getPayGuide() : null;
        if (payGuide == null) {
            return null;
        }
        if (payGuide.getNoPasswordGuide() != null) {
            return payGuide.getNoPasswordGuide();
        }
        if (payGuide.getWithholdGuide() != null) {
            return payGuide.getWithholdGuide();
        }
        if (payGuide.getFingerprintPayGuide() != null) {
            return payGuide.getFingerprintPayGuide();
        }
        return null;
    }

    public static List<BalanceCombinePayment> c(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e86f07f32e782b2b1c728157b1e4a70", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e86f07f32e782b2b1c728157b1e4a70");
        }
        if (cVar instanceof CashDesk) {
            return ((CashDesk) cVar).getBalanceCombineDetailList();
        }
        return null;
    }

    public static List<CombineDetailItem> d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "481bd0145d5e1400e6154c7c15669345", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "481bd0145d5e1400e6154c7c15669345");
        }
        if (cVar instanceof CashDesk) {
            return ((CashDesk) cVar).getCombineDetailList();
        }
        return null;
    }

    public static HelloPayTransInfo e(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93c9f0cf4e97d01405e03a99afd20600", RobustBitConfig.DEFAULT_VALUE)) {
            return (HelloPayTransInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93c9f0cf4e97d01405e03a99afd20600");
        }
        if (cVar instanceof CashDesk) {
            return ((CashDesk) cVar).getTransInfo();
        }
        return null;
    }

    public static com.meituan.android.pay.common.selectdialog.b f(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f91ee945cd87b6c683a5a0f91bdcb8d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.selectdialog.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f91ee945cd87b6c683a5a0f91bdcb8d5");
        }
        if (cVar instanceof CashDesk) {
            return ((CashDesk) cVar).getMtPaymentListPage();
        }
        return null;
    }

    public static Price a(DeskData deskData) {
        float f;
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3eb60289e5fb4e4b9690899b684e208a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Price) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3eb60289e5fb4e4b9690899b684e208a");
        }
        if (deskData == null) {
            return null;
        }
        c desk = deskData.getDesk();
        com.meituan.android.pay.common.payment.data.a selectPayment = deskData.getSelectPayment();
        if (desk instanceof CashDesk) {
            Price price = new Price();
            CashDesk cashDesk = (CashDesk) desk;
            float price2 = cashDesk.getPrice();
            price.setOrderPrice(price2);
            boolean b2 = b(deskData);
            Object[] objArr2 = {cashDesk, Float.valueOf(price2), selectPayment, Byte.valueOf(b2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.component.discount.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b40175b0e45b25322399f9473d905e20", RobustBitConfig.DEFAULT_VALUE)) {
                f = ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b40175b0e45b25322399f9473d905e20")).floatValue();
            } else {
                if (cashDesk != null) {
                    price2 = d.b(Float.valueOf(price2), com.meituan.android.pay.desk.component.discount.a.a(cashDesk, selectPayment, b2)).floatValue();
                }
                f = d.c(Float.valueOf(price2), Double.valueOf(0.01d)) < 0 ? 0.01f : price2;
            }
            price.setRealPrice(f);
            return price;
        }
        return null;
    }

    public static boolean b(DeskData deskData) {
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "279d80790e43a9132d389237965ce452", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "279d80790e43a9132d389237965ce452")).booleanValue();
        }
        if (deskData == null) {
            return false;
        }
        c desk = deskData.getDesk();
        if (desk instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) desk;
            return cashDesk.getLabelAbTest() != null && cashDesk.getLabelAbTest().isShiftMultiCoupon();
        }
        return false;
    }

    public static String a(Context context, DeskData deskData) {
        Object[] objArr = {context, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bc52d5b551b439aa211a0c9b2193746", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bc52d5b551b439aa211a0c9b2193746");
        }
        if (context == null || deskData == null) {
            return "";
        }
        c desk = deskData.getDesk();
        return deskData.isFailTooManyTimesToGoToPSW() ? context.getString(R.string.paycommon__fingerprint_pay_please_use_psw) : desk instanceof CashDesk ? ((CashDesk) desk).getPageTip() : "";
    }

    public static void g(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c56e0c12d122a89596357b50145bea65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c56e0c12d122a89596357b50145bea65");
        } else if (cVar instanceof CashDesk) {
            ((CashDesk) cVar).setPageTip("");
        }
    }

    public static PasswordVerify h(c cVar) {
        FingerprintPayResponse fingerprintPayResponse;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7fee9c7557dded8f4a2f145a8c64d4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PasswordVerify) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7fee9c7557dded8f4a2f145a8c64d4b");
        }
        if (!(cVar instanceof CashDesk) || (fingerprintPayResponse = ((CashDesk) cVar).getFingerprintPayResponse()) == null || fingerprintPayResponse.getPasswordVerify() == null) {
            return null;
        }
        return fingerprintPayResponse.getPasswordVerify();
    }

    public static boolean a(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a42f7fd0c0516b95eb527b62bc4d2b3a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a42f7fd0c0516b95eb527b62bc4d2b3a")).booleanValue() : aVar != null && aVar.getStatus() == 4;
    }

    public static int i(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4401996ca25d6f08bac074721084225", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4401996ca25d6f08bac074721084225")).intValue();
        }
        if (cVar instanceof CashDesk) {
            return ((CashDesk) cVar).getVerifyType();
        }
        return -1;
    }

    public static String c(DeskData deskData) {
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b8c93268c998ac4857ad89fc7ae9ffb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b8c93268c998ac4857ad89fc7ae9ffb");
        }
        com.meituan.android.pay.common.payment.data.a selectPayment = deskData.getSelectPayment();
        c desk = deskData.getDesk();
        if (selectPayment != null && !TextUtils.isEmpty(selectPayment.getSubmitUrl())) {
            return selectPayment.getSubmitUrl();
        }
        if (desk instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) desk;
            if (TextUtils.isEmpty(cashDesk.getSubmitUrl())) {
                return null;
            }
            return cashDesk.getSubmitUrl();
        }
        return null;
    }

    public static String j(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b412558f5a99893f14aeda6c26e376c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b412558f5a99893f14aeda6c26e376c");
        }
        PasswordVerify h = h(cVar);
        if (h != null) {
            return h.getPageTitle();
        }
        return cVar instanceof CashDesk ? ((CashDesk) cVar).getPageTitle() : "";
    }

    public static String k(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e302befc198b2e2a095235dd14bd9de1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e302befc198b2e2a095235dd14bd9de1");
        }
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            if (cashDesk.getMtPaymentListPage() != null && com.meituan.android.pay.common.payment.utils.d.c(cashDesk.getMtPaymentListPage())) {
                com.meituan.android.pay.common.payment.data.a useNewCard = cashDesk.getUseNewCard();
                if (!TextUtils.isEmpty(useNewCard.getName())) {
                    return useNewCard.getName();
                }
            }
            return !TextUtils.isEmpty(cashDesk.getPayButtonText()) ? cashDesk.getPayButtonText() : "确认交易";
        }
        return "确认交易";
    }

    public static DetainmentDialogInfo a(Activity activity, c cVar, DetainmentDialogInfo detainmentDialogInfo) {
        com.meituan.android.pay.common.payment.data.a d;
        Object[] objArr = {activity, cVar, detainmentDialogInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0587cb66e2c57a0972fe98f21122434", RobustBitConfig.DEFAULT_VALUE)) {
            return (DetainmentDialogInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0587cb66e2c57a0972fe98f21122434");
        }
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "pay_type");
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            if (cashDesk.getTransInfo() != null && cashDesk.getTransInfo().getLabels() != null && (!TextUtils.isEmpty(cashDesk.getTransInfo().getDisplayName()) || TextUtils.equals(b2, "valuecard") || TextUtils.equals(b2, "creditpay") || TextUtils.equals(b2, "privilegepay"))) {
                detainmentDialogInfo.setMarketingPayment(cashDesk.getTransInfo().getLabels().size() > 0);
            } else if (cashDesk.getMtPaymentListPage() != null && (d = com.meituan.android.pay.common.payment.utils.d.d(cashDesk.getMtPaymentListPage())) != null && !i.a((Collection) d.getLabels())) {
                detainmentDialogInfo.setMarketingPayment(d.getLabels().size() > 0);
            }
            detainmentDialogInfo.setDialogMessage(cashDesk.getCancelAlertContext());
        }
        return detainmentDialogInfo;
    }

    public static float a(DeskData deskData, boolean z) {
        BigDecimal a2;
        Object[] objArr = {deskData, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e84c4d8c3bb026101f97fb25be5714fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e84c4d8c3bb026101f97fb25be5714fc")).floatValue();
        }
        if (deskData == null) {
            return 0.0f;
        }
        c desk = deskData.getDesk();
        com.meituan.android.pay.common.payment.data.a selectPayment = deskData.getSelectPayment();
        Object[] objArr2 = {desk, selectPayment, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.component.discount.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e13660b8e9ccd4e5afe7de020a47aad0", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (BigDecimal) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e13660b8e9ccd4e5afe7de020a47aad0");
        } else {
            a2 = desk != null ? com.meituan.android.pay.desk.component.discount.a.a(desk, selectPayment, z) : d.a("0.00");
        }
        return a2.floatValue();
    }

    public static int d(DeskData deskData) {
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        List<CombineLabel> list = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d529509fff7d1b38a1c71a339f74d7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d529509fff7d1b38a1c71a339f74d7d")).intValue();
        }
        if (deskData == null) {
            return 0;
        }
        c desk = deskData.getDesk();
        com.meituan.android.pay.common.payment.data.a selectPayment = deskData.getSelectPayment();
        Object[] objArr2 = {desk, selectPayment};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.component.discount.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fd06da417e776702740e4333b141735a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fd06da417e776702740e4333b141735a")).intValue();
        }
        if (selectPayment != null) {
            list = selectPayment.getLabels();
        } else if (desk instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) desk;
            if (cashDesk.getTransInfo() != null) {
                list = cashDesk.getTransInfo().getLabels();
            }
        }
        return com.meituan.android.pay.common.promotion.utils.a.f(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(com.meituan.android.pay.desk.component.data.DeskData r18) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.desk.component.data.a.e(com.meituan.android.pay.desk.component.data.DeskData):boolean");
    }

    public static Material a(c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        HelloPayTransInfo transInfo;
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        Material material = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3341e8757c8d3bbfc7ec210ea9dc638", RobustBitConfig.DEFAULT_VALUE)) {
            return (Material) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3341e8757c8d3bbfc7ec210ea9dc638");
        }
        if ((cVar instanceof CashDesk) && (transInfo = ((CashDesk) cVar).getTransInfo()) != null) {
            material = transInfo.getMaterial();
        }
        if (aVar instanceof Payment) {
            material = ((Payment) aVar).getMaterial();
        }
        if (aVar instanceof MTPayment) {
            material = ((MTPayment) aVar).getMaterial();
        }
        return aVar instanceof BalanceCombinePayment ? ((BalanceCombinePayment) aVar).getMaterial() : material;
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31b6ad3837984d24f564e47c478e6f7b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31b6ad3837984d24f564e47c478e6f7b")).booleanValue() : b || (activity != null && TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(activity, "scene_incoming_native_business"), RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER));
    }

    public static boolean b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cc8b8f2a87cc3b44f042b0a3bed9ee1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cc8b8f2a87cc3b44f042b0a3bed9ee1")).booleanValue() : TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(activity, "scene_incoming_native_business"), RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER) || b.e(activity);
    }
}
