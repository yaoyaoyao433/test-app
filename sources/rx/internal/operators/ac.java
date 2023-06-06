package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ac<T> implements d.b<T, T> {

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a {
        public static final ac<Object> a = new ac<>();
    }

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        b bVar = new b(jVar);
        c<? super T> cVar = new c<>(bVar);
        bVar.b = cVar;
        jVar.add(cVar);
        jVar.add(bVar);
        jVar.setProducer(bVar);
        return cVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T> extends AtomicLong implements rx.e<T>, rx.f, rx.k {
        static final Object h = new Object();
        private static final long serialVersionUID = -1364393685005146274L;
        final rx.j<? super T> a;
        c<? super T> b;
        final AtomicReference<Object> c = new AtomicReference<>(h);
        Throwable d;
        volatile boolean e;
        boolean f;
        boolean g;

        public b(rx.j<? super T> jVar) {
            this.a = jVar;
            lazySet(-4611686018427387904L);
        }

        @Override // rx.f
        public final void a(long j) {
            long j2;
            int i;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    i = (j2 > (-4611686018427387904L) ? 1 : (j2 == (-4611686018427387904L) ? 0 : -1));
                    if (i == 0) {
                        j3 = j;
                    } else {
                        j3 = j2 + j;
                        if (j3 < 0) {
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } while (!compareAndSet(j2, j3));
                if (i == 0) {
                    this.b.a(Long.MAX_VALUE);
                }
                a();
            }
        }

        private long b(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return j2;
                }
                j3 = j2 - 1;
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.k
        public final void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }

        @Override // rx.e
        public final void onNext(T t) {
            this.c.lazySet(t);
            a();
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            this.d = th;
            this.e = true;
            a();
        }

        @Override // rx.e
        public final void onCompleted() {
            this.e = true;
            a();
        }

        private void a() {
            boolean z;
            synchronized (this) {
                boolean z2 = true;
                if (this.f) {
                    this.g = true;
                    return;
                }
                this.f = true;
                this.g = false;
                while (true) {
                    try {
                        long j = get();
                        if (j == Long.MIN_VALUE) {
                            return;
                        }
                        Object obj = this.c.get();
                        if (j > 0 && obj != h) {
                            this.a.onNext(obj);
                            this.c.compareAndSet(obj, h);
                            b(1L);
                            obj = h;
                        }
                        if (obj == h && this.e) {
                            Throwable th = this.d;
                            if (th != null) {
                                this.a.onError(th);
                            } else {
                                this.a.onCompleted();
                            }
                        }
                        try {
                            synchronized (this) {
                                try {
                                    if (!this.g) {
                                        this.f = false;
                                        return;
                                    }
                                    this.g = false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = false;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            z = z2;
                            th = th4;
                            if (!z) {
                                synchronized (this) {
                                    this.f = false;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class c<T> extends rx.j<T> {
        private final b<T> a;

        c(b<T> bVar) {
            this.a = bVar;
        }

        @Override // rx.j
        public final void onStart() {
            request(0L);
        }

        @Override // rx.e
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.e
        public final void onCompleted() {
            this.a.onCompleted();
        }

        final void a(long j) {
            request(Long.MAX_VALUE);
        }
    }
}
