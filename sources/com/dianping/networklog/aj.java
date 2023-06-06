package com.dianping.networklog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class aj {
    public static ChangeQuickRedirect a;
    private static String b;
    private static final ThreadLocal<DateFormat> c = new ThreadLocal<>();

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7537503fe03064c1cf32146a4e6290f0", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7537503fe03064c1cf32146a4e6290f0")).intValue();
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+\\.?)+").matcher(b(context));
            if (matcher.find()) {
                return Integer.parseInt(matcher.group().replace(CommonConstant.Symbol.DOT, ""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d2f474a0ae8c1083c28f56cd5a237df", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d2f474a0ae8c1083c28f56cd5a237df")).longValue();
        }
        try {
            Date parse = e().parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "914236a5d758fa67727eb258d4fbbc01", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "914236a5d758fa67727eb258d4fbbc01") : e().format(new Date(j));
    }

    public static boolean a() {
        return c.d == 10;
    }

    public static double b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f06aa52bd5cb6a7fb082a8522aa946e1", 6917529027641081856L) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f06aa52bd5cb6a7fb082a8522aa946e1")).doubleValue() : BigDecimal.valueOf(j / 1024.0d).setScale(2, 4).doubleValue();
    }

    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb12bf75e660d4f0fa372fb5b8af9f8b", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb12bf75e660d4f0fa372fb5b8af9f8b")).longValue();
        }
        long b2 = com.meituan.android.time.c.b();
        DateFormat e = e();
        try {
            return e.parse(e.format(new Date(b2))).getTime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    private static synchronized String b(Context context) {
        synchronized (aj.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9ffb363eb1f77a93fe2ff0e30086441", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9ffb363eb1f77a93fe2ff0e30086441");
            }
            if (TextUtils.isEmpty(b)) {
                try {
                    b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (b == null) {
                b = "";
            }
            return b;
        }
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d428977349190fe6ce51f8b27edcd9fe", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d428977349190fe6ce51f8b27edcd9fe");
        }
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(46);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public static long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c513de60086743d62e093f98a6f70c25", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c513de60086743d62e093f98a6f70c25")).longValue() : com.meituan.android.time.c.b();
    }

    public static long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11c8cdf6ff913254b2b8fc424b1f4a5e", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11c8cdf6ff913254b2b8fc424b1f4a5e")).longValue() : System.currentTimeMillis();
    }

    @SuppressLint({"SimpleDateFormat"})
    private static DateFormat e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61a315c78b05c89e501cb84295bd9385", 6917529027641081856L)) {
            return (DateFormat) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61a315c78b05c89e501cb84295bd9385");
        }
        DateFormat dateFormat = c.get();
        if (dateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            c.set(simpleDateFormat);
            return simpleDateFormat;
        }
        return dateFormat;
    }

    public static SharedPreferences a(Context context, String str, int i) {
        String str2 = str;
        Object[] objArr = {context, str2, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0200cecf82864ec1e5cf991bb13d0814", 6917529027641081856L)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0200cecf82864ec1e5cf991bb13d0814");
        }
        String b2 = j.b(context);
        Object[] objArr2 = {context, str2, 0, b2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e161d1071a82a3e0161d83c452be0952", 6917529027641081856L)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e161d1071a82a3e0161d83c452be0952");
        }
        if (!TextUtils.isEmpty(b2) && !"main".equals(b2)) {
            str2 = str2 + CommonConstant.Symbol.DOT + b2;
        }
        return context.getSharedPreferences(str2, 0);
    }
}
