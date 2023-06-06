package com.meizu.cloud.pushsdk.c.c;

import com.meizu.cloud.pushsdk.c.g.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* loaded from: classes3.dex */
public final class h extends j {
    public static final g a = g.a("multipart/mixed");
    public static final g b = g.a("multipart/alternative");
    public static final g c = g.a("multipart/digest");
    public static final g d = g.a("multipart/parallel");
    public static final g e = g.a("multipart/form-data");
    private static final byte[] f = {58, 32};
    private static final byte[] g = {13, 10};
    private static final byte[] h = {45, 45};
    private final com.meizu.cloud.pushsdk.c.g.e i;
    private final g j;
    private final g k;
    private final List<b> l;
    private long m = -1;

    /* loaded from: classes3.dex */
    public static final class b {
        final c a;
        final j b;

        private b(c cVar, j jVar) {
            this.a = cVar;
            this.b = jVar;
        }

        public static b a(c cVar, j jVar) {
            if (jVar != null) {
                if (cVar == null || cVar.a("Content-Type") == null) {
                    if (cVar == null || cVar.a("Content-Length") == null) {
                        return new b(cVar, jVar);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            throw new NullPointerException("body == null");
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final g a() {
        return this.k;
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final void a(com.meizu.cloud.pushsdk.c.g.c cVar) throws IOException {
        a(cVar, false);
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final long b() throws IOException {
        long j = this.m;
        if (j != -1) {
            return j;
        }
        long a2 = a((com.meizu.cloud.pushsdk.c.g.c) null, true);
        this.m = a2;
        return a2;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public final com.meizu.cloud.pushsdk.c.g.e a;
        public g b;
        public final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        private a(String str) {
            this.b = h.a;
            this.c = new ArrayList();
            this.a = com.meizu.cloud.pushsdk.c.g.e.a(str);
        }

        private a a(b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public final a a(c cVar, j jVar) {
            return a(b.a(cVar, jVar));
        }

        public final a a(g gVar) {
            if (gVar != null) {
                if ("multipart".equals(gVar.a)) {
                    this.b = gVar;
                    return this;
                }
                throw new IllegalArgumentException("multipart != " + gVar);
            }
            throw new NullPointerException("type == null");
        }
    }

    public h(com.meizu.cloud.pushsdk.c.g.e eVar, g gVar, List<b> list) {
        this.i = eVar;
        this.j = gVar;
        StringBuilder sb = new StringBuilder();
        sb.append(gVar);
        sb.append("; boundary=");
        String str = eVar.e;
        if (str == null) {
            str = new String(eVar.c, o.a);
            eVar.e = str;
        }
        sb.append(str);
        this.k = g.a(sb.toString());
        this.l = m.a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long a(com.meizu.cloud.pushsdk.c.g.c cVar, boolean z) throws IOException {
        com.meizu.cloud.pushsdk.c.g.b bVar;
        if (z) {
            cVar = new com.meizu.cloud.pushsdk.c.g.b();
            bVar = cVar;
        } else {
            bVar = 0;
        }
        int size = this.l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b bVar2 = this.l.get(i);
            c cVar2 = bVar2.a;
            j jVar = bVar2.b;
            cVar.b(h);
            cVar.b(this.i);
            cVar.b(g);
            if (cVar2 != null) {
                int length = cVar2.a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.b(cVar2.a(i2)).b(f).b(cVar2.b(i2)).b(g);
                }
            }
            g a2 = jVar.a();
            if (a2 != null) {
                cVar.b("Content-Type: ").b(a2.toString()).b(g);
            }
            long b2 = jVar.b();
            if (b2 != -1) {
                cVar.b("Content-Length: ").c(b2).b(g);
            } else if (z) {
                bVar.g();
                return -1L;
            }
            cVar.b(g);
            if (z) {
                j += b2;
            } else {
                jVar.a(cVar);
            }
            cVar.b(g);
        }
        cVar.b(h);
        cVar.b(this.i);
        cVar.b(h);
        cVar.b(g);
        if (z) {
            long j2 = j + bVar.b;
            bVar.g();
            return j2;
        }
        return j;
    }
}
