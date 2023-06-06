package com.tencent.liteav.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private static boolean a = false;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static int g = 0;
    private static int h = 0;
    private static boolean i = false;

    public static void a() {
        b++;
        if (a) {
            new StringBuilder("decodeVideoCount:").append(b);
        }
    }

    public static void b() {
        c++;
        if (a) {
            new StringBuilder("decodeAudioCount:").append(c);
        }
    }

    public static void c() {
        d++;
        if (a) {
            new StringBuilder("processVideoCount:").append(d);
        }
    }

    public static void d() {
        e++;
        if (a) {
            new StringBuilder("processAudioCount:").append(e);
        }
    }

    public static void e() {
        f++;
        if (a) {
            new StringBuilder("renderVideoCount:").append(f);
        }
    }

    public static void f() {
        g++;
        if (a) {
            new StringBuilder("encodeVideoCount:").append(g);
        }
    }

    public static void g() {
        h++;
        if (a) {
            new StringBuilder("encodeAudioCount:").append(h);
        }
    }

    public static void h() {
        i = true;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
    }
}
