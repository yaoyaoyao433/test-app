package com.huawei.updatesdk.a.a.d;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class d {
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r8, java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)     // Catch: java.lang.Throwable -> L41 java.lang.IndexOutOfBoundsException -> L43 java.lang.IllegalArgumentException -> L50 java.io.IOException -> L5d java.io.FileNotFoundException -> L6a java.security.NoSuchAlgorithmException -> L77
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L41 java.lang.IndexOutOfBoundsException -> L43 java.lang.IllegalArgumentException -> L50 java.io.IOException -> L5d java.io.FileNotFoundException -> L6a java.security.NoSuchAlgorithmException -> L77
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L41 java.lang.IndexOutOfBoundsException -> L43 java.lang.IllegalArgumentException -> L50 java.io.IOException -> L5d java.io.FileNotFoundException -> L6a java.security.NoSuchAlgorithmException -> L77
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.IndexOutOfBoundsException -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L3d java.security.NoSuchAlgorithmException -> L3f java.lang.Throwable -> L8c
            r2 = 0
            r4 = r2
        L18:
            int r6 = r0.read(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L3d java.security.NoSuchAlgorithmException -> L3f java.lang.Throwable -> L8c
            r7 = -1
            if (r6 == r7) goto L26
            r7 = 0
            r9.update(r8, r7, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L3d java.security.NoSuchAlgorithmException -> L3f java.lang.Throwable -> L8c
            long r6 = (long) r6     // Catch: java.lang.IndexOutOfBoundsException -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L3d java.security.NoSuchAlgorithmException -> L3f java.lang.Throwable -> L8c
            long r4 = r4 + r6
            goto L18
        L26:
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L33
            byte[] r8 = r9.digest()     // Catch: java.lang.IndexOutOfBoundsException -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L3d java.security.NoSuchAlgorithmException -> L3f java.lang.Throwable -> L8c
            java.lang.String r8 = com.huawei.updatesdk.a.a.d.b.a(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L37 java.lang.IllegalArgumentException -> L39 java.io.IOException -> L3b java.io.FileNotFoundException -> L3d java.security.NoSuchAlgorithmException -> L3f java.lang.Throwable -> L8c
            r1 = r8
        L33:
            r0.close()     // Catch: java.io.IOException -> L84
            goto L8b
        L37:
            r8 = move-exception
            goto L45
        L39:
            r8 = move-exception
            goto L52
        L3b:
            r8 = move-exception
            goto L5f
        L3d:
            r8 = move-exception
            goto L6c
        L3f:
            r8 = move-exception
            goto L79
        L41:
            r8 = move-exception
            goto L8e
        L43:
            r8 = move-exception
            r0 = r1
        L45:
            java.lang.String r9 = "FileUtil"
            java.lang.String r2 = "getFileHashData IndexOutOfBoundsException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r9, r2, r8)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8b
            goto L33
        L50:
            r8 = move-exception
            r0 = r1
        L52:
            java.lang.String r9 = "FileUtil"
            java.lang.String r2 = "getFileHashData IllegalArgumentException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r9, r2, r8)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8b
            goto L33
        L5d:
            r8 = move-exception
            r0 = r1
        L5f:
            java.lang.String r9 = "FileUtil"
            java.lang.String r2 = "getFileHashData IOException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r9, r2, r8)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8b
            goto L33
        L6a:
            r8 = move-exception
            r0 = r1
        L6c:
            java.lang.String r9 = "FileUtil"
            java.lang.String r2 = "getFileHashData FileNotFoundException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r9, r2, r8)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8b
            goto L33
        L77:
            r8 = move-exception
            r0 = r1
        L79:
            java.lang.String r9 = "FileUtil"
            java.lang.String r2 = "getFileHashData NoSuchAlgorithmException"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r9, r2, r8)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8b
            goto L33
        L84:
            java.lang.String r8 = "FileUtil"
            java.lang.String r9 = "Close FileInputStream failed!"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r8, r9)
        L8b:
            return r1
        L8c:
            r8 = move-exception
            r1 = r0
        L8e:
            if (r1 == 0) goto L9b
            r1.close()     // Catch: java.io.IOException -> L94
            goto L9b
        L94:
            java.lang.String r9 = "FileUtil"
            java.lang.String r0 = "Close FileInputStream failed!"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r9, r0)
        L9b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.a.d.d.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                com.huawei.updatesdk.a.a.c.a.a.a.a("FileUtil", "Closeable exception", e);
            }
        }
    }

    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        return file.delete();
    }
}
