package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class jg extends jh {
    private byte[] a;
    private int b;
    private int c;

    private void d(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = 0;
        this.c = i2 + 0;
    }

    @Override // com.xiaomi.push.jh
    public final int a(byte[] bArr, int i, int i2) {
        int c = c();
        if (i2 > c) {
            i2 = c;
        }
        if (i2 > 0) {
            System.arraycopy(this.a, this.b, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.xiaomi.push.jh
    public final void a(int i) {
        this.b += i;
    }

    public final void a(byte[] bArr) {
        d(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.jh
    public final byte[] a() {
        return this.a;
    }

    @Override // com.xiaomi.push.jh
    public final int b() {
        return this.b;
    }

    @Override // com.xiaomi.push.jh
    public final void b(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.jh
    public final int c() {
        return this.c - this.b;
    }
}
