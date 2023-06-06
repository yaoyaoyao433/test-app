package com.sankuai.meituan.mapsdk.core.render;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.meituan.mtmap.rendersdk.DynamicMapObserver;
import com.meituan.mtmap.rendersdk.IndoorBuildingsObserver;
import com.meituan.mtmap.rendersdk.QueryObserver;
import com.meituan.mtmap.rendersdk.style.layer.CustomLayer;
import com.sankuai.meituan.mapsdk.core.render.annotation.RunInRenderThread;
import com.sankuai.meituan.mapsdk.core.render.annotation.RunInUIThread;
import com.sankuai.meituan.mapsdk.core.render.model.c;
import com.sankuai.meituan.mapsdk.core.render.model.g;
import com.sankuai.meituan.mapsdk.core.render.model.i;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import com.sankuai.meituan.mapsdk.maps.model.TileCacheType;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a {
    double a(double d);

    double a(double d, double d2);

    PointF a();

    @Nullable
    LatLng a(PointD pointD);

    PointD a(LatLng latLng);

    String a(String str);

    void a(int i);

    void a(PointF pointF, boolean z);

    @RunInRenderThread
    void a(IndoorBuildingsObserver indoorBuildingsObserver);

    void a(QueryObserver queryObserver);

    void a(CameraPosition cameraPosition, int i);

    void a(@Nullable LatLngBounds latLngBounds);

    void a(String str, float f);

    void a(boolean z);

    @RunInUIThread
    void addDynamicMapGeoJSON(String str, String str2, String str3);

    @RunInUIThread
    void addDynamicMapGeoJSONWithSize(String str, String str2, String str3, int i);

    @RunInUIThread
    void addFeatureProperty(long j, int i, String str, double d);

    @RunInUIThread
    void addFeatureProperty(long j, int i, String str, String str2);

    @RunInUIThread
    void addFeatureProperty(long j, int i, String str, boolean z);

    @RunInUIThread
    void addFeatureProperty(long j, int i, String str, double[] dArr);

    @RunInUIThread
    void addGeoJsonSource(long j);

    @RunInUIThread
    void addHighlightBuilding(long j);

    @RunInUIThread
    void addImage(String str, Bitmap bitmap);

    @RunInUIThread
    void addImageSource(long j);

    @RunInUIThread
    void addLayer(long j);

    @RunInUIThread
    void addLayer(CustomLayer customLayer);

    @RunInUIThread
    void addRasterSource(long j);

    @RunInUIThread
    void addStyleUrl(String str, String str2);

    @RunInUIThread
    void applyColorStyle(String str, boolean z);

    @RunInUIThread
    void applyMapStyle(String str, boolean z);

    @RunInUIThread
    void applyMapStyleFromBuffer(String str);

    double b(double d);

    int b();

    String b(int i);

    double c(double d);

    int c();

    void c(int i);

    @Nullable
    @RunInUIThread
    CameraPosition cameraForLatLngBounds(LatLngBounds latLngBounds, int[] iArr, boolean z);

    @RunInUIThread
    void cancelAnimation();

    @RunInUIThread
    void clearMapCache();

    @RunInUIThread
    long copyLayer(long j, String str, String str2);

    @RunInUIThread
    long createAndAddArrow(float f);

    @RunInUIThread
    void createDynamicMap(String str);

    @RunInUIThread
    void createDynamicMap(String str, String str2);

    @RunInUIThread
    long createGeoJsonSource(String str, boolean z, i iVar);

    @RunInUIThread
    long createGeoJsonSource(String str, boolean z, i iVar, double d, boolean z2);

    @RunInUIThread
    long createImageSource(String str, LatLng[] latLngArr);

    @RunInUIThread
    long createLayer(String str, String str2);

    @RunInUIThread
    int createOrSetScreenImage(int i, float[] fArr, String str, float[] fArr2, float[] fArr3, float[] fArr4);

    @RunInUIThread
    long createRasterSource(String str, String str2, int i);

    @RunInUIThread
    void createRoadCrossing(String str);

    @RunInRenderThread
    void d();

    void d(double d);

    void d(int i);

    @RunInUIThread
    void destroy();

    @RunInUIThread
    void destroyDynamicMap(String str);

    @RunInUIThread
    void destroyFeatures(long j);

    @RunInUIThread
    void destroyRoadCrossing();

    @RunInUIThread
    void disableWeather();

    void e();

    void e(double d);

    @RunInUIThread
    void enableEventListener();

    int f();

    @RunInUIThread
    String funcCallRecordList();

    @Nullable
    @RunInRenderThread
    Bitmap g();

    @RunInUIThread
    double getBearing();

    @Nullable
    @RunInUIThread
    LatLng getCenter();

    @RunInUIThread
    boolean getFeatureBooleanProperty(long j, int i, String str);

    @RunInUIThread
    double getFeatureDoubleProperty(long j, int i, String str);

    @RunInUIThread
    long getFeatureLongProperty(long j, int i, String str);

    @RunInUIThread
    int getFeatureNum(long j);

    @RunInUIThread
    int getFeaturePropertyType(long j, int i, String str);

    @RunInUIThread
    String getFeatureStringProperty(long j, int i, String str);

    @RunInUIThread
    c getFeatureType(long j, int i);

    @RunInUIThread
    double[] getHexagonBoundsByLatLng(double d, double d2, double d3, double d4);

    @Nullable
    @RunInUIThread
    LatLng getLatLngByScreenCoordinate(PointF pointF);

    @Nullable
    @RunInUIThread
    Bitmap getMapPartialScreenShot(int i, int i2, int i3, int i4);

    @RunInUIThread
    double getMaxPitch();

    @RunInUIThread
    double getMinPitch();

    @RunInUIThread
    double getPitch();

    @RunInUIThread
    long getRenderFrameNum();

    @RunInUIThread
    Point getScreenCoordinateByLatLng(LatLng latLng);

    @Nullable
    @RunInUIThread
    Point[] getScreenCoordinateByLatLngAndCamera(LatLng[] latLngArr, CameraPosition cameraPosition);

    @RunInUIThread
    double getZoom();

    CameraPosition h();

    @Nullable
    @RunInUIThread
    LatLngBounds latLngBoundsForCamera(CameraPosition cameraPosition);

    @RunInUIThread
    void moveBy(PointF pointF, int i);

    @RunInUIThread
    long queryRenderedFeaturesByOrder(int i, int i2, int i3, int i4);

    @RunInUIThread
    int queryScreenUi(float f, float f2);

    @RunInUIThread
    void recordDynamicMap(String str, long j);

    @RunInUIThread
    void refImages(long j, List<String> list);

    @RunInUIThread
    void removeAndDestroyArrow(long j);

    @RunInUIThread
    void removeAndDestroyGeoJsonSource(long j);

    @RunInUIThread
    void removeAndDestroyImageSource(long j);

    @RunInUIThread
    void removeAndDestroyLayer(long j);

    @RunInUIThread
    void removeAndDestroyRasterSource(long j);

    @RunInUIThread
    void removeDynamicMapFeature(String str, String str2, long j);

    @RunInUIThread
    void removeDynamicMapGeoJSON(String str, String str2);

    @RunInUIThread
    void removeFeature(long j, int i);

    @RunInUIThread
    void removeHighlightBuilding();

    @RunInUIThread
    void removeHighlightBuilding(long j);

    @RunInUIThread
    void removeImage(String str);

    @RunInUIThread
    @Deprecated
    void removeLayer(String str);

    @RunInUIThread
    void removeScreenImage(int i);

    @RunInUIThread
    void resetDynamicMapFeature(String str, String str2, long j);

    @RunInUIThread
    void resetDynamicMapFeatures(String str);

    @RunInUIThread
    void setArrowFeature(long j, int i, List<LatLng> list);

    @RunInUIThread
    void setArrowFeatureNum(long j, int i);

    @RunInUIThread
    void setArrowLayerMaxZoom(long j, float f);

    @RunInUIThread
    void setArrowLayerMinZoom(long j, float f);

    @RunInUIThread
    void setArrowLayerOrder(long j, float f, int i);

    @RunInUIThread
    void setArrowLayerProperty(long j, int i, float f);

    @RunInUIThread
    void setArrowLayerProperty(long j, int i, int i2);

    @RunInUIThread
    void setArrowLayerProperty(long j, int i, float[] fArr);

    @RunInUIThread
    void setArrowLayerVisibility(long j, boolean z);

    @RunInUIThread
    void setArrowWidth(long j, float f);

    @RunInUIThread
    void setAutoMergePropertyKey(long j, String str);

    @RunInUIThread
    void setCameraEyeParams(String str);

    @RunInUIThread
    void setCameraPosition(CameraPosition cameraPosition, float[] fArr, int i);

    @RunInUIThread
    void setCoordinateToImageSource(long j, LatLng[] latLngArr);

    @RunInUIThread
    void setDebugTileBorder(boolean z);

    @RunInUIThread
    @Deprecated
    void setDynamicMapFeature(String str, long j, String str2, String str3);

    @RunInUIThread
    void setDynamicMapFeature(String str, String str2, long j, String str3, String str4);

    @RunInUIThread
    void setDynamicMapImages(String str, List<String> list);

    @RunInUIThread
    void setFeatureGeometry(long j, int i, c cVar, LatLng latLng);

    @RunInUIThread
    void setFeatureGeometry(long j, int i, c cVar, List<LatLng> list);

    @RunInUIThread
    void setFeatureMultiGeometry(long j, int i, c cVar, List<List<LatLng>> list);

    @RunInUIThread
    void setFeatureNum(long j, int i);

    @RunInUIThread
    void setGeoJsonSourceThreadMode(long j, i iVar);

    @RunInUIThread
    void setImageToImageSource(long j, Bitmap bitmap);

    @RunInUIThread
    void setIndoor(boolean z);

    @RunInUIThread
    void setIndoorFloor(long j, String str, int i);

    @RunInUIThread
    void setIndoorMask(boolean z);

    @RunInUIThread
    void setIndoorMaskColor(int i);

    void setIndoorQueryBox(float f, float f2, float f3, float f4);

    @RunInUIThread
    void setLayerInteractive(long j, boolean z);

    @RunInUIThread
    void setLayerMaxZoom(long j, float f);

    @RunInUIThread
    void setLayerMinZoom(long j, float f);

    @RunInUIThread
    void setLayerOrder(long j, float f, g gVar);

    @RunInUIThread
    void setLayerProperties(long j, String str);

    @RunInUIThread
    void setLayerProperty(long j, int i, float f);

    @RunInUIThread
    void setLayerProperty(long j, int i, float f, String str);

    @RunInUIThread
    void setLayerProperty(long j, int i, int i2);

    @RunInUIThread
    void setLayerProperty(long j, int i, int i2, String str);

    @RunInUIThread
    void setLayerProperty(long j, int i, String str);

    @RunInUIThread
    void setLayerProperty(long j, int i, String str, String str2);

    @RunInUIThread
    void setLayerProperty(long j, int i, boolean z);

    @RunInUIThread
    void setLayerProperty(long j, int i, boolean z, String str);

    @RunInUIThread
    void setLayerProperty(long j, int i, float[] fArr);

    @RunInUIThread
    void setLayerProperty(long j, int i, float[] fArr, String str);

    @RunInUIThread
    void setLayerPropertyByDataDriven(long j, int i, String str);

    @RunInUIThread
    void setLayerPropertyByDataDriven(long j, int i, String str, String str2);

    @RunInUIThread
    void setLayerVisibility(long j, boolean z);

    @RunInUIThread
    void setMapSize(int i, int i2);

    @RunInUIThread
    void setMaxFps(int i);

    @RunInUIThread
    void setOnDynamicMapObserver(String str, DynamicMapObserver dynamicMapObserver);

    @RunInUIThread
    void setPause(boolean z);

    @RunInUIThread
    void setRasterForeign(boolean z);

    @RunInUIThread
    void setRoadBlock(boolean z);

    @RunInUIThread
    void setRoadCrossingID(String str);

    @RunInUIThread
    void setRoadTraffic(boolean z);

    @RunInUIThread
    void setSourceLayer(long j, String str);

    @RunInUIThread
    void setTileCacheType(String str, TileCacheType tileCacheType);

    @RunInUIThread
    void setTrafficColor(int i, int i2);

    @RunInUIThread
    void setTrafficStyle(String str);

    @RunInUIThread
    void setWeatherAutoUpdate(boolean z);

    @RunInUIThread
    void setWeatherIntensity(float f);

    @RunInUIThread
    void setWeatherType(int i);

    @RunInUIThread
    void show3dBuilding(boolean z);

    @RunInUIThread
    void showRoadStyle(boolean z);

    @RunInUIThread
    void showTrafficLight(boolean z);
}
