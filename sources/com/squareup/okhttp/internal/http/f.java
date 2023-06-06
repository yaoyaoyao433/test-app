package com.squareup.okhttp.internal.http;

import com.meituan.robust.common.StringUtil;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.r;
import com.squareup.okhttp.w;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f implements j {
    private static final okio.f a = okio.f.a("connection");
    private static final okio.f b = okio.f.a("host");
    private static final okio.f c = okio.f.a("keep-alive");
    private static final okio.f d = okio.f.a("proxy-connection");
    private static final okio.f e = okio.f.a("transfer-encoding");
    private static final okio.f f = okio.f.a("te");
    private static final okio.f g = okio.f.a("encoding");
    private static final okio.f h = okio.f.a("upgrade");
    private static final List<okio.f> i = com.squareup.okhttp.internal.j.a(a, b, c, d, e, com.squareup.okhttp.internal.framed.f.b, com.squareup.okhttp.internal.framed.f.c, com.squareup.okhttp.internal.framed.f.d, com.squareup.okhttp.internal.framed.f.e, com.squareup.okhttp.internal.framed.f.f, com.squareup.okhttp.internal.framed.f.g);
    private static final List<okio.f> j = com.squareup.okhttp.internal.j.a(a, b, c, d, e);
    private static final List<okio.f> k = com.squareup.okhttp.internal.j.a(a, b, c, d, f, e, g, h, com.squareup.okhttp.internal.framed.f.b, com.squareup.okhttp.internal.framed.f.c, com.squareup.okhttp.internal.framed.f.d, com.squareup.okhttp.internal.framed.f.e, com.squareup.okhttp.internal.framed.f.f, com.squareup.okhttp.internal.framed.f.g);
    private static final List<okio.f> l = com.squareup.okhttp.internal.j.a(a, b, c, d, f, e, g, h);
    private final s m;
    private final com.squareup.okhttp.internal.framed.d n;
    private h o;
    private com.squareup.okhttp.internal.framed.e p;

    public f(s sVar, com.squareup.okhttp.internal.framed.d dVar) {
        this.m = sVar;
        this.n = dVar;
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void a(h hVar) {
        this.o = hVar;
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final okio.r a(x xVar, long j2) throws IOException {
        return this.p.d();
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void a(x xVar) throws IOException {
        List<com.squareup.okhttp.internal.framed.f> b2;
        if (this.p != null) {
            return;
        }
        this.o.a();
        boolean a2 = h.a(xVar);
        if (this.n.a != w.HTTP_2) {
            b2 = b(xVar);
        } else {
            com.squareup.okhttp.r rVar = xVar.c;
            b2 = new ArrayList<>((rVar.a.length / 2) + 4);
            b2.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.b, xVar.b));
            b2.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.c, n.a(xVar.a)));
            b2.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.e, com.squareup.okhttp.internal.j.a(xVar.a)));
            b2.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.d, xVar.a.a));
            int length = rVar.a.length / 2;
            for (int i2 = 0; i2 < length; i2++) {
                okio.f a3 = okio.f.a(rVar.a(i2).toLowerCase(Locale.US));
                if (!k.contains(a3)) {
                    b2.add(new com.squareup.okhttp.internal.framed.f(a3, rVar.b(i2)));
                }
            }
        }
        this.p = this.n.a(0, b2, a2, true);
        this.p.h.timeout(this.o.b.x, TimeUnit.MILLISECONDS);
        this.p.i.timeout(this.o.b.y, TimeUnit.MILLISECONDS);
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void a(o oVar) throws IOException {
        oVar.a(this.p.d());
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void b() throws IOException {
        this.p.d().close();
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final z.a a() throws IOException {
        if (this.n.a == w.HTTP_2) {
            List<com.squareup.okhttp.internal.framed.f> c2 = this.p.c();
            String str = null;
            r.a aVar = new r.a();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                okio.f fVar = c2.get(i2).h;
                String a2 = c2.get(i2).i.a();
                if (fVar.equals(com.squareup.okhttp.internal.framed.f.a)) {
                    str = a2;
                } else if (!l.contains(fVar)) {
                    aVar.a(fVar.a(), a2);
                }
            }
            if (str != null) {
                r a3 = r.a("HTTP/1.1 " + str);
                z.a aVar2 = new z.a();
                aVar2.b = w.HTTP_2;
                aVar2.c = a3.b;
                aVar2.d = a3.c;
                return aVar2.a(aVar.a());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        return a(this.p.c());
    }

    private static z.a a(List<com.squareup.okhttp.internal.framed.f> list) throws IOException {
        r.a aVar = new r.a();
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        int i2 = 0;
        while (i2 < size) {
            okio.f fVar = list.get(i2).h;
            String a2 = list.get(i2).i.a();
            String str3 = str2;
            String str4 = str;
            int i3 = 0;
            while (i3 < a2.length()) {
                int indexOf = a2.indexOf(0, i3);
                if (indexOf == -1) {
                    indexOf = a2.length();
                }
                String substring = a2.substring(i3, indexOf);
                if (fVar.equals(com.squareup.okhttp.internal.framed.f.a)) {
                    str4 = substring;
                } else if (fVar.equals(com.squareup.okhttp.internal.framed.f.g)) {
                    str3 = substring;
                } else if (!j.contains(fVar)) {
                    aVar.a(fVar.a(), substring);
                }
                i3 = indexOf + 1;
            }
            i2++;
            str = str4;
            str2 = str3;
        }
        if (str != null) {
            r a3 = r.a(str2 + StringUtil.SPACE + str);
            z.a aVar2 = new z.a();
            aVar2.b = w.SPDY_3;
            aVar2.c = a3.b;
            aVar2.d = a3.c;
            return aVar2.a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final aa a(z zVar) throws IOException {
        return new l(zVar.f, okio.m.a(new a(this.p.f)));
    }

    @Override // com.squareup.okhttp.internal.http.j
    public final void cancel() {
        if (this.p != null) {
            this.p.b(com.squareup.okhttp.internal.framed.a.CANCEL);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends okio.i {
        public a(okio.s sVar) {
            super(sVar);
        }

        @Override // okio.i, okio.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            f.this.m.a(f.this);
            super.close();
        }
    }

    private static List<com.squareup.okhttp.internal.framed.f> b(x xVar) {
        com.squareup.okhttp.r rVar = xVar.c;
        ArrayList arrayList = new ArrayList((rVar.a.length / 2) + 5);
        arrayList.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.b, xVar.b));
        arrayList.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.c, n.a(xVar.a)));
        arrayList.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.g, "HTTP/1.1"));
        arrayList.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.f, com.squareup.okhttp.internal.j.a(xVar.a)));
        arrayList.add(new com.squareup.okhttp.internal.framed.f(com.squareup.okhttp.internal.framed.f.d, xVar.a.a));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = rVar.a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            okio.f a2 = okio.f.a(rVar.a(i2).toLowerCase(Locale.US));
            if (!i.contains(a2)) {
                String b2 = rVar.b(i2);
                if (linkedHashSet.add(a2)) {
                    arrayList.add(new com.squareup.okhttp.internal.framed.f(a2, b2));
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            break;
                        } else if (((com.squareup.okhttp.internal.framed.f) arrayList.get(i3)).h.equals(a2)) {
                            arrayList.set(i3, new com.squareup.okhttp.internal.framed.f(a2, ((com.squareup.okhttp.internal.framed.f) arrayList.get(i3)).i.a() + (char) 0 + b2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
