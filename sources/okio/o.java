package okio;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.meituan.robust.common.CommonConstant;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class o implements e {
    public final c a = new c();
    public final s b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("source == null");
        }
        this.b = sVar;
    }

    @Override // okio.e
    public final c a() {
        return this.a;
    }

    @Override // okio.s
    public final long read(c cVar, long j) throws IOException {
        if (cVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.c) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            } else {
                if (this.a.b == 0 && this.b.read(this.a, 8192L) == -1) {
                    return -1L;
                }
                return this.a.read(cVar, Math.min(j, this.a.b));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.e
    public final boolean d() throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        return this.a.d() && this.b.read(this.a, 8192L) == -1;
    }

    @Override // okio.e
    public final void a(long j) throws IOException {
        if (!b(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.e
    public final boolean b(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        } else {
            while (this.a.b < j) {
                if (this.b.read(this.a, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // okio.e
    public final byte g() throws IOException {
        a(1L);
        return this.a.g();
    }

    @Override // okio.e
    public final f d(long j) throws IOException {
        a(j);
        return this.a.d(j);
    }

    @Override // okio.e
    public final byte[] r() throws IOException {
        this.a.a(this.b);
        return this.a.r();
    }

    @Override // okio.e
    public final byte[] h(long j) throws IOException {
        a(j);
        return this.a.h(j);
    }

    @Override // okio.e
    public final void a(byte[] bArr) throws IOException {
        try {
            a(bArr.length);
            this.a.a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.a.b > 0) {
                int a = this.a.a(bArr, i, (int) this.a.b);
                if (a == -1) {
                    throw new AssertionError();
                }
                i += a;
            }
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.a.b == 0 && this.b.read(this.a, 8192L) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    @Override // okio.e
    public final void a(c cVar, long j) throws IOException {
        try {
            a(j);
            this.a.a(cVar, j);
        } catch (EOFException e) {
            cVar.a(this.a);
            throw e;
        }
    }

    @Override // okio.e
    public final String a(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.a.a(this.b);
        return this.a.a(charset);
    }

    @Override // okio.e
    public final String q() throws IOException {
        return f(Long.MAX_VALUE);
    }

    @Override // okio.e
    public final String f(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a = a((byte) 10, 0L, j2);
        if (a != -1) {
            return this.a.g(a);
        }
        if (j2 < Long.MAX_VALUE && b(j2) && this.a.c(j2 - 1) == 13 && b(1 + j2) && this.a.c(j2) == 10) {
            return this.a.g(j2);
        }
        c cVar = new c();
        this.a.a(cVar, 0L, Math.min(32L, this.a.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.a.b, j) + " content=" + cVar.o().f() + (char) 8230);
    }

    @Override // okio.e
    public final short h() throws IOException {
        a(2L);
        return this.a.h();
    }

    @Override // okio.e
    public final short k() throws IOException {
        a(2L);
        return u.a(this.a.h());
    }

    @Override // okio.e
    public final int i() throws IOException {
        a(4L);
        return this.a.i();
    }

    @Override // okio.e
    public final int l() throws IOException {
        a(4L);
        return u.a(this.a.i());
    }

    @Override // okio.e
    public final long j() throws IOException {
        a(8L);
        return this.a.j();
    }

    @Override // okio.e
    public final long m() throws IOException {
        byte c;
        a(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!b(i2)) {
                break;
            }
            c = this.a.c(i);
            if ((c < 48 || c > 57) && !(i == 0 && c == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(c)));
        }
        return this.a.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.a(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L4a
            okio.c r3 = r6.a
            long r4 = (long) r1
            byte r3 = r3.c(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            okio.c r0 = r6.a
            long r0 = r0.n()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.o.n():long");
    }

    @Override // okio.e
    public final void i(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        while (j > 0) {
            if (this.a.b == 0 && this.b.read(this.a, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.a.b);
            this.a.i(min);
            j -= min;
        }
    }

    @Override // okio.e
    public final long a(byte b) throws IOException {
        return a((byte) 0, 0L, Long.MAX_VALUE);
    }

    private long a(byte b, long j, long j2) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        if (j2 >= 0) {
            while (j < j2) {
                long a = this.a.a(b, j, j2);
                if (a != -1) {
                    return a;
                }
                long j3 = this.a.b;
                if (j3 >= j2 || this.b.read(this.a, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j3);
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j2)));
    }

    @Override // okio.e
    public final boolean a(long j, f fVar) throws IOException {
        int h = fVar.h();
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        if (h < 0 || fVar.h() - 0 < h) {
            return false;
        }
        for (int i = 0; i < h; i++) {
            long j2 = 0 + i;
            if (!b(1 + j2) || this.a.c(j2) != fVar.a(i + 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.e
    public final InputStream e() {
        return new InputStream() { // from class: okio.o.1
            @Override // java.io.InputStream
            public final int read() throws IOException {
                if (o.this.c) {
                    throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
                }
                if (o.this.a.b == 0 && o.this.b.read(o.this.a, 8192L) == -1) {
                    return -1;
                }
                return o.this.a.g() & 255;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                if (o.this.c) {
                    throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
                }
                u.a(bArr.length, i, i2);
                if (o.this.a.b == 0 && o.this.b.read(o.this.a, 8192L) == -1) {
                    return -1;
                }
                return o.this.a.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public final int available() throws IOException {
                if (o.this.c) {
                    throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
                }
                return (int) Math.min(o.this.a.b, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                o.this.close();
            }

            public final String toString() {
                return o.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, okio.s
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.s();
    }

    @Override // okio.s
    public final t timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.b + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
