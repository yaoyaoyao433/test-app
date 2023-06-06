package com.meituan.android.pay.desk.pack;

import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final Fragment c;
    private final WalletPayment d;

    private s(e eVar, Fragment fragment, WalletPayment walletPayment) {
        this.b = eVar;
        this.c = fragment;
        this.d = walletPayment;
    }

    public static View.OnClickListener a(e eVar, Fragment fragment, WalletPayment walletPayment) {
        Object[] objArr = {eVar, fragment, walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73b809c21d590f4f8ec7563bc56ff1fe", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73b809c21d590f4f8ec7563bc56ff1fe") : new s(eVar, fragment, walletPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e60beb6076854a5b9b43fc563b1861e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e60beb6076854a5b9b43fc563b1861e");
            return;
        }
        e eVar = this.b;
        Fragment fragment = this.c;
        WalletPayment walletPayment = this.d;
        Object[] objArr2 = {eVar, fragment, walletPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "48c2d5a0c151dd1a00b459b90b4a84c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "48c2d5a0c151dd1a00b459b90b4a84c6");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_u7653t1g_mc", (Map<String, Object>) null);
        eVar.a(fragment, walletPayment);
        if (eVar.c != null) {
            eVar.c.c(view);
        }
    }
}
