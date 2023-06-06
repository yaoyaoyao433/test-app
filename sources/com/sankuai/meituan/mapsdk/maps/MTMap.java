package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.report.f;
import com.sankuai.meituan.mapsdk.mapcore.utils.b;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.aa;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
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
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlay;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlay;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlay;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.IndoorBuilding;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MapAoi;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.MapPoi;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
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
import com.sankuai.meituan.mapsdk.maps.model.WeatherEffect;
import com.sankuai.meituan.mapsdk.maps.model.WeatherType;
import com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTMap extends AbsMTMap {
    @Deprecated
    public static final String FEATURE_KEY_STATE = "state";
    @Deprecated
    public static final String FEATURE_STATE_NORMAL = "normal";
    @Deprecated
    public static final String FEATURE_STATE_SELECTED = "selecting";
    public static ChangeQuickRedirect changeQuickRedirect;
    private IMTMap a;
    private Set<String> b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);

        void onCameraChangeFinish(CameraPosition cameraPosition);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnIndoorStateChangeListener {
        boolean onIndoorBuildingDeactivated();

        boolean onIndoorBuildingFocused();

        boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);

        void onInfoWindowClickLocation(int i, int i2, int i3, int i4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMapAoiClickListener {
        void onMapAoiClick(MapAoi mapAoi, LatLng latLng);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMapLoadedListener {
        void onMapLoaded();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMapPoiClickListener {
        void onMapPoiClick(MapPoi mapPoi);
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public interface OnMapRenderCallback {
        void onMapRenderFinished();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMapScreenShotListener {
        void onMapScreenShot(Bitmap bitmap);

        void onMapScreenShot(Bitmap bitmap, int i);
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public interface OnMapTouchListener extends aa {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnMarkerSelectChangeListener {
        void onDeselected(Marker marker);

        void onSelected(Marker marker);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnPolygonClickListener {
        void onPolygonClick(Polygon polygon);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnPolylineClickListener {
        void onPolylineClick(Polyline polyline, LatLng latLng);
    }

    public MTMap(IMTMap iMTMap) {
        Object[] objArr = {iMTMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9750c8618492d539c94fd9966fd8a170", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9750c8618492d539c94fd9966fd8a170");
        } else {
            this.a = iMTMap;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setPreloadParentTileLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d9f4c21f991e3a4c0bbbcd5383b4bf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d9f4c21f991e3a4c0bbbcd5383b4bf4");
        } else if (this.a != null) {
            this.a.setPreloadParentTileLevel(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e98ce662148412e9521371fb9d4ca87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e98ce662148412e9521371fb9d4ca87");
        } else if (this.a == null) {
            c.f("MTMap#clear: MTMapClear失败！MTMap为空");
        } else {
            this.a.clear();
            c.f("MTMap#clear");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void fitAllElement(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e99e787a2d0591bd1d3dd625c7565914", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e99e787a2d0591bd1d3dd625c7565914");
        } else if (this.a == null) {
        } else {
            this.a.fitAllElement(z, z2, z3, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMapAoiClickListener(OnMapAoiClickListener onMapAoiClickListener) {
        Object[] objArr = {onMapAoiClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9da6f7ccca53ad552342da689588932e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9da6f7ccca53ad552342da689588932e");
        } else if (this.a != null) {
            this.a.setOnMapAoiClickListener(onMapAoiClickListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void fitElement(List<l> list, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a474444e08816452fdc7e5075e7511d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a474444e08816452fdc7e5075e7511d");
        } else if (this.a == null) {
        } else {
            this.a.fitElement(list, z, z2, z3, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public List<MarkerOptions> createDynamicMarkerOptions(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4454a2a37c75818bb87a9b2554df8e0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4454a2a37c75818bb87a9b2554df8e0b");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.createDynamicMarkerOptions(str);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setPadding(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a95b5f8ce8d895eea916aa26d88b4795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a95b5f8ce8d895eea916aa26d88b4795");
        } else if (this.a == null) {
        } else {
            this.a.setPadding(i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMyLocationEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38a521be9afa85d7328f9623152a4b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38a521be9afa85d7328f9623152a4b8f");
        } else if (this.a == null) {
        } else {
            this.a.setMyLocationEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setLocationSource(y yVar) {
        Object[] objArr = {yVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "651c739ced81568dc2132ae040307d0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "651c739ced81568dc2132ae040307d0c");
        } else if (this.a == null) {
        } else {
            this.a.setLocationSource(yVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        Object[] objArr = {myLocationStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c93499c56faefa782bcb7b0a3e1c680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c93499c56faefa782bcb7b0a3e1c680");
        } else if (this.a == null) {
        } else {
            this.a.setMyLocationStyle(myLocationStyle);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public MyLocationStyle getMyLocationStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fa225879cb8c20d5726514b7655aa8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MyLocationStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fa225879cb8c20d5726514b7655aa8e");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getMyLocationStyle();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnLocationChangedListener(y.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1ad0f9f422e046e4cf0ced5086dc130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1ad0f9f422e046e4cf0ced5086dc130");
        } else if (this.a == null) {
        } else {
            this.a.setOnLocationChangedListener(aVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        Object[] objArr = {tileOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0a43994f91b7d3074c5c4d2d3f12108", RobustBitConfig.DEFAULT_VALUE)) {
            return (TileOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0a43994f91b7d3074c5c4d2d3f12108");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.addTileOverlay(tileOverlayOptions);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setIndoorEntranceZoomLevel(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af21b7b63f2afde514edc491d947edfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af21b7b63f2afde514edc491d947edfb");
        } else if (this.a == null) {
        } else {
            this.a.setIndoorEntranceZoomLevel(d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public double getIndoorEntranceZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29dcfff743e3009ba1a54da9c22ad48c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29dcfff743e3009ba1a54da9c22ad48c")).doubleValue();
        }
        if (this.a == null) {
            return 17.0d;
        }
        return this.a.getIndoorEntranceZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public Location getCurrentLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69a94e9ffb932e1859e87b786ff0a35a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69a94e9ffb932e1859e87b786ff0a35a");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getCurrentLocation();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public MapLocation getCurrentMapLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e829fd623d7b80e9ce35da91e7ffd433", RobustBitConfig.DEFAULT_VALUE)) {
            return (MapLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e829fd623d7b80e9ce35da91e7ffd433");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getCurrentMapLocation();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public float[] getViewMatrix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12fff03ccc43b82b767119860028d82a", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12fff03ccc43b82b767119860028d82a");
        }
        if (this.a == null) {
            return new float[0];
        }
        return this.a.getViewMatrix();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public float[] getProjectionMatrix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a69e8866aaf98e3cc8fbb3a1d08f14c", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a69e8866aaf98e3cc8fbb3a1d08f14c");
        }
        if (this.a == null) {
            return new float[0];
        }
        return this.a.getProjectionMatrix();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setCustomRenderer(MTCustomRenderer mTCustomRenderer) {
        Object[] objArr = {mTCustomRenderer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d03e585243a56070d4c0fe291288e22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d03e585243a56070d4c0fe291288e22");
        } else if (this.a == null) {
        } else {
            this.a.setCustomRenderer(mTCustomRenderer);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void runOnDrawFrame() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c2c6a2858a7aafc59cfc36b81006af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c2c6a2858a7aafc59cfc36b81006af0");
        } else if (this.a == null) {
        } else {
            this.a.runOnDrawFrame();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMultiInfoWindowEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "750f32cf70653cfa387a40298ef13eea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "750f32cf70653cfa387a40298ef13eea");
        } else if (this.a == null) {
        } else {
            this.a.setMultiInfoWindowEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean isMultiInfoWindowEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fadb5dd82f5fcba11c43103791d14c6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fadb5dd82f5fcba11c43103791d14c6d")).booleanValue();
        }
        if (this.a == null) {
            return false;
        }
        return this.a.isMultiInfoWindowEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void moveCamera(CameraUpdate cameraUpdate) {
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea4f943d0cdb362c8b669e7392f47448", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea4f943d0cdb362c8b669e7392f47448");
        } else if (this.a == null) {
        } else {
            a(cameraUpdate);
            this.a.moveCamera(cameraUpdate);
        }
    }

    private void a(CameraUpdate cameraUpdate) {
        CameraUpdateMessage cameraUpdateMessage;
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9071e42b49772a22c68f02c5e74d3827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9071e42b49772a22c68f02c5e74d3827");
        } else if (cameraUpdate == null || (cameraUpdateMessage = cameraUpdate.getCameraUpdateMessage()) == null) {
        } else {
            LatLng latLng = cameraUpdateMessage.latLng;
            CameraPosition cameraPosition = cameraUpdateMessage.cameraPosition;
            LatLngBounds latLngBounds = cameraUpdateMessage.latLngBounds;
            Class<?> cls = getClass();
            String str = "CameraUpdateType=" + cameraUpdateMessage.type + "; ";
            checkLatLng(cls, "checkCameraLatLng", MapConstant.LayerPropertyFlag_MarkerCustomCollision, latLng, str + "LatLng=" + latLng);
            if (cameraPosition != null) {
                checkLatLng(cls, "checkCameraLatLng", MapConstant.LayerPropertyFlag_MarkerCustomCollision, cameraPosition.target, str + "CameraPosition.target=" + cameraPosition.target);
            }
            if (latLngBounds != null) {
                String str2 = str + "LatLngBounds.northwest=" + latLngBounds.northeast + "; LatLngBounds.southwest=" + latLngBounds.southwest;
                checkLatLng(cls, "checkCameraLatLng", MapConstant.LayerPropertyFlag_MarkerCustomCollision, latLngBounds.northeast, str2);
                checkLatLng(cls, "checkCameraLatLng", MapConstant.LayerPropertyFlag_MarkerCustomCollision, latLngBounds.southwest, str2);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setRenderFps(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "375718869f08b308f006cae07f80260c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "375718869f08b308f006cae07f80260c");
        } else if (this.a == null) {
        } else {
            this.a.setRenderFps(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void resetRenderFps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd198aa1368b517dcef2c7f81e9e7cf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd198aa1368b517dcef2c7f81e9e7cf6");
        } else if (this.a == null) {
        } else {
            this.a.resetRenderFps();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void refreshContinuously(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a9a40518f35a11ec8b7292a6ed3f9d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a9a40518f35a11ec8b7292a6ed3f9d6");
        } else if (this.a == null) {
        } else {
            this.a.refreshContinuously(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setZoomMode(@NonNull ac acVar) {
        Object[] objArr = {acVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea8608ba5795e072c448673de27c2c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea8608ba5795e072c448673de27c2c63");
        } else if (this.a == null) {
        } else {
            this.a.setZoomMode(acVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public ac getZoomMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a14f6bc42c2b685c8870d1eb8383c4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ac) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a14f6bc42c2b685c8870d1eb8383c4d");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getZoomMode();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setTileCacheType(String str, TileCacheType tileCacheType) {
        Object[] objArr = {str, tileCacheType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79f6b493137052e162a332f702561612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79f6b493137052e162a332f702561612");
        } else if (this.a == null) {
        } else {
            this.a.setTileCacheType(str, tileCacheType);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setTileCacheRatio(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61c16dd96161aa5f7b531038023a7452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61c16dd96161aa5f7b531038023a7452");
        } else if (this.a == null) {
        } else {
            this.a.setTileCacheRatio(str, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public CameraPosition getCameraPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a3447605938d8aaf78359dbb96fa03b", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a3447605938d8aaf78359dbb96fa03b");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getCameraPosition();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Marker addMarker(@NonNull MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ed9816f682de6c7cbb0d05b9148d2f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Marker) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ed9816f682de6c7cbb0d05b9148d2f4");
        }
        Marker marker = null;
        if (this.a != null) {
            a(markerOptions);
            marker = this.a.addMarker(markerOptions);
        }
        String str = "";
        String str2 = "";
        if (marker == null) {
            a("MTMapCreatePointStatus", 0);
            a(2000, "Marker is null. ", "MTMapAndroidOverlayExceptionStatus");
        } else {
            str = marker.getId();
            str2 = "[" + b.a(marker.getPosition()) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
        a("addMarker", "id=" + str + "&list=" + str2);
        return marker;
    }

    private void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65b03ee613a721a5edcc9faaf9fd8b1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65b03ee613a721a5edcc9faaf9fd8b1f");
            return;
        }
        if (this.b == null) {
            this.b = new HashSet();
        }
        String valueOf = String.valueOf(i);
        if (this.b.contains(valueOf)) {
            return;
        }
        this.b.add(valueOf);
        f.a(this.u.getContext(), this.u.getMapType(), this.u.getMapKey(), getClass(), "reportExceptionPerMap", i, str, str2, 1.0f);
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73e84b6c3d6edd4ebbf5d2ca5167cf7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73e84b6c3d6edd4ebbf5d2ca5167cf7b");
        } else {
            f.a(this.u.getContext(), this.u.getMapType(), this.u.getMapKey(), getClass(), str, 666L, str2, (String) null, 0.0f);
        }
    }

    private void a(MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3621f39f17a3f9b63f1fac6dc2204fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3621f39f17a3f9b63f1fac6dc2204fe");
        } else if (markerOptions != null) {
            LatLng position = markerOptions.getPosition();
            Class<?> cls = getClass();
            checkLatLng(cls, "checkMarkerLatLng", MapConstant.LayerPropertyFlag_MarkerAvoidScreen, position, "LatLng=" + position);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public List<Marker> addMarkerList(List<MarkerOptions> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9172b907a89c9ed1f0a1c13f2791b5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9172b907a89c9ed1f0a1c13f2791b5f");
        }
        List<Marker> list2 = null;
        if (list == null) {
            return null;
        }
        if (this.a != null) {
            for (MarkerOptions markerOptions : list) {
                a(markerOptions);
            }
            list2 = this.a.addMarkerList(list);
        }
        if (list2 == null) {
            a("MTMapCreatePointStatus", 0);
            a(2000, "MarkerList is null. ", "MTMapAndroidOverlayExceptionStatus");
        }
        return list2;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Polyline addPolyline(@NonNull PolylineOptions polylineOptions) {
        String id;
        int size;
        Object[] objArr = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15860df450dfcd586770b1780ed5705f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Polyline) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15860df450dfcd586770b1780ed5705f");
        }
        Polyline addPolyline = this.a != null ? this.a.addPolyline(polylineOptions) : null;
        String str = "";
        if (addPolyline == null) {
            a("MTMapCreateLineStatus", 0);
            a(2001, "Polyline is null. ", "MTMapAndroidOverlayExceptionStatus");
            id = "";
            size = 0;
        } else {
            List<LatLng> points = polylineOptions.getPoints();
            id = addPolyline.getId();
            size = points.size();
            if (!points.isEmpty()) {
                if (points.size() < 2) {
                    f.a(this.u.getContext(), this.u.getMapType(), this.u.getMapKey(), getClass(), "addPolyline", 4201, "The size of Polyline points is " + points.size() + " less than 2.", "MTMapAndroidInteractiveExceptionStatus", 1.0f);
                    str = "[" + b.a(points.get(0)) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                } else {
                    if (size >= 80000) {
                        f.a(this.u.getContext(), this.u.getMapType(), this.u.getMapKey(), getClass(), "addPolyline", 4202L, "lines_count: " + points.size(), "MTMapAndroidInteractiveExceptionStatus", 1.0f);
                    }
                    str = "[" + b.a(points.get(0)) + ", " + b.a(points.get(size - 1)) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                }
            }
        }
        a("addPolyline", "id=" + id + "&pointsSize=" + size + "&list=" + str);
        return addPolyline;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Circle addCircle(@NonNull CircleOptions circleOptions) {
        Object[] objArr = {circleOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d51faec76d0dc4226a0664d605b792c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Circle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d51faec76d0dc4226a0664d605b792c");
        }
        Circle addCircle = this.a != null ? this.a.addCircle(circleOptions) : null;
        if (addCircle == null) {
            a("MTMapCreateCircleStatus", 0);
        }
        return addCircle;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Polygon addPolygon(@NonNull PolygonOptions polygonOptions) {
        Object[] objArr = {polygonOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15f9acca71739653ba4cc8e3edb82883", RobustBitConfig.DEFAULT_VALUE)) {
            return (Polygon) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15f9acca71739653ba4cc8e3edb82883");
        }
        Polygon addPolygon = this.a != null ? this.a.addPolygon(polygonOptions) : null;
        if (polygonOptions != null && polygonOptions.getPoints() != null) {
            List<LatLng> points = polygonOptions.getPoints();
            for (LatLng latLng : points) {
                Class<?> cls = getClass();
                if (checkLatLng(cls, "addPolygon", 4250, latLng, "There is an invalid LatLng object (" + latLng + CommonConstant.Symbol.BRACKET_RIGHT)) {
                    break;
                }
            }
            if (points.size() < 3) {
                Context context = this.u.getContext();
                int mapType = this.u.getMapType();
                String mapKey = this.u.getMapKey();
                Class<?> cls2 = getClass();
                f.a(context, mapType, mapKey, cls2, "addPolygon", 4251, "The size of polygon points is " + points.size() + ", less than 3", "MTMapAndroidInteractiveExceptionStatus", 1.0f);
            }
        }
        if (addPolygon == null) {
            a("MTMapCreatePolygonStatus", 0);
        }
        return addPolygon;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        Object[] objArr = {groundOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6d18fb3e7cb8a2dd51abd1c8d7d648b", RobustBitConfig.DEFAULT_VALUE)) {
            return (GroundOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6d18fb3e7cb8a2dd51abd1c8d7d648b");
        }
        GroundOverlay addGroundOverlay = this.a != null ? this.a.addGroundOverlay(groundOverlayOptions) : null;
        if (addGroundOverlay == null) {
            a("MTMapCreateGroundOverlayStatus", 0);
        }
        return addGroundOverlay;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public float getMaxZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ae0085d108f0623b7fdf42bf54ae9b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ae0085d108f0623b7fdf42bf54ae9b8")).floatValue();
        }
        if (this.a == null) {
            return 0.0f;
        }
        return this.a.getMaxZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public float getMinZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7214f535f38d9cc4b488c59823c7ad24", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7214f535f38d9cc4b488c59823c7ad24")).floatValue();
        }
        if (this.a == null) {
            return 0.0f;
        }
        return this.a.getMinZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public LatLng getMapCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59da1901882d170131c3ec68e62c2b36", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59da1901882d170131c3ec68e62c2b36");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getMapCenter();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public float getZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b65ec32aa7d61255079807b38f10c574", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b65ec32aa7d61255079807b38f10c574")).floatValue();
        }
        if (this.a == null) {
            return 0.0f;
        }
        return this.a.getZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public int getMapType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d928cf91e7f080b33c262bf31aebed0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d928cf91e7f080b33c262bf31aebed0")).intValue();
        }
        if (this.a == null) {
            return 0;
        }
        return this.a.getMapType();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void animateCamera(@NonNull CameraUpdate cameraUpdate) {
        Object[] objArr = {cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2af93ce80210f813fbbba460a454273d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2af93ce80210f813fbbba460a454273d");
        } else if (this.a == null) {
        } else {
            a(cameraUpdate);
            this.a.animateCamera(cameraUpdate);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void animateCamera(@NonNull CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        Object[] objArr = {cameraUpdate, cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ad1dd10ef4eaed9ee42679ef5735495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ad1dd10ef4eaed9ee42679ef5735495");
        } else if (this.a == null) {
        } else {
            a(cameraUpdate);
            this.a.animateCamera(cameraUpdate, cancelableCallback);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void animateCamera(@NonNull CameraUpdate cameraUpdate, long j, CancelableCallback cancelableCallback) {
        Object[] objArr = {cameraUpdate, new Long(j), cancelableCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "504e34e87dcc61be9c686bb1d3e51420", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "504e34e87dcc61be9c686bb1d3e51420");
        } else if (this.a == null) {
        } else {
            a(cameraUpdate);
            this.a.animateCamera(cameraUpdate, j, cancelableCallback);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void stopAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2df67c7ed4bfde1cfec803d80bcafaed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2df67c7ed4bfde1cfec803d80bcafaed");
        } else if (this.a == null) {
        } else {
            this.a.stopAnimation();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMapType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6200ba0ca21036e3df1870bd93823010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6200ba0ca21036e3df1870bd93823010");
        } else if (this.a == null) {
        } else {
            this.a.setMapType(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setTrafficEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "723f7497a5a384967ca93d350a578d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "723f7497a5a384967ca93d350a578d6e");
        } else if (this.a == null) {
        } else {
            this.a.setTrafficEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean isTrafficEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f10043344747066b5449421a1c7cad1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f10043344747066b5449421a1c7cad1")).booleanValue();
        }
        if (this.a == null) {
            return false;
        }
        return this.a.isTrafficEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void clickToDeselectMarker(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b0f972d053f5e0a08df15890bfbeba0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b0f972d053f5e0a08df15890bfbeba0");
        } else if (this.a == null) {
        } else {
            this.a.clickToDeselectMarker(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public InfoWindowAdapter getInfoWindowAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d304dcbff231ae0d687318a24884f0ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (InfoWindowAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d304dcbff231ae0d687318a24884f0ce");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getInfoWindowAdapter();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public List<Marker> getMapScreenMarkers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd214c48f8751068c7c0f898c94c000b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd214c48f8751068c7c0f898c94c000b");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getMapScreenMarkers();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public UiSettings getUiSettings() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cf5beafd27171d45671ad96b8c3d911", RobustBitConfig.DEFAULT_VALUE)) {
            return (UiSettings) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cf5beafd27171d45671ad96b8c3d911");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getUiSettings();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Projection getProjection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4e80a25a34334c1d7dc3c05162d69b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Projection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4e80a25a34334c1d7dc3c05162d69b7");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getProjection();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public HeatOverlay addHeatOverlay(HeatOverlayOptions heatOverlayOptions) {
        Object[] objArr = {heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6155c188a52ee05a1d73d56148f3d1b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (HeatOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6155c188a52ee05a1d73d56148f3d1b4");
        }
        HeatOverlay addHeatOverlay = this.a != null ? this.a.addHeatOverlay(heatOverlayOptions) : null;
        if (heatOverlayOptions != null) {
            List<LatLng> data = heatOverlayOptions.getData();
            if (data != null) {
                for (LatLng latLng : data) {
                    Class<?> cls = getClass();
                    if (checkLatLng(cls, "addHeatOverlay", 4300, latLng, "There is an invalid LatLng object (" + latLng + ").")) {
                        break;
                    }
                }
            }
            List<WeightedLatLng> weightedData = heatOverlayOptions.getWeightedData();
            if (weightedData != null) {
                for (WeightedLatLng weightedLatLng : weightedData) {
                    if (weightedLatLng != null) {
                        Class<?> cls2 = getClass();
                        LatLng latLng2 = weightedLatLng.getLatLng();
                        if (checkLatLng(cls2, "addHeatOverlay", 4300, latLng2, "There is an invalid WeightedLatLng object (" + weightedLatLng + ").")) {
                            break;
                        }
                    }
                }
            }
        }
        if (addHeatOverlay == null) {
            a("MTMapCreatePolygonStatus", 0);
        }
        return addHeatOverlay;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public HoneyCombOverlay addHoneyCombOverlay(HoneyCombOverlayOptions honeyCombOverlayOptions) {
        Object[] objArr = {honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd703694df4f6ffdbeaabb944518cc13", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlay) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd703694df4f6ffdbeaabb944518cc13");
        }
        HoneyCombOverlay addHoneyCombOverlay = this.a != null ? this.a.addHoneyCombOverlay(honeyCombOverlayOptions) : null;
        if (addHoneyCombOverlay == null) {
            a("MTMapCreatePolygonStatus", 0);
        }
        return addHoneyCombOverlay;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Text addText(TextOptions textOptions) {
        Object[] objArr = {textOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06358a68d1eaadaece9fc527434da179", RobustBitConfig.DEFAULT_VALUE)) {
            return (Text) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06358a68d1eaadaece9fc527434da179");
        }
        Text addText = this.a != null ? this.a.addText(textOptions) : null;
        if (addText == null) {
            a("MTMapCreatePointStatus", 0);
        }
        return addText;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public float getScalePerPixel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67594e7a2b54d2739593f8f02da40b7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67594e7a2b54d2739593f8f02da40b7d")).floatValue();
        }
        if (this.a == null) {
            return 0.0f;
        }
        return this.a.getScalePerPixel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public float toOpenGLWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cc617ab1a5953bc2da3cedc223f433a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cc617ab1a5953bc2da3cedc223f433a")).floatValue();
        }
        if (this.a == null) {
            return 0.0f;
        }
        return this.a.toOpenGLWidth(i);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMaxZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a591c5f2b332ef2adddcd151e2d9ee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a591c5f2b332ef2adddcd151e2d9ee1");
        } else if (this.a == null) {
        } else {
            this.a.setMaxZoomLevel(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMinZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af68bc6c031361971109e0f8df0d2a77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af68bc6c031361971109e0f8df0d2a77");
        } else if (this.a == null) {
        } else {
            this.a.setMinZoomLevel(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setPointToCenter(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfbdb3b8d02e73b831978932803ba5f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfbdb3b8d02e73b831978932803ba5f8");
        } else if (this.a == null) {
        } else {
            this.a.setPointToCenter(i, i2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public List<LatLng> getBounderPoints(Marker marker) {
        Object[] objArr = {marker};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d5b8edc11010dc819d1a12d0d3b7853", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d5b8edc11010dc819d1a12d0d3b7853");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getBounderPoints(marker);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setCameraCenterProportion(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd35063eff365a96c7f960ffac83f3bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd35063eff365a96c7f960ffac83f3bc");
        } else if (this.a == null) {
        } else {
            this.a.setCameraCenterProportion(f, f2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setCameraCenterProportion(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb39d0d9722468164acf4a97fc6d8b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb39d0d9722468164acf4a97fc6d8b4");
        } else if (this.a == null) {
        } else {
            this.a.setCameraCenterProportion(f, f2, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void show3dBuilding(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd3d13c6bdda6c37fe30915ebb0f8945", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd3d13c6bdda6c37fe30915ebb0f8945");
        } else if (this.a == null) {
        } else {
            this.a.show3dBuilding(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean is3dBuildingShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cc9d929073f7c9492d8e2e63e3e1a5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cc9d929073f7c9492d8e2e63e3e1a5d")).booleanValue();
        }
        if (this.a == null) {
            return false;
        }
        return this.a.is3dBuildingShowing();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void showTrafficLight(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42a040375833e8cc1a5996632d2fc92d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42a040375833e8cc1a5996632d2fc92d");
        } else if (this.a == null) {
        } else {
            this.a.showTrafficLight(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public <T extends WeatherEffect> T getWeatherEffect(@NonNull Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab745532942896397ac0e8f72108e402", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab745532942896397ac0e8f72108e402");
        }
        if (this.a == null) {
            return null;
        }
        return (T) this.a.getWeatherEffect(cls);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setWeatherType(@NonNull WeatherType weatherType) {
        Object[] objArr = {weatherType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2477ac892c692017e6e9d8772f62313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2477ac892c692017e6e9d8772f62313");
        } else if (this.a == null) {
        } else {
            this.a.setWeatherType(weatherType);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setWeatherIntensity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71d0a9ab572fa0dfe27b4d63d5cef95a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71d0a9ab572fa0dfe27b4d63d5cef95a");
        } else if (this.a == null) {
        } else {
            this.a.setWeatherIntensity(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void disableWeather() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5f613acc189f178673ee6a696546799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5f613acc189f178673ee6a696546799");
        } else if (this.a == null) {
        } else {
            this.a.disableWeather();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setHandDrawMapEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53bce10ee87a133e62e945955221002e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53bce10ee87a133e62e945955221002e");
        } else if (this.a == null) {
        } else {
            this.a.setHandDrawMapEnable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setIndoorEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b66b5777304ebb675ed18f7789805c7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b66b5777304ebb675ed18f7789805c7a");
        } else if (this.a == null) {
        } else {
            this.a.setIndoorEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean isIndoorEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50022170d9f3c2e9d3a68d2f839ae253", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50022170d9f3c2e9d3a68d2f839ae253")).booleanValue();
        }
        if (this.a == null) {
            return false;
        }
        return this.a.isIndoorEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setIndoorFloor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "387b8dec604ba11460efaee7f6dbc4a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "387b8dec604ba11460efaee7f6dbc4a1");
        } else if (this.a == null) {
        } else {
            this.a.setIndoorFloor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Arrow addArrow(ArrowOptions arrowOptions) {
        Object[] objArr = {arrowOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11fe62b8bedb7c50568c30160b0c2d2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Arrow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11fe62b8bedb7c50568c30160b0c2d2e");
        }
        Arrow addArrow = this.a != null ? this.a.addArrow(arrowOptions) : null;
        if (addArrow == null) {
            a("MTMapCreatePolygonStatus", 0);
        }
        return addArrow;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setIndoorMaskColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ef12703d09f40bf80181f9c58fcee26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ef12703d09f40bf80181f9c58fcee26");
        } else if (this.a == null) {
        } else {
            this.a.setIndoorMaskColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void addArc(ArcOptions arcOptions) {
        Object[] objArr = {arcOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f30b404f99d52dc226630be48b3d8fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f30b404f99d52dc226630be48b3d8fc6");
            return;
        }
        if (this.a != null) {
            this.a.addArc(arcOptions);
        }
        a("MTMapCreateArcStatus", 0);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public Arc addArcEnhance(ArcOptions arcOptions) {
        Object[] objArr = {arcOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30b0db61f134a11764969388a82bd4b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Arc) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30b0db61f134a11764969388a82bd4b8");
        }
        Arc addArcEnhance = this.a != null ? this.a.addArcEnhance(arcOptions) : null;
        if (addArcEnhance == null) {
            a("MTMapCreateArcStatus", 0);
        }
        return addArcEnhance;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setIndoorLevelPickerEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09ab078887cb19baf72188af6834e2e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09ab078887cb19baf72188af6834e2e7");
        } else if (this.a == null) {
        } else {
            this.a.setIndoorLevelPickerEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode) {
        Object[] objArr = {latLngBounds, restrictBoundsFitMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "647f176eaac6b04b8e65dbd348c0c77e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "647f176eaac6b04b8e65dbd348c0c77e");
        } else if (this.a == null) {
        } else {
            this.a.setRestrictBounds(latLngBounds, restrictBoundsFitMode);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode, boolean z) {
        Object[] objArr = {latLngBounds, restrictBoundsFitMode, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caa4998f10c603077d05e95c387b0ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caa4998f10c603077d05e95c387b0ffa");
        } else if (this.a == null) {
        } else {
            this.a.setRestrictBounds(latLngBounds, restrictBoundsFitMode, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public String getMapContentApprovalNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11fd57a64b0ca83ebdba38a260e22fd5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11fd57a64b0ca83ebdba38a260e22fd5");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getMapContentApprovalNumber();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void clearMapCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4a560ca38e8c981d0d69dbe5d73db63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4a560ca38e8c981d0d69dbe5d73db63");
        } else if (this.a == null) {
        } else {
            this.a.clearMapCache();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setCustomSatelliteUri(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a92c533c932c29b9d5144e0353b70d83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a92c533c932c29b9d5144e0353b70d83");
        } else if (this.a == null) {
        } else {
            this.a.setCustomSatelliteUri(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setCustomMapStylePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e3804118cbd0fe7d665e839326ddbbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e3804118cbd0fe7d665e839326ddbbb");
        } else if (this.a == null) {
        } else {
            this.a.setCustomMapStylePath(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setCustomMapStylePath(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5661e7fe5585846afdec6387658180ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5661e7fe5585846afdec6387658180ae");
        } else if (this.a == null) {
        } else {
            this.a.setCustomMapStylePath(str, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMapStyleColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d394873b921cde4a82c9f998feeb4ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d394873b921cde4a82c9f998feeb4ca");
        } else if (this.a == null) {
        } else {
            this.a.setMapStyleColor(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMapStyleColor(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01436d66a8e201d173cf248e39b24223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01436d66a8e201d173cf248e39b24223");
        } else if (this.a == null) {
        } else {
            this.a.setMapStyleColor(str, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public String getCustomMapStylePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f898b275cea37a0977c8cfb9967686", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f898b275cea37a0977c8cfb9967686");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getCustomMapStylePath();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public List<String> getBaseStyleNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a3d1c7182b0484cb28cc88d65ff0541", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a3d1c7182b0484cb28cc88d65ff0541");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getBaseStyleNames();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public String getBaseStyleUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c143862bad8958600db5560960d019ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c143862bad8958600db5560960d019ae");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getBaseStyleUrl(str);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void changeStyle(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee2cc4b6bac12cfb30d0aaad08cf84b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee2cc4b6bac12cfb30d0aaad08cf84b0");
        } else if (this.a == null) {
        } else {
            this.a.changeStyle(str, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void createRoadCrossing(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed0a512789ae30dc2e0fb9dcc3c3dd30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed0a512789ae30dc2e0fb9dcc3c3dd30");
        } else if (this.a == null) {
        } else {
            this.a.createRoadCrossing(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void destroyRoadCrossing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64f7abaa453446cfdc8197a84666c96d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64f7abaa453446cfdc8197a84666c96d");
        } else if (this.a == null) {
        } else {
            this.a.destroyRoadCrossing();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setRoadCrossingID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee7a856afbf422a43ee07e1eb35fc1b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee7a856afbf422a43ee07e1eb35fc1b5");
        } else if (this.a == null) {
        } else {
            this.a.setRoadCrossingID(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setRoadBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "045f4b34996f1262292a583df4e2f5ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "045f4b34996f1262292a583df4e2f5ce");
        } else if (this.a == null) {
        } else {
            this.a.setRoadBackgroundColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setRoadCasingColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86aaf36181b45e5b9eb70890e6589a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86aaf36181b45e5b9eb70890e6589a49");
        } else if (this.a == null) {
        } else {
            this.a.setRoadCasingColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMapViewStyle(boolean z, CustomMapStyleOptions customMapStyleOptions) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), customMapStyleOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28a6498e68065c264c87f7e3a6b2de71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28a6498e68065c264c87f7e3a6b2de71");
        } else if (this.a == null) {
        } else {
            this.a.setMapViewStyle(z, customMapStyleOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setTrafficStyle(TrafficStyle trafficStyle) {
        Object[] objArr = {trafficStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdc6dc67cc59d961aa396900b1a80101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdc6dc67cc59d961aa396900b1a80101");
        } else if (this.a == null) {
        } else {
            this.a.setTrafficStyle(trafficStyle);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public TrafficStyle getTrafficStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62e59b44f7925ab190c55512a0adca21", RobustBitConfig.DEFAULT_VALUE)) {
            return (TrafficStyle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62e59b44f7925ab190c55512a0adca21");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getTrafficStyle();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public DynamicMap createDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "365f784542460f2201dda096dacfa18d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "365f784542460f2201dda096dacfa18d");
        }
        DynamicMap createDynamicMap = this.a != null ? this.a.createDynamicMap(str) : null;
        if (createDynamicMap == null) {
            a("MTMapCreateDynamicMapStatus", 0);
        }
        return createDynamicMap;
    }

    private void a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14945430ba1783347617cbe006fe2330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14945430ba1783347617cbe006fe2330");
            return;
        }
        if (this.b == null) {
            this.b = new HashSet();
        }
        if (this.b.contains(str)) {
            return;
        }
        this.b.add(str);
        HashMap hashMap = new HashMap();
        hashMap.put("mapKey", this.u.getMapKey());
        hashMap.put("techType", f.a(this.v));
        hashMap.put("mapVender", "3");
        hashMap.put("status", "0");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str, Float.valueOf(0.0f));
        f.a(hashMap, hashMap2);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean isMapDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db35debceb7e74220225b37cc635a77b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db35debceb7e74220225b37cc635a77b")).booleanValue();
        }
        if (this.a == null) {
            return true;
        }
        return this.a.isMapDestroyed();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        Object[] objArr = {onCameraChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2a3c078afaf8150b8ba6b6f25f14d4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2a3c078afaf8150b8ba6b6f25f14d4d");
        } else if (this.a == null) {
        } else {
            this.a.setOnCameraChangeListener(onCameraChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void addOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        Object[] objArr = {onCameraChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5348561d23cfd09c4d51c21a41bc627b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5348561d23cfd09c4d51c21a41bc627b");
        } else if (this.a == null) {
        } else {
            this.a.addOnCameraChangeListener(onCameraChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void removeOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        Object[] objArr = {onCameraChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2f61be77d01d37dbdb6375fe3ab2cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2f61be77d01d37dbdb6375fe3ab2cd9");
        } else if (this.a == null) {
        } else {
            this.a.removeOnCameraChangeListener(onCameraChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        Object[] objArr = {onMapClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74864a2a48642ade1547d2ca6a7a8774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74864a2a48642ade1547d2ca6a7a8774");
        } else if (this.a == null) {
        } else {
            this.a.setOnMapClickListener(onMapClickListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        Object[] objArr = {onMarkerClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb074a80e913966e6db0061607416fcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb074a80e913966e6db0061607416fcc");
        } else if (this.a == null) {
        } else {
            this.a.setOnMarkerClickListener(onMarkerClickListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        Object[] objArr = {onMapLoadedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eaa73d5f714d2ac69829bb1a18bd6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eaa73d5f714d2ac69829bb1a18bd6e1");
        } else if (this.a == null) {
        } else {
            this.a.setOnMapLoadedListener(onMapLoadedListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void addOnMapLoadedListener(OnMapLoadedListener onMapLoadedListener) {
        Object[] objArr = {onMapLoadedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3f7995936d23805d5bc1fcacba54981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3f7995936d23805d5bc1fcacba54981");
        } else if (this.a == null || onMapLoadedListener == null) {
        } else {
            this.a.addOnMapLoadedListener(onMapLoadedListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        Object[] objArr = {onMapLongClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b2d90650e82137fb1044e1255b838ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b2d90650e82137fb1044e1255b838ce");
        } else if (this.a == null) {
        } else {
            this.a.setOnMapLongClickListener(onMapLongClickListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        Object[] objArr = {onMarkerDragListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c542c50eff2ed23dd31ab1eb02c94e9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c542c50eff2ed23dd31ab1eb02c94e9d");
        } else if (this.a == null) {
        } else {
            this.a.setOnMarkerDragListener(onMarkerDragListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMarkerSelectChangeListener(OnMarkerSelectChangeListener onMarkerSelectChangeListener) {
        Object[] objArr = {onMarkerSelectChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebe41b00545fb3a406f63009372be71d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebe41b00545fb3a406f63009372be71d");
        } else if (this.a == null) {
        } else {
            this.a.setOnMarkerSelectChangeListener(onMarkerSelectChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        Object[] objArr = {onInfoWindowClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e1a9c778504c25d06f9becc086b66de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e1a9c778504c25d06f9becc086b66de");
        } else if (this.a == null) {
        } else {
            this.a.setOnInfoWindowClickListener(onInfoWindowClickListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        Object[] objArr = {infoWindowAdapter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9df049d279c104e9fe8c6801a67cf7a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9df049d279c104e9fe8c6801a67cf7a6");
        } else if (this.a == null) {
        } else {
            this.a.setInfoWindowAdapter(infoWindowAdapter);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void getMapScreenShot(OnMapScreenShotListener onMapScreenShotListener) {
        Object[] objArr = {onMapScreenShotListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dc3e4be0c892646cfe28fdca6483ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dc3e4be0c892646cfe28fdca6483ba1");
        } else if (this.a == null) {
        } else {
            this.a.getMapScreenShot(onMapScreenShotListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void getPartialScreenShot(OnMapScreenShotListener onMapScreenShotListener, int i, int i2, int i3, int i4) {
        Object[] objArr = {onMapScreenShotListener, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c9d40908c7c793f4ef551a698b0c583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c9d40908c7c793f4ef551a698b0c583");
        } else if (this.a == null) {
        } else {
            this.a.getPartialScreenShot(onMapScreenShotListener, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void addMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5470c185c408f7bddc884dccee31282f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5470c185c408f7bddc884dccee31282f");
        } else if (this.a == null) {
        } else {
            this.a.addMapGestureListener(zVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void removeMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8678d5c13daa5733981d72d6e287bb9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8678d5c13daa5733981d72d6e287bb9a");
        } else if (this.a == null) {
        } else {
            this.a.removeMapGestureListener(zVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
        Object[] objArr = {onPolylineClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f14e9836ec1fb2c22d2cdd399279cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f14e9836ec1fb2c22d2cdd399279cdf");
        } else if (this.a == null) {
        } else {
            this.a.setOnPolylineClickListener(onPolylineClickListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnPolygonClickListener(OnPolygonClickListener onPolygonClickListener) {
        Object[] objArr = {onPolygonClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dc93f609d57f147bfd467466384028f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dc93f609d57f147bfd467466384028f");
        } else if (this.a == null) {
        } else {
            this.a.setOnPolygonClickListener(onPolygonClickListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMapPoiClickListener(OnMapPoiClickListener onMapPoiClickListener) {
        Object[] objArr = {onMapPoiClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd4ae3a4ab492ca4dcdbd81ba03ebc39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd4ae3a4ab492ca4dcdbd81ba03ebc39");
        } else if (this.a == null) {
        } else {
            this.a.setOnMapPoiClickListener(onMapPoiClickListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setIndoorQueryBox(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fc52258e15b0852e3f8e773e3288c70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fc52258e15b0852e3f8e773e3288c70");
        } else if (this.a == null) {
        } else {
            this.a.setIndoorQueryBox(f, f2, f3, f4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onIndoorStateChangeListener) {
        Object[] objArr = {onIndoorStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea548cbd7b35e3d92c09f9aea7ebddf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea548cbd7b35e3d92c09f9aea7ebddf9");
        } else if (this.a == null) {
        } else {
            this.a.setOnIndoorStateChangeListener(onIndoorStateChangeListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean isMapRenderFinish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe2b6aa825da7ddd264fe9a274f97f8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe2b6aa825da7ddd264fe9a274f97f8d")).booleanValue();
        }
        if (this.a == null) {
            return false;
        }
        return this.a.isMapRenderFinish();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setCameraEyeParams(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea2bec6e98d1ec61200ef7368da18c15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea2bec6e98d1ec61200ef7368da18c15");
        } else if (this.a == null || str == null || str.isEmpty()) {
        } else {
            this.a.setCameraEyeParams(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void showBlockedRoad(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ca8dac443a4b71f89b13a8576a3bb50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ca8dac443a4b71f89b13a8576a3bb50");
        } else if (this.a != null) {
            this.a.showBlockedRoad(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public boolean isBlockedRoadShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c734f235751660e70793c30622981490", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c734f235751660e70793c30622981490")).booleanValue();
        }
        if (this.a == null) {
            return false;
        }
        return this.a.isBlockedRoadShowing();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class OnInfoWindowClickedListener implements OnInfoWindowClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract boolean onInfoWindowClicked(Marker marker);

        public abstract boolean onInfoWindowClickedLocation(int i, int i2, int i3, int i4);

        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnInfoWindowClickListener
        public void onInfoWindowClick(Marker marker) {
            Object[] objArr = {marker};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb8bc3a2710db7aedf648fe5fffd8e69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb8bc3a2710db7aedf648fe5fffd8e69");
            } else {
                onInfoWindowClicked(marker);
            }
        }

        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnInfoWindowClickListener
        public void onInfoWindowClickLocation(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fce9603c3e3f7d1ba3241b8d2711b62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fce9603c3e3f7d1ba3241b8d2711b62");
            } else {
                onInfoWindowClickedLocation(i, i2, i3, i4);
            }
        }
    }

    @Deprecated
    public MTMap() {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void changeTilt(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d458779e814d887cf4f3619f258ad0c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d458779e814d887cf4f3619f258ad0c2");
        } else if (this.a == null) {
        } else {
            this.a.changeTilt(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void enableMultipleInfowindow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc88e141f5d0fbdc58a941022755f916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc88e141f5d0fbdc58a941022755f916");
        } else if (this.a == null) {
        } else {
            this.a.enableMultipleInfowindow(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setDrawPillarWith2DStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6007e86f5cc63a3b68acb87d0acc50cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6007e86f5cc63a3b68acb87d0acc50cb");
        } else if (this.a == null) {
        } else {
            this.a.setDrawPillarWith2DStyle(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setViewInfoWindowEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8596d0c22189f84938baafbab667a349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8596d0c22189f84938baafbab667a349");
        } else if (this.a == null) {
        } else {
            this.a.setViewInfoWindowEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setIndoorPosition(LatLng latLng, String str, String str2, int i) {
        Object[] objArr = {latLng, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30541c367463f930ae30f569b1ebd88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30541c367463f930ae30f569b1ebd88f");
        } else if (this.a == null) {
        } else {
            this.a.setIndoorPosition(latLng, str, str2, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setIndoorFloor(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a24f434a61138e0987e2966089c85cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a24f434a61138e0987e2966089c85cd");
        } else if (this.a == null) {
        } else {
            this.a.setIndoorFloor(str, str2, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setMapCustomEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff95c8e776a3a71271feceb3820709de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff95c8e776a3a71271feceb3820709de");
        } else if (this.a == null) {
        } else {
            this.a.setMapCustomEnable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.AbsMTMap, com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setLocationMarkerIcon(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbfa8e263ed155844b27fdcd0ca0c824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbfa8e263ed155844b27fdcd0ca0c824");
        } else if (this.a == null) {
        } else {
            this.a.setLocationMarkerIcon(bitmapDescriptor);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setMapGestureListener(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d83a4c548a54530ed5592de98cd6114c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d83a4c548a54530ed5592de98cd6114c");
        } else if (this.a == null) {
        } else {
            this.a.setMapGestureListener(zVar);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setOnMapTouchListener(OnMapTouchListener onMapTouchListener) {
        Object[] objArr = {onMapTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd1ef2e07e9d8cc4b1db91cc2d4e1f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd1ef2e07e9d8cc4b1db91cc2d4e1f3");
        } else if (this.a == null) {
        } else {
            this.a.setOnMapTouchListener(onMapTouchListener);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void addDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b535033afffac24b9f21d13664ca7da3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b535033afffac24b9f21d13664ca7da3");
        } else if (this.a == null) {
        } else {
            this.a.addDynamicMap(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setDynamicMapGeoJSON(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29cfee1e2a11684feaf9f7815dc38280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29cfee1e2a11684feaf9f7815dc38280");
        } else if (this.a == null) {
        } else {
            this.a.setDynamicMapGeoJSON(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void removeDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8b2ee5476a96f9181def819e3721620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8b2ee5476a96f9181def819e3721620");
        } else if (this.a == null) {
        } else {
            this.a.removeDynamicMap(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void addDynamicMapGeoJSON(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ea101429bdb45cc35b76caad8f84fa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ea101429bdb45cc35b76caad8f84fa5");
        } else if (this.a == null) {
        } else {
            this.a.addDynamicMapGeoJSON(str, str2, str3);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void setDynamicMapFeature(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "081f313dc81332f3668419ba2aa1ad7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "081f313dc81332f3668419ba2aa1ad7e");
        } else if (this.a == null) {
        } else {
            this.a.setDynamicMapFeature(str, str2, str3, str4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void resetDynamicMapFeature(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2f501873d2a55f07a049386e8d85485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2f501873d2a55f07a049386e8d85485");
        } else if (this.a == null) {
        } else {
            this.a.resetDynamicMapFeature(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void resetDynamicMapFeatures(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5c710f623838ae2289c78dbdb6817ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5c710f623838ae2289c78dbdb6817ba");
        } else if (this.a == null) {
        } else {
            this.a.resetDynamicMapFeatures(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void removeDynamicMapGeoJSON(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fb6841c85c9576dd9b1b2477032c48a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fb6841c85c9576dd9b1b2477032c48a");
        } else if (this.a == null) {
        } else {
            this.a.removeDynamicMapGeoJSON(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    @Deprecated
    public void removeDynamicMapGeoJSON(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ce2c744931c5c544737ac62e56bcf26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ce2c744931c5c544737ac62e56bcf26");
        } else if (this.a == null) {
        } else {
            this.a.removeDynamicMapGeoJSON(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.IMTMap
    public void setOnMapRenderCallback(OnMapRenderCallback onMapRenderCallback) {
        Object[] objArr = {onMapRenderCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69cae812c1411b90b3033ac8e471aafb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69cae812c1411b90b3033ac8e471aafb");
        } else if (this.a == null) {
        } else {
            this.a.setOnMapRenderCallback(onMapRenderCallback);
        }
    }
}
