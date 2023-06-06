package com.meituan.android.cashier;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAdapter b;

    private i(NativeStandardCashierAdapter nativeStandardCashierAdapter) {
        this.b = nativeStandardCashierAdapter;
    }

    public static Runnable a(NativeStandardCashierAdapter nativeStandardCashierAdapter) {
        Object[] objArr = {nativeStandardCashierAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b954672e8a33f2177836f5b9effab9ec", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b954672e8a33f2177836f5b9effab9ec") : new i(nativeStandardCashierAdapter);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9b1029fbbc236a84992eb8be30b5d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9b1029fbbc236a84992eb8be30b5d07");
        } else {
            NativeStandardCashierAdapter.a(this.b);
        }
    }
}
