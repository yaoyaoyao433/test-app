package com.google.archivepatcher.applier;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends FilterInputStream {
    private long a;
    private byte[] b;

    public d(InputStream inputStream, long j) {
        super(inputStream);
        this.b = new byte[1];
        if (j < 0) {
            throw new IllegalArgumentException("numToRead must be >= 0: " + j);
        }
        this.a = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (read(this.b, 0, 1) == 1) {
            return this.b[0];
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min(i2, this.a));
        if (read > 0) {
            this.a -= read;
        }
        return read;
    }
}
