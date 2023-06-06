package com.huawei.updatesdk.a.a.b;

import android.content.Context;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    private HttpURLConnection a = null;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private String a;
        private int b;

        public int a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    private HttpURLConnection a(String str, Context context) {
        URL url = new URL(str);
        URLConnection wrapURLConnection = HttpURLWrapper.wrapURLConnection(url.openConnection());
        if (!(wrapURLConnection instanceof HttpsURLConnection)) {
            if (wrapURLConnection instanceof HttpURLConnection) {
                return (HttpURLConnection) HttpURLWrapper.wrapURLConnection(url.openConnection());
            }
            return null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) HttpURLWrapper.wrapURLConnection(url.openConnection());
        httpsURLConnection.setSSLSocketFactory(com.huawei.secure.android.common.ssl.b.a(context));
        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return httpsURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = 0;
        try {
            try {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream, bArr.length));
                        dataOutputStream2 = 0;
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    dataOutputStream2 = "HttpsUtil";
                    com.huawei.updatesdk.a.a.c.a.a.a.a("HttpsUtil", "gzip error!", e2);
                }
            } catch (IOException e3) {
                e = e3;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.write(bArr, 0, bArr.length);
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (IOException e4) {
            e = e4;
            dataOutputStream2 = dataOutputStream;
            com.huawei.updatesdk.a.a.c.a.a.a.a("HttpsUtil", "gzip error!", e);
            if (dataOutputStream2 != 0) {
                dataOutputStream2.close();
                dataOutputStream2 = dataOutputStream2;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.close();
                } catch (IOException e5) {
                    com.huawei.updatesdk.a.a.c.a.a.a.a("HttpsUtil", "gzip error!", e5);
                }
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.updatesdk.a.a.b.b.a a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.content.Context r8) {
        /*
            r3 = this;
            com.huawei.updatesdk.a.a.b.b$a r0 = new com.huawei.updatesdk.a.a.b.b$a
            r0.<init>()
            r1 = 0
            java.net.HttpURLConnection r4 = r3.a(r4, r8)     // Catch: java.lang.Throwable -> Lb9
            if (r4 != 0) goto L18
            if (r4 == 0) goto L11
            r4.disconnect()
        L11:
            com.huawei.updatesdk.a.a.d.d.a(r1)
        L14:
            com.huawei.updatesdk.a.a.d.d.a(r1)
            return r0
        L18:
            r3.a = r4     // Catch: java.lang.Throwable -> Lb7
            r8 = 1
            r4.setDoInput(r8)     // Catch: java.lang.Throwable -> Lb7
            r4.setDoOutput(r8)     // Catch: java.lang.Throwable -> Lb7
            r8 = 0
            r4.setUseCaches(r8)     // Catch: java.lang.Throwable -> Lb7
            r8 = 5000(0x1388, float:7.006E-42)
            r4.setConnectTimeout(r8)     // Catch: java.lang.Throwable -> Lb7
            r8 = 10000(0x2710, float:1.4013E-41)
            r4.setReadTimeout(r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = "POST"
            r4.setRequestMethod(r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = "Content-Type"
            java.lang.String r2 = "application/x-gzip"
            r4.setRequestProperty(r8, r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r4.setRequestProperty(r8, r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = "Connection"
            java.lang.String r2 = "Keep-Alive"
            r4.setRequestProperty(r8, r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = "User-Agent"
            r4.setRequestProperty(r8, r7)     // Catch: java.lang.Throwable -> Lb7
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> Lb7
            java.io.OutputStream r8 = r4.getOutputStream()     // Catch: java.lang.Throwable -> Lb7
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb7
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Throwable -> L7b
            byte[] r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L7b
            r7.write(r5)     // Catch: java.lang.Throwable -> L7b
            r7.flush()     // Catch: java.lang.Throwable -> L7b
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L7b
            com.huawei.updatesdk.a.a.b.b.a.a(r0, r5)     // Catch: java.lang.Throwable -> L7b
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L7d
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L7b
            java.io.InputStream r6 = r4.getInputStream()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7b
            goto L86
        L7b:
            r5 = move-exception
            goto Lbd
        L7d:
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L7b
            java.io.InputStream r6 = r4.getErrorStream()     // Catch: java.lang.Throwable -> L7b
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7b
        L86:
            r1 = r5
            com.huawei.updatesdk.a.a.d.b r5 = new com.huawei.updatesdk.a.a.d.b     // Catch: java.lang.Throwable -> L7b
            r5.<init>()     // Catch: java.lang.Throwable -> L7b
            com.huawei.updatesdk.a.a.b.a r6 = com.huawei.updatesdk.a.a.b.a.b()     // Catch: java.lang.Throwable -> L7b
            byte[] r6 = r6.a()     // Catch: java.lang.Throwable -> L7b
        L94:
            int r8 = r1.read(r6)     // Catch: java.lang.Throwable -> L7b
            r2 = -1
            if (r8 == r2) goto L9f
            r5.a(r6, r8)     // Catch: java.lang.Throwable -> L7b
            goto L94
        L9f:
            com.huawei.updatesdk.a.a.b.a r8 = com.huawei.updatesdk.a.a.b.a.b()     // Catch: java.lang.Throwable -> L7b
            r8.a(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = r5.a()     // Catch: java.lang.Throwable -> L7b
            com.huawei.updatesdk.a.a.b.b.a.a(r0, r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto Lb2
            r4.disconnect()
        Lb2:
            com.huawei.updatesdk.a.a.d.d.a(r7)
            goto L14
        Lb7:
            r5 = move-exception
            goto Lbc
        Lb9:
            r4 = move-exception
            r5 = r4
            r4 = r1
        Lbc:
            r7 = r1
        Lbd:
            if (r4 == 0) goto Lc2
            r4.disconnect()
        Lc2:
            com.huawei.updatesdk.a.a.d.d.a(r7)
            com.huawei.updatesdk.a.a.d.d.a(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.a.b.b.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context):com.huawei.updatesdk.a.a.b.b$a");
    }

    public void a() {
        HttpURLConnection httpURLConnection = this.a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
