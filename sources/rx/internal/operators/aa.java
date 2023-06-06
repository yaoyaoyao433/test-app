package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.a;
import rx.d;
import rx.internal.util.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class aa<T> implements d.b<T, T> {
    private final Long a = null;
    private final rx.functions.a b = null;
    private final a.d c = rx.a.a;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class b {
        public static final aa<?> a = new aa<>();
    }

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        a aVar = new a(jVar, this.a, this.b, this.c);
        jVar.add(aVar);
        jVar.setProducer(aVar.a);
        return aVar;
    }

    aa() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a<T> extends rx.j<T> implements b.a {
        final rx.internal.util.b a;
        private final AtomicLong c;
        private final rx.j<? super T> d;
        private final rx.functions.a g;
        private final a.d h;
        private final ConcurrentLinkedQueue<Object> b = new ConcurrentLinkedQueue<>();
        private final AtomicBoolean e = new AtomicBoolean(false);
        private final c<T> f = c.a();

        public a(rx.j<? super T> jVar, Long l, rx.functions.a aVar, a.d dVar) {
            this.d = jVar;
            this.c = l != null ? new AtomicLong(l.longValue()) : null;
            this.g = aVar;
            this.a = new rx.internal.util.b(this);
            this.h = dVar;
        }

        @Override // rx.j
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.e
        public final void onCompleted() {
            if (this.e.get()) {
                return;
            }
            this.a.a();
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            if (this.e.get()) {
                return;
            }
            this.a.a(th);
        }

        @Override // rx.e
        public final void onNext(T t) {
            if (c()) {
                this.b.offer(c.a(t));
                this.a.b();
            }
        }

        @Override // rx.internal.util.b.a
        public final boolean a(Object obj) {
            return c.a(this.d, obj);
        }

        @Override // rx.internal.util.b.a
        public final void a(Throwable th) {
            if (th != null) {
                this.d.onError(th);
            } else {
                this.d.onCompleted();
            }
        }

        @Override // rx.internal.util.b.a
        public final Object a() {
            return this.b.peek();
        }

        @Override // rx.internal.util.b.a
        public final Object b() {
            Object poll = this.b.poll();
            if (this.c != null && poll != null) {
                this.c.incrementAndGet();
            }
            return poll;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x004b A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean c() {
            /*
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.c
                r1 = 1
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.concurrent.atomic.AtomicLong r0 = r6.c
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L4c
                r0 = 0
                rx.a$d r4 = r6.h     // Catch: rx.exceptions.c -> L23
                boolean r4 = r4.a()     // Catch: rx.exceptions.c -> L23
                if (r4 == 0) goto L34
                java.lang.Object r4 = r6.b()     // Catch: rx.exceptions.c -> L23
                if (r4 == 0) goto L34
                r4 = 1
                goto L35
            L23:
                r4 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r6.e
                boolean r5 = r5.compareAndSet(r0, r1)
                if (r5 == 0) goto L34
                r6.unsubscribe()
                rx.j<? super T> r5 = r6.d
                r5.onError(r4)
            L34:
                r4 = 0
            L35:
                rx.functions.a r5 = r6.g
                if (r5 == 0) goto L49
                rx.functions.a r5 = r6.g     // Catch: java.lang.Throwable -> L3f
                r5.a()     // Catch: java.lang.Throwable -> L3f
                goto L49
            L3f:
                r1 = move-exception
                rx.exceptions.b.b(r1)
                rx.internal.util.b r2 = r6.a
                r2.a(r1)
                return r0
            L49:
                if (r4 != 0) goto L4c
                return r0
            L4c:
                java.util.concurrent.atomic.AtomicLong r0 = r6.c
                r4 = 1
                long r4 = r2 - r4
                boolean r0 = r0.compareAndSet(r2, r4)
                if (r0 == 0) goto L6
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.aa.a.c():boolean");
        }
    }
}
