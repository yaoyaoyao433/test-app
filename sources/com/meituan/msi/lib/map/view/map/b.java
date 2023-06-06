package com.meituan.msi.lib.map.view.map;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.widget.FrameLayout;
import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.utils.d;
import com.meituan.msi.lib.map.utils.f;
import com.meituan.msi.lib.map.utils.j;
import com.meituan.msi.lib.map.view.model.g;
import com.meituan.msi.lib.map.view.model.h;
import com.meituan.msi.lib.map.view.model.i;
import com.meituan.msi.lib.map.view.model.k;
import com.meituan.msi.lib.map.view.model.m;
import com.meituan.msi.lib.map.view.model.n;
import com.meituan.msi.lib.map.view.model.o;
import com.meituan.msi.lib.map.view.model.q;
import com.meituan.msi.lib.map.view.model.r;
import com.meituan.msi.lib.map.view.model.s;
import com.meituan.msi.lib.map.view.model.t;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.AbstractMapView;
import com.sankuai.meituan.mapsdk.maps.CameraMapGestureType;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.MapRenderLayer;
import com.sankuai.meituan.mapsdk.maps.TextureMapView;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.EngineMode;
import com.sankuai.meituan.mapsdk.maps.model.IndoorBuilding;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import com.sankuai.meituan.mapsdk.maps.model.TrafficStyle;
import java.lang.ref.SoftReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class b extends FrameLayout implements com.meituan.msi.view.c, com.meituan.msi.view.e {
    public static ChangeQuickRedirect a;
    private static Handler aq;
    TrafficStyle A;
    public ac B;
    EngineMode C;
    public float D;
    public float[] E;
    public long F;
    public long G;
    public boolean H;
    List<String> I;
    public SparseArray<f> J;
    private AbstractMapView K;
    private Surface L;
    private MsiContext M;
    private LatLng N;
    private y.b O;
    private int P;
    private int Q;
    private com.meituan.msi.lib.map.api.interfaces.a R;
    private final List<q> S;
    private final SparseArray<com.meituan.msi.lib.map.view.model.e> T;
    private final SparseArray<o> U;
    private final List<q> V;
    private final SparseArray<k> W;
    private final SparseArray<s> aa;
    private final HashMap<String, i> ab;
    private final HashMap<Integer, com.meituan.msi.lib.map.view.model.a> ac;
    private h ad;
    private String ae;
    private String af;
    private int ag;
    private boolean ah;
    private String ai;
    private final HashMap<String, String> aj;
    private long ak;
    private long al;
    private long am;
    private boolean an;
    private int ao;
    private Runnable ap;
    MTMap b;
    public c c;
    String d;
    public boolean e;
    String f;
    String g;
    int h;
    public com.meituan.msi.lib.map.location.a i;
    public y j;
    public String k;
    boolean l;
    boolean m;
    public MTMap.OnMapClickListener n;
    public MTMap.OnMapLoadedListener o;
    public MTMap.OnMapLongClickListener p;
    public MTMap.OnPolylineClickListener q;
    public MTMap.OnPolygonClickListener r;
    public MTMap.OnMarkerClickListener s;
    public MTMap.OnMarkerSelectChangeListener t;
    public MTMap.OnInfoWindowClickListener u;
    public MTMap.OnCameraChangeListener v;
    public MTMap.OnMapPoiClickListener w;
    public d x;
    public final SparseArray<m> y;
    public a z;

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        return false;
    }

    @Override // com.meituan.msi.view.c
    public final Object getSlWidget() {
        return null;
    }

    @Override // com.meituan.msi.view.c
    public final void setSLWidget(Object obj) {
    }

    public static /* synthetic */ int a(b bVar) {
        int i = bVar.ao;
        bVar.ao = i + 1;
        return i;
    }

    public static /* synthetic */ JsonObject a(b bVar, int i, IndoorBuilding indoorBuilding) {
        Object[] objArr = {Integer.valueOf(i), indoorBuilding};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "a2ac510e41e75d5ed6e59c38d40c485a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "a2ac510e41e75d5ed6e59c38d40c485a");
        }
        JsonObject jsonObject = new JsonObject();
        if (indoorBuilding != null) {
            jsonObject.addProperty("mapId", Integer.valueOf(i));
            jsonObject.addProperty("id", indoorBuilding.getPoiId());
            jsonObject.addProperty("indoorId", indoorBuilding.getBuildingId());
            jsonObject.addProperty("poiName", indoorBuilding.getName());
            if (indoorBuilding.getIndoorLevelList() != null) {
                JsonArray jsonArray = new JsonArray();
                List<String> indoorFloorNums = indoorBuilding.getIndoorFloorNums();
                for (int size = indoorFloorNums.size() - 1; size >= 0; size--) {
                    jsonArray.add(Integer.valueOf(Integer.parseInt(indoorFloorNums.get(size))));
                }
                jsonObject.add("floorNums", jsonArray);
            }
            if (indoorBuilding.getIndoorFloorNames() != null) {
                bVar.I = indoorBuilding.getIndoorFloorNames();
                JsonArray jsonArray2 = new JsonArray();
                List<String> indoorFloorNames = indoorBuilding.getIndoorFloorNames();
                for (int size2 = indoorFloorNames.size() - 1; size2 >= 0; size2--) {
                    jsonArray2.add(indoorFloorNames.get(size2));
                }
                jsonObject.add("floorNames", jsonArray2);
                if (indoorFloorNames.size() > 0) {
                    jsonObject.addProperty("activeFloorIndex", Integer.valueOf((indoorFloorNames.size() - indoorBuilding.getActiveIndex()) - 1));
                }
            }
            jsonObject.addProperty("defaultFloorIndex", indoorBuilding.getDefaultFloorNum());
        } else {
            bVar.I = null;
        }
        return jsonObject;
    }

    public static /* synthetic */ void a(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "c9a340620cb7bf8a46b223883c89a97e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "c9a340620cb7bf8a46b223883c89a97e");
            return;
        }
        switch (i) {
            case 400:
                bVar.a(400, "show location is false");
                return;
            case 401:
                bVar.a(401, "location no permission");
                return;
            case 402:
                bVar.a(402, "location strategy error");
                return;
            case 403:
                bVar.a(403, "activity has been destroy");
                return;
            default:
                bVar.a(i, "location error");
                return;
        }
    }

    public static /* synthetic */ int b(b bVar) {
        int i = bVar.ao - 1;
        bVar.ao = i;
        return i;
    }

    public static /* synthetic */ void h(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "c295d6f9a876f2ec6bb3856a033a2649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "c295d6f9a876f2ec6bb3856a033a2649");
            return;
        }
        try {
            bVar.K.onPause();
            bVar.K.onStop();
        } finally {
            bVar.h();
        }
    }

    public b(@NonNull MsiContext msiContext) {
        super(msiContext.getActivity());
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e93b396ea0ba69be315bd391e762cf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e93b396ea0ba69be315bd391e762cf9");
            return;
        }
        this.d = AbsApiFactory.PASSPORT_ONLINE_URL;
        this.f = "";
        this.g = "";
        this.h = -1;
        this.k = "";
        this.l = false;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = new SparseArray<>();
        this.S = new ArrayList();
        this.T = new SparseArray<>();
        this.U = new SparseArray<>();
        this.V = new CopyOnWriteArrayList();
        this.W = new SparseArray<>();
        this.aa = new SparseArray<>();
        this.ab = new HashMap<>();
        this.ac = new HashMap<>();
        this.z = null;
        this.A = null;
        this.B = ac.TENCENT;
        this.C = EngineMode.DEFAULT;
        this.ae = "70719c38-06c7-43fc-ac9e-9cf97f9ebb98";
        this.af = "";
        this.ag = 3;
        this.ah = false;
        this.ai = "";
        this.aj = new HashMap<String, String>() { // from class: com.meituan.msi.lib.map.view.map.b.1
            {
                put("platform", "1");
                put("techType", "3");
                put("mapVersion", "4.1207.6");
            }
        };
        this.ak = 0L;
        this.al = 0L;
        this.am = 0L;
        this.F = 0L;
        this.G = 0L;
        this.H = false;
        this.an = false;
        this.ao = 0;
        this.J = new SparseArray<>();
        this.M = msiContext;
    }

    @SuppressLint({"SetTextI18n"})
    public final void a(boolean z) {
        AbstractMapView mapRenderLayer;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d65d175a80d5cd88ff9a5fde86543fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d65d175a80d5cd88ff9a5fde86543fee");
            return;
        }
        this.e = !z ? 1 : 0;
        if (!this.H) {
            this.ag = UserCenter.OAUTH_TYPE_QQ.equals(this.d) ? 1 : 3;
        } else {
            this.ag = 1;
        }
        if (this.e) {
            mapRenderLayer = new TextureMapView(getContext(), this.ag, Platform.MSI, this.ae, this.af);
        } else {
            mapRenderLayer = new MapRenderLayer(getContext(), this.ag, Platform.MSI, this.ae, this.af);
        }
        this.K = mapRenderLayer;
        this.aj.put("mapVender", String.valueOf(this.ag));
        this.aj.put("mapKey", this.ae);
        this.aj.put("biz", this.af);
        j.a(this.M, this.ag, this.ae, this.af);
        MapViewOptions mapViewOptions = new MapViewOptions();
        mapViewOptions.setEngineMode(this.C);
        mapViewOptions.setZoomMode(this.B);
        mapViewOptions.setReuseEngineTag(this.ai);
        mapViewOptions.useOverseasMap(this.ah);
        this.K.setMapViewOptions(mapViewOptions);
        if (this.e) {
            addView(this.K, new FrameLayout.LayoutParams(-1, -1));
        }
        a(this.ak, System.currentTimeMillis(), "MTMapMSIFSViewReadyTime");
        if (g()) {
            f();
        }
    }

    public final void setReuseEngineTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbddec0b3567307bf2f17961a21545f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbddec0b3567307bf2f17961a21545f4");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.ai = str;
        }
    }

    public final void setEmbedSurface(com.meituan.msi.lib.map.api.interfaces.a aVar) {
        this.R = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r13.equals("gaode") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setZoomMode(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msi.lib.map.view.map.b.a
            java.lang.String r11 = "accaaeb687c6430dedc6f7e537144e5e"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = 98122262(0x5d93a16, float:2.042792E-35)
            if (r2 == r3) goto L36
            r0 = 945738687(0x385ed3bf, float:5.312613E-5)
            if (r2 == r0) goto L2b
            goto L40
        L2b:
            java.lang.String r0 = "meituan"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r2 = "gaode"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L40
            goto L41
        L40:
            r0 = -1
        L41:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L47;
                default: goto L44;
            }
        L44:
            com.sankuai.meituan.mapsdk.maps.interfaces.ac r13 = com.sankuai.meituan.mapsdk.maps.interfaces.ac.TENCENT
            goto L4c
        L47:
            com.sankuai.meituan.mapsdk.maps.interfaces.ac r13 = com.sankuai.meituan.mapsdk.maps.interfaces.ac.AMAP
            goto L4c
        L4a:
            com.sankuai.meituan.mapsdk.maps.interfaces.ac r13 = com.sankuai.meituan.mapsdk.maps.interfaces.ac.MEITUAN
        L4c:
            r12.B = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.lib.map.view.map.b.setZoomMode(java.lang.String):void");
    }

    public final void setEngineMode(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0891d0a8f5bda69a4d8526e404eb5af4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0891d0a8f5bda69a4d8526e404eb5af4");
        } else if (str.equals("stack")) {
            this.C = EngineMode.REUSE;
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef243dddc248eb36483f71e1420e33a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef243dddc248eb36483f71e1420e33a6");
        } else if (this.an) {
        } else {
            this.K.onCreate(null);
            this.b = this.K.getMap();
            if (this.C == EngineMode.DEFAULT) {
                this.K.onResume();
            }
            this.an = true;
            if (this.ap != null) {
                this.ap.run();
                this.ap = null;
            }
        }
    }

    public final void setMapType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86da6a32d1c7839a044d2d0bfb1f079d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86da6a32d1c7839a044d2d0bfb1f079d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.d = str;
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ccc8601e1886f9be18b2463b1ad74db", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ccc8601e1886f9be18b2463b1ad74db")).booleanValue() : this.b.isMapDestroyed();
    }

    @Override // com.meituan.msi.view.c
    public final void setSurface(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3f654175dee0e5f6a6ed0b5f26fd76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3f654175dee0e5f6a6ed0b5f26fd76");
        } else if (this.L == surface) {
        } else {
            this.L = surface;
            if (!this.an) {
                MapViewOptions mapViewOptions = new MapViewOptions();
                mapViewOptions.setExtSurface(surface, this.P, this.Q);
                this.K.setMapViewOptions(mapViewOptions);
            }
            f();
            this.R.a();
        }
    }

    @Override // com.meituan.msi.view.c
    public final void a(Surface surface, int i, int i2) {
        Object[] objArr = {surface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802b8f2b60a0168aed8437f6aadaea0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802b8f2b60a0168aed8437f6aadaea0c");
            return;
        }
        this.P = i;
        this.Q = i2;
        if (this.K == null || surface == null || !(this.K instanceof MapRenderLayer)) {
            return;
        }
        this.K.onSizeChanged(i, i2, this.K.getWidth(), this.K.getHeight());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4633bad064fcf3c5af045a324288a31c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4633bad064fcf3c5af045a324288a31c");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.K == null || this.E == null || this.E.length < 2 || this.ag == 1) {
            return;
        }
        a(this.E[0], this.E[1]);
    }

    @Override // android.view.ViewGroup, android.view.View, com.meituan.msi.view.c
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f55a62ecfd7bf4d8f839196b6174c7fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f55a62ecfd7bf4d8f839196b6174c7fe")).booleanValue();
        }
        if (this.e) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return this.K.dispatchTouchEvent(motionEvent);
    }

    @Override // com.meituan.msi.view.c
    public final void d() {
        this.L = null;
    }

    private boolean g() {
        return this.e || this.L != null;
    }

    public final void setToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d2fe779733415f585882597e4f86fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d2fe779733415f585882597e4f86fa");
        } else if (this.f.equals(str)) {
        } else {
            this.m = true;
            this.f = str;
        }
    }

    public final void setBusinessName(String str) {
        this.g = str;
    }

    public final void setLocationKey(String str) {
        this.k = str;
    }

    public final void setLocationStrategy(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50df27a4e19129a983a5175a35d7ed29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50df27a4e19129a983a5175a35d7ed29");
        } else if (this.h == i) {
        } else {
            this.m = true;
            this.h = i;
        }
    }

    public final void setOversea(boolean z) {
        this.ah = z;
    }

    public boolean a(Object obj, MsiContext msiContext) {
        Object[] objArr = {obj, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d314ea797cd8c1fea9db256d163ea8f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d314ea797cd8c1fea9db256d163ea8f1")).booleanValue();
        }
        if (!(obj instanceof JsonArray)) {
            msiContext.onError(1201, "invalid data");
            return false;
        }
        JsonArray jsonArray = (JsonArray) obj;
        if (jsonArray.size() == 0) {
            msiContext.onSuccess(null);
            return false;
        }
        try {
            Float.parseFloat(jsonArray.get(0).getAsString());
            return true;
        } catch (NullPointerException | NumberFormatException unused) {
            msiContext.onError(1201, "invalid data");
            return false;
        }
    }

    public boolean a(Object obj, float[] fArr, MsiContext msiContext) {
        float f;
        Object[] objArr = {obj, fArr, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9d2747a85a531dc1111c06460a3b47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9d2747a85a531dc1111c06460a3b47")).booleanValue();
        }
        if (!(obj instanceof JsonArray)) {
            msiContext.onError(1201, "invalid data");
            return false;
        }
        JsonArray jsonArray = (JsonArray) obj;
        try {
            float parseFloat = Float.parseFloat(jsonArray.get(0).getAsString());
            try {
                f = Float.parseFloat(jsonArray.get(1).getAsString());
            } catch (NullPointerException | NumberFormatException unused) {
                f = 0.5f;
            }
            if (parseFloat > 1.0f) {
                parseFloat = 1.0f;
            }
            if (parseFloat < 0.0f) {
                parseFloat = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            fArr[0] = parseFloat;
            fArr[1] = f;
            return true;
        } catch (NullPointerException | NumberFormatException unused2) {
            msiContext.onError(1201, "invalid data");
            return false;
        }
    }

    public void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca289acc9412b8e378d35abafa7beb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca289acc9412b8e378d35abafa7beb8");
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            width = this.P;
            height = this.Q;
        }
        float f3 = width * f;
        float f4 = height * f2;
        if (this.b != null) {
            this.b.setCameraCenterProportion(f3, f4);
        }
    }

    public final void a(b bVar, JsonObject jsonObject, boolean z) {
        int i = 0;
        Object[] objArr = {bVar, jsonObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56882d8ad2f2a716b9967e486bf2f538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56882d8ad2f2a716b9967e486bf2f538");
            return;
        }
        SparseArray<m> markers = bVar.getMarkers();
        if (z) {
            int size = markers.size();
            while (i < size) {
                markers.get(markers.keyAt(i)).b();
                i++;
            }
            markers.clear();
            return;
        }
        JsonArray asJsonArray = jsonObject.has("markers") ? jsonObject.get("markers").getAsJsonArray() : null;
        if (asJsonArray != null) {
            while (i < asJsonArray.size()) {
                int asInt = asJsonArray.get(i).getAsInt();
                m mVar = markers.get(asInt);
                if (mVar != null) {
                    mVar.b();
                    markers.remove(asInt);
                }
                i++;
            }
        }
    }

    public final void a(b bVar, MsiContext msiContext, JsonObject jsonObject) {
        Object[] objArr = {bVar, msiContext, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9791082930059cfb200b72f24dbdd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9791082930059cfb200b72f24dbdd0");
            return;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("points", jsonObject.get("includePoints"));
        b(bVar, msiContext, jsonObject2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.meituan.msi.lib.map.view.map.b r18, com.meituan.msi.bean.MsiContext r19, com.google.gson.JsonObject r20) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.lib.map.view.map.b.b(com.meituan.msi.lib.map.view.map.b, com.meituan.msi.bean.MsiContext, com.google.gson.JsonObject):void");
    }

    public final void a(FrameLayout frameLayout, JsonObject jsonObject, MsiContext msiContext) {
        Object[] objArr = {frameLayout, jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c81c911ca28d0c582816221ee043438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c81c911ca28d0c582816221ee043438");
            return;
        }
        b bVar = (b) frameLayout;
        if (bVar.a()) {
            msiContext.onError(1201, "mapView is destroyed");
            return;
        }
        this.al = j.a(jsonObject);
        a(this.al, this.am, "MTMapMSIPointToNativeTime");
        new n(bVar, msiContext, jsonObject).a();
        a(this.al, System.currentTimeMillis(), "MTMapMSIPointReadyTime");
    }

    public final void a(final b bVar, final MsiContext msiContext, final JsonObject jsonObject, final int i, final boolean z, final int i2) {
        Object[] objArr = {bVar, msiContext, jsonObject, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a10334bf415c638e16b99f855b7ca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a10334bf415c638e16b99f855b7ca9");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.meituan.msi.lib.map.view.map.b.26
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:209:0x05d0  */
            /* JADX WARN: Removed duplicated region for block: B:210:0x05db  */
            /* JADX WARN: Type inference failed for: r6v11 */
            /* JADX WARN: Type inference failed for: r6v12 */
            /* JADX WARN: Type inference failed for: r6v4 */
            /* JADX WARN: Type inference failed for: r6v8 */
            /* JADX WARN: Type inference failed for: r6v9 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2289
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.lib.map.view.map.b.AnonymousClass26.run():void");
            }
        };
        if (g()) {
            runnable.run();
        } else {
            this.ap = runnable;
        }
    }

    float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ecdaae068b63560028a3587271bda6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ecdaae068b63560028a3587271bda6")).floatValue();
        }
        if (this.B == ac.MEITUAN) {
            if (f > 19.0f) {
                return 19.0f;
            }
            if (f < 2.0f) {
                return 2.0f;
            }
            return f;
        } else if (f > 20.0f) {
            return 20.0f;
        } else {
            if (f < 3.0f) {
                return 3.0f;
            }
            return f;
        }
    }

    public final LatLng getLocationLatLng() {
        return this.N;
    }

    public final void setExtLocationSource(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549f4b8296d28f10ebaba30f073eb0da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549f4b8296d28f10ebaba30f073eb0da");
        } else if (!this.l || TextUtils.isEmpty(this.k)) {
        } else {
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "869be58db33608fdaedced2ca8383455", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "869be58db33608fdaedced2ca8383455");
            } else {
                try {
                    com.meituan.msi.lib.map.utils.d dVar = new com.meituan.msi.lib.map.utils.d(new d.a() { // from class: com.meituan.msi.lib.map.view.map.b.27
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msi.lib.map.utils.d.a
                        public final void a(MapLocation mapLocation) {
                            Object[] objArr3 = {mapLocation};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb06b288b4fa801d70bc011369457c1b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb06b288b4fa801d70bc011369457c1b");
                            } else if (mapLocation == null || bVar.O == null) {
                            } else {
                                bVar.N = new LatLng(mapLocation.getLatitude(), mapLocation.getLongitude());
                                bVar.O.onLocationChanged(mapLocation);
                            }
                        }
                    });
                    Class<?> cls = Class.forName("com.meituan.map.extlocationsource.ExtLocationManager");
                    Class<?> cls2 = Class.forName("com.meituan.map.extlocationsource.ILocationProvider");
                    cls.getMethod("insertLocationSource", String.class, cls2).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), this.k, new SoftReference(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls2}, dVar)).get());
                } catch (Exception | NoClassDefFoundError unused) {
                }
            }
            b(true);
        }
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c8c0a73a405f0f84af0e86cb6cd3dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c8c0a73a405f0f84af0e86cb6cd3dc");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        try {
            jsonObject.addProperty("errCode", Integer.valueOf(i));
            jsonObject.addProperty("errMsg", str);
        } catch (JsonIOException e) {
            e.printStackTrace();
        }
        if (this.c != null) {
            this.c.a("map.bindmaperror", jsonObject);
        }
    }

    void a(double d, double d2, float f, float f2, float f3) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd3e7283026cf80c4982849377978b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd3e7283026cf80c4982849377978b0");
        } else if (this.b != null) {
            this.b.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(new LatLng(d, d2), f, f2, -f3)));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msi.lib.map.view.map.b$22  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass22 {
        public static final /* synthetic */ int[] a = new int[CameraMapGestureType.valuesCustom().length];

        static {
            try {
                a[CameraMapGestureType.PAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CameraMapGestureType.PINCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CameraMapGestureType.DOUBLE_TAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final void setIndoorListener(final d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30cddb26152ae7b8966e28d7f425475b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30cddb26152ae7b8966e28d7f425475b");
        } else {
            this.b.setOnIndoorStateChangeListener(new MTMap.OnIndoorStateChangeListener() { // from class: com.meituan.msi.lib.map.view.map.b.15
                public static ChangeQuickRedirect a;
                public IndoorBuilding b = null;
                public boolean c = false;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnIndoorStateChangeListener
                public final boolean onIndoorBuildingFocused() {
                    this.c = true;
                    return false;
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnIndoorStateChangeListener
                public final boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
                    Object[] objArr2 = {indoorBuilding};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6c1f8afd58036dce004aad8c1b1f19b", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6c1f8afd58036dce004aad8c1b1f19b")).booleanValue();
                    }
                    if (this.c) {
                        dVar.a(indoorBuilding);
                        this.c = false;
                    } else {
                        dVar.b(indoorBuilding);
                    }
                    this.b = indoorBuilding;
                    return false;
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnIndoorStateChangeListener
                public final boolean onIndoorBuildingDeactivated() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3ad2a9cf53d1a018c75ad3011e88f92", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3ad2a9cf53d1a018c75ad3011e88f92")).booleanValue();
                    }
                    dVar.c(this.b);
                    return false;
                }
            });
        }
    }

    public final SparseArray<m> getMarkers() {
        return this.y;
    }

    public final List<q> getPolyLines() {
        return this.S;
    }

    public final List<q> getFlowLines() {
        return this.V;
    }

    public final SparseArray<com.meituan.msi.lib.map.view.model.e> getCircles() {
        return this.T;
    }

    public final SparseArray<o> getPolygons() {
        return this.U;
    }

    public final SparseArray<k> getHeatOverlays() {
        return this.W;
    }

    public final SparseArray<s> getRippleViews() {
        return this.aa;
    }

    public final HashMap<String, i> getGroundOverlays() {
        return this.ab;
    }

    public final HashMap<Integer, com.meituan.msi.lib.map.view.model.a> getArcs() {
        return this.ac;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8732c7f9b4e120ef8a7b59f35248bc81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8732c7f9b4e120ef8a7b59f35248bc81");
            return;
        }
        super.onDetachedFromWindow();
        Runnable runnable = new Runnable() { // from class: com.meituan.msi.lib.map.view.map.b.17
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6de83107cfc63c8f92cefea224d8b625", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6de83107cfc63c8f92cefea224d8b625");
                } else {
                    b.h(b.this);
                }
            }
        };
        Object[] objArr2 = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ea803e2d5a4ecbdbf184a70582321069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ea803e2d5a4ecbdbf184a70582321069");
            return;
        }
        if (aq == null) {
            aq = new Handler(Looper.getMainLooper());
        }
        aq.post(runnable);
    }

    void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34dc9f0cf5ac5956d32e5fb12900e56c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34dc9f0cf5ac5956d32e5fb12900e56c");
            return;
        }
        try {
            Class<?> cls = Class.forName("com.meituan.map.extlocationsource.ExtLocationManager");
            cls.getDeclaredMethod("changeLocationStatus", Boolean.TYPE).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), Boolean.valueOf(z));
        } catch (Exception | NoClassDefFoundError e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e(e.toString());
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845d3333b594b437512fbb477d5f9803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845d3333b594b437512fbb477d5f9803");
            return;
        }
        if (getRippleViews().size() > 0) {
            new t(this.b, this.M, null, getRippleViews()).a();
        }
        if (this.i != null) {
            this.i.a(this.M);
        }
        if (this.j != null) {
            this.j = null;
        }
        if (this.O != null) {
            this.O = null;
        }
        if (!TextUtils.isEmpty(this.k)) {
            b(false);
        }
        e();
        if (this.b != null && this.C != EngineMode.REUSE) {
            this.b.setOnMapClickListener(null);
            this.b.setOnMapLoadedListener(null);
            this.b.setOnMapLongClickListener(null);
            this.b.setOnPolylineClickListener(null);
            this.b.setOnPolygonClickListener(null);
            this.b.setOnMarkerClickListener(null);
            this.b.setOnMarkerSelectChangeListener(null);
            this.b.setOnInfoWindowClickListener(null);
            this.b.setOnCameraChangeListener(null);
            this.b.setOnMapPoiClickListener(null);
            this.b.setLocationSource(null);
            this.b.setOnIndoorStateChangeListener(null);
            this.b.clear();
            c(false);
        }
        if (this.K != null) {
            this.K.onDestroy();
        }
        if (this.J.size() != 0) {
            for (int i = 0; i < this.J.size(); i++) {
                this.J.get(this.J.keyAt(i)).a();
            }
        }
        this.M = null;
    }

    public final void c(boolean z) {
        g gVar;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "246a9b0167259e35b326518193e4e180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "246a9b0167259e35b326518193e4e180");
        } else if (this.ad == null || (gVar = this.ad.d) == null) {
        } else {
            if (z) {
                gVar.b();
            } else {
                gVar.c();
            }
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b51f864d3847cf9def7a44fa15300be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b51f864d3847cf9def7a44fa15300be9");
            return;
        }
        this.T.clear();
        this.y.clear();
        this.U.clear();
        this.S.clear();
        this.W.clear();
        this.V.clear();
        this.aa.clear();
        this.ab.clear();
        this.ac.clear();
    }

    public final void setListener(c cVar) {
        this.c = cVar;
    }

    public final MTMap getMtMap() {
        return this.b;
    }

    public final AbstractMapView getMapView() {
        return this.K;
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a6d90a4343a10955c7be72f4657408", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a6d90a4343a10955c7be72f4657408");
            return;
        }
        if (this.K != null) {
            this.K.onPause();
        }
        if (this.i != null) {
            this.i.f = true;
        }
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d73249cd54def0a57bcacee5c4b62f6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d73249cd54def0a57bcacee5c4b62f6b");
            return;
        }
        if (this.K != null && this.C == EngineMode.DEFAULT) {
            this.K.onResume();
        }
        if (this.i != null) {
            com.meituan.msi.lib.map.location.a aVar = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.location.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5d16005e43a5b155c78f4745694662d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5d16005e43a5b155c78f4745694662d3");
                return;
            }
            aVar.f = false;
            if (aVar.d != null || aVar.g == null) {
                return;
            }
            aVar.a(aVar.g);
        }
    }

    public final void a(String str, b bVar, MsiContext msiContext, JsonObject jsonObject) {
        Object[] objArr = {str, bVar, msiContext, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cca6b18334c0b64006d12c87f90957f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cca6b18334c0b64006d12c87f90957f");
        } else if (bVar.a()) {
            msiContext.onError(1201, "mapView is destroyed");
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -895357017:
                    if (str.equals("addDynamicMapResources")) {
                        c = 1;
                        break;
                    }
                    break;
                case -778885404:
                    if (str.equals("removeDynamicMapResources")) {
                        c = 3;
                        break;
                    }
                    break;
                case -481161797:
                    if (str.equals("addDynamicMapGeoJSON")) {
                        c = 2;
                        break;
                    }
                    break;
                case 749695041:
                    if (str.equals("removeDynamicMap")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1540088505:
                    if (str.equals("createDynamicMap")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.ad = new h(bVar);
                    this.ad.a(jsonObject, msiContext);
                    return;
                case 1:
                    if (this.ad != null) {
                        this.ad.b(jsonObject, msiContext);
                        return;
                    }
                    return;
                case 2:
                    if (this.ad != null) {
                        this.ad.c(jsonObject, msiContext);
                        return;
                    }
                    return;
                case 3:
                    if (this.ad != null) {
                        this.ad.d(jsonObject, msiContext);
                        return;
                    }
                    return;
                case 4:
                    if (this.ad != null) {
                        this.ad.e(jsonObject, msiContext);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void setMapkey(String str) {
        this.ae = str;
    }

    public final void setBiz(String str) {
        this.af = str;
    }

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea2d9e6ef32aeabfb8b36c37aed3b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea2d9e6ef32aeabfb8b36c37aed3b9d");
            return;
        }
        switch (i) {
            case 0:
                this.ak = j;
                return;
            case 1:
                a(this.ak, j, "MTMapMSIFSToNativeTime");
                return;
            case 2:
                this.am = j;
                return;
            case 3:
                this.G = j;
                return;
            default:
                return;
        }
    }

    public void a(long j, long j2, final String str) {
        Object[] objArr = {new Long(j), new Long(j2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51ae3e655aec3c9c9a6ad66f9b9d3f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51ae3e655aec3c9c9a6ad66f9b9d3f7");
        } else if (j == 0) {
        } else {
            final long j3 = j2 - j;
            if (j3 <= 0) {
                return;
            }
            j.a(this.aj, new HashMap<String, Float>() { // from class: com.meituan.msi.lib.map.view.map.b.21
                {
                    put(str, Float.valueOf((float) j3));
                }
            });
        }
    }

    public final void a(b bVar, MsiContext msiContext, HashMap<String, i> hashMap, JsonObject jsonObject, int i) {
        Object[] objArr = {bVar, msiContext, hashMap, jsonObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26eae49242ba86c6bb0199c761ee5698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26eae49242ba86c6bb0199c761ee5698");
        } else if (bVar.a()) {
            msiContext.onError(1201, "MsiMapView is Destroyed");
        } else {
            com.meituan.msi.lib.map.view.model.j jVar = new com.meituan.msi.lib.map.view.model.j(bVar.getMtMap(), msiContext, jsonObject, hashMap);
            jVar.e = i;
            jVar.a();
        }
    }

    public final void b(b bVar, MsiContext msiContext, HashMap<Integer, com.meituan.msi.lib.map.view.model.a> hashMap, JsonObject jsonObject, int i) {
        Object[] objArr = {bVar, msiContext, hashMap, jsonObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb784f67499fcf6163c35eb20833693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb784f67499fcf6163c35eb20833693");
        } else if (bVar.a()) {
            msiContext.onError(1201, "MsiMapView is Destroyed");
        } else {
            com.meituan.msi.lib.map.view.model.b bVar2 = new com.meituan.msi.lib.map.view.model.b(bVar.getMtMap(), msiContext, jsonObject, hashMap);
            bVar2.b = i;
            bVar2.a();
        }
    }

    public final void a(b bVar, JsonObject jsonObject, List<q> list, MsiContext msiContext, int i) {
        Object[] objArr = {bVar, jsonObject, list, msiContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856bc7beed67e2f9b5203008c7480523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856bc7beed67e2f9b5203008c7480523");
        } else if (bVar.a()) {
            msiContext.onError(1201, "MsiMapView is Destroyed");
        } else {
            this.F = j.a(jsonObject);
            a(this.F, this.G, "MTMapMSILineToNativeTime");
            r rVar = new r(bVar.getMtMap(), msiContext, jsonObject, list, bVar.getFlowLines());
            rVar.f = i;
            rVar.a();
            if (i == 1) {
                a(this.F, System.currentTimeMillis(), "MTMapMSILineReadyTime");
            }
        }
    }
}
