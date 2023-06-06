package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.eq;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.sh;
import com.tencent.mapsdk.internal.v;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class y extends fx implements eq {
    public static final int a = 268435456;
    private static final int e = 19;
    private static final int f = 14;
    protected v b;
    protected mn c;
    private sh g;

    public y(be beVar) {
        super(4.007501668E7d);
        this.g = beVar.f();
        this.b = beVar.e();
        this.c = (mn) beVar;
    }

    private v b() {
        return this.b;
    }

    private void a(v vVar) {
        this.b = vVar;
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final GeoPoint a(fm fmVar) {
        Rect rect;
        if (fmVar == null) {
            return null;
        }
        float f2 = (float) fmVar.a;
        float f3 = (float) fmVar.b;
        if (this.c != null && (rect = this.c.C) != null) {
            f2 -= rect.left;
            f3 -= rect.top;
        }
        sh shVar = this.g;
        return (GeoPoint) shVar.b((CallbackRunnable<sh.AnonymousClass89>) new sh.AnonymousClass89(null, f2, f3), (sh.AnonymousClass89) new GeoPoint());
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final fm a(GeoPoint geoPoint) {
        Rect rect;
        if (geoPoint == null) {
            return null;
        }
        PointF a2 = this.g.a(geoPoint.getLatitudeE6() / 1000000.0d, geoPoint.getLongitudeE6() / 1000000.0d);
        float f2 = a2.x;
        float f3 = a2.y;
        if (this.c != null && (rect = this.c.C) != null) {
            f2 += rect.left;
            f3 += rect.top;
        }
        return new fm(f2, f3);
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final LatLng a(PointF pointF) {
        PointF pointF2;
        float[] fArr;
        float r = this.c.t.p.r();
        Rect rect = this.b.n;
        float width = rect.width();
        float height = rect.height();
        GeoPoint geoPoint = this.b.m;
        if (geoPoint == null) {
            return new LatLng(0.0d, 0.0d);
        }
        fm c = c(kb.a(geoPoint));
        v.b bVar = this.b.r;
        if (bVar == null) {
            pointF2 = new PointF(width / 2.0f, height / 2.0f);
        } else {
            pointF2 = new PointF((bVar.a + 0.5f) * width, (bVar.b + 0.5f) * height);
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(-r);
        if (bVar == null) {
            matrix.preTranslate(width * (-0.5f), (-0.5f) * height);
            matrix.postTranslate(width * 0.5f, height * 0.5f);
        } else {
            matrix.preTranslate(((-0.5f) - bVar.a) * width, ((-0.5f) - bVar.b) * height);
            matrix.postTranslate((bVar.a + 0.5f) * width, (bVar.b + 0.5f) * height);
        }
        matrix.mapPoints(new float[2], new float[]{pointF.x, pointF.y});
        double n = (2.003750834E7d / ((1 << this.b.b.q) * 256)) * gy.n();
        return b(new fm(c.a + ((fArr[0] - pointF2.x) * n), c.b + ((fArr[1] - pointF2.y) * n)));
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final LatLng[] a() {
        Rect rect = this.c.o;
        float width = rect.width();
        float height = rect.height();
        return new LatLng[]{this.c.n.a(new PointF(0.0f, 0.0f)), this.c.n.a(new PointF(width, 0.0f)), this.c.n.a(new PointF(width, height)), this.c.n.a(new PointF(0.0f, height))};
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final LatLng fromScreenLocation(Point point) {
        return a(new fm(point.x, point.y)).toLatLng();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final Point toScreenLocation(LatLng latLng) {
        Rect rect;
        PointF a2 = this.g.a(latLng.latitude, latLng.longitude);
        float f2 = a2.x;
        float f3 = a2.y;
        if (this.c != null && (rect = this.c.C) != null) {
            f2 += rect.left;
            f3 += rect.top;
        }
        fm fmVar = new fm(f2, f3);
        Point point = new Point();
        point.x = (int) Math.round(fmVar.a);
        point.y = (int) Math.round(fmVar.b);
        return point;
    }

    @Override // com.tencent.mapsdk.internal.eq, com.tencent.tencentmap.mapsdk.maps.Projection
    public final double metersPerPixel(double d) {
        return (4.0076E7d / ((Math.pow(2.0d, this.b.a()) * 256.0d) * gy.n())) * Math.cos((d * 3.141592653589793d) / 180.0d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glProjectionMatrix() {
        return this.g.d.nativeGLProjectMatrix();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glViewMatrix() {
        return this.g.y();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final PointF glVertexForCoordinate(LatLng latLng) {
        return a(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glModelMatrix(PointF pointF, float f2) {
        if (pointF == null) {
            return null;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        float[] nativeGLProjectMatrix = this.g.d.nativeGLProjectMatrix();
        float[] y = this.g.y();
        GeoPoint n = this.g.n();
        android.opengl.Matrix.multiplyMM(fArr, 0, nativeGLProjectMatrix, 0, y, 0);
        PointF a2 = a(kb.a(n));
        android.opengl.Matrix.translateM(fArr, 0, pointF.x - a2.x, a2.y - pointF.y, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, f2, f2, f2);
        return fArr;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final VisibleRegion getVisibleRegion() {
        so soVar = (so) this.c.b;
        Point point = new Point(0, soVar.al);
        Point point2 = new Point(soVar.ak, soVar.al);
        Point point3 = new Point(0, 0);
        Point point4 = new Point(soVar.ak, 0);
        LatLng fromScreenLocation = fromScreenLocation(point);
        LatLng fromScreenLocation2 = fromScreenLocation(point2);
        LatLng fromScreenLocation3 = fromScreenLocation(point3);
        LatLng fromScreenLocation4 = fromScreenLocation(point4);
        return new VisibleRegion(fromScreenLocation, fromScreenLocation2, fromScreenLocation3, fromScreenLocation4, LatLngBounds.builder().include(fromScreenLocation).include(fromScreenLocation2).include(fromScreenLocation3).include(fromScreenLocation4).build());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float glPixelRatio() {
        return this.g.d.nativeGLViewScaleRatio();
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final double a(Point point, Point point2) {
        GeoPoint a2 = a(new fm(point.x, point.y));
        GeoPoint a3 = a(new fm(point2.x, point2.y));
        float[] fArr = new float[1];
        Location.distanceBetween(a2.getLatitudeE6() / 1000000.0d, a2.getLongitudeE6() / 1000000.0d, a3.getLatitudeE6() / 1000000.0d, a3.getLongitudeE6() / 1000000.0d, fArr);
        return fArr[0] / ((int) Math.sqrt(Math.pow(point.x - point2.x, 2.0d) + Math.pow(point.y - point2.y, 2.0d)));
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final PointF a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        return new PointF((float) (((latLng.longitude / 360.0d) + 0.5d) * 2.68435456E8d), (float) ((((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 2.68435456E8d));
    }

    private fm c(fm fmVar) {
        if (fmVar == null) {
            return null;
        }
        fm fmVar2 = this.b.q;
        return new fm((this.b.n.width() / 2) + (fmVar.a - fmVar2.a), (this.b.n.height() / 2) - (fmVar.b - fmVar2.b));
    }

    public static fu b(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        return new fu(((geoPoint.getLongitudeE6() / 1000000.0d) * 2.003750834E7d) / 180.0d, ((Math.log(Math.tan((((geoPoint.getLatitudeE6() / 1000000.0d) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d);
    }

    private static LatLng b(fu fuVar) {
        if (fuVar == null) {
            return null;
        }
        return new LatLng(((Math.atan(Math.exp((((fuVar.y() / 2.003750834E7d) * 180.0d) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d, (fuVar.x() / 2.003750834E7d) * 180.0d);
    }

    private void a(int i) {
        this.b.c(i);
    }

    public final void a(float f2) {
        v vVar = this.b;
        if (vVar.p != null) {
            sh shVar = vVar.p;
            shVar.a(new sh.AnonymousClass162(f2));
        }
        vVar.b.p = f2;
        int i = fw.c;
    }

    public final void c(GeoPoint geoPoint) {
        int i;
        v vVar = this.b;
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int i2 = 1 << (20 - vVar.b.q);
        int i3 = 0;
        if (131072 > i2) {
            i3 = ((vVar.n.width() * 131072) - (vVar.n.width() * i2)) / 2;
            i = ((vVar.n.height() * 131072) - (vVar.n.height() * i2)) / 2;
        } else {
            i = 0;
        }
        int i4 = vVar.c.left - i3;
        int i5 = vVar.c.right + i3;
        int i6 = vVar.c.top - i;
        int i7 = vVar.c.bottom + i;
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
        sh shVar = vVar.p;
        shVar.j.a(new sh.AnonymousClass156(geoPoint2));
    }

    private void b(float f2) {
        this.b.a(f2);
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final void a(final List<? extends Boundable> list, final List<GeoPoint> list2, final Rect rect, final eq.a aVar) {
        if (list.isEmpty() && (list2 == null || list2.isEmpty())) {
            return;
        }
        Rect rect2 = new Rect(this.c.o);
        rect2.left += rect.left;
        rect2.right -= rect.right;
        rect2.top += rect.top;
        rect2.bottom -= rect.bottom;
        final int width = rect2.width();
        final int height = rect2.height();
        final z zVar = this.c.i.o;
        final int i = zVar.e;
        this.c.a(new mn.a() { // from class: com.tencent.mapsdk.internal.y.1
            @Override // com.tencent.mapsdk.internal.mn.a
            public final void a(GL10 gl10) {
                v.b bVar;
                GeoPoint geoPoint = y.this.b.m;
                float f2 = y.this.b.b.p;
                float f3 = y.this.b.b.l;
                GeoPoint geoPoint2 = null;
                float f4 = 4.0f;
                while (true) {
                    if (f4 < f3) {
                        break;
                    }
                    y.this.a(f4);
                    Rect a2 = y.a(y.this, list, list2);
                    GeoPoint geoPoint3 = new GeoPoint(a2.centerY(), a2.centerX());
                    y.this.c(geoPoint3);
                    GeoPoint geoPoint4 = new GeoPoint(a2.top, a2.left);
                    GeoPoint geoPoint5 = new GeoPoint(a2.bottom, a2.right);
                    fm a3 = y.this.a(geoPoint4);
                    fm a4 = y.this.a(geoPoint5);
                    Rect rect3 = new Rect();
                    rect3.left = (int) Math.min(a3.a, a4.a);
                    rect3.right = (int) Math.max(a3.a, a4.a);
                    rect3.top = (int) Math.min(a3.b, a4.b);
                    rect3.bottom = (int) Math.max(a3.b, a4.b);
                    if (width < rect3.width() || height < rect3.height()) {
                        f4 /= 1.01f;
                        geoPoint2 = geoPoint3;
                    } else if (!y.a(y.this)) {
                        geoPoint2 = y.a(y.this, geoPoint3, rect);
                    } else {
                        geoPoint2 = (!y.b(y.this) || (bVar = y.this.b.r) == null) ? geoPoint3 : y.a(y.this, geoPoint3, bVar);
                    }
                }
                float max = Math.max(f3, f4);
                if (i != 60) {
                    zVar.a(i);
                }
                y.this.c(geoPoint);
                y.this.a(f2);
                if (aVar != null) {
                    try {
                        aVar.a(max, geoPoint2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
        if (i != 60) {
            zVar.e = 60;
        }
    }

    private Rect a(List<? extends Boundable> list, List<GeoPoint> list2) {
        int i;
        int i2;
        int i3;
        Rect bound;
        int i4 = 0;
        if (list != null) {
            i = 0;
            i2 = 0;
            i3 = 0;
            for (Boundable boundable : list) {
                if (boundable != null && (bound = boundable.getBound(this)) != null) {
                    if (i4 == 0) {
                        i4 = bound.left;
                    }
                    if (i == 0) {
                        i = bound.right;
                    }
                    if (i2 == 0) {
                        i2 = bound.top;
                    }
                    if (i3 == 0) {
                        i3 = bound.bottom;
                    }
                    if (bound.left < i4) {
                        i4 = bound.left;
                    }
                    if (bound.right > i) {
                        i = bound.right;
                    }
                    if (bound.top > i2) {
                        i2 = bound.top;
                    }
                    if (bound.bottom < i3) {
                        i3 = bound.bottom;
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (list2 != null) {
            for (GeoPoint geoPoint : list2) {
                if (geoPoint != null) {
                    if (i4 == 0) {
                        i4 = geoPoint.getLongitudeE6();
                    }
                    if (i == 0) {
                        i = geoPoint.getLongitudeE6();
                    }
                    if (i2 == 0) {
                        i2 = geoPoint.getLatitudeE6();
                    }
                    if (i3 == 0) {
                        i3 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() < i4) {
                        i4 = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() > i) {
                        i = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() > i2) {
                        i2 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() < i3) {
                        i3 = geoPoint.getLatitudeE6();
                    }
                }
            }
        }
        return new Rect(i4, i2, i, i3);
    }

    private boolean c() {
        v.b bVar = this.b.r;
        if (bVar == null) {
            return false;
        }
        return (bVar.a == 0.0f && bVar.b == 0.0f) ? false : true;
    }

    private boolean d() {
        v.b bVar = this.b.r;
        if (bVar == null) {
            return false;
        }
        return ((double) Math.abs(bVar.a)) > 0.25d || ((double) Math.abs(bVar.b)) > 0.25d;
    }

    private GeoPoint a(GeoPoint geoPoint, Rect rect) {
        fm a2;
        if (geoPoint == null || (a2 = a(geoPoint)) == null || rect == null) {
            return null;
        }
        return a(new fm(a2.a - ((rect.left - rect.right) * 0.5d), a2.b - ((rect.top - rect.bottom) * 0.5d)));
    }

    private GeoPoint a(GeoPoint geoPoint, v.b bVar) {
        fm a2;
        if (geoPoint == null || (a2 = a(geoPoint)) == null || bVar == null) {
            return null;
        }
        double d = a2.a;
        double d2 = a2.b;
        Rect rect = new Rect(this.c.o);
        int width = rect.width();
        int height = rect.height();
        float f2 = bVar.b + 0.5f;
        double d3 = bVar.a + 0.5f;
        if (d3 < 0.25d) {
            d += (0.25d - d3) * width;
        } else if (d3 > 0.75d) {
            d -= (d3 - 0.75d) * width;
        }
        double d4 = f2;
        if (d4 < 0.25d) {
            d2 += (0.25d - d4) * height;
        } else if (d4 > 0.75d) {
            d2 -= (d4 - 0.75d) * height;
        }
        return a(new fm(d, d2));
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final float a(LatLng latLng, LatLng latLng2, int i, int i2, int i3, int i4, LatLng latLng3) {
        int i5;
        int i6;
        int i7;
        float f2;
        double d;
        int i8;
        double d2;
        double d3;
        Context context = this.c.getContext();
        Rect b = this.c.i.b();
        boolean z = this.c.i.M;
        int i9 = b.left;
        int i10 = b.right;
        int i11 = b.top;
        int i12 = b.bottom;
        int width = this.c.o.width();
        int height = this.c.o.height();
        float f3 = this.c.t.b.o;
        float f4 = this.c.t.b.n;
        v.b bVar = this.c.t.r;
        if (width == 0 || height == 0 || latLng == null || latLng2 == null) {
            return -2.0f;
        }
        if (i + i2 + i9 + i10 > width || i3 + i4 + i11 + i12 > height) {
            return -1.0f;
        }
        fm a2 = a(context, latLng);
        fm a3 = a(context, latLng2);
        double d4 = a3.a - a2.a;
        if (d4 < 0.0d) {
            d4 = Math.abs(d4);
        }
        double d5 = a3.b - a2.b;
        if (d5 < 0.0d) {
            d5 = Math.abs(d5);
        }
        int i13 = (((width - i) - i2) - i9) - i10;
        int i14 = (((height - i3) - i4) - i11) - i12;
        if (i13 <= 0) {
            i13 = 1;
        }
        if (i14 <= 0) {
            i5 = width;
            i6 = height;
            i7 = 1;
        } else {
            i5 = width;
            i6 = height;
            i7 = i14;
        }
        double max = Math.max(d4 / i13, d5 / i7);
        float log = (float) (20.0d - (Math.log(max) / Math.log(2.0d)));
        if (f3 < log) {
            max = Math.pow(2.0d, 20.0f - f3);
            f2 = f3;
        } else {
            f2 = log;
        }
        if (f4 > f2) {
            d = Math.pow(2.0d, 20.0f - f4);
        } else {
            d = max;
            f4 = f2;
        }
        if (latLng3 != null) {
            fm a4 = a(context, new LatLng((latLng.latitude + latLng2.latitude) / 2.0d, (latLng.longitude + latLng2.longitude) / 2.0d));
            a4.a += ((i2 - i) * d) / 2.0d;
            a4.b += ((i3 - i4) * d) / 2.0d;
            double d6 = a4.a;
            double d7 = a4.b;
            if (z) {
                int i15 = i9 - i10;
                int i16 = i11 - i12;
                int i17 = i5;
                double d8 = (i15 / (i17 * 2.0f)) + 0.5f;
                if (d8 < 0.25d) {
                    i15 = (int) (i17 * (-0.5d));
                } else if (d8 > 0.75d) {
                    i15 = (int) (i17 * 0.5d);
                }
                int i18 = i16;
                int i19 = i6;
                double d9 = (i18 / (i19 * 2.0f)) + 0.5f;
                if (d9 < 0.25d) {
                    i18 = (int) (i19 * (-0.5d));
                } else if (d9 > 0.75d) {
                    i18 = (int) (i19 * 0.5d);
                }
                double d10 = (i15 * d) / 2.0d;
                double d11 = (i18 * d) / 2.0d;
                if (bVar == null) {
                    i8 = i19;
                    d2 = 0.0d;
                    d3 = 0.0d;
                } else {
                    i8 = i19;
                    d2 = bVar.b;
                    d3 = bVar.a;
                }
                d6 = (d6 - d10) + (d3 * i17 * d);
                d7 = (d7 - d11) - ((d2 * i8) * d);
            }
            fm fmVar = new fm(d6, d7);
            double a5 = hc.a(context) * 2.68435456E8f;
            double d12 = a5 / 2.0d;
            LatLng latLng4 = new LatLng((Math.asin(1.0d - (2.0d / (Math.pow(2.718281828459045d, ((fmVar.b - d12) / 0.5d) / (a5 / 6.283185307179586d)) + 1.0d))) * 180.0d) / 3.141592653589793d, (fmVar.a - d12) / (a5 / 360.0d));
            latLng3.latitude = latLng4.latitude;
            latLng3.longitude = latLng4.longitude;
        }
        return f4;
    }

    private static LatLng a(Context context, fm fmVar) {
        double a2 = hc.a(context) * 2.68435456E8f;
        double d = a2 / 2.0d;
        return new LatLng((Math.asin(1.0d - (2.0d / (Math.pow(2.718281828459045d, ((fmVar.b - d) / 0.5d) / (a2 / 6.283185307179586d)) + 1.0d))) * 180.0d) / 3.141592653589793d, (fmVar.a - d) / (a2 / 360.0d));
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final fm a(Context context, LatLng latLng) {
        double a2 = hc.a(context) * 2.68435456E8f;
        double d = a2 / 2.0d;
        double d2 = a2 / 360.0d;
        double min = Math.min(Math.max(Math.sin(latLng.latitude * 0.017453292519943295d), -0.9999d), 0.9999d);
        return new fm((latLng.longitude * d2) + d, d + (Math.log((min + 1.0d) / (1.0d - min)) * (a2 / 6.283185307179586d) * 0.5d));
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final fu b(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return b(GeoPoint.from(latLng));
    }

    public static fm a(v vVar, GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        double d = vVar.e;
        double d2 = vVar.f;
        double min = Math.min(Math.max(Math.sin((geoPoint.getLatitudeE6() / 1000000.0d) * 0.017453292519943295d), -0.9999d), 0.9999d);
        double d3 = vVar.d >> 1;
        return new fm(((geoPoint.getLongitudeE6() / 1000000.0d) * d) + d3, d3 + (Math.log((min + 1.0d) / (1.0d - min)) * d2 * 0.5d));
    }

    @Override // com.tencent.mapsdk.internal.eq
    public final LatLng a(fu fuVar) {
        return new LatLng(((Math.atan(Math.exp((((fuVar.y() / 2.003750834E7d) * 180.0d) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d, (fuVar.x() / 2.003750834E7d) * 180.0d);
    }

    static /* synthetic */ Rect a(y yVar, List list, List list2) {
        int i;
        int i2;
        int i3;
        Rect bound;
        int i4 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            i2 = 0;
            i3 = 0;
            while (it.hasNext()) {
                Boundable boundable = (Boundable) it.next();
                if (boundable != null && (bound = boundable.getBound(yVar)) != null) {
                    if (i4 == 0) {
                        i4 = bound.left;
                    }
                    if (i == 0) {
                        i = bound.right;
                    }
                    if (i2 == 0) {
                        i2 = bound.top;
                    }
                    if (i3 == 0) {
                        i3 = bound.bottom;
                    }
                    if (bound.left < i4) {
                        i4 = bound.left;
                    }
                    if (bound.right > i) {
                        i = bound.right;
                    }
                    if (bound.top > i2) {
                        i2 = bound.top;
                    }
                    if (bound.bottom < i3) {
                        i3 = bound.bottom;
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                GeoPoint geoPoint = (GeoPoint) it2.next();
                if (geoPoint != null) {
                    if (i4 == 0) {
                        i4 = geoPoint.getLongitudeE6();
                    }
                    if (i == 0) {
                        i = geoPoint.getLongitudeE6();
                    }
                    if (i2 == 0) {
                        i2 = geoPoint.getLatitudeE6();
                    }
                    if (i3 == 0) {
                        i3 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() < i4) {
                        i4 = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() > i) {
                        i = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() > i2) {
                        i2 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() < i3) {
                        i3 = geoPoint.getLatitudeE6();
                    }
                }
            }
        }
        return new Rect(i4, i2, i, i3);
    }

    static /* synthetic */ boolean a(y yVar) {
        v.b bVar = yVar.b.r;
        if (bVar != null) {
            return (bVar.a == 0.0f && bVar.b == 0.0f) ? false : true;
        }
        return false;
    }

    static /* synthetic */ GeoPoint a(y yVar, GeoPoint geoPoint, Rect rect) {
        fm a2 = yVar.a(geoPoint);
        if (a2 == null || rect == null) {
            return null;
        }
        return yVar.a(new fm(a2.a - ((rect.left - rect.right) * 0.5d), a2.b - ((rect.top - rect.bottom) * 0.5d)));
    }

    static /* synthetic */ boolean b(y yVar) {
        v.b bVar = yVar.b.r;
        if (bVar != null) {
            return ((double) Math.abs(bVar.a)) > 0.25d || ((double) Math.abs(bVar.b)) > 0.25d;
        }
        return false;
    }

    static /* synthetic */ GeoPoint a(y yVar, GeoPoint geoPoint, v.b bVar) {
        fm a2 = yVar.a(geoPoint);
        if (a2 == null || bVar == null) {
            return null;
        }
        double d = a2.a;
        double d2 = a2.b;
        Rect rect = new Rect(yVar.c.o);
        int width = rect.width();
        int height = rect.height();
        float f2 = bVar.b + 0.5f;
        double d3 = bVar.a + 0.5f;
        if (d3 < 0.25d) {
            d += (0.25d - d3) * width;
        } else if (d3 > 0.75d) {
            d -= (d3 - 0.75d) * width;
        }
        double d4 = f2;
        if (d4 < 0.25d) {
            d2 += (0.25d - d4) * height;
        } else if (d4 > 0.75d) {
            d2 -= (d4 - 0.75d) * height;
        }
        return yVar.a(new fm(d, d2));
    }
}
