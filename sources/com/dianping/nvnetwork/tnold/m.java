package com.dianping.nvnetwork.tnold;

import android.content.Context;
import com.dianping.nvnetwork.tnold.a;
import com.dianping.nvnetwork.u;
import com.dianping.nvnetwork.v;
import com.dianping.nvnetwork.x;
import com.dianping.nvnetwork.y;
import com.dianping.nvnetwork.z;
import com.dianping.nvtunnelkit.kit.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class m<C extends com.dianping.nvnetwork.tnold.a> extends c<C> implements com.dianping.nvtunnelkit.kit.i<C, v> {
    public static ChangeQuickRedirect f;
    private final Map<String, a> a;
    final AtomicInteger g;
    private final boolean k;
    private final Map<C, AtomicInteger> l;
    private final AtomicBoolean m;
    private u n;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvnetwork.tnold.c, com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.h
    public final /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
        b((m<C>) ((com.dianping.nvnetwork.tnold.a) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvnetwork.tnold.c, com.dianping.nvtunnelkit.kit.o
    public final /* synthetic */ void a(w wVar) {
        b((m<C>) ((com.dianping.nvnetwork.tnold.a) wVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o
    public /* bridge */ /* synthetic */ void a(v vVar, w wVar) {
        a(vVar, (v) ((com.dianping.nvnetwork.tnold.a) wVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o
    public final /* bridge */ /* synthetic */ void a(com.dianping.nvnetwork.w wVar, w wVar2, int i) {
        a(wVar, (com.dianping.nvnetwork.w) ((com.dianping.nvnetwork.tnold.a) wVar2), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.i
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        a((v) obj, (v) ((com.dianping.nvnetwork.tnold.a) obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.l
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2, int i) {
        a((com.dianping.nvnetwork.w) obj, (com.dianping.nvnetwork.w) ((com.dianping.nvnetwork.tnold.a) obj2), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvnetwork.tnold.c, com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.h
    public final /* synthetic */ void b(com.dianping.nvtunnelkit.conn.c cVar) {
        a((m<C>) ((com.dianping.nvnetwork.tnold.a) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvnetwork.tnold.c, com.dianping.nvtunnelkit.kit.o
    public final /* synthetic */ void b(w wVar) {
        a((m<C>) ((com.dianping.nvnetwork.tnold.a) wVar));
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ void b(Object obj) {
        v vVar = (v) obj;
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2cc61b4ce239daf1064570444f502a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2cc61b4ce239daf1064570444f502a");
        } else if (vVar.c == null || this.a.containsKey(vVar.c)) {
        } else {
            a aVar = new a(new x(vVar));
            this.a.put(aVar.b.b, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o
    public final /* bridge */ /* synthetic */ boolean b(v vVar, w wVar) {
        return b(vVar, (v) ((com.dianping.nvnetwork.tnold.a) wVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.i
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return b((v) obj, (v) ((com.dianping.nvnetwork.tnold.a) obj2));
    }

    @Override // com.dianping.nvtunnelkit.codec.a.InterfaceC0104a
    public final /* synthetic */ com.dianping.nvtunnelkit.codec.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8955eb556c13c98f92fb520c2fe875ad", 6917529027641081856L) ? (o) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8955eb556c13c98f92fb520c2fe875ad") : new o(this);
    }

    @Override // com.dianping.nvtunnelkit.codec.b.a
    public final /* synthetic */ com.dianping.nvtunnelkit.codec.b h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf13dd1d9f58e9d9177cff41c1b6228", 6917529027641081856L) ? (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf13dd1d9f58e9d9177cff41c1b6228") : new q(this);
    }

    public m(Context context, y yVar, com.dianping.nvtunnelkit.kit.v vVar, com.dianping.nvtunnelkit.kit.a aVar) {
        super(context, yVar, vVar, aVar);
        Object[] objArr = {context, yVar, vVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b68f0e291a8c3868b233fc751a72932", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b68f0e291a8c3868b233fc751a72932");
            return;
        }
        this.a = new ConcurrentHashMap();
        this.k = yVar.a;
        this.l = this.k ? new ConcurrentHashMap() : null;
        this.g = new AtomicInteger(yVar.b);
        this.m = new AtomicBoolean(false);
    }

    public void a(u uVar) {
        this.n = uVar;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b960a83e692064348a2ad813121ab1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b960a83e692064348a2ad813121ab1");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.b("Close tunnel compress");
        this.g.getAndSet(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94f2c2f61007948b3612ba9aafab150", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94f2c2f61007948b3612ba9aafab150");
            return;
        }
        com.dianping.nvtunnelkit.kit.d<C> l = l();
        if (l != 0) {
            l.c(c);
        }
    }

    private void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec252a71d62eb7f9e8ac753e6e50c6be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec252a71d62eb7f9e8ac753e6e50c6be");
        } else if (this.k) {
            com.dianping.nvtunnelkit.core.c.a().b(aVar.e);
        }
    }

    private void a(String str) {
        a remove;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5aedf55e6f6998ebec64d7c7bcfd50f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5aedf55e6f6998ebec64d7c7bcfd50f");
        } else if (str == null || (remove = this.a.remove(str)) == null) {
        } else {
            com.dianping.nvtunnelkit.core.c.a().b(remove.d);
        }
    }

    @Override // com.dianping.nvnetwork.tnold.c, com.dianping.nvtunnelkit.kit.o
    /* renamed from: a */
    public final void a_(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d413d3219f812a8567a2b3bc37c4a6b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d413d3219f812a8567a2b3bc37c4a6b5");
        } else if (this.m.get()) {
            com.dianping.nvtunnelkit.logger.b.a("TNTunnel", "Shark cip tunnel closed");
            a(vVar, (com.dianping.nvtunnelkit.exception.d) new com.dianping.nvtunnelkit.exception.e());
        } else {
            super.a_(vVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.n
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4758e369751cf8edc3b6f68f4d6861d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4758e369751cf8edc3b6f68f4d6861d1");
        } else if (this.m.get()) {
        } else {
            super.f();
        }
    }

    private boolean b(v vVar, C c) {
        Object[] objArr = {vVar, c};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cccaa96e49c021f95708242a23e8f04", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cccaa96e49c021f95708242a23e8f04")).booleanValue() : this.m.get() || vVar.c == null || this.a.get(vVar.c) == null || (z.a(c.m) && !vVar.j);
    }

    public void a(final v vVar, final C c) {
        a aVar;
        int i;
        long j;
        char c2 = 0;
        Object[] objArr = {vVar, c};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a7a241dcdc13baede969210e55b7ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a7a241dcdc13baede969210e55b7ab");
            return;
        }
        Object[] objArr2 = {vVar, c};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36fa8f3c063d2189e4418136e9c6d609", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36fa8f3c063d2189e4418136e9c6d609");
        } else if (vVar.c == null || (aVar = this.a.get(vVar.c)) == null) {
        } else {
            x xVar = aVar.b;
            Object[] objArr3 = {xVar};
            ChangeQuickRedirect changeQuickRedirect3 = f;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "060353705143a2386d2a9be790568bc8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "060353705143a2386d2a9be790568bc8");
            } else {
                List b = a().b();
                ArrayList arrayList = new ArrayList();
                synchronized (b) {
                    arrayList.addAll(b);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.dianping.nvnetwork.tnold.a aVar2 = (com.dianping.nvnetwork.tnold.a) it.next();
                    String str = aVar2.q;
                    String valueOf = String.valueOf(aVar2.h);
                    Object[] objArr4 = new Object[2];
                    objArr4[c2] = str;
                    objArr4[1] = valueOf;
                    ChangeQuickRedirect changeQuickRedirect4 = x.a;
                    Iterator it2 = it;
                    if (PatchProxy.isSupport(objArr4, xVar, changeQuickRedirect4, false, "a76e5e2f8cc36e2b1674b85b0da26527", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, xVar, changeQuickRedirect4, false, "a76e5e2f8cc36e2b1674b85b0da26527");
                    } else {
                        if (xVar.k == null) {
                            xVar.k = new ArrayList();
                        }
                        xVar.k.add(new x.a(str, valueOf));
                    }
                    it = it2;
                    c2 = 0;
                }
            }
            aVar.b.j = c.q;
            aVar.b.l = c;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.dianping.nvnetwork.tnold.a.d;
            if (PatchProxy.isSupport(objArr5, c, changeQuickRedirect5, false, "acd86cd30204723b27cdcc274e530e11", 6917529027641081856L)) {
                i = 0;
                PatchProxy.accessDispatch(objArr5, c, changeQuickRedirect5, false, "acd86cd30204723b27cdcc274e530e11");
            } else {
                i = 0;
                c.e.incrementAndGet();
            }
            aVar.d = new Runnable() { // from class: com.dianping.nvnetwork.tnold.m.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "23b313054de88e73b54f0a1940e5f5f5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "23b313054de88e73b54f0a1940e5f5f5");
                    } else {
                        m.this.a(vVar, (com.dianping.nvtunnelkit.exception.d) new com.dianping.nvtunnelkit.exception.h());
                    }
                }
            };
            com.dianping.nvtunnelkit.core.c a2 = com.dianping.nvtunnelkit.core.c.a();
            Runnable runnable = aVar.d;
            x xVar2 = aVar.b;
            Object[] objArr6 = new Object[i];
            ChangeQuickRedirect changeQuickRedirect6 = x.a;
            if (PatchProxy.isSupport(objArr6, xVar2, changeQuickRedirect6, false, "b9ff0738f460089626f49910d563f960", 6917529027641081856L)) {
                j = ((Long) PatchProxy.accessDispatch(objArr6, xVar2, changeQuickRedirect6, false, "b9ff0738f460089626f49910d563f960")).longValue();
            } else {
                j = xVar2.e == null ? 25000L : xVar2.e.k;
            }
            a2.a(runnable, j);
            if (this.k) {
                aVar.e = new Runnable() { // from class: com.dianping.nvnetwork.tnold.m.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "eef90867be2a69c0e1d3c44758235bd7", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "eef90867be2a69c0e1d3c44758235bd7");
                            return;
                        }
                        AtomicInteger atomicInteger = (AtomicInteger) m.this.l.get(c);
                        if (atomicInteger == null) {
                            return;
                        }
                        String str2 = c.q;
                        atomicInteger.incrementAndGet();
                        com.dianping.nvtunnelkit.logger.b.b("TNTunnel", "conn ack timeout, ip: " + str2 + ", times: " + atomicInteger.get());
                        com.dianping.nvtunnelkit.conn.a aVar3 = c.l;
                        if (atomicInteger.get() >= aVar3.h) {
                            atomicInteger.set(0);
                            m.this.c((m) c);
                            com.dianping.nvtunnelkit.ext.d a3 = com.dianping.nvtunnelkit.ext.d.a();
                            a3.pv4(0L, "ack_timeout_" + aVar3.n, 0, 1, z.a(str2), 0, 0, 200, str2, null);
                        }
                    }
                };
                com.dianping.nvtunnelkit.core.c.a().a(aVar.e, c.l.i);
            }
        }
    }

    @Override // com.dianping.nvnetwork.tnold.c
    public final void a(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a14d8ed691e65ffc86dbafea858e050", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a14d8ed691e65ffc86dbafea858e050");
            return;
        }
        super.a((m<C>) c);
        if (this.k) {
            this.l.put(c, new AtomicInteger(0));
        }
    }

    @Override // com.dianping.nvnetwork.tnold.c
    public final void b(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9761c9fc19f241a173cbe5ec355b76a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9761c9fc19f241a173cbe5ec355b76a4");
            return;
        }
        super.b((m<C>) c);
        if (this.k) {
            this.l.remove(c);
        }
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b28f9a5fd2c073d44fd892e5ab11b49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b28f9a5fd2c073d44fd892e5ab11b49");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.b("TNTunnel", "handle Connection Closed. ip: " + c.q);
        for (a aVar : this.a.values()) {
            x xVar = aVar.b;
            if (xVar.l == c) {
                cancel(xVar.e);
                if (this.n != null) {
                    this.n.a(xVar, new com.dianping.nvtunnelkit.exception.m());
                }
            }
        }
    }

    @Override // com.dianping.nvnetwork.tnold.c, com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.k
    public void cancel(v vVar) {
        a remove;
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17e041dd0fa8e754a96b4d4a5bc7f356", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17e041dd0fa8e754a96b4d4a5bc7f356");
            return;
        }
        super.cancel(vVar);
        if (vVar == null || (remove = this.a.remove(vVar.c)) == null || !remove.c.compareAndSet(false, true)) {
            return;
        }
        a(vVar.c);
    }

    private void a(com.dianping.nvnetwork.w wVar, C c, int i) {
        AtomicInteger atomicInteger;
        Object[] objArr = {wVar, c, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5249282aa82b5ba1611fcbad8f616efb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5249282aa82b5ba1611fcbad8f616efb");
            return;
        }
        a aVar = wVar.a == null ? null : this.a.get(wVar.a);
        if (wVar.i) {
            if (aVar != null) {
                aVar.b.f = wVar;
            }
            int i2 = wVar.j;
            Object[] objArr2 = {aVar, c, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff46a601b09f63e6088a6c702e1ae361", 6917529027641081856L)) {
                if (aVar != null) {
                    int a2 = (int) (z.a() - aVar.b.c);
                    Object[] objArr3 = {Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvnetwork.tnold.a.d;
                    if (PatchProxy.isSupport(objArr3, c, changeQuickRedirect3, false, "908c1ba8940692443e2b8450f50fec57", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, c, changeQuickRedirect3, false, "908c1ba8940692443e2b8450f50fec57");
                    } else {
                        c.f.a(a2);
                    }
                    a(aVar);
                }
                if (this.k && (atomicInteger = this.l.get(c)) != null) {
                    atomicInteger.set(0);
                }
                if (i2 < 0) {
                    com.dianping.nvtunnelkit.logger.b.b("TNTunnel", "Shark server error status:" + i2);
                    switch (i2) {
                        case -103:
                        case -102:
                        case -5:
                        case -4:
                            com.dianping.nvtunnelkit.logger.b.b("TNTunnel", "Hpack-gzip server exception, close compress");
                            e();
                            break;
                        case -101:
                            c((m<C>) c);
                            break;
                        case -2:
                            com.dianping.nvtunnelkit.logger.b.b("TNTunnel", "Request can retry safely");
                            break;
                        case -1:
                            com.dianping.nvtunnelkit.logger.b.b("TNTunnel", "Server close cip tunnel");
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = f;
                            if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2ddf5f64f5b9e4f349d421eb5f62f49f", 6917529027641081856L)) {
                                this.m.compareAndSet(false, true);
                                super.k();
                                break;
                            } else {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2ddf5f64f5b9e4f349d421eb5f62f49f");
                                break;
                            }
                    }
                }
            } else {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff46a601b09f63e6088a6c702e1ae361");
            }
            if (this.n == null || aVar == null) {
                return;
            }
            this.n.a(aVar.b);
        } else if (aVar == null || !aVar.c.compareAndSet(false, true)) {
        } else {
            aVar.b.f = wVar;
            aVar.b.g = z.a();
            if (aVar.b.h <= 0 || aVar.b.h > 300000) {
                aVar.b.h = c.s == 0 ? Integer.MAX_VALUE : (int) c.t;
            }
            Object[] objArr5 = {aVar, c};
            ChangeQuickRedirect changeQuickRedirect5 = f;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "eff5524a1d9fee8ed3b5a0870b35ed02", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "eff5524a1d9fee8ed3b5a0870b35ed02");
            } else {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.dianping.nvnetwork.tnold.a.d;
                if (PatchProxy.isSupport(objArr6, c, changeQuickRedirect6, false, "9bf3375b2cc11d87ba209b0969ff9383", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr6, c, changeQuickRedirect6, false, "9bf3375b2cc11d87ba209b0969ff9383");
                } else {
                    c.e.decrementAndGet();
                }
                x xVar = aVar.b;
                if (xVar.f != null && xVar.f.b > 0 && xVar.f.d != null) {
                    long j = xVar.g - xVar.c;
                    if (j > 0) {
                        xVar.i = xVar.f.d.length + (xVar.f.c != null ? xVar.f.c.toString().length() : 0);
                        int i3 = (int) ((xVar.d + xVar.i) / j);
                        Object[] objArr7 = {Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect7 = com.dianping.nvnetwork.tnold.a.d;
                        if (PatchProxy.isSupport(objArr7, c, changeQuickRedirect7, false, "6bc20451c6ca102627fa69661c11294b", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr7, c, changeQuickRedirect7, false, "6bc20451c6ca102627fa69661c11294b");
                        } else {
                            c.g.a(i3);
                        }
                    }
                }
                a(aVar);
            }
            if (this.n != null) {
                this.n.a(aVar.b);
            }
            a(wVar.a);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.l
    /* renamed from: b */
    public final void a(v vVar, com.dianping.nvtunnelkit.exception.d dVar) {
        a aVar;
        Object[] objArr = {vVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9843a9c3efd84a96f22beee8cb6aaa41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9843a9c3efd84a96f22beee8cb6aaa41");
        } else if (vVar.c == null || (aVar = this.a.get(vVar.c)) == null || !aVar.c.compareAndSet(false, true)) {
        } else {
            if (this.n != null) {
                this.n.a(aVar.b, dVar);
            }
            a(vVar.c);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.l
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a5e6f06ee1dd4cc63d60c76cc60d05a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a5e6f06ee1dd4cc63d60c76cc60d05a");
            return;
        }
        if (this.n != null) {
            this.n.a(th);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61b7608a996feccf52e4ad6c55ecd336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61b7608a996feccf52e4ad6c55ecd336");
            return;
        }
        for (a aVar : this.a.values()) {
            if (aVar.c.compareAndSet(false, true)) {
                a(aVar.b.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final x b;
        public final AtomicBoolean c;
        public Runnable d;
        public Runnable e;

        public a(x xVar) {
            Object[] objArr = {xVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc106ce2d9d3962a9aa6c9494578ed9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc106ce2d9d3962a9aa6c9494578ed9");
                return;
            }
            this.b = xVar;
            this.c = new AtomicBoolean(false);
        }
    }
}
