package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends InputStream {
    private static final Queue<c> b = h.a(0);
    public IOException a;
    private InputStream c;

    public static c a(InputStream inputStream) {
        c poll;
        synchronized (b) {
            poll = b.poll();
        }
        if (poll == null) {
            poll = new c();
        }
        poll.c = inputStream;
        return poll;
    }

    c() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.c.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.c.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.c.read(bArr);
        } catch (IOException e) {
            this.a = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.c.read(bArr, i, i2);
        } catch (IOException e) {
            this.a = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.c.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.c.skip(j);
        } catch (IOException e) {
            this.a = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.c.read();
        } catch (IOException e) {
            this.a = e;
            return -1;
        }
    }

    public final void a() {
        this.a = null;
        this.c = null;
        synchronized (b) {
            b.offer(this);
        }
    }
}
