package com.squareup.okhttp;

import com.squareup.okhttp.l;
import com.squareup.okhttp.r;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class v implements Cloneable {
    static final List<w> a = com.squareup.okhttp.internal.j.a(w.HTTP_2, w.SPDY_3, w.HTTP_1_1);
    static final List<l> b = com.squareup.okhttp.internal.j.a(l.a, l.b, l.c);
    private static SSLSocketFactory z;
    private final com.squareup.okhttp.internal.i A;
    public n c;
    public Proxy d;
    public List<w> e;
    public List<l> f;
    public final List<t> g;
    public final List<t> h;
    public ProxySelector i;
    public CookieHandler j;
    public com.squareup.okhttp.internal.e k;
    public c l;
    public SocketFactory m;
    public SSLSocketFactory n;
    public HostnameVerifier o;
    public g p;
    public b q;
    public k r;
    public o s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;

    static {
        com.squareup.okhttp.internal.d.b = new com.squareup.okhttp.internal.d() { // from class: com.squareup.okhttp.v.1
            @Override // com.squareup.okhttp.internal.d
            public final void a(r.a aVar, String str) {
                aVar.a(str);
            }

            @Override // com.squareup.okhttp.internal.d
            public final com.squareup.okhttp.internal.i a(k kVar) {
                return kVar.e;
            }

            @Override // com.squareup.okhttp.internal.d
            public final com.squareup.okhttp.internal.e a(v vVar) {
                return vVar.k;
            }

            @Override // com.squareup.okhttp.internal.d
            public final boolean a(k kVar, com.squareup.okhttp.internal.io.b bVar) {
                if (k.f || Thread.holdsLock(kVar)) {
                    if (bVar.i || kVar.b == 0) {
                        kVar.d.remove(bVar);
                        return true;
                    }
                    kVar.notifyAll();
                    return false;
                }
                throw new AssertionError();
            }

            @Override // com.squareup.okhttp.internal.d
            public final com.squareup.okhttp.internal.io.b a(k kVar, a aVar, com.squareup.okhttp.internal.http.s sVar) {
                if (k.f || Thread.holdsLock(kVar)) {
                    for (com.squareup.okhttp.internal.io.b bVar : kVar.d) {
                        int size = bVar.h.size();
                        com.squareup.okhttp.internal.framed.d dVar = bVar.d;
                        if (size < (dVar != null ? dVar.a() : 1) && aVar.equals(bVar.a.a) && !bVar.i) {
                            sVar.a(bVar);
                            return bVar;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            @Override // com.squareup.okhttp.internal.d
            public final void b(k kVar, com.squareup.okhttp.internal.io.b bVar) {
                if (!k.f && !Thread.holdsLock(kVar)) {
                    throw new AssertionError();
                }
                if (kVar.d.isEmpty()) {
                    com.sankuai.waimai.launcher.util.aop.b.a(kVar.a, kVar.c);
                }
                kVar.d.add(bVar);
            }

            @Override // com.squareup.okhttp.internal.d
            public final void a(l lVar, SSLSocket sSLSocket, boolean z2) {
                String[] enabledCipherSuites = lVar.e != null ? (String[]) com.squareup.okhttp.internal.j.a(String.class, lVar.e, sSLSocket.getEnabledCipherSuites()) : sSLSocket.getEnabledCipherSuites();
                String[] enabledProtocols = lVar.f != null ? (String[]) com.squareup.okhttp.internal.j.a(String.class, lVar.f, sSLSocket.getEnabledProtocols()) : sSLSocket.getEnabledProtocols();
                if (z2 && com.squareup.okhttp.internal.j.a(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV")) {
                    enabledCipherSuites = com.squareup.okhttp.internal.j.b(enabledCipherSuites, "TLS_FALLBACK_SCSV");
                }
                l a2 = new l.a(lVar).a(enabledCipherSuites).b(enabledProtocols).a();
                if (a2.f != null) {
                    sSLSocket.setEnabledProtocols(a2.f);
                }
                if (a2.e != null) {
                    sSLSocket.setEnabledCipherSuites(a2.e);
                }
            }
        };
    }

    public v() {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = 10000;
        this.x = 10000;
        this.y = 10000;
        this.A = new com.squareup.okhttp.internal.i();
        this.c = new n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(v vVar) {
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = 10000;
        this.x = 10000;
        this.y = 10000;
        this.A = vVar.A;
        this.c = vVar.c;
        this.d = vVar.d;
        this.e = vVar.e;
        this.f = vVar.f;
        this.g.addAll(vVar.g);
        this.h.addAll(vVar.h);
        this.i = vVar.i;
        this.j = vVar.j;
        this.l = vVar.l;
        this.k = this.l != null ? this.l.a : vVar.k;
        this.m = vVar.m;
        this.n = vVar.n;
        this.o = vVar.o;
        this.p = vVar.p;
        this.q = vVar.q;
        this.r = vVar.r;
        this.s = vVar.s;
        this.t = vVar.t;
        this.u = vVar.u;
        this.v = vVar.v;
        this.w = vVar.w;
        this.x = vVar.x;
        this.y = vVar.y;
    }

    public final void a(long j, TimeUnit timeUnit) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && i > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.w = (int) millis;
    }

    public final void b(long j, TimeUnit timeUnit) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && i > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.x = (int) millis;
    }

    public final void c(long j, TimeUnit timeUnit) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        if (millis == 0 && i > 0) {
            throw new IllegalArgumentException("Timeout too small.");
        }
        this.y = (int) millis;
    }

    public final v a(List<w> list) {
        List a2 = com.squareup.okhttp.internal.j.a(list);
        if (!a2.contains(w.HTTP_1_1)) {
            throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + a2);
        } else if (a2.contains(w.HTTP_1_0)) {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + a2);
        } else if (a2.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        } else {
            this.e = com.squareup.okhttp.internal.j.a(a2);
            return this;
        }
    }

    public final List<t> a() {
        return this.g;
    }

    public final List<t> b() {
        return this.h;
    }

    public final e a(x xVar) {
        return new e(this, xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized SSLSocketFactory c() {
        if (z == null) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                z = sSLContext.getSocketFactory();
            } catch (GeneralSecurityException unused) {
                throw new AssertionError();
            }
        }
        return z;
    }

    /* renamed from: d */
    public final v clone() {
        return new v(this);
    }

    public v cancel(Object obj) {
        this.c.cancel(obj);
        return this;
    }
}
