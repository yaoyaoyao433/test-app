package rx;

import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class g {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static abstract class a implements k {
        public abstract k a(rx.functions.a aVar);

        public abstract k a(rx.functions.a aVar, long j, TimeUnit timeUnit);
    }

    public abstract a a();

    public static long b() {
        return System.currentTimeMillis();
    }
}
