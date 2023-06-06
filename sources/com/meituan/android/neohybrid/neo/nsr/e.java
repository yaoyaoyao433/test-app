package com.meituan.android.neohybrid.neo.nsr;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;

    private e(d dVar) {
        this.b = dVar;
    }

    public static Runnable a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9ebc385b5d53044bfd77bff78196d87", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9ebc385b5d53044bfd77bff78196d87") : new e(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df3e9b77314b04cd50bdb2704493e89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df3e9b77314b04cd50bdb2704493e89");
        } else {
            this.b.a();
        }
    }
}
