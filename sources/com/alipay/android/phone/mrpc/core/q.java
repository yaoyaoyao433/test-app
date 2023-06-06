package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q implements Callable<u> {
    public static final HttpRequestRetryHandler e = new ad();
    public l a;
    public Context b;
    public o c;
    public String d;
    public HttpUriRequest f;
    public CookieManager i;
    public AbstractHttpEntity j;
    public HttpHost k;
    public URL l;
    public String q;
    public HttpContext g = new BasicHttpContext();
    public CookieStore h = new BasicCookieStore();
    public int m = 0;
    public boolean n = false;
    public boolean o = false;
    public String p = null;

    public q(l lVar, o oVar) {
        this.a = lVar;
        this.b = lVar.a;
        this.c = oVar;
    }

    public static long a(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i])) {
                int i2 = i + 1;
                if (strArr[i2] != null) {
                    try {
                        return Long.parseLong(strArr[i2]);
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return 0L;
    }

    public static HttpUrlHeader a(HttpResponse httpResponse) {
        Header[] allHeaders;
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    private u a(HttpResponse httpResponse, int i, String str) {
        String str2;
        new StringBuilder("开始handle，handleResponse-1,").append(Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
                return null;
            }
            return null;
        }
        new StringBuilder("200，开始处理，handleResponse-2,threadid = ").append(Thread.currentThread().getId());
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a(entity, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.o = false;
                this.a.c(System.currentTimeMillis() - currentTimeMillis);
                this.a.a(byteArray.length);
                new StringBuilder("res:").append(byteArray.length);
                p pVar = new p(a(httpResponse), i, str, byteArray);
                long b = b(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> a = a(contentType.getValue());
                    str3 = a.get("charset");
                    str2 = a.get("Content-Type");
                } else {
                    str2 = null;
                }
                pVar.b(str2);
                pVar.a(str3);
                pVar.a(System.currentTimeMillis());
                pVar.b(b);
                try {
                    byteArrayOutputStream2.close();
                    return pVar;
                } catch (IOException e2) {
                    throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        throw new RuntimeException("ArrayOutputStream close error!", e3.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static HashMap<String, String> a(String str) {
        String[] split;
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split2 = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            hashMap.put(split2[0], split2[1]);
        }
        return hashMap;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream a = b.a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = a.read(bArr);
                    if (read == -1 || this.c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    this.c.f();
                }
                outputStream.flush();
            } catch (Exception e2) {
                e2.getCause();
                throw new IOException("HttpWorker Request Error!" + e2.getLocalizedMessage());
            }
        } finally {
            r.a(a);
        }
    }

    public static long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private URI b() {
        String a = this.c.a();
        String str = this.d;
        if (str != null) {
            a = str;
        }
        if (a != null) {
            return new URI(a);
        }
        throw new RuntimeException("url should not be null");
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.j == null) {
            byte[] b = this.c.b();
            String b2 = this.c.b("gzip");
            if (b != null) {
                if (TextUtils.equals(b2, "true")) {
                    this.j = b.a(b);
                } else {
                    this.j = new ByteArrayEntity(b);
                }
                this.j.setContentType(this.c.c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f = httpPost;
        } else {
            this.f = new HttpGet(b());
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108 A[Catch: Exception -> 0x0265, NullPointerException -> 0x0287, IOException -> 0x02ab, UnknownHostException -> 0x02d5, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, SocketTimeoutException -> 0x0350, ConnectTimeoutException -> 0x037b, ConnectionPoolTimeoutException -> 0x03a5, SSLException -> 0x03cf, SSLPeerUnverifiedException -> 0x03f9, SSLHandshakeException -> 0x0423, URISyntaxException -> 0x044d, HttpException -> 0x045a, TryCatch #3 {SSLException -> 0x03cf, Exception -> 0x0265, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, HttpException -> 0x045a, NullPointerException -> 0x0287, SocketTimeoutException -> 0x0350, URISyntaxException -> 0x044d, UnknownHostException -> 0x02d5, SSLHandshakeException -> 0x0423, SSLPeerUnverifiedException -> 0x03f9, ConnectTimeoutException -> 0x037b, IOException -> 0x02ab, ConnectionPoolTimeoutException -> 0x03a5, blocks: (B:3:0x0004, B:17:0x0032, B:19:0x003a, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:25:0x0058, B:27:0x006c, B:29:0x0081, B:31:0x00c1, B:33:0x00d2, B:35:0x00d8, B:37:0x00e2, B:40:0x00eb, B:42:0x00f7, B:46:0x0101, B:48:0x0108, B:50:0x0123, B:52:0x012b, B:53:0x0138, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:59:0x0170, B:61:0x0176, B:63:0x0182, B:67:0x01b1, B:68:0x01cd, B:76:0x01ea, B:77:0x0203, B:78:0x0204, B:80:0x020c, B:82:0x0212, B:89:0x0222, B:91:0x0232, B:93:0x023a, B:95:0x0244, B:49:0x010b, B:97:0x0259, B:98:0x0264, B:6:0x0017, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:15:0x002d), top: B:183:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: Exception -> 0x0265, NullPointerException -> 0x0287, IOException -> 0x02ab, UnknownHostException -> 0x02d5, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, SocketTimeoutException -> 0x0350, ConnectTimeoutException -> 0x037b, ConnectionPoolTimeoutException -> 0x03a5, SSLException -> 0x03cf, SSLPeerUnverifiedException -> 0x03f9, SSLHandshakeException -> 0x0423, URISyntaxException -> 0x044d, HttpException -> 0x045a, TryCatch #3 {SSLException -> 0x03cf, Exception -> 0x0265, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, HttpException -> 0x045a, NullPointerException -> 0x0287, SocketTimeoutException -> 0x0350, URISyntaxException -> 0x044d, UnknownHostException -> 0x02d5, SSLHandshakeException -> 0x0423, SSLPeerUnverifiedException -> 0x03f9, ConnectTimeoutException -> 0x037b, IOException -> 0x02ab, ConnectionPoolTimeoutException -> 0x03a5, blocks: (B:3:0x0004, B:17:0x0032, B:19:0x003a, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:25:0x0058, B:27:0x006c, B:29:0x0081, B:31:0x00c1, B:33:0x00d2, B:35:0x00d8, B:37:0x00e2, B:40:0x00eb, B:42:0x00f7, B:46:0x0101, B:48:0x0108, B:50:0x0123, B:52:0x012b, B:53:0x0138, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:59:0x0170, B:61:0x0176, B:63:0x0182, B:67:0x01b1, B:68:0x01cd, B:76:0x01ea, B:77:0x0203, B:78:0x0204, B:80:0x020c, B:82:0x0212, B:89:0x0222, B:91:0x0232, B:93:0x023a, B:95:0x0244, B:49:0x010b, B:97:0x0259, B:98:0x0264, B:6:0x0017, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:15:0x002d), top: B:183:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b A[Catch: Exception -> 0x0265, NullPointerException -> 0x0287, IOException -> 0x02ab, UnknownHostException -> 0x02d5, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, SocketTimeoutException -> 0x0350, ConnectTimeoutException -> 0x037b, ConnectionPoolTimeoutException -> 0x03a5, SSLException -> 0x03cf, SSLPeerUnverifiedException -> 0x03f9, SSLHandshakeException -> 0x0423, URISyntaxException -> 0x044d, HttpException -> 0x045a, TryCatch #3 {SSLException -> 0x03cf, Exception -> 0x0265, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, HttpException -> 0x045a, NullPointerException -> 0x0287, SocketTimeoutException -> 0x0350, URISyntaxException -> 0x044d, UnknownHostException -> 0x02d5, SSLHandshakeException -> 0x0423, SSLPeerUnverifiedException -> 0x03f9, ConnectTimeoutException -> 0x037b, IOException -> 0x02ab, ConnectionPoolTimeoutException -> 0x03a5, blocks: (B:3:0x0004, B:17:0x0032, B:19:0x003a, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:25:0x0058, B:27:0x006c, B:29:0x0081, B:31:0x00c1, B:33:0x00d2, B:35:0x00d8, B:37:0x00e2, B:40:0x00eb, B:42:0x00f7, B:46:0x0101, B:48:0x0108, B:50:0x0123, B:52:0x012b, B:53:0x0138, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:59:0x0170, B:61:0x0176, B:63:0x0182, B:67:0x01b1, B:68:0x01cd, B:76:0x01ea, B:77:0x0203, B:78:0x0204, B:80:0x020c, B:82:0x0212, B:89:0x0222, B:91:0x0232, B:93:0x023a, B:95:0x0244, B:49:0x010b, B:97:0x0259, B:98:0x0264, B:6:0x0017, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:15:0x002d), top: B:183:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f A[Catch: Exception -> 0x0265, NullPointerException -> 0x0287, IOException -> 0x02ab, UnknownHostException -> 0x02d5, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, SocketTimeoutException -> 0x0350, ConnectTimeoutException -> 0x037b, ConnectionPoolTimeoutException -> 0x03a5, SSLException -> 0x03cf, SSLPeerUnverifiedException -> 0x03f9, SSLHandshakeException -> 0x0423, URISyntaxException -> 0x044d, HttpException -> 0x045a, TryCatch #3 {SSLException -> 0x03cf, Exception -> 0x0265, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, HttpException -> 0x045a, NullPointerException -> 0x0287, SocketTimeoutException -> 0x0350, URISyntaxException -> 0x044d, UnknownHostException -> 0x02d5, SSLHandshakeException -> 0x0423, SSLPeerUnverifiedException -> 0x03f9, ConnectTimeoutException -> 0x037b, IOException -> 0x02ab, ConnectionPoolTimeoutException -> 0x03a5, blocks: (B:3:0x0004, B:17:0x0032, B:19:0x003a, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:25:0x0058, B:27:0x006c, B:29:0x0081, B:31:0x00c1, B:33:0x00d2, B:35:0x00d8, B:37:0x00e2, B:40:0x00eb, B:42:0x00f7, B:46:0x0101, B:48:0x0108, B:50:0x0123, B:52:0x012b, B:53:0x0138, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:59:0x0170, B:61:0x0176, B:63:0x0182, B:67:0x01b1, B:68:0x01cd, B:76:0x01ea, B:77:0x0203, B:78:0x0204, B:80:0x020c, B:82:0x0212, B:89:0x0222, B:91:0x0232, B:93:0x023a, B:95:0x0244, B:49:0x010b, B:97:0x0259, B:98:0x0264, B:6:0x0017, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:15:0x002d), top: B:183:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c A[Catch: Exception -> 0x0265, NullPointerException -> 0x0287, IOException -> 0x02ab, UnknownHostException -> 0x02d5, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, SocketTimeoutException -> 0x0350, ConnectTimeoutException -> 0x037b, ConnectionPoolTimeoutException -> 0x03a5, SSLException -> 0x03cf, SSLPeerUnverifiedException -> 0x03f9, SSLHandshakeException -> 0x0423, URISyntaxException -> 0x044d, HttpException -> 0x045a, TryCatch #3 {SSLException -> 0x03cf, Exception -> 0x0265, HttpHostConnectException -> 0x0301, NoHttpResponseException -> 0x0325, HttpException -> 0x045a, NullPointerException -> 0x0287, SocketTimeoutException -> 0x0350, URISyntaxException -> 0x044d, UnknownHostException -> 0x02d5, SSLHandshakeException -> 0x0423, SSLPeerUnverifiedException -> 0x03f9, ConnectTimeoutException -> 0x037b, IOException -> 0x02ab, ConnectionPoolTimeoutException -> 0x03a5, blocks: (B:3:0x0004, B:17:0x0032, B:19:0x003a, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:25:0x0058, B:27:0x006c, B:29:0x0081, B:31:0x00c1, B:33:0x00d2, B:35:0x00d8, B:37:0x00e2, B:40:0x00eb, B:42:0x00f7, B:46:0x0101, B:48:0x0108, B:50:0x0123, B:52:0x012b, B:53:0x0138, B:55:0x015f, B:56:0x0166, B:58:0x016c, B:59:0x0170, B:61:0x0176, B:63:0x0182, B:67:0x01b1, B:68:0x01cd, B:76:0x01ea, B:77:0x0203, B:78:0x0204, B:80:0x020c, B:82:0x0212, B:89:0x0222, B:91:0x0232, B:93:0x023a, B:95:0x0244, B:49:0x010b, B:97:0x0259, B:98:0x0264, B:6:0x0017, B:8:0x001b, B:10:0x001f, B:12:0x0025, B:15:0x002d), top: B:183:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1  */
    @Override // java.util.concurrent.Callable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alipay.android.phone.mrpc.core.u call() {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mrpc.core.q.call():com.alipay.android.phone.mrpc.core.u");
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (TextUtils.isEmpty(this.q)) {
            String b = this.c.b("operationType");
            this.q = b;
            return b;
        }
        return this.q;
    }

    private int g() {
        URL h = h();
        return h.getPort() == -1 ? h.getDefaultPort() : h.getPort();
    }

    private URL h() {
        URL url = this.l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.c.a());
        this.l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.i = cookieManager2;
        return cookieManager2;
    }

    public final o a() {
        return this.c;
    }
}
