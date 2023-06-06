package com.alipay.sdk.encrypt;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0063: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:31:0x0063 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            java.lang.String r1 = "RSA"
            byte[] r6 = com.alipay.sdk.encrypt.a.a(r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.security.spec.X509EncodedKeySpec r2 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.security.KeyFactory r6 = java.security.KeyFactory.getInstance(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.security.PublicKey r6 = r6.generatePublic(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r2 = 1
            r1.init(r2, r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            int r6 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r3 = 0
        L2e:
            int r4 = r5.length     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L62
            if (r3 >= r4) goto L42
            int r4 = r5.length     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L62
            int r4 = r4 - r3
            if (r4 >= r6) goto L38
            int r4 = r5.length     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L62
            int r4 = r4 - r3
            goto L39
        L38:
            r4 = r6
        L39:
            byte[] r4 = r1.doFinal(r5, r3, r4)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L62
            r2.write(r4)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L62
            int r3 = r3 + r6
            goto L2e
        L42:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L62
            r2.close()     // Catch: java.io.IOException -> L4b
            r0 = r5
            goto L61
        L4b:
            r6 = move-exception
            r0 = r5
            goto L5e
        L4e:
            r5 = move-exception
            goto L54
        L50:
            r5 = move-exception
            goto L64
        L52:
            r5 = move-exception
            r2 = r0
        L54:
            com.alipay.sdk.util.d.a(r5)     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r6 = move-exception
        L5e:
            com.alipay.sdk.util.d.a(r6)
        L61:
            return r0
        L62:
            r5 = move-exception
            r0 = r2
        L64:
            if (r0 == 0) goto L6e
            r0.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            com.alipay.sdk.util.d.a(r6)
        L6e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.encrypt.d.a(java.lang.String, java.lang.String):byte[]");
    }
}
