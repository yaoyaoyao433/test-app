package com.dianping.nvnetwork.httpdns;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements HostnameVerifier {
    public static ChangeQuickRedirect a;
    public String b;

    public f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ffc1c23c894f876ae2a64012ba79041", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ffc1c23c894f876ae2a64012ba79041");
        } else {
            this.b = str;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Object[] objArr = {str, sSLSession};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c80c0694d286fa1d7b93a34a54d8247", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c80c0694d286fa1d7b93a34a54d8247")).booleanValue() : HttpsURLConnection.getDefaultHostnameVerifier().verify(this.b, sSLSession);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ae5ef26fbac28e1e6ca0a2304ee654", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ae5ef26fbac28e1e6ca0a2304ee654")).booleanValue();
        }
        if (TextUtils.isEmpty(this.b) || !(obj instanceof f)) {
            return false;
        }
        String str = ((f) obj).b;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.b.equals(str);
    }
}
