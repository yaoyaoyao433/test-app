package com.meituan.msc.modules.container;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final int c;
    private final int d;
    private final Intent e;

    private g(b bVar, int i, int i2, Intent intent) {
        this.b = bVar;
        this.c = i;
        this.d = i2;
        this.e = intent;
    }

    public static Runnable a(b bVar, int i, int i2, Intent intent) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e71f77322a8a2d2b8e547e690052cf29", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e71f77322a8a2d2b8e547e690052cf29") : new g(bVar, i, i2, intent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15437a9161273c93f31a0dd9dd8e02c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15437a9161273c93f31a0dd9dd8e02c");
        } else {
            b.a(this.b, this.c, this.d, this.e);
        }
    }
}
