package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {
    public static ChangeQuickRedirect a;
    private final j b;

    private k(j jVar) {
        this.b = jVar;
    }

    public static Runnable a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cb44d429ae5e488ad7fffbc3fbf5cee", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cb44d429ae5e488ad7fffbc3fbf5cee") : new k(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5cfe40582c911b4fc24686a32f415b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5cfe40582c911b4fc24686a32f415b6");
        } else {
            j.b(this.b);
        }
    }
}
