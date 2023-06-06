package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.aa;
import com.squareup.okhttp.r;
import com.squareup.okhttp.t;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.util.Date;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public static final aa a = new aa() { // from class: com.squareup.okhttp.internal.http.h.1
        @Override // com.squareup.okhttp.aa
        public final u a() {
            return null;
        }

        @Override // com.squareup.okhttp.aa
        public final long b() {
            return 0L;
        }

        @Override // com.squareup.okhttp.aa
        public final okio.e c() {
            return new okio.c();
        }
    };
    public final v b;
    public final s c;
    public final z d;
    public j e;
    public long f = -1;
    public boolean g;
    public final boolean h;
    public final x i;
    public x j;
    public z k;
    public z l;
    public okio.r m;
    public okio.d n;
    public final boolean o;
    public final boolean p;
    public b q;
    public c r;

    public h(v vVar, x xVar, boolean z, boolean z2, boolean z3, s sVar, o oVar, z zVar) {
        s sVar2;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        com.squareup.okhttp.g gVar;
        this.b = vVar;
        this.i = xVar;
        this.h = z;
        this.o = z2;
        this.p = z3;
        if (sVar != null) {
            sVar2 = sVar;
        } else {
            com.squareup.okhttp.k kVar = vVar.r;
            if (xVar.a.c()) {
                SSLSocketFactory sSLSocketFactory2 = vVar.n;
                hostnameVerifier = vVar.o;
                sSLSocketFactory = sSLSocketFactory2;
                gVar = vVar.p;
            } else {
                sSLSocketFactory = null;
                hostnameVerifier = null;
                gVar = null;
            }
            sVar2 = new s(kVar, new com.squareup.okhttp.a(xVar.a.b, xVar.a.c, vVar.s, vVar.m, sSLSocketFactory, hostnameVerifier, gVar, vVar.q, vVar.d, vVar.e, vVar.f, vVar.i));
        }
        this.c = sVar2;
        this.m = oVar;
        this.d = zVar;
    }

    public final void a() {
        if (this.f != -1) {
            throw new IllegalStateException();
        }
        this.f = System.currentTimeMillis();
    }

    public void b() throws IOException {
        com.squareup.okhttp.internal.e a2 = com.squareup.okhttp.internal.d.b.a(this.b);
        if (a2 == null) {
            return;
        }
        if (!c.a(this.l, this.j)) {
            if (i.a(this.j.b)) {
                try {
                    a2.b(this.j);
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            return;
        }
        this.q = a2.a(a(this.l));
    }

    public final void cancel() {
        this.c.cancel();
    }

    public final s c() {
        if (this.n != null) {
            com.squareup.okhttp.internal.j.a(this.n);
        } else if (this.m != null) {
            com.squareup.okhttp.internal.j.a(this.m);
        }
        if (this.l != null) {
            com.squareup.okhttp.internal.j.a(this.l.g);
        } else {
            this.c.a(true, false, true);
        }
        return this.c;
    }

    public z b(z zVar) throws IOException {
        if (this.g && "gzip".equalsIgnoreCase(this.l.a("Content-Encoding", null)) && zVar.g != null) {
            okio.k kVar = new okio.k(zVar.g.c());
            com.squareup.okhttp.r a2 = zVar.f.c().b("Content-Encoding").b("Content-Length").a();
            z.a a3 = zVar.g().a(a2);
            a3.g = new l(a2, okio.m.a(kVar));
            return a3.a();
        }
        return zVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements t.a {
        private final int b;
        private final x c;
        private int d;

        public a(int i, x xVar) {
            this.b = i;
            this.c = xVar;
        }

        private com.squareup.okhttp.j b() {
            return h.this.c.a();
        }

        @Override // com.squareup.okhttp.t.a
        public final x a() {
            return this.c;
        }

        @Override // com.squareup.okhttp.t.a
        public final z a(x xVar) throws IOException {
            this.d++;
            if (this.b > 0) {
                t tVar = h.this.b.h.get(this.b - 1);
                com.squareup.okhttp.a aVar = b().a().a;
                if (!xVar.a.b.equals(aVar.a()) || xVar.a.c != aVar.b()) {
                    throw new IllegalStateException("network interceptor " + tVar + " must retain the same host and port");
                } else if (this.d > 1) {
                    throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
                }
            }
            if (this.b >= h.this.b.h.size()) {
                h.this.e.a(xVar);
                h.this.j = xVar;
                if (h.a(xVar) && xVar.d != null) {
                    okio.d a = okio.m.a(h.this.e.a(xVar, xVar.d.contentLength()));
                    xVar.d.writeTo(a);
                    a.close();
                }
                z d = h.this.d();
                int i = d.c;
                if ((i == 204 || i == 205) && d.g.b() > 0) {
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + d.g.b());
                }
                return d;
            }
            a aVar2 = new a(this.b + 1, xVar);
            t tVar2 = h.this.b.h.get(this.b);
            z intercept = tVar2.intercept(aVar2);
            if (aVar2.d != 1) {
                throw new IllegalStateException("network interceptor " + tVar2 + " must call proceed() exactly once");
            } else if (intercept != null) {
                return intercept;
            } else {
                throw new NullPointerException("network interceptor " + tVar2 + " returned null");
            }
        }
    }

    public z d() throws IOException {
        this.e.b();
        z.a a2 = this.e.a();
        a2.a = this.j;
        a2.e = this.c.a().c;
        z a3 = a2.a(k.b, Long.toString(this.f)).a(k.c, Long.toString(System.currentTimeMillis())).a();
        if (!this.p) {
            z.a g = a3.g();
            g.g = this.e.a(a3);
            a3 = g.a();
        }
        if ("close".equalsIgnoreCase(a3.a.a("Connection")) || "close".equalsIgnoreCase(a3.a("Connection", null))) {
            this.c.a(true, false, false);
        }
        return a3;
    }

    public static com.squareup.okhttp.r a(com.squareup.okhttp.r rVar, com.squareup.okhttp.r rVar2) throws IOException {
        r.a aVar = new r.a();
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = rVar.a(i);
            String b = rVar.b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b.startsWith("1")) && (!k.a(a2) || rVar2.a(a2) == null)) {
                aVar.a(a2, b);
            }
        }
        int length2 = rVar2.a.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String a3 = rVar2.a(i2);
            if (!"Content-Length".equalsIgnoreCase(a3) && k.a(a3)) {
                aVar.a(a3, rVar2.b(i2));
            }
        }
        return aVar.a();
    }

    public final void a(com.squareup.okhttp.r rVar) throws IOException {
        CookieHandler cookieHandler = this.b.j;
        if (cookieHandler != null) {
            cookieHandler.put(this.i.b(), k.a(rVar, (String) null));
        }
    }

    public final boolean a(com.squareup.okhttp.s sVar) {
        com.squareup.okhttp.s sVar2 = this.i.a;
        return sVar2.b.equals(sVar.b) && sVar2.c == sVar.c && sVar2.a.equals(sVar.a);
    }

    public static z a(z zVar) {
        if (zVar == null || zVar.g == null) {
            return zVar;
        }
        z.a g = zVar.g();
        g.g = null;
        return g.a();
    }

    public static boolean a(x xVar) {
        return i.c(xVar.b);
    }

    public static boolean c(z zVar) {
        if (zVar.a.b.equals("HEAD")) {
            return false;
        }
        int i = zVar.c;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && k.a(zVar) == -1 && !"chunked".equalsIgnoreCase(zVar.a("Transfer-Encoding", null))) ? false : true;
    }

    public static boolean a(z zVar, z zVar2) {
        Date b;
        if (zVar2.c == 304) {
            return true;
        }
        Date b2 = zVar.f.b("Last-Modified");
        return (b2 == null || (b = zVar2.f.b("Last-Modified")) == null || b.getTime() >= b2.getTime()) ? false : true;
    }
}
