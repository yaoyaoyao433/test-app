package com.huawei.updatesdk.b.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.f;
import java.io.File;
import java.lang.Thread;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    private static Integer a = null;
    private static boolean b = false;
    private static boolean c = false;
    private static Field d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", thread.getName() + " : " + th.getMessage());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.huawei.updatesdk.b.h.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0178b {
        NOT_INSTALLED,
        INSTALLED,
        INSTALLED_LOWCODE
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c implements Runnable {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageManagerRunnable", "PackageManagerRunnable run!!!!");
            com.huawei.updatesdk.a.a.d.d.a(new File(com.huawei.updatesdk.b.d.d.b()));
        }
    }

    public static int a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if ((applicationInfo.flags & 1) == 0) {
            return 0;
        }
        return a(applicationInfo) ? 1 : 2;
    }

    public static int a(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = com.huawei.updatesdk.a.b.a.a.c().a().getPackageManager().getPackageInfo(str, 128);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || applicationInfo.metaData == null || !packageInfo.applicationInfo.metaData.containsKey("com.huawei.maple.flag")) ? 0 : 1;
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "getMapleStatus not found: " + str);
            return 0;
        }
    }

    public static PackageInfo a(String str, Context context) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "not found: " + str);
            return null;
        }
    }

    public static EnumC0178b a(Context context, String str) {
        EnumC0178b enumC0178b = EnumC0178b.NOT_INSTALLED;
        if (context == null) {
            return enumC0178b;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                com.huawei.updatesdk.a.a.a.b("PackageUtils", "appmarket info,versioncode = " + packageInfo.versionCode + "versioncode = " + packageInfo.versionName);
                return packageInfo.versionCode < 70203000 ? EnumC0178b.INSTALLED_LOWCODE : EnumC0178b.INSTALLED;
            }
            return enumC0178b;
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "isInstallByPackage Exception:" + e.toString());
            return enumC0178b;
        }
    }

    public static void a() {
        Thread thread = new Thread(new c(null));
        thread.setName("delete market file task");
        thread.setUncaughtExceptionHandler(new a());
        thread.start();
    }

    private static boolean a(ApplicationInfo applicationInfo) {
        StringBuilder sb;
        String illegalArgumentException;
        int i = applicationInfo.flags;
        Integer c2 = c();
        if (c2 == null || (i & c2.intValue()) == 0) {
            Field b2 = b();
            if (b2 != null) {
                try {
                    return (b2.getInt(applicationInfo) & 33554432) != 0;
                } catch (IllegalAccessException e) {
                    sb = new StringBuilder("can not get hwflags");
                    illegalArgumentException = e.toString();
                    sb.append(illegalArgumentException);
                    com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", sb.toString());
                    return false;
                } catch (IllegalArgumentException e2) {
                    sb = new StringBuilder("can not get hwflags");
                    illegalArgumentException = e2.toString();
                    sb.append(illegalArgumentException);
                    com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", sb.toString());
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    private static int b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "isInstallByPackage:" + e.toString());
            return 0;
        }
    }

    public static Field b() {
        if (c) {
            return d;
        }
        try {
            d = ApplicationInfo.class.getField("hwFlags");
        } catch (NoSuchFieldException unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", "can not find hwFlags");
        }
        c = true;
        return d;
    }

    public static Integer c() {
        String exc;
        StringBuilder sb;
        String noSuchFieldException;
        if (b) {
            return a;
        }
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            a = Integer.valueOf(cls.getDeclaredField("PARSE_IS_REMOVABLE_PREINSTALLED_APK").getInt(cls));
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder("isDelApp error ClassNotFoundException:");
            noSuchFieldException = e.toString();
            sb.append(noSuchFieldException);
            exc = sb.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", exc);
            b = true;
            return a;
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder("isDelApp error IllegalAccessException:");
            noSuchFieldException = e2.toString();
            sb.append(noSuchFieldException);
            exc = sb.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", exc);
            b = true;
            return a;
        } catch (IllegalArgumentException e3) {
            sb = new StringBuilder("isDelApp error IllegalArgumentException:");
            noSuchFieldException = e3.toString();
            sb.append(noSuchFieldException);
            exc = sb.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", exc);
            b = true;
            return a;
        } catch (NoSuchFieldException e4) {
            sb = new StringBuilder("isDelApp error NoSuchFieldException:");
            noSuchFieldException = e4.toString();
            sb.append(noSuchFieldException);
            exc = sb.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", exc);
            b = true;
            return a;
        } catch (Exception e5) {
            exc = e5.toString();
            com.huawei.updatesdk.a.a.c.a.a.a.a("PackageUtils", exc);
            b = true;
            return a;
        }
        b = true;
        return a;
    }

    public static boolean c(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0) != null;
            } catch (Exception e) {
                com.huawei.updatesdk.a.a.c.a.a.a.d("PackageUtils", "isAppInstalled NameNotFoundException:" + e.toString());
            }
        }
        return false;
    }

    public static boolean d(Context context, String str) {
        return f.f().e() || b(context, str) > 90000000;
    }

    public static boolean e(Context context, String str) {
        return f.f().e() || b(context, str) > 100200000;
    }
}
