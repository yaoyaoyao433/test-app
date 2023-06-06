package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends FilterInputStream {
    public int a;
    private int b;
    private int c;
    private int d;

    public f(InputStream inputStream) {
        super(inputStream);
        this.b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        super.mark(i);
        this.b = i;
        this.c = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        this.d += read;
        this.a = Math.max(this.d, this.a);
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) a(i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        this.d += read;
        this.a = Math.max(this.d, this.a);
        b(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        super.reset();
        this.b = Integer.MIN_VALUE;
        this.d = this.c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long a = a(j);
        if (a == -1) {
            return -1L;
        }
        long skip = super.skip(a);
        this.d = (int) (this.d + skip);
        this.a = Math.max(this.d, this.a);
        b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return this.b == Integer.MIN_VALUE ? super.available() : Math.min(this.b, super.available());
    }

    private long a(long j) {
        if (this.b == 0) {
            return -1L;
        }
        return (this.b == Integer.MIN_VALUE || j <= ((long) this.b)) ? j : this.b;
    }

    private void b(long j) {
        if (this.b == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.b = (int) (this.b - j);
    }
}
