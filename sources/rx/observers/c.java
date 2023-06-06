package rx.observers;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<T> implements rx.e<T> {
    private final rx.e<? super T> a;
    private boolean b;
    private volatile boolean c;
    private a d;
    private final rx.internal.operators.c<T> e = rx.internal.operators.c.a();

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class a {
        Object[] a;
        int b;

        a() {
        }

        public final void a(Object obj) {
            int i = this.b;
            Object[] objArr = this.a;
            if (objArr == null) {
                objArr = new Object[16];
                this.a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[(i >> 2) + i];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public c(rx.e<? super T> eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0068, code lost:
        continue;
     */
    @Override // rx.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNext(T r9) {
        /*
            r8 = this;
            boolean r0 = r8.c
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r8)
            boolean r0 = r8.c     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto Lc
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L77
            return
        Lc:
            boolean r0 = r8.b     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L24
            rx.observers.c$a r0 = r8.d     // Catch: java.lang.Throwable -> L77
            if (r0 != 0) goto L1b
            rx.observers.c$a r0 = new rx.observers.c$a     // Catch: java.lang.Throwable -> L77
            r0.<init>()     // Catch: java.lang.Throwable -> L77
            r8.d = r0     // Catch: java.lang.Throwable -> L77
        L1b:
            java.lang.Object r9 = rx.internal.operators.c.a(r9)     // Catch: java.lang.Throwable -> L77
            r0.a(r9)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L77
            return
        L24:
            r0 = 1
            r8.b = r0     // Catch: java.lang.Throwable -> L77
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L77
            rx.e<? super T> r1 = r8.a     // Catch: java.lang.Throwable -> L6e
            r1.onNext(r9)     // Catch: java.lang.Throwable -> L6e
        L2d:
            r1 = 0
            r2 = 0
        L2f:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L2d
            monitor-enter(r8)
            rx.observers.c$a r3 = r8.d     // Catch: java.lang.Throwable -> L6b
            if (r3 != 0) goto L3c
            r8.b = r1     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
            return
        L3c:
            r4 = 0
            r8.d = r4     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object[] r3 = r3.a
            int r4 = r3.length
            r5 = 0
        L44:
            if (r5 >= r4) goto L68
            r6 = r3[r5]
            if (r6 == 0) goto L68
            rx.e<? super T> r7 = r8.a     // Catch: java.lang.Throwable -> L58
            boolean r6 = rx.internal.operators.c.a(r7, r6)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L55
            r8.c = r0     // Catch: java.lang.Throwable -> L58
            return
        L55:
            int r5 = r5 + 1
            goto L44
        L58:
            r1 = move-exception
            r8.c = r0
            rx.exceptions.b.b(r1)
            rx.e<? super T> r0 = r8.a
            java.lang.Throwable r9 = rx.exceptions.g.a(r1, r9)
            r0.onError(r9)
            return
        L68:
            int r2 = r2 + 1
            goto L2f
        L6b:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6b
            throw r9
        L6e:
            r1 = move-exception
            r8.c = r0
            rx.e<? super T> r0 = r8.a
            rx.exceptions.b.a(r1, r0, r9)
            return
        L77:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L77
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.observers.c.onNext(java.lang.Object):void");
    }

    @Override // rx.e
    public final void onError(Throwable th) {
        rx.exceptions.b.b(th);
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.b) {
                a aVar = this.d;
                if (aVar == null) {
                    aVar = new a();
                    this.d = aVar;
                }
                aVar.a(rx.internal.operators.c.a(th));
                return;
            }
            this.b = true;
            this.a.onError(th);
        }
    }

    @Override // rx.e
    public final void onCompleted() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.b) {
                a aVar = this.d;
                if (aVar == null) {
                    aVar = new a();
                    this.d = aVar;
                }
                aVar.a(rx.internal.operators.c.b());
                return;
            }
            this.b = true;
            this.a.onCompleted();
        }
    }
}
