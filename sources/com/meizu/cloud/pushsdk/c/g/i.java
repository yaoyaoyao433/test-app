package com.meizu.cloud.pushsdk.c.g;

import android.support.annotation.NonNull;
import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public final class i implements d {
    final b a;
    final m b;
    boolean c;

    public i(m mVar) {
        this(mVar, new b());
    }

    private i(m mVar, b bVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.a = bVar;
        this.b = mVar;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.m
    public final long b(b bVar, long j) throws IOException {
        if (bVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.c) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            } else {
                if (this.a.b == 0 && this.b.b(this.a, 2048L) == -1) {
                    return -1L;
                }
                return this.a.b(bVar, Math.min(j, this.a.b));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public final InputStream b() {
        return new InputStream() { // from class: com.meizu.cloud.pushsdk.c.g.i.1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                i.this.close();
            }

            public final String toString() {
                return i.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public final int read() throws IOException {
                if (i.this.c) {
                    throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
                }
                if (i.this.a.b == 0 && i.this.b.b(i.this.a, 2048L) == -1) {
                    return -1;
                }
                return i.this.a.d() & 255;
            }

            @Override // java.io.InputStream
            public final int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
                if (i.this.c) {
                    throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
                }
                o.a(bArr.length, i, i2);
                if (i.this.a.b == 0 && i.this.b.b(i.this.a, 2048L) == -1) {
                    return -1;
                }
                return i.this.a.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public final int available() throws IOException {
                if (i.this.c) {
                    throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
                }
                return (int) Math.min(i.this.a.b, 2147483647L);
            }
        };
    }

    @Override // com.meizu.cloud.pushsdk.c.g.m, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.g();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public final String e() throws IOException {
        this.a.a(this.b);
        return this.a.e();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public final byte[] f() throws IOException {
        this.a.a(this.b);
        return this.a.f();
    }

    public final String toString() {
        return "buffer(" + this.b + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
