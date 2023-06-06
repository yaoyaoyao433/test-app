package com.dianping.nvnetwork.httpdns;

import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private c c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b282f981fc2858bad6eeacce4878b08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b282f981fc2858bad6eeacce4878b08");
        } else {
            this.c = c.a();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bd3396d9fa65a95fe810953dff78d9b", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bd3396d9fa65a95fe810953dff78d9b");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final URLConnection a(String str, HostnameVerifier hostnameVerifier, SSLSocketFactory sSLSocketFactory) throws IOException {
        String str2;
        Object[] objArr = {str, hostnameVerifier, sSLSocketFactory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "328bec4cb60eb3e8784f8586ed41f052", 6917529027641081856L)) {
            return (URLConnection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "328bec4cb60eb3e8784f8586ed41f052");
        }
        URL url = new URL(str);
        a a2 = this.c.a(url.getHost().toLowerCase());
        if (sSLSocketFactory != null || a2 == null || !this.c.b) {
            URLConnection openConnection = url.openConnection();
            if (hostnameVerifier != null) {
                ((HttpsURLConnection) openConnection).setHostnameVerifier(hostnameVerifier);
            }
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            return openConnection;
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("Can not run on UI thread!");
        } else {
            if (a2.a()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "704b6ffdaba0ade128348f43ed26b2e6", 6917529027641081856L)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "704b6ffdaba0ade128348f43ed26b2e6");
                } else if (a2.d.size() > 1) {
                    str2 = a2.d.get(a.c.nextInt(a2.d.size()));
                } else {
                    str2 = a2.d.get(0);
                }
                if (!TextUtils.isEmpty(str2)) {
                    String replaceFirst = str.replaceFirst(url.getHost(), str2);
                    new StringBuilder("old url : ").append(url);
                    new StringBuilder("new url : ").append(replaceFirst);
                    URLConnection openConnection2 = new URL(replaceFirst).openConnection();
                    openConnection2.setRequestProperty("Host", url.getHost());
                    openConnection2.setRequestProperty("SHARK_DNS_HOST", url.getHost());
                    f fVar = new f(url.getHost());
                    if (openConnection2 instanceof HttpsURLConnection) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection2;
                        httpsURLConnection.setSSLSocketFactory(new e(httpsURLConnection, fVar));
                        httpsURLConnection.setHostnameVerifier(fVar);
                    }
                    return openConnection2;
                }
            }
            URLConnection openConnection3 = url.openConnection();
            if (hostnameVerifier != null) {
                ((HttpsURLConnection) openConnection3).setHostnameVerifier(hostnameVerifier);
            }
            if (sSLSocketFactory != null) {
                ((HttpsURLConnection) openConnection3).setSSLSocketFactory(sSLSocketFactory);
            }
            return openConnection3;
        }
    }
}
