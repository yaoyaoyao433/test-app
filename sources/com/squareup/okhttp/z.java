package com.squareup.okhttp;

import com.squareup.okhttp.r;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class z {
    public final x a;
    public final w b;
    public final int c;
    public final String d;
    public final q e;
    public final r f;
    public final aa g;
    public z h;
    z i;
    final z j;
    private volatile d k;

    private z(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f.a();
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
    }

    public final x a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final boolean c() {
        return this.c >= 200 && this.c < 300;
    }

    public final String d() {
        return this.d;
    }

    public final String a(String str) {
        return a(str, null);
    }

    public final String a(String str, String str2) {
        String a2 = this.f.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public final r e() {
        return this.f;
    }

    public final aa f() {
        return this.g;
    }

    public final a g() {
        return new a();
    }

    public final List<h> h() {
        String str;
        if (this.c == 401) {
            str = "WWW-Authenticate";
        } else if (this.c != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return com.squareup.okhttp.internal.http.k.b(this.f, str);
    }

    public final d i() {
        d dVar = this.k;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.f);
        this.k = a2;
        return a2;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.c + ", message=" + this.d + ", url=" + this.a.a.toString() + '}';
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public x a;
        public w b;
        public int c;
        public String d;
        public q e;
        r.a f;
        public aa g;
        z h;
        z i;
        z j;

        public a() {
            this.c = -1;
            this.f = new r.a();
        }

        private a(z zVar) {
            this.c = -1;
            this.a = zVar.a;
            this.b = zVar.b;
            this.c = zVar.c;
            this.d = zVar.d;
            this.e = zVar.e;
            this.f = zVar.f.c();
            this.g = zVar.g;
            this.h = zVar.h;
            this.i = zVar.i;
            this.j = zVar.j;
        }

        public final a a(String str, String str2) {
            this.f.b(str, str2);
            return this;
        }

        public final a b(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public final a a(r rVar) {
            this.f = rVar.c();
            return this;
        }

        public final a a(aa aaVar) {
            this.g = aaVar;
            return this;
        }

        public final a a(z zVar) {
            if (zVar != null) {
                a("networkResponse", zVar);
            }
            this.h = zVar;
            return this;
        }

        public final a b(z zVar) {
            if (zVar != null) {
                a("cacheResponse", zVar);
            }
            this.i = zVar;
            return this;
        }

        public final a c(z zVar) {
            if (zVar != null) {
                d(zVar);
            }
            this.j = zVar;
            return this;
        }

        public final z a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.c < 0) {
                throw new IllegalStateException("code < 0: " + this.c);
            }
            return new z(this);
        }

        private static void a(String str, z zVar) {
            if (zVar.g != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (zVar.h != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (zVar.i != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (zVar.j == null) {
            } else {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        private static void d(z zVar) {
            if (zVar.g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }
    }
}
