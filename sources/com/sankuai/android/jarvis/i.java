package com.sankuai.android.jarvis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends ScheduledThreadPoolExecutor {
    public static ChangeQuickRedirect a;
    private static final b c = new b();
    private final ExecutorService b;

    public i(String str, int i, n nVar, boolean z) {
        super(i);
        Object[] objArr = {str, Integer.valueOf(i), nVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be0a89380fe0882c94ec93e886c919e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be0a89380fe0882c94ec93e886c919e0");
        } else if (z) {
            this.b = com.sankuai.android.jarvis.c.a(str);
        } else {
            this.b = com.sankuai.android.jarvis.c.a(str, i, i, 1L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) null, nVar);
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Object[] objArr = {runnable, new Long(j), timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077bd5e530e1b6bd9458f6179e34611d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077bd5e530e1b6bd9458f6179e34611d");
        }
        if (isShutdown()) {
            return c;
        }
        FutureTask futureTask = new FutureTask(runnable, null);
        return new c(f.a().d().schedule(new a(this.b, futureTask), j, timeUnit), futureTask);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        Object[] objArr = {callable, new Long(j), timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97147533ecdafc0e5ef6d185dd589db4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97147533ecdafc0e5ef6d185dd589db4");
        }
        if (isShutdown()) {
            return c;
        }
        FutureTask futureTask = new FutureTask(callable);
        return new c(f.a().d().schedule(new a(this.b, futureTask), j, timeUnit), futureTask);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, long j, final long j2, final TimeUnit timeUnit) {
        Object[] objArr = {runnable, new Long(j), new Long(j2), timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9560c966876f7f126278fb8f77c3b18", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9560c966876f7f126278fb8f77c3b18");
        }
        if (isShutdown()) {
            return c;
        }
        final a aVar = new a(this.b, null);
        d dVar = new d(new Runnable() { // from class: com.sankuai.android.jarvis.i.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6fab6711c21fff767d5cad29a12557e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6fab6711c21fff767d5cad29a12557e");
                } else if (i.this.isShutdown()) {
                } else {
                    f.a().d().schedule(aVar, j2, timeUnit);
                    runnable.run();
                }
            }
        }, null);
        aVar.b = dVar;
        return new c(f.a().d().schedule(aVar, j, timeUnit), dVar);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, long j, final long j2, final TimeUnit timeUnit) {
        Object[] objArr = {runnable, new Long(j), new Long(j2), timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9389cc8355a7f1fc12c0769ebbf7e3dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9389cc8355a7f1fc12c0769ebbf7e3dd");
        }
        if (isShutdown()) {
            return c;
        }
        final a aVar = new a(this.b, null);
        d dVar = new d(new Runnable() { // from class: com.sankuai.android.jarvis.i.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69946513a840218f35c371031f12d1a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69946513a840218f35c371031f12d1a6");
                } else if (i.this.isShutdown()) {
                } else {
                    runnable.run();
                    f.a().d().schedule(aVar, j2, timeUnit);
                }
            }
        }, null);
        aVar.b = dVar;
        return new c(f.a().d().schedule(aVar, j, timeUnit), dVar);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "844c3ac334b451c8458157790bd000e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "844c3ac334b451c8458157790bd000e4");
        }
        super.shutdownNow();
        return this.b.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final int getPoolSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "620bd999fd784ef30c30861a7fa56ce1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "620bd999fd784ef30c30861a7fa56ce1")).intValue();
        }
        if (this.b instanceof j) {
            return 1;
        }
        if (this.b instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) this.b).getPoolSize();
        }
        return super.getPoolSize();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final int getActiveCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5edb545b5fba173659bab844a3f3b226", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5edb545b5fba173659bab844a3f3b226")).intValue();
        }
        if (this.b instanceof j) {
            return 1;
        }
        if (this.b instanceof ThreadPoolExecutor) {
            return ((ThreadPoolExecutor) this.b).getActiveCount();
        }
        return super.getActiveCount();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class d<V> extends FutureTask<V> {
        public static ChangeQuickRedirect a;

        public d(Runnable runnable, V v) {
            super(runnable, null);
            Object[] objArr = {runnable, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c93d6fa5d56dedada8fb569190af60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c93d6fa5d56dedada8fb569190af60");
            }
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc8db7de4f6f4ba055db081d5369dfb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc8db7de4f6f4ba055db081d5369dfb8");
            } else {
                super.runAndReset();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b<V> implements ScheduledFuture<V> {
        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return true;
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return 0;
        }

        @Override // java.util.concurrent.Future
        public final V get() throws InterruptedException, ExecutionException {
            return null;
        }

        @Override // java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return null;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return false;
        }

        public b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class c<V> implements ScheduledFuture<V> {
        public static ChangeQuickRedirect a;
        private final ScheduledFuture<V> b;
        private final FutureTask<V> c;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Delayed delayed) {
            Delayed delayed2 = delayed;
            Object[] objArr = {delayed2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d96e582897da59c66f26d2012e811b69", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d96e582897da59c66f26d2012e811b69")).intValue() : this.b.compareTo(delayed2);
        }

        public c(ScheduledFuture<V> scheduledFuture, FutureTask<V> futureTask) {
            Object[] objArr = {scheduledFuture, futureTask};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d0a4e078b105ec406608523c0297b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d0a4e078b105ec406608523c0297b2");
                return;
            }
            this.b = scheduledFuture;
            this.c = futureTask;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            Object[] objArr = {timeUnit};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0144cd1abb6e55cf53db0913cf7dd77f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0144cd1abb6e55cf53db0913cf7dd77f")).longValue() : this.b.getDelay(timeUnit);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40f32285c7568cd0b054bd954c9b5aa9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40f32285c7568cd0b054bd954c9b5aa9")).booleanValue();
            }
            return this.c.cancel(z) || this.b.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c8cb069326a80a80406def0a48fd33", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c8cb069326a80a80406def0a48fd33")).booleanValue() : this.b.isCancelled() | this.c.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24500e71e04645fac3f16d7e1ba91f3a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24500e71e04645fac3f16d7e1ba91f3a")).booleanValue() : this.b.isDone() && this.c.isDone();
        }

        @Override // java.util.concurrent.Future
        public final V get() throws InterruptedException, ExecutionException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3941b69cf788c4392527652fcc3f41", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3941b69cf788c4392527652fcc3f41") : this.c.get();
        }

        @Override // java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            Object[] objArr = {new Long(j), timeUnit};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b09dd9574e098b420e10ccf8b4e3a65f", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b09dd9574e098b420e10ccf8b4e3a65f") : this.c.get(j, timeUnit);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a implements Runnable {
        public static ChangeQuickRedirect a;
        Runnable b;
        private Executor c;

        public a(Executor executor, Runnable runnable) {
            Object[] objArr = {executor, runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7cf5596343a808ab05c8c0bc8aa963", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7cf5596343a808ab05c8c0bc8aa963");
                return;
            }
            this.c = executor;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3771fa2fbd8df1b97b5508240082b119", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3771fa2fbd8df1b97b5508240082b119");
            } else {
                this.c.execute(this.b);
            }
        }
    }
}
