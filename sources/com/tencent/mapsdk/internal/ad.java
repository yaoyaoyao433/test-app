package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.sh;
import com.tencent.mapsdk.internal.v;
import com.tencent.mapsdk.internal.z;
import com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ad implements fi, id, iz, nv, og {
    private static final int O = 20;
    private static final int P = 0;
    private static final int Q = 1;
    private static final int R = 2;
    private static final int S = 3;
    private static final int T = 4;
    public static final int a = 12;
    public static final int b = 11;
    public static final int c = 10;
    public static final int d = 18;
    public static final int e = 13;
    public static final int f = 15;
    public static final int g = 15;
    public static final int h = 17;
    public static final int i = 18;
    public static final int j = 16;
    public static final int k = 18;
    public static final int l = 12;
    public static int m = 116307503;
    public static int n = 39984186;
    public v A;
    public eq B;
    public Rect C;
    public boolean M;
    private List<ol> U;
    private List<fe> V;
    private List<fi> W;
    private final List<fj> X;
    private List<fg> Y;
    private Rect aa;
    private Runnable ab;
    public pn p;
    public List<fb> q;
    public List<ew> r;
    public List<ey> s;
    public List<fd> u;
    public List<bb> v;
    public List<fc> x;
    public ba y;
    public be z;
    public final byte[] t = new byte[0];
    public final byte[] w = new byte[0];
    private Stack<v> Z = new Stack<>();
    public a D = null;
    public float E = 0.5f;
    public float F = 0.5f;
    public boolean G = false;
    public int H = 0;
    public int I = 0;
    public int J = 0;
    public int K = 0;
    public boolean L = false;
    public z o = new z(this);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(iw iwVar);
    }

    private static double m(double d2) {
        double d3 = d2 % 360.0d;
        return d3 > 180.0d ? d3 - 360.0d : d3 < -180.0d ? d3 + 360.0d : d3;
    }

    @Override // com.tencent.mapsdk.internal.nv
    public final void d() {
    }

    private void v() {
        this.M = true;
    }

    private boolean w() {
        return this.M;
    }

    public ad(be beVar) {
        this.z = beVar;
        this.y = (ba) beVar.b();
        this.A = beVar.e();
        this.B = beVar.d();
        this.C = beVar.g();
        this.o.i = this;
        a(this.o);
        this.V = new CopyOnWriteArrayList();
        this.u = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.U = new CopyOnWriteArrayList();
        this.X = new CopyOnWriteArrayList();
        this.x = new CopyOnWriteArrayList();
        this.Y = new CopyOnWriteArrayList();
        this.W = new CopyOnWriteArrayList();
        a(ei.a);
    }

    private int a(int i2, int i3, int i4, int i5, boolean z) {
        this.H = i2;
        this.I = i3;
        this.J = i4;
        this.K = i5;
        if (this.C != null && this.C.width() > 0 && this.C.height() > 0) {
            if (i2 + i4 > this.C.width() || i3 + i5 > this.C.height()) {
                return -1;
            }
            PointF a2 = a();
            a(a2.x, a2.y, z);
            return 0;
        }
        a(new AnonymousClass1(z));
        if (this.z instanceof mn) {
            Context context = ((mn) this.z).getContext();
            return (i2 + i4 > hc.b(context) || i3 + i5 > hc.c(context)) ? -1 : 0;
        }
        return -2;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ad$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements ol {
        final /* synthetic */ boolean a;

        public AnonymousClass1(boolean z) {
            this.a = z;
        }

        @Override // com.tencent.mapsdk.internal.ol
        public final void a() {
            PointF a = ad.this.a();
            ad.this.a(a.x, a.y, this.a);
            ad.this.b(this);
        }
    }

    public final PointF a() {
        int i2;
        int i3 = 0;
        if (this.C != null) {
            i3 = this.C.width();
            i2 = this.C.height();
        } else {
            i2 = 0;
        }
        int i4 = this.H;
        int i5 = i4 + (((i3 - i4) - this.J) / 2);
        int i6 = this.I;
        int i7 = i6 + (((i2 - i6) - this.K) / 2);
        if (i3 != 0 && i2 != 0) {
            return new PointF((i5 * 1.0f) / i3, (i7 * 1.0f) / i2);
        }
        return new PointF(0.5f, 0.5f);
    }

    public final Rect b() {
        return new Rect(this.H, this.I, this.J, this.K);
    }

    private boolean x() {
        return this.C != null && this.C.width() > 0 && this.C.height() > 0;
    }

    private z y() {
        z zVar = this.o;
        if (zVar.d != null) {
            zVar.d.destroy();
        }
        zVar.d = new z.a();
        zVar.d.start();
        return this.o;
    }

    private void z() {
        if (this.o != null) {
            this.o.b();
        }
    }

    private void A() {
        if (this.o != null) {
            this.o.a();
        }
    }

    private void B() {
        if (this.o != null) {
            z zVar = this.o;
            if (zVar.d != null) {
                zVar.d.destroy();
            }
        }
    }

    private z C() {
        return this.o;
    }

    public final void a(bb bbVar) {
        if (bbVar == null) {
            return;
        }
        if (this.v == null) {
            this.v = new CopyOnWriteArrayList();
        }
        synchronized (this.w) {
            if (!this.v.contains(bbVar)) {
                this.v.add(bbVar);
            }
        }
    }

    private void b(bb bbVar) {
        if (this.v == null) {
            return;
        }
        synchronized (this.w) {
            this.v.remove(bbVar);
        }
    }

    public final void c() {
        if (this.v == null) {
            return;
        }
        for (bb bbVar : this.v) {
            if (bbVar != null) {
                try {
                    bbVar.a(this.A);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void e() {
        try {
            v vVar = (v) this.A.clone();
            kj.a("mapParam stack saveMapParam:" + vVar.toString());
            this.Z.push(vVar);
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
        }
    }

    public final void f() {
        try {
            v pop = this.Z.pop();
            if (pop.b.q != this.A.b.q) {
                c(fw.c);
            } else if (pop.b.p != this.A.b.p) {
                c(fw.b);
            }
            if (pop.p.r() != this.A.p.r()) {
                pop.p.r();
                D();
            }
            if (pop.p.q() != this.A.p.q()) {
                pop.p.q();
                E();
            }
            v vVar = this.A;
            vVar.a = pop.a;
            v.a aVar = vVar.b;
            v.a aVar2 = pop.b;
            aVar.l = aVar2.l;
            aVar.m = aVar2.m;
            aVar.n = aVar2.n;
            aVar.o = aVar2.o;
            aVar.p = aVar2.p;
            aVar.q = aVar2.q;
            vVar.c.set(pop.c);
            vVar.d = pop.d;
            vVar.e = pop.e;
            vVar.f = pop.f;
            vVar.g = pop.g;
            vVar.h = pop.h;
            vVar.i = pop.i;
            vVar.j = pop.j;
            vVar.k = pop.k;
            vVar.l = pop.l;
            vVar.m.setGeoPoint(pop.m);
            vVar.q.a(pop.q.a, pop.q.b);
            vVar.n = pop.n;
            c();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b(boolean z) {
        this.G = z;
        this.z.f().b(this.G);
    }

    public final void a(Rect rect) {
        if (x()) {
            float a2 = a(rect, this.C);
            this.A.a(rect);
            this.A.d(a2);
        }
    }

    public final v g() {
        try {
            return (v) this.A.clone();
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void a(fc fcVar) {
        if (fcVar == null) {
            return;
        }
        synchronized (this.x) {
            if (!this.x.contains(fcVar)) {
                this.x.add(fcVar);
            }
        }
    }

    private void b(fc fcVar) {
        synchronized (this.x) {
            this.x.remove(fcVar);
        }
    }

    private void D() {
        for (fc fcVar : this.x) {
        }
    }

    public final void a(fg fgVar) {
        if (fgVar == null) {
            return;
        }
        synchronized (this.Y) {
            kj.a("skew addSkewListener");
            if (!this.Y.contains(fgVar)) {
                this.Y.add(fgVar);
            }
        }
    }

    public final void b(fg fgVar) {
        synchronized (this.Y) {
            kj.a("skew addSkewListener");
            this.Y.remove(fgVar);
        }
    }

    private void E() {
        kj.a("skew notifySkew");
        for (fg fgVar : this.Y) {
        }
    }

    private void a(pq pqVar) {
        if (this.p == null) {
            this.p = this.y.M();
        }
        pn pnVar = this.p;
        pnVar.b = pqVar;
        boolean a2 = pqVar.a();
        if (pnVar.d != null) {
            if (a2) {
                pnVar.d.b(pnVar);
            } else {
                pnVar.d.a(pnVar);
            }
        }
    }

    private void F() {
        GeoPoint geoPoint = new GeoPoint(n, m);
        v vVar = this.A;
        Rect g2 = this.z.g();
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        vVar.n = g2;
        vVar.c = GeometryConstants.BOUNDARY_WORLD;
        vVar.c(13);
        vVar.a(0);
        vVar.a(latitudeE6, longitudeE6, false);
        this.z.f().b(this.G);
    }

    private void a(int i2, GeoPoint geoPoint) {
        a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
        a(i2);
    }

    private void a(GeoPoint geoPoint, float f2, float f3, float f4) {
        a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
        a(f2);
        b(f3);
        a(f4);
    }

    public final void a(int i2) {
        if (this.A.c(i2)) {
            c(fw.c);
        }
    }

    private float G() {
        return this.A.b.p;
    }

    private void b(int i2, int i3) {
        a(i2, i3, 1);
    }

    public final void a(int i2, int i3, int i4) {
        this.A.a(i2, i3, false);
        if (i4 == 1) {
            U();
            c();
        }
    }

    private void a(float f2, float f3) {
        sh f4;
        if (this.z == null || (f4 = this.z.f()) == null) {
            return;
        }
        f4.b(f2, f3);
        c();
    }

    public final float a(Rect rect, Rect rect2) {
        GeoPoint geoPoint = new GeoPoint(rect.top, rect.left);
        GeoPoint geoPoint2 = new GeoPoint(rect.bottom, rect.right);
        Rect rect3 = new Rect();
        rect3.left = Math.min(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
        rect3.right = Math.max(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
        rect3.top = Math.min(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
        rect3.bottom = Math.max(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
        return (float) this.z.f().a(rect3, rect2);
    }

    private void a(Rect rect, Rect rect2, boolean z) {
        if (x()) {
            Rect rect3 = new Rect(this.C);
            if (rect2 != null) {
                rect3.left += rect2.left;
                rect3.right -= rect2.right;
                rect3.top += rect2.top;
                rect3.bottom -= rect2.bottom;
            }
            GeoPoint geoPoint = new GeoPoint(rect.top, rect.left);
            GeoPoint geoPoint2 = new GeoPoint(rect.bottom, rect.right);
            Rect rect4 = new Rect();
            rect4.left = Math.min(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
            rect4.right = Math.max(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
            rect4.top = Math.min(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
            rect4.bottom = Math.max(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
            this.z.f().a(rect4, rect3, z);
        }
    }

    public final void a(float f2) {
        c(this.A.c(f2));
    }

    private double a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        fm a2 = this.B.a(geoPoint);
        fm a3 = this.B.a(geoPoint2);
        double d2 = a3.a - a2.a;
        double d3 = a3.b - a2.b;
        return Math.sqrt((d2 * d2) + (d3 * d3));
    }

    private int H() {
        return this.A.b.q;
    }

    private GeoPoint I() {
        return this.A.m;
    }

    private void b(float f2) {
        b(f2);
    }

    public final float h() {
        return this.A.p.r();
    }

    private void c(float f2) {
        a(f2);
    }

    public final float i() {
        return this.A.p.q();
    }

    private float J() {
        return this.A.b.a();
    }

    private void b(double d2, double d3) {
        this.z.f().b((float) d2, (float) d3);
        U();
        c();
    }

    private void d(double d2) {
        if (d2 == 0.0d) {
            return;
        }
        this.A.b(this.A.p.q() + ((float) d2));
        c();
        E();
    }

    public final void a(double d2) {
        if (d2 == this.A.p.q()) {
            return;
        }
        this.A.b((float) d2);
        c();
        E();
    }

    private void e(double d2) {
        if (d2 == 0.0d) {
            return;
        }
        this.A.a(this.A.p.r() + ((float) d2));
        c();
        D();
    }

    public final void b(double d2) {
        if (kt.a(d2 - this.A.p.r()) == 0.0d) {
            return;
        }
        this.A.a((float) d2);
        c();
        D();
    }

    private void f(double d2) {
        a(this.A.b.p * ((float) d2));
    }

    private void g(double d2) {
        a((float) d2);
    }

    private void K() {
        this.A.a(0.0f);
        this.A.b(0.0f);
        D();
        E();
        c();
    }

    private void c(double d2, double d3) {
        z zVar = this.o;
        synchronized (zVar.c) {
            while (!zVar.b.isEmpty() && zVar.b.get(zVar.b.size() - 1).z == 3) {
                iw remove = zVar.b.remove(zVar.b.size() - 1);
                d2 += remove.A[0];
                d3 += remove.A[1];
            }
            zVar.a(new iw(3, new double[]{d2, d3}));
        }
    }

    public final void a(iw iwVar) {
        this.o.e();
        b(iwVar);
    }

    private void h(double d2) {
        this.o.e();
        b(new iw(102, new double[]{0.0d, d2}));
    }

    private void i(double d2) {
        this.o.e();
        b(new iw(102, new double[]{d2, 0.0d}));
    }

    private void j(double d2) {
        a((360.0d - d2) % 360.0d, i(), true);
    }

    private void k(double d2) {
        this.o.e();
        b(new iw(100, new double[]{d2}));
    }

    public final void c(double d2) {
        this.o.e();
        b(new iw(108, new double[]{d2}));
    }

    private void a(double d2, double d3, double d4, double d5, double d6) {
        this.o.e();
        c(new iw(103, new double[]{d2, d3, d4, d5, d6}));
    }

    public final void a(double d2, double d3, double d4, double d5, double d6, Runnable runnable) {
        double d7;
        double d8;
        double d9;
        double d10;
        this.o.e();
        float width = this.z.g().width() / 2.0f;
        float height = this.z.g().height() / 2.0f;
        v.b bVar = this.A.r;
        if (this.L) {
            if (bVar != null) {
                d7 = width + (bVar.a * width * 2.0f);
                d8 = height + (bVar.b * height * 2.0f);
            } else {
                d7 = width;
                d8 = height;
            }
            d10 = d8;
            d9 = d7;
        } else {
            d7 = d3;
            d8 = d4;
            d9 = d5;
            d10 = d6;
        }
        b(new iw(101, new double[]{d2, d7, d8, d9, d10}));
        iw iwVar = new iw(runnable);
        iwVar.D = false;
        iwVar.B = 0L;
        b(iwVar);
    }

    private void c(Runnable runnable) {
        if (l()) {
            this.z.f().c(this.z.g().width() / 2.0f, this.z.g().height() / 2.0f);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void a(float f2, float f3, Runnable runnable) {
        if (this.L) {
            v.b bVar = this.A.r;
            if (bVar == null) {
                a(runnable);
                return;
            }
            float width = this.z.g().width() * (bVar.a + 0.5f);
            f3 = (bVar.b + 0.5f) * this.z.g().height();
            f2 = width;
        }
        if (l()) {
            this.z.f().c(f2, f3);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void b(float f2, float f3, Runnable runnable) {
        if (l()) {
            this.z.f().c(f2, f3);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void j() {
        this.o.e();
        a(0.0d, 0.0d, true);
    }

    private void a(boolean z, Runnable runnable) {
        this.o.e();
        double m2 = m(0.0d - h());
        double i2 = 0.0d - i();
        if (m2 == 0.0d && i2 == 0.0d) {
            if (runnable != null) {
                iw iwVar = new iw(runnable);
                iwVar.D = true;
                iwVar.B = 0L;
                b(iwVar);
                return;
            }
            return;
        }
        kj.a("postRotateAndSkew distance:" + m2 + CommonConstant.Symbol.COMMA + i2);
        b(new AnonymousClass3(new double[]{0.0d, 0.0d, 0.0d, 0.0d}, z ^ true, System.currentTimeMillis(), (float) (m2 * 0.10000000149011612d), (float) (0.10000000149011612d * i2), m2, i2));
        if (runnable != null) {
            iw iwVar2 = new iw(runnable);
            iwVar2.D = true;
            iwVar2.B = 0L;
            b(iwVar2);
        }
    }

    private void M() {
        o();
        a(h(), 40.0d, true);
    }

    private void l(double d2) {
        a((360.0d - d2) % 360.0d, 40.0d, true);
    }

    private boolean N() {
        if (this.p != null) {
            pn pnVar = this.p;
            boolean z = pnVar.c;
            pnVar.c = false;
            return z;
        }
        return false;
    }

    public final void a(double d2, double d3) {
        double m2 = m(d2 - h());
        double i2 = d3 - i();
        if (m2 == 0.0d && i2 == 0.0d) {
            return;
        }
        kj.a("rotateAndSkew distance:" + m2 + CommonConstant.Symbol.COMMA + i2);
        b(new iw(102, new double[]{m2, i2, 0.0d, 0.0d}, true));
    }

    public final void a(final double d2, final double d3, boolean z) {
        final double m2 = m(d2 - h());
        final double i2 = d3 - i();
        if (m2 == 0.0d && i2 == 0.0d) {
            return;
        }
        kj.a("postRotateAndSkew distance:" + m2 + CommonConstant.Symbol.COMMA + i2);
        final long currentTimeMillis = System.currentTimeMillis();
        final float f2 = (float) (m2 * 0.10000000149011612d);
        final float f3 = (float) (0.10000000149011612d * i2);
        b(new iw(new double[]{d2, d3, 0.0d, 0.0d}, z ^ true) { // from class: com.tencent.mapsdk.internal.ad.2
            @Override // com.tencent.mapsdk.internal.iw
            public final boolean a() {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                double a2 = it.a(currentTimeMillis2, f2);
                double a3 = it.a(currentTimeMillis2, f3);
                double[] dArr = this.A;
                dArr[2] = dArr[2] + Math.abs(a2);
                double[] dArr2 = this.A;
                dArr2[3] = dArr2[3] + Math.abs(a3);
                boolean z2 = this.A[2] >= Math.abs(m2);
                boolean z3 = this.A[3] >= Math.abs(i2);
                if (z2) {
                    this.A[0] = d2 - ad.this.h();
                } else {
                    this.A[0] = a2;
                }
                if (z3) {
                    this.A[1] = d3 - ad.this.i();
                } else {
                    this.A[1] = a3;
                }
                return z2 && z3;
            }
        });
    }

    private void b(boolean z, Runnable runnable) {
        double m2 = m(0.0d - h());
        double i2 = 0.0d - i();
        if (m2 == 0.0d && i2 == 0.0d) {
            if (runnable != null) {
                iw iwVar = new iw(runnable);
                iwVar.D = true;
                iwVar.B = 0L;
                b(iwVar);
                return;
            }
            return;
        }
        kj.a("postRotateAndSkew distance:" + m2 + CommonConstant.Symbol.COMMA + i2);
        b(new AnonymousClass3(new double[]{0.0d, 0.0d, 0.0d, 0.0d}, z ^ true, System.currentTimeMillis(), (float) (m2 * 0.10000000149011612d), (float) (0.10000000149011612d * i2), m2, i2));
        if (runnable != null) {
            iw iwVar2 = new iw(runnable);
            iwVar2.D = true;
            iwVar2.B = 0L;
            b(iwVar2);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ad$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass3 extends iw {
        final /* synthetic */ long a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ double d;
        final /* synthetic */ double e;
        final /* synthetic */ double f = 0.0d;
        final /* synthetic */ double g = 0.0d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(double[] dArr, boolean z, long j, float f, float f2, double d, double d2) {
            super(102, dArr, z);
            this.a = j;
            this.b = f;
            this.c = f2;
            this.d = d;
            this.e = d2;
        }

        @Override // com.tencent.mapsdk.internal.iw
        public final boolean a() {
            long currentTimeMillis = System.currentTimeMillis() - this.a;
            double a = it.a(currentTimeMillis, this.b);
            double a2 = it.a(currentTimeMillis, this.c);
            double[] dArr = this.A;
            dArr[2] = dArr[2] + Math.abs(a);
            double[] dArr2 = this.A;
            dArr2[3] = dArr2[3] + Math.abs(a2);
            boolean z = this.A[2] >= Math.abs(this.d);
            boolean z2 = this.A[3] >= Math.abs(this.e);
            if (z) {
                this.A[0] = this.f - ad.this.h();
            } else {
                this.A[0] = a;
            }
            if (z2) {
                this.A[1] = this.g - ad.this.i();
            } else {
                this.A[1] = a2;
            }
            return z && z2;
        }
    }

    private void O() {
        o();
        j();
    }

    private void P() {
        o();
        this.o.e();
        a(0.0d, 0.0d);
    }

    private void Q() {
        o();
        this.o.e();
        a(h(), 40.0d);
    }

    public final boolean k() {
        return ((double) Math.abs(i())) > 1.0E-6d || Math.abs(h()) > 1.0f;
    }

    private void d(iw iwVar) {
        int i2 = iwVar.z;
        if (i2 == 6) {
            if (iwVar.E != null) {
                iwVar.E.run();
            }
        } else if (i2 == 120) {
            a((float) iwVar.A[0]);
            a((int) iwVar.A[1], (int) iwVar.A[2], 1);
        } else if (i2 != 10000) {
            switch (i2) {
                case 2:
                    if (this.y == null || this.y.getMapRenderView() == null) {
                        return;
                    }
                    this.y.getMapRenderView().d();
                    return;
                case 3:
                    b(iwVar.A[0], iwVar.A[1]);
                    return;
                case 4:
                    a((int) iwVar.A[0], (int) iwVar.A[1], iwVar.A.length > 2 ? (int) iwVar.A[2] : 1);
                    return;
                default:
                    switch (i2) {
                        case 100:
                            f(iwVar.A[0]);
                            return;
                        case 101:
                            int width = this.z.g().width();
                            int height = this.z.g().height();
                            int i3 = width / 2;
                            int i4 = height / 2;
                            v.b bVar = this.A.r;
                            if (bVar != null) {
                                i3 = (int) (i3 + (bVar.a * width));
                                i4 = (int) (i4 + (bVar.b * height));
                            }
                            double d2 = i3;
                            double d3 = i4;
                            b(d2 - iwVar.A[1], d3 - iwVar.A[2]);
                            f(iwVar.A[0]);
                            b(iwVar.A[3] - d2, iwVar.A[4] - d3);
                            return;
                        case 102:
                            e(iwVar.A[0]);
                            d(iwVar.A[1]);
                            return;
                        case 103:
                            double width2 = this.z.g().width() / 2;
                            double height2 = this.z.g().height() / 2;
                            b(width2 - iwVar.A[1], height2 - iwVar.A[2]);
                            e(iwVar.A[0]);
                            b(iwVar.A[3] - width2, iwVar.A[4] - height2);
                            return;
                        case 104:
                            this.A.a(0.0f);
                            this.A.b(0.0f);
                            D();
                            E();
                            c();
                            return;
                        default:
                            switch (i2) {
                                case 108:
                                    a((float) iwVar.A[0]);
                                    return;
                                case 109:
                                    b(iwVar.A[0]);
                                    return;
                                case 110:
                                    a(iwVar.A[0]);
                                    return;
                                default:
                                    return;
                            }
                    }
            }
        } else if (this.D != null) {
            this.D.a(iwVar);
        }
    }

    public final void b(int i2) {
        if (this.A.a(i2)) {
            for (fj fjVar : this.X) {
                if (fjVar != null) {
                    try {
                        fjVar.i(i2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            c();
        }
    }

    public final void a(float f2, float f3, boolean z) {
        this.A.a(f2 - 0.5f, f3 - 0.5f, z);
        if (z) {
            c();
        }
    }

    public final void b(float f2, float f3, boolean z) {
        this.A.a(f2 - 0.5f, f3 - 0.5f, z);
        c();
    }

    private void b(float f2, float f3) {
        this.E = f2;
        this.F = f3;
    }

    public final void b(Rect rect) {
        if (this.C == null || rect == null) {
            return;
        }
        this.aa = rect;
        if (this.z instanceof mn) {
            mn mnVar = (mn) this.z;
            if (mnVar.o != null && rect != null) {
                mnVar.C = rect;
                mnVar.a(rect.left, rect.bottom, (mnVar.o.width() - rect.right) - rect.left, (mnVar.o.height() - rect.bottom) - rect.top, true);
            }
        }
        c();
    }

    public final int m() {
        v vVar = this.A;
        if (vVar.p == null) {
            return vVar.a;
        }
        return vVar.p.s();
    }

    private void c(boolean z) {
        b(z ? 12 : 0);
    }

    private void S() {
        b(0);
    }

    private void T() {
        for (fb fbVar : this.q) {
        }
        c();
    }

    private void U() {
        for (ew ewVar : this.r) {
        }
        T();
    }

    public final void n() {
        b(this.aa);
        for (ol olVar : this.U) {
            if (olVar != null) {
                try {
                    olVar.a();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void o() {
        if (this.s == null) {
            return;
        }
        k();
        for (ey eyVar : this.s) {
        }
    }

    private void a(ey eyVar) {
        if (eyVar == null) {
            return;
        }
        if (this.s == null) {
            this.s = new ArrayList();
        }
        synchronized (this.t) {
            if (!this.s.contains(eyVar)) {
                this.s.add(eyVar);
            }
        }
    }

    private void b(ey eyVar) {
        if (this.s == null) {
            return;
        }
        synchronized (this.t) {
            this.s.remove(eyVar);
        }
    }

    public final void a(fe feVar) {
        if (feVar == null) {
            return;
        }
        synchronized (this.V) {
            if (!this.V.contains(feVar)) {
                this.V.add(feVar);
            }
        }
    }

    public final void b(fe feVar) {
        synchronized (this.V) {
            this.V.remove(feVar);
        }
    }

    public final void c(int i2) {
        if (i2 == fw.a) {
            return;
        }
        for (fe feVar : this.V) {
            if (feVar != null) {
                feVar.b(i2);
            }
        }
        c();
    }

    private void a(fd fdVar) {
        if (fdVar == null) {
            return;
        }
        synchronized (this.u) {
            if (!this.u.contains(fdVar)) {
                this.u.add(fdVar);
            }
        }
    }

    private void b(fd fdVar) {
        synchronized (this.u) {
            this.u.remove(fdVar);
        }
    }

    public final void p() {
        for (fd fdVar : this.u) {
        }
    }

    public final void a(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        synchronized (this.W) {
            if (!this.W.contains(fiVar)) {
                this.W.add(fiVar);
            }
        }
    }

    public final void b(fi fiVar) {
        synchronized (this.W) {
            this.W.remove(fiVar);
        }
    }

    private void V() {
        for (fi fiVar : this.W) {
            if (fiVar != null) {
                try {
                    fiVar.u();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void a(fb fbVar) {
        if (fbVar == null) {
            return;
        }
        synchronized (this.q) {
            if (!this.q.contains(fbVar)) {
                this.q.add(fbVar);
            }
        }
    }

    private void b(fb fbVar) {
        synchronized (this.q) {
            this.q.remove(fbVar);
        }
    }

    private void a(ew ewVar) {
        if (ewVar == null) {
            return;
        }
        synchronized (this.r) {
            if (!this.r.contains(ewVar)) {
                this.r.add(ewVar);
            }
        }
    }

    private void b(ew ewVar) {
        synchronized (this.r) {
            this.r.remove(ewVar);
        }
    }

    public final void a(ol olVar) {
        if (olVar == null || this.U.contains(olVar)) {
            return;
        }
        this.U.add(olVar);
    }

    public final void b(ol olVar) {
        synchronized (this.U) {
            this.U.remove(olVar);
        }
    }

    public final void a(fj fjVar) {
        if (fjVar == null) {
            return;
        }
        synchronized (this.X) {
            if (!this.X.contains(fjVar)) {
                this.X.add(fjVar);
            }
        }
    }

    public final void b(fj fjVar) {
        synchronized (this.X) {
            this.X.remove(fjVar);
        }
    }

    private void d(int i2) {
        for (fj fjVar : this.X) {
            if (fjVar != null) {
                try {
                    fjVar.i(i2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        c();
    }

    private void a(GeoPoint geoPoint, Rect rect) {
        double d2;
        eq eqVar = this.B;
        fm a2 = eqVar.a(geoPoint);
        if (rect.contains((int) a2.a, (int) a2.b)) {
            return;
        }
        double d3 = 0.0d;
        if (a2.a < rect.left) {
            d2 = rect.left - a2.a;
        } else {
            d2 = a2.a > ((double) rect.right) ? rect.right - a2.a : 0.0d;
        }
        if (a2.b < rect.top) {
            d3 = rect.top - a2.b;
        } else if (a2.b > rect.bottom) {
            d3 = rect.bottom - a2.b;
        }
        fm a3 = eqVar.a(this.A.m);
        a3.a -= d2;
        a3.b -= d3;
        a(eqVar.a(a3), (Runnable) null);
    }

    private void b(GeoPoint geoPoint, Rect rect) {
        eq eqVar = this.B;
        fm a2 = eqVar.a(geoPoint);
        double centerX = rect.centerX() - a2.a;
        double centerY = rect.centerY() - a2.b;
        fm a3 = eqVar.a(this.A.m);
        a3.a -= centerX;
        a3.b -= centerY;
        a(eqVar.a(a3), (Runnable) null);
    }

    private void c(GeoPoint geoPoint) {
        a(geoPoint, (Runnable) null);
    }

    private void b(GeoPoint geoPoint, int i2, Runnable runnable) {
        a(geoPoint, i2, runnable);
    }

    private float b(GeoPoint geoPoint, GeoPoint geoPoint2) {
        if (x()) {
            int latitudeE6 = geoPoint.getLatitudeE6();
            int longitudeE6 = geoPoint.getLongitudeE6();
            int latitudeE62 = geoPoint2.getLatitudeE6();
            int longitudeE62 = geoPoint2.getLongitudeE6();
            return a(new Rect(Math.min(longitudeE62, longitudeE6), Math.min(latitudeE62, latitudeE6), Math.max(longitudeE62, longitudeE6), Math.max(latitudeE62, latitudeE6)), this.C);
        }
        return this.A.b.p;
    }

    private void d(Rect rect) {
        b(rect, (Rect) null);
    }

    public final void b(Rect rect, Rect rect2) {
        if (x()) {
            Rect rect3 = new Rect(this.C);
            if (rect2 != null) {
                rect3.left += rect2.left;
                rect3.right -= rect2.right;
                rect3.top += rect2.top;
                rect3.bottom -= rect2.bottom;
            }
            a(rect, rect2, true);
            U();
        }
    }

    public final void c(Rect rect, Rect rect2) {
        if (rect == null) {
            return;
        }
        if (rect.height() > 0 || rect.width() > 0) {
            a(rect, rect2, false);
        }
        U();
    }

    private float d(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(this.z.g());
        if (rect2 != null) {
            rect3.left += rect2.left;
            rect3.right -= rect2.right;
            rect3.top += rect2.top;
            rect3.bottom -= rect2.bottom;
        }
        return a(rect, rect3);
    }

    public final void a(GeoPoint geoPoint, int i2, Runnable runnable) {
        a(geoPoint, i2, runnable);
    }

    public final void a(GeoPoint geoPoint, float f2, Runnable runnable) {
        if (geoPoint == null) {
            return;
        }
        if (f2 >= 3.0f && f2 <= 20.0f) {
            this.z.f().a(geoPoint, (int) f2);
        }
        this.ab = runnable;
    }

    public final void a(int i2, Runnable runnable) {
        sh f2 = this.z.f();
        if (0 != f2.e && f2.j != null) {
            f2.j.a(new sh.AnonymousClass163(i2));
        }
        runnable.run();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ad$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass4 implements Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.a(0.0d, 0.0d, false);
        }
    }

    private void e(int i2) {
        a(i2, (Runnable) new AnonymousClass4());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ad$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass5 implements Runnable {
        final /* synthetic */ double a;

        public AnonymousClass5(double d) {
            this.a = d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.a((360.0d - this.a) % 360.0d, 40.0d, false);
        }
    }

    private void a(int i2, double d2) {
        a(i2, (Runnable) new AnonymousClass5(d2));
    }

    public final Rect q() {
        fm fmVar = new fm(this.z.g().width(), this.z.g().height());
        GeoPoint a2 = this.B.a(fmVar);
        fmVar.a(0.0d, this.z.g().height());
        GeoPoint a3 = this.B.a(fmVar);
        fmVar.a(this.z.g().width(), 0.0d);
        GeoPoint a4 = this.B.a(fmVar);
        fmVar.a(0.0d, 0.0d);
        GeoPoint a5 = this.B.a(fmVar);
        return new Rect(Math.min(Math.min(Math.min(a5.getLongitudeE6(), a2.getLongitudeE6()), a3.getLongitudeE6()), a4.getLongitudeE6()), Math.min(Math.min(Math.min(a5.getLatitudeE6(), a2.getLatitudeE6()), a3.getLatitudeE6()), a4.getLatitudeE6()), Math.max(Math.max(Math.max(a5.getLongitudeE6(), a2.getLongitudeE6()), a3.getLongitudeE6()), a4.getLongitudeE6()), Math.max(Math.max(Math.max(a5.getLatitudeE6(), a2.getLatitudeE6()), a3.getLatitudeE6()), a4.getLatitudeE6()));
    }

    public final Rect r() {
        if (this.B == null) {
            return null;
        }
        fm fmVar = new fm(this.H, this.I);
        GeoPoint a2 = this.B.a(fmVar);
        fmVar.a(this.z.g().width() - this.J, this.z.g().height() - this.K);
        GeoPoint a3 = this.B.a(fmVar);
        return new Rect(Math.min(a2.getLongitudeE6(), a3.getLongitudeE6()), Math.min(a2.getLatitudeE6(), a3.getLatitudeE6()), Math.max(a2.getLongitudeE6(), a3.getLongitudeE6()), Math.max(a2.getLatitudeE6(), a3.getLatitudeE6()));
    }

    public final GeoPoint s() {
        return this.B.a(new fm(0.0d, 0.0d));
    }

    public final GeoPoint t() {
        return this.B.a(new fm(this.z.g().width(), this.z.g().height()));
    }

    private Rect W() {
        GeoPoint s = s();
        GeoPoint t = t();
        return new Rect(s.getLongitudeE6(), s.getLatitudeE6(), t.getLongitudeE6(), t.getLatitudeE6());
    }

    public final void b(iw iwVar) {
        this.o.a(iwVar);
    }

    private void X() {
        this.o.e();
    }

    private boolean Y() {
        return this.o.f();
    }

    @Override // com.tencent.mapsdk.internal.iz
    public final void c(iw iwVar) {
        if (iwVar != null) {
            d(iwVar);
        }
    }

    private boolean Z() {
        return this.o.g();
    }

    private ig a(int i2, Object obj, Object obj2) {
        switch (i2) {
            case 0:
                return iq.a((id) this, 0, 1);
            case 1:
                return iq.a((id) this, (iu) new hu(), new Object[]{obj, obj2});
            case 2:
                return iq.a(this, 3, Math.log10(((Number) obj).doubleValue()) / Math.log10(2.0d), Math.log10(((Number) obj2).doubleValue()) / Math.log10(2.0d));
            case 3:
                return iq.a(this, 2, h(), (((Number) obj2).doubleValue() - ((Number) obj).doubleValue()) + h());
            case 4:
                return iq.a(this, 4, i(), (((Number) obj2).doubleValue() - ((Number) obj).doubleValue()) + i());
            default:
                return null;
        }
    }

    @Override // com.tencent.mapsdk.internal.id
    public final void a(int i2, Object obj) {
        switch (i2) {
            case 1:
                GeoPoint geoPoint = (GeoPoint) obj;
                a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 2);
                return;
            case 2:
                e(((Number) obj).doubleValue() - h());
                return;
            case 3:
                a((float) Math.pow(2.0d, ((Number) obj).doubleValue()));
                return;
            case 4:
                d(((Number) obj).doubleValue() - i());
                return;
            default:
                return;
        }
    }

    public final void a(int i2, int i3) {
        b(i2, i3);
    }

    private void a(a aVar) {
        this.D = aVar;
    }

    private v aa() {
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.map.lib.models.GeoPoint r14, com.tencent.mapsdk.internal.Cif r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ad.a(com.tencent.map.lib.models.GeoPoint, com.tencent.mapsdk.internal.if):void");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ad$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass6 implements Runnable {
        final /* synthetic */ Cif a;

        @Override // java.lang.Runnable
        public final void run() {
        }

        public AnonymousClass6(Cif cif) {
            this.a = cif;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ad$7  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass7 implements Runnable {
        final /* synthetic */ GeoPoint a;
        final /* synthetic */ float b;
        final /* synthetic */ Runnable c;

        public AnonymousClass7(GeoPoint geoPoint, float f, Runnable runnable) {
            this.a = geoPoint;
            this.b = f;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.b(this.a, this.b, this.c);
        }
    }

    private boolean d(GeoPoint geoPoint) {
        boolean z;
        if (geoPoint == null) {
            return true;
        }
        Rect r = r();
        boolean contains = r != null ? r.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6()) : false;
        fm a2 = this.B.a(this.A.m);
        fm a3 = this.B.a(geoPoint);
        if (this.C != null) {
            double abs = Math.abs(a2.a - a3.a);
            double abs2 = Math.abs(a2.b - a3.b);
            if (abs > this.C.width() || abs2 > this.C.height()) {
                z = false;
                return contains && !z;
            }
        }
        z = true;
        if (contains) {
        }
    }

    private float c(GeoPoint geoPoint, GeoPoint geoPoint2) {
        int i2;
        int i3 = 0;
        if (this.C != null) {
            i3 = this.C.width();
            i2 = this.C.height();
        } else {
            i2 = 0;
        }
        if (i3 == 0 || i2 == 0 || geoPoint == null || geoPoint2 == null) {
            return 1.0f;
        }
        fm a2 = a(geoPoint);
        fm a3 = a(geoPoint2);
        double d2 = a3.a - a2.a;
        if (d2 < 0.0d) {
            d2 = Math.abs(d2);
        }
        double d3 = a3.b - a2.b;
        if (d3 < 0.0d) {
            d3 = Math.abs(d3);
        }
        double d4 = d2 * 1.0d;
        double d5 = d3 * 1.0d;
        int i4 = (i3 - this.H) - this.J;
        int i5 = (i2 - this.I) - this.K;
        if (i4 <= 0) {
            i4 = 1;
        }
        float max = (float) (20.0d - Math.max(Math.log(d4 / i4) / Math.log(2.0d), Math.log(d5 / (i5 > 0 ? i5 : 1)) / Math.log(2.0d)));
        return this.A != null ? v.a.a((int) max) : max;
    }

    public static fm a(GeoPoint geoPoint) {
        double min = Math.min(Math.max(Math.sin((geoPoint.getLatitudeE6() / 1000000.0d) * 0.017453292519943295d), -0.9999d), 0.9999d);
        fm fmVar = new fm();
        fmVar.a(((geoPoint.getLongitudeE6() / 1000000.0d) * 745654.0444444445d) + 1.34217728E8d, (Math.log((min + 1.0d) / (1.0d - min)) * 4.272282972352698E7d * 0.5d) + 1.34217728E8d);
        return fmVar;
    }

    private void c(GeoPoint geoPoint, float f2, Runnable runnable) {
        int i2;
        Runnable runnable2 = runnable;
        if (geoPoint == null) {
            return;
        }
        this.o.e();
        double d2 = this.A.b.p;
        double d3 = f2;
        double d4 = d3 / d2;
        int i3 = (d4 > 1.0d ? 1 : (d4 == 1.0d ? 0 : -1));
        if (i3 > 0) {
            i2 = (int) (d4 / 0.5d);
        } else if (d4 >= 1.0d) {
            b(geoPoint, runnable2);
            return;
        } else {
            i2 = i3 != 0 ? (int) (0.5d / d4) : 0;
        }
        int max = Math.max(60, Math.min(120, (i2 >> 1) << 1));
        double log10 = Math.log10(d2) / Math.log10(2.0d);
        double log102 = Math.log10(d3) / Math.log10(2.0d);
        GeoPoint geoPoint2 = this.A.m;
        int i4 = 0;
        while (i4 < max) {
            long j2 = max;
            int i5 = i4 + 1;
            long j3 = i5;
            double d5 = log10;
            double pow = Math.pow(2.0d, lx.a(log10, log102, j2, j3));
            double a2 = lx.a(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6(), j2, j3);
            double a3 = lx.a(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6(), j2, j3);
            kj.a("debug location anim zoomOut:" + a2 + CommonConstant.Symbol.COMMA + a3);
            b(new iw(120, new double[]{pow, a2, a3}));
            i4 = i5;
            log10 = d5;
            log102 = log102;
            runnable2 = runnable;
        }
        if (runnable2 != null) {
            b(new iw(runnable2));
        }
    }

    public final void b(GeoPoint geoPoint, float f2, Runnable runnable) {
        int i2;
        boolean z;
        if (geoPoint == null) {
            return;
        }
        this.o.e();
        double d2 = this.A.b.p;
        double d3 = f2;
        double d4 = d3 / d2;
        int i3 = (d4 > 1.0d ? 1 : (d4 == 1.0d ? 0 : -1));
        if (i3 > 0) {
            i2 = (int) (d4 / 0.5d);
            z = true;
        } else if (d4 >= 1.0d) {
            b(geoPoint, runnable);
            return;
        } else {
            i2 = i3 != 0 ? (int) (0.5d / d4) : 0;
            z = false;
        }
        int max = Math.max(60, Math.min(120, (i2 >> 1) << 1));
        double log10 = Math.log10(d2) / Math.log10(2.0d);
        double log102 = Math.log10(d3) / Math.log10(2.0d);
        GeoPoint geoPoint2 = this.A.m;
        if (z) {
            int i4 = 0;
            while (i4 < max) {
                long j2 = max;
                i4++;
                long j3 = i4;
                double pow = Math.pow(2.0d, lx.c(log10, log102, j2, j3));
                double d5 = log102;
                double e2 = lx.e(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6(), j2, j3);
                double e3 = lx.e(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6(), j2, j3);
                kj.a("debug location anim zoomOut:" + e2 + CommonConstant.Symbol.COMMA + e3);
                b(new iw(120, new double[]{pow, e2, e3}));
                log102 = d5;
                geoPoint2 = geoPoint2;
            }
        } else {
            int i5 = 0;
            while (i5 < max) {
                long j4 = max;
                i5++;
                long j5 = i5;
                double pow2 = Math.pow(2.0d, lx.b(log10, log102, j4, j5));
                double d6 = lx.d(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6(), j4, j5);
                double d7 = lx.d(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6(), j4, j5);
                kj.a("debug location anim zoomin:" + d6 + CommonConstant.Symbol.COMMA + d7);
                b(new iw(120, new double[]{pow2, d6, d7}));
            }
        }
        if (runnable != null) {
            b(new iw(runnable));
        }
    }

    public final void b(GeoPoint geoPoint, Runnable runnable) {
        if (geoPoint == null) {
            return;
        }
        this.o.e();
        GeoPoint geoPoint2 = this.A.m;
        double[] a2 = ie.a(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6());
        double[] a3 = ie.a(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6());
        for (int i2 = 0; i2 < 20; i2++) {
            b(new iw(4, new double[]{a2[i2], a3[i2]}));
        }
        if (runnable != null) {
            b(new iw(runnable));
        }
    }

    @Override // com.tencent.mapsdk.internal.og
    public final void a(boolean z) {
        if (z) {
            if (this.ab != null) {
                this.ab.run();
                this.ab = null;
            }
            c();
        }
    }

    private void d(boolean z) {
        this.L = z;
    }

    public final void a(Runnable runnable) {
        if (l()) {
            this.z.f().c(this.z.g().width() / 2.0f, this.z.g().height() / 2.0f);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void b(Runnable runnable) {
        if (this.A.b.q > this.A.b.n) {
            sh f2 = this.z.f();
            if (0 != f2.e && f2.j != null) {
                f2.j.a(new sh.AnonymousClass165());
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void d(Runnable runnable) {
        if (this.A.b.q > this.A.b.n) {
            sh f2 = this.z.f();
            if (0 != f2.e && f2.j != null) {
                f2.j.a(new sh.AnonymousClass165());
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void L() {
        o();
        a(h(), 40.0d, true);
    }

    public final boolean l() {
        return this.A.b.q < this.A.b.o;
    }

    private boolean R() {
        return this.A.b.q > this.A.b.n;
    }

    private void b(GeoPoint geoPoint) {
        a(geoPoint, (Runnable) null);
    }

    private void c(GeoPoint geoPoint, Runnable runnable) {
        if (geoPoint == null) {
            return;
        }
        a(geoPoint, this.A.b.q, runnable);
    }

    public final void a(GeoPoint geoPoint, Runnable runnable) {
        if (geoPoint == null) {
            return;
        }
        a(geoPoint, this.A.b.q, runnable);
    }

    private void d(GeoPoint geoPoint, Runnable runnable) {
        a(geoPoint, 18, runnable);
    }

    private void c(Rect rect) {
        b(rect, (Rect) null);
    }

    @Override // com.tencent.mapsdk.internal.fi
    public final void u() {
        for (fi fiVar : this.W) {
            if (fiVar != null) {
                try {
                    fiVar.u();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
