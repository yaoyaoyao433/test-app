package com.facebook.common.logging;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static c a = b.a();

    public static void a(c cVar) {
        a = cVar;
    }

    public static void a(int i) {
        a.a(i);
    }

    public static void a(String str, String str2) {
        if (a.b(3)) {
            a.a(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (a.b(3)) {
            a.a(str, str2, th);
        }
    }

    public static void b(String str, String str2) {
        if (a.b(4)) {
            a.b(str, str2);
        }
    }

    public static void a(String str, String str2, Object obj) {
        if (a.b(4)) {
            a.b(str, String.format(null, str2, obj));
        }
    }

    public static void a(String str, String str2, Object obj, Object obj2) {
        if (a.b(4)) {
            a.b(str, String.format(null, str2, obj, obj2));
        }
    }

    public static void a(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (a.b(4)) {
            a.b(str, String.format(null, str2, obj, obj2, obj3, obj4));
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (a.b(4)) {
            a.b(str, str2, th);
        }
    }

    public static void c(String str, String str2) {
        if (a.b(5)) {
            a.c(str, str2);
        }
    }

    public static void a(Class<?> cls, String str) {
        if (a.b(5)) {
            a.c(cls.getSimpleName(), str);
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        if (a.b(5)) {
            a.c(str, String.format(null, str2, objArr));
        }
    }

    public static void a(Class<?> cls, String str, Object... objArr) {
        if (a.b(5)) {
            a.c(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (a.b(5)) {
            a.c(str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        if (a.b(6)) {
            a.d(str, str2);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a.b(6)) {
            a.d(str, String.format(null, str2, objArr));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (a.b(6)) {
            a.d(str, str2, th);
        }
    }
}
