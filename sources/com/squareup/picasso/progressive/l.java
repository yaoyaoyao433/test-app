package com.squareup.picasso.progressive;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l extends FilterInputStream {
    private final byte[] a;
    private int b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.a = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = this.in.read();
        return read != -1 ? read : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a = a();
            if (a == -1) {
                break;
            }
            bArr[i + i3] = (byte) a;
            i3++;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (this.in.markSupported()) {
            this.in.reset();
            this.b = this.c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.c = this.b;
        }
    }

    private int a() {
        if (this.b >= this.a.length) {
            return -1;
        }
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }
}
