package com.vivo.push.util;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class p {
    public static final o a = new n();
    private static boolean b;
    private static boolean c;

    static {
        b();
    }

    private static void b() {
        b = z.b("persist.sys.log.ctrl", "no").equals("yes");
    }

    public static boolean a() {
        return b && c;
    }

    public static void a(boolean z) {
        b();
        c = z;
    }

    public static int a(String str, String str2) {
        return a.a(str, str2);
    }

    public static int a(String str, Throwable th) {
        return a.a(str, th);
    }

    public static int a(String str, String str2, Throwable th) {
        return a.a(str, str2, th);
    }

    public static int b(String str, String str2) {
        return a.b(str, str2);
    }

    public static int c(String str, String str2) {
        return a.c(str, str2);
    }

    public static int d(String str, String str2) {
        return a.d(str, str2);
    }

    public static int b(String str, String str2, Throwable th) {
        return a.b(str, str2, th);
    }

    public static int e(String str, String str2) {
        return a.e(str, str2);
    }

    public static String a(Throwable th) {
        return a.a(th);
    }

    public static void a(Context context, String str) {
        a.a(context, str);
    }

    public static void b(Context context, String str) {
        a.b(context, str);
    }

    public static void c(Context context, String str) {
        a.c(context, str);
    }
}
