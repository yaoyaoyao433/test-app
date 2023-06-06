package rx.internal.util;

import com.meituan.robust.common.CommonConstant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class l<T> extends rx.d<T> {
    static rx.plugins.c c = rx.plugins.e.a().c();
    static final boolean d = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    public final T e;

    static <T> rx.f a(rx.j<? super T> jVar, T t) {
        if (d) {
            return new rx.internal.producers.c(jVar, t);
        }
        return new d(jVar, t);
    }

    public static <T> l<T> c(T t) {
        return new l<>(t);
    }

    private l(T t) {
        super(rx.plugins.c.a(new a(t)));
        this.e = t;
    }

    public final rx.d<T> d(final rx.g gVar) {
        rx.functions.g<rx.functions.a, rx.k> gVar2;
        if (gVar instanceof rx.internal.schedulers.b) {
            final rx.internal.schedulers.b bVar = (rx.internal.schedulers.b) gVar;
            gVar2 = new rx.functions.g<rx.functions.a, rx.k>() { // from class: rx.internal.util.l.1
                @Override // rx.functions.g
                public final /* synthetic */ rx.k call(rx.functions.a aVar) {
                    return bVar.f.get().a().b(aVar, -1L, TimeUnit.NANOSECONDS);
                }
            };
        } else {
            gVar2 = new rx.functions.g<rx.functions.a, rx.k>() { // from class: rx.internal.util.l.2
                @Override // rx.functions.g
                public final /* synthetic */ rx.k call(rx.functions.a aVar) {
                    final rx.functions.a aVar2 = aVar;
                    final g.a a2 = gVar.a();
                    a2.a(new rx.functions.a() { // from class: rx.internal.util.l.2.1
                        @Override // rx.functions.a
                        public final void a() {
                            try {
                                aVar2.a();
                            } finally {
                                a2.unsubscribe();
                            }
                        }
                    });
                    return a2;
                }
            };
        }
        return a((d.a) new b(this.e, gVar2));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a<T> implements d.a<T> {
        final T a;

        @Override // rx.functions.b
        public final /* synthetic */ void call(Object obj) {
            rx.j jVar = (rx.j) obj;
            jVar.setProducer(l.a(jVar, this.a));
        }

        a(T t) {
            this.a = t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T> implements d.a<T> {
        final T a;
        final rx.functions.g<rx.functions.a, rx.k> b;

        @Override // rx.functions.b
        public final /* synthetic */ void call(Object obj) {
            rx.j jVar = (rx.j) obj;
            jVar.setProducer(new c(jVar, this.a, this.b));
        }

        b(T t, rx.functions.g<rx.functions.a, rx.k> gVar) {
            this.a = t;
            this.b = gVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class c<T> extends AtomicBoolean implements rx.f, rx.functions.a {
        private static final long serialVersionUID = -2466317989629281651L;
        final rx.j<? super T> a;
        final T b;
        final rx.functions.g<rx.functions.a, rx.k> c;

        public c(rx.j<? super T> jVar, T t, rx.functions.g<rx.functions.a, rx.k> gVar) {
            this.a = jVar;
            this.b = t;
            this.c = gVar;
        }

        @Override // rx.f
        public final void a(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (i == 0 || !compareAndSet(false, true)) {
            } else {
                this.a.add(this.c.call(this));
            }
        }

        @Override // rx.functions.a
        public final void a() {
            rx.j<? super T> jVar = this.a;
            if (jVar.isUnsubscribed()) {
                return;
            }
            Object obj = (T) this.b;
            try {
                jVar.onNext(obj);
                if (jVar.isUnsubscribed()) {
                    return;
                }
                jVar.onCompleted();
            } catch (Throwable th) {
                rx.exceptions.b.a(th, jVar, obj);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public final String toString() {
            return "ScalarAsyncProducer[" + this.b + ", " + get() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
    }

    public final <R> rx.d<R> j(final rx.functions.g<? super T, ? extends rx.d<? extends R>> gVar) {
        return a((d.a) new d.a<R>() { // from class: rx.internal.util.l.3
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                rx.j jVar = (rx.j) obj;
                rx.d dVar = (rx.d) gVar.call(l.this.e);
                if (dVar instanceof l) {
                    jVar.setProducer(l.a(jVar, ((l) dVar).e));
                } else {
                    dVar.a((rx.j) rx.observers.e.a(jVar));
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class d<T> implements rx.f {
        final rx.j<? super T> a;
        final T b;
        boolean c;

        public d(rx.j<? super T> jVar, T t) {
            this.a = jVar;
            this.b = t;
        }

        @Override // rx.f
        public final void a(long j) {
            if (this.c) {
                return;
            }
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalStateException("n >= required but it was " + j);
            } else if (i == 0) {
            } else {
                this.c = true;
                rx.j<? super T> jVar = this.a;
                if (jVar.isUnsubscribed()) {
                    return;
                }
                Object obj = (T) this.b;
                try {
                    jVar.onNext(obj);
                    if (jVar.isUnsubscribed()) {
                        return;
                    }
                    jVar.onCompleted();
                } catch (Throwable th) {
                    rx.exceptions.b.a(th, jVar, obj);
                }
            }
        }
    }
}
