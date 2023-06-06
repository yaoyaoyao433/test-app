package rx.internal.operators;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ag<T> implements d.b<T, rx.d<? extends T>> {
    final boolean a;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a {
        public static final ag<Object> a = new ag<>(false);
    }

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        final c cVar = new c(jVar, this.a);
        jVar.add(cVar);
        cVar.a.add(cVar.b);
        cVar.a.add(rx.subscriptions.e.a(new rx.functions.a() { // from class: rx.internal.operators.ag.c.1
            @Override // rx.functions.a
            public final void a() {
                c cVar2 = c.this;
                synchronized (cVar2) {
                    cVar2.j = null;
                }
            }
        }));
        cVar.a.setProducer(new rx.f() { // from class: rx.internal.operators.ag.c.2
            @Override // rx.f
            public final void a(long j) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i > 0) {
                    c.this.a(j);
                } else if (i >= 0) {
                } else {
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j);
                }
            }
        });
        return cVar;
    }

    ag(boolean z) {
        this.a = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class c<T> extends rx.j<rx.d<? extends T>> {
        static final Throwable n = new Throwable("Terminal error");
        final rx.j<? super T> a;
        final boolean c;
        boolean g;
        boolean h;
        long i;
        rx.f j;
        volatile boolean k;
        Throwable l;
        boolean m;
        final rx.subscriptions.d b = new rx.subscriptions.d();
        final AtomicLong d = new AtomicLong();
        final rx.internal.util.atomic.e<Object> e = new rx.internal.util.atomic.e<>(rx.internal.util.j.c);
        final rx.internal.operators.c<T> f = rx.internal.operators.c.a();

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            b bVar;
            rx.d dVar = (rx.d) obj;
            long incrementAndGet = this.d.incrementAndGet();
            rx.k kVar = this.b.a.get().b;
            if (kVar != null) {
                kVar.unsubscribe();
            }
            synchronized (this) {
                bVar = new b(incrementAndGet, this);
                this.m = true;
                this.j = null;
            }
            this.b.a(bVar);
            dVar.a((rx.j) bVar);
        }

        c(rx.j<? super T> jVar, boolean z) {
            this.a = jVar;
            this.c = z;
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            boolean a;
            synchronized (this) {
                a = a(th);
            }
            if (a) {
                this.k = true;
                a();
                return;
            }
            rx.plugins.e.a().b();
        }

        final boolean a(Throwable th) {
            Throwable th2 = this.l;
            if (th2 == n) {
                return false;
            }
            if (th2 == null) {
                this.l = th;
            } else if (th2 instanceof rx.exceptions.a) {
                ArrayList arrayList = new ArrayList(((rx.exceptions.a) th2).a);
                arrayList.add(th);
                this.l = new rx.exceptions.a(arrayList);
            } else {
                this.l = new rx.exceptions.a(th2, th);
            }
            return true;
        }

        @Override // rx.e
        public final void onCompleted() {
            this.k = true;
            a();
        }

        static void b(Throwable th) {
            rx.plugins.e.a().b();
        }

        final void a(long j) {
            rx.f fVar;
            synchronized (this) {
                fVar = this.j;
                this.i = rx.internal.operators.a.a(this.i, j);
            }
            if (fVar != null) {
                fVar.a(j);
            }
            a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
            if (r18 != 0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
            if (r11.isUnsubscribed() == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
            if (a(r20.k, r15, r0, r9, r11, r9.isEmpty()) == false) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
            monitor-enter(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
            r0 = r20.i;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
            if (r0 == Long.MAX_VALUE) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
            r0 = r0 - r16;
            r20.i = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
            r12 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
            if (r20.h != false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
            r20.g = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
            monitor-exit(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
            r20.h = false;
            r14 = r20.k;
            r15 = r20.m;
            r0 = r20.l;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
            if (r0 == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
            if (r0 == rx.internal.operators.ag.c.n) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
            if (r20.c != false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
            r20.l = rx.internal.operators.ag.c.n;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
            monitor-exit(r20);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final void a() {
            /*
                Method dump skipped, instructions count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.ag.c.a():void");
        }

        private boolean a(boolean z, boolean z2, Throwable th, rx.internal.util.atomic.e<Object> eVar, rx.j<? super T> jVar, boolean z3) {
            if (this.c) {
                if (z && !z2 && z3) {
                    if (th != null) {
                        jVar.onError(th);
                    } else {
                        jVar.onCompleted();
                    }
                    return true;
                }
                return false;
            } else if (th != null) {
                eVar.clear();
                jVar.onError(th);
                return true;
            } else if (z && !z2 && z3) {
                jVar.onCompleted();
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T> extends rx.j<T> {
        final long a;
        private final c<T> b;

        b(long j, c<T> cVar) {
            this.a = j;
            this.b = cVar;
        }

        @Override // rx.j
        public final void setProducer(rx.f fVar) {
            c<T> cVar = this.b;
            long j = this.a;
            synchronized (cVar) {
                if (cVar.d.get() != j) {
                    return;
                }
                long j2 = cVar.i;
                cVar.j = fVar;
                fVar.a(j2);
            }
        }

        @Override // rx.e
        public final void onNext(T t) {
            c<T> cVar = this.b;
            synchronized (cVar) {
                if (cVar.d.get() != this.a) {
                    return;
                }
                cVar.e.a(this, (b<T>) rx.internal.operators.c.a(t));
                cVar.a();
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            boolean z;
            c<T> cVar = this.b;
            long j = this.a;
            synchronized (cVar) {
                if (cVar.d.get() == j) {
                    z = cVar.a(th);
                    cVar.m = false;
                    cVar.j = null;
                } else {
                    z = true;
                }
            }
            if (z) {
                cVar.a();
            } else {
                c.b(th);
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            c<T> cVar = this.b;
            long j = this.a;
            synchronized (cVar) {
                if (cVar.d.get() != j) {
                    return;
                }
                cVar.m = false;
                cVar.j = null;
                cVar.a();
            }
        }
    }
}
