package com.sankuai.waimai.mach.manager_new.ioq;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i {
    public static ChangeQuickRedirect a = null;
    private static int d = 128;
    private ThreadPoolExecutor b;
    private PriorityBlockingQueue<Runnable> c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a implements ThreadFactory {
        public static ChangeQuickRedirect a;
        private final AtomicInteger b;
        private final String c;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8361c0a3dab88a3ec9de17a6f885c337", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8361c0a3dab88a3ec9de17a6f885c337");
                return;
            }
            this.b = new AtomicInteger(1);
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72bb1854b641780651bff542a99ef126", RobustBitConfig.DEFAULT_VALUE)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72bb1854b641780651bff542a99ef126");
            }
            String str = "MachIOQ-->" + this.c + "#" + this.b.getAndIncrement();
            com.sankuai.waimai.mach.manager_new.common.c.e("threadName=" + str);
            return com.sankuai.android.jarvis.c.a(str, runnable);
        }
    }

    public i(PriorityBlockingQueue<Runnable> priorityBlockingQueue) {
        Object[] objArr = {priorityBlockingQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "706a105f2c29cf3530c3e3007653abd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "706a105f2c29cf3530c3e3007653abd5");
            return;
        }
        this.c = priorityBlockingQueue;
        this.b = com.sankuai.android.jarvis.c.a("ioq", 1, 1, 30L, TimeUnit.SECONDS, this.c, new a("ioq"));
        this.b.setRejectedExecutionHandler(new b());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements RejectedExecutionHandler {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Object[] objArr = {runnable, threadPoolExecutor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527dc778b70243b755a963767cd0aa9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527dc778b70243b755a963767cd0aa9b");
                return;
            }
            com.sankuai.waimai.mach.e e = com.sankuai.waimai.mach.common.i.a().e();
            if (e != null) {
                e.a("mach_v2_io_queue_full", "IO线程池已满", "线程池已满，IO任务失败", new HashMap());
            }
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd35a7cae89c9958dc0cfe180ffa08d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd35a7cae89c9958dc0cfe180ffa08d");
            return;
        }
        this.b.execute(runnable);
        if (this.c.size() > d) {
            com.sankuai.waimai.mach.e e = com.sankuai.waimai.mach.common.i.a().e();
            if (e != null) {
                e.a("mach_v2_io_queue_full", "IO线程池满载", "IO线程池满载", new HashMap());
            }
            com.sankuai.waimai.mach.manager_new.common.c.i("线程池满载，IO线程池满载，等待任务数量 | " + this.c.size());
        }
    }
}
