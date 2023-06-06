package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
/* loaded from: classes6.dex */
public final class e {
    private static boolean a = false;

    public static synchronized void a(Context context) {
        synchronized (e.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
        }
    }

    public static boolean a() {
        return a;
    }

    public static synchronized boolean b(Context context) {
        synchronized (e.class) {
            return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1L)) > MetricsAnrManager.ANR_THRESHOLD;
        }
    }

    public static void c(Context context) {
        a a2 = at.a(context).a(as.ASSEMBLE_PUSH_HUAWEI);
        if (a2 != null) {
            a2.a();
        }
    }
}
