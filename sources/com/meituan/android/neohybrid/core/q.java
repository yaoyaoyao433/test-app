package com.meituan.android.neohybrid.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {
    public static ChangeQuickRedirect a;
    private final n b;

    private q(n nVar) {
        this.b = nVar;
    }

    public static Runnable a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942808adee51c3454b29a4ed6eaa5522", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942808adee51c3454b29a4ed6eaa5522") : new q(nVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5418fcde951fe7b5c367e77c8926cad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5418fcde951fe7b5c367e77c8926cad");
        } else {
            n.a(this.b);
        }
    }
}
