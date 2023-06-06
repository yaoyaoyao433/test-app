package com.squareup.okhttp;

import com.meituan.robust.common.CommonConstant;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static final g a = new g(new a());
    private final Map<String, Set<okio.f>> b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        final Map<String, Set<okio.f>> a = new LinkedHashMap();
    }

    private g(a aVar) {
        this.b = com.squareup.okhttp.internal.j.a(aVar.a);
    }

    public static String a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha1/" + a((X509Certificate) certificate).b();
    }

    private static okio.f a(X509Certificate x509Certificate) {
        return com.squareup.okhttp.internal.j.a(okio.f.a(x509Certificate.getPublicKey().getEncoded()));
    }

    public final void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        int indexOf;
        Set<okio.f> set = this.b.get(str);
        Set<okio.f> set2 = str.indexOf(46) != str.lastIndexOf(46) ? this.b.get("*." + str.substring(indexOf + 1)) : null;
        if (set == null && set2 == null) {
            set = null;
        } else if (set != null && set2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set);
            linkedHashSet.addAll(set2);
            set = linkedHashSet;
        } else if (set == null) {
            set = set2;
        }
        if (set == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (set.contains(a((X509Certificate) list.get(i)))) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            sb.append("\n    ");
            sb.append(a((Certificate) x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(CommonConstant.Symbol.COLON);
        for (okio.f fVar : set) {
            sb.append("\n    sha1/");
            sb.append(fVar.b());
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
