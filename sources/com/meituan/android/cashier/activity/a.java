package com.meituan.android.cashier.activity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final MTCashierActivity b;

    private a(MTCashierActivity mTCashierActivity) {
        this.b = mTCashierActivity;
    }

    public static Runnable a(MTCashierActivity mTCashierActivity) {
        Object[] objArr = {mTCashierActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "397d792ac074e9bbc879c6c5f1f60af8", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "397d792ac074e9bbc879c6c5f1f60af8") : new a(mTCashierActivity);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7816471ed1f295db9d9cb8ec4897b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7816471ed1f295db9d9cb8ec4897b8");
        } else {
            MTCashierActivity.a(this.b);
        }
    }
}
