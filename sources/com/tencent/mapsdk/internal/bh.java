package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.ab;
import com.tencent.mapsdk.internal.ad;
import com.tencent.mapsdk.internal.bk;
import com.tencent.mapsdk.internal.eq;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.pl;
import com.tencent.mapsdk.internal.rg;
import com.tencent.mapsdk.internal.se;
import com.tencent.mapsdk.internal.sh;
import com.tencent.mapsdk.internal.sw;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CamerParameter;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bh implements aj, ak, am, ff {
    public bu a;
    public volatile so b;
    public Context c;
    public bk d;
    public qq e;
    public pl f;
    CameraPosition g;
    eq i;
    private String l;
    private qh n;
    private float w;
    private pe m = null;
    private final GeoPoint o = null;
    private final GeoPoint p = null;
    private int q = 0;
    private int r = 0;
    private int s = 0;
    private int t = 0;
    final byte[] h = new byte[0];
    private int u = 0;
    private int v = 1000;
    private final b x = new b(false);
    private final b y = new b(true);
    private ad.a z = new ad.a() { // from class: com.tencent.mapsdk.internal.bh.1
        @Override // com.tencent.mapsdk.internal.ad.a
        public final void a(iw iwVar) {
            so soVar;
            VectorMap vectorMap;
            if (iwVar.z == 10000 && (iwVar instanceof se) && (soVar = bh.this.b) != null && (vectorMap = (VectorMap) soVar.e_) != null) {
                se seVar = (se) iwVar;
                if (seVar.Q) {
                    vectorMap.b((soVar.ak / 2) - seVar.R, (soVar.al / 2) - seVar.S);
                }
                if (seVar.h) {
                    vectorMap.b(seVar.K, seVar.L);
                }
                if (seVar.N || seVar.M || seVar.O) {
                    vectorMap.o.i.a((float) seVar.P);
                }
                if (seVar.T) {
                    int i = seVar.aa;
                    int i2 = seVar.ab;
                    vectorMap.a(i, i2);
                    if (seVar.g) {
                        soVar.b(i, i2);
                    }
                }
                if (seVar.ac) {
                    vectorMap.b(seVar.ag);
                }
                if (seVar.ah) {
                    vectorMap.a(seVar.al);
                }
                if (seVar.Q) {
                    vectorMap.b(seVar.R - (soVar.ak / 2), seVar.S - (soVar.al / 2));
                }
            }
        }
    };
    public final se.a j = new se.a() { // from class: com.tencent.mapsdk.internal.bh.2
        @Override // com.tencent.mapsdk.internal.se.a
        public final float a() {
            if (bh.this.b == null) {
                return 0.0f;
            }
            return ((VectorMap) bh.this.b.e_).s();
        }

        @Override // com.tencent.mapsdk.internal.se.a
        public final int b() {
            if (bh.this.b == null) {
                return 0;
            }
            return ((VectorMap) bh.this.b.e_).p();
        }

        @Override // com.tencent.mapsdk.internal.se.a
        public final GeoPoint c() {
            if (bh.this.b == null) {
                return null;
            }
            return ((VectorMap) bh.this.b.e_).q();
        }

        @Override // com.tencent.mapsdk.internal.se.a
        public final float d() {
            if (bh.this.b == null) {
                return 0.0f;
            }
            return ((VectorMap) bh.this.b.e_).t();
        }

        @Override // com.tencent.mapsdk.internal.se.a
        public final float e() {
            if (bh.this.b == null) {
                return 0.0f;
            }
            return ((VectorMap) bh.this.b.e_).u();
        }

        @Override // com.tencent.mapsdk.internal.se.a
        public final float f() {
            if (bh.this.b == null) {
                return 0.0f;
            }
            return bh.this.D();
        }

        @Override // com.tencent.mapsdk.internal.se.a
        public final GeoPoint g() {
            if (bh.this.b == null) {
                return null;
            }
            return bh.this.b.s();
        }

        @Override // com.tencent.mapsdk.internal.se.a
        public final boolean h() {
            if (bh.this.b == null) {
                return false;
            }
            return bh.this.b.o.f;
        }

        @Override // com.tencent.mapsdk.internal.se.a
        public final void a(Runnable runnable) {
            if (runnable == null || bh.this.b == null) {
                return;
            }
            jy.a(runnable, 100L);
        }
    };
    public fi k = new fi() { // from class: com.tencent.mapsdk.internal.bh.6
        @Override // com.tencent.mapsdk.internal.fi
        public final void u() {
            jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.bh.6.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (bh.this.b == null) {
                        return;
                    }
                    bh.this.b.a(((VectorMap) bh.this.b.e_).o.t.a());
                }
            });
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    @Override // com.tencent.mapsdk.internal.ff
    public final void b(int i, int i2) {
        if (i == 0 || i2 == 0) {
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void e() {
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final int g() {
        return -1;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void i() {
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void k() {
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void l() {
    }

    private bk E() {
        return this.d;
    }

    private qq F() {
        return this.e;
    }

    private pl G() {
        return this.f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class b implements a {
        private boolean b;

        public b(boolean z) {
            this.b = false;
            this.b = z;
        }

        @Override // com.tencent.mapsdk.internal.bh.a
        public final void a() {
            if (bh.this.b.ak == 0 || bh.this.b.al == 0) {
                return;
            }
            bh.this.b.E = null;
            if (bh.this.b.ad == null || bh.this.b.ae == null) {
                return;
            }
            LatLng latLng = new LatLng(0.0d, 0.0d);
            float a = (bh.this.b.ag == 0 && bh.this.b.ah == 0 && bh.this.b.ai == 0 && bh.this.b.aj == 0) ? bh.this.i.a(bh.this.b.ad, bh.this.b.ae, 0, 0, 0, 0, latLng) : bh.this.i.a(bh.this.b.ad, bh.this.b.ae, bh.this.b.ag, bh.this.b.ah, bh.this.b.ai, bh.this.b.aj, latLng);
            TencentMap.CancelableCallback cancelableCallback = bh.this.b.C;
            if (this.b) {
                se seVar = new se();
                seVar.c(0.0f);
                seVar.d(0.0f);
                seVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                seVar.a(a);
                seVar.a = bh.this.j;
                seVar.f = cancelableCallback;
                ((VectorMap) bh.this.b.e_).a(seVar);
            } else {
                ((VectorMap) bh.this.b.e_).b(0.0f);
                ((VectorMap) bh.this.b.e_).a(0.0f);
                ((VectorMap) bh.this.b.e_).a((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                bh.this.a(a, false, 0L, (TencentMap.CancelableCallback) null);
            }
            bh.this.b.ad = null;
            bh.this.b.ae = null;
            bh.this.b.ag = 0;
            bh.this.b.ah = 0;
            bh.this.b.ai = 0;
            bh.this.b.aj = 0;
            bh.this.b.C = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bh(com.tencent.mapsdk.internal.be r4, com.tencent.mapsdk.internal.bu r5, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions r6) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.bh.<init>(com.tencent.mapsdk.internal.be, com.tencent.mapsdk.internal.bu, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions):void");
    }

    private void a(bk.a aVar) {
        bk bkVar = this.d;
        if (bkVar.d != null) {
            bkVar.d.d = aVar;
        }
    }

    private void a(rg.c cVar, TencentMapOptions tencentMapOptions) {
        bk bkVar = this.d;
        if (tencentMapOptions == null || tencentMapOptions.getExtSurface() == null || bkVar.e == null || tencentMapOptions == null) {
            return;
        }
        rg rgVar = bkVar.e;
        if (rgVar.o != null && cVar != null) {
            rgVar.o.add(cVar);
        }
        int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
        int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
        bkVar.b.measure(View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
        bkVar.b(extSurfaceWidth, extSurfaceHeight);
    }

    private void H() {
        if (this.b != null) {
            ((VectorMap) this.b.e_).b(this.k);
            so soVar = this.b;
            if (soVar.B != null) {
                soVar.B.removeCallbacksAndMessages(null);
            }
            if (soVar.H != null) {
                soVar.H.removeCallbacksAndMessages(null);
            }
            if (soVar.r != null) {
                soVar.r.clear();
                soVar.r = null;
            }
            soVar.l();
            soVar.s = null;
            soVar.z = null;
            soVar.v = null;
            soVar.D = null;
            soVar.p = null;
            this.b = null;
        }
        if (this.c != null) {
            this.c = null;
        }
        if (gx.b != null) {
            gx.b.c();
        }
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final LatLng a(Point point) {
        so soVar = this.b;
        if (soVar == null || soVar.e_ == 0 || ((VectorMap) soVar.e_).getProjection() == null) {
            return null;
        }
        return kb.a(((VectorMap) soVar.e_).getProjection().a(new fm(point.x, point.y)));
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final Point b(LatLng latLng) {
        so soVar;
        fm a2;
        if (latLng == null || (soVar = this.b) == null || soVar.e_ == 0 || ((VectorMap) soVar.e_).getProjection() == null || (a2 = ((VectorMap) soVar.e_).getProjection().a(GeoPoint.from(latLng))) == null) {
            return null;
        }
        Point point = new Point();
        point.x = (int) Math.round(a2.a);
        point.y = (int) Math.round(a2.b);
        return point;
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final double a(double d) {
        return ((VectorMap) this.b.e_).getProjection().metersPerPixel(d);
    }

    @Override // com.tencent.mapsdk.internal.ak
    public final VisibleRegion B() {
        Point point = new Point(0, this.b.al);
        Point point2 = new Point(this.b.ak, this.b.al);
        Point point3 = new Point(0, 0);
        Point point4 = new Point(this.b.ak, 0);
        LatLng a2 = a(point);
        LatLng a3 = a(point2);
        LatLng a4 = a(point3);
        LatLng a5 = a(point4);
        return new VisibleRegion(a2, a3, a4, a5, LatLngBounds.builder().include(a2).include(a3).include(a4).include(a5).build());
    }

    @Override // com.tencent.mapsdk.internal.am
    public final bu C() {
        return this.a;
    }

    private void a(boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (!z) {
            ((VectorMap) this.b.e_).c(((VectorMap) this.b.e_).s() * 2.0f);
            return;
        }
        se seVar = new se();
        seVar.b(1.0f);
        seVar.a = this.j;
        seVar.f = cancelableCallback;
        seVar.a(j);
        ((VectorMap) this.b.e_).a(seVar);
    }

    private void b(boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (!z) {
            ((VectorMap) this.b.e_).c(((VectorMap) this.b.e_).s() / 2.0f);
            return;
        }
        se seVar = new se();
        seVar.b(-1.0f);
        seVar.a = this.j;
        seVar.f = cancelableCallback;
        seVar.a(j);
        ((VectorMap) this.b.e_).a(seVar);
    }

    private void a(float f, float f2, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.b == null) {
            return;
        }
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        if (!z) {
            ((VectorMap) this.b.e_).b((int) f, (int) f2);
            return;
        }
        se seVar = new se();
        int i = (int) f;
        int i2 = (int) f2;
        if (i == 0 && i2 == 0) {
            seVar.h = false;
        }
        seVar.I = i;
        seVar.J = i2;
        seVar.h = true;
        seVar.a = this.j;
        seVar.f = cancelableCallback;
        seVar.a(j);
        ((VectorMap) this.b.e_).a(seVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.b == null) {
            return;
        }
        if (!z) {
            so soVar = this.b;
            ((VectorMap) this.b.e_).a((float) (1.0d / Math.pow(2.0d, 20.0f - Math.min(f, Math.min(((VectorMap) this.b.e_).p(), this.b.o.f ? 22 : 20)))));
            return;
        }
        se seVar = new se();
        seVar.a(f);
        seVar.a = this.j;
        seVar.f = cancelableCallback;
        seVar.a(j);
        ((VectorMap) this.b.e_).a(seVar);
    }

    private void b(float f, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        float pow;
        if (this.b == null || f == 0.0f) {
            return;
        }
        if (!z) {
            if (f < 0.0f) {
                pow = (float) (1.0d / Math.pow(2.0d, Math.abs(f)));
            } else {
                pow = (float) (1.0d / Math.pow(0.5d, Math.abs(f)));
            }
            ((VectorMap) this.b.e_).a(((VectorMap) this.b.e_).s() * pow);
            return;
        }
        se seVar = new se();
        seVar.b(f);
        seVar.a = this.j;
        seVar.f = cancelableCallback;
        seVar.a(j);
        ((VectorMap) this.b.e_).a(seVar);
    }

    private void a(float f, float f2, float f3, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        float pow;
        if (this.b == null || f == 0.0f) {
            return;
        }
        if (z) {
            se seVar = new se();
            seVar.a((int) f2, (int) f3);
            seVar.b(f);
            seVar.a = this.j;
            seVar.f = cancelableCallback;
            seVar.a(j);
            ((VectorMap) this.b.e_).a(seVar);
            return;
        }
        if (f < 0.0f) {
            pow = (float) (1.0d / Math.pow(2.0d, Math.abs(f)));
        } else {
            pow = (float) (1.0d / Math.pow(0.5d, Math.abs(f)));
        }
        double d = f2;
        double d2 = f3;
        ((VectorMap) this.b.e_).o.i.a(pow, d, d2, d, d2, null);
    }

    private void a(CameraPosition cameraPosition, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.b == null || cameraPosition == null) {
            return;
        }
        GeoPoint from = GeoPoint.from(cameraPosition.target);
        float f = cameraPosition.zoom;
        so soVar = this.b;
        float o = ((VectorMap) this.b.e_).o();
        if (f < o) {
            f = o;
        }
        if (f > 20.0f) {
            f = 20.0f;
        }
        if (!z) {
            double pow = 1.0d / Math.pow(2.0d, 20.0f - f);
            if (from != null) {
                ((VectorMap) this.b.e_).a(from.getLatitudeE6(), from.getLongitudeE6());
            }
            ((VectorMap) this.b.e_).a((float) pow);
            ((VectorMap) this.b.e_).b(cameraPosition.bearing);
            if (cameraPosition.tilt >= 0.0f) {
                ((VectorMap) this.b.e_).a(cameraPosition.tilt);
                return;
            }
            return;
        }
        se seVar = new se();
        if (from != null) {
            seVar.b(from.getLatitudeE6(), from.getLongitudeE6());
        }
        seVar.a(f);
        seVar.c(cameraPosition.bearing);
        if (cameraPosition.tilt >= 0.0f) {
            seVar.d(cameraPosition.tilt);
        }
        seVar.a = this.j;
        seVar.a(j);
        seVar.f = cancelableCallback;
        ((VectorMap) this.b.e_).a(seVar);
    }

    private void a(double d, double d2, float f, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.b == null) {
            return;
        }
        int i = (int) (d * 1000000.0d);
        int i2 = (int) (d2 * 1000000.0d);
        so soVar = this.b;
        float o = ((VectorMap) this.b.e_).o();
        if (f >= o) {
            o = f;
        }
        if (o > 20.0f) {
            o = 20.0f;
        }
        double pow = 1.0d / Math.pow(2.0d, 20.0f - o);
        if (!z) {
            ((VectorMap) this.b.e_).a(i, i2);
            ((VectorMap) this.b.e_).a((float) pow);
            return;
        }
        se seVar = new se();
        seVar.b(i, i2);
        seVar.a(o);
        seVar.a = this.j;
        seVar.f = cancelableCallback;
        seVar.a(j);
        ((VectorMap) this.b.e_).a(seVar);
    }

    private void a(double d, double d2, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.b == null) {
            return;
        }
        int i = (int) (d * 1000000.0d);
        int i2 = (int) (d2 * 1000000.0d);
        if (!z) {
            ((VectorMap) this.b.e_).a(i, i2);
            return;
        }
        se seVar = new se();
        seVar.b(i, i2);
        seVar.a = this.j;
        seVar.f = cancelableCallback;
        seVar.a(j);
        ((VectorMap) this.b.e_).a(seVar);
    }

    private int a(LatLngBounds latLngBounds, int i, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null) {
            return -1;
        }
        if (this.b.ak == 0 || this.b.al == 0) {
            this.b.ad = latLngBounds.southwest;
            this.b.ae = latLngBounds.northeast;
            this.b.af = i;
            this.b.C = cancelableCallback;
            if (z) {
                this.b.E = this.y;
            } else {
                this.b.E = this.x;
            }
            int i2 = i * 2;
            return ((this.q + i2) + this.s > hc.b(this.c) || (i2 + this.r) + this.t > hc.c(this.c)) ? -1 : 0;
        }
        this.b.E = null;
        LatLng latLng = new LatLng(0.0d, 0.0d);
        float a2 = this.i.a(latLngBounds.southwest, latLngBounds.northeast, i, i, i, i, latLng);
        if (a2 < 0.0f) {
            return (int) a2;
        }
        if (!z) {
            ((VectorMap) this.b.e_).a((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
            a(a2, false, j, (TencentMap.CancelableCallback) null);
        } else {
            se seVar = new se();
            seVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
            seVar.a(a2);
            seVar.a = this.j;
            seVar.f = cancelableCallback;
            seVar.a(j);
            ((VectorMap) this.b.e_).a(seVar);
        }
        return 0;
    }

    private void b(float f, float f2, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (z) {
            se seVar = new se();
            seVar.c(f);
            if (f2 >= 0.0f) {
                seVar.d(f2);
            }
            seVar.a = this.j;
            seVar.f = cancelableCallback;
            seVar.a(j);
            ((VectorMap) this.b.e_).a(seVar);
            return;
        }
        ((VectorMap) this.b.e_).b(f);
        if (f2 >= 0.0f) {
            ((VectorMap) this.b.e_).a(f2);
        }
    }

    private int a(LatLngBounds latLngBounds, int i, int i2, int i3, int i4, boolean z, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null) {
            return -1;
        }
        if (this.b.ak == 0 || this.b.al == 0) {
            this.b.ad = latLngBounds.southwest;
            this.b.ae = latLngBounds.northeast;
            this.b.ag = i;
            this.b.ah = i2;
            this.b.ai = i3;
            this.b.aj = i4;
            this.b.C = cancelableCallback;
            if (z) {
                this.b.E = this.y;
            } else {
                this.b.E = this.x;
            }
            return (((i + i2) + this.q) + this.s > hc.b(this.c) || ((i3 + i4) + this.r) + this.t > hc.c(this.c)) ? -1 : 0;
        }
        this.b.E = null;
        LatLng latLng = new LatLng();
        float a2 = this.i.a(latLngBounds.southwest, latLngBounds.northeast, i, i2, i3, i4, latLng);
        if (a2 < 0.0f) {
            return (int) a2;
        }
        if (!z) {
            ((VectorMap) this.b.e_).a((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
            a(a2, false, j, (TencentMap.CancelableCallback) null);
            ((VectorMap) this.b.e_).b(0.0f);
            ((VectorMap) this.b.e_).a(0.0f);
        } else {
            se seVar = new se();
            seVar.c(0.0f);
            seVar.d(0.0f);
            seVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
            seVar.a(a2);
            seVar.a = this.j;
            seVar.f = cancelableCallback;
            seVar.a(j);
            ((VectorMap) this.b.e_).a(seVar);
        }
        return 0;
    }

    private int a(List<er> list, int i, int i2, int i3, int i4, final boolean z, final long j, final TencentMap.CancelableCallback cancelableCallback) {
        eq projection = ((VectorMap) this.b.e_).getProjection();
        if (projection == null) {
            return Integer.MIN_VALUE;
        }
        if (list == null || list.isEmpty()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (er erVar : list) {
            if (erVar != null && erVar.getGroupBounds() != null) {
                arrayList.addAll(erVar.getGroupBounds());
            }
        }
        if (this.b.ak == 0 || this.b.al == 0) {
            return (i + i2 > hc.b(this.c) || i3 + i4 > hc.c(this.c)) ? -1 : 0;
        } else if (i + i2 > this.b.ak || i3 + i4 > this.b.al) {
            return -1;
        } else {
            projection.a(arrayList, null, new Rect(i, i3, i2, i4), new eq.a() { // from class: com.tencent.mapsdk.internal.bh.3
                @Override // com.tencent.mapsdk.internal.eq.a
                public final void a(final float f, final GeoPoint geoPoint) {
                    if (bh.this.b == null) {
                        return;
                    }
                    jy.a(new Runnable() { // from class: com.tencent.mapsdk.internal.bh.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (bh.this.b == null) {
                                return;
                            }
                            if (z) {
                                double b2 = (((int) bh.this.b()) - (Math.log(1.0f / f) / Math.log(2.0d))) - 2.0d;
                                if (b2 < 0.0d) {
                                    b2 = 0.0d;
                                }
                                se seVar = new se();
                                seVar.b(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
                                seVar.a((float) b2);
                                seVar.a = bh.this.j;
                                seVar.f = cancelableCallback;
                                seVar.a(j);
                                ((VectorMap) bh.this.b.e_).a(seVar);
                                return;
                            }
                            GeoPoint geoPoint2 = geoPoint;
                            ((VectorMap) bh.this.b.e_).o.i.a(geoPoint2.getLatitudeE6(), geoPoint2.getLongitudeE6(), 1);
                            ((VectorMap) bh.this.b.e_).a(f);
                        }
                    });
                }
            });
            return 0;
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final CameraPosition a() {
        LatLng a2 = kb.a(((VectorMap) this.b.e_).q());
        float t = ((VectorMap) this.b.e_).t();
        if (t < 0.0f) {
            t = (t % 360.0f) + 360.0f;
        }
        return CameraPosition.builder().zoom(D()).target(a2).bearing(t).tilt(((VectorMap) this.b.e_).u()).build();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final float b() {
        return ((VectorMap) this.b.e_).p();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final float c() {
        return ((VectorMap) this.b.e_).o();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final int a(CameraUpdate cameraUpdate) {
        CamerParameter params;
        if (cameraUpdate == null || (params = cameraUpdate.getParams()) == null) {
            return -1;
        }
        switch (params.iCamerType) {
            case 0:
                a(false, 0L, (TencentMap.CancelableCallback) null);
                break;
            case 1:
                b(false, 0L, null);
                break;
            case 2:
                a(params.scrollBy_xPixel, params.scrollBy_yPixel, false, 0L, (TencentMap.CancelableCallback) null);
                break;
            case 3:
                a(params.zoomTo_zoom, false, 0L, (TencentMap.CancelableCallback) null);
                break;
            case 4:
                b(params.zoomBy_amount, false, 0L, null);
                break;
            case 5:
                a(params.zoomBy_Point_amount, params.zoomBy_Point_focus.x, params.zoomBy_Point_focus.y, false, 0L, (TencentMap.CancelableCallback) null);
                break;
            case 6:
                a(params.newCameraPosition_cameraPosition, false, 0L, (TencentMap.CancelableCallback) null);
                break;
            case 7:
                if (params.newLatLng_latLng != null) {
                    a(params.newLatLng_latLng.latitude, params.newLatLng_latLng.longitude, false, 0L, (TencentMap.CancelableCallback) null);
                    break;
                }
                break;
            case 8:
                if (params.newLatLngZoom_latLng != null) {
                    a(params.newLatLngZoom_latLng.latitude, params.newLatLngZoom_latLng.longitude, params.newLatLngZoom_zoom, false, 0L, (TencentMap.CancelableCallback) null);
                    break;
                }
                break;
            case 9:
                return a(params.newLatLngBounds_bounds, params.newLatLngBounds_padding, false, 0L, (TencentMap.CancelableCallback) null);
            case 10:
                return a(params.newLatLngBounds_dimension_bounds, params.newLatLngBounds_dimension_padding, params.newLatLngBounds_dimension_padding, params.newLatLngBounds_dimension_padding, params.newLatLngBounds_dimension_padding, false, 0L, (TencentMap.CancelableCallback) null);
            case 11:
                return a(params.newLatLngBounds_dimension_bounds, params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, false, 0L, (TencentMap.CancelableCallback) null);
            case 12:
                b(params.rotateto_rotate, params.rotateto_skew, false, 0L, null);
                break;
            case 13:
                return a(b(params.elements), params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, false, 0L, (TencentMap.CancelableCallback) null);
        }
        return 0;
    }

    private static List<er> b(List<IOverlay> list) {
        ArrayList arrayList = new ArrayList();
        for (IOverlay iOverlay : list) {
            if (iOverlay instanceof er) {
                arrayList.add((er) iOverlay);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final int a(CameraUpdate cameraUpdate, long j, TencentMap.CancelableCallback cancelableCallback) {
        CamerParameter params;
        if (cameraUpdate == null || (params = cameraUpdate.getParams()) == null) {
            return -1;
        }
        long j2 = j < 0 ? 0L : j;
        switch (params.iCamerType) {
            case 0:
                a(true, j2, cancelableCallback);
                return 0;
            case 1:
                b(true, j2, cancelableCallback);
                return 0;
            case 2:
                a(params.scrollBy_xPixel, params.scrollBy_yPixel, true, j2, cancelableCallback);
                return 0;
            case 3:
                a(params.zoomTo_zoom, true, j2, cancelableCallback);
                return 0;
            case 4:
                b(params.zoomBy_amount, true, j2, cancelableCallback);
                return 0;
            case 5:
                a(params.zoomBy_Point_amount, params.zoomBy_Point_focus.x, params.zoomBy_Point_focus.y, true, j2, cancelableCallback);
                return 0;
            case 6:
                a(params.newCameraPosition_cameraPosition, true, j2, cancelableCallback);
                return 0;
            case 7:
                a(params.newLatLng_latLng.latitude, params.newLatLng_latLng.longitude, true, j2, cancelableCallback);
                return 0;
            case 8:
                a(params.newLatLngZoom_latLng.latitude, params.newLatLngZoom_latLng.longitude, params.newLatLngZoom_zoom, true, j2, cancelableCallback);
                return 0;
            case 9:
                return a(params.newLatLngBounds_bounds, params.newLatLngBounds_padding, true, j2, cancelableCallback);
            case 10:
                return a(params.newLatLngBounds_dimension_bounds, params.newLatLngBounds_dimension_padding, params.newLatLngBounds_dimension_padding, params.newLatLngBounds_dimension_padding, params.newLatLngBounds_dimension_padding, true, j2, cancelableCallback);
            case 11:
                return a(params.newLatLngBounds_dimension_bounds, params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, true, j2, cancelableCallback);
            case 12:
                b(params.rotateto_rotate, params.rotateto_skew, true, j2, cancelableCallback);
                return 0;
            case 13:
                return a(b(params.elements), params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, true, j2, cancelableCallback);
            default:
                return 0;
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void d() {
        ((VectorMap) this.b.e_).w();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(int i) {
        int f = f();
        this.u = i;
        if (i == f || f == 1011 || f == 1008) {
            return;
        }
        if (this.e != null) {
            qp a2 = this.e.a(i);
            if (a2 != null) {
                i = a2.a;
                gs gsVar = this.b.aB.d;
                if (gsVar != null) {
                    gsVar.p().a(a2.b);
                }
            } else if (i >= 1000) {
                i -= 1000;
            } else if (i > 8 && i < 989) {
                i += 11;
            }
        }
        this.b.aB.c(i);
        gy.o();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final int f() {
        int m = ((mn) this.b.d_).i.m();
        if (this.e != null) {
            return this.e.b(m);
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(boolean z) {
        VectorMap vectorMap = (VectorMap) this.b.e_;
        if (z) {
            vectorMap.b(true);
        } else {
            vectorMap.b(false);
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final boolean h() {
        return ((VectorMap) this.b.e_).o.q;
    }

    private so I() {
        return this.b;
    }

    private Context J() {
        return this.c;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void j() {
        this.a.a();
        if (this.d != null) {
            this.d.j();
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void n() {
        this.a.b();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void m() {
        this.a.c();
        if (this.m != null) {
            this.m.b();
            this.m = null;
        }
        if (this.d != null) {
            bk bkVar = this.d;
            ViewGroup viewGroup = bkVar.b;
            so soVar = bkVar.c;
            if (viewGroup != null && soVar != null) {
                if (bkVar.j != null) {
                    bkVar.j.removeCallbacksAndMessages(null);
                }
                ((VectorMap) soVar.e_).o.i.b(bkVar);
                soVar.at.remove(bkVar);
                soVar.b((ez) bkVar);
                viewGroup.removeAllViews();
                for (em emVar : bkVar.i) {
                    emVar.c();
                }
                bkVar.i.clear();
            }
            this.d = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnMapClickListener onMapClickListener) {
        this.b.s = onMapClickListener;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        this.b.v = onMapLongClickListener;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.b == null) {
            return;
        }
        this.b.F = onCameraChangeListener;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void b(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.b == null) {
            return;
        }
        this.b.G = onCameraChangeListener;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnDismissCallback onDismissCallback) {
        this.b.w = onDismissCallback;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(LatLng latLng, float f, float f2) {
        a(latLng, f, f2, 0.0f, true);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(LatLng latLng, float f, float f2, float f3, boolean z) {
        se seVar = new se();
        seVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        seVar.a(f3);
        seVar.c(f);
        seVar.d(f2);
        seVar.a = this.j;
        seVar.g = true;
        seVar.a(1000L);
        if (z) {
            seVar.a(this.b.K, this.b.L);
        } else {
            seVar.a(this.b.M, this.b.N);
        }
        ((VectorMap) this.b.e_).w();
        ((VectorMap) this.b.e_).a(seVar);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final float a(LatLng latLng, LatLng latLng2) {
        return a(0, 0, 0, 0, latLng, latLng2, (LatLng) null);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(Handler handler, Bitmap.Config config, int i) {
        so soVar = this.b;
        soVar.H = handler;
        soVar.J = config;
        if (i > 0) {
            soVar.I = System.currentTimeMillis() + i;
        } else {
            soVar.I = Long.MAX_VALUE;
        }
        soVar.H();
        soVar.F();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final String a(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return ((VectorMap) this.b.e_).o.a(GeoPoint.from(latLng));
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMapGestureListener tencentMapGestureListener) {
        if (this.b == null) {
            return;
        }
        so soVar = this.b;
        if (soVar.av == null) {
            soVar.av = new TencentMapGestureListenerList();
        }
        soVar.av.addListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void b(TencentMapGestureListener tencentMapGestureListener) {
        if (this.b == null) {
            return;
        }
        so soVar = this.b;
        if (soVar.av != null) {
            soVar.av.removeListener(tencentMapGestureListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void b(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.T = z;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(float f, float f2) {
        if (this.b == null) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.b.c((int) (this.b.ak * f), (int) (this.b.al * f2));
        this.b.O = f;
        this.b.P = f2;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void b(int i) {
        if (this.b == null) {
            return;
        }
        this.b.a(i);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(int i, int i2) {
        if (this.b == null) {
            return;
        }
        this.b.a(i, i2);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final String o() {
        return gy.i();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnCompassClickedListener onCompassClickedListener) {
        if (this.b != null) {
            this.b.D = onCompassClickedListener;
        }
    }

    public final float a(float f, int i, int i2, int i3, int i4, LatLng latLng, LatLng latLng2) {
        int i5 = this.b.ak;
        int i6 = this.b.al;
        if (i5 == 0 || i6 == 0 || latLng == null || latLng2 == null) {
            return 0.0f;
        }
        so soVar = this.b;
        fm a2 = this.i.a(this.c, latLng);
        fm a3 = this.i.a(this.c, latLng2);
        double d = a3.a - a2.a;
        if (d < 0.0d) {
            d = Math.abs(d);
        }
        double d2 = a3.b - a2.b;
        if (d2 < 0.0d) {
            d2 = Math.abs(d2);
        }
        double d3 = d * 1.0d;
        double d4 = d2 * 1.0d;
        int i7 = (i5 - i) - i2;
        int i8 = (i6 - i3) - i4;
        if (f == 90.0f) {
            f = 89.0f;
        }
        int cos = (int) (i8 / Math.cos((f * 3.141592653589793d) / 180.0d));
        if (i7 <= 0) {
            i7 = 1;
        }
        if (cos <= 0) {
            cos = 1;
        }
        double log = Math.log(d3 / i7) / Math.log(2.0d);
        double log2 = Math.log(d4 / cos) / Math.log(2.0d);
        if (log < 0.0d) {
            log = 0.0d;
        }
        if (log2 < 0.0d) {
            log2 = 0.0d;
        }
        return (float) (20.0d - Math.max(log, log2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if ((r7 + r9) <= com.tencent.mapsdk.internal.hc.c(r10)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            r5 = this;
            com.tencent.mapsdk.internal.so r0 = r5.b
            M extends com.tencent.mapsdk.internal.bl r0 = r0.e_
            com.tencent.mapsdk.vector.VectorMap r0 = (com.tencent.mapsdk.vector.VectorMap) r0
            com.tencent.mapsdk.internal.mn r0 = r0.o
            com.tencent.mapsdk.internal.ad r0 = r0.i
            r0.H = r6
            r0.I = r7
            r0.J = r8
            r0.K = r9
            android.graphics.Rect r1 = r0.C
            r2 = 0
            r3 = -1
            if (r1 == 0) goto L49
            android.graphics.Rect r1 = r0.C
            int r1 = r1.width()
            if (r1 <= 0) goto L49
            android.graphics.Rect r1 = r0.C
            int r1 = r1.height()
            if (r1 <= 0) goto L49
            int r1 = r6 + r8
            android.graphics.Rect r4 = r0.C
            int r4 = r4.width()
            if (r1 > r4) goto L6f
            int r1 = r7 + r9
            android.graphics.Rect r4 = r0.C
            int r4 = r4.height()
            if (r1 <= r4) goto L3d
            goto L6f
        L3d:
            android.graphics.PointF r1 = r0.a()
            float r3 = r1.x
            float r1 = r1.y
            r0.a(r3, r1, r10)
            goto L72
        L49:
            com.tencent.mapsdk.internal.ad$1 r1 = new com.tencent.mapsdk.internal.ad$1
            r1.<init>(r10)
            r0.a(r1)
            com.tencent.mapsdk.internal.be r10 = r0.z
            boolean r10 = r10 instanceof com.tencent.mapsdk.internal.mn
            if (r10 == 0) goto L71
            com.tencent.mapsdk.internal.be r10 = r0.z
            com.tencent.mapsdk.internal.mn r10 = (com.tencent.mapsdk.internal.mn) r10
            android.content.Context r10 = r10.getContext()
            int r0 = r6 + r8
            int r1 = com.tencent.mapsdk.internal.hc.b(r10)
            if (r0 > r1) goto L6f
            int r0 = r7 + r9
            int r10 = com.tencent.mapsdk.internal.hc.c(r10)
            if (r0 <= r10) goto L72
        L6f:
            r2 = -1
            goto L72
        L71:
            r2 = -2
        L72:
            if (r2 != 0) goto L7c
            r5.q = r6
            r5.r = r7
            r5.s = r8
            r5.t = r9
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.bh.a(int, int, int, int, boolean):int");
    }

    public final float D() {
        return ((VectorMap) this.b.e_).o.t.a();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final float a(LatLngBounds latLngBounds, float f, int i, boolean z) {
        int i2;
        if (latLngBounds == null) {
            return 0.0f;
        }
        if (z) {
            i2 = this.b.L;
        } else {
            i2 = this.b.N;
        }
        float f2 = !z ? 0.0f : f;
        if (i2 < 0) {
            i2 = this.b.ak / 2;
        }
        return a(f2, 0, 0, i, this.b.al - i2, latLngBounds.southwest, latLngBounds.northeast);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final float a(LatLng latLng, LatLng latLng2, float f, int i, boolean z) {
        if (latLng == null || latLng2 == null) {
            return 0.0f;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return a(!z ? 0.0f : f, 0, 0, i, 0, builder.build().southwest, builder.build().northeast);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final float a(LatLng latLng, LatLng latLng2, float f, int i, int i2, int i3, int i4, boolean z) {
        if (latLng == null || latLng2 == null) {
            return 0.0f;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return a(!z ? 0.0f : f, i, i2, i3, i4, builder.build().southwest, builder.build().northeast);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final float a(int i, int i2, int i3, int i4, LatLng latLng, LatLng latLng2, LatLng latLng3) {
        return this.i.a(latLng, latLng2, i, i2, i3, i4, latLng3);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final CameraPosition a(List<er> list, List<LatLng> list2, int i, int i2, int i3, int i4) {
        if (this.b.ak == 0 || this.b.al == 0) {
            int b2 = hc.b(this.c);
            int c = hc.c(this.c);
            if (i + i2 > b2 || i3 + i4 > c) {
                return null;
            }
        } else if (i + i2 > this.b.ak || i3 + i4 > this.b.al) {
            return null;
        }
        eq projection = ((VectorMap) this.b.e_).getProjection();
        if (projection == null) {
            return null;
        }
        if (list == null || list.isEmpty()) {
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
            if (list2.size() == 1) {
                return new CameraPosition(list2.get(0), ((VectorMap) this.b.e_).o.t.a(), ((VectorMap) this.b.e_).u(), ((VectorMap) this.b.e_).t());
            }
            double d = 0.0d;
            double d2 = 0.0d;
            double d3 = 0.0d;
            double d4 = 0.0d;
            double d5 = 0.0d;
            for (LatLng latLng : list2) {
                if (latLng != null) {
                    if (d2 == d) {
                        d2 = latLng.latitude;
                    }
                    if (d3 == d) {
                        d3 = latLng.longitude;
                    }
                    double d6 = d3;
                    double d7 = d4;
                    double d8 = d6;
                    if (d7 == d) {
                        d7 = latLng.latitude;
                    }
                    double d9 = d7;
                    double d10 = d5;
                    double d11 = d9;
                    if (d10 == d) {
                        d10 = latLng.longitude;
                    }
                    if (latLng.latitude < d2) {
                        d2 = latLng.latitude;
                    }
                    if (latLng.latitude > d11) {
                        d11 = latLng.latitude;
                    }
                    if (latLng.longitude < d8) {
                        d8 = latLng.longitude;
                    }
                    if (latLng.longitude > d10) {
                        d10 = latLng.longitude;
                    }
                    d = 0.0d;
                    double d12 = d8;
                    d4 = d11;
                    d5 = d10;
                    d3 = d12;
                } else {
                    d = 0.0d;
                }
            }
            LatLng latLng2 = new LatLng(d2, d3);
            LatLng latLng3 = new LatLng(d4, d5);
            LatLng latLng4 = new LatLng(0.0d, 0.0d);
            float a2 = a(i, i2, i3, i4, latLng2, latLng3, latLng4);
            if (a2 < 0.0f) {
                return null;
            }
            return new CameraPosition(latLng4, a2, ((VectorMap) this.b.e_).u(), ((VectorMap) this.b.e_).t());
        }
        ArrayList arrayList = new ArrayList();
        for (er erVar : list) {
            if (erVar != null && erVar.getGroupBounds() != null) {
                arrayList.addAll(erVar.getGroupBounds());
            }
        }
        Rect rect = new Rect(i, i3, i2, i4);
        this.g = null;
        projection.a(arrayList, GeoPoint.from(list2), rect, new eq.a() { // from class: com.tencent.mapsdk.internal.bh.4
            @Override // com.tencent.mapsdk.internal.eq.a
            public final void a(float f, GeoPoint geoPoint) {
                LatLng a3 = kb.a(geoPoint);
                double log = 20.0d - (Math.log(1.0f / f) / Math.log(2.0d));
                bh.this.g = new CameraPosition(a3, (float) (log >= 0.0d ? log : 0.0d), ((VectorMap) bh.this.b.e_).u(), ((VectorMap) bh.this.b.e_).t());
                synchronized (bh.this.h) {
                    bh.this.h.notifyAll();
                }
            }
        });
        synchronized (this.h) {
            try {
                this.h.wait(1000L);
            } catch (InterruptedException e) {
                kj.c(Log.getStackTraceString(e));
                Thread.currentThread().interrupt();
            }
        }
        return this.g;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final CameraPosition a(List<er> list, List<LatLng> list2, int i, int i2, int i3, int i4, final TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback) {
        if (this.b.ak == 0 || this.b.al == 0) {
            hc.b(this.c);
            hc.c(this.c);
        } else if (i + i2 > this.b.ak || i3 + i4 > this.b.al) {
            if (asyncOperateCallback != null) {
                asyncOperateCallback.onOperateFinished(null);
            }
            return null;
        }
        eq projection = ((VectorMap) this.b.e_).getProjection();
        if (projection == null) {
            return null;
        }
        if (list.isEmpty()) {
            if (list2 == null || list2.isEmpty()) {
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.onOperateFinished(null);
                }
                return null;
            } else if (list2.size() == 1) {
                CameraPosition cameraPosition = new CameraPosition(list2.get(0), ((VectorMap) this.b.e_).s(), ((VectorMap) this.b.e_).u(), ((VectorMap) this.b.e_).t());
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.onOperateFinished(cameraPosition);
                }
                return cameraPosition;
            } else {
                double d = 0.0d;
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                for (LatLng latLng : list2) {
                    if (latLng != null) {
                        if (d2 == d) {
                            d2 = latLng.latitude;
                        }
                        if (d3 == d) {
                            d3 = latLng.longitude;
                        }
                        double d6 = d3;
                        double d7 = d4;
                        double d8 = d6;
                        if (d7 == d) {
                            d7 = latLng.latitude;
                        }
                        double d9 = d7;
                        double d10 = d5;
                        double d11 = d9;
                        if (d10 == d) {
                            d10 = latLng.longitude;
                        }
                        if (latLng.latitude < d2) {
                            d2 = latLng.latitude;
                        }
                        if (latLng.latitude > d11) {
                            d11 = latLng.latitude;
                        }
                        if (latLng.longitude < d8) {
                            d8 = latLng.longitude;
                        }
                        if (latLng.longitude > d10) {
                            d10 = latLng.longitude;
                        }
                        d = 0.0d;
                        double d12 = d8;
                        d4 = d11;
                        d5 = d10;
                        d3 = d12;
                    } else {
                        d = 0.0d;
                    }
                }
                LatLng latLng2 = new LatLng(d2, d3);
                LatLng latLng3 = new LatLng(d4, d5);
                LatLng latLng4 = new LatLng(0.0d, 0.0d);
                float a2 = a(i, i2, i3, i4, latLng2, latLng3, latLng4);
                if (a2 < 0.0f) {
                    if (asyncOperateCallback != null) {
                        asyncOperateCallback.onOperateFinished(null);
                    }
                    return null;
                }
                CameraPosition cameraPosition2 = new CameraPosition(latLng4, a2, ((VectorMap) this.b.e_).u(), ((VectorMap) this.b.e_).t());
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.onOperateFinished(cameraPosition2);
                }
                return cameraPosition2;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (er erVar : list) {
            if (erVar != null && erVar.getGroupBounds() != null) {
                arrayList.addAll(erVar.getGroupBounds());
            }
        }
        Rect rect = new Rect(i, i3, i2, i4);
        this.g = null;
        projection.a(arrayList, GeoPoint.from(list2), rect, new eq.a() { // from class: com.tencent.mapsdk.internal.bh.5
            @Override // com.tencent.mapsdk.internal.eq.a
            public final void a(float f, GeoPoint geoPoint) {
                LatLng a3 = kb.a(geoPoint);
                double log = 20.0d - (Math.log(1.0f / f) / Math.log(2.0d));
                bh.this.g = new CameraPosition(a3, (float) (log >= 0.0d ? log : 0.0d), ((VectorMap) bh.this.b.e_).u(), ((VectorMap) bh.this.b.e_).t());
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.onOperateFinished(bh.this.g);
                }
            }
        });
        return null;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void b(float f, float f2) {
        if (this.b == null) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.b.d((int) (this.b.ak * f), (int) (this.b.al * f2));
        this.b.Q = f;
        this.b.R = f2;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(float f, float f2, boolean z) {
        if (this.b == null) {
            return;
        }
        VectorMap vectorMap = (VectorMap) this.b.e_;
        vectorMap.o.i.M = true;
        vectorMap.o.i.a(f, f2, z);
    }

    private void j(boolean z) {
        this.a.setZOrderMediaOverlay(z);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(LatLng latLng, float f, float f2, float f3) {
        se seVar = new se();
        seVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        seVar.a(f3);
        seVar.c(f);
        seVar.d(f2);
        seVar.a = this.j;
        seVar.g = true;
        seVar.a(1000L);
        ((VectorMap) this.b.e_).w();
        ((VectorMap) this.b.e_).a(seVar);
    }

    private void c(float f, float f2) {
        VectorMap vectorMap = (VectorMap) this.b.e_;
        if (vectorMap.o != null) {
            ad adVar = vectorMap.o.i;
            adVar.E = f;
            adVar.F = f2;
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        VectorMap vectorMap = (VectorMap) this.b.e_;
        if (vectorMap.o != null) {
            mn mnVar = vectorMap.o;
            if (mnVar.g != null) {
                sh shVar = mnVar.g;
                shVar.a(new sh.AnonymousClass16(i2, i, i3, i4));
            }
        }
    }

    private void a(float f, float f2, float f3) {
        so soVar = this.b;
        if (soVar.aB != null) {
            float f4 = soVar.aB.i.A.b.p;
            float b2 = sw.b(f3);
            boolean z = ((double) Math.abs(f4 - b2)) > 1.0E-4d;
            soVar.aD = 0;
            jy.a(new sw.AnonymousClass1((f2 - soVar.aC) / 10.0f, f, f2, f3, z, b2));
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.b.au.add(onMapLoadedCallback);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void b(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.b.au.remove(onMapLoadedCallback);
    }

    private float a(double d, LatLng latLng) {
        if (latLng == null) {
            return 0.0f;
        }
        GeoPoint geoPoint = new GeoPoint((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        mn mnVar = ((VectorMap) this.b.e_).o;
        if (mnVar.t == null || mnVar.n == null) {
            return 0.0f;
        }
        double metersPerPixel = mnVar.n.metersPerPixel(geoPoint.getLatitudeE6() / 1000000.0d);
        if (metersPerPixel != 0.0d) {
            return (float) (d / metersPerPixel);
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final List<Rect> a(List<String> list) {
        py pyVar;
        if (list == null || list.isEmpty() || this.b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        eq projection = ((VectorMap) this.b.e_).getProjection();
        for (String str : list) {
            or c = this.b.c(str);
            if (c != null) {
                if (c instanceof ot) {
                    arrayList.add(((ot) c).getScreenBound(projection));
                } else if ((c instanceof ov) && (pyVar = ((ov) c).a) != null) {
                    arrayList.add(pyVar.a(projection));
                }
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(Language language) {
        VectorMap vectorMap;
        if (this.b == null || (vectorMap = (VectorMap) this.b.e_) == null) {
            return;
        }
        mn mnVar = vectorMap.o;
        if (mnVar.y == null) {
            mnVar.y = new mn.c();
        }
        mn.c cVar = mnVar.y;
        if (mn.this.g != null) {
            sh shVar = mn.this.g;
            shVar.a(new sh.AnonymousClass26(language.ordinal()));
            mn.e(mn.this);
            mn.this.v = true;
            cVar.a(language);
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final Language p() {
        if (this.b == null) {
            return Language.zh;
        }
        VectorMap vectorMap = (VectorMap) this.b.e_;
        if (vectorMap == null) {
            return Language.zh;
        }
        return vectorMap.o.B();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(fa faVar) {
        VectorMap vectorMap;
        if (this.b == null || (vectorMap = (VectorMap) this.b.e_) == null) {
            return;
        }
        vectorMap.o.a(faVar);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void b(fa faVar) {
        VectorMap vectorMap;
        if (this.b == null || (vectorMap = (VectorMap) this.b.e_) == null) {
            return;
        }
        vectorMap.o.b(faVar);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(List<MapRouteSection> list, List<LatLng> list2) {
        VectorMap vectorMap;
        if (this.b == null || (vectorMap = (VectorMap) this.b.e_) == null) {
            return;
        }
        List<GeoPoint> from = GeoPoint.from(list2);
        mn mnVar = vectorMap.o;
        if (mnVar.z == null) {
            mnVar.z = new mn.d();
        }
        mn.d dVar = mnVar.z;
        dVar.a = list;
        dVar.b = from;
        mn.this.g.a(list, from);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void q() {
        VectorMap vectorMap;
        if (this.b == null || (vectorMap = (VectorMap) this.b.e_) == null) {
            return;
        }
        vectorMap.clearRouteNameSegments();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        this.b.y = onMarkerClickListener;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.b.z = onInfoWindowClickListener;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.b.a(onIndoorStateChangeListener);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void c(boolean z) {
        if (this.b == null || this.b.o == null) {
            return;
        }
        ab abVar = this.b.o;
        abVar.c = z ? ab.a.b : ab.a.c;
        abVar.a(abVar.c);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void c(int i) {
        if (this.b == null || this.b.o == null) {
            return;
        }
        ab abVar = this.b.o;
        if (abVar.e != null) {
            mn mnVar = abVar.e;
            if (mnVar.g != null) {
                sh shVar = mnVar.g;
                shVar.a(new sh.AnonymousClass135(i));
            }
            abVar.c();
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final String v() {
        if (this.b == null || this.b.o == null) {
            return null;
        }
        ab abVar = this.b.o;
        if (abVar.g == null) {
            return null;
        }
        return abVar.g.getBuidlingId();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final int r() {
        if (this.b == null || this.b.o == null) {
            return -1;
        }
        ab abVar = this.b.o;
        if (abVar.g == null) {
            return -1;
        }
        return abVar.g.getActiveLevelIndex();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final String[] s() {
        if (this.b == null || this.b.o == null) {
            return null;
        }
        ab abVar = this.b.o;
        if (abVar.g == null || abVar.g.getLevels() == null || abVar.g.getLevels().isEmpty()) {
            return null;
        }
        List<IndoorLevel> levels = abVar.g.getLevels();
        String[] strArr = new String[levels.size()];
        for (int i = 0; i < levels.size(); i++) {
            strArr[i] = levels.get(i).getName();
        }
        return strArr;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final String t() {
        if (this.b == null || this.b.o == null) {
            return null;
        }
        ab abVar = this.b.o;
        return abVar.g == null ? "" : abVar.g.getBuildingName();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final IndoorBuilding u() {
        if (this.b == null || this.b.o == null) {
            return null;
        }
        return this.b.o.g;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.b.A = onMapPoiClickListener;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void d(boolean z) {
        if (this.b == null || this.b.o == null) {
            return;
        }
        ab abVar = this.b.o;
        if (abVar.d != null) {
            mn mnVar = abVar.d.o;
            if (mnVar.g != null) {
                sh shVar = mnVar.g;
                if (shVar.e != 0) {
                    shVar.a(new sh.AnonymousClass145(z));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(String str) {
        mn mnVar;
        if (this.b == null || (mnVar = this.b.aB) == null) {
            return;
        }
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass25(str));
        }
        mnVar.v = true;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void d(int i) {
        if (this.b == null) {
            return;
        }
        this.b.j = i;
        VectorMap vectorMap = (VectorMap) this.b.e_;
        if (vectorMap == null) {
            return;
        }
        vectorMap.b(i);
        vectorMap.o.v = true;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void e(int i) {
        VectorMap vectorMap;
        if (this.b == null || (vectorMap = (VectorMap) this.b.e_) == null) {
            return;
        }
        mn mnVar = vectorMap.o;
        if (mnVar.g != null) {
            mnVar.g.b(i);
        }
        if (mnVar.t != null) {
            mnVar.t.b.n = i;
        }
        vectorMap.o.v = true;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void e(boolean z) {
        if (this.b == null) {
            return;
        }
        if (z) {
            this.b.y();
            return;
        }
        so soVar = this.b;
        if (soVar.l != null) {
            soVar.l.b();
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final boolean w() {
        if (this.b == null) {
            return false;
        }
        so soVar = this.b;
        return (soVar.l == null || soVar.l.b == null) ? false : true;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void g(boolean z) {
        if (this.b != null) {
            this.b.i = z;
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final boolean x() {
        if (this.b == null) {
            return false;
        }
        return this.b.ao;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void h(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.ao = z;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final ArrayList<MapPoi> y() {
        if (this.b == null) {
            return null;
        }
        return this.b.aB.D();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void b(Language language) {
        if (this.b == null || this.b.k == null) {
            return;
        }
        rm rmVar = this.b.k;
        if (language == null || rmVar.b.j == language) {
            return;
        }
        rmVar.b.j = language;
        if (rmVar.c != null) {
            rmVar.c.onLanguageChange(language);
        }
        rmVar.a();
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final int b(String str) {
        if (this.b == null || this.b.o == null) {
            return -1;
        }
        ab abVar = this.b.o;
        if (abVar.d == null) {
            return -1;
        }
        VectorMap vectorMap = abVar.d;
        if (vectorMap.o == null) {
            return -1;
        }
        mn mnVar = vectorMap.o;
        if (mnVar.g == null) {
            return -1;
        }
        sh shVar = mnVar.g;
        return ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass40>) new sh.AnonymousClass40(str), (sh.AnonymousClass40) (-1))).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed A[Catch: JSONException -> 0x010b, TryCatch #0 {JSONException -> 0x010b, blocks: (B:7:0x000b, B:9:0x0018, B:11:0x0027, B:18:0x00dc, B:25:0x00fa, B:21:0x00ed, B:24:0x00f4, B:14:0x00c8, B:17:0x00cf, B:10:0x0021), top: B:31:0x000b }] */
    @Override // com.tencent.mapsdk.internal.aj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String z() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.bh.z():java.lang.String");
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final TileOverlay a(TileOverlayOptions tileOverlayOptions) {
        if (this.n == null) {
            return null;
        }
        return this.n.b(tileOverlayOptions);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final CustomLayer a(CustomLayerOptions customLayerOptions) {
        if (this.f == null || this.n == null) {
            return null;
        }
        pl plVar = this.f;
        if (plVar.a != null) {
            StringBuilder sb = new StringBuilder("添加个性化图层[");
            sb.append(customLayerOptions.getLayerId());
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            kn.c(ki.a);
            qh qhVar = plVar.a;
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            String str = "custom_layer_" + kt.a(customLayerOptions.getLayerId());
            tileOverlayOptions.diskCacheDir(str);
            pm a2 = plVar.a(customLayerOptions.getLayerId());
            kn.a(ki.a, "cache_dir", (Object) str);
            if (a2 != null) {
                kn.a(ki.a, "version", (Object) a2.b);
                kn.a(ki.a, "minZoom", Integer.valueOf(a2.d));
                kn.a(ki.a, "maxZoom", Integer.valueOf(a2.c));
                kn.a(ki.a, "layerId", (Object) a2.a);
                tileOverlayOptions.tileProvider(new pl.AnonymousClass1(a2));
                tileOverlayOptions.versionInfo(a2.b);
            }
            qc a3 = qhVar.a(tileOverlayOptions);
            pm a4 = plVar.a(customLayerOptions.getLayerId());
            if (a3 != null && a4 != null) {
                if (a4.e) {
                    a3.e();
                    a4.e = false;
                }
                a3.a(a4.d, a4.c);
            }
            plVar.a.h.d.c().a++;
            kn.e(ki.a);
            return new au(a3);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void i(boolean z) {
        if (this.b == null || this.b.e_ == 0) {
            return;
        }
        VectorMap vectorMap = (VectorMap) this.b.e_;
        vectorMap.p = z;
        vectorMap.o.h(z);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(String str, String str2) {
        mn mnVar;
        if (this.b == null || this.b.e_ == 0 || (mnVar = this.b.aB) == null) {
            return;
        }
        mnVar.a(str, str2);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void f(boolean z) {
        if (this.b != null) {
            this.b.am = z;
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(LatLngBounds latLngBounds, int i) {
        if (this.b == null || this.b.e_ == 0) {
            return;
        }
        this.b.aB.a(latLngBounds, i);
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final int A() {
        return this.v;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void a(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        if (this.b == null || this.b.e_ == 0) {
            return;
        }
        this.b.aq = onTrafficEventClickListener;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final void f(int i) {
        qp a2;
        if (i == 1000 || i == 1011 || i == 1008) {
            if (i == 1008) {
                this.b.aB.d.e().a++;
            }
            this.v = i;
            if (i == 1000) {
                i = this.u;
            }
            if (this.e != null && (a2 = this.e.a(i)) != null) {
                i = a2.a;
            }
            this.b.aB.c(i);
        }
    }
}
