package com.huawei.secure.android.common.ssl.hostname;

import android.util.Log;
import com.huawei.secure.android.common.ssl.util.f;
import com.meituan.metrics.common.Constants;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    private static final Pattern a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final String[] b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        b = strArr;
        Arrays.sort(strArr);
    }

    private static String[] a(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Log.e(f.a(""), "Error parsing certificate.", e);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3 A[EDGE_INSN: B:65:0x00d3->B:55:0x00d3 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r8, java.lang.String[] r9, java.lang.String[] r10, boolean r11) throws javax.net.ssl.SSLException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.ssl.hostname.c.a(java.lang.String, java.lang.String[], java.lang.String[], boolean):void");
    }

    private static int a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static final void a(String str, X509Certificate x509Certificate, boolean z) throws SSLException {
        String[] strArr;
        String str2;
        b bVar = new b(x509Certificate.getSubjectX500Principal());
        bVar.c = 0;
        bVar.d = 0;
        bVar.e = 0;
        bVar.f = 0;
        bVar.g = bVar.a.toCharArray();
        List emptyList = Collections.emptyList();
        String a2 = bVar.a();
        if (a2 != null) {
            do {
                int i = bVar.c;
                if (i < bVar.b) {
                    String str3 = "";
                    char c = bVar.g[i];
                    if (c == '\"') {
                        str3 = bVar.b();
                    } else if (c == '#') {
                        str3 = bVar.c();
                    } else if (c != '+' && c != ',' && c != ';') {
                        int i2 = bVar.c;
                        bVar.d = i2;
                        bVar.e = i2;
                        while (true) {
                            int i3 = bVar.c;
                            if (i3 >= bVar.b) {
                                char[] cArr = bVar.g;
                                int i4 = bVar.d;
                                str2 = new String(cArr, i4, bVar.e - i4);
                                break;
                            }
                            char[] cArr2 = bVar.g;
                            char c2 = cArr2[i3];
                            if (c2 == ' ') {
                                int i5 = bVar.e;
                                bVar.f = i5;
                                bVar.c = i3 + 1;
                                bVar.e = i5 + 1;
                                cArr2[i5] = Constants.SPACE;
                                while (true) {
                                    int i6 = bVar.c;
                                    if (i6 >= bVar.b) {
                                        break;
                                    }
                                    char[] cArr3 = bVar.g;
                                    if (cArr3[i6] != ' ') {
                                        break;
                                    }
                                    int i7 = bVar.e;
                                    bVar.e = i7 + 1;
                                    cArr3[i7] = Constants.SPACE;
                                    bVar.c = i6 + 1;
                                }
                                int i8 = bVar.c;
                                if (i8 == bVar.b) {
                                    break;
                                }
                                char[] cArr4 = bVar.g;
                                if (cArr4[i8] == ',' || cArr4[i8] == '+' || cArr4[i8] == ';') {
                                    break;
                                }
                            } else if (c2 == ';') {
                                break;
                            } else if (c2 == '\\') {
                                int i9 = bVar.e;
                                bVar.e = i9 + 1;
                                cArr2[i9] = bVar.d();
                                bVar.c++;
                            } else if (c2 == '+' || c2 == ',') {
                                break;
                            } else {
                                int i10 = bVar.e;
                                bVar.e = i10 + 1;
                                cArr2[i10] = cArr2[i3];
                                bVar.c = i3 + 1;
                            }
                        }
                        char[] cArr5 = bVar.g;
                        int i11 = bVar.d;
                        str2 = new String(cArr5, i11, bVar.e - i11);
                        str3 = str2;
                    }
                    if ("cn".equalsIgnoreCase(a2)) {
                        if (emptyList.isEmpty()) {
                            emptyList = new ArrayList();
                        }
                        emptyList.add(str3);
                    }
                    int i12 = bVar.c;
                    if (i12 < bVar.b) {
                        char[] cArr6 = bVar.g;
                        if (cArr6[i12] != ',' && cArr6[i12] != ';' && cArr6[i12] != '+') {
                            throw new IllegalStateException("Malformed DN: " + bVar.a);
                        }
                        bVar.c++;
                        a2 = bVar.a();
                    }
                }
            } while (a2 != null);
            throw new IllegalStateException("Malformed DN: " + bVar.a);
        }
        if (emptyList.isEmpty()) {
            strArr = null;
        } else {
            strArr = new String[emptyList.size()];
            emptyList.toArray(strArr);
        }
        String[] a3 = a(x509Certificate);
        new StringBuilder("cn is : ").append(Arrays.toString(strArr));
        new StringBuilder("san is : ").append(Arrays.toString(a3));
        a(str, strArr, a3, true);
    }
}
