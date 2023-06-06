package com.tencent.mapsdk.internal;

import java.io.UnsupportedEncodingException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mb implements md {
    private int g = 0;
    private byte[] h;

    private mb(byte[] bArr) {
        this.h = bArr;
    }

    private void a(byte[] bArr) {
        this.h = bArr;
        this.g = 0;
    }

    private byte[] a() {
        byte[] bArr = new byte[this.h.length - this.g];
        System.arraycopy(this.h, this.g, bArr, 0, bArr.length);
        return bArr;
    }

    private int b() {
        return this.g;
    }

    private void a(int i) {
        this.g += i;
    }

    private void b(int i) {
        this.g -= i;
    }

    private byte c() {
        if (this.h == null || this.g >= this.h.length) {
            return (byte) 0;
        }
        byte[] bArr = this.h;
        int i = this.g;
        this.g = i + 1;
        return bArr[i];
    }

    private byte[] c(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = c();
        }
        return bArr;
    }

    private boolean d() {
        return c() != 0;
    }

    private int e() {
        return (int) e(2);
    }

    private char f() {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j |= (c() & 255) << (i * 8);
        }
        return (char) j;
    }

    private int g() {
        return (int) e(4);
    }

    private long h() {
        return e(8);
    }

    private String d(int i) {
        int i2 = i >> 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append(f());
        }
        return stringBuffer.toString();
    }

    private boolean k() {
        return this.g == this.h.length - 1;
    }

    private long e(int i) {
        long j = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            j |= (c() & 255) << (i2 * 8);
        }
        return j;
    }

    private String i() {
        int e = (int) e(2);
        if (e == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < e; i++) {
            stringBuffer.append(f());
        }
        return stringBuffer.toString();
    }

    private String j() {
        int e = (int) e(2);
        if (e == 0) {
            return "";
        }
        byte[] bArr = new byte[e];
        for (int i = 0; i < e; i++) {
            bArr[i] = c();
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
