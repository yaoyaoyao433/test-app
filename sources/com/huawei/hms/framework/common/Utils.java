package com.huawei.hms.framework.common;

import android.os.SystemClock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Utils {
    public static long getCurrentTime(boolean z) {
        return z ? SystemClock.elapsedRealtime() : System.currentTimeMillis();
    }
}
