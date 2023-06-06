package com.meituan.android.neohybrid.neo.bridge.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final g b;
    private final com.meituan.android.neohybrid.neo.bridge.handler.a c;

    private h(g gVar, com.meituan.android.neohybrid.neo.bridge.handler.a aVar) {
        this.b = gVar;
        this.c = aVar;
    }

    public static Runnable a(g gVar, com.meituan.android.neohybrid.neo.bridge.handler.a aVar) {
        Object[] objArr = {gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0aebfce87b85160c82f44c80552d6df", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0aebfce87b85160c82f44c80552d6df") : new h(gVar, aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1522b5ce2078ea314c3c5b9ff3d33c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1522b5ce2078ea314c3c5b9ff3d33c0");
        } else {
            g.a(this.b, this.c);
        }
    }
}
