package com.tencent.map.geolocation;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TencentLocationManagerOptions {
    private static boolean a = true;
    private static String b = "";

    public static void setLoadLibraryEnabled(boolean z) {
        a = z;
    }

    public static boolean isLoadLibraryEnabled() {
        return a;
    }

    public static boolean setKey(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        b = str;
        return true;
    }

    public static String getKey() {
        return b;
    }
}
