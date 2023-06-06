package com.squareup.picasso.progressive;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends FilterInputStream {
    private int a;
    private int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        }
        if (i < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.a = i;
        this.b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, this.a));
        if (read > 0) {
            this.a -= read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.a));
        this.a = (int) (this.a - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(this.in.available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.b = this.a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.b == -1) {
            throw new IOException("mark not set");
        }
        this.in.reset();
        this.a = this.b;
    }
}
