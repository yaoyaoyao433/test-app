package com.sankuai.meituan.mapsdk.mapcore.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static final e b = new e(4.0074155889191404E7d);
    public final double c;

    private e(double d) {
        Object[] objArr = {Double.valueOf(4.0074155889191404E7d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e278cc3c3c14b20a019cf708a692e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e278cc3c3c14b20a019cf708a692e7");
        } else {
            this.c = 4.0074155889191404E7d;
        }
    }

    public final LatLng a(PointD pointD) {
        Object[] objArr = {pointD};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75551b94a5e03fd706939d2b717d382", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75551b94a5e03fd706939d2b717d382");
        }
        if (pointD == null) {
            return null;
        }
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (pointD.y / this.c))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((pointD.x / this.c) - 0.5d) * 360.0d);
    }

    public final PointD a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd3408a1f046e5ee218182a377357f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointD) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd3408a1f046e5ee218182a377357f4");
        }
        if (latLng == null) {
            return null;
        }
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        return new PointD(((latLng.longitude / 360.0d) + 0.5d) * this.c, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * this.c);
    }
}
