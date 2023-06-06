package com.xiaomi.push;

import android.util.Log;
import com.xiaomi.push.fg;
/* loaded from: classes6.dex */
public final class fc {
    private static final boolean a = Log.isLoggable("BCompressed", 3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(fb fbVar, byte[] bArr) {
        try {
            byte[] a2 = fg.a.a(bArr);
            if (a) {
                com.xiaomi.channel.commonutils.logger.c.a("BCompressed", "decompress " + bArr.length + " to " + a2.length + " for " + fbVar);
                if (fbVar.c == 1) {
                    com.xiaomi.channel.commonutils.logger.c.a("BCompressed", "decompress not support upStream");
                }
            }
            return a2;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
