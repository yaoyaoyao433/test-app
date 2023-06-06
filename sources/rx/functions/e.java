package rx.functions;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e {
    private static final b a = new b();

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> b<T0, T1, T2, T3, T4, T5, T6, T7, T8> a() {
        return a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements rx.functions.a, rx.functions.b<T0>, c<T0, T1>, d<T0, T1, T2> {
        @Override // rx.functions.a
        public final void a() {
        }

        @Override // rx.functions.c
        public final void a(T0 t0, T1 t1) {
        }

        @Override // rx.functions.d
        public final void a(T0 t0, T1 t1, T2 t2) {
        }

        @Override // rx.functions.b
        public final void call(T0 t0) {
        }

        b() {
        }
    }

    public static <T> rx.functions.b<T> a(rx.functions.a aVar) {
        return new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a<T> implements rx.functions.b<T> {
        final rx.functions.a a;

        public a(rx.functions.a aVar) {
            this.a = aVar;
        }

        @Override // rx.functions.b
        public final void call(T t) {
            this.a.a();
        }
    }
}
