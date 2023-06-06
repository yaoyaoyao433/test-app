package com.sankuai.waimai.alita.bundle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static final Executor a;
    public static final Executor b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final BlockingQueue<Runnable> f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors;
        d = availableProcessors == 1 ? c : Math.max(2, Math.min(c - 1, 4));
        e = (c * 2) + 1;
        f = new LinkedBlockingQueue(128);
        b = new a();
        a = com.sankuai.android.jarvis.c.a("alita-download-executor", d, e, 30L, TimeUnit.SECONDS, f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Executor {
        public static ChangeQuickRedirect a;
        private static final Executor d = com.sankuai.android.jarvis.c.a("alita-serial-executor", c.d, c.e, 30, TimeUnit.SECONDS, c.f);
        public final ArrayDeque<Runnable> b;
        public Runnable c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e6aaf9ca02aad60e6739ae244f7be4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e6aaf9ca02aad60e6739ae244f7be4");
            } else {
                this.b = new ArrayDeque<>();
            }
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(final Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38656e5552569a68ba4aead46c7f505", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38656e5552569a68ba4aead46c7f505");
                return;
            }
            this.b.offer(new Runnable() { // from class: com.sankuai.waimai.alita.bundle.c.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12b7db1943306fe91e92763f2460f3d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12b7db1943306fe91e92763f2460f3d3");
                        return;
                    }
                    try {
                        runnable.run();
                    } finally {
                        a.this.a();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52bca94babfba437e87af9c8f9b596d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52bca94babfba437e87af9c8f9b596d0");
                return;
            }
            Runnable poll = this.b.poll();
            this.c = poll;
            if (poll != null) {
                d.execute(this.c);
            }
        }
    }
}
