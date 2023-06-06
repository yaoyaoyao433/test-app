package com.tencent.smtt.utils;

import java.io.InputStream;
import java.security.MessageDigest;
/* loaded from: classes6.dex */
public class Md5Utils {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getMD5(java.io.File r5) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L8 java.security.NoSuchAlgorithmException -> La java.io.IOException -> L42 java.io.FileNotFoundException -> L4e
            goto Lf
        L8:
            r5 = move-exception
            goto L37
        La:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L8 java.io.IOException -> L42 java.io.FileNotFoundException -> L4e
            r1 = r0
        Lf:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8 java.io.IOException -> L42 java.io.FileNotFoundException -> L4e
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L8 java.io.IOException -> L42 java.io.FileNotFoundException -> L4e
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L43 java.io.FileNotFoundException -> L4f
        L18:
            int r3 = r2.read(r5)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L43 java.io.FileNotFoundException -> L4f
            r4 = -1
            if (r3 == r4) goto L24
            r4 = 0
            r1.update(r5, r4, r3)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L43 java.io.FileNotFoundException -> L4f
            goto L18
        L24:
            byte[] r5 = r1.digest()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L43 java.io.FileNotFoundException -> L4f
            java.lang.String r5 = com.tencent.smtt.utils.ByteUtils.a(r5)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L43 java.io.FileNotFoundException -> L4f
            r2.close()     // Catch: java.io.IOException -> L30
            goto L34
        L30:
            r0 = move-exception
            r0.printStackTrace()
        L34:
            return r5
        L35:
            r5 = move-exception
            r0 = r2
        L37:
            if (r0 == 0) goto L41
            r0.close()     // Catch: java.io.IOException -> L3d
            goto L41
        L3d:
            r0 = move-exception
            r0.printStackTrace()
        L41:
            throw r5
        L42:
            r2 = r0
        L43:
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r5 = move-exception
            r5.printStackTrace()
        L4d:
            return r0
        L4e:
            r2 = r0
        L4f:
            if (r2 == 0) goto L59
            r2.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r5 = move-exception
            r5.printStackTrace()
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.Md5Utils.getMD5(java.io.File):java.lang.String");
    }

    public static String getMD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            return ByteUtils.a(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getMD5(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return messageDigest.digest();
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }
}
