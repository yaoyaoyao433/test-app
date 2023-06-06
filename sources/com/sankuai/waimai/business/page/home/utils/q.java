package com.sankuai.waimai.business.page.home.utils;

import android.os.Handler;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class q {
    public static ChangeQuickRedirect a;
    private final Handler b;
    private final Runnable c;
    private final long d;
    private boolean e;

    public q(@IntRange(from = 1) long j, @NonNull Handler handler, @NonNull final Runnable runnable) {
        Object[] objArr = {Long.valueOf((long) MetricsAnrManager.ANR_THRESHOLD), handler, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f0c8c03c1f7f257a7f02e10c63a1132", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f0c8c03c1f7f257a7f02e10c63a1132");
            return;
        }
        this.e = false;
        this.d = MetricsAnrManager.ANR_THRESHOLD;
        this.b = handler;
        this.c = new Runnable() { // from class: com.sankuai.waimai.business.page.home.utils.q.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e15aeb716f4a93727c23fa4ad0362115", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e15aeb716f4a93727c23fa4ad0362115");
                    return;
                }
                try {
                    runnable.run();
                    q.this.b(0L);
                } catch (Exception unused) {
                }
            }
        };
    }

    public final boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef675d689f38cd2bedaeac7c5c07b599", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef675d689f38cd2bedaeac7c5c07b599")).booleanValue();
        }
        if (this.e) {
            return false;
        }
        this.e = true;
        b(j);
        return true;
    }

    void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77619edf4ac3d4ba1d76dfbe5f28a36b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77619edf4ac3d4ba1d76dfbe5f28a36b");
        } else {
            this.b.postDelayed(this.c, this.d + j);
        }
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d0fc061d72862b61898808c835503d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d0fc061d72862b61898808c835503d");
            return;
        }
        this.e = false;
        this.b.removeCallbacks(this.c);
    }
}
