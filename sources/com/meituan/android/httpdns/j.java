package com.meituan.android.httpdns;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j extends com.meituan.android.httpdns.a {
    public static ChangeQuickRedirect e;

    public j(r rVar, w wVar, n nVar, c cVar, IDnsListener iDnsListener) {
        super(rVar, wVar, nVar, cVar, iDnsListener);
        Object[] objArr = {rVar, wVar, nVar, cVar, iDnsListener};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e177ecef9324b41a727d38a5e9aba6c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e177ecef9324b41a727d38a5e9aba6c7");
        }
    }

    public final List<InetAddress> b(String str) throws UnknownHostException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a2efded78bdda204d3d979f8f3e4bb", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a2efded78bdda204d3d979f8f3e4bb") : a(str);
    }

    public final URLConnection a(String str, boolean z) throws IOException {
        Object[] objArr = {str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "898f50fe409b0e87dce4c13c325615c9", 6917529027641081856L)) {
            return (URLConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "898f50fe409b0e87dce4c13c325615c9");
        }
        URL url = new URL(str);
        if (url.getProtocol().toLowerCase().equals("http")) {
            if (!this.f_.a(url.getHost())) {
                return HttpURLWrapper.wrapURLConnection(url.openConnection());
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("Can not run on UI thread!");
            }
            List<InetAddress> a2 = a(url.getHost());
            if (a2 != null && a2.get(0) != null) {
                String hostAddress = a2.get(0).getHostAddress();
                if (!TextUtils.isEmpty(hostAddress)) {
                    final URLConnection wrapURLConnection = HttpURLWrapper.wrapURLConnection(new URL(str.replaceFirst(url.getHost(), hostAddress)).openConnection());
                    wrapURLConnection.setRequestProperty("Host", url.getHost());
                    wrapURLConnection.setRequestProperty("__DNS_Host", url.getHost());
                    if (wrapURLConnection instanceof HttpsURLConnection) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) wrapURLConnection;
                        httpsURLConnection.setSSLSocketFactory(new y(httpsURLConnection, this.b));
                        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.meituan.android.httpdns.j.1
                            public static ChangeQuickRedirect a;

                            @Override // javax.net.ssl.HostnameVerifier
                            public final boolean verify(String str2, SSLSession sSLSession) {
                                Object[] objArr2 = {str2, sSLSession};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9c9d0127729829fd38d37a1669dd176", 6917529027641081856L)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9c9d0127729829fd38d37a1669dd176")).booleanValue();
                                }
                                String requestProperty = wrapURLConnection.getRequestProperty("__DNS_Host");
                                if (requestProperty == null) {
                                    requestProperty = wrapURLConnection.getURL().getHost();
                                }
                                return HttpsURLConnection.getDefaultHostnameVerifier().verify(requestProperty, sSLSession);
                            }
                        });
                    }
                    return wrapURLConnection;
                }
            }
        }
        return HttpURLWrapper.wrapURLConnection(url.openConnection());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public r b;
        public List<String> c;
        public c d;
        public IDnsListener e;
        private w f;
        private m g;

        public final j a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15841d7df83eeb87cf54ed4369daf347", 6917529027641081856L)) {
                return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15841d7df83eeb87cf54ed4369daf347");
            }
            if (context != null) {
                i.c = context;
            }
            if (this.b == null) {
                this.b = r.a;
            }
            if (this.f == null) {
                this.f = new w();
            }
            s a2 = t.a(context);
            if (context != null) {
                NetworkStateReceiver.initNetworkStateReceiver(context);
            }
            if (this.g == null) {
                this.g = new m(this.b, a2, new f(), new l(context));
            }
            if (this.d == null) {
                this.d = new b(this.c);
            }
            if (this.e == null) {
                this.e = k.a(context);
            }
            return new j(this.b, this.f, this.g, this.d, this.e);
        }
    }
}
