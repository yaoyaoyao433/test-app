package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.bm;
/* loaded from: classes6.dex */
public final class bo implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ bm.a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bo(bm.a aVar, Context context) {
        this.b = aVar;
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0071 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #3 {Exception -> 0x0069, blocks: (B:37:0x0065, B:40:0x006b, B:42:0x0071), top: B:50:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
            com.xiaomi.push.bm$a r1 = r4.b     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            android.database.sqlite.SQLiteDatabase r1 = r1.c()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            if (r1 == 0) goto L1f
            boolean r0 = r1.isOpen()     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L62
            if (r0 == 0) goto L1f
            r1.beginTransaction()     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L62
            com.xiaomi.push.bm$a r0 = r4.b     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L62
            android.content.Context r2 = r4.a     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L62
            r0.a(r2, r1)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L62
            r1.setTransactionSuccessful()     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L62
            goto L1f
        L1d:
            r0 = move-exception
            goto L49
        L1f:
            if (r1 == 0) goto L27
            r1.endTransaction()     // Catch: java.lang.Exception -> L25
            goto L27
        L25:
            r0 = move-exception
            goto L35
        L27:
            com.xiaomi.push.bm$a r0 = r4.b     // Catch: java.lang.Exception -> L25
            com.xiaomi.push.bk r0 = r0.c     // Catch: java.lang.Exception -> L25
            if (r0 == 0) goto L38
            com.xiaomi.push.bm$a r0 = r4.b     // Catch: java.lang.Exception -> L25
            com.xiaomi.push.bk r0 = r0.c     // Catch: java.lang.Exception -> L25
            r0.close()     // Catch: java.lang.Exception -> L25
            goto L38
        L35:
            com.xiaomi.channel.commonutils.logger.c.a(r0)
        L38:
            com.xiaomi.push.bm$a r0 = r4.b
            android.content.Context r1 = r4.a
            r0.a(r1)
            return
        L40:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L63
        L45:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L49:
            com.xiaomi.channel.commonutils.logger.c.a(r0)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L54
            r1.endTransaction()     // Catch: java.lang.Exception -> L52
            goto L54
        L52:
            r0 = move-exception
            goto L35
        L54:
            com.xiaomi.push.bm$a r0 = r4.b     // Catch: java.lang.Exception -> L52
            com.xiaomi.push.bk r0 = r0.c     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L38
            com.xiaomi.push.bm$a r0 = r4.b     // Catch: java.lang.Exception -> L52
            com.xiaomi.push.bk r0 = r0.c     // Catch: java.lang.Exception -> L52
            r0.close()     // Catch: java.lang.Exception -> L52
            goto L38
        L62:
            r0 = move-exception
        L63:
            if (r1 == 0) goto L6b
            r1.endTransaction()     // Catch: java.lang.Exception -> L69
            goto L6b
        L69:
            r1 = move-exception
            goto L79
        L6b:
            com.xiaomi.push.bm$a r1 = r4.b     // Catch: java.lang.Exception -> L69
            com.xiaomi.push.bk r1 = r1.c     // Catch: java.lang.Exception -> L69
            if (r1 == 0) goto L7c
            com.xiaomi.push.bm$a r1 = r4.b     // Catch: java.lang.Exception -> L69
            com.xiaomi.push.bk r1 = r1.c     // Catch: java.lang.Exception -> L69
            r1.close()     // Catch: java.lang.Exception -> L69
            goto L7c
        L79:
            com.xiaomi.channel.commonutils.logger.c.a(r1)
        L7c:
            com.xiaomi.push.bm$a r1 = r4.b
            android.content.Context r2 = r4.a
            r1.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bo.run():void");
    }
}
