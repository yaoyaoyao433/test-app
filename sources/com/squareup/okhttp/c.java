package com.squareup.okhttp;

import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.common.CommonConstant;
import com.squareup.okhttp.internal.b;
import com.squareup.okhttp.r;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    final com.squareup.okhttp.internal.e a;
    int b;
    int c;
    private final com.squareup.okhttp.internal.b d;
    private int e;
    private int f;
    private int g;

    public c(File file, long j) {
        this(file, 10485760L, com.squareup.okhttp.internal.io.a.a);
    }

    private c(File file, long j, com.squareup.okhttp.internal.io.a aVar) {
        this.a = new com.squareup.okhttp.internal.e() { // from class: com.squareup.okhttp.c.1
            @Override // com.squareup.okhttp.internal.e
            public final z a(x xVar) throws IOException {
                return c.this.a(xVar);
            }

            @Override // com.squareup.okhttp.internal.e
            public final com.squareup.okhttp.internal.http.b a(z zVar) throws IOException {
                return c.this.a(zVar);
            }

            @Override // com.squareup.okhttp.internal.e
            public final void b(x xVar) throws IOException {
                c.this.b(xVar);
            }

            @Override // com.squareup.okhttp.internal.e
            public final void a(z zVar, z zVar2) throws IOException {
                b.a aVar2;
                c cVar = c.this;
                C1423c c1423c = new C1423c(zVar2);
                b.c cVar2 = ((b) zVar.g).a;
                try {
                    aVar2 = com.squareup.okhttp.internal.b.a(com.squareup.okhttp.internal.b.this, cVar2.a, cVar2.b);
                    if (aVar2 != null) {
                        try {
                            c1423c.a(aVar2);
                            aVar2.a();
                        } catch (IOException unused) {
                            c.a(aVar2);
                        }
                    }
                } catch (IOException unused2) {
                    aVar2 = null;
                }
            }

            @Override // com.squareup.okhttp.internal.e
            public final void a() {
                c.this.a();
            }

            @Override // com.squareup.okhttp.internal.e
            public final void a(com.squareup.okhttp.internal.http.c cVar) {
                c.this.a(cVar);
            }
        };
        this.d = com.squareup.okhttp.internal.b.a(aVar, file, 201105, 2, j);
    }

    final z a(x xVar) {
        try {
            b.c a2 = this.d.a(c(xVar));
            if (a2 == null) {
                return null;
            }
            try {
                boolean z = false;
                C1423c c1423c = new C1423c(a2.c[0]);
                String a3 = c1423c.g.a("Content-Type");
                String a4 = c1423c.g.a("Content-Length");
                x a5 = new x.a().a(c1423c.a).a(c1423c.c, (y) null).a(c1423c.b).a();
                z.a aVar = new z.a();
                aVar.a = a5;
                aVar.b = c1423c.d;
                aVar.c = c1423c.e;
                aVar.d = c1423c.f;
                z.a a6 = aVar.a(c1423c.g);
                a6.g = new b(a2, a3, a4);
                a6.e = c1423c.h;
                z a7 = a6.a();
                if (c1423c.a.equals(xVar.a.toString()) && c1423c.c.equals(xVar.b) && com.squareup.okhttp.internal.http.k.a(a7, c1423c.b, xVar)) {
                    z = true;
                }
                if (z) {
                    return a7;
                }
                com.squareup.okhttp.internal.j.a(a7.g);
                return null;
            } catch (IOException unused) {
                com.squareup.okhttp.internal.j.a(a2);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    void b(x xVar) throws IOException {
        this.d.b(c(xVar));
    }

    static void a(b.a aVar) {
        if (aVar != null) {
            try {
                aVar.b();
            } catch (IOException unused) {
            }
        }
    }

    synchronized void a(com.squareup.okhttp.internal.http.c cVar) {
        this.g++;
        if (cVar.a != null) {
            this.e++;
            return;
        }
        if (cVar.b != null) {
            this.f++;
        }
    }

    synchronized void a() {
        this.f++;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a implements com.squareup.okhttp.internal.http.b {
        boolean a;
        private final b.a c;
        private okio.r d;
        private okio.r e;

        public a(final b.a aVar) throws IOException {
            this.c = aVar;
            this.d = aVar.a(1);
            this.e = new okio.h(this.d) { // from class: com.squareup.okhttp.c.a.1
                @Override // okio.h, okio.r, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    synchronized (c.this) {
                        if (a.this.a) {
                            return;
                        }
                        a.this.a = true;
                        c.this.b++;
                        super.close();
                        aVar.a();
                    }
                }
            };
        }

        @Override // com.squareup.okhttp.internal.http.b
        public final void a() {
            synchronized (c.this) {
                if (this.a) {
                    return;
                }
                this.a = true;
                c.this.c++;
                com.squareup.okhttp.internal.j.a(this.d);
                try {
                    this.c.b();
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.squareup.okhttp.internal.http.b
        public final okio.r b() {
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.squareup.okhttp.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1423c {
        final String a;
        final r b;
        final String c;
        final w d;
        final int e;
        final String f;
        final r g;
        final q h;

        public C1423c(okio.s sVar) throws IOException {
            try {
                okio.e a = okio.m.a(sVar);
                this.a = a.q();
                this.c = a.q();
                r.a aVar = new r.a();
                int a2 = c.a(a);
                for (int i = 0; i < a2; i++) {
                    aVar.a(a.q());
                }
                this.b = aVar.a();
                com.squareup.okhttp.internal.http.r a3 = com.squareup.okhttp.internal.http.r.a(a.q());
                this.d = a3.a;
                this.e = a3.b;
                this.f = a3.c;
                r.a aVar2 = new r.a();
                int a4 = c.a(a);
                for (int i2 = 0; i2 < a4; i2++) {
                    aVar2.a(a.q());
                }
                this.g = aVar2.a();
                if (a()) {
                    String q = a.q();
                    if (q.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + q + CommonConstant.Symbol.DOUBLE_QUOTES);
                    }
                    String q2 = a.q();
                    List<Certificate> a5 = a(a);
                    List<Certificate> a6 = a(a);
                    if (q2 != null) {
                        this.h = new q(q2, com.squareup.okhttp.internal.j.a(a5), com.squareup.okhttp.internal.j.a(a6));
                    } else {
                        throw new IllegalArgumentException("cipherSuite == null");
                    }
                } else {
                    this.h = null;
                }
            } finally {
                sVar.close();
            }
        }

        public C1423c(z zVar) {
            this.a = zVar.a.a.toString();
            this.b = com.squareup.okhttp.internal.http.k.c(zVar);
            this.c = zVar.a.b;
            this.d = zVar.b;
            this.e = zVar.c;
            this.f = zVar.d;
            this.g = zVar.f;
            this.h = zVar.e;
        }

        public final void a(b.a aVar) throws IOException {
            okio.d a = okio.m.a(aVar.a(0));
            a.b(this.a);
            a.h(10);
            a.b(this.c);
            a.h(10);
            a.n(this.b.a.length / 2);
            a.h(10);
            int length = this.b.a.length / 2;
            for (int i = 0; i < length; i++) {
                a.b(this.b.a(i));
                a.b(": ");
                a.b(this.b.b(i));
                a.h(10);
            }
            a.b(new com.squareup.okhttp.internal.http.r(this.d, this.e, this.f).toString());
            a.h(10);
            a.n(this.g.a.length / 2);
            a.h(10);
            int length2 = this.g.a.length / 2;
            for (int i2 = 0; i2 < length2; i2++) {
                a.b(this.g.a(i2));
                a.b(": ");
                a.b(this.g.b(i2));
                a.h(10);
            }
            if (a()) {
                a.h(10);
                a.b(this.h.a);
                a.h(10);
                a(a, this.h.b);
                a(a, this.h.c);
            }
            a.close();
        }

        private boolean a() {
            return this.a.startsWith(AbsApiFactory.HTTPS);
        }

        private static void a(okio.d dVar, List<Certificate> list) throws IOException {
            try {
                dVar.n(list.size());
                dVar.h(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.b(okio.f.a(list.get(i).getEncoded()).b());
                    dVar.h(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        private static List<Certificate> a(okio.e eVar) throws IOException {
            int a = c.a(eVar);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String q = eVar.q();
                    okio.c cVar = new okio.c();
                    cVar.c(okio.f.b(q));
                    arrayList.add(certificateFactory.generateCertificate(cVar.e()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    static int a(okio.e eVar) throws IOException {
        try {
            long m = eVar.m();
            String q = eVar.q();
            if (m < 0 || m > 2147483647L || !q.isEmpty()) {
                throw new IOException("expected an int but was \"" + m + q + CommonConstant.Symbol.DOUBLE_QUOTES);
            }
            return (int) m;
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b extends aa {
        private final b.c a;
        private final okio.e b;
        private final String c;
        private final String d;

        public b(final b.c cVar, String str, String str2) {
            this.a = cVar;
            this.c = str;
            this.d = str2;
            this.b = okio.m.a(new okio.i(cVar.c[1]) { // from class: com.squareup.okhttp.c.b.1
                @Override // okio.i, okio.s, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    cVar.close();
                    super.close();
                }
            });
        }

        @Override // com.squareup.okhttp.aa
        public final u a() {
            if (this.c != null) {
                return u.a(this.c);
            }
            return null;
        }

        @Override // com.squareup.okhttp.aa
        public final long b() {
            try {
                if (this.d != null) {
                    return Long.parseLong(this.d);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // com.squareup.okhttp.aa
        public final okio.e c() {
            return this.b;
        }
    }

    private static String c(x xVar) {
        return com.squareup.okhttp.internal.j.a(xVar.a.toString());
    }

    com.squareup.okhttp.internal.http.b a(z zVar) throws IOException {
        b.a aVar;
        String str = zVar.a.b;
        if (com.squareup.okhttp.internal.http.i.a(zVar.a.b)) {
            try {
                b(zVar.a);
            } catch (IOException unused) {
            }
            return null;
        } else if (!str.equals("GET") || com.squareup.okhttp.internal.http.k.b(zVar)) {
            return null;
        } else {
            C1423c c1423c = new C1423c(zVar);
            try {
                aVar = this.d.a(c(zVar.a), -1L);
                if (aVar == null) {
                    return null;
                }
                try {
                    c1423c.a(aVar);
                    return new a(aVar);
                } catch (IOException unused2) {
                    a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
            }
        }
    }
}
