package com.meituan.android.legwork.utils;

import android.content.Context;
import android.provider.Settings;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class w {
    public static ChangeQuickRedirect a;

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50bb03d030db6229dcafd7a353579481", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50bb03d030db6229dcafd7a353579481")).intValue() : Privacy.createPermissionGuard().a(com.meituan.android.legwork.a.a(), "Locate.once", str);
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8084ef1c83d322c37289673e3e57ec0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8084ef1c83d322c37289673e3e57ec0a")).booleanValue();
        }
        if (context != null) {
            try {
                return Settings.Secure.getInt(context.getContentResolver(), LoadConfig.LOCATION_MODE, 0) != 0;
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7418990bdd53bbb9bce12f4b56109a0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7418990bdd53bbb9bce12f4b56109a0d")).booleanValue() : Privacy.createPermissionGuard().a(com.meituan.android.legwork.a.a(), PermissionGuard.PERMISSION_STORAGE, str) > 0;
    }
}
