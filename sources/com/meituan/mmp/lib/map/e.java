package com.meituan.mmp.lib.map;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.map.j;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.lib.utils.u;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.msi.privacy.permission.a;
import com.meituan.msi.provider.c;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.AbstractMapView;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.MapRenderLayer;
import com.sankuai.meituan.mapsdk.maps.TextureMapView;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import com.sankuai.meituan.mapsdk.maps.interfaces.z;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.MapPoi;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
import com.sankuai.meituan.mapsdk.maps.model.Polygon;
import com.sankuai.meituan.mapsdk.maps.model.Polyline;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e extends FrameLayout implements com.meituan.mmp.lib.embeddedwidget.d, com.meituan.msi.view.e {
    public static ChangeQuickRedirect a;
    private String A;
    private final Handler B;
    private final Runnable C;
    private c.a D;
    private int E;
    private Runnable F;
    boolean b;
    com.meituan.mmp.lib.config.a c;
    MTMap d;
    int e;
    int f;
    public volatile boolean g;
    com.meituan.mmp.lib.embeddedwidget.i h;
    public boolean i;
    public b j;
    public List<WeakReference<BitmapDescriptor>> k;
    @Nullable
    private com.meituan.mmp.lib.a l;
    private c m;
    private boolean n;
    private CameraPosition o;
    private final SparseArray<f> p;
    private final SparseArray<Polyline> q;
    private final SparseArray<Circle> r;
    private final SparseArray<Polygon> s;
    private com.meituan.msi.api.location.a t;
    private u u;
    private AbstractMapView v;
    private Surface w;
    private com.meituan.mmp.lib.interfaces.c x;
    private BitmapDescriptor y;
    private String z;

    @Override // com.meituan.mmp.lib.embeddedwidget.d
    public final void b(boolean z) {
    }

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        return false;
    }

    public static /* synthetic */ void a(e eVar, f fVar, JSONObject jSONObject) {
        Object[] objArr = {fVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "f6a1e16c79da802303f29518c640133e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "f6a1e16c79da802303f29518c640133e");
        } else if (jSONObject.has("customCallout")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("customCallout");
            eVar.a(fVar, optJSONObject);
            eVar.a(fVar, jSONObject, optJSONObject);
        } else if (jSONObject.has("callout")) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("callout");
            eVar.a(fVar, optJSONObject2);
            eVar.a(fVar, jSONObject, optJSONObject2);
        } else {
            fVar.d();
        }
    }

    public static /* synthetic */ void a(e eVar, JSONObject jSONObject, boolean z, final String str, final int i, e eVar2, final com.meituan.mmp.lib.widget.f fVar) {
        boolean z2;
        char c;
        e eVar3;
        int i2;
        int i3;
        com.meituan.msi.api.location.a aVar;
        e eVar4;
        boolean z3;
        int i4;
        int i5;
        JSONArray jSONArray;
        e eVar5;
        CameraUpdate newLatLng;
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), eVar2, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "24af7b2085503fffbc0f517ca0ad8236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "24af7b2085503fffbc0f517ca0ad8236");
            return;
        }
        eVar.E = i;
        com.meituan.mmp.lib.trace.b.a("updateMapParamsInner", Boolean.valueOf(z), jSONObject);
        MTMap map = eVar.getMap();
        if (jSONObject.has("enable3D")) {
            map.show3dBuilding(jSONObject.optBoolean("enable3D", false));
        }
        if (jSONObject.has("theme")) {
            map.setHandDrawMapEnable(jSONObject.optString("theme", "normal").equals("handDraw"));
        }
        if (jSONObject.has("enableTraffic")) {
            map.setTrafficEnabled(jSONObject.optBoolean("enableTraffic", false));
        }
        if (jSONObject.has("enableZoom")) {
            z2 = true;
            map.getUiSettings().setZoomGesturesEnabled(jSONObject.optBoolean("enableZoom", true));
        } else {
            z2 = true;
        }
        if (jSONObject.has("enableScroll")) {
            map.getUiSettings().setScrollGesturesEnabled(jSONObject.optBoolean("enableScroll", z2));
        }
        if (jSONObject.has("enableRotate")) {
            map.getUiSettings().setRotateGesturesEnabled(jSONObject.optBoolean("enableRotate", false));
        }
        if (jSONObject.has("showCompass")) {
            map.getUiSettings().setCompassEnabled(jSONObject.optBoolean("showCompass", false));
        }
        if (jSONObject.has("enableOverlooking")) {
            map.getUiSettings().setTiltGesturesEnabled(jSONObject.optBoolean("enableOverlooking", false));
        }
        if (jSONObject.has("enableSatellite")) {
            if (jSONObject.optBoolean("enableSatellite", false)) {
                map.setMapType(2);
            } else {
                map.setMapType(1);
            }
        }
        if (z) {
            if (jSONObject.has("scale")) {
                map.animateCamera(CameraUpdateFactory.zoomTo((float) jSONObject.optDouble("scale", 0.0d)), 300L, null);
            }
            if (jSONObject.has(AnimationViewCommandModel.Rotation)) {
                float optDouble = (float) jSONObject.optDouble(AnimationViewCommandModel.Rotation, 0.0d);
                Object[] objArr2 = {Float.valueOf(optDouble)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, eVar2, changeQuickRedirect2, false, "0a926ea1a9049dae55397f9b40b838e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar2, changeQuickRedirect2, false, "0a926ea1a9049dae55397f9b40b838e9");
                } else {
                    MTMap map2 = eVar2.getMap();
                    if (map2 != null && eVar2.o != null) {
                        map2.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(eVar2.o.target, eVar2.o.zoom, eVar2.o.tilt, optDouble)));
                    }
                }
            }
            if (jSONObject.has("skew")) {
                eVar2.setSkew((float) jSONObject.optDouble("skew", 0.0d));
            }
            eVar3 = eVar2;
            i2 = 3;
        } else {
            Object[] objArr3 = {str, Integer.valueOf(i), eVar2, map, fVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "cb311133d60586675665532bf54b14e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "cb311133d60586675665532bf54b14e0");
                c = 3;
            } else {
                eVar2.setUpRegionChangeListener(new j() { // from class: com.meituan.mmp.lib.map.e.11
                    public static ChangeQuickRedirect a;
                    public float c;
                    public AtomicBoolean b = new AtomicBoolean(false);
                    public JSONObject d = new JSONObject();

                    @Override // com.meituan.mmp.lib.map.j
                    public final void a(j.a aVar2, boolean z4) {
                        Object[] objArr4 = {aVar2, Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e4222dd88b61e0cdd7d4d0501fd3fecb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e4222dd88b61e0cdd7d4d0501fd3fecb");
                        } else if (this.b.compareAndSet(false, true)) {
                            try {
                                this.d.remove("mapId");
                                this.d.put("mapId", str);
                                this.d.remove("type");
                                this.d.put("type", "begin");
                                if (z4) {
                                    this.d.put("causedBy", "gesture");
                                } else {
                                    this.d.put("causedBy", "update");
                                }
                                this.d.remove(AnimationViewCommandModel.Rotation);
                                this.d.remove("skew");
                            } catch (JSONException e) {
                                com.meituan.mmp.lib.trace.b.a(e);
                            }
                            this.c = aVar2.d;
                            e.this.getOnEventListener().a("onMapRegionChange", this.d, i);
                        }
                    }

                    @Override // com.meituan.mmp.lib.map.j
                    public final void b(j.a aVar2, boolean z4) {
                        Object[] objArr4 = {aVar2, Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ae8bb8503298a0bb6f5563180a4a4b74", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ae8bb8503298a0bb6f5563180a4a4b74");
                        } else if (this.b.compareAndSet(true, false)) {
                            try {
                                this.d.remove("mapId");
                                this.d.put("mapId", str);
                                this.d.remove("type");
                                this.d.put("type", "end");
                                this.d.remove("causedBy");
                                if (!z4) {
                                    this.d.put("causedBy", "update");
                                } else if (aVar2.d != this.c) {
                                    this.d.put("causedBy", "scale");
                                } else {
                                    this.d.put("causedBy", "drag");
                                }
                                this.d.remove(AnimationViewCommandModel.Rotation);
                                this.d.put(AnimationViewCommandModel.Rotation, aVar2.b);
                                this.d.remove("skew");
                                this.d.put("skew", aVar2.c);
                            } catch (JSONException e) {
                                com.meituan.mmp.lib.trace.b.a(e);
                            }
                            e.this.getOnEventListener().a("onMapRegionChange", this.d, i);
                        }
                    }
                });
                map.setOnMapLoadedListener(new MTMap.OnMapLoadedListener() { // from class: com.meituan.mmp.lib.map.e.12
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapLoadedListener
                    public final void onMapLoaded() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0fd543090a05bd51d9d3726283a9f137", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0fd543090a05bd51d9d3726283a9f137");
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("mapId", str);
                        } catch (JSONException unused) {
                        }
                        e.this.getOnEventListener().a("onMapLoaded", jSONObject2, i);
                    }
                });
                map.setOnMapClickListener(new MTMap.OnMapClickListener() { // from class: com.meituan.mmp.lib.map.e.13
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapClickListener
                    public final void onMapClick(LatLng latLng) {
                        Object[] objArr4 = {latLng};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "069206dc516b22778207f660a407001a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "069206dc516b22778207f660a407001a");
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("mapId", str);
                            jSONObject2.put(Constants.PRIVACY.KEY_LATITUDE, latLng.latitude);
                            jSONObject2.put(Constants.PRIVACY.KEY_LONGITUDE, latLng.longitude);
                        } catch (JSONException unused) {
                        }
                        SparseArray<f> markers = e.this.getMarkers();
                        for (int i6 = 0; i6 < markers.size(); i6++) {
                            f fVar2 = markers.get(i6);
                            if (fVar2 != null && TextUtils.equals(fVar2.b, "BYCLICK")) {
                                fVar2.d();
                            }
                        }
                        e.this.getOnEventListener().a("onMapClick", jSONObject2, i);
                    }
                });
                map.setOnMapPoiClickListener(new MTMap.OnMapPoiClickListener() { // from class: com.meituan.mmp.lib.map.e.14
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapPoiClickListener
                    public final void onMapPoiClick(MapPoi mapPoi) {
                        JSONObject jSONObject2;
                        Object[] objArr4 = {mapPoi};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4dea59e533b104453b8383cb5861e1ba", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4dea59e533b104453b8383cb5861e1ba");
                            return;
                        }
                        try {
                            jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("name", mapPoi.getName());
                                jSONObject2.put(Constants.PRIVACY.KEY_LATITUDE, mapPoi.getPosition().latitude);
                                jSONObject2.put(Constants.PRIVACY.KEY_LONGITUDE, mapPoi.getPosition().longitude);
                                jSONObject2.put("mapId", str);
                            } catch (JSONException e) {
                                e = e;
                                e.printStackTrace();
                                e.this.getOnEventListener().a("onMapPoiClick", jSONObject2, i);
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            jSONObject2 = null;
                        }
                        e.this.getOnEventListener().a("onMapPoiClick", jSONObject2, i);
                    }
                });
                map.setOnMarkerClickListener(new MTMap.OnMarkerClickListener() { // from class: com.meituan.mmp.lib.map.e.15
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean onMarkerClick(com.sankuai.meituan.mapsdk.maps.model.Marker r13) {
                        /*
                            r12 = this;
                            r0 = 1
                            java.lang.Object[] r8 = new java.lang.Object[r0]
                            r9 = 0
                            r8[r9] = r13
                            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.map.e.AnonymousClass15.a
                            java.lang.String r11 = "d490eccdd4ae2bfc759c1938d9328f7e"
                            r4 = 0
                            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r1 = r8
                            r2 = r12
                            r3 = r10
                            r5 = r11
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            if (r1 == 0) goto L22
                            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                            java.lang.Boolean r13 = (java.lang.Boolean) r13
                            boolean r13 = r13.booleanValue()
                            return r13
                        L22:
                            if (r13 == 0) goto L93
                            java.lang.Object r1 = r13.getObject()
                            if (r1 != 0) goto L2b
                            goto L93
                        L2b:
                            float r1 = r13.getZIndex()
                            r2 = 1065353216(0x3f800000, float:1.0)
                            float r1 = r1 + r2
                            r13.setZIndex(r1)
                            r1 = 0
                            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4e
                            java.lang.Object r13 = r13.getObject()     // Catch: org.json.JSONException -> L4e
                            java.lang.String r13 = r13.toString()     // Catch: org.json.JSONException -> L4e
                            r2.<init>(r13)     // Catch: org.json.JSONException -> L4e
                            java.lang.String r13 = "mapId"
                            java.lang.String r1 = r2     // Catch: org.json.JSONException -> L4c
                            r2.put(r13, r1)     // Catch: org.json.JSONException -> L4c
                            goto L53
                        L4c:
                            r13 = move-exception
                            goto L50
                        L4e:
                            r13 = move-exception
                            r2 = r1
                        L50:
                            r13.printStackTrace()
                        L53:
                            r13 = -1
                            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                            if (r2 == 0) goto L65
                            java.lang.String r13 = "id"
                            int r13 = r2.optInt(r13)
                            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                        L65:
                            com.meituan.mmp.lib.map.e r1 = com.meituan.mmp.lib.map.e.this
                            android.util.SparseArray r1 = r1.getMarkers()
                            int r13 = r13.intValue()
                            java.lang.Object r13 = r1.get(r13)
                            com.meituan.mmp.lib.map.f r13 = (com.meituan.mmp.lib.map.f) r13
                            if (r13 == 0) goto L84
                            java.lang.String r1 = r13.b
                            java.lang.String r3 = "BYCLICK"
                            boolean r1 = android.text.TextUtils.equals(r1, r3)
                            if (r1 == 0) goto L84
                            r13.c()
                        L84:
                            com.meituan.mmp.lib.map.e r13 = com.meituan.mmp.lib.map.e.this
                            com.meituan.mmp.lib.interfaces.c r13 = r13.getOnEventListener()
                            java.lang.String r1 = "onMapMarkerClick"
                            int r3 = r3
                            r13.a(r1, r2, r3)
                            return r0
                        L93:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.map.e.AnonymousClass15.onMarkerClick(com.sankuai.meituan.mapsdk.maps.model.Marker):boolean");
                    }
                });
                Object[] objArr4 = {map, str, Integer.valueOf(i), fVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                c = 3;
                if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "e7b3968c8acba328ac3b149ad4d29e92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "e7b3968c8acba328ac3b149ad4d29e92");
                } else {
                    MTMap mTMap = map;
                    mTMap.enableMultipleInfowindow(true);
                    mTMap.setInfoWindowAdapter(new MTMap.InfoWindowAdapter() { // from class: com.meituan.mmp.lib.map.e.16
                        public static ChangeQuickRedirect a;
                        public final h b = new h();

                        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
                        public final View getInfoContents(Marker marker) {
                            return null;
                        }

                        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
                        public final View getInfoWindow(Marker marker) {
                            Object[] objArr5 = {marker};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8cac873fceeee061f0446706b8f8bc73", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8cac873fceeee061f0446706b8f8bc73") : this.b.a(e.this.getContext(), marker, fVar);
                        }
                    });
                    mTMap.setOnInfoWindowClickListener(new MTMap.OnInfoWindowClickListener() { // from class: com.meituan.mmp.lib.map.e.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnInfoWindowClickListener
                        public final void onInfoWindowClickLocation(int i6, int i7, int i8, int i9) {
                        }

                        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnInfoWindowClickListener
                        public final void onInfoWindowClick(Marker marker) {
                            JSONObject jSONObject2;
                            Object[] objArr5 = {marker};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "546e70694ab32a49a644381c838dfcea", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "546e70694ab32a49a644381c838dfcea");
                            } else if (marker.getObject() == null) {
                            } else {
                                try {
                                    jSONObject2 = new JSONObject(marker.getObject().toString());
                                    try {
                                        jSONObject2.put("mapId", str);
                                    } catch (JSONException e) {
                                        e = e;
                                        e.printStackTrace();
                                        e.this.getOnEventListener().a("onMapCalloutTap", jSONObject2, i);
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                    jSONObject2 = null;
                                }
                                e.this.getOnEventListener().a("onMapCalloutTap", jSONObject2, i);
                            }
                        }
                    });
                }
            }
            float optDouble2 = (float) jSONObject.optDouble("centerLatitude", 0.0d);
            float optDouble3 = (float) jSONObject.optDouble("centerLongitude", 0.0d);
            float optInt = jSONObject.optInt("scale", 16);
            float optInt2 = jSONObject.optInt(AnimationViewCommandModel.Rotation, 0);
            float optInt3 = jSONObject.optInt("skew", 0);
            Object[] objArr5 = new Object[5];
            objArr5[0] = Float.valueOf(optDouble2);
            objArr5[1] = Float.valueOf(optDouble3);
            objArr5[2] = Float.valueOf(optInt);
            objArr5[c] = Float.valueOf(optInt2);
            objArr5[4] = Float.valueOf(optInt3);
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, eVar2, changeQuickRedirect5, false, "e4d672943ad93664ae5cbb462836e51a", RobustBitConfig.DEFAULT_VALUE)) {
                eVar3 = eVar2;
                i2 = 3;
                PatchProxy.accessDispatch(objArr5, eVar3, changeQuickRedirect5, false, "e4d672943ad93664ae5cbb462836e51a");
            } else {
                eVar3 = eVar2;
                i2 = 3;
                MTMap map3 = eVar2.getMap();
                if (map3 != null) {
                    map3.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(new LatLng(optDouble2, optDouble3), optInt, optInt2, optInt3)));
                }
            }
        }
        if (jSONObject.has("centerLatitude")) {
            double optDouble4 = jSONObject.optDouble("centerLatitude", 0.0d);
            double optDouble5 = jSONObject.optDouble("centerLongitude", 0.0d);
            if (g.a(optDouble4, optDouble5)) {
                LatLng latLng = new LatLng(optDouble4, optDouble5);
                if (jSONObject.has("scale")) {
                    newLatLng = CameraUpdateFactory.newLatLngZoom(latLng, jSONObject.optInt("scale", 14));
                } else {
                    newLatLng = CameraUpdateFactory.newLatLng(latLng);
                }
                map.moveCamera(newLatLng);
            }
        }
        if (jSONObject.has("markers")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("markers");
            SparseArray<f> markers = eVar2.getMarkers();
            synchronized (markers) {
                int i6 = 0;
                while (i6 < optJSONArray.length()) {
                    try {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                        Object[] objArr6 = new Object[i2];
                        objArr6[0] = eVar3;
                        objArr6[1] = jSONObject2;
                        objArr6[2] = markers;
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        jSONArray = optJSONArray;
                        eVar5 = eVar3;
                        if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "3b0e6240861915cb842484e313626b28", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "3b0e6240861915cb842484e313626b28");
                        } else {
                            eVar.a(eVar5, jSONObject2, markers, null);
                        }
                    } catch (JSONException unused) {
                        jSONArray = optJSONArray;
                        eVar5 = eVar3;
                    }
                    i6++;
                    eVar3 = eVar5;
                    optJSONArray = jSONArray;
                    i2 = 3;
                }
                i3 = 3;
                aVar = null;
                eVar4 = eVar;
            }
        } else {
            i3 = 3;
            aVar = null;
            eVar4 = eVar;
        }
        MTMap map4 = eVar.getMap();
        Object[] objArr7 = new Object[i3];
        objArr7[0] = jSONObject;
        objArr7[1] = eVar4;
        objArr7[2] = map4;
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "e56a5c2cdeb14fceda0e753e966ae27a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, eVar4, changeQuickRedirect7, false, "e56a5c2cdeb14fceda0e753e966ae27a");
            return;
        }
        UiSettings uiSettings = map4.getUiSettings();
        if (uiSettings != null) {
            uiSettings.setZoomControlsEnabled(false);
            if (jSONObject.has("scaleOffsetX")) {
                i4 = jSONObject.optInt("scaleOffsetX", 0);
                z3 = true;
            } else {
                z3 = false;
                i4 = 0;
            }
            if (jSONObject.has("scaleOffsetY")) {
                i5 = 0 - jSONObject.optInt("scaleOffsetY", 0);
                z3 = true;
            } else {
                i5 = 0;
            }
            if (z3) {
                int d = p.d(i4);
                int d2 = p.d(i5);
                com.meituan.mmp.lib.trace.b.b("MMPMap", "the offsetX: " + d + " the offsetY:" + d2);
                uiSettings.setScaleViewPositionWithMargin(0, 0, d2, d, 0);
            }
        }
        if (jSONObject.has("showLocation")) {
            if (jSONObject.optBoolean("showLocation", false)) {
                eVar4.g = true;
                eVar.g();
                map4.setMyLocationStyle(eVar.getLocationStyle());
                if (!jSONObject.optBoolean("showAccuracy", true)) {
                    map4.setMyLocationStyle(eVar.getLocationStyle().circleShow(false));
                }
                map4.setMyLocationEnabled(true);
                return;
            }
            eVar4.g = false;
            eVar.i();
            map4.setMyLocationEnabled(false);
            eVar4.t = aVar;
        }
    }

    public static /* synthetic */ boolean a(e eVar, int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "7edeae080530be7f5a13c7d1bbcdb476", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "7edeae080530be7f5a13c7d1bbcdb476")).booleanValue();
        }
        if (iArr != null && iArr.length != 0) {
            for (int i : iArr) {
                if (i == -10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.c
    public void setMPWidget(com.meituan.mmp.lib.embeddedwidget.i iVar) {
        this.h = iVar;
    }

    public com.meituan.mmp.lib.embeddedwidget.i getMPWidget() {
        return this.h;
    }

    public void setToken(String str) {
        this.A = str;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.c
    public final void a(boolean z) {
        AbstractMapView mapRenderLayer;
        int i = 1;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8fb432017d8d91ffcfcd68d322d1d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8fb432017d8d91ffcfcd68d322d1d9c");
            return;
        }
        this.b = !z ? 1 : 0;
        if ((!UserCenter.OAUTH_TYPE_QQ.equals(this.z) || !g.c()) && (this.b || !com.meituan.mmp.lib.config.b.D())) {
            i = g.a();
        }
        if (this.b) {
            mapRenderLayer = new TextureMapView(getContext(), i, g.b, "70719c38-06c7-43fc-ac9e-9cf97f9ebb98");
        } else {
            mapRenderLayer = new MapRenderLayer(getContext(), i, g.b, "70719c38-06c7-43fc-ac9e-9cf97f9ebb98");
        }
        this.v = mapRenderLayer;
        MapViewOptions mapViewOptions = new MapViewOptions();
        mapViewOptions.setZoomMode(ac.TENCENT);
        this.v.setMapViewOptions(mapViewOptions);
        if (this.b) {
            addView(this.v, new FrameLayout.LayoutParams(-1, -1));
        }
        if (e()) {
            f();
        }
    }

    public final SparseArray<Circle> getCircles() {
        return this.r;
    }

    public final SparseArray<f> getMarkers() {
        return this.p;
    }

    public final SparseArray<Polygon> getPolygons() {
        return this.s;
    }

    public SparseArray<Polyline> getPolylines() {
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db58c8a006c8638676b9ee87c63bb45f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db58c8a006c8638676b9ee87c63bb45f");
        } else {
            super.onAttachedToWindow();
        }
    }

    public final void a(final JSONObject jSONObject, final boolean z, final String str, final int i, final e eVar, final com.meituan.mmp.lib.widget.f fVar) {
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), eVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "301fee1cff730b4bae03379b772df9ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "301fee1cff730b4bae03379b772df9ff");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.meituan.mmp.lib.map.e.10
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "996152f55d9bb1aa7b0473cfe3293c65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "996152f55d9bb1aa7b0473cfe3293c65");
                } else {
                    e.a(e.this, jSONObject, z, str, i, eVar, fVar);
                }
            }
        };
        if (e()) {
            runnable.run();
        } else {
            this.F = runnable;
        }
    }

    private boolean e() {
        return this.b || this.w != null;
    }

    public MyLocationStyle getLocationStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28cfbcfa6982b2bc194bec19aa607666", RobustBitConfig.DEFAULT_VALUE)) {
            return (MyLocationStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28cfbcfa6982b2bc194bec19aa607666");
        }
        MyLocationStyle myLocationStyle = new MyLocationStyle();
        myLocationStyle.strokeWidth(0.0f);
        myLocationStyle.radiusFillColor(0);
        myLocationStyle.strokeColor(0);
        myLocationStyle.myLocationType(1);
        myLocationStyle.myLocationIcon(BitmapDescriptorFactory.fromResource(R.drawable.mmp_map_loc));
        return myLocationStyle;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a124069088b4a167d970c9eda3cae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a124069088b4a167d970c9eda3cae4");
        } else if (this.i) {
        } else {
            com.meituan.mmp.lib.trace.b.b("MMPMapView", "initApiViewInPage");
            this.i = true;
            this.v.onCreate(null);
            this.d = this.v.getMap();
            this.v.onResume();
            if (this.F != null) {
                this.F.run();
                this.F = null;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99da9415b13f77b3c6dfdb379e2109c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99da9415b13f77b3c6dfdb379e2109c3");
            return;
        }
        this.u.a();
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7477b3ba05e0633f59f5628ac1d42c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7477b3ba05e0633f59f5628ac1d42c34");
            return;
        }
        com.meituan.mmp.lib.trace.b.c("MMPMapView onDetachedFromWindow");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        try {
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0ab9b2ee2333b3ee9b514e36eaf6298", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0ab9b2ee2333b3ee9b514e36eaf6298");
            } else {
                try {
                    this.v.onPause();
                    this.v.onStop();
                } catch (Exception e) {
                    com.meituan.mmp.lib.trace.b.a(e);
                }
                try {
                    d();
                } catch (Exception unused) {
                }
            }
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            try {
                d();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.d
    public void setSurface(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d7d84d3e9687970174fd2203e1bac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d7d84d3e9687970174fd2203e1bac1");
        } else if (this.w == surface) {
        } else {
            this.w = surface;
            if (this.i) {
                ((MapRenderLayer) this.v).onSurfaceChanged(surface, this.e, this.f);
            } else {
                MapViewOptions mapViewOptions = new MapViewOptions();
                mapViewOptions.setExtSurface(surface, this.e, this.f);
                this.v.setMapViewOptions(mapViewOptions);
            }
            f();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e9cf7b85fc2d5f0b642e1cb3cc42aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e9cf7b85fc2d5f0b642e1cb3cc42aa");
            return;
        }
        synchronized (this) {
            a(this.A, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, new a.InterfaceC0498a() { // from class: com.meituan.mmp.lib.map.e.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                public final void onResult(String str, String[] strArr, int[] iArr, String str2) {
                    Object[] objArr2 = {str, strArr, iArr, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9deec438f352580f165649272dd1d92f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9deec438f352580f165649272dd1d92f");
                    } else if (com.meituan.msi.privacy.permission.a.a(iArr)) {
                        if (e.this.m != null) {
                            return;
                        }
                        e.this.a(c.a.instant_forground, e.this.j);
                    } else if (e.a(e.this, iArr)) {
                        com.meituan.mmp.lib.trace.b.b("MMPMapView", "user refused sys permission");
                    } else {
                        com.meituan.mmp.lib.trace.b.d("MMPMapView", "startLocation no permission:Locate.continuous");
                        e.this.a(e.this.A, "Locate.once", new a.InterfaceC0498a() { // from class: com.meituan.mmp.lib.map.e.4.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                            public final void onResult(String str3, String[] strArr2, int[] iArr2, String str4) {
                                Object[] objArr3 = {str3, strArr2, iArr2, str4};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fcc68da4db0f860554c0c16f8721ca0d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fcc68da4db0f860554c0c16f8721ca0d");
                                } else if (!com.meituan.msi.privacy.permission.a.a(iArr2)) {
                                    com.meituan.mmp.lib.trace.b.d("MMPMapView", "startLocation no permission:Locate.once");
                                    e.this.getOnEventListener().a("onMapError", e.this.a(10003, "Locate permission check failed"), e.this.E);
                                } else {
                                    e.this.a(c.a.normal, e.this.j);
                                    e.this.h();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8857af6811874f5f12ac1c26f1e9bc11", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8857af6811874f5f12ac1c26f1e9bc11");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("errMsg", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9a91183d717930a06ab7f31480e8ea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9a91183d717930a06ab7f31480e8ea4");
        } else {
            this.B.post(this.C);
        }
    }

    public final void a(String str, @NonNull String str2, @NonNull a.InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {str, str2, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27af0deab2c9d9d495dea1de5d4e3e59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27af0deab2c9d9d495dea1de5d4e3e59");
        } else if (this.l == null) {
            interfaceC0498a.onResult(str, new String[]{str2}, null, "containerController is null");
        } else if (com.meituan.msi.privacy.permission.a.a(this.l.f, str2, str)) {
            interfaceC0498a.onResult(str, new String[]{str2}, new int[]{2}, null);
        } else {
            this.l.a(new String[]{str2}, this.A, interfaceC0498a);
        }
    }

    public final void a(c.a aVar, b bVar) {
        com.meituan.msi.provider.c cVar;
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de84b2e5558ff30a98717d9d79665f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de84b2e5558ff30a98717d9d79665f2");
        } else if (this.l == null) {
            com.meituan.mmp.lib.trace.b.d("MMPMapView", "containerController is null");
        } else {
            Activity activity = this.l.f;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4549de38ab0dbdce8555b83cb74f6c6f", RobustBitConfig.DEFAULT_VALUE)) {
                cVar = (com.meituan.msi.provider.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4549de38ab0dbdce8555b83cb74f6c6f");
            } else {
                cVar = new com.meituan.msi.provider.c();
                cVar.b = this.A;
                cVar.a = aVar;
                cVar.d = c.b.map;
            }
            this.m = com.meituan.mmp.lib.api.location.a.a(activity, cVar);
            if (this.m != null) {
                this.D = aVar;
                this.m.a(bVar, "wgs84");
                if (a.a(this.A) != null) {
                    a.a(this.A).a();
                    return;
                } else {
                    com.meituan.mmp.lib.trace.b.d("MMPMapView", "GearsHeadingForceAppender is null");
                    return;
                }
            }
            bVar.a(7, null, "locationLoader is null");
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7eb948312f48810f68364e6f08e3642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7eb948312f48810f68364e6f08e3642");
            return;
        }
        synchronized (this) {
            if (this.m != null) {
                this.m.a();
                if (a.a(this.A) != null) {
                    a.a(this.A).c();
                }
                this.m = null;
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd6c5648ecf0150883d6b6e86a99f8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd6c5648ecf0150883d6b6e86a99f8d");
            return;
        }
        j();
        i();
        MTMap map = getMap();
        k();
        if (map != null) {
            map.setOnMapClickListener(null);
            map.setOnMapLoadedListener(null);
            map.setOnMapLongClickListener(null);
            map.setOnPolylineClickListener(null);
            map.setOnLocationChangedListener(null);
            map.setOnMarkerClickListener(null);
            map.setOnMarkerDragListener(null);
            map.setOnInfoWindowClickListener(null);
            map.setOnCameraChangeListener(null);
            map.setOnMapPoiClickListener(null);
            map.setLocationSource(null);
            map.clear();
        }
        this.v.onDestroy();
        this.l = null;
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7110acc7925412aa4f73c678eb9481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7110acc7925412aa4f73c678eb9481");
        } else {
            this.B.removeCallbacks(this.C);
        }
    }

    public MTMap getMap() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View, com.meituan.mmp.lib.embeddedwidget.d
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e039b4bf3b13307ee7ad439455a455", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e039b4bf3b13307ee7ad439455a455")).booleanValue();
        }
        if (this.b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return this.v.dispatchTouchEvent(motionEvent);
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.d
    public final void a() {
        this.w = null;
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "255de664c44a5ba5fc5ac37b2d186c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "255de664c44a5ba5fc5ac37b2d186c28");
            return;
        }
        this.r.clear();
        this.p.clear();
        this.s.clear();
        this.q.clear();
    }

    public final void setUpRegionChangeListener(@NonNull final j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81068f7001622a0083928a9ac70a4c73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81068f7001622a0083928a9ac70a4c73");
            return;
        }
        getMap().addMapGestureListener(new z() { // from class: com.meituan.mmp.lib.map.e.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
            public final void a() {
            }

            @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
            public final boolean a(float f, float f2) {
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
            public final boolean b(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20e12caa902d05855e37bf2a1a746fe1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20e12caa902d05855e37bf2a1a746fe1")).booleanValue();
                }
                e.this.n = true;
                return false;
            }
        });
        getMap().setOnCameraChangeListener(new MTMap.OnCameraChangeListener() { // from class: com.meituan.mmp.lib.map.e.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
            public final void onCameraChange(CameraPosition cameraPosition) {
                Object[] objArr2 = {cameraPosition};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91662825fb95f2ae0179fb6b7c4d7207", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91662825fb95f2ae0179fb6b7c4d7207");
                    return;
                }
                j.a aVar = new j.a();
                aVar.a = new LatLng(cameraPosition.target.latitude, cameraPosition.target.longitude);
                aVar.d = cameraPosition.zoom;
                aVar.b = cameraPosition.bearing;
                aVar.c = cameraPosition.tilt;
                jVar.a(aVar, e.this.n);
            }

            @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
            public final void onCameraChangeFinish(CameraPosition cameraPosition) {
                Object[] objArr2 = {cameraPosition};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24c6dd6a97f92b23aaf23854c248587c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24c6dd6a97f92b23aaf23854c248587c");
                    return;
                }
                e.this.o = cameraPosition;
                j.a aVar = new j.a();
                aVar.a = new LatLng(cameraPosition.target.latitude, cameraPosition.target.longitude);
                aVar.d = cameraPosition.zoom;
                aVar.b = cameraPosition.bearing;
                aVar.c = cameraPosition.tilt;
                jVar.b(aVar, e.this.n);
                e.this.n = false;
            }
        });
    }

    public final void setSkew(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25727ddd36ac82a9d66edf302c8d916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25727ddd36ac82a9d66edf302c8d916");
            return;
        }
        MTMap map = getMap();
        if (map == null || this.o == null) {
            return;
        }
        map.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(this.o.target, this.o.zoom, f, this.o.bearing)));
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.d
    public final void a(Surface surface, int i, int i2) {
        Object[] objArr = {surface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "facdbfd202b9bf6de95ce3b96e268d8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "facdbfd202b9bf6de95ce3b96e268d8c");
            return;
        }
        this.e = i;
        this.f = i2;
        com.meituan.mmp.lib.trace.b.a("MMPMapView", this, "onSurfaceChanged", surface, Integer.valueOf(i), Integer.valueOf(i2));
        if (this.v == null || surface == null || !(this.v instanceof MapRenderLayer)) {
            return;
        }
        ((MapRenderLayer) this.v).onSizeChanged(i, i2, this.v.getWidth(), this.v.getHeight());
    }

    public void setOnEventListener(com.meituan.mmp.lib.interfaces.c cVar) {
        this.x = cVar;
    }

    public com.meituan.mmp.lib.interfaces.c getOnEventListener() {
        return this.x;
    }

    public final void a(FrameLayout frameLayout, final JSONObject jSONObject, SparseArray<f> sparseArray, final IApiCallback iApiCallback) {
        RequestCreator c;
        Object[] objArr = {frameLayout, jSONObject, sparseArray, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e766f6983a9db96a778e7c4c669ab6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e766f6983a9db96a778e7c4c669ab6bf");
            return;
        }
        e eVar = (e) frameLayout;
        if (jSONObject.has("id")) {
            MarkerOptions markerOptions = new MarkerOptions();
            JSONObject optJSONObject = jSONObject.optJSONObject("anchor");
            if (optJSONObject != null) {
                markerOptions.anchor((float) optJSONObject.optDouble(Constants.GestureMoveEvent.KEY_X, 0.0d), (float) optJSONObject.optDouble(Constants.GestureMoveEvent.KEY_Y, 0.0d));
            }
            double optDouble = jSONObject.optDouble(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
            double optDouble2 = jSONObject.optDouble(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
            if (g.a(optDouble, optDouble2)) {
                markerOptions.position(new LatLng(optDouble, optDouble2));
                if (jSONObject.has("label")) {
                    markerOptions.title(jSONObject.optJSONObject("label").optString("content"));
                }
                TextUtils.isEmpty(jSONObject.optString("ariaLabel"));
                String optString = jSONObject.optString("iconPath");
                if (TextUtils.isEmpty(optString) || (c = s.c(getContext(), optString, getAppConfig())) == null) {
                    return;
                }
                int a2 = p.a(jSONObject.optInt("width"));
                int a3 = p.a(jSONObject.optInt("height"));
                if (a2 > 0 && a3 > 0) {
                    c.a(a2, a3);
                }
                MTMap map = eVar.getMap();
                if (map == null) {
                    com.meituan.mmp.lib.trace.b.d("maybe map has destroy!");
                    return;
                }
                markerOptions.zIndex(jSONObject.optInt("zIndex", 0) + 2);
                markerOptions.level(2);
                markerOptions.icon(getTransparentBitmap());
                Marker addMarker = map.addMarker(markerOptions);
                if (addMarker == null) {
                    iApiCallback.onFail(NativeViewApi.a("marker is null when add", new Object[0]));
                    return;
                }
                addMarker.setObject(jSONObject);
                int optInt = jSONObject.optInt("id");
                f fVar = sparseArray.get(optInt);
                if (fVar != null) {
                    fVar.b();
                    if (this.c != null && TextUtils.equals(this.c.c(), "bike_mmp")) {
                        com.meituan.mmp.lib.trace.b.b("mmp-marker", "addMarkers remove oldMarker");
                    }
                }
                final f fVar2 = new f(addMarker);
                sparseArray.put(optInt, fVar2);
                c.a(new Target() { // from class: com.meituan.mmp.lib.map.e.8
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Target
                    public final void onPrepareLoad(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr2 = {bitmap, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef8b3271e34083acfa98bc9d67bb43b4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef8b3271e34083acfa98bc9d67bb43b4");
                            return;
                        }
                        f fVar3 = fVar2;
                        Object[] objArr3 = {(byte) 1};
                        ChangeQuickRedirect changeQuickRedirect3 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar3, changeQuickRedirect3, false, "944ffb07e4334bf893415b7006e0617d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, fVar3, changeQuickRedirect3, false, "944ffb07e4334bf893415b7006e0617d");
                        } else {
                            fVar3.d.setClickable(true);
                        }
                        f fVar4 = fVar2;
                        BitmapDescriptor a4 = e.this.a(bitmap);
                        Object[] objArr4 = {a4};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr4, fVar4, changeQuickRedirect4, false, "081b5a8350d4c341daa6b0a3071c1b9e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, fVar4, changeQuickRedirect4, false, "081b5a8350d4c341daa6b0a3071c1b9e");
                        } else {
                            fVar4.d.setIcon(a4);
                        }
                        e.a(e.this, fVar2, jSONObject);
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapFailed(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b1b6dd276015ace7e5fc2f31d132ac3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b1b6dd276015ace7e5fc2f31d132ac3");
                        } else if (iApiCallback != null) {
                            iApiCallback.onFail(AbsApi.codeJson(-1, "icon load error"));
                        }
                    }
                });
            }
        }
    }

    public final BitmapDescriptor a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "321dc9bd71178c25d9f7cb2836123db0", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "321dc9bd71178c25d9f7cb2836123db0");
        }
        BitmapDescriptor bitmapDescriptor = null;
        for (WeakReference<BitmapDescriptor> weakReference : this.k) {
            BitmapDescriptor bitmapDescriptor2 = weakReference.get();
            if (bitmapDescriptor2 != null && bitmapDescriptor2.getBitmap() == bitmap) {
                bitmapDescriptor = bitmapDescriptor2;
            }
        }
        if (bitmapDescriptor == null) {
            BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
            this.k.add(new WeakReference<>(fromBitmap));
            return fromBitmap;
        }
        return bitmapDescriptor;
    }

    private BitmapDescriptor getTransparentBitmap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bede12bc3b74b656ce039c246740d42c", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bede12bc3b74b656ce039c246740d42c");
        }
        if (this.y == null) {
            this.y = BitmapDescriptorFactory.fromResource(R.drawable.mmp_pixel1);
        }
        return this.y;
    }

    public com.meituan.mmp.lib.config.a getAppConfig() {
        return this.c;
    }

    private void a(f fVar, JSONObject jSONObject) {
        int i;
        int i2 = 0;
        Object[] objArr = {fVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44522d0d227804167353bb48dd7e8b15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44522d0d227804167353bb48dd7e8b15");
            return;
        }
        if (jSONObject != null) {
            i2 = p.a(jSONObject.optInt("anchorX"));
            i = p.a(jSONObject.optInt("anchorY"));
        } else {
            i = 0;
        }
        if (i2 == 0 && i == 0) {
            return;
        }
        fVar.a(i2, i);
    }

    private void a(f fVar, JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {fVar, jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e25b80698078df16567a983ba0e1bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e25b80698078df16567a983ba0e1bfe");
            return;
        }
        boolean z = fVar.c;
        if (jSONObject2 != null && TextUtils.equals("ALWAYS", jSONObject2.optString("display", "ALWAYS"))) {
            fVar.c();
        } else if (z) {
            fVar.c();
        } else {
            fVar.b = "BYCLICK";
        }
        fVar.a(jSONObject);
    }

    public void setMapType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c870fca9c2d2f9c032d5dd6f4b8d8967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c870fca9c2d2f9c032d5dd6f4b8d8967");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.z = str;
        }
    }

    public String getToken() {
        return this.A;
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c90729a3754621a3f110089dba0aa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c90729a3754621a3f110089dba0aa5");
            return;
        }
        if (this.v != null) {
            this.v.onPause();
        }
        a.a(this.A).c();
        j();
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1666b5237b91aaecb5fa3e22501efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1666b5237b91aaecb5fa3e22501efb");
            return;
        }
        if (this.v != null) {
            this.v.onResume();
        }
        a.a(this.A).a();
        h();
    }

    public e(com.meituan.mmp.lib.a aVar) {
        super(aVar.f);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2ca92a041b7dc82991939674be2753", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2ca92a041b7dc82991939674be2753");
            return;
        }
        this.n = false;
        this.p = new SparseArray<>();
        this.q = new SparseArray<>();
        this.r = new SparseArray<>();
        this.s = new SparseArray<>();
        this.t = null;
        this.z = AbsApiFactory.PASSPORT_ONLINE_URL;
        this.B = new Handler(Looper.myLooper());
        this.C = new Runnable() { // from class: com.meituan.mmp.lib.map.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0086a480060afde208764d0f446005fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0086a480060afde208764d0f446005fd");
                } else if (e.this.t != null) {
                    e.this.j.a(0, e.this.t, "");
                    e.this.B.postDelayed(this, 1000L);
                }
            }
        };
        this.g = false;
        this.i = false;
        this.j = new b() { // from class: com.meituan.mmp.lib.map.e.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.map.b
            public final void a(int i, final com.meituan.msi.api.location.a aVar2, String str) {
                int i2;
                String str2;
                Object[] objArr2 = {Integer.valueOf(i), aVar2, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1bb73b971ffcdedec592e907a378dd7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1bb73b971ffcdedec592e907a378dd7");
                } else if (i != 0 || aVar2 == null) {
                    b.a.c("MMPMapView", "onLocation error," + str);
                    if (e.this.D == c.a.normal) {
                        i2 = 10002;
                        str2 = "Locate.once locate failed," + str;
                    } else {
                        i2 = 10001;
                        str2 = "Locate.continuous locate failed," + str;
                    }
                    e.this.getOnEventListener().a("onMapError", e.this.a(i2, str2), e.this.E);
                } else {
                    b.a.c("token:" + e.this.A + ",loadStrategy:" + e.this.D + ",latlng:" + aVar2.h + CommonConstant.Symbol.COMMA + aVar2.g);
                    e.this.t = aVar2;
                    if (a.a(e.this.A) != null) {
                        MtLocation mtLocation = new MtLocation(aVar2.a);
                        mtLocation.setBearing(a.a(e.this.A).b());
                        aVar2.k = mtLocation.getBearing();
                    }
                    MTMap map = e.this.getMap();
                    if (map != null) {
                        map.setLocationSource(new y() { // from class: com.meituan.mmp.lib.map.e.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y
                            public final void a() {
                            }

                            @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y
                            public final void a(y.a aVar3) {
                                Object[] objArr3 = {aVar3};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0af114761a8201cd2707c79693f22309", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0af114761a8201cd2707c79693f22309");
                                    return;
                                }
                                e.this.setTag(new LatLng(aVar2.h, aVar2.g));
                                y.b bVar = (y.b) aVar3;
                                final e eVar = e.this;
                                final com.meituan.msi.api.location.a aVar4 = aVar2;
                                Object[] objArr4 = {aVar4};
                                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                                bVar.onLocationChanged(PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "9ccaa1e2afd3e98542a6caf81a3a10f7", RobustBitConfig.DEFAULT_VALUE) ? (MapLocation) PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "9ccaa1e2afd3e98542a6caf81a3a10f7") : new MapLocation() { // from class: com.meituan.mmp.lib.map.e.5
                                    @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                                    public final double getLatitude() {
                                        return aVar4.h;
                                    }

                                    @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                                    public final double getLongitude() {
                                        return aVar4.g;
                                    }

                                    @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                                    public final double getAltitude() {
                                        return aVar4.d;
                                    }

                                    @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                                    public final float getSpeed() {
                                        return aVar4.f;
                                    }

                                    @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                                    public final float getBearing() {
                                        return aVar4.k;
                                    }

                                    @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                                    public final float getAccuracy() {
                                        return aVar4.e;
                                    }
                                });
                            }
                        });
                    } else {
                        com.meituan.mmp.lib.trace.b.d("MMPMapView", "map is null");
                    }
                }
            }
        };
        this.k = new LinkedList();
        this.l = aVar;
        this.u = new u(16L, new u.a() { // from class: com.meituan.mmp.lib.map.e.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.utils.u.a
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "111fa9eb0564aa33128c63c3a28884e7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "111fa9eb0564aa33128c63c3a28884e7")).booleanValue();
                }
                if (e.this.t != null) {
                    e.this.j.a(0, e.this.t, null);
                    return true;
                }
                return true;
            }
        });
    }
}
