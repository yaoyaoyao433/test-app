package com.squareup.okhttp;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum ac {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String e;

    ac(String str) {
        this.e = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ac a(String str) {
        char c;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return TLS_1_2;
            case 1:
                return TLS_1_1;
            case 2:
                return TLS_1_0;
            case 3:
                return SSL_3_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }
}
