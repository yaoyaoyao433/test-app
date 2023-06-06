package com.meituan.msi.util;

import android.content.Context;
import android.location.LocationManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fa1580cd86d75a1780d658cb4530f63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fa1580cd86d75a1780d658cb4530f63")).booleanValue();
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        return com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "network") || com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "gps") || com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "passive");
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1535a9b74b562693d42a4001c07832f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1535a9b74b562693d42a4001c07832f")).booleanValue() : com.meituan.msi.privacy.permission.a.a(context, "Locate.once", str) || com.meituan.msi.privacy.permission.a.a(context, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, str);
    }

    public static boolean b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "748f7354b84ada1edd543f8c5fdeea86", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "748f7354b84ada1edd543f8c5fdeea86")).booleanValue() : a(context, str);
    }
}
