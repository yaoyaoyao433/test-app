package com.sankuai.waimai.foundation.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class r {
    public static ChangeQuickRedirect a;

    public static long a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "137cc9c948de2145e1b12684cf8834a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "137cc9c948de2145e1b12684cf8834a9")).longValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                return TextUtils.isEmpty(trim) ? j : Long.parseLong(trim);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d8714221c55e3d758c995e67ad05496", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d8714221c55e3d758c995e67ad05496")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                return TextUtils.isEmpty(trim) ? i : Integer.parseInt(trim);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static float a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b926c562df21aa9f049c7f6af97b4b79", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b926c562df21aa9f049c7f6af97b4b79")).floatValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                return TextUtils.isEmpty(trim) ? f : Float.parseFloat(trim);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public static double a(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "881a24a08ba1ad0ae9be6c6c93711c6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "881a24a08ba1ad0ae9be6c6c93711c6c")).doubleValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                return TextUtils.isEmpty(trim) ? d : Double.parseDouble(trim);
            } catch (Exception unused) {
            }
        }
        return d;
    }
}
