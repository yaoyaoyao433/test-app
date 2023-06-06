package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public final x a;
    public final z b;

    private c(x xVar, z zVar) {
        this.a = xVar;
        this.b = zVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public final long a;
        public final x b;
        public final z c;
        public Date d;
        public String e;
        public Date f;
        public String g;
        public Date h;
        public long i;
        public long j;
        public String k;
        public int l;

        public a(long j, x xVar, z zVar) {
            this.l = -1;
            this.a = j;
            this.b = xVar;
            this.c = zVar;
            if (zVar != null) {
                com.squareup.okhttp.r rVar = zVar.f;
                int length = rVar.a.length / 2;
                for (int i = 0; i < length; i++) {
                    String a = rVar.a(i);
                    String b = rVar.b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.d = g.a(b);
                        this.e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.h = g.a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f = g.a(b);
                        this.g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.l = d.b(b, -1);
                    } else if (k.b.equalsIgnoreCase(a)) {
                        this.i = Long.parseLong(b);
                    } else if (k.c.equalsIgnoreCase(a)) {
                        this.j = Long.parseLong(b);
                    }
                }
            }
        }

        public static boolean a(x xVar) {
            return (xVar.a("If-Modified-Since") == null && xVar.a("If-None-Match") == null) ? false : true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r3.i().f == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.squareup.okhttp.z r3, com.squareup.okhttp.x r4) {
        /*
            int r0 = r3.c
            r1 = 0
            switch(r0) {
                case 200: goto L2a;
                case 203: goto L2a;
                case 204: goto L2a;
                case 300: goto L2a;
                case 301: goto L2a;
                case 302: goto L7;
                case 307: goto L7;
                case 308: goto L2a;
                case 404: goto L2a;
                case 405: goto L2a;
                case 410: goto L2a;
                case 414: goto L2a;
                case 501: goto L2a;
                default: goto L6;
            }
        L6:
            goto L3d
        L7:
            java.lang.String r0 = "Expires"
            r2 = 0
            java.lang.String r0 = r3.a(r0, r2)
            if (r0 != 0) goto L2a
            com.squareup.okhttp.d r0 = r3.i()
            int r0 = r0.e
            r2 = -1
            if (r0 != r2) goto L2a
            com.squareup.okhttp.d r0 = r3.i()
            boolean r0 = r0.g
            if (r0 != 0) goto L2a
            com.squareup.okhttp.d r0 = r3.i()
            boolean r0 = r0.f
            if (r0 != 0) goto L2a
            goto L3d
        L2a:
            com.squareup.okhttp.d r3 = r3.i()
            boolean r3 = r3.d
            if (r3 != 0) goto L3c
            com.squareup.okhttp.d r3 = r4.g()
            boolean r3 = r3.d
            if (r3 != 0) goto L3c
            r3 = 1
            return r3
        L3c:
            return r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.c.a(com.squareup.okhttp.z, com.squareup.okhttp.x):boolean");
    }
}
