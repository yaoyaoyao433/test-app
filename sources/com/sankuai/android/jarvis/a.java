package com.sankuai.android.jarvis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a extends ThreadPoolExecutor {
    public static ChangeQuickRedirect c;
    private ThreadPoolExecutor a;

    public a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, 1000L, timeUnit, blockingQueue, rejectedExecutionHandler);
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), 1000L, timeUnit, blockingQueue, rejectedExecutionHandler};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3144a23cb2484260d3de810aa9dffedf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3144a23cb2484260d3de810aa9dffedf");
        } else {
            a(str, i, i2, 1000L, timeUnit, blockingQueue, null, rejectedExecutionHandler, null);
        }
    }

    public a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, n nVar) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, new ThreadPoolExecutor.AbortPolicy());
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory, null, nVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cc483769051d3798f60643f6b1837d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cc483769051d3798f60643f6b1837d");
        } else {
            a(str, i, i2, j, timeUnit, blockingQueue, threadFactory, null, nVar);
        }
    }

    private void a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, n nVar) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, nVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e2980f8b41bf14e1cd96fa2ea16c6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e2980f8b41bf14e1cd96fa2ea16c6d");
        } else if (f.a().f()) {
            setCorePoolSize(1);
            setMaximumPoolSize(1);
            setKeepAliveTime(100L, TimeUnit.MILLISECONDS);
            allowCoreThreadTimeOut(true);
            this.a = c.a(str, i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, nVar);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1f7d31677e8bc8bb746131ff78faeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1f7d31677e8bc8bb746131ff78faeb");
        }
        if (this.a != null) {
            return this.a.shutdownNow();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab99dd82316d10267bcebe626bd4b160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab99dd82316d10267bcebe626bd4b160");
            return;
        }
        if (this.a != null) {
            this.a.shutdown();
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4cf3a0e3ddbc91cca9f4410b6c07d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4cf3a0e3ddbc91cca9f4410b6c07d1");
        } else if (this.a == null) {
            super.execute(runnable);
        } else if (runnable instanceof Comparable) {
            this.a.execute(new C0537a((Comparable) runnable));
        } else {
            this.a.execute(new b(runnable));
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        Object[] objArr = {callable};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66ea4566ec3ec215094b0c674f39be7", RobustBitConfig.DEFAULT_VALUE) ? (RunnableFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66ea4566ec3ec215094b0c674f39be7") : super.newTaskFor(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        Object[] objArr = {runnable, t};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01946396ecb5d6a9700e4eff517dd1f3", RobustBitConfig.DEFAULT_VALUE) ? (RunnableFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01946396ecb5d6a9700e4eff517dd1f3") : super.newTaskFor(runnable, t);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        Object[] objArr = {thread, runnable};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07225c03515b222b215ed4d564425cd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07225c03515b222b215ed4d564425cd2");
        } else {
            super.beforeExecute(thread, runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        Object[] objArr = {runnable, th};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da97fde40f7c8acd57f4ea63ced9eca0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da97fde40f7c8acd57f4ea63ced9eca0");
        } else {
            super.afterExecute(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getPoolSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48f432f8d6bd304df33328bbe58b9f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48f432f8d6bd304df33328bbe58b9f6")).intValue();
        }
        if (this.a != null) {
            return this.a.getPoolSize();
        }
        return super.getPoolSize();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public int getActiveCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e3302c6452603e7213656d8d17fc6a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e3302c6452603e7213656d8d17fc6a3")).intValue();
        }
        if (this.a != null) {
            return this.a.getActiveCount();
        }
        return super.getActiveCount();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect d;
        public final Runnable e;

        public b(Runnable runnable) {
            Object[] objArr = {a.this, runnable};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4f2dab73fd1a30dee988ebd3eb00ac6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4f2dab73fd1a30dee988ebd3eb00ac6");
            } else {
                this.e = runnable;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707e54a80550e83873b4055ea91d311f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707e54a80550e83873b4055ea91d311f");
                return;
            }
            a.this.beforeExecute(Thread.currentThread(), this.e);
            try {
                try {
                    try {
                        this.e.run();
                    } catch (Error e) {
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } finally {
                a.this.afterExecute(this.e, null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.android.jarvis.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0537a<T extends Comparable & Runnable> extends b implements Comparable<C0537a> {
        public static ChangeQuickRedirect a;
        public final T b;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(C0537a c0537a) {
            C0537a c0537a2 = c0537a;
            Object[] objArr = {c0537a2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a89095d2f7f7a0cd7303d5b3ee2f32be", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a89095d2f7f7a0cd7303d5b3ee2f32be")).intValue() : this.b.compareTo(c0537a2.b);
        }

        public C0537a(T t) {
            super(t);
            Object[] objArr = {a.this, t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda782575deac72d4dfa3fc05c004a56", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda782575deac72d4dfa3fc05c004a56");
            } else {
                this.b = t;
            }
        }
    }
}
