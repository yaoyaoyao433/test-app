package rx.subjects;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
import rx.internal.util.i;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<T> extends e<T, T> {
    private static final Object[] d = new Object[0];
    final C1558c<T> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface a<T> {
        void a();

        void a(T t);

        void a(Throwable th);

        boolean a(b<T> bVar);
    }

    private c(C1558c<T> c1558c) {
        super(c1558c);
        this.c = c1558c;
    }

    @Override // rx.e
    public final void onNext(T t) {
        this.c.onNext(t);
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        this.c.onError(th);
    }

    @Override // rx.e
    public final void onCompleted() {
        this.c.onCompleted();
    }

    @Override // rx.subjects.e
    public final boolean h() {
        return this.c.get().length != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: rx.subjects.c$c  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C1558c<T> extends AtomicReference<b<T>[]> implements d.a<T>, rx.e<T> {
        static final b[] b = new b[0];
        static final b[] c = new b[0];
        private static final long serialVersionUID = 5952362471246910544L;
        final a<T> a;

        @Override // rx.functions.b
        public final /* synthetic */ void call(Object obj) {
            boolean z;
            j jVar = (j) obj;
            b<T> bVar = new b<>(jVar, this);
            jVar.add(bVar);
            jVar.setProducer(bVar);
            while (true) {
                b<T>[] bVarArr = get();
                z = false;
                if (bVarArr != c) {
                    int length = bVarArr.length;
                    b[] bVarArr2 = new b[length + 1];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr2[length] = bVar;
                    if (compareAndSet(bVarArr, bVarArr2)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z && bVar.isUnsubscribed()) {
                a(bVar);
            } else {
                this.a.a((b) bVar);
            }
        }

        public C1558c(a<T> aVar) {
            this.a = aVar;
            lazySet(b);
        }

        final void a(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = get();
                if (bVarArr == c || bVarArr == b) {
                    return;
                }
                int length = bVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (bVarArr[i2] == bVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = b;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                    System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!compareAndSet(bVarArr, bVarArr2));
        }

        @Override // rx.e
        public final void onNext(T t) {
            b<T>[] bVarArr;
            a<T> aVar = this.a;
            aVar.a((a<T>) t);
            for (b<T> bVar : get()) {
                if (bVar.d) {
                    bVar.a.onNext(t);
                } else if (aVar.a((b) bVar)) {
                    bVar.d = true;
                    bVar.g = null;
                }
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            b<T>[] andSet;
            a<T> aVar = this.a;
            aVar.a(th);
            ArrayList arrayList = null;
            for (b<T> bVar : getAndSet(c)) {
                try {
                    if (bVar.d) {
                        bVar.a.onError(th);
                    } else if (aVar.a((b) bVar)) {
                        bVar.d = true;
                        bVar.g = null;
                    }
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            rx.exceptions.b.a(arrayList);
        }

        @Override // rx.e
        public final void onCompleted() {
            b<T>[] andSet;
            a<T> aVar = this.a;
            aVar.a();
            for (b<T> bVar : getAndSet(c)) {
                if (bVar.d) {
                    bVar.a.onCompleted();
                } else if (aVar.a((b) bVar)) {
                    bVar.d = true;
                    bVar.g = null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class d<T> implements a<T> {
        final int a;
        volatile int b;
        final Object[] c;
        Object[] d;
        int e;
        volatile boolean f;
        Throwable g;

        public d(int i) {
            this.a = i;
            Object[] objArr = new Object[i + 1];
            this.c = objArr;
            this.d = objArr;
        }

        @Override // rx.subjects.c.a
        public final void a(T t) {
            if (this.f) {
                return;
            }
            int i = this.e;
            Object[] objArr = this.d;
            if (i == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = t;
                this.e = 1;
                objArr[i] = objArr2;
                this.d = objArr2;
            } else {
                objArr[i] = t;
                this.e = i + 1;
            }
            this.b++;
        }

        @Override // rx.subjects.c.a
        public final void a(Throwable th) {
            if (this.f) {
                i.a(th);
                return;
            }
            this.g = th;
            this.f = true;
        }

        @Override // rx.subjects.c.a
        public final void a() {
            this.f = true;
        }

        @Override // rx.subjects.c.a
        public final boolean a(b<T> bVar) {
            int i;
            boolean z = false;
            if (bVar.getAndIncrement() != 0) {
                return false;
            }
            j<? super T> jVar = bVar.a;
            int i2 = this.a;
            int i3 = 1;
            while (true) {
                long j = bVar.b.get();
                Object[] objArr = (Object[]) bVar.g;
                if (objArr == null) {
                    objArr = this.c;
                }
                int i4 = bVar.f;
                int i5 = bVar.e;
                Object[] objArr2 = objArr;
                int i6 = i4;
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (jVar.isUnsubscribed()) {
                        bVar.g = null;
                        return z;
                    } else {
                        boolean z2 = this.f;
                        boolean z3 = i5 == this.b;
                        if (!z2 || !z3) {
                            if (z3) {
                                break;
                            }
                            if (i6 == i2) {
                                objArr2 = (Object[]) objArr2[i6];
                                i6 = 0;
                            }
                            jVar.onNext(objArr2[i6]);
                            j2++;
                            i6++;
                            i5++;
                            z = false;
                        } else {
                            bVar.g = null;
                            Throwable th = this.g;
                            if (th != null) {
                                jVar.onError(th);
                                return false;
                            }
                            jVar.onCompleted();
                            return false;
                        }
                    }
                }
                if (i == 0) {
                    if (jVar.isUnsubscribed()) {
                        bVar.g = null;
                        return false;
                    }
                    boolean z4 = this.f;
                    boolean z5 = i5 == this.b;
                    if (z4 && z5) {
                        bVar.g = null;
                        Throwable th2 = this.g;
                        if (th2 != null) {
                            jVar.onError(th2);
                            return false;
                        }
                        jVar.onCompleted();
                        return false;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    rx.internal.operators.a.b(bVar.b, j2);
                }
                bVar.e = i5;
                bVar.f = i6;
                bVar.g = objArr2;
                i3 = bVar.addAndGet(-i3);
                if (i3 == 0) {
                    return j == Long.MAX_VALUE;
                }
                z = false;
            }
        }
    }

    public static <T> c<T> g() {
        return new c<>(new C1558c(new d(16)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T> extends AtomicInteger implements rx.f, k {
        private static final long serialVersionUID = -5006209596735204567L;
        final j<? super T> a;
        final AtomicLong b = new AtomicLong();
        final C1558c<T> c;
        boolean d;
        int e;
        int f;
        Object g;

        public b(j<? super T> jVar, C1558c<T> c1558c) {
            this.a = jVar;
            this.c = c1558c;
        }

        @Override // rx.k
        public final void unsubscribe() {
            this.c.a(this);
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.f
        public final void a(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                rx.internal.operators.a.a(this.b, j);
                this.c.a.a((b) this);
            } else if (i >= 0) {
            } else {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
        }
    }
}
