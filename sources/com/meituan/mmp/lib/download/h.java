package com.meituan.mmp.lib.download;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static volatile h b;
    private BlockingQueue<Runnable> c;
    private ExecutorService d;

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36ef221b479974897f19f8f11aa1bd68", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36ef221b479974897f19f8f11aa1bd68");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7dedb8fca7ec1d3e6acd467ba8d99cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7dedb8fca7ec1d3e6acd467ba8d99cc");
            return;
        }
        this.c = new LinkedBlockingQueue();
        this.d = com.sankuai.android.jarvis.c.a("mmp-download-thread-manager", 3, 3, 0L, TimeUnit.MILLISECONDS, this.c);
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a73efd5c00f7abd8e0a31bd569a38f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a73efd5c00f7abd8e0a31bd569a38f90");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.d.execute(runnable);
        }
    }
}
