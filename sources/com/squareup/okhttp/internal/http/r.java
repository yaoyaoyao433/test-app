package com.squareup.okhttp.internal.http;

import com.meituan.metrics.common.Constants;
import com.squareup.okhttp.w;
import java.io.IOException;
import java.net.ProtocolException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class r {
    public final w a;
    public final int b;
    public final String c;

    public r(w wVar, int i, String str) {
        this.a = wVar;
        this.b = i;
        this.c = str;
    }

    public static r a(String str) throws IOException {
        w wVar;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                wVar = w.HTTP_1_0;
            } else if (charAt == 1) {
                wVar = w.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            wVar = w.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            String str2 = "";
            if (str.length() > i2) {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i + 4);
            }
            return new r(wVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(Constants.SPACE);
        sb.append(this.b);
        if (this.c != null) {
            sb.append(Constants.SPACE);
            sb.append(this.c);
        }
        return sb.toString();
    }
}
