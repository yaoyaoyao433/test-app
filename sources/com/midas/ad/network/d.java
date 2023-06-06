package com.midas.ad.network;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.squareup.okhttp.d;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.midas.ad.network.a {
    protected static volatile v a = null;
    private static String b = "MidasHttpClient";

    /* compiled from: ProGuard */
    /* renamed from: com.midas.ad.network.d$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements com.squareup.okhttp.f {
        @Override // com.squareup.okhttp.f
        public final void onFailure(x xVar, IOException iOException) {
        }

        @Override // com.squareup.okhttp.f
        public final void onResponse(z zVar) throws IOException {
        }
    }

    public d() {
        if (a == null) {
            v vVar = new v();
            OkHttp2Wrapper.addInterceptorToClient(vVar);
            v a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
            a = a2;
            a2.n = a();
            a.o = new b(null);
        }
    }

    private static x a(com.midas.ad.network.b bVar) {
        x.a aVar = new x.a();
        aVar.e = bVar;
        try {
            if (bVar.b() != null) {
                for (String str : bVar.b().keySet()) {
                    if (bVar.b().get(str) != null && !TextUtils.isEmpty(bVar.b().get(str).toString())) {
                        aVar.b(str, bVar.b().get(str).toString());
                    }
                }
            }
            aVar.a(bVar.a());
            if (!TextUtils.isEmpty(bVar.c())) {
                aVar.a("POST", y.create(u.a(bVar.d()), bVar.c()));
            }
            d.a aVar2 = new d.a();
            aVar2.b = true;
            String dVar = aVar2.a().toString();
            if (dVar.isEmpty()) {
                aVar.b("Cache-Control");
            } else {
                aVar.a("Cache-Control", dVar);
            }
            return aVar.a();
        } catch (Exception e) {
            Log.e(b, e.getMessage(), e);
            return null;
        }
    }

    @Override // com.midas.ad.network.a
    public final com.midas.ad.network.model.c a(com.midas.ad.network.b bVar, String str) {
        x a2;
        if (bVar == null || (a2 = a(bVar)) == null) {
            return null;
        }
        try {
            return new g(a.a(a2).a());
        } catch (IOException e) {
            Log.e(b, e.getMessage(), e);
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        private a() {
        }

        /* synthetic */ a(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // javax.net.ssl.X509TrustManager
        public final X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class b implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }

        private b() {
        }

        /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static SSLSocketFactory a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new a(null)}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception unused) {
            return null;
        }
    }
}
