package com.squareup.okhttp.internal.http;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import java.io.IOException;
import java.net.ProtocolException;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o implements okio.r {
    public final okio.c a;
    private boolean b;
    private final int c;

    @Override // okio.r, java.io.Flushable
    public final void flush() throws IOException {
    }

    public o(int i) {
        this.a = new okio.c();
        this.c = i;
    }

    public o() {
        this(-1);
    }

    @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.a.b >= this.c) {
            return;
        }
        throw new ProtocolException("content-length promised " + this.c + " bytes, but received " + this.a.b);
    }

    @Override // okio.r
    public final void write(okio.c cVar, long j) throws IOException {
        if (this.b) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        com.squareup.okhttp.internal.j.a(cVar.b, 0L, j);
        if (this.c != -1 && this.a.b > this.c - j) {
            throw new ProtocolException("exceeded content-length limit of " + this.c + " bytes");
        }
        this.a.write(cVar, j);
    }

    @Override // okio.r
    public final t timeout() {
        return t.NONE;
    }

    public final void a(okio.r rVar) throws IOException {
        okio.c cVar = new okio.c();
        this.a.a(cVar, 0L, this.a.b);
        rVar.write(cVar, cVar.b);
    }
}
