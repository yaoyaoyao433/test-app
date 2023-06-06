package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes6.dex */
public final class ci {
    private static long c;
    private static long d;
    private static long e;
    final c a;
    final a b;

    /* loaded from: classes6.dex */
    static final class a {
        private final c a;

        a(c cVar) {
            this.a = cVar;
        }

        protected final void finalize() {
            try {
                synchronized (this.a) {
                    c.a(this.a, true);
                    this.a.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class b implements Runnable {
        protected int f;

        public b(int i) {
            this.f = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class d {
        final Object a = new Object();
        boolean b;
        long c;
        b d;
        int e;
        long f;

        d() {
        }

        public final boolean a() {
            boolean z;
            synchronized (this.a) {
                z = !this.b && this.c > 0;
                this.b = true;
            }
            return z;
        }
    }

    static {
        long elapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        c = elapsedRealtime;
        d = elapsedRealtime;
    }

    public ci() {
        this(false);
    }

    public ci(String str) {
        this(str, false);
    }

    private ci(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.a = new c(str, z);
        this.b = new a(this.a);
    }

    private ci(boolean z) {
        this("Timer-" + b(), false);
    }

    static synchronized long a() {
        long j;
        synchronized (ci.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime > d) {
                c += elapsedRealtime - d;
            }
            d = elapsedRealtime;
            j = c;
        }
        return j;
    }

    private static synchronized long b() {
        long j;
        synchronized (ci.class) {
            j = e;
            e = 1 + j;
        }
        return j;
    }

    private void b(b bVar, long j) {
        synchronized (this.a) {
            if (this.a.d) {
                throw new IllegalStateException("Timer was canceled");
            }
            long a2 = j + a();
            if (a2 < 0) {
                throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a2);
            }
            d dVar = new d();
            dVar.e = bVar.f;
            dVar.d = bVar;
            dVar.c = a2;
            c.a(this.a, dVar);
        }
    }

    public final void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.c.a() > 0 || Thread.currentThread() == this.a) {
            bVar.run();
        } else {
            com.xiaomi.channel.commonutils.logger.c.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    public final void a(b bVar, long j) {
        if (j >= 0) {
            b(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    public final void b(int i) {
        synchronized (this.a) {
            this.a.f.a(i);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends Thread {
        private boolean d;
        private boolean e;
        volatile long a = 0;
        volatile boolean b = false;
        private long c = 50;
        private a f = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public static final class a {
            d[] a;
            int b;
            private int c;
            private int d;

            private a() {
                this.c = 256;
                this.a = new d[this.c];
                this.b = 0;
                this.d = 0;
            }

            private void c(int i) {
                int i2 = (i * 2) + 1;
                while (i2 < this.b && this.b > 0) {
                    int i3 = i2 + 1;
                    if (i3 < this.b && this.a[i3].c < this.a[i2].c) {
                        i2 = i3;
                    }
                    if (this.a[i].c < this.a[i2].c) {
                        return;
                    }
                    d dVar = this.a[i];
                    d[] dVarArr = this.a;
                    dVarArr[i] = dVarArr[i2];
                    this.a[i2] = dVar;
                    int i4 = i2;
                    i2 = (i2 * 2) + 1;
                    i = i4;
                }
            }

            int a(d dVar) {
                for (int i = 0; i < this.a.length; i++) {
                    if (this.a[i] == dVar) {
                        return i;
                    }
                }
                return -1;
            }

            public final void a() {
                this.a = new d[this.c];
                this.b = 0;
            }

            public final void a(int i) {
                for (int i2 = 0; i2 < this.b; i2++) {
                    if (this.a[i2].e == i) {
                        this.a[i2].a();
                    }
                }
                b();
            }

            public final void b() {
                int i = 0;
                while (i < this.b) {
                    if (this.a[i].b) {
                        this.d++;
                        b(i);
                        i--;
                    }
                    i++;
                }
            }

            public final void b(int i) {
                if (i < 0 || i >= this.b) {
                    return;
                }
                d[] dVarArr = this.a;
                int i2 = this.b - 1;
                this.b = i2;
                dVarArr[i] = dVarArr[i2];
                this.a[this.b] = null;
                c(i);
            }
        }

        c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        static /* synthetic */ boolean a(c cVar, boolean z) {
            cVar.e = true;
            return true;
        }

        public final synchronized void a() {
            this.d = true;
            this.f.a();
            notify();
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
            r10.a = android.os.SystemClock.uptimeMillis();
            r10.b = true;
            r0.d.run();
            r10.b = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00b2, code lost:
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00b3, code lost:
            r10.d = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00b6, code lost:
            throw r0;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 198
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ci.c.run():void");
        }

        static /* synthetic */ void a(c cVar, d dVar) {
            a aVar = cVar.f;
            if (aVar.a.length == aVar.b) {
                d[] dVarArr = new d[aVar.b * 2];
                System.arraycopy(aVar.a, 0, dVarArr, 0, aVar.b);
                aVar.a = dVarArr;
            }
            d[] dVarArr2 = aVar.a;
            int i = aVar.b;
            aVar.b = i + 1;
            dVarArr2[i] = dVar;
            int i2 = aVar.b - 1;
            int i3 = (i2 - 1) / 2;
            while (aVar.a[i2].c < aVar.a[i3].c) {
                d dVar2 = aVar.a[i2];
                d[] dVarArr3 = aVar.a;
                dVarArr3[i2] = dVarArr3[i3];
                aVar.a[i3] = dVar2;
                int i4 = i3;
                i3 = (i3 - 1) / 2;
                i2 = i4;
            }
            cVar.notify();
        }
    }

    public final boolean a(int i) {
        boolean z;
        synchronized (this.a) {
            c.a aVar = this.a.f;
            z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= aVar.b) {
                    break;
                } else if (aVar.a[i2].e == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }
}
