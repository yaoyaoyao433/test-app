package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.SystemClock;
import android.view.View;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.a;
import com.sankuai.meituan.mapsdk.mapcore.report.f;
import com.sankuai.meituan.mapsdk.mapcore.utils.e;
import com.sankuai.meituan.mapsdk.mapcore.utils.g;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.business.d;
import com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.h;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
import com.sankuai.meituan.mapsdk.maps.interfaces.n;
import com.sankuai.meituan.mapsdk.maps.interfaces.q;
import com.sankuai.meituan.mapsdk.maps.interfaces.r;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbsMTMap implements IMTMap {
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean a;
    public volatile int mCameraChangedType;
    public volatile CameraMapGestureType mCameraMapGestureType;
    public MTMap.OnCameraChangeListener mOnCameraChangeListener;
    public Set<MTMap.OnCameraChangeListener> mOnCameraChangeListeners;
    public View mViewInfoWindow;
    protected d s;
    protected CustomMyLocation t;
    protected AbstractMapView u;
    protected Platform v;
    protected boolean w;
    protected BitmapDescriptor x;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public List<MarkerOptions> createDynamicMarkerOptions(String str) {
        return null;
    }

    public void includeMyLocation(LatLngBounds.Builder builder, double[] dArr) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean isMapRenderFinish() {
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public abstract void setOnMapAoiClickListener(MTMap.OnMapAoiClickListener onMapAoiClickListener);

    @Deprecated
    public AbsMTMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3f58739d94005c8bd77c163a94b25d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3f58739d94005c8bd77c163a94b25d2");
            return;
        }
        this.mCameraChangedType = 0;
        this.mOnCameraChangeListeners = new CopyOnWriteArraySet();
        this.s = new d();
        this.mCameraMapGestureType = CameraMapGestureType.NONE;
        this.v = Platform.NATIVE;
        this.w = false;
    }

    public AbstractMapView getMapView() {
        return this.u;
    }

    public void setMapView(AbstractMapView abstractMapView) {
        this.u = abstractMapView;
    }

    public void resetCameraGestureType() {
        if (this.mCameraChangedType != 1) {
            this.mCameraMapGestureType = CameraMapGestureType.NONE;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd75f23032e40fde0dbbac898ae2ee6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd75f23032e40fde0dbbac898ae2ee6d");
            return;
        }
        d dVar = this.s;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect3, false, "65e62184aadd63e46d3782d42cc3556d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect3, false, "65e62184aadd63e46d3782d42cc3556d");
            return;
        }
        Object[] objArr3 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect4 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect4, false, "de33f8b601113fe9c94de5628f54c424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect4, false, "de33f8b601113fe9c94de5628f54c424");
        } else {
            dVar.b.clear();
        }
    }

    public void resetLocator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4db00cb6ca336f049759d8090f44e032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4db00cb6ca336f049759d8090f44e032");
        } else if (this.t == null) {
        } else {
            this.t.resumeLocator();
        }
    }

    public d getOverlayKeeper() {
        return this.s;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void fitAllElement(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "917c1a849f91a3e73c6b290ea26a8c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "917c1a849f91a3e73c6b290ea26a8c69");
        } else if (this.s == null) {
        } else {
            a(this.s.b, z, z2, z3, i, i2, i3, i4);
        }
    }

    private void a(Collection<l> collection, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4) {
        Object[] objArr = {collection, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f84c51a8c989ce7b4d9d8f2b8ea6583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f84c51a8c989ce7b4d9d8f2b8ea6583");
        } else if (this.u == null || this.u.getHeight() <= 0 || this.u.getWidth() <= 0 || this.s == null || this.s.b == null || this.s.b.isEmpty()) {
        } else {
            LatLngBounds build = a(collection, this.u.getWidth(), this.u.getHeight(), z, z3).build();
            if (build.isValid()) {
                if (z2) {
                    animateCamera(CameraUpdateFactory.newLatLngBoundsRect(build, i, i3, i2, i4));
                } else {
                    moveCamera(CameraUpdateFactory.newLatLngBoundsRect(build, i, i3, i2, i4));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    private LatLngBounds.Builder a(Collection<l> collection, int i, int i2, boolean z, boolean z2) {
        AbsMTMap absMTMap;
        boolean z3;
        LatLngBounds.Builder builder;
        int i3;
        double[] dArr;
        LatLngBounds.Builder builder2;
        int i4;
        double[] dArr2;
        int i5;
        int i6;
        int i7;
        int i8;
        Bitmap bitmap;
        AbsMTMap absMTMap2 = this;
        boolean z4 = z ? 1 : 0;
        int i9 = 5;
        ?? r11 = 0;
        char c = 1;
        Object[] objArr = {collection, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "976a364de9fee85f6606e9c038530cb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds.Builder) PatchProxy.accessDispatch(objArr, absMTMap2, changeQuickRedirect2, false, "976a364de9fee85f6606e9c038530cb1");
        }
        LatLngBounds.Builder builder3 = new LatLngBounds.Builder();
        int i10 = 0;
        while (i10 < 8) {
            double[] a = g.a(i, i2, builder3.build());
            for (l lVar : collection) {
                if (lVar instanceof n) {
                    n nVar = (n) lVar;
                    Object[] objArr2 = new Object[i9];
                    objArr2[r11] = nVar;
                    objArr2[c] = builder3;
                    objArr2[2] = a;
                    objArr2[3] = Byte.valueOf(z ? (byte) 1 : (byte) 0);
                    objArr2[4] = Byte.valueOf(z2 ? (byte) 1 : (byte) 0);
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    double[] dArr3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "357c0eb2313fe2b3893314052c3f39e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, absMTMap2, changeQuickRedirect3, r11, "357c0eb2313fe2b3893314052c3f39e8");
                        absMTMap = absMTMap2;
                        z3 = z4;
                        builder = builder3;
                        i3 = i10;
                        dArr = dArr3;
                        builder3 = builder;
                        absMTMap2 = absMTMap;
                        z4 = z3;
                        i10 = i3;
                        i9 = 5;
                        r11 = 0;
                        c = 1;
                        a = dArr;
                    } else {
                        if (nVar == null || !(z4 || absMTMap2.t == null || absMTMap2.t.getLocationMarker() == null || absMTMap2.t.getLocationMarker().getMapElement() == null || !absMTMap2.t.getLocationMarker().getMapElement().equals(nVar))) {
                            builder2 = builder3;
                            i4 = i10;
                            dArr2 = dArr3;
                        } else {
                            LatLng position = nVar.getPosition();
                            builder3.include(position);
                            float anchorU = nVar.getAnchorU();
                            float anchorV = nVar.getAnchorV();
                            BitmapDescriptor icon = nVar.getIcon();
                            if (icon == null || (bitmap = icon.getBitmap()) == null) {
                                i5 = 0;
                                i6 = 0;
                            } else {
                                i5 = bitmap.getWidth();
                                i6 = bitmap.getHeight();
                            }
                            if (z2 && absMTMap2.mViewInfoWindow != null && nVar.isInfoWindowShown()) {
                                i7 = absMTMap2.mViewInfoWindow.getWidth();
                                i8 = absMTMap2.mViewInfoWindow.getHeight();
                            } else {
                                i7 = 0;
                                i8 = 0;
                            }
                            int i11 = i5 > i7 ? 0 : i7 - i5;
                            PointD a2 = e.b.a(position);
                            i4 = i10;
                            float f = i5;
                            float f2 = i11 / 2.0f;
                            dArr2 = dArr3;
                            float f3 = i6;
                            LatLng a3 = e.b.a(new PointD(a2.x + ((((1.0f - anchorU) * f) + f2) * dArr2[0]), a2.y - (((f3 * anchorV) + i8) * dArr2[1])));
                            LatLng a4 = e.b.a(new PointD(a2.x - (((f + f2) * anchorU) * dArr2[0]), a2.y + (f3 * (1.0f - anchorV) * dArr2[1])));
                            builder2 = builder3;
                            builder2.include(a3);
                            builder2.include(a4);
                        }
                        a = dArr2;
                        builder3 = builder2;
                        i10 = i4;
                        absMTMap2 = this;
                        z4 = z ? 1 : 0;
                        i9 = 5;
                        r11 = 0;
                        c = 1;
                    }
                } else {
                    dArr = a;
                    builder = builder3;
                    i3 = i10;
                    if (lVar instanceof r) {
                        a((r) lVar, builder, dArr);
                        a = dArr;
                        builder3 = builder;
                        absMTMap2 = this;
                        i10 = i3;
                        z4 = z ? 1 : 0;
                        i9 = 5;
                        r11 = 0;
                        c = 1;
                    } else {
                        absMTMap = this;
                        if (lVar instanceof com.sankuai.meituan.mapsdk.maps.interfaces.d) {
                            z3 = z ? 1 : 0;
                            absMTMap.a((com.sankuai.meituan.mapsdk.maps.interfaces.d) lVar, builder, dArr, z3);
                        } else {
                            z3 = z ? 1 : 0;
                            if (lVar instanceof h) {
                                absMTMap.a((h) lVar, builder, dArr);
                            } else if (lVar instanceof q) {
                                absMTMap.a((q) lVar, builder, dArr);
                            }
                        }
                        builder3 = builder;
                        absMTMap2 = absMTMap;
                        z4 = z3;
                        i10 = i3;
                        i9 = 5;
                        r11 = 0;
                        c = 1;
                        a = dArr;
                    }
                }
            }
            double[] dArr4 = a;
            AbsMTMap absMTMap3 = absMTMap2;
            boolean z5 = z4;
            LatLngBounds.Builder builder4 = builder3;
            int i12 = i10;
            if (z5) {
                absMTMap3.includeMyLocation(builder4, dArr4);
            }
            i10 = i12 + 1;
            builder3 = builder4;
            absMTMap2 = absMTMap3;
            z4 = z5;
            i9 = 5;
            r11 = 0;
            c = 1;
        }
        return builder3;
    }

    private void a(com.sankuai.meituan.mapsdk.maps.interfaces.d dVar, LatLngBounds.Builder builder, double[] dArr, boolean z) {
        Object[] objArr = {dVar, builder, dArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e792cdfe84266ee5f54e789784457dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e792cdfe84266ee5f54e789784457dd5");
        } else if (dVar != null) {
            if (z || this.t == null || this.t.getLocationCircle() == null || this.t.getLocationCircle().getMapElement() == null || !this.t.getLocationCircle().getMapElement().equals(dVar)) {
                LatLng center = dVar.getCenter();
                builder.include(center);
                double radius = dVar.getRadius();
                float circleStrokeWidth = getCircleStrokeWidth(dVar);
                List<LatLng> a = g.a(center, radius);
                if (a == null || a.isEmpty()) {
                    return;
                }
                for (LatLng latLng : a) {
                    builder.include(latLng);
                    double d = circleStrokeWidth;
                    LatLng latLng2 = new LatLng(latLng.latitude + (dArr[0] * d), latLng.longitude - (dArr[1] * d));
                    LatLng latLng3 = new LatLng(latLng.latitude - (dArr[0] * d), latLng.longitude + (d * dArr[1]));
                    builder.include(latLng2);
                    builder.include(latLng3);
                }
            }
        }
    }

    @Deprecated
    public float getCircleStrokeWidth(com.sankuai.meituan.mapsdk.maps.interfaces.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "140a240caa6d0f6facff3286c5013907", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "140a240caa6d0f6facff3286c5013907")).floatValue();
        }
        if (dVar == null) {
            return 0.0f;
        }
        return dVar.getStrokeWidth();
    }

    private void a(r rVar, LatLngBounds.Builder builder, double[] dArr) {
        Object[] objArr = {rVar, builder, dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4840d6f7e6a15cecc8894b3acb303fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4840d6f7e6a15cecc8894b3acb303fba");
        } else if (rVar == null) {
        } else {
            List<LatLng> points = rVar.getPoints();
            float width = rVar.getWidth();
            if (points == null || points.isEmpty()) {
                return;
            }
            Iterator<LatLng> it = points.iterator();
            while (it.hasNext()) {
                LatLng next = it.next();
                builder.include(next);
                PointD a = e.b.a(next);
                double d = width / 2.0f;
                Iterator<LatLng> it2 = it;
                LatLng a2 = e.b.a(new PointD(a.x + (dArr[0] * d), a.y - (dArr[1] * d)));
                LatLng a3 = e.b.a(new PointD(a.x - (dArr[0] * d), a.y + (d * dArr[1])));
                builder.include(a2);
                builder.include(a3);
                it = it2;
            }
        }
    }

    private void a(q qVar, LatLngBounds.Builder builder, double[] dArr) {
        Object[] objArr = {qVar, builder, dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53cc92868c9ae39826fa131652d6197b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53cc92868c9ae39826fa131652d6197b");
        } else if (qVar == null) {
        } else {
            List<LatLng> points = qVar.getPoints();
            float polygonStrokeWidth = getPolygonStrokeWidth(qVar);
            if (points == null || points.isEmpty()) {
                return;
            }
            Iterator<LatLng> it = points.iterator();
            while (it.hasNext()) {
                LatLng next = it.next();
                builder.include(next);
                PointD a = e.b.a(next);
                double d = polygonStrokeWidth / 2.0f;
                Iterator<LatLng> it2 = it;
                LatLng a2 = e.b.a(new PointD(a.x + (dArr[0] * d), a.y - (dArr[1] * d)));
                LatLng a3 = e.b.a(new PointD(a.x - (dArr[0] * d), a.y + (d * dArr[1])));
                builder.include(a2);
                builder.include(a3);
                it = it2;
            }
        }
    }

    @Deprecated
    public float getPolygonStrokeWidth(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9806ab5fa27be192dbb1d0de25c8bb0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9806ab5fa27be192dbb1d0de25c8bb0")).floatValue();
        }
        if (qVar == null) {
            return 0.0f;
        }
        return qVar.getStrokeWidth() / 2.0f;
    }

    private void a(h hVar, LatLngBounds.Builder builder, double[] dArr) {
        Object[] objArr = {hVar, builder, dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5d7569ebd5576aca4b9bd467bf32970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5d7569ebd5576aca4b9bd467bf32970");
        } else if (hVar != null) {
            List<LatLng> points = hVar.getPoints();
            int radius = hVar.getRadius();
            if (points == null || points.isEmpty()) {
                return;
            }
            for (Iterator<LatLng> it = points.iterator(); it.hasNext(); it = it) {
                LatLng next = it.next();
                builder.include(next);
                double d = radius;
                LatLng latLng = new LatLng(next.latitude + (dArr[0] * d), next.longitude - (dArr[1] * d));
                LatLng latLng2 = new LatLng(next.latitude - (dArr[0] * d), next.longitude + (d * dArr[1]));
                builder.include(latLng);
                builder.include(latLng2);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void fitElement(List<l> list, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1395f20ac518b8f3cf3d61a6050bb089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1395f20ac518b8f3cf3d61a6050bb089");
        } else {
            a(list, z, z2, z3, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMyLocationEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcb672d4b66f027d6152b48476b16180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcb672d4b66f027d6152b48476b16180");
        } else if (this.a) {
        } else {
            if (this.t == null) {
                this.t = new CustomMyLocation(this);
            }
            Context a = a.a();
            if (a == null && this.u != null) {
                a = this.u.getContext().getApplicationContext();
            }
            this.t.setEnable(z, a);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setLocationSource(y yVar) {
        Object[] objArr = {yVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30f1bb1ab45d455ea7d18c10d35daad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30f1bb1ab45d455ea7d18c10d35daad8");
        } else if (this.a) {
        } else {
            if (this.t == null) {
                this.t = new CustomMyLocation(this);
            }
            this.t.setLocationSource(yVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        Object[] objArr = {myLocationStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "649b7c788fb1a86209c1290ecabb362e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "649b7c788fb1a86209c1290ecabb362e");
        } else if (this.a || myLocationStyle == null) {
        } else {
            if (this.t == null) {
                this.t = new CustomMyLocation(this);
            }
            this.t.setStyle(myLocationStyle);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public MyLocationStyle getMyLocationStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a50bf79fbb827719375b7d3e808bc931", RobustBitConfig.DEFAULT_VALUE)) {
            return (MyLocationStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a50bf79fbb827719375b7d3e808bc931");
        }
        if (this.a || this.t == null) {
            return null;
        }
        return this.t.getStyle();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnLocationChangedListener(y.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdf4bc25b9d9ccc2b739a9d69b7b2b2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdf4bc25b9d9ccc2b739a9d69b7b2b2b");
        } else if (this.a) {
        } else {
            if (this.t == null) {
                this.t = new CustomMyLocation(this);
            }
            this.t.setLocationChangedListener(aVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Location getCurrentLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f064f213dfd8f2d0f5b2e6d8deee0f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f064f213dfd8f2d0f5b2e6d8deee0f8");
        }
        if (this.a || this.t == null) {
            return null;
        }
        return this.t.getCurrentLocation();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public MapLocation getCurrentMapLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ff0d1f67e3df4a907a1d13bbe4966be", RobustBitConfig.DEFAULT_VALUE)) {
            return (MapLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ff0d1f67e3df4a907a1d13bbe4966be");
        }
        if (this.a || this.t == null) {
            return null;
        }
        return this.t.getCurrentMapLocation();
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9176ffa90b440c7820ac96d5880cd68d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9176ffa90b440c7820ac96d5880cd68d");
            return;
        }
        this.a = true;
        if (this.t != null) {
            this.t.clearLocation();
            this.t = null;
        }
        this.u = null;
    }

    public void updateCameraChangedType(int i) {
        this.mCameraChangedType = i;
        if (this.mCameraChangedType == 2) {
            this.mCameraMapGestureType = CameraMapGestureType.NONE;
        }
    }

    public void setPlatform(Platform platform) {
        int i;
        Object[] objArr = {platform};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "733410ef954cf516581d13d15b7fa1e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "733410ef954cf516581d13d15b7fa1e0");
            return;
        }
        this.v = platform;
        if (platform == Platform.NATIVE) {
            i = 1;
        } else if (platform == Platform.MRN) {
            i = 2;
        } else if (platform == Platform.MMP) {
            i = 3;
        } else {
            i = platform == Platform.FLUTTER ? 4 : 0;
        }
        com.sankuai.meituan.mapsdk.mapcore.preference.a a = com.sankuai.meituan.mapsdk.mapcore.preference.a.a();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.mapcore.preference.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "07d56b2b1f007849626990c5f3c32912", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "07d56b2b1f007849626990c5f3c32912");
        } else {
            a.b.edit().putInt("platform", i).apply();
        }
    }

    public Platform getPlatform() {
        return this.v;
    }

    public void setIsTextureView(boolean z) {
        this.w = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean isMapDestroyed() {
        return this.a;
    }

    public void reportMapLoadTime(int i, Map<String, Object> map) {
        Object[] objArr = {Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57bb7beb80971c2e2b9f1aed8abf0f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57bb7beb80971c2e2b9f1aed8abf0f39");
        } else if (this.u == null || map == null || map.isEmpty()) {
        } else {
            Object obj = map.get("map_will_load");
            Object obj2 = map.get("map_finish_load");
            long longValue = obj instanceof Long ? ((Long) obj).longValue() : 0L;
            long longValue2 = obj2 instanceof Long ? ((Long) obj2).longValue() : 0L;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long[] timestamps = this.u.getTimestamps();
            if (timestamps[0] > 0) {
                long j = longValue > 0 ? longValue - timestamps[0] : -1L;
                long j2 = longValue2 > 0 ? longValue2 - timestamps[0] : -1L;
                long j3 = elapsedRealtime - timestamps[0];
                if (timestamps[1] > 0 && timestamps[2] > 0) {
                    long max = Math.max(timestamps[2] - timestamps[1], 0L);
                    if (timestamps[1] < longValue) {
                        j -= max;
                    }
                    if (timestamps[1] < longValue2) {
                        j2 -= max;
                    }
                    if (timestamps[1] < elapsedRealtime) {
                        j3 -= max;
                    }
                }
                map.put("map_will_load", Long.valueOf(j));
                map.put("map_finish_load", Long.valueOf(j2));
                map.put("map_style_finish_load", Long.valueOf(j3));
                f.a(this.u.getContext(), getClass(), "reportMapLoadTime", i, this.v, (int) MapConstant.LayerPropertyFlag_HeatmapRadius, this.u.getMapKey(), map);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean checkLatLng(Class<?> cls, String str, int i, LatLng latLng, String str2) {
        boolean z;
        Object[] objArr = {cls, str, Integer.valueOf(i), latLng, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e69a0a55588eaa77cdb1c36d508c9b66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e69a0a55588eaa77cdb1c36d508c9b66")).booleanValue();
        }
        Object[] objArr2 = {latLng};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.mapcore.utils.h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "3757854549f0718abd55ba8fd9e8064a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "3757854549f0718abd55ba8fd9e8064a")).booleanValue();
        } else {
            z = latLng != null && (Math.abs(latLng.latitude) == 0.0d || Math.abs(latLng.longitude) == 0.0d);
        }
        if (!z || this.u == null) {
            return false;
        }
        f.a(this.u.getContext(), this.u.getMapType(), this.u.getMapKey(), cls, str, i, str2, "MTMapAndroidInteractiveExceptionStatus", 1.0f);
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void changeTilt(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59c8533f410251741560bd17903a7644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59c8533f410251741560bd17903a7644");
        } else if (getCameraPosition() == null) {
        } else {
            moveCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().tilt(f).build()));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setLocationMarkerIcon(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a2e376ccbd532b5f53e1e382931bb29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a2e376ccbd532b5f53e1e382931bb29");
        } else if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null) {
        } else {
            setMyLocationStyle(new MyLocationStyle().myLocationIcon(BitmapDescriptorFactory.fromBitmap(bitmapDescriptor.getBitmap())));
        }
    }

    @Deprecated
    public boolean isIsTextureView() {
        return this.w;
    }
}
