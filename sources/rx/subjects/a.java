package rx.subjects;

import java.util.ArrayList;
import rx.d;
import rx.subjects.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a<T> extends e<T, T> {
    private static final Object[] e = new Object[0];
    private final f<T> c;
    private final rx.internal.operators.c<T> d;

    public static <T> a<T> g() {
        return a((Object) null, false);
    }

    public static <T> a<T> c(T t) {
        return a((Object) t, true);
    }

    private static <T> a<T> a(T t, boolean z) {
        final f fVar = new f();
        if (z) {
            rx.internal.operators.c.a();
            fVar.a = rx.internal.operators.c.a(t);
        }
        fVar.d = new rx.functions.b<f.b<T>>() { // from class: rx.subjects.a.1
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                ((f.b) obj).b(f.this.a, f.this.f);
            }
        };
        fVar.e = fVar.d;
        return new a<>(fVar, fVar);
    }

    private a(d.a<T> aVar, f<T> fVar) {
        super(aVar);
        this.d = rx.internal.operators.c.a();
        this.c = fVar;
    }

    @Override // rx.e
    public final void onCompleted() {
        if (this.c.a == null || this.c.b) {
            Object b = rx.internal.operators.c.b();
            for (f.b<T> bVar : this.c.a(b)) {
                bVar.a(b, this.c.f);
            }
        }
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        if (this.c.a == null || this.c.b) {
            Object a = rx.internal.operators.c.a(th);
            ArrayList arrayList = null;
            for (f.b<T> bVar : this.c.a(a)) {
                try {
                    bVar.a(a, this.c.f);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            rx.exceptions.b.a(arrayList);
        }
    }

    @Override // rx.e
    public final void onNext(T t) {
        if (this.c.a == null || this.c.b) {
            Object a = rx.internal.operators.c.a(t);
            f<T> fVar = this.c;
            fVar.a = a;
            for (f.b bVar : fVar.get().b) {
                bVar.a(a, this.c.f);
            }
        }
    }

    @Override // rx.subjects.e
    public final boolean h() {
        return this.c.a().length > 0;
    }
}
