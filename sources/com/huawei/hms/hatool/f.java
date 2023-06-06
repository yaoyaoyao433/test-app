package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class f {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static Object a(Class cls, String str, Class[] clsArr, Object[] objArr) {
        String str2;
        String str3;
        if (cls != null) {
            if (clsArr == null) {
                if (objArr != null) {
                    throw new a("paramsType is null, but params is not null");
                }
            } else if (objArr == null) {
                throw new a("paramsType or params should be same");
            } else {
                if (clsArr.length != objArr.length) {
                    throw new a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
                }
            }
            try {
            } catch (NoSuchMethodException unused) {
                y.f("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
            }
            try {
                return cls.getMethod(str, clsArr).invoke(null, objArr);
            } catch (IllegalAccessException unused2) {
                str2 = "hmsSdk";
                str3 = "invokeStaticFun(): method invoke Exception!";
                y.f(str2, str3);
                return null;
            } catch (IllegalArgumentException unused3) {
                str2 = "hmsSdk";
                str3 = "invokeStaticFun(): Illegal Argument!";
                y.f(str2, str3);
                return null;
            } catch (InvocationTargetException unused4) {
                str2 = "hmsSdk";
                str3 = "invokeStaticFun(): Invocation Target Exception!";
                y.f(str2, str3);
                return null;
            }
        }
        throw new a("class is null in invokeStaticFun");
    }

    public static Object a(String str, String str2, Class[] clsArr, Object[] objArr) {
        String str3;
        String str4;
        try {
            return a(Class.forName(str), str2, clsArr, objArr);
        } catch (a unused) {
            str3 = "hmsSdk";
            str4 = "invokeStaticFun(): Static function call Exception ";
            y.f(str3, str4);
            return null;
        } catch (ClassNotFoundException unused2) {
            str3 = "hmsSdk";
            str4 = "invokeStaticFun() Not found class!";
            y.f(str3, str4);
            return null;
        }
    }

    public static String a() {
        return a("ro.build.version.emui", "");
    }

    @SuppressLint({"HardwareIds"})
    public static String a(Context context) {
        return context == null ? "" : com.sankuai.meituan.takeoutnew.util.aop.l.a(context.getContentResolver(), "android_id");
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String a2 = a("android.os.SystemProperties", str, str2);
        return TextUtils.isEmpty(a2) ? a("com.huawei.android.os.SystemPropertiesEx", str, str2) : a2;
    }

    public static String a(String str, String str2, String str3) {
        Object a2 = a(str, "get", new Class[]{String.class, String.class}, new Object[]{str2, str3});
        return a2 != null ? (String) a2 : str3;
    }

    public static String b() {
        String a2 = a("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id", "");
        y.c("hmsSdk", "SystemPropertiesEx: get rom_ver: " + a2);
        if (TextUtils.isEmpty(a2)) {
            String str = Build.DISPLAY;
            y.c("hmsSdk", "SystemProperties: get rom_ver: " + str);
            return str;
        }
        return a2;
    }

    public static String b(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("CHANNEL")) == null) {
                return "Unknown";
            }
            String obj2 = obj.toString();
            return obj2.length() > 256 ? "Unknown" : obj2;
        } catch (PackageManager.NameNotFoundException unused) {
            y.f("hmsSdk", "getChannel(): The packageName is not correct!");
            return "Unknown";
        }
    }

    public static String c(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(c(context), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            y.f("hmsSdk", "getVersion(): The package name is not correct!");
            return "";
        }
    }
}
