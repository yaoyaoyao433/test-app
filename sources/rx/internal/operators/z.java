package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.d;
import rx.g;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class z<T> implements d.b<T, T> {
    private final rx.g a;
    private final boolean b;
    private final int c;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        if ((this.a instanceof rx.internal.schedulers.e) || (this.a instanceof rx.internal.schedulers.k)) {
            return jVar;
        }
        final a aVar = new a(this.a, jVar, this.b, this.c);
        rx.j<? super T> jVar2 = aVar.a;
        jVar2.setProducer(new rx.f() { // from class: rx.internal.operators.z.a.1
            @Override // rx.f
            public final void a(long j) {
                if (j > 0) {
                    rx.internal.operators.a.a(a.this.h, j);
                    a.this.b();
                }
            }
        });
        jVar2.add(aVar.b);
        jVar2.add(aVar);
        return aVar;
    }

    public z(rx.g gVar, boolean z, int i) {
        this.a = gVar;
        this.b = z;
        this.c = i <= 0 ? rx.internal.util.j.c : i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a<T> extends rx.j<T> implements rx.functions.a {
        final rx.j<? super T> a;
        final g.a b;
        final boolean d;
        final Queue<Object> e;
        final int f;
        volatile boolean g;
        Throwable j;
        long k;
        final AtomicLong h = new AtomicLong();
        final AtomicLong i = new AtomicLong();
        final c<T> c = c.a();

        public a(rx.g gVar, rx.j<? super T> jVar, boolean z, int i) {
            this.a = jVar;
            this.b = gVar.a();
            this.d = z;
            i = i <= 0 ? rx.internal.util.j.c : i;
            this.f = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.e = new SpscArrayQueue(i);
            } else {
                this.e = new rx.internal.util.atomic.c(i);
            }
            request(i);
        }

        @Override // rx.e
        public final void onNext(T t) {
            if (isUnsubscribed() || this.g) {
                return;
            }
            if (!this.e.offer(c.a(t))) {
                onError(new rx.exceptions.c());
            } else {
                b();
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            if (isUnsubscribed() || this.g) {
                return;
            }
            this.g = true;
            b();
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            if (isUnsubscribed() || this.g) {
                rx.plugins.e.a().b();
                return;
            }
            this.j = th;
            this.g = true;
            b();
        }

        protected final void b() {
            if (this.i.getAndIncrement() == 0) {
                this.b.a(this);
            }
        }

        @Override // rx.functions.a
        public final void a() {
            int i;
            long j = this.k;
            Queue<Object> queue = this.e;
            rx.j<? super T> jVar = this.a;
            long j2 = j;
            long j3 = 1;
            do {
                long j4 = this.h.get();
                while (true) {
                    i = (j4 > j2 ? 1 : (j4 == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.g;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!a(z, z2, jVar, queue)) {
                        if (z2) {
                            break;
                        }
                        jVar.onNext((Object) c.c(poll));
                        j2++;
                        if (j2 == this.f) {
                            j4 = rx.internal.operators.a.b(this.h, j2);
                            request(j2);
                            j2 = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (i == 0 && a(this.g, queue.isEmpty(), jVar, queue)) {
                    return;
                }
                this.k = j2;
                j3 = this.i.addAndGet(-j3);
            } while (j3 != 0);
        }

        private boolean a(boolean z, boolean z2, rx.j<? super T> jVar, Queue<Object> queue) {
            if (jVar.isUnsubscribed()) {
                queue.clear();
                return true;
            } else if (z) {
                if (this.d) {
                    if (z2) {
                        Throwable th = this.j;
                        try {
                            if (th != null) {
                                jVar.onError(th);
                            } else {
                                jVar.onCompleted();
                            }
                            return false;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return false;
                }
                Throwable th3 = this.j;
                if (th3 != null) {
                    queue.clear();
                    try {
                        jVar.onError(th3);
                        return true;
                    } finally {
                    }
                } else if (z2) {
                    try {
                        jVar.onCompleted();
                        return true;
                    } finally {
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
