package com.meituan.android.cashier.fragment;

import com.meituan.android.cashier.base.view.revision.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements i.a {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;

    private c(MTCashierRevisionFragment mTCashierRevisionFragment) {
        this.b = mTCashierRevisionFragment;
    }

    public static i.a a(MTCashierRevisionFragment mTCashierRevisionFragment) {
        Object[] objArr = {mTCashierRevisionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29bd957f099fb3fdb9db00269d5f94d5", RobustBitConfig.DEFAULT_VALUE) ? (i.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29bd957f099fb3fdb9db00269d5f94d5") : new c(mTCashierRevisionFragment);
    }

    @Override // com.meituan.android.cashier.base.view.revision.i.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f8a54f78c711a47d3b43e6f66afa92c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f8a54f78c711a47d3b43e6f66afa92c");
        } else {
            MTCashierRevisionFragment.a(this.b);
        }
    }
}
