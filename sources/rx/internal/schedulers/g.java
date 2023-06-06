package rx.internal.schedulers;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class g extends g.a implements rx.k {
    private static final boolean e;
    private static volatile Object h;
    private static final Object i;
    private final rx.plugins.f a;
    final ScheduledExecutorService b;
    volatile boolean c;
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f = new ConcurrentHashMap<>();
    private static final AtomicReference<ScheduledExecutorService> g = new AtomicReference<>();
    public static final int d = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int b = rx.internal.util.h.b();
        e = !z && (b == 0 || b >= 21);
        i = new Object();
    }

    public static void a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            if (g.get() != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new rx.internal.util.k("RxSchedulerPurge-"));
            if (g.compareAndSet(null, newScheduledThreadPool)) {
                newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: rx.internal.schedulers.g.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.a();
                    }
                }, d, d, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static void a(ScheduledExecutorService scheduledExecutorService) {
        f.remove(scheduledExecutorService);
    }

    static void a() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (!next.isShutdown()) {
                    next.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            rx.exceptions.b.b(th);
            rx.plugins.e.a().b();
        }
    }

    public static boolean b(ScheduledExecutorService scheduledExecutorService) {
        Method c;
        if (e) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = h;
                if (obj == i) {
                    return false;
                }
                if (obj == null) {
                    c = c(scheduledExecutorService);
                    h = c != null ? c : i;
                } else {
                    c = (Method) obj;
                }
            } else {
                c = c(scheduledExecutorService);
            }
            if (c != null) {
                try {
                    c.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (Exception unused) {
                    rx.plugins.e.a().b();
                }
            }
        }
        return false;
    }

    private static Method c(ScheduledExecutorService scheduledExecutorService) {
        Method[] methods;
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public g(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!b(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            a((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.a = rx.plugins.e.a().d();
        this.b = newScheduledThreadPool;
    }

    @Override // rx.g.a
    public final rx.k a(rx.functions.a aVar) {
        return a(aVar, 0L, null);
    }

    @Override // rx.g.a
    public final rx.k a(rx.functions.a aVar, long j, TimeUnit timeUnit) {
        if (this.c) {
            return rx.subscriptions.e.b();
        }
        return b(aVar, j, timeUnit);
    }

    public final h b(rx.functions.a aVar, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        h hVar = new h(rx.plugins.f.a(aVar));
        if (j <= 0) {
            schedule = this.b.submit(hVar);
        } else {
            schedule = this.b.schedule(hVar, j, timeUnit);
        }
        hVar.a(schedule);
        return hVar;
    }

    @Override // rx.k
    public void unsubscribe() {
        this.c = true;
        this.b.shutdownNow();
        a(this.b);
    }

    @Override // rx.k
    public boolean isUnsubscribed() {
        return this.c;
    }
}
