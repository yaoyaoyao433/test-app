package com.dianping.nvnetwork.failover.fetcher;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.fetcher.b;
import com.dianping.nvnetwork.l;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends a {
    public static ChangeQuickRedirect e;
    final a f;
    final AtomicBoolean g;
    private final long h;
    private k i;

    public c(a aVar, long j) {
        Object[] objArr = {aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "478dbb642db64371639e23362bf0369c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "478dbb642db64371639e23362bf0369c");
            return;
        }
        this.f = aVar;
        this.h = j;
        this.g = new AtomicBoolean(false);
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.b
    public final void b(final Request request, final b.a aVar) {
        Object[] objArr = {request, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5ee9ec43acd73af90ea1b21fb1e6976", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5ee9ec43acd73af90ea1b21fb1e6976");
        } else {
            this.i = rx.d.a(new l(), rx.d.b(this.h, TimeUnit.MILLISECONDS).b(new rx.functions.b<Long>() { // from class: com.dianping.nvnetwork.failover.fetcher.c.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Long l) {
                    Object[] objArr2 = {l};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8215d5295172c1139ad4e04a65746e8e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8215d5295172c1139ad4e04a65746e8e");
                    } else {
                        c.this.f.b(request, new b.a() { // from class: com.dianping.nvnetwork.failover.fetcher.c.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.dianping.nvnetwork.failover.fetcher.b.a
                            public final void a(b bVar, Request request2) {
                                Object[] objArr3 = {bVar, request2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "842b375742a8d22859d773b56ab4fcc5", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "842b375742a8d22859d773b56ab4fcc5");
                                } else if (aVar != null) {
                                    aVar.a(c.this, request2);
                                }
                            }

                            @Override // com.dianping.nvnetwork.failover.fetcher.b.a
                            public final void a(b bVar, Request request2, q qVar, Throwable th) {
                                Object[] objArr3 = {bVar, request2, qVar, th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "74f745c5026617dba416b74f76c825fd", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "74f745c5026617dba416b74f76c825fd");
                                } else if (aVar != null) {
                                    aVar.a(c.this, request2, qVar, th);
                                }
                            }

                            @Override // com.dianping.nvnetwork.failover.fetcher.b.a
                            public final void a(b bVar, q qVar, Throwable th) {
                                Object[] objArr3 = {bVar, qVar, th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f36d7977fa0431b5599abe272011695c", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f36d7977fa0431b5599abe272011695c");
                                } else if (c.this.g.get() || aVar == null) {
                                } else {
                                    aVar.a(c.this, qVar, th);
                                }
                            }
                        });
                    }
                }
            }));
        }
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0212f2a8dc6b9f0090a024fb2fa4c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0212f2a8dc6b9f0090a024fb2fa4c4");
        } else {
            this.f.a(i);
        }
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a, com.dianping.nvnetwork.failover.fetcher.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51085b08930a95b6874d8a78aa1e3d33", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51085b08930a95b6874d8a78aa1e3d33")).intValue() : this.f.a();
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a, com.dianping.nvnetwork.failover.fetcher.b
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a57400d87425751280c2418aa61415e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a57400d87425751280c2418aa61415e");
            return;
        }
        this.g.set(true);
        if (this.i == null || this.i.isUnsubscribed()) {
            return;
        }
        this.i.unsubscribe();
    }
}
