package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
/* loaded from: classes6.dex */
public final class bd {
    public final OutputStream a;
    private final byte[] b;
    private final int c;
    private int d;

    /* loaded from: classes6.dex */
    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public bd(OutputStream outputStream, byte[] bArr) {
        this.a = outputStream;
        this.b = bArr;
        this.d = 0;
        this.c = bArr.length;
    }

    private bd(byte[] bArr, int i, int i2) {
        this.a = null;
        this.b = bArr;
        this.d = i;
        this.c = i + i2;
    }

    public static int a(int i) {
        return c(ef.a(i, 0));
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return c(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static bd a(byte[] bArr, int i, int i2) {
        return new bd(bArr, i, i2);
    }

    private void a(byte b) {
        if (this.d == this.c) {
            a();
        }
        byte[] bArr = this.b;
        int i = this.d;
        this.d = i + 1;
        bArr[i] = b;
    }

    private void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public static int b(int i, String str) {
        return a(i) + a(str);
    }

    private static int b(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private void b(byte[] bArr, int i, int i2) {
        if (this.c - this.d >= i2) {
            System.arraycopy(bArr, 0, this.b, this.d, i2);
            this.d += i2;
            return;
        }
        int i3 = this.c - this.d;
        System.arraycopy(bArr, 0, this.b, this.d, i3);
        int i4 = i3 + 0;
        int i5 = i2 - i3;
        this.d = this.c;
        a();
        if (i5 > this.c) {
            this.a.write(bArr, i4, i5);
            return;
        }
        System.arraycopy(bArr, i4, this.b, 0, i5);
        this.d = i5;
    }

    private static int c(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public void a() {
        if (this.a == null) {
            throw new a();
        }
        this.a.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void e(int i, int i2) {
        b(ef.a(i, i2));
    }

    public final void a(int i, long j) {
        e(i, 0);
        a(j);
    }

    public final void a(int i, int i2) {
        e(i, 0);
        if (i2 >= 0) {
            b(i2);
        } else {
            a(i2);
        }
    }

    public final void a(int i, boolean z) {
        e(i, 0);
        a(z ? (byte) 1 : (byte) 0);
    }

    public final void a(int i, String str) {
        e(i, 2);
        byte[] bytes = str.getBytes("UTF-8");
        b(bytes.length);
        a(bytes);
    }

    public final void a(int i, de deVar) {
        e(i, 2);
        b(deVar.a());
        deVar.a(this);
    }

    public final void a(int i, com.xiaomi.push.a aVar) {
        e(1, 2);
        int length = aVar.a.length;
        byte[] bArr = new byte[length];
        System.arraycopy(aVar.a, 0, bArr, 0, length);
        b(bArr.length);
        a(bArr);
    }

    public final void b(int i, int i2) {
        e(1, 0);
        b(i2);
    }

    public static int b(int i, long j) {
        return a(i) + b(j);
    }

    public static int c(int i, long j) {
        return a(2) + b(j);
    }

    public static int c(int i, int i2) {
        return a(i) + (i2 >= 0 ? c(i2) : 10);
    }

    public static int b(int i, de deVar) {
        int a2 = a(i);
        int b = deVar.b();
        return a2 + c(b) + b;
    }

    public static int b(int i, com.xiaomi.push.a aVar) {
        return a(1) + c(aVar.a.length) + aVar.a.length;
    }

    public static int d(int i, int i2) {
        return a(1) + c(i2);
    }

    public final void b() {
        if (this.a != null) {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
        }
        if (this.c - this.d != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    private void b(int i) {
        while ((i & (-128)) != 0) {
            a((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        a((byte) i);
    }

    public final void a(long j) {
        while (((-128) & j) != 0) {
            a((byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        a((byte) j);
    }
}
