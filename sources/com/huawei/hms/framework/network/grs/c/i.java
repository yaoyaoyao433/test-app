package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class i extends b implements Callable<f> {
    private static final String i = "i";

    public i(String str, int i2, a aVar, Context context, String str2, GrsBaseInfo grsBaseInfo) {
        super(str, i2, aVar, context, str2, grsBaseInfo, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.hms.framework.network.grs.c.f call() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.i.i
            java.lang.String r2 = "Get call execute"
            com.huawei.hms.framework.common.Logger.i(r0, r2)
            r2 = 0
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L7a
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L77
            java.lang.String r0 = r16.c()     // Catch: java.io.IOException -> L75
            android.content.Context r2 = r16.b()     // Catch: java.io.IOException -> L75
            java.lang.String r3 = r16.e()     // Catch: java.io.IOException -> L75
            javax.net.ssl.HttpsURLConnection r0 = com.huawei.hms.framework.network.grs.d.a.a.a(r0, r2, r3)     // Catch: java.io.IOException -> L75
            r2 = 0
            if (r0 != 0) goto L2e
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.i.i     // Catch: java.io.IOException -> L75
            java.lang.String r3 = "create HttpsURLConnection instance by url return null."
            com.huawei.hms.framework.common.Logger.w(r0, r3)     // Catch: java.io.IOException -> L75
            return r2
        L2e:
            java.lang.String r3 = "GET"
            r0.setRequestMethod(r3)     // Catch: java.io.IOException -> L75
            r0.connect()     // Catch: java.io.IOException -> L75
            int r9 = r0.getResponseCode()     // Catch: java.io.IOException -> L75
            r3 = 200(0xc8, float:2.8E-43)
            if (r9 != r3) goto L52
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L4d
            byte[] r2 = com.huawei.hms.framework.common.IoUtils.toByteArray(r3)     // Catch: java.lang.Throwable -> L4a
            com.huawei.hms.framework.common.IoUtils.closeSecure(r3)     // Catch: java.io.IOException -> L75
            goto L52
        L4a:
            r0 = move-exception
            r2 = r3
            goto L4e
        L4d:
            r0 = move-exception
        L4e:
            com.huawei.hms.framework.common.IoUtils.closeSecure(r2)     // Catch: java.io.IOException -> L75
            throw r0     // Catch: java.io.IOException -> L75
        L52:
            java.util.Map r10 = r0.getHeaderFields()     // Catch: java.io.IOException -> L75
            r0.disconnect()     // Catch: java.io.IOException -> L75
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L75
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L75
            if (r2 != 0) goto L67
            r0 = 0
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L75
            goto L68
        L67:
            r0 = r2
        L68:
            com.huawei.hms.framework.network.grs.c.f r2 = new com.huawei.hms.framework.network.grs.c.f     // Catch: java.io.IOException -> L75
            r3 = 0
            long r12 = r11 - r4
            r8 = r2
            r11 = r0
            r8.<init>(r9, r10, r11, r12)     // Catch: java.io.IOException -> L75
            r1.a = r2     // Catch: java.io.IOException -> L75
            goto L94
        L75:
            r0 = move-exception
            goto L7d
        L77:
            r0 = move-exception
            r6 = r2
            goto L7d
        L7a:
            r0 = move-exception
            r4 = r2
            r6 = r4
        L7d:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = com.huawei.hms.framework.network.grs.c.i.i
            java.lang.String r9 = "RequestCallable run task catch IOException"
            com.huawei.hms.framework.common.Logger.w(r8, r9, r0)
            com.huawei.hms.framework.network.grs.c.f r8 = new com.huawei.hms.framework.network.grs.c.f
            long r2 = r2 - r4
            r8.<init>(r0, r2)
            r1.a = r8
        L94:
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            java.lang.String r2 = r16.c()
            r0.a(r2)
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            int r2 = r16.d()
            r0.a(r2)
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            r0.b(r6)
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            r0.a(r14)
            com.huawei.hms.framework.network.grs.c.a r0 = r16.a()
            if (r0 == 0) goto Lbf
            com.huawei.hms.framework.network.grs.c.a r0 = r16.a()
            com.huawei.hms.framework.network.grs.c.f r2 = r1.a
            r0.a(r2)
        Lbf:
            com.huawei.hms.framework.network.grs.c.f r0 = r1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.c.i.call():com.huawei.hms.framework.network.grs.c.f");
    }
}
