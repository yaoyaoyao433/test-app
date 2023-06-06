package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class a {
    public static final a b = new a(new byte[0]);
    final byte[] a;
    private volatile int c = 0;

    private a(byte[] bArr) {
        this.a = bArr;
    }

    public static a a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static a a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new a(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int length = this.a.length;
            if (length != aVar.a.length) {
                return false;
            }
            byte[] bArr = this.a;
            byte[] bArr2 = aVar.a;
            for (int i = 0; i < length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            byte[] bArr = this.a;
            int length = this.a.length;
            int i2 = length;
            for (int i3 = 0; i3 < length; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.c = i;
        }
        return i;
    }
}
