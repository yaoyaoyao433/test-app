package com.sankuai.meituan.takeoutnew.util.aop;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static final boolean b;
    private static final String[] c;

    static {
        b = Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT >= 23;
        c = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.READ_PHONE_STATE"};
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6f5fbd80296c3fb827f396a7fc2d086", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6f5fbd80296c3fb827f396a7fc2d086")).booleanValue();
        }
        if (b) {
            for (String str2 : c) {
                if (str2.equals(str)) {
                    if (TextUtils.equals("android.permission.ACCESS_COARSE_LOCATION", str) || TextUtils.equals("android.permission.ACCESS_FINE_LOCATION", str)) {
                        return !com.sankuai.waimai.platform.capacity.permission.a.b();
                    } else if (TextUtils.equals("android.permission.READ_PHONE_STATE", str)) {
                        return !com.sankuai.waimai.platform.capacity.permission.a.a();
                    }
                }
            }
            return false;
        }
        return false;
    }
}
