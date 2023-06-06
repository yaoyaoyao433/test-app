package com.dianping.nvnetwork.fork;

import android.content.Context;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.e;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.http.impl.RxDefaultHttpService;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.tunnel2.g;
import com.dianping.nvtunnelkit.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b implements com.dianping.nvnetwork.http.a {
    public static ChangeQuickRedirect a;
    public static g b;
    public static volatile b c;
    private static RxDefaultHttpService d;
    private static e e;
    private final boolean f;

    private static boolean a(Set<String> set, int i, int i2) {
        return (set == null || i == i2) ? false : true;
    }

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6594e443b37e35d11b86d26f529118fc", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6594e443b37e35d11b86d26f529118fc");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b(context.getApplicationContext());
                }
            }
        }
        return c;
    }

    private b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637ed6b44389aed64fe22d28331c631f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637ed6b44389aed64fe22d28331c631f");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (d == null) {
            d = new RxDefaultHttpService();
        }
        this.f = d.b(applicationContext);
        if (b == null && (this.f || h.h().aJ)) {
            b = new g(applicationContext);
        }
        if (e == null) {
            if (this.f || h.h().aJ) {
                e = new e(d, b);
            }
        }
    }

    public final rx.d<q> a(Request request, int i) {
        Object[] objArr = {request, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f1b3e2c0bbaae0cdd6999ef8a949144", 6917529027641081856L)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f1b3e2c0bbaae0cdd6999ef8a949144");
        }
        com.dianping.nvnetwork.http.a a2 = a(i, "");
        if (a2 instanceof e) {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_COUNT_ADD);
        } else {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_HTTP_REQUEST_COUNT_ADD);
        }
        return a2.exec(request);
    }

    private com.dianping.nvnetwork.http.a a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91abb352ddd4461d1190bff4b022fc23", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.http.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91abb352ddd4461d1190bff4b022fc23");
        }
        h h = h.h();
        List<String> list = h.b;
        int b2 = h.b();
        if (com.dianping.nvnetwork.g.p() && com.dianping.nvnetwork.g.l() != -1) {
            b2 = com.dianping.nvnetwork.g.l();
        }
        if (list == null || list.isEmpty() || b2 == 4) {
            a.a("7", str2);
            return d;
        } else if (!h.g() && ((list.contains(str) || (list.size() == 1 && list.contains("*"))) && b2 == 2 && h.t && !h.u)) {
            return e;
        } else {
            a.a("8", str2);
            return d;
        }
    }

    private com.dianping.nvnetwork.http.a b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93b855d09b32ccc838c3979add2353e7", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.http.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93b855d09b32ccc838c3979add2353e7");
        }
        com.dianping.nvnetwork.http.a a2 = a(str, str2);
        if (this.f || a2 != e) {
            return a2;
        }
        Set<String> set = h.h().aL;
        if (set.contains("*") || set.contains(str)) {
            return a2;
        }
        a.a("9", str2);
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.dianping.nvnetwork.http.a a(com.dianping.nvnetwork.Request r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.fork.b.a(com.dianping.nvnetwork.Request):com.dianping.nvnetwork.http.a");
    }

    private com.dianping.nvnetwork.http.a a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4bd21c899fdd59ef44f3044ffaec01a", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.http.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4bd21c899fdd59ef44f3044ffaec01a");
        }
        switch (i) {
            case 2:
                if (e != null && !h.h().g()) {
                    return e;
                }
                a.a("3", str);
                return d;
            case 3:
                a.a("4", str);
                return d;
            default:
                a.a("9", str);
                return d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r9 == false) goto L25;
     */
    @Override // com.dianping.nvnetwork.http.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rx.d<com.dianping.nvnetwork.q> exec(com.dianping.nvnetwork.Request r17) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.dianping.nvnetwork.fork.b.a
            java.lang.String r13 = "46f485026707cc388424c5dcaa30c402"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r10
            r2 = r16
            r3 = r12
            r5 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r8, r12, r11, r13)
            rx.d r0 = (rx.d) r0
            return r0
        L23:
            java.io.InputStream r1 = r0.i     // Catch: java.lang.Exception -> Lb9
            if (r1 == 0) goto L94
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.g     // Catch: java.lang.Exception -> Lb9
            if (r1 == 0) goto L79
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r0.g     // Catch: java.lang.Exception -> Lb9
            java.lang.String r12 = "Content-Type"
            r1 = 2
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> Lb9
            r13[r11] = r10     // Catch: java.lang.Exception -> Lb9
            r13[r9] = r12     // Catch: java.lang.Exception -> Lb9
            com.meituan.robust.ChangeQuickRedirect r14 = com.dianping.nvnetwork.fork.b.a     // Catch: java.lang.Exception -> Lb9
            java.lang.String r15 = "62070e23fba7cf9ab5be71ab904e9e80"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r13
            r2 = r16
            r3 = r14
            r5 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Lb9
            if (r1 == 0) goto L53
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r8, r14, r11, r15)     // Catch: java.lang.Exception -> Lb9
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> Lb9
            boolean r9 = r1.booleanValue()     // Catch: java.lang.Exception -> Lb9
            goto L77
        L53:
            if (r10 == 0) goto L76
            java.util.Set r1 = r10.entrySet()     // Catch: java.lang.Exception -> Lb9
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> Lb9
        L5d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> Lb9
            if (r2 == 0) goto L76
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> Lb9
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> Lb9
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lb9
            boolean r2 = r2.equalsIgnoreCase(r12)     // Catch: java.lang.Exception -> Lb9
            if (r2 == 0) goto L5d
            goto L77
        L76:
            r9 = 0
        L77:
            if (r9 != 0) goto L94
        L79:
            boolean r1 = com.dianping.nvnetwork.g.p()     // Catch: java.lang.Exception -> Lb9
            if (r1 != 0) goto L87
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r0.a(r1, r2)     // Catch: java.lang.Exception -> Lb9
            goto L94
        L87:
            java.lang.String r0 = "request body is not empty and must be set http header Content-Type"
            com.dianping.nvnetwork.util.g.d(r0)     // Catch: java.lang.Exception -> Lb9
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Exception -> Lb9
            java.lang.String r1 = "request body is not empty and must be set http header Content-Type"
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb9
            throw r0     // Catch: java.lang.Exception -> Lb9
        L94:
            java.lang.String r1 = "M-SHARK-TRACEID"
            com.dianping.nvnetwork.util.m r2 = com.dianping.nvnetwork.util.m.a()     // Catch: java.lang.Exception -> Lb9
            java.lang.String r2 = r2.b()     // Catch: java.lang.Exception -> Lb9
            r0.a(r1, r2)     // Catch: java.lang.Exception -> Lb9
            com.dianping.nvnetwork.http.a r1 = r16.a(r17)     // Catch: java.lang.Exception -> Lb9
            boolean r2 = r1 instanceof com.dianping.nvnetwork.failover.e     // Catch: java.lang.Exception -> Lb9
            if (r2 == 0) goto Laf
            com.dianping.nvnetwork.debug.b r2 = com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_COUNT_ADD     // Catch: java.lang.Exception -> Lb9
            com.dianping.nvnetwork.debug.a.a(r2)     // Catch: java.lang.Exception -> Lb9
            goto Lb4
        Laf:
            com.dianping.nvnetwork.debug.b r2 = com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_HTTP_REQUEST_COUNT_ADD     // Catch: java.lang.Exception -> Lb9
            com.dianping.nvnetwork.debug.a.a(r2)     // Catch: java.lang.Exception -> Lb9
        Lb4:
            rx.d r0 = r1.exec(r0)     // Catch: java.lang.Exception -> Lb9
            return r0
        Lb9:
            r0 = move-exception
            r0.printStackTrace()
            rx.d r0 = rx.d.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.fork.b.exec(com.dianping.nvnetwork.Request):rx.d");
    }
}
