package com.sankuai.meituan.mapsdk.maps.interfaces;

import android.location.Location;
import android.support.annotation.NonNull;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.MTCustomRenderer;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
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
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IMTMap {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MapStyleType {
    }

    @Deprecated
    void addArc(ArcOptions arcOptions);

    Arc addArcEnhance(ArcOptions arcOptions);

    Arrow addArrow(ArrowOptions arrowOptions);

    Circle addCircle(@NonNull CircleOptions circleOptions);

    @Deprecated
    void addDynamicMap(String str);

    @Deprecated
    void addDynamicMapGeoJSON(String str, String str2, String str3);

    GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions);

    HeatOverlay addHeatOverlay(HeatOverlayOptions heatOverlayOptions);

    HoneyCombOverlay addHoneyCombOverlay(HoneyCombOverlayOptions honeyCombOverlayOptions);

    void addMapGestureListener(z zVar);

    Marker addMarker(@NonNull MarkerOptions markerOptions);

    List<Marker> addMarkerList(List<MarkerOptions> list);

    void addOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener);

    void addOnMapLoadedListener(MTMap.OnMapLoadedListener onMapLoadedListener);

    Polygon addPolygon(@NonNull PolygonOptions polygonOptions);

    Polyline addPolyline(@NonNull PolylineOptions polylineOptions);

    Text addText(TextOptions textOptions);

    TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions);

    void animateCamera(@NonNull CameraUpdate cameraUpdate);

    void animateCamera(@NonNull CameraUpdate cameraUpdate, long j, MTMap.CancelableCallback cancelableCallback);

    void animateCamera(@NonNull CameraUpdate cameraUpdate, MTMap.CancelableCallback cancelableCallback);

    void changeStyle(String str, boolean z);

    void changeTilt(float f);

    boolean checkLatLng(Class<?> cls, String str, int i, LatLng latLng, String str2);

    void clear();

    void clearMapCache();

    void clickToDeselectMarker(boolean z);

    DynamicMap createDynamicMap(String str);

    List<MarkerOptions> createDynamicMarkerOptions(String str);

    void createRoadCrossing(String str);

    void destroyRoadCrossing();

    @Deprecated
    void disableWeather();

    @Deprecated
    void enableMultipleInfowindow(boolean z);

    void fitAllElement(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4);

    void fitElement(List<l> list, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4);

    List<String> getBaseStyleNames();

    String getBaseStyleUrl(String str);

    List<LatLng> getBounderPoints(Marker marker);

    CameraPosition getCameraPosition();

    @Deprecated
    Location getCurrentLocation();

    MapLocation getCurrentMapLocation();

    String getCustomMapStylePath();

    double getIndoorEntranceZoomLevel();

    MTMap.InfoWindowAdapter getInfoWindowAdapter();

    LatLng getMapCenter();

    String getMapContentApprovalNumber();

    List<Marker> getMapScreenMarkers();

    void getMapScreenShot(MTMap.OnMapScreenShotListener onMapScreenShotListener);

    int getMapType();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    MyLocationStyle getMyLocationStyle();

    void getPartialScreenShot(MTMap.OnMapScreenShotListener onMapScreenShotListener, int i, int i2, int i3, int i4);

    Projection getProjection();

    float[] getProjectionMatrix();

    float getScalePerPixel();

    TrafficStyle getTrafficStyle();

    UiSettings getUiSettings();

    float[] getViewMatrix();

    <T extends WeatherEffect> T getWeatherEffect(@NonNull Class<T> cls);

    float getZoomLevel();

    ac getZoomMode();

    boolean is3dBuildingShowing();

    boolean isBlockedRoadShowing();

    boolean isIndoorEnabled();

    boolean isMapDestroyed();

    boolean isMapRenderFinish();

    boolean isMultiInfoWindowEnabled();

    boolean isTrafficEnabled();

    void moveCamera(CameraUpdate cameraUpdate);

    void refreshContinuously(boolean z);

    @Deprecated
    void removeDynamicMap(String str);

    @Deprecated
    void removeDynamicMapGeoJSON(String str);

    @Deprecated
    void removeDynamicMapGeoJSON(String str, String str2);

    void removeMapGestureListener(z zVar);

    void removeOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener);

    @Deprecated
    void resetDynamicMapFeature(String str, String str2);

    @Deprecated
    void resetDynamicMapFeatures(String str);

    void resetRenderFps();

    void runOnDrawFrame();

    void setCameraCenterProportion(float f, float f2);

    void setCameraCenterProportion(float f, float f2, boolean z);

    void setCameraEyeParams(String str);

    void setCustomMapStylePath(String str);

    void setCustomMapStylePath(String str, boolean z);

    void setCustomRenderer(MTCustomRenderer mTCustomRenderer);

    void setCustomSatelliteUri(String str);

    @Deprecated
    void setDrawPillarWith2DStyle(boolean z);

    @Deprecated
    void setDynamicMapFeature(String str, String str2, String str3, String str4);

    @Deprecated
    void setDynamicMapGeoJSON(String str, String str2);

    void setHandDrawMapEnable(boolean z);

    void setIndoorEnabled(boolean z);

    void setIndoorEntranceZoomLevel(double d);

    void setIndoorFloor(int i);

    @Deprecated
    void setIndoorFloor(String str, String str2, int i);

    void setIndoorLevelPickerEnabled(boolean z);

    void setIndoorMaskColor(int i);

    @Deprecated
    void setIndoorPosition(LatLng latLng, String str, String str2, int i);

    void setIndoorQueryBox(float f, float f2, float f3, float f4);

    void setInfoWindowAdapter(MTMap.InfoWindowAdapter infoWindowAdapter);

    @Deprecated
    void setLocationMarkerIcon(BitmapDescriptor bitmapDescriptor);

    void setLocationSource(y yVar);

    @Deprecated
    void setMapCustomEnable(boolean z);

    @Deprecated
    void setMapGestureListener(z zVar);

    void setMapStyleColor(String str);

    void setMapStyleColor(String str, boolean z);

    void setMapType(int i);

    void setMapViewStyle(boolean z, CustomMapStyleOptions customMapStyleOptions);

    void setMaxZoomLevel(float f);

    void setMinZoomLevel(float f);

    void setMultiInfoWindowEnabled(boolean z);

    void setMyLocationEnabled(boolean z);

    void setMyLocationStyle(MyLocationStyle myLocationStyle);

    void setOnCameraChangeListener(MTMap.OnCameraChangeListener onCameraChangeListener);

    void setOnIndoorStateChangeListener(MTMap.OnIndoorStateChangeListener onIndoorStateChangeListener);

    void setOnInfoWindowClickListener(MTMap.OnInfoWindowClickListener onInfoWindowClickListener);

    void setOnLocationChangedListener(y.a aVar);

    void setOnMapAoiClickListener(MTMap.OnMapAoiClickListener onMapAoiClickListener);

    void setOnMapClickListener(MTMap.OnMapClickListener onMapClickListener);

    void setOnMapLoadedListener(MTMap.OnMapLoadedListener onMapLoadedListener);

    void setOnMapLongClickListener(MTMap.OnMapLongClickListener onMapLongClickListener);

    void setOnMapPoiClickListener(MTMap.OnMapPoiClickListener onMapPoiClickListener);

    @Deprecated
    void setOnMapRenderCallback(MTMap.OnMapRenderCallback onMapRenderCallback);

    @Deprecated
    void setOnMapTouchListener(MTMap.OnMapTouchListener onMapTouchListener);

    void setOnMarkerClickListener(MTMap.OnMarkerClickListener onMarkerClickListener);

    void setOnMarkerDragListener(MTMap.OnMarkerDragListener onMarkerDragListener);

    void setOnMarkerSelectChangeListener(MTMap.OnMarkerSelectChangeListener onMarkerSelectChangeListener);

    void setOnPolygonClickListener(MTMap.OnPolygonClickListener onPolygonClickListener);

    void setOnPolylineClickListener(MTMap.OnPolylineClickListener onPolylineClickListener);

    void setPadding(int i, int i2, int i3, int i4);

    void setPointToCenter(int i, int i2);

    void setPreloadParentTileLevel(int i);

    void setRenderFps(int i);

    void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode);

    void setRestrictBounds(LatLngBounds latLngBounds, RestrictBoundsFitMode restrictBoundsFitMode, boolean z);

    @Deprecated
    void setRoadBackgroundColor(int i);

    @Deprecated
    void setRoadCasingColor(int i);

    void setRoadCrossingID(String str);

    void setTileCacheRatio(String str, float f);

    void setTileCacheType(String str, TileCacheType tileCacheType);

    void setTrafficEnabled(boolean z);

    void setTrafficStyle(TrafficStyle trafficStyle);

    @Deprecated
    void setViewInfoWindowEnabled(boolean z);

    @Deprecated
    void setWeatherIntensity(float f);

    @Deprecated
    void setWeatherType(@NonNull WeatherType weatherType);

    void setZoomMode(@NonNull ac acVar);

    void show3dBuilding(boolean z);

    void showBlockedRoad(boolean z);

    void showTrafficLight(boolean z);

    void stopAnimation();

    float toOpenGLWidth(int i);
}
