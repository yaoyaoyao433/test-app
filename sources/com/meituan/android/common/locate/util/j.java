package com.meituan.android.common.locate.util;

import android.content.Context;
import android.os.Build;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class j {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df617d7385859873b7433a929db8589c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df617d7385859873b7433a929db8589c")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return LocationUtils.a(context, i.a);
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94636137e77eb024f3b2061c671817eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94636137e77eb024f3b2061c671817eb")).booleanValue() : context != null && Privacy.createPermissionGuard().a(context, PermissionGuard.PERMISSION_PHONE_READ, str) > 0;
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a2ecb669a755967b059b316e34a4223", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a2ecb669a755967b059b316e34a4223")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return LocationUtils.j(context);
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2aa77c84b23c049ffb988a8458b1adf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2aa77c84b23c049ffb988a8458b1adf2")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return LocationUtils.j(context) || LocationUtils.a(context, i.a);
    }

    public static boolean d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5903c3067343bb98e03fe80a10366f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5903c3067343bb98e03fe80a10366f7")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 29 ? LocationUtils.j(context) || LocationUtils.a(context, i.a) : LocationUtils.j(context);
    }
}
