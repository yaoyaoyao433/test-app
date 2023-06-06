package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;
    private final com.meituan.android.neohybrid.v2.neo.bridge.handler.b c;

    private e(d dVar, com.meituan.android.neohybrid.v2.neo.bridge.handler.b bVar) {
        this.b = dVar;
        this.c = bVar;
    }

    public static Runnable a(d dVar, com.meituan.android.neohybrid.v2.neo.bridge.handler.b bVar) {
        Object[] objArr = {dVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db71b409e13afea1e64881322113b117", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db71b409e13afea1e64881322113b117") : new e(dVar, bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "364c97cbc4416a716f57d3ddc6bbde36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "364c97cbc4416a716f57d3ddc6bbde36");
        } else {
            d.a(this.b, this.c);
        }
    }
}
