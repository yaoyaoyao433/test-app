package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.RequiresApi;
import com.google.gson.Gson;
import com.meituan.android.httpdns.j;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static Gson b = new Gson();
    private final ConcurrentHashMap<i, b> c;
    private Executor d;
    private final f e;
    private com.meituan.android.httpdns.j f;

    public static /* synthetic */ f b(g gVar) {
        return gVar.e;
    }

    public static /* synthetic */ X509TrustManager b() {
        return c();
    }

    public g(Context context, Executor executor) {
        Object[] objArr = {context, executor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8255b0980707d033994e326f80e00d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8255b0980707d033994e326f80e00d9");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.d = executor;
        this.e = new f(4096);
        this.f = new j.a().a(context);
    }

    public final b a(i iVar, o<i, j> oVar) {
        Object[] objArr = {iVar, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07934c9a05b9cff9f252de9d107b040d", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07934c9a05b9cff9f252de9d107b040d") : new b(iVar, oVar);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87a47d55f5535d823232152b6e532315", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87a47d55f5535d823232152b6e532315")).booleanValue() : com.dianping.imagemanager.utils.k.a();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98bc6f3ebf8c896819809e76a5060de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98bc6f3ebf8c896819809e76a5060de5");
        } else {
            com.dianping.imagemanager.utils.k.a("http", str);
        }
    }

    public final void b(i iVar, o<i, j> oVar) {
        Object[] objArr = {iVar, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd10d1c55c66606902a2dac1a1310fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd10d1c55c66606902a2dac1a1310fd");
            return;
        }
        b a2 = a(iVar, oVar);
        if (this.c.putIfAbsent(iVar, a2) == null) {
            try {
                com.sankuai.waimai.launcher.util.aop.b.a(a2, this.d, new Void[0]);
                return;
            } catch (IllegalStateException e) {
                e.printStackTrace();
                com.dianping.imagemanager.utils.k.d("http", "cannot exec , " + e.getMessage());
                return;
            }
        }
        com.dianping.imagemanager.utils.k.d("http", "cannot exec duplicate request (same instance)");
    }

    public final void a(i iVar, o<i, j> oVar, boolean z) {
        Object[] objArr = {iVar, oVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd261b2297c6f9c5e4c4641909ef15d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd261b2297c6f9c5e4c4641909ef15d");
            return;
        }
        b bVar = this.c.get(iVar);
        if (bVar == null || bVar.c != oVar) {
            return;
        }
        this.c.remove(iVar, bVar);
        bVar.cancel(true);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends AsyncTask<Void, Void, j> {
        public static ChangeQuickRedirect a;
        protected final i b;
        protected final o<i, j> c;
        protected HttpURLConnection d;
        protected int e;
        protected boolean f;
        protected int g;
        protected int h;
        protected int i;
        protected int j;
        protected long k;

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(j jVar) {
            j jVar2 = jVar;
            Object[] objArr = {jVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b168b042b50f5d0f2bf101627e055031", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b168b042b50f5d0f2bf101627e055031");
            } else if (g.this.c.remove(this.b, this)) {
                if (jVar2.c() != null) {
                    this.c.b(this.b, jVar2);
                } else {
                    this.c.a(this.b, jVar2);
                }
                if (g.this.a()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.k;
                    StringBuilder sb = new StringBuilder();
                    if (jVar2.c() != null) {
                        sb.append("finish (");
                    } else {
                        sb.append("fail (");
                    }
                    sb.append(this.b.a());
                    sb.append(',');
                    sb.append(this.e);
                    sb.append(',');
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    sb.append(") ");
                    sb.append(this.b.f());
                    g.this.a(sb.toString());
                    if (jVar2.c() == null) {
                        g gVar = g.this;
                        gVar.a("    " + jVar2.d());
                    }
                }
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onProgressUpdate(Void[] voidArr) {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6d17e56d4edb0a8314cc8d51d6166d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6d17e56d4edb0a8314cc8d51d6166d");
            } else if (this.f) {
                if (this.c instanceof h) {
                    ((h) this.c).a(this.b, this.j, this.i);
                }
            } else if (this.c instanceof h) {
                ((h) this.c).a(this.b, this.h, this.g);
            }
        }

        public b(i iVar, o<i, j> oVar) {
            Object[] objArr = {g.this, iVar, oVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a62c89c34ad8bd8406aa55376271cb2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a62c89c34ad8bd8406aa55376271cb2");
                return;
            }
            this.b = iVar;
            this.c = oVar;
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5878b94a8d009ef88908a65150fa87", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5878b94a8d009ef88908a65150fa87");
                return;
            }
            if (this.c instanceof h) {
                ((h) this.c).a(this.b);
            }
            this.k = SystemClock.elapsedRealtime();
        }

        private HttpURLConnection a() throws Exception {
            HttpURLConnection httpURLConnection;
            SSLSocketFactory b;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ce7dde24c04e1f77003e6688bb082d", RobustBitConfig.DEFAULT_VALUE)) {
                return (HttpURLConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ce7dde24c04e1f77003e6688bb082d");
            }
            i iVar = this.b;
            try {
                httpURLConnection = (HttpURLConnection) g.this.f.a(iVar.f(), false);
            } catch (Exception unused) {
                httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(iVar.f()).openConnection());
            }
            if (com.dianping.imagemanager.base.a.a().l && Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 27 && (httpURLConnection instanceof HttpsURLConnection) && (b = g.b(g.b())) != null) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(b);
            }
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            if (iVar.c() != null) {
                for (l lVar : iVar.c()) {
                    httpURLConnection.setRequestProperty(lVar.a(), lVar.b());
                }
            }
            if (Build.VERSION.SDK_INT < 8) {
                System.setProperty("http.keepAlive", "false");
            }
            if (iVar.e() > 0) {
                httpURLConnection.setReadTimeout(iVar.e());
            }
            if (iVar.d() > 0) {
                httpURLConnection.setConnectTimeout(iVar.d());
            }
            if ("GET".equals(iVar.a()) || "DELETE".equals(iVar.a()) || "HEAD".equals(iVar.a())) {
                httpURLConnection.setRequestMethod(iVar.a());
                return httpURLConnection;
            }
            throw new IllegalArgumentException("unknown http method " + iVar.a());
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public final com.dianping.imagemanager.utils.downloadphoto.httpservice.j doInBackground(java.lang.Void... r23) {
            /*
                Method dump skipped, instructions count: 614
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.utils.downloadphoto.httpservice.g.b.doInBackground(java.lang.Void[]):com.dianping.imagemanager.utils.downloadphoto.httpservice.j");
        }

        @Override // android.os.AsyncTask
        public final void onCancelled() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b2aaa37786cfaa8875f772dc7eb1813", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b2aaa37786cfaa8875f772dc7eb1813");
            } else if (g.this.a()) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.k;
                g.this.a("abort (" + this.b.a() + ',' + this.e + ',' + elapsedRealtime + "ms) " + this.b.f());
            }
        }

        private void a(byte[] bArr, List<l> list) {
            int length;
            Object[] objArr = {bArr, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "193a8f7ce869f6e38a612dfa1fc3a443", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "193a8f7ce869f6e38a612dfa1fc3a443");
                return;
            }
            if (bArr != null) {
                try {
                    length = bArr.length + g.a(list);
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                length = 0;
            }
            int available = (this.b.b() != null ? this.b.b().available() : 0) + g.a(this.b.c()) + this.b.f().getBytes().length;
            com.meituan.android.httpdns.d a2 = com.meituan.android.httpdns.d.a();
            HashMap hashMap = new HashMap();
            hashMap.put("channel", "dpimage");
            if (a2 != null) {
                hashMap.putAll(a2.e());
            }
            String json = g.b.toJson(hashMap);
            g.a("_pic_" + this.b.f(), this.e, available, length, (int) (System.currentTimeMillis() - this.k), json);
            com.meituan.android.httpdns.d.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @RequiresApi(api = 24)
    /* loaded from: classes.dex */
    public static class a extends X509ExtendedTrustManager {
        public static ChangeQuickRedirect a;
        public X509ExtendedTrustManager b;

        public a(X509ExtendedTrustManager x509ExtendedTrustManager) {
            Object[] objArr = {x509ExtendedTrustManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b939d9ae76c9a60a6e6ef66ce112c30", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b939d9ae76c9a60a6e6ef66ce112c30");
            } else {
                this.b = x509ExtendedTrustManager;
            }
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
            Object[] objArr = {x509CertificateArr, str, socket};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9323e9329bc42b6211b9778559d79b85", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9323e9329bc42b6211b9778559d79b85");
            } else {
                this.b.checkClientTrusted(x509CertificateArr, str, socket);
            }
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
            Object[] objArr = {x509CertificateArr, str, socket};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4051c90cec91d1761cdeac716ac8e758", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4051c90cec91d1761cdeac716ac8e758");
                return;
            }
            Object[] objArr2 = {socket};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b092cf3b56aed075204071fd730066c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b092cf3b56aed075204071fd730066c8");
            } else if (socket instanceof SSLSocket) {
                try {
                    SSLSession handshakeSession = ((SSLSocket) socket).getHandshakeSession();
                    if (handshakeSession != null) {
                        Field declaredField = handshakeSession.getClass().getDeclaredField("peerCertificateOcspData");
                        declaredField.setAccessible(true);
                        declaredField.set(handshakeSession, null);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.b.checkServerTrusted(x509CertificateArr, str, socket);
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
            Object[] objArr = {x509CertificateArr, str, sSLEngine};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "025bec7c60c49efebef5ff4ae3af82e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "025bec7c60c49efebef5ff4ae3af82e9");
            } else {
                this.b.checkClientTrusted(x509CertificateArr, str, sSLEngine);
            }
        }

        @Override // javax.net.ssl.X509ExtendedTrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
            Object[] objArr = {x509CertificateArr, str, sSLEngine};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4839faafe613986d84ae9b32ad789c5a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4839faafe613986d84ae9b32ad789c5a");
            } else {
                this.b.checkServerTrusted(x509CertificateArr, str, sSLEngine);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            Object[] objArr = {x509CertificateArr, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15cf349cf90329db53402e5907ea30ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15cf349cf90329db53402e5907ea30ef");
            } else {
                this.b.checkClientTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            Object[] objArr = {x509CertificateArr, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1323eb487aa59e83394bc19b91b174bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1323eb487aa59e83394bc19b91b174bc");
            } else {
                this.b.checkServerTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public final X509Certificate[] getAcceptedIssuers() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb43f3355fc6fd337dab6948f8a700f", RobustBitConfig.DEFAULT_VALUE) ? (X509Certificate[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb43f3355fc6fd337dab6948f8a700f") : this.b.getAcceptedIssuers();
        }
    }

    private static X509TrustManager c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7126679b9593ecdc6822ef9410722367", RobustBitConfig.DEFAULT_VALUE)) {
            return (X509TrustManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7126679b9593ecdc6822ef9410722367");
        }
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } else if (Build.VERSION.SDK_INT >= 24 && (trustManagers[0] instanceof X509ExtendedTrustManager)) {
                return new a((X509ExtendedTrustManager) trustManagers[0]);
            } else {
                return (X509TrustManager) trustManagers[0];
            }
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SSLSocketFactory b(X509TrustManager x509TrustManager) {
        Object[] objArr = {x509TrustManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01aa4f620367ed19ad4f6f726b739c58", RobustBitConfig.DEFAULT_VALUE)) {
            return (SSLSocketFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01aa4f620367ed19ad4f6f726b739c58");
        }
        if (x509TrustManager == null) {
            return null;
        }
        try {
            SSLContext d = d();
            d.init(null, new TrustManager[]{x509TrustManager}, null);
            return d.getSocketFactory();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static SSLContext d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f116e8397b2bfc14d3336da17c2bf23", RobustBitConfig.DEFAULT_VALUE)) {
            return (SSLContext) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f116e8397b2bfc14d3336da17c2bf23");
        }
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61fab6331bbf2fca5963f18c190cd67f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61fab6331bbf2fca5963f18c190cd67f");
        } else {
            com.dianping.imagemanager.utils.n.a(str, i, i2, i3, i4, str2, 10);
        }
    }

    public static int a(List<l> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c40f47714e1802ffaeffc4bf4eb3d0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c40f47714e1802ffaeffc4bf4eb3d0a")).intValue();
        }
        if (list == null || list.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (l lVar : list) {
            sb.append(lVar.a());
            sb.append(lVar.b());
        }
        return sb.toString().getBytes().length;
    }
}
