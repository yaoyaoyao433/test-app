package com.sankuai.waimai.foundation.router.interfaces;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    @NonNull
    private static b b = b.RELEASE;
    @NonNull
    private static a c = a.NONE;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        DEBUG,
        DEVELOP,
        RELEASE;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589b66e84cd465abbd2d8b958fc256dc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589b66e84cd465abbd2d8b958fc256dc");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3eae1d9abf2d2440521b2e09451de32b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3eae1d9abf2d2440521b2e09451de32b") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34800cdba7c35dcd4eaabf6752261125", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34800cdba7c35dcd4eaabf6752261125") : (b[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        WM_APP,
        MT_APP,
        DP_APP,
        NONE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3a2248c71ca05ff25bba9c21b6dbd8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3a2248c71ca05ff25bba9c21b6dbd8");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d88adee9aa38544db885c016478418f0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d88adee9aa38544db885c016478418f0") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae60817c328651ced83a31572a82673e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae60817c328651ced83a31572a82673e") : (a[]) values().clone();
        }
    }

    public static void a(b bVar) {
        if (bVar == null) {
            bVar = b.RELEASE;
        }
        b = bVar;
    }

    private static void g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92baa892689904b0608d7ffa2987a269", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92baa892689904b0608d7ffa2987a269");
        } else if (c != a.NONE) {
        } else {
            String packageName = context.getPackageName();
            if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
                c = a.WM_APP;
            } else if ("com.sankuai.meituan".equals(packageName)) {
                c = a.MT_APP;
            } else if (packageName == null || !packageName.startsWith("com.dianping.v1")) {
            } else {
                c = a.DP_APP;
            }
        }
    }

    public static void a(@NonNull a aVar) {
        c = aVar;
    }

    public static boolean a() {
        return b == b.DEBUG || b == b.DEVELOP;
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e02a1f004dbc564d2430a1112dd2028c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e02a1f004dbc564d2430a1112dd2028c")).booleanValue();
        }
        if (c == a.NONE) {
            g(context);
        }
        return c == a.WM_APP;
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a13dfa0609135d5d51009c3205b1cec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a13dfa0609135d5d51009c3205b1cec")).booleanValue();
        }
        if (c == a.NONE) {
            g(context);
        }
        return c == a.MT_APP;
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3a00b13096716554ebdbdd04b463895", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3a00b13096716554ebdbdd04b463895")).booleanValue();
        }
        if (c == a.NONE) {
            g(context);
        }
        return c == a.DP_APP;
    }

    public static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41fb444866b26cf4af3021cddc9cf9be", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41fb444866b26cf4af3021cddc9cf9be") : c(context) ? "dianping" : b(context) ? "imeituan" : com.sankuai.waimai.foundation.router.interfaces.b.a;
    }

    public static String e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d92ed59c199341132dca4a01425cec87", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d92ed59c199341132dca4a01425cec87") : c(context) ? "waimai.dianping.com" : b(context) ? "www.meituan.com" : com.sankuai.waimai.foundation.router.interfaces.b.b;
    }

    public static String f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8768905c4371c45a29a039bf3e58a52", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8768905c4371c45a29a039bf3e58a52") : c(context) ? "dianping://waimai.dianping.com" : b(context) ? "imeituan://www.meituan.com" : com.sankuai.waimai.foundation.router.interfaces.b.c;
    }
}
