package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class al<T> implements d.b<T, T> {
    final a<T> a;
    final b<T> b;
    final rx.d<? extends T> c;
    final rx.g d;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a<T> extends rx.functions.i<c<T>, Long, g.a, rx.k> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface b<T> extends rx.functions.j<c<T>, Long, T, g.a, rx.k> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(a<T> aVar, b<T> bVar, rx.d<? extends T> dVar, rx.g gVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = dVar;
        this.d = gVar;
    }

    @Override // rx.functions.g
    /* renamed from: a */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        g.a a2 = this.d.a();
        jVar.add(a2);
        rx.observers.d dVar = new rx.observers.d(jVar);
        rx.subscriptions.d dVar2 = new rx.subscriptions.d();
        dVar.add(dVar2);
        c cVar = new c(dVar, this.b, dVar2, this.c, a2);
        dVar.add(cVar);
        dVar.setProducer(cVar.f);
        dVar2.a(this.a.a(cVar, 0L, a2));
        return cVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class c<T> extends rx.j<T> {
        final rx.subscriptions.d a;
        final rx.observers.d<T> b;
        final b<T> c;
        final rx.d<? extends T> d;
        final g.a e;
        final rx.internal.producers.a f = new rx.internal.producers.a();
        boolean g;
        long h;

        c(rx.observers.d<T> dVar, b<T> bVar, rx.subscriptions.d dVar2, rx.d<? extends T> dVar3, g.a aVar) {
            this.b = dVar;
            this.c = bVar;
            this.a = dVar2;
            this.d = dVar3;
            this.e = aVar;
        }

        @Override // rx.j
        public final void setProducer(rx.f fVar) {
            this.f.a(fVar);
        }

        @Override // rx.e
        public final void onNext(T t) {
            long j;
            boolean z;
            synchronized (this) {
                if (this.g) {
                    j = 0;
                    z = false;
                } else {
                    j = this.h + 1;
                    this.h = j;
                    z = true;
                }
            }
            if (z) {
                this.b.onNext(t);
                this.a.a(this.c.a(this, Long.valueOf(j), t, this.e));
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            boolean z;
            synchronized (this) {
                z = true;
                if (this.g) {
                    z = false;
                } else {
                    this.g = true;
                }
            }
            if (z) {
                this.a.unsubscribe();
                this.b.onError(th);
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            boolean z;
            synchronized (this) {
                z = true;
                if (this.g) {
                    z = false;
                } else {
                    this.g = true;
                }
            }
            if (z) {
                this.a.unsubscribe();
                this.b.onCompleted();
            }
        }

        public final void a(long j) {
            boolean z;
            synchronized (this) {
                z = true;
                if (j != this.h || this.g) {
                    z = false;
                } else {
                    this.g = true;
                }
            }
            if (z) {
                if (this.d == null) {
                    this.b.onError(new TimeoutException());
                    return;
                }
                rx.j<T> jVar = new rx.j<T>() { // from class: rx.internal.operators.al.c.1
                    @Override // rx.e
                    public final void onNext(T t) {
                        c.this.b.onNext(t);
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        c.this.b.onError(th);
                    }

                    @Override // rx.e
                    public final void onCompleted() {
                        c.this.b.onCompleted();
                    }

                    @Override // rx.j
                    public final void setProducer(rx.f fVar) {
                        c.this.f.a(fVar);
                    }
                };
                this.d.a((rx.j<? super Object>) jVar);
                this.a.a(jVar);
            }
        }
    }
}
