package com.xiaomi.push;

import android.content.Context;
/* loaded from: classes6.dex */
public final class y {
    private static volatile boolean a = false;

    public static boolean a(Context context) {
        try {
            Class<?> a2 = jr.a(context, "com.bun.miitmdid.core.JLibrary");
            if (a2 != null) {
                if (!a) {
                    a = true;
                    a2.getDeclaredMethod("InitEntry", Context.class).invoke(a2, context);
                }
                return true;
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("mdid:check error " + th);
        }
        return false;
    }
}
