package com.meituan.android.cashier.fragment;

import com.meituan.android.pay.desk.payment.view.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements g.a {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;

    private g(MTCashierRevisionFragment mTCashierRevisionFragment) {
        this.b = mTCashierRevisionFragment;
    }

    public static g.a a(MTCashierRevisionFragment mTCashierRevisionFragment) {
        Object[] objArr = {mTCashierRevisionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a4214e45c1659ae223577345f71f93d", RobustBitConfig.DEFAULT_VALUE) ? (g.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a4214e45c1659ae223577345f71f93d") : new g(mTCashierRevisionFragment);
    }

    @Override // com.meituan.android.pay.desk.payment.view.g.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef48873e0c5879a362a2d866f00f3f59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef48873e0c5879a362a2d866f00f3f59");
        } else {
            this.b.W();
        }
    }
}
