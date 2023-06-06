package rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d<T, R> implements d.a<R> {
    final rx.d<? extends T>[] a;
    final Iterable<? extends rx.d<? extends T>> b;
    final rx.functions.k<? extends R> c;
    final int d;
    final boolean e;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    @Override // rx.functions.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void call(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = r9
            rx.j r1 = (rx.j) r1
            rx.d<? extends T>[] r9 = r8.a
            r6 = 0
            if (r9 != 0) goto L4d
            java.lang.Iterable<? extends rx.d<? extends T>> r9 = r8.b
            boolean r9 = r9 instanceof java.util.List
            if (r9 == 0) goto L20
            java.lang.Iterable<? extends rx.d<? extends T>> r9 = r8.b
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            rx.d[] r0 = new rx.d[r0]
            java.lang.Object[] r9 = r9.toArray(r0)
            rx.d[] r9 = (rx.d[]) r9
            int r0 = r9.length
            goto L4e
        L20:
            r9 = 8
            rx.d[] r9 = new rx.d[r9]
            java.lang.Iterable<? extends rx.d<? extends T>> r0 = r8.b
            java.util.Iterator r0 = r0.iterator()
            r2 = r9
            r9 = 0
        L2c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r0.next()
            rx.d r3 = (rx.d) r3
            int r4 = r2.length
            if (r9 != r4) goto L44
            int r4 = r9 >> 2
            int r4 = r4 + r9
            rx.d[] r4 = new rx.d[r4]
            java.lang.System.arraycopy(r2, r6, r4, r6, r9)
            r2 = r4
        L44:
            int r4 = r9 + 1
            r2[r9] = r3
            r9 = r4
            goto L2c
        L4a:
            r3 = r9
            r9 = r2
            goto L4f
        L4d:
            int r0 = r9.length
        L4e:
            r3 = r0
        L4f:
            if (r3 != 0) goto L55
            r1.onCompleted()
            return
        L55:
            rx.internal.operators.d$b r7 = new rx.internal.operators.d$b
            rx.functions.k<? extends R> r2 = r8.c
            int r4 = r8.d
            boolean r5 = r8.e
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            rx.internal.operators.d$a<T, R>[] r0 = r7.d
            int r1 = r0.length
            r2 = 0
        L65:
            if (r2 >= r1) goto L71
            rx.internal.operators.d$a r3 = new rx.internal.operators.d$a
            r3.<init>(r7, r2)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L65
        L71:
            r7.lazySet(r6)
            rx.j<? super R> r2 = r7.a
            r2.add(r7)
            rx.j<? super R> r2 = r7.a
            r2.setProducer(r7)
        L7e:
            if (r6 >= r1) goto L8e
            boolean r2 = r7.i
            if (r2 != 0) goto L8e
            r2 = r9[r6]
            r3 = r0[r6]
            rx.d.a(r3, r2)
            int r6 = r6 + 1
            goto L7e
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.d.call(java.lang.Object):void");
    }

    public d(Iterable<? extends rx.d<? extends T>> iterable, rx.functions.k<? extends R> kVar) {
        this(null, iterable, kVar, rx.internal.util.j.c, false);
    }

    private d(rx.d<? extends T>[] dVarArr, Iterable<? extends rx.d<? extends T>> iterable, rx.functions.k<? extends R> kVar, int i, boolean z) {
        this.a = null;
        this.b = iterable;
        this.c = kVar;
        this.d = i;
        this.e = false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class b<T, R> extends AtomicInteger implements rx.f, rx.k {
        static final Object o = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        final rx.j<? super R> a;
        final rx.functions.k<? extends R> b;
        final int c;
        final a<T, R>[] d;
        final int e;
        final Object[] f;
        final rx.internal.util.atomic.e<Object> g;
        final boolean h;
        volatile boolean i;
        volatile boolean j;
        final AtomicLong k;
        final AtomicReference<Throwable> l;
        int m;
        int n;

        public b(rx.j<? super R> jVar, rx.functions.k<? extends R> kVar, int i, int i2, boolean z) {
            this.a = jVar;
            this.b = kVar;
            this.c = i;
            this.e = i2;
            this.h = z;
            this.f = new Object[i];
            Arrays.fill(this.f, o);
            this.d = new a[i];
            this.g = new rx.internal.util.atomic.e<>(i2);
            this.k = new AtomicLong();
            this.l = new AtomicReference<>();
        }

        @Override // rx.f
        public final void a(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            } else if (i != 0) {
                rx.internal.operators.a.a(this.k, j);
                a();
            }
        }

        @Override // rx.k
        public final void unsubscribe() {
            if (this.i) {
                return;
            }
            this.i = true;
            if (getAndIncrement() == 0) {
                cancel(this.g);
            }
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.i;
        }

        final void cancel(Queue<?> queue) {
            queue.clear();
            for (a<T, R> aVar : this.d) {
                aVar.unsubscribe();
            }
        }

        final void a(Object obj, int i) {
            boolean z;
            a<T, R> aVar = this.d[i];
            synchronized (this) {
                int length = this.f.length;
                Object obj2 = this.f[i];
                int i2 = this.m;
                if (obj2 == o) {
                    i2++;
                    this.m = i2;
                }
                int i3 = this.n;
                if (obj == null) {
                    i3++;
                    this.n = i3;
                } else {
                    this.f[i] = c.c(obj);
                }
                boolean z2 = false;
                z = i2 == length;
                if (i3 == length || (obj == null && obj2 == o)) {
                    z2 = true;
                }
                if (z2) {
                    this.j = true;
                } else if (obj != null && z) {
                    this.g.a(aVar, (a<T, R>) this.f.clone());
                } else if (obj == null && this.l.get() != null && (obj2 == o || !this.h)) {
                    this.j = true;
                }
            }
            if (!z && obj != null) {
                aVar.a(1L);
            } else {
                a();
            }
        }

        private void a() {
            long j;
            if (getAndIncrement() != 0) {
                return;
            }
            rx.internal.util.atomic.e<Object> eVar = this.g;
            rx.j<? super R> jVar = this.a;
            boolean z = this.h;
            AtomicLong atomicLong = this.k;
            int i = 1;
            while (!a(this.j, eVar.isEmpty(), jVar, eVar, z)) {
                long j2 = atomicLong.get();
                boolean z2 = j2 == Long.MAX_VALUE;
                long j3 = j2;
                long j4 = 0;
                while (true) {
                    if (j3 == 0) {
                        j = j4;
                        break;
                    }
                    boolean z3 = this.j;
                    a aVar = (a) eVar.peek();
                    boolean z4 = aVar == null;
                    long j5 = j4;
                    if (!a(z3, z4, jVar, eVar, z)) {
                        if (z4) {
                            j = j5;
                            break;
                        }
                        eVar.poll();
                        Object[] objArr = (Object[]) eVar.poll();
                        if (objArr == null) {
                            this.i = true;
                            cancel(eVar);
                            jVar.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                            return;
                        }
                        try {
                            jVar.onNext((R) this.b.call(objArr));
                            aVar.a(1L);
                            j3--;
                            j4 = j5 - 1;
                        } catch (Throwable th) {
                            this.i = true;
                            cancel(eVar);
                            jVar.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j != 0 && !z2) {
                    atomicLong.addAndGet(j);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        private boolean a(boolean z, boolean z2, rx.j<?> jVar, Queue<?> queue, boolean z3) {
            if (this.i) {
                cancel(queue);
                return true;
            } else if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th = this.l.get();
                        if (th != null) {
                            jVar.onError(th);
                        } else {
                            jVar.onCompleted();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.l.get();
                if (th2 != null) {
                    cancel(queue);
                    jVar.onError(th2);
                    return true;
                } else if (z2) {
                    jVar.onCompleted();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a<T, R> extends rx.j<T> {
        final b<T, R> a;
        final int b;
        final c<T> c = c.a();
        boolean d;

        public a(b<T, R> bVar, int i) {
            this.a = bVar;
            this.b = i;
            request(bVar.e);
        }

        @Override // rx.e
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            this.a.a(c.a(t), this.b);
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Throwable th2;
            Throwable th3;
            if (this.d) {
                rx.plugins.e.a().b();
                return;
            }
            AtomicReference<Throwable> atomicReference = this.a.l;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    th3 = th;
                } else if (th2 instanceof rx.exceptions.a) {
                    ArrayList arrayList = new ArrayList(((rx.exceptions.a) th2).a);
                    arrayList.add(th);
                    th3 = new rx.exceptions.a(arrayList);
                } else {
                    th3 = new rx.exceptions.a(Arrays.asList(th2, th));
                }
            } while (!atomicReference.compareAndSet(th2, th3));
            this.d = true;
            this.a.a(null, this.b);
        }

        @Override // rx.e
        public final void onCompleted() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.a(null, this.b);
        }

        public final void a(long j) {
            request(1L);
        }
    }
}
