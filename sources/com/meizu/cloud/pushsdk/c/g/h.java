package com.meizu.cloud.pushsdk.c.g;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class h implements c {
    private final b a;
    private final l b;
    private boolean c;

    public h(l lVar) {
        this(lVar, new b());
    }

    private h(l lVar, b bVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.a = bVar;
        this.b = lVar;
    }

    private c b() throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        long c = this.a.c();
        if (c > 0) {
            this.b.a(this.a, c);
        }
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final long a(m mVar) throws IOException {
        if (mVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long b = mVar.b(this.a, 2048L);
            if (b == -1) {
                return j;
            }
            j += b;
            b();
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final b a() {
        return this.a;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l
    public final void a(b bVar, long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.a(bVar, j);
        b();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final c b(e eVar) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.b(eVar);
        return b();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final c b(String str) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.b(str);
        return b();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final c b(byte[] bArr) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.b(bArr);
        return b();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final c c(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.c(j);
        return b();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final c c(byte[] bArr, int i, int i2) throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        this.a.c(bArr, i, i2);
        return b();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.c.g.m
    public final void close() {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.a.b > 0) {
                this.b.a(this.a, this.a.b);
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
            o.a(th);
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Flushable
    public final void flush() throws IOException {
        if (this.c) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        }
        if (this.a.b > 0) {
            this.b.a(this.a, this.a.b);
        }
        this.b.flush();
    }

    public final String toString() {
        return "buffer(" + this.b + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
