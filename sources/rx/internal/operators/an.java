package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class an<R> implements d.b<R, rx.d<?>[]> {
    final rx.functions.k<? extends R> a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        a aVar = new a(jVar, this.a);
        b bVar = new b(aVar);
        c cVar = new c(jVar, aVar, bVar);
        jVar.add(cVar);
        jVar.setProducer(bVar);
        return cVar;
    }

    public an(rx.functions.k<? extends R> kVar) {
        this.a = kVar;
    }

    public an(rx.functions.h hVar) {
        this.a = rx.functions.l.a(hVar);
    }

    public an(final rx.functions.i iVar) {
        this.a = (rx.functions.k<R>) new rx.functions.k<R>() { // from class: rx.functions.l.2
            @Override // rx.functions.k
            public final R call(Object... objArr) {
                if (objArr.length != 3) {
                    throw new RuntimeException("Func3 expecting 3 arguments.");
                }
                return (R) iVar.a(objArr[0], objArr[1], objArr[2]);
            }
        };
    }

    public an(final rx.functions.j jVar) {
        this.a = (rx.functions.k<R>) new rx.functions.k<R>() { // from class: rx.functions.l.3
            @Override // rx.functions.k
            public final R call(Object... objArr) {
                if (objArr.length != 4) {
                    throw new RuntimeException("Func4 expecting 4 arguments.");
                }
                return (R) jVar.a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    final class c extends rx.j<rx.d[]> {
        final rx.j<? super R> a;
        final a<R> b;
        final b<R> c;
        boolean d = false;

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            rx.d[] dVarArr = (rx.d[]) obj;
            if (dVarArr == null || dVarArr.length == 0) {
                this.a.onCompleted();
                return;
            }
            this.d = true;
            a<R> aVar = this.b;
            b<R> bVar = this.c;
            Object[] objArr = new Object[dVarArr.length];
            for (int i = 0; i < dVarArr.length; i++) {
                a.C1552a c1552a = new a.C1552a();
                objArr[i] = c1552a;
                aVar.b.a(c1552a);
            }
            aVar.f = bVar;
            aVar.e = objArr;
            for (int i2 = 0; i2 < dVarArr.length; i2++) {
                dVarArr[i2].a((rx.j) ((a.C1552a) objArr[i2]));
            }
        }

        public c(rx.j<? super R> jVar, a<R> aVar, b<R> bVar) {
            this.a = jVar;
            this.b = aVar;
            this.c = bVar;
        }

        @Override // rx.e
        public final void onCompleted() {
            if (this.d) {
                return;
            }
            this.a.onCompleted();
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            this.a.onError(th);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class b<R> extends AtomicLong implements rx.f {
        private static final long serialVersionUID = -1216676403723546796L;
        private a<R> a;

        public b(a<R> aVar) {
            this.a = aVar;
        }

        @Override // rx.f
        public final void a(long j) {
            rx.internal.operators.a.a(this, j);
            this.a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a<R> extends AtomicLong {
        static final int c = (int) (rx.internal.util.j.c * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        final rx.e<? super R> a;
        final rx.subscriptions.b b = new rx.subscriptions.b();
        int d = 0;
        volatile Object[] e;
        AtomicLong f;
        private final rx.functions.k<? extends R> g;

        public a(rx.j<? super R> jVar, rx.functions.k<? extends R> kVar) {
            this.a = jVar;
            this.g = kVar;
            jVar.add(this.b);
        }

        final void a() {
            Object[] objArr = this.e;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            rx.e<? super R> eVar = this.a;
            AtomicLong atomicLong = this.f;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z = true;
                for (int i = 0; i < length; i++) {
                    Object f = ((C1552a) objArr[i]).a.f();
                    if (f == null) {
                        z = false;
                    } else if (rx.internal.util.j.b(f)) {
                        eVar.onCompleted();
                        this.b.unsubscribe();
                        return;
                    } else {
                        objArr2[i] = rx.internal.util.j.c(f);
                    }
                }
                if (atomicLong.get() > 0 && z) {
                    try {
                        eVar.onNext((R) this.g.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.d++;
                        for (Object obj : objArr) {
                            rx.internal.util.j jVar = ((C1552a) obj).a;
                            jVar.e();
                            if (rx.internal.util.j.b(jVar.f())) {
                                eVar.onCompleted();
                                this.b.unsubscribe();
                                return;
                            }
                        }
                        if (this.d > c) {
                            for (Object obj2 : objArr) {
                                ((C1552a) obj2).a(this.d);
                            }
                            this.d = 0;
                        }
                    } catch (Throwable th) {
                        rx.exceptions.b.a(th, eVar, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* renamed from: rx.internal.operators.an$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public final class C1552a extends rx.j {
            final rx.internal.util.j a = rx.internal.util.j.b();

            C1552a() {
            }

            @Override // rx.j
            public final void onStart() {
                request(rx.internal.util.j.c);
            }

            public final void a(long j) {
                request(j);
            }

            @Override // rx.e
            public final void onCompleted() {
                rx.internal.util.j jVar = this.a;
                if (jVar.a == null) {
                    jVar.a = rx.internal.operators.c.b();
                }
                a.this.a();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                a.this.a.onError(th);
            }

            @Override // rx.e
            public final void onNext(Object obj) {
                try {
                    this.a.a(obj);
                } catch (rx.exceptions.c e) {
                    onError(e);
                }
                a.this.a();
            }
        }
    }
}
