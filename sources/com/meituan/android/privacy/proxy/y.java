package com.meituan.android.privacy.proxy;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y {
    public static ChangeQuickRedirect a;
    private static final String[] b = new String[0];

    public static boolean a(String str, String str2, int[] iArr) {
        boolean z;
        Object[] objArr = {str, str2, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7688d9325f98535fd3627e280be65ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7688d9325f98535fd3627e280be65ef")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!str.startsWith("internal.")) {
            com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
            if (createPermissionGuard != null) {
                int a2 = createPermissionGuard.a((Context) com.meituan.android.privacy.impl.d.a(), str, str2, true);
                if (iArr != null) {
                    iArr[0] = a2;
                }
                return a2 > 0;
            }
            return false;
        }
        Object[] objArr2 = {str2, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "94d427ea0fe55a677997a65dd171120d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "94d427ea0fe55a677997a65dd171120d")).booleanValue();
        }
        if (com.meituan.android.privacy.interfaces.config.d.a(str2, str, "").b) {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "895c9ad511d6a207c4fd0ce1cddec6ae", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "895c9ad511d6a207c4fd0ce1cddec6ae")).booleanValue();
            } else {
                z = TextUtils.isEmpty(str) || (com.meituan.android.privacy.impl.d.a() != null && "internal.Locate.once".equals(str) && ContextCompat.checkSelfPermission(com.meituan.android.privacy.impl.d.a(), "android.permission.ACCESS_COARSE_LOCATION") == 0 && ContextCompat.checkSelfPermission(com.meituan.android.privacy.impl.d.a(), "android.permission.ACCESS_FINE_LOCATION") == 0);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String[] strArr, int[] iArr) {
        Object[] objArr = {str, strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edd319887fa4da0214481b0dafec2654", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edd319887fa4da0214481b0dafec2654")).booleanValue();
        }
        if (strArr == null) {
            iArr[0] = 1000;
            return true;
        }
        for (String str2 : strArr) {
            if (!a(str2, str, iArr)) {
                return false;
            }
        }
        return true;
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de900a0f351bcdc2c76ca0a71ad2ed79", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de900a0f351bcdc2c76ca0a71ad2ed79") : ("Locate.once".equals(str) || "Locate.once".equals(str)) ? "internal.Locate.once" : str;
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e21b03dae6dc4a4ddf841750b511d30", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e21b03dae6dc4a4ddf841750b511d30");
        }
        com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard != null) {
            int a2 = createPermissionGuard.a((Context) com.meituan.android.privacy.impl.d.a(), str2, str, true);
            if (TextUtils.isEmpty(str) && a2 > 0) {
                return a(str2);
            }
            if (a2 == 3) {
                return a(str2);
            }
        }
        return str2;
    }

    public static int a(String[] strArr) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2602df27cffa223a129a00805622cb85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2602df27cffa223a129a00805622cb85")).intValue();
        }
        if (strArr == null) {
            return -1;
        }
        String[] strArr2 = b;
        Object[] objArr2 = {strArr2, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "967dc39f32a4eb37617aac9ff0fb2954", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "967dc39f32a4eb37617aac9ff0fb2954")).booleanValue();
        } else if (strArr2 != null && strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = true;
                    break;
                }
                String str = strArr[i];
                int length2 = strArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        z = false;
                        break;
                    } else if (TextUtils.equals(str, strArr2[i2])) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    break;
                }
                i++;
            }
        }
        return z2 ? 1 : -1;
    }

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "983c4d316691de414b5aa058a6de62e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "983c4d316691de414b5aa058a6de62e1")).booleanValue();
        }
        if (i == 1) {
            return com.meituan.android.privacy.impl.g.a();
        }
        return false;
    }
}
