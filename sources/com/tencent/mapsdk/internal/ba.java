package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.ViewGroup;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.bh;
import com.tencent.mapsdk.internal.sx;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ba extends MapDelegate<mn, VectorMap, bu>, es, oe, sx.m, TencentMap.OnIndoorStateChangeListener {
    public static final int a = 0;
    public static final int b = 1;

    boolean A();

    boolean B();

    nr C();

    void D();

    void E();

    void F();

    Context G();

    void H();

    @Deprecated
    boolean I();

    boolean J();

    TencentMapOptions K();

    ViewGroup L();

    pn M();

    boolean N();

    CameraPosition a();

    void a(float f);

    void a(float f, float f2, float f3);

    void a(int i);

    void a(int i, int i2);

    void a(Handler handler, Bitmap.Config config, int i);

    void a(bc bcVar);

    void a(bh.a aVar);

    void a(et etVar);

    void a(ez ezVar);

    void a(ff ffVar);

    void a(nr nrVar, le leVar);

    void a(nw nwVar);

    void a(pw pwVar);

    void a(rg rgVar);

    void a(TencentMap.OnCameraChangeListener onCameraChangeListener);

    void a(TencentMap.OnDismissCallback onDismissCallback);

    void a(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener);

    void a(TencentMap.OnMapPoiClickListener onMapPoiClickListener);

    void a(TencentMapOptions tencentMapOptions);

    void a(OverSeaTileProvider overSeaTileProvider);

    void a(TencentMapGestureListener tencentMapGestureListener);

    void a(String str);

    void a(boolean z);

    boolean a(float f, float f2);

    mn b();

    void b(int i, int i2);

    void b(et etVar);

    void b(ez ezVar);

    void b(TencentMapGestureListener tencentMapGestureListener);

    void b(String str);

    void b(boolean z);

    boolean b(float f, float f2);

    mm c();

    or c(String str);

    String c(float f, float f2);

    void c(int i, int i2);

    void c(boolean z);

    rl d();

    void d(int i, int i2);

    void d(boolean z);

    boolean d(float f, float f2);

    boolean d(String str);

    String e();

    void e(boolean z);

    boolean e(float f, float f2);

    void f(boolean z);

    boolean f();

    void g(boolean z);

    boolean g();

    @Override // com.tencent.mapsdk.internal.oe
    int getEGLContextHash();

    void h(boolean z);

    boolean h();

    void i(boolean z);

    boolean i();

    void j(boolean z);

    boolean j();

    void k();

    void k(boolean z);

    void l();

    void l(boolean z);

    void m();

    void n();

    boolean o();

    boolean p();

    pw q();

    ab r();

    GeoPoint s();

    int t();

    int u();

    int v();

    int w();

    boolean x();

    void y();

    void z();
}
