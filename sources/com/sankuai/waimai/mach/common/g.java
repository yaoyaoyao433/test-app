package com.sankuai.waimai.mach.common;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static final Executor a;
    public static final Executor b;
    public static final Executor c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final BlockingQueue<Runnable> g;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        d = availableProcessors;
        e = availableProcessors == 1 ? d : Math.max(2, Math.min(d - 1, 4));
        f = (d * 2) + 1;
        g = new LinkedBlockingQueue(128);
        c = new b();
        a = com.sankuai.android.jarvis.c.a("render", e, f, 30L, TimeUnit.SECONDS, g, new a("render"));
        b = com.sankuai.android.jarvis.c.a("download", e, f, 30L, TimeUnit.SECONDS, g, new a("download"));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements ThreadFactory {
        public static ChangeQuickRedirect a;
        private final AtomicInteger b;
        private final String c;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e13a7a74ed2bdc270936f1531f634ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e13a7a74ed2bdc270936f1531f634ab");
                return;
            }
            this.b = new AtomicInteger(1);
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d8ae38eb0b8260cef0de9ac4e23ea5", RobustBitConfig.DEFAULT_VALUE)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d8ae38eb0b8260cef0de9ac4e23ea5");
            }
            String str = "MachExecutor-->" + this.c + "#" + this.b.getAndIncrement();
            new StringBuilder("threadName=").append(str);
            return com.sankuai.android.jarvis.c.a(str, runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b implements Executor {
        public static ChangeQuickRedirect a;
        public final ArrayDeque<Runnable> b;
        public Runnable c;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e9283cb5a0966171b73a1f7adada4c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e9283cb5a0966171b73a1f7adada4c");
            } else {
                this.b = new ArrayDeque<>();
            }
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(final Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639687f554d1fe886e2f9427b11f96b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639687f554d1fe886e2f9427b11f96b0");
                return;
            }
            this.b.offer(new Runnable() { // from class: com.sankuai.waimai.mach.common.g.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1252b61afe94024dbd70e50bb93d4a4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1252b61afe94024dbd70e50bb93d4a4b");
                        return;
                    }
                    try {
                        runnable.run();
                    } finally {
                        b.this.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }

        public final synchronized void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9977f967e40de6780858bc1972692e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9977f967e40de6780858bc1972692e");
                return;
            }
            Runnable poll = this.b.poll();
            this.c = poll;
            if (poll != null) {
                g.a.execute(this.c);
            }
        }
    }
}
