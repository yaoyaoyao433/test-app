package com.squareup.okhttp;

import com.meituan.robust.common.CommonConstant;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l {
    public static final l a;
    public static final l b;
    public static final l c;
    private static final i[] g = {i.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, i.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, i.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, i.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, i.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, i.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, i.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, i.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, i.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, i.TLS_RSA_WITH_AES_128_GCM_SHA256, i.TLS_RSA_WITH_AES_128_CBC_SHA, i.TLS_RSA_WITH_AES_256_CBC_SHA, i.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    public final boolean d;
    final String[] e;
    final String[] f;
    private final boolean h;

    static {
        a aVar = new a(true);
        i[] iVarArr = g;
        if (!aVar.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[iVarArr.length];
        for (int i = 0; i < iVarArr.length; i++) {
            strArr[i] = iVarArr[i].aS;
        }
        a = aVar.a(strArr).a(ac.TLS_1_2, ac.TLS_1_1, ac.TLS_1_0).a(true).a();
        b = new a(a).a(ac.TLS_1_0).a(true).a();
        c = new a(false).a();
    }

    private l(a aVar) {
        this.h = aVar.a;
        this.e = aVar.b;
        this.f = aVar.c;
        this.d = aVar.d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (this.h) {
            if (this.f == null || a(this.f, sSLSocket.getEnabledProtocols())) {
                return this.e == null || a(this.e, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    private static boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (com.squareup.okhttp.internal.j.a(strArr2, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (obj == this) {
                return true;
            }
            l lVar = (l) obj;
            if (this.h != lVar.h) {
                return false;
            }
            return !this.h || (Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f, lVar.f) && this.d == lVar.d);
        }
        return false;
    }

    public final int hashCode() {
        if (this.h) {
            return ((((Arrays.hashCode(this.e) + 527) * 31) + Arrays.hashCode(this.f)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        String str2;
        List a2;
        if (this.h) {
            List list = null;
            if (this.e != null) {
                if (this.e == null) {
                    a2 = null;
                } else {
                    i[] iVarArr = new i[this.e.length];
                    for (int i = 0; i < this.e.length; i++) {
                        iVarArr[i] = i.a(this.e[i]);
                    }
                    a2 = com.squareup.okhttp.internal.j.a(iVarArr);
                }
                str = a2.toString();
            } else {
                str = "[all enabled]";
            }
            if (this.f != null) {
                if (this.f != null) {
                    ac[] acVarArr = new ac[this.f.length];
                    for (int i2 = 0; i2 < this.f.length; i2++) {
                        acVarArr[i2] = ac.a(this.f[i2]);
                    }
                    list = com.squareup.okhttp.internal.j.a(acVarArr);
                }
                str2 = list.toString();
            } else {
                str2 = "[all enabled]";
            }
            return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.d + CommonConstant.Symbol.BRACKET_RIGHT;
        }
        return "ConnectionSpec()";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        a(boolean z) {
            this.a = z;
        }

        public a(l lVar) {
            this.a = lVar.h;
            this.b = lVar.e;
            this.c = lVar.f;
            this.d = lVar.d;
        }

        public final a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.b = (String[]) strArr.clone();
            return this;
        }

        public final a a(ac... acVarArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[acVarArr.length];
            for (int i = 0; i < acVarArr.length; i++) {
                strArr[i] = acVarArr[i].e;
            }
            return b(strArr);
        }

        public final a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.c = (String[]) strArr.clone();
            return this;
        }

        public final a a(boolean z) {
            if (!this.a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.d = true;
            return this;
        }

        public final l a() {
            return new l(this);
        }
    }
}
