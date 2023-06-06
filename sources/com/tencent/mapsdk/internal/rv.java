package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapNavi;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import com.tencent.tencentmap.mapsdk.maps.model.IOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rv extends VectorMap implements TencentMapNavi {
    public rv(mn mnVar) {
        super(mnVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void animateToNaviPosition(LatLng latLng, float f, float f2) {
        getMapPro().animateToNaviPosition(latLng, f, f2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void animateToNaviPosition(LatLng latLng, float f, float f2, float f3) {
        getMapPro().animateToNaviPosition(latLng, f, f2, f3);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void animateToNaviPosition(LatLng latLng, float f, float f2, float f3, boolean z) {
        getMapPro().animateToNaviPosition(latLng, f, f2, f3, z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void animateToNaviPosition2(LatLng latLng, float f, float f2, float f3, boolean z) {
        getMapPro().animateToNaviPosition2(latLng, f, f2, f3, z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final float calNaviLevel(LatLngBounds latLngBounds, float f, int i, boolean z) {
        return getMapPro().calNaviLevel(latLngBounds, f, i, z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final float calNaviLevel2(LatLng latLng, LatLng latLng2, float f, float f2, int i, boolean z) {
        return getMapPro().calNaviLevel2(latLng, latLng2, f, f2, i, z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final float calNaviLevel3(LatLng latLng, LatLng latLng2, float f, int i, int i2, int i3, int i4, boolean z) {
        return getMapPro().calNaviLevel3(latLng, latLng2, f, i, i2, i3, i4, z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setNaviFixingProportion(float f, float f2) {
        getMapPro().setNaviFixingProportion(f, f2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setNaviFixingProportion2D(float f, float f2) {
        getMapPro().setNaviFixingProportion2D(f, f2);
    }

    @Override // com.tencent.mapsdk.vector.VectorMap, com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void clearRouteNameSegments() {
        getMapPro().clearRouteNameSegments();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void moveToNavPosition(CameraUpdate cameraUpdate, LatLng latLng) {
        getMapPro().moveToNavPosition(cameraUpdate, latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final CameraPosition calculateZoomToSpanLevelAsync(List<IOverlay> list, List<LatLng> list2, int i, int i2, int i3, int i4, TencentMap.AsyncOperateCallback<CameraPosition> asyncOperateCallback) {
        return getMapPro().calculateZoomToSpanLevelAsync(list, list2, i, i2, i3, i4, asyncOperateCallback);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void addSegmentsWithRouteName(List<MapRouteSection> list, List<LatLng> list2) {
        getMapPro().addSegmentsWithRouteName(list, list2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setNavCenter(int i, int i2) {
        getMapPro().setNavCenter(i, i2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setNaviStateEnabled(boolean z) {
        getMapPro().setNaviStateEnabled(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final boolean isNaviStateEnabled() {
        return getMapPro().isNaviStateEnabled();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final void setOptionalResourcePath(String str) {
        getMapPro().setOptionalResourcePath(str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapNavi
    public final IntersectionOverlay addIntersectionEnlargeOverlay(IntersectionOverlayOptions intersectionOverlayOptions) {
        return getMapPro().addIntersectionEnlargeOverlay(intersectionOverlayOptions);
    }
}
