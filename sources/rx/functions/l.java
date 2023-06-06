package rx.functions;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class l {
    public static <T0, T1, R> k<R> a(final h<? super T0, ? super T1, ? extends R> hVar) {
        return new k<R>() { // from class: rx.functions.l.1
            @Override // rx.functions.k
            public final R call(Object... objArr) {
                if (objArr.length != 2) {
                    throw new RuntimeException("Func2 expecting 2 arguments.");
                }
                return (R) h.this.a(objArr[0], objArr[1]);
            }
        };
    }
}
