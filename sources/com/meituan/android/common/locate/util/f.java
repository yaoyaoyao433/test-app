package com.meituan.android.common.locate.util;

import android.support.annotation.NonNull;
import com.meituan.android.common.locate.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class f {
    private static String a = "LocateThreadPool ";
    private static volatile f b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ThreadPoolExecutor d;
    private ThreadPoolExecutor c;
    private ThreadFactory e;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfb53500fa851bf537ebae04bbc65646", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfb53500fa851bf537ebae04bbc65646");
            return;
        }
        this.e = new ThreadFactory() { // from class: com.meituan.android.common.locate.util.f.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull Runnable runnable) {
                Object[] objArr2 = {runnable};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "30e39cc828b11ea89c9154c6d90416e8", RobustBitConfig.DEFAULT_VALUE) ? (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "30e39cc828b11ea89c9154c6d90416e8") : com.sankuai.android.jarvis.c.a("locate-singleThread", runnable);
            }
        };
        try {
            this.c = com.sankuai.android.jarvis.c.a("Locate-single", 1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(1000), this.e);
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        if (this.c == null) {
            this.c = new g.a(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(1000), this.e);
        }
        this.c.allowCoreThreadTimeOut(true);
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4013d1eee72e99df5f2a58820b1ea133", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4013d1eee72e99df5f2a58820b1ea133");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    public void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dbeb123a1482c86a6fcce434b3489bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dbeb123a1482c86a6fcce434b3489bb");
            return;
        }
        try {
            this.c.submit(runnable);
        } catch (Throwable unused) {
        }
    }

    public synchronized ExecutorService b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "194f78b3fc6d1b302f7c1efd08a62b79", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "194f78b3fc6d1b302f7c1efd08a62b79");
        }
        if (d == null || d.isShutdown()) {
            d = new g.a(1, 1, 0L, TimeUnit.MINUTES, new LinkedBlockingQueue(256), this.e);
        }
        return d;
    }
}
