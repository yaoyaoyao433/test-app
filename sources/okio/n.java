package okio;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class n implements d {
    public final c a = new c();
    public final r b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.b = rVar;
    }

    @Override // okio.d, okio.e
    public final c a() {
        return this.a;
    }

    @Override // okio.r
    public final void write(c cVar, long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.write(cVar, j);
        v();
    }

    @Override // okio.d
    public final d c(f fVar) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.c(fVar);
        return v();
    }

    @Override // okio.d
    public final d b(String str) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.b(str);
        return v();
    }

    @Override // okio.d
    public final d c(byte[] bArr) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.c(bArr);
        return v();
    }

    @Override // okio.d
    public final d c(byte[] bArr, int i, int i2) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.c(bArr, i, i2);
        return v();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        int write = this.a.write(byteBuffer);
        v();
        return write;
    }

    @Override // okio.d
    public final long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = sVar.read(this.a, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            v();
        }
    }

    @Override // okio.d
    public final d h(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.h(i);
        return v();
    }

    @Override // okio.d
    public final d g(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.g(i);
        return v();
    }

    @Override // okio.d
    public final d f(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.f(i);
        return v();
    }

    @Override // okio.d
    public final d n(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.n(j);
        return v();
    }

    @Override // okio.d
    public final d m(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.m(j);
        return v();
    }

    @Override // okio.d
    public final d v() throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        long f = this.a.f();
        if (f > 0) {
            this.b.write(this.a, f);
        }
        return this;
    }

    @Override // okio.d
    public final d c() throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        long j = this.a.b;
        if (j > 0) {
            this.b.write(this.a, j);
        }
        return this;
    }

    @Override // okio.d
    public final OutputStream b() {
        return new OutputStream() { // from class: okio.n.1
            @Override // java.io.OutputStream
            public final void write(int i) throws IOException {
                if (n.this.c) {
                    throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
                }
                n.this.a.h((int) ((byte) i));
                n.this.v();
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) throws IOException {
                if (n.this.c) {
                    throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
                }
                n.this.a.c(bArr, i, i2);
                n.this.v();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() throws IOException {
                if (n.this.c) {
                    return;
                }
                n.this.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                n.this.close();
            }

            public final String toString() {
                return n.this + ".outputStream()";
            }
        };
    }

    @Override // okio.d, okio.r, java.io.Flushable
    public final void flush() throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        if (this.a.b > 0) {
            this.b.write(this.a, this.a.b);
        }
        this.b.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, okio.r
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.a.b > 0) {
                this.b.write(this.a, this.a.b);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            u.a(th);
        }
    }

    @Override // okio.r
    public final t timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.b + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
