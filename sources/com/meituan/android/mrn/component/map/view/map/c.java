package com.meituan.android.mrn.component.map.view.map;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PointF;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.android.mrn.component.map.utils.a;
import com.meituan.android.mrn.component.map.utils.g;
import com.meituan.android.mrn.component.map.view.childview.f;
import com.meituan.android.mrn.component.map.view.childview.h;
import com.meituan.android.mrn.component.map.view.childview.i;
import com.meituan.android.mrn.component.map.view.childview.j;
import com.meituan.android.mrn.component.map.view.childview.k;
import com.meituan.android.mrn.component.map.view.childview.l;
import com.meituan.android.mrn.component.map.view.childview.tile.b;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapMarkerViewManager;
import com.meituan.android.mrn.component.map.viewmanager.map.MRNMapViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.AbstractMapView;
import com.sankuai.meituan.mapsdk.maps.CameraMapGestureType;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.OnCameraChangeExtraListener2;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import com.sankuai.meituan.mapsdk.maps.interfaces.z;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.DynamicMap;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapAoi;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.MapPoi;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
import com.sankuai.meituan.mapsdk.maps.model.Polygon;
import com.sankuai.meituan.mapsdk.maps.model.Polyline;
import com.sankuai.meituan.mapsdk.maps.model.TileOverlay;
import com.sankuai.meituan.mapsdk.maps.model.TileOverlayOptions;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.tencent.rtmp.TXLiveConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"nammu_check_error"})
/* loaded from: classes2.dex */
public final class c<T extends AbstractMapView> {
    public static ChangeQuickRedirect a;
    public static final int k = Color.argb(100, 0, 0, (int) TXLiveConstants.RENDER_ROTATION_180);
    public static final int l = Color.argb(255, 0, 0, 0);
    public volatile boolean A;
    public List<Marker> B;
    public volatile DynamicMap C;
    public volatile List<l> D;
    public final HashMap<String, String> E;
    private com.meituan.android.mrn.component.map.b F;
    private Map<String, h> G;
    private ConcurrentHashMap<String, BitmapDescriptor> H;
    private LifecycleEventListener I;
    private final g J;
    private BitmapDescriptor K;
    private MyLocationStyle L;
    private int M;
    private String N;
    private String O;
    private long P;
    private boolean Q;
    private a.C0279a R;
    private volatile boolean S;
    public MTMap b;
    public ao c;
    public T d;
    public f e;
    public ArrayList<com.meituan.android.mrn.component.map.view.childview.d> f;
    public final Map<Marker, com.meituan.android.mrn.component.map.view.childview.f> g;
    public final Map<String, com.meituan.android.mrn.component.map.view.childview.g> h;
    public String i;
    public boolean j;
    public boolean m;
    public boolean n;
    public float o;
    public int p;
    public int q;
    public float r;
    public int s;
    public boolean t;
    public int u;
    public volatile boolean v;
    public volatile boolean w;
    public CopyOnWriteArrayList<a> x;
    public final String y;
    public boolean z;

    /* loaded from: classes2.dex */
    public static class a {
        public int a;
        public ReadableArray b;
        public CameraUpdate c;
        public boolean d;
        public ReadableArray e;
        public ReadableMap f;
        public boolean g;

        public a() {
        }
    }

