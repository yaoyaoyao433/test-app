package com.meituan.android.clipboard;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.mi.data.Constant;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static String b;

    private static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adf1c43d76014b5acc7b2998e7e14278", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adf1c43d76014b5acc7b2998e7e14278")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "df56c38a3bab5fd02b5eff0301a778f8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "df56c38a3bab5fd02b5eff0301a778f8")).booleanValue() : "xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) && c();
    }

    private static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c61a81644b5483186cab8898b26ad2c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c61a81644b5483186cab8898b26ad2c6")).booleanValue();
        }
        if (TextUtils.isEmpty(b)) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                b = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.miui.ui.version.name");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        return a(b);
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "898e511a226a31068331fb206d456a89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "898e511a226a31068331fb206d456a89")).booleanValue();
        }
        String[] split = str.split("V");
        if (split.length <= 1 || split[1] == null) {
            return false;
        }
        int length = split[1].length();
        try {
            int parseInt = Integer.parseInt(split[1]);
            return length <= 2 ? parseInt >= 13 : length == 3 ? parseInt >= 125 : parseInt >= 1250;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41a2e0140f6e7b85407cf26be3eb9bba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41a2e0140f6e7b85407cf26be3eb9bba");
        }
        if (!TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.contains(Build.VERSION.INCREMENTAL)) {
            return Build.DISPLAY;
        }
        return Build.VERSION.INCREMENTAL;
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d5b5038e2b6ccfb704259516321242f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d5b5038e2b6ccfb704259516321242f")).booleanValue();
        }
        if (str.equalsIgnoreCase(Constant.DEVICE_XIAOMI)) {
            return b();
        }
        String str3 = Build.VERSION.INCREMENTAL;
        if (!TextUtils.isEmpty(str3)) {
            String[] split = str3.split("V");
            if (split.length == 1) {
                return b(split[0], str2);
            }
            if (split.length > 1 && split[1] != null) {
                return b(split[1], str2);
            }
        }
        return false;
    }

    private static boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba0a2584bc3cb9a9cf4776a2c2af126f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba0a2584bc3cb9a9cf4776a2c2af126f")).booleanValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int min = Math.min(length, length2);
        int i = min;
        for (int i2 = 0; i2 < min; i2++) {
            try {
                int parseInt = Integer.parseInt(split[i2]);
                int parseInt2 = Integer.parseInt(split2[i2]);
                if (parseInt > parseInt2) {
                    return true;
                }
                if (parseInt != parseInt2) {
                    return false;
                }
                i--;
                if (i == 0) {
                    return length >= length2;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
