package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    final byte[][] a;
    public final int b;
    public final int c;

    public b(int i, int i2) {
        this.a = (byte[][]) Array.newInstance(byte.class, i2, i);
        this.b = i;
        this.c = i2;
    }

    public final byte a(int i, int i2) {
        return this.a[i2][i];
    }

    public final void a(int i, int i2, int i3) {
        this.a[i2][i] = (byte) i3;
    }

    public final void a(int i, int i2, boolean z) {
        this.a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                switch (this.a[i][i2]) {
                    case 0:
                        sb.append(" 0");
                        break;
                    case 1:
                        sb.append(" 1");
                        break;
                    default:
                        sb.append("  ");
                        break;
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
