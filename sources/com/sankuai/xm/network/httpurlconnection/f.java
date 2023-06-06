package com.sankuai.xm.network.httpurlconnection;

import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.xm.network.httpurlconnection.f.a a(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, int r14, int r15) throws java.lang.Exception {
        /*
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 2
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2 = 3
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.network.httpurlconnection.f.a
            java.lang.String r11 = "5a382e8b87784263b353f1eece0891a7"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2f
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r10, r9, r11)
            com.sankuai.xm.network.httpurlconnection.f$a r12 = (com.sankuai.xm.network.httpurlconnection.f.a) r12
            return r12
        L2f:
            com.sankuai.xm.network.httpurlconnection.f$a r0 = new com.sankuai.xm.network.httpurlconnection.f$a
            r0.<init>()
            com.sankuai.xm.network.http.b r12 = c(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L71
            java.lang.String r13 = "GET"
            r12.b(r13)     // Catch: java.lang.Throwable -> L6f
            java.util.Map r13 = r12.c()     // Catch: java.lang.Throwable -> L6f
            r0.g = r13     // Catch: java.lang.Throwable -> L6f
            int r13 = r12.d()     // Catch: java.lang.Throwable -> L6f
            r0.d = r13     // Catch: java.lang.Throwable -> L6f
            java.util.Map r14 = r12.g()     // Catch: java.lang.Throwable -> L6f
            r0.f = r14     // Catch: java.lang.Throwable -> L6f
            java.lang.String r14 = a(r12, r0)     // Catch: java.lang.Throwable -> L6f
            r15 = 200(0xc8, float:2.8E-43)
            if (r13 == r15) goto L65
            r15 = 201(0xc9, float:2.82E-43)
            if (r13 == r15) goto L65
            r15 = 204(0xcc, float:2.86E-43)
            if (r13 != r15) goto L60
            goto L65
        L60:
            r0.b = r9     // Catch: java.lang.Throwable -> L6f
            r0.c = r14     // Catch: java.lang.Throwable -> L6f
            goto L69
        L65:
            r0.b = r8     // Catch: java.lang.Throwable -> L6f
            r0.e = r14     // Catch: java.lang.Throwable -> L6f
        L69:
            if (r12 == 0) goto L6e
            r12.f()
        L6e:
            return r0
        L6f:
            r13 = move-exception
            goto L73
        L71:
            r13 = move-exception
            r12 = r2
        L73:
            if (r12 == 0) goto L78
            r12.f()
        L78:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.network.httpurlconnection.f.a(java.lang.String, java.util.Map, int, int):com.sankuai.xm.network.httpurlconnection.f$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.xm.network.httpurlconnection.f.a a(java.lang.String r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, int r17, int r18) throws java.lang.Exception {
        /*
            r0 = r14
            r1 = r16
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10 = 0
            r2[r10] = r0
            r11 = 1
            r2[r11] = r15
            r3 = 2
            r2[r3] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r4 = 3
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r4 = 4
            r2[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.xm.network.httpurlconnection.f.a
            java.lang.String r13 = "9ceabb72f250a3f18c2ee2c1ac681429"
            r4 = 0
            r6 = 1
            r8 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r3 = r2
            r5 = r12
            r7 = r13
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L35
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r4, r12, r11, r13)
            com.sankuai.xm.network.httpurlconnection.f$a r0 = (com.sankuai.xm.network.httpurlconnection.f.a) r0
            return r0
        L35:
            com.sankuai.xm.network.httpurlconnection.f$a r2 = new com.sankuai.xm.network.httpurlconnection.f$a
            r2.<init>()
            boolean r3 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> Lad
            if (r3 != 0) goto L4b
            byte[] r3 = r15.getBytes()     // Catch: java.lang.Throwable -> Lad
            int r3 = r3.length     // Catch: java.lang.Throwable -> Lad
            r5 = r18
            r6 = r3
            r3 = r17
            goto L50
        L4b:
            r3 = r17
            r5 = r18
            r6 = 0
        L50:
            com.sankuai.xm.network.http.b r1 = c(r14, r1, r3, r5)     // Catch: java.lang.Throwable -> Lad
            r1.a(r11)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "POST"
            r1.b(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "Content-Length"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r3.<init>()     // Catch: java.lang.Throwable -> Lab
            r3.append(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lab
            r1.a(r0, r3)     // Catch: java.lang.Throwable -> Lab
            java.util.Map r0 = r1.c()     // Catch: java.lang.Throwable -> Lab
            r2.g = r0     // Catch: java.lang.Throwable -> Lab
            byte[] r0 = r15.getBytes()     // Catch: java.lang.Throwable -> Lab
            com.sankuai.xm.network.httpurlconnection.f$1 r3 = new com.sankuai.xm.network.httpurlconnection.f$1     // Catch: java.lang.Throwable -> Lab
            r3.<init>()     // Catch: java.lang.Throwable -> Lab
            r1.a(r3)     // Catch: java.lang.Throwable -> Lab
            int r0 = r1.d()     // Catch: java.lang.Throwable -> Lab
            r2.d = r0     // Catch: java.lang.Throwable -> Lab
            java.util.Map r3 = r1.g()     // Catch: java.lang.Throwable -> Lab
            r2.f = r3     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = a(r1, r2)     // Catch: java.lang.Throwable -> Lab
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto La1
            r4 = 201(0xc9, float:2.82E-43)
            if (r0 == r4) goto La1
            r4 = 204(0xcc, float:2.86E-43)
            if (r0 != r4) goto L9c
            goto La1
        L9c:
            r2.b = r11     // Catch: java.lang.Throwable -> Lab
            r2.c = r3     // Catch: java.lang.Throwable -> Lab
            goto La5
        La1:
            r2.b = r10     // Catch: java.lang.Throwable -> Lab
            r2.e = r3     // Catch: java.lang.Throwable -> Lab
        La5:
            if (r1 == 0) goto Laa
            r1.f()
        Laa:
            return r2
        Lab:
            r0 = move-exception
            goto Laf
        Lad:
            r0 = move-exception
            r1 = r4
        Laf:
            if (r1 == 0) goto Lb4
            r1.f()
        Lb4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.network.httpurlconnection.f.a(java.lang.String, java.lang.String, java.util.Map, int, int):com.sankuai.xm.network.httpurlconnection.f$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.xm.network.httpurlconnection.f.a b(java.lang.String r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, int r17, int r18) throws java.lang.Exception {
        /*
            r0 = r14
            r1 = r16
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10 = 0
            r2[r10] = r0
            r11 = 1
            r2[r11] = r15
            r3 = 2
            r2[r3] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r4 = 3
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r4 = 4
            r2[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.xm.network.httpurlconnection.f.a
            java.lang.String r13 = "4727b72b71b1f90daedb83dca46107d3"
            r4 = 0
            r6 = 1
            r8 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r3 = r2
            r5 = r12
            r7 = r13
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L35
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r4, r12, r11, r13)
            com.sankuai.xm.network.httpurlconnection.f$a r0 = (com.sankuai.xm.network.httpurlconnection.f.a) r0
            return r0
        L35:
            com.sankuai.xm.network.httpurlconnection.f$a r2 = new com.sankuai.xm.network.httpurlconnection.f$a
            r2.<init>()
            boolean r3 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> Lad
            if (r3 != 0) goto L4b
            byte[] r3 = r15.getBytes()     // Catch: java.lang.Throwable -> Lad
            int r3 = r3.length     // Catch: java.lang.Throwable -> Lad
            r5 = r18
            r6 = r3
            r3 = r17
            goto L50
        L4b:
            r3 = r17
            r5 = r18
            r6 = 0
        L50:
            com.sankuai.xm.network.http.b r1 = c(r14, r1, r3, r5)     // Catch: java.lang.Throwable -> Lad
            r1.a(r11)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "PUT"
            r1.b(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = "Content-Length"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r3.<init>()     // Catch: java.lang.Throwable -> Lab
            r3.append(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lab
            r1.a(r0, r3)     // Catch: java.lang.Throwable -> Lab
            java.util.Map r0 = r1.c()     // Catch: java.lang.Throwable -> Lab
            r2.g = r0     // Catch: java.lang.Throwable -> Lab
            byte[] r0 = r15.getBytes()     // Catch: java.lang.Throwable -> Lab
            com.sankuai.xm.network.httpurlconnection.f$2 r3 = new com.sankuai.xm.network.httpurlconnection.f$2     // Catch: java.lang.Throwable -> Lab
            r3.<init>()     // Catch: java.lang.Throwable -> Lab
            r1.a(r3)     // Catch: java.lang.Throwable -> Lab
            int r0 = r1.d()     // Catch: java.lang.Throwable -> Lab
            r2.d = r0     // Catch: java.lang.Throwable -> Lab
            java.util.Map r3 = r1.g()     // Catch: java.lang.Throwable -> Lab
            r2.f = r3     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = a(r1, r2)     // Catch: java.lang.Throwable -> Lab
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == r4) goto La1
            r4 = 201(0xc9, float:2.82E-43)
            if (r0 == r4) goto La1
            r4 = 204(0xcc, float:2.86E-43)
            if (r0 != r4) goto L9c
            goto La1
        L9c:
            r2.b = r11     // Catch: java.lang.Throwable -> Lab
            r2.c = r3     // Catch: java.lang.Throwable -> Lab
            goto La5
        La1:
            r2.b = r10     // Catch: java.lang.Throwable -> Lab
            r2.e = r3     // Catch: java.lang.Throwable -> Lab
        La5:
            if (r1 == 0) goto Laa
            r1.f()
        Laa:
            return r2
        Lab:
            r0 = move-exception
            goto Laf
        Lad:
            r0 = move-exception
            r1 = r4
        Laf:
            if (r1 == 0) goto Lb4
            r1.f()
        Lb4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.network.httpurlconnection.f.b(java.lang.String, java.lang.String, java.util.Map, int, int):com.sankuai.xm.network.httpurlconnection.f$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.xm.network.httpurlconnection.f.a b(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, int r14, int r15) throws java.lang.Exception {
        /*
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 2
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r2 = 3
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.network.httpurlconnection.f.a
            java.lang.String r11 = "300a520d6168f63324bd5b7bcc2f781e"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2f
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r10, r9, r11)
            com.sankuai.xm.network.httpurlconnection.f$a r12 = (com.sankuai.xm.network.httpurlconnection.f.a) r12
            return r12
        L2f:
            com.sankuai.xm.network.httpurlconnection.f$a r0 = new com.sankuai.xm.network.httpurlconnection.f$a
            r0.<init>()
            com.sankuai.xm.network.http.b r12 = c(r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L71
            java.lang.String r13 = "DELETE"
            r12.b(r13)     // Catch: java.lang.Throwable -> L6f
            java.util.Map r13 = r12.c()     // Catch: java.lang.Throwable -> L6f
            r0.g = r13     // Catch: java.lang.Throwable -> L6f
            int r13 = r12.d()     // Catch: java.lang.Throwable -> L6f
            r0.d = r13     // Catch: java.lang.Throwable -> L6f
            java.util.Map r14 = r12.g()     // Catch: java.lang.Throwable -> L6f
            r0.f = r14     // Catch: java.lang.Throwable -> L6f
            java.lang.String r14 = a(r12, r0)     // Catch: java.lang.Throwable -> L6f
            r15 = 200(0xc8, float:2.8E-43)
            if (r13 == r15) goto L65
            r15 = 201(0xc9, float:2.82E-43)
            if (r13 == r15) goto L65
            r15 = 204(0xcc, float:2.86E-43)
            if (r13 != r15) goto L60
            goto L65
        L60:
            r0.b = r9     // Catch: java.lang.Throwable -> L6f
            r0.c = r14     // Catch: java.lang.Throwable -> L6f
            goto L69
        L65:
            r0.b = r8     // Catch: java.lang.Throwable -> L6f
            r0.e = r14     // Catch: java.lang.Throwable -> L6f
        L69:
            if (r12 == 0) goto L6e
            r12.f()
        L6e:
            return r0
        L6f:
            r13 = move-exception
            goto L73
        L71:
            r13 = move-exception
            r12 = r2
        L73:
            if (r12 == 0) goto L78
            r12.f()
        L78:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.network.httpurlconnection.f.b(java.lang.String, java.util.Map, int, int):com.sankuai.xm.network.httpurlconnection.f$a");
    }

    private static com.sankuai.xm.network.http.b c(String str, Map<String, String> map, int i, int i2) throws Exception {
        Object[] objArr = {str, map, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2ad60eed4ee0969ace250007d3bdc24", 6917529027641081856L)) {
            return (com.sankuai.xm.network.http.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2ad60eed4ee0969ace250007d3bdc24");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        com.sankuai.xm.network.http.b b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5fa0cbf0c238cc8f9b127234dcbadd33", 6917529027641081856L) ? (com.sankuai.xm.network.http.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5fa0cbf0c238cc8f9b127234dcbadd33") : com.sankuai.xm.network.http.d.b(str);
        b.a(i);
        b.b(i2);
        b.a("Accept-Charset", "UTF-8");
        b.a("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
        b.a("Connection", "Keep-Alive");
        b.a("Accept-Encoding", "gzip");
        if (map != null) {
            for (String str2 : map.keySet()) {
                b.a(str2, map.get(str2));
            }
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(com.sankuai.xm.network.http.b r19, com.sankuai.xm.network.httpurlconnection.f.a r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.network.httpurlconnection.f.a(com.sankuai.xm.network.http.b, com.sankuai.xm.network.httpurlconnection.f$a):java.lang.String");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        public String c;
        public int d;
        public String e;
        public Map<String, List<String>> f;
        Map<String, List<String>> g;
        public long h;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "499a64f0b767f253766c0854c430d669", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "499a64f0b767f253766c0854c430d669");
                return;
            }
            this.b = 1;
            this.c = "";
            this.d = 200;
            this.e = "";
            this.f = new HashMap();
            this.g = new HashMap();
            this.h = 0L;
        }
    }
}
