package com.meituan.msi.lib.map.utils;

import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static boolean a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba7e78769cf384ecfac5dd6c526dd2e2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba7e78769cf384ecfac5dd6c526dd2e2")).booleanValue() : (Double.isNaN(d) || Math.abs(d) > 90.0d || Double.isNaN(d2) || Double.isInfinite(d2) || Math.abs(d2) > 180.0d) ? false : true;
    }

    public static LatLngBounds a(JsonObject jsonObject) {
        LatLng b;
        LatLng b2;
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c48be412cd087b4c50e25d616e32342", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c48be412cd087b4c50e25d616e32342");
        }
        if (!jsonObject.has("southwest") || !jsonObject.has("northeast") || (b = b(jsonObject.get("southwest").getAsJsonObject())) == null || (b2 = b(jsonObject.get("northeast").getAsJsonObject())) == null) {
            return null;
        }
        return new LatLngBounds(b, b2);
    }

    public static LatLng b(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0a5fc3facc261a7c29263b33bd8ec1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0a5fc3facc261a7c29263b33bd8ec1f");
        }
        if (jsonObject.has(Constants.PRIVACY.KEY_LATITUDE) && jsonObject.has(Constants.PRIVACY.KEY_LONGITUDE)) {
            double asDouble = jsonObject.get(Constants.PRIVACY.KEY_LATITUDE).getAsDouble();
            double asDouble2 = jsonObject.get(Constants.PRIVACY.KEY_LONGITUDE).getAsDouble();
            if (a(asDouble, asDouble2)) {
                return new LatLng(asDouble, asDouble2);
            }
            return null;
        }
        return null;
    }
}
