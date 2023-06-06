package com.meituan.mmp.lib.mp.ipc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.FutureTask;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i<V> extends FutureTask<V> {
    public static ChangeQuickRedirect a;

    public i() {
        super(new Runnable() { // from class: com.meituan.mmp.lib.mp.ipc.i.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed2d94f37f6c166a0af78ceb88156ac4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed2d94f37f6c166a0af78ceb88156ac4");
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void set(V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82c42518bf3d316146fd6accbdcfac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82c42518bf3d316146fd6accbdcfac1");
        } else {
            super.set(v);
        }
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e9c2866abba3271832cf9f7a998f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e9c2866abba3271832cf9f7a998f02");
        } else {
            super.setException(th);
        }
    }
}
