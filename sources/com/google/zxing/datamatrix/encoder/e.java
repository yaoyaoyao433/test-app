package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public final int a;
    public final byte[] b;
    private final CharSequence c;
    private final int d;

    public e(CharSequence charSequence, int i, int i2) {
        this.c = charSequence;
        this.a = i;
        this.d = i2;
        this.b = new byte[i * i2];
        Arrays.fill(this.b, (byte) -1);
    }

    private void a(int i, int i2, boolean z) {
        this.b[(i2 * this.a) + i] = z ? (byte) 1 : (byte) 0;
    }

    private boolean a(int i, int i2) {
        return this.b[(i2 * this.a) + i] >= 0;
    }

    public final void a() {
        int i = 4;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i == this.d && i2 == 0) {
                a(this.d - 1, 0, i3, 1);
                a(this.d - 1, 1, i3, 2);
                a(this.d - 1, 2, i3, 3);
                a(0, this.a - 2, i3, 4);
                a(0, this.a - 1, i3, 5);
                a(1, this.a - 1, i3, 6);
                a(2, this.a - 1, i3, 7);
                a(3, this.a - 1, i3, 8);
                i3++;
            }
            if (i == this.d - 2 && i2 == 0 && this.a % 4 != 0) {
                a(this.d - 3, 0, i3, 1);
                a(this.d - 2, 0, i3, 2);
                a(this.d - 1, 0, i3, 3);
                a(0, this.a - 4, i3, 4);
                a(0, this.a - 3, i3, 5);
                a(0, this.a - 2, i3, 6);
                a(0, this.a - 1, i3, 7);
                a(1, this.a - 1, i3, 8);
                i3++;
            }
            if (i == this.d - 2 && i2 == 0 && this.a % 8 == 4) {
                a(this.d - 3, 0, i3, 1);
                a(this.d - 2, 0, i3, 2);
                a(this.d - 1, 0, i3, 3);
                a(0, this.a - 2, i3, 4);
                a(0, this.a - 1, i3, 5);
                a(1, this.a - 1, i3, 6);
                a(2, this.a - 1, i3, 7);
                a(3, this.a - 1, i3, 8);
                i3++;
            }
            if (i == this.d + 4 && i2 == 2 && this.a % 8 == 0) {
                a(this.d - 1, 0, i3, 1);
                a(this.d - 1, this.a - 1, i3, 2);
                a(0, this.a - 3, i3, 3);
                a(0, this.a - 2, i3, 4);
                a(0, this.a - 1, i3, 5);
                a(1, this.a - 3, i3, 6);
                a(1, this.a - 2, i3, 7);
                a(1, this.a - 1, i3, 8);
                i3++;
            }
            do {
                if (i < this.d && i2 >= 0 && !a(i2, i)) {
                    a(i, i2, i3);
                    i3++;
                }
                i -= 2;
                i2 += 2;
                if (i < 0) {
                    break;
                }
            } while (i2 < this.a);
            int i4 = i + 1;
            int i5 = i2 + 3;
            do {
                if (i4 >= 0 && i5 < this.a && !a(i5, i4)) {
                    a(i4, i5, i3);
                    i3++;
                }
                i4 += 2;
                i5 -= 2;
                if (i4 >= this.d) {
                    break;
                }
            } while (i5 >= 0);
            i = i4 + 3;
            i2 = i5 + 1;
            if (i >= this.d && i2 >= this.a) {
                break;
            }
        }
        if (a(this.a - 1, this.d - 1)) {
            return;
        }
        a(this.a - 1, this.d - 1, true);
        a(this.a - 2, this.d - 2, true);
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += this.d;
            i2 += 4 - ((this.d + 4) % 8);
        }
        if (i2 < 0) {
            i2 += this.a;
            i += 4 - ((this.a + 4) % 8);
        }
        a(i2, i, (this.c.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    private void a(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        a(i4, i6, i3, 2);
        int i7 = i - 1;
        a(i7, i5, i3, 3);
        a(i7, i6, i3, 4);
        a(i7, i2, i3, 5);
        a(i, i5, i3, 6);
        a(i, i6, i3, 7);
        a(i, i2, i3, 8);
    }
}
