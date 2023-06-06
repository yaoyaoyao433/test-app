package com.meituan.android.neohybrid.v2.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {
    public static ChangeQuickRedirect a;
    private final n b;

    private p(n nVar) {
        this.b = nVar;
    }

    public static Runnable a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb44acaa68e8f449781649f94de1f50b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb44acaa68e8f449781649f94de1f50b") : new p(nVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aef8720b9f6c997b2a84f9688db27bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aef8720b9f6c997b2a84f9688db27bc5");
        } else {
            n.a(this.b);
        }
    }
}
