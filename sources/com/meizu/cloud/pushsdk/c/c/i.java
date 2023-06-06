package com.meizu.cloud.pushsdk.c.c;

import com.meizu.cloud.pushsdk.c.c.c;
/* loaded from: classes3.dex */
public final class i {
    final f a;
    final String b;
    final c c;
    final j d;
    private final Object e;

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

    /* loaded from: classes3.dex */
    public static class a {
        f a;
        String b = "GET";
        c.a c = new c.a();
        j d;
        Object e;

        public final a a(c cVar) {
            this.c = cVar.b();
            return this;
        }

        public final a a(String str, j jVar) {
            if (str.length() != 0) {
                if (jVar != null && !d.b(str)) {
                    throw new IllegalArgumentException("method " + str + " must not have a request body.");
                } else if (jVar != null || !d.a(str)) {
                    this.b = str;
                    this.d = jVar;
                    return this;
                } else {
                    throw new IllegalArgumentException("method " + str + " must have a request body.");
                }
            }
            throw new IllegalArgumentException("method == null || method.length() == 0");
        }

        public final a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public final i a() {
            if (this.a != null) {
                return new i(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.meizu.cloud.pushsdk.c.c.i.a a(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L66
                r1 = 1
                r2 = 0
                java.lang.String r3 = "ws:"
                r4 = 0
                r5 = 3
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L25
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "http:"
                r0.<init>(r1)
                r1 = 3
            L19:
                java.lang.String r7 = r7.substring(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                goto L3d
            L25:
                r1 = 1
                r2 = 0
                java.lang.String r3 = "wss:"
                r4 = 0
                r5 = 4
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L3d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "https:"
                r0.<init>(r1)
                r1 = 4
                goto L19
            L3d:
                com.meizu.cloud.pushsdk.c.c.f r0 = com.meizu.cloud.pushsdk.c.c.f.c(r7)
                if (r0 == 0) goto L51
                if (r0 == 0) goto L48
                r6.a = r0
                return r6
            L48:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                throw r7
            L51:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected url: "
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L66:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.c.i.a.a(java.lang.String):com.meizu.cloud.pushsdk.c.c.i$a");
        }
    }

    private i(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c.a();
        this.d = aVar.d;
        this.e = aVar.e != null ? aVar.e : this;
    }
}
