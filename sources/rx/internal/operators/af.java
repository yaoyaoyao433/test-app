package rx.internal.operators;

import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class af<T> implements d.a<T> {
    final rx.g a;
    final rx.d<T> b;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        rx.j jVar = (rx.j) obj;
        g.a a = this.a.a();
        jVar.add(a);
        a.a(new AnonymousClass1(jVar, a));
    }

    public af(rx.d<T> dVar, rx.g gVar) {
        this.a = gVar;
        this.b = dVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.internal.operators.af$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements rx.functions.a {
        final /* synthetic */ rx.j a;
        final /* synthetic */ g.a b;

        AnonymousClass1(rx.j jVar, g.a aVar) {
            this.a = jVar;
            this.b = aVar;
        }

        @Override // rx.functions.a
        public final void a() {
            final Thread currentThread = Thread.currentThread();
            af.this.b.a((rx.j) new rx.j<T>(this.a) { // from class: rx.internal.operators.af.1.1
                @Override // rx.e
                public final void onNext(T t) {
                    AnonymousClass1.this.a.onNext(t);
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    try {
                        AnonymousClass1.this.a.onError(th);
                    } finally {
                        AnonymousClass1.this.b.unsubscribe();
                    }
                }

                @Override // rx.e
                public final void onCompleted() {
                    try {
                        AnonymousClass1.this.a.onCompleted();
                    } finally {
                        AnonymousClass1.this.b.unsubscribe();
                    }
                }

                @Override // rx.j
                public final void setProducer(final rx.f fVar) {
                    AnonymousClass1.this.a.setProducer(new rx.f() { // from class: rx.internal.operators.af.1.1.1
                        @Override // rx.f
                        public final void a(final long j) {
                            if (currentThread == Thread.currentThread()) {
                                fVar.a(j);
                            } else {
                                AnonymousClass1.this.b.a(new rx.functions.a() { // from class: rx.internal.operators.af.1.1.1.1
                                    @Override // rx.functions.a
                                    public final void a() {
                                        fVar.a(j);
                                    }
                                });
                            }
                        }
                    });
                }
            });
        }
    }
}
