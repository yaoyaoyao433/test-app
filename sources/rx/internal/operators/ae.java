package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class ae<T> implements d.b<T, T> {
    private final boolean a;
    private final T b;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class a {
        public static final ae<?> a = new ae<>();
    }

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        b bVar = new b(jVar, this.a, this.b);
        jVar.add(bVar);
        return bVar;
    }

    ae() {
        this(false, null);
    }

    public ae(T t) {
        this(true, t);
    }

    private ae(boolean z, T t) {
        this.a = z;
        this.b = t;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class b<T> extends rx.j<T> {
        private final rx.j<? super T> a;
        private final boolean b;
        private final T c;
        private T d;
        private boolean e;
        private boolean f;

        b(rx.j<? super T> jVar, boolean z, T t) {
            this.a = jVar;
            this.b = z;
            this.c = t;
            request(2L);
        }

        @Override // rx.e
        public final void onNext(T t) {
            if (this.f) {
                return;
            }
            if (this.e) {
                this.f = true;
                this.a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
                return;
            }
            this.d = t;
            this.e = true;
        }

        @Override // rx.e
        public final void onCompleted() {
            if (this.f) {
                return;
            }
            if (this.e) {
                this.a.setProducer(new rx.internal.producers.c(this.a, this.d));
            } else if (this.b) {
                this.a.setProducer(new rx.internal.producers.c(this.a, this.c));
            } else {
                this.a.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            if (this.f) {
                rx.internal.util.i.a(th);
            } else {
                this.a.onError(th);
            }
        }
    }
}
