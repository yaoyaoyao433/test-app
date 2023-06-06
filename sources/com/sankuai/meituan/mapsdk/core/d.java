package com.sankuai.meituan.mapsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.mtmap.rendersdk.MapObserver;
import com.meituan.mtmap.rendersdk.style.layer.Layer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.sankuai.meituan.mapsdk.core.annotations.ab;
import com.sankuai.meituan.mapsdk.core.annotations.l;
import com.sankuai.meituan.mapsdk.core.annotations.m;
import com.sankuai.meituan.mapsdk.core.annotations.o;
import com.sankuai.meituan.mapsdk.core.annotations.p;
import com.sankuai.meituan.mapsdk.core.annotations.s;
import com.sankuai.meituan.mapsdk.core.annotations.v;
import com.sankuai.meituan.mapsdk.core.annotations.w;
import com.sankuai.meituan.mapsdk.core.annotations.x;
import com.sankuai.meituan.mapsdk.core.h;
import com.sankuai.meituan.mapsdk.core.i;
import com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener;
import com.sankuai.meituan.mapsdk.core.render.annotation.RenderEngineThreadHandler;
import com.sankuai.meituan.mapsdk.core.widgets.IndoorControlView;
import com.sankuai.meituan.mapsdk.core.widgets.ZoomControlView;
import com.sankuai.meituan.mapsdk.maps.AbsMTMap;
import com.sankuai.meituan.mapsdk.maps.CameraMapGestureType;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.MTCustomRenderer;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.MapUtils;
import com.sankuai.meituan.mapsdk.maps.OnCameraChangeExtraListener;
import com.sankuai.meituan.mapsdk.maps.OnCameraChangeExtraListener2;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.interfaces.n;
import com.sankuai.meituan.mapsdk.maps.interfaces.q;
import com.sankuai.meituan.mapsdk.maps.interfaces.r;
import com.sankuai.meituan.mapsdk.maps.interfaces.t;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import com.sankuai.meituan.mapsdk.maps.interfaces.z;
import com.sankuai.meituan.mapsdk.maps.model.Arc;
import com.sankuai.meituan.mapsdk.maps.model.ArcOptions;
import com.sankuai.meituan.mapsdk.maps.model.Arrow;
import com.sankuai.meituan.mapsdk.maps.model.ArrowOptions;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.CustomMapStyleOptions;
import com.sankuai.meituan.mapsdk.maps.model.DynamicMap;
import com.sankuai.meituan.mapsdk.maps.model.EngineMode;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlay;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlay;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlay;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MapAoi;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.MapPoi;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import com.sankuai.meituan.mapsdk.maps.model.Polygon;
import com.sankuai.meituan.mapsdk.maps.model.PolygonOptions;
import com.sankuai.meituan.mapsdk.maps.model.Polyline;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.sankuai.meituan.mapsdk.maps.model.Projection;
import com.sankuai.meituan.mapsdk.maps.model.RestrictBoundsFitMode;
import com.sankuai.meituan.mapsdk.maps.model.Text;
import com.sankuai.meituan.mapsdk.maps.model.TextOptions;
import com.sankuai.meituan.mapsdk.maps.model.TileCacheType;
import com.sankuai.meituan.mapsdk.maps.model.TileOverlay;
import com.sankuai.meituan.mapsdk.maps.model.TileOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.TrafficStyle;
import com.sankuai.meituan.mapsdk.maps.model.VisibleRegion;
import com.sankuai.meituan.mapsdk.maps.model.WeatherEffect;
import com.sankuai.meituan.mapsdk.maps.model.WeatherType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends AbsMTMap implements MapObserver, IMTMap {
    public static ChangeQuickRedirect a;
    private static Map<String, d> am = new HashMap();
    private Projection A;
    private com.sankuai.meituan.mapsdk.core.c B;
    private com.sankuai.meituan.mapsdk.core.a C;
    private float D;
    private float E;
    private MTMap.OnMapScreenShotListener F;
    private MTMap.OnMapPoiClickListener G;
    private MTMap.OnMapAoiClickListener H;
    private z I;
    private List<z> J;
    private MTMap.OnMapLoadedListener K;
    private final List<MTMap.OnMapLoadedListener> L;
    private int M;
    private boolean N;
    private String O;
    private TrafficStyle P;
    private boolean Q;
    private boolean R;
    private EngineMode S;
    private CameraPosition T;
    private long U;
    private List<i> V;
    private final CopyOnWriteArrayList<OnMapChangedListener> W;
    private String X;
    private final ab Y;
    private final Map<String, WeatherEffect> Z;
    private final com.sankuai.meituan.mapsdk.core.utils.e aa;
    private long ab;
    private long ac;
    private String ad;
    private String ae;
    private volatile boolean af;
    private volatile boolean ag;
    private volatile boolean ah;
    private boolean ai;
    private long aj;
    private Map<String, Object> ak;
    private com.sankuai.meituan.mapsdk.core.gesture.c al;
    private String an;
    private boolean ao;
    public int b;
    public e c;
    public com.sankuai.meituan.mapsdk.core.render.a d;
    h e;
    public com.sankuai.meituan.mapsdk.core.annotations.i f;
    com.sankuai.meituan.mapsdk.core.location.b g;
    com.sankuai.meituan.mapsdk.core.widgets.d h;
    public boolean i;
    com.sankuai.meituan.mapsdk.core.render.egl.c j;
    final Object k;
    w l;
    g m;
    String n;
    public String o;
    boolean p;
    public Handler q;
    int r;
    private j y;
    private UiSettings z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static String a = "Light";
        public static String b = "Dark";
        public static String c = "Satellite";
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addDynamicMapGeoJSON(String str, String str2, String str3) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void changeTilt(float f) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap
    public final void destroy() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final String getMapContentApprovalNumber() {
        return "GS(2019)4352号";
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isMultiInfoWindowEnabled() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeDynamicMapGeoJSON(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void resetDynamicMapFeature(String str, String str2) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void runOnDrawFrame() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setDynamicMapGeoJSON(String str, String str2) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setHandDrawMapEnable(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorFloor(String str, String str2, int i) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapViewStyle(boolean z, CustomMapStyleOptions customMapStyleOptions) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapRenderCallback(MTMap.OnMapRenderCallback onMapRenderCallback) {
    }

    public static /* synthetic */ void a(d dVar, Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "8c791a7023679745b30547138e10570f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "8c791a7023679745b30547138e10570f");
            return;
        }
        Bitmap bitmap = (Bitmap) message.getData().getParcelable("map_bitmap");
        if (dVar.F != null) {
            dVar.F.onMapScreenShot(bitmap, dVar.af ? 1 : 0);
            if (!dVar.af || dVar.F == null) {
                return;
            }
            dVar.F.onMapScreenShot(bitmap);
        }
    }

    public static /* synthetic */ void b(d dVar, Message message) {
        MapPoi mapPoi;
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "d12e215c590e4c9ec8f01ab6906521eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "d12e215c590e4c9ec8f01ab6906521eb");
        } else if (dVar.G == null || (mapPoi = (MapPoi) message.getData().getParcelable("map_poi")) == null) {
        } else {
            dVar.G.onMapPoiClick(mapPoi);
        }
    }

    public static /* synthetic */ void c(d dVar, Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "56a2afe585d160a2e41eb6060adb1742", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "56a2afe585d160a2e41eb6060adb1742");
        } else if (dVar.H != null) {
            MapAoi mapAoi = (MapAoi) message.getData().getParcelable("map_aoi");
            LatLng latLng = (LatLng) message.getData().getParcelable("map_aoi_click_lat_lng");
            if (mapAoi != null) {
                dVar.H.onMapAoiClick(mapAoi, latLng);
            }
        }
    }

    public static /* synthetic */ boolean c(d dVar, boolean z) {
        dVar.ah = true;
        return true;
    }

    public static d a(e eVar, String str, Platform platform, String str2) {
        d dVar;
        Object[] objArr = {eVar, str, platform, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0511fd997256a33887a853ce9f6d857", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0511fd997256a33887a853ce9f6d857");
        }
        String str3 = str + eVar.b.getReuseEngineTag();
        if (!TextUtils.isEmpty(str) && eVar.b.getEngineMode() == EngineMode.REUSE && (dVar = am.get(str3)) != null && dVar.S == EngineMode.REUSE) {
            dVar.r++;
            return dVar;
        }
        d dVar2 = new d(eVar, str, platform, str2);
        dVar2.an = str3;
        dVar2.S = eVar.b.getEngineMode();
        am.put(str3, dVar2);
        return dVar2;
    }

    private d(e eVar, String str, Platform platform, String str2) {
        Object[] objArr = {eVar, str, platform, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a26d9d9b76946a2a5d8b5acf176ea7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a26d9d9b76946a2a5d8b5acf176ea7");
            return;
        }
        this.b = -1;
        this.D = 19.0f;
        this.E = 2.0f;
        this.J = new ArrayList();
        this.L = new CopyOnWriteArrayList();
        this.M = 1;
        byte[] bArr = null;
        this.O = null;
        this.S = EngineMode.DEFAULT;
        this.T = null;
        this.i = false;
        this.U = 0L;
        this.V = new CopyOnWriteArrayList();
        this.W = new CopyOnWriteArrayList<>();
        this.k = new Object();
        this.X = "MTCustomLayer01";
        this.Z = new ArrayMap();
        this.aa = new com.sankuai.meituan.mapsdk.core.utils.e();
        this.ab = -1L;
        this.ac = -1L;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.ak = new ArrayMap();
        this.p = true;
        this.al = new com.sankuai.meituan.mapsdk.core.gesture.c() { // from class: com.sankuai.meituan.mapsdk.core.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean a(int i, int i2, int i3) {
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final void b() {
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean b(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean a(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3a212f46887f4dd0edc49833c168dee", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3a212f46887f4dd0edc49833c168dee")).booleanValue();
                }
                d.this.updateCameraChangedType(1);
                d.this.mCameraMapGestureType = CameraMapGestureType.DOUBLE_TAP;
                if (d.this.J != null && !d.this.J.isEmpty()) {
                    for (z zVar : d.this.J) {
                        zVar.a(f, f2);
                    }
                }
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final void b(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21326264a14430a468b69800c87ec75b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21326264a14430a468b69800c87ec75b");
                    return;
                }
                d.this.updateCameraChangedType(1);
                if (d.this.J == null || d.this.J.isEmpty()) {
                    return;
                }
                Iterator it = d.this.J.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean a(double d, double d2, double d3, double d4) {
                Object[] objArr2 = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e9dcfac70a9c457ba8cbf3268ee5331", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e9dcfac70a9c457ba8cbf3268ee5331")).booleanValue();
                }
                d.this.updateCameraChangedType(1);
                d.this.mCameraMapGestureType = CameraMapGestureType.PAN;
                if (d.this.J != null && !d.this.J.isEmpty()) {
                    Iterator it = d.this.J.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final void a(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47a43d77f9ed394ce31443a027a293a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47a43d77f9ed394ce31443a027a293a3");
                } else if (d.this.J == null || d.this.J.isEmpty()) {
                } else {
                    Iterator it = d.this.J.iterator();
                    while (it.hasNext()) {
                        it.next();
                        motionEvent.getX();
                        motionEvent.getY();
                    }
                }
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7314bd4fdae845ddde6d3f777c3a3b13", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7314bd4fdae845ddde6d3f777c3a3b13");
                } else if (d.this.J != null && !d.this.J.isEmpty()) {
                    for (z zVar : d.this.J) {
                        zVar.a();
                    }
                }
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean a(double d, double d2) {
                Object[] objArr2 = {Double.valueOf(d), Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05d7c66ef2d3626b63bab66636b63933", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05d7c66ef2d3626b63bab66636b63933")).booleanValue();
                }
                d.this.updateCameraChangedType(1);
                d.this.mCameraMapGestureType = CameraMapGestureType.PAN;
                if (d.this.J != null && !d.this.J.isEmpty()) {
                    for (z zVar : d.this.J) {
                        zVar.b((float) d, (float) d2);
                    }
                }
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean a(double d, double d2, double d3, int i, boolean z) {
                Object[] objArr2 = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cb82bc2e07c41163c858da78901b516", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cb82bc2e07c41163c858da78901b516")).booleanValue();
                }
                d.this.mCameraMapGestureType = CameraMapGestureType.PINCH;
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean a(double d, float f, float f2) {
                Object[] objArr2 = {Double.valueOf(d), Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ffc3b3c10752a48a18ac87e163e5051", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ffc3b3c10752a48a18ac87e163e5051")).booleanValue();
                }
                d.this.mCameraMapGestureType = CameraMapGestureType.ROTATE;
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean a(double d) {
                Object[] objArr2 = {Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20aad0bc2ecd84ff25be855a5e082254", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20aad0bc2ecd84ff25be855a5e082254")).booleanValue();
                }
                d.this.mCameraMapGestureType = CameraMapGestureType.TILT;
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean c(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1a8c28e6ef9d78a1097d794a6386de1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1a8c28e6ef9d78a1097d794a6386de1")).booleanValue();
                }
                d.this.mCameraMapGestureType = CameraMapGestureType.PINCH;
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final boolean c(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "796044e253e497a20b7c16eeb707f403", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "796044e253e497a20b7c16eeb707f403")).booleanValue();
                }
                if (d.this.J != null && !d.this.J.isEmpty()) {
                    Iterator it = d.this.J.iterator();
                    while (it.hasNext()) {
                        it.next();
                        motionEvent.getX();
                        motionEvent.getY();
                    }
                }
                return false;
            }

            @Override // com.sankuai.meituan.mapsdk.core.gesture.c
            public final void d(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed76c36dd096b2e573621c98c514b915", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed76c36dd096b2e573621c98c514b915");
                } else if (d.this.J == null || d.this.J.isEmpty()) {
                } else {
                    Iterator it = d.this.J.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        };
        this.q = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.meituan.mapsdk.core.d.2
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70c33d81934dd172f9f9a288a401b329", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70c33d81934dd172f9f9a288a401b329");
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    d.a(d.this, message);
                    return;
                }
                switch (i) {
                    case 3:
                        d.b(d.this, message);
                        return;
                    case 4:
                        d.c(d.this, message);
                        return;
                    default:
                        return;
                }
            }
        };
        this.an = "";
        this.r = 0;
        this.ao = true;
        this.c = eVar;
        this.r++;
        String customMapStylePath = eVar.b.getCustomMapStylePath();
        String localMapStyleRes = eVar.b.getLocalMapStyleRes();
        String a2 = TextUtils.isEmpty(customMapStylePath) ? "" : com.sankuai.meituan.mapsdk.mapcore.utils.g.a(customMapStylePath.getBytes());
        if (!TextUtils.isEmpty(customMapStylePath) && !TextUtils.isEmpty(localMapStyleRes)) {
            bArr = com.sankuai.meituan.mapsdk.mapcore.utils.g.a(eVar.getContext(), localMapStyleRes);
        }
        this.d = RenderEngineThreadHandler.getRenderEngine(new com.sankuai.meituan.mapsdk.core.render.b(eVar.getContext(), str, platform, str2, this, this.aa, true, eVar.b.getBasemapSourceType(), bArr, a2));
        this.d.setRasterForeign(eVar.b.isOverseasMapEnabled());
        this.j = new com.sankuai.meituan.mapsdk.core.render.egl.c(this);
        com.sankuai.meituan.mapsdk.core.render.egl.c cVar = this.j;
        Object[] objArr2 = {0};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.egl.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "be0212d9593bfb00031a174ae87d1751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "be0212d9593bfb00031a174ae87d1751");
        } else {
            synchronized (com.sankuai.meituan.mapsdk.core.render.egl.c.d) {
                cVar.i = 0;
                com.sankuai.meituan.mapsdk.core.render.egl.c.d.notifyAll();
            }
        }
        this.j.start();
        this.A = new Projection(new f(this));
        this.e = new h(this);
        this.y = new j(this);
        this.B = new com.sankuai.meituan.mapsdk.core.c(this);
        this.m = new g(this);
        this.f = new com.sankuai.meituan.mapsdk.core.annotations.i(this.B, this);
        this.g = new com.sankuai.meituan.mapsdk.core.location.b(this.B, this);
        this.h = new com.sankuai.meituan.mapsdk.core.widgets.d(this);
        this.C = new com.sankuai.meituan.mapsdk.core.a(this.d, this.y);
        this.Y = new ab(this);
        this.o = str;
        this.aj = System.currentTimeMillis();
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aeaf2225a96eca23d8a3598f1d4bb69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aeaf2225a96eca23d8a3598f1d4bb69");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.egl.c cVar = this.j;
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.egl.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "a2d6e894c14492a680f7aa55054c14b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "a2d6e894c14492a680f7aa55054c14b9");
            return;
        }
        synchronized (com.sankuai.meituan.mapsdk.core.render.egl.c.d) {
            cVar.b.g.add(obj);
            com.sankuai.meituan.mapsdk.core.render.egl.c.d.notifyAll();
        }
    }

    public final void a(Object obj, int i, int i2) {
        Object[] objArr = {obj, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46409fb2cb1fb1d155eb4b7f3ea0c9d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46409fb2cb1fb1d155eb4b7f3ea0c9d9");
        } else {
            this.j.a(obj, i, i2);
        }
    }

    public final void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35489c9bdd757dab83a62331c50b5894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35489c9bdd757dab83a62331c50b5894");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.egl.c cVar = this.j;
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.egl.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "a0656c4f9f5043a6b9577f7c5a491b13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "a0656c4f9f5043a6b9577f7c5a491b13");
            return;
        }
        synchronized (com.sankuai.meituan.mapsdk.core.render.egl.c.d) {
            cVar.b.h.add(obj);
            com.sankuai.meituan.mapsdk.core.render.egl.c.d.notifyAll();
            while (cVar.b.f.containsKey(obj) && !cVar.f) {
                try {
                    com.sankuai.meituan.mapsdk.core.render.egl.c.d.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0c1454fb1d0190f3a679fd766f83266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0c1454fb1d0190f3a679fd766f83266");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("coordinate", str2);
        com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_add_one_annotation", hashMap);
    }

    public final void a(MapViewOptions mapViewOptions, e eVar) {
        Object[] objArr = {mapViewOptions, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a388b6aacde17db408240dc07512d153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a388b6aacde17db408240dc07512d153");
            return;
        }
        if (this.r == 1) {
            this.d.d(this.D);
            this.d.e(this.E);
            i();
            setCustomMapStylePath(mapViewOptions.getCustomMapStylePath());
            this.e.a(mapViewOptions);
            this.y.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d797ecf784ed80ad2e7ab73b2edf390", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d797ecf784ed80ad2e7ab73b2edf390");
            } else {
                this.e.d = this.y;
                setIndoorEnabled(false);
                this.W.add(new a());
                this.W.add(this.y);
                this.W.add(this.f);
                this.W.add(this.e);
                h hVar = this.e;
                com.sankuai.meituan.mapsdk.core.gesture.c cVar = this.al;
                Object[] objArr3 = {cVar, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "56b8f2d2c70f7283807610e034c3e38c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "56b8f2d2c70f7283807610e034c3e38c");
                } else {
                    hVar.b.a(cVar, true);
                }
                h hVar2 = this.e;
                MTMap.OnCameraChangeListener onCameraChangeListener = new MTMap.OnCameraChangeListener() { // from class: com.sankuai.meituan.mapsdk.core.d.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
                    public final void onCameraChange(CameraPosition cameraPosition) {
                        Object[] objArr4 = {cameraPosition};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2fd87f7d32e9a3c3d9bff0599d37607b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2fd87f7d32e9a3c3d9bff0599d37607b");
                            return;
                        }
                        if (d.this.mOnCameraChangeListener != null) {
                            if (!(d.this.mOnCameraChangeListener instanceof OnCameraChangeExtraListener)) {
                                if (!(d.this.mOnCameraChangeListener instanceof OnCameraChangeExtraListener2)) {
                                    d.this.mOnCameraChangeListener.onCameraChange(cameraPosition);
                                } else {
                                    ((OnCameraChangeExtraListener2) d.this.mOnCameraChangeListener).onCameraChange(cameraPosition, d.this.mCameraChangedType == 1, d.this.mCameraMapGestureType);
                                }
                            } else {
                                ((OnCameraChangeExtraListener) d.this.mOnCameraChangeListener).onCameraChange(cameraPosition, d.this.mCameraChangedType == 1);
                            }
                        }
                        if (d.this.mOnCameraChangeListeners != null && !d.this.mOnCameraChangeListeners.isEmpty()) {
                            for (MTMap.OnCameraChangeListener onCameraChangeListener2 : d.this.mOnCameraChangeListeners) {
                                if (onCameraChangeListener2 != null) {
                                    if (onCameraChangeListener2 instanceof OnCameraChangeExtraListener) {
                                        ((OnCameraChangeExtraListener) onCameraChangeListener2).onCameraChange(cameraPosition, d.this.mCameraChangedType == 1);
                                    } else if (onCameraChangeListener2 instanceof OnCameraChangeExtraListener2) {
                                        ((OnCameraChangeExtraListener2) onCameraChangeListener2).onCameraChange(cameraPosition, d.this.mCameraChangedType == 1, d.this.mCameraMapGestureType);
                                    } else {
                                        onCameraChangeListener2.onCameraChange(cameraPosition);
                                    }
                                }
                            }
                        }
                        if (d.this.C != null) {
                            d.this.C.onCameraChange(cameraPosition);
                        }
                    }

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
                    public final void onCameraChangeFinish(CameraPosition cameraPosition) {
                        Object[] objArr4 = {cameraPosition};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "165fc039ab1d9549c864aab0a53c6ae6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "165fc039ab1d9549c864aab0a53c6ae6");
                            return;
                        }
                        if (d.this.mOnCameraChangeListener != null) {
                            if (!(d.this.mOnCameraChangeListener instanceof OnCameraChangeExtraListener)) {
                                if (!(d.this.mOnCameraChangeListener instanceof OnCameraChangeExtraListener2)) {
                                    d.this.mOnCameraChangeListener.onCameraChangeFinish(cameraPosition);
                                } else {
                                    ((OnCameraChangeExtraListener2) d.this.mOnCameraChangeListener).onCameraChangeFinish(cameraPosition, d.this.mCameraChangedType == 1, d.this.mCameraMapGestureType);
                                }
                            } else {
                                ((OnCameraChangeExtraListener) d.this.mOnCameraChangeListener).onCameraChangeFinish(cameraPosition, d.this.mCameraChangedType == 1);
                            }
                        }
                        if (d.this.mOnCameraChangeListeners != null && !d.this.mOnCameraChangeListeners.isEmpty()) {
                            for (MTMap.OnCameraChangeListener onCameraChangeListener2 : d.this.mOnCameraChangeListeners) {
                                if (onCameraChangeListener2 != null) {
                                    if (onCameraChangeListener2 instanceof OnCameraChangeExtraListener) {
                                        ((OnCameraChangeExtraListener) onCameraChangeListener2).onCameraChangeFinish(cameraPosition, d.this.mCameraChangedType == 1);
                                    } else if (onCameraChangeListener2 instanceof OnCameraChangeExtraListener2) {
                                        ((OnCameraChangeExtraListener2) onCameraChangeListener2).onCameraChangeFinish(cameraPosition, d.this.mCameraChangedType == 1, d.this.mCameraMapGestureType);
                                    } else {
                                        onCameraChangeListener2.onCameraChangeFinish(cameraPosition);
                                    }
                                }
                            }
                        }
                        d.this.updateCameraChangedType(0);
                        d.this.resetCameraGestureType();
                    }
                };
                Object[] objArr4 = {onCameraChangeListener};
                ChangeQuickRedirect changeQuickRedirect4 = h.a;
                if (PatchProxy.isSupport(objArr4, hVar2, changeQuickRedirect4, false, "a5a6252f42f50616ee046ef817bfbc42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, hVar2, changeQuickRedirect4, false, "a5a6252f42f50616ee046ef817bfbc42");
                } else {
                    hVar2.i.add(onCameraChangeListener);
                }
            }
            if (TextUtils.isEmpty(this.n)) {
                changeStyle(b.a, false);
            }
            this.d.enableEventListener();
        }
        if (this.r > 1) {
            j jVar = this.y;
            Object[] objArr5 = {eVar};
            ChangeQuickRedirect changeQuickRedirect5 = j.a;
            if (PatchProxy.isSupport(objArr5, jVar, changeQuickRedirect5, false, "0702aaab906e16fa967b5e6cbf5a312c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, jVar, changeQuickRedirect5, false, "0702aaab906e16fa967b5e6cbf5a312c");
                return;
            }
            View view = (LinearLayout) eVar.findViewById(R.id.map_zoom_container);
            if (view != null) {
                jVar.a(view, jVar.j, jVar.i);
            }
            ImageView imageView = (ImageView) eVar.findViewById(R.id.location_iv);
            if (imageView != null) {
                imageView.setVisibility(jVar.g ? 0 : 8);
                imageView.setOnClickListener(jVar);
            }
            ZoomControlView zoomControlView = (ZoomControlView) eVar.findViewById(R.id.map_zoom);
            if (zoomControlView != null) {
                zoomControlView.setEnabled(jVar.h);
                zoomControlView.setOnZoomListener(jVar);
            }
            IndoorControlView indoorControlView = (IndoorControlView) eVar.findViewById(R.id.indoor_control_view);
            if (indoorControlView != null) {
                indoorControlView.setEnable(jVar.l);
                jVar.a(indoorControlView, jVar.n, jVar.m);
                indoorControlView.setOnIndoorControlListener(jVar);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3059d14feeff58235be26f2b7cb68de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3059d14feeff58235be26f2b7cb68de9");
            return;
        }
        com.sankuai.meituan.mapsdk.core.location.b bVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.location.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "52bea616b5fcb3c99a69c6bb949a6a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "52bea616b5fcb3c99a69c6bb949a6a0e");
        } else if (bVar.i) {
            bVar.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f112142916ee3c313bb440b9ea0adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f112142916ee3c313bb440b9ea0adf");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.egl.c cVar = this.j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.egl.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "d1e8342281e624a9f16b0cc1c2669f6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "d1e8342281e624a9f16b0cc1c2669f6c");
        } else {
            synchronized (com.sankuai.meituan.mapsdk.core.render.egl.c.d) {
                cVar.g = false;
                cVar.j = true;
                cVar.k = false;
                com.sankuai.meituan.mapsdk.core.render.egl.c.d.notifyAll();
                while (!cVar.f && cVar.h && !cVar.k) {
                    try {
                        com.sankuai.meituan.mapsdk.core.render.egl.c.d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.d == null) {
            return;
        }
        this.d.setPause(false);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4abf7710a698e9a15a49b287bcbe30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4abf7710a698e9a15a49b287bcbe30");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.egl.c cVar = this.j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.egl.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f215ee22cddfc3e82da3e008b3335bd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f215ee22cddfc3e82da3e008b3335bd3");
        } else {
            synchronized (com.sankuai.meituan.mapsdk.core.render.egl.c.d) {
                cVar.g = true;
                com.sankuai.meituan.mapsdk.core.render.egl.c.d.notifyAll();
                while (!cVar.f && !cVar.h) {
                    try {
                        com.sankuai.meituan.mapsdk.core.render.egl.c.d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.d == null) {
            return;
        }
        this.d.setPause(true);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4db5cb24c174486d181848f318c133b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4db5cb24c174486d181848f318c133b");
            return;
        }
        com.sankuai.meituan.mapsdk.core.location.b bVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.location.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "8e9f6da21ceb9cfac32f41bb48a2334c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "8e9f6da21ceb9cfac32f41bb48a2334c");
        } else {
            bVar.b();
        }
        this.q.removeCallbacksAndMessages(null);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fceebc225ee4cf6100bf59e953723c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fceebc225ee4cf6100bf59e953723c5");
        } else if (this.r > 1) {
            this.r--;
        } else {
            am.remove(this.an);
            this.i = true;
            com.sankuai.meituan.mapsdk.core.render.egl.c cVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.egl.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "89b56bbc1a9c50e82be1eb6632771b42", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "89b56bbc1a9c50e82be1eb6632771b42");
            } else {
                com.sankuai.meituan.mapsdk.core.render.egl.d dVar = cVar.c;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.core.render.egl.d.c;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "dde0d95682644129b2d3c995f6492156", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "dde0d95682644129b2d3c995f6492156");
                } else {
                    dVar.h = null;
                    dVar.a();
                    dVar.stop();
                }
                synchronized (com.sankuai.meituan.mapsdk.core.render.egl.c.d) {
                    cVar.e = true;
                    com.sankuai.meituan.mapsdk.core.render.egl.c.d.notifyAll();
                    while (!cVar.f) {
                        try {
                            com.sankuai.meituan.mapsdk.core.render.egl.c.d.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                try {
                    cVar.join(200L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            setOnMapTouchListener(null);
            setOnMapLoadedListener(null);
            setOnCameraChangeListener(null);
            this.K = null;
            if (this.L != null) {
                this.L.clear();
            }
            this.mOnCameraChangeListener = null;
            if (this.mOnCameraChangeListeners != null) {
                this.mOnCameraChangeListeners.clear();
            }
            setOnMarkerClickListener(null);
            setOnMapPoiClickListener(null);
            this.G = null;
            setOnMapClickListener(null);
            setOnPolylineClickListener(null);
            setOnPolygonClickListener(null);
            setOnMapLongClickListener(null);
            setMapGestureListener(null);
            if (this.J != null) {
                this.J.clear();
            }
            setLocationSource(null);
            setOnLocationChangedListener(null);
            this.x = null;
            h hVar = this.e;
            com.sankuai.meituan.mapsdk.core.gesture.c cVar2 = this.al;
            Object[] objArr4 = {cVar2};
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "53f98f7856ed155757928a9001c37335", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "53f98f7856ed155757928a9001c37335");
            } else {
                hVar.b.a(cVar2);
            }
            h hVar2 = this.e;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = h.a;
            if (PatchProxy.isSupport(objArr5, hVar2, changeQuickRedirect5, false, "6eb0393d51907543237b4bf852143516", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, hVar2, changeQuickRedirect5, false, "6eb0393d51907543237b4bf852143516");
            } else {
                if (hVar2.i != null) {
                    hVar2.i.clear();
                }
                hVar2.b.a(hVar2);
            }
            if (this.g != null) {
                com.sankuai.meituan.mapsdk.core.location.b bVar = this.g;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.mapsdk.core.location.b.a;
                if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "cfb6e448f805cd83c5ebafbb26cdc4dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "cfb6e448f805cd83c5ebafbb26cdc4dc");
                } else {
                    bVar.f = null;
                    bVar.i = false;
                }
            }
            if (this.h != null) {
                com.sankuai.meituan.mapsdk.core.widgets.d dVar2 = this.h;
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.meituan.mapsdk.core.widgets.d.a;
                if (PatchProxy.isSupport(objArr7, dVar2, changeQuickRedirect7, false, "61fab7afee30ae66795b00542ffd9f5b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, dVar2, changeQuickRedirect7, false, "61fab7afee30ae66795b00542ffd9f5b");
                } else {
                    for (int i = 0; i < dVar2.h.size(); i++) {
                        com.sankuai.meituan.mapsdk.core.widgets.b bVar2 = dVar2.h.get(i);
                        if (bVar2 != null) {
                            bVar2.a();
                        }
                    }
                    dVar2.h.clear();
                }
            }
            clear();
            f();
            com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
            if (PatchProxy.isSupport(objArr8, iVar, changeQuickRedirect8, false, "3810381bfebd8f4ff1ef20c2abdf0df8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, iVar, changeQuickRedirect8, false, "3810381bfebd8f4ff1ef20c2abdf0df8");
            } else {
                iVar.b();
                l lVar = iVar.d;
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = l.a;
                if (PatchProxy.isSupport(objArr9, lVar, changeQuickRedirect9, false, "0700b250ff3518eccbbf87ed9b641a02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, lVar, changeQuickRedirect9, false, "0700b250ff3518eccbbf87ed9b641a02");
                } else {
                    for (BitmapDescriptor bitmapDescriptor : lVar.b.keySet()) {
                        lVar.a(bitmapDescriptor);
                    }
                    lVar.b.clear();
                    lVar.c.clear();
                }
                iVar.b.m = null;
            }
            if (this.d != null) {
                this.d.destroy();
                this.d = null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(currentTimeMillis - this.aj));
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_lifecycle_duration", hashMap);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c54d0c919d866b02b261e37d5bc4b70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c54d0c919d866b02b261e37d5bc4b70");
        } else if (this.d == null) {
        } else {
            this.d.setMapSize(i, i2);
            if (this.e != null) {
                if (this.d.a() != null) {
                    this.d.a(this.d.a(), true);
                } else if (this.e.l != null) {
                    this.d.a(this.e.l, 0);
                }
            }
            if (this.f != null) {
                this.f.c();
            }
            if (this.V != null && !this.V.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.V);
                this.V.clear();
                this.V = null;
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    i iVar = (i) arrayList.get(i5);
                    switch (iVar.a) {
                        case MOVE_CAMERA:
                            a(iVar.b, iVar.d);
                            break;
                        case ANIMATE_CAMERA:
                            animateCamera(iVar.b, i5 == arrayList.size() - 1 ? iVar.c : 0L, iVar.d);
                            break;
                        case STOP_ANIMATION:
                            stopAnimation();
                            break;
                        case CHANGE_TILT:
                            this.e.b(iVar.e);
                            break;
                    }
                    i5++;
                }
                arrayList.clear();
            }
            this.V = null;
            j jVar = this.y;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "cbdd7f89711156422aecfaaa32f0ba8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "cbdd7f89711156422aecfaaa32f0ba8c");
                return;
            }
            if (jVar.o != null) {
                jVar.o.b();
            }
            if (jVar.s != null) {
                jVar.s.b();
            }
            if (jVar.r != null) {
                jVar.r.b();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setPreloadParentTileLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf0be16221cbb8419ce4a40518f61e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf0be16221cbb8419ce4a40518f61e54");
        } else {
            this.d.a(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void clearMapCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "973423f0ae3eea372da1ee58b6492f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "973423f0ae3eea372da1ee58b6492f3b");
        } else if (this.d == null) {
        } else {
            this.d.clearMapCache();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final UiSettings getUiSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8de7f340c3b4df793742e582452a86f", RobustBitConfig.DEFAULT_VALUE)) {
            return (UiSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8de7f340c3b4df793742e582452a86f");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getUiSettings failed with destroyed map");
            return null;
        }
        if (this.z == null) {
            this.z = new UiSettings(this.y);
        }
        return this.z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final CameraPosition getCameraPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e2414a6e8ee21057065f03d92e3183", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e2414a6e8ee21057065f03d92e3183");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getCameraPosition failed with destroyed map");
            return null;
        }
        if (Thread.currentThread() == this.j) {
            synchronized (this.k) {
                if (this.l != null && this.l.c != null) {
                    return new CameraPosition(new LatLng(this.l.c.latitude, this.l.c.longitude), (float) this.l.c.zoom, (float) this.l.c.pitch, (float) this.l.c.bearing);
                }
            }
        }
        CameraPosition h = this.d.h();
        return (h.target != null || this.e == null) ? h : this.e.l;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Projection getProjection() {
        return this.A;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float[] getViewMatrix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91cd337d43709c1788d10b80b0257986", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91cd337d43709c1788d10b80b0257986");
        }
        synchronized (this.k) {
            if (this.l != null && this.l.c != null && this.l.c.viewMatrix != null && this.l.c.viewMatrix.length > 0) {
                float[] fArr = new float[this.l.c.viewMatrix.length];
                for (int i = 0; i < fArr.length; i++) {
                    fArr[i] = (float) this.l.c.viewMatrix[i];
                }
                return fArr;
            }
            return new float[0];
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float[] getProjectionMatrix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "478a0fba7e8ceb6be130f1f59811ab0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "478a0fba7e8ceb6be130f1f59811ab0b");
        }
        synchronized (this.k) {
            if (this.l != null && this.l.c != null && this.l.c.projectionMatrix != null) {
                float[] fArr = new float[this.l.c.projectionMatrix.length];
                for (int i = 0; i < fArr.length; i++) {
                    fArr[i] = (float) this.l.c.projectionMatrix[i];
                }
                return fArr;
            }
            return new float[0];
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCustomRenderer(MTCustomRenderer mTCustomRenderer) {
        Object[] objArr = {mTCustomRenderer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f919f730389c875ceebf9a9e7379234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f919f730389c875ceebf9a9e7379234");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setCustomRenderer failed with destroyed map");
        } else {
            if (this.l != null) {
                if (this.l.b == mTCustomRenderer) {
                    return;
                }
                synchronized (this.k) {
                    if (this.d != null) {
                        this.d.removeLayer(this.X);
                    }
                    this.l = null;
                }
            }
            if (mTCustomRenderer == null) {
                return;
            }
            this.l = new w(Layer.LayerType.Point, this.X, this.j.c.e, this.j.c.f, mTCustomRenderer, this.aa);
            this.d.addLayer(this.l);
            this.d.e();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMultiInfoWindowEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba9a00f3d07a6078207bae618a1dc3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba9a00f3d07a6078207bae618a1dc3f");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setMultiInfoWindowEnabled failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "af4b1c484828ee8e3c3e47b4921269f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "af4b1c484828ee8e3c3e47b4921269f0");
            } else {
                iVar.e.d = z;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void moveCamera(CameraUpdate cameraUpdate) {
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8d08c194761a5830795bbb0ff5df63c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8d08c194761a5830795bbb0ff5df63c");
        } else {
            a(cameraUpdate, (MTMap.CancelableCallback) null);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorFloor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2990d5edd5d8fa0d2f62b2715ee0e52f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2990d5edd5d8fa0d2f62b2715ee0e52f");
        } else if (this.i || this.C == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setIndoorFloor failed with destroyed map");
        } else {
            this.C.a(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorMaskColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce9e8fa5a824c14aed595249f29f0c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce9e8fa5a824c14aed595249f29f0c9");
        } else if (this.i || this.C == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setIndoorMaskColor failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.core.a aVar = this.C;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0c61d55010df2736f2724f417649d0da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0c61d55010df2736f2724f417649d0da");
            } else if (aVar.d == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setIndoorMaskColor failed with destroyed map");
            } else if (i != 0) {
                aVar.d.setIndoorMask(true);
                aVar.d.setIndoorMaskColor(i);
            } else {
                aVar.d.setIndoorMask(false);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<MarkerOptions> createDynamicMarkerOptions(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1beda7327bb0655d0c288f710e694bfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1beda7327bb0655d0c288f710e694bfc");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ createDynamicMarkerOptions failed with destroyed map");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2ac6aeb848c1fcf5cdea3c9adc06cc3", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2ac6aeb848c1fcf5cdea3c9adc06cc3") : com.sankuai.meituan.mapsdk.core.utils.b.a(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Marker addMarker(MarkerOptions markerOptions) {
        boolean z = true;
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4086b8bf10aac9e88d69d2ea67574dc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Marker) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4086b8bf10aac9e88d69d2ea67574dc1");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addMarker failed with destroyed map");
            return null;
        }
        markerOptions.viewInfoWindow((this.c.getRenderType() == 2 || !markerOptions.isViewInfoWindow()) ? false : false);
        n a2 = this.f.a(markerOptions);
        if (a2 != null) {
            if (this.s != null && markerOptions.isNeedKeep()) {
                this.s.a(a2);
            }
            return new Marker(a2);
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<Marker> addMarkerList(List<MarkerOptions> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e3b04e69a3aeac34350471d2299167", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e3b04e69a3aeac34350471d2299167");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addMarkerList failed with destroyed map");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List list2 = (List) this.f.a(list);
        if (list2 != null) {
            for (int i = 0; i < list.size(); i++) {
                MarkerOptions markerOptions = list.get(i);
                if (this.s != null && markerOptions.isNeedKeep()) {
                    this.s.a((com.sankuai.meituan.mapsdk.maps.interfaces.l) list2.get(i));
                }
                arrayList.add(new Marker((n) list2.get(i)));
            }
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_add_dynamic_annotation", (Map<String, Object>) null);
        }
        return arrayList;
    }

    public final void a(com.sankuai.meituan.mapsdk.maps.interfaces.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f9ce89e77bc86edb886bc0ccb6099f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f9ce89e77bc86edb886bc0ccb6099f");
        } else if (this.s == null) {
        } else {
            this.s.b(lVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Polyline addPolyline(@NonNull PolylineOptions polylineOptions) {
        Object[] objArr = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa8d864dfdceba358cc5f646ed80e348", RobustBitConfig.DEFAULT_VALUE)) {
            return (Polyline) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa8d864dfdceba358cc5f646ed80e348");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addPolyline failed with destroyed map");
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        r vVar = PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "23b4035f209217056de4d77306a19bae", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "23b4035f209217056de4d77306a19bae") : new v(iVar.b, polylineOptions);
        if (vVar != null) {
            if (this.s != null) {
                this.s.a(vVar);
            }
            return new Polyline(vVar);
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Polygon addPolygon(PolygonOptions polygonOptions) {
        Object[] objArr = {polygonOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3f5843e9c65a0f1d2911570491ca38", RobustBitConfig.DEFAULT_VALUE)) {
            return (Polygon) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3f5843e9c65a0f1d2911570491ca38");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addPolygon failed with destroyed map");
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {polygonOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        q oVar = PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "b96f82f83fdea594730e66392f0b9a81", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "b96f82f83fdea594730e66392f0b9a81") : new o(iVar.b, polygonOptions);
        if (oVar != null) {
            if (this.s != null) {
                this.s.a(oVar);
            }
            StringBuilder sb = new StringBuilder();
            for (LatLng latLng : oVar.getPoints()) {
                sb.append(MapUtils.latlngToStr(latLng));
                sb.append(';');
            }
            b("polygon", sb.toString());
            return new Polygon(oVar);
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        Object[] objArr = {groundOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9ab12c6c05d0673a12c2d2f09b4c72", RobustBitConfig.DEFAULT_VALUE)) {
            return (GroundOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9ab12c6c05d0673a12c2d2f09b4c72");
        }
        if (groundOverlayOptions == null) {
            return null;
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addGroundOverlay failed with destroyed map");
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {groundOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        com.sankuai.meituan.mapsdk.maps.interfaces.g sVar = PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "fb4cf7130936062b915673451a05489b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mapsdk.maps.interfaces.g) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "fb4cf7130936062b915673451a05489b") : new s(iVar.b, groundOverlayOptions);
        if (sVar != null) {
            if (this.s != null) {
                this.s.a(sVar);
            }
            return new GroundOverlay(sVar);
        }
        return new GroundOverlay(new com.sankuai.meituan.mapsdk.emptymodel.a());
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final HeatOverlay addHeatOverlay(HeatOverlayOptions heatOverlayOptions) {
        Object[] objArr = {heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849b281ae228707d3b9b4d1e6ce2c765", RobustBitConfig.DEFAULT_VALUE)) {
            return (HeatOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849b281ae228707d3b9b4d1e6ce2c765");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addHeatOverlay failed with destroyed map");
            return null;
        }
        String str = "";
        if (heatOverlayOptions == null) {
            str = "HeatmapOptions is null";
        } else if (heatOverlayOptions.getData() == null && heatOverlayOptions.getWeightedData() == null) {
            str = "HeatmapOptions has no data";
        }
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e(str);
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        com.sankuai.meituan.mapsdk.maps.interfaces.h pVar = PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "d709734af226464e7b32c7f0aedf6af9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mapsdk.maps.interfaces.h) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "d709734af226464e7b32c7f0aedf6af9") : new p(iVar.b, heatOverlayOptions);
        if (pVar != null) {
            if (this.s != null) {
                this.s.a(pVar);
            }
            return new HeatOverlay(pVar);
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final HoneyCombOverlay addHoneyCombOverlay(HoneyCombOverlayOptions honeyCombOverlayOptions) {
        Object[] objArr = {honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d2bc6f22823a27590fc3dd23a3a9fa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d2bc6f22823a27590fc3dd23a3a9fa6");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addHoneyCombOverlay failed with destroyed map");
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        com.sankuai.meituan.mapsdk.maps.interfaces.i pVar = PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "7ce87414819f53f1e0835f1cebdece19", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mapsdk.maps.interfaces.i) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "7ce87414819f53f1e0835f1cebdece19") : new p(iVar.b, honeyCombOverlayOptions);
        if (pVar != null) {
            if (this.s != null) {
                this.s.a(pVar);
            }
            return new HoneyCombOverlay(pVar);
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Text addText(TextOptions textOptions) {
        Object[] objArr = {textOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8926148bd8833577c9b53d743a78b0d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Text) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8926148bd8833577c9b53d743a78b0d2");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addText failed with destroyed map");
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {textOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        return new Text(PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "f02a987099dac460d69eaead4f472570", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "f02a987099dac460d69eaead4f472570") : new com.sankuai.meituan.mapsdk.core.annotations.z(iVar.b, textOptions));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isIndoorEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2bf8f69e23c6e3ebf03e4b00426da9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2bf8f69e23c6e3ebf03e4b00426da9")).booleanValue();
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ isIndoorEnable failed with destroyed map");
            return false;
        }
        return this.Q;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float getScalePerPixel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a11665cb7aede9c9db4df5a8baea108", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a11665cb7aede9c9db4df5a8baea108")).floatValue();
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getScalePerPixel failed with destroyed map");
            return 0.0f;
        }
        return (float) ((com.sankuai.meituan.mapsdk.core.interfaces.h) this.A.getIProjection()).a(getMapCenter().latitude, getZoomLevel());
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float toOpenGLWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798479d66ca5084c64c0bd28a5bff870", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798479d66ca5084c64c0bd28a5bff870")).floatValue();
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ toOpenGLWidth failed with destroyed map");
            return 0.0f;
        }
        return i * ((float) ((com.sankuai.meituan.mapsdk.core.interfaces.h) this.A.getIProjection()).a(getZoomLevel()));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Circle addCircle(CircleOptions circleOptions) {
        Object[] objArr = {circleOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332fe9a6292040ed258c4a072d27fd0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Circle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332fe9a6292040ed258c4a072d27fd0d");
        }
        if (circleOptions == null) {
            return null;
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addCircle failed with destroyed map");
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {circleOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        com.sankuai.meituan.mapsdk.maps.interfaces.d mVar = PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "eab39190ba0cb627cc8cc3b155b8bef9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mapsdk.maps.interfaces.d) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "eab39190ba0cb627cc8cc3b155b8bef9") : new m(iVar.b, circleOptions);
        if (mVar != null) {
            if (this.s != null) {
                this.s.a(mVar);
            }
            b("circle", MapUtils.latlngToStr(mVar.getCenter()));
            return new Circle(mVar);
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addArc(ArcOptions arcOptions) {
        Object[] objArr = {arcOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119d81af5d6a30d685aa043a555f4c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119d81af5d6a30d685aa043a555f4c35");
        } else {
            addArcEnhance(arcOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Arc addArcEnhance(ArcOptions arcOptions) {
        Object[] objArr = {arcOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "756c6d2e338f8f50803ad31665548bf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Arc) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "756c6d2e338f8f50803ad31665548bf2");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addArc failed with destroyed map");
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {arcOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        com.sankuai.meituan.mapsdk.core.interfaces.b bVar = (com.sankuai.meituan.mapsdk.core.interfaces.b) (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "062bba0a2ac5f7f400414107253d2146", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mapsdk.maps.interfaces.a) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "062bba0a2ac5f7f400414107253d2146") : new com.sankuai.meituan.mapsdk.core.annotations.j(iVar.b, arcOptions));
        if (bVar != null) {
            String str = "arc default";
            if (bVar.j() != null && bVar.i() != null && bVar.h() != null) {
                str = String.format("start:%s,passed:%s,end:%s", MapUtils.latlngToStr(bVar.j()), MapUtils.latlngToStr(bVar.i()), MapUtils.latlngToStr(bVar.h()));
            } else if (arcOptions.getCenter() != null) {
                str = String.format(Locale.getDefault(), "center:%s,radius:%f,startRadian:%f,endRadian:%f", MapUtils.latlngToStr(arcOptions.getCenter()), Double.valueOf(arcOptions.getRadius()), Float.valueOf(arcOptions.getStartAngle()), Float.valueOf(arcOptions.getEndAngle()));
            }
            b("arc", str);
            return new Arc(bVar);
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorLevelPickerEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6806d97741e93171f73e011c0d689e93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6806d97741e93171f73e011c0d689e93");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setIndoorLevelPickerEnabled failed with destroyed map");
        } else {
            this.y.setIndoorControlsEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode) {
        Object[] objArr = {latLngBounds, restrictBoundsFitMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d17e91f126005c33e4d2aef1fa718e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d17e91f126005c33e4d2aef1fa718e7b");
        } else {
            setRestrictBounds(latLngBounds, restrictBoundsFitMode, true);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode, boolean z) {
        PointD pointD;
        PointD pointD2;
        LatLngBounds latLngBounds2 = latLngBounds;
        Object[] objArr = {latLngBounds2, restrictBoundsFitMode, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876c8e25ab53e55d60d581565a4c66e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876c8e25ab53e55d60d581565a4c66e9");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setRestrictBounds failed with destroyed map");
        } else {
            updateCameraChangedType(2);
            h hVar = this.e;
            Object[] objArr2 = {latLngBounds2, restrictBoundsFitMode, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "2e6c4d141b9fd0b5187734417afec69f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "2e6c4d141b9fd0b5187734417afec69f");
                return;
            }
            h.b bVar = hVar.e;
            Object[] objArr3 = {latLngBounds2, restrictBoundsFitMode, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = h.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "02c3274625cc64f9300de2c80758e014", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "02c3274625cc64f9300de2c80758e014");
                return;
            }
            com.sankuai.meituan.mapsdk.core.render.a aVar = bVar.b.d;
            if (aVar != null && !bVar.b.i && latLngBounds2 != null && latLngBounds.isValid() && aVar.b() != 0 && aVar.c() != 0) {
                bVar.c = latLngBounds2;
                bVar.d = restrictBoundsFitMode;
                PointD a2 = com.sankuai.meituan.mapsdk.mapcore.utils.e.b.a(latLngBounds2.northeast);
                PointD a3 = com.sankuai.meituan.mapsdk.mapcore.utils.e.b.a(latLngBounds2.southwest);
                double b2 = ((a2.x - a3.x) / (a3.y - a2.y)) / (aVar.b() / aVar.c());
                if (restrictBoundsFitMode == RestrictBoundsFitMode.FIT_WIDTH) {
                    if (b2 < 1.0d) {
                        double c2 = ((a3.y - a2.y) - (((a2.x - a3.x) * aVar.c()) / aVar.b())) / 2.0d;
                        pointD = new PointD(a2.x, a2.y + c2);
                        pointD2 = new PointD(a3.x, a3.y - c2);
                    }
                    pointD2 = null;
                    pointD = null;
                } else {
                    if (b2 > 1.0d) {
                        double b3 = ((a2.x - a3.x) - (((a3.y - a2.y) * aVar.b()) / aVar.c())) / 2.0d;
                        pointD = new PointD(a2.x - b3, a2.y);
                        pointD2 = new PointD(a3.x + b3, a3.y);
                    }
                    pointD2 = null;
                    pointD = null;
                }
                if (pointD != null) {
                    latLngBounds2 = new LatLngBounds(com.sankuai.meituan.mapsdk.mapcore.utils.e.b.a(pointD2), com.sankuai.meituan.mapsdk.mapcore.utils.e.b.a(pointD));
                }
                bVar.a(latLngBounds2, z);
                return;
            }
            bVar.e = false;
            aVar.a((LatLngBounds) null);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Arrow addArrow(ArrowOptions arrowOptions) {
        Object[] objArr = {arrowOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74864f086bb7180f0397eb394696cc9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Arrow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74864f086bb7180f0397eb394696cc9e");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addArrow failed with destroyed map");
            return null;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {arrowOptions};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        com.sankuai.meituan.mapsdk.maps.interfaces.b kVar = PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "5847b83b5e5884e0f0403d8078978960", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mapsdk.maps.interfaces.b) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "5847b83b5e5884e0f0403d8078978960") : new com.sankuai.meituan.mapsdk.core.annotations.k(iVar.b, arrowOptions);
        if (kVar != null) {
            StringBuilder sb = new StringBuilder();
            for (LatLng latLng : kVar.getPoints()) {
                sb.append(MapUtils.latlngToStr(latLng));
                sb.append(';');
            }
            b("arrow", sb.toString());
            return new Arrow(kVar);
        }
        return null;
    }

    private void a(CameraUpdate cameraUpdate, MTMap.CancelableCallback cancelableCallback) {
        Object[] objArr = {cameraUpdate, cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f966a6cc3b62e0a8d83c9f5099ce57a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f966a6cc3b62e0a8d83c9f5099ce57a");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ moveCamera failed with destroyed map");
        } else {
            a(cameraUpdate);
            updateCameraChangedType(2);
            if (this.V != null) {
                this.V.add(new i(i.a.MOVE_CAMERA, cameraUpdate, 0L, cancelableCallback));
            }
            this.e.a(cameraUpdate, cancelableCallback);
        }
    }

    private void a(CameraUpdate cameraUpdate) {
        CameraUpdateMessage cameraUpdateMessage;
        float f;
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1426bfc309edd88b47ef0a656f1bfa0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1426bfc309edd88b47ef0a656f1bfa0b");
        } else if (cameraUpdate == null || (cameraUpdateMessage = cameraUpdate.getCameraUpdateMessage()) == null) {
        } else {
            float zoomLevel = getZoomLevel();
            if ((cameraUpdateMessage.type == CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION || cameraUpdateMessage.type == CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION_WITH_PADDING) && cameraUpdateMessage.cameraPosition != null) {
                f = cameraUpdateMessage.cameraPosition.zoom;
            } else if (cameraUpdateMessage.type == CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_ZOOM) {
                f = cameraUpdateMessage.zoom;
            } else if (cameraUpdateMessage.type == CameraUpdateMessage.CameraUpdateType.ZOOM_IN) {
                f = zoomLevel + 1.0f;
            } else if (cameraUpdateMessage.type == CameraUpdateMessage.CameraUpdateType.ZOOM_OUT) {
                f = zoomLevel - 1.0f;
            } else if (cameraUpdateMessage.type == CameraUpdateMessage.CameraUpdateType.ZOOM_TO) {
                f = cameraUpdateMessage.zoom;
            } else if (cameraUpdateMessage.type != CameraUpdateMessage.CameraUpdateType.ZOOM_BY) {
                return;
            } else {
                f = zoomLevel + cameraUpdateMessage.zoomAmount;
            }
            float[] g = g();
            if (f < g[0] || g[1] < f || f < this.E || this.D < f) {
                Context context = this.c.getContext();
                String str = this.o;
                Class<?> cls = getClass();
                com.sankuai.meituan.mapsdk.mapcore.report.f.a(context, 3, str, cls, "checkZoomLevel", 4030L, "zoomLevel is set " + f + " while zoomMode is " + getZoomMode().name() + ", minZoomLevel is " + this.E + " and maxZoomLevel is " + this.D + ". CameraUpdateType is " + cameraUpdateMessage.type.name(), "MTMapAndroidInteractiveExceptionStatus", 1.0f);
            }
        }
    }

    public final CameraPosition a(@Nullable LatLngBounds latLngBounds, int[] iArr) {
        Object[] objArr = {latLngBounds, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1ad07dfb2e8d8f2451b044d4116e593", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1ad07dfb2e8d8f2451b044d4116e593");
        }
        Object[] objArr2 = {latLngBounds, null, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "065c8f246185fac2ffd1ca48ffab1c26", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "065c8f246185fac2ffd1ca48ffab1c26");
        }
        CameraPosition cameraForLatLngBounds = this.d.cameraForLatLngBounds(latLngBounds, null, false);
        return cameraForLatLngBounds != null ? cameraForLatLngBounds : this.e.l;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isMapRenderFinish() {
        return this.ag;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener) {
        Object[] objArr = {onCameraChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "553e065f983abfacef7ed23622b91ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "553e065f983abfacef7ed23622b91ef7");
        } else {
            this.mOnCameraChangeListeners.add(onCameraChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener) {
        Object[] objArr = {onCameraChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c0586d24b5c5078323bcefab699f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c0586d24b5c5078323bcefab699f18");
        } else {
            this.mOnCameraChangeListeners.remove(onCameraChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapClickListener(MTMap.OnMapClickListener onMapClickListener) {
        Object[] objArr = {onMapClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37ea144a657a34a471531b01c98e2898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37ea144a657a34a471531b01c98e2898");
        } else {
            this.e.f = onMapClickListener;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMarkerSelectChangeListener(MTMap.OnMarkerSelectChangeListener onMarkerSelectChangeListener) {
        Object[] objArr = {onMarkerSelectChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aba38a464e20382e75dedb4cffd97bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aba38a464e20382e75dedb4cffd97bb");
        } else {
            this.f.j.setOnOnMarkerSelectChangeListener(onMarkerSelectChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f29889121c3e73c3e39d5fa5b0b2735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f29889121c3e73c3e39d5fa5b0b2735");
        } else if (zVar != null) {
            this.J.add(zVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51b11012c63637b3ccb1dc627b4c7b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51b11012c63637b3ccb1dc627b4c7b8");
        } else {
            this.J.remove(zVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapPoiClickListener(MTMap.OnMapPoiClickListener onMapPoiClickListener) {
        Object[] objArr = {onMapPoiClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecac2382c213a7dc6d96b9dd486d4006", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecac2382c213a7dc6d96b9dd486d4006");
            return;
        }
        this.G = onMapPoiClickListener;
        this.e.m = onMapPoiClickListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapAoiClickListener(MTMap.OnMapAoiClickListener onMapAoiClickListener) {
        Object[] objArr = {onMapAoiClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "803cf981d86c4433c3785a0ed2a69e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "803cf981d86c4433c3785a0ed2a69e7a");
            return;
        }
        this.H = onMapAoiClickListener;
        this.e.n = onMapAoiClickListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapLongClickListener(MTMap.OnMapLongClickListener onMapLongClickListener) {
        Object[] objArr = {onMapLongClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "021cbdf295afe02d0e6bbb4e1e902289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "021cbdf295afe02d0e6bbb4e1e902289");
        } else {
            this.e.g = onMapLongClickListener;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorQueryBox(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a41e5febeba1cc5eae03426fea1a8176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a41e5febeba1cc5eae03426fea1a8176");
        } else {
            this.d.setIndoorQueryBox(f, f2, f3, f4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnIndoorStateChangeListener(MTMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        Object[] objArr = {onIndoorStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08912afa2d08e9c2b6b82fa5e7cd263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08912afa2d08e9c2b6b82fa5e7cd263");
        } else if (this.C == null) {
        } else {
            this.C.a(onIndoorStateChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setPointToCenter(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5215f2dce11250bbc9e236a0be2d5415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5215f2dce11250bbc9e236a0be2d5415");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setPointToCenter failed with destroyed map");
        } else {
            updateCameraChangedType(2);
            if (getProjection() != null) {
                this.d.a(new PointF(i, i2), true);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCameraCenterProportion(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9d955433d0fdad52cad7f22fbc066ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9d955433d0fdad52cad7f22fbc066ec");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setCameraCenterProportion failed with destroyed map");
        } else {
            updateCameraChangedType(2);
            if (getProjection() != null) {
                PointF a2 = this.d.a();
                if (a2 != null && a2.x == f && a2.y == f2) {
                    return;
                }
                this.d.a(new PointF(f, f2), z);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener) {
        this.mOnCameraChangeListener = onCameraChangeListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMarkerClickListener(MTMap.OnMarkerClickListener onMarkerClickListener) {
        Object[] objArr = {onMarkerClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c603f9faf5b0bafba850ed94fa4a6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c603f9faf5b0bafba850ed94fa4a6e");
        } else {
            this.f.f = onMarkerClickListener;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMarkerDragListener(MTMap.OnMarkerDragListener onMarkerDragListener) {
        Object[] objArr = {onMarkerDragListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39fa550f6c13e4bda49c74cc4611d4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39fa550f6c13e4bda49c74cc4611d4f");
        } else {
            this.f.g = onMarkerDragListener;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnPolylineClickListener(MTMap.OnPolylineClickListener onPolylineClickListener) {
        Object[] objArr = {onPolylineClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e880bc90122e6569648b2870f126e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e880bc90122e6569648b2870f126e6c");
        } else {
            this.f.h = onPolylineClickListener;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnPolygonClickListener(MTMap.OnPolygonClickListener onPolygonClickListener) {
        Object[] objArr = {onPolygonClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c599fd21d7660305d28846966d54616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c599fd21d7660305d28846966d54616");
        } else {
            this.f.i = onPolygonClickListener;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setInfoWindowAdapter(MTMap.InfoWindowAdapter infoWindowAdapter) {
        Object[] objArr = {infoWindowAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "047a9b1b13e4aaddb27bde9da6be3a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "047a9b1b13e4aaddb27bde9da6be3a9e");
            return;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {infoWindowAdapter};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "d1b63bd5b5325dc1788814e55183cded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "d1b63bd5b5325dc1788814e55183cded");
        } else {
            iVar.e.b = infoWindowAdapter;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnInfoWindowClickListener(MTMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        Object[] objArr = {onInfoWindowClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8582f74b1b80c5a763d4f7dcdcb6429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8582f74b1b80c5a763d4f7dcdcb6429");
            return;
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {onInfoWindowClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "24847f4161347117ec617988504e51ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "24847f4161347117ec617988504e51ce");
        } else {
            iVar.e.c = onInfoWindowClickListener;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final MyLocationStyle getMyLocationStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64289c1d05a68b160484bcb7745f8b80", RobustBitConfig.DEFAULT_VALUE)) {
            return (MyLocationStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64289c1d05a68b160484bcb7745f8b80");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getMyLocationStyle failed with destroyed map");
            return null;
        }
        return this.g.c;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        int i;
        Object[] objArr = {myLocationStyle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7caeca319d0596df2ca48846bc230f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7caeca319d0596df2ca48846bc230f81");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setMyLocationStyle failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.core.location.b bVar = this.g;
            Object[] objArr2 = {myLocationStyle};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.location.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "672f7611ba5b71a97b4c127746928c7c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "672f7611ba5b71a97b4c127746928c7c");
            } else if (myLocationStyle != null) {
                bVar.c = myLocationStyle;
                int myLocationType = myLocationStyle.getMyLocationType();
                Object[] objArr3 = {Integer.valueOf(myLocationType)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.core.location.b.a;
                if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d22f8b0b4b6979154a9144ac4d0eec02", RobustBitConfig.DEFAULT_VALUE)) {
                    switch (myLocationType) {
                        case 0:
                        default:
                            i = 14;
                            break;
                        case 1:
                            i = 10;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 22;
                            break;
                        case 4:
                            i = 46;
                            break;
                        case 5:
                            i = 42;
                            break;
                        case 6:
                            i = 54;
                            break;
                    }
                } else {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d22f8b0b4b6979154a9144ac4d0eec02")).intValue();
                }
                bVar.d = i;
                if (!bVar.i || bVar.e == null) {
                    return;
                }
                bVar.e.a(bVar.c);
                HashMap hashMap = new HashMap();
                hashMap.put("location_type", Integer.valueOf(myLocationStyle.getMyLocationType()));
                com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_set_usertrackingmode", hashMap);
                bVar.a((bVar.d & 32) == 32);
                if ((bVar.d & 8) != 8) {
                    bVar.d();
                }
                if ((bVar.d & 16) != 16) {
                    bVar.a(0.0f, (bVar.d & 4) == 4);
                }
                bVar.onLocationChanged(bVar.h);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnLocationChangedListener(y.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fcc02a210f4a6cea6ec0b546dc71bcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fcc02a210f4a6cea6ec0b546dc71bcb");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setOnLocationChangedListener failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.core.location.b bVar = this.g;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.location.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4283ac2d5e9fdccb766960b4e412b0a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4283ac2d5e9fdccb766960b4e412b0a2");
                return;
            }
            bVar.b = aVar;
            if (aVar == null || bVar.g == null) {
                return;
            }
            bVar.b.onLocationChanged(bVar.g);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Location getCurrentLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f793580da8be29cbd1d75b49f1c607e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f793580da8be29cbd1d75b49f1c607e7");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getCurrentLocation failed with destroyed map");
            return null;
        }
        return this.g.g;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final MapLocation getCurrentMapLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "792c703689d0d1f3c7c0e42387e57c5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MapLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "792c703689d0d1f3c7c0e42387e57c5e");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getCurrentLocation failed with destroyed map");
            return null;
        }
        return this.g.h;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @SuppressLint({"MissingPermission"})
    public final void setMyLocationEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a37c4458b2010b60758e36b56307c906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a37c4458b2010b60758e36b56307c906");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setMyLocationEnabled failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.core.location.b bVar = this.g;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.location.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4e0eac1052beb6cb677d03bbfd18dcf3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4e0eac1052beb6cb677d03bbfd18dcf3");
            } else if (bVar.i != z) {
                bVar.i = z;
                if (!bVar.i) {
                    bVar.b();
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_delegate_didstoplocatinguser", (Map<String, Object>) null);
                    return;
                }
                bVar.a();
                com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_delegate_willstartlocatinguser", (Map<String, Object>) null);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setLocationSource(y yVar) {
        Object[] objArr = {yVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d920fc02ca62c7404e0f4bafa0bc541c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d920fc02ca62c7404e0f4bafa0bc541c");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setLocationSource failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.core.location.b bVar = this.g;
            Object[] objArr2 = {yVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.location.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "5cc903fe4ef525d821544ca0b25d5dfa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "5cc903fe4ef525d821544ca0b25d5dfa");
            } else if (yVar != null) {
                if (bVar.i) {
                    bVar.b();
                }
                bVar.f = yVar;
                if (bVar.i) {
                    bVar.a();
                }
            } else {
                if (bVar.i) {
                    bVar.b();
                }
                bVar.f = yVar;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCustomSatelliteUri(String str) {
        this.ad = str;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCustomMapStylePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54bb9545cb880b9ae9f2e129700c67ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54bb9545cb880b9ae9f2e129700c67ee");
        } else {
            setCustomMapStylePath(str, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCustomMapStylePath(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c78fcdb35214c2e91571e2837d38371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c78fcdb35214c2e91571e2837d38371");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.ae = this.n;
            this.O = str;
            String a2 = com.sankuai.meituan.mapsdk.mapcore.utils.g.a(str.getBytes());
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            a(a2, str);
            changeStyle(a2, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapStyleColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "655b2a0ce48f56195854ab8ff7fdba17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "655b2a0ce48f56195854ab8ff7fdba17");
        } else {
            setMapStyleColor(str, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapStyleColor(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e68c3baa060ebd2a105bcbe7d350cd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e68c3baa060ebd2a105bcbe7d350cd4");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.d.applyColorStyle(str, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final String getCustomMapStylePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14a3587b9432cc9605d9cf8ee6e6236f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14a3587b9432cc9605d9cf8ee6e6236f");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getCustomMapStylePath failed with destroyed map");
            return null;
        }
        return this.O;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void createRoadCrossing(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d1c303d471092c4d4038e1483c1139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d1c303d471092c4d4038e1483c1139");
        } else {
            this.d.createRoadCrossing(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void destroyRoadCrossing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "656145e03d3cb70d55410473d5545f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "656145e03d3cb70d55410473d5545f79");
        } else {
            this.d.destroyRoadCrossing();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRoadCrossingID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bbf01dda3b0573a4333b9b5dd5e91d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bbf01dda3b0573a4333b9b5dd5e91d4");
        } else {
            this.d.setRoadCrossingID(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRoadBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "844bdc4e67aa98d3220c4fadf8c5983b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "844bdc4e67aa98d3220c4fadf8c5983b");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setRoadBackgroundColor failed with destroyed map");
        } else {
            this.d.c(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRoadCasingColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495788feac2bbf2c25403405e04bdaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495788feac2bbf2c25403405e04bdaca");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setRoadCasingColor failed with destroyed map");
        } else {
            this.d.d(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setTrafficStyle(TrafficStyle trafficStyle) {
        Object[] objArr = {trafficStyle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3600258565714d22372b0439be95a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3600258565714d22372b0439be95a4");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setTrafficStyle failed with destroyed map");
        } else {
            this.P = trafficStyle;
            if (this.P != null) {
                if (this.P.getSmoothColor() != null) {
                    a(c.SMOOTH, this.P.getSmoothColor().intValue());
                }
                if (this.P.getSlowColor() != null) {
                    a(c.SLOW, this.P.getSlowColor().intValue());
                }
                if (this.P.getCongestedColor() != null) {
                    a(c.BLOCK, this.P.getCongestedColor().intValue());
                }
                if (this.P.getSeriousCongestedColor() != null) {
                    a(c.SERIOUS_BLOCK, this.P.getSeriousCongestedColor().intValue());
                }
                if (this.P.isShowRoadStyle() != null) {
                    this.d.showRoadStyle(this.P.isShowRoadStyle().booleanValue());
                }
                if (this.P.getRoadBackgroundColor() != null) {
                    this.d.c(this.P.getRoadBackgroundColor().intValue());
                }
                if (this.P.getRoadCasingColor() != null) {
                    this.d.d(this.P.getRoadCasingColor().intValue());
                }
                if (this.P.getTrafficStyleUrl() != null) {
                    this.d.setTrafficStyle(this.P.getTrafficStyleUrl());
                }
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final TrafficStyle getTrafficStyle() {
        return this.P;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<String> getBaseStyleNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6224cfb4b9065068d4d85fc71680538f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6224cfb4b9065068d4d85fc71680538f");
        }
        int f = this.d.f();
        ArrayList arrayList = new ArrayList(f);
        for (int i = 0; i < f; i++) {
            arrayList.add(this.d.b(i));
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final String getBaseStyleUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9623ba68d45d9e872591b7bc4d0097", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9623ba68d45d9e872591b7bc4d0097") : this.d.a(str);
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb453df5c4a3c8e4ad63ab5822012bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb453df5c4a3c8e4ad63ab5822012bea");
        } else {
            this.d.addStyleUrl(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void changeStyle(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e3ec353a44c158e1cec7e752feadc9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e3ec353a44c158e1cec7e752feadc9b");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
        } else {
            if (!TextUtils.isEmpty(this.ad)) {
                if (b.c.equals(str)) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45ce5e0f6f6a7acd75e30153f7e5f0a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45ce5e0f6f6a7acd75e30153f7e5f0a9");
                        return;
                    } else if (this.ab < 0 || this.ac < 0) {
                        this.ab = this.d.createRasterSource("raster-source", this.ad, 256);
                        this.ac = this.d.createLayer("raster-layer", "raster-source");
                        this.d.setLayerProperty(this.ac, MapConstant.LayerPropertyFlag_RasterOpacity, 1.0f);
                        this.d.addRasterSource(this.ab);
                        this.d.addLayer(this.ac);
                        this.d.setLayerOrder(this.ac, 999.0f, com.sankuai.meituan.mapsdk.core.render.model.g.Order3D);
                        return;
                    } else {
                        return;
                    }
                }
                f();
            }
            if (TextUtils.equals(this.n, str)) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.c("map style:" + str + " already applied!");
                return;
            }
            com.sankuai.meituan.mapsdk.mapcore.utils.c.c("map style:" + str + " applied!");
            this.d.applyMapStyle(str, z);
            this.n = str;
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158295587e57ec645b0447edddebc9b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158295587e57ec645b0447edddebc9b6");
            return;
        }
        if (this.ac != -1) {
            this.d.removeAndDestroyLayer(this.ac);
            this.ac = -1L;
        }
        if (this.ab != -1) {
            this.d.removeAndDestroyRasterSource(this.ab);
            this.ab = -1L;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float getMaxZoomLevel() {
        return this.D;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMaxZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb3ef34cd5498caf8f6f8c32740766d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb3ef34cd5498caf8f6f8c32740766d");
        } else if (this.i || this.d == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setMaxZoomLevel failed with destroyed map");
        } else {
            this.D = f;
            this.d.d(this.D);
            CameraPosition h = this.d.h();
            if (h != null) {
                if (h.zoom > f) {
                    moveCamera(CameraUpdateFactory.zoomTo(f));
                }
                if (h.zoom < this.E) {
                    moveCamera(CameraUpdateFactory.zoomTo(this.E));
                }
            }
            float[] g = g();
            if (f < g[0] || g[1] < f) {
                Context context = this.c.getContext();
                String str = this.o;
                Class<?> cls = getClass();
                com.sankuai.meituan.mapsdk.mapcore.report.f.a(context, 3, str, cls, "setMaxZoomLevel", 4031L, "maxZoomLevel is set " + f + " while zoomMode is " + getZoomMode().name(), "MTMapAndroidInteractiveExceptionStatus", 1.0f);
            }
        }
    }

    private float[] g() {
        float f;
        float f2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b46b7c215a487bf3feca565f1716f54c", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b46b7c215a487bf3feca565f1716f54c");
        }
        switch (getZoomMode()) {
            case TENCENT:
            case AMAP:
                f = 20.0f;
                f2 = 3.0f;
                break;
            default:
                f = 19.0f;
                f2 = 2.0f;
                break;
        }
        return new float[]{f2, f};
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float getMinZoomLevel() {
        return this.E;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final LatLng getMapCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778b3ac9d5194ab1fdfe98d2fbacfbc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778b3ac9d5194ab1fdfe98d2fbacfbc7");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getMapCenter failed with destroyed map");
            return null;
        }
        return getCameraPosition().target;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float getZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7731799752ee71deab8cc2ffd3e2b356", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7731799752ee71deab8cc2ffd3e2b356")).floatValue();
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getZoomLevel failed with destroyed map");
            return 0.0f;
        }
        return getCameraPosition().zoom;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void animateCamera(@NonNull CameraUpdate cameraUpdate) {
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7169e6dfec5ccf68d1e372cb9ea25e60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7169e6dfec5ccf68d1e372cb9ea25e60");
        } else {
            animateCamera(cameraUpdate, 500L, null);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void animateCamera(@NonNull CameraUpdate cameraUpdate, MTMap.CancelableCallback cancelableCallback) {
        Object[] objArr = {cameraUpdate, cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805295be007aa3bdcc0f6cdc757c4d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805295be007aa3bdcc0f6cdc757c4d7d");
        } else {
            animateCamera(cameraUpdate, 500L, cancelableCallback);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void animateCamera(@NonNull CameraUpdate cameraUpdate, long j, MTMap.CancelableCallback cancelableCallback) {
        Object[] objArr = {cameraUpdate, new Long(j), cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a0bf68051e6c0e3afec5ec95316033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a0bf68051e6c0e3afec5ec95316033");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ animateCamera failed with destroyed map");
        } else {
            a(cameraUpdate);
            updateCameraChangedType(2);
            if (this.V != null) {
                this.V.add(new i(i.a.ANIMATE_CAMERA, cameraUpdate, j, cancelableCallback));
            }
            this.e.a(cameraUpdate, j, cancelableCallback);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMinZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c7953d9f5f735bb6fc249834c903cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c7953d9f5f735bb6fc249834c903cf");
        } else if (this.i || this.d == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setMinZoomLevel failed with destroyed map");
        } else {
            this.E = f;
            this.d.e(this.E);
            CameraPosition h = this.d.h();
            if (h != null) {
                if (h.zoom < f) {
                    moveCamera(CameraUpdateFactory.zoomTo(f));
                }
                if (h.zoom > this.D) {
                    moveCamera(CameraUpdateFactory.zoomTo(this.D));
                }
            }
            float[] g = g();
            if (f < g[0] || g[1] < f) {
                Context context = this.c.getContext();
                String str = this.o;
                Class<?> cls = getClass();
                com.sankuai.meituan.mapsdk.mapcore.report.f.a(context, 3, str, cls, "setMinZoomLevel", 4032L, "minZoomLevel is set " + f + " while zoomMode is " + getZoomMode().name(), "MTMapAndroidInteractiveExceptionStatus", 1.0f);
            }
        }
    }

    private List<n> a(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802ebdfa2bd4b2aa50fade1044974786", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802ebdfa2bd4b2aa50fade1044974786");
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "62b21577c0c8bcb5f529e2d2576cb638", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "62b21577c0c8bcb5f529e2d2576cb638");
        }
        ArrayList arrayList = new ArrayList();
        if (latLngBounds != null) {
            for (x xVar : iVar.b.j) {
                LatLng position = xVar.getPosition();
                if (position != null && latLngBounds.contains(position)) {
                    arrayList.add(xVar);
                }
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void getMapScreenShot(MTMap.OnMapScreenShotListener onMapScreenShotListener) {
        Object[] objArr = {onMapScreenShotListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d97efe986d5907c95dc5dd7c747f5c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d97efe986d5907c95dc5dd7c747f5c2");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getMapScreenShot failed with destroyed map");
        } else {
            this.F = onMapScreenShotListener;
            if (this.F == null || this.j.c == null) {
                return;
            }
            this.j.c.j = true;
            h();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void getPartialScreenShot(MTMap.OnMapScreenShotListener onMapScreenShotListener, int i, int i2, int i3, int i4) {
        Object[] objArr = {onMapScreenShotListener, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70fe7068bb8ce2d95598e6907e222d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70fe7068bb8ce2d95598e6907e222d9e");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getMapScreenShot failed with destroyed map");
        } else {
            this.F = onMapScreenShotListener;
            if (this.F == null || this.j.c == null) {
                return;
            }
            com.sankuai.meituan.mapsdk.core.render.egl.d dVar = this.j.c;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.egl.d.c;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "2276ce16d24e88ae1df942d7a0440b2c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "2276ce16d24e88ae1df942d7a0440b2c");
            } else {
                dVar.k = true;
                dVar.l = Math.max(i, 1);
                dVar.m = Math.max(i2, 1);
                dVar.n = Math.max(i3, 0);
                dVar.o = Math.max(i4, 0);
            }
            h();
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25241aaa6e4a84c3dc1d5defcac7497c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25241aaa6e4a84c3dc1d5defcac7497c");
        } else if (this.i) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a("request render interval: " + (currentTimeMillis - this.U));
            this.U = currentTimeMillis;
            if (this.j != null) {
                this.j.a();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<Marker> getMapScreenMarkers() {
        List<n> a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ce942040df74146b65003054424b64", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ce942040df74146b65003054424b64");
        }
        ArrayList arrayList = new ArrayList();
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getMapScreenMarkers failed with destroyed map");
            return arrayList;
        }
        VisibleRegion visibleRegion = getProjection().getVisibleRegion();
        if (visibleRegion == null || (a2 = a(visibleRegion.getLatLngBounds())) == null || a2.isEmpty()) {
            return arrayList;
        }
        for (n nVar : a2) {
            arrayList.add(new Marker(nVar));
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<LatLng> getBounderPoints(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c45e49e1245e186445a199db246f44ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c45e49e1245e186445a199db246f44ad");
        }
        Point screenLocation = getProjection().toScreenLocation(marker.getPosition());
        Bitmap bitmap = marker.getIcon().getBitmap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Point point = new Point((int) (screenLocation.x - (marker.getAnchorU() * width)), (int) (screenLocation.y - (marker.getAnchorV() * height)));
        Point point2 = new Point(point.x + width, point.y);
        Point point3 = new Point(point.x, point.y + height);
        Point point4 = new Point(point.x + width, point.y + height);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(getProjection().fromScreenLocation(point));
        arrayList.add(getProjection().fromScreenLocation(point2));
        arrayList.add(getProjection().fromScreenLocation(point3));
        arrayList.add(getProjection().fromScreenLocation(point4));
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCameraCenterProportion(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e5db5978a395a522ff4d84414fcba72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e5db5978a395a522ff4d84414fcba72");
        } else {
            setCameraCenterProportion(f, f2, true);
        }
    }

    private void a(c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eefbe64c29d9005548b65f91acf8bc0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eefbe64c29d9005548b65f91acf8bc0f");
        } else if (this.i || this.d == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setTrafficColor failed with destroyed map");
        } else {
            this.d.setTrafficColor(cVar.g, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setPadding(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a7c8a9cbf791c1f6ff203935c4a66a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a7c8a9cbf791c1f6ff203935c4a66a5");
        } else if (this.i && this.d == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setPadding failed with destroyed map");
        } else {
            this.d.a(new PointF(i + (((this.d.b() - i) - i3) / 2), i2 + (((this.d.c() - i2) - i4) / 2)), false);
            j jVar = this.y;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "cc9aa8899b111fc0c3b692915a0ff494", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "cc9aa8899b111fc0c3b692915a0ff494");
                return;
            }
            jVar.a(jVar.f, jVar.j, jVar.i);
            jVar.o.a(jVar.q, jVar.p);
            jVar.b();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void stopAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef60305eb8877309d56c20988cdd6146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef60305eb8877309d56c20988cdd6146");
            return;
        }
        if (this.V != null) {
            this.V.add(new i(i.a.STOP_ANIMATION, null, 0L, null));
        }
        this.e.b();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28da0fe4ffe4fcfd5b60d69f17adeef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28da0fe4ffe4fcfd5b60d69f17adeef2");
        } else if (i == 1) {
            changeStyle(b.a, false);
            this.M = 1;
        } else if (i == 3) {
            changeStyle(b.b, false);
            this.M = 3;
        } else if (i == 2) {
            changeStyle(b.c, false);
            this.M = 2;
        } else {
            changeStyle(this.n, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final int getMapType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3ab7565826c35b713c832c2ecd2a08c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3ab7565826c35b713c832c2ecd2a08c")).intValue();
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getMapType failed with destroyed map");
            return 0;
        }
        return this.M;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setTrafficEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b194b748bad49088760f3a1426eaf89a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b194b748bad49088760f3a1426eaf89a");
            return;
        }
        this.N = z;
        this.d.setRoadTraffic(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isTrafficEnabled() {
        return this.N;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void clickToDeselectMarker(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e942e7663722844a7ee5c91e5e54036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e942e7663722844a7ee5c91e5e54036");
        } else {
            this.f.j.clickToDeselectMarker(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final MTMap.InfoWindowAdapter getInfoWindowAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965b048cc2978cd6f95af0cce1930829", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTMap.InfoWindowAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965b048cc2978cd6f95af0cce1930829");
        }
        com.sankuai.meituan.mapsdk.core.annotations.i iVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.annotations.i.a;
        return PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "f230a8c4464843b3835de032b25f54c0", RobustBitConfig.DEFAULT_VALUE) ? (MTMap.InfoWindowAdapter) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "f230a8c4464843b3835de032b25f54c0") : iVar.e.b;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26bb5247b3bac305b9e21c7caaf3a5a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26bb5247b3bac305b9e21c7caaf3a5a7");
            return;
        }
        this.f.b();
        if (this.l != null) {
            synchronized (this.k) {
                if (this.d != null) {
                    this.d.removeLayer(this.X);
                }
                this.l.b = null;
                this.l.d = null;
                this.l = null;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRenderFps(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5ae0c80a2362b060c8abd1dff4a5cca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5ae0c80a2362b060c8abd1dff4a5cca");
        } else if (i > 0) {
            if (this.b != i) {
                this.b = i;
                this.d.setMaxFps(i);
            }
        } else {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.d("maxFPS needs to be bigger than 0, but your value is " + this.b);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void resetRenderFps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671d32bfef48e07bd3734c62c76ee51a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671d32bfef48e07bd3734c62c76ee51a");
        } else {
            i();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void refreshContinuously(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abfae93fb1678fac6886b0b5d006f068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abfae93fb1678fac6886b0b5d006f068");
        } else {
            this.d.a(z);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6153e76fa325f0375fe1b811c2604516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6153e76fa325f0375fe1b811c2604516");
        } else if ("4.1207.11".contains("tbt")) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            int e = com.sankuai.meituan.mapsdk.mapcore.utils.g.e();
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
            if (e > 0 && this.b != e) {
                this.b = e;
                this.d.setMaxFps(this.b);
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("sync render fps with system: " + e + ", duration: " + elapsedRealtimeNanos2 + NotificationStyle.NOTIFICATION_STYLE);
                return;
            }
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f("sync render fps with system failed, duration: " + elapsedRealtimeNanos2 + NotificationStyle.NOTIFICATION_STYLE);
        } else if (this.b != 60) {
            this.b = 60;
            this.d.setMaxFps(this.b);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setZoomMode(@NonNull ac acVar) {
        float f;
        float f2;
        Object[] objArr = {acVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c14cfdf81f1e1c2a5ce76684e750ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c14cfdf81f1e1c2a5ce76684e750ef0");
            return;
        }
        this.aa.b = acVar;
        switch (acVar) {
            case TENCENT:
            case AMAP:
                f = 20.0f;
                f2 = 3.0f;
                break;
            default:
                f = 19.0f;
                f2 = 2.0f;
                break;
        }
        setMaxZoomLevel(f);
        setMinZoomLevel(f2);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final ac getZoomMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe298a5884a661d40f83227684b1a08", RobustBitConfig.DEFAULT_VALUE)) {
            return (ac) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe298a5884a661d40f83227684b1a08");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getZoomMode failed with destroyed map");
            return null;
        }
        return this.aa.b;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setTileCacheType(String str, TileCacheType tileCacheType) {
        Object[] objArr = {str, tileCacheType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39aa2e6decf317d3741cdbd871fb726d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39aa2e6decf317d3741cdbd871fb726d");
        } else if (this.d != null) {
            this.d.setTileCacheType(str, tileCacheType);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setTileCacheRatio(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32da88c8f1caa18bf000c6d7bf8b56be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32da88c8f1caa18bf000c6d7bf8b56be");
        } else if (this.d != null) {
            this.d.a(str, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapLoadedListener(final MTMap.OnMapLoadedListener onMapLoadedListener) {
        Object[] objArr = {onMapLoadedListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52b2107393d6929c8def22ceb28083a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52b2107393d6929c8def22ceb28083a4");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setOnMapLoadedListeners failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd89bac5bae38285a3ceb31533acd0f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd89bac5bae38285a3ceb31533acd0f0");
                    } else if (d.this.ah && onMapLoadedListener != null) {
                        onMapLoadedListener.onMapLoaded();
                    } else {
                        d.this.K = onMapLoadedListener;
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addOnMapLoadedListener(final MTMap.OnMapLoadedListener onMapLoadedListener) {
        Object[] objArr = {onMapLoadedListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ba503a43b4c4f84fde54ec0bd58c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ba503a43b4c4f84fde54ec0bd58c93");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ addOnMapLoadedListeners failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.d.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7640df364c4bc246ca7a2ef37ad3302f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7640df364c4bc246ca7a2ef37ad3302f");
                    } else if (onMapLoadedListener == null) {
                    } else {
                        if (!d.this.ah) {
                            d.this.L.add(onMapLoadedListener);
                        } else {
                            onMapLoadedListener.onMapLoaded();
                        }
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void show3dBuilding(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8636fe5504c09148e2223f0d1b5e58ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8636fe5504c09148e2223f0d1b5e58ad");
            return;
        }
        this.R = z;
        this.d.show3dBuilding(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean is3dBuildingShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3019158bce9de216f8b784547dfbbfe0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3019158bce9de216f8b784547dfbbfe0")).booleanValue();
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ is3dBuildingShowing failed with destroyed map");
            return false;
        }
        return this.R;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void showTrafficLight(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347b946547a1b3038f370153d25fe7ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347b946547a1b3038f370153d25fe7ef");
        } else {
            this.d.showTrafficLight(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final <T extends WeatherEffect> T getWeatherEffect(@NonNull Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed300d08aca836ad901a15a96f13fef2", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed300d08aca836ad901a15a96f13fef2");
        }
        if (cls != null) {
            WeatherEffect.DustEffect dustEffect = (T) this.Z.get(cls.getName());
            if (dustEffect == null) {
                if (cls == WeatherEffect.HotEffect.class) {
                    dustEffect = new WeatherEffect.HotEffect(this.Y);
                } else if (cls == WeatherEffect.RainEffect.class) {
                    dustEffect = new WeatherEffect.RainEffect(this.Y);
                } else if (cls == WeatherEffect.SnowEffect.class) {
                    dustEffect = new WeatherEffect.SnowEffect(this.Y);
                } else if (cls == WeatherEffect.DustEffect.class) {
                    dustEffect = new WeatherEffect.DustEffect(this.Y);
                }
                this.Z.put(cls.getName(), dustEffect);
            }
            return dustEffect;
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public final void setWeatherType(@NonNull WeatherType weatherType) {
        Object[] objArr = {weatherType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b74eb7d94d5f8c3b5adf32b7ebc159a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b74eb7d94d5f8c3b5adf32b7ebc159a");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setWeatherType failed with destroyed map");
        } else if (weatherType != null) {
            this.d.setWeatherType(weatherType.getValue());
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public final void setWeatherIntensity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687704fcb117b77fba0e091111d4a54e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687704fcb117b77fba0e091111d4a54e");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setWeatherIntensity failed with destroyed map");
        } else {
            this.d.setWeatherIntensity(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public final void disableWeather() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e197161d62dbdd23687e592701abda3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e197161d62dbdd23687e592701abda3");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ disableWeather failed with destroyed map");
        } else {
            this.d.disableWeather();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dab3229c070571f8f3c52b847c7dfab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dab3229c070571f8f3c52b847c7dfab");
            return;
        }
        this.Q = z;
        if (this.C == null || this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setIndoorEnabled failed with destroyed map");
            return;
        }
        com.sankuai.meituan.mapsdk.core.a aVar = this.C;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "53564b89e780aa3c91e64092df5a0158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "53564b89e780aa3c91e64092df5a0158");
        } else if (aVar.d == null || aVar.c == z) {
        } else {
            aVar.c = z;
            if (aVar.c) {
                aVar.d.a(aVar);
                aVar.d.setIndoor(true);
                return;
            }
            aVar.d.setIndoor(false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final DynamicMap createDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e52cbe3b01b1a754adbcd6151986d67", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e52cbe3b01b1a754adbcd6151986d67");
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ createDynamicMap failed with destroyed map");
            return null;
        }
        return new DynamicMap(new com.sankuai.meituan.mapsdk.core.annotations.n(this, str));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorEntranceZoomLevel(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b9f95d6aed799e6a782d3fff5e9c3eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b9f95d6aed799e6a782d3fff5e9c3eb");
        } else if (this.C == null || this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setIndoorFloor failed with destroyed map");
        } else {
            com.sankuai.meituan.mapsdk.core.a aVar = this.C;
            Object[] objArr2 = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9322e776cb3b0380ba55f9e21fe8a3dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9322e776cb3b0380ba55f9e21fe8a3dc");
            } else {
                aVar.b = d;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final double getIndoorEntranceZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fdbccd8c32caf6056da78531fbbd1c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fdbccd8c32caf6056da78531fbbd1c6")).doubleValue();
        }
        if (this.C == null || this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setIndoorFloor failed with destroyed map");
            return 17.0d;
        }
        return this.C.b;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCameraEyeParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20de9089524f317d409603b05e4c25d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20de9089524f317d409603b05e4c25d6");
        } else {
            this.d.setCameraEyeParams(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void showBlockedRoad(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f80b70f8063370a520421de5b5faa6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f80b70f8063370a520421de5b5faa6f");
        } else {
            this.d.setRoadBlock(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isBlockedRoadShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2527b70e40fb284c4b1e5083559d25", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2527b70e40fb284c4b1e5083559d25")).booleanValue();
        }
        if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ isBlockedRoadShowing failed with destroyed map");
            return false;
        }
        return false;
    }

    @Override // com.meituan.mtmap.rendersdk.MapObserver
    public final void onUpdate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327de88f9d195c3c176a2b6a439865c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327de88f9d195c3c176a2b6a439865c5");
        } else if (this.i) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a("request render interval: " + (currentTimeMillis - this.U));
            this.U = currentTimeMillis;
            if (this.j != null) {
                this.j.a();
            }
        }
    }

    @Override // com.meituan.mtmap.rendersdk.MapObserver
    public final void onMapChange(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb03dc9c3af8680f9ae0ba7e025f36a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb03dc9c3af8680f9ae0ba7e025f36a3");
            return;
        }
        if (i == 7 && !this.ai) {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(currentTimeMillis - this.aj));
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_loading_duration", hashMap);
            this.ai = true;
        }
        if (i == 4 || i == 5) {
            this.T = getCameraPosition();
            if (this.T == null) {
                return;
            }
        }
        if (i == 14) {
            this.ak.put("map_will_load", Long.valueOf(SystemClock.elapsedRealtime()));
        } else if (i == 8) {
            this.ak.put("map_first_render_count", Long.valueOf(this.d.getRenderFrameNum()));
            reportMapLoadTime(3, this.ak);
        }
        Iterator<OnMapChangedListener> it = this.W.iterator();
        while (it.hasNext()) {
            it.next().a(i, this.T);
        }
    }

    @Override // com.meituan.mtmap.rendersdk.MapObserver
    public final void onMapChange(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab2c74fa68f7a5b7a11b378f59dce53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab2c74fa68f7a5b7a11b378f59dce53");
        } else if (i == 7) {
            this.ak.put("map_finish_load", Long.valueOf(SystemClock.elapsedRealtime()));
            this.ak.put("style_url", str);
            this.ak.put("style_cached", Integer.valueOf(i2));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum c {
        ROAD_BACKGROUND(-1),
        SMOOTH(0),
        SLOW(1),
        BLOCK(2),
        SERIOUS_BLOCK(3);
        
        public static ChangeQuickRedirect a;
        public int g;

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd602b944421a9fa53ecc9e4c16430f4", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd602b944421a9fa53ecc9e4c16430f4") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f691dbe7d56f8e0686ec5b693f98e1b3", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f691dbe7d56f8e0686ec5b693f98e1b3") : (c[]) values().clone();
        }

        c(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e027f05147a5212cdc54943da7b744ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e027f05147a5212cdc54943da7b744ff");
            } else {
                this.g = i;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements OnMapChangedListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d2f48b15731d73811e052a125eb3fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d2f48b15731d73811e052a125eb3fe");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.core.interfaces.OnMapChangedListener
        @SuppressLint({"SwitchIntDef"})
        public final void a(int i, CameraPosition cameraPosition) {
            Object[] objArr = {Integer.valueOf(i), cameraPosition};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5212fc6d338dfdd11959e15169713399", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5212fc6d338dfdd11959e15169713399");
                return;
            }
            switch (i) {
                case 2:
                    d.this.ag = true;
                    return;
                case 3:
                case 6:
                case 7:
                default:
                    return;
                case 4:
                case 5:
                    d.this.af = false;
                    d.this.ag = false;
                    return;
                case 8:
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfe38b4bffe6ec7bf25941cf4ce44649", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfe38b4bffe6ec7bf25941cf4ce44649");
                        return;
                    } else if (d.this.i) {
                        return;
                    } else {
                        d.c(d.this, true);
                        com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.d.a.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cc8c882ed28fabe0bcae1825ad26f57a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cc8c882ed28fabe0bcae1825ad26f57a");
                                    return;
                                }
                                if (d.this.K != null) {
                                    d.this.K.onMapLoaded();
                                }
                                for (MTMap.OnMapLoadedListener onMapLoadedListener : d.this.L) {
                                    if (onMapLoadedListener != null) {
                                        onMapLoadedListener.onMapLoaded();
                                    }
                                }
                            }
                        });
                        return;
                    }
                case 9:
                    d.this.af = true;
                    return;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setViewInfoWindowEnabled(boolean z) {
        this.ao = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapCustomEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8576410dc5be29da0637b3b850bbdcde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8576410dc5be29da0637b3b850bbdcde");
        } else if (this.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setMapCustomEnable failed with destroyed map");
        } else {
            changeStyle(z ? this.n : this.ae, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapTouchListener(MTMap.OnMapTouchListener onMapTouchListener) {
        Object[] objArr = {onMapTouchListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a78b5049c6714f40a7c53dc82bab42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a78b5049c6714f40a7c53dc82bab42");
        } else {
            this.e.h = onMapTouchListener;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void enableMultipleInfowindow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d188de9ade4dc5c298af4d063b53579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d188de9ade4dc5c298af4d063b53579");
        } else {
            setMultiInfoWindowEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f56b2143a1c487ee243ee59b76512f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f56b2143a1c487ee243ee59b76512f26");
            return;
        }
        if (this.J != null) {
            if (this.al != null) {
                this.J.remove(this.I);
            } else {
                this.J.add(zVar);
            }
        }
        this.I = zVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setDrawPillarWith2DStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3293ccb317bcbae48c8bc94b5919136b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3293ccb317bcbae48c8bc94b5919136b");
        } else {
            show3dBuilding(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorPosition(LatLng latLng, String str, String str2, int i) {
        Object[] objArr = {latLng, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33789234a957005c445bb0b1e53bafe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33789234a957005c445bb0b1e53bafe3");
            return;
        }
        setIndoorEnabled(true);
        moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18.0f));
        setIndoorFloor(str, str2, i);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "025375dc89b312487c0c2f0fd2383ee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "025375dc89b312487c0c2f0fd2383ee7");
        } else {
            this.d.createDynamicMap(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4a2be95f8930ae2a2c48d3a77d56c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4a2be95f8930ae2a2c48d3a77d56c4");
        } else {
            this.d.destroyDynamicMap(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setDynamicMapFeature(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b13403ac560242c23a21ebf48b1690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b13403ac560242c23a21ebf48b1690");
        } else {
            this.d.setDynamicMapFeature(str, Long.parseLong(str2), str3, str4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void resetDynamicMapFeatures(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38994e11b24914254b88cc9b68bbd99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38994e11b24914254b88cc9b68bbd99");
        } else {
            this.d.resetDynamicMapFeatures(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeDynamicMapGeoJSON(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf64d442d86c54b86f01b2851cfc12e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf64d442d86c54b86f01b2851cfc12e");
        } else {
            this.d.removeDynamicMapGeoJSON(str, str2);
        }
    }
}
