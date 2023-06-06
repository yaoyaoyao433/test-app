package com.sankuai.meituan.takeoutnew.util.aop;

import android.annotation.SuppressLint;
import android.location.LocationManager;
import com.meituan.android.common.locate.api.MtLocationManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.manipulator.annotation.ClassLevelScope;
/* compiled from: ProGuard */
@ClassLevelScope(exclude = {"com.meituan.android.common.unionid.oneid.util.*", "com.sankuai.meituan.location.collector.*", "com.meituan.android.common.locate.*"})
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;

    @SuppressLint({"MissingPermission"})
    public static boolean a(LocationManager locationManager, String str) {
        Object[] objArr = {locationManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9545ca757d5c5b2dfb7de9a10d9ebdcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9545ca757d5c5b2dfb7de9a10d9ebdcf")).booleanValue();
        }
        if (j.a("android.permission.ACCESS_COARSE_LOCATION") || j.a("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return new MtLocationManager(locationManager, com.meituan.android.singleton.b.a, "waimai").isProviderEnabled(str);
    }
}
