package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a0 {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static b0 a(String str, byte[] bArr, Map<String, String> map) {
        return a(str, bArr, map, "POST");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.io.OutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.hms.hatool.b0 a(java.lang.String r4, byte[] r5, java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.a0.a(java.lang.String, byte[], java.util.Map, java.lang.String):com.huawei.hms.hatool.b0");
    }

    public static HttpURLConnection a(String str, int i, Map<String, String> map, String str2) {
        if (TextUtils.isEmpty(str)) {
            y.b("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        a(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.net.HttpURLConnection r3) {
        /*
            boolean r0 = r3 instanceof javax.net.ssl.HttpsURLConnection
            if (r0 == 0) goto L4c
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3
            r0 = 0
            android.content.Context r1 = com.huawei.hms.hatool.b.f()     // Catch: java.lang.IllegalAccessException -> L11 java.io.IOException -> L18 java.security.GeneralSecurityException -> L1f java.security.KeyStoreException -> L26 java.security.NoSuchAlgorithmException -> L2d
            com.huawei.secure.android.common.ssl.b r1 = com.huawei.secure.android.common.ssl.b.a(r1)     // Catch: java.lang.IllegalAccessException -> L11 java.io.IOException -> L18 java.security.GeneralSecurityException -> L1f java.security.KeyStoreException -> L26 java.security.NoSuchAlgorithmException -> L2d
            r0 = r1
            goto L36
        L11:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r2 = "getSocketFactory(): Illegal Access Exception "
            goto L33
        L18:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r2 = "getSocketFactory(): IO Exception!"
            goto L33
        L1f:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r2 = "getSocketFactory(): General Security Exception"
            goto L33
        L26:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r2 = "getSocketFactory(): Key Store exception"
            goto L33
        L2d:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r2 = "getSocketFactory(): Algorithm Exception!"
        L33:
            com.huawei.hms.hatool.y.f(r1, r2)
        L36:
            if (r0 == 0) goto L44
            r3.setSSLSocketFactory(r0)
            com.huawei.secure.android.common.ssl.hostname.a r0 = new com.huawei.secure.android.common.ssl.hostname.a
            r0.<init>()
            r3.setHostnameVerifier(r0)
            return
        L44:
            com.huawei.hms.hatool.a0$a r3 = new com.huawei.hms.hatool.a0$a
            java.lang.String r0 = "No ssl socket factory set"
            r3.<init>(r0)
            throw r3
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.a0.a(java.net.HttpURLConnection):void");
    }

    public static String b(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            String a2 = r0.a(inputStream);
            r0.a((Closeable) inputStream);
            return a2;
        } catch (IOException unused2) {
            inputStream2 = inputStream;
            int responseCode = httpURLConnection.getResponseCode();
            y.f("hmsSdk", "When Response Content From Connection inputStream operation exception! " + responseCode);
            r0.a((Closeable) inputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            r0.a((Closeable) inputStream2);
            throw th;
        }
    }
}
