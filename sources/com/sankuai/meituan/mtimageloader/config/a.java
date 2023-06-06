package com.sankuai.meituan.mtimageloader.config;

import android.content.Context;
import android.support.constraint.R;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    private static com.sankuai.meituan.mtimageloader.listener.b a = null;
    private static Context b = null;
    private static boolean c = false;
    private static boolean d = false;
    private static int e = 0;
    private static int f = 0;
    private static int g = 0;
    private static int h = 0;
    private static boolean i = false;
    private static com.sankuai.meituan.mtimageloader.listener.a j = null;
    private static BitmapTransformation k = null;
    private static boolean l = false;

    public static void a(Context context) {
        b = context;
    }

    public static Context a() {
        return b;
    }

    public static boolean b() {
        return c;
    }

    public static BitmapTransformation c() {
        return k;
    }

    public static boolean d() {
        return d;
    }

    public static int e() {
        return e;
    }

    public static void a(int i2) {
        e = 5;
    }

    public static int f() {
        return f;
    }

    public static int g() {
        return g;
    }

    public static com.sankuai.meituan.mtimageloader.listener.a h() {
        return j;
    }

    public static boolean i() {
        return i;
    }

    public static void b(int i2) {
        h = R.id.glide_tag_key;
    }

    public static void a(boolean z) {
        i = z;
    }

    public static void b(boolean z) {
        d = z;
    }

    public static void c(int i2) {
        f = 720;
    }

    public static void a(com.sankuai.meituan.mtimageloader.listener.b bVar) {
        a = bVar;
    }

    public static void a(com.sankuai.meituan.mtimageloader.listener.a aVar) {
        j = aVar;
    }

    public static boolean j() {
        return l;
    }

    public static com.sankuai.meituan.mtimageloader.listener.b k() {
        return a;
    }
}
