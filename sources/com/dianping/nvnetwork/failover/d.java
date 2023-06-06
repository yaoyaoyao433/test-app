package com.dianping.nvnetwork.failover;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.a;
import com.dianping.nvnetwork.failover.b;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements d.a<q> {
    public static ChangeQuickRedirect a;
    final a b;
    final Request c;
    final b d;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        final j jVar = (j) obj;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd854891b043adaa7d261ce69056ab98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd854891b043adaa7d261ce69056ab98");
        } else if (jVar.isUnsubscribed()) {
            com.dianping.networklog.c.a("Failover/OnSubscribe: failover is  unsubscribed.", 4);
        } else if (this.c.p) {
            q a2 = f.a(-389, "Refused");
            a2.c = 2;
            jVar.onNext(a2);
            jVar.onCompleted();
            if (this.c.h() > 0) {
                g.d().pv4(0L, g.d().getCommand(this.c.d), 0, 2, -389, 0, 0, 0, "", "url refused", 1);
            }
            a(a2);
        } else {
            a("Failover/OnSubscribe", "### Start.");
            this.b.e = new a.AbstractC0096a() { // from class: com.dianping.nvnetwork.failover.d.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.nvnetwork.failover.a.AbstractC0096a, com.dianping.nvnetwork.failover.a.b
                public final void a(com.dianping.nvnetwork.failover.fetcher.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eada1114b3cc61fea7a0975d4c43e64", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eada1114b3cc61fea7a0975d4c43e64");
                        return;
                    }
                    d dVar = d.this;
                    StringBuilder sb = new StringBuilder("### onLoadStartPoint: ");
                    sb.append(d.this.b.a(bVar != null ? bVar.b() : -1));
                    dVar.a("Failover/OnSubscribe", sb.toString());
                    b bVar2 = d.this.d;
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "5f885c8d3ac1b82c20fcbbd3bebad7a0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "5f885c8d3ac1b82c20fcbbd3bebad7a0");
                    } else if (bVar != null) {
                        int b = bVar.b();
                        if (b == 4 || b == 2) {
                            bVar2.b.b = f.a();
                            bVar2.b.c = bVar.a();
                        }
                        if (b == 3) {
                            bVar2.c.b = f.a();
                            bVar2.c.c = bVar.a();
                        }
                    }
                }

                @Override // com.dianping.nvnetwork.failover.a.AbstractC0096a, com.dianping.nvnetwork.failover.a.b
                public final void a(com.dianping.nvnetwork.failover.fetcher.b bVar, q qVar, Throwable th) {
                    Object[] objArr2 = {bVar, qVar, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f664e370d62ec68e4f8c6e7239d231ff", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f664e370d62ec68e4f8c6e7239d231ff");
                        return;
                    }
                    d dVar = d.this;
                    StringBuilder sb = new StringBuilder("### onLoadEndPoint: ");
                    sb.append(d.this.b.a(bVar != null ? bVar.b() : -1));
                    dVar.a("Failover/OnSubscribe", sb.toString());
                    b bVar2 = d.this.d;
                    Object[] objArr3 = {bVar, qVar, th};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "ca4c54d9340fa0583e73d178c7907fed", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "ca4c54d9340fa0583e73d178c7907fed");
                    } else if (bVar != null) {
                        b.a aVar = null;
                        int b = bVar.b();
                        if (b == 4 || b == 2) {
                            aVar = bVar2.b;
                        }
                        if (b == 3) {
                            aVar = bVar2.c;
                        }
                        if (aVar != null) {
                            aVar.c = bVar.a();
                            aVar.d = th;
                            aVar.e = qVar;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
                @Override // com.dianping.nvnetwork.failover.a.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(com.dianping.nvnetwork.q r21, java.lang.Throwable r22) {
                    /*
                        Method dump skipped, instructions count: 487
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.failover.d.AnonymousClass1.a(com.dianping.nvnetwork.q, java.lang.Throwable):void");
                }
            };
            a aVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ab978fc77ae7d97e1d8717e0726acbd3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ab978fc77ae7d97e1d8717e0726acbd3");
                return;
            }
            for (com.dianping.nvnetwork.failover.fetcher.b bVar : aVar.b) {
                aVar.a(bVar);
            }
            if (!f.a(aVar.d)) {
                for (com.dianping.nvnetwork.failover.fetcher.b bVar2 : aVar.c) {
                    aVar.a(bVar2);
                }
            }
            aVar.a();
        }
    }

    public d(Request request, com.dianping.nvnetwork.http.a aVar, com.dianping.nvnetwork.http.a aVar2) {
        Object[] objArr = {request, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f53514e586fd40426247e12401f8af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f53514e586fd40426247e12401f8af");
            return;
        }
        Object[] objArr2 = {request, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        this.b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7fd0f000472936a6d382349470716daa", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7fd0f000472936a6d382349470716daa") : new a(request, aVar, aVar2);
        this.c = request;
        this.d = new b(request);
        this.d.d = this.b.hashCode();
    }

    void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845cd8fb87ad3dbd6ff351d4a280e984", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845cd8fb87ad3dbd6ff351d4a280e984");
        } else {
            f.a(str, str2, this.b.hashCode());
        }
    }

    void a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65dedc7fb16f5c3316ae4dbf6b40a7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65dedc7fb16f5c3316ae4dbf6b40a7a");
        } else if (qVar != null && qVar.isSuccess()) {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_SUCCEEDED_COUNT_ADD);
        } else {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_FAILED_COUNT_ADD);
        }
    }
}
