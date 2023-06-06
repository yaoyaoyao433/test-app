package com.squareup.okhttp;

import com.squareup.okhttp.r;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class x {
    public final s a;
    public final String b;
    public final r c;
    public final y d;
    final Object e;
    private volatile URL f;
    private volatile URI g;
    private volatile d h;

    private x(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = aVar.e != null ? aVar.e : this;
    }

    public final URL a() {
        URL url = this.f;
        if (url != null) {
            return url;
        }
        URL a2 = this.a.a();
        this.f = a2;
        return a2;
    }

    public final URI b() throws IOException {
        try {
            URI uri = this.g;
            if (uri != null) {
                return uri;
            }
            URI b = this.a.b();
            this.g = b;
            return b;
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final String c() {
        return this.a.toString();
    }

    public final r d() {
        return this.c;
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    public final y e() {
        return this.d;
    }

    public final a f() {
        return new a();
    }

    public final d g() {
        d dVar = this.h;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.c);
        this.h = a2;
        return a2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        sb.append(", tag=");
        sb.append(this.e != this ? this.e : null);
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        s a;
        String b;
        r.a c;
        y d;
        public Object e;

        public a() {
            this.b = "GET";
            this.c = new r.a();
        }

        private a(x xVar) {
            this.a = xVar.a;
            this.b = xVar.b;
            this.d = xVar.d;
            this.e = xVar.e;
            this.c = xVar.c.c();
        }

        public final a a(s sVar) {
            if (sVar == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.a = sVar;
            return this;
        }

        public final a a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            s d = s.d(str);
            if (d == null) {
                throw new IllegalArgumentException("unexpected url: " + str);
            }
            return a(d);
        }

        public final a a(URL url) {
            if (url == null) {
                throw new IllegalArgumentException("url == null");
            }
            s a = s.a(url);
            if (a == null) {
                throw new IllegalArgumentException("unexpected url: " + url);
            }
            return a(a);
        }

        public final a a(String str, String str2) {
            this.c.b(str, str2);
            return this;
        }

        public final a b(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public final a b(String str) {
            this.c.b(str);
            return this;
        }

        public final a a(r rVar) {
            this.c = rVar.c();
            return this;
        }

        public final a a(String str, y yVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (yVar != null && !com.squareup.okhttp.internal.http.i.c(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (yVar == null && com.squareup.okhttp.internal.http.i.b(str)) {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            } else {
                this.b = str;
                this.d = yVar;
                return this;
            }
        }

        public final x a() {
            if (this.a == null) {
                throw new IllegalStateException("url == null");
            }
            return new x(this);
        }
    }
}
