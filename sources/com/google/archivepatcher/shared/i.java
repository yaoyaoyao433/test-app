package com.google.archivepatcher.shared;

import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i extends InputStream {
    final long a;
    private final RandomAccessFile b;
    private long c;
    private long d;
    private long e;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public i(File file) throws IOException {
        this(file, 0L, file.length());
    }

    private i(File file, long j, long j2) throws IOException {
        this.c = -1L;
        this.b = new RandomAccessFile(file, r.o);
        this.a = file.length();
        a(0L, j2);
    }

    public final void a(long j, long j2) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("rangeOffset must be >= 0");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("rangeLength must be >= 0");
        }
        long j3 = j + j2;
        if (j3 > this.a) {
            throw new IllegalArgumentException("Read range exceeds file length");
        }
        if (j3 < 0) {
            throw new IllegalArgumentException("Insane input size not supported");
        }
        this.d = j;
        this.e = j2;
        this.c = j;
        reset();
        this.c = -1L;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long filePointer = this.e - (this.b.getFilePointer() - this.d);
        if (filePointer > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) filePointer;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (available() <= 0) {
            return -1;
        }
        return this.b.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0) {
            return 0;
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        return this.b.read(bArr, i, Math.min(i2, available));
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int available;
        if (j > 0 && (available = available()) > 0) {
            long min = (int) Math.min(available, j);
            this.b.seek(this.b.getFilePointer() + min);
            return min;
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        try {
            this.c = this.b.getFilePointer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.c < 0) {
            throw new IOException("mark not set");
        }
        this.b.seek(this.c);
    }
}
