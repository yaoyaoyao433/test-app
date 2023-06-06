package com.huawei.updatesdk.a.a.d.h;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private static c c = new c();
    private static String d = null;
    private int a;
    private int b;

    static {
        a("ro.product.brand", "");
    }

    private c() {
        this.a = 0;
        this.b = 0;
        if (a("ro.maple.enable", 0) == 1) {
            this.a = 1;
        }
        this.b = a("ro.build.version.ark", 0);
    }

    public static int a(String str, int i) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i))).intValue();
        } catch (Throwable th) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("DeviceUtil", "Exception while getting system property: ", th);
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context) {
        if (d == null) {
            d = com.huawei.updatesdk.a.a.d.e.a(b(context), CommonConstant.Symbol.COMMA);
        }
        return d;
    }

    public static String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 16).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("DeviceUtil", "Exception while getting system property: ", th);
            return str2;
        }
    }

    public static List<String> a(List<String> list, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!a(str, strArr)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    static boolean a(String str, String[] strArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (String str2 : strArr) {
            if (str2.startsWith("config.")) {
                i = 1;
            } else if (!str2.contains(".config.")) {
                i2++;
            }
            if (str2.endsWith("config." + str)) {
                i3++;
            }
        }
        return i + i2 == i3;
    }

    public static String b(Context context, String str) {
        String a = a(context, str);
        int i = 0;
        int i2 = 0;
        while (i < a.length() && i2 < 3) {
            if (a.charAt(i) == '.') {
                i2++;
            }
            i++;
        }
        return 3 == i2 ? a.substring(0, i - 1) : a;
    }

    private static List<String> b(Context context) {
        ArrayList arrayList = new ArrayList();
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                String str = featureInfo.name;
                if (str != null) {
                    arrayList.add(com.huawei.updatesdk.a.a.d.c.a(str));
                }
            }
        }
        return arrayList;
    }

    private static DisplayMetrics c(Context context) {
        Display defaultDisplay;
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String c() {
        try {
            Object obj = Class.forName("com.huawei.system.BuildEx").getField("DISPLAY").get(null);
            return obj == null ? Build.DISPLAY : obj.toString();
        } catch (ClassNotFoundException unused) {
            return Build.DISPLAY;
        } catch (IllegalAccessException unused2) {
            return Build.DISPLAY;
        } catch (NoSuchFieldException unused3) {
            return Build.DISPLAY;
        } catch (Throwable unused4) {
            return Build.DISPLAY;
        }
    }

    public static c d() {
        return c;
    }

    public static List<String> d(Context context) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                String language = locales.get(i).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                    arrayList.add(language);
                }
            }
        } else {
            arrayList.add(context.getResources().getConfiguration().locale.getLanguage());
        }
        return arrayList;
    }

    public static String e() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        String script = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : null;
        if (TextUtils.isEmpty(script) && TextUtils.isEmpty(variant)) {
            return language + CommonConstant.Symbol.UNDERLINE + country;
        }
        return language + CommonConstant.Symbol.UNDERLINE + script + CommonConstant.Symbol.UNDERLINE + country + CommonConstant.Symbol.UNDERLINE + variant;
    }

    public static String e(Context context) {
        DisplayMetrics c2 = c(context);
        if (c2 != null) {
            String valueOf = String.valueOf(c2.widthPixels);
            String valueOf2 = String.valueOf(c2.heightPixels);
            return valueOf + CommonConstant.Symbol.UNDERLINE + valueOf2;
        }
        return "";
    }

    public static String f(Context context) {
        DisplayMetrics c2 = c(context);
        return c2 != null ? String.valueOf(c2.densityDpi) : "";
    }

    public static String[] f() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            return strArr == null ? new String[0] : strArr;
        }
        return new String[]{Build.CPU_ABI};
    }

    public static int g() {
        return a("ro.product.cpu.abi", "").contains("arm64") ? 2 : 1;
    }

    public static int g(Context context) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionCode);
            return Integer.parseInt(sb.toString());
        } catch (Exception unused) {
            return 1;
        }
    }

    public static String h() {
        String str;
        String str2 = "en";
        str = "";
        String str3 = "US";
        Locale locale = Locale.getDefault();
        if (locale != null) {
            str2 = locale.getLanguage();
            str = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "";
            str3 = locale.getCountry();
        }
        if (TextUtils.isEmpty(str)) {
            return str2 + CommonConstant.Symbol.UNDERLINE + str3;
        }
        return str2 + CommonConstant.Symbol.UNDERLINE + str + CommonConstant.Symbol.UNDERLINE + str3;
    }

    public static String h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean i() {
        return com.huawei.updatesdk.b.h.a.d().a() > 0;
    }

    public static boolean i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.google.android.gsf.login", 16);
            packageManager.getPackageInfo("com.google.android.gsf", 16);
            return (packageManager.getPackageInfo("com.google.android.gms", 16).applicationInfo.flags & 1) != 0;
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.d("DeviceUtil", e.getMessage());
            return false;
        }
    }

    public int a() {
        return this.a;
    }

    public void a(Window window) {
        if (com.huawei.updatesdk.b.h.a.d().a() < 21 || window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
            cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
        } catch (Throwable unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("DeviceUtil", "setWindowDisplaySideMode: exception");
        }
    }

    public int b() {
        return this.b;
    }
}
