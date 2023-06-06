package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class j extends b implements Callable<f> {
    private static final String i = "j";

    public j(String str, int i2, a aVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.a.c cVar) {
        super(str, i2, aVar, context, str2, grsBaseInfo, cVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.hms.framework.network.grs.c.f call() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.j.i
            java.lang.String r2 = "Post call execute"
            com.huawei.hms.framework.common.Logger.i(r0, r2)
            r2 = 0
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> La5
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> La2
            java.lang.String r0 = r17.c()     // Catch: java.io.IOException -> La0
            android.content.Context r2 = r17.b()     // Catch: java.io.IOException -> La0
            java.lang.String r3 = r17.e()     // Catch: java.io.IOException -> La0
            javax.net.ssl.HttpsURLConnection r0 = com.huawei.hms.framework.network.grs.d.a.a.a(r0, r2, r3)     // Catch: java.io.IOException -> La0
            r2 = 0
            if (r0 != 0) goto L2e
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.j.i     // Catch: java.io.IOException -> La0
            java.lang.String r3 = "create HttpsURLConnection instance by url return null."
            com.huawei.hms.framework.common.Logger.w(r0, r3)     // Catch: java.io.IOException -> La0
            return r2
        L2e:
            java.lang.String r3 = "Content-Type"
            java.lang.String r8 = "application/json; charset=UTF-8"
            r0.setRequestProperty(r3, r8)     // Catch: java.io.IOException -> La0
            java.lang.String r3 = "POST"
            r0.setRequestMethod(r3)     // Catch: java.io.IOException -> La0
            r3 = 1
            r0.setDoOutput(r3)     // Catch: java.io.IOException -> La0
            r0.setDoInput(r3)     // Catch: java.io.IOException -> La0
            r0.connect()     // Catch: java.io.IOException -> La0
            java.io.OutputStream r3 = r0.getOutputStream()     // Catch: java.io.IOException -> La0
            com.huawei.hms.framework.network.grs.a.c r8 = r17.f()     // Catch: java.io.IOException -> La0
            java.lang.String r9 = "services"
            java.lang.String r10 = ""
            java.lang.String r8 = r8.a(r9, r10)     // Catch: java.io.IOException -> La0
            java.lang.String r9 = "UTF-8"
            byte[] r8 = r8.getBytes(r9)     // Catch: java.io.IOException -> La0
            r3.write(r8)     // Catch: java.io.IOException -> La0
            r3.close()     // Catch: java.io.IOException -> La0
            int r10 = r0.getResponseCode()     // Catch: java.io.IOException -> La0
            r3 = 200(0xc8, float:2.8E-43)
            if (r10 != r3) goto L7d
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L78
            byte[] r2 = com.huawei.hms.framework.common.IoUtils.toByteArray(r3)     // Catch: java.lang.Throwable -> L75
            com.huawei.hms.framework.common.IoUtils.closeSecure(r3)     // Catch: java.io.IOException -> La0
            goto L7d
        L75:
            r0 = move-exception
            r2 = r3
            goto L79
        L78:
            r0 = move-exception
        L79:
            com.huawei.hms.framework.common.IoUtils.closeSecure(r2)     // Catch: java.io.IOException -> La0
            throw r0     // Catch: java.io.IOException -> La0
        L7d:
            java.util.Map r11 = r0.getHeaderFields()     // Catch: java.io.IOException -> La0
            r0.disconnect()     // Catch: java.io.IOException -> La0
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> La0
            long r15 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> La0
            if (r2 != 0) goto L93
            r0 = 0
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> La0
            r12 = r0
            goto L94
        L93:
            r12 = r2
        L94:
            com.huawei.hms.framework.network.grs.c.f r0 = new com.huawei.hms.framework.network.grs.c.f     // Catch: java.io.IOException -> La0
            r2 = 0
            long r13 = r8 - r4
            r9 = r0
            r9.<init>(r10, r11, r12, r13)     // Catch: java.io.IOException -> La0
            r1.a = r0     // Catch: java.io.IOException -> La0
            goto Lbf
        La0:
            r0 = move-exception
            goto La8
        La2:
            r0 = move-exception
            r6 = r2
            goto La8
        La5:
            r0 = move-exception
            r4 = r2
            r6 = r4
        La8:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = com.huawei.hms.framework.network.grs.c.j.i
            java.lang.String r9 = "RequestCallableV2 run task catch IOException"
            com.huawei.hms.framework.common.Logger.w(r8, r9, r0)
            com.huawei.hms.framework.network.grs.c.f r8 = new com.huawei.hms.framework.network.grs.c.f
            long r2 = r2 - r4
            r8.<init>(r0, r2)
            r1.a = r8
        Lbf:
            r2 = r15
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            java.lang.String r4 = r17.c()
            r0.a(r4)
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            int r4 = r17.d()
            r0.a(r4)
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            r0.b(r6)
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            r0.a(r2)
            com.huawei.hms.framework.network.grs.c.a r0 = r17.a()
            if (r0 == 0) goto Leb
            com.huawei.hms.framework.network.grs.c.a r0 = r17.a()
            com.huawei.hms.framework.network.grs.c.f r2 = r1.a
            r0.a(r2)
        Leb:
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.c.j.call():com.huawei.hms.framework.network.grs.c.f");
    }
}
