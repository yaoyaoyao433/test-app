package com.tencent.map.geolocation.a.b;

import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static int a = 20000;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r7, byte[] r8) {
        /*
            r0 = 20000(0x4e20, float:2.8026E-41)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.net.URLConnection r7 = r2.openConnection()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.net.URLConnection r7 = com.meituan.metrics.traffic.hurl.HttpURLWrapper.wrapURLConnection(r7)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            int r2 = com.tencent.map.geolocation.a.b.f.a     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r7.setConnectTimeout(r2)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            int r2 = com.tencent.map.geolocation.a.b.f.a     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r7.setReadTimeout(r2)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r2 = 1
            r7.setDoInput(r2)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r7.setDoOutput(r2)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            java.lang.String r2 = "POST"
            r7.setRequestMethod(r2)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r2 = 0
            r7.setUseCaches(r2)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r3, r4)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            java.lang.String r3 = "Content-Length"
            int r4 = r8.length     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r7.setRequestProperty(r3, r4)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            java.io.OutputStream r3 = r7.getOutputStream()     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r3.write(r8)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            int r8 = r7.getResponseCode()     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r3 = 200(0xc8, float:2.8E-43)
            if (r8 != r3) goto L6e
            java.io.InputStream r8 = r7.getInputStream()     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r3.<init>()     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r4 = 128(0x80, float:1.794E-43)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
        L59:
            int r5 = r8.read(r4)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            r6 = -1
            if (r5 == r6) goto L64
            r3.write(r4, r2, r5)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            goto L59
        L64:
            byte[] r8 = r3.toByteArray()     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L82
            if (r7 == 0) goto L6d
            r7.disconnect()
        L6d:
            return r8
        L6e:
            if (r7 == 0) goto L73
            r7.disconnect()
        L73:
            com.tencent.map.geolocation.a.b.f.a = r0
            return r1
        L76:
            r8 = move-exception
            r7 = r1
            goto L83
        L79:
            r7 = r1
        L7a:
            com.tencent.map.geolocation.a.b.f.a = r0     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L81
            r7.disconnect()
        L81:
            return r1
        L82:
            r8 = move-exception
        L83:
            if (r7 == 0) goto L88
            r7.disconnect()
        L88:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.a.b.f.a(java.lang.String, byte[]):byte[]");
    }

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            URLConnection wrapURLConnection = HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
            wrapURLConnection.connect();
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = wrapURLConnection.getInputStream().read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return byteArray;
            } catch (Exception unused2) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
