package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.d;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class r<T> implements d.b<T, T> {
    final long a;
    final TimeUnit b;
    final rx.g c;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        g.a a = this.c.a();
        jVar.add(a);
        return new AnonymousClass1(jVar, a, jVar);
    }

    public r(long j, TimeUnit timeUnit, rx.g gVar) {
        this.a = j;
        this.b = timeUnit;
        this.c = gVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.internal.operators.r$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 extends rx.j<T> {
        boolean a;
        final /* synthetic */ g.a b;
        final /* synthetic */ rx.j c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(rx.j jVar, g.a aVar, rx.j jVar2) {
            super(jVar);
            this.b = aVar;
            this.c = jVar2;
        }

        @Override // rx.e
        public final void onCompleted() {
            this.b.a(new rx.functions.a() { // from class: rx.internal.operators.r.1.1
                @Override // rx.functions.a
                public final void a() {
                    if (AnonymousClass1.this.a) {
                        return;
                    }
                    AnonymousClass1.this.a = true;
                    AnonymousClass1.this.c.onCompleted();
                }
            }, r.this.a, r.this.b);
        }

        @Override // rx.e
        public final void onError(final Throwable th) {
            this.b.a(new rx.functions.a() { // from class: rx.internal.operators.r.1.2
                @Override // rx.functions.a
                public final void a() {
                    if (AnonymousClass1.this.a) {
                        return;
                    }
                    AnonymousClass1.this.a = true;
                    AnonymousClass1.this.c.onError(th);
                    AnonymousClass1.this.b.unsubscribe();
                }
            });
        }

        @Override // rx.e
        public final void onNext(final T t) {
            this.b.a(new rx.functions.a() { // from class: rx.internal.operators.r.1.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // rx.functions.a
                public final void a() {
                    if (AnonymousClass1.this.a) {
                        return;
                    }
                    AnonymousClass1.this.c.onNext(t);
                }
            }, r.this.a, r.this.b);
        }
    }
}
