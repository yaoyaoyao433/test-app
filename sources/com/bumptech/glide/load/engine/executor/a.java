package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.util.Log;
import com.sankuai.android.jarvis.n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.sankuai.android.jarvis.a {
    private final AtomicInteger a;
    private final c b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum c {
        IGNORE,
        LOG { // from class: com.bumptech.glide.load.engine.executor.a.c.1
            @Override // com.bumptech.glide.load.engine.executor.a.c
            protected final void a(Throwable th) {
                if (Log.isLoggable("PriorityExecutor", 6)) {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", th);
                }
            }
        },
        THROW { // from class: com.bumptech.glide.load.engine.executor.a.c.2
            @Override // com.bumptech.glide.load.engine.executor.a.c
            protected final void a(Throwable th) {
                super.a(th);
                throw new RuntimeException(th);
            }
        };

        protected void a(Throwable th) {
        }
    }

    public a(int i) {
        this(i, c.LOG);
    }

    private a(int i, c cVar) {
        this(i, i, 0L, TimeUnit.MILLISECONDS, new ThreadFactoryC0041a(), cVar);
    }

    private a(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, c cVar) {
        super("glide-fifo", i, i2, 0L, timeUnit, new PriorityBlockingQueue(), threadFactory, null, n.PRIORITY_LOW);
        this.a = new AtomicInteger();
        this.b = cVar;
    }

    @Override // com.sankuai.android.jarvis.a, java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new b(runnable, t, this.a.getAndIncrement());
    }

    @Override // com.sankuai.android.jarvis.a, java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (!future.isDone() || future.isCancelled()) {
                return;
            }
            try {
                future.get();
            } catch (InterruptedException e) {
                this.b.a(e);
            } catch (ExecutionException e2) {
                this.b.a(e2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.load.engine.executor.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC0041a implements ThreadFactory {
        int a = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "fifo-pool-thread-" + this.a) { // from class: com.bumptech.glide.load.engine.executor.a.a.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            this.a = this.a + 1;
            return thread;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class b<T> extends FutureTask<T> implements Comparable<b<?>> {
        private final int a;
        private final int b;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(b<?> bVar) {
            b<?> bVar2 = bVar;
            int i = this.a - bVar2.a;
            return i == 0 ? this.b - bVar2.b : i;
        }

        public b(Runnable runnable, T t, int i) {
            super(runnable, t);
            if (!(runnable instanceof com.bumptech.glide.load.engine.executor.b)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.a = ((com.bumptech.glide.load.engine.executor.b) runnable).a();
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.a == bVar.a;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }
    }
}
