package com.google.archivepatcher.shared;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j extends OutputStream {
    private final RandomAccessFile a;

    public j(File file, long j) throws IOException {
        this.a = new RandomAccessFile(file, "rw");
        if (j >= 0) {
            this.a.setLength(j);
            if (this.a.length() != j) {
                throw new IOException("Unable to set the file size");
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.getChannel().force(true);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        flush();
        this.a.close();
    }
}
