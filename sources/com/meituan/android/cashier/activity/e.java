package com.meituan.android.cashier.activity;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final MTCashierActivity b;
    private final Intent c;

    private e(MTCashierActivity mTCashierActivity, Intent intent) {
        this.b = mTCashierActivity;
        this.c = intent;
    }

    public static Runnable a(MTCashierActivity mTCashierActivity, Intent intent) {
        Object[] objArr = {mTCashierActivity, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bd2af3bf9a7de313249e7e9fbaf8600", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bd2af3bf9a7de313249e7e9fbaf8600") : new e(mTCashierActivity, intent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f63ffb015e3c250d35607004e5a66e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f63ffb015e3c250d35607004e5a66e2");
        } else {
            MTCashierActivity.a(this.b, this.c);
        }
    }
}
