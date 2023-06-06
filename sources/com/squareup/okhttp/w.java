package com.squareup.okhttp;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String e;

    w(String str) {
        this.e = str;
    }

    public static w a(String str) throws IOException {
        if (str.equals(HTTP_1_0.e)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.e)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.e)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.e)) {
            return SPDY_3;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
