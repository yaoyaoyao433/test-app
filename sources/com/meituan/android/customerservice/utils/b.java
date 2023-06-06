package com.meituan.android.customerservice.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static a b;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0825c2b40b4f9d8905ef0df6c7f93bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0825c2b40b4f9d8905ef0df6c7f93bf")).booleanValue();
        }
        if (b != null) {
            return b.a();
        }
        return false;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d78248a3c80a6ab1d38cf51ffc400cd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d78248a3c80a6ab1d38cf51ffc400cd") : b != null ? b.b() : "";
    }

    public static int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4ba623950fea30f3f55d77d677bad3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4ba623950fea30f3f55d77d677bad3e")).intValue();
        }
        if (b != null) {
            return b.d();
        }
        return 0;
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d35e1e4ec23097cbe4dbfb5eab76a719", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d35e1e4ec23097cbe4dbfb5eab76a719") : b != null ? b.e() : "";
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fba18b78aacd9aa1a1d2e19ee82905f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fba18b78aacd9aa1a1d2e19ee82905f7");
        } else if (b != null) {
            b.a(context, str);
        }
    }

    public static HashMap<String, int[]> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b2d5dd9d3765c490167d53cc09e0b8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b2d5dd9d3765c490167d53cc09e0b8a");
        }
        if (b != null) {
            return b.f();
        }
        return null;
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eada43f5849de633f55b7ca7b20fa4ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eada43f5849de633f55b7ca7b20fa4ec");
        }
        if (context == null) {
            return "https://kf.dianping.com";
        }
        StringBuilder sb = new StringBuilder("getHost-> url");
        sb.append(a() ? "https://kf.51ping.com" : "https://kf.dianping.com");
        c.a("CSFloatingConfig", sb.toString());
        return a() ? "https://kf.51ping.com" : "https://kf.dianping.com";
    }

    public static Drawable f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1a9b97fbc13071b5b25c52c2981607a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1a9b97fbc13071b5b25c52c2981607a");
        }
        if (b != null) {
            return b.h();
        }
        return null;
    }
}
