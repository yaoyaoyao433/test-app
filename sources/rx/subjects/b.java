package rx.subjects;

import java.util.ArrayList;
import rx.d;
import rx.subjects.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b<T> extends e<T, T> {
    final f<T> c;
    private final rx.internal.operators.c<T> d;

    public static <T> b<T> g() {
        final f fVar = new f();
        fVar.e = new rx.functions.b<f.b<T>>() { // from class: rx.subjects.b.1
            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                ((f.b) obj).b(f.this.a, f.this.f);
            }
        };
        return new b<>(fVar, fVar);
    }

    private b(d.a<T> aVar, f<T> fVar) {
        super(aVar);
        this.d = rx.internal.operators.c.a();
        this.c = fVar;
    }

    @Override // rx.e
    public final void onCompleted() {
        if (this.c.b) {
            Object b = rx.internal.operators.c.b();
            for (f.b<T> bVar : this.c.a(b)) {
                bVar.a(b, this.c.f);
            }
        }
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        if (this.c.b) {
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
        for (f.b<T> bVar : this.c.a()) {
            bVar.onNext(t);
        }
    }

    @Override // rx.subjects.e
    public final boolean h() {
        return this.c.a().length > 0;
    }
}
