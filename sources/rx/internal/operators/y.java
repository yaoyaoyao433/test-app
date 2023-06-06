package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.d;
import rx.internal.util.unsafe.Pow2;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class y<T> implements d.b<T, rx.d<? extends T>> {
    final boolean a;
    final int b = Integer.MAX_VALUE;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a {
        public static final y<Object> a = new y<>(false, Integer.MAX_VALUE);
    }

    @Override // rx.functions.g
    public final /* synthetic */ Object call(Object obj) {
        rx.j jVar = (rx.j) obj;
        d dVar = new d(jVar, this.a, this.b);
        c<T> cVar = new c<>(dVar);
        dVar.d = cVar;
        jVar.add(dVar);
        jVar.setProducer(cVar);
        return dVar;
    }

    y(boolean z, int i) {
        this.a = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class c<T> extends AtomicLong implements rx.f {
        private static final long serialVersionUID = -1214379189873595503L;
        final d<T> a;

        public c(d<T> dVar) {
            this.a = dVar;
        }

        @Override // rx.f
        public final void a(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i <= 0) {
                if (i < 0) {
                    throw new IllegalArgumentException("n >= 0 required");
                }
            } else if (get() == Long.MAX_VALUE) {
            } else {
                rx.internal.operators.a.a(this, j);
                this.a.b();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class d<T> extends rx.j<rx.d<? extends T>> {
        static final b<?>[] q = new b[0];
        final rx.j<? super T> a;
        final boolean b;
        final int c;
        c<T> d;
        volatile Queue<Object> e;
        volatile rx.subscriptions.b f;
        volatile ConcurrentLinkedQueue<Throwable> g;
        volatile boolean i;
        boolean j;
        boolean k;
        long n;
        long o;
        int p;
        final int r;
        int s;
        final rx.internal.operators.c<T> h = rx.internal.operators.c.a();
        final Object l = new Object();
        volatile b<?>[] m = q;

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            Queue<Object> dVar;
            rx.d dVar2 = (rx.d) obj;
            if (dVar2 != null) {
                boolean z = false;
                if (dVar2 != rx.d.b()) {
                    if (!(dVar2 instanceof rx.internal.util.l)) {
                        long j = this.n;
                        this.n = 1 + j;
                        b<?> bVar = new b<>(this, j);
                        c().a(bVar);
                        synchronized (this.l) {
                            b<?>[] bVarArr = this.m;
                            int length = bVarArr.length;
                            b<?>[] bVarArr2 = new b[length + 1];
                            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                            bVarArr2[length] = bVar;
                            this.m = bVarArr2;
                        }
                        dVar2.a((rx.j) bVar);
                        b();
                        return;
                    }
                    T t = ((rx.internal.util.l) dVar2).e;
                    long j2 = this.d.get();
                    if (j2 != 0) {
                        synchronized (this) {
                            j2 = this.d.get();
                            if (!this.j && j2 != 0) {
                                this.j = true;
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        a((d<T>) t, j2);
                        return;
                    }
                    Queue<Object> queue = this.e;
                    if (queue == null) {
                        int i = this.c;
                        if (i == Integer.MAX_VALUE) {
                            queue = new rx.internal.util.atomic.f<>(rx.internal.util.j.c);
                        } else {
                            if (Pow2.isPowerOfTwo(i)) {
                                if (UnsafeAccess.isUnsafeAvailable()) {
                                    dVar = new SpscArrayQueue<>(i);
                                } else {
                                    dVar = new rx.internal.util.atomic.c<>(i);
                                }
                            } else {
                                dVar = new rx.internal.util.atomic.d<>(i);
                            }
                            queue = dVar;
                        }
                        this.e = queue;
                    }
                    if (!queue.offer(rx.internal.operators.c.a(t))) {
                        unsubscribe();
                        onError(rx.exceptions.g.a(new rx.exceptions.c(), t));
                        return;
                    }
                    b();
                    return;
                }
                int i2 = this.s + 1;
                if (i2 == this.r) {
                    this.s = 0;
                    request(i2);
                    return;
                }
                this.s = i2;
            }
        }

        public d(rx.j<? super T> jVar, boolean z, int i) {
            this.a = jVar;
            this.b = z;
            this.c = i;
            if (i == Integer.MAX_VALUE) {
                this.r = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
                return;
            }
            this.r = Math.max(1, i >> 1);
            request(i);
        }

        final Queue<Throwable> a() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.g;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.g;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.g = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        private rx.subscriptions.b c() {
            rx.subscriptions.b bVar;
            rx.subscriptions.b bVar2 = this.f;
            if (bVar2 == null) {
                boolean z = false;
                synchronized (this) {
                    bVar = this.f;
                    if (bVar == null) {
                        rx.subscriptions.b bVar3 = new rx.subscriptions.b();
                        this.f = bVar3;
                        bVar = bVar3;
                        z = true;
                    }
                }
                if (z) {
                    add(bVar);
                }
                return bVar;
            }
            return bVar2;
        }

        private void d() {
            ArrayList arrayList = new ArrayList(this.g);
            if (arrayList.size() == 1) {
                this.a.onError((Throwable) arrayList.get(0));
            } else {
                this.a.onError(new rx.exceptions.a(arrayList));
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            a().offer(th);
            this.i = true;
            b();
        }

        @Override // rx.e
        public final void onCompleted() {
            this.i = true;
            b();
        }

        private void a(b<T> bVar) {
            rx.internal.util.j jVar = bVar.d;
            if (jVar != null) {
                jVar.c();
            }
            this.f.b(bVar);
            synchronized (this.l) {
                b<?>[] bVarArr = this.m;
                int length = bVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (bVar.equals(bVarArr[i2])) {
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
                    this.m = q;
                    return;
                }
                b<?>[] bVarArr2 = new b[length - 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                System.arraycopy(bVarArr, i + 1, bVarArr2, i, (length - i) - 1);
                this.m = bVarArr2;
            }
        }

        final void a(b<T> bVar, T t) {
            boolean z;
            long j = this.d.get();
            if (j != 0) {
                synchronized (this) {
                    j = this.d.get();
                    if (this.j || j == 0) {
                        z = false;
                    } else {
                        this.j = true;
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                try {
                    this.a.onNext(t);
                    if (j != Long.MAX_VALUE) {
                        this.d.addAndGet(-1);
                    }
                    bVar.a(1L);
                    synchronized (this) {
                        try {
                            if (!this.k) {
                                this.j = false;
                                return;
                            }
                            this.k = false;
                            e();
                            return;
                        }
                    }
                }
            }
            rx.internal.util.j jVar = bVar.d;
            if (jVar == null) {
                jVar = rx.internal.util.j.a();
                bVar.add(jVar);
                bVar.d = jVar;
            }
            try {
                jVar.a(rx.internal.operators.c.a(t));
                b();
            } catch (IllegalStateException e) {
                if (bVar.isUnsubscribed()) {
                    return;
                }
                bVar.unsubscribe();
                bVar.onError(e);
            } catch (rx.exceptions.c e2) {
                bVar.unsubscribe();
                bVar.onError(e2);
            }
        }

        private void a(T t, long j) {
            try {
                this.a.onNext(t);
                if (j != Long.MAX_VALUE) {
                    this.d.addAndGet(-1);
                }
                int i = this.s + 1;
                if (i == this.r) {
                    this.s = 0;
                    request(i);
                } else {
                    this.s = i;
                }
                synchronized (this) {
                    try {
                        if (!this.k) {
                            this.j = false;
                            return;
                        }
                        this.k = false;
                        e();
                    }
                }
            }
        }

        final void b() {
            synchronized (this) {
                if (this.j) {
                    this.k = true;
                    return;
                }
                this.j = true;
                e();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:204:0x018c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00f6 A[Catch: all -> 0x01c3, TryCatch #10 {all -> 0x01c3, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000b, B:17:0x002e, B:21:0x003b, B:35:0x0063, B:40:0x007c, B:46:0x0094, B:49:0x009f, B:52:0x00a7, B:54:0x00ab, B:57:0x00b2, B:59:0x00b6, B:62:0x00bc, B:64:0x00c2, B:72:0x00d6, B:74:0x00de, B:78:0x00e5, B:79:0x00e8, B:82:0x00f6, B:85:0x00fd, B:89:0x0105, B:92:0x010c, B:94:0x0110, B:96:0x0116, B:112:0x0143, B:114:0x0151, B:120:0x0163, B:123:0x016b, B:125:0x0171, B:128:0x017b, B:130:0x0180, B:133:0x0185, B:135:0x018e, B:138:0x019f, B:140:0x01a5, B:22:0x003f), top: B:182:0x0002 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void e() {
            /*
                Method dump skipped, instructions count: 465
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.y.d.e():void");
        }

        private boolean f() {
            if (this.a.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.g;
            if (this.b || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                d();
                return true;
            } finally {
                unsubscribe();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b<T> extends rx.j<T> {
        static final int f = rx.internal.util.j.c / 4;
        final d<T> a;
        final long b;
        volatile boolean c;
        volatile rx.internal.util.j d;
        int e;

        public b(d<T> dVar, long j) {
            this.a = dVar;
            this.b = j;
        }

        @Override // rx.j
        public final void onStart() {
            this.e = rx.internal.util.j.c;
            request(rx.internal.util.j.c);
        }

        @Override // rx.e
        public final void onNext(T t) {
            this.a.a((b<b<T>>) this, (b<T>) t);
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            this.c = true;
            this.a.a().offer(th);
            this.a.b();
        }

        @Override // rx.e
        public final void onCompleted() {
            this.c = true;
            this.a.b();
        }

        public final void a(long j) {
            int i = this.e - ((int) j);
            if (i > f) {
                this.e = i;
                return;
            }
            this.e = rx.internal.util.j.c;
            int i2 = rx.internal.util.j.c - i;
            if (i2 > 0) {
                request(i2);
            }
        }
    }
}
