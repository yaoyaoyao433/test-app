package com.meituan.mmp.lib.utils;

import android.graphics.Typeface;
import android.os.Build;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t {
    private static Typeface a;

    static {
        if (Build.BRAND.equalsIgnoreCase("xiaomi")) {
            try {
                a = Typeface.createFromFile("/system/fonts/Roboto-Regular.ttf");
            } catch (Exception unused) {
            }
        }
    }

    public static Typeface a() {
        return a;
    }
}
