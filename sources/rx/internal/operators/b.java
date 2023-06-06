package rx.internal.operators;

import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public enum b implements d.a<Object> {
    INSTANCE;
    
    static final rx.d<Object> b = rx.d.a((d.a) INSTANCE);

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        ((rx.j) obj).onCompleted();
    }

    public static <T> rx.d<T> a() {
        return (rx.d<T>) b;
    }
}
