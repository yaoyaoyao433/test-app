package com.meituan.android.neohybrid.v2.neo.loading;

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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b38513f1c03a8ac5e20b15c8748e05d", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b38513f1c03a8ac5e20b15c8748e05d") : new f(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce752b9fdf5a0e2c43fd8c69dfc1c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce752b9fdf5a0e2c43fd8c69dfc1c72");
            return;
        }
        d dVar = this.b;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5515d5d1ccb2d6acfb1bc8ff0fd4ed96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5515d5d1ccb2d6acfb1bc8ff0fd4ed96");
        } else {
            dVar.a("timeout");
        }
    }
}
