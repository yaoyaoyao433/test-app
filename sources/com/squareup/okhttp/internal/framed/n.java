package com.squareup.okhttp.internal.framed;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n {
    int a;
    int b;
    int c;
    final int[] d = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public final n a(int i, int i2, int i3) {
        if (i >= this.d.length) {
            return this;
        }
        int i4 = 1 << i;
        this.a |= i4;
        if ((i2 & 1) != 0) {
            this.b |= i4;
        } else {
            this.b &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.c |= i4;
        } else {
            this.c &= ~i4;
        }
        this.d[i] = i3;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = e(i) ? 2 : 0;
        return d(i) ? i2 | 1 : i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if ((this.a & 2) != 0) {
            return this.d[1];
        }
        return -1;
    }

    public final int c(int i) {
        if ((this.a & 128) != 0) {
            return this.d[7];
        }
        return 65536;
    }

    private boolean d(int i) {
        return ((1 << i) & this.b) != 0;
    }

    private boolean e(int i) {
        return ((1 << i) & this.c) != 0;
    }
}
