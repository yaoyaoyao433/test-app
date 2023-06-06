package com.tencent.mapsdk.navi;

import android.content.Context;
import android.support.annotation.Keep;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.bu;
import com.tencent.mapsdk.internal.mn;
import com.tencent.mapsdk.internal.rv;
import com.tencent.mapsdk.internal.rw;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class VectorMapNaviDelegateProxy implements MapDelegate<mn, rv, bu> {
    private rw mMapDelegate;

    @Keep
    public VectorMapNaviDelegateProxy(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        this.mMapDelegate = new rw(context, tencentMapOptions, viewGroup);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public bu createMapView(mn mnVar, ViewGroup viewGroup) {
        return this.mMapDelegate.a((rw) mnVar, viewGroup);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public rv createMap(mn mnVar) {
        return (rv) this.mMapDelegate.a((rw) mnVar);
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
        this.mMapDelegate.onSizeChanged(i, i2, i3, i4);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSurfaceChanged(Object obj, int i, int i2) {
        this.mMapDelegate.onSurfaceChanged(obj, i, i2);
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
        this.mMapDelegate.onCreated();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStart() {
        this.mMapDelegate.onStart();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        this.mMapDelegate.onResume();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onPause() {
        this.mMapDelegate.onPause();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onRestart() {
        this.mMapDelegate.onRestart();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStop() {
        this.mMapDelegate.onStop();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        this.mMapDelegate.onDestroy();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onUpdateOptions(TencentMapOptions tencentMapOptions) {
        this.mMapDelegate.onUpdateOptions(tencentMapOptions);
    }
}
