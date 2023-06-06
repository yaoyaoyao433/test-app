package com.squareup.okhttp;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class q {
    public final String a;
    public final List<Certificate> b;
    final List<Certificate> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(String str, List<Certificate> list, List<Certificate> list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public static q a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List a = certificateArr != null ? com.squareup.okhttp.internal.j.a(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(cipherSuite, a, localCertificates != null ? com.squareup.okhttp.internal.j.a(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.a.equals(qVar.a) && this.b.equals(qVar.b) && this.c.equals(qVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
