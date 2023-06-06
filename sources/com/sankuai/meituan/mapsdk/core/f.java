package com.sankuai.meituan.mapsdk.core;

import android.graphics.Point;
import android.graphics.PointF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import com.sankuai.meituan.mapsdk.maps.model.VisibleRegion;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements com.sankuai.meituan.mapsdk.core.interfaces.h {
    public static ChangeQuickRedirect a;
    private d b;

    public f(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa449dde36302f169d20916fde6c1f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa449dde36302f169d20916fde6c1f8");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final VisibleRegion getVisibleRegion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6850269ed61cccad1bdc368812909e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (VisibleRegion) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6850269ed61cccad1bdc368812909e1");
        }
        if (this.b.i) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ getVisibleRegion failed with destroyed map");
            return null;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        int b = this.b.d.b();
        int c = this.b.d.c();
        LatLng fromScreenLocation = fromScreenLocation(new Point(0, 0));
        LatLng fromScreenLocation2 = fromScreenLocation(new Point(b, 0));
        LatLng fromScreenLocation3 = fromScreenLocation(new Point(b, c));
        LatLng fromScreenLocation4 = fromScreenLocation(new Point(0, c));
        builder.include(fromScreenLocation).include(fromScreenLocation2).include(fromScreenLocation3).include(fromScreenLocation4);
        return new VisibleRegion(new k(fromScreenLocation, fromScreenLocation2, fromScreenLocation4, fromScreenLocation3, builder.build()));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final Point toScreenLocation(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d32e8751ea010f3ad09edbe4653ea9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d32e8751ea010f3ad09edbe4653ea9");
        }
        if (latLng == null || this.b.i) {
            return null;
        }
        return this.b.d.getScreenCoordinateByLatLng(latLng);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final Point[] toScreenLocationByCameraPosition(LatLng[] latLngArr, CameraPosition cameraPosition) {
        Object[] objArr = {latLngArr, cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08895bb13c63da1aa097187ea11c076d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08895bb13c63da1aa097187ea11c076d");
        }
        if (latLngArr == null || this.b.i) {
            return null;
        }
        Point[] screenCoordinateByLatLngAndCamera = this.b.d.getScreenCoordinateByLatLngAndCamera(latLngArr, cameraPosition);
        if (screenCoordinateByLatLngAndCamera == null) {
            screenCoordinateByLatLngAndCamera = new Point[latLngArr.length];
            for (int i = 0; i < latLngArr.length; i++) {
                screenCoordinateByLatLngAndCamera[i] = toScreenLocation(latLngArr[i]);
            }
        }
        return screenCoordinateByLatLngAndCamera;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final PointD toProjectedMetersForLatLng(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3082c951f47c5a55a45d928f613d5a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointD) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3082c951f47c5a55a45d928f613d5a0");
        }
        if (this.b.i) {
            return new PointD(0.0d, 0.0d);
        }
        PointD a2 = this.b.d.a(latLng);
        return new PointD(a2.x, 2.0037508342789244E7d - a2.y);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final PointF toOpenGLLocation(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab74e8c5f715d29f4d8dfdd77e22637", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab74e8c5f715d29f4d8dfdd77e22637");
        }
        if (this.b.i) {
            return new PointF(0.0f, 0.0f);
        }
        PointD a2 = this.b.d.a(latLng);
        PointF pointF = new PointF((float) a2.x, -((float) a2.y));
        synchronized (this.b.k) {
            if (this.b.l != null && this.b.l.c != null && this.b.l.c.eyePosition != null && this.b.l.c.eyePosition.length >= 2) {
                pointF.x = (float) (pointF.x - this.b.l.c.eyePosition[0]);
                pointF.y = (float) (pointF.y - this.b.l.c.eyePosition[1]);
            }
        }
        return pointF;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    public final LatLng fromScreenLocation(Point point) {
        Object[] objArr = {point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98cd5056271e9f998ea9060d5f6e747", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98cd5056271e9f998ea9060d5f6e747");
        }
        if (point == null || this.b.i) {
            return null;
        }
        return this.b.d.getLatLngByScreenCoordinate(new PointF(point.x, point.y));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.s
    @Nullable
    public final LatLng fromProjectedMeters(PointD pointD) {
        Object[] objArr = {pointD};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51beddeb5212ba1e376929d15853d061", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51beddeb5212ba1e376929d15853d061");
        }
        if (pointD == null || this.b.i) {
            return null;
        }
        try {
            return this.b.d.a(new PointD(pointD.x, 2.0037508342789244E7d - pointD.y));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.h
    public final double a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e18de43544f95408994d430f36e6494", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e18de43544f95408994d430f36e6494")).doubleValue();
        }
        if (this.b.i) {
            return 0.0d;
        }
        return this.b.d.a(d, d2);
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.h
    public final double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25053722bd238d720346f610306939a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25053722bd238d720346f610306939a2")).doubleValue();
        }
        if (this.b.i) {
            return 0.0d;
        }
        return this.b.d.c(d);
    }
}
