package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {
    public static ChangeQuickRedirect a;
    private final j b;

    private l(j jVar) {
        this.b = jVar;
    }

    public static Runnable a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "763f900ae693a16438413ca155f717c2", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "763f900ae693a16438413ca155f717c2") : new l(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e09ddf7e66e3bdc453f832b2a5e74930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e09ddf7e66e3bdc453f832b2a5e74930");
        } else {
            j.a(this.b);
        }
    }
}
