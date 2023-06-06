package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class z implements bb, nv {
    public static final int a = 60;
    private static final int l = 200;
    public a d;
    iz f;
    long g;
    boolean h;
    fi i;
    public ArrayList<iw> b = new ArrayList<>();
    public final byte[] c = new byte[0];
    private ArrayList<iw> j = new ArrayList<>();
    private ArrayList<iw> k = new ArrayList<>();
    public int e = 60;

    @Override // com.tencent.mapsdk.internal.nv
    public final void d() {
    }

    private static /* synthetic */ boolean d(z zVar) {
        zVar.h = false;
        return false;
    }

    public z(iz izVar) {
        this.f = izVar;
        iv.d(c());
    }

    private void h() {
        if (this.d != null) {
            this.d.destroy();
        }
        this.d = new a();
        this.d.start();
    }

    private void i() {
        if (this.d != null) {
            this.d.destroy();
        }
    }

    public final void a() {
        if (this.d != null) {
            this.d.a();
        }
        e();
    }

    public final void b() {
        if (this.d != null) {
            this.d.b();
        }
    }

    public final void a(int i) {
        if (i <= 0) {
            return;
        }
        this.e = i;
    }

    private void j() {
        this.e = 60;
    }

    private int k() {
        return this.e;
    }

    private void l() {
        if (this.d == null) {
        }
    }

    public final long c() {
        long j = 1000 / this.e;
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    private void a(fi fiVar) {
        this.i = fiVar;
    }

    public final void a(iw iwVar) {
        synchronized (this.c) {
            if (this.b.size() > 200) {
                this.b.clear();
            }
            this.b.add(iwVar);
        }
    }

    private void a(double d, double d2) {
        synchronized (this.c) {
            while (!this.b.isEmpty() && this.b.get(this.b.size() - 1).z == 3) {
                iw remove = this.b.remove(this.b.size() - 1);
                d += remove.A[0];
                d2 += remove.A[1];
            }
            a(new iw(3, new double[]{d, d2}));
        }
    }

    public final void e() {
        synchronized (this.c) {
            this.k.clear();
            this.j.clear();
            boolean z = false;
            Iterator<iw> it = this.b.iterator();
            while (it.hasNext()) {
                iw next = it.next();
                if (next.D) {
                    z = true;
                    this.j.add(next);
                } else {
                    this.k.add(next);
                }
            }
            this.b.clear();
            if (z) {
                ArrayList<iw> arrayList = this.b;
                this.b = this.j;
                this.j = arrayList;
            }
            if (this.k.size() > 0) {
                Iterator<iw> it2 = this.k.iterator();
                while (it2.hasNext()) {
                    it2.next().b();
                }
            }
        }
    }

    private void b(int i) {
        synchronized (this.c) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                iw iwVar = this.b.get(size);
                if (iwVar.z == i) {
                    this.b.remove(size);
                    iwVar.b();
                }
            }
        }
    }

    public final boolean f() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    public final boolean g() {
        boolean isEmpty;
        synchronized (this.c) {
            if (this.b.isEmpty()) {
                return false;
            }
            iw iwVar = this.b.get(0);
            if (iwVar != null && iwVar.a(this.f)) {
                synchronized (this.c) {
                    this.b.remove(iwVar);
                }
            }
            synchronized (this.c) {
                isEmpty = this.b.isEmpty();
            }
            return !isEmpty;
        }
    }

    @Override // com.tencent.mapsdk.internal.bb
    public final void a(v vVar) {
        this.h = true;
        this.g = System.currentTimeMillis();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a extends Thread {
        private boolean b;
        private boolean c;

        public a() {
            super("tms-act");
        }

        @Override // java.lang.Thread
        public final synchronized void start() {
            this.b = true;
            super.start();
        }

        public final synchronized void a() {
            this.c = true;
        }

        public final synchronized void b() {
            this.c = false;
        }

        @Override // java.lang.Thread
        public final synchronized void destroy() {
            this.b = false;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (this.b) {
                if (!this.c) {
                    if (z.this.f != null) {
                        z.this.f.c(iw.G);
                    }
                    if (z.this.h && System.currentTimeMillis() - z.this.g > 50) {
                        z.this.h = false;
                        kj.b(ki.f, "notify onStable");
                        if (z.this.i != null) {
                            z.this.i.u();
                        }
                    }
                }
                try {
                    synchronized (this) {
                        wait(z.this.c());
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
