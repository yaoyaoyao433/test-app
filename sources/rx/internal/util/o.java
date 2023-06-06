package rx.internal.util;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class o {
    private static final b a = new b();

    public static <T> rx.functions.g<? super T, Boolean> a() {
        return a.INSTANCE;
    }

    public static <T> rx.functions.g<T, T> b() {
        return new rx.functions.g<T, T>() { // from class: rx.internal.util.o.1
            @Override // rx.functions.g
            public final T call(T t) {
                return t;
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements rx.functions.f<R>, rx.functions.g<T0, R>, rx.functions.h<T0, T1, R>, rx.functions.i<T0, T1, T2, R>, rx.functions.j<T0, T1, T2, T3, R>, rx.functions.k<R> {
        @Override // rx.functions.h
        public final R a(T0 t0, T1 t1) {
            return null;
        }

        @Override // rx.functions.i
        public final R a(T0 t0, T1 t1, T2 t2) {
            return null;
        }

        @Override // rx.functions.j
        public final R a(T0 t0, T1 t1, T2 t2, T3 t3) {
            return null;
        }

        @Override // rx.functions.f, java.util.concurrent.Callable
        public final R call() {
            return null;
        }

        @Override // rx.functions.g
        public final R call(T0 t0) {
            return null;
        }

        @Override // rx.functions.k
        public final R call(Object... objArr) {
            return null;
        }

        b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    enum a implements rx.functions.g<Object, Boolean> {
        INSTANCE;

        @Override // rx.functions.g
        public final /* bridge */ /* synthetic */ Boolean call(Object obj) {
            return Boolean.TRUE;
        }
    }
}
