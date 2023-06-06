package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
/* loaded from: classes6.dex */
public final class jr {
    private static Context a;
    private static String b;

    public static Context a() {
        return a;
    }

    public static Class<?> a(Context context, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new ClassNotFoundException("class is empty");
        }
        boolean z = context != null;
        if (z && Build.VERSION.SDK_INT >= 29) {
            try {
                return context.getClassLoader().loadClass(str);
            } catch (Throwable unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a(String.format("loadClass fail hasContext= %s, errMsg = %s", Boolean.valueOf(z), th.getLocalizedMessage()));
            throw new ClassNotFoundException("loadClass fail ", th);
        }
    }

    public static void a(Context context) {
        a = context.getApplicationContext();
    }

    public static int b() {
        try {
            Class<?> a2 = a(null, "miui.os.Build");
            if (a2.getField("IS_STABLE_VERSION").getBoolean(null)) {
                return 3;
            }
            return a2.getField("IS_DEVELOPMENT_VERSION").getBoolean(null) ? 2 : 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static boolean b(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return false;
        }
    }

    public static String c(Context context) {
        if (jj.b()) {
            return "";
        }
        String str = (String) am.a("com.xiaomi.xmsf.helper.MIIDAccountHelper", "getMIID", context);
        return TextUtils.isEmpty(str) ? "0" : str;
    }

    public static boolean c() {
        return TextUtils.equals((String) am.a("android.os.SystemProperties", "get", "sys.boot_completed"), "1");
    }

    public static boolean d() {
        try {
            return a(null, "miui.os.Build").getField("IS_GLOBAL_BUILD").getBoolean(Boolean.FALSE);
        } catch (ClassNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.c.d("miui.os.Build ClassNotFound");
            return false;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return false;
        }
    }

    public static synchronized String e() {
        String str;
        synchronized (jr.class) {
            if (b != null) {
                return b;
            }
            String str2 = Build.VERSION.INCREMENTAL;
            if (b() <= 0) {
                str = jq.a("ro.build.version.emui", "");
                b = str;
                if (TextUtils.isEmpty(str)) {
                    String a2 = jq.a("ro.build.version.opporom", "");
                    if (!TextUtils.isEmpty(a2) && !a2.startsWith("ColorOS_")) {
                        b = "ColorOS_" + a2;
                    }
                    str = b;
                    if (TextUtils.isEmpty(str)) {
                        String a3 = jq.a("ro.vivo.os.version", "");
                        if (!TextUtils.isEmpty(a3) && !a3.startsWith("FuntouchOS_")) {
                            b = "FuntouchOS_" + a3;
                        }
                        str = b;
                        if (TextUtils.isEmpty(str)) {
                            str2 = String.valueOf(jq.a("ro.product.brand", "Android") + CommonConstant.Symbol.UNDERLINE + str2);
                        }
                    }
                }
                b = str;
                return str;
            }
            str = str2;
            b = str;
            return str;
        }
    }
}
