package com.tencent.liteav.k;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class n {
    private Context A;
    private com.tencent.liteav.k.h e;
    private com.tencent.liteav.k.j a = null;
    private com.tencent.liteav.k.k b = null;
    private com.tencent.liteav.k.c c = null;
    private com.tencent.liteav.k.a d = null;
    private com.tencent.liteav.k.e f = null;
    private com.tencent.liteav.k.i g = null;
    private com.tencent.liteav.k.d h = null;
    private com.tencent.liteav.k.g i = null;
    private com.tencent.liteav.k.b j = null;
    private com.tencent.liteav.f k = null;
    private com.tencent.liteav.g l = null;
    private l m = null;
    private m n = null;
    private d o = null;
    private a p = null;
    private i q = null;
    private f r = null;
    private k s = null;
    private e t = null;
    private h u = null;
    private c v = null;
    private g w = null;
    private j x = null;
    private final Queue<Runnable> y = new LinkedList();
    private final String z = "VideoEffect";

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends C1457n {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        public int a;
        public int b;
        public int c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class d extends C1457n {
        public float a = 0.0f;
        public float b = 0.4f;
        public float[] c = {0.5f, 0.5f};
        public float d = 0.0f;
        public float e = 10.0f;
        public float[] f = {0.0f, 0.0f};
        public float[] g = {0.0f, 0.0f};
        public float[] h = {0.0f, 0.0f};
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class e extends C1457n {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c = 0.0f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class f extends C1457n {
        public int a = 5;
        public int b = 1;
        public float c = 0.5f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class g extends C1457n {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class h extends C1457n {
        public float a = 0.0f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class i extends C1457n {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 0.05f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class j extends C1457n {
        public float a = 0.0f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class k extends l {
        public float[] a = {0.0f, 0.0f};
        public float[] b = {0.0f, 0.1f};
        public float[] c = {0.0f, 0.0f};
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class l extends C1457n {
        public float d = 0.5f;
        public float e = 0.5f;
        public int f = 1;
        public int g = 1;
        public float h = 0.5f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class m extends C1457n {
        public int a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.k.n$n  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1457n {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c extends C1457n {
        public float a = 0.01f;
        public float b = 0.02f;
        public float c = 0.05f;
        public float d = 30.0f;
        public float e = 0.6f;
        public float f = 0.0f;
        public a g = a.MODE_ZOOM_IN;
        public float h = 0.3f;
        public float i = 0.5f;
        public float j = 1.5f;
        public boolean k = false;

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public enum a {
            MODE_NONE(-1),
            MODE_ZOOM_IN(0),
            MODE_ZOOM_OUT(1);
            
            public int value;

            a(int i) {
                this.value = i;
            }
        }
    }

    public n(Context context) {
        this.A = null;
        this.A = context;
    }

    public void a(final int i2, final C1457n c1457n) {
        a(new Runnable() { // from class: com.tencent.liteav.k.n.1
            @Override // java.lang.Runnable
            public void run() {
                switch (i2) {
                    case 0:
                        n.this.p = (a) c1457n;
                        return;
                    case 1:
                        n.this.o = (d) c1457n;
                        return;
                    case 2:
                        n.this.m = (l) c1457n;
                        return;
                    case 3:
                        n.this.n = (m) c1457n;
                        return;
                    case 4:
                        n.this.q = (i) c1457n;
                        return;
                    case 5:
                        n.this.r = (f) c1457n;
                        return;
                    case 6:
                        n.this.s = (k) c1457n;
                        return;
                    case 7:
                        n.this.t = (e) c1457n;
                        return;
                    case 8:
                        n.this.u = (h) c1457n;
                        return;
                    case 9:
                        n.this.v = (c) c1457n;
                        return;
                    case 10:
                        n.this.w = (g) c1457n;
                        return;
                    case 11:
                        n.this.x = (j) c1457n;
                        return;
                    default:
                        return;
                }
            }
        });
    }

    public int a(b bVar) {
        a(this.y);
        int i2 = bVar.a;
        if (this.p != null) {
            d(bVar.b, bVar.c);
            if (this.d != null) {
                this.d.a(this.p);
                i2 = this.d.a(i2);
            }
        }
        if (this.o != null) {
            c(bVar.b, bVar.c);
            if (this.c != null) {
                this.c.a(this.o);
                i2 = this.c.a(i2);
            }
        }
        if (this.m != null) {
            a(bVar.b, bVar.c);
            if (this.a != null) {
                this.a.a(this.m);
                i2 = this.a.a(i2);
            }
        }
        if (this.n != null) {
            b(bVar.b, bVar.c);
            if (this.b != null) {
                this.b.a(this.n);
                i2 = this.b.a(i2);
            }
        }
        if (this.q != null) {
            e(bVar.b, bVar.c);
            if (this.e != null) {
                this.e.a(this.q);
                i2 = this.e.a(i2);
            }
        }
        if (this.r != null) {
            f(bVar.b, bVar.c);
            if (this.f != null) {
                this.f.a(this.r);
                i2 = this.f.a(i2);
            }
        }
        if (this.s != null) {
            g(bVar.b, bVar.c);
            if (this.g != null) {
                this.g.a(this.s);
                i2 = this.g.a(i2);
            }
        }
        if (this.t != null) {
            h(bVar.b, bVar.c);
            if (this.h != null) {
                this.h.a(this.t);
                i2 = this.h.a(i2);
            }
        }
        if (this.u != null) {
            i(bVar.b, bVar.c);
            if (this.i != null) {
                this.i.a(this.u);
                i2 = this.i.a(i2);
            }
        }
        if (this.v != null) {
            j(bVar.b, bVar.c);
            if (this.j != null) {
                this.j.a(this.v);
                i2 = this.j.a(i2);
            }
        }
        if (this.w != null) {
            k(bVar.b, bVar.c);
            if (this.k != null) {
                i2 = this.k.a(i2);
            }
        }
        if (this.x != null) {
            l(bVar.b, bVar.c);
            if (this.l != null) {
                this.l.a(this.x);
                i2 = this.l.a(i2);
            }
        }
        b();
        return i2;
    }

    private void a(int i2, int i3) {
        if (this.a == null) {
            this.a = new com.tencent.liteav.k.j();
            if (!this.a.a(i2, i3)) {
                TXCLog.e("VideoEffect", "mSpiritOutFilter.init failed");
                return;
            }
        }
        this.a.b(i2, i3);
    }

    private void b(int i2, int i3) {
        if (this.b == null) {
            this.b = new com.tencent.liteav.k.k();
            this.b.a(true);
            if (!this.b.c()) {
                TXCLog.e("VideoEffect", "mSpiritOutFilter.init failed");
                return;
            }
        }
        this.b.a(i2, i3);
    }

    private void c(int i2, int i3) {
        if (this.c == null) {
            this.c = new com.tencent.liteav.k.c();
            this.c.a(true);
            if (!this.c.c()) {
                TXCLog.e("VideoEffect", "mSpiritOutFilter.init failed");
                return;
            }
        }
        this.c.a(i2, i3);
    }

    private void d(int i2, int i3) {
        if (this.d == null) {
            this.d = new com.tencent.liteav.k.a();
            this.d.a(true);
            if (!this.d.c()) {
                TXCLog.e("VideoEffect", "mAnHeiFilter.init failed");
                return;
            }
        }
        this.d.a(i2, i3);
    }

    private void e(int i2, int i3) {
        if (this.e == null) {
            this.e = new com.tencent.liteav.k.h();
            this.e.a(true);
            if (!this.e.c()) {
                TXCLog.e("VideoEffect", "mShadowFilter.init failed");
                return;
            }
        }
        this.e.a(i2, i3);
    }

    private void f(int i2, int i3) {
        if (this.f == null) {
            this.f = new com.tencent.liteav.k.e();
            if (!this.f.a(i2, i3)) {
                TXCLog.e("VideoEffect", "mGhostShadowFilter.init failed");
                return;
            }
        }
        this.f.b(i2, i3);
    }

    private void g(int i2, int i3) {
        if (this.g == null) {
            this.g = new com.tencent.liteav.k.i();
            if (!this.g.a(i2, i3)) {
                TXCLog.e("VideoEffect", "createPhontomFilter.init failed");
                return;
            }
        }
        this.g.b(i2, i3);
    }

    private void h(int i2, int i3) {
        if (this.h == null) {
            this.h = new com.tencent.liteav.k.d();
            this.h.a(true);
            if (!this.h.c()) {
                TXCLog.e("VideoEffect", "createGhostFilter.init failed");
                return;
            }
        }
        this.h.a(i2, i3);
    }

    private void i(int i2, int i3) {
        if (this.i == null) {
            this.i = new com.tencent.liteav.k.g(this.A);
            if (!this.i.a(i2, i3)) {
                TXCLog.e("VideoEffect", "createGhostFilter.init failed");
                return;
            }
        }
        this.i.b(i2, i3);
    }

    private void j(int i2, int i3) {
        if (this.j == null) {
            this.j = new com.tencent.liteav.k.b();
            if (!this.j.a(i2, i3)) {
                TXCLog.e("VideoEffect", "mDiffuseFilter.init failed");
                return;
            }
        }
        this.j.b(i2, i3);
    }

    private void k(int i2, int i3) {
        if (this.k == null) {
            this.k = new com.tencent.liteav.f();
            this.k.a(true);
            if (!this.k.c()) {
                TXCLog.e("VideoEffect", "mDiffuseFilter.init failed");
                return;
            }
        }
        this.k.a(i2, i3);
    }

    private void l(int i2, int i3) {
        if (this.l == null) {
            this.l = new com.tencent.liteav.g();
            this.l.a(true);
            if (!this.l.c()) {
                TXCLog.e("VideoEffect", "mDiffuseFilter.init failed");
                return;
            }
        }
        this.l.a(i2, i3);
    }

    private void b() {
        this.p = null;
        this.o = null;
        this.m = null;
        this.n = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
    }

    private void a(Runnable runnable) {
        synchronized (this.y) {
            this.y.add(runnable);
        }
    }

    private void a(Queue<Runnable> queue) {
        Runnable poll;
        while (true) {
            synchronized (queue) {
                poll = queue.isEmpty() ? null : queue.poll();
            }
            if (poll == null) {
                return;
            }
            poll.run();
        }
    }

    public void a() {
        c();
        b();
    }

    private void c() {
        if (this.a != null) {
            this.a.a();
            this.a = null;
        }
        if (this.b != null) {
            this.b.e();
            this.b = null;
        }
        if (this.c != null) {
            this.c.e();
            this.c = null;
        }
        if (this.d != null) {
            this.d.e();
            this.d = null;
        }
        if (this.e != null) {
            this.e.e();
            this.e = null;
        }
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
        if (this.h != null) {
            this.h.e();
            this.h = null;
        }
        if (this.i != null) {
            this.i.b();
            this.i = null;
        }
        if (this.j != null) {
            this.j.a();
            this.j = null;
        }
        if (this.k != null) {
            this.k.e();
            this.k = null;
        }
        if (this.l != null) {
            this.l.e();
            this.l = null;
        }
    }
}
