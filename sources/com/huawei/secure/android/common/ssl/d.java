package com.huawei.secure.android.common.ssl;

import com.huawei.secure.android.common.ssl.util.e;
import com.huawei.secure.android.common.ssl.util.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d implements X509TrustManager {
    private static final String b = "d";
    protected List<X509TrustManager> a = new ArrayList();
    private X509Certificate[] c;

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        f.a(b);
        for (X509TrustManager x509TrustManager : this.a) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                String str2 = b;
                f.a(str2, "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            for (X509TrustManager x509TrustManager : this.a) {
                arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            String str = b;
            f.a(str, "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }

    public d(InputStream inputStream, String str) throws IllegalArgumentException {
        a(inputStream, str);
    }

    private void a(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                    KeyStore keyStore = KeyStore.getInstance("bks");
                    keyStore.load(inputStream, str.toCharArray());
                    trustManagerFactory.init(keyStore);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    for (int i = 0; i < trustManagers.length; i++) {
                        if (trustManagers[i] instanceof X509TrustManager) {
                            this.a.add((X509TrustManager) trustManagers[i]);
                        }
                    }
                    e.a((Closeable) inputStream);
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                    String str2 = b;
                    f.a(str2, "loadInputStream: exception : " + e.getMessage());
                    e.a((Closeable) inputStream);
                }
                StringBuilder sb = new StringBuilder("loadInputStream: cost : ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append(" ms");
                return;
            } catch (Throwable th) {
                e.a(inputStream);
                throw th;
            }
        }
        throw new IllegalArgumentException("inputstream or trustPwd is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.c = x509CertificateArr;
        String str2 = "checkServerTrusted begin ,server ca chain size is : " + x509CertificateArr.length + " ,auth type is : " + str;
        f.a(b);
        long currentTimeMillis = System.currentTimeMillis();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            new StringBuilder("server ca chain: getSubjectDN is :").append(x509Certificate.getSubjectDN());
            new StringBuilder("IssuerDN :").append(x509Certificate.getIssuerDN());
            new StringBuilder("SerialNumber : ").append(x509Certificate.getSerialNumber());
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                String str3 = "check server i : " + i;
                f.a(b);
                X509TrustManager x509TrustManager = this.a.get(i);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    String str4 = "client root ca size is : " + acceptedIssuers.length;
                    f.a(b);
                    for (X509Certificate x509Certificate2 : acceptedIssuers) {
                        new StringBuilder("client root ca getIssuerDN :").append(x509Certificate2.getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                String str5 = "checkServerTrusted succeed ,root ca issuer is : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN();
                f.a(b);
                return;
            } catch (CertificateException e) {
                f.a(b, "checkServerTrusted error :" + e.getMessage() + " , time : " + i);
                if (i == size - 1) {
                    if (x509CertificateArr != null && x509CertificateArr.length > 0) {
                        f.a(b, "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
        StringBuilder sb = new StringBuilder("checkServerTrusted: cost : ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms");
    }
}
