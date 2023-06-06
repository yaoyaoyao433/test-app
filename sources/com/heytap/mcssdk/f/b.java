package com.heytap.mcssdk.f;

import android.util.Log;
/* loaded from: classes2.dex */
public final class b {
    private static String a = "MCS";
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = true;
    private static boolean e = true;
    private static boolean f = true;
    private static String g = "-->";
    private static boolean h = true;

    public static void a(String str) {
        if (d && h) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(g);
            sb.append(str);
        }
    }

    public static void a(String str, String str2) {
        if (f && h) {
            Log.e(str, a + g + str2);
        }
    }

    public static void a(boolean z) {
        h = z;
        boolean z2 = z;
        b = z2;
        d = z2;
        c = z2;
        e = z2;
        f = z2;
    }

    public static void b(String str) {
        if (f && h) {
            Log.e("mcssdk---", a + g + str);
        }
    }
}
