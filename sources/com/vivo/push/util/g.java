package com.vivo.push.util;

import android.os.Looper;
import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static void a(String str) {
        if (p.a() && Looper.myLooper() == Looper.getMainLooper()) {
            Log.w("DebugUtil", "Operation: " + str + " in main thread!", new Throwable());
        }
    }
}
