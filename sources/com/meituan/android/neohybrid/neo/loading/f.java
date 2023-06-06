package com.meituan.android.neohybrid.neo.loading;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;

    private f(d dVar) {
        this.b = dVar;
    }

    public static Runnable a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "776cd14ae33e7da3b9c9b7fba100ba98", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "776cd14ae33e7da3b9c9b7fba100ba98") : new f(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0793b65d959c92567a4e221cd20b607f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0793b65d959c92567a4e221cd20b607f");
            return;
        }
        d dVar = this.b;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "558d1932e1c5529dab9fd4c1d75f6103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "558d1932e1c5529dab9fd4c1d75f6103");
        } else {
            dVar.a("timeout");
        }
    }
}
