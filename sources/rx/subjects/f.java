package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class f<T> extends AtomicReference<a<T>> implements d.a<T> {
    private static final long serialVersionUID = 6035251036011671568L;
    volatile Object a;
    boolean b;
    rx.functions.b<b<T>> c;
    rx.functions.b<b<T>> d;
    rx.functions.b<b<T>> e;
    public final rx.internal.operators.c<T> f;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        boolean z;
        j jVar = (j) obj;
        final b<T> bVar = new b<>(jVar);
        jVar.add(rx.subscriptions.e.a(new rx.functions.a() { // from class: rx.subjects.f.1
            @Override // rx.functions.a
            public final void a() {
                f.this.a((b) bVar);
            }
        }));
        this.c.call(bVar);
        if (jVar.isUnsubscribed()) {
            return;
        }
        while (true) {
            a<T> aVar = get();
            z = false;
            if (aVar.a) {
                this.e.call(bVar);
                break;
            }
            int length = aVar.b.length;
            b[] bVarArr = new b[length + 1];
            System.arraycopy(aVar.b, 0, bVarArr, 0, length);
            bVarArr[length] = bVar;
            if (compareAndSet(aVar, new a(aVar.a, bVarArr))) {
                this.d.call(bVar);
                z = true;
                break;
            }
        }
        if (z && jVar.isUnsubscribed()) {
            a((b) bVar);
        }
    }

    public f() {
        super(a.e);
        this.b = true;
        this.c = rx.functions.e.a();
        this.d = rx.functions.e.a();
        this.e = rx.functions.e.a();
        this.f = rx.internal.operators.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b<T>[] a() {
        return get().b;
    }

    final void a(b<T> bVar) {
        a<T> aVar;
        a<T> a2;
        do {
            aVar = get();
            if (aVar.a || (a2 = aVar.a(bVar)) == aVar) {
                return;
            }
        } while (!compareAndSet(aVar, a2));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a<T> {
        static final b[] c = new b[0];
        static final a d = new a(true, c);
        static final a e = new a(false, c);
        final boolean a;
        final b[] b;

        public a(boolean z, b[] bVarArr) {
            this.a = z;
            this.b = bVarArr;
        }

        public final a a(b bVar) {
            b[] bVarArr;
            b[] bVarArr2 = this.b;
            int length = bVarArr2.length;
            if (length == 1 && bVarArr2[0] == bVar) {
                return e;
            }
            if (length == 0) {
                return this;
            }
            int i = length - 1;
            b[] bVarArr3 = new b[i];
            int i2 = 0;
            for (b bVar2 : bVarArr2) {
                if (bVar2 != bVar) {
                    if (i2 == i) {
                        return this;
                    }
                    bVarArr3[i2] = bVar2;
                    i2++;
                }
            }
            if (i2 == 0) {
                return e;
            }
            if (i2 < i) {
                bVarArr = new b[i2];
                System.arraycopy(bVarArr3, 0, bVarArr, 0, i2);
            } else {
                bVarArr = bVarArr3;
            }
            return new a(this.a, bVarArr);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T> implements rx.e<T> {
        final j<? super T> a;
        boolean b = true;
        boolean c;
        List<Object> d;
        boolean e;

        public b(j<? super T> jVar) {
            this.a = jVar;
        }

        @Override // rx.e
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.e
        public final void onCompleted() {
            this.a.onCompleted();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void a(Object obj, rx.internal.operators.c<T> cVar) {
            if (!this.e) {
                synchronized (this) {
                    this.b = false;
                    if (this.c) {
                        if (this.d == null) {
                            this.d = new ArrayList();
                        }
                        this.d.add(obj);
                        return;
                    }
                    this.e = true;
                }
            }
            rx.internal.operators.c.a(this.a, obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:42:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(java.lang.Object r7, rx.internal.operators.c<T> r8) {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = r6.b     // Catch: java.lang.Throwable -> L5b
                if (r0 == 0) goto L59
                boolean r0 = r6.c     // Catch: java.lang.Throwable -> L5b
                if (r0 == 0) goto La
                goto L59
            La:
                r0 = 0
                r6.b = r0     // Catch: java.lang.Throwable -> L5b
                r1 = 1
                if (r7 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                r6.c = r2     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L5b
                if (r7 == 0) goto L58
                r2 = 0
                r3 = r2
                r4 = 1
            L1b:
                if (r3 == 0) goto L32
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2f
            L21:
                boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L2f
                if (r5 == 0) goto L32
                java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L2f
                r6.c(r5, r8)     // Catch: java.lang.Throwable -> L2f
                goto L21
            L2f:
                r7 = move-exception
                r1 = 0
                goto L4d
            L32:
                if (r4 == 0) goto L38
                r6.c(r7, r8)     // Catch: java.lang.Throwable -> L2f
                r4 = 0
            L38:
                monitor-enter(r6)     // Catch: java.lang.Throwable -> L2f
                java.util.List<java.lang.Object> r3 = r6.d     // Catch: java.lang.Throwable -> L45
                r6.d = r2     // Catch: java.lang.Throwable -> L45
                if (r3 != 0) goto L43
                r6.c = r0     // Catch: java.lang.Throwable -> L45
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L4b
                goto L58
            L43:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
                goto L1b
            L45:
                r7 = move-exception
                r1 = 0
            L47:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L4b
                throw r7     // Catch: java.lang.Throwable -> L49
            L49:
                r7 = move-exception
                goto L4d
            L4b:
                r7 = move-exception
                goto L47
            L4d:
                if (r1 != 0) goto L57
                monitor-enter(r6)
                r6.c = r0     // Catch: java.lang.Throwable -> L54
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L54
                goto L57
            L54:
                r7 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L54
                throw r7
            L57:
                throw r7
            L58:
                return
            L59:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L5b
                return
            L5b:
                r7 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L5b
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.subjects.f.b.b(java.lang.Object, rx.internal.operators.c):void");
        }

        private void c(Object obj, rx.internal.operators.c<T> cVar) {
            if (obj != null) {
                rx.internal.operators.c.a(this.a, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b<T>[] a(Object obj) {
        this.a = obj;
        this.b = false;
        if (get().a) {
            return a.c;
        }
        return getAndSet(a.d).b;
    }
}
