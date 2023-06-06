package com.squareup.okhttp.internal.http;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.r;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e implements j {
    final s a;
    final okio.e b;
    final okio.d c;
    int d = 0;
    private h e;

    public e(s sVar, okio.e eVar, okio.d dVar) {
        this.a = sVar;
        this.b = eVar;
        this.c = dVar;
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void a(h hVar) {
        this.e = hVar;
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final okio.r a(x xVar, long j) throws IOException {
        if ("chunked".equalsIgnoreCase(xVar.a("Transfer-Encoding"))) {
            if (this.d != 1) {
                throw new IllegalStateException("state: " + this.d);
            }
            this.d = 2;
            return new b();
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else {
            if (this.d != 1) {
                throw new IllegalStateException("state: " + this.d);
            }
            this.d = 2;
            return new d(j);
        }
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void cancel() {
        com.squareup.okhttp.internal.io.b a2 = this.a.a();
        if (a2 != null) {
            a2.cancel();
        }
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void a(x xVar) throws IOException {
        this.e.a();
        Proxy.Type type = this.e.c.a().a().b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.b);
        sb.append(Constants.SPACE);
        if (!xVar.a.c() && type == Proxy.Type.HTTP) {
            sb.append(xVar.a);
        } else {
            sb.append(n.a(xVar.a));
        }
        sb.append(" HTTP/1.1");
        a(xVar.c, sb.toString());
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final z.a a() throws IOException {
        return c();
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void b() throws IOException {
        this.c.flush();
    }

    public final void a(com.squareup.okhttp.r rVar, String str) throws IOException {
        if (this.d != 0) {
            throw new IllegalStateException("state: " + this.d);
        }
        this.c.b(str).b(StringUtil.CRLF_STRING);
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            this.c.b(rVar.a(i)).b(": ").b(rVar.b(i)).b(StringUtil.CRLF_STRING);
        }
        this.c.b(StringUtil.CRLF_STRING);
        this.d = 1;
    }

    public final z.a c() throws IOException {
        r a2;
        z.a a3;
        if (this.d != 1 && this.d != 3) {
            throw new IllegalStateException("state: " + this.d);
        }
        do {
            try {
                a2 = r.a(this.b.q());
                z.a aVar = new z.a();
                aVar.b = a2.a;
                aVar.c = a2.b;
                aVar.d = a2.c;
                a3 = aVar.a(d());
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.a);
                iOException.initCause(e);
                throw iOException;
            }
        } while (a2.b == 100);
        this.d = 4;
        return a3;
    }

    public final com.squareup.okhttp.r d() throws IOException {
        r.a aVar = new r.a();
        while (true) {
            String q = this.b.q();
            if (q.length() != 0) {
                com.squareup.okhttp.internal.d.b.a(aVar, q);
            } else {
                return aVar.a();
            }
        }
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void a(o oVar) throws IOException {
        if (this.d != 1) {
            throw new IllegalStateException("state: " + this.d);
        }
        this.d = 3;
        oVar.a(this.c);
    }

    public final okio.s a(long j) throws IOException {
        if (this.d != 4) {
            throw new IllegalStateException("state: " + this.d);
        }
        this.d = 5;
        return new C1425e(j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    final class d implements okio.r {
        private final okio.j b;
        private boolean c;
        private long d;

        private d(long j) {
            this.b = new okio.j(e.this.c.timeout());
            this.d = j;
        }

        @Override // okio.r
        public final t timeout() {
            return this.b;
        }

        @Override // okio.r
        public final void write(okio.c cVar, long j) throws IOException {
            if (this.c) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            com.squareup.okhttp.internal.j.a(cVar.b, 0L, j);
            if (j > this.d) {
                throw new ProtocolException("expected " + this.d + " bytes but received " + j);
            }
            e.this.c.write(cVar, j);
            this.d -= j;
        }

        @Override // okio.r, java.io.Flushable
        public final void flush() throws IOException {
            if (this.c) {
                return;
            }
            e.this.c.flush();
        }

        @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.d > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            e.a(e.this, this.b);
            e.this.d = 3;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    final class b implements okio.r {
        private final okio.j b;
        private boolean c;

        private b() {
            this.b = new okio.j(e.this.c.timeout());
        }

        @Override // okio.r
        public final t timeout() {
            return this.b;
        }

        @Override // okio.r
        public final void write(okio.c cVar, long j) throws IOException {
            if (this.c) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (j == 0) {
                return;
            }
            e.this.c.m(j);
            e.this.c.b(StringUtil.CRLF_STRING);
            e.this.c.write(cVar, j);
            e.this.c.b(StringUtil.CRLF_STRING);
        }

        @Override // okio.r, java.io.Flushable
        public final synchronized void flush() throws IOException {
            if (this.c) {
                return;
            }
            e.this.c.flush();
        }

        @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            if (this.c) {
                return;
            }
            this.c = true;
            e.this.c.b("0\r\n\r\n");
            e.a(e.this, this.b);
            e.this.d = 3;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    abstract class a implements okio.s {
        protected final okio.j a;
        protected boolean b;

        private a() {
            this.a = new okio.j(e.this.b.timeout());
        }

        @Override // okio.s
        public t timeout() {
            return this.a;
        }

        protected final void a() throws IOException {
            if (e.this.d != 5) {
                throw new IllegalStateException("state: " + e.this.d);
            }
            e.a(e.this, this.a);
            e.this.d = 6;
            if (e.this.a != null) {
                e.this.a.a(e.this);
            }
        }

        protected final void b() {
            if (e.this.d == 6) {
                return;
            }
            e.this.d = 6;
            if (e.this.a != null) {
                e.this.a.a(true, false, false);
                e.this.a.a(e.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.squareup.okhttp.internal.http.e$e  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1425e extends a {
        private long e;

        public C1425e(long j) throws IOException {
            super();
            this.e = j;
            if (this.e == 0) {
                a();
            }
        }

        @Override // okio.s
        public final long read(okio.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            } else {
                if (this.e == 0) {
                    return -1L;
                }
                long read = e.this.b.read(cVar, Math.min(this.e, j));
                if (read == -1) {
                    b();
                    throw new ProtocolException("unexpected end of stream");
                }
                this.e -= read;
                if (this.e == 0) {
                    a();
                }
                return read;
            }
        }

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.e != 0 && !com.squareup.okhttp.internal.j.a(this, 100, TimeUnit.MILLISECONDS)) {
                b();
            }
            this.b = true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class c extends a {
        private long e;
        private boolean f;
        private final h g;

        c(h hVar) throws IOException {
            super();
            this.e = -1L;
            this.f = true;
            this.g = hVar;
        }

        @Override // okio.s
        public final long read(okio.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            } else {
                if (this.f) {
                    if (this.e == 0 || this.e == -1) {
                        if (this.e != -1) {
                            e.this.b.q();
                        }
                        try {
                            this.e = e.this.b.n();
                            String trim = e.this.b.q().trim();
                            if (this.e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.e + trim + CommonConstant.Symbol.DOUBLE_QUOTES);
                            }
                            if (this.e == 0) {
                                this.f = false;
                                this.g.a(e.this.d());
                                a();
                            }
                            if (!this.f) {
                                return -1L;
                            }
                        } catch (NumberFormatException e) {
                            throw new ProtocolException(e.getMessage());
                        }
                    }
                    long read = e.this.b.read(cVar, Math.min(j, this.e));
                    if (read == -1) {
                        b();
                        throw new ProtocolException("unexpected end of stream");
                    }
                    this.e -= read;
                    return read;
                }
                return -1L;
            }
        }

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.b) {
                return;
            }
            if (this.f && !com.squareup.okhttp.internal.j.a(this, 100, TimeUnit.MILLISECONDS)) {
                b();
            }
            this.b = true;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class f extends a {
        private boolean e;

        private f() {
            super();
        }

        @Override // okio.s
        public final long read(okio.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
            } else {
                if (this.e) {
                    return -1L;
                }
                long read = e.this.b.read(cVar, j);
                if (read == -1) {
                    this.e = true;
                    a();
                    return -1L;
                }
                return read;
            }
        }

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.b) {
                return;
            }
            if (!this.e) {
                b();
            }
            this.b = true;
        }
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final aa a(z zVar) throws IOException {
        okio.s fVar;
        if (!h.c(zVar)) {
            fVar = a(0L);
        } else if ("chunked".equalsIgnoreCase(zVar.a("Transfer-Encoding", null))) {
            h hVar = this.e;
            if (this.d != 4) {
                throw new IllegalStateException("state: " + this.d);
            }
            this.d = 5;
            fVar = new c(hVar);
        } else {
            long a2 = k.a(zVar);
            if (a2 != -1) {
                fVar = a(a2);
            } else if (this.d != 4) {
                throw new IllegalStateException("state: " + this.d);
            } else if (this.a == null) {
                throw new IllegalStateException("streamAllocation == null");
            } else {
                this.d = 5;
                this.a.a(true, false, false);
                fVar = new f();
            }
        }
        return new l(zVar.f, okio.m.a(fVar));
    }

    static /* synthetic */ void a(e eVar, okio.j jVar) {
        t tVar = jVar.a;
        jVar.a(t.NONE);
        tVar.clearDeadline();
        tVar.clearTimeout();
    }
}
