package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class d {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        GET("GET"),
        POST("POST");
        
        public String d;

        a(String str) {
            this.d = str;
        }

        public final String a() {
            return this.d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.io.OutputStream, java.io.FilterOutputStream, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.InputStream] */
    public static String a(Context context, String str, String str2, Map<String, String> map) {
        Throwable th;
        Object obj;
        Object obj2;
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        HttpURLConnection httpURLConnection2;
        BufferedInputStream bufferedInputStream2;
        HttpURLConnection httpURLConnection3;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        int i;
        BufferedInputStream bufferedInputStream5;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection4;
        if (str2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        ?? r1 = -1;
        try {
            try {
                context = a((Context) context, (String) str, (Map<String, String>) map, a.POST.a());
                if (context == 0) {
                    com.huawei.secure.android.common.util.a.a((OutputStream) null);
                    com.huawei.secure.android.common.util.a.a((InputStream) null);
                    com.huawei.secure.android.common.util.a.a((InputStream) null);
                    s.a((HttpURLConnection) context);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                }
                try {
                    str = new BufferedOutputStream(context.getOutputStream());
                    try {
                        try {
                            str.write(str2.getBytes("UTF-8"));
                            str.flush();
                            i = context.getResponseCode();
                            try {
                                StringBuilder sb = new StringBuilder();
                                sb.append("http post response code: ");
                                sb.append(i);
                                HMSLog.d("PushHttpClient", sb.toString());
                                if (i >= 400) {
                                    map = context.getErrorStream();
                                } else {
                                    map = context.getInputStream();
                                }
                            } catch (IOException unused) {
                                map = null;
                                bufferedInputStream4 = null;
                            } catch (RuntimeException unused2) {
                                map = null;
                                bufferedInputStream4 = null;
                            } catch (Exception unused3) {
                                map = null;
                                bufferedInputStream4 = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            map = 0;
                            context = context;
                            str = str;
                            r1 = map;
                            com.huawei.secure.android.common.util.a.a((OutputStream) str);
                            com.huawei.secure.android.common.util.a.a((InputStream) map);
                            com.huawei.secure.android.common.util.a.a((InputStream) r1);
                            s.a((HttpURLConnection) context);
                            HMSLog.i("PushHttpClient", "close connection");
                            throw th;
                        }
                    } catch (IOException unused4) {
                        map = null;
                        context = context;
                        str = str;
                        bufferedInputStream4 = map;
                        i = -1;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("http execute encounter IOException - http code:");
                        sb2.append(i);
                        HMSLog.w("PushHttpClient", sb2.toString());
                        httpURLConnection4 = context;
                        outputStream = str;
                        bufferedInputStream5 = map;
                        com.huawei.secure.android.common.util.a.a(outputStream);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                        s.a(httpURLConnection4);
                        HMSLog.i("PushHttpClient", "close connection");
                        return null;
                    } catch (RuntimeException unused5) {
                        map = 0;
                        context = context;
                        str = str;
                        bufferedInputStream4 = map;
                        i = -1;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("http execute encounter RuntimeException - http code:");
                        sb3.append(i);
                        HMSLog.w("PushHttpClient", sb3.toString());
                        httpURLConnection4 = context;
                        outputStream = str;
                        bufferedInputStream5 = map;
                        com.huawei.secure.android.common.util.a.a(outputStream);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                        s.a(httpURLConnection4);
                        HMSLog.i("PushHttpClient", "close connection");
                        return null;
                    } catch (Exception unused6) {
                        map = null;
                        context = context;
                        str = str;
                        bufferedInputStream4 = map;
                        i = -1;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("http execute encounter unknown exception - http code:");
                        sb4.append(i);
                        HMSLog.w("PushHttpClient", sb4.toString());
                        httpURLConnection4 = context;
                        outputStream = str;
                        bufferedInputStream5 = map;
                        com.huawei.secure.android.common.util.a.a(outputStream);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                        s.a(httpURLConnection4);
                        HMSLog.i("PushHttpClient", "close connection");
                        return null;
                    }
                } catch (IOException unused7) {
                    bufferedInputStream3 = null;
                    httpURLConnection3 = context;
                    map = bufferedInputStream3;
                    context = httpURLConnection3;
                    str = bufferedInputStream3;
                    bufferedInputStream4 = map;
                    i = -1;
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("http execute encounter IOException - http code:");
                    sb22.append(i);
                    HMSLog.w("PushHttpClient", sb22.toString());
                    httpURLConnection4 = context;
                    outputStream = str;
                    bufferedInputStream5 = map;
                    com.huawei.secure.android.common.util.a.a(outputStream);
                    com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                    com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                    s.a(httpURLConnection4);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (RuntimeException unused8) {
                    bufferedInputStream2 = null;
                    httpURLConnection2 = context;
                    map = bufferedInputStream2;
                    context = httpURLConnection2;
                    str = bufferedInputStream2;
                    bufferedInputStream4 = map;
                    i = -1;
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append("http execute encounter RuntimeException - http code:");
                    sb32.append(i);
                    HMSLog.w("PushHttpClient", sb32.toString());
                    httpURLConnection4 = context;
                    outputStream = str;
                    bufferedInputStream5 = map;
                    com.huawei.secure.android.common.util.a.a(outputStream);
                    com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                    com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                    s.a(httpURLConnection4);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Exception unused9) {
                    bufferedInputStream = null;
                    httpURLConnection = context;
                    map = bufferedInputStream;
                    context = httpURLConnection;
                    str = bufferedInputStream;
                    bufferedInputStream4 = map;
                    i = -1;
                    StringBuilder sb42 = new StringBuilder();
                    sb42.append("http execute encounter unknown exception - http code:");
                    sb42.append(i);
                    HMSLog.w("PushHttpClient", sb42.toString());
                    httpURLConnection4 = context;
                    outputStream = str;
                    bufferedInputStream5 = map;
                    com.huawei.secure.android.common.util.a.a(outputStream);
                    com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                    com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                    s.a(httpURLConnection4);
                    HMSLog.i("PushHttpClient", "close connection");
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    obj2 = null;
                    obj = context;
                    map = obj2;
                    context = obj;
                    str = obj2;
                    r1 = map;
                    com.huawei.secure.android.common.util.a.a((OutputStream) str);
                    com.huawei.secure.android.common.util.a.a((InputStream) map);
                    com.huawei.secure.android.common.util.a.a((InputStream) r1);
                    s.a((HttpURLConnection) context);
                    HMSLog.i("PushHttpClient", "close connection");
                    throw th;
                }
                try {
                    bufferedInputStream4 = new BufferedInputStream(map);
                    try {
                        String a2 = s.a((InputStream) bufferedInputStream4);
                        com.huawei.secure.android.common.util.a.a((OutputStream) str);
                        com.huawei.secure.android.common.util.a.a((InputStream) map);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                        s.a((HttpURLConnection) context);
                        HMSLog.i("PushHttpClient", "close connection");
                        return a2;
                    } catch (IOException unused10) {
                        StringBuilder sb222 = new StringBuilder();
                        sb222.append("http execute encounter IOException - http code:");
                        sb222.append(i);
                        HMSLog.w("PushHttpClient", sb222.toString());
                        httpURLConnection4 = context;
                        outputStream = str;
                        bufferedInputStream5 = map;
                        com.huawei.secure.android.common.util.a.a(outputStream);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                        s.a(httpURLConnection4);
                        HMSLog.i("PushHttpClient", "close connection");
                        return null;
                    } catch (RuntimeException unused11) {
                        StringBuilder sb322 = new StringBuilder();
                        sb322.append("http execute encounter RuntimeException - http code:");
                        sb322.append(i);
                        HMSLog.w("PushHttpClient", sb322.toString());
                        httpURLConnection4 = context;
                        outputStream = str;
                        bufferedInputStream5 = map;
                        com.huawei.secure.android.common.util.a.a(outputStream);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                        s.a(httpURLConnection4);
                        HMSLog.i("PushHttpClient", "close connection");
                        return null;
                    } catch (Exception unused12) {
                        StringBuilder sb422 = new StringBuilder();
                        sb422.append("http execute encounter unknown exception - http code:");
                        sb422.append(i);
                        HMSLog.w("PushHttpClient", sb422.toString());
                        httpURLConnection4 = context;
                        outputStream = str;
                        bufferedInputStream5 = map;
                        com.huawei.secure.android.common.util.a.a(outputStream);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream5);
                        com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream4);
                        s.a(httpURLConnection4);
                        HMSLog.i("PushHttpClient", "close connection");
                        return null;
                    }
                } catch (IOException unused13) {
                    bufferedInputStream4 = null;
                } catch (RuntimeException unused14) {
                    bufferedInputStream4 = null;
                } catch (Exception unused15) {
                    bufferedInputStream4 = null;
                } catch (Throwable th4) {
                    th = th4;
                    r1 = 0;
                    com.huawei.secure.android.common.util.a.a((OutputStream) str);
                    com.huawei.secure.android.common.util.a.a((InputStream) map);
                    com.huawei.secure.android.common.util.a.a((InputStream) r1);
                    s.a((HttpURLConnection) context);
                    HMSLog.i("PushHttpClient", "close connection");
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException unused16) {
            httpURLConnection3 = null;
            bufferedInputStream3 = null;
        } catch (RuntimeException unused17) {
            httpURLConnection2 = null;
            bufferedInputStream2 = null;
        } catch (Exception unused18) {
            httpURLConnection = null;
            bufferedInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            obj = null;
            obj2 = null;
        }
    }

    public static HttpURLConnection a(Context context, String str, Map<String, String> map, String str2) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        a(context, httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Content-type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), "UTF-8"));
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r1, java.net.HttpURLConnection r2) throws java.lang.Exception {
        /*
            boolean r0 = r2 instanceof javax.net.ssl.HttpsURLConnection
            if (r0 == 0) goto L4e
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2
            com.huawei.secure.android.common.ssl.b r1 = com.huawei.secure.android.common.ssl.b.a(r1)     // Catch: java.lang.IllegalArgumentException -> Lb java.lang.IllegalAccessException -> L13 java.io.IOException -> L1b java.security.GeneralSecurityException -> L23 java.security.KeyStoreException -> L2b java.security.NoSuchAlgorithmException -> L33
            goto L3b
        Lb:
            java.lang.String r1 = "PushHttpClient"
            java.lang.String r0 = "Get SocketFactory Illegal Argument Exception."
            com.huawei.hms.support.log.HMSLog.w(r1, r0)
            goto L3a
        L13:
            java.lang.String r1 = "PushHttpClient"
            java.lang.String r0 = "Get SocketFactory Illegal Access Exception."
            com.huawei.hms.support.log.HMSLog.w(r1, r0)
            goto L3a
        L1b:
            java.lang.String r1 = "PushHttpClient"
            java.lang.String r0 = "Get SocketFactory IO Exception."
            com.huawei.hms.support.log.HMSLog.w(r1, r0)
            goto L3a
        L23:
            java.lang.String r1 = "PushHttpClient"
            java.lang.String r0 = "Get SocketFactory General Security Exception."
            com.huawei.hms.support.log.HMSLog.w(r1, r0)
            goto L3a
        L2b:
            java.lang.String r1 = "PushHttpClient"
            java.lang.String r0 = "Get SocketFactory Key Store exception."
            com.huawei.hms.support.log.HMSLog.w(r1, r0)
            goto L3a
        L33:
            java.lang.String r1 = "PushHttpClient"
            java.lang.String r0 = "Get SocketFactory Algorithm Exception."
            com.huawei.hms.support.log.HMSLog.w(r1, r0)
        L3a:
            r1 = 0
        L3b:
            if (r1 == 0) goto L46
            r2.setSSLSocketFactory(r1)
            org.apache.http.conn.ssl.X509HostnameVerifier r1 = com.huawei.secure.android.common.ssl.b.b
            r2.setHostnameVerifier(r1)
            return
        L46:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "No ssl socket factory set."
            r1.<init>(r2)
            throw r1
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.opendevice.d.a(android.content.Context, java.net.HttpURLConnection):void");
    }
}
