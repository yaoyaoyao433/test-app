package com.sankuai.waimai.ugc.creator.utils.task;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.android.jarvis.n;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    private static final int e = Runtime.getRuntime().availableProcessors();
    private static final int f;
    private static final int g;
    private static final BlockingQueue<Runnable> h;
    protected final a b;
    private final ExecutorService d;

    static {
        int max = Math.max(2, Math.min(e - 1, 4));
        f = max;
        g = (max * 2) + 1;
        h = new LinkedBlockingQueue(128);
    }

    private static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23ce60a50326caa7c99aee87aff15908", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23ce60a50326caa7c99aee87aff15908");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d12a55c2c0e1cd247efe0386556a3c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d12a55c2c0e1cd247efe0386556a3c5");
            return;
        }
        this.b = new a(Looper.getMainLooper());
        this.d = c.a("wm-task-manager", f, g, 60L, TimeUnit.SECONDS, h, n.PRIORITY_DEFAULT);
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e45c418dedcd90c933749f600a946355", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e45c418dedcd90c933749f600a946355");
        } else {
            a().d.execute(runnable);
        }
    }

    public static <R> void a(com.sankuai.waimai.ugc.creator.utils.task.a<R> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0efe61c3e06ed086b3d5502eb72e589d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0efe61c3e06ed086b3d5502eb72e589d");
        } else {
            a().d.execute(aVar);
        }
    }

    private static Handler b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1f1d924e33fa2b54e27e3106a5166c5", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1f1d924e33fa2b54e27e3106a5166c5") : a().b;
    }

    public static void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa0d66b09ea8f82024488de350cca64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa0d66b09ea8f82024488de350cca64");
            return;
        }
        Object[] objArr2 = {runnable, 0L};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5a6ed2b2ff49a657dfd07e03f0539082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5a6ed2b2ff49a657dfd07e03f0539082");
        } else {
            b().postDelayed(runnable, 0L);
        }
    }

    public static void a(Object obj) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9968451327d16b1869fb046962379b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9968451327d16b1869fb046962379b90");
        } else {
            b().removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;

        public a(Looper looper) {
            super(looper);
            Object[] objArr = {looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4207b9f0d7766a37e263676cdf86569c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4207b9f0d7766a37e263676cdf86569c");
            }
        }

        @Override // android.os.Handler
        public final void dispatchMessage(@NonNull Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1b2b5ef5e0db312cff8b873297acca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1b2b5ef5e0db312cff8b873297acca");
                return;
            }
            try {
                super.dispatchMessage(message);
            } catch (Error | Exception unused) {
            }
        }
    }
}
