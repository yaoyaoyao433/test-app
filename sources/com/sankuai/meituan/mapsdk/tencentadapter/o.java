package com.sankuai.meituan.mapsdk.tencentadapter;

import android.graphics.Point;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import com.sankuai.meituan.mapsdk.maps.model.VisibleRegion;
import com.tencent.tencentmap.mapsdk.maps.Projection;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o implements com.sankuai.meituan.mapsdk.maps.interfaces.s {
    public static ChangeQuickRedirect a;
    private Projection b;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    @Nullable
    public final LatLng fromProjectedMeters(PointD pointD) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final PointF toOpenGLLocation(LatLng latLng) {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    @Nullable
    public final PointD toProjectedMetersForLatLng(LatLng latLng) {
        return null;
    }

    public o(@NonNull Projection projection) {
        Object[] objArr = {projection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fe22711a7db85c35a75c78e6e1d2085", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fe22711a7db85c35a75c78e6e1d2085");
        } else {
            this.b = projection;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final VisibleRegion getVisibleRegion() {
        com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion visibleRegion;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08b478c8b5a589540b09515a6bba601", RobustBitConfig.DEFAULT_VALUE)) {
            return (VisibleRegion) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08b478c8b5a589540b09515a6bba601");
        }
        if (this.b == null || (visibleRegion = this.b.getVisibleRegion()) == null) {
            return null;
        }
        return new VisibleRegion(new t(visibleRegion));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final Point toScreenLocation(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5e61fb379ff33a42432e8da7d6b7ed6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5e61fb379ff33a42432e8da7d6b7ed6");
        }
        if (latLng == null || this.b == null) {
            return null;
        }
        try {
            return this.b.toScreenLocation(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final Point[] toScreenLocationByCameraPosition(LatLng[] latLngArr, CameraPosition cameraPosition) {
        return new Point[0];
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final LatLng fromScreenLocation(Point point) {
        Object[] objArr = {point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c6df8e618267d713f8c2135b83ef83", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c6df8e618267d713f8c2135b83ef83");
        }
        if (point == null || this.b == null) {
            return null;
        }
        try {
            return b.a(this.b.fromScreenLocation(point));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
