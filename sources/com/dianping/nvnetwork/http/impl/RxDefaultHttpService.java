package com.dianping.nvnetwork.http.impl;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.http.impl.a;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.util.k;
import com.dianping.nvnetwork.util.l;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.titans.proxy.util.Constants;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import rx.d;
import rx.g;
import rx.j;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class RxDefaultHttpService implements com.dianping.nvnetwork.http.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final g scheduler;
    private final com.dianping.nvnetwork.util.a byteArrayPool;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 16, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.dianping.nvnetwork.http.impl.RxDefaultHttpService.1
            public static ChangeQuickRedirect a;
            private final AtomicInteger b = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(@NonNull Runnable runnable) {
                Object[] objArr = {runnable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "728d2dd00804f73965f2cde37d5dec47", 6917529027641081856L)) {
                    return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "728d2dd00804f73965f2cde37d5dec47");
                }
                return new Thread(runnable, "shark_sdk_http_exec_pool_" + this.b.getAndIncrement());
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduler = rx.schedulers.a.a(threadPoolExecutor);
    }

    public RxDefaultHttpService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "724954cbcc844f8d0a0553f612195db6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "724954cbcc844f8d0a0553f612195db6");
            return;
        }
        this.byteArrayPool = new com.dianping.nvnetwork.util.a(4096);
        if (Build.VERSION.SDK_INT >= 23) {
            boolean isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            com.dianping.networklog.c.a("cleartextTrafficPermitted=" + isCleartextTrafficPermitted, 4);
        }
    }

    @Override // com.dianping.nvnetwork.http.a
    public d<q> exec(final Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b738ee984b9a7b0cb1fa208ced251471", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b738ee984b9a7b0cb1fa208ced251471");
        }
        d<q> a2 = d.a((d.a) new d.a<q>() { // from class: com.dianping.nvnetwork.http.impl.RxDefaultHttpService.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                j jVar = (j) obj;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "64fd6512e2aa187e9824e600f365d0fe", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "64fd6512e2aa187e9824e600f365d0fe");
                } else if (jVar.isUnsubscribed()) {
                } else {
                    q execSync = RxDefaultHttpService.this.execSync(request);
                    if (jVar.isUnsubscribed()) {
                        return;
                    }
                    execSync.c = 3;
                    jVar.onNext(execSync);
                    jVar.onCompleted();
                }
            }
        });
        return !request.r ? a2.b(scheduler) : a2;
    }

    public synchronized void logger(Request request, int i, Exception exc) {
    }

    public void log(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76842eb913e9bc125692160442763411", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76842eb913e9bc125692160442763411");
        } else {
            com.dianping.nvnetwork.util.g.a(str);
        }
    }

    private int read(InputStream inputStream, byte[] bArr) throws Exception {
        Object[] objArr = {inputStream, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4e56cb0c62806a03f6efb8d18dfd1f8", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4e56cb0c62806a03f6efb8d18dfd1f8")).intValue();
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException("task canceled.");
        }
        return inputStream.read(bArr);
    }

    private String getOriginalUrl(HttpURLConnection httpURLConnection) {
        Object[] objArr = {httpURLConnection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24acbab31a0c732d16717aabcf63ddea", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24acbab31a0c732d16717aabcf63ddea");
        }
        if (httpURLConnection != null) {
            try {
                return httpURLConnection.getURL().toString();
            } catch (Exception e) {
                log(e.getMessage());
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025d A[Catch: all -> 0x026e, TryCatch #9 {all -> 0x026e, blocks: (B:50:0x0105, B:56:0x0120, B:57:0x012e, B:60:0x013a, B:61:0x0140, B:63:0x0148, B:64:0x014b, B:66:0x0175, B:67:0x0178, B:77:0x0188, B:78:0x0190, B:87:0x01a5, B:107:0x0221, B:109:0x025d, B:110:0x0260, B:90:0x01af, B:93:0x01b6, B:95:0x01ba, B:98:0x01bf, B:100:0x01c8, B:102:0x01d0, B:104:0x01d6), top: B:164:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0260 A[Catch: all -> 0x026e, TRY_LEAVE, TryCatch #9 {all -> 0x026e, blocks: (B:50:0x0105, B:56:0x0120, B:57:0x012e, B:60:0x013a, B:61:0x0140, B:63:0x0148, B:64:0x014b, B:66:0x0175, B:67:0x0178, B:77:0x0188, B:78:0x0190, B:87:0x01a5, B:107:0x0221, B:109:0x025d, B:110:0x0260, B:90:0x01af, B:93:0x01b6, B:95:0x01ba, B:98:0x01bf, B:100:0x01c8, B:102:0x01d0, B:104:0x01d6), top: B:164:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af A[Catch: all -> 0x026e, TryCatch #9 {all -> 0x026e, blocks: (B:50:0x0105, B:56:0x0120, B:57:0x012e, B:60:0x013a, B:61:0x0140, B:63:0x0148, B:64:0x014b, B:66:0x0175, B:67:0x0178, B:77:0x0188, B:78:0x0190, B:87:0x01a5, B:107:0x0221, B:109:0x025d, B:110:0x0260, B:90:0x01af, B:93:0x01b6, B:95:0x01ba, B:98:0x01bf, B:100:0x01c8, B:102:0x01d0, B:104:0x01d6), top: B:164:0x0078 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.dianping.nvnetwork.q execSync(com.dianping.nvnetwork.Request r26) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.http.impl.RxDefaultHttpService.execSync(com.dianping.nvnetwork.Request):com.dianping.nvnetwork.q");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    private void mergeCookies(HttpURLConnection httpURLConnection, HashMap<String, String> hashMap) {
        List<String> list;
        Object[] objArr = {httpURLConnection, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a2a71319a5ea0502d8951c7b733a3d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a2a71319a5ea0502d8951c7b733a3d8");
            return;
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.isEmpty() || (list = headerFields.get("Set-Cookie")) == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                if (list.get(i).endsWith(";")) {
                    sb.append(CommonConstant.Symbol.COMMA);
                } else {
                    sb.append(";,");
                }
            }
        }
        hashMap.put("Set-Cookie", sb.toString());
    }

    private static String getStackTrace(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d013bd40e90156aef83f6bcc17414e0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d013bd40e90156aef83f6bcc17414e0");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends com.dianping.nvnetwork.http.impl.a implements a.InterfaceC0098a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        private String g;

        public b(InputStream inputStream, int i, String str) {
            super(inputStream, 4096);
            Object[] objArr = {RxDefaultHttpService.this, inputStream, Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d29a6a127f52e3419518fbf7a84dcb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d29a6a127f52e3419518fbf7a84dcb");
                return;
            }
            this.g = str;
            this.b = i;
            this.f = this;
        }

        @Override // com.dianping.nvnetwork.http.impl.a.InterfaceC0098a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42254ba324dbe0fd2fe30436f1bb22e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42254ba324dbe0fd2fe30436f1bb22e5");
                return;
            }
            this.c += i;
            l.a().a(new c(this.g, this.c, this.b));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public String d;

        public c(String str, int i, int i2) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39d313c6c88c58c5605ed3c2ddf0faa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39d313c6c88c58c5605ed3c2ddf0faa");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = str;
        }
    }

    private int timeout(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1df171d38e278731fdbcc7d7e54d3f4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1df171d38e278731fdbcc7d7e54d3f4")).intValue();
        }
        if (request.h <= 0) {
            h h = h.h();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            return PatchProxy.isSupport(objArr2, h, changeQuickRedirect3, false, "4eb17ec53902011ca31595de7d2a26da", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, h, changeQuickRedirect3, false, "4eb17ec53902011ca31595de7d2a26da")).intValue() : h.r < 1500 ? KNBWebManager.ISetting.DEFAULT_TIMEOUT : h.r;
        }
        return request.h;
    }

    private HttpURLConnection getUrlConnection(Request request) throws Exception {
        boolean z;
        boolean z2;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bf272627668ab2015866ebc3b6e8ecd", 6917529027641081856L)) {
            return (HttpURLConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bf272627668ab2015866ebc3b6e8ecd");
        }
        String str = request.e;
        List<String> a2 = com.dianping.nvnetwork.httpdns.d.a();
        HttpURLConnection httpURLConnection = null;
        if (TextUtils.isEmpty(str) || a2.contains(new URL(request.d).getHost())) {
            z = false;
        } else {
            z = str.startsWith(AbsApiFactory.HTTPS);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        }
        if (httpURLConnection == null) {
            String str2 = request.d;
            if (!str2.startsWith(AbsApiFactory.HTTPS)) {
                str2 = h.h().c(str2);
            }
            httpURLConnection = com.dianping.nvnetwork.httpdns.d.a(str2, request.v, request.w);
        }
        if (z && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: com.dianping.nvnetwork.http.impl.RxDefaultHttpService.3
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str3, SSLSession sSLSession) {
                    return true;
                }
            });
        }
        httpURLConnection.setDoInput(true);
        if (com.dianping.nvnetwork.g.p()) {
            request.a("MKTunnelType", "http");
        }
        if (request.g != null) {
            z2 = true;
            for (Map.Entry<String, String> entry : request.g.entrySet()) {
                if (Build.VERSION.SDK_INT >= 23 && "X-Shark-supportProtocols".equals(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    httpURLConnection.addRequestProperty("X-Android-Protocols", entry.getValue());
                } else {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    if ("Accept-Encoding".equals(entry.getKey())) {
                        z2 = false;
                    }
                }
            }
        } else {
            z2 = true;
        }
        if (z2) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
        int timeout = timeout(request);
        httpURLConnection.setConnectTimeout(timeout);
        httpURLConnection.setReadTimeout(timeout);
        if ("GET".equals(request.f) || "DELETE".equals(request.f) || "HEAD".equals(request.f) || Constants.KEY_METHOD_OPTIONS.equals(request.f)) {
            httpURLConnection.setRequestMethod(request.f);
        } else if ("POST".equals(request.f) || OneIdNetworkTool.PUT.equals(request.f)) {
            httpURLConnection.setRequestMethod(request.f);
            httpURLConnection.setDoOutput(true);
            InputStream inputStream = request.i;
            if (inputStream != null) {
                if (inputStream.markSupported()) {
                    inputStream.mark(0);
                }
                int available = inputStream.available();
                if (available > 4096) {
                    inputStream = new b(inputStream, available, request.b());
                }
                byte[] a3 = this.byteArrayPool.a(4096);
                k kVar = new k(this.byteArrayPool, available > 0 ? available : 4096);
                while (true) {
                    int read = inputStream.read(a3);
                    if (read == -1) {
                        break;
                    }
                    kVar.write(a3, 0, read);
                    kVar.flush();
                }
                if (available != kVar.size() || available == 0) {
                    com.dianping.networklog.c.a("nvnetwork inputStream size = " + available + ", boutSize =" + kVar.size(), 4);
                }
                httpURLConnection.setFixedLengthStreamingMode(available);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                bufferedOutputStream.write(kVar.toByteArray());
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                this.byteArrayPool.a(a3);
                kVar.close();
                if (request.i != null && request.i.markSupported()) {
                    request.i.reset();
                }
            }
        } else {
            throw new IllegalArgumentException("unknown http method " + request.f);
        }
        return httpURLConnection;
    }
}
