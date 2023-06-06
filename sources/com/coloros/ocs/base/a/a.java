package com.coloros.ocs.base.a;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
/* loaded from: classes.dex */
public final class a {
    private static boolean a = false;
    private static boolean b;
    private static boolean c;

    public static void a(String str) {
    }

    static {
        boolean isLoggable = Log.isLoggable("OcsBase", 3);
        b = isLoggable;
        c = isLoggable;
    }

    public static void a(Context context) {
        if (context != null) {
            boolean z = true;
            boolean z2 = Settings.System.getInt(context.getContentResolver(), "log_switch_type", 0) != 0;
            a = z2;
            if (!z2 && !b) {
                z = false;
            }
            c = z;
            StringBuilder sb = new StringBuilder("AFLog, sIsLogOn = ");
            sb.append(a);
            sb.append(", sIsDebugTagOn = ");
            sb.append(b);
        }
    }

    public static void a(String str, String str2) {
        if (c) {
            "OcsBase.".concat(String.valueOf(str));
        }
    }

    public static void b(String str, String str2) {
        if (c) {
            "OcsBase.".concat(String.valueOf(str));
        }
    }

    public static void c(String str, String str2) {
        "OcsBase.".concat(String.valueOf(str));
    }

    public static void d(String str, String str2) {
        Log.e("OcsBase.".concat(String.valueOf(str)), str2);
    }
}
