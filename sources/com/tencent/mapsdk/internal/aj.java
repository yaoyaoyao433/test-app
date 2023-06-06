package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface aj {
    int A();

    float a(int i, int i2, int i3, int i4, LatLng latLng, LatLng latLng2, LatLng latLng3);

    float a(LatLng latLng, LatLng latLng2);

    float a(LatLng latLng, LatLng latLng2, float f, int i, int i2, int i3, int i4, boolean z);

    float a(LatLng latLng, LatLng latLng2, float f, int i, boolean z);

    float a(LatLngBounds latLngBounds, float f, int i, boolean z);

    int a(CameraUpdate cameraUpdate);

    int a(CameraUpdate cameraUpdate, long j, TencentMap.CancelableCallback cancelableCallback);

    CameraPosition a();

    CameraPosition a(List<er> list, List<LatLng> list2, int i, int i2, int i3, int i4);

    CameraPosition a(List<er> list, List<LatLng> list2, int i, int i2, int i3, int i4, TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback);

    CustomLayer a(CustomLayerOptions customLayerOptions);

    TileOverlay a(TileOverlayOptions tileOverlayOptions);

    String a(LatLng latLng);

    List<Rect> a(List<String> list);

    void a(float f, float f2);

    void a(float f, float f2, boolean z);

    void a(int i);

    void a(int i, int i2);

    void a(Handler handler, Bitmap.Config config, int i);

    void a(fa faVar);

    void a(TencentMap.OnCameraChangeListener onCameraChangeListener);

    void a(TencentMap.OnCompassClickedListener onCompassClickedListener);

    void a(TencentMap.OnDismissCallback onDismissCallback);

    void a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener);

    void a(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener);

    void a(TencentMap.OnMapClickListener onMapClickListener);

    void a(TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    void a(TencentMap.OnMapLongClickListener onMapLongClickListener);

    void a(TencentMap.OnMapPoiClickListener onMapPoiClickListener);

    void a(TencentMap.OnMarkerClickListener onMarkerClickListener);

    void a(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener);

    void a(Language language);

    void a(LatLng latLng, float f, float f2);

    void a(LatLng latLng, float f, float f2, float f3);

    void a(LatLng latLng, float f, float f2, float f3, boolean z);

    void a(LatLngBounds latLngBounds, int i);

    void a(TencentMapGestureListener tencentMapGestureListener);

    void a(String str);

    void a(String str, String str2);

    void a(List<MapRouteSection> list, List<LatLng> list2);

    void a(boolean z);

    float b();

    int b(String str);

    void b(float f, float f2);

    void b(int i);

    void b(fa faVar);

    void b(TencentMap.OnCameraChangeListener onCameraChangeListener);

    void b(TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    void b(Language language);

    void b(TencentMapGestureListener tencentMapGestureListener);

    void b(boolean z);

    float c();

    void c(int i);

    void c(boolean z);

    void d();

    void d(int i);

    void d(boolean z);

    void e();

    void e(int i);

    void e(boolean z);

    int f();

    void f(int i);

    void f(boolean z);

    int g();

    void g(boolean z);

    void h(boolean z);

    boolean h();

    void i();

    void i(boolean z);

    void j();

    void k();

    void l();

    void m();

    void n();

    String o();

    Language p();

    void q();

    int r();

    String[] s();

    String t();

    IndoorBuilding u();

    String v();

    boolean w();

    boolean x();

    ArrayList<MapPoi> y();

    String z();
}
