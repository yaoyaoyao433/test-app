package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
/* loaded from: classes6.dex */
public final class d {
    private static long a = 0;
    private static volatile boolean b = false;

    public static void a(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (b) {
            if (a <= 0 || a + 300000 <= elapsedRealtime) {
                a = elapsedRealtime;
                a a2 = at.a(context).a(as.ASSEMBLE_PUSH_FTOS);
                if (a2 != null) {
                    com.xiaomi.channel.commonutils.logger.c.a("ASSEMBLE_PUSH :  register fun touch os when network change!");
                    a2.a();
                }
            }
        }
    }
}
