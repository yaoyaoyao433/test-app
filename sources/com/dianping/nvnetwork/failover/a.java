package com.dianping.nvnetwork.failover;

import android.annotation.SuppressLint;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.fetcher.b;
import com.dianping.nvnetwork.failover.fetcher.f;
import com.dianping.nvnetwork.failover.fetcher.g;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements b.a {
    public static ChangeQuickRedirect a;
    final List<com.dianping.nvnetwork.failover.fetcher.b> b;
    final List<com.dianping.nvnetwork.failover.fetcher.b> c;
    final Request d;
    b e;
    private final Map<Integer, com.dianping.nvnetwork.failover.fetcher.b> f;
    private final List<com.dianping.nvnetwork.failover.fetcher.b> g;
    private final Map<com.dianping.nvnetwork.failover.fetcher.b, Boolean> h;
    private final List<com.dianping.nvnetwork.failover.fetcher.b> i;
    private final AtomicInteger j;
    private final AtomicBoolean k;
    private final Object l;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvnetwork.failover.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0096a implements b {
        @Override // com.dianping.nvnetwork.failover.a.b
        public void a(com.dianping.nvnetwork.failover.fetcher.b bVar) {
        }

        @Override // com.dianping.nvnetwork.failover.a.b
        public void a(com.dianping.nvnetwork.failover.fetcher.b bVar, q qVar, Throwable th) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void a(com.dianping.nvnetwork.failover.fetcher.b bVar);

        void a(com.dianping.nvnetwork.failover.fetcher.b bVar, q qVar, Throwable th);

        void a(q qVar, Throwable th);
    }

    @SuppressLint({"UseSparseArrays"})
    public a(Request request, com.dianping.nvnetwork.http.a aVar, com.dianping.nvnetwork.http.a aVar2) {
        int c;
        long j;
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        Object[] objArr2 = {request, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8591da082bf7702d2b93882e9ff02ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8591da082bf7702d2b93882e9ff02ba");
            return;
        }
        this.l = new Object();
        this.f = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.i = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashMap();
        this.j = new AtomicInteger(0);
        this.d = request;
        this.k = new AtomicBoolean(false);
        Object[] objArr3 = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5aafe028df694db0309e70695b445216", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5aafe028df694db0309e70695b445216");
            return;
        }
        g gVar = new g();
        gVar.b = f.a(-172, "cip tunnel timeout.");
        Request request2 = this.d;
        Object[] objArr4 = {request2};
        ChangeQuickRedirect changeQuickRedirect4 = f.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "54535da9622eb6d7178ea60c6e73563a", 6917529027641081856L)) {
            j = ((Long) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "54535da9622eb6d7178ea60c6e73563a")).longValue();
        } else {
            if (request2 == null || request2.h <= 0) {
                c = h.h().c();
            } else {
                c = request2.h;
            }
            j = c;
        }
        com.dianping.nvnetwork.failover.fetcher.c cVar = new com.dianping.nvnetwork.failover.fetcher.c(gVar, j);
        cVar.c = 1;
        this.b.add(cVar);
        this.f.put(Integer.valueOf(cVar.c), cVar);
        com.dianping.nvnetwork.failover.fetcher.d dVar = new com.dianping.nvnetwork.failover.fetcher.d(aVar);
        dVar.c = 4;
        dVar.d = hashCode();
        final com.dianping.nvnetwork.failover.fetcher.c cVar2 = new com.dianping.nvnetwork.failover.fetcher.c(dVar, PatchProxy.isSupport(new Object[0], null, f.a, true, "0d30f0914c1db792020572341a1a9aaa", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d30f0914c1db792020572341a1a9aaa")).intValue() : h.h().d());
        cVar2.c = 2;
        this.c.add(cVar2);
        this.f.put(Integer.valueOf(cVar2.c), cVar2);
        com.dianping.nvnetwork.failover.fetcher.f fVar = new com.dianping.nvnetwork.failover.fetcher.f(aVar2, new f.a() { // from class: com.dianping.nvnetwork.failover.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvnetwork.failover.fetcher.f.a
            public final void a(Request request3) {
                Object[] objArr5 = {request3};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ac170caeb3dc8a29c3f90f12c6b856a0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ac170caeb3dc8a29c3f90f12c6b856a0");
                    return;
                }
                a.this.a("DataLoader", "ack received, cancel httpHoldDataFetcher.");
                a.this.b(cVar2);
            }
        });
        fVar.c = 3;
        fVar.d = hashCode();
        this.i.add(fVar);
        this.f.put(Integer.valueOf(fVar.c), fVar);
        this.i.add(dVar);
        this.f.put(Integer.valueOf(dVar.c), dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95399eeb609dd6e76091c423cca4aa47", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95399eeb609dd6e76091c423cca4aa47")).booleanValue();
        }
        if (this.k.get()) {
            a("DataLoader", "data loader has been completed.");
            return false;
        }
        int andIncrement = this.j.getAndIncrement();
        if (andIncrement >= this.i.size()) {
            a("DataLoader", "start order fetcher size limit.");
            return false;
        }
        a(this.i.get(andIncrement));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.dianping.nvnetwork.failover.fetcher.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96eeda29506616dac003bd9c28627d88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96eeda29506616dac003bd9c28627d88");
        } else if (bVar == null) {
            a("DataLoader", "start fetcher is null, does register this DataFetcher?");
            throw new IllegalStateException("does register this DataFetcher?");
        } else {
            synchronized (this.l) {
                this.g.add(bVar);
            }
            a("DataLoader", "start fetcher: " + a(bVar.b()) + CommonConstant.Symbol.DOT);
            bVar.b(this.d, this);
        }
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.b.a
    public final void a(com.dianping.nvnetwork.failover.fetcher.b bVar, Request request) {
        Object[] objArr = {bVar, request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "951b3907c579561da0ce253d11d67049", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "951b3907c579561da0ce253d11d67049");
        } else if (this.e != null) {
            this.e.a(bVar);
        }
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.b.a
    public final void a(com.dianping.nvnetwork.failover.fetcher.b bVar, q qVar, Throwable th) {
        boolean z;
        Object[] objArr = {bVar, qVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08930e05559b251e145e3611d00a68ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08930e05559b251e145e3611d00a68ec");
            return;
        }
        String a2 = a(bVar.b());
        try {
            synchronized (this.l) {
                if (bVar.a() == 15) {
                    a("DataLoader", "### onCompleted-> has been canceled: " + a2);
                    synchronized (this.l) {
                        this.h.put(bVar, Boolean.TRUE);
                        if (bVar.a() == 15) {
                            a("DataLoader", "### " + a2 + " -> has been canceled.");
                        }
                        if (!this.c.contains(bVar) && !this.b.contains(bVar)) {
                            a("DataLoader", "start next order fetcher.");
                            if (!a()) {
                                a("DataLoader", "order fetcher execute end, check fetchers.");
                                b(bVar, qVar, th);
                            }
                            return;
                        }
                        a("DataLoader", String.format("%s failed, and check fetchers.", a2));
                        b(bVar, qVar, th);
                        return;
                    }
                }
                a("DataLoader", "### onCompleted: " + a2 + ", state: " + bVar.a());
                Object[] objArr2 = {bVar, qVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1651c9847da6fd09b0790b62a42d6c3", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1651c9847da6fd09b0790b62a42d6c3")).booleanValue();
                } else {
                    if (bVar != null && qVar != null && bVar.a() == 5 && qVar.isSuccess()) {
                        z = true;
                    }
                    z = false;
                }
                if (z) {
                    a("DataLoader", String.format("%s success: --> invoke dispatchDone.", a2));
                    synchronized (this.l) {
                        this.h.put(bVar, Boolean.TRUE);
                        boolean z2 = bVar.a() == 15;
                        if (z2) {
                            a("DataLoader", "### " + a2 + " -> has been canceled.");
                        }
                        if (!z2) {
                            c(bVar, qVar, th);
                            return;
                        }
                        if (!this.c.contains(bVar) && !this.b.contains(bVar)) {
                            a("DataLoader", "start next order fetcher.");
                            if (!a()) {
                                a("DataLoader", "order fetcher execute end, check fetchers.");
                                b(bVar, qVar, th);
                            }
                            return;
                        }
                        a("DataLoader", String.format("%s failed, and check fetchers.", a2));
                        b(bVar, qVar, th);
                        return;
                    }
                }
                a("DataLoader", String.format("%s failed.", a2));
                if (this.b.contains(bVar)) {
                    a("DataLoader", String.format("global fetcher: %s ignore fail: --> invoke dispatchDone.", a2));
                    synchronized (this.l) {
                        this.h.put(bVar, Boolean.TRUE);
                        boolean z3 = bVar.a() == 15;
                        if (z3) {
                            a("DataLoader", "### " + a2 + " -> has been canceled.");
                        }
                        if (!z3) {
                            c(bVar, qVar, th);
                            return;
                        }
                        if (!this.c.contains(bVar) && !this.b.contains(bVar)) {
                            a("DataLoader", "start next order fetcher.");
                            if (!a()) {
                                a("DataLoader", "order fetcher execute end, check fetchers.");
                                b(bVar, qVar, th);
                            }
                            return;
                        }
                        a("DataLoader", String.format("%s failed, and check fetchers.", a2));
                        b(bVar, qVar, th);
                    }
                } else if (!this.i.contains(bVar) || bVar.a(this.d, qVar)) {
                    synchronized (this.l) {
                        this.h.put(bVar, Boolean.TRUE);
                        if (bVar.a() == 15) {
                            a("DataLoader", "### " + a2 + " -> has been canceled.");
                        }
                        if (!this.c.contains(bVar) && !this.b.contains(bVar)) {
                            a("DataLoader", "start next order fetcher.");
                            if (!a()) {
                                a("DataLoader", "order fetcher execute end, check fetchers.");
                                b(bVar, qVar, th);
                            }
                            return;
                        }
                        a("DataLoader", String.format("%s failed, and check fetchers.", a2));
                        b(bVar, qVar, th);
                    }
                } else {
                    a("DataLoader", String.format("order fetcher: %s can not start next: --> invoke dispatchDone.", a2));
                    synchronized (this.l) {
                        this.h.put(bVar, Boolean.TRUE);
                        boolean z4 = bVar.a() == 15;
                        if (z4) {
                            a("DataLoader", "### " + a2 + " -> has been canceled.");
                        }
                        if (!z4) {
                            c(bVar, qVar, th);
                            return;
                        }
                        if (!this.c.contains(bVar) && !this.b.contains(bVar)) {
                            a("DataLoader", "start next order fetcher.");
                            if (!a()) {
                                a("DataLoader", "order fetcher execute end, check fetchers.");
                                b(bVar, qVar, th);
                            }
                            return;
                        }
                        a("DataLoader", String.format("%s failed, and check fetchers.", a2));
                        b(bVar, qVar, th);
                    }
                }
            }
        } catch (Throwable th2) {
            synchronized (this.l) {
                this.h.put(bVar, Boolean.TRUE);
                if (bVar.a() == 15) {
                    a("DataLoader", "### " + a2 + " -> has been canceled.");
                }
                if (!this.c.contains(bVar) && !this.b.contains(bVar)) {
                    a("DataLoader", "start next order fetcher.");
                    if (!a()) {
                        a("DataLoader", "order fetcher execute end, check fetchers.");
                        b(bVar, qVar, th);
                    }
                    throw th2;
                }
                a("DataLoader", String.format("%s failed, and check fetchers.", a2));
                b(bVar, qVar, th);
            }
        }
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.b.a
    public final void a(com.dianping.nvnetwork.failover.fetcher.b bVar, Request request, q qVar, Throwable th) {
        Object[] objArr = {bVar, request, qVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa743b4e5d6827c4cfed411a35b7827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa743b4e5d6827c4cfed411a35b7827");
        } else if (this.e != null) {
            this.e.a(bVar, qVar, th);
        }
    }

    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aaafd80b2cfd627eb49f75ba33ae4ef", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aaafd80b2cfd627eb49f75ba33ae4ef");
        }
        switch (i) {
            case 1:
                return "[global timeout fetcher]";
            case 2:
                return "[http hold fetcher]";
            case 3:
                return "[tcp fetcher]";
            case 4:
                return "[http fetcher]";
            default:
                return String.format("unknown fetcher {id: %s}", Integer.valueOf(i));
        }
    }

    private void b(com.dianping.nvnetwork.failover.fetcher.b bVar, q qVar, Throwable th) {
        boolean z;
        Object[] objArr = {bVar, qVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888154e5cc446c6afaa70a0bbcc828c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888154e5cc446c6afaa70a0bbcc828c1");
            return;
        }
        synchronized (this.l) {
            z = true;
            for (com.dianping.nvnetwork.failover.fetcher.b bVar2 : this.g) {
                if (!this.b.contains(bVar2)) {
                    z &= this.h.containsKey(bVar2) && this.h.get(bVar2).booleanValue();
                }
            }
        }
        if (z) {
            a("DataLoader", "check fetchers: --> invoke dispatchDone.");
            c(bVar, qVar, th);
            return;
        }
        a("DataLoader", "check fetchers: --> wait done.");
    }

    private void c(com.dianping.nvnetwork.failover.fetcher.b bVar, q qVar, Throwable th) {
        Object[] objArr = {bVar, qVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5217c711e4b136d26af1987e6b386542", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5217c711e4b136d26af1987e6b386542");
        } else if (this.k.get()) {
            a("DataLoader", "dispatch -> has done, fetcher: " + a(bVar.b()));
        } else if (this.k.compareAndSet(false, true)) {
            a("DataLoader", "dispatch -> callback load result done, fetcher: " + a(bVar.b()));
            if (this.e != null) {
                this.e.a(qVar, th);
            }
            c(bVar);
        }
    }

    private void c(com.dianping.nvnetwork.failover.fetcher.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f602d2b2d3343acee10d9d3e2f34767", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f602d2b2d3343acee10d9d3e2f34767");
            return;
        }
        synchronized (this.l) {
            for (com.dianping.nvnetwork.failover.fetcher.b bVar2 : this.f.values()) {
                if (bVar != bVar2) {
                    b(bVar2);
                }
            }
        }
    }

    void b(com.dianping.nvnetwork.failover.fetcher.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cc030962412b77cf735d79958c74020", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cc030962412b77cf735d79958c74020");
        } else if (bVar == null) {
        } else {
            synchronized (this.l) {
                if (this.g.remove(bVar)) {
                    bVar.cancel();
                }
            }
        }
    }

    void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd7d412c6a93736938091fd3d13ec5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd7d412c6a93736938091fd3d13ec5b");
        } else {
            f.a(str, str2, hashCode());
        }
    }
}
