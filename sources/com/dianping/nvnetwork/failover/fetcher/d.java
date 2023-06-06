package com.dianping.nvnetwork.failover.fetcher;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.fetcher.b;
import com.dianping.nvnetwork.http.impl.RxDefaultHttpService;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends e {
    public static ChangeQuickRedirect e;
    List<b.a> f;
    final Object g;
    boolean h;
    b i;
    q j;
    Throwable k;
    private com.dianping.nvnetwork.http.a m;
    private boolean n;

    public d(com.dianping.nvnetwork.http.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c2b44b30217484362f5aa1727c044e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c2b44b30217484362f5aa1727c044e");
            return;
        }
        this.g = new Object();
        this.m = aVar;
        this.f = new ArrayList();
        q.a aVar2 = new q.a();
        aVar2.c = -170;
        aVar2.j = "Fail";
        this.b = aVar2.build();
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.e, com.dianping.nvnetwork.failover.fetcher.b
    public final void b(Request request, b.a aVar) {
        boolean z;
        Object[] objArr = {request, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093d6d0a82a85d61c2f4a6d6fa9481ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093d6d0a82a85d61c2f4a6d6fa9481ae");
            return;
        }
        synchronized (this.g) {
            if (this.h) {
                a("HttpDataFetcher", "fetch finished, safety dispatch.");
                z = true;
            } else {
                if (!this.f.contains(aVar)) {
                    this.f.add(aVar);
                }
                if (this.n) {
                    a("HttpDataFetcher", "fetch has started.");
                    return;
                }
                this.n = true;
                a("HttpDataFetcher", "fetch start.");
                z = false;
            }
            if (!z) {
                com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_FAILOVER_COUNT_ADD);
                super.b(request, new b.a() { // from class: com.dianping.nvnetwork.failover.fetcher.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.nvnetwork.failover.fetcher.b.a
                    public final void a(b bVar, Request request2) {
                        Object[] objArr2 = {bVar, request2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61fb53721e2eeacee1b168a10d0ee6f7", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61fb53721e2eeacee1b168a10d0ee6f7");
                            return;
                        }
                        ArrayList<b.a> arrayList = new ArrayList();
                        synchronized (d.this.g) {
                            arrayList.addAll(d.this.f);
                        }
                        for (b.a aVar2 : arrayList) {
                            aVar2.a(bVar, request2);
                        }
                    }

                    @Override // com.dianping.nvnetwork.failover.fetcher.b.a
                    public final void a(b bVar, Request request2, q qVar, Throwable th) {
                        Object[] objArr2 = {bVar, request2, qVar, th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "319944caaf56540ee981f9f69e13593f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "319944caaf56540ee981f9f69e13593f");
                            return;
                        }
                        ArrayList<b.a> arrayList = new ArrayList();
                        synchronized (d.this.g) {
                            arrayList.addAll(d.this.f);
                        }
                        for (b.a aVar2 : arrayList) {
                            aVar2.a(bVar, request2, qVar, th);
                        }
                    }

                    @Override // com.dianping.nvnetwork.failover.fetcher.b.a
                    public final void a(b bVar, q qVar, Throwable th) {
                        Object[] objArr2 = {bVar, qVar, th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ae4238c3fafc3b0f3c3df27e82a5c97", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ae4238c3fafc3b0f3c3df27e82a5c97");
                            return;
                        }
                        ArrayList<b.a> arrayList = new ArrayList();
                        synchronized (d.this.g) {
                            arrayList.addAll(d.this.f);
                            d.this.f.clear();
                            d.this.i = bVar;
                            d.this.j = qVar;
                            d.this.k = th;
                            d.this.h = true;
                        }
                        for (b.a aVar2 : arrayList) {
                            aVar2.a(bVar, qVar, th);
                        }
                    }
                });
                return;
            }
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ef84bda6a811065e5dacc3deabfcb09", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ef84bda6a811065e5dacc3deabfcb09");
            } else if (aVar != null) {
                aVar.a(this.i, this.j, this.k);
            }
        }
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.e
    public final rx.d<q> a(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d762035651aa0df6f29a98c36d9236", 6917529027641081856L) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d762035651aa0df6f29a98c36d9236") : this.m.exec(request).b(RxDefaultHttpService.scheduler);
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a
    public final void a(Request request, q qVar, Throwable th, b.a aVar) {
        Object[] objArr = {request, qVar, th, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12195ed40b932c96d45c5e10bff1477e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12195ed40b932c96d45c5e10bff1477e");
            return;
        }
        if (request != null) {
            com.dianping.nvnetwork.c.a(request.b()).g();
        }
        super.a(request, qVar, th, aVar);
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a
    public final void a(Request request, q qVar, b.a aVar) {
        Object[] objArr = {request, qVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38378a1d1fdb2b0e32e604fae6a01122", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38378a1d1fdb2b0e32e604fae6a01122");
            return;
        }
        if (request != null) {
            com.dianping.nvnetwork.c.a(request.b()).g();
        }
        super.a(request, qVar, aVar);
    }
}
