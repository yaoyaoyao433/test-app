package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.CircleInfo;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class oq extends or<ah> implements ah, nx {
    private static final int a = 128;
    private GeoPoint n;
    private double o;
    private float p;
    private CircleOptions q;
    private CircleInfo r;
    private mn s;

    private ah f() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ap f_() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.nx
    public final boolean g_() {
        return false;
    }

    public oq(ba baVar) {
        super(baVar);
        this.n = new GeoPoint(39909230, 116397428);
        this.o = 0.0d;
        this.p = 1000.0f;
        this.r = new CircleInfo();
        this.s = baVar.b();
    }

    public final void a(CircleOptions circleOptions) {
        if (circleOptions == null) {
            return;
        }
        this.q = circleOptions;
        LatLng center = circleOptions.getCenter();
        if (center != null) {
            a(GeoPoint.from(center));
        }
        setRadius(circleOptions.getRadius());
        setStrokeWidth(circleOptions.getStrokeWidth());
        setStrokeColor(circleOptions.getStrokeColor());
        setFillColor(circleOptions.getFillColor());
        setZIndex(circleOptions.getZIndex());
        setVisible(circleOptions.isVisible());
        setLevel(circleOptions.getLevel());
        this.q = circleOptions;
        q();
    }

    private void a(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return;
        }
        if (this.n == null) {
            this.n = new GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        } else {
            this.n.setLatitudeE6(geoPoint.getLatitudeE6());
            this.n.setLongitudeE6(geoPoint.getLongitudeE6());
        }
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final boolean contains(LatLng latLng) {
        LatLng center = getCenter();
        double d = center.longitude * 0.01745329251994329d;
        double d2 = center.latitude * 0.01745329251994329d;
        double d3 = latLng.longitude * 0.01745329251994329d;
        double d4 = latLng.latitude * 0.01745329251994329d;
        double sin = Math.sin(d);
        double sin2 = Math.sin(d2);
        double cos = Math.cos(d);
        double cos2 = Math.cos(d2);
        double sin3 = Math.sin(d3);
        double sin4 = Math.sin(d4);
        double cos3 = Math.cos(d3);
        double cos4 = Math.cos(d4);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
        return Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d < getRadius();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setCenter(LatLng latLng) {
        a(GeoPoint.from(latLng));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final LatLng getCenter() {
        if (this.n != null) {
            return this.n.toLatLng();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setRadius(double d) {
        if (d < 0.0d) {
            return;
        }
        if (d == 0.0d) {
            d = 1.0E-10d;
        }
        if (this.q == null || this.q.getCenter() == null) {
            return;
        }
        this.o = d;
        this.p = (float) gy.a(d, this.q.getCenter().latitude);
        q();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final double getRadius() {
        return this.o;
    }

    private double d() {
        return this.p;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setOptions(CircleOptions circleOptions) {
        a(circleOptions);
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void j_() {
        if (this.s == null) {
            return;
        }
        j();
        if (a() != -1) {
            if (p()) {
                sh shVar = this.s.g;
                int a2 = a();
                CircleInfo circleInfo = this.r;
                if (shVar.e != 0 && circleInfo != null) {
                    shVar.a(new sh.AnonymousClass68(a2, circleInfo));
                }
                this.s.v = true;
                return;
            }
            return;
        }
        sh shVar2 = this.s.g;
        this.k = ((Integer) shVar2.a((CallbackRunnable<sh.AnonymousClass57>) new sh.AnonymousClass57(this.r), (sh.AnonymousClass57) (-1))).intValue();
    }

    private void e() {
        if (a() != -1) {
            if (p()) {
                sh shVar = this.s.g;
                int a2 = a();
                CircleInfo circleInfo = this.r;
                if (shVar.e != 0 && circleInfo != null) {
                    shVar.a(new sh.AnonymousClass68(a2, circleInfo));
                }
                this.s.v = true;
                return;
            }
            return;
        }
        sh shVar2 = this.s.g;
        this.k = ((Integer) shVar2.a((CallbackRunnable<sh.AnonymousClass57>) new sh.AnonymousClass57(this.r), (sh.AnonymousClass57) (-1))).intValue();
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f, float f2) {
        if (this.n == null || this.s == null) {
            return false;
        }
        GeoPoint a2 = this.s.n.a(new fm(f, f2));
        return Math.hypot((double) (a2.getLatitudeE6() - this.n.getLatitudeE6()), (double) (a2.getLongitudeE6() - this.n.getLongitudeE6())) <= ((double) this.p);
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.en
    public final void j() {
        if ((a() <= 0 || p()) && this.s != null && this.n != null && this.o > 0.0d) {
            this.r.zIndex = (int) this.g;
            this.r.borderColor = this.f;
            this.r.borderWidth = this.d;
            this.r.fillColor = this.e;
            this.r.radius = (float) this.o;
            this.r.centerX = this.n.getLongitudeE6();
            this.r.centerY = this.n.getLatitudeE6();
            this.r.isVisible = this.h;
            this.r.level = this.j;
            q();
        }
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void h_() {
        if (a() == -1 || this.s == null) {
            return;
        }
        sh shVar = this.s.g;
        int a2 = a();
        if (shVar.e != 0 && a2 >= 0 && shVar.j != null) {
            shVar.a(new sh.AnonymousClass79(a2));
        }
        this.k = -1;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final Rect getScreenBound(eq eqVar) {
        Rect bound = getBound(eqVar);
        int i = bound.left;
        int i2 = bound.right;
        int i3 = bound.top;
        int i4 = bound.bottom;
        GeoPoint geoPoint = new GeoPoint(i3, i);
        GeoPoint geoPoint2 = new GeoPoint(i4, i);
        GeoPoint geoPoint3 = new GeoPoint(i4, i2);
        GeoPoint geoPoint4 = new GeoPoint(i3, i2);
        fm a2 = eqVar.a(geoPoint);
        fm a3 = eqVar.a(geoPoint2);
        fm a4 = eqVar.a(geoPoint3);
        fm a5 = eqVar.a(geoPoint4);
        return new Rect((int) Math.min(Math.min(a2.a, a3.a), Math.min(a4.a, a5.a)), (int) Math.min(Math.min(a2.b, a3.b), Math.min(a4.b, a5.b)), (int) Math.max(Math.max(a2.a, a3.a), Math.max(a4.a, a5.a)), (int) Math.max(Math.max(a2.b, a3.b), Math.max(a4.b, a5.b)));
    }

    @Override // com.tencent.mapsdk.internal.or, com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final Rect getBound(eq eqVar) {
        double a2 = a(this.o, this.n.getLatitudeE6() / 1000000.0d);
        fu a3 = a(new LatLng(this.n.getLatitudeE6() / 1000000.0d, this.n.getLongitudeE6() / 1000000.0d));
        fu fuVar = new fu(a3.c - a2, a3.b + a2);
        fu fuVar2 = new fu(a3.c + a2, a3.b - a2);
        LatLng a4 = a(fuVar);
        LatLng a5 = a(fuVar2);
        Rect rect = new Rect();
        rect.left = (int) (a4.longitude * 1000000.0d);
        rect.top = (int) (a4.latitude * 1000000.0d);
        rect.right = (int) (a5.longitude * 1000000.0d);
        rect.bottom = (int) (a5.latitude * 1000000.0d);
        return rect;
    }

    private static double a(double d, double d2) {
        return d / Math.cos((d2 * 3.141592653589793d) / 180.0d);
    }

    private static fu a(LatLng latLng) {
        return new fu((latLng.longitude * 2.003750834E7d) / 180.0d, ((Math.log(Math.tan(((latLng.latitude + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d);
    }

    private static LatLng a(fu fuVar) {
        return new LatLng((float) (((Math.atan(Math.exp((((float) ((fuVar.b * 180.0d) / 2.003750834E7d)) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d), (float) ((fuVar.c * 180.0d) / 2.003750834E7d));
    }
}
