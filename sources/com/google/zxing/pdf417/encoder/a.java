package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    int a;
    private final b[] b;
    private final int c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i, int i2) {
        this.b = new b[i];
        int length = this.b.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.b[i3] = new b(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.a = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b a() {
        return this.b[this.a];
    }

    public final byte[][] a(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, this.c * i2, this.d * i);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.b[i4 / i2].a(i);
        }
        return bArr;
    }
}
