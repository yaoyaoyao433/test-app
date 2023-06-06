package com.tencent.open.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    private static Handler c;
    private static HandlerThread d;
    private static Object b = new Object();
    public static final Executor a = c();

    private static Executor c() {
        return new ThreadPoolExecutor(0, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static void a(Runnable runnable) {
        try {
            com.sankuai.waimai.launcher.util.aop.b.a(a, runnable);
        } catch (RejectedExecutionException unused) {
        }
    }

    public static Handler a() {
        if (c == null) {
            synchronized (j.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                d = handlerThread;
                handlerThread.start();
                c = new Handler(d.getLooper());
            }
        }
        return c;
    }

    public static void b(Runnable runnable) {
        a().post(runnable);
    }

    public static Executor b() {
        return new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements Executor {
        final Queue<Runnable> a;
        Runnable b;

        private a() {
            this.a = new LinkedList();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            this.a.offer(new Runnable() { // from class: com.tencent.open.utils.j.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        a.this.a();
                    }
                }
            });
            if (this.b == null) {
                a();
            }
        }

        protected synchronized void a() {
            Runnable poll = this.a.poll();
            this.b = poll;
            if (poll != null) {
                j.a.execute(this.b);
            }
        }
    }
}
