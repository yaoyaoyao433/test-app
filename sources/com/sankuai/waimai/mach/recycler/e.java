package com.sankuai.waimai.mach.recycler;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.m;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect a;
    public static Executor b;
    private static e c;
    private static final BlockingQueue<Runnable> d = new LinkedBlockingQueue(128);

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49bc4a19fbb69d8045fb5e4b1fa70e0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49bc4a19fbb69d8045fb5e4b1fa70e0c");
        }
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = new e();
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "532ef202037ef09e8594ff8684226103", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "532ef202037ef09e8594ff8684226103");
                    } else {
                        int g = m.g();
                        b = com.sankuai.android.jarvis.c.a("preRender", g, g * 2, 30L, TimeUnit.SECONDS, d, new a("preRender"));
                    }
                }
            }
        }
        return c;
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9340a4f0e799cda0e15777736390539a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9340a4f0e799cda0e15777736390539a");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements ThreadFactory {
        public static ChangeQuickRedirect a;
        private final AtomicInteger b;
        private final String c;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f64622f9e2ea8a5bce6f4a77da2e1a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f64622f9e2ea8a5bce6f4a77da2e1a2");
                return;
            }
            this.b = new AtomicInteger(1);
            this.c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c195d10480c06910184fdc9c0ac281", RobustBitConfig.DEFAULT_VALUE)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c195d10480c06910184fdc9c0ac281");
            }
            String str = "MachExecutor-->" + this.c + "#" + this.b.getAndIncrement();
            new StringBuilder("threadName=").append(str);
            return com.sankuai.android.jarvis.c.a(str, runnable);
        }
    }
}
