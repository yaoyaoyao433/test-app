package com.meizu.cloud.pushsdk.notification.c;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public final class e {
    private final File a;
    private final File b;
    private final String c;

    public e(String str, String str2) {
        this.a = new File(str);
        this.b = new File(str2);
        this.c = this.b.getAbsolutePath();
        DebugLogger.i("ZipExtractTask", "Extract mInput file = " + this.a.toString());
        DebugLogger.i("ZipExtractTask", "Extract mOutput file = " + this.b.toString());
    }

    private static int a(InputStream inputStream, OutputStream outputStream) {
        String str;
        StringBuilder sb;
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
        int i = 0;
        while (true) {
            try {
                try {
                    int read = bufferedInputStream.read(bArr, 0, 8192);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                    i += read;
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e) {
                        DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e.toString());
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                        DebugLogger.e("ZipExtractTask", "in.close() IOException e=" + e2.toString());
                    }
                    throw th;
                }
            } catch (IOException e3) {
                DebugLogger.e("ZipExtractTask", "Extracted IOException:" + e3.toString());
                try {
                    bufferedOutputStream.close();
                } catch (IOException e4) {
                    DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e4.toString());
                }
                try {
                    bufferedInputStream.close();
                } catch (IOException e5) {
                    e = e5;
                    str = "ZipExtractTask";
                    sb = new StringBuilder("in.close() IOException e=");
                    sb.append(e.toString());
                    DebugLogger.e(str, sb.toString());
                    return i;
                }
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e6) {
            DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e6.toString());
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e7) {
            e = e7;
            str = "ZipExtractTask";
            sb = new StringBuilder("in.close() IOException e=");
            sb.append(e.toString());
            DebugLogger.e(str, sb.toString());
            return i;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r9 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        r10 = r9.split("/")[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.i("ZipExtractTask", "Extract temp directory=" + r13.b + "/" + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011e, code lost:
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0122, code lost:
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0126, code lost:
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012e, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.e("ZipExtractTask", "Extracted Exception " + r7.toString());
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (r2 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0147, code lost:
        r2.close();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014d, code lost:
        r6 = "ZipExtractTask";
        r7 = new java.lang.StringBuilder("Extracted IOException:");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0156, code lost:
        r7.append(r2.toString());
        com.meizu.cloud.pushinternal.DebugLogger.e(r6, r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0167, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.e("ZipExtractTask", "Extracted IOException:" + r7.toString());
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017e, code lost:
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0180, code lost:
        r2.close();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0184, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0185, code lost:
        r6 = "ZipExtractTask";
        r7 = new java.lang.StringBuilder("Extracted IOException:");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0191, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.e("ZipExtractTask", "ZipException :" + r7.toString());
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a8, code lost:
        if (r2 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01aa, code lost:
        r2.close();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ae, code lost:
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01af, code lost:
        r6 = "ZipExtractTask";
        r7 = new java.lang.StringBuilder("Extracted IOException:");
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a() {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.c.e.a():long");
    }
}
