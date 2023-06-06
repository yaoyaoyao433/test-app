package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends FilterInputStream {
    private static final byte[] a;
    private static final int b;
    private static final int c;
    private final byte d;
    private int e;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        a = bArr;
        int length = bArr.length;
        b = length;
        c = length + 2;
    }

    public d(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.d = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read;
        if (this.e < 2 || this.e > c) {
            read = super.read();
        } else if (this.e == c) {
            read = this.d;
        } else {
            read = a[this.e - 2] & 255;
        }
        if (read != -1) {
            this.e++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.e > c) {
            i3 = super.read(bArr, i, i2);
        } else if (this.e == c) {
            bArr[i] = this.d;
            i3 = 1;
        } else if (this.e < 2) {
            i3 = super.read(bArr, i, 2 - this.e);
        } else {
            int min = Math.min(c - this.e, i2);
            System.arraycopy(a, this.e - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.e += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.e = (int) (this.e + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
}
