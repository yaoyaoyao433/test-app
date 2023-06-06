package com.tencent.map.geolocation.a.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    private static boolean a(Handler handler) {
        Looper looper = handler == null ? null : handler.getLooper();
        return looper != null && looper.getThread().isAlive();
    }

    public static boolean a(Handler handler, int i, long j) {
        return a(handler, handler == null ? null : handler.obtainMessage(i), j);
    }

    public static boolean a(Handler handler, Message message, long j) {
        if (message == null || !a(handler)) {
            return false;
        }
        return handler.sendMessageDelayed(message, j);
    }
}
