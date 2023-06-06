package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public abstract class cw extends m.a {
    protected int a;
    protected Context b;

    public cw(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009b A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #1 {, blocks: (B:15:0x005b, B:17:0x0061, B:18:0x0064, B:19:0x0067, B:44:0x0094, B:50:0x009b, B:52:0x00a1, B:56:0x00a7, B:57:0x00ad, B:40:0x0087, B:42:0x008d, B:43:0x0090), top: B:64:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r6, com.xiaomi.push.hj r7, java.lang.String r8) {
        /*
            byte[] r7 = com.xiaomi.push.ik.a(r7)
            byte[] r7 = com.xiaomi.push.cs.b(r8, r7)
            if (r7 == 0) goto Lb0
            int r8 = r7.length
            if (r8 != 0) goto Lf
            goto Lb0
        Lf:
            java.lang.Object r8 = com.xiaomi.push.ct.a
            monitor-enter(r8)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
            java.io.File r2 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
            java.lang.String r3 = "push_cdata.lock"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
            com.xiaomi.push.b.b(r1)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            java.nio.channels.FileLock r1 = r1.lock()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.io.File r6 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.lang.String r4 = "push_cdata.data"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r5 = 1
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            int r0 = r7.length     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            byte[] r0 = com.xiaomi.push.f.a(r0)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r6.write(r0)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r6.write(r7)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r6.flush()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r4 = 0
            r3.setLastModified(r4)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            if (r1 == 0) goto L64
            boolean r7 = r1.isValid()     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto L64
            r1.release()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> La5
        L64:
            com.xiaomi.push.b.a(r6)     // Catch: java.lang.Throwable -> La5
        L67:
            com.xiaomi.push.b.a(r2)     // Catch: java.lang.Throwable -> La5
            goto L94
        L6b:
            r7 = move-exception
            goto L98
        L6d:
            r7 = move-exception
            goto L73
        L6f:
            r7 = move-exception
            goto L99
        L71:
            r7 = move-exception
            r6 = r0
        L73:
            r0 = r1
            goto L82
        L75:
            r7 = move-exception
            r1 = r0
            goto L99
        L78:
            r7 = move-exception
            r6 = r0
            goto L82
        L7b:
            r7 = move-exception
            r1 = r0
            r2 = r1
            goto L99
        L7f:
            r7 = move-exception
            r6 = r0
            r2 = r6
        L82:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L90
            boolean r7 = r0.isValid()     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto L90
            r0.release()     // Catch: java.io.IOException -> L90 java.lang.Throwable -> La5
        L90:
            com.xiaomi.push.b.a(r6)     // Catch: java.lang.Throwable -> La5
            goto L67
        L94:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La5
            return
        L96:
            r7 = move-exception
            r1 = r0
        L98:
            r0 = r6
        L99:
            if (r1 == 0) goto La7
            boolean r6 = r1.isValid()     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto La7
            r1.release()     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            goto La7
        La5:
            r6 = move-exception
            goto Lae
        La7:
            com.xiaomi.push.b.a(r0)     // Catch: java.lang.Throwable -> La5
            com.xiaomi.push.b.a(r2)     // Catch: java.lang.Throwable -> La5
            throw r7     // Catch: java.lang.Throwable -> La5
        Lae:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La5
            throw r6
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cw.a(android.content.Context, com.xiaomi.push.hj, java.lang.String):void");
    }

    public abstract String b();

    public abstract hc c();

    @Override // java.lang.Runnable
    public void run() {
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        Context context = this.b;
        String valueOf = String.valueOf(a());
        long j = this.a;
        boolean z = false;
        if (com.xiaomi.push.service.z.a(context).a(hg.DCJobMutualSwitch.by, false) && ((Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !k.a(context, valueOf, j))) {
            z = true;
        }
        if (z) {
            com.xiaomi.channel.commonutils.logger.c.a("DC run job mutual: " + a());
            return;
        }
        cq cqVar = cr.a().a;
        String a = cqVar == null ? "" : cqVar.a();
        if (TextUtils.isEmpty(a)) {
            return;
        }
        hj hjVar = new hj();
        hjVar.c = b;
        hjVar.a(System.currentTimeMillis());
        hjVar.b = c();
        a(this.b, hjVar, a);
    }

    public static void a(Context context, hj hjVar) {
        cq cqVar = cr.a().a;
        String a = cqVar == null ? "" : cqVar.a();
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(hjVar.c)) {
            return;
        }
        a(context, hjVar, a);
    }
}
