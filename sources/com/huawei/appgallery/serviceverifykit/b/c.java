package com.huawei.appgallery.serviceverifykit.b;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    private static String a(String str, String str2) {
        String upperCase = str.toUpperCase(Locale.getDefault());
        int indexOf = upperCase.indexOf(str2 + "=");
        if (indexOf == -1) {
            return null;
        }
        int indexOf2 = str.indexOf(CommonConstant.Symbol.COMMA, indexOf);
        return indexOf2 != -1 ? str.substring(indexOf + str2.length() + 1, indexOf2) : str.substring(indexOf + str2.length() + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.X509Certificate a(android.content.Context r5) {
        /*
            r0 = 0
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L25 java.security.cert.CertificateException -> L2a java.io.IOException -> L3a android.content.res.Resources.NotFoundException -> L47
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L25 java.security.cert.CertificateException -> L2a java.io.IOException -> L3a android.content.res.Resources.NotFoundException -> L47
            java.lang.String r1 = "ag_sdk_cbg_root.cer"
            java.io.InputStream r5 = r5.open(r1)     // Catch: java.lang.Throwable -> L25 java.security.cert.CertificateException -> L2a java.io.IOException -> L3a android.content.res.Resources.NotFoundException -> L47
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L2b java.io.IOException -> L3b android.content.res.Resources.NotFoundException -> L48 java.lang.Throwable -> L5e
            java.security.cert.Certificate r1 = r1.generateCertificate(r5)     // Catch: java.security.cert.CertificateException -> L2b java.io.IOException -> L3b android.content.res.Resources.NotFoundException -> L48 java.lang.Throwable -> L5e
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch: java.security.cert.CertificateException -> L2b java.io.IOException -> L3b android.content.res.Resources.NotFoundException -> L48 java.lang.Throwable -> L5e
            if (r5 == 0) goto L23
            r5.close()     // Catch: java.io.IOException -> L21
            goto L23
        L21:
            r0 = r1
            goto L54
        L23:
            r0 = r1
            goto L5d
        L25:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L5f
        L2a:
            r5 = r0
        L2b:
            com.huawei.appgallery.serviceverifykit.b.d.b r1 = com.huawei.appgallery.serviceverifykit.b.d.b.a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "X509CertUtil"
            java.lang.String r3 = "CertificateException"
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L5d
        L36:
            r5.close()     // Catch: java.io.IOException -> L54
            goto L5d
        L3a:
            r5 = r0
        L3b:
            com.huawei.appgallery.serviceverifykit.b.d.b r1 = com.huawei.appgallery.serviceverifykit.b.d.b.a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "X509CertUtil"
            java.lang.String r3 = "can not open cbg root cer"
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L5d
            goto L36
        L47:
            r5 = r0
        L48:
            com.huawei.appgallery.serviceverifykit.b.d.b r1 = com.huawei.appgallery.serviceverifykit.b.d.b.a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "X509CertUtil"
            java.lang.String r3 = "can not found cbg root cer"
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L5d
            goto L36
        L54:
            com.huawei.appgallery.serviceverifykit.b.d.b r5 = com.huawei.appgallery.serviceverifykit.b.d.b.a
            java.lang.String r1 = "X509CertUtil"
            java.lang.String r2 = "close stream failed"
            r5.b(r1, r2)
        L5d:
            return r0
        L5e:
            r0 = move-exception
        L5f:
            if (r5 == 0) goto L6e
            r5.close()     // Catch: java.io.IOException -> L65
            goto L6e
        L65:
            com.huawei.appgallery.serviceverifykit.b.d.b r5 = com.huawei.appgallery.serviceverifykit.b.d.b.a
            java.lang.String r1 = "X509CertUtil"
            java.lang.String r2 = "close stream failed"
            r5.b(r1, r2)
        L6e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.appgallery.serviceverifykit.b.c.a(android.content.Context):java.security.cert.X509Certificate");
    }

    public static X509Certificate a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
                if (generateCertificate instanceof X509Certificate) {
                    return (X509Certificate) generateCertificate;
                }
            } catch (CertificateException e) {
                com.huawei.appgallery.serviceverifykit.b.d.b bVar = com.huawei.appgallery.serviceverifykit.b.d.b.a;
                bVar.b("X509CertUtil", "Failed to get cert: " + e.getMessage());
            }
        }
        return null;
    }

    public static List<String> a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            com.huawei.appgallery.serviceverifykit.b.d.b bVar = com.huawei.appgallery.serviceverifykit.b.d.b.a;
            bVar.b("X509CertUtil", "Failed to getCertChain: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    public static boolean a(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(a(x509Certificate.getSubjectDN().getName(), str));
    }

    public static boolean a(X509Certificate x509Certificate, List<X509Certificate> list) {
        if (list != null && list.size() != 0) {
            if (x509Certificate == null) {
                com.huawei.appgallery.serviceverifykit.b.d.b.a.b("X509CertUtil", "rootCert is null,verify failed ");
                return false;
            }
            try {
                x509Certificate.checkValidity();
                PublicKey publicKey = x509Certificate.getPublicKey();
                for (int size = list.size() - 1; size >= 0; size--) {
                    X509Certificate x509Certificate2 = list.get(size);
                    if (x509Certificate2 != null) {
                        try {
                            x509Certificate2.verify(publicKey);
                            x509Certificate2.checkValidity();
                            publicKey = x509Certificate2.getPublicKey();
                        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e) {
                            com.huawei.appgallery.serviceverifykit.b.d.b.a.b("X509CertUtil", "verify failed " + e.getMessage());
                        }
                    }
                    return false;
                }
                return a(list);
            } catch (CertificateExpiredException | CertificateNotYetValidException e2) {
                com.huawei.appgallery.serviceverifykit.b.d.b.a.b("X509CertUtil", "verifyCertChain Exception:" + e2.getMessage());
            }
        }
        return false;
    }

    public static boolean a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) {
        if (x509Certificate == null || bArr == null || bArr2 == null || bArr2.length == 0) {
            com.huawei.appgallery.serviceverifykit.b.d.b.a.a("X509CertUtil", "checkSignature parameter is null");
            return false;
        }
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            com.huawei.appgallery.serviceverifykit.b.d.b.a.a("X509CertUtil", "failed checkSignature,Exception:", e);
            return false;
        }
    }

    private static boolean a(List<X509Certificate> list) {
        for (int i = 1; i < list.size(); i++) {
            X509Certificate x509Certificate = list.get(i);
            if (!((x509Certificate == null || x509Certificate.getBasicConstraints() == -1) ? false : x509Certificate.getKeyUsage()[5])) {
                return false;
            }
        }
        return true;
    }
}
