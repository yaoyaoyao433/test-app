package com.squareup.okhttp.internal.tls;

import com.meituan.robust.common.CommonConstant;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements HostnameVerifier {
    public static final d a = new d();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private d() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            if (b.matcher(str).matches()) {
                List<String> a2 = a(x509Certificate, 7);
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    if (str.equalsIgnoreCase(a2.get(i))) {
                        return true;
                    }
                }
                return false;
            }
            String lowerCase = str.toLowerCase(Locale.US);
            List<String> a3 = a(x509Certificate, 2);
            int size2 = a3.size();
            int i2 = 0;
            boolean z = false;
            while (i2 < size2) {
                if (a(lowerCase, a3.get(i2))) {
                    return true;
                }
                i2++;
                z = true;
            }
            if (z) {
                return false;
            }
            c cVar = new c(x509Certificate.getSubjectX500Principal());
            cVar.c = 0;
            cVar.d = 0;
            cVar.e = 0;
            cVar.f = 0;
            cVar.g = cVar.a.toCharArray();
            String a4 = cVar.a();
            String str2 = null;
            if (a4 != null) {
                while (true) {
                    String str3 = "";
                    if (cVar.c != cVar.b) {
                        switch (cVar.g[cVar.c]) {
                            case '\"':
                                cVar.c++;
                                cVar.d = cVar.c;
                                cVar.e = cVar.d;
                                while (cVar.c != cVar.b) {
                                    if (cVar.g[cVar.c] != '\"') {
                                        if (cVar.g[cVar.c] == '\\') {
                                            cVar.g[cVar.e] = cVar.d();
                                        } else {
                                            cVar.g[cVar.e] = cVar.g[cVar.c];
                                        }
                                        cVar.c++;
                                        cVar.e++;
                                    } else {
                                        cVar.c++;
                                        while (cVar.c < cVar.b && cVar.g[cVar.c] == ' ') {
                                            cVar.c++;
                                        }
                                        str3 = new String(cVar.g, cVar.d, cVar.e - cVar.d);
                                        break;
                                    }
                                }
                                throw new IllegalStateException("Unexpected end of DN: " + cVar.a);
                            case '#':
                                str3 = cVar.b();
                                break;
                            case '+':
                            case ',':
                            case ';':
                                break;
                            default:
                                str3 = cVar.c();
                                break;
                        }
                        if ("cn".equalsIgnoreCase(a4)) {
                            str2 = str3;
                        } else if (cVar.c < cVar.b) {
                            if (cVar.g[cVar.c] != ',' && cVar.g[cVar.c] != ';' && cVar.g[cVar.c] != '+') {
                                throw new IllegalStateException("Malformed DN: " + cVar.a);
                            }
                            cVar.c++;
                            a4 = cVar.a();
                            if (a4 == null) {
                                throw new IllegalStateException("Malformed DN: " + cVar.a);
                            }
                        }
                    }
                }
            }
            if (str2 != null) {
                return a(lowerCase, str2);
            }
            return false;
        } catch (SSLException unused) {
            return false;
        }
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> a2 = a(x509Certificate, 7);
        List<String> a3 = a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a2.size() + a3.size());
        arrayList.addAll(a2);
        arrayList.addAll(a3);
        return arrayList;
    }

    private static List<String> a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private static boolean a(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(CommonConstant.Symbol.DOT) || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(CommonConstant.Symbol.DOT) || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(CommonConstant.Symbol.DOT)) {
            str = str + CommonConstant.Symbol.DOT_CHAR;
        }
        if (!str2.endsWith(CommonConstant.Symbol.DOT)) {
            str2 = str2 + CommonConstant.Symbol.DOT_CHAR;
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (str.endsWith(substring)) {
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }
}
