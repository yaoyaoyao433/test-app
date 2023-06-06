package com.meituan.android.common.locate.provider;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    public static String a = null;
    private static a c = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String d = null;
    private static String e = "";
    private static String f = "";
    private static int g;
    private static int h;
    public String b;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd02604194f4ebf1476de286f225e96d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd02604194f4ebf1476de286f225e96d");
        } else if (context == null) {
        } else {
            a = context.getPackageName();
            try {
                this.b = context.getPackageManager().getPackageInfo(a, 0).versionName;
            } catch (Exception e2) {
                LogUtils.a(getClass(), e2);
            }
        }
    }

    public static synchronized a a(Context context) {
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9c7d2f5fc115b1c5fdcacf4bfa4f4a6", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9c7d2f5fc115b1c5fdcacf4bfa4f4a6");
            }
            if (c == null) {
                c = new a(context);
            }
            return c;
        }
    }

    public static String a() {
        return d;
    }

    public static void a(int i) {
        g = i;
    }

    public static void a(String str) {
        d = str;
    }

    public static String b() {
        return e;
    }

    public static void b(String str) {
        e = str;
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "515186f7d5b6f1bf182707c017d7f9dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "515186f7d5b6f1bf182707c017d7f9dd");
        }
        String a2 = TextUtils.isEmpty(e) ? LocationUtils.a() : e;
        if (TextUtils.isEmpty(a2)) {
            return "";
        }
        if (a2.contains(CommonConstant.Symbol.COLON)) {
            String[] split = a2.split(CommonConstant.Symbol.COLON);
            return (split == null || split.length <= 1 || TextUtils.isEmpty(split[1])) ? "" : split[1];
        }
        return a2;
    }

    public static void c(String str) {
        f = str;
    }

    public static String d() {
        return f;
    }

    public static int e() {
        return h;
    }

    public static int f() {
        return g;
    }
}
