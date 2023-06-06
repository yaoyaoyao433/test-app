package com.meituan.android.mrn.utils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    private static volatile boolean a = true;

    public static void a() {
        a = false;
    }

    public static void b() {
        a = true;
    }

    public static boolean c() {
        return a;
    }
}
