package com.facebook.systrace;

import android.os.Build;
import android.os.Trace;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static void a(long j, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a(long j) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
