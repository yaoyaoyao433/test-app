package com.squareup.okhttp.internal.framed;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import okio.r;
import okio.s;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    static final /* synthetic */ boolean j = !e.class.desiredAssertionStatus();
    long b;
    final int c;
    final d d;
    List<f> e;
    public final b f;
    final a g;
    private final List<f> k;
    long a = 0;
    public final c h = new c();
    public final c i = new c();
    private com.squareup.okhttp.internal.framed.a l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i, d dVar, boolean z, boolean z2, List<f> list) {
        if (dVar == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.c = i;
        this.d = dVar;
        this.b = dVar.f.c(65536);
        this.f = new b(dVar.e.c(65536));
        this.g = new a();
        this.f.g = z2;
        this.g.e = z;
        this.k = list;
    }

    public final synchronized boolean a() {
        if (this.l != null) {
            return false;
        }
        if ((this.f.g || this.f.f) && (this.g.e || this.g.d)) {
            if (this.e != null) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return this.d.b == ((this.c & 1) == 1);
    }

    public final synchronized List<f> c() throws IOException {
        this.h.enter();
        while (this.e == null && this.l == null) {
            f();
        }
        this.h.a();
        if (this.e == null) {
            throw new IOException("stream was reset: " + this.l);
        }
        return this.e;
    }

    public final r d() {
        synchronized (this) {
            if (this.e == null && !b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.g;
    }

    public final void a(com.squareup.okhttp.internal.framed.a aVar) throws IOException {
        if (d(aVar)) {
            this.d.b(this.c, aVar);
        }
    }

    public final void b(com.squareup.okhttp.internal.framed.a aVar) {
        if (d(aVar)) {
            this.d.a(this.c, aVar);
        }
    }

    private boolean d(com.squareup.okhttp.internal.framed.a aVar) {
        if (j || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.l != null) {
                    return false;
                }
                if (this.f.g && this.g.e) {
                    return false;
                }
                this.l = aVar;
                notifyAll();
                this.d.b(this.c);
                return true;
            }
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        boolean a2;
        if (!j && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f.g = true;
            a2 = a();
            notifyAll();
        }
        if (a2) {
            return;
        }
        this.d.b(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(com.squareup.okhttp.internal.framed.a aVar) {
        if (this.l == null) {
            this.l = aVar;
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class b implements s {
        static final /* synthetic */ boolean a = !e.class.desiredAssertionStatus();
        private final okio.c c;
        private final okio.c d;
        private final long e;
        private boolean f;
        private boolean g;

        private b(long j) {
            this.c = new okio.c();
            this.d = new okio.c();
            this.e = j;
        }

        @Override // okio.s
        public final long read(okio.c cVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            synchronized (e.this) {
                a();
                if (!this.f) {
                    if (e.this.l != null) {
                        throw new IOException("stream was reset: " + e.this.l);
                    } else if (this.d.b == 0) {
                        return -1L;
                    } else {
                        long read = this.d.read(cVar, Math.min(j, this.d.b));
                        e.this.a += read;
                        if (e.this.a >= e.this.d.e.c(65536) / 2) {
                            e.this.d.a(e.this.c, e.this.a);
                            e.this.a = 0L;
                        }
                        synchronized (e.this.d) {
                            e.this.d.c += read;
                            if (e.this.d.c >= e.this.d.e.c(65536) / 2) {
                                e.this.d.a(0, e.this.d.c);
                                e.this.d.c = 0L;
                            }
                        }
                        return read;
                    }
                }
                throw new IOException("stream closed");
            }
        }

        private void a() throws IOException {
            e.this.h.enter();
            while (this.d.b == 0 && !this.g && !this.f && e.this.l == null) {
                try {
                    e.this.f();
                } finally {
                    e.this.h.a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(okio.e eVar, long j) throws IOException {
            boolean z;
            boolean z2;
            if (!a && Thread.holdsLock(e.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (e.this) {
                    z = this.g;
                    z2 = this.d.b + j > this.e;
                }
                if (z2) {
                    eVar.i(j);
                    e.this.b(com.squareup.okhttp.internal.framed.a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    eVar.i(j);
                    return;
                } else {
                    long read = eVar.read(this.c, j);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    j -= read;
                    synchronized (e.this) {
                        boolean z3 = this.d.b == 0;
                        this.d.a(this.c);
                        if (z3) {
                            e.this.notifyAll();
                        }
                    }
                }
            }
        }

        @Override // okio.s
        public final t timeout() {
            return e.this.h;
        }

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (e.this) {
                this.f = true;
                this.d.s();
                e.this.notifyAll();
            }
            e.f(e.this);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a implements r {
        static final /* synthetic */ boolean a = !e.class.desiredAssertionStatus();
        private final okio.c c = new okio.c();
        private boolean d;
        private boolean e;

        a() {
        }

        @Override // okio.r
        public final void write(okio.c cVar, long j) throws IOException {
            if (!a && Thread.holdsLock(e.this)) {
                throw new AssertionError();
            }
            this.c.write(cVar, j);
            while (this.c.b >= 16384) {
                a(false);
            }
        }

        private void a(boolean z) throws IOException {
            long min;
            synchronized (e.this) {
                e.this.i.enter();
                while (e.this.b <= 0 && !this.e && !this.d && e.this.l == null) {
                    e.this.f();
                }
                e.this.i.a();
                e.h(e.this);
                min = Math.min(e.this.b, this.c.b);
                e.this.b -= min;
            }
            e.this.i.enter();
            try {
                e.this.d.a(e.this.c, z && min == this.c.b, this.c, min);
            } finally {
                e.this.i.a();
            }
        }

        @Override // okio.r, java.io.Flushable
        public final void flush() throws IOException {
            if (!a && Thread.holdsLock(e.this)) {
                throw new AssertionError();
            }
            synchronized (e.this) {
                e.h(e.this);
            }
            while (this.c.b > 0) {
                a(false);
                e.this.d.b();
            }
        }

        @Override // okio.r
        public final t timeout() {
            return e.this.i;
        }

        @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (!a && Thread.holdsLock(e.this)) {
                throw new AssertionError();
            }
            synchronized (e.this) {
                if (this.d) {
                    return;
                }
                if (!e.this.g.e) {
                    if (this.c.b <= 0) {
                        e.this.d.a(e.this.c, true, (okio.c) null, 0L);
                    } else {
                        while (this.c.b > 0) {
                            a(true);
                        }
                    }
                }
                synchronized (e.this) {
                    this.d = true;
                }
                e.this.d.b();
                e.f(e.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j2) {
        this.b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c extends okio.a {
        c() {
        }

        @Override // okio.a
        public final void timedOut() {
            e.this.b(com.squareup.okhttp.internal.framed.a.CANCEL);
        }

        @Override // okio.a
        public final IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void a() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }
    }

    static /* synthetic */ void f(e eVar) throws IOException {
        boolean z;
        boolean a2;
        if (!j && Thread.holdsLock(eVar)) {
            throw new AssertionError();
        }
        synchronized (eVar) {
            z = !eVar.f.g && eVar.f.f && (eVar.g.e || eVar.g.d);
            a2 = eVar.a();
        }
        if (z) {
            eVar.a(com.squareup.okhttp.internal.framed.a.CANCEL);
        } else if (a2) {
        } else {
            eVar.d.b(eVar.c);
        }
    }

    static /* synthetic */ void h(e eVar) throws IOException {
        if (!eVar.g.d) {
            if (eVar.g.e) {
                throw new IOException("stream finished");
            }
            if (eVar.l == null) {
                return;
            }
            throw new IOException("stream was reset: " + eVar.l);
        }
        throw new IOException("stream closed");
    }
}
