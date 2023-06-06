package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.tencent.map.lib.models.IndoorCellInfo;
import com.tencent.tencentmap.mapsdk.maps.CustomRender;
import com.tencent.tencentmap.mapsdk.maps.LocationSource;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapFontSize;
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
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class bl implements bt, TencentMap {
    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean a();

    protected abstract void b();

    protected abstract void c();

    protected abstract void d();

    protected abstract void e();

    protected abstract void f();

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public <T extends TencentMapComponent.Component> T getMapComponent(Class<T> cls) {
        return (T) getMapContext().getMapComponent(cls);
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void b(Bundle bundle) {
        kn.b(km.M);
        a(bundle);
        kn.d(km.M);
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void h() {
        kn.b(km.N);
        b();
        kn.d(km.N);
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void i() {
        kn.b(km.O);
        c();
        kn.d(km.O);
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void j() {
        kn.b(km.Q);
        d();
        kn.d(km.Q);
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void k() {
        kn.b(km.P);
        kn.d(km.P);
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void l() {
        kn.b(km.R);
        f();
        kn.d(km.R);
    }

    @Override // com.tencent.mapsdk.internal.bt
    public final void m() {
        kn.b(km.S);
        g();
        kn.d(km.S);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnTapMapViewInfoWindowHidden(boolean z) {
        kn.a(km.W, "setOnTapMapViewInfoWindowHidden", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void stopAnimation() {
        kn.a(km.W, "stopAnimation", Integer.valueOf(kn.e(km.W, "stopAnimation")));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        kn.a(km.W, "addTileOverlay", (Object) (tileOverlayOptions != null ? tileOverlayOptions.toString() : ""));
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public CustomLayer addCustomLayer(CustomLayerOptions customLayerOptions) {
        getMapContext().getContext();
        kn.a(km.W, "addCustomLayer", (Object) kn.a(customLayerOptions != null ? customLayerOptions.getLayerId() : ""));
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Polyline addPolyline(PolylineOptions polylineOptions) {
        kn.a(km.W, "addPolyline", (Object) (polylineOptions != null ? polylineOptions.toString() : ""));
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Polygon addPolygon(PolygonOptions polygonOptions) {
        kn.a(km.W, "addPolygon", (Object) (polygonOptions != null ? polygonOptions.toString() : ""));
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Circle addCircle(CircleOptions circleOptions) {
        kn.a(km.W, "addCircle", (Object) (circleOptions != null ? circleOptions.toString() : ""));
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Marker addMarker(MarkerOptions markerOptions) {
        kn.a(km.W, "addMarker", (Object) (markerOptions != null ? markerOptions.toString() : ""));
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public Arc addArc(ArcOptions arcOptions) {
        kn.a(km.W, "addArc", (Object) (arcOptions != null ? arcOptions.toString() : ""));
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clearAllOverlays() {
        kn.a(km.W, "clearAllOverlays", Integer.valueOf(kn.e(km.W, "clearAllOverlays")));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clear() {
        kn.a(km.W, KNBConfig.CONFIG_CLEAR_CACHE, Integer.valueOf(kn.e(km.W, KNBConfig.CONFIG_CLEAR_CACHE)));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clearCache() {
        kn.a(km.W, "clearCache", Integer.valueOf(kn.e(km.W, "clearCache")));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapType(int i) {
        kn.a(km.W, "setMapType", Integer.valueOf(i));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapStyle(int i) {
        kn.a(km.W, "setMapStyle", Integer.valueOf(i));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTrafficEnabled(boolean z) {
        kn.a(km.W, "setTrafficEnabled", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapFontSize(MapFontSize mapFontSize) {
        kn.a(km.W, "setMapFontSize", mapFontSize);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setSatelliteEnabled(boolean z) {
        kn.a(km.W, "setSatelliteEnabled", Boolean.valueOf(z));
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationEnabled(boolean z) {
        kn.a(km.W, "setMyLocationEnabled", Boolean.valueOf(z));
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setLocationSource(LocationSource locationSource) {
        if (locationSource != null) {
            kn.a(km.W, "setLocationSource", (Object) locationSource.getClass().getSimpleName());
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapFrameRate(float f) {
        kn.a(km.W, "setMapFrameRate", Float.valueOf(f));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOverSeaEnable(boolean z) {
        kn.a(km.W, "enableOverSea", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnCameraChangeListener(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        kn.a(km.W, "setOnCameraChangeListener", Boolean.valueOf(onCameraChangeListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapClickListener(TencentMap.OnMapClickListener onMapClickListener) {
        kn.a(km.W, "setOnMapClickListener", Boolean.valueOf(onMapClickListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapLongClickListener(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        kn.a(km.W, "setOnMapLongClickListener", Boolean.valueOf(onMapLongClickListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnPolylineClickListener(TencentMap.OnPolylineClickListener onPolylineClickListener) {
        kn.a(km.W, "setOnPolylineClickListener", Boolean.valueOf(onPolylineClickListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnPolygonClickListener(TencentMap.OnPolygonClickListener onPolygonClickListener) {
        kn.a(km.W, "setOnPolygonClickListener", Boolean.valueOf(onPolygonClickListener != null));
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setOnMyLocationChangeListener(TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        kn.a(km.W, "setOnMyLocationChangeListener", Boolean.valueOf(onMyLocationChangeListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnCompassClickedListener(TencentMap.OnCompassClickedListener onCompassClickedListener) {
        kn.a(km.W, "setOnCompassClickedListener", Boolean.valueOf(onCompassClickedListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        addOnMapLoadedCallback(onMapLoadedCallback);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void addOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        kn.a(km.W, "addOnMapLoadedCallback", Boolean.valueOf(onMapLoadedCallback != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void removeOnMapLoadedCallback(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        kn.a(km.W, "removeOnMapLoadedCallback", Boolean.valueOf(onMapLoadedCallback != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(snapshotReadyCallback != null);
        sb.append("#");
        sb.append(config);
        sb.append("#");
        sb.append(i);
        kn.a(km.W, "snapshot", (Object) sb.toString());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append(snapshotReadyCallback != null);
        sb.append("#");
        sb.append(config);
        kn.a(km.W, "snapshot", (Object) sb.toString());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(TencentMap.SnapshotReadyCallback snapshotReadyCallback) {
        kn.a(km.W, "snapshot", Boolean.valueOf(snapshotReadyCallback != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        kn.a(km.W, "setTencentMapGestureListener", Boolean.valueOf(tencentMapGestureListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void addTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        kn.a(km.W, "addTencentMapGestureListener", Boolean.valueOf(tencentMapGestureListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void removeTencentMapGestureListener(TencentMapGestureListener tencentMapGestureListener) {
        kn.a(km.W, "removeTencentMapGestureListener", Boolean.valueOf(tencentMapGestureListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuildingEnable(boolean z) {
        kn.a(km.W, "setBuildingEnable", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void showBuilding(boolean z) {
        kn.a(km.W, "showBuilding", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuilding3dEffectEnable(boolean z) {
        kn.a(km.W, "setBuilding3dEffectEnable", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapCenterAndScale(float f, float f2, float f3) {
        kn.a(km.W, "setMapCenterAndScale", (Object) (f + "#" + f2 + "#" + f3));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPadding(int i, int i2, int i3, int i4) {
        kn.a(km.W, "setPadding", (Object) (i + "#" + i2 + "#" + i3 + "#" + i4));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPadding(int i, int i2, int i3, int i4, boolean z) {
        kn.a(km.W, "setPadding", (Object) (i + "#" + i2 + "#" + i3 + "#" + i4 + "#" + z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerClickListener(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        kn.a(km.W, "setOnMarkerClickListener", Boolean.valueOf(onMarkerClickListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerDragListener(TencentMap.OnMarkerDragListener onMarkerDragListener) {
        kn.a(km.W, "OnMarkerDragListener", Boolean.valueOf(onMarkerDragListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        kn.a(km.W, "OnInfoWindowClickListener", Boolean.valueOf(onInfoWindowClickListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setInfoWindowAdapter(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        kn.a(km.W, "setInfoWindowAdapter", Boolean.valueOf(infoWindowAdapter != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationStyle(MyLocationStyle myLocationStyle) {
        kn.a(km.W, "setMyLocationStyle", (Object) (myLocationStyle != null ? myLocationStyle.toString() : ""));
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setOnIndoorStateChangeListener(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        kn.a(km.W, "setOnIndoorStateChangeListener", Boolean.valueOf(onIndoorStateChangeListener != null));
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorCellInfo(List<IndoorCellInfo> list) {
        kn.a(km.W, "setIndoorParkSpaceColors", (Object) (list != null ? list.toString() : ""));
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void resetIndoorCellInfo() {
        kn.a(km.W, "resetIndoorParkSpaceColors", (Object) "");
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorEnabled(boolean z) {
        kn.a(km.W, "setIndoorEnabled", Boolean.valueOf(z));
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorFloor(int i) {
        kn.a(km.W, "setIndoorFloor", Integer.valueOf(i));
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorFloor(String str, String str2) {
        kn.a(km.W, "setIndoorFloor", (Object) (str + "#" + str2));
    }

    public void a(int i) {
        kn.a(km.W, "setIndoorConfigType", Integer.valueOf(i));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapPoiClickListener(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        kn.a(km.W, "setOnMapPoiClickListener", Boolean.valueOf(onMapPoiClickListener != null));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCameraCenterProportion(float f, float f2) {
        kn.a(km.W, "setCameraCenterProportion", (Object) (f + "#" + f2));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCameraCenterProportion(float f, float f2, boolean z) {
        kn.a(km.W, "setCameraCenterProportion", (Object) (f + "#" + f2 + "#" + z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPointToCenter(int i, int i2) {
        kn.a(km.W, "setPointToCenter", (Object) (i + "#" + i2));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMaxZoomLevel(int i) {
        kn.a(km.W, "setMaxZoomLevel", Integer.valueOf(i));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMinZoomLevel(int i) {
        kn.a(km.W, "setMinZoomLevel", Integer.valueOf(i));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void loadKMLFile(String str) {
        kn.a(km.W, "loadKMLFile", (Object) str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setDrawPillarWith2DStyle(boolean z) {
        kn.a(km.W, "setDrawPillarWith2DStyle", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBlockRouteEnabled(boolean z) {
        kn.a(km.W, "setBlockRouteEnabled", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setHandDrawMapEnable(boolean z) {
        kn.a(km.W, "setHandDrawMapEnable", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void enableMultipleInfowindow(boolean z) {
        kn.a(km.W, "enableMultipleInfowindow", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setForeignLanguage(Language language) {
        kn.a(km.W, "setForeignLanguage", language);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPoisEnabled(boolean z) {
        kn.a(km.W, "setPoisEnabled", Boolean.valueOf(z));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode) {
        String str;
        if (latLngBounds == null) {
            str = "null restrictBounds";
        } else {
            str = latLngBounds.toString() + "#" + restrictBoundsFitMode;
        }
        kn.a(km.W, "setRestrictBounds", (Object) str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnTrafficEventClickListener(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        kn.a(km.W, "setOnTrafficEventClickListener", Boolean.valueOf(onTrafficEventClickListener != null));
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationClickListener(TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        kn.a(km.W, "setMyLocationClickListener", Boolean.valueOf(onMyLocationClickListener != null));
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorMaskColor(int i) {
        kn.a(km.W, "setIndoorMaskColor", Integer.valueOf(i));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCustomRender(CustomRender customRender) {
        kn.a(km.W, "setCustomRender", customRender);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOverSeaTileProvider(OverSeaTileProvider overSeaTileProvider) {
        kn.a(km.W, "setOverSeaTileProvider", overSeaTileProvider);
    }
}
