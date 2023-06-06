package com.alipay.security.mobile.module.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            boolean r4 = r2.exists()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            if (r4 != 0) goto L12
            return r1
        L12:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            java.lang.String r2 = "UTF-8"
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L38
        L23:
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L39
            if (r5 == 0) goto L3c
            r0.append(r5)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L39
            goto L23
        L2d:
            r5 = move-exception
            goto L32
        L2f:
            r4 = move-exception
            r5 = r4
            r4 = r1
        L32:
            if (r4 == 0) goto L37
            r4.close()     // Catch: java.lang.Throwable -> L37
        L37:
            throw r5
        L38:
            r4 = r1
        L39:
            if (r4 != 0) goto L3c
            goto L3f
        L3c:
            r4.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.a.b.a(java.lang.String, java.lang.String):java.lang.String");
    }
}
