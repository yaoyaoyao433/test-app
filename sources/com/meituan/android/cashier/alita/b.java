package com.meituan.android.cashier.alita;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.RetainWindow;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.paybase.utils.af;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static JSONObject a(Context context, Cashier cashier) {
        Object[] objArr = {context, cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a44b54165725a01c2940b3e5e79c0821", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a44b54165725a01c2940b3e5e79c0821");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("total_fee", ag.a(cashier.getTotalFee()));
            WalletPayment a2 = com.meituan.android.cashier.retrofit.a.a(cashier);
            if (a2 != null) {
                WalletPaymentListPage walletPaymentListPage = a2.getWalletPaymentListPage();
                jSONObject.put("bindedcard_num", com.meituan.android.pay.common.selectdialog.utils.a.b(walletPaymentListPage));
                jSONObject.put("normal_bindedcard_num", com.meituan.android.pay.common.selectdialog.utils.a.a(walletPaymentListPage));
            }
            com.meituan.android.pay.common.payment.data.a b = com.meituan.android.cashier.base.utils.a.b(a2);
            if (b instanceof MTPayment) {
                jSONObject.put("cardpay_discount", com.meituan.android.pay.desk.payment.discount.a.a(a2, (MTPayment) b));
            }
            if (com.meituan.android.cashier.base.utils.a.c(a2) != null) {
                jSONObject.put("is_recommend_cardpay", true);
            } else {
                jSONObject.put("is_recommend_cardpay", false);
            }
            jSONObject.put("creditpay_status", com.meituan.android.cashier.base.utils.a.a(cashier));
            jSONObject.put("balancepay_status", com.meituan.android.cashier.base.utils.a.a(a2));
            jSONObject.put("alipaysimple_status", com.meituan.android.cashier.base.utils.a.d(cashier));
            jSONObject.put("is_alipay_installed", com.meituan.android.paymentchannel.utils.a.b(context));
            jSONObject.put(DataConstants.CITY_ID, com.meituan.android.paybase.config.a.d() != null ? com.meituan.android.paybase.config.a.d().g() : "-1");
            jSONObject.put(HybridSignPayJSHandler.ARG_TRADE_NO, !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.a.b) ? com.meituan.android.paybase.common.analyse.a.b : "-1");
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierRevisionFragment", (Map<String, Object>) null);
        }
        return jSONObject;
    }

    private static RetainWindow a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98574c82d31eaa83264f989b00fb2ea3", RobustBitConfig.DEFAULT_VALUE)) {
            return (RetainWindow) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98574c82d31eaa83264f989b00fb2ea3");
        }
        if (jSONObject != null) {
            try {
                return (RetainWindow) n.a().fromJson(jSONObject.getString("retain_window"), (Class<Object>) RetainWindow.class);
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "StandardCashierAlitaUtils_convertJsonToBean", (Map<String, Object>) null);
            }
        }
        return null;
    }

    public static RetainWindow a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56f38c28124b4a14489a3abb40c1f2d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (RetainWindow) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56f38c28124b4a14489a3abb40c1f2d9");
        }
        JSONObject a2 = a.a();
        if (a2 != null) {
            return a(a2);
        }
        return null;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9421978a728f55a94e78b956aded03c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9421978a728f55a94e78b956aded03c0")).booleanValue() : af.a("finance_debug").b("finance_alita_debug_switch", false);
    }
}
