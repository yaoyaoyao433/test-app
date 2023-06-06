package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.mapsdk.internal.jz;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kj {
    public static kk a;

    private static void a(kk kkVar) {
        if (a != kkVar) {
            a = kkVar;
        }
    }

    private static void e(String str) {
        if (a != null) {
            a.b(str);
        } else {
            System.out.println(str);
        }
    }

    private static void d(String str, Throwable th) {
        if (a != null) {
            a.a(str, th);
        } else {
            c(str, th);
        }
    }

    public static void a(String str, String str2) {
        if (a != null) {
            a.a(str, str2);
        } else {
            g(str, str2);
        }
    }

    private static void c(String str, String str2, Throwable th) {
        if (a != null) {
            a.a(str, str2, th);
        } else {
            b(str, str2, th);
        }
    }

    private static void f(String str) {
        if (a != null) {
            a.c(str);
        } else {
            System.out.println(str);
        }
    }

    private static void e(String str, Throwable th) {
        if (a != null) {
            a.b(str, th);
        } else {
            c(str, th);
        }
    }

    public static void b(String str, String str2) {
        if (a != null) {
            a.b(str, str2);
        } else {
            g(str, str2);
        }
    }

    private static void d(String str, String str2, Throwable th) {
        if (a != null) {
            a.b(str, str2, th);
        } else {
            b(str, str2, th);
        }
    }

    public static void a(String str) {
        if (a != null) {
            a.d(str);
        } else {
            System.out.println(str);
        }
    }

    private static void f(String str, Throwable th) {
        if (a != null) {
            a.c(str, th);
        } else {
            c(str, th);
        }
    }

    public static void c(String str, String str2) {
        if (a != null) {
            a.c(str, str2);
        } else {
            g(str, str2);
        }
    }

    private static void e(String str, String str2, Throwable th) {
        if (a != null) {
            a.c(str, str2, th);
        } else {
            b(str, str2, th);
        }
    }

    public static void b(String str) {
        if (a != null) {
            a.e(str);
        } else {
            System.out.println(str);
        }
    }

    public static void a(String str, Throwable th) {
        if (a != null) {
            a.d(str, th);
        } else {
            c(str, th);
        }
    }

    public static void d(String str, String str2) {
        if (a != null) {
            a.d(str, str2);
        } else {
            g(str, str2);
        }
    }

    private static void f(String str, String str2, Throwable th) {
        if (a != null) {
            a.d(str, str2, th);
        } else {
            b(str, str2, th);
        }
    }

    public static void c(String str) {
        if (a != null) {
            a.f(str);
        } else {
            System.out.println(str);
        }
    }

    public static void b(String str, Throwable th) {
        if (a != null) {
            a.e(str, th);
        } else {
            c(str, th);
        }
    }

    public static void e(String str, String str2) {
        if (a != null) {
            a.e(str, str2);
        } else {
            g(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (a != null) {
            a.e(str, str2, th);
        } else {
            b(str, str2, th);
        }
    }

    private static void g(String str) {
        if (a != null) {
            a.g(str);
        } else {
            System.out.println(str);
        }
    }

    public static void f(String str, String str2) {
        if (a != null) {
            a.f(str, str2);
        }
    }

    public static String a() {
        if (a != null) {
            return a.b();
        }
        return null;
    }

    private static void a(File file, String str, String str2) {
        if (a != null) {
            a.a(file, str, str2);
        }
    }

    private static boolean b() {
        if (a != null) {
            return a.a();
        }
        return false;
    }

    public static boolean d(String str) {
        if (a != null) {
            return a.a(str);
        }
        return false;
    }

    private static boolean a(int i, String str) {
        if (a != null) {
            return a.a(i, str);
        }
        return false;
    }

    public static void a(Context context, jz.a aVar) {
        if (a != null) {
            a.a(context, aVar);
        }
    }

    private static void a(boolean z, String... strArr) {
        if (a != null) {
            a.a(z, strArr);
        }
    }

    private static void a(boolean z, int i, String... strArr) {
        if (a != null) {
            a.a(z, i, strArr);
        }
    }

    private static void h(String str) {
        System.out.println(str);
    }

    public static void b(String str, String str2, Throwable th) {
        System.out.println("[" + str + "]:" + str2 + th);
    }

    public static void c(String str, Throwable th) {
        System.out.println(str + th);
    }

    private static void g(String str, String str2) {
        System.out.println("[" + str + "]:" + str2);
    }
}
