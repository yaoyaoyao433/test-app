package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final f b;
    private final com.meituan.android.neohybrid.v2.neo.bridge.handler.a c;

    private g(f fVar, com.meituan.android.neohybrid.v2.neo.bridge.handler.a aVar) {
        this.b = fVar;
        this.c = aVar;
    }

    public static Runnable a(f fVar, com.meituan.android.neohybrid.v2.neo.bridge.handler.a aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6805158c986b113ae5c058e53fe6c212", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6805158c986b113ae5c058e53fe6c212") : new g(fVar, aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767167bb5bd58406662707bc3a3db9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767167bb5bd58406662707bc3a3db9d0");
        } else {
            f.a(this.b, this.c);
        }
    }
}
