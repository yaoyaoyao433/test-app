package com.meituan.android.cashier.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final MTCashierRevisionFragment b;

    private a(MTCashierRevisionFragment mTCashierRevisionFragment) {
        this.b = mTCashierRevisionFragment;
    }

    public static Runnable a(MTCashierRevisionFragment mTCashierRevisionFragment) {
        Object[] objArr = {mTCashierRevisionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbd1167255a286cc0ee5ed61ec74ec99", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbd1167255a286cc0ee5ed61ec74ec99") : new a(mTCashierRevisionFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a782aab8dc0801c5ec6cab097f1699f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a782aab8dc0801c5ec6cab097f1699f");
        } else {
            MTCashierRevisionFragment.j(this.b);
        }
    }
}
