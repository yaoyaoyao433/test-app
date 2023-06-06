package com.meituan.mmp.lib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;

    private k(a aVar) {
        this.b = aVar;
    }

    public static Runnable a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74fd7b8560ac33343b609e1e0a3e95c4", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74fd7b8560ac33343b609e1e0a3e95c4") : new k(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "136586e82cf975520fd76450a4c8f0a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "136586e82cf975520fd76450a4c8f0a9");
        } else {
            a.d(this.b);
        }
    }
}
