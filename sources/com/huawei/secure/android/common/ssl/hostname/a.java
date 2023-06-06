package com.huawei.secure.android.common.ssl.hostname;

import com.huawei.secure.android.common.ssl.util.f;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            new StringBuilder("verify: certificate is : ").append(x509Certificate.getSubjectDN().getName());
            c.a(str, x509Certificate, true);
            return true;
        } catch (SSLException e) {
            f.a("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
