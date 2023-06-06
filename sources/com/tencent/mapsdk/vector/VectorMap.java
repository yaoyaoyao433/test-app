package com.tencent.mapsdk.vector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.MapLanguage;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.map.lib.models.AnnocationText;
import com.tencent.map.lib.models.AnnocationTextResult;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.IndoorCellInfo;
import com.tencent.map.lib.models.MaskLayer;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.engine.jni.models.TappedElement;
import com.tencent.mapsdk.internal.aa;
import com.tencent.mapsdk.internal.ac;
import com.tencent.mapsdk.internal.ad;
import com.tencent.mapsdk.internal.ae;
import com.tencent.mapsdk.internal.af;
import com.tencent.mapsdk.internal.as;
import com.tencent.mapsdk.internal.aw;
import com.tencent.mapsdk.internal.ax;
import com.tencent.mapsdk.internal.bb;
import com.tencent.mapsdk.internal.bg;
import com.tencent.mapsdk.internal.bh;
import com.tencent.mapsdk.internal.bi;
import com.tencent.mapsdk.internal.bj;
import com.tencent.mapsdk.internal.bk;
import com.tencent.mapsdk.internal.bl;
import com.tencent.mapsdk.internal.dw;
import com.tencent.mapsdk.internal.ei;
import com.tencent.mapsdk.internal.en;
import com.tencent.mapsdk.internal.eq;
import com.tencent.mapsdk.internal.er;
import com.tencent.mapsdk.internal.es;
import com.tencent.mapsdk.internal.et;
import com.tencent.mapsdk.internal.eu;
import com.tencent.mapsdk.internal.ev;
import com.tencent.mapsdk.internal.ew;
import com.tencent.mapsdk.internal.ex;
import com.tencent.mapsdk.internal.ey;
import com.tencent.mapsdk.internal.fa;
import com.tencent.mapsdk.internal.fb;
import com.tencent.mapsdk.internal.fc;
import com.tencent.mapsdk.internal.fd;
import com.tencent.mapsdk.internal.fe;
import com.tencent.mapsdk.internal.fg;
import com.tencent.mapsdk.internal.fh;
import com.tencent.mapsdk.internal.fi;
import com.tencent.mapsdk.internal.fj;
import com.tencent.mapsdk.internal.fm;
import com.tencent.mapsdk.internal.gx;
import com.tencent.mapsdk.internal.hb;
import com.tencent.mapsdk.internal.hc;
import com.tencent.mapsdk.internal.hu;
import com.tencent.mapsdk.internal.id;
import com.tencent.mapsdk.internal.ig;
import com.tencent.mapsdk.internal.iq;
import com.tencent.mapsdk.internal.iu;
import com.tencent.mapsdk.internal.iw;
import com.tencent.mapsdk.internal.jy;
import com.tencent.mapsdk.internal.kc;
import com.tencent.mapsdk.internal.ki;
import com.tencent.mapsdk.internal.kj;
import com.tencent.mapsdk.internal.lx;
import com.tencent.mapsdk.internal.mi;
import com.tencent.mapsdk.internal.mm;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.mt;
import com.tencent.mapsdk.internal.mu;
import com.tencent.mapsdk.internal.mw;
import com.tencent.mapsdk.internal.my;
import com.tencent.mapsdk.internal.nb;
import com.tencent.mapsdk.internal.nc;
import com.tencent.mapsdk.internal.ne;
import com.tencent.mapsdk.internal.nl;
import com.tencent.mapsdk.internal.nn;
import com.tencent.mapsdk.internal.no;
import com.tencent.mapsdk.internal.nq;
import com.tencent.mapsdk.internal.nw;
import com.tencent.mapsdk.internal.od;
import com.tencent.mapsdk.internal.of;
import com.tencent.mapsdk.internal.oh;
import com.tencent.mapsdk.internal.ol;
import com.tencent.mapsdk.internal.op;
import com.tencent.mapsdk.internal.ou;
import com.tencent.mapsdk.internal.pa;
import com.tencent.mapsdk.internal.pc;
import com.tencent.mapsdk.internal.pe;
import com.tencent.mapsdk.internal.pn;
import com.tencent.mapsdk.internal.pq;
import com.tencent.mapsdk.internal.pv;
import com.tencent.mapsdk.internal.qs;
import com.tencent.mapsdk.internal.qu;
import com.tencent.mapsdk.internal.qv;
import com.tencent.mapsdk.internal.rg;
import com.tencent.mapsdk.internal.rj;
import com.tencent.mapsdk.internal.sh;
import com.tencent.mapsdk.internal.so;
import com.tencent.mapsdk.internal.sv;
import com.tencent.mapsdk.internal.sw;
import com.tencent.mapsdk.internal.v;
import com.tencent.mapsdk.internal.w;
import com.tencent.mapsdk.internal.x;
import com.tencent.mapsdk.internal.z;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.maps.CustomRender;
import com.tencent.tencentmap.mapsdk.maps.LocationSource;
import com.tencent.tencentmap.mapsdk.maps.Projection;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.UiSettings;
import com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayer;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapFontSize;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VectorMap extends bl {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 11;
    public static final int h = 15;
    public static final int i = 18;
    public static final float j = 40.0f;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;
    private aa D;
    private UiSettings I;
    private boolean J;
    private TencentMapPro K;
    private sw L;
    private float M;
    public mn o;
    public bh q;
    public pc s;
    public boolean n = false;
    public boolean p = true;
    private pe A = null;
    public bg r = null;
    private af B = null;
    private Projection C = null;
    private ac E = null;
    private ae F = null;
    private boolean G = false;
    private boolean H = false;
    private GeoPoint N = new GeoPoint();
    private int O = 0;

    private static void H() {
    }

    private static boolean K() {
        return true;
    }

    private static int l(int i2) {
        if (i2 < 3) {
            i2 = 3;
        }
        if (i2 > 22) {
            return 22;
        }
        return i2;
    }

    private static int y() {
        return 20;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isBlockRouteEnabled() {
        return false;
    }

    public VectorMap(mn mnVar) {
        this.o = mnVar;
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.L = (sw) this.o.b;
        rj a2 = rj.a();
        Context context = this.o.getContext();
        if (!a2.d && !a2.e) {
            if (context != null) {
                a2.b = context.getFilesDir() + "/frontiers.dat";
                a2.c = a2.b + ".bak";
            }
            jy.a((jy.g) new rj.AnonymousClass1()).a((jy.b.a) Boolean.FALSE);
        }
        this.q = new bh(this.o, this.L.getMapRenderView(), this.o.a);
        this.B = new af(this.q);
        this.D = new aa(this.q);
        this.K = new TencentMapPro(this.q, this.B);
        this.s = new pc(this.o);
        this.F = new ae(this.q.d);
        bk.a aVar = new bk.a() { // from class: com.tencent.mapsdk.vector.VectorMap.1
            @Override // com.tencent.mapsdk.internal.bk.a
            public final void a() {
                VectorMap.this.setMyLocationEnabled(true);
                Location myLocation = VectorMap.this.getMyLocation();
                if (myLocation != null) {
                    VectorMap.this.animateCamera(CameraUpdateFactory.newLatLng(new LatLng(myLocation.getLatitude(), myLocation.getLongitude())));
                }
            }
        };
        bk bkVar = this.q.d;
        if (bkVar.d != null) {
            bkVar.d.d = aVar;
        }
        bh bhVar = this.q;
        bj bjVar = this.o.k;
        TencentMapOptions tencentMapOptions = this.o.a;
        bk bkVar2 = bhVar.d;
        if (tencentMapOptions != null && tencentMapOptions.getExtSurface() != null && bkVar2.e != null && tencentMapOptions != null) {
            rg rgVar = bkVar2.e;
            if (rgVar.o != null && bjVar != null) {
                rgVar.o.add(bjVar);
            }
            int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
            int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
            bkVar2.b.measure(View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
            bkVar2.b(extSurfaceWidth, extSurfaceHeight);
        }
        this.A = new pe(this.q);
        pe peVar = this.A;
        peVar.a.a((pe.a) this.o.k, this.o.a);
        this.A.a();
        addOnMapLoadedCallback(this.o.a.getOnMapLoadedCallback());
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Keep
    public TencentMapPro getMapPro() {
        return this.K;
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final boolean a() {
        return (!this.J || this.H || this.G) ? false : true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public TencentMapContext getMapContext() {
        return this.o;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public CameraPosition getCameraPosition() {
        if (this.G || this.D == null) {
            return null;
        }
        return this.D.a();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public float getZoomToSpanLevel(LatLng latLng, LatLng latLng2) {
        if (this.G || this.D == null) {
            return 0.0f;
        }
        if (latLng == null || latLng2 == null) {
            return -1.0f;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return -1.0f;
        }
        return aaVar.b.a(latLng, latLng2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public float getMaxZoomLevel() {
        if (this.G || this.D == null) {
            return 0.0f;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return -1.0f;
        }
        return aaVar.b.b();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public float getMinZoomLevel() {
        if (this.G || this.D == null) {
            return 0.0f;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return -1.0f;
        }
        return aaVar.b.c();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnTapMapViewInfoWindowHidden(boolean z2) {
        super.setOnTapMapViewInfoWindowHidden(z2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.g(z2);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void moveCamera(CameraUpdate cameraUpdate) {
        if (this.G || this.D == null || this.D.b()) {
            return;
        }
        this.D.a(cameraUpdate);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(CameraUpdate cameraUpdate) {
        if (this.G || this.D == null || this.D.b()) {
            return;
        }
        this.D.a(cameraUpdate, 500L, (TencentMap.CancelableCallback) null);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(CameraUpdate cameraUpdate, TencentMap.CancelableCallback cancelableCallback) {
        if (this.G || this.D == null || this.D.b()) {
            return;
        }
        this.D.a(cameraUpdate, 500L, cancelableCallback);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(CameraUpdate cameraUpdate, long j2, TencentMap.CancelableCallback cancelableCallback) {
        if (this.G || this.D == null || this.D.b()) {
            return;
        }
        this.D.a(cameraUpdate, j2, cancelableCallback);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void stopAnimation() {
        super.stopAnimation();
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.d();
        }
    }

    public final void n() {
        this.o.v = true;
    }

    private static boolean a(GeoPoint geoPoint) {
        if (geoPoint == null) {
            return false;
        }
        int latitudeE6 = geoPoint.getLatitudeE6();
        return GeometryConstants.BOUNDARY_WORLD.contains(geoPoint.getLongitudeE6(), latitudeE6);
    }

    private void a(nw nwVar) {
        if (this.o != null) {
            this.o.a(nwVar);
        }
    }

    private static boolean d(int i2, int i3) {
        return GeometryConstants.BOUNDARY_WORLD.contains(i3, i2);
    }

    private static boolean b(GeoPoint geoPoint) {
        return ei.a.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6());
    }

    public final int o() {
        return this.o.t.b.n;
    }

    public final int p() {
        return this.o.t.b.o;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public int getMapStyle() {
        if (this.G || this.D == null) {
            return 0;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return -1;
        }
        return aaVar.b.f();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isTrafficEnabled() {
        if (this.G || this.D == null) {
            return false;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return false;
        }
        return aaVar.b.h();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTrafficEnabled(boolean z2) {
        super.setTrafficEnabled(z2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(z2);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setSatelliteEnabled(boolean z2) {
        super.setSatelliteEnabled(z2);
        if (z2) {
            setMapType(1011);
        } else {
            setMapType(1000);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isSateLiteEnable() {
        return getMapType() == 1011;
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public boolean isMyLocationEnabled() {
        if (this.G) {
            return false;
        }
        ax();
        ac acVar = this.E;
        if (acVar.a != null) {
            return acVar.a.d();
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationEnabled(boolean z2) {
        super.setMyLocationEnabled(z2);
        if (this.G) {
            return;
        }
        ax();
        if (!z2) {
            ac acVar = this.E;
            if (acVar.a != null) {
                acVar.a.c();
            }
        } else if (isMyLocationEnabled()) {
        } else {
            ac acVar2 = this.E;
            if (acVar2.a != null) {
                acVar2.a.b();
            }
        }
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public Location getMyLocation() {
        if (this.G) {
            return null;
        }
        ax();
        ac acVar = this.E;
        if (acVar.a != null) {
            return acVar.a.e();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setLocationSource(LocationSource locationSource) {
        super.setLocationSource(locationSource);
        if (this.G) {
            return;
        }
        ax();
        ac acVar = this.E;
        if (acVar.a != null) {
            acVar.a.a(locationSource);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public UiSettings getUiSettings() {
        if (this.G) {
            return null;
        }
        if (this.I == null) {
            this.I = new sv(this.F);
        }
        return this.I;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapStyle(int i2) {
        super.setMapStyle(i2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(i2);
        }
    }

    public final GeoPoint q() {
        return this.o.i.A.m;
    }

    private String c(GeoPoint geoPoint) {
        return this.o.a(geoPoint);
    }

    private String z() {
        return this.o.A();
    }

    private String[] A() {
        mn mnVar = this.o;
        Rect q = mnVar.i.q();
        Point[] pointArr = {new Point(q.centerX(), q.centerY()), new Point(q.left, q.top), new Point(q.left, q.bottom), new Point(q.right, q.top), new Point(q.right, q.bottom)};
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 5; i2++) {
            Point point = pointArr[i2];
            String a2 = mnVar.a(new GeoPoint(point.y, point.x));
            if (!hb.a(a2)) {
                hashSet.add(a2);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    private Rect B() {
        return this.o.i.q();
    }

    private Rect C() {
        return this.o.i.r();
    }

    private int D() {
        return this.o.i.A.b.q;
    }

    private void c(int i2) {
        this.o.i.a(i2);
    }

    private void b(float f2, float f3) {
        this.o.i.b(f2, f3, true);
    }

    private void a(float f2, float f3, boolean z2) {
        this.o.i.b(f2, f3, z2);
    }

    private GeoPoint E() {
        return this.o.i.s();
    }

    private GeoPoint F() {
        return this.o.i.t();
    }

    private void c(boolean z2) {
        if (z2) {
            mn mnVar = this.o;
            if (mnVar.g != null) {
                mnVar.g.k();
                mnVar.p = true;
                return;
            }
            return;
        }
        mn mnVar2 = this.o;
        if (mnVar2.g != null) {
            mnVar2.g.l();
            mnVar2.p = false;
        }
    }

    private boolean G() {
        return this.o.p;
    }

    private boolean a(String str) {
        mn mnVar = this.o;
        if (mnVar.g == null) {
            return false;
        }
        sh shVar = mnVar.g;
        return ((Boolean) shVar.a((CallbackRunnable<sh.AnonymousClass91>) new sh.AnonymousClass91(str), (sh.AnonymousClass91) Boolean.FALSE)).booleanValue();
    }

    private void a(er erVar) {
        this.o.k.a(erVar);
        this.o.v = true;
    }

    private void b(er erVar) {
        this.o.k.a(erVar);
        this.o.v = true;
    }

    private void c(er erVar) {
        this.o.k.a(erVar);
        this.o.v = true;
    }

    private synchronized void d(er erVar) {
        this.o.k.a(erVar);
        this.o.v = true;
    }

    private synchronized void e(er erVar) {
        this.o.k.a(erVar);
        this.o.v = true;
    }

    private void f(er erVar) {
        this.o.k.b(erVar);
        this.o.v = true;
    }

    private void a(fb fbVar) {
        ad adVar = this.o.i;
        if (fbVar != null) {
            synchronized (adVar.q) {
                if (!adVar.q.contains(fbVar)) {
                    adVar.q.add(fbVar);
                }
            }
        }
    }

    private void b(fb fbVar) {
        ad adVar = this.o.i;
        synchronized (adVar.q) {
            adVar.q.remove(fbVar);
        }
    }

    private void a(ew ewVar) {
        ad adVar = this.o.i;
        if (ewVar != null) {
            synchronized (adVar.r) {
                if (!adVar.r.contains(ewVar)) {
                    adVar.r.add(ewVar);
                }
            }
        }
    }

    private void b(ew ewVar) {
        ad adVar = this.o.i;
        synchronized (adVar.r) {
            adVar.r.remove(ewVar);
        }
    }

    public final void a(fi fiVar) {
        this.o.i.a(fiVar);
    }

    public final void b(fi fiVar) {
        this.o.i.b(fiVar);
    }

    private void a(ey eyVar) {
        ad adVar = this.o.i;
        if (eyVar != null) {
            if (adVar.s == null) {
                adVar.s = new ArrayList();
            }
            synchronized (adVar.t) {
                if (!adVar.s.contains(eyVar)) {
                    adVar.s.add(eyVar);
                }
            }
        }
    }

    private void b(ey eyVar) {
        ad adVar = this.o.i;
        if (adVar.s != null) {
            synchronized (adVar.t) {
                adVar.s.remove(eyVar);
            }
        }
    }

    private void d(GeoPoint geoPoint) {
        this.o.i.a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
    }

    public final void a(int i2, int i3) {
        this.o.i.a(i2, i3, 1);
    }

    public final void a(float f2) {
        this.o.i.a(f2);
    }

    public final void b(float f2) {
        this.o.i.b(f2);
    }

    private void d(int i2) {
        this.o.i.a(i2);
    }

    private boolean I() {
        return this.o.q;
    }

    public final void b(boolean z2) {
        this.o.a(z2);
    }

    private boolean J() {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            if (((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass139>) new sh.AnonymousClass139(mnVar.A()), (sh.AnonymousClass139) 0)).intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    private void e(int i2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass150(i2));
        }
    }

    public final int r() {
        return this.o.i.A.b.q;
    }

    public final float s() {
        return this.o.i.A.b.p;
    }

    private float L() {
        return this.o.i.A.b.a();
    }

    public final void a(double d2) {
        this.o.i.c(d2);
    }

    private void M() {
        this.o.i.a((Runnable) null);
    }

    private void N() {
        this.o.i.b((Runnable) null);
    }

    private void O() {
        this.o.i.p();
    }

    private boolean P() {
        return this.o.i.k();
    }

    private void Q() {
        ad adVar = this.o.i;
        adVar.o();
        adVar.j();
    }

    private void R() {
        ad adVar = this.o.i;
        adVar.o();
        adVar.a(adVar.h(), 40.0d, true);
    }

    private void S() {
        ad adVar = this.o.i;
        adVar.o();
        adVar.o.e();
        adVar.a(0.0d, 0.0d);
    }

    private void T() {
        ad adVar = this.o.i;
        adVar.o();
        adVar.o.e();
        adVar.a(adVar.h(), 40.0d);
    }

    private void U() {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.d();
        }
    }

    private void V() {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.f();
        }
    }

    private void W() {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.e();
        }
    }

    private boolean a(String str, byte[] bArr) {
        w wVar = this.o.r;
        if (wVar == null || wVar.b == null) {
            return false;
        }
        return w.a(new File(wVar.b.c()), str, bArr, wVar.d);
    }

    private boolean b(String str, byte[] bArr) {
        w wVar = this.o.r;
        if (wVar == null || wVar.b == null) {
            return false;
        }
        return w.a(new File(wVar.b.e()), str, bArr, wVar.e);
    }

    private void X() {
        w wVar = this.o.r;
        if (wVar == null) {
            return;
        }
        wVar.c();
    }

    private void a(fc fcVar) {
        ad adVar = this.o.i;
        if (fcVar != null) {
            synchronized (adVar.x) {
                if (!adVar.x.contains(fcVar)) {
                    adVar.x.add(fcVar);
                }
            }
        }
    }

    private void b(fc fcVar) {
        ad adVar = this.o.i;
        synchronized (adVar.x) {
            adVar.x.remove(fcVar);
        }
    }

    private void a(fg fgVar) {
        this.o.i.a(fgVar);
    }

    private void b(fg fgVar) {
        this.o.i.b(fgVar);
    }

    public final void a(fe feVar) {
        this.o.i.a(feVar);
    }

    private void b(fe feVar) {
        this.o.i.b(feVar);
    }

    private void a(fd fdVar) {
        ad adVar = this.o.i;
        if (fdVar != null) {
            synchronized (adVar.u) {
                if (!adVar.u.contains(fdVar)) {
                    adVar.u.add(fdVar);
                }
            }
        }
    }

    private void b(fd fdVar) {
        ad adVar = this.o.i;
        synchronized (adVar.u) {
            adVar.u.remove(fdVar);
        }
    }

    private void a(fj fjVar) {
        this.o.i.a(fjVar);
    }

    private void a(ol olVar) {
        this.o.i.a(olVar);
    }

    private void b(ol olVar) {
        this.o.i.b(olVar);
    }

    private void b(fj fjVar) {
        this.o.i.b(fjVar);
    }

    private void a(ev evVar) {
        this.o.k.e = evVar;
    }

    private void a(eu euVar) {
        bj bjVar = this.o.k;
        if (euVar == null) {
            return;
        }
        if (bjVar.f == null) {
            bjVar.f = new ArrayList();
        }
        bjVar.f.add(euVar);
    }

    private void b(eu euVar) {
        bj bjVar = this.o.k;
        if (euVar == null || bjVar.f == null) {
            return;
        }
        bjVar.f.remove(euVar);
    }

    private void a(ex exVar) {
        this.o.k.g = exVar;
    }

    private void Y() {
        this.o.k.g = null;
    }

    public final void a(es esVar) {
        this.o.k.h = esVar;
    }

    private void a(er erVar, int i2, int i3, fh fhVar) {
        mn mnVar = this.o;
        Rect bound = erVar.getBound(mnVar.n);
        if (erVar == null || bound == null || i2 <= 0 || i3 <= 0 || fhVar == null) {
            return;
        }
        mnVar.s.a(erVar, bound, fhVar, i2, i3);
    }

    private void a(Rect rect, int i2, int i3, fh fhVar) {
        mn mnVar = this.o;
        if (rect == null) {
            rect = this.o.i.q();
        }
        Rect rect2 = rect;
        if (rect2 == null || i2 <= 0 || i3 <= 0 || fhVar == null) {
            return;
        }
        mnVar.s.a(null, rect2, fhVar, i2, i3);
    }

    private void Z() {
        this.o.s.a();
    }

    private ig a(int i2, Object obj, Object obj2) {
        ad adVar = this.o.i;
        switch (i2) {
            case 0:
                return iq.a((id) adVar, 0, 1);
            case 1:
                return iq.a((id) adVar, (iu) new hu(), new Object[]{obj, obj2});
            case 2:
                return iq.a(adVar, 3, Math.log10(((Number) obj).doubleValue()) / Math.log10(2.0d), Math.log10(((Number) obj2).doubleValue()) / Math.log10(2.0d));
            case 3:
                return iq.a(adVar, 2, adVar.h(), (((Number) obj2).doubleValue() - ((Number) obj).doubleValue()) + adVar.h());
            case 4:
                return iq.a(adVar, 4, adVar.i(), (((Number) obj2).doubleValue() - ((Number) obj).doubleValue()) + adVar.i());
            default:
                return null;
        }
    }

    private long aa() {
        return this.o.i.o.c();
    }

    private void ab() {
        this.o.i.o.a();
    }

    private void ac() {
        this.o.i.o.b();
    }

    private double a(Rect rect, Rect rect2) {
        ad adVar;
        Rect rect3 = new Rect(this.o.i.z.g());
        if (rect2 != null) {
            rect3.left += rect2.left;
            rect3.right -= rect2.right;
            rect3.top += rect2.top;
            rect3.bottom -= rect2.bottom;
        }
        return adVar.a(rect, rect3);
    }

    public final float t() {
        return this.o.i.h();
    }

    public final float u() {
        return this.o.i.i();
    }

    private void a(qs qsVar) {
        mn mnVar = this.o;
        if (mnVar.j != null) {
            qv qvVar = mnVar.j;
            if (qvVar.b == null || qsVar == null) {
                return;
            }
            qu quVar = qvVar.b;
            if (quVar.a == null || qsVar == null) {
                return;
            }
            quVar.a.add(qsVar);
        }
    }

    private void b(qs qsVar) {
        mn mnVar = this.o;
        if (mnVar.j != null) {
            qv qvVar = mnVar.j;
            if (qvVar.b == null || qsVar == null) {
                return;
            }
            qu quVar = qvVar.b;
            if (quVar.a == null || qsVar == null) {
                return;
            }
            quVar.a.remove(qsVar);
        }
    }

    private int a(PolygonInfo polygonInfo) {
        return this.o.a(polygonInfo);
    }

    private void b(PolygonInfo polygonInfo) {
        this.o.b(polygonInfo);
    }

    private void g(int i2) {
        this.o.a(i2);
    }

    private int a(int i2, int i3, int i4, int i5, int i6, float f2) {
        mn mnVar = this.o;
        if (mnVar.g == null) {
            return -1;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > 255) {
            i2 = 255;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > 255) {
            i3 = 255;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > 255) {
            i4 = 255;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 > 255) {
            i5 = 255;
        }
        MaskLayer maskLayer = new MaskLayer();
        maskLayer.color = new int[]{i2, i3, i4, 255 - i5};
        if (mnVar.o != null) {
            maskLayer.width = mnVar.o.width();
            maskLayer.height = mnVar.o.height();
        }
        maskLayer.zIndex = f2;
        maskLayer.layer = i6;
        sh shVar = mnVar.g;
        return ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass86>) new sh.AnonymousClass86(maskLayer), (sh.AnonymousClass86) 0)).intValue();
    }

    private void e(int i2, int i3) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > 255) {
                i3 = 255;
            }
            int i4 = 255 - i3;
            if (i4 == 0) {
                i4 = 1;
            }
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass87(i2, i4));
        }
    }

    private void h(int i2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass88(i2));
        }
    }

    private void a(List<MapRouteSection> list, List<GeoPoint> list2) {
        mn mnVar = this.o;
        if (mnVar.z == null) {
            mnVar.z = new mn.d();
        }
        mn.d dVar = mnVar.z;
        dVar.a = list;
        dVar.b = list2;
        mn.this.g.a(list, list2);
    }

    public void clearRouteNameSegments() {
        mn mnVar = this.o;
        if (mnVar.z == null) {
            mnVar.z = new mn.d();
        }
        mn.d dVar = mnVar.z;
        mn.this.g.u();
        dVar.a = null;
        dVar.b = null;
    }

    private List<Integer> a(Rect rect, int i2) {
        sh shVar = this.o.g;
        return (List) shVar.a(new sh.AnonymousClass23(rect, i2), (sh.AnonymousClass23) null);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapFontSize(MapFontSize mapFontSize) {
        if (this.G || this.D == null || mapFontSize == null) {
            return;
        }
        mn mnVar = this.o;
        int value = mapFontSize.getValue();
        sh shVar = mnVar.g;
        shVar.a(new sh.AnonymousClass54(value));
    }

    private AnnocationTextResult a(AnnocationText annocationText) {
        sh shVar = this.o.g;
        return (AnnocationTextResult) shVar.a(new sh.AnonymousClass22(annocationText), (sh.AnonymousClass22) null);
    }

    private String ad() {
        return this.o.toString();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    /* renamed from: v */
    public final eq getProjection() {
        if (this.G || this.o == null) {
            return new x();
        }
        return this.o.n;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnCameraChangeListener(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        super.setOnCameraChangeListener(onCameraChangeListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onCameraChangeListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapClickListener(TencentMap.OnMapClickListener onMapClickListener) {
        super.setOnMapClickListener(onMapClickListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onMapClickListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapLongClickListener(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        super.setOnMapLongClickListener(onMapLongClickListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onMapLongClickListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnPolylineClickListener(TencentMap.OnPolylineClickListener onPolylineClickListener) {
        super.setOnPolylineClickListener(onPolylineClickListener);
        if (this.G || this.L == null) {
            return;
        }
        this.L.a(onPolylineClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnPolygonClickListener(TencentMap.OnPolygonClickListener onPolygonClickListener) {
        super.setOnPolygonClickListener(onPolygonClickListener);
        if (this.G || this.L == null) {
            return;
        }
        this.L.a(onPolygonClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationClickListener(TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        super.setMyLocationClickListener(onMyLocationClickListener);
        if (this.G) {
            return;
        }
        if (this.r == null) {
            ax();
        }
        this.r.i = onMyLocationClickListener;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setOnMyLocationChangeListener(TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        super.setOnMyLocationChangeListener(onMyLocationChangeListener);
        if (this.G) {
            return;
        }
        if (this.r == null) {
            ax();
        }
        this.r.c = onMyLocationChangeListener;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnCompassClickedListener(TencentMap.OnCompassClickedListener onCompassClickedListener) {
        super.setOnCompassClickedListener(onCompassClickedListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onCompassClickedListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void addOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        super.addOnMapLoadedCallback(onMapLoadedCallback);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onMapLoadedCallback);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void removeOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        super.removeOnMapLoadedCallback(onMapLoadedCallback);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.b(onMapLoadedCallback);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config, int i2) {
        super.snapshot(snapshotReadyCallback, config, i2);
        if (this.D != null) {
            aa aaVar = this.D;
            if (aaVar.b == null || snapshotReadyCallback == null) {
                return;
            }
            aaVar.c = snapshotReadyCallback;
            Handler handler = aaVar.d;
            if (aaVar.b != null) {
                aaVar.b.a(handler, config, i2);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config) {
        super.snapshot(snapshotReadyCallback, config);
        snapshot(snapshotReadyCallback, config, 0);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback) {
        super.snapshot(snapshotReadyCallback);
        snapshot(snapshotReadyCallback, Bitmap.Config.ARGB_8888);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public String getCityName(LatLng latLng) {
        if (this.G || this.D == null) {
            return "";
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return null;
        }
        return aaVar.b.a(latLng);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        super.setTencentMapGestureListener(tencentMapGestureListener);
        addTencentMapGestureListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void addTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        super.addTencentMapGestureListener(tencentMapGestureListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(tencentMapGestureListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void removeTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        super.removeTencentMapGestureListener(tencentMapGestureListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.b(tencentMapGestureListener);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public CameraPosition calculateZoomToSpanLevel(List<IOverlay> list, List<LatLng> list2, int i2, int i3, int i4, int i5) {
        ArrayList arrayList;
        if (this.G || this.D == null) {
            return null;
        }
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(i4);
        int abs4 = Math.abs(i5);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (IOverlay iOverlay : list) {
                if (iOverlay instanceof er) {
                    arrayList2.add((er) iOverlay);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return null;
        }
        return aaVar.b.a(arrayList, list2, abs, abs2, abs3, abs4);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public String getVersion() {
        if (this.G || this.D == null) {
            return "";
        }
        aa aaVar = this.D;
        return aaVar.b == null ? "" : aaVar.b.o();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isDestroyed() {
        return this.G;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuildingEnable(boolean z2) {
        super.setBuildingEnable(z2);
        setBuilding3dEffectEnable(z2);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void showBuilding(boolean z2) {
        super.showBuilding(z2);
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass36(z2));
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuilding3dEffectEnable(boolean z2) {
        super.setBuilding3dEffectEnable(z2);
        if (this.G || this.o == null) {
            return;
        }
        this.o.c(z2);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapCenterAndScale(float f2, float f3, float f4) {
        super.setMapCenterAndScale(f2, f3, f4);
        if (this.G || this.q == null) {
            return;
        }
        so soVar = this.q.b;
        if (soVar.aB != null) {
            float f5 = soVar.aB.i.A.b.p;
            float b2 = sw.b(f4);
            boolean z2 = ((double) Math.abs(f5 - b2)) > 1.0E-4d;
            soVar.aD = 0;
            jy.a(new sw.AnonymousClass1((f3 - soVar.aC) / 10.0f, f2, f3, f4, z2, b2));
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (this.q != null) {
            this.q.a(i2, i3, i4, i5, false);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPadding(int i2, int i3, int i4, int i5, boolean z2) {
        super.setPadding(i2, i3, i4, i5, z2);
        if (this.q != null) {
            this.q.a(i2, i3, i4, i5, z2);
        }
    }

    private void i(int i2) {
        ad adVar = this.o.i;
        adVar.a(i2, (Runnable) new ad.AnonymousClass4());
    }

    private void a(int i2, float f2) {
        ad adVar = this.o.i;
        adVar.a(i2, (Runnable) new ad.AnonymousClass5(f2));
    }

    private void b(Rect rect, Rect rect2) {
        this.o.i.b(rect, rect2);
    }

    private void a(GeoPoint geoPoint, Runnable runnable) {
        ad adVar = this.o.i;
        if (geoPoint != null) {
            adVar.a(geoPoint, adVar.A.b.q, runnable);
        }
    }

    private void b(GeoPoint geoPoint, Runnable runnable) {
        this.o.i.a(geoPoint, runnable);
    }

    private void f(GeoPoint geoPoint) {
        a(geoPoint, r());
    }

    private void a(GeoPoint geoPoint, int i2) {
        this.o.i.a(geoPoint, i2, (Runnable) null);
    }

    private void a(GeoPoint geoPoint, int i2, Runnable runnable) {
        this.o.i.a(geoPoint, i2, runnable);
    }

    private void a(GeoPoint geoPoint, float f2, Runnable runnable) {
        int i2;
        ad adVar = this.o.i;
        if (geoPoint != null) {
            adVar.o.e();
            double d2 = adVar.A.b.p;
            double d3 = f2;
            double d4 = d3 / d2;
            int i3 = (d4 > 1.0d ? 1 : (d4 == 1.0d ? 0 : -1));
            if (i3 > 0) {
                i2 = (int) (d4 / 0.5d);
            } else if (d4 >= 1.0d) {
                adVar.b(geoPoint, runnable);
                return;
            } else {
                i2 = i3 != 0 ? (int) (0.5d / d4) : 0;
            }
            int max = Math.max(60, Math.min(120, (i2 >> 1) << 1));
            double log10 = Math.log10(d2) / Math.log10(2.0d);
            double log102 = Math.log10(d3) / Math.log10(2.0d);
            GeoPoint geoPoint2 = adVar.A.m;
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
                adVar.b(new iw(120, new double[]{pow, a2, a3}));
                i4 = i5;
                log10 = d5;
                log102 = log102;
            }
            if (runnable != null) {
                adVar.b(new iw(runnable));
            }
        }
    }

    private void a(GeoPoint geoPoint, Rect rect) {
        double d2;
        ad adVar = this.o.i;
        eq eqVar = adVar.B;
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
        fm a3 = eqVar.a(adVar.A.m);
        a3.a -= d2;
        a3.b -= d3;
        adVar.a(eqVar.a(a3), (Runnable) null);
    }

    private void c(Rect rect, Rect rect2) {
        this.o.i.c(rect, rect2);
    }

    private boolean ae() {
        return this.o.i.o.f();
    }

    public final void a(iw iwVar) {
        this.o.i.b(iwVar);
    }

    public final void w() {
        this.o.i.o.e();
    }

    private void a(Rect rect) {
        this.o.i.a(rect);
    }

    private void af() {
        this.o.i.o.e = 60;
    }

    private void j(int i2) {
        this.o.i.o.a(i2);
    }

    private void c(float f2, float f3) {
        this.o.i.a(f2, f3, true);
    }

    private void b(float f2, float f3, boolean z2) {
        this.o.i.a(f2, f3, z2);
    }

    private void b(Rect rect) {
        this.o.i.b(rect);
    }

    private int ag() {
        return this.o.i.A.d;
    }

    private Rect ah() {
        return this.o.o;
    }

    private int a(int i2, int i3, int i4, int i5, boolean z2) {
        ad adVar = this.o.i;
        adVar.H = i2;
        adVar.I = i3;
        adVar.J = i4;
        adVar.K = i5;
        if (adVar.C != null && adVar.C.width() > 0 && adVar.C.height() > 0) {
            if (i2 + i4 > adVar.C.width() || i3 + i5 > adVar.C.height()) {
                return -1;
            }
            PointF a2 = adVar.a();
            adVar.a(a2.x, a2.y, z2);
            return 0;
        }
        adVar.a(new ad.AnonymousClass1(z2));
        if (adVar.z instanceof mn) {
            Context context = ((mn) adVar.z).getContext();
            return (i2 + i4 > hc.b(context) || i3 + i5 > hc.c(context)) ? -1 : 0;
        }
        return -2;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Rect getMapPadding() {
        return this.o.i.b();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public List<LatLng> getBounderPoints(Marker marker) {
        aw awVar;
        if (marker == null || this.o == null || (awVar = (aw) this.o.J.a(marker.getId(), aw.class)) == null) {
            return null;
        }
        return awVar.a.e();
    }

    private void b(double d2) {
        ad adVar = this.o.i;
        adVar.a((360.0d - d2) % 360.0d, adVar.i(), true);
    }

    private void a(double d2, double d3) {
        z zVar = this.o.i.o;
        synchronized (zVar.c) {
            while (!zVar.b.isEmpty() && zVar.b.get(zVar.b.size() - 1).z == 3) {
                iw remove = zVar.b.remove(zVar.b.size() - 1);
                d2 += remove.A[0];
                d3 += remove.A[1];
            }
            zVar.a(new iw(3, new double[]{d2, d3}));
        }
    }

    public final void a(pq pqVar) {
        ad adVar = this.o.i;
        if (adVar.p == null) {
            adVar.p = adVar.y.M();
        }
        pn pnVar = adVar.p;
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

    private void a(et etVar) {
        if (this.o != null) {
            mn mnVar = this.o;
            if (mnVar.m != null) {
                mnVar.m.a(etVar);
            }
        }
    }

    private void b(et etVar) {
        if (this.o != null) {
            mn mnVar = this.o;
            if (mnVar.m != null) {
                mnVar.m.b(etVar);
            }
        }
    }

    private void ai() {
        this.o.i.e();
    }

    private void aj() {
        this.o.i.f();
    }

    private void ak() {
        mn mnVar = this.o;
        if (!mnVar.q || mnVar.j == null) {
            return;
        }
        mnVar.j.a();
    }

    private void al() {
        mn mnVar = this.o;
        if (!mnVar.q || mnVar.j == null) {
            return;
        }
        mnVar.j.b();
    }

    private void d(float f2) {
        this.M = f2;
        if (this.o != null) {
            this.o.a(f2);
            if (this.O != 2 || ae()) {
                return;
            }
            b(this.M);
        }
    }

    private void a(GeoPoint geoPoint, float f2, float f3, boolean z2) {
        this.M = f2;
        this.N.setLatitudeE6(geoPoint.getLatitudeE6());
        this.N.setLongitudeE6(geoPoint.getLongitudeE6());
        if (this.o != null) {
            this.o.a(this.N, this.M, f3, z2);
            if (this.O == 1 || this.O == 2) {
                a(this.N, r());
            }
            if (this.O != 2 || ae()) {
                return;
            }
            b(this.M);
        }
    }

    private void f(int i2, int i3) {
        if (this.o != null) {
            mn mnVar = this.o;
            mnVar.E = i2;
            mnVar.D = i3;
        }
    }

    private void a(GeoPoint geoPoint, RectF rectF, boolean z2) {
        if (this.o != null) {
            mn mnVar = this.o;
            if (rectF != null && mnVar.C != null) {
                rectF.left -= mnVar.C.left;
                rectF.top -= mnVar.C.top;
                rectF.right -= mnVar.C.right;
                rectF.bottom -= mnVar.C.bottom;
            }
            if (mnVar.g != null) {
                sh shVar = mnVar.g;
                int i2 = mnVar.E;
                int i3 = mnVar.D;
                if (0 == shVar.e || shVar.j == null) {
                    return;
                }
                shVar.j.a(new sh.AnonymousClass166(rectF, geoPoint, i2, i3, z2));
            }
        }
    }

    private void k(int i2) {
        if (this.o == null) {
            return;
        }
        switch (i2) {
            case 0:
                this.o.a(false, false);
                break;
            case 1:
                this.o.a(false, false);
                int i3 = (getMapStyle() != 11 ? 18 : 17) - 1;
                if (this.O != 2) {
                    int r = r();
                    if (r <= i3) {
                        r = i3;
                    }
                    a(this.N, r);
                    break;
                } else {
                    ad adVar = this.o.i;
                    adVar.a(i3, (Runnable) new ad.AnonymousClass4());
                    break;
                }
            case 2:
                int i4 = getMapStyle() != 11 ? 18 : 17;
                int r2 = r();
                if (r2 > i4) {
                    i4 = r2;
                }
                if (this.N.getLatitudeE6() != 0) {
                    this.o.i.a(this.N.getLatitudeE6(), this.N.getLongitudeE6(), 2);
                }
                float f2 = this.M;
                ad adVar2 = this.o.i;
                adVar2.a(i4, (Runnable) new ad.AnonymousClass5(f2));
                new Handler().postDelayed(new Runnable() { // from class: com.tencent.mapsdk.vector.VectorMap.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        VectorMap.this.o.a(true, false);
                    }
                }, 1000L);
                break;
            case 3:
                this.o.a(false, true);
                break;
        }
        this.O = i2;
    }

    private int am() {
        return this.O;
    }

    private bg an() {
        return this.r;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorEnabled(boolean z2) {
        super.setIndoorEnabled(z2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.c(z2);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void a(int i2) {
        super.a(i2);
        if (this.G || this.o == null) {
            return;
        }
        kj.b(ki.f, "setIndoorConfigType:".concat(String.valueOf(i2)));
        sh shVar = this.o.g;
        shVar.a(new sh.AnonymousClass134(i2));
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorFloor(int i2) {
        super.setIndoorFloor(i2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.c(i2);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorFloor(String str, String str2) {
        super.setIndoorFloor(str, str2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        aaVar.b.a(str, str2);
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public int getIndoorFloorId() {
        if (this.G || this.D == null) {
            return -1;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            return aaVar.b.r();
        }
        return -1;
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public String[] getActivedIndoorFloorNames() {
        if (this.G || this.D == null) {
            return null;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            return aaVar.b.s();
        }
        return null;
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public String getActivedIndoorBuilding(LatLng latLng) {
        IndoorBuilding u2;
        if (this.G || this.D == null) {
            return null;
        }
        aa aaVar = this.D;
        if (aaVar.b == null || (u2 = aaVar.b.u()) == null) {
            return null;
        }
        if (u2.getBuildingLatLng() != null && latLng != null) {
            latLng.latitude = u2.getBuildingLatLng().latitude;
            latLng.longitude = u2.getBuildingLatLng().longitude;
        }
        return u2.getBuildingName();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapPoiClickListener(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        super.setOnMapPoiClickListener(onMapPoiClickListener);
        if (this.G || this.D == null) {
            return;
        }
        if (this.s != null) {
            this.s.c = onMapPoiClickListener;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onMapPoiClickListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCameraCenterProportion(float f2, float f3) {
        super.setCameraCenterProportion(f2, f3);
        setCameraCenterProportion(f2, f3, true);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCameraCenterProportion(float f2, float f3, boolean z2) {
        super.setCameraCenterProportion(f2, f3, z2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(f2, f3, z2);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPointToCenter(int i2, int i3) {
        eq projection;
        super.setPointToCenter(i2, i3);
        if (this.G || this.D == null || (projection = getProjection()) == null) {
            return;
        }
        this.D.a(CameraUpdateFactory.newLatLng(projection.fromScreenLocation(new Point(i2, i3))));
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMaxZoomLevel(int i2) {
        super.setMaxZoomLevel(i2);
        if (this.G || this.D == null) {
            return;
        }
        int l2 = l(i2);
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.d(l2);
        }
        float f2 = l2;
        if (this.D.a().zoom > f2) {
            animateCamera(CameraUpdateFactory.zoomTo(f2));
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMinZoomLevel(int i2) {
        super.setMinZoomLevel(i2);
        if (this.G || this.D == null) {
            return;
        }
        int l2 = l(i2);
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.e(l2);
        }
        float f2 = l2;
        if (this.D.a().zoom < f2) {
            animateCamera(CameraUpdateFactory.zoomTo(f2));
        }
    }

    private String[] ao() {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            return (String[]) shVar.a(new sh.AnonymousClass137(), (sh.AnonymousClass137) null);
        }
        return null;
    }

    private String ap() {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            return (String) shVar.a(new sh.AnonymousClass141(), (sh.AnonymousClass141) null);
        }
        return null;
    }

    private String g(GeoPoint geoPoint) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            return (String) shVar.a(new sh.AnonymousClass142(geoPoint), (sh.AnonymousClass142) null);
        }
        return null;
    }

    private pv h(GeoPoint geoPoint) {
        sh shVar = this.o.g;
        if (geoPoint == null) {
            geoPoint = new GeoPoint();
        }
        return (pv) shVar.a(new sh.AnonymousClass138(geoPoint), (sh.AnonymousClass138) null);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorMaskColor(int i2) {
        super.setIndoorMaskColor(i2);
        sh shVar = this.o.g;
        if (0 != shVar.e) {
            shVar.a(new sh.AnonymousClass143(i2));
        }
    }

    private void a(float f2, float f3, float f4, float f5) {
        sh shVar = this.o.g;
        if (0 != shVar.e) {
            shVar.a(new sh.AnonymousClass144(f2, f3, f4, f5));
        }
    }

    private Rect aq() {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            return (Rect) shVar.a(new sh.AnonymousClass140(), (sh.AnonymousClass140) null);
        }
        return null;
    }

    private void d(boolean z2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            if (shVar.e != 0) {
                shVar.a(new sh.AnonymousClass145(z2));
            }
        }
    }

    public final void a(String[] strArr) {
        this.o.a(strArr);
    }

    private void m(int i2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            if (0 != shVar.e) {
                shVar.a(new sh.AnonymousClass148(i2));
            }
        }
    }

    private void e(boolean z2) {
        sh shVar = this.o.g;
        if (0 != shVar.e) {
            shVar.a(new sh.AnonymousClass149(z2));
        }
    }

    private void f(boolean z2) {
        this.o.e(z2);
    }

    private void b(String str) {
        sh shVar = this.o.g;
        if (0 != shVar.e) {
            shVar.a(new sh.AnonymousClass152(str));
        }
    }

    private void g(boolean z2) {
        this.o.g.f(z2);
    }

    public final void b(int i2) {
        this.o.b(i2);
    }

    private void n(int i2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.b(i2);
        }
        if (mnVar.t != null) {
            mnVar.t.b.n = i2;
        }
    }

    private void a(od odVar) {
        this.o.a(odVar);
    }

    private void a(ad.a aVar) {
        this.o.i.D = aVar;
    }

    public final void b(int i2, int i3) {
        this.o.i.a(i2, i3);
    }

    public final void c(float f2) {
        this.o.i.a(f2);
    }

    private v ar() {
        return this.o.i.g();
    }

    private void c(float f2, float f3, boolean z2) {
        this.o.i.M = true;
        this.o.i.a(f2, f3, z2);
    }

    private void d(float f2, float f3) {
        if (this.o != null) {
            ad adVar = this.o.i;
            adVar.E = f2;
            adVar.F = f3;
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (this.o != null) {
            mn mnVar = this.o;
            if (mnVar.g != null) {
                sh shVar = mnVar.g;
                shVar.a(new sh.AnonymousClass16(i3, i2, i4, i5));
            }
        }
    }

    private void c(double d2) {
        this.o.i.a((float) d2);
    }

    private void a(double d2, double d3, double d4, double d5, double d6) {
        this.o.i.a(d2, d3, d4, d5, d6, null);
    }

    private void as() {
        this.o.i.j();
    }

    public final void a(bb bbVar) {
        this.o.i.a(bbVar);
    }

    private void b(bb bbVar) {
        ad adVar = this.o.i;
        if (adVar.v != null) {
            synchronized (adVar.w) {
                adVar.v.remove(bbVar);
            }
        }
    }

    private mm at() {
        return this.o.l;
    }

    private v au() {
        return this.o.t;
    }

    @Deprecated
    private int a(TileOverlayCallback tileOverlayCallback, boolean z2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            return mnVar.g.a(tileOverlayCallback, z2);
        }
        return -1;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        super.addTileOverlay(tileOverlayOptions);
        if (this.G || this.D == null) {
            return null;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return null;
        }
        return aaVar.b.a(tileOverlayOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public CustomLayer addCustomLayer(CustomLayerOptions customLayerOptions) {
        super.addCustomLayer(customLayerOptions);
        if (this.G || this.D == null) {
            return null;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return null;
        }
        return aaVar.b.a(customLayerOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Polyline addPolyline(PolylineOptions polylineOptions) {
        if (this.G || this.o == null || polylineOptions == null) {
            return null;
        }
        return this.o.J.a(polylineOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Polygon addPolygon(PolygonOptions polygonOptions) {
        if (this.G || this.o == null || polygonOptions == null) {
            return null;
        }
        bi biVar = this.o.J;
        ou ouVar = new ou(biVar.f, polygonOptions);
        ax axVar = new ax(ouVar);
        biVar.a.put(ouVar.getId(), axVar);
        biVar.d.add(axVar);
        biVar.a((en) ouVar);
        return axVar;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Circle addCircle(CircleOptions circleOptions) {
        if (this.G || circleOptions == null || this.o == null) {
            return null;
        }
        return this.o.J.a(circleOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Marker addMarker(MarkerOptions markerOptions) {
        if (this.G || this.o == null || markerOptions == null) {
            return null;
        }
        return this.o.J.a(markerOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Arc addArc(ArcOptions arcOptions) {
        if (this.G || this.o == null || arcOptions == null) {
            return null;
        }
        bi biVar = this.o.J;
        op opVar = new op(arcOptions, biVar.f);
        as asVar = new as(opVar);
        biVar.a.put(opVar.getId(), asVar);
        biVar.c.add(asVar);
        biVar.a((en) opVar);
        return asVar;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clearAllOverlays() {
        super.clearAllOverlays();
        if (this.G || this.L == null) {
            return;
        }
        this.L.l();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clear() {
        super.clear();
        clearAllOverlays();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clearCache() {
        super.clearCache();
        kc.f(mi.a(getMapContext().getContext(), (TencentMapOptions) null).c());
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapType(int i2) {
        super.setMapType(i2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.f(i2);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public int getMapType() {
        if (this.G || this.D == null) {
            return 1000;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return 1000;
        }
        return aaVar.b.A();
    }

    @Deprecated
    private void g(int i2, int i3) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.b(i2, i3);
        }
    }

    @Deprecated
    private void o(int i2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.d(i2);
            mnVar.v = true;
        }
    }

    @Deprecated
    private void p(int i2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.e(i2);
        }
    }

    @Deprecated
    private void a(int i2, int i3, int i4) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.a(i2, i3, i4);
        }
    }

    private boolean av() {
        return this.o.H.f.t();
    }

    private void h(boolean z2) {
        this.o.H.f.h(z2);
    }

    private void h(int i2, int i3) {
        this.o.a(i2, i3);
    }

    private void i(int i2, int i3) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass18(i2, i3));
        }
    }

    private void i(boolean z2) {
        ad adVar = this.o.i;
        adVar.G = z2;
        adVar.z.f().b(adVar.G);
    }

    public final void c(int i2, int i3) {
        this.o.b(i2, i3);
    }

    private void c(String str) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            if (0 != shVar.e) {
                shVar.a(new sh.AnonymousClass129(str));
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void loadKMLFile(String str) {
        super.loadKMLFile(str);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(str);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setDrawPillarWith2DStyle(boolean z2) {
        super.setDrawPillarWith2DStyle(z2);
        if (this.G || this.o == null) {
            return;
        }
        this.o.c(!z2);
    }

    private void b(int i2, float f2) {
        mn mnVar = this.o;
        if (mnVar.g != null) {
            mnVar.g.a(i2, f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.map.lib.models.GeoPoint r19, com.tencent.mapsdk.internal.Cif r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.a(com.tencent.map.lib.models.GeoPoint, com.tencent.mapsdk.internal.if):void");
    }

    private float a(double d2, GeoPoint geoPoint) {
        mn mnVar = this.o;
        if (geoPoint == null || mnVar.t == null || mnVar.n == null) {
            return 0.0f;
        }
        double metersPerPixel = mnVar.n.metersPerPixel(geoPoint.getLatitudeE6() / 1000000.0d);
        if (metersPerPixel != 0.0d) {
            return (float) (d2 / metersPerPixel);
        }
        return 0.0f;
    }

    private boolean i(GeoPoint geoPoint) {
        boolean z2;
        ad adVar = this.o.i;
        if (geoPoint == null) {
            return true;
        }
        Rect r = adVar.r();
        boolean contains = r != null ? r.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6()) : false;
        fm a2 = adVar.B.a(adVar.A.m);
        fm a3 = adVar.B.a(geoPoint);
        if (adVar.C != null) {
            double abs = Math.abs(a2.a - a3.a);
            double abs2 = Math.abs(a2.b - a3.b);
            if (abs > adVar.C.width() || abs2 > adVar.C.height()) {
                z2 = false;
                return contains && !z2;
            }
        }
        z2 = true;
        if (contains) {
        }
    }

    private void a(Language language) {
        mn mnVar = this.o;
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

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.vector.VectorMap$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[Language.values().length];

        static {
            try {
                a[Language.en.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Language.zh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public MapLanguage getLanguage() {
        if (AnonymousClass3.a[this.o.B().ordinal()] == 1) {
            return MapLanguage.LAN_ENGLISH;
        }
        return MapLanguage.LAN_CHINESE;
    }

    private Language aw() {
        return this.o.B();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerClickListener(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        super.setOnMarkerClickListener(onMarkerClickListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onMarkerClickListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerDragListener(TencentMap.OnMarkerDragListener onMarkerDragListener) {
        super.setOnMarkerDragListener(onMarkerDragListener);
        if (this.G || this.o == null) {
            return;
        }
        this.o.k.c = onMarkerDragListener;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        super.setOnInfoWindowClickListener(onInfoWindowClickListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onInfoWindowClickListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setInfoWindowAdapter(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        super.setInfoWindowAdapter(infoWindowAdapter);
        if (this.G || this.L == null) {
            return;
        }
        this.L.aI = infoWindowAdapter;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        super.setMyLocationStyle(myLocationStyle);
        if (this.E == null) {
            ax();
        }
        ac acVar = this.E;
        if (acVar.a != null) {
            acVar.a.a(myLocationStyle);
        }
    }

    private void ax() {
        if (this.r == null) {
            this.r = new bg(this.o, this.D);
        }
        if (this.E == null) {
            this.E = new ac(this.r);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setOnIndoorStateChangeListener(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        super.setOnIndoorStateChangeListener(onIndoorStateChangeListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onIndoorStateChangeListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorCellInfo(List<IndoorCellInfo> list) {
        super.setIndoorCellInfo(list);
        if (this.G || this.D == null) {
            return;
        }
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass76(list));
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void resetIndoorCellInfo() {
        super.resetIndoorCellInfo();
        if (this.G || this.D == null) {
            return;
        }
        mn mnVar = this.o;
        if (mnVar.g != null) {
            sh shVar = mnVar.g;
            shVar.a(new sh.AnonymousClass77());
        }
    }

    private void a(fa faVar) {
        this.o.a(faVar);
    }

    private void b(fa faVar) {
        this.o.b(faVar);
    }

    public final void a(of ofVar) {
        this.o.a(ofVar);
    }

    private void b(of ofVar) {
        mn mnVar = this.o;
        if (mnVar.I.isEmpty()) {
            return;
        }
        mnVar.I.remove(ofVar);
    }

    private void d(String str) {
        this.o.a(str);
    }

    private void e(String str) {
        this.o.b(str);
    }

    public final TappedElement a(float f2, float f3) {
        return this.o.a(f2, f3);
    }

    private void j(boolean z2) {
        this.p = z2;
        this.o.h(z2);
    }

    private boolean ay() {
        return this.p;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setHandDrawMapEnable(boolean z2) {
        super.setHandDrawMapEnable(z2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.e(z2);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isHandDrawMapEnable() {
        if (this.G || this.D == null) {
            return false;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return false;
        }
        return aaVar.b.w();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void enableMultipleInfowindow(boolean z2) {
        super.enableMultipleInfowindow(z2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.f(z2);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public int getMapWidth() {
        return this.o.b.getMapRenderView().getWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public int getMapHeight() {
        return this.o.b.getMapRenderView().getHeight();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setForeignLanguage(Language language) {
        super.setForeignLanguage(language);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.b(language);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public String getDebugError() {
        if (this.G || this.D == null) {
            return null;
        }
        aa aaVar = this.D;
        if (aaVar.b == null) {
            return null;
        }
        return aaVar.b.z();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPoisEnabled(boolean z2) {
        super.setPoisEnabled(z2);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.i(z2);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode) {
        super.setRestrictBounds(latLngBounds, restrictBoundsFitMode);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        int ordinal = restrictBoundsFitMode == null ? 0 : restrictBoundsFitMode.ordinal();
        if (aaVar.b != null) {
            aaVar.b.a(latLngBounds, ordinal);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnTrafficEventClickListener(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        super.setOnTrafficEventClickListener(onTrafficEventClickListener);
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.a(onTrafficEventClickListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void a(boolean z2) {
        if (this.G || this.q == null) {
            return;
        }
        this.q.a.setZOrderMediaOverlay(z2);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCustomRender(CustomRender customRender) {
        super.setCustomRender(customRender);
        if (this.G || this.o == null) {
            return;
        }
        mn mnVar = this.o;
        mnVar.F = customRender;
        mnVar.v = true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public VectorHeatOverlay addVectorHeatOverlay(VectorHeatOverlayOptions vectorHeatOverlayOptions) {
        VectorHeatOverlay vectorHeatOverlay = null;
        if (this.G || this.o == null) {
            return null;
        }
        mn mnVar = this.o;
        if (mnVar.g != null) {
            if (mnVar.d != null) {
                mnVar.d.h().a();
            }
            vectorHeatOverlay = (VectorHeatOverlay) mnVar.k.a((bj) new mu(vectorHeatOverlayOptions));
        }
        n();
        return vectorHeatOverlay;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public <L extends VectorOverlay> L addVectorOverlay(VectorOverlayProvider vectorOverlayProvider) {
        if (this.G || this.o == null) {
            return null;
        }
        L l2 = (L) this.o.a(vectorOverlayProvider);
        n();
        return l2;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void updateVectorOverlay(VectorOverlay vectorOverlay, VectorOverlayProvider vectorOverlayProvider) {
        if (this.G || this.o == null) {
            return;
        }
        mn mnVar = this.o;
        if (mnVar.g != null) {
            if (vectorOverlayProvider instanceof AggregationOverlayProvider) {
                mt mtVar = (mt) mnVar.k.a(mt.class, ((mt) vectorOverlay).c());
                if (mtVar != null) {
                    mtVar.a((mt) new mu((AggregationOverlayProvider) vectorOverlayProvider));
                } else {
                    mnVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof GradientVectorOverlayProvider) {
                nc ncVar = (nc) mnVar.k.a(nc.class, ((nc) vectorOverlay).c());
                if (ncVar != null) {
                    ncVar.a((nc) new ne((GradientVectorOverlayProvider) vectorOverlayProvider));
                } else {
                    mnVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof ArcLineOverlayProvider) {
                mw mwVar = (mw) mnVar.k.a(mw.class, ((mw) vectorOverlay).c());
                if (mwVar != null) {
                    mwVar.a((mw) new my((ArcLineOverlayProvider) vectorOverlayProvider));
                } else {
                    mnVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof DotScatterPlotOverlayProvider) {
                nl nlVar = (nl) mnVar.k.a(nl.class, ((nl) vectorOverlay).c());
                if (nlVar != null) {
                    nlVar.a((nl) new nn(mnVar.g.z(), (DotScatterPlotOverlayProvider) vectorOverlayProvider));
                } else {
                    mnVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof BitmapScatterPlotOverlayProvider) {
                nl nlVar2 = (nl) mnVar.k.a(nl.class, ((nl) vectorOverlay).c());
                if (nlVar2 != null) {
                    nlVar2.a((nl) new nn(mnVar.g.z(), (BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
                } else {
                    mnVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof TrailOverlayProvider) {
                no noVar = (no) mnVar.k.a(no.class, ((no) vectorOverlay).c());
                if (noVar != null) {
                    noVar.a((no) new nq((TrailOverlayProvider) vectorOverlayProvider));
                } else {
                    mnVar.a(vectorOverlayProvider);
                }
            }
        }
        n();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        GroundOverlay groundOverlay = null;
        if (this.G || this.o == null || groundOverlayOptions == null) {
            return null;
        }
        mn mnVar = this.o;
        if (mnVar.g != null) {
            if (mnVar.d != null) {
                mnVar.d.n().a++;
            }
            groundOverlay = (GroundOverlay) mnVar.k.a((bj) new nb(mnVar.g.z(), groundOverlayOptions));
        }
        n();
        return groundOverlay;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public VisualLayer addVisualLayer(VisualLayerOptions visualLayerOptions) {
        dw dwVar = (dw) getMapComponent(dw.class);
        if (dwVar != null) {
            return dwVar.a(visualLayerOptions);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOverSeaTileProvider(OverSeaTileProvider overSeaTileProvider) {
        super.setOverSeaTileProvider(overSeaTileProvider);
        if (this.G || this.o == null) {
            return;
        }
        mn mnVar = this.o;
        if (mnVar.m != null) {
            mnVar.m.a(overSeaTileProvider);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public AoiLayer addAoiLayer(String str, AoiLayerOptions aoiLayerOptions, AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        pa paVar = null;
        if (this.G || this.s == null) {
            return null;
        }
        pc pcVar = this.s;
        Iterator<pa> it = pcVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            pa next = it.next();
            if (next.getId() != null && next.getId().equals(str)) {
                paVar = next;
                break;
            }
        }
        if (paVar == null) {
            paVar = new pa(pcVar, str, aoiLayerOptions, pcVar);
            pcVar.a.add(paVar);
            if (onAoiLayerLoadListener != null) {
                pcVar.d.put(str, onAoiLayerLoadListener);
            }
        }
        paVar.a(aoiLayerOptions);
        n();
        return paVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBaseMapEnabled(boolean z2) {
        if (this.G || this.o == null) {
            return;
        }
        this.o.i(z2);
    }

    private void k(boolean z2) {
        if (this.o != null) {
            mn mnVar = this.o;
            if (mnVar.i != null) {
                mnVar.i.L = z2;
            }
        }
    }

    private String az() {
        if (this.o != null) {
            return this.o.v();
        }
        return null;
    }

    public final String x() {
        if (this.o != null) {
            return this.o.w();
        }
        return null;
    }

    private boolean aA() {
        return this.n;
    }

    private void aB() {
        this.n = true;
    }

    private ArrayList<MapPoi> aC() {
        if (this.o == null) {
            return null;
        }
        return this.o.D();
    }

    private int f(String str) {
        if (this.o == null) {
            return -1;
        }
        mn mnVar = this.o;
        if (mnVar.g == null) {
            return -1;
        }
        sh shVar = mnVar.g;
        return ((Integer) shVar.a((CallbackRunnable<sh.AnonymousClass40>) new sh.AnonymousClass40(str), (sh.AnonymousClass40) (-1))).intValue();
    }

    private String aD() {
        if (this.o == null) {
            return null;
        }
        mn mnVar = this.o;
        if (mnVar.g == null) {
            return null;
        }
        sh shVar = mnVar.g;
        return (String) shVar.a(new sh.AnonymousClass41(), (sh.AnonymousClass41) null);
    }

    private String aE() {
        if (this.o == null) {
            return null;
        }
        mn mnVar = this.o;
        if (mnVar.g == null) {
            return null;
        }
        return mnVar.g.a();
    }

    private void a(oh ohVar) {
        if (this.o == null) {
            return;
        }
        this.o.G = ohVar;
    }

    private void a(LatLngBounds latLngBounds, int i2) {
        if (this.o == null) {
            return;
        }
        this.o.a(latLngBounds, i2);
    }

    private mn aF() {
        return this.o;
    }

    private bh aG() {
        return this.q;
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void b() {
        if (this.G || this.D == null || this.s == null) {
            return;
        }
        this.L.a(this.s);
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void c() {
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.j();
        }
        this.H = false;
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void d() {
        if (this.G || this.D == null) {
            return;
        }
        aa aaVar = this.D;
        if (aaVar.b != null) {
            aaVar.b.n();
        }
        this.H = true;
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void e() {
        if (this.G || this.D == null) {
        }
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void f() {
        if (this.G || this.D == null || this.s == null) {
            return;
        }
        this.L.b(this.s);
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void g() {
        super.g();
        if (this.G) {
            return;
        }
        if (this.D != null) {
            aa aaVar = this.D;
            if (aaVar.b != null) {
                aaVar.b.m();
            }
        }
        if (this.A != null) {
            this.A.b();
        }
        if (this.s != null) {
            pc pcVar = this.s;
            pcVar.c = null;
            pcVar.a.clear();
            pcVar.d.clear();
        }
        rj a2 = rj.a();
        if (a2.j.decrementAndGet() == 0) {
            rj.a.clear();
            a2.d = false;
        }
        if (this.F != null) {
            ae aeVar = this.F;
            if (aeVar.a != null) {
                aeVar.a = null;
            }
            this.F = null;
        }
        if (this.E != null) {
            ac acVar = this.E;
            if (acVar.a != null) {
                acVar.a = null;
            }
            this.E = null;
        }
        if (this.D != null) {
            aa aaVar2 = this.D;
            if (aaVar2.b != null) {
                aaVar2.b = null;
            }
            this.D = null;
        }
        if (this.C != null) {
            this.C = null;
        }
        if (this.B != null) {
            af afVar = this.B;
            if (afVar.a != null) {
                afVar.a = null;
            }
            this.B = null;
        }
        if (this.r != null) {
            bg bgVar = this.r;
            bgVar.c();
            bgVar.a = null;
            this.r = null;
        }
        if (this.q != null) {
            bh bhVar = this.q;
            if (bhVar.b != null) {
                ((VectorMap) bhVar.b.e_).b(bhVar.k);
                so soVar = bhVar.b;
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
                bhVar.b = null;
            }
            if (bhVar.c != null) {
                bhVar.c = null;
            }
            if (gx.b != null) {
                gx.b.c();
            }
            this.q = null;
        }
        this.G = true;
    }

    private void aH() {
        if (this.r != null) {
            bg bgVar = this.r;
            bgVar.c();
            bgVar.a = null;
            this.r = null;
        }
        if (this.q != null) {
            bh bhVar = this.q;
            if (bhVar.b != null) {
                ((VectorMap) bhVar.b.e_).b(bhVar.k);
                so soVar = bhVar.b;
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
                bhVar.b = null;
            }
            if (bhVar.c != null) {
                bhVar.c = null;
            }
            if (gx.b != null) {
                gx.b.c();
            }
            this.q = null;
        }
    }

    private void aI() {
        if (this.F != null) {
            ae aeVar = this.F;
            if (aeVar.a != null) {
                aeVar.a = null;
            }
            this.F = null;
        }
        if (this.E != null) {
            ac acVar = this.E;
            if (acVar.a != null) {
                acVar.a = null;
            }
            this.E = null;
        }
        if (this.D != null) {
            aa aaVar = this.D;
            if (aaVar.b != null) {
                aaVar.b = null;
            }
            this.D = null;
        }
        if (this.C != null) {
            this.C = null;
        }
        if (this.B != null) {
            af afVar = this.B;
            if (afVar.a != null) {
                afVar.a = null;
            }
            this.B = null;
        }
    }

    private boolean f(float f2, float f3) {
        bj bjVar = this.o.k;
        TappedElement a2 = bjVar.a.f().a(f2, f3);
        if (a2 == null || a2.type != 3) {
            return false;
        }
        if (bjVar.h != null) {
            bjVar.h.R();
            return true;
        }
        return true;
    }

    private boolean g(float f2, float f3) {
        boolean z2 = false;
        if (this.r != null) {
            bg bgVar = this.r;
            TappedElement a2 = bgVar.g.k.a.f().a(f2, f3);
            if (a2 != null && a2.type == 6) {
                z2 = true;
            }
            if (!z2 || bgVar.i == null) {
                return z2;
            }
            LatLng latLng = new LatLng();
            if (bgVar.e != null) {
                latLng.setAltitude(bgVar.e.getAltitude());
                latLng.setLongitude(bgVar.e.getLongitude());
                latLng.setLatitude(bgVar.e.getLatitude());
            }
            return bgVar.i.onMyLocationClicked(latLng);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        r4 = com.tencent.mapsdk.internal.pa.a(r3.getId(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b A[EDGE_INSN: B:35:0x007b->B:30:0x007b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h(float r11, float r12) {
        /*
            r10 = this;
            com.tencent.mapsdk.engine.jni.models.TappedElement r11 = r10.a(r11, r12)
            r12 = 0
            if (r11 == 0) goto L85
            com.tencent.mapsdk.internal.pc r0 = r10.s
            if (r0 == 0) goto L85
            com.tencent.mapsdk.internal.pc r0 = r10.s
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r1 = r0.c
            if (r1 == 0) goto L84
            if (r11 == 0) goto L84
            int r1 = r11.type
            r2 = 4
            if (r1 != r2) goto L84
            long r1 = r11.itemId
            java.util.List<com.tencent.mapsdk.internal.pa> r11 = r0.a
            java.util.Iterator r11 = r11.iterator()
        L20:
            boolean r3 = r11.hasNext()
            r4 = 0
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r11.next()
            com.tencent.mapsdk.internal.pa r3 = (com.tencent.mapsdk.internal.pa) r3
            com.tencent.mapsdk.internal.pb r5 = r3.b
            if (r5 == 0) goto L71
            com.tencent.mapsdk.internal.pb r5 = r3.b
            com.tencent.mapsdk.internal.pb$d r5 = r5.a
            if (r5 == 0) goto L71
            com.tencent.mapsdk.internal.pb r5 = r3.b
            com.tencent.mapsdk.internal.pb$d r5 = r5.a
            java.util.List<com.tencent.mapsdk.internal.pb$d> r5 = r5.j
            if (r5 == 0) goto L71
            com.tencent.mapsdk.internal.pb r5 = r3.b
            com.tencent.mapsdk.internal.pb$d r5 = r5.a
            java.util.List<com.tencent.mapsdk.internal.pb$d> r5 = r5.j
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L71
            java.lang.Object r6 = r5.next()
            com.tencent.mapsdk.internal.pb$d r6 = (com.tencent.mapsdk.internal.pb.d) r6
            com.tencent.mapsdk.internal.pc r7 = r3.a
            com.tencent.mapsdk.internal.mn r7 = r7.b
            com.tencent.mapsdk.internal.bj r7 = r7.k
            java.lang.Class<com.tencent.mapsdk.internal.ni> r8 = com.tencent.mapsdk.internal.ni.class
            int r9 = r6.a
            com.tencent.mapsdk.internal.mp r7 = r7.a(r8, r9)
            com.tencent.mapsdk.internal.ni r7 = (com.tencent.mapsdk.internal.ni) r7
            if (r7 == 0) goto L49
            int r7 = r7.e_()
            long r7 = (long) r7
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L49
            r4 = r6
        L71:
            if (r4 == 0) goto L20
            java.lang.String r11 = r3.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.tencent.mapsdk.internal.pa.a(r11, r4)
        L7b:
            if (r4 == 0) goto L84
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r11 = r0.c
            r11.onClicked(r4)
            r11 = 1
            return r11
        L84:
            return r12
        L85:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.h(float, float):boolean");
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapFrameRate(float f2) {
        super.setMapFrameRate(f2);
        if (this.L != null) {
            sw swVar = this.L;
            if (swVar.c != null) {
                swVar.c.a(f2);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOverSeaEnable(boolean z2) {
        super.setOverSeaEnable(z2);
        if (this.L != null) {
            this.L.m(z2);
        }
    }

    private void e(GeoPoint geoPoint) {
        boolean contains;
        if (geoPoint == null) {
            contains = false;
        } else {
            int latitudeE6 = geoPoint.getLatitudeE6();
            contains = GeometryConstants.BOUNDARY_WORLD.contains(geoPoint.getLongitudeE6(), latitudeE6);
        }
        if (contains) {
            this.o.i.a(geoPoint, (Runnable) null);
        }
    }

    private static float f(int i2) {
        return v.a.a(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
        r5 = com.tencent.mapsdk.internal.pa.a(r4.getId(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e9, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3 A[EDGE_INSN: B:66:0x00f3->B:58:0x00f3 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.e(float, float):boolean");
    }
}
