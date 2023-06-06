package com.meituan.android.paycommon.lib.utils;

import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o {
    public static ChangeQuickRedirect a;

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ecb80279248afd9ec11aa72bb4d87d9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ecb80279248afd9ec11aa72bb4d87d9") : "c_pay_dmfidr05";
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09d267aa07d4090edac1b80f2663df26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09d267aa07d4090edac1b80f2663df26");
        } else {
            a(a(), str, map);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "208705a3182858f1d70981c83ae84534", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "208705a3182858f1d70981c83ae84534");
        } else {
            ae.a(null, str2, map, str, "com.meituan.android.paycommon.lib.utils.PayCommonStaticsUtils", true);
        }
    }
}
