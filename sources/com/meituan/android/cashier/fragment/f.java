package com.meituan.android.cashier.fragment;

import com.meituan.android.pay.desk.payment.view.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements g.a {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;

    private f(MTCashierRevisionFragment mTCashierRevisionFragment) {
        this.b = mTCashierRevisionFragment;
    }

    public static g.a a(MTCashierRevisionFragment mTCashierRevisionFragment) {
        Object[] objArr = {mTCashierRevisionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80fa239777a9669e0a4182559d22dea1", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80fa239777a9669e0a4182559d22dea1") : new f(mTCashierRevisionFragment);
    }

    @Override // com.meituan.android.pay.desk.payment.view.g.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff5902c81adc763a5acba958dc202535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff5902c81adc763a5acba958dc202535");
        } else {
            this.b.W();
        }
    }
}