    private com.meituan.android.mrn.component.map.view.childview.d a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2990a2bbee1d0a844c3021291d144a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.component.map.view.childview.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2990a2bbee1d0a844c3021291d144a9");
        }
        if (this.A) {
            return null;
        }
        Iterator<com.meituan.android.mrn.component.map.view.childview.d> it = this.f.iterator();
        while (it.hasNext()) {
            com.meituan.android.mrn.component.map.view.childview.d next = it.next();
            View view = (View) next;
            if (view != null && view.getId() == i) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b4a1b2484ed649849f1201c8dbe3a2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b4a1b2484ed649849f1201c8dbe3a2f");
        } else if (this.c == null || this.d == null) {
        } else {
            ((RCTEventEmitter) this.c.getJSModule(RCTEventEmitter.class)).receiveEvent(this.d.getId(), str, writableMap);
        }
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.S = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c2cb54973c42cb438128dca877b487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c2cb54973c42cb438128dca877b487");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.M = -1;
            this.O = str;
            e();
        }
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        cVar.v = true;
        return true;
    }

    private MyLocationStyle i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c9487500febefc660904a6d5771c0a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (MyLocationStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c9487500febefc660904a6d5771c0a2");
        }
        if (this.L == null) {
            this.L = new MyLocationStyle().anchor(0.5f, 0.5f).circleShow(this.n).myLocationType(this.u).radiusCeiling(this.o).radiusFillColor(this.p).strokeColor(this.q).strokeWidth(this.r).interval(1000L).zIndex(this.s).myLocationIcon(this.K);
        } else {
            this.L.myLocationType(this.u);
            this.L.circleShow(this.n);
            this.L.radiusCeiling(this.o);
            this.L.radiusFillColor(this.p);
            this.L.strokeColor(this.q);
            this.L.strokeWidth(this.r);
            this.L.zIndex(this.s);
            this.L.myLocationIcon(this.K);
        }
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73314620635d35674618473d2a96e6b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73314620635d35674618473d2a96e6b0")).booleanValue() : this.d != null && ((com.meituan.android.mrn.component.map.view.map.a) this.d).getMapType() == 3;
    }

    public CameraUpdate a(CameraUpdate cameraUpdate) {
        CameraUpdateMessage cameraUpdateMessage;
        CameraPosition cameraPosition;
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1da86833a813a6f7d8c91ff5dae1fdc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1da86833a813a6f7d8c91ff5dae1fdc4");
        }
        if (cameraUpdate == null || this.b == null || (cameraUpdateMessage = cameraUpdate.getCameraUpdateMessage()) == null || cameraUpdateMessage.type != CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION || cameraUpdateMessage.cameraPosition == null) {
            return cameraUpdate;
        }
        CameraPosition cameraPosition2 = cameraUpdateMessage.cameraPosition;
        if ((Float.isNaN(cameraPosition2.bearing) || Float.isNaN(cameraPosition2.tilt) || Float.isNaN(cameraPosition2.zoom)) && (cameraPosition = this.b.getCameraPosition()) != null) {
            float f = cameraPosition.bearing;
            float f2 = cameraPosition.tilt;
            float f3 = cameraPosition.zoom;
            if (!Float.isNaN(cameraPosition2.bearing)) {
                f = cameraPosition2.bearing;
            }
            if (!Float.isNaN(cameraPosition2.tilt)) {
                f2 = cameraPosition2.tilt;
            }
            if (!Float.isNaN(cameraPosition2.zoom)) {
                f3 = cameraPosition2.zoom;
            }
            return CameraUpdateFactory.newCameraPosition(new CameraPosition(cameraPosition2.target, f3, f2, f));
        }
        return cameraUpdate;
    }

    public void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92486a83ce7b24262de0114f9b146c71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92486a83ce7b24262de0114f9b146c71");
            return;
        }
        a("setBoundsSpendTime", "setBounds从JS开始设置到设置完成的耗时", j, j2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("setBoundsSpendTime", j2 - j);
            com.meituan.android.mrn.component.map.utils.e.a("qcs_lbs", "qcs_lbs_mrnmap_log", jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    public final void a(ReadableArray readableArray) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        ReadableMap map;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75c566ce3a0a887d8c2c05ef6686865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75c566ce3a0a887d8c2c05ef6686865");
        } else if (this.A || this.b == null || this.d == null || this.f.size() <= 0) {
        } else {
            if (!this.v || !this.w) {
                a aVar = new a();
                aVar.a = 1;
                aVar.b = readableArray;
                this.x.add(aVar);
            } else if (this.d.getHeight() <= 0 || this.d.getWidth() <= 0) {
            } else {
                if (readableArray == null || readableArray.size() <= 0 || this.c == null || (map = readableArray.getMap(0)) == null) {
                    z = false;
                    z2 = true;
                    z3 = true;
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                } else {
                    int a2 = com.meituan.android.mrn.component.map.utils.a.a(map, "paddingLeft") ? com.meituan.android.mrn.component.map.utils.b.a(this.c, (float) map.getDouble("paddingLeft")) : 0;
                    int a3 = com.meituan.android.mrn.component.map.utils.a.a(map, "paddingTop") ? com.meituan.android.mrn.component.map.utils.b.a(this.c, (float) map.getDouble("paddingTop")) : 0;
                    int a4 = com.meituan.android.mrn.component.map.utils.a.a(map, "paddingRight") ? com.meituan.android.mrn.component.map.utils.b.a(this.c, (float) map.getDouble("paddingRight")) : 0;
                    int a5 = com.meituan.android.mrn.component.map.utils.a.a(map, "paddingBottom") ? com.meituan.android.mrn.component.map.utils.b.a(this.c, (float) map.getDouble("paddingBottom")) : 0;
                    boolean z4 = com.meituan.android.mrn.component.map.utils.a.a(map, "animate") ? map.getBoolean("animate") : true;
                    boolean z5 = com.meituan.android.mrn.component.map.utils.a.a(map, "containUserLocation") ? map.getBoolean("containUserLocation") : false;
                    if (com.meituan.android.mrn.component.map.utils.a.a(map, "containMarkerCallout")) {
                        i = a2;
                        i2 = a3;
                        i3 = a4;
                        i4 = a5;
                        z2 = z4;
                        z3 = map.getBoolean("containMarkerCallout");
                        z = z5;
                    } else {
                        i = a2;
                        i2 = a3;
                        i3 = a4;
                        i4 = a5;
                        z2 = z4;
                        z = z5;
                        z3 = true;
                    }
                }
                this.b.fitAllElement(z, z2, z3, i, i2, i3, i4);
            }
        }
    }

    public final void a(ReadableMap readableMap, boolean z) {
        PointF a2;
        Object[] objArr = {readableMap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55afc3339e4d4cc1457eaa189b8bdd1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55afc3339e4d4cc1457eaa189b8bdd1f");
        } else if (!this.v || !this.w) {
            a aVar = new a();
            aVar.a = 5;
            aVar.f = readableMap;
            aVar.g = z;
            this.x.add(aVar);
        } else if (this.b == null || this.d == null || this.c == null || (a2 = com.meituan.android.mrn.component.map.utils.a.a(readableMap)) == null) {
        } else {
            this.b.setCameraCenterProportion(com.meituan.android.mrn.component.map.utils.b.a(this.c, a2.x), com.meituan.android.mrn.component.map.utils.b.a(this.c, a2.y), z);
        }
    }

    public void a(CameraUpdate cameraUpdate, boolean z) {
        Object[] objArr = {cameraUpdate, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282d8a7ca41514d6c1eb576fb8d86fe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282d8a7ca41514d6c1eb576fb8d86fe7");
        } else if ((!this.v && !j()) || !this.w) {
            a aVar = new a();
            aVar.a = 2;
            aVar.c = cameraUpdate;
            aVar.d = z;
            this.x.add(aVar);
        } else {
            CameraUpdate a2 = a(cameraUpdate);
            if (!z) {
                this.b.moveCamera(a2);
                return;
            }
            CameraUpdateMessage cameraUpdateMessage = a2.getCameraUpdateMessage();
            final CameraUpdateMessage cameraUpdateMessage2 = new CameraUpdateMessage();
            cameraUpdateMessage2.zoom = cameraUpdateMessage.zoom;
            cameraUpdateMessage2.latLng = cameraUpdateMessage.latLng;
            this.b.animateCamera(a2, new MTMap.CancelableCallback() { // from class: com.meituan.android.mrn.component.map.view.map.c.16
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
                public final void onCancel() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af5330ae1805cc1d8d5234cbfa8d1f21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af5330ae1805cc1d8d5234cbfa8d1f21");
                    } else {
                        c.a(c.this, "setCenter", 2, cameraUpdateMessage2);
                    }
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
                public final void onFinish() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2ce7b449a328dbb57d5b80d507691bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2ce7b449a328dbb57d5b80d507691bc");
                    } else {
                        c.a(c.this, "setCenter", 1, cameraUpdateMessage2);
                    }
                }
            });
        }
    }

    public final void a(final String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8da8520f1abd6627ba7ac8d0a13f93a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8da8520f1abd6627ba7ac8d0a13f93a");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis() - j;
        com.meituan.android.mrn.component.map.utils.e.a(new HashMap<String, Float>() { // from class: com.meituan.android.mrn.component.map.view.map.c.21
            {
                put(str, Float.valueOf((float) currentTimeMillis));
            }
        }, this.E);
    }

    public void a(String str, String str2, long j, long j2) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef5ef0f68eef11501dd1b2b0a605ed02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef5ef0f68eef11501dd1b2b0a605ed02");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", str);
        createMap.putString("desc", str2);
        createMap.putDouble("start", j);
        createMap.putDouble("finish", j2);
        a(MRNMapViewManager.EVENT_ON_PERFORMANCE, createMap);
    }

    public boolean a(DynamicMap dynamicMap) {
        Object[] objArr = {dynamicMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03de8600fb4595f88995da66a3e9d843", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03de8600fb4595f88995da66a3e9d843")).booleanValue();
        }
        if (dynamicMap != null) {
            return true;
        }
        if (this.A) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("createDynamicMap styleName is null"), "param");
        }
        return false;
    }

    public final synchronized boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9dbc178a39d63b4724bb7a81f766a91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9dbc178a39d63b4724bb7a81f766a91")).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("createDynamicMap styleName is null"), "param");
            return false;
        } else {
            MTMap mTMap = this.b;
            if (mTMap == null) {
                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("createDynamicMap MTMap is null"), "param");
                return false;
            }
            f();
            DynamicMap createDynamicMap = mTMap.createDynamicMap(str);
            if (a(createDynamicMap)) {
                this.C = createDynamicMap;
                return true;
            }
            return false;
        }
    }

    public final void b(ReadableArray readableArray) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        ReadableMap map;
        ReadableArray array;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41eadc583ae73738cf5bb3cd947359ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41eadc583ae73738cf5bb3cd947359ca");
        } else if (!this.A && this.b != null && this.d != null && this.f.size() > 0) {
            if (!this.v || !this.w) {
                a aVar = new a();
                aVar.a = 3;
                aVar.e = readableArray;
                this.x.add(aVar);
            } else if (this.d.getHeight() > 0 && this.d.getWidth() > 0) {
                ArrayList arrayList = new ArrayList();
                if (readableArray == null || readableArray.size() <= 0 || this.c == null || (map = readableArray.getMap(0)) == null) {
                    z = false;
                    z2 = true;
                    z3 = true;
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                } else {
                    int a2 = com.meituan.android.mrn.component.map.utils.a.a(map, "paddingLeft") ? com.meituan.android.mrn.component.map.utils.b.a(this.c, (float) map.getDouble("paddingLeft")) : 0;
                    int a3 = com.meituan.android.mrn.component.map.utils.a.a(map, "paddingTop") ? com.meituan.android.mrn.component.map.utils.b.a(this.c, (float) map.getDouble("paddingTop")) : 0;
                    int a4 = com.meituan.android.mrn.component.map.utils.a.a(map, "paddingRight") ? com.meituan.android.mrn.component.map.utils.b.a(this.c, (float) map.getDouble("paddingRight")) : 0;
                    int a5 = com.meituan.android.mrn.component.map.utils.a.a(map, "paddingBottom") ? com.meituan.android.mrn.component.map.utils.b.a(this.c, (float) map.getDouble("paddingBottom")) : 0;
                    boolean z4 = com.meituan.android.mrn.component.map.utils.a.a(map, "animate") ? map.getBoolean("animate") : true;
                    boolean z5 = com.meituan.android.mrn.component.map.utils.a.a(map, "containMarkerCallout") ? map.getBoolean("containMarkerCallout") : true;
                    boolean z6 = com.meituan.android.mrn.component.map.utils.a.a(map, "containUserLocation") ? map.getBoolean("containUserLocation") : false;
                    if (com.meituan.android.mrn.component.map.utils.a.a(map, DynamicTitleParser.PARSER_KEY_ELEMENTS) && (array = map.getArray(DynamicTitleParser.PARSER_KEY_ELEMENTS)) != null && array.size() > 0) {
                        for (int i5 = 0; i5 < array.size(); i5++) {
                            com.meituan.android.mrn.component.map.view.childview.d a6 = a(array.getInt(i5));
                            if (a6 != null && (a6 instanceof com.meituan.android.mrn.component.map.view.childview.d)) {
                                arrayList.add(a6.getFeature());
                            }
                        }
                    }
                    i = a2;
                    i2 = a3;
                    i3 = a4;
                    i4 = a5;
                    z2 = z4;
                    z = z6;
                    z3 = z5;
                }
                this.b.fitElement(arrayList, z, z2, z3, i, i2, i3, i4);
            }
        }
    }

    public final void b(ReadableMap readableMap) {
        PointF a2;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cc621693dafb28d8b2182adcc13d1d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cc621693dafb28d8b2182adcc13d1d9");
        } else if (!this.v || !this.w) {
            a aVar = new a();
            aVar.a = 4;
            aVar.f = readableMap;
            this.x.add(aVar);
        } else if (this.b == null || this.d == null || this.c == null || (a2 = com.meituan.android.mrn.component.map.utils.a.a(readableMap)) == null) {
        } else {
            this.b.setCameraCenterProportion(com.meituan.android.mrn.component.map.utils.b.a(this.c, a2.x), com.meituan.android.mrn.component.map.utils.b.a(this.c, a2.y));
        }
    }

    public final synchronized void c() {
        T t;
        Runnable runnable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b65ed243e2e87699f7061edafc867376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b65ed243e2e87699f7061edafc867376");
        } else if (this.x.isEmpty()) {
        } else {
            if (this.v && this.w) {
                Iterator<a> it = this.x.iterator();
                while (it.hasNext()) {
                    final a next = it.next();
                    if (next != null) {
                        if (next.a == 1) {
                            if (this.d == null) {
                                return;
                            }
                            t = this.d;
                            runnable = new Runnable() { // from class: com.meituan.android.mrn.component.map.view.map.c.9
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97f0101f938c7f6f05f595c6fa9073ed", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97f0101f938c7f6f05f595c6fa9073ed");
                                    } else {
                                        c.this.a(next.b);
                                    }
                                }
                            };
                        } else if (next.a == 2) {
                            if (this.d != null && this.b != null) {
                                t = this.d;
                                runnable = new Runnable() { // from class: com.meituan.android.mrn.component.map.view.map.c.10
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr2 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d239f23a3cd40913f379577460d3f4fb", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d239f23a3cd40913f379577460d3f4fb");
                                            return;
                                        }
                                        CameraUpdate a2 = c.this.a(next.c);
                                        if (next.d) {
                                            c.this.b.animateCamera(a2);
                                        } else {
                                            c.this.b.moveCamera(a2);
                                        }
                                    }
                                };
                            }
                            return;
                        } else if (next.a == 3) {
                            if (this.d == null) {
                                return;
                            }
                            t = this.d;
                            runnable = new Runnable() { // from class: com.meituan.android.mrn.component.map.view.map.c.11
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ea1c739f5df0bc6c742873c66c10d77", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ea1c739f5df0bc6c742873c66c10d77");
                                    } else {
                                        c.this.b(next.e);
                                    }
                                }
                            };
                        } else if (next.a == 4) {
                            if (this.d == null) {
                                return;
                            }
                            t = this.d;
                            runnable = new Runnable() { // from class: com.meituan.android.mrn.component.map.view.map.c.13
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efae8e3354a03b592d633d286555433e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efae8e3354a03b592d633d286555433e");
                                    } else {
                                        c.this.b(next.f);
                                    }
                                }
                            };
                        } else if (next.a != 5) {
                            continue;
                        } else if (this.d == null) {
                            return;
                        } else {
                            t = this.d;
                            runnable = new Runnable() { // from class: com.meituan.android.mrn.component.map.view.map.c.14
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25e2cd4f6c089c33de38e4eb0fbe0102", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25e2cd4f6c089c33de38e4eb0fbe0102");
                                    } else {
                                        c.this.a(next.f, next.g);
                                    }
                                }
                            };
                        }
                        t.post(runnable);
                    }
                }
                this.x.clear();
            }
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eadb191a634f4962a96c7f850ec06786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eadb191a634f4962a96c7f850ec06786");
        } else if (this.b == null) {
        } else {
            if (this.m) {
                this.b.setLocationSource(this.F != null ? this.F.a(this.i) : null);
                this.b.setOnLocationChangedListener(new y.b() { // from class: com.meituan.android.mrn.component.map.view.map.c.18
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y.a
                    public final void onLocationChanged(Location location) {
                        Object[] objArr2 = {location};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64662010c6a144911ce43bf6adb1d676", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64662010c6a144911ce43bf6adb1d676");
                        } else if (location != null) {
                            c.this.a(MRNMapViewManager.EVENT_ON_UPDATE_USER_LOCATION, com.meituan.android.mrn.component.map.utils.a.a(location));
                        }
                    }

                    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y.b
                    public final void onLocationChanged(MapLocation mapLocation) {
                        Object[] objArr2 = {mapLocation};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a01bb651b46e2301762b1142e50ba9d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a01bb651b46e2301762b1142e50ba9d");
                        } else if (mapLocation != null) {
                            c.this.a(MRNMapViewManager.EVENT_ON_UPDATE_USER_LOCATION, com.meituan.android.mrn.component.map.utils.a.a(mapLocation));
                        }
                    }
                });
                this.b.setMyLocationStyle(i());
            } else {
                this.m = false;
                this.t = false;
                this.n = true;
                this.p = k;
                this.q = l;
                this.r = 1.0f;
                this.s = 0;
                this.K = null;
                this.b.setLocationSource(null);
                this.b.setOnLocationChangedListener(null);
            }
            this.b.setMyLocationEnabled(this.m);
        }
    }

    @SuppressLint({"WrongConstant"})
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d4db4940919607eba50854262f450f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d4db4940919607eba50854262f450f");
        } else if (this.c == null || this.b == null) {
        } else {
            if (this.M > 0) {
                this.b.setCustomSatelliteUri(this.N);
                this.b.setMapType(this.M);
            } else if (!TextUtils.isEmpty(this.O)) {
                this.b.setCustomMapStylePath(this.O);
            } else if (this.F == null || this.c == null || this.b == null || TextUtils.isEmpty(this.i)) {
            } else {
                this.F.a(this.i, this.c.getApplicationContext(), this.b);
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882ad58fb01b696269aa200960a1f6de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882ad58fb01b696269aa200960a1f6de");
            return;
        }
        DynamicMap dynamicMap = this.C;
        if (dynamicMap == null) {
            return;
        }
        this.C = null;
        dynamicMap.removeDynamicMap();
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9c9708e879e907dc7657eaa1bda965", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9c9708e879e907dc7657eaa1bda965");
            return;
        }
        List<l> list = this.D;
        if (list == null) {
            return;
        }
        for (l lVar : list) {
            if (lVar != null) {
                lVar.a();
            }
        }
        list.clear();
        this.D = null;
    }

    public c(final String str, T t, ao aoVar, com.meituan.android.mrn.component.map.b bVar, a.C0279a c0279a, long j, boolean z, d dVar) {
        MapViewOptions mapViewOptions;
        Object[] objArr = {str, t, aoVar, bVar, c0279a, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ba1f1bcdd32cabfae0efb254b153d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ba1f1bcdd32cabfae0efb254b153d5");
            return;
        }
        this.f = new ArrayList<>();
        this.g = new HashMap();
        this.h = new HashMap();
        this.G = new HashMap();
        this.H = new ConcurrentHashMap<>();
        this.j = true;
        this.m = false;
        this.n = true;
        this.o = 1.0f;
        this.p = k;
        this.q = l;
        this.r = 1.0f;
        this.s = 0;
        this.K = null;
        this.t = false;
        this.u = 1;
        this.M = -1;
        this.N = null;
        this.O = null;
        this.v = false;
        this.w = false;
        this.x = new CopyOnWriteArrayList<>();
        this.z = false;
        this.S = false;
        this.A = false;
        this.B = new ArrayList();
        this.D = new ArrayList();
        this.E = new HashMap<String, String>() { // from class: com.meituan.android.mrn.component.map.view.map.c.1
            {
                put("mapVender", c.this.j() ? "3" : "1");
                put("platform", "1");
                put("techType", "2");
                put("mapVersion", "4.1207.1");
            }
        };
        this.R = c0279a;
        this.P = j;
        this.Q = z;
        this.c = aoVar;
        this.y = str;
        this.d = t;
        this.F = bVar;
        this.E.put("mapID", str);
        this.E.put("mapVender", j() ? "3" : "1");
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da3966eb20ca384ea504914e20f6ee84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da3966eb20ca384ea504914e20f6ee84");
        } else {
            boolean z2 = this.F instanceof com.meituan.android.mrn.component.map.f;
            if (dVar != null) {
                mapViewOptions = new MapViewOptions();
                if (dVar.a != null) {
                    mapViewOptions.setZoomMode(dVar.a);
                }
                if (dVar.b != null) {
                    mapViewOptions.setCameraPosition(dVar.b);
                }
                mapViewOptions.useOverseasMap(dVar.c);
                mapViewOptions.setBasemapSourceType(dVar.d == 2 ? MapViewOptions.BasemapSourceType.RASTER : MapViewOptions.BasemapSourceType.VECTOR);
                if (dVar.e != null) {
                    mapViewOptions.setLocalMapStyleRes(dVar.e);
                }
                if (dVar.f != null) {
                    mapViewOptions.setCustomMapStylePath(dVar.f);
                }
            } else {
                mapViewOptions = null;
            }
            if (mapViewOptions != null) {
                this.d.setMapViewOptions(mapViewOptions);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("DETACHED_FROM_WINDOW", false);
        this.d.onCreate(bundle);
        this.b = this.d.getMap();
        this.J = new g();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7739fb6fcfd3e1cc9d426024003de6f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7739fb6fcfd3e1cc9d426024003de6f9");
        } else if (!this.A) {
            this.b.getUiSettings().setZoomControlsEnabled(false);
            this.b.getUiSettings().setTiltGesturesEnabled(false);
            this.b.getUiSettings().setRotateGesturesEnabled(false);
            this.b.setOnMapLoadedListener(new MTMap.OnMapLoadedListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.22
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapLoadedListener
                public final void onMapLoaded() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "42f3bc16ff6ad0a3417a1bdd871daec1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "42f3bc16ff6ad0a3417a1bdd871daec1");
                        return;
                    }
                    int mapType = c.this.d != null ? ((com.meituan.android.mrn.component.map.view.map.a) c.this.d).getMapType() : -1;
                    long currentTimeMillis = System.currentTimeMillis();
                    com.meituan.android.mrn.component.map.utils.e.b(mapType, c.this.R, SystemClock.elapsedRealtime() - c.this.P, c.this.Q, c.this.y);
                    com.meituan.android.mrn.component.map.utils.e.a(new HashMap<String, Float>() { // from class: com.meituan.android.mrn.component.map.view.map.c.22.1
                        {
                            put("MTMapMRNFSNativeReadyTime", Float.valueOf(((float) SystemClock.elapsedRealtime()) - ((float) c.this.P)));
                        }
                    }, c.this.E);
                    c.b(c.this, true);
                    c.this.c();
                    c.this.e();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putDouble("kNativeMapReadyTime", currentTimeMillis);
                    c.this.a(MRNMapViewManager.EVENT_ON_MAP_READY, createMap);
                }
            });
            this.b.setOnCameraChangeListener(new OnCameraChangeExtraListener2() { // from class: com.meituan.android.mrn.component.map.view.map.c.23
                public static ChangeQuickRedirect a;
                private volatile boolean c = true;
                private volatile long d = 0;

                @Override // com.sankuai.meituan.mapsdk.maps.OnCameraChangeExtraListener2
                public final void onCameraChange(CameraPosition cameraPosition, boolean z3, CameraMapGestureType cameraMapGestureType) {
                    Object[] objArr4 = {cameraPosition, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), cameraMapGestureType};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7792f4ecc85f96befa653d3554a0d312", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7792f4ecc85f96befa653d3554a0d312");
                        return;
                    }
                    if (this.c) {
                        this.d = System.currentTimeMillis();
                        this.c = false;
                    }
                    if (!c.this.v && z3 && !c.this.x.isEmpty()) {
                        c.this.x.clear();
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putMap(WmChooseMediaModule.TYPE_CAMERA, com.meituan.android.mrn.component.map.utils.a.a(cameraPosition));
                    createMap.putBoolean("finish", false);
                    createMap.putBoolean("isGesture", z3);
                    createMap.putInt("gestureType", com.meituan.android.mrn.component.map.utils.a.a(cameraMapGestureType));
                    c.this.a(MRNMapViewManager.EVENT_ON_CAMERA_CHANGE, createMap);
                }

                @Override // com.sankuai.meituan.mapsdk.maps.OnCameraChangeExtraListener2
                public final void onCameraChangeFinish(CameraPosition cameraPosition, boolean z3, CameraMapGestureType cameraMapGestureType) {
                    Object[] objArr4 = {cameraPosition, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), cameraMapGestureType};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cc4d05a4ffbb8ff411eb4455269d3a35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cc4d05a4ffbb8ff411eb4455269d3a35");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    c.this.a(MRNMapViewManager.EVENT_ON_CAMERA_CHANGE, "地图视野从开始移动到移动结束的耗时", this.d, currentTimeMillis);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("mapId", c.this.y);
                        jSONObject.put(MRNMapViewManager.EVENT_ON_CAMERA_CHANGE, currentTimeMillis - this.d);
                        com.meituan.android.mrn.component.map.utils.e.a("qcs_lbs", "qcs_lbs_mrnmap_log", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                    this.c = true;
                    this.d = 0L;
                    WritableMap createMap = Arguments.createMap();
                    createMap.putMap(WmChooseMediaModule.TYPE_CAMERA, com.meituan.android.mrn.component.map.utils.a.a(cameraPosition));
                    createMap.putBoolean("finish", true);
                    createMap.putBoolean("isGesture", z3);
                    createMap.putInt("gestureType", com.meituan.android.mrn.component.map.utils.a.a(cameraMapGestureType));
                    c.this.a(MRNMapViewManager.EVENT_ON_CAMERA_CHANGE, createMap);
                }
            });
            this.b.addMapGestureListener(new z() { // from class: com.meituan.android.mrn.component.map.view.map.c.24
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fa43c9d7a94c3f86e93fbacc3ebea969", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fa43c9d7a94c3f86e93fbacc3ebea969");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putDouble("stableTimeStamp", System.currentTimeMillis());
                    c.this.a(MRNMapViewManager.EVENT_ON_MAP_STABLE, createMap);
                }

                @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
                public final boolean a(float f, float f2) {
                    return false;
                }

                @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
                public final boolean b(float f, float f2) {
                    return false;
                }
            });
            this.b.setOnMapClickListener(new MTMap.OnMapClickListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.25
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapClickListener
                public final void onMapClick(LatLng latLng) {
                    Object[] objArr4 = {latLng};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8be21198eb537c89c546a6489bba9825", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8be21198eb537c89c546a6489bba9825");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putMap("coordinate", com.meituan.android.mrn.component.map.utils.a.a(latLng));
                    c.this.a(MRNMapViewManager.EVENT_ON_MAP_PRESS, createMap);
                    if (c.this.j) {
                        for (com.meituan.android.mrn.component.map.view.childview.f fVar : c.this.g.values()) {
                            if (fVar != null) {
                                fVar.g();
                            }
                        }
                    }
                }
            });
            this.b.setOnMapLongClickListener(new MTMap.OnMapLongClickListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.26
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapLongClickListener
                public final void onMapLongClick(LatLng latLng) {
                    Object[] objArr4 = {latLng};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6ea187cb1bd6480ca3ef8ca5f0c3cd2a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6ea187cb1bd6480ca3ef8ca5f0c3cd2a");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putMap("coordinate", com.meituan.android.mrn.component.map.utils.a.a(latLng));
                    c.this.a(MRNMapViewManager.EVENT_ON_MAP_LONG_PRESS, createMap);
                }
            });
            this.b.setOnMarkerClickListener(new MTMap.OnMarkerClickListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.27
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerClickListener
                public final boolean onMarkerClick(Marker marker) {
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "61386ec61bc70e40df145458b15bafa5", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "61386ec61bc70e40df145458b15bafa5")).booleanValue();
                    }
                    if (marker == null) {
                        return true;
                    }
                    if (!c.this.B.isEmpty() && c.this.B.contains(marker)) {
                        WritableMap a2 = com.meituan.android.mrn.component.map.utils.f.a(c.this.b, marker.getPosition());
                        a2.putString("action", "marker-press");
                        a2.putString("id", String.valueOf(marker.getId()));
                        c.this.a(MRNMapViewManager.EVENT_ON_BATCHEDMARKER_PRESS, a2);
                        return true;
                    }
                    com.meituan.android.mrn.component.map.view.childview.f fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker);
                    if (fVar != null) {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.component.map.view.childview.f.a;
                        if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "8d5ac0726851fa7beedb9c7598ffeb6b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "8d5ac0726851fa7beedb9c7598ffeb6b");
                        } else {
                            fVar.a("onMarkerPress", (WritableMap) null);
                        }
                        WritableMap a3 = com.meituan.android.mrn.component.map.utils.f.a(c.this.b, marker.getPosition());
                        a3.putString("action", "marker-press");
                        a3.putString("id", String.valueOf(fVar.getId()));
                        c.this.a("onMarkerPress", a3);
                        if (c.this.j) {
                            for (com.meituan.android.mrn.component.map.view.childview.f fVar2 : c.this.g.values()) {
                                if (fVar2 != null) {
                                    if (fVar != fVar2) {
                                        fVar2.g();
                                    } else {
                                        fVar.f();
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            });
            this.b.setInfoWindowAdapter(new MTMap.InfoWindowAdapter() { // from class: com.meituan.android.mrn.component.map.view.map.c.28
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
                public final View getInfoContents(Marker marker) {
                    com.meituan.android.mrn.component.map.view.childview.f fVar;
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b48818f69e5562c67defca35bcf8c37b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b48818f69e5562c67defca35bcf8c37b");
                    }
                    if (marker == null || (fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker)) == null) {
                        return null;
                    }
                    return fVar.getInfoContents();
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
                public final View getInfoWindow(Marker marker) {
                    com.meituan.android.mrn.component.map.view.childview.f fVar;
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f2969f4df05223d6f2f4f800f77f09f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f2969f4df05223d6f2f4f800f77f09f");
                    }
                    if (marker == null || (fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker)) == null) {
                        return null;
                    }
                    return fVar.getInfoWindow();
                }
            });
            this.b.setOnInfoWindowClickListener(new MTMap.OnInfoWindowClickListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnInfoWindowClickListener
                public final void onInfoWindowClick(Marker marker) {
                    com.meituan.android.mrn.component.map.view.childview.f fVar;
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "896637c626325a391170cdfb645d07e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "896637c626325a391170cdfb645d07e5");
                    } else if (marker == null || (fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker)) == null) {
                    } else {
                        fVar.e();
                    }
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnInfoWindowClickListener
                public final void onInfoWindowClickLocation(int i, int i2, int i3, int i4) {
                }
            });
            this.b.setOnMapPoiClickListener(new MTMap.OnMapPoiClickListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapPoiClickListener
                public final void onMapPoiClick(MapPoi mapPoi) {
                    Object[] objArr4 = {mapPoi};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8bba8a2ee128320cdef2b573518cd1fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8bba8a2ee128320cdef2b573518cd1fb");
                        return;
                    }
                    if (mapPoi != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("id", mapPoi.getId());
                        createMap.putString("parentId", mapPoi.getParentID());
                        createMap.putString("name", mapPoi.getName());
                        createMap.putMap("coordinate", com.meituan.android.mrn.component.map.utils.a.a(mapPoi.getPosition()));
                        createMap.putString("extData", mapPoi.getExtraData());
                        c.this.a(MRNMapViewManager.EVENT_ON_POI_PRESS, createMap);
                    }
                    if (c.this.j) {
                        for (com.meituan.android.mrn.component.map.view.childview.f fVar : c.this.g.values()) {
                            if (fVar != null) {
                                fVar.g();
                            }
                        }
                    }
                }
            });
            this.b.setOnMarkerSelectChangeListener(new MTMap.OnMarkerSelectChangeListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerSelectChangeListener
                public final void onSelected(Marker marker) {
                    com.meituan.android.mrn.component.map.view.childview.f fVar;
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "95b4300aa1ded5b2e601e36ba9e4f154", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "95b4300aa1ded5b2e601e36ba9e4f154");
                    } else if (marker == null || (fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker)) == null) {
                    } else {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.component.map.view.childview.f.a;
                        if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "522cbd90bae7685ff9388a30cfa06ea7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "522cbd90bae7685ff9388a30cfa06ea7");
                        } else {
                            fVar.a(MRNMapMarkerViewManager.EVENT_ON_MARKER_SELECTED, (WritableMap) null);
                        }
                    }
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerSelectChangeListener
                public final void onDeselected(Marker marker) {
                    com.meituan.android.mrn.component.map.view.childview.f fVar;
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2e939265c9baa4ac0e78854366d85b0c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2e939265c9baa4ac0e78854366d85b0c");
                    } else if (marker == null || (fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker)) == null) {
                    } else {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.component.map.view.childview.f.a;
                        if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "25f766907337a89aaad3c8f8fa695f8f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "25f766907337a89aaad3c8f8fa695f8f");
                        } else {
                            fVar.a(MRNMapMarkerViewManager.EVENT_ON_MARKER_DESELECTED, (WritableMap) null);
                        }
                    }
                }
            });
            this.b.setOnPolygonClickListener(new MTMap.OnPolygonClickListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnPolygonClickListener
                public final void onPolygonClick(Polygon polygon) {
                    com.meituan.android.mrn.component.map.view.childview.g gVar;
                    Object[] objArr4 = {polygon};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "70434e7613b7f773c53ba6b6cea108d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "70434e7613b7f773c53ba6b6cea108d2");
                    } else if (polygon == null || (gVar = (com.meituan.android.mrn.component.map.view.childview.g) c.this.h.get(polygon.getId())) == null) {
                    } else {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.component.map.view.childview.g.a;
                        if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "6c086cbe9c7f065acb595bafb7dee1af", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "6c086cbe9c7f065acb595bafb7dee1af");
                            return;
                        }
                        Object[] objArr6 = {"onPress", null};
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.mrn.component.map.view.childview.g.a;
                        if (PatchProxy.isSupport(objArr6, gVar, changeQuickRedirect6, false, "506b786f87827e5dd615e67d8afc7c35", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, gVar, changeQuickRedirect6, false, "506b786f87827e5dd615e67d8afc7c35");
                        } else if (gVar.b != null) {
                            ((RCTEventEmitter) gVar.b.getJSModule(RCTEventEmitter.class)).receiveEvent(gVar.getId(), "onPress", null);
                        }
                    }
                }
            });
            this.b.setOnPolylineClickListener(new MTMap.OnPolylineClickListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnPolylineClickListener
                public final void onPolylineClick(Polyline polyline, LatLng latLng) {
                    h hVar;
                    Object[] objArr4 = {polyline, latLng};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f9998a859b9277aada2e16653d31b7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f9998a859b9277aada2e16653d31b7e");
                    } else if (polyline == null || (hVar = (h) c.this.G.get(polyline.getId())) == null) {
                    } else {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr5, hVar, changeQuickRedirect5, false, "e0ba6808db3e65037bb1a73145140aca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, hVar, changeQuickRedirect5, false, "e0ba6808db3e65037bb1a73145140aca");
                            return;
                        }
                        Object[] objArr6 = {"onPress", null};
                        ChangeQuickRedirect changeQuickRedirect6 = h.a;
                        if (PatchProxy.isSupport(objArr6, hVar, changeQuickRedirect6, false, "56707cecf4f5ca3a272ed692899a4fc4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, hVar, changeQuickRedirect6, false, "56707cecf4f5ca3a272ed692899a4fc4");
                        } else if (hVar.b != null) {
                            ((RCTEventEmitter) hVar.b.getJSModule(RCTEventEmitter.class)).receiveEvent(hVar.getId(), "onPress", null);
                        }
                    }
                }
            });
            this.b.setOnMarkerDragListener(new MTMap.OnMarkerDragListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerDragListener
                public final void onMarkerDrag(Marker marker) {
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1425e7f4beab3ffd40dcf464b6c7424f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1425e7f4beab3ffd40dcf464b6c7424f");
                        return;
                    }
                    com.meituan.android.mrn.component.map.view.childview.f fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker);
                    if (fVar == null) {
                        return;
                    }
                    fVar.a(f.a.DRAGGING, marker);
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerDragListener
                public final void onMarkerDragEnd(Marker marker) {
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ebd2f7566718344857007b673ed1e0b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ebd2f7566718344857007b673ed1e0b1");
                        return;
                    }
                    com.meituan.android.mrn.component.map.view.childview.f fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker);
                    if (fVar == null) {
                        return;
                    }
                    fVar.a(f.a.END, marker);
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMarkerDragListener
                public final void onMarkerDragStart(Marker marker) {
                    Object[] objArr4 = {marker};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ff200677ed2574f40d729e068b811d66", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ff200677ed2574f40d729e068b811d66");
                        return;
                    }
                    com.meituan.android.mrn.component.map.view.childview.f fVar = (com.meituan.android.mrn.component.map.view.childview.f) c.this.g.get(marker);
                    if (fVar == null) {
                        return;
                    }
                    fVar.a(f.a.START, marker);
                }
            });
            this.b.setOnMapAoiClickListener(new MTMap.OnMapAoiClickListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapAoiClickListener
                public final void onMapAoiClick(MapAoi mapAoi, LatLng latLng) {
                    Object[] objArr4 = {mapAoi, latLng};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "650d830e735d6ef2929ee45e3d7784d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "650d830e735d6ef2929ee45e3d7784d6");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("id", mapAoi.getId());
                    createMap.putString("name", mapAoi.getName());
                    List<LatLng> coordinates = mapAoi.getCoordinates();
                    Object[] objArr5 = {coordinates};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.component.map.utils.a.a;
                    WritableArray writableArray = null;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "4908754a424c189f5dfa4fdb2e7d7ef5", RobustBitConfig.DEFAULT_VALUE)) {
                        writableArray = (WritableArray) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "4908754a424c189f5dfa4fdb2e7d7ef5");
                    } else if (coordinates != null && coordinates.size() != 0) {
                        writableArray = new WritableNativeArray();
                        for (int i = 0; i < coordinates.size(); i++) {
                            writableArray.pushMap(com.meituan.android.mrn.component.map.utils.a.a(coordinates.get(i)));
                        }
                    }
                    createMap.putArray("coordinates", writableArray);
                    createMap.putMap("clickPosition", com.meituan.android.mrn.component.map.utils.a.a(latLng));
                    createMap.putString("extData", mapAoi.getExtraData());
                    c.this.a(MRNMapViewManager.EVENT_ON_AOI_PRESS, createMap);
                }
            });
        }
        Object[] objArr4 = {aoVar};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "088a2e3e9a98db403f18a11aa967643b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "088a2e3e9a98db403f18a11aa967643b");
        } else {
            this.e = new f(aoVar);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
            layoutParams.width = 0;
            layoutParams.height = 0;
            layoutParams.leftMargin = 99999999;
            layoutParams.rightMargin = 99999999;
            this.e.setLayoutParams(layoutParams);
            this.d.addView(this.e);
        }
        this.d.onStart();
        this.I = new LifecycleEventListener() { // from class: com.meituan.android.mrn.component.map.view.map.c.12
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public final void onHostDestroy() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0bc6c32f68ed85a86dc75876ea6c2c1d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0bc6c32f68ed85a86dc75876ea6c2c1d");
                    return;
                }
                com.meituan.android.mrn.component.map.utils.e.a("qcs_lbs", "qcs_lbs_mrnmap_log", "onHostDestroy: " + str);
                c.this.b();
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public final void onHostPause() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a3527b0a152ee03b2d74306ff41a471c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a3527b0a152ee03b2d74306ff41a471c");
                    return;
                }
                com.meituan.android.mrn.component.map.utils.e.a("qcs_lbs", "qcs_lbs_mrnmap_log", "onHostPause: " + str);
                c.this.a();
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public final void onHostResume() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "33cbb3bd5fb097305ff3094528348a88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "33cbb3bd5fb097305ff3094528348a88");
                    return;
                }
                g gVar = c.this.J;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = g.a;
                if (PatchProxy.isSupport(objArr6, gVar, changeQuickRedirect6, false, "ebc166b29d18806cf5f8c8088dd8d0fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, gVar, changeQuickRedirect6, false, "ebc166b29d18806cf5f8c8088dd8d0fd");
                } else {
                    ScheduledFuture scheduledFuture = gVar.e;
                    ScheduledExecutorService scheduledExecutorService = gVar.d;
                    if (scheduledFuture != null && scheduledFuture.isCancelled() && scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                        try {
                            gVar.e = scheduledExecutorService.scheduleAtFixedRate(gVar.c, 0L, 25L, TimeUnit.MILLISECONDS);
                        } catch (Exception e) {
                            com.meituan.android.mrn.component.map.utils.e.a(e, "other");
                        }
                    }
                }
                synchronized (c.this) {
                    if (c.this.A) {
                        return;
                    }
                    com.meituan.android.mrn.component.map.utils.e.a("qcs_lbs", "qcs_lbs_mrnmap_log", "onHostResume: " + str);
                    if (c.this.d != null) {
                        c.this.d.onResume();
                    }
                    c.a(c.this, false);
                }
            }
        };
        com.meituan.android.mrn.event.listeners.e.a(aoVar, this.I);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7254c7a67a0f0e7c6530280ff77d553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7254c7a67a0f0e7c6530280ff77d553");
            return;
        }
        g gVar = this.J;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "8b6b814c6f1f681d7873d3be04776f84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "8b6b814c6f1f681d7873d3be04776f84");
        } else if (gVar.e != null) {
            gVar.e.cancel(true);
        }
        synchronized (this) {
            if (!this.A) {
                this.d.onPause();
            }
            this.S = true;
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "606a2264ec6b6e920cae69547bde790b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "606a2264ec6b6e920cae69547bde790b");
        } else if (this.A) {
        } else {
            com.meituan.android.mrn.component.map.utils.e.a("qcs_lbs", "qcs_lbs_mrnmap_log", "doDestroy: " + this.y);
            if (this.c != null && this.I != null) {
                this.I = null;
            }
            if (!this.S) {
                a();
                this.S = true;
                this.A = true;
            }
            this.d.onStop();
            if (this.b != null) {
                this.b.clear();
                this.b.setOnMapLoadedListener(null);
                this.b.setOnCameraChangeListener(null);
                this.b.setOnMapClickListener(null);
                this.b.setOnMarkerClickListener(null);
                this.b.setInfoWindowAdapter(null);
                this.b.setOnInfoWindowClickListener(null);
                this.b.setOnMapPoiClickListener(null);
                this.b.setOnMarkerSelectChangeListener(null);
                this.b.setOnPolygonClickListener(null);
                this.b.setOnPolylineClickListener(null);
                this.b.setOnMapLongClickListener(null);
            }
            f();
            this.d.onDestroy();
            this.h.clear();
            this.G.clear();
            this.H.clear();
            g gVar = this.J;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "918f48a7c3745ecc3292751dd5bf1117", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "918f48a7c3745ecc3292751dd5bf1117");
            } else if (gVar.d != null) {
                gVar.d.shutdownNow();
            }
            h();
        }
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b62fc5c0261d79faf9066e0feb166e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b62fc5c0261d79faf9066e0feb166e");
        } else if (this.A || i > this.f.size()) {
        } else {
            if (view instanceof com.meituan.android.mrn.component.map.view.childview.f) {
                com.meituan.android.mrn.component.map.view.childview.f fVar = (com.meituan.android.mrn.component.map.view.childview.f) view;
                fVar.setIconIdMap(this.H);
                fVar.setViewTracker(this.J);
                this.f.add(i, fVar);
                int visibility = view.getVisibility();
                view.setVisibility(4);
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                this.e.addView(view);
                view.setVisibility(visibility);
                fVar.setParentMapView((com.meituan.android.mrn.component.map.view.map.a) this.d);
                MTMap mTMap = this.b;
                Object[] objArr2 = {mTMap};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.component.map.view.childview.f.a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "70aca8c993fd9b2aba2ee8ffb500b22a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "70aca8c993fd9b2aba2ee8ffb500b22a");
                } else {
                    fVar.d = mTMap;
                    if (fVar.c != null) {
                        fVar.c.remove();
                        fVar.c = null;
                    }
                    fVar.d();
                }
                this.g.put(fVar.getMarker(), fVar);
            } else if (view instanceof com.meituan.android.mrn.component.map.view.childview.g) {
                com.meituan.android.mrn.component.map.view.childview.g gVar = (com.meituan.android.mrn.component.map.view.childview.g) view;
                gVar.setPolygonMap(this.h);
                this.f.add(i, gVar);
                MTMap mTMap2 = this.b;
                Object[] objArr3 = {mTMap2};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.component.map.view.childview.g.a;
                if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "497cd3e137f9b60a6c0ce8a6c1656c76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "497cd3e137f9b60a6c0ce8a6c1656c76");
                } else {
                    gVar.c = mTMap2;
                    if (gVar.d != null) {
                        gVar.d.remove();
                        gVar.d = null;
                    }
                    gVar.a();
                }
                this.h.put(gVar.getPolygonId(), gVar);
            } else if (view instanceof com.meituan.android.mrn.component.map.view.childview.b) {
                com.meituan.android.mrn.component.map.view.childview.b bVar = (com.meituan.android.mrn.component.map.view.childview.b) view;
                this.f.add(i, bVar);
                MTMap mTMap3 = this.b;
                Object[] objArr4 = {mTMap3};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.view.childview.b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "287708d004d3e86c09ac2bb9f831fce6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "287708d004d3e86c09ac2bb9f831fce6");
                    return;
                }
                bVar.b = mTMap3;
                if (bVar.c != null) {
                    bVar.c.remove();
                    bVar.c = null;
                }
                bVar.a();
            } else if (view instanceof h) {
                h hVar = (h) view;
                this.f.add(i, hVar);
                hVar.setPolylineMap(this.G);
                MTMap mTMap4 = this.b;
                Object[] objArr5 = {mTMap4};
                ChangeQuickRedirect changeQuickRedirect5 = h.a;
                if (PatchProxy.isSupport(objArr5, hVar, changeQuickRedirect5, false, "a2cfdec3feba6f683afc12100bb97c35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, hVar, changeQuickRedirect5, false, "a2cfdec3feba6f683afc12100bb97c35");
                    return;
                }
                hVar.d = mTMap4;
                if (hVar.c != null) {
                    hVar.c.remove();
                    hVar.c = null;
                }
                hVar.a();
            } else if (view instanceof k) {
                k kVar = (k) view;
                this.f.add(i, kVar);
                MTMap mTMap5 = this.b;
                Object[] objArr6 = {mTMap5};
                ChangeQuickRedirect changeQuickRedirect6 = k.a;
                if (PatchProxy.isSupport(objArr6, kVar, changeQuickRedirect6, false, "f88ebc4b95b8f79a329e90acfb1b0751", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, kVar, changeQuickRedirect6, false, "f88ebc4b95b8f79a329e90acfb1b0751");
                    return;
                }
                kVar.g = mTMap5;
                if (kVar.h != null) {
                    kVar.h.remove();
                    kVar.h = null;
                }
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = k.a;
                if (PatchProxy.isSupport(objArr7, kVar, changeQuickRedirect7, false, "aa232b86d595fbe7ab0c84a8f47e38bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, kVar, changeQuickRedirect7, false, "aa232b86d595fbe7ab0c84a8f47e38bf");
                } else if (kVar.g == null || kVar.h != null || kVar.b == null || kVar.b.size() <= 0) {
                } else {
                    kVar.h = kVar.g.addHeatOverlay(new HeatOverlayOptions().setWeightedData(kVar.b).setRadius(kVar.c).setAlpha(kVar.d).setStartPoints(kVar.f).setColors(kVar.e));
                    if (kVar.h == null) {
                        com.meituan.android.mrn.component.map.utils.e.a(new RuntimeException("Map sdk error! heatOverlay is null :" + kVar.toString()), "other");
                    }
                }
            } else if (view instanceof j) {
                j jVar = (j) view;
                this.f.add(i, jVar);
                MTMap mTMap6 = this.b;
                Object[] objArr8 = {mTMap6};
                ChangeQuickRedirect changeQuickRedirect8 = j.a;
                if (PatchProxy.isSupport(objArr8, jVar, changeQuickRedirect8, false, "7040179dbfd4e212342aafcb33ed886e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, jVar, changeQuickRedirect8, false, "7040179dbfd4e212342aafcb33ed886e");
                    return;
                }
                jVar.b = mTMap6;
                if (jVar.c != null) {
                    jVar.c.remove();
                    jVar.c = null;
                }
                jVar.a();
            } else if (!(view instanceof com.meituan.android.mrn.component.map.view.childview.tile.b)) {
                if (view instanceof i) {
                    i iVar = (i) view;
                    this.f.add(i, iVar);
                    MTMap mTMap7 = this.b;
                    Object[] objArr9 = {mTMap7};
                    ChangeQuickRedirect changeQuickRedirect9 = i.a;
                    if (PatchProxy.isSupport(objArr9, iVar, changeQuickRedirect9, false, "55c403cc7af2575626cc9aa235e7ae73", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, iVar, changeQuickRedirect9, false, "55c403cc7af2575626cc9aa235e7ae73");
                        return;
                    }
                    iVar.b = mTMap7;
                    if (iVar.c != null) {
                        iVar.c.remove();
                        iVar.c = null;
                    }
                    iVar.a();
                }
            } else {
                com.meituan.android.mrn.component.map.view.childview.tile.b bVar2 = (com.meituan.android.mrn.component.map.view.childview.tile.b) view;
                this.f.add(i, bVar2);
                MTMap mTMap8 = this.b;
                Object[] objArr10 = {mTMap8};
                ChangeQuickRedirect changeQuickRedirect10 = com.meituan.android.mrn.component.map.view.childview.tile.b.a;
                if (PatchProxy.isSupport(objArr10, bVar2, changeQuickRedirect10, false, "e0e155c3397716715a34a515d49d6ab7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, bVar2, changeQuickRedirect10, false, "e0e155c3397716715a34a515d49d6ab7");
                    return;
                }
                bVar2.c = mTMap8;
                bVar2.a();
                Object[] objArr11 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect11 = com.meituan.android.mrn.component.map.view.childview.tile.b.a;
                if (PatchProxy.isSupport(objArr11, bVar2, changeQuickRedirect11, false, "7cd1b0c648831c3b1764d3a64102d580", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, bVar2, changeQuickRedirect11, false, "7cd1b0c648831c3b1764d3a64102d580");
                } else if (bVar2.c == null || bVar2.d != null) {
                } else {
                    com.meituan.android.mrn.component.map.view.childview.tile.a aVar = bVar2.e;
                    TileOverlay addTileOverlay = bVar2.c.addTileOverlay(new TileOverlayOptions().betterQuality(aVar.c).zIndex(aVar.b).tileProvider(new com.meituan.android.mrn.component.map.view.childview.tile.c(bVar2.b, new b.c())));
                    if (addTileOverlay == null) {
                        com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MTMap addTileOverlay return null"), "param");
                    }
                    bVar2.d = addTileOverlay;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.facebook.react.bridge.ReadableMap r19) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.map.view.map.c.a(com.facebook.react.bridge.ReadableMap):void");
    }

    public void g() {
        List<l> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39040f2c3e0e9c1ac0d48c509f5a499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39040f2c3e0e9c1ac0d48c509f5a499");
        } else if (!this.A && (list = this.D) != null) {
            for (l lVar : list) {
                if (lVar != null && !lVar.n) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = l.a;
                    if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "ad7713876990333aa9ffefdec33b3325", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "ad7713876990333aa9ffefdec33b3325");
                    } else if (!lVar.n) {
                        for (int i = 0; i < lVar.h; i++) {
                            lVar.o[i] = new l.a(i);
                            l.a aVar = lVar.o[i];
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = l.a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cfd327bdd17c4a8eca0f450bf217d94c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cfd327bdd17c4a8eca0f450bf217d94c");
                            } else {
                                aVar.postDelayed(aVar.b, aVar.c);
                            }
                        }
                        lVar.n = true;
                    }
                }
            }
        }
    }

    public final void a(List<String> list) {
        List<l> list2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe161288959e3bd6d163e7714d1c7ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe161288959e3bd6d163e7714d1c7ed");
        } else if (list != null && list.size() != 0 && (list2 = this.D) != null) {
            for (String str : list) {
                Iterator<l> it = list2.iterator();
                while (it.hasNext()) {
                    l next = it.next();
                    if (next != null && !TextUtils.isEmpty(str) && str.equals(next.p)) {
                        next.a();
                        it.remove();
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(c cVar, String str, int i, CameraUpdateMessage cameraUpdateMessage) {
        Object[] objArr = {str, Integer.valueOf(i), cameraUpdateMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "3a2431a6c7698184562d1e5f4494cb34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "3a2431a6c7698184562d1e5f4494cb34");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("cameraEvent", str);
        createMap.putInt("status", i);
        if (cameraUpdateMessage != null) {
            if (cameraUpdateMessage.latLngBounds != null) {
                createMap.putMap("latLngBounds", com.meituan.android.mrn.component.map.utils.a.a(cameraUpdateMessage.latLngBounds));
            }
            if (cameraUpdateMessage.latLng != null) {
                createMap.putMap("center", com.meituan.android.mrn.component.map.utils.a.a(cameraUpdateMessage.latLng));
            }
            if (cameraUpdateMessage.zoom > 0.0d) {
                createMap.putDouble("zoom", cameraUpdateMessage.zoom);
            }
        }
        cVar.a(MRNMapViewManager.EVENT_ON_ANIMATE_CAMRERA, createMap);
    }
}
