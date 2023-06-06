package com.dianping.sdk.pike.service;

import android.content.Context;
import com.dianping.nvnetwork.v;
import com.dianping.nvnetwork.w;
import com.dianping.nvnetwork.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n extends com.dianping.nvnetwork.tnold.c<d> {
    public static ChangeQuickRedirect a;
    a f;
    Map<com.dianping.sdk.pike.j, com.dianping.nvnetwork.tnold.p> g;
    private long k;
    private long l;
    private boolean m;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(v vVar, com.dianping.nvtunnelkit.exception.d dVar);

        void a(v vVar, d dVar);

        void a(w wVar);

        void a(Throwable th);
    }

    public static /* synthetic */ void a(n nVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "dc859be4f6902ca007baf67246b5f7c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "dc859be4f6902ca007baf67246b5f7c4");
            return;
        }
        nVar.l = com.dianping.sdk.pike.util.g.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "1940f3d89b020cb76239a64b10c93d23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "1940f3d89b020cb76239a64b10c93d23");
            return;
        }
        try {
            if (nVar.k >= 0 && nVar.l >= 0 && !nVar.m) {
                long j = nVar.l - nVar.k;
                if (j < 0 || j > com.dianping.sdk.pike.f.t) {
                    return;
                }
                com.dianping.sdk.pike.i.a("PikeTunnel", "tunnel ready time ", String.valueOf(j), "ms");
                int i = (int) j;
                com.dianping.sdk.pike.util.f.a("pike_tunnel_ready_time", 200, 0, 0, i, "", "", com.dianping.sdk.pike.util.a.a(0, 0, i));
                nVar.k = -1L;
                nVar.l = -1L;
                nVar.m = true;
            }
        } catch (Exception e) {
            com.dianping.sdk.pike.i.a("PikeTunnel", "upload tunnel ready time err", e);
        }
    }

    @Override // com.dianping.nvtunnelkit.codec.a.InterfaceC0104a
    public final /* synthetic */ com.dianping.nvtunnelkit.codec.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e19266975fa84f46432a0a38f18107", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e19266975fa84f46432a0a38f18107") : new h(this);
    }

    @Override // com.dianping.nvtunnelkit.codec.b.a
    public final /* synthetic */ com.dianping.nvtunnelkit.codec.b h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e7b14c61844659f660460518c2f4c8", RobustBitConfig.DEFAULT_VALUE) ? (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e7b14c61844659f660460518c2f4c8") : new p(this);
    }

    public n(Context context, y yVar, com.dianping.nvtunnelkit.kit.v vVar, com.dianping.nvtunnelkit.kit.a aVar) {
        super(context, yVar, vVar, aVar);
        Object[] objArr = {context, yVar, vVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6463c8d2e6539c341dd29498084a937", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6463c8d2e6539c341dd29498084a937");
            return;
        }
        this.g = new ConcurrentHashMap();
        this.k = -1L;
        this.l = -1L;
        a(new com.dianping.sdk.pike.j() { // from class: com.dianping.sdk.pike.service.n.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.sdk.pike.j
            public final void b() {
            }

            @Override // com.dianping.sdk.pike.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e1b7e513ca8957e452593e939df33bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e1b7e513ca8957e452593e939df33bf");
                } else {
                    n.a(n.this);
                }
            }
        });
    }

    public final void a(final com.dianping.sdk.pike.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c3bfd92d27a6384018dc6d50a17842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c3bfd92d27a6384018dc6d50a17842");
        } else if (jVar == null) {
        } else {
            com.dianping.nvnetwork.tnold.p pVar = new com.dianping.nvnetwork.tnold.p() { // from class: com.dianping.sdk.pike.service.n.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.nvnetwork.tnold.p
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c30a170643b82887c66a0bfdc4970b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c30a170643b82887c66a0bfdc4970b1");
                    } else {
                        jVar.a();
                    }
                }

                @Override // com.dianping.nvnetwork.tnold.p
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75ead51eeb9489f482ec3784efbcb93b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75ead51eeb9489f482ec3784efbcb93b");
                    } else {
                        jVar.b();
                    }
                }
            };
            this.g.put(jVar, pVar);
            a(pVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.n
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6521ac0c00ac380fe263a303643bf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6521ac0c00ac380fe263a303643bf4");
            return;
        }
        super.f();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1c8bd20e5c4d7c312e10d97adebdb90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1c8bd20e5c4d7c312e10d97adebdb90");
        } else if (this.k >= 0 || !com.dianping.nvtunnelkit.utils.c.a() || b()) {
        } else {
            this.k = com.dianping.sdk.pike.util.g.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.g
    /* renamed from: c */
    public d b(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress) {
        Object[] objArr = {aVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ef04b8421d7789f8dcd7e27e9c37bb8", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ef04b8421d7789f8dcd7e27e9c37bb8") : new d(aVar, socketAddress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.i
    public void a(v vVar, d dVar) {
        Object[] objArr = {vVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87bff5566e3d0e2ccce6d9c13d62c9cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87bff5566e3d0e2ccce6d9c13d62c9cf");
        } else if (this.f != null) {
            this.f.a(vVar, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.l
    public void a(w wVar, d dVar, int i) {
        Object[] objArr = {wVar, dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b658f84b0a8ae1c8775f50ae9979426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b658f84b0a8ae1c8775f50ae9979426");
        } else if (this.f != null) {
            this.f.a(wVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.l
    /* renamed from: b */
    public final void a(v vVar, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {vVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9e15ff3b233253debbf571b9ca4752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9e15ff3b233253debbf571b9ca4752");
        } else if (this.f != null) {
            this.f.a(vVar, dVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.o, com.dianping.nvtunnelkit.kit.l
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35015af437d8701fd022b72c03f47b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35015af437d8701fd022b72c03f47b55");
        } else if (this.f != null) {
            this.f.a(th);
        }
    }
}
