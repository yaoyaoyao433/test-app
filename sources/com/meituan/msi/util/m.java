package com.meituan.msi.util;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static ExecutorService c;

    public static synchronized void a(Runnable runnable) {
        synchronized (m.class) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d3a026b602c76ddd5fa8bd6dfb77760", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d3a026b602c76ddd5fa8bd6dfb77760");
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                b.post(runnable);
            }
        }
    }

    public static synchronized void b(Runnable runnable) {
        synchronized (m.class) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69d7c442626acb638d16bfd173a72620", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69d7c442626acb638d16bfd173a72620");
                return;
            }
            if (c == null) {
                c = com.sankuai.android.jarvis.c.b("MSI");
            }
            c.submit(runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static volatile ThreadPoolExecutor b;

        private static ExecutorService a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef37a414f2ac673752e60ec85349ea68", RobustBitConfig.DEFAULT_VALUE)) {
                return (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef37a414f2ac673752e60ec85349ea68");
            }
            if (b == null) {
                synchronized (a.class) {
                    if (b == null) {
                        ThreadPoolExecutor a2 = com.sankuai.android.jarvis.c.a("msi-Serialized", 1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        b = a2;
                        a2.allowCoreThreadTimeOut(true);
                    }
                }
            }
            return b;
        }

        public static void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ece68f4812fab0c7ddf5d81a7572e397", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ece68f4812fab0c7ddf5d81a7572e397");
            } else {
                a().submit(runnable);
            }
        }
    }
}
