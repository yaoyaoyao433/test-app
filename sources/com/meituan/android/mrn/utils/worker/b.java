package com.meituan.android.mrn.utils.worker;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;
    private final boolean f;
    private final ScheduledExecutorService g;

    public b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da3336a9369f177a3d4d885323154ba1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da3336a9369f177a3d4d885323154ba1");
            return;
        }
        this.g = com.sankuai.android.jarvis.c.b(str, 1);
        this.f = true;
    }

    @Override // com.meituan.android.mrn.utils.worker.e
    public final void a(@NonNull final c cVar, long j) {
        Object[] objArr = {cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d610e7bbcd1fbf88b146eb49fe29604f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d610e7bbcd1fbf88b146eb49fe29604f");
        } else {
            this.g.schedule(new Runnable() { // from class: com.meituan.android.mrn.utils.worker.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d8325ead2b0939ee4a3bb3142de8ca7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d8325ead2b0939ee4a3bb3142de8ca7");
                    } else {
                        b.this.b(cVar);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.meituan.android.mrn.utils.worker.e
    public final void a(final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7622e4bc9dda9852edfacdc79896ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7622e4bc9dda9852edfacdc79896ca");
        } else {
            this.g.execute(new Runnable() { // from class: com.meituan.android.mrn.utils.worker.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b029c6a046a8b33f393e48af37e997e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b029c6a046a8b33f393e48af37e997e2");
                    } else {
                        b.super.a(cVar);
                    }
                }
            });
        }
    }
}
