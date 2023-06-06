package com.sankuai.common.utils;

import android.graphics.PointF;
import android.location.Location;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MapUtils {
    private static final double EARTH_RADIUS = 6378137.0d;
    public static ChangeQuickRedirect changeQuickRedirect;

    private static double rad(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69bdceb7b97b375549595c16a4b070d8", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69bdceb7b97b375549595c16a4b070d8")).doubleValue() : (d * 3.141592653589793d) / 180.0d;
    }

    public static double getDistanceofPoint(Location location, Location location2) {
        Object[] objArr = {location, location2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8d568205af173322f7f73bfa74ef761", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8d568205af173322f7f73bfa74ef761")).doubleValue();
        }
        double rad = rad(location.getLatitude());
        double rad2 = rad(location2.getLatitude());
        return Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((rad - rad2) / 2.0d), 2.0d) + ((Math.cos(rad) * Math.cos(rad2)) * Math.pow(Math.sin((rad(location.getLongitude()) - rad(location2.getLongitude())) / 2.0d), 2.0d)))) * 2.0d) * EARTH_RADIUS) * 10000.0d) / 10000;
    }

    public static PointF parseGeoPoint(String str) {
        float f;
        float f2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0951b27a721ac4aa13d43b0c236b0555", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0951b27a721ac4aa13d43b0c236b0555");
        }
        if (str == null) {
            return null;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split.length < 2 || TextUtils.isEmpty(split[0]) || TextUtils.isEmpty(split[1])) {
            return null;
        }
        try {
            f = Float.parseFloat(split[0]);
        } catch (NumberFormatException e) {
            e = e;
            f = 0.0f;
        }
        try {
            f2 = Float.parseFloat(split[1]);
        } catch (NumberFormatException e2) {
            e = e2;
            e.printStackTrace();
            f2 = 0.0f;
            if (f >= 0.1f) {
            }
            return null;
        }
        if (f >= 0.1f || f2 < 0.1f) {
            return null;
        }
        return new PointF(f, f2);
    }

    public static Location pointToLocation(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30e8ae5c298e4b1504ca23228b90e2c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30e8ae5c298e4b1504ca23228b90e2c7");
        }
        Location location = new Location("gps");
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }
}
