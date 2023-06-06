package com.meituan.android.paycommon.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99c8942ca8eefb9c4dd69911adbbaa8e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99c8942ca8eefb9c4dd69911adbbaa8e")).booleanValue() : str != null && str.length() == 6 && str.matches("[0-9]+");
    }

    public static boolean a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adc7768b3dbac6734a5e2eb3337e5642", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adc7768b3dbac6734a5e2eb3337e5642")).booleanValue();
        }
        if (a(str)) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.charAt(i2));
                    int parseInt = Integer.parseInt(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(i2 - 1));
                    if (parseInt != Integer.parseInt(sb2.toString()) + i) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
