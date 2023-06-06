package com.sankuai.meituan.mapsdk.tencentadapter;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.AbsMTMap;
import com.sankuai.meituan.mapsdk.maps.CameraMapGestureType;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.MTCustomRenderer;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.MarkerSelectHelper;
import com.sankuai.meituan.mapsdk.maps.OnCameraChangeExtraListener;
import com.sankuai.meituan.mapsdk.maps.OnCameraChangeExtraListener2;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.interfaces.z;
import com.sankuai.meituan.mapsdk.maps.model.Arc;
import com.sankuai.meituan.mapsdk.maps.model.ArcOptions;
import com.sankuai.meituan.mapsdk.maps.model.Arrow;
import com.sankuai.meituan.mapsdk.maps.model.ArrowOptions;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.CustomMapStyleOptions;
import com.sankuai.meituan.mapsdk.maps.model.DynamicMap;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlay;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlay;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlay;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.IndoorInfo;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
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
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.Tile;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends AbsMTMap implements TencentMap.OnCameraChangeListener {
    public static ChangeQuickRedirect a;
    private MTMap.OnPolylineClickListener A;
    private MTMap.OnMapLongClickListener B;
    private MTMap.OnMapLoadedListener C;
    private final List<MTMap.OnMapLoadedListener> D;
    private TencentMap.OnMapLoadedCallback E;
    private Set<z> F;
    private TencentMapGestureListener G;
    private boolean H;
    TencentMap b;
    public l c;
    public MarkerSelectHelper d;
    protected boolean e;
    private c f;
    private com.sankuai.meituan.mapsdk.maps.interfaces.m g;
    private Projection h;
    private UiSettings i;
    private boolean j;
    private MTMap.OnMarkerClickListener k;
    private boolean l;
    private volatile boolean m;
    private boolean n;
    private boolean o;
    private float p;
    private TencentMap.OnMarkerClickListener q;
    private TencentMap.OnPolylineClickListener r;
    private MTMap.OnMapClickListener y;
    private MTMap.OnMapPoiClickListener z;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Arrow addArrow(ArrowOptions arrowOptions) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addDynamicMap(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addDynamicMapGeoJSON(String str, String str2, String str3) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void changeStyle(String str, boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final DynamicMap createDynamicMap(String str) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void createRoadCrossing(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void destroyRoadCrossing() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public final void disableWeather() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<String> getBaseStyleNames() {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final String getBaseStyleUrl(String str) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final String getCustomMapStylePath() {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final double getIndoorEntranceZoomLevel() {
        return 17.0d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final String getMapContentApprovalNumber() {
        return "GS(2018)2236号";
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void getPartialScreenShot(MTMap.OnMapScreenShotListener onMapScreenShotListener, int i, int i2, int i3, int i4) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final TrafficStyle getTrafficStyle() {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final <T extends WeatherEffect> T getWeatherEffect(@NonNull Class<T> cls) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final ac getZoomMode() {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isBlockedRoadShowing() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void refreshContinuously(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeDynamicMap(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeDynamicMapGeoJSON(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeDynamicMapGeoJSON(String str, String str2) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void resetDynamicMapFeature(String str, String str2) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void resetDynamicMapFeatures(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void resetRenderFps() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void runOnDrawFrame() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCameraEyeParams(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCustomRenderer(MTCustomRenderer mTCustomRenderer) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCustomSatelliteUri(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setDynamicMapFeature(String str, String str2, String str3, String str4) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setDynamicMapGeoJSON(String str, String str2) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorEntranceZoomLevel(double d) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorQueryBox(float f, float f2, float f3, float f4) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapCustomEnable(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapStyleColor(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapStyleColor(String str, boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapAoiClickListener(MTMap.OnMapAoiClickListener onMapAoiClickListener) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapRenderCallback(MTMap.OnMapRenderCallback onMapRenderCallback) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnPolygonClickListener(MTMap.OnPolygonClickListener onPolygonClickListener) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setPreloadParentTileLevel(int i) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRoadBackgroundColor(int i) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRoadCasingColor(int i) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRoadCrossingID(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setTileCacheRatio(String str, float f) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setTileCacheType(String str, TileCacheType tileCacheType) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setTrafficStyle(TrafficStyle trafficStyle) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public final void setWeatherIntensity(float f) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public final void setWeatherType(@NonNull WeatherType weatherType) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setZoomMode(@NonNull ac acVar) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void showBlockedRoad(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void showTrafficLight(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float toOpenGLWidth(int i) {
        return 0.0f;
    }

    public static /* synthetic */ boolean a(i iVar, boolean z) {
        iVar.m = true;
        return true;
    }

    public i(TencentMap tencentMap, @NonNull com.sankuai.meituan.mapsdk.maps.interfaces.m mVar) {
        Object[] objArr = {tencentMap, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9fb8177a23de1ce542f617029d83bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9fb8177a23de1ce542f617029d83bb");
            return;
        }
        this.j = true;
        this.c = new l();
        this.k = null;
        this.e = true;
        this.m = false;
        this.n = false;
        this.o = false;
        this.D = new CopyOnWriteArrayList();
        this.E = new TencentMap.OnMapLoadedCallback() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.1
            public static ChangeQuickRedirect a;

            @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback
            public final void onMapLoaded() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be9531701dd0c2e78d95a82d4b8567bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be9531701dd0c2e78d95a82d4b8567bf");
                    return;
                }
                if (!i.this.m && i.this.g != null) {
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("map_will_load", -1L);
                    arrayMap.put("map_first_render_count", 0L);
                    arrayMap.put("map_finish_load", -1L);
                    arrayMap.put("style_url", "");
                    arrayMap.put("style_cached", 0);
                    i.this.reportMapLoadTime(1, arrayMap);
                    i.a(i.this, true);
                }
                if (i.this.C != null) {
                    i.this.C.onMapLoaded();
                }
                for (MTMap.OnMapLoadedListener onMapLoadedListener : i.this.D) {
                    onMapLoadedListener.onMapLoaded();
                }
            }
        };
        this.F = new CopyOnWriteArraySet();
        this.G = new TencentMapGestureListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.7
            public static ChangeQuickRedirect a;

            @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
            public final boolean onDoubleTap(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a4a00af0facf1383983aed162e25155", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a4a00af0facf1383983aed162e25155")).booleanValue();
                }
                i.this.l = true;
                i.this.updateCameraChangedType(1);
                i.this.mCameraMapGestureType = CameraMapGestureType.DOUBLE_TAP;
                if (i.this.F != null && !i.this.F.isEmpty()) {
                    for (z zVar : i.this.F) {
                        zVar.a(f, f2);
                    }
                }
                return false;
            }

            @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
            public final boolean onSingleTap(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c094d1a6208b8a2fad05b1e85c420f94", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c094d1a6208b8a2fad05b1e85c420f94")).booleanValue();
                }
                if (i.this.F != null && !i.this.F.isEmpty()) {
                    Iterator it = i.this.F.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                return false;
            }

            @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
            public final boolean onFling(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75da1edc5de857a55128739a8a7f1497", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75da1edc5de857a55128739a8a7f1497")).booleanValue();
                }
                i.this.l = true;
                i.this.updateCameraChangedType(1);
                i.this.mCameraMapGestureType = CameraMapGestureType.PAN;
                if (i.this.F != null && !i.this.F.isEmpty()) {
                    Iterator it = i.this.F.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                return false;
            }

            @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
            public final boolean onScroll(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17fc3c422f7977a92d3a4c4deee83393", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17fc3c422f7977a92d3a4c4deee83393")).booleanValue();
                }
                i.this.l = true;
                i.this.updateCameraChangedType(1);
                i.this.mCameraMapGestureType = CameraMapGestureType.PAN;
                if (i.this.F != null && !i.this.F.isEmpty()) {
                    for (z zVar : i.this.F) {
                        zVar.b(f, f2);
                    }
                }
                return false;
            }

            @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
            public final boolean onLongPress(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "312acd427f404f3f8cb2523064600a27", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "312acd427f404f3f8cb2523064600a27")).booleanValue();
                }
                if (i.this.F != null && !i.this.F.isEmpty()) {
                    Iterator it = i.this.F.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                return false;
            }

            @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
            public final boolean onDown(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd47a4e5948918c0de0139ee89e6d0d7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd47a4e5948918c0de0139ee89e6d0d7")).booleanValue();
                }
                i.this.l = true;
                i.this.updateCameraChangedType(1);
                i.f(i.this);
                if (i.this.F != null && !i.this.F.isEmpty()) {
                    Iterator it = i.this.F.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                return false;
            }

            @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
            public final boolean onUp(float f, float f2) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59c28ca3ece7544e8f4e5745518a4df7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59c28ca3ece7544e8f4e5745518a4df7")).booleanValue();
                }
                if (i.this.F != null && !i.this.F.isEmpty()) {
                    Iterator it = i.this.F.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                return false;
            }

            @Override // com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener
            public final void onMapStable() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67c80096540985bde007941a27478042", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67c80096540985bde007941a27478042");
                } else if (i.this.F != null && !i.this.F.isEmpty()) {
                    for (z zVar : i.this.F) {
                        zVar.a();
                    }
                }
            }
        };
        this.b = tencentMap;
        if (tencentMap != null) {
            tencentMap.setIndoorEnabled(false);
        }
        this.g = mVar;
        this.x = BitmapDescriptorFactory.defaultMarker();
        this.d = new MarkerSelectHelper();
        if (this.b != null) {
            this.b.getUiSettings().setScaleViewFadeEnable(false);
            this.b.setOnMapLoadedCallback(this.E);
            this.b.setOnMarkerClickListener(this.q);
            this.b.setOnCameraChangeListener(this);
            this.b.setOnMapPoiClickListener(new TencentMap.OnMapPoiClickListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.8
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener
                public final void onClicked(MapPoi mapPoi) {
                    Object[] objArr2 = {mapPoi};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "289663007de532fc5af876dcdf95afa1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "289663007de532fc5af876dcdf95afa1");
                    } else if (!(mapPoi instanceof IndoorMapPoi)) {
                        if (i.this.z != null) {
                            i.this.z.onMapPoiClick(mapPoi == null ? null : new com.sankuai.meituan.mapsdk.maps.model.MapPoi(mapPoi.getPosition().latitude, mapPoi.getPosition().longitude, mapPoi.getName()));
                        }
                        i.this.d.onMapClick();
                    } else {
                        IndoorMapPoi indoorMapPoi = (IndoorMapPoi) mapPoi;
                        if (i.this.z != null) {
                            i.this.z.onMapPoiClick(new com.sankuai.meituan.mapsdk.maps.model.IndoorMapPoi(indoorMapPoi.getBuildingId(), indoorMapPoi.getBuildingName(), indoorMapPoi.getFloorName(), indoorMapPoi.getPosition().latitude, indoorMapPoi.getPosition().longitude, indoorMapPoi.getName()));
                        }
                        i.this.d.onMapClick();
                    }
                }
            });
            this.b.setOnMapClickListener(new TencentMap.OnMapClickListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.9
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener
                public final void onMapClick(LatLng latLng) {
                    Object[] objArr2 = {latLng};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7115f0adf8561fc1ccb75b01e31ecd9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7115f0adf8561fc1ccb75b01e31ecd9");
                        return;
                    }
                    if (i.this.y != null) {
                        i.this.y.onMapClick(latLng == null ? null : new com.sankuai.meituan.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude));
                    }
                    i.this.d.onMapClick();
                }
            });
            this.b.setOnMapLongClickListener(new TencentMap.OnMapLongClickListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.10
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener
                public final void onMapLongClick(LatLng latLng) {
                    Object[] objArr2 = {latLng};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7d54dbab8f7462d0e6c581c92e1c340", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7d54dbab8f7462d0e6c581c92e1c340");
                        return;
                    }
                    if (i.this.B != null) {
                        i.this.B.onMapLongClick(latLng == null ? null : new com.sankuai.meituan.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude));
                    }
                    i.this.d.onMapLongClick();
                }
            });
            tencentMap.addTencentMapGestureListener(this.G);
            this.f = new c((View) mVar.getParent());
            this.f.g = this;
            this.p = tencentMap.getMinZoomLevel();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMultiInfoWindowEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97238de57bef389e848e1cb4ae5db262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97238de57bef389e848e1cb4ae5db262");
            return;
        }
        this.e = !z ? 1 : 0;
        this.H = z;
        this.b.enableMultipleInfowindow(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isMultiInfoWindowEnabled() {
        return this.H;
    }

    private CameraUpdate a(com.sankuai.meituan.mapsdk.maps.CameraUpdate cameraUpdate) {
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db17c228f7dcb9333192a2935b5749c", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db17c228f7dcb9333192a2935b5749c");
        }
        if (cameraUpdate != null) {
            CameraUpdateMessage cameraUpdateMessage = cameraUpdate.getCameraUpdateMessage();
            switch (cameraUpdate.getCameraUpdateMessage().type) {
                case NEW_CAMERA_POSITION:
                    return TencentCameraUpdateFactory.newCameraPosition(cameraUpdateMessage.cameraPosition);
                case NEW_LATLNG:
                    return TencentCameraUpdateFactory.newLatLng(cameraUpdateMessage.latLng);
                case NEW_LATLNG_ZOOM:
                    return TencentCameraUpdateFactory.newLatLngZoom(cameraUpdateMessage.latLng, cameraUpdateMessage.zoom);
                case NEW_LATLNG_BOUNDS:
                    return TencentCameraUpdateFactory.newLatLngBounds(cameraUpdateMessage.latLngBounds, cameraUpdateMessage.paddingTop);
                case NEW_LATLNG_BOUNDS_RECT:
                    return TencentCameraUpdateFactory.newLatLngBoundsRect(cameraUpdateMessage.latLngBounds, cameraUpdateMessage.paddingLeft, cameraUpdateMessage.paddingRight, cameraUpdateMessage.paddingTop, cameraUpdateMessage.paddingBottom);
                case SCROLL_BY:
                    return TencentCameraUpdateFactory.scrollBy(-cameraUpdateMessage.xPixel, -cameraUpdateMessage.yPixel);
                case ZOOM_BY:
                    if (cameraUpdateMessage.focus == null) {
                        return TencentCameraUpdateFactory.zoomBy(cameraUpdateMessage.zoomAmount);
                    }
                    return TencentCameraUpdateFactory.zoomBy(cameraUpdateMessage.zoomAmount, cameraUpdateMessage.focus);
                case ZOOM_IN:
                    return TencentCameraUpdateFactory.zoomIn();
                case ZOOM_OUT:
                    return TencentCameraUpdateFactory.zoomOut();
                case ZOOM_TO:
                    return TencentCameraUpdateFactory.zoomTo(cameraUpdateMessage.zoom);
                case CHANGE_TILT:
                    CameraPosition cameraPosition = getCameraPosition();
                    return TencentCameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(cameraPosition.target).bearing(cameraPosition.bearing).zoom(cameraPosition.zoom).tilt(cameraUpdateMessage.tilt).build());
                default:
                    return null;
            }
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd71c01987f0dadd11c14ee876a9bcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd71c01987f0dadd11c14ee876a9bcf");
            return;
        }
        this.n = z;
        this.b.setIndoorEnabled(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isIndoorEnabled() {
        return this.n;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorFloor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900a4036fe47abce76ae1c5c9c271305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900a4036fe47abce76ae1c5c9c271305");
        } else {
            this.b.setIndoorFloor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorMaskColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923040b1ef67fc6f80ad4a44743038e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923040b1ef67fc6f80ad4a44743038e0");
        } else {
            this.b.setIndoorMaskColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addArc(ArcOptions arcOptions) {
        Object[] objArr = {arcOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44e969159ec57b34435304df7c12bf7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44e969159ec57b34435304df7c12bf7a");
        } else {
            addArcEnhance(arcOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Arc addArcEnhance(ArcOptions arcOptions) {
        com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions2;
        Object[] objArr = {arcOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3105e1ea73ffbe1c047aa5cbf14189a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Arc) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3105e1ea73ffbe1c047aa5cbf14189a8");
        }
        if (arcOptions == null) {
            return null;
        }
        try {
            Object[] objArr2 = {arcOptions};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9ef0c02115519f5f8501b968d5a6b62e", RobustBitConfig.DEFAULT_VALUE)) {
                arcOptions2 = (com.tencent.tencentmap.mapsdk.maps.model.ArcOptions) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9ef0c02115519f5f8501b968d5a6b62e");
            } else {
                if (arcOptions != null) {
                    com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions3 = new com.tencent.tencentmap.mapsdk.maps.model.ArcOptions();
                    arcOptions3.width(arcOptions.getStrokeWidth());
                    arcOptions3.color(arcOptions.getStrokeColor());
                    arcOptions3.angle(0.0f);
                    LatLng a2 = b.a(arcOptions.getStartPoint());
                    LatLng a3 = b.a(arcOptions.getPassedPoint());
                    LatLng a4 = b.a(arcOptions.getEndPoint());
                    if (a2 != null && a3 != null && a4 != null) {
                        arcOptions3.points(a2, a4);
                        arcOptions3.pass(a3);
                        arcOptions2 = arcOptions3;
                    }
                }
                arcOptions2 = null;
            }
            return new Arc(new d(this.b.addArc(arcOptions2)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnIndoorStateChangeListener(final MTMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        Object[] objArr = {onIndoorStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "101b91958be394bab467bf635166a927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "101b91958be394bab467bf635166a927");
        } else if (onIndoorStateChangeListener == null) {
            this.b.setOnIndoorStateChangeListener(null);
        } else {
            this.b.setOnIndoorStateChangeListener(new TencentMap.OnIndoorStateChangeListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.11
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
                public final boolean onIndoorBuildingFocused() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a6eda7caad6d2276789f86157873a41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a6eda7caad6d2276789f86157873a41")).booleanValue() : onIndoorStateChangeListener.onIndoorBuildingFocused();
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
                public final boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
                    Object[] objArr2 = {indoorBuilding};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fefe22ef748be8c5f4f1c1ae6d8aa9bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fefe22ef748be8c5f4f1c1ae6d8aa9bd")).booleanValue() : onIndoorStateChangeListener.onIndoorLevelActivated(b.a(indoorBuilding));
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
                public final boolean onIndoorBuildingDeactivated() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e00448b8ef3349d9eb69fc682b93cea4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e00448b8ef3349d9eb69fc682b93cea4")).booleanValue() : onIndoorStateChangeListener.onIndoorBuildingDeactivated();
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final TileOverlay addTileOverlay(final TileOverlayOptions tileOverlayOptions) {
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions2;
        Object[] objArr = {tileOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7f9f9a78f8691759f99324e1904bc52", RobustBitConfig.DEFAULT_VALUE)) {
            return (TileOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7f9f9a78f8691759f99324e1904bc52");
        }
        Object[] objArr2 = {tileOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "25761a29ee7465ffd80063cb21d8c9e8", RobustBitConfig.DEFAULT_VALUE)) {
            tileOverlayOptions2 = (com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "25761a29ee7465ffd80063cb21d8c9e8");
        } else if (tileOverlayOptions == null) {
            tileOverlayOptions2 = null;
        } else {
            tileOverlayOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions();
            TileProvider tileProvider = new TileProvider() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.b.1
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.model.TileProvider
                public final Tile getTile(int i, int i2, int i3) {
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "68f9e6df1f659db64b0ea3c7c08af73b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Tile) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "68f9e6df1f659db64b0ea3c7c08af73b");
                    }
                    com.sankuai.meituan.mapsdk.maps.model.Tile tile = tileOverlayOptions.getTileProvider().getTile(i, i2, i3);
                    return new Tile(tile.mWidth, tile.mHeight, tile.mData);
                }
            };
            tileOverlayOptions2.betterQuality(tileOverlayOptions.isBetterQuality());
            tileOverlayOptions2.diskCacheDir(tileOverlayOptions.getDiskCacheDir());
            tileOverlayOptions2.versionInfo(tileOverlayOptions.getVersionInfo());
            tileOverlayOptions2.zIndex(tileOverlayOptions.getZIndex());
            tileOverlayOptions2.maxMemoryCacheSize(tileOverlayOptions.getMaxMemoryCacheSize());
            tileOverlayOptions2.tileProvider(tileProvider);
        }
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlay addTileOverlay = this.b.addTileOverlay(tileOverlayOptions2);
        if (addTileOverlay == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_tile_create_null");
            return null;
        }
        return new TileOverlay(new r(addTileOverlay, tileOverlayOptions));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorLevelPickerEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3c6c69d616e5f43232682af382eabf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3c6c69d616e5f43232682af382eabf");
        } else {
            this.b.getUiSettings().setIndoorLevelPickerEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode) {
        Object[] objArr = {latLngBounds, restrictBoundsFitMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "168a976c79f44d15509a2f8e0ca3c52f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "168a976c79f44d15509a2f8e0ca3c52f");
            return;
        }
        updateCameraChangedType(2);
        this.b.setRestrictBounds(b.a(latLngBounds), b.a(restrictBoundsFitMode));
        if (latLngBounds == null) {
            setMinZoomLevel(this.p);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode, boolean z) {
        Object[] objArr = {latLngBounds, restrictBoundsFitMode, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f9fbbd783bc8060bdd24608076cd5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f9fbbd783bc8060bdd24608076cd5e");
        } else {
            setRestrictBounds(latLngBounds, restrictBoundsFitMode);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void clearMapCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16fb3dc2514f34daaa2986ef87178daa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16fb3dc2514f34daaa2986ef87178daa");
        } else {
            this.b.clearCache();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float[] getViewMatrix() {
        return new float[0];
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float[] getProjectionMatrix() {
        return new float[0];
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void moveCamera(com.sankuai.meituan.mapsdk.maps.CameraUpdate cameraUpdate) {
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd3c256e9910df35f6db890443214a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd3c256e9910df35f6db890443214a5");
        } else if (cameraUpdate == null) {
        } else {
            if (this.f != null) {
                cameraUpdate = this.f.a(cameraUpdate.getCameraUpdateMessage());
            }
            CameraUpdate a2 = a(cameraUpdate);
            if (a2 == null) {
                return;
            }
            this.l = false;
            updateCameraChangedType(2);
            if (this.b != null) {
                this.b.moveCamera(a2);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f8ded03c376c1fed5416d5df95ef3aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f8ded03c376c1fed5416d5df95ef3aa");
            return;
        }
        super.clear();
        if (this.b != null) {
            this.b.clearAllOverlays();
        }
        this.c.clearMarkers();
        resetLocator();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7aaa41dce9eb87aa82eacc93742dfa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7aaa41dce9eb87aa82eacc93742dfa5");
            return;
        }
        if (this.b != null) {
            super.destroy();
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f("destroy");
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mapLoaded called :" + this.m);
            setOnMapTouchListener(null);
            this.b.setOnMapLoadedCallback(null);
            this.C = null;
            if (this.D != null) {
                this.D.clear();
            }
            this.b.setOnCameraChangeListener(null);
            this.mOnCameraChangeListener = null;
            if (this.mOnCameraChangeListeners != null) {
                this.mOnCameraChangeListeners.clear();
            }
            this.b.setOnMarkerClickListener(null);
            this.k = null;
            this.q = null;
            this.b.setOnMapPoiClickListener(null);
            this.z = null;
            this.b.setOnMapClickListener(null);
            this.y = null;
            this.b.setOnPolylineClickListener(null);
            this.A = null;
            this.r = null;
            this.b.setOnMapLongClickListener(null);
            this.B = null;
            this.b.removeTencentMapGestureListener(this.G);
            this.G = null;
            if (this.F != null) {
                this.F.clear();
            }
        }
        this.x = null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCustomMapStylePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd7f04f0d0b235cd180375636accb9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd7f04f0d0b235cd180375636accb9b");
        } else if (TextUtils.isEmpty(str)) {
            this.b.setMapStyle(1000);
        } else {
            try {
                if (Integer.parseInt(str) == 2) {
                    this.b.setMapStyle(2);
                } else if (Integer.parseInt(str) == 1) {
                    this.b.setMapStyle(1000);
                } else {
                    this.b.setMapStyle(Integer.parseInt(str));
                }
            } catch (NumberFormatException unused) {
                this.b.setMapStyle(1000);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCustomMapStylePath(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2610183c06700d4f1e10796cbd206083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2610183c06700d4f1e10796cbd206083");
        } else {
            setCustomMapStylePath(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapViewStyle(boolean z, CustomMapStyleOptions customMapStyleOptions) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), customMapStyleOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead93964fe51c6f6942e820ac059faf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead93964fe51c6f6942e820ac059faf8");
        } else if (z) {
            setMapType(1);
        } else {
            setMapType(3);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setRenderFps(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0213c9e23b85eeed3ea121ca0f78da1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0213c9e23b85eeed3ea121ca0f78da1d");
        } else {
            this.b.setMapFrameRate(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener) {
        this.mOnCameraChangeListener = onCameraChangeListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener) {
        Object[] objArr = {onCameraChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "101e3fe95247fd6588a9cdd869114667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "101e3fe95247fd6588a9cdd869114667");
        } else {
            this.mOnCameraChangeListeners.add(onCameraChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener) {
        Object[] objArr = {onCameraChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e55620da472a673dc797a0a610403b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e55620da472a673dc797a0a610403b");
        } else {
            this.mOnCameraChangeListeners.remove(onCameraChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapClickListener(MTMap.OnMapClickListener onMapClickListener) {
        this.y = onMapClickListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void show3dBuilding(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b167c642705dacd64ac7022d684e184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b167c642705dacd64ac7022d684e184");
            return;
        }
        this.o = z;
        if (this.b != null) {
            this.b.setBuildingEnable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean is3dBuildingShowing() {
        return this.o;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setHandDrawMapEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b679fb32cdb880e26549d3953a2f544b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b679fb32cdb880e26549d3953a2f544b");
        } else {
            this.b.setHandDrawMapEnable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapPoiClickListener(MTMap.OnMapPoiClickListener onMapPoiClickListener) {
        this.z = onMapPoiClickListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final CameraPosition getCameraPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9c798e1a594db14ef0536f8baa181f4", RobustBitConfig.DEFAULT_VALUE) ? (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9c798e1a594db14ef0536f8baa181f4") : b.a(this.b.getCameraPosition());
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMarkerClickListener(MTMap.OnMarkerClickListener onMarkerClickListener) {
        Object[] objArr = {onMarkerClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a6fab396b6fdfba48ca9c3b3a7a53b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a6fab396b6fdfba48ca9c3b3a7a53b");
            return;
        }
        if (this.q == null) {
            this.q = new TencentMap.OnMarkerClickListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.12
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener
                public final boolean onMarkerClick(Marker marker) {
                    Object[] objArr2 = {marker};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7a9a9579585f4d26dc43dc627b67bcc", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7a9a9579585f4d26dc43dc627b67bcc")).booleanValue();
                    }
                    MTMap.OnMarkerClickListener onMarkerClickListener2 = i.this.k != null ? i.this.k : null;
                    if (marker == null) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.d("TencentMap.OnMarkerClickListener.onMarkerClick with null marker");
                        return false;
                    }
                    com.sankuai.meituan.mapsdk.maps.model.Marker mTMarker = i.this.c.toMTMarker(marker);
                    if (mTMarker == null) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.d("tencnetMarkerGlobalInfo.toMTMarker get null marker");
                        return false;
                    }
                    if (mTMarker.isInfoWindowEnable()) {
                        mTMarker.refreshInfoWindow();
                    }
                    i.this.d.onMarkerClick(i.this.c.toIMarker(marker));
                    return onMarkerClickListener2 != null && onMarkerClickListener2.onMarkerClick(mTMarker);
                }
            };
            this.b.setOnMarkerClickListener(this.q);
        }
        this.k = onMarkerClickListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapLoadedListener(MTMap.OnMapLoadedListener onMapLoadedListener) {
        this.C = onMapLoadedListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addOnMapLoadedListener(MTMap.OnMapLoadedListener onMapLoadedListener) {
        Object[] objArr = {onMapLoadedListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96622b01b9eb2dcb770c5c3f93b17b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96622b01b9eb2dcb770c5c3f93b17b9f");
        } else {
            this.D.add(onMapLoadedListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<com.sankuai.meituan.mapsdk.maps.model.Marker> addMarkerList(List<MarkerOptions> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f55b4224be1a8047bf57f6df7c87b6dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f55b4224be1a8047bf57f6df7c87b6dd");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (MarkerOptions markerOptions : list) {
            arrayList.add(addMarker(markerOptions));
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final com.sankuai.meituan.mapsdk.maps.model.Marker addMarker(@NonNull MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b525c2ca951d19ea40eb05865beb67c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.model.Marker) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b525c2ca951d19ea40eb05865beb67c4");
        }
        if (markerOptions == null) {
            return null;
        }
        try {
            if (markerOptions.getIcon() == null) {
                markerOptions.icon(this.x);
            }
            markerOptions.viewInfoWindow(this.e);
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions a2 = b.a(markerOptions);
            if (this.e) {
                markerOptions.viewInfoWindow(this.j);
                if (a2 != null) {
                    a2.viewInfoWindow(this.j);
                }
            }
            Marker addMarker = this.b.addMarker(a2);
            if (addMarker == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_marker_create_null");
                return null;
            }
            k kVar = new k(addMarker, markerOptions, this, this.g == null ? null : this.g.getContext());
            com.sankuai.meituan.mapsdk.maps.model.Marker marker = new com.sankuai.meituan.mapsdk.maps.model.Marker(kVar);
            if (this.s != null && markerOptions.isNeedKeep()) {
                this.s.a(kVar);
            }
            this.d.addMarker(kVar, markerOptions.isSelect());
            return marker;
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Polyline addPolyline(@NonNull PolylineOptions polylineOptions) {
        Object[] objArr = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd57f5d65f13a9229bf7cee2cd8ac62", RobustBitConfig.DEFAULT_VALUE)) {
            return (Polyline) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd57f5d65f13a9229bf7cee2cd8ac62");
        }
        if (polylineOptions == null) {
            return null;
        }
        try {
            com.tencent.tencentmap.mapsdk.maps.model.Polyline addPolyline = this.b.addPolyline(b.a(polylineOptions));
            if (addPolyline == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_polyline_create_null");
                return null;
            }
            n nVar = new n(addPolyline, polylineOptions, this);
            if (this.s != null) {
                this.s.a(nVar);
            }
            return new Polyline(nVar);
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Circle addCircle(@NonNull CircleOptions circleOptions) {
        Object[] objArr = {circleOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "367e881c5ebd19fb068e19e874f5c0cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Circle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "367e881c5ebd19fb068e19e874f5c0cc");
        }
        if (circleOptions == null) {
            return null;
        }
        try {
            com.tencent.tencentmap.mapsdk.maps.model.Circle addCircle = this.b.addCircle(b.a(circleOptions));
            if (addCircle == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_circle_create_null");
                return null;
            }
            e eVar = new e(addCircle, this);
            if (this.s != null) {
                this.s.a(eVar);
            }
            return new Circle(eVar);
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Polygon addPolygon(@NonNull PolygonOptions polygonOptions) {
        Object[] objArr = {polygonOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a8107e0229c81e7a08a108f7315b48", RobustBitConfig.DEFAULT_VALUE)) {
            return (Polygon) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a8107e0229c81e7a08a108f7315b48");
        }
        if (polygonOptions == null) {
            return null;
        }
        try {
            com.tencent.tencentmap.mapsdk.maps.model.Polygon addPolygon = this.b.addPolygon(b.a(polygonOptions));
            if (addPolygon == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_polygon_create_null");
                return null;
            }
            m mVar = new m(addPolygon, this);
            mVar.setStrokeWidth(polygonOptions.getStrokeWidth());
            if (this.s != null) {
                this.s.a(mVar);
            }
            return new Polygon(mVar);
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        Object[] objArr = {groundOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c351bad3b051cba6f6cbbe2df45c7815", RobustBitConfig.DEFAULT_VALUE)) {
            return (GroundOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c351bad3b051cba6f6cbbe2df45c7815");
        }
        if (groundOverlayOptions == null) {
            return null;
        }
        try {
            com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay addGroundOverlay = this.b.addGroundOverlay(b.a(groundOverlayOptions));
            if (addGroundOverlay == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.e("TencentMTMap addGroundOverlay error: tencentGroundOverlay is null");
                return new GroundOverlay(new com.sankuai.meituan.mapsdk.emptymodel.a());
            }
            return new GroundOverlay(new f(addGroundOverlay, groundOverlayOptions));
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("TencentMTMapaddGroundOverlay error: " + e);
            e.printStackTrace();
            return new GroundOverlay(new com.sankuai.meituan.mapsdk.emptymodel.a());
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float getMaxZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81104b7e058444c88ad455fcd445e8e8", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81104b7e058444c88ad455fcd445e8e8")).floatValue() : this.b.getMaxZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float getMinZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba54c3258fad18249cba23fc6f2d8b5", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba54c3258fad18249cba23fc6f2d8b5")).floatValue() : this.b.getMinZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final com.sankuai.meituan.mapsdk.maps.model.LatLng getMapCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f210d82b8e53bd1d9580e15f3b4e33f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.model.LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f210d82b8e53bd1d9580e15f3b4e33f");
        }
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = this.b.getCameraPosition();
        if (cameraPosition != null) {
            return b.a(cameraPosition.target);
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float getZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c326ab3c5b5301a2fcd51c9bf7a2d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c326ab3c5b5301a2fcd51c9bf7a2d7")).floatValue();
        }
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = this.b.getCameraPosition();
        if (cameraPosition != null) {
            return cameraPosition.zoom;
        }
        return 0.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final int getMapType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc8c05d02343185bb4ddc82567c1dffa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc8c05d02343185bb4ddc82567c1dffa")).intValue();
        }
        int mapType = this.b.getMapType();
        if (mapType != 1000) {
            if (mapType != 1008) {
                if (mapType != 1011) {
                    return mapType;
                }
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void animateCamera(@NonNull com.sankuai.meituan.mapsdk.maps.CameraUpdate cameraUpdate) {
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810261bb57e77d6f601a72ef5c7cb374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810261bb57e77d6f601a72ef5c7cb374");
        } else {
            animateCamera(cameraUpdate, 500L, null);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void animateCamera(@NonNull com.sankuai.meituan.mapsdk.maps.CameraUpdate cameraUpdate, MTMap.CancelableCallback cancelableCallback) {
        Object[] objArr = {cameraUpdate, cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d31f91d852d7165db272557a328d30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d31f91d852d7165db272557a328d30");
        } else {
            animateCamera(cameraUpdate, 500L, cancelableCallback);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void animateCamera(@NonNull com.sankuai.meituan.mapsdk.maps.CameraUpdate cameraUpdate, long j, final MTMap.CancelableCallback cancelableCallback) {
        Object[] objArr = {cameraUpdate, new Long(j), cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb39d5c40970590445b94d2d12ca54b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb39d5c40970590445b94d2d12ca54b8");
        } else if (cameraUpdate == null) {
        } else {
            try {
                CameraUpdate a2 = a(this.f != null ? this.f.a(cameraUpdate.getCameraUpdateMessage()) : cameraUpdate);
                if (a2 == null) {
                    return;
                }
                this.l = false;
                updateCameraChangedType(2);
                if (cancelableCallback == null) {
                    this.b.animateCamera(a2, j, null);
                } else {
                    this.b.animateCamera(a2, j, new TencentMap.CancelableCallback() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.13
                        public static ChangeQuickRedirect a;

                        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
                        public final void onFinish() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebd0c61de93e4ff31d61c0dd2321d503", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebd0c61de93e4ff31d61c0dd2321d503");
                            } else {
                                cancelableCallback.onFinish();
                            }
                        }

                        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
                        public final void onCancel() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52803c774eaa85a65eb72de2632f641d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52803c774eaa85a65eb72de2632f641d");
                            } else {
                                cancelableCallback.onCancel();
                            }
                        }
                    });
                }
            } catch (Exception e) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void stopAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ac4f2cad6d690db8244991baac30c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ac4f2cad6d690db8244991baac30c2");
        } else {
            this.b.stopAnimation();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapType(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a8dd88f3faedaa8bd0d7923564bd34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a8dd88f3faedaa8bd0d7923564bd34");
            return;
        }
        switch (i) {
            case 2:
                i2 = 1011;
                break;
            case 3:
                i2 = 1008;
                break;
            case 4:
                i2 = 1012;
                break;
            default:
                i2 = 1000;
                break;
        }
        this.b.setMapType(i2);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setTrafficEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc34aa040f6e41d3838df9797094a8d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc34aa040f6e41d3838df9797094a8d5");
        } else {
            this.b.setTrafficEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final boolean isTrafficEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "102138ec209b681242ad982328202f78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "102138ec209b681242ad982328202f78")).booleanValue() : this.b.isTrafficEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapLongClickListener(MTMap.OnMapLongClickListener onMapLongClickListener) {
        this.B = onMapLongClickListener;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMarkerDragListener(final MTMap.OnMarkerDragListener onMarkerDragListener) {
        Object[] objArr = {onMarkerDragListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c896b6247feb74f29d6ed15519f14a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c896b6247feb74f29d6ed15519f14a31");
        } else if (onMarkerDragListener == null) {
            this.b.setOnMarkerDragListener(null);
        } else {
            this.b.setOnMarkerDragListener(new TencentMap.OnMarkerDragListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.14
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener
                public final void onMarkerDragStart(Marker marker) {
                    Object[] objArr2 = {marker};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a418bfac3eab093a21c53105b642b91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a418bfac3eab093a21c53105b642b91");
                    } else {
                        onMarkerDragListener.onMarkerDragStart(marker == null ? null : i.this.c.toMTMarker(marker));
                    }
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener
                public final void onMarkerDrag(Marker marker) {
                    Object[] objArr2 = {marker};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dce6d5db81bb483ed4c3eb4090db359", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dce6d5db81bb483ed4c3eb4090db359");
                    } else {
                        onMarkerDragListener.onMarkerDrag(marker == null ? null : i.this.c.toMTMarker(marker));
                    }
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener
                public final void onMarkerDragEnd(Marker marker) {
                    Object[] objArr2 = {marker};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5738f6c23c1673084d2b5c8c6f15b5c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5738f6c23c1673084d2b5c8c6f15b5c");
                    } else {
                        onMarkerDragListener.onMarkerDragEnd(marker == null ? null : i.this.c.toMTMarker(marker));
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMarkerSelectChangeListener(MTMap.OnMarkerSelectChangeListener onMarkerSelectChangeListener) {
        Object[] objArr = {onMarkerSelectChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfaf1a4af9420e1d84e5a9806c1a1c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfaf1a4af9420e1d84e5a9806c1a1c2b");
        } else {
            this.d.setOnOnMarkerSelectChangeListener(onMarkerSelectChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void clickToDeselectMarker(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab1778117dbdaa9d446e167559693f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab1778117dbdaa9d446e167559693f1");
        } else {
            this.d.clickToDeselectMarker(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnInfoWindowClickListener(final MTMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        Object[] objArr = {onInfoWindowClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b7a59549d493d1fe58d262c64c2e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b7a59549d493d1fe58d262c64c2e81");
        } else if (onInfoWindowClickListener == null) {
            this.b.setOnInfoWindowClickListener(null);
        } else {
            this.b.setOnInfoWindowClickListener(new TencentMap.OnInfoWindowClickListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.2
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener
                public final void onInfoWindowClick(Marker marker) {
                    Object[] objArr2 = {marker};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff718a3f62c03156f4a3f24323ba1041", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff718a3f62c03156f4a3f24323ba1041");
                    } else {
                        onInfoWindowClickListener.onInfoWindowClick(marker == null ? null : i.this.c.toMTMarker(marker));
                    }
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener
                public final void onInfoWindowClickLocation(int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a31e527072f37d8dfc33c145454029e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a31e527072f37d8dfc33c145454029e4");
                    } else {
                        onInfoWindowClickListener.onInfoWindowClickLocation(i, i2, i3, i4);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setInfoWindowAdapter(MTMap.InfoWindowAdapter infoWindowAdapter) {
        Object[] objArr = {infoWindowAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b449d2e285bec4cf28614642f3945037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b449d2e285bec4cf28614642f3945037");
            return;
        }
        this.c.setInfoWindowAdapter(infoWindowAdapter);
        if (infoWindowAdapter == null) {
            this.b.setInfoWindowAdapter(null);
        } else {
            a(infoWindowAdapter);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final MTMap.InfoWindowAdapter getInfoWindowAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bcc639719137ec1cb646b126dca37c2", RobustBitConfig.DEFAULT_VALUE) ? (MTMap.InfoWindowAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bcc639719137ec1cb646b126dca37c2") : this.c.getInfoWindowAdapter();
    }

    public final void a(final MTMap.InfoWindowAdapter infoWindowAdapter) {
        Object[] objArr = {infoWindowAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94443cdc2d888820a8842216ec849221", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94443cdc2d888820a8842216ec849221");
        } else if (infoWindowAdapter == null) {
            this.b.setInfoWindowAdapter(null);
        } else {
            this.b.setInfoWindowAdapter(new TencentMap.InfoWindowAdapter() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.3
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter
                public final View getInfoWindow(Marker marker) {
                    Object[] objArr2 = {marker};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9a485e4ba90ac8a7153ee3a212a275f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9a485e4ba90ac8a7153ee3a212a275f");
                    }
                    if (marker == null) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.d("getInfoWindow with null marker parmeter");
                        return null;
                    }
                    com.sankuai.meituan.mapsdk.maps.model.Marker mTMarker = i.this.c.toMTMarker(marker);
                    if (mTMarker != null) {
                        i.this.mViewInfoWindow = infoWindowAdapter.getInfoWindow(mTMarker);
                        return i.this.mViewInfoWindow;
                    }
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.d("getInfoWindow with null marker parmeter from tencnetMarkerGlobalInfo");
                    return null;
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter
                public final View getInfoContents(Marker marker) {
                    Object[] objArr2 = {marker};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04cb04a9ed31699136ca8a3c95de4790", RobustBitConfig.DEFAULT_VALUE)) {
                        return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04cb04a9ed31699136ca8a3c95de4790");
                    }
                    if (marker == null) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.d("getInfoContents with null marker parmeter");
                        return null;
                    }
                    com.sankuai.meituan.mapsdk.maps.model.Marker mTMarker = i.this.c.toMTMarker(marker);
                    if (mTMarker != null) {
                        i.this.mViewInfoWindow = infoWindowAdapter.getInfoContents(mTMarker);
                        return i.this.mViewInfoWindow;
                    }
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.d("getInfoContents with null marker parmeter from tencnetMarkerGlobalInfo");
                    return null;
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<com.sankuai.meituan.mapsdk.maps.model.Marker> getMapScreenMarkers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d008de7d9b311f8efde3003dab5f81b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d008de7d9b311f8efde3003dab5f81b");
        }
        ArrayList arrayList = new ArrayList();
        try {
            LatLngBounds latLngBounds = new VisibleRegion(new t(this.b.getProjection().getVisibleRegion())).getLatLngBounds();
            for (com.sankuai.meituan.mapsdk.maps.interfaces.n nVar : this.c.getIMarkerList()) {
                if (nVar != null && latLngBounds.contains(nVar.getPosition()) && nVar.isVisible()) {
                    arrayList.add(new com.sankuai.meituan.mapsdk.maps.model.Marker(nVar));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final UiSettings getUiSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29e3e12568fb352c44786d1aab75589", RobustBitConfig.DEFAULT_VALUE)) {
            return (UiSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29e3e12568fb352c44786d1aab75589");
        }
        if (this.i == null && this.b != null && this.b.getUiSettings() != null) {
            this.i = new UiSettings(new s(this.b.getUiSettings()));
        }
        return this.i;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Projection getProjection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b018e066b35819a74636a5295d9404c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Projection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b018e066b35819a74636a5295d9404c3");
        }
        if (this.h == null) {
            if (this.b.getProjection() == null || this.b.isDestroyed()) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_projection_null");
                return null;
            }
            this.h = new Projection(new o(this.b.getProjection()));
        }
        return this.h;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final HeatOverlay addHeatOverlay(HeatOverlayOptions heatOverlayOptions) {
        com.sankuai.meituan.mapsdk.maps.interfaces.h qVar;
        Object[] objArr = {heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ed908778abe19ad08852ca4c1dff8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HeatOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ed908778abe19ad08852ca4c1dff8a");
        }
        if (heatOverlayOptions == null) {
            return null;
        }
        try {
            if (heatOverlayOptions.getHeatMapMode() == HeatOverlayOptions.HeatMapMode.Vector) {
                VectorOverlay addVectorOverlay = this.b.addVectorOverlay(b.a(heatOverlayOptions));
                if (addVectorOverlay == null) {
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_heat_overlay_null");
                    return null;
                }
                qVar = new g(addVectorOverlay, heatOverlayOptions, this);
            } else {
                com.tencent.tencentmap.mapsdk.maps.model.TileOverlay addTileOverlay = this.b.addTileOverlay(b.a(heatOverlayOptions, this.b));
                if (addTileOverlay == null) {
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_tile_heat_overlay_null");
                    return null;
                }
                qVar = new q(addTileOverlay, heatOverlayOptions, this);
            }
            if (this.s != null) {
                this.s.a(qVar);
            }
            return new HeatOverlay(qVar);
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final HoneyCombOverlay addHoneyCombOverlay(HoneyCombOverlayOptions honeyCombOverlayOptions) {
        Object[] objArr = {honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17c33d57acb82d6c2a7ec6d3db1799a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17c33d57acb82d6c2a7ec6d3db1799a7");
        }
        if (honeyCombOverlayOptions == null) {
            return null;
        }
        try {
            VectorOverlay addVectorOverlay = this.b.addVectorOverlay(b.a(honeyCombOverlayOptions));
            if (addVectorOverlay == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_honeycomb_overlay_null");
                return null;
            }
            h hVar = new h(addVectorOverlay, honeyCombOverlayOptions, this);
            if (this.s != null) {
                this.s.a(hVar);
            }
            return new HoneyCombOverlay(hVar);
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final Text addText(TextOptions textOptions) {
        Object[] objArr = {textOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b58cd486016234a51a5080627e6fa0e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Text) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b58cd486016234a51a5080627e6fa0e7");
        }
        if (textOptions == null || textOptions.getPosition() == null) {
            return null;
        }
        try {
            TextView textView = new TextView(this.g.getContext());
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            if (textOptions.getText() != null) {
                textView.setText(textOptions.getText());
            }
            if (textOptions.getTypeface() != null) {
                textView.setTypeface(textOptions.getTypeface());
            }
            textView.setRotation(textOptions.getRotate());
            textView.setBackgroundColor(textOptions.getBackgroundColor());
            textView.setTextColor(textOptions.getFontColor());
            textView.setTextSize(textOptions.getFontSize());
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = new com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions(b.a(textOptions.getPosition()));
            markerOptions.icon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromView(textView));
            markerOptions.visible(textOptions.isVisible());
            Marker addMarker = this.b.addMarker(markerOptions);
            if (addMarker == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mtmap_text_create_null");
                return null;
            }
            addMarker.setClickable(false);
            addMarker.setInfoWindowEnable(false);
            return new Text(new p(addMarker, textOptions, textView));
        } catch (Exception e) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a(e);
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final float getScalePerPixel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4533708dab2d2e987cb3da47db0f9eaf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4533708dab2d2e987cb3da47db0f9eaf")).floatValue();
        }
        try {
            return (float) this.b.getProjection().metersPerPixel(this.b.getCameraPosition().target.latitude);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void getMapScreenShot(final MTMap.OnMapScreenShotListener onMapScreenShotListener) {
        Object[] objArr = {onMapScreenShotListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7f712aef440840ed0e6ba753f7b70ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7f712aef440840ed0e6ba753f7b70ec");
        } else if (onMapScreenShotListener == null) {
            this.b.snapshot(null);
        } else {
            this.b.snapshot(new TencentMap.SnapshotReadyCallback() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.4
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffcd2c0d80a40a99c78fbd9ef6a6f79f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffcd2c0d80a40a99c78fbd9ef6a6f79f");
                    } else {
                        onMapScreenShotListener.onMapScreenShot(bitmap);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMaxZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb965824412a705303feb5260ac4d76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb965824412a705303feb5260ac4d76d");
        } else {
            this.b.setMaxZoomLevel((int) f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMinZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6937f1e07499f5c581d6809bafc79953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6937f1e07499f5c581d6809bafc79953");
            return;
        }
        this.p = f;
        this.b.setMinZoomLevel((int) f);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setPadding(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d66fad326b7f3c5073174d62660eab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d66fad326b7f3c5073174d62660eab");
        } else if (this.f != null) {
            c cVar = this.f;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "75329ae243baa08bc3b57172d18ae4ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "75329ae243baa08bc3b57172d18ae4ea");
                return;
            }
            cVar.b = i;
            cVar.c = i2;
            cVar.d = i3;
            cVar.e = i4;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "3c0fe8a863101f24195179cb7a7613fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "3c0fe8a863101f24195179cb7a7613fc");
            } else if (cVar.a()) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                Point point = PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "f0a916cf32d9fbfeb8d964f7c625eda1", RobustBitConfig.DEFAULT_VALUE) ? (Point) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "f0a916cf32d9fbfeb8d964f7c625eda1") : new Point(((cVar.f.getWidth() + cVar.b) - cVar.d) / 2, ((cVar.f.getHeight() + cVar.c) - cVar.e) / 2);
                cVar.g.setCameraCenterProportion(point.x, point.y);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setPointToCenter(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a59293ef8956f77a6189768aa76e0a7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a59293ef8956f77a6189768aa76e0a7d");
            return;
        }
        updateCameraChangedType(2);
        this.b.setPointToCenter(i, i2);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCameraCenterProportion(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfe97cae32b6a9c158341c155bc2ee9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfe97cae32b6a9c158341c155bc2ee9e");
            return;
        }
        updateCameraChangedType(2);
        int width = this.g.getWidth();
        int height = this.g.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f3 = f / width;
        float f4 = f2 / height;
        if (this.b != null) {
            this.b.setCameraCenterProportion(f3, f4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setCameraCenterProportion(float f, float f2, boolean z) {
        LatLng latLng;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86fd63bb9a5dc152b3ab7f77c1dc8d4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86fd63bb9a5dc152b3ab7f77c1dc8d4a");
            return;
        }
        updateCameraChangedType(2);
        int width = this.g.getWidth();
        int height = this.g.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f3 = f / width;
        float f4 = f2 / height;
        if (this.b == null) {
            return;
        }
        this.b.setCameraCenterProportion(f3, f4, false);
        if (!z || this.b.getCameraPosition() == null || (latLng = this.b.getCameraPosition().target) == null) {
            return;
        }
        this.b.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        this.b.stopAnimation();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void addMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41252a20b1492f64f8663a84b5bdc9d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41252a20b1492f64f8663a84b5bdc9d2");
        } else if (zVar == null || this.F.contains(zVar)) {
        } else {
            this.F.add(zVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void removeMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4debeaea95052381fc6ecb31e9658f55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4debeaea95052381fc6ecb31e9658f55");
        } else if (zVar != null) {
            this.F.remove(zVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final List<com.sankuai.meituan.mapsdk.maps.model.LatLng> getBounderPoints(com.sankuai.meituan.mapsdk.maps.model.Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3d3ea3cc3504f7f67c620c7ba59252", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3d3ea3cc3504f7f67c620c7ba59252") : b.a(this.b.getBounderPoints((Marker) marker.getPlatformMarker()));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnPolylineClickListener(MTMap.OnPolylineClickListener onPolylineClickListener) {
        Object[] objArr = {onPolylineClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1283a8b9d0d663c4ca5bf30b51cc5b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1283a8b9d0d663c4ca5bf30b51cc5b07");
            return;
        }
        if (this.r == null) {
            this.r = new TencentMap.OnPolylineClickListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.i.5
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener
                public final void onPolylineClick(com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline, LatLng latLng) {
                    Object[] objArr2 = {polyline, latLng};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "044d5d8abb003fdbe097d03f4f2860b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "044d5d8abb003fdbe097d03f4f2860b7");
                        return;
                    }
                    if (i.this.A != null) {
                        i.this.A.onPolylineClick(polyline == null ? null : new Polyline(new n(polyline, null, i.this)), latLng != null ? new com.sankuai.meituan.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude) : null);
                    }
                    i.this.d.onPolylineClick();
                }
            };
            this.b.setOnPolylineClickListener(this.r);
        }
        this.A = onPolylineClickListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public final void onCameraChange(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e253db7ccf7127cf4c801ca06e0b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e253db7ccf7127cf4c801ca06e0b29");
            return;
        }
        CameraPosition a2 = b.a(cameraPosition);
        if (this.mOnCameraChangeListener != null) {
            if (this.mOnCameraChangeListener instanceof OnCameraChangeExtraListener) {
                ((OnCameraChangeExtraListener) this.mOnCameraChangeListener).onCameraChange(a2, this.mCameraChangedType == 1);
            } else if (this.mOnCameraChangeListener instanceof OnCameraChangeExtraListener2) {
                ((OnCameraChangeExtraListener2) this.mOnCameraChangeListener).onCameraChange(a2, this.mCameraChangedType == 1, this.mCameraMapGestureType);
            } else {
                this.mOnCameraChangeListener.onCameraChange(a2);
            }
        }
        if (this.mOnCameraChangeListeners == null || this.mOnCameraChangeListeners.isEmpty()) {
            return;
        }
        for (MTMap.OnCameraChangeListener onCameraChangeListener : this.mOnCameraChangeListeners) {
            if (onCameraChangeListener instanceof OnCameraChangeExtraListener) {
                ((OnCameraChangeExtraListener) onCameraChangeListener).onCameraChange(a2, this.mCameraChangedType == 1);
            } else if (onCameraChangeListener instanceof OnCameraChangeExtraListener2) {
                ((OnCameraChangeExtraListener2) onCameraChangeListener).onCameraChange(a2, this.mCameraChangedType == 1, this.mCameraMapGestureType);
            } else {
                onCameraChangeListener.onCameraChange(a2);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener
    public final void onCameraChangeFinished(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85e95142e67d82bc11c48736cca5e727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85e95142e67d82bc11c48736cca5e727");
            return;
        }
        CameraPosition a2 = b.a(cameraPosition);
        if (this.mOnCameraChangeListener != null) {
            if (this.mOnCameraChangeListener instanceof OnCameraChangeExtraListener) {
                ((OnCameraChangeExtraListener) this.mOnCameraChangeListener).onCameraChangeFinish(a2, this.mCameraChangedType == 1);
            } else if (this.mOnCameraChangeListener instanceof OnCameraChangeExtraListener2) {
                ((OnCameraChangeExtraListener2) this.mOnCameraChangeListener).onCameraChangeFinish(a2, this.mCameraChangedType == 1, this.mCameraMapGestureType);
            } else {
                this.mOnCameraChangeListener.onCameraChangeFinish(a2);
            }
        }
        if (this.mOnCameraChangeListeners != null && !this.mOnCameraChangeListeners.isEmpty()) {
            for (MTMap.OnCameraChangeListener onCameraChangeListener : this.mOnCameraChangeListeners) {
                if (onCameraChangeListener instanceof OnCameraChangeExtraListener) {
                    ((OnCameraChangeExtraListener) onCameraChangeListener).onCameraChangeFinish(a2, this.mCameraChangedType == 1);
                } else if (onCameraChangeListener instanceof OnCameraChangeExtraListener2) {
                    ((OnCameraChangeExtraListener2) onCameraChangeListener).onCameraChangeFinish(a2, this.mCameraChangedType == 1, this.mCameraMapGestureType);
                } else {
                    onCameraChangeListener.onCameraChangeFinish(a2);
                }
            }
        }
        updateCameraChangedType(0);
        resetCameraGestureType();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorPosition(com.sankuai.meituan.mapsdk.maps.model.LatLng latLng, String str, String str2, int i) {
        Object[] objArr = {latLng, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af8806944b7a1cfec148e47e9da1c13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af8806944b7a1cfec148e47e9da1c13");
            return;
        }
        setIndoorEnabled(true);
        moveCamera(com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory.newLatLngZoom(latLng, 18.0f));
        addMarker(new MarkerOptions().position(latLng).indoorInfo(new IndoorInfo(str, str2)));
        setIndoorFloor(str, str2, i);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setIndoorFloor(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f3de96eb9e4a20e697d55c4dd278c4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f3de96eb9e4a20e697d55c4dd278c4c");
        } else {
            this.b.setIndoorFloor(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setViewInfoWindowEnabled(boolean z) {
        this.j = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setOnMapTouchListener(MTMap.OnMapTouchListener onMapTouchListener) {
        Object[] objArr = {onMapTouchListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a6a05072e58fcf58dfed2a51ed71e68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a6a05072e58fcf58dfed2a51ed71e68");
        } else if (this.u != null) {
            this.u.setOnMapTouchListener(onMapTouchListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5caba012c607ee891bd40141580d9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5caba012c607ee891bd40141580d9c1");
        } else {
            addMapGestureListener(zVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void enableMultipleInfowindow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262c4a755bebb1b790ec06a2e4e45d1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262c4a755bebb1b790ec06a2e4e45d1b");
            return;
        }
        this.e = !z ? 1 : 0;
        this.H = z;
        this.b.enableMultipleInfowindow(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public final void setDrawPillarWith2DStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e69365fed0d6c5252c70c63562699e50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e69365fed0d6c5252c70c63562699e50");
        } else {
            this.b.setDrawPillarWith2DStyle(z);
        }
    }

    public static /* synthetic */ void f(i iVar) {
        if (iVar.mCameraMapGestureType == CameraMapGestureType.PAN && iVar.mCameraMapGestureType == CameraMapGestureType.DOUBLE_TAP) {
            return;
        }
        iVar.mCameraMapGestureType = CameraMapGestureType.PINCH;
    }
}
