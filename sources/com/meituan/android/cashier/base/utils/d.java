package com.meituan.android.cashier.base.utils;

import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.PayLaterPopDetailInfoBean;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static PayLaterPopDetailInfoBean b;

    public static void a(PayLaterPopDetailInfoBean payLaterPopDetailInfoBean) {
        b = payLaterPopDetailInfoBean;
    }

    public static void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "678c94c9d56dc8bfec524edbcf02a1a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "678c94c9d56dc8bfec524edbcf02a1a5");
        } else if (b == null || b.getPayLaterSubmitBean() == null) {
        } else {
            map.put("is_creditscore_show", Integer.valueOf(b.getScore() <= 0 ? 0 : 1));
            map.put("openStatus", Boolean.valueOf(b.getPayLaterSubmitBean().openCreditPay()));
            map.put("marketDesc", b.getPromoBubble());
        }
    }

    private static String a(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4da994f694bfe66e21bf6fc3a5974e7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4da994f694bfe66e21bf6fc3a5974e7b");
        }
        if (b == null || b.getPayLaterSubmitBean() == null || !b.getPayLaterSubmitBean().openCreditPay()) {
            MTPayment c = com.meituan.android.cashier.retrofit.a.c(cashier);
            return c != null ? c.getPayType() : "";
        }
        return "creditpay";
    }

    public static void a(Cashier cashier, String str) {
        Object[] objArr = {cashier, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3449a202185d362e577529e9ae65843f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3449a202185d362e577529e9ae65843f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pay_type", a(cashier));
        q.a("paybiz_paylater_dialog_show", hashMap, (List<Float>) null, str);
    }

    public static void b(Cashier cashier, String str) {
        Object[] objArr = {cashier, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad55c5c9db261e95ce81a792192051bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad55c5c9db261e95ce81a792192051bb");
        } else if (b == null) {
        } else {
            HashMap hashMap = new HashMap(4);
            hashMap.put("button_name", b.getRbtn());
            a(hashMap);
            q.a("c_pay_ejiowkr5", "b_pay_wzbw2j98_mc", "先享后付-支付前开通引导页-正向主按钮", hashMap, ae.a.CLICK, str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("pay_type", a(cashier));
            hashMap2.put("button", "ensure");
            q.a("paybiz_paylater_dialog_click", hashMap2, (List<Float>) null, str);
        }
    }

    public static void c(Cashier cashier, String str) {
        Object[] objArr = {cashier, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe13012baeb69b839ab3fcfb85513862", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe13012baeb69b839ab3fcfb85513862");
        } else if (b == null) {
        } else {
            HashMap hashMap = new HashMap(4);
            hashMap.put("button_name", b.getLbtn());
            a(hashMap);
            q.a("c_pay_ejiowkr5", "b_pay_k7dmbr58_mc", "先享后付-支付前开通引导页-负向主按钮", hashMap, ae.a.CLICK, str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("pay_type", a(cashier));
            hashMap2.put("button", "cancel");
            q.a("paybiz_paylater_dialog_click", hashMap2, (List<Float>) null, str);
        }
    }
}
