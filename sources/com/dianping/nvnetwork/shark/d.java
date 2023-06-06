package com.dianping.nvnetwork.shark;

import android.content.Context;
import android.os.Message;
import com.dianping.nvnetwork.c;
import com.dianping.nvnetwork.shark.monitor.n;
import com.dianping.nvnetwork.shark.monitor.o;
import com.dianping.nvnetwork.tnold.m;
import com.dianping.nvnetwork.u;
import com.dianping.nvnetwork.util.l;
import com.dianping.nvnetwork.w;
import com.dianping.nvnetwork.x;
import com.dianping.nvnetwork.y;
import com.dianping.nvtunnelkit.core.j;
import com.dianping.nvtunnelkit.kit.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.SocketAddress;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends m<c> implements a {
    public static ChangeQuickRedirect a;
    private final n k;

    public d(Context context, y yVar, v vVar, com.dianping.nvtunnelkit.kit.a aVar) {
        super(context, yVar, vVar, aVar);
        Object[] objArr = {context, yVar, vVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce96f172f97089a150cc72355f38c3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce96f172f97089a150cc72355f38c3c");
            return;
        }
        this.k = n.a(context);
        rx.d.a(new j<Message>() { // from class: com.dianping.nvnetwork.shark.d.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvtunnelkit.core.j, rx.e
            public final /* synthetic */ void onNext(Object obj) {
                Message message = (Message) obj;
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d62b9f097fdfcd84025b6c4f9cd9e6a6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d62b9f097fdfcd84025b6c4f9cd9e6a6");
                    return;
                }
                com.dianping.nvtunnelkit.core.e<C> a2 = d.this.a();
                if (message.what == 30000) {
                    com.dianping.nvnetwork.util.g.c(">>>> notify disconnect.");
                    a2.d();
                    a2.a();
                } else if (message.what == 30001) {
                    List<c> b = a2.b();
                    com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_TUNNEL_STATUS_CHANGE, Boolean.valueOf(!b.isEmpty()));
                    synchronized (b) {
                        for (c cVar : b) {
                            com.dianping.nvnetwork.debug.b bVar = com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_ADDED;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = c.b;
                            com.dianping.nvnetwork.debug.a.a(bVar, PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "aa0637419a962e9b2c2461e347f52f4f", 6917529027641081856L) ? (com.dianping.nvnetwork.debug.c) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "aa0637419a962e9b2c2461e347f52f4f") : cVar.c.b());
                        }
                    }
                } else if (message.what == 30002) {
                    a2.d();
                } else if (message.what == 30003) {
                    a2.a();
                }
            }
        }, l.a().a(Message.class).e().a(rx.schedulers.a.d()));
    }

    @Override // com.dianping.nvnetwork.tnold.m, com.dianping.nvnetwork.shark.a
    public final void a(final u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e5be4f02621061aacc7b0b200f4e20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e5be4f02621061aacc7b0b200f4e20");
        } else {
            super.a(new u() { // from class: com.dianping.nvnetwork.shark.d.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.nvnetwork.u
                public final void a(x xVar) {
                    Object[] objArr2 = {xVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a57974d78798ef2c6799a4658071caf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a57974d78798ef2c6799a4658071caf");
                        return;
                    }
                    w wVar = xVar.f;
                    c.a a2 = com.dianping.nvnetwork.c.a(wVar.a);
                    if (wVar.i) {
                        a2.c(wVar.j).a(wVar.j > 0);
                        xVar.h = (System.nanoTime() - a2.e) / 1000000;
                        final n nVar = d.this.k;
                        final double d = xVar.h;
                        Object[] objArr3 = {Double.valueOf(d)};
                        ChangeQuickRedirect changeQuickRedirect3 = n.a;
                        if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "3108fed5411916d1d32a666646cf2d9d", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "3108fed5411916d1d32a666646cf2d9d");
                        } else if (nVar.a()) {
                            com.dianping.nvnetwork.shark.monitor.a.a().a(new Runnable() { // from class: com.dianping.nvnetwork.shark.monitor.n.7
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3e353e9e48c439ca2afb280cbb171cbb", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3e353e9e48c439ca2afb280cbb171cbb");
                                        return;
                                    }
                                    c a3 = c.a();
                                    double d2 = d;
                                    Object[] objArr5 = {Double.valueOf(d2)};
                                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                                    if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "7aebda268ff256cd8e27fb5f4ade611f", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "7aebda268ff256cd8e27fb5f4ade611f");
                                    } else if (d2 <= 0.0d || d2 > 180000.0d) {
                                    } else {
                                        a3.c.a(new l(d2));
                                        a3.k++;
                                        a3.b();
                                    }
                                }
                            });
                        }
                        final n nVar2 = d.this.k;
                        final String str = wVar.a;
                        Object[] objArr4 = {str};
                        ChangeQuickRedirect changeQuickRedirect4 = n.a;
                        if (PatchProxy.isSupport(objArr4, nVar2, changeQuickRedirect4, false, "d937dea88415d07c4ed7b42cf82d747e", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, nVar2, changeQuickRedirect4, false, "d937dea88415d07c4ed7b42cf82d747e");
                        } else if (nVar2.a()) {
                            com.dianping.nvnetwork.shark.monitor.a.a().a(new Runnable() { // from class: com.dianping.nvnetwork.shark.monitor.n.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dd409023bc23ea93fbaa92a4af19b831", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dd409023bc23ea93fbaa92a4af19b831");
                                        return;
                                    }
                                    o oVar = nVar2.h;
                                    String str2 = str;
                                    Object[] objArr6 = {str2};
                                    ChangeQuickRedirect changeQuickRedirect6 = o.a;
                                    if (PatchProxy.isSupport(objArr6, oVar, changeQuickRedirect6, false, "eb68945f649fc7978b31168702dcc853", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr6, oVar, changeQuickRedirect6, false, "eb68945f649fc7978b31168702dcc853");
                                        return;
                                    }
                                    o.a aVar = new o.a(str2);
                                    oVar.a(aVar);
                                    if (oVar.b.remove(aVar)) {
                                        oVar.b.add(aVar);
                                        aVar.c = o.a();
                                    }
                                }
                            });
                        }
                    } else {
                        a2.b(xVar.k);
                        long j = xVar.h;
                        Object[] objArr5 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect5 = c.a.a;
                        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "59d08807f91269f3212797757bf104b5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "59d08807f91269f3212797757bf104b5");
                        } else {
                            a2.p = j;
                        }
                        long j2 = wVar.g;
                        Object[] objArr6 = {new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect6 = c.a.a;
                        if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "1c75b371b42cb90451bb33db763a3a0f", 6917529027641081856L)) {
                            c.a aVar = (c.a) PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "1c75b371b42cb90451bb33db763a3a0f");
                        } else {
                            a2.l = j2;
                        }
                        long j3 = wVar.h;
                        Object[] objArr7 = {new Long(j3)};
                        ChangeQuickRedirect changeQuickRedirect7 = c.a.a;
                        if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "ed9b2caf0145a724b641ea6e74bc6e2b", 6917529027641081856L)) {
                            c.a aVar2 = (c.a) PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "ed9b2caf0145a724b641ea6e74bc6e2b");
                        } else {
                            a2.k = j3;
                        }
                        long j4 = wVar.e;
                        Object[] objArr8 = {new Long(j4)};
                        ChangeQuickRedirect changeQuickRedirect8 = c.a.a;
                        if (PatchProxy.isSupport(objArr8, a2, changeQuickRedirect8, false, "75fb9e487e809fc3471df3aa38ea6df3", 6917529027641081856L)) {
                            c.a aVar3 = (c.a) PatchProxy.accessDispatch(objArr8, a2, changeQuickRedirect8, false, "75fb9e487e809fc3471df3aa38ea6df3");
                        } else {
                            a2.j = j4;
                            a2.m = System.nanoTime() - j4;
                            a2.o = j4 - a2.e;
                        }
                        a2.a(wVar.f);
                        a2.s = xVar.d + xVar.i;
                        final n nVar3 = d.this.k;
                        final double d2 = a2.o / 1000000;
                        Object[] objArr9 = {Double.valueOf(d2)};
                        ChangeQuickRedirect changeQuickRedirect9 = n.a;
                        if (PatchProxy.isSupport(objArr9, nVar3, changeQuickRedirect9, false, "ed7b4cb8a4e67fc34cb1d8e2b45717d3", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr9, nVar3, changeQuickRedirect9, false, "ed7b4cb8a4e67fc34cb1d8e2b45717d3");
                        } else if (nVar3.a()) {
                            com.dianping.nvnetwork.shark.monitor.a.a().a(new Runnable() { // from class: com.dianping.nvnetwork.shark.monitor.n.8
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr10 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect10 = a;
                                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "482555569591188d222814a2e5378964", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "482555569591188d222814a2e5378964");
                                        return;
                                    }
                                    c a3 = c.a();
                                    double d3 = d2;
                                    Object[] objArr11 = {Double.valueOf(d3)};
                                    ChangeQuickRedirect changeQuickRedirect11 = c.a;
                                    if (PatchProxy.isSupport(objArr11, a3, changeQuickRedirect11, false, "a7c0306f26a19b0eb758e63a03804b30", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr11, a3, changeQuickRedirect11, false, "a7c0306f26a19b0eb758e63a03804b30");
                                    } else if (d3 <= 0.0d || d3 > 180000.0d) {
                                    } else {
                                        a3.b.a(new l(d3));
                                        a3.l++;
                                        a3.b();
                                    }
                                }
                            });
                        }
                        final n nVar4 = d.this.k;
                        final String str2 = wVar.a;
                        Object[] objArr10 = {str2};
                        ChangeQuickRedirect changeQuickRedirect10 = n.a;
                        if (PatchProxy.isSupport(objArr10, nVar4, changeQuickRedirect10, false, "e1090670f34d988222eec682eb963666", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr10, nVar4, changeQuickRedirect10, false, "e1090670f34d988222eec682eb963666");
                        } else if (nVar4.a()) {
                            com.dianping.nvnetwork.shark.monitor.a.a().a(new Runnable() { // from class: com.dianping.nvnetwork.shark.monitor.n.5
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr11;
                                    ChangeQuickRedirect changeQuickRedirect11;
                                    double ceil;
                                    Object[] objArr12 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect12 = a;
                                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "cee705efbbc61055dba938fe7f6cd7a1", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "cee705efbbc61055dba938fe7f6cd7a1");
                                        return;
                                    }
                                    o oVar = nVar4.h;
                                    String str3 = str2;
                                    Object[] objArr13 = {str3};
                                    ChangeQuickRedirect changeQuickRedirect13 = o.a;
                                    if (PatchProxy.isSupport(objArr13, oVar, changeQuickRedirect13, false, "080c82f141add98483839aa40632d1c4", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr13, oVar, changeQuickRedirect13, false, "080c82f141add98483839aa40632d1c4");
                                        return;
                                    }
                                    o.a aVar4 = new o.a(str3);
                                    oVar.a(aVar4);
                                    Object[] objArr14 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect14 = o.a;
                                    if (PatchProxy.isSupport(objArr14, oVar, changeQuickRedirect14, false, "8ab282217a278159d834600fffe6b154", 6917529027641081856L)) {
                                        ceil = ((Double) PatchProxy.accessDispatch(objArr14, oVar, changeQuickRedirect14, false, "8ab282217a278159d834600fffe6b154")).doubleValue();
                                    } else {
                                        if (oVar.d > 0 && oVar.b.size() >= oVar.c) {
                                            long a3 = o.a() - oVar.d;
                                            if (a3 > 0) {
                                                long d3 = oVar.d() - oVar.e;
                                                com.dianping.nvnetwork.util.g.a("ThroughputCalculate", "bytesReceived = " + d3);
                                                if (d3 >= (PatchProxy.isSupport(new Object[0], oVar, o.a, false, "3739676abe0a0532944b5002960fee27", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr11, oVar, changeQuickRedirect11, false, "3739676abe0a0532944b5002960fee27")).intValue() : d.a().h)) {
                                                    double d4 = ((d3 * 8) * 1.0d) / a3;
                                                    if (d4 < 1.5d) {
                                                        oVar.b.clear();
                                                        oVar.b();
                                                    } else {
                                                        ceil = Math.ceil(d4);
                                                    }
                                                }
                                            }
                                        }
                                        ceil = 0.0d;
                                    }
                                    if (ceil > 0.0d) {
                                        c a4 = c.a();
                                        Object[] objArr15 = {Double.valueOf(ceil)};
                                        ChangeQuickRedirect changeQuickRedirect15 = c.a;
                                        if (PatchProxy.isSupport(objArr15, a4, changeQuickRedirect15, false, "472998f11b998133a69c369f543c615b", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr15, a4, changeQuickRedirect15, false, "472998f11b998133a69c369f543c615b");
                                        } else if (ceil > 0.0d) {
                                            a4.d.a(new l(ceil));
                                            a4.m++;
                                            a4.b();
                                        }
                                        com.dianping.nvnetwork.util.g.a("ThroughputCalculate", "downstreamKbps = " + ceil + " Kbps");
                                        oVar.b();
                                        oVar.c();
                                    }
                                    if (oVar.b.remove(aVar4)) {
                                        if (oVar.b.size() < oVar.c) {
                                            oVar.b();
                                            return;
                                        }
                                        return;
                                    }
                                    oVar.c();
                                }
                            });
                        }
                    }
                    if (uVar != null) {
                        uVar.a(xVar);
                    }
                }

                @Override // com.dianping.nvnetwork.u
                public final void a(x xVar, com.dianping.nvtunnelkit.exception.d dVar) {
                    Object[] objArr2 = {xVar, dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51e04e123475488ac55adf3aca928a9d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51e04e123475488ac55adf3aca928a9d");
                    } else if (uVar != null) {
                        uVar.a(xVar, dVar);
                    }
                }

                @Override // com.dianping.nvnetwork.u
                public final void a(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c50ee492faca81729a1273445a07de29", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c50ee492faca81729a1273445a07de29");
                    } else if (uVar != null) {
                        uVar.a(th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.nvnetwork.tnold.m, com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.i
    public void a(com.dianping.nvnetwork.v vVar, c cVar) {
        Object[] objArr = {vVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32b6638edb9b0375469b2235c33ad988", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32b6638edb9b0375469b2235c33ad988");
            return;
        }
        super.a(vVar, (com.dianping.nvnetwork.v) cVar);
        String str = vVar.c;
        if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            return;
        }
        com.dianping.nvnetwork.c.a(str).b();
        com.dianping.nvnetwork.c.a(str).d();
        com.dianping.nvnetwork.c.a(str).a(cVar.q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.g
    /* renamed from: c */
    public c b(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress) {
        Object[] objArr = {aVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dbae20f4420a8a9bbee9e21a168fb59", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dbae20f4420a8a9bbee9e21a168fb59") : new c(aVar, socketAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.j
    public void a(com.dianping.nvnetwork.v vVar, c cVar, byte b) {
        Object[] objArr = {vVar, cVar, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b7c677941d21b307b7f73230335a41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b7c677941d21b307b7f73230335a41");
            return;
        }
        super.a((d) vVar, (com.dianping.nvnetwork.v) cVar, b);
        final String str = vVar.c;
        if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            return;
        }
        c.a a2 = com.dianping.nvnetwork.c.a(str);
        if (b != 0) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1a87dc97e47dda1149f2dd550f94f3ba", 6917529027641081856L)) {
            c.a aVar = (c.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1a87dc97e47dda1149f2dd550f94f3ba");
        } else {
            a2.e = System.nanoTime();
        }
        final n nVar = this.k;
        final long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr3 = {str, new Long(currentTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect3 = n.a;
        if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "65630af4a0354f4cad3e7fe4eedafc33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "65630af4a0354f4cad3e7fe4eedafc33");
        } else if (nVar.a()) {
            com.dianping.nvnetwork.shark.monitor.a.a().a(new Runnable() { // from class: com.dianping.nvnetwork.shark.monitor.n.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9302330d9b8855c302d65b4b3fdc0a4e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9302330d9b8855c302d65b4b3fdc0a4e");
                        return;
                    }
                    o oVar = nVar.h;
                    String str2 = str;
                    long j = currentTimeMillis;
                    Object[] objArr5 = {str2, new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect5 = o.a;
                    if (PatchProxy.isSupport(objArr5, oVar, changeQuickRedirect5, false, "23923b415ea1727cdf8389a99b9f8de5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, oVar, changeQuickRedirect5, false, "23923b415ea1727cdf8389a99b9f8de5");
                    } else if (j < oVar.f) {
                        oVar.b();
                    } else {
                        o.a aVar2 = new o.a(str2);
                        oVar.a(aVar2);
                        if (!oVar.b.contains(aVar2)) {
                            oVar.b.add(aVar2);
                            aVar2.c = o.a();
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = o.a;
                            if (PatchProxy.isSupport(objArr6, oVar, changeQuickRedirect6, false, "bb1fb4561828e2041265a9bd8ad68e09", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr6, oVar, changeQuickRedirect6, false, "bb1fb4561828e2041265a9bd8ad68e09");
                            } else if (oVar.b.size() > 128) {
                                oVar.b.clear();
                                oVar.b();
                            }
                        }
                        oVar.c();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.j
    public void a(com.dianping.nvnetwork.v vVar, c cVar, long j, int i, byte b) {
        Object[] objArr = {vVar, cVar, new Long(j), Integer.valueOf(i), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e42f7d8596ddd2e54accafcf7279f74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e42f7d8596ddd2e54accafcf7279f74");
            return;
        }
        super.a((d) vVar, (com.dianping.nvnetwork.v) cVar, j, i, b);
        String str = vVar.c;
        if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            return;
        }
        c.a a2 = com.dianping.nvnetwork.c.a(str);
        switch (b) {
            case 0:
                Object[] objArr2 = {new Long(j), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = c.a.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8720760e88fdea827176e2fe54a9b2f8", 6917529027641081856L)) {
                    c.a aVar = (c.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8720760e88fdea827176e2fe54a9b2f8");
                    return;
                }
                a2.f = System.nanoTime();
                a2.g = a2.f - a2.d;
                int i2 = com.dianping.nvnetwork.h.h().ay;
                if (i2 == 0) {
                    i2 = 1024;
                }
                a2.q = (int) (((i * 8) * (1000000000 / j)) / i2);
                return;
            case 1:
                Object[] objArr3 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "c9c81b36434b9ff30a1a0366ed49a5f6", 6917529027641081856L)) {
                    c.a aVar2 = (c.a) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "c9c81b36434b9ff30a1a0366ed49a5f6");
                    return;
                } else {
                    a2.i = j;
                    return;
                }
            case 2:
                return;
            case 3:
                Object[] objArr4 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect4 = c.a.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "33a334b59293f224f05e251467db4e19", 6917529027641081856L)) {
                    c.a aVar3 = (c.a) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "33a334b59293f224f05e251467db4e19");
                    return;
                } else {
                    a2.h = j;
                    return;
                }
            default:
                return;
        }
    }
}
