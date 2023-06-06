package com.squareup.picasso.progressive;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends InputStream {
    public long a;
    public int b;
    public volatile j c;
    private long d;

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.c == null) {
            return -1;
        }
        byte[] bArr = this.c.a;
        int i = this.c.b;
        if (bArr == null || this.b >= i) {
            return -1;
        }
        this.d++;
        int i2 = this.b;
        this.b = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.c == null) {
            return 0L;
        }
        byte[] bArr = this.c.a;
        int i = this.c.b;
        if (bArr == null || this.b >= i) {
            return 0L;
        }
        if (this.b + j >= i) {
            j = i - this.b;
        }
        this.b = (int) (this.b + j);
        this.d += j;
        return j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new RuntimeException("Stub!");
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        throw new RuntimeException("Stub!");
    }
}
