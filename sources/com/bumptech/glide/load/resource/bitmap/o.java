package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public o(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.d = -1;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.a = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.a == null || inputStream == null) {
            throw b();
        }
        return (this.b - this.e) + inputStream.available();
    }

    private static IOException b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void a() {
        this.c = this.a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a = null;
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        if (this.d == -1 || this.e - this.d >= this.c) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.d = -1;
                this.e = 0;
                this.b = read;
            }
            return read;
        }
        if (this.d == 0 && this.c > bArr.length && this.b == bArr.length) {
            int length = bArr.length * 2;
            if (length > this.c) {
                length = this.c;
            }
            if (Log.isLoggable("BufferedIs", 3)) {
                new StringBuilder("allocate buffer of length: ").append(length);
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.a = bArr2;
            bArr = bArr2;
        } else if (this.d > 0) {
            System.arraycopy(bArr, this.d, bArr, 0, bArr.length - this.d);
        }
        this.e -= this.d;
        this.d = 0;
        this.b = 0;
        int read2 = inputStream.read(bArr, this.e, bArr.length - this.e);
        this.b = read2 <= 0 ? this.e : this.e + read2;
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw b();
        }
        if (this.e < this.b || a(inputStream, bArr) != -1) {
            if (bArr != this.a && (bArr = this.a) == null) {
                throw b();
            }
            if (this.b - this.e > 0) {
                int i = this.e;
                this.e = i + 1;
                return bArr[i] & 255;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            throw b();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.in;
        if (inputStream == null) {
            throw b();
        }
        if (this.e < this.b) {
            int i5 = this.b - this.e >= i2 ? i2 : this.b - this.e;
            System.arraycopy(bArr2, this.e, bArr, i, i5);
            this.e += i5;
            if (i5 == i2 || inputStream.available() == 0) {
                return i5;
            }
            i += i5;
            i3 = i2 - i5;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.d == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    if (i3 == i2) {
                        return -1;
                    }
                    return i2 - i3;
                }
            } else if (a(inputStream, bArr2) == -1) {
                if (i3 == i2) {
                    return -1;
                }
                return i2 - i3;
            } else {
                if (bArr2 != this.a && (bArr2 = this.a) == null) {
                    throw b();
                }
                i4 = this.b - this.e >= i3 ? i3 : this.b - this.e;
                System.arraycopy(bArr2, this.e, bArr, i, i4);
                this.e += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        }
        if (-1 == this.d) {
            throw new a("Mark has been invalidated");
        }
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws IOException {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr != null) {
            if (j < 1) {
                return 0L;
            }
            if (inputStream == null) {
                throw b();
            }
            if (this.b - this.e >= j) {
                this.e = (int) (this.e + j);
                return j;
            }
            long j2 = this.b - this.e;
            this.e = this.b;
            if (this.d != -1 && j <= this.c) {
                if (a(inputStream, bArr) == -1) {
                    return j2;
                }
                long j3 = j - j2;
                if (this.b - this.e >= j3) {
                    this.e = (int) (this.e + j3);
                    return j;
                }
                long j4 = (j2 + this.b) - this.e;
                this.e = this.b;
                return j4;
            }
            return j2 + inputStream.skip(j - j2);
        }
        throw b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        private static final long serialVersionUID = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }
}
