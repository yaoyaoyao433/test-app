package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.v;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pn implements et {
    private static final int i = 8;
    private static final float j = 10.0f;
    boolean a;
    public pq b;
    public ba d;
    private float g;
    private float h;
    private be k;
    private float l;
    private float m;
    private final float n;
    private final long e = 250;
    private final long f = 1200;
    public boolean c = false;

    @Override // com.tencent.mapsdk.internal.et
    public final void a() {
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean b(float f) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean d() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean e(float f, float f2) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean h(float f, float f2) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean j(float f, float f2) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean k(float f, float f2) {
        return false;
    }

    private static /* synthetic */ boolean a(pn pnVar) {
        pnVar.a = false;
        return false;
    }

    public pn(be beVar) {
        this.g = ViewConfiguration.getMinimumFlingVelocity();
        this.h = ViewConfiguration.getMaximumFlingVelocity();
        this.k = beVar;
        this.d = (ba) beVar.b();
        if (this.d != null) {
            this.d.a(this);
            Context G = this.d.G();
            if (G != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(G);
                this.g = viewConfiguration.getScaledMinimumFlingVelocity();
                this.h = viewConfiguration.getScaledMaximumFlingVelocity();
            }
        }
        this.b = new pq();
        this.n = beVar.h() * 2.5f;
    }

    private void a(pq pqVar) {
        this.b = pqVar;
        boolean a = pqVar.a();
        if (this.d == null) {
            return;
        }
        if (a) {
            this.d.b(this);
        } else {
            this.d.a(this);
        }
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean a(float f, float f2) {
        if (this.b.f()) {
            final ad a = this.k.a();
            Runnable runnable = new Runnable() { // from class: com.tencent.mapsdk.internal.pn.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.p();
                }
            };
            if (a.L) {
                v.b bVar = a.A.r;
                if (bVar == null) {
                    a.a(runnable);
                    return false;
                }
                float width = a.z.g().width() * (bVar.a + 0.5f);
                f2 = (bVar.b + 0.5f) * a.z.g().height();
                f = width;
            }
            if (a.l()) {
                a.z.f().c(f, f2);
                runnable.run();
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean b(float f, float f2) {
        if (this.b.g()) {
            bj c = this.k.c();
            if (c.d.h.a(f, f2)) {
                return true;
            }
            TappedElement a = c.a.f().a(f, f2);
            if (a != null) {
                if (a.type == 1 && c.e != null) {
                    new fr(a.name, kb.a(a.pixelX, a.pixelY));
                    return true;
                } else if (a.type == 6 && c.f != null) {
                    Iterator<eu> it = c.f.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean c(float f, float f2) {
        if (this.b.b() && this.b.c()) {
            this.c = true;
            if (this.a) {
                return false;
            }
            float f3 = f / 64.0f;
            float f4 = f2 / 64.0f;
            if (Math.abs(f3) >= this.n || Math.abs(f4) >= this.n) {
                PointF pointF = new PointF(f3, f4);
                long currentTimeMillis = System.currentTimeMillis();
                this.a = true;
                this.k.a().a(new AnonymousClass4(new double[]{0.0d, 0.0d}, currentTimeMillis, (((Math.max(Math.abs(f), Math.abs(f2)) - this.g) / (this.h - this.g)) * 950.0f) + 250, pointF));
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean d(float f, float f2) {
        sh f3;
        if (this.b.b()) {
            ad a = this.k.a();
            if (a.z == null || (f3 = a.z.f()) == null) {
                return false;
            }
            f3.b(f, f2);
            a.c();
            return false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean f(float f, float f2) {
        if (this.b.f()) {
            this.l = this.k.a().A.b.p;
            this.m = f2;
            return false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean g(float f, float f2) {
        kn.a(Float.valueOf(f), Float.valueOf(f2));
        if (this.b.f()) {
            this.k.a().c(Math.pow(2.0d, ((this.m - f2) * j) / this.k.g().height()) * this.l);
        }
        return true;
    }

    private boolean e() {
        boolean z = this.c;
        this.c = false;
        return z;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean b() {
        kn.a(new Object[0]);
        if (this.b.i()) {
            final ad a = this.k.a();
            a.b(new Runnable() { // from class: com.tencent.mapsdk.internal.pn.2
                @Override // java.lang.Runnable
                public final void run() {
                    a.p();
                }
            });
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean c() {
        if (this.a) {
            this.k.a().o.e();
            this.a = false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean a(float f) {
        if (this.b.d()) {
            double d = (f / 8.0f) * 2.0f;
            ad a = this.k.a();
            a.o.e();
            a.b(new iw(102, new double[]{0.0d, d}));
            return true;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean a(PointF pointF, PointF pointF2, float f) {
        if (this.b.e()) {
            ad a = this.k.a();
            double d = pointF.x;
            double d2 = pointF.y;
            double d3 = pointF2.x;
            a.o.e();
            a.c(new iw(103, new double[]{f, d, d2, d3, pointF2.y}));
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean a(PointF pointF, PointF pointF2, double d, double d2) {
        if (this.b.j()) {
            final ad a = this.k.a();
            a.a(d2 / d, pointF.x, pointF.y, pointF2.x, pointF2.y, new Runnable() { // from class: com.tencent.mapsdk.internal.pn.3
                @Override // java.lang.Runnable
                public final void run() {
                    a.p();
                }
            });
            return false;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.et
    public final boolean i(float f, float f2) {
        this.k.a().o.e();
        return false;
    }

    private void l(float f, float f2) {
        this.c = true;
        if (this.a) {
            return;
        }
        float f3 = f / 64.0f;
        float f4 = f2 / 64.0f;
        if (Math.abs(f3) >= this.n || Math.abs(f4) >= this.n) {
            PointF pointF = new PointF(f3, f4);
            long currentTimeMillis = System.currentTimeMillis();
            this.a = true;
            this.k.a().a(new AnonymousClass4(new double[]{0.0d, 0.0d}, currentTimeMillis, (((Math.max(Math.abs(f), Math.abs(f2)) - this.g) / (this.h - this.g)) * 950.0f) + 250, pointF));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.pn$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass4 extends iw {
        final /* synthetic */ long a;
        final /* synthetic */ long b;
        final /* synthetic */ PointF c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(double[] dArr, long j, long j2, PointF pointF) {
            super(3, dArr);
            this.a = j;
            this.b = j2;
            this.c = pointF;
        }

        @Override // com.tencent.mapsdk.internal.iw
        public final void b() {
            pn.this.a = false;
        }

        @Override // com.tencent.mapsdk.internal.iw
        public final boolean a() {
            long currentTimeMillis = System.currentTimeMillis() - this.a;
            if (currentTimeMillis <= this.b) {
                if (this.c.x != 0.0f) {
                    this.A[0] = it.a(currentTimeMillis, this.c.x, -this.c.x, this.b);
                }
                if (this.c.y != 0.0f) {
                    this.A[1] = it.a(currentTimeMillis, this.c.y, -this.c.y, this.b);
                }
                return false;
            }
            pn.this.a = false;
            return true;
        }
    }

    private boolean m(float f, float f2) {
        bj c = this.k.c();
        if (c.d.h.a(f, f2)) {
            return true;
        }
        TappedElement a = c.a.f().a(f, f2);
        if (a != null) {
            if (a.type == 1 && c.e != null) {
                new fr(a.name, kb.a(a.pixelX, a.pixelY));
                return true;
            } else if (a.type != 6 || c.f == null) {
                return false;
            } else {
                Iterator<eu> it = c.f.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return true;
            }
        }
        return false;
    }
}
