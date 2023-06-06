package com.bumptech.glide.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements Closeable {
    final Charset a;
    int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        }
        if (!charset.equals(c.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.c = inputStream;
        this.a = charset;
        this.d = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
        }
    }

    public final String a() throws IOException {
        int i;
        int i2;
        synchronized (this.c) {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.b) {
                b();
            }
            for (int i3 = this.e; i3 != this.b; i3++) {
                if (this.d[i3] == 10) {
                    if (i3 != this.e) {
                        i2 = i3 - 1;
                        if (this.d[i2] == 13) {
                            String str = new String(this.d, this.e, i2 - this.e, this.a.name());
                            this.e = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    String str2 = new String(this.d, this.e, i2 - this.e, this.a.name());
                    this.e = i3 + 1;
                    return str2;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.b - this.e) + 80) { // from class: com.bumptech.glide.disklrucache.b.1
                @Override // java.io.ByteArrayOutputStream
                public final String toString() {
                    try {
                        return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, b.this.a.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byteArrayOutputStream.write(this.d, this.e, this.b - this.e);
                this.b = -1;
                b();
                i = this.e;
                while (i != this.b) {
                    if (this.d[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.e) {
                byteArrayOutputStream.write(this.d, this.e, i - this.e);
            }
            this.e = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    private void b() throws IOException {
        int read = this.c.read(this.d, 0, this.d.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.e = 0;
        this.b = read;
    }
}
