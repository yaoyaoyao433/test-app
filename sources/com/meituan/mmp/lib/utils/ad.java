package com.meituan.mmp.lib.utils;

import android.content.Context;
import android.location.LocationManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ad {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6f565a6ef6e1ddaae2ebbfbb9c6fe71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6f565a6ef6e1ddaae2ebbfbb9c6fe71")).booleanValue();
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        return com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "network") || com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "gps") || com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "passive");
    }

    public static boolean a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2bf46e9cb411a4172d64b863852c887", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2bf46e9cb411a4172d64b863852c887")).booleanValue();
        }
        for (String str : strArr) {
            if (str != null && (str.equals("Locate.once") || str.equals(PermissionGuard.PERMISSION_LOCATION_CONTINUOUS))) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50813169c324a97aeb434b056c28e4b1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50813169c324a97aeb434b056c28e4b1")).booleanValue() : com.meituan.msi.privacy.permission.a.a(context, "Locate.once", str) || com.meituan.msi.privacy.permission.a.a(context, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, str);
    }

    public static boolean b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf7e80d717e1091e7fae288fc0a1977c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf7e80d717e1091e7fae288fc0a1977c")).booleanValue() : a(context, str);
    }
}
