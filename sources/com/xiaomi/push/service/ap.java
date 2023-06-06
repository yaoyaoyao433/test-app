package com.xiaomi.push.service;
/* loaded from: classes6.dex */
public final class ap {
    private static int a = 8;
    private int e = -666;
    private byte[] b = new byte[256];
    private int d = 0;
    private int c = 0;

    private static int a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    private void a() {
        this.d = 0;
        this.c = 0;
    }

    private static void a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    public static byte[] a(String str, String str2) {
        byte[] b = com.xiaomi.push.ao.b(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[b.length + 1 + bytes.length];
        for (int i = 0; i < b.length; i++) {
            bArr[i] = b[i];
        }
        bArr[b.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[b.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr, String str) {
        return a(bArr, com.xiaomi.push.ao.b(str));
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        ap apVar = new ap();
        apVar.a(bArr);
        apVar.a();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ apVar.b());
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        if (i < 0 || i > bArr2.length || i + i2 > bArr2.length) {
            throw new IllegalArgumentException("start = " + i + " len = " + i2);
        }
        ap apVar = new ap();
        apVar.a(bArr);
        apVar.a();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i + i3;
            bArr2[i4] = (byte) (bArr2[i4] ^ apVar.b());
        }
        return bArr2;
    }

    private byte b() {
        this.c = (this.c + 1) % 256;
        this.d = (this.d + a(this.b[this.c])) % 256;
        a(this.b, this.c, this.d);
        return this.b[(a(this.b[this.c]) + a(this.b[this.d])) % 256];
    }

    private void a(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            this.b[i2] = (byte) i2;
        }
        this.d = 0;
        while (true) {
            this.c = i;
            if (this.c >= 256) {
                return;
            }
            this.d = ((this.d + a(this.b[this.c])) + a(bArr[this.c % length])) % 256;
            a(this.b, this.c, this.d);
            i = this.c + 1;
        }
    }
}
