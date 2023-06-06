package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.area.a;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LatLngFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static LatLng newLatLng(double d, double d2, int i) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ed0a860937e80779572da423275f6c8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ed0a860937e80779572da423275f6c8d");
        }
        LatLng latLng = new LatLng(d, d2);
        int a = a.a(latLng);
        if (i == 2 && a == 0) {
            double[] wgs84togcj02 = CoordinateConverter.wgs84togcj02(d2, d);
            return new LatLng(wgs84togcj02[1], wgs84togcj02[0]);
        } else if (i != 1 || a == 0) {
            return latLng;
        } else {
            double[] gcj02towgs84 = CoordinateConverter.gcj02towgs84(d2, d);
            return new LatLng(gcj02towgs84[1], gcj02towgs84[0]);
        }
    }
}
