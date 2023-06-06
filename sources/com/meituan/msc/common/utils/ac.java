package com.meituan.msc.common.utils;

import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ac {
    public static ChangeQuickRedirect a;

    public static boolean a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fed66d0fb48e63b48c7a02f9566475f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fed66d0fb48e63b48c7a02f9566475f")).booleanValue();
        }
        for (String str : strArr) {
            if (str != null && (str.equals("Locate.once") || str.equals(PermissionGuard.PERMISSION_LOCATION_CONTINUOUS))) {
                return true;
            }
        }
        return false;
    }
}
