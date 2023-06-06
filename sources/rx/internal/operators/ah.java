package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ah<T> implements d.b<T, T> {
    final int a;

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(jVar);
        if (this.a == 0) {
            jVar.onCompleted();
            anonymousClass1.unsubscribe();
        }
        jVar.add(anonymousClass1);
        return anonymousClass1;
    }

    public ah(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("limit >= 0 required but it was " + i);
        }
        this.a = i;
    }

    /* compiled from: ProGuard */
    /* renamed from: rx.internal.operators.ah$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 extends rx.j<T> {
        int a;
        boolean b;
        final /* synthetic */ rx.j c;

        AnonymousClass1(rx.j jVar) {
            this.c = jVar;
        }

        @Override // rx.e
        public final void onCompleted() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c.onCompleted();
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            if (this.b) {
                return;
            }
            this.b = true;
            try {
                this.c.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.e
        public final void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i = this.a;
            this.a = i + 1;
            if (i < ah.this.a) {
                boolean z = this.a == ah.this.a;
                this.c.onNext(t);
                if (!z || this.b) {
                    return;
                }
                this.b = true;
                try {
                    this.c.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.j
        public final void setProducer(final rx.f fVar) {
            this.c.setProducer(new rx.f() { // from class: rx.internal.operators.ah.1.1
                final AtomicLong a = new AtomicLong(0);

                @Override // rx.f
                public final void a(long j) {
                    long j2;
                    long min;
                    if (j <= 0 || AnonymousClass1.this.b) {
                        return;
                    }
                    do {
                        j2 = this.a.get();
                        min = Math.min(j, ah.this.a - j2);
                        if (min == 0) {
                            return;
                        }
                    } while (!this.a.compareAndSet(j2, j2 + min));
                    fVar.a(min);
                }
            });
        }
    }
}
