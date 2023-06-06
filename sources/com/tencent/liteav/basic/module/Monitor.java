package com.tencent.liteav.basic.module;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Monitor {
    private static native void nativeInit(String str, int i, String str2);

    private static native void nativeOnlineLog(int i, String str, String str2, int i2);

    private static native void nativeOnlineLogWithLimit(int i, int i2, String str, String str2, int i3, int i4);

    private static native void nativeUnInit();

    public static void a(String str, int i, String str2) {
        nativeInit(str, i, str2);
    }

    public static void a(int i, String str, String str2, int i2) {
        nativeOnlineLog(i, str, str2, i2);
    }

    public static void a(int i, int i2, String str, String str2, int i3, int i4) {
        nativeOnlineLogWithLimit(i, i2, str, str2, i3, i4);
    }

    public static void a() {
        nativeUnInit();
    }
}
