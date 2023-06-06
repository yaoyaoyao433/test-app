package com.dianping.nvnetwork.cache;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends f {
    public static ChangeQuickRedirect c;
    q d;
    private com.dianping.nvnetwork.fork.b e;

    public j(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01fcb2d23f662c1166dd649279bd366a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01fcb2d23f662c1166dd649279bd366a");
            return;
        }
        this.e = com.dianping.nvnetwork.fork.b.a(com.dianping.nvnetwork.g.b());
        q.a aVar = new q.a();
        aVar.c = -170;
        aVar.j = "inner error 05";
        this.d = aVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.dianping.nvnetwork.cache.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.nvnetwork.q a(com.dianping.nvnetwork.Request r14, com.dianping.nvnetwork.cache.a r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.dianping.nvnetwork.cache.j.c
            java.lang.String r12 = "10874b9247b94a7358c574086c0e2c89"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            com.dianping.nvnetwork.q r14 = (com.dianping.nvnetwork.q) r14
            return r14
        L21:
            r1 = 0
            if (r15 == 0) goto Le7
            byte[] r2 = r15.b
            if (r2 == 0) goto Le7
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r15.c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto Lc4
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = r15.d     // Catch: org.json.JSONException -> Lbf
            r2.<init>(r3)     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.Request$Builder r14 = r14.a()     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Cache-Support"
            java.lang.String r4 = "true"
            com.dianping.nvnetwork.Request$Builder r14 = r14.addHeaders(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "If-None-Match"
            java.lang.String r4 = "etag"
            java.lang.String r4 = r2.optString(r4)     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.Request$Builder r14 = r14.addHeaders(r3, r4)     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "If-Modified-Since"
            java.lang.String r4 = "last-modified"
            java.lang.String r2 = r2.optString(r4)     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.Request$Builder r14 = r14.addHeaders(r3, r2)     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.cache.c r2 = com.dianping.nvnetwork.cache.c.DISABLED     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.Request$Builder r14 = r14.defaultCacheType(r2)     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.Request r14 = r14.build()     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.fork.b r2 = r13.e     // Catch: org.json.JSONException -> Lbf
            rx.d r14 = r2.exec(r14)     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.cache.j$1 r2 = new com.dianping.nvnetwork.cache.j$1     // Catch: org.json.JSONException -> Lbf
            r2.<init>()     // Catch: org.json.JSONException -> Lbf
            rx.d r14 = r14.f(r2)     // Catch: org.json.JSONException -> Lbf
            rx.g r2 = rx.schedulers.a.e()     // Catch: org.json.JSONException -> Lbf
            rx.d r14 = r14.b(r2)     // Catch: org.json.JSONException -> Lbf
            rx.g r2 = rx.schedulers.a.a()     // Catch: org.json.JSONException -> Lbf
            rx.d r14 = r14.a(r2)     // Catch: org.json.JSONException -> Lbf
            rx.observables.a r14 = rx.observables.a.a(r14)     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.q r2 = r13.d     // Catch: org.json.JSONException -> Lbf
            java.lang.Object r14 = r14.a(r2)     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.q r14 = (com.dianping.nvnetwork.q) r14     // Catch: org.json.JSONException -> Lbf
            boolean r2 = r14.isSuccess()     // Catch: org.json.JSONException -> Lbf
            if (r2 == 0) goto Le8
            int r2 = r14.statusCode()     // Catch: org.json.JSONException -> Lbf
            int r2 = r2 / 100
            if (r2 != r0) goto Le8
            java.lang.String r0 = "true"
            java.util.HashMap r2 = r14.headers()     // Catch: org.json.JSONException -> Lbf
            java.lang.String r3 = "Cache-Hit"
            java.lang.Object r2 = r2.get(r3)     // Catch: org.json.JSONException -> Lbf
            boolean r0 = r0.equals(r2)     // Catch: org.json.JSONException -> Lbf
            if (r0 == 0) goto Le8
            com.dianping.nvnetwork.q$a r14 = r14.a()     // Catch: org.json.JSONException -> Lbf
            byte[] r15 = r15.b     // Catch: org.json.JSONException -> Lbf
            r14.b = r15     // Catch: org.json.JSONException -> Lbf
            com.dianping.nvnetwork.q r14 = r14.build()     // Catch: org.json.JSONException -> Lbf
            goto Le8
        Lbf:
            r14 = move-exception
            r14.printStackTrace()
            goto Le7
        Lc4:
            com.dianping.nvnetwork.q$a r14 = new com.dianping.nvnetwork.q$a
            r14.<init>()
            r14.f = r10
            r0 = 200(0xc8, float:2.8E-43)
            r14.c = r0
            long r0 = r15.c
            com.dianping.nvnetwork.q$a r14 = r14.a(r0)
            byte[] r0 = r15.b
            r14.b = r0
            java.lang.String r15 = r15.d
            java.util.HashMap r15 = r13.c(r15)
            r14.e = r15
            r14.i = r10
            com.dianping.nvnetwork.q r1 = r14.build()
        Le7:
            r14 = r1
        Le8:
            if (r14 != 0) goto Lf9
            com.dianping.nvnetwork.q$a r14 = new com.dianping.nvnetwork.q$a
            r14.<init>()
            r14.f = r10
            java.lang.String r15 = "error!"
            r14.j = r15
            com.dianping.nvnetwork.q r14 = r14.build()
        Lf9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.cache.j.a(com.dianping.nvnetwork.Request, com.dianping.nvnetwork.cache.a):com.dianping.nvnetwork.q");
    }

    @Override // com.dianping.nvnetwork.cache.f, com.dianping.nvnetwork.cache.h
    public final boolean a(Request request, q qVar) {
        String str;
        Object[] objArr = {request, qVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234b11c35711f88bd7380a5e5c4a7f34", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234b11c35711f88bd7380a5e5c4a7f34")).booleanValue();
        }
        if (request != null && qVar != null && qVar.result() != null) {
            String str2 = qVar.headers() != null ? qVar.headers().get("Cache-Policy") : null;
            if (!TextUtils.isEmpty(str2)) {
                long parseLong = Long.parseLong(str2);
                if (parseLong > 0) {
                    if (TextUtils.isEmpty(request.k)) {
                        str = request.d;
                    } else {
                        str = request.k;
                    }
                    return a(new a(str, qVar.result(), System.currentTimeMillis() + (parseLong * 1000), a(qVar.headers()))) > 0;
                }
            }
        }
        return false;
    }
}
