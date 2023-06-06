package com.dianping.nvtunnelkit.kit;

import com.dianping.nvtunnelkit.kit.i;
import com.dianping.nvtunnelkit.kit.j;
import com.dianping.nvtunnelkit.kit.l;
import com.dianping.nvtunnelkit.kit.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class s<C extends w> implements i.a<C, r>, j.a<C, r>, k<C, r>, l.a<C, r, q>, w.a<C> {
    public static ChangeQuickRedirect a;
    ExecutorService b;
    final String c;
    final e<C> d;
    final Object e;
    final BlockingQueue<s<C>.a> f;
    i<C, r> g;
    l<C, r, q> h;
    j<C, r> i;

    public static /* synthetic */ void a(s sVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sVar, changeQuickRedirect, false, "195664eac82b89a8b324b0f5e2932c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sVar, changeQuickRedirect, false, "195664eac82b89a8b324b0f5e2932c31");
        } else if (sVar.d.j()) {
            com.dianping.nvtunnelkit.logger.b.b(sVar.c, "tunnel is closed. can not prepare connections.");
            sVar.d.h();
        } else {
            sVar.d.b.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.k
    public final /* synthetic */ void d(r rVar, Object obj) {
        a(rVar, (r) ((w) obj));
    }

    public s(e<C> eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03c9b81b7a211f30819039497ea0bd01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03c9b81b7a211f30819039497ea0bd01");
            return;
        }
        this.e = new Object();
        this.c = com.dianping.nvtunnelkit.logger.a.a(eVar.c.b, "SendRecvManager");
        this.d = eVar;
        this.f = new LinkedBlockingQueue(eVar.c.l);
    }

    public final void a(r rVar, C c) {
        Object[] objArr = {rVar, c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94086150a432bd3736d82b71ea350c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94086150a432bd3736d82b71ea350c43");
            return;
        }
        try {
            if (com.dianping.nvtunnelkit.logger.b.a()) {
                String str = this.c;
                com.dianping.nvtunnelkit.logger.b.a(str, "send -> data: " + new String(rVar.a().array()));
            }
            if (!rVar.c) {
                a(rVar);
                if (this.d.j()) {
                    a(rVar, new com.dianping.nvtunnelkit.exception.i());
                    this.d.h();
                    if (this.b == null) {
                        synchronized (this.e) {
                            if (this.b == null) {
                                this.b = com.sankuai.android.jarvis.c.a("tunnel_kit_send_jarvis", "tunnel_kit_send_" + this.d.c.b, 60L);
                                this.b.execute(new b());
                            }
                        }
                        return;
                    }
                    return;
                }
                a(rVar, (r) c, (byte) 0);
            }
            this.f.add(new a(rVar, c));
            if (this.b == null) {
                synchronized (this.e) {
                    if (this.b == null) {
                        this.b = com.sankuai.android.jarvis.c.a("tunnel_kit_send_jarvis", "tunnel_kit_send_" + this.d.c.b, 60L);
                        this.b.execute(new b());
                    }
                }
            }
        } catch (Throwable th) {
            try {
                if (th instanceof IllegalStateException) {
                    com.dianping.nvtunnelkit.logger.b.a(this.c, "send queue beyond limit.", th);
                    a(rVar, new com.dianping.nvtunnelkit.exception.f());
                } else {
                    a(rVar, new com.dianping.nvtunnelkit.exception.e("send failed."));
                }
                if (this.b == null) {
                    synchronized (this.e) {
                        if (this.b == null) {
                            this.b = com.sankuai.android.jarvis.c.a("tunnel_kit_send_jarvis", "tunnel_kit_send_" + this.d.c.b, 60L);
                            this.b.execute(new b());
                        }
                    }
                }
            } catch (Throwable th2) {
                if (this.b == null) {
                    synchronized (this.e) {
                        if (this.b == null) {
                            this.b = com.sankuai.android.jarvis.c.a("tunnel_kit_send_jarvis", "tunnel_kit_send_" + this.d.c.b, 60L);
                            this.b.execute(new b());
                        }
                    }
                }
                throw th2;
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.k
    public final void cancel(r rVar) {
        boolean z = false;
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a804cc28ea08ab776b76f6fd068d6574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a804cc28ea08ab776b76f6fd068d6574");
            return;
        }
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a aVar = (a) it.next();
            if (aVar.a == rVar) {
                z = this.f.remove(aVar);
                break;
            }
        }
        String str = this.c;
        com.dianping.nvtunnelkit.logger.b.a(str, "cancel: " + z);
        if (z) {
            a(rVar, new com.dianping.nvtunnelkit.exception.c());
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i.a
    public final void a(i<C, r> iVar) {
        this.g = iVar;
    }

    private void a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ca5ff6a98a8579d5eae9fa5dedad52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ca5ff6a98a8579d5eae9fa5dedad52");
        } else if (this.g != null) {
            this.g.b(rVar);
        }
    }

    public final boolean b(r rVar, C c) {
        Object[] objArr = {rVar, c};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f487c65f5bed91bacf8d10d91a77ea7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f487c65f5bed91bacf8d10d91a77ea7")).booleanValue() : this.g != null && this.g.b(rVar, c);
    }

    public final void c(r rVar, C c) {
        Object[] objArr = {rVar, c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb16a17b6e5274036698b83b18463b27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb16a17b6e5274036698b83b18463b27");
        } else if (this.g != null) {
            this.g.a(rVar, c);
        }
    }

    public final void a(r rVar, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {rVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828d63ac44336eaa4ed3cf96113111ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828d63ac44336eaa4ed3cf96113111ae");
            return;
        }
        b(rVar, dVar);
        if (this.g != null) {
            this.g.a_(rVar, dVar);
        }
    }

    public final void d(r rVar, C c) {
        Object[] objArr = {rVar, c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1a6f8a9e9b08d8dadabd24ead64cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1a6f8a9e9b08d8dadabd24ead64cc6");
        } else if (this.g != null) {
            this.g.c(rVar, c);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.w.a
    public final void a(q qVar, C c, int i) {
        Object[] objArr = {qVar, c, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ce6057ed91a928a634586173e91a151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ce6057ed91a928a634586173e91a151");
            return;
        }
        Object[] objArr2 = {qVar, c, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e5fdded481e3ddcb869e47a531557bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e5fdded481e3ddcb869e47a531557bb");
        } else if (this.h != null) {
            this.h.a(qVar, c, i);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.l.a
    public final void a(l<C, r, q> lVar) {
        this.h = lVar;
    }

    private void b(r rVar, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {rVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10871d319505ad21ca2967d6c1a0a08b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10871d319505ad21ca2967d6c1a0a08b");
        } else if (this.h != null) {
            this.h.a(rVar, dVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.j.a
    public final void a(j<C, r> jVar) {
        this.i = jVar;
    }

    private void a(r rVar, C c, byte b2) {
        Object[] objArr = {rVar, c, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc36b77575bcd51de81a99cf41308c70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc36b77575bcd51de81a99cf41308c70");
        } else if (this.i != null) {
            this.i.a(rVar, c, (byte) 0);
        }
    }

    public final void a(r rVar, C c, long j, int i, byte b2) {
        Object[] objArr = {rVar, c, new Long(j), Integer.valueOf(i), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2e5ebc351a6b6100d8d7edd43566ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2e5ebc351a6b6100d8d7edd43566ce");
        } else if (this.i != null) {
            this.i.a(rVar, c, j, i, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a {
        public final r a;
        public C b;

        public a(r rVar, C c) {
            this.a = rVar;
            this.b = c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        private long c;

        private b() {
            Object[] objArr = {s.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36032adc7eb0f63650e425b7591bf1b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36032adc7eb0f63650e425b7591bf1b3");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v3, types: [com.dianping.nvtunnelkit.kit.w, C extends com.dianping.nvtunnelkit.kit.w, com.dianping.nvtunnelkit.conn.b] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b144d28a491c32980cad57f8d40d05f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b144d28a491c32980cad57f8d40d05f");
                return;
            }
            while (true) {
                C c = null;
                boolean z2 = true;
                try {
                    s<C>.a take = s.this.f.take();
                    if (take.a.c) {
                        ?? r11 = take.b;
                        Object[] objArr2 = {take, r11};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de7484c53aace9fa457a64a4270817b9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de7484c53aace9fa457a64a4270817b9");
                        } else {
                            try {
                                r11.a(take.a);
                            } catch (Throwable th) {
                                String str = s.this.c;
                                com.dianping.nvtunnelkit.logger.b.a(str, "connection send ping fail. ip: " + r11.q, th);
                                s.this.d.c((e<C>) r11);
                                s.a(s.this);
                            }
                        }
                    } else if (s.this.d.j()) {
                        s.this.a(take.a, new com.dianping.nvtunnelkit.exception.i());
                    } else {
                        s.a(s.this);
                        if (take.b == 0) {
                            s sVar = s.this;
                            r rVar = take.a;
                            Object[] objArr3 = {rVar};
                            ChangeQuickRedirect changeQuickRedirect3 = s.a;
                            if (PatchProxy.isSupport(objArr3, sVar, changeQuickRedirect3, false, "c8eb3bb4daa3be873c539d5ea94149c0", RobustBitConfig.DEFAULT_VALUE)) {
                                c = (C) PatchProxy.accessDispatch(objArr3, sVar, changeQuickRedirect3, false, "c8eb3bb4daa3be873c539d5ea94149c0");
                            } else if (sVar.g != null) {
                                c = sVar.g.a(rVar);
                            }
                            take.b = c;
                        }
                        if (take.b != 0) {
                            if (!s.this.b(take.a, (r) take.b)) {
                                a(take, take.b);
                            }
                            z2 = false;
                        } else {
                            long j = s.this.d.c.c <= 0 ? 1L : s.this.d.c.c;
                            List<C> b = s.this.d.b.b();
                            ArrayList<w> arrayList = new ArrayList();
                            synchronized (b) {
                                if (!b.isEmpty() || this.c + 700 >= com.dianping.nvtunnelkit.utils.g.a()) {
                                    z = false;
                                } else {
                                    try {
                                        b.wait(j);
                                    } catch (InterruptedException e) {
                                        com.dianping.nvtunnelkit.logger.b.a(s.this.c, "wait connection interrupt.", e);
                                    }
                                    z = true;
                                }
                                this.c = com.dianping.nvtunnelkit.utils.g.a();
                                s.this.d.b.a(arrayList);
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                w wVar = (w) it.next();
                                com.dianping.nvtunnelkit.logger.b.a("tl-luoheng", "ip:" + wVar.q + ", weight: " + wVar.g());
                                if (!wVar.k() || wVar.l() || wVar.m()) {
                                    String str2 = wVar.q;
                                    String str3 = s.this.c;
                                    com.dianping.nvtunnelkit.logger.b.b(str3, "connection bad state. ip: " + str2);
                                    s.this.d.c((e<C>) wVar);
                                    it.remove();
                                }
                            }
                            if (arrayList.isEmpty()) {
                                s.this.a(take.a, z ? new com.dianping.nvtunnelkit.exception.l() : new com.dianping.nvtunnelkit.exception.g());
                            } else {
                                for (w wVar2 : arrayList) {
                                    if (!s.this.b(take.a, (r) wVar2)) {
                                        a(take, wVar2);
                                        break;
                                    }
                                }
                                z2 = false;
                            }
                        }
                        if (!z2) {
                            s.this.a(take.a, new com.dianping.nvtunnelkit.exception.g());
                        }
                    }
                } catch (InterruptedException unused) {
                    s.this.f.clear();
                    com.dianping.nvtunnelkit.logger.b.b(s.this.c, "send thread is interrupted.");
                    s sVar2 = s.this;
                    com.dianping.nvtunnelkit.exception.n nVar = new com.dianping.nvtunnelkit.exception.n("send thread is interrupted");
                    Object[] objArr4 = {nVar};
                    ChangeQuickRedirect changeQuickRedirect4 = s.a;
                    if (PatchProxy.isSupport(objArr4, sVar2, changeQuickRedirect4, false, "6764810c244d0cd9e7856cb711da056d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, sVar2, changeQuickRedirect4, false, "6764810c244d0cd9e7856cb711da056d");
                    } else {
                        Object[] objArr5 = {nVar};
                        ChangeQuickRedirect changeQuickRedirect5 = s.a;
                        if (PatchProxy.isSupport(objArr5, sVar2, changeQuickRedirect5, false, "e7ab1a72fd67972fed9f395f7fd7a730", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, sVar2, changeQuickRedirect5, false, "e7ab1a72fd67972fed9f395f7fd7a730");
                        } else if (sVar2.h != null) {
                            sVar2.h.a(nVar);
                        }
                        if (sVar2.g != null) {
                            sVar2.g.a_(nVar);
                        }
                    }
                    synchronized (s.this.e) {
                        s.this.b = null;
                        return;
                    }
                }
            }
        }

        private void a(s<C>.a aVar, C c) {
            Object[] objArr = {aVar, c};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e6117345b6d1added732295e4423985", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e6117345b6d1added732295e4423985");
                return;
            }
            try {
                s.this.c(aVar.a, c);
                int b = aVar.a.b();
                c.a(aVar.a);
                s.this.a(aVar.a, c, (-System.nanoTime()) + System.nanoTime(), b, (byte) 0);
                s.this.d(aVar.a, (r) c);
            } catch (Throwable th) {
                String str = s.this.c;
                com.dianping.nvtunnelkit.logger.b.a(str, "connection send fail. ip: " + c.q, th);
                s.this.a(aVar.a, new com.dianping.nvtunnelkit.exception.e());
                s.this.d.c((e<C>) c);
                s.a(s.this);
            }
        }
    }
}
