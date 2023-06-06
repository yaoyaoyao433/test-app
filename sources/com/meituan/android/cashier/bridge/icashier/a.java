package com.meituan.android.cashier.bridge.icashier;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private PayParams b;
    private MTPayment c;
    private com.meituan.android.pay.common.payment.data.a d;
    private C0187a e;
    private WalletPayment f;
    private Activity g;

    private a(Activity activity, WalletPayment walletPayment, MTPayment mTPayment, com.meituan.android.pay.common.payment.data.a aVar, C0187a c0187a) {
        Object[] objArr = {activity, walletPayment, mTPayment, aVar, c0187a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b2c3d94a2ad16ce200421ff408bf9a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b2c3d94a2ad16ce200421ff408bf9a0");
            return;
        }
        this.g = activity;
        this.b = new PayParams();
        this.c = mTPayment;
        this.d = aVar;
        this.e = c0187a;
        this.f = walletPayment;
    }

    public static PayParams a(Activity activity, WalletPayment walletPayment, MTPayment mTPayment, com.meituan.android.pay.common.payment.data.a aVar, C0187a c0187a) {
        int i;
        byte b;
        Object[] objArr = {activity, walletPayment, mTPayment, aVar, c0187a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ceb1c106b0d6e198a28cfb748452f156", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ceb1c106b0d6e198a28cfb748452f156");
        }
        a aVar2 = new a(activity, walletPayment, mTPayment, aVar, c0187a);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "6ce51e77796ca82b2cebe03a27220645", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayParams) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "6ce51e77796ca82b2cebe03a27220645");
        }
        if (aVar2.c == null) {
            return null;
        }
        PayParams payParams = aVar2.b;
        Object[] objArr3 = {payParams};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "a00ba322df199ff130e64d1a55bf204d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "a00ba322df199ff130e64d1a55bf204d");
        } else {
            payParams.tradeNo = aVar2.e.b;
            payParams.payToken = aVar2.e.c;
            payParams.moneyChanged = aVar2.e.e;
            payParams.fromSelectBankCard = aVar2.e.f;
            payParams.cashierType = aVar2.e.d;
        }
        PayParams payParams2 = aVar2.b;
        if (aVar2.e.f == 1) {
            i = 2;
            b = 1;
        } else {
            i = 2;
            b = 0;
        }
        Object[] objArr4 = new Object[i];
        objArr4[0] = payParams2;
        objArr4[1] = Byte.valueOf(b);
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "42febe9c6d3ffbfd9939f181fec475ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "42febe9c6d3ffbfd9939f181fec475ed");
        } else if (b != 0) {
            if (aVar2.c != null) {
                payParams2.walletPayParams = u.a().a(aVar2.g, aVar2.f, aVar2.c, "cashier_select_bank_dialog_params");
            }
            if (aVar2.d != null) {
                u.a().a(aVar2.g, aVar2.c, aVar2.d, payParams2.walletPayParams);
            }
        } else {
            payParams2.walletPayParams = u.a().a(aVar2.g, aVar2.f, aVar2.c, "cashier_params");
        }
        return aVar2.b;
    }

    public static void a(PayParams payParams, String str) {
        String str2;
        Object[] objArr = {payParams, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b81c0dac46b2bd2bf589bc1e17ec4c32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b81c0dac46b2bd2bf589bc1e17ec4c32");
        } else if (payParams == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                str2 = new JSONObject(str).optString("guide_plan_infos");
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.b.a(e, "ICashierPayParams_appendGuidePlanInfos", (Map<String, Object>) null);
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            com.meituan.android.cashier.retrofit.a.b(payParams, str2);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.cashier.bridge.icashier.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0187a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;
        int e;
        int f;

        private C0187a(String str, String str2, String str3, int i, int i2) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677326f3285b45e41838396f547af7b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677326f3285b45e41838396f547af7b2");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
            this.f = i2;
        }

        public static C0187a a(String str, String str2, String str3, int i, int i2) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc68d82c25345b4841a72bb5aa562f62", RobustBitConfig.DEFAULT_VALUE) ? (C0187a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc68d82c25345b4841a72bb5aa562f62") : new C0187a(str, str2, str3, i, i2);
        }
    }
}
