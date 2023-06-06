package rx.internal.util;

import java.util.List;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public enum e {
    ;
    
    public static final C1557e a = new rx.functions.h<Integer, Object, Integer>() { // from class: rx.internal.util.e.e
        @Override // rx.functions.h
        public final /* synthetic */ Integer a(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    };
    public static final f b = new rx.functions.h<Long, Object, Long>() { // from class: rx.internal.util.e.f
        @Override // rx.functions.h
        public final /* synthetic */ Long a(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    };
    public static final d c = new rx.functions.h<Object, Object, Boolean>() { // from class: rx.internal.util.e.d
        @Override // rx.functions.h
        public final /* synthetic */ Boolean a(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    };
    public static final i d = new rx.functions.g<List<? extends rx.d<?>>, rx.d<?>[]>() { // from class: rx.internal.util.e.i
        @Override // rx.functions.g
        public final /* synthetic */ rx.d<?>[] call(List<? extends rx.d<?>> list) {
            List<? extends rx.d<?>> list2 = list;
            return (rx.d[]) list2.toArray(new rx.d[list2.size()]);
        }
    };
    static final h e = new rx.functions.g<Object, Void>() { // from class: rx.internal.util.e.h
        @Override // rx.functions.g
        public final /* bridge */ /* synthetic */ Void call(Object obj) {
            return null;
        }
    };
    static final c f = new c();
    public static final rx.functions.b<Throwable> g = new rx.functions.b<Throwable>() { // from class: rx.internal.util.e.a
        @Override // rx.functions.b
        public final /* synthetic */ void call(Throwable th) {
            throw new rx.exceptions.f(th);
        }
    };
    public static final d.b<Boolean, Object> h = new rx.internal.operators.o(o.a(), true);

    public static rx.functions.g<Object, Boolean> a(Class<?> cls) {
        return new b(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b implements rx.functions.g<Object, Boolean> {
        final Class<?> a;

        public b(Class<?> cls) {
            this.a = cls;
        }

        @Override // rx.functions.g
        public final /* synthetic */ Boolean call(Object obj) {
            return Boolean.valueOf(this.a.isInstance(obj));
        }
    }

    public static final rx.functions.g<rx.d<? extends rx.c<?>>, rx.d<?>> a(rx.functions.g<? super rx.d<? extends Throwable>, ? extends rx.d<?>> gVar) {
        return new g(gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class g implements rx.functions.g<rx.d<? extends rx.c<?>>, rx.d<?>> {
        final rx.functions.g<? super rx.d<? extends Throwable>, ? extends rx.d<?>> a;

        @Override // rx.functions.g
        public final /* synthetic */ rx.d<?> call(rx.d<? extends rx.c<?>> dVar) {
            return this.a.call(dVar.d(e.f));
        }

        public g(rx.functions.g<? super rx.d<? extends Throwable>, ? extends rx.d<?>> gVar) {
            this.a = gVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class c implements rx.functions.g<rx.c<?>, Throwable> {
        c() {
        }

        @Override // rx.functions.g
        public final /* bridge */ /* synthetic */ Throwable call(rx.c<?> cVar) {
            return cVar.b;
        }
    }
}
