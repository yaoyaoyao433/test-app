package com.google.zxing.datamatrix.encoder;

import com.meituan.robust.common.CommonConstant;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    final String a;
    l b;
    com.google.zxing.b c;
    com.google.zxing.b d;
    final StringBuilder e;
    int f;
    int g;
    k h;
    int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str) {
        byte[] bytes = str.getBytes(Charset.forName(CommonConstant.Encoding.ISO88591));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = l.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public final char a() {
        return this.a.charAt(this.f);
    }

    public final void a(String str) {
        this.e.append(str);
    }

    public final void a(char c) {
        this.e.append(c);
    }

    public final boolean b() {
        return this.f < c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.a.length() - this.i;
    }

    public final void a(int i) {
        if (this.h == null || i > this.h.b) {
            this.h = k.a(i, this.b, this.c, this.d, true);
        }
    }

    public final void d() {
        a(this.e.length());
    }
}
