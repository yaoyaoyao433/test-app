package com.tencent.mapsdk.vector;

import android.content.Context;
import android.support.annotation.Keep;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.bu;
import com.tencent.mapsdk.internal.km;
import com.tencent.mapsdk.internal.kn;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.so;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class VectorMapDelegateProxy implements MapDelegate<mn, VectorMap, bu> {
    private so mMapDelegate;

    @Keep
    public VectorMapDelegateProxy(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        this.mMapDelegate = new so(context, tencentMapOptions, viewGroup);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public bu createMapView(mn mnVar, ViewGroup viewGroup) {
        return this.mMapDelegate.a((so) mnVar, viewGroup);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public VectorMap createMap(mn mnVar) {
        return this.mMapDelegate.a((so) mnVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.mapsdk.core.MapDelegate
    public mn getMapContext() {
        return (mn) this.mMapDelegate.d_;
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public bu getMapRenderView() {
        return this.mMapDelegate.getMapRenderView();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public TencentMap getMap() {
        return this.mMapDelegate.e_;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean isTouchable() {
        return this.mMapDelegate.isTouchable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mMapDelegate.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void setOnTop(boolean z) {
        this.mMapDelegate.setOnTop(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        kn.b(km.H);
        this.mMapDelegate.onSizeChanged(i, i2, i3, i4);
        kn.d(km.H);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSurfaceChanged(Object obj, int i, int i2) {
        kn.b(km.I);
        kn.a(km.I, "width", Integer.valueOf(i));
        kn.a(km.I, "height", Integer.valueOf(i2));
        this.mMapDelegate.onSurfaceChanged(obj, i, i2);
        kn.d(km.I);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void setOpaque(boolean z) {
        this.mMapDelegate.setOpaque(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean isOpaque() {
        return this.mMapDelegate.isOpaque();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onCreated() {
        kn.b(km.z);
        this.mMapDelegate.onCreated();
        kn.d(km.z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStart() {
        kn.b(km.A);
        this.mMapDelegate.onStart();
        kn.d(km.A);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        kn.b(km.B);
        this.mMapDelegate.onResume();
        kn.d(km.B);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onPause() {
        kn.b(km.C);
        this.mMapDelegate.onPause();
        kn.d(km.C);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onRestart() {
        kn.b(km.D);
        this.mMapDelegate.onRestart();
        kn.d(km.D);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStop() {
        kn.b(km.E);
        this.mMapDelegate.onStop();
        kn.d(km.E);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        kn.b(km.F);
        this.mMapDelegate.onDestroy();
        kn.d(km.F);
        kn.d(km.W);
        kn.a();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onUpdateOptions(TencentMapOptions tencentMapOptions) {
        kn.b(km.G);
        this.mMapDelegate.onUpdateOptions(tencentMapOptions);
        kn.d(km.G);
    }
}
