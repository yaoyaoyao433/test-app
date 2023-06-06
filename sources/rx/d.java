package rx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rx.annotations.Beta;
import rx.functions.l;
import rx.internal.operators.aa;
import rx.internal.operators.ad;
import rx.internal.operators.ae;
import rx.internal.operators.af;
import rx.internal.operators.ag;
import rx.internal.operators.ah;
import rx.internal.operators.ai;
import rx.internal.operators.aj;
import rx.internal.operators.ak;
import rx.internal.operators.am;
import rx.internal.operators.an;
import rx.internal.operators.m;
import rx.internal.operators.n;
import rx.internal.operators.p;
import rx.internal.operators.q;
import rx.internal.operators.r;
import rx.internal.operators.s;
import rx.internal.operators.u;
import rx.internal.operators.w;
import rx.internal.operators.x;
import rx.internal.operators.y;
import rx.internal.operators.z;
import rx.internal.util.o;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class d<T> {
    static final rx.plugins.c b = rx.plugins.e.a().c();
    final a<T> a;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a<T> extends rx.functions.b<j<? super T>> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface b<R, T> extends rx.functions.g<j<? super R>, j<? super T>> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface c<T, R> extends rx.functions.g<d<T>, d<R>> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(a<T> aVar) {
        this.a = aVar;
    }

    public static <T> d<T> a(a<T> aVar) {
        return new d<>(rx.plugins.c.a(aVar));
    }

    public final <R> d<R> a(b<? extends R, ? super T> bVar) {
        return new d<>(new rx.internal.operators.i(this.a, bVar));
    }

    public final <R> d<R> a(c<? super T, ? extends R> cVar) {
        return (d) cVar.call(this);
    }

    @Beta
    public final h<T> a() {
        return new h<>(new rx.internal.operators.k(this));
    }

    public static <T1, T2, R> d<R> a(d<? extends T1> dVar, d<? extends T2> dVar2, rx.functions.h<? super T1, ? super T2, ? extends R> hVar) {
        return a(Arrays.asList(dVar, dVar2), l.a(hVar));
    }

    public static <T, R> d<R> a(List<? extends d<? extends T>> list, rx.functions.k<? extends R> kVar) {
        return a((a) new rx.internal.operators.d(list, kVar));
    }

    public static <T> d<T> a(d<? extends T> dVar, d<? extends T> dVar2, d<? extends T> dVar3) {
        return a(dVar, dVar2, dVar3).a(o.b());
    }

    public static <T> d<T> b() {
        return rx.internal.operators.b.a();
    }

    public static <T> d<T> a(Throwable th) {
        return a((a) new rx.internal.operators.l(th));
    }

    public static <T> d<T> a(Iterable<? extends T> iterable) {
        return a((a) new rx.internal.operators.h(iterable));
    }

    public static <T> d<T> a(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return rx.internal.operators.b.a();
        }
        if (length != 1) {
            return a((a) new rx.internal.operators.f(tArr));
        }
        return rx.internal.util.l.c(tArr[0]);
    }

    @Beta
    public static <T> d<T> a(Callable<? extends T> callable) {
        return a((a) new rx.internal.operators.g(callable));
    }

    public static d<Long> a(long j, TimeUnit timeUnit) {
        return a(50L, 50L, timeUnit, rx.schedulers.a.d());
    }

    public static d<Long> a(long j, long j2, TimeUnit timeUnit) {
        return a(j, j2, timeUnit, rx.schedulers.a.d());
    }

    public static d<Long> a(long j, long j2, TimeUnit timeUnit, g gVar) {
        return a((a) new n(j, j2, timeUnit, gVar));
    }

    public static <T> d<T> a(T t) {
        return rx.internal.util.l.c(t);
    }

    public static <T> d<T> a(T t, T t2, T t3) {
        return a(new Object[]{t, t2, t3});
    }

    public static <T> d<T> b(Iterable<? extends d<? extends T>> iterable) {
        return a(a((Iterable) iterable));
    }

    private static <T> d<T> a(d<? extends d<? extends T>> dVar) {
        if (dVar.getClass() == rx.internal.util.l.class) {
            return ((rx.internal.util.l) dVar).j(o.b());
        }
        return (d<T>) dVar.a((b<? extends R, ? super Object>) y.a.a);
    }

    public static <T> d<T> b(d<? extends T> dVar, d<? extends T> dVar2) {
        return a(a((Object[]) new d[]{dVar, dVar2}));
    }

    public static d<Long> b(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, rx.schedulers.a.d());
    }

    public static d<Long> a(long j, TimeUnit timeUnit, g gVar) {
        return a((a) new m(j, timeUnit, gVar));
    }

    public static <R> d<R> a(Iterable<? extends d<?>> iterable, rx.functions.k<? extends R> kVar) {
        ArrayList arrayList = new ArrayList();
        for (d<?> dVar : iterable) {
            arrayList.add(dVar);
        }
        return rx.internal.util.l.c(arrayList.toArray(new d[arrayList.size()])).a((b) new an(kVar));
    }

    public static <T1, T2, R> d<R> b(d<? extends T1> dVar, d<? extends T2> dVar2, rx.functions.h<? super T1, ? super T2, ? extends R> hVar) {
        return rx.internal.util.l.c(new d[]{dVar, dVar2}).a((b) new an(hVar));
    }

    public static <T1, T2, T3, R> d<R> a(d<? extends T1> dVar, d<? extends T2> dVar2, d<? extends T3> dVar3, rx.functions.i<? super T1, ? super T2, ? super T3, ? extends R> iVar) {
        return rx.internal.util.l.c(new d[]{dVar, dVar2, dVar3}).a((b) new an(iVar));
    }

    public static <T1, T2, T3, T4, R> d<R> a(d<? extends T1> dVar, d<? extends T2> dVar2, d<? extends T3> dVar3, d<? extends T4> dVar4, rx.functions.j<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> jVar) {
        return rx.internal.util.l.c(new d[]{dVar, dVar2, dVar3, dVar4}).a((b) new an(jVar));
    }

    private <R> d<R> b(Class<R> cls) {
        return a((b) new q(cls));
    }

    public final <R> d<R> a(rx.functions.g<? super T, ? extends d<? extends R>> gVar) {
        if (this instanceof rx.internal.util.l) {
            return ((rx.internal.util.l) this).j(gVar);
        }
        return a((a) new rx.internal.operators.e(this, gVar, 2, 0));
    }

    public final d<T> b(long j, TimeUnit timeUnit, g gVar) {
        return (d<T>) a((b) new r(j, timeUnit, gVar));
    }

    public final d<T> a(rx.functions.a aVar) {
        return (d<T>) a((b) new s(new rx.internal.util.a(rx.functions.e.a(), rx.functions.e.a(), aVar)));
    }

    public final d<T> a(rx.functions.b<Throwable> bVar) {
        return (d<T>) a((b) new s(new rx.internal.util.a(rx.functions.e.a(), bVar, rx.functions.e.a())));
    }

    public final d<T> b(rx.functions.b<? super T> bVar) {
        return (d<T>) a((b) new s(new rx.internal.util.a(bVar, rx.functions.e.a(), rx.functions.e.a())));
    }

    public final d<T> b(rx.functions.a aVar) {
        return (d<T>) a((b) new u(aVar));
    }

    public final d<T> c(rx.functions.a aVar) {
        return (d<T>) a((b) new s(new rx.internal.util.a(rx.functions.e.a(), rx.functions.e.a(aVar), aVar)));
    }

    public final d<T> b(rx.functions.g<? super T, Boolean> gVar) {
        return (d<T>) a((b) new w(gVar));
    }

    public final d<T> d() {
        return (d<T>) a(1).a((b) ae.a.a);
    }

    public final d<T> b(T t) {
        return (d<T>) a(1).a((b) new ae(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> d<R> c(rx.functions.g<? super T, ? extends d<? extends R>> gVar) {
        if (getClass() == rx.internal.util.l.class) {
            return ((rx.internal.util.l) this).j(gVar);
        }
        return a((d) d(gVar));
    }

    public final <R> d<R> d(rx.functions.g<? super T, ? extends R> gVar) {
        return a((b) new x(gVar));
    }

    public final d<T> a(g gVar) {
        return a(gVar, false, rx.internal.util.j.c);
    }

    private d<T> a(g gVar, boolean z, int i) {
        if (this instanceof rx.internal.util.l) {
            return ((rx.internal.util.l) this).d(gVar);
        }
        return (d<T>) a((b) new z(gVar, false, i));
    }

    public final <R> d<R> a(Class<R> cls) {
        return b((rx.functions.g) rx.internal.util.e.a((Class<?>) cls)).b((Class) cls);
    }

    public final d<T> e(rx.functions.g<Throwable, ? extends d<? extends T>> gVar) {
        return (d<T>) a((b) new ad(gVar));
    }

    public final d<T> f(rx.functions.g<Throwable, ? extends T> gVar) {
        return (d<T>) a((b) ad.a(gVar));
    }

    public final d<T> g(rx.functions.g<? super d<? extends Throwable>, ? extends d<?>> gVar) {
        return rx.internal.operators.j.a(this, rx.internal.util.e.a(gVar));
    }

    public final k f() {
        return a(new rx.internal.util.a(rx.functions.e.a(), rx.internal.util.e.g, rx.functions.e.a()), this);
    }

    public final k c(rx.functions.b<? super T> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("onNext can not be null");
        }
        return a(new rx.internal.util.a(bVar, rx.internal.util.e.g, rx.functions.e.a()), this);
    }

    public final k a(rx.functions.b<? super T> bVar, rx.functions.b<Throwable> bVar2) {
        if (bVar != null) {
            if (bVar2 == null) {
                throw new IllegalArgumentException("onError can not be null");
            }
            return a(new rx.internal.util.a(bVar, bVar2, rx.functions.e.a()), this);
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public final k a(rx.functions.b<? super T> bVar, rx.functions.b<Throwable> bVar2, rx.functions.a aVar) {
        if (bVar != null) {
            if (bVar2 != null) {
                if (aVar == null) {
                    throw new IllegalArgumentException("onComplete can not be null");
                }
                return a(new rx.internal.util.a(bVar, bVar2, aVar), this);
            }
            throw new IllegalArgumentException("onError can not be null");
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    public final k a(e<? super T> eVar) {
        if (eVar instanceof j) {
            return a((j) eVar, this);
        }
        return a(new rx.internal.util.g(eVar), this);
    }

    public final k a(j<? super T> jVar) {
        try {
            jVar.onStart();
            rx.plugins.c.a(this, this.a).call(jVar);
            return rx.plugins.c.a(jVar);
        } catch (Throwable th) {
            rx.exceptions.b.b(th);
            try {
                jVar.onError(rx.plugins.c.a(th));
                return rx.subscriptions.e.b();
            } catch (Throwable th2) {
                rx.exceptions.b.b(th2);
                throw new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
            }
        }
    }

    public static <T> k a(j<? super T> jVar, d<T> dVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        }
        if (dVar.a == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        }
        jVar.onStart();
        if (!(jVar instanceof rx.observers.b)) {
            jVar = new rx.observers.b(jVar);
        }
        try {
            rx.plugins.c.a(dVar, dVar.a).call(jVar);
            return rx.plugins.c.a(jVar);
        } catch (Throwable th) {
            rx.exceptions.b.b(th);
            if (jVar.isUnsubscribed()) {
                rx.internal.util.i.a(rx.plugins.c.a(th));
            } else {
                try {
                    jVar.onError(rx.plugins.c.a(th));
                } catch (Throwable th2) {
                    rx.exceptions.b.b(th2);
                    throw new rx.exceptions.e("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                }
            }
            return rx.subscriptions.e.b();
        }
    }

    public final d<T> b(g gVar) {
        if (this instanceof rx.internal.util.l) {
            return ((rx.internal.util.l) this).d(gVar);
        }
        return a((a) new af(this, gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> d<R> h(rx.functions.g<? super T, ? extends d<? extends R>> gVar) {
        return b((d) d(gVar));
    }

    public final d<T> a(int i) {
        return (d<T>) a((b) new ah(i));
    }

    public final d<T> i(rx.functions.g<? super T, Boolean> gVar) {
        return (d<T>) a((b) new ai(gVar));
    }

    public final d<T> c(long j, TimeUnit timeUnit) {
        return c(500L, timeUnit, rx.schedulers.a.d());
    }

    private d<T> c(long j, TimeUnit timeUnit, g gVar) {
        return (d<T>) a((b) new aj(j, timeUnit, gVar));
    }

    public final d<T> a(long j, TimeUnit timeUnit, d<? extends T> dVar, g gVar) {
        return (d<T>) a((b) new ak(j, timeUnit, null, gVar));
    }

    public final d<T> c(g gVar) {
        return (d<T>) a((b) new am(gVar));
    }

    public static <T> d<T> a(d<? extends T> dVar, d<? extends T> dVar2) {
        return a(new Object[]{dVar, dVar2}).a(o.b());
    }

    public static <T> d<T> a(d<? extends T> dVar, d<? extends T> dVar2, d<? extends T> dVar3, d<? extends T> dVar4, d<? extends T> dVar5) {
        return a(new Object[]{dVar, dVar2, dVar3, dVar4, dVar5}).a(o.b());
    }

    private static <T> d<T> b(d<? extends d<? extends T>> dVar) {
        return (d<T>) dVar.a((b<? extends R, ? super Object>) ag.a.a);
    }

    public final d<T> c() {
        return (d<T>) a((b) p.a.a);
    }

    public final d<T> e() {
        return (d<T>) a((b) aa.b.a);
    }
}
