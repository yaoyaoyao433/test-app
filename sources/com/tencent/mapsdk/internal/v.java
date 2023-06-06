package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.internal.sh;
import com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class v implements Cloneable {
    public int d;
    public double e;
    public double f;
    public Rect n;
    public mn o;
    public sh p;
    public b r;
    public double g = 0.0d;
    public double h = 1.0d;
    public double i = 0.0d;
    public double j = 1.0d;
    public double k = 0.0d;
    public double l = 1.0d;
    public int a = 0;
    public a b = new a();
    public Rect c = new Rect();
    public GeoPoint m = new GeoPoint();
    public fm q = new fm();

    public static boolean b(int i) {
        return i == 8 || i == 13 || i == 10;
    }

    private static int t() {
        return 20;
    }

    private static byte[] z() {
        return null;
    }

    public v(mn mnVar) {
        this.o = mnVar;
        this.p = mnVar.g;
    }

    private void a(v vVar) {
        this.a = vVar.a;
        a aVar = this.b;
        a aVar2 = vVar.b;
        aVar.l = aVar2.l;
        aVar.m = aVar2.m;
        aVar.n = aVar2.n;
        aVar.o = aVar2.o;
        aVar.p = aVar2.p;
        aVar.q = aVar2.q;
        this.c.set(vVar.c);
        this.d = vVar.d;
        this.e = vVar.e;
        this.f = vVar.f;
        this.g = vVar.g;
        this.h = vVar.h;
        this.i = vVar.i;
        this.j = vVar.j;
        this.k = vVar.k;
        this.l = vVar.l;
        this.m.setGeoPoint(vVar.m);
        this.q.a(vVar.q.a, vVar.q.b);
        this.n = vVar.n;
    }

    private void a(Rect rect, int i, int i2) {
        this.n = rect;
        this.c = GeometryConstants.BOUNDARY_WORLD;
        c(13);
        a(0);
        a(i, i2, false);
    }

    private void b() {
        if (this.o == null) {
            return;
        }
        this.m = this.p.n();
        int p = this.p.p();
        float o = this.p.o();
        if (p != this.b.q) {
            this.o.i.c(fw.c);
        } else if (o != this.b.p) {
            this.o.i.c(fw.b);
        }
        if (this.b != null) {
            this.b.a(p, o);
        }
        this.a = this.p.s();
    }

    public final boolean a(int i) {
        int s;
        if (this.p == null || (s = this.p.s()) == i) {
            return false;
        }
        if (s == 11) {
            this.o.b(false);
        }
        if (i == 11) {
            this.o.b(true);
        }
        this.a = i;
        this.p.c(i);
        this.p.d(b(i));
        kj.b(ki.f, "setMapStyle : styleId[" + i + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return true;
    }

    private int c() {
        if (this.p == null) {
            return this.a;
        }
        return this.p.s();
    }

    public final float a(float f) {
        if (this.p.r() == f) {
            return f;
        }
        float f2 = f % 360.0f;
        double radians = Math.toRadians(f);
        this.g = Math.sin(radians);
        this.h = Math.cos(radians);
        if (this.p != null) {
            sh shVar = this.p;
            shVar.a(new sh.AnonymousClass5(f2));
        }
        return f2;
    }

    private float d() {
        return this.p.r();
    }

    private double e() {
        return this.g;
    }

    private double f() {
        return this.h;
    }

    public final float b(float f) {
        if (this.p.q() == f) {
            return f;
        }
        float max = Math.max(0.0f, Math.min(40.0f, f));
        double radians = Math.toRadians(f);
        this.i = Math.sin(radians);
        this.j = Math.cos(radians);
        double d = 1.5707963267948966d - radians;
        this.l = Math.cos(d);
        this.k = Math.sin(d);
        if (this.p != null) {
            sh shVar = this.p;
            shVar.a(new sh.AnonymousClass6(max));
        }
        return max;
    }

    private double g() {
        return this.i;
    }

    private double h() {
        return this.j;
    }

    private double i() {
        return this.l;
    }

    private double j() {
        return this.k;
    }

    private float k() {
        return this.p.q();
    }

    public final int c(float f) {
        float f2;
        int i;
        int i2 = fw.a;
        float f3 = this.b.p;
        int i3 = this.b.q;
        if (this.p != null) {
            sh shVar = this.p;
            double d = f;
            if (0 != shVar.e && shVar.j != null) {
                shVar.j.a(new sh.AnonymousClass159(d));
            }
            f2 = this.p.o();
            i = this.p.p();
        } else {
            f2 = f3;
            i = i3;
        }
        this.b.a(i, f2);
        if (i != i3) {
            i2 = fw.c;
        } else if (f2 != f3) {
            i2 = fw.b;
        }
        if (AnonymousClass1.a[i2 - 1] == 1) {
            double d2 = (1 << this.b.q) * 256;
            this.d = (int) d2;
            this.e = d2 / 360.0d;
            this.f = d2 / 6.283185307179586d;
        }
        fm a2 = y.a(this, this.m);
        this.q.a(a2.a, a2.b);
        return i2;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.v$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[fw.a().length];

        static {
            try {
                a[fw.c - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private int e(float f) {
        if (this.p != null) {
            sh shVar = this.p;
            shVar.a(new sh.AnonymousClass162(f));
        }
        this.b.p = f;
        return fw.c;
    }

    private void d(int i) {
        double d = (1 << i) * 256;
        this.d = (int) d;
        this.e = d / 360.0d;
        this.f = d / 6.283185307179586d;
    }

    public final boolean c(int i) {
        return c(a.a(i)) == fw.c;
    }

    private int l() {
        return this.d;
    }

    private double m() {
        return this.e;
    }

    private double n() {
        return this.f;
    }

    private float o() {
        return this.b.p;
    }

    private static float e(int i) {
        return a.a(i);
    }

    private int p() {
        return this.b.q;
    }

    private float q() {
        return this.b.a();
    }

    public final float a() {
        return ((float) (Math.log(this.b.p) / Math.log(2.0d))) + 20.0f;
    }

    private int r() {
        return this.b.n;
    }

    private int s() {
        return this.b.o;
    }

    private void f(int i) {
        this.b.o = i;
    }

    private void g(int i) {
        this.b.n = i;
    }

    private float u() {
        return this.b.l;
    }

    public final void d(float f) {
        a aVar = this.b;
        a aVar2 = new a();
        aVar.n = aVar2.q;
        aVar.l = f / aVar2.a();
    }

    public final void a(Rect rect) {
        this.c.set(rect);
    }

    private boolean a(GeoPoint geoPoint) {
        return a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), true);
    }

    private boolean a(int i, int i2) {
        return a(i, i2, false);
    }

    private boolean b(GeoPoint geoPoint) {
        int i;
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int i2 = 1 << (20 - this.b.q);
        int i3 = 0;
        if (131072 > i2) {
            i3 = ((this.n.width() * 131072) - (this.n.width() * i2)) / 2;
            i = ((this.n.height() * 131072) - (this.n.height() * i2)) / 2;
        } else {
            i = 0;
        }
        int i4 = this.c.left - i3;
        int i5 = this.c.right + i3;
        int i6 = this.c.top - i;
        int i7 = this.c.bottom + i;
        if (latitudeE6 < i6) {
            latitudeE6 = i6;
        }
        if (latitudeE6 > i7) {
            latitudeE6 = i7;
        }
        if (longitudeE6 < i4) {
            longitudeE6 = i4;
        }
        if (longitudeE6 > i5) {
            longitudeE6 = i5;
        }
        GeoPoint geoPoint2 = new GeoPoint(latitudeE6, longitudeE6);
        sh shVar = this.p;
        shVar.j.a(new sh.AnonymousClass156(geoPoint2));
        return true;
    }

    private void a(double d, double d2) {
        this.q.a(d, d2);
    }

    private GeoPoint v() {
        return this.m;
    }

    private Rect w() {
        return this.n;
    }

    private fm x() {
        return this.q;
    }

    public final boolean a(float f, float f2, boolean z) {
        if (this.r == null) {
            this.r = new b(f, f2);
        } else {
            b bVar = this.r;
            bVar.a = f;
            bVar.b = f2;
        }
        this.o.a(f, f2, z);
        return true;
    }

    private b y() {
        return this.r;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            return vVar.m.equals(this.m) && vVar.b.equals(this.b) && vVar.a == this.a;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        GeoPoint geoPoint = this.m;
        sb.append("mapParam: ");
        sb.append("center:" + geoPoint.toString() + StringUtil.SPACE);
        sb.append("mode:" + this.a + StringUtil.SPACE);
        sb.append("mapScale:" + this.b.toString() + StringUtil.SPACE);
        StringBuilder sb2 = new StringBuilder("screenRect:");
        sb2.append(this.n != null ? this.n.toString() : StringUtil.NULL);
        sb2.append(StringUtil.SPACE);
        sb.append(sb2.toString());
        return sb.toString();
    }

    public final Object clone() throws CloneNotSupportedException {
        v vVar = (v) super.clone();
        vVar.c = new Rect(this.c);
        vVar.b = (a) this.b.clone();
        vVar.m = new GeoPoint(this.m);
        vVar.q = new fm(this.q.a, this.q.b);
        return vVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements Cloneable {
        public static final int a = 20;
        public static final int b = 20;
        public static final int c = 20;
        public static final int d = 19;
        public static final int e = 22;
        public static final int f = 16;
        public static final int g = 3;
        public static final float h = 1.6f;
        public static final float i = 0.8f;
        public static final float j = 4.0f;
        public static final float k = 3.0517578E-5f;
        public static final int r = 20;
        public static final int s = 1;
        public static final float t = 1.9073486E-6f;
        public float p;
        public int q;
        public float m = 4.0f;
        public float l = 3.0517578E-5f;
        public int o = 20;
        public int n = 3;

        public static float a(int i2) {
            return (1 << (i2 - 1)) * 1.9073486E-6f;
        }

        private static int f() {
            return 20;
        }

        private void a(float f2) {
            this.p = f2;
        }

        public final void a(int i2, float f2) {
            this.p = f2;
            this.q = i2;
        }

        private void a(a aVar) {
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.p = aVar.p;
            this.q = aVar.q;
        }

        private void b(float f2) {
            a aVar = new a();
            this.n = aVar.q;
            this.l = f2 / aVar.a();
        }

        private float b() {
            return this.p;
        }

        private int c() {
            return this.q;
        }

        public final float a() {
            return this.p / a(this.q);
        }

        private int d() {
            return this.n;
        }

        private int e() {
            return this.o;
        }

        private void b(int i2) {
            this.o = i2;
        }

        private void c(int i2) {
            this.n = i2;
        }

        private float g() {
            return this.l;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.p == aVar.p && this.q == aVar.q;
            }
            return false;
        }

        public final int hashCode() {
            return toString().hashCode();
        }

        public final String toString() {
            return "scale:" + this.p + ", scaleLevel:" + this.q;
        }

        public final Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b {
        public float a;
        public float b;

        public b(float f, float f2) {
            this.a = 0.0f;
            this.b = 0.0f;
            this.a = f;
            this.b = f2;
        }

        private void a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        private float a() {
            return this.a;
        }

        private float b() {
            return this.b;
        }
    }

    public final boolean a(int i, int i2, boolean z) {
        int i3;
        int i4;
        boolean z2 = true;
        int i5 = (1 << (20 - this.b.q)) < 0 ? 0 : 20 - this.b.q;
        if (131072 > i5) {
            i4 = ((this.n.width() * 131072) - (this.n.width() * i5)) / 2;
            i3 = ((this.n.height() * 131072) - (this.n.height() * i5)) / 2;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i6 = this.c.left - i4;
        int i7 = this.c.right + i4;
        int i8 = this.c.top - i3;
        int i9 = this.c.bottom + i3;
        if (i < i8) {
            i = i8;
        }
        if (i > i9) {
            i = i9;
        }
        if (i2 < i6) {
            i2 = i6;
        }
        if (i2 > i7) {
            i2 = i7;
        }
        if (i == this.m.getLatitudeE6() && i2 == this.m.getLongitudeE6()) {
            z2 = false;
        }
        this.m.setLatitudeE6(i);
        this.m.setLongitudeE6(i2);
        fm a2 = y.a(this, this.m);
        a(a2.a, a2.b);
        this.p.a(this.m, z);
        return z2;
    }

    private boolean b(int i, int i2) {
        int i3;
        int i4 = 1 << (20 - this.b.q);
        int i5 = 0;
        if (131072 > i4) {
            i5 = ((this.n.width() * 131072) - (this.n.width() * i4)) / 2;
            i3 = ((this.n.height() * 131072) - (this.n.height() * i4)) / 2;
        } else {
            i3 = 0;
        }
        int i6 = this.c.left - i5;
        int i7 = this.c.right + i5;
        int i8 = this.c.top - i3;
        int i9 = this.c.bottom + i3;
        if (i < i8) {
            i = i8;
        }
        if (i > i9) {
            i = i9;
        }
        if (i2 < i6) {
            i2 = i6;
        }
        if (i2 > i7) {
            i2 = i7;
        }
        GeoPoint geoPoint = new GeoPoint(i, i2);
        sh shVar = this.p;
        shVar.j.a(new sh.AnonymousClass156(geoPoint));
        return true;
    }
}
