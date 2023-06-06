package com.sankuai.android.jarvis;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.l;
import java.io.PrintStream;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f {
    public static ChangeQuickRedirect a;
    boolean b;
    com.sankuai.android.jarvis.b c;
    ExecutorService d;
    Executor e;
    public boolean f;
    public boolean g;
    public boolean h;
    private volatile boolean i;
    private boolean j;
    private ScheduledExecutorService k;
    private Executor l;
    private c m;
    private ScheduledExecutorService n;
    private final ConcurrentHashMap<String, ThreadPoolExecutor> o;
    private int p;
    private long q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class d {
        private static final f a = new f();
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85c8436820fd4ff74b426cb4dd03321a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85c8436820fd4ff74b426cb4dd03321a");
            return;
        }
        this.o = new ConcurrentHashMap<>();
        this.f = false;
        this.g = false;
        this.h = false;
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49eb684ff06a7ae35d51240e6c46028d", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49eb684ff06a7ae35d51240e6c46028d") : d.a;
    }

    public final synchronized boolean a(com.sankuai.android.jarvis.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a78bae2e2d449625d4395f185056dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a78bae2e2d449625d4395f185056dcf")).booleanValue();
        }
        com.sankuai.android.jarvis.d eVar = dVar == null ? new e() : dVar;
        if (this.i) {
            return false;
        }
        this.j = true;
        this.b = false;
        if (this.j) {
            this.g = eVar.h();
            this.c = eVar.g();
            this.h = false;
            if (this.c == null) {
                throw new RuntimeException("JarvisReporter为null，需要实现JarvisReporter用于上报日志分析,详情参见:https://km.sankuai.com/page/1418231164");
            }
            int a2 = eVar.a();
            if (a2 <= 0) {
                a2 = 24;
            }
            int c2 = eVar.c();
            if (c2 <= 0) {
                c2 = 200;
            }
            int i = c2 < a2 ? a2 : c2;
            long e = eVar.e();
            if (e <= 0) {
                e = 10;
            }
            long j = e > 60 ? 60L : e;
            int f = eVar.f();
            int i2 = f <= 0 ? 10 : f;
            this.p = eVar.d();
            if (this.p <= 0) {
                this.p = 20;
            }
            this.q = 0L;
            this.f = false;
            this.d = new l(a2, i, j, TimeUnit.SECONDS, new LinkedBlockingQueue(), i2, new k("J", this.q), new b(), new a());
            int b2 = eVar.b();
            if (b2 <= 0) {
                b2 = 1;
            }
            this.k = new ScheduledThreadPoolExecutor(b2, new k("S", this.q));
            this.e = new j(AppUtil.CacheKey.SERIAL);
            this.l = b("parallel", 1, 20, 3L, TimeUnit.SECONDS, new SynchronousQueue(), null, null, null);
            this.m = new c();
            final c cVar = this.m;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "c34ba28c80714fb76c7cabbdd859c7a6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "c34ba28c80714fb76c7cabbdd859c7a6");
            } else {
                f.this.h().scheduleAtFixedRate(new Runnable() { // from class: com.sankuai.android.jarvis.f.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        long b3;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "520d5550181cf317c8e45ba3a100bf8d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "520d5550181cf317c8e45ba3a100bf8d");
                            return;
                        }
                        f fVar = f.this;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "807939ad06551cc42b6c1cd697966e7a", RobustBitConfig.DEFAULT_VALUE)) {
                            b3 = ((Long) PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "807939ad06551cc42b6c1cd697966e7a")).longValue();
                        } else {
                            b3 = fVar.d instanceof l ? ((l) fVar.d).b() : 0L;
                        }
                        if (c.this.b > 0 && c.this.b == b3 && f.this.b() > 0) {
                            System.out.println("Jarvis ThreadPool Blocked, add worker");
                            l lVar = (l) f.this.d;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = l.a;
                            if (PatchProxy.isSupport(objArr5, lVar, changeQuickRedirect5, false, "93c25caa52d3fb6c6f32e9bfa96c592a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, lVar, changeQuickRedirect5, false, "93c25caa52d3fb6c6f32e9bfa96c592a");
                            } else {
                                int a3 = l.a(lVar.b.get());
                                if (a3 < lVar.f) {
                                    lVar.a((Runnable) null, true);
                                } else if (a3 < lVar.g) {
                                    lVar.a((Runnable) null, false);
                                }
                            }
                            StringBuilder sb = new StringBuilder("Jarvis ThreadPool Blocked: \n");
                            sb.append("workQueueSize: ");
                            sb.append(f.this.b());
                            sb.append("\n");
                            if (f.this.h) {
                                com.sankuai.android.jarvis.b bVar = f.a().c;
                                bVar.a("jarvis线程池worker卡死堆栈: " + ((l) f.this.d).a(sb));
                            } else {
                                com.sankuai.android.jarvis.b bVar2 = f.a().c;
                                bVar2.a("jarvis线程池worker卡死线程名称: " + ((l) f.this.d).b(sb));
                            }
                        }
                        c.this.b = b3;
                    }
                }, 10L, 10L, TimeUnit.SECONDS);
            }
        }
        this.i = true;
        return true;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b03fe9064b66cb3fb7e74dc9b6a594a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b03fe9064b66cb3fb7e74dc9b6a594a9")).intValue();
        }
        if (this.d instanceof l) {
            return ((l) this.d).c.size();
        }
        return 0;
    }

    public final boolean c() {
        return this.g && this.c != null;
    }

    public final ScheduledExecutorService d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6850e745cc2eeae26c3c4d1624b87042", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6850e745cc2eeae26c3c4d1624b87042");
        }
        if (this.k == null) {
            throw new RuntimeException("You need init first, please use com.sankuai.android.jarvis.Jarvis.init() for initialization.");
        }
        return this.k;
    }

    public final ExecutorService e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a658fc8e2528f7200d382833cab39bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a658fc8e2528f7200d382833cab39bc");
        }
        if (this.d == null) {
            throw new RuntimeException("You need init first, please use com.sankuai.android.jarvis.Jarvis.init() for initialization.");
        }
        return this.d;
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9c93996a4928eb611b6406807b8030", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9c93996a4928eb611b6406807b8030")).booleanValue() : this.j && this.i;
    }

    public final Thread a(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad79db9cb76ef6a9661376387642e461", RobustBitConfig.DEFAULT_VALUE)) {
            return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad79db9cb76ef6a9661376387642e461");
        }
        if (f()) {
            return new o(runnable, str);
        }
        return new Thread(runnable, str);
    }

    public final Executor g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f107a0664ce789abd5fe9287619643c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f107a0664ce789abd5fe9287619643c6");
        }
        if (f()) {
            return this.l;
        }
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public final ExecutorService a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2ac6fde14608d67d4b98b691cc9a2d9", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2ac6fde14608d67d4b98b691cc9a2d9") : a(str, (n) null);
    }

    public final ExecutorService a(String str, n nVar) {
        Object[] objArr = {str, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416b6737d5a1f3f330c2697582ed2fd5", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416b6737d5a1f3f330c2697582ed2fd5") : a(str, (ThreadFactory) null, nVar);
    }

    public final ExecutorService a(String str, ThreadFactory threadFactory, n nVar) {
        Object[] objArr = {str, threadFactory, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c23c0791133aab6eb0740c8763d13c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c23c0791133aab6eb0740c8763d13c");
        }
        if (f()) {
            return new j(str, true, nVar);
        }
        if (threadFactory == null) {
            return Executors.newSingleThreadExecutor(new k(str, nVar, this.q));
        }
        return Executors.newSingleThreadExecutor(threadFactory);
    }

    public final ExecutorService a(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a451249439eb39c2c55bdbc902a82be7", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a451249439eb39c2c55bdbc902a82be7") : a(str, (ThreadFactory) null, str2, j);
    }

    private ExecutorService a(String str, ThreadFactory threadFactory, String str2, long j) {
        long j2 = j;
        Object[] objArr = {str, null, str2, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d3658bc01e52a207681a0047a19958", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d3658bc01e52a207681a0047a19958");
        }
        if (f()) {
            if (TextUtils.isEmpty(str2) && this.b) {
                throw new IllegalArgumentException("业务持有的单线程池，需要声明业务名称。");
            }
            if (j2 <= 0 || j2 > 60) {
                if (this.b) {
                    throw new IllegalArgumentException("keepAliveTime can't greater than 60 or less than 0, the unit of keepAliveTime is seconds.");
                }
                j2 = 60;
            }
            ThreadPoolExecutor threadPoolExecutor = this.o.get(str2);
            if (threadPoolExecutor == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new k(str, this.q));
                threadPoolExecutor2.setKeepAliveTime(j2, TimeUnit.SECONDS);
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                this.o.put(str2, threadPoolExecutor2);
                return threadPoolExecutor2;
            }
            return threadPoolExecutor;
        }
        return Executors.newSingleThreadExecutor(new k(str, this.q));
    }

    public final ExecutorService a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26556d0f70cacf6e3352027dc6d24de2", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26556d0f70cacf6e3352027dc6d24de2") : a(str, i, (n) null);
    }

    private ExecutorService a(String str, int i, n nVar) {
        Object[] objArr = {str, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845070030ef3489e614f633afbc8de75", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845070030ef3489e614f633afbc8de75") : a(str, i, (ThreadFactory) null, (n) null);
    }

    public final ExecutorService a(String str, int i, ThreadFactory threadFactory, n nVar) {
        Object[] objArr = {str, Integer.valueOf(i), threadFactory, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5192a1a00f0c0c09df63f663bb0a54", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5192a1a00f0c0c09df63f663bb0a54");
        }
        if (f()) {
            return b(str, i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, null, nVar);
        }
        if (threadFactory == null) {
            return Executors.newFixedThreadPool(i, new k(str, nVar, this.q));
        }
        return Executors.newFixedThreadPool(i, threadFactory);
    }

    public final ExecutorService b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8346559ce0dd186b2395d5a17881ef", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8346559ce0dd186b2395d5a17881ef") : c(str, null);
    }

    private ExecutorService c(String str, n nVar) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa75f9272fe9732bedae2a9bf095a43", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa75f9272fe9732bedae2a9bf095a43") : b(str, (ThreadFactory) null, (n) null);
    }

    public final ExecutorService b(String str, ThreadFactory threadFactory, n nVar) {
        Object[] objArr = {str, threadFactory, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4894871e6971c8c3ef2550daa382d550", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4894871e6971c8c3ef2550daa382d550");
        }
        if (f()) {
            return b(str, 0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory, null, nVar);
        }
        if (threadFactory == null) {
            return Executors.newCachedThreadPool(new k(str, nVar, this.q));
        }
        return Executors.newCachedThreadPool(threadFactory);
    }

    public final ScheduledExecutorService c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2d00df5b34618e41bf08e5478d0229", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2d00df5b34618e41bf08e5478d0229") : b(str, (n) null);
    }

    public final ScheduledExecutorService b(String str, n nVar) {
        Object[] objArr = {str, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b3bc46c697f2051523eadd9c3c152b", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b3bc46c697f2051523eadd9c3c152b") : c(str, null, nVar);
    }

    private ScheduledExecutorService c(String str, ThreadFactory threadFactory, n nVar) {
        Object[] objArr = {str, null, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c946e3e8c915ae39fdfc099e60df9f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c946e3e8c915ae39fdfc099e60df9f1");
        }
        if (f()) {
            return a(str, 1, null, nVar, true);
        }
        return Executors.newSingleThreadScheduledExecutor(new k(str, nVar, this.q));
    }

    public final ScheduledExecutorService b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83c842fc291ef47a47a217e645ea038", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83c842fc291ef47a47a217e645ea038") : b(str, i, (n) null);
    }

    private ScheduledExecutorService b(String str, int i, n nVar) {
        Object[] objArr = {str, Integer.valueOf(i), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1dc273f7596301f7b353dea4e0d8b0", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1dc273f7596301f7b353dea4e0d8b0") : b(str, i, null, null);
    }

    public final ScheduledExecutorService b(String str, int i, ThreadFactory threadFactory, n nVar) {
        Object[] objArr = {str, Integer.valueOf(i), threadFactory, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e857a263d0d9b873192178c407aa6860", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e857a263d0d9b873192178c407aa6860");
        }
        if (f()) {
            return a(str, i, threadFactory, nVar, false);
        }
        if (threadFactory == null) {
            return Executors.newScheduledThreadPool(i, new k(str, nVar, this.q));
        }
        return Executors.newScheduledThreadPool(i, threadFactory);
    }

    public final ThreadPoolExecutor a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, n nVar) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f955e9514de9774d3904bf342f5216f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f955e9514de9774d3904bf342f5216f1");
        }
        if (f()) {
            return b(str, i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, nVar);
        }
        int i3 = i < 0 ? 24 : i;
        int i4 = i2 <= 0 ? 200 : i2;
        if (i4 < i3) {
            i4 = i3;
        }
        long j2 = j < 0 ? 10L : j;
        if (threadFactory == null || rejectedExecutionHandler == null) {
            if (threadFactory != null) {
                return new ThreadPoolExecutor(i3, i4, j2, timeUnit, blockingQueue, threadFactory);
            }
            if (rejectedExecutionHandler != null) {
                return new ThreadPoolExecutor(i3, i4, j2, timeUnit, blockingQueue, new k(str, this.q), rejectedExecutionHandler);
            }
            return new ThreadPoolExecutor(i3, i4, j2, timeUnit, blockingQueue, new k(str, this.q));
        }
        return new ThreadPoolExecutor(i3, i4, j2, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    private ScheduledExecutorService a(String str, int i, ThreadFactory threadFactory, n nVar, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), threadFactory, nVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a49c679d6e3388bd0f7ea2388fa82e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a49c679d6e3388bd0f7ea2388fa82e");
        }
        if (this.b && threadFactory != null) {
            d("开启Jarvis统一线程方案时，设置threadFactory是无效的，相关问题大象咨询zhagnlifeng or qinzhe." + Log.getStackTraceString(new Throwable()));
        }
        return new i(str, i, nVar, z);
    }

    private ThreadPoolExecutor b(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, n nVar) {
        int i3;
        int i4;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d840a071a0fa111be36489ea9b71488b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d840a071a0fa111be36489ea9b71488b");
        }
        if (this.b) {
            if (threadFactory != null) {
                d("开启Jarvis统一线程方案时，设置threadFactory是无效的，相关问题大象咨询zhagnlifeng or qinzhe." + Log.getStackTraceString(new Throwable()));
            }
            if (rejectedExecutionHandler != null) {
                d("开启Jarvis统一线程方案时，设置RejectedExecutionHandler是无效的，相关问题大象咨询zhagnlifeng or qinzhe.");
            }
        }
        int min = Math.min(i2, this.p);
        if (min <= 0) {
            i4 = i;
            i3 = 200;
        } else {
            i3 = min;
            i4 = i;
        }
        if (i3 < i4) {
            i3 = i4;
        }
        return new m(str, i, i3, j, timeUnit, blockingQueue, nVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class b implements l.c {
        public static ChangeQuickRedirect a;
        private static volatile boolean b;
        private static volatile boolean c;

        public b() {
        }

        @Override // com.sankuai.android.jarvis.l.c
        public final void a(int i, AbstractExecutorService abstractExecutorService) {
            Object[] objArr = {Integer.valueOf(i), abstractExecutorService};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0661394d3275d19bb4dafa50d54b612", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0661394d3275d19bb4dafa50d54b612");
                return;
            }
            if (!c && i >= 500) {
                g.c(i);
                c = true;
            }
            if (b || !f.a().c() || i < 500) {
                return;
            }
            b = true;
            g.b(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a implements l.b {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.sankuai.android.jarvis.l.b
        public final void a(Runnable runnable, AbstractExecutorService abstractExecutorService) {
            Object[] objArr = {runnable, abstractExecutorService};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1200a42967c275e98722a81f3996fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1200a42967c275e98722a81f3996fc");
                return;
            }
            PrintStream printStream = System.out;
            printStream.println("Jarvis rejectedExecution " + runnable);
        }
    }

    public final ScheduledExecutorService h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1d80071ce4be0228a489638af410e4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1d80071ce4be0228a489638af410e4a");
        }
        if (this.n == null) {
            synchronized (f.class) {
                if (this.n == null) {
                    this.n = Executors.newSingleThreadScheduledExecutor(new k("jarvis-checker", this.q));
                }
            }
        }
        return this.n;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class c {
        public static ChangeQuickRedirect a;
        long b;

        private c() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2904246618805f3bd941dc88185b5023", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2904246618805f3bd941dc88185b5023");
            }
        }
    }

    private static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97ff19d2f9fdad3e9d79e79e80d017b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97ff19d2f9fdad3e9d79e79e80d017b7");
            return;
        }
        PrintStream printStream = System.err;
        printStream.println("JarvisLogger>>> " + str);
    }
}
