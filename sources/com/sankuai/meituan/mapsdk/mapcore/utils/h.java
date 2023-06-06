package com.sankuai.meituan.mapsdk.mapcore.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52f5f409a90735d1a14c3c6c27a2590e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52f5f409a90735d1a14c3c6c27a2590e")).booleanValue() : j != 0;
    }

    public static boolean a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4860a17340b2b9fb561df4738194288e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4860a17340b2b9fb561df4738194288e")).booleanValue() : (latLng == null || latLng.longitude < -180.0d || latLng.longitude > 180.0d || Double.isNaN(latLng.longitude) || Double.isInfinite(latLng.longitude) || latLng.latitude < -90.0d || latLng.latitude > 90.0d || Double.isNaN(latLng.latitude) || Double.isInfinite(latLng.latitude)) ? false : true;
    }
}
