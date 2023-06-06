package com.sankuai.meituan.mapsdk.maps.model;

import android.graphics.Point;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.s;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Projection implements s {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final s a;

    public Projection(@NonNull s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5498cb86411f7d371e6609294a0af9f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5498cb86411f7d371e6609294a0af9f7");
        } else {
            this.a = sVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public VisibleRegion getVisibleRegion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6593efbd9bb33453021859520a1bf8d5", RobustBitConfig.DEFAULT_VALUE) ? (VisibleRegion) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6593efbd9bb33453021859520a1bf8d5") : this.a.getVisibleRegion();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public Point toScreenLocation(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6f4963b31f53c9b41613fef52048825", RobustBitConfig.DEFAULT_VALUE) ? (Point) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6f4963b31f53c9b41613fef52048825") : this.a.toScreenLocation(latLng);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public Point[] toScreenLocationByCameraPosition(LatLng[] latLngArr, CameraPosition cameraPosition) {
        Object[] objArr = {latLngArr, cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "644b12a29f0c924346dd3e4f5d21551f", RobustBitConfig.DEFAULT_VALUE) ? (Point[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "644b12a29f0c924346dd3e4f5d21551f") : this.a.toScreenLocationByCameraPosition(latLngArr, cameraPosition);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public LatLng fromScreenLocation(Point point) {
        Object[] objArr = {point};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02f155e7e123e76ef7619925a9690bd9", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02f155e7e123e76ef7619925a9690bd9") : this.a.fromScreenLocation(point);
    }

    public s getIProjection() {
        return this.a;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public PointF toOpenGLLocation(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f8c5a44dc9beed1564d812242f7e4a1", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f8c5a44dc9beed1564d812242f7e4a1") : this.a.toOpenGLLocation(latLng);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public PointD toProjectedMetersForLatLng(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86b287eacc06fd549a7e8ed867e33769", RobustBitConfig.DEFAULT_VALUE) ? (PointD) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86b287eacc06fd549a7e8ed867e33769") : this.a.toProjectedMetersForLatLng(latLng);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public LatLng fromProjectedMeters(PointD pointD) {
        Object[] objArr = {pointD};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd881d8c4a719ca077fd0b2caf534b08", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd881d8c4a719ca077fd0b2caf534b08") : this.a.fromProjectedMeters(pointD);
    }

    @Deprecated
    public PointF[] toScreenLocation(LatLng[] latLngArr, CameraPosition cameraPosition) {
        Object[] objArr = {latLngArr, cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "198d8a093ae5f42dc695063b211698ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "198d8a093ae5f42dc695063b211698ea");
        }
        Point[] screenLocationByCameraPosition = toScreenLocationByCameraPosition(latLngArr, cameraPosition);
        PointF[] pointFArr = new PointF[screenLocationByCameraPosition.length];
        for (int i = 0; i < pointFArr.length; i++) {
            pointFArr[i] = new PointF(screenLocationByCameraPosition[i].x, screenLocationByCameraPosition[i].y);
        }
        return pointFArr;
    }
}
