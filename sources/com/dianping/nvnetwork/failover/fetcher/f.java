package com.dianping.nvnetwork.failover.fetcher;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.fetcher.b;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends com.dianping.nvnetwork.failover.fetcher.a {
    public static ChangeQuickRedirect e;
    final a f;
    private com.dianping.nvnetwork.http.a g;
    private k h;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(Request request);
    }

    public f(com.dianping.nvnetwork.http.a aVar, a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be28364858ac51ebab99547c1baeb7ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be28364858ac51ebab99547c1baeb7ad");
            return;
        }
        this.g = aVar;
        this.f = aVar2;
        q.a aVar3 = new q.a();
        aVar3.c = -170;
        aVar3.j = "inner error 01";
        this.b = aVar3.build();
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.b
    public final void b(final Request request, final b.a aVar) {
        Object[] objArr = {request, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6de236310bdc9524eaa7b5a7d8e284", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6de236310bdc9524eaa7b5a7d8e284");
            return;
        }
        a(request, aVar);
        this.h = rx.d.a(new j<q>() { // from class: com.dianping.nvnetwork.failover.fetcher.f.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                q qVar = (q) obj;
                Object[] objArr2 = {qVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a45dbe1b4220ee09512fdf0a2a5f387", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a45dbe1b4220ee09512fdf0a2a5f387");
                } else if (qVar == null || qVar.statusCode() != 9999) {
                    f.this.a(request, qVar, aVar);
                } else if (f.this.f != null) {
                    f.this.f.a(request);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "992d8c824f53194481b8c804104b6af5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "992d8c824f53194481b8c804104b6af5");
                } else {
                    f.this.a(request, f.this.b, th, aVar);
                }
            }
        }, this.g.exec(request));
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a, com.dianping.nvnetwork.failover.fetcher.b
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50cddb2790410fe709fa6e4960ff50ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50cddb2790410fe709fa6e4960ff50ed");
            return;
        }
        super.cancel();
        if (this.h == null || this.h.isUnsubscribed()) {
            return;
        }
        this.h.unsubscribe();
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a
    public final void a(Request request, q qVar, b.a aVar) {
        Object[] objArr = {request, qVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368fea2d5a457f92dc6ec00359d9c750", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368fea2d5a457f92dc6ec00359d9c750");
            return;
        }
        if (request != null) {
            com.dianping.nvnetwork.c.a(request.b()).e();
        }
        super.a(request, qVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    @Override // com.dianping.nvnetwork.failover.fetcher.a, com.dianping.nvnetwork.failover.fetcher.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.dianping.nvnetwork.Request r13, com.dianping.nvnetwork.q r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.nvnetwork.failover.fetcher.f.e
            java.lang.String r11 = "e2dd940bc5f752497b13025f543b9e72"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L25:
            if (r13 == 0) goto L39
            boolean r0 = r13.n
            if (r0 == 0) goto L39
            java.lang.String r13 = "DataLoader/TcpDataFetcher"
            java.lang.String r14 = "failed, the request can only tcp."
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r14 = java.lang.String.format(r14, r0)
            r12.a(r13, r14)
            return r8
        L39:
            boolean r13 = com.dianping.nvnetwork.failover.f.a(r13)
            r13 = r13 ^ r9
            if (r14 == 0) goto L65
            int r14 = r14.statusCode()
            r0 = -162(0xffffffffffffff5e, float:NaN)
            if (r14 == r0) goto L60
            r0 = -157(0xffffffffffffff63, float:NaN)
            if (r14 == r0) goto L60
            r0 = -150(0xffffffffffffff6a, float:NaN)
            if (r14 == r0) goto L60
            r0 = -148(0xffffffffffffff6c, float:NaN)
            if (r14 == r0) goto L60
            r0 = -146(0xffffffffffffff6e, float:NaN)
            if (r14 == r0) goto L60
            switch(r14) {
                case -155: goto L60;
                case -154: goto L60;
                default: goto L5b;
            }
        L5b:
            switch(r14) {
                case -142: goto L60;
                case -141: goto L60;
                case -140: goto L60;
                default: goto L5e;
            }
        L5e:
            r14 = 0
            goto L61
        L60:
            r14 = 1
        L61:
            if (r14 == 0) goto L65
            r14 = 1
            goto L66
        L65:
            r14 = 0
        L66:
            if (r13 != 0) goto L79
            if (r14 == 0) goto L6b
            goto L79
        L6b:
            java.lang.String r13 = "DataLoader/TcpDataFetcher"
            java.lang.String r14 = "failed, for the request can not be failover."
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r14 = java.lang.String.format(r14, r0)
            r12.a(r13, r14)
            return r8
        L79:
            java.lang.String r14 = "DataLoader/TcpDataFetcher"
            java.lang.String r0 = "failed, but the request %s."
            java.lang.Object[] r1 = new java.lang.Object[r9]
            if (r13 == 0) goto L84
            java.lang.String r13 = "allow failover"
            goto L86
        L84:
            java.lang.String r13 = "code is allow failover"
        L86:
            r1[r8] = r13
            java.lang.String r13 = java.lang.String.format(r0, r1)
            r12.a(r14, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.failover.fetcher.f.a(com.dianping.nvnetwork.Request, com.dianping.nvnetwork.q):boolean");
    }
}
