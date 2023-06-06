package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;
import com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class aa {
    public static final int a = 0;
    public aj b;
    public TencentMap.SnapshotReadyCallback c = null;
    public Handler d = new Handler(Looper.getMainLooper()) { // from class: com.tencent.mapsdk.internal.aa.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message == null || message.what != 0) {
                return;
            }
            if (aa.this.c != null) {
                aa.this.c.onSnapshotReady((Bitmap) message.obj);
            }
            aa.this.c = null;
        }
    };

    private static /* synthetic */ TencentMap.SnapshotReadyCallback b(aa aaVar) {
        aaVar.c = null;
        return null;
    }

    public aa(aj ajVar) {
        this.b = null;
        this.b = ajVar;
    }

    private void c() {
        if (this.b != null) {
            this.b = null;
        }
    }

    public final CameraPosition a() {
        if (this.b == null) {
            return null;
        }
        return this.b.a();
    }

    private float d() {
        if (this.b == null) {
            return -1.0f;
        }
        return this.b.b();
    }

    private void a(int i) {
        if (this.b == null) {
            return;
        }
        this.b.d(i);
    }

    private float e() {
        if (this.b == null) {
            return -1.0f;
        }
        return this.b.c();
    }

    private void b(int i) {
        if (this.b == null) {
            return;
        }
        this.b.e(i);
    }

    public final int a(CameraUpdate cameraUpdate) {
        if (this.b == null) {
            return Integer.MIN_VALUE;
        }
        return this.b.a(cameraUpdate);
    }

    public final int a(CameraUpdate cameraUpdate, long j, TencentMap.CancelableCallback cancelableCallback) {
        if (this.b == null) {
            return Integer.MIN_VALUE;
        }
        return this.b.a(cameraUpdate, j, cancelableCallback);
    }

    private void f() {
        if (this.b == null) {
        }
    }

    private float a(LatLng latLng, LatLng latLng2) {
        if (this.b == null) {
            return -1.0f;
        }
        return this.b.a(latLng, latLng2);
    }

    private void g() {
        if (this.b == null) {
            return;
        }
        this.b.d();
    }

    private void c(int i) {
        if (this.b == null) {
            return;
        }
        this.b.f(i);
    }

    private int h() {
        if (this.b == null) {
            return 1000;
        }
        return this.b.A();
    }

    private void d(int i) {
        if (this.b == null) {
            return;
        }
        this.b.a(i);
    }

    private int i() {
        if (this.b == null) {
            return -1;
        }
        return this.b.f();
    }

    private void a(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.a(z);
    }

    private boolean j() {
        if (this.b == null) {
            return false;
        }
        return this.b.h();
    }

    private void a(TencentMap.OnMapClickListener onMapClickListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(onMapClickListener);
    }

    private void a(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(onMapLongClickListener);
    }

    private void a(TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(onCameraChangeListener);
    }

    private void k() {
        if (this.b == null) {
        }
    }

    private void l() {
        if (this.b == null) {
            return;
        }
        this.b.j();
    }

    private void m() {
        if (this.b == null) {
        }
    }

    private void n() {
        if (this.b == null) {
        }
    }

    private void o() {
        if (this.b == null) {
            return;
        }
        this.b.n();
    }

    private void p() {
        if (this.b == null) {
            return;
        }
        this.b.m();
    }

    private void a(Handler handler, Bitmap.Config config, int i) {
        if (this.b == null) {
            return;
        }
        this.b.a(handler, config, i);
    }

    private void a(TencentMap.SnapshotReadyCallback snapshotReadyCallback, Bitmap.Config config, int i) {
        if (this.b == null || snapshotReadyCallback == null) {
            return;
        }
        this.c = snapshotReadyCallback;
        Handler handler = this.d;
        if (this.b != null) {
            this.b.a(handler, config, i);
        }
    }

    private String a(LatLng latLng) {
        if (this.b == null) {
            return null;
        }
        return this.b.a(latLng);
    }

    private void a(TencentMapGestureListener tencentMapGestureListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(tencentMapGestureListener);
    }

    private void b(TencentMapGestureListener tencentMapGestureListener) {
        if (this.b == null) {
            return;
        }
        this.b.b(tencentMapGestureListener);
    }

    private void b(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.b(z);
    }

    private void e(int i) {
        if (this.b == null) {
            return;
        }
        this.b.b(i);
    }

    private void a(int i, int i2) {
        if (this.b == null) {
            return;
        }
        this.b.a(i, i2);
    }

    private CameraPosition a(List<er> list, List<LatLng> list2, int i, int i2, int i3, int i4) {
        if (this.b == null) {
            return null;
        }
        return this.b.a(list, list2, i, i2, i3, i4);
    }

    private void a(float f, float f2, boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.a(f, f2, z);
    }

    private String q() {
        return this.b == null ? "" : this.b.o();
    }

    private void a(TencentMap.OnCompassClickedListener onCompassClickedListener) {
        if (this.b != null) {
            this.b.a(onCompassClickedListener);
        }
    }

    private void a(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        if (this.b != null) {
            this.b.a(onMapLoadedCallback);
        }
    }

    private void b(TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        if (this.b != null) {
            this.b.b(onMapLoadedCallback);
        }
    }

    private void a(Language language) {
        if (this.b != null) {
            this.b.a(language);
        }
    }

    private Language r() {
        if (this.b != null) {
            return this.b.p();
        }
        return Language.zh;
    }

    private void a(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(onMarkerClickListener);
    }

    private void a(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(onInfoWindowClickListener);
    }

    private void a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(onIndoorStateChangeListener);
    }

    private void c(boolean z) {
        if (this.b != null) {
            this.b.c(z);
        }
    }

    private void f(int i) {
        if (this.b != null) {
            this.b.c(i);
        }
    }

    private int s() {
        if (this.b != null) {
            return this.b.r();
        }
        return -1;
    }

    private String[] t() {
        if (this.b != null) {
            return this.b.s();
        }
        return null;
    }

    @Deprecated
    private String b(LatLng latLng) {
        IndoorBuilding u;
        if (this.b == null || (u = this.b.u()) == null) {
            return null;
        }
        if (u.getBuildingLatLng() != null && latLng != null) {
            latLng.latitude = u.getBuildingLatLng().latitude;
            latLng.longitude = u.getBuildingLatLng().longitude;
        }
        return u.getBuildingName();
    }

    private void a(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(onMapPoiClickListener);
    }

    private void a(String str) {
        if (this.b == null) {
            return;
        }
        this.b.a(str);
    }

    private void d(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.e(z);
    }

    private boolean u() {
        if (this.b == null) {
            return false;
        }
        return this.b.w();
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.b.a(str, str2);
    }

    private void e(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.f(z);
    }

    private void f(boolean z) {
        if (this.b != null) {
            this.b.g(z);
        }
    }

    public final boolean b() {
        if (this.b != null) {
            return this.b.x();
        }
        return false;
    }

    private void g(boolean z) {
        if (this.b != null) {
            this.b.h(z);
        }
    }

    private void b(Language language) {
        if (this.b != null) {
            this.b.b(language);
        }
    }

    private int b(String str) {
        if (this.b == null || hb.a(str)) {
            return -1;
        }
        return this.b.b(str);
    }

    private String v() {
        if (this.b == null) {
            return null;
        }
        return this.b.z();
    }

    private TileOverlay a(TileOverlayOptions tileOverlayOptions) {
        if (this.b == null) {
            return null;
        }
        return this.b.a(tileOverlayOptions);
    }

    private CustomLayer a(CustomLayerOptions customLayerOptions) {
        if (this.b == null) {
            return null;
        }
        return this.b.a(customLayerOptions);
    }

    private void h(boolean z) {
        if (this.b == null) {
            return;
        }
        this.b.i(z);
    }

    private void a(LatLngBounds latLngBounds, int i) {
        if (this.b == null) {
            return;
        }
        this.b.a(latLngBounds, i);
    }

    private void a(TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        if (this.b == null) {
            return;
        }
        this.b.a(onTrafficEventClickListener);
    }
}
