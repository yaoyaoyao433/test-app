package com.google.zxing.common.reedsolomon;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a(4201, 4096, 1);
    public static final a b = new a(1033, 1024, 1);
    public static final a c = new a(67, 64, 1);
    public static final a d = new a(19, 16, 1);
    public static final a e = new a(285, 256, 0);
    public static final a f;
    public static final a g;
    public static final a h;
    final int[] i;
    final int[] j;
    final b k;
    final int l;
    final int m;
    private final b n;
    private final int o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2) {
        return i ^ i2;
    }

    static {
        a aVar = new a(301, 256, 1);
        f = aVar;
        g = aVar;
        h = c;
    }

    private a(int i, int i2, int i3) {
        this.o = i;
        this.l = i2;
        this.m = i3;
        this.i = new int[i2];
        this.j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.i[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.j[this.i[i6]] = i6;
        }
        this.k = new b(this, new int[]{0});
        this.n = new b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        return this.i[(this.j[i] + this.j[i2]) % (this.l - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.o) + ',' + this.l + ')';
    }
}
