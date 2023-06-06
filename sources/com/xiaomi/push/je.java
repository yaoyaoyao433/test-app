package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class je extends jh {
    io a;
    private int b;

    public je(int i) {
        this.a = new io(i);
    }

    @Override // com.xiaomi.push.jh
    public final int a(byte[] bArr, int i, int i2) {
        byte[] a = this.a.a();
        if (i2 > this.a.b() - this.b) {
            i2 = this.a.b() - this.b;
        }
        if (i2 > 0) {
            System.arraycopy(a, this.b, bArr, i, i2);
            this.b += i2;
        }
        return i2;
    }

    @Override // com.xiaomi.push.jh
    public final void b(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
