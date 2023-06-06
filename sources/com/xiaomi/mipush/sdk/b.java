package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
/* loaded from: classes6.dex */
public final class b {
    private static volatile boolean a = false;
    private static long b;

    public static void a(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a) {
            if (b <= 0 || b + 300000 <= elapsedRealtime) {
                b = elapsedRealtime;
                a a2 = at.a(context).a(as.ASSEMBLE_PUSH_COS);
                if (a2 != null) {
                    com.xiaomi.channel.commonutils.logger.c.a("ASSEMBLE_PUSH :  register cos when network change!");
                    a2.a();
                }
            }
        }
    }
}
