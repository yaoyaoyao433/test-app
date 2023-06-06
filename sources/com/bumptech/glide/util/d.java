package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    private static final double a;

    static {
        a = 17 <= Build.VERSION.SDK_INT ? 1.0d / Math.pow(10.0d, 6.0d) : 1.0d;
    }

    @TargetApi(17)
    public static long a() {
        if (17 <= Build.VERSION.SDK_INT) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return System.currentTimeMillis();
    }

    public static double a(long j) {
        return (a() - j) * a;
    }
}
