package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MTClientCertRequest {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void cancel();

    public abstract String getHost();

    public abstract String[] getKeyTypes();

    public abstract int getPort();

    public abstract Principal[] getPrincipals();

    public abstract void ignore();

    public abstract void proceed(PrivateKey privateKey, X509Certificate[] x509CertificateArr);
}
