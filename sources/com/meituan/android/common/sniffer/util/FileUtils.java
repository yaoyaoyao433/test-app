package com.meituan.android.common.sniffer.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FileUtils {
    public static File writeGzipFile(String str, String str2) {
        GZIPOutputStream gZIPOutputStream;
        File file = new File(str);
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file, false)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            gZIPOutputStream.write(str2.getBytes());
            try {
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return file;
        } catch (Exception e3) {
            e = e3;
            gZIPOutputStream2 = gZIPOutputStream;
            e.printStackTrace();
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.finish();
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return file;
                }
            }
            if (gZIPOutputStream2 != null) {
                gZIPOutputStream2.close();
            }
            return file;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.finish();
                } catch (IOException e5) {
                    e5.printStackTrace();
                    throw th;
                }
            }
            if (gZIPOutputStream2 != null) {
                gZIPOutputStream2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0079 A[Catch: IOException -> 0x0075, TryCatch #4 {IOException -> 0x0075, blocks: (B:45:0x0071, B:49:0x0079, B:51:0x007e), top: B:57:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007e A[Catch: IOException -> 0x0075, TRY_LEAVE, TryCatch #4 {IOException -> 0x0075, blocks: (B:45:0x0071, B:49:0x0079, B:51:0x007e), top: B:57:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String unGzipToString(byte[] r6) {
        /*
            r0 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4d
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L6b
            r3.<init>()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L6b
        L1a:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L6b
            if (r4 == 0) goto L24
            r3.append(r4)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L6b
            goto L1a
        L24:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L6b
            r1.close()     // Catch: java.io.IOException -> L32
            r6.close()     // Catch: java.io.IOException -> L32
            r2.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r6 = move-exception
            r6.printStackTrace()
        L36:
            return r3
        L37:
            r3 = move-exception
            goto L51
        L39:
            r2 = move-exception
            r5 = r0
            r0 = r6
            r6 = r2
            r2 = r5
            goto L6f
        L3f:
            r3 = move-exception
            r2 = r0
            goto L51
        L42:
            r6 = move-exception
            r2 = r0
            goto L6f
        L45:
            r3 = move-exception
            r6 = r0
            r2 = r6
            goto L51
        L49:
            r6 = move-exception
            r1 = r0
            r2 = r1
            goto L6f
        L4d:
            r3 = move-exception
            r6 = r0
            r1 = r6
            r2 = r1
        L51:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L5c
        L5a:
            r6 = move-exception
            goto L67
        L5c:
            if (r6 == 0) goto L61
            r6.close()     // Catch: java.io.IOException -> L5a
        L61:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L6a
        L67:
            r6.printStackTrace()
        L6a:
            return r0
        L6b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
        L6f:
            if (r1 == 0) goto L77
            r1.close()     // Catch: java.io.IOException -> L75
            goto L77
        L75:
            r0 = move-exception
            goto L82
        L77:
            if (r0 == 0) goto L7c
            r0.close()     // Catch: java.io.IOException -> L75
        L7c:
            if (r2 == 0) goto L85
            r2.close()     // Catch: java.io.IOException -> L75
            goto L85
        L82:
            r0.printStackTrace()
        L85:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.sniffer.util.FileUtils.unGzipToString(byte[]):java.lang.String");
    }
}
