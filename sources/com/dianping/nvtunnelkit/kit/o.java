package com.dianping.nvtunnelkit.kit;

import com.dianping.nvtunnelkit.codec.a;
import com.dianping.nvtunnelkit.codec.b;
import com.dianping.nvtunnelkit.core.b;
import com.dianping.nvtunnelkit.kit.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.SocketAddress;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class o<C extends w, S, R, S2 extends com.dianping.nvtunnelkit.core.b<? super S2>, R2> implements a.InterfaceC0104a<C, S, S2>, b.a<C, R2, R>, p<C, S, R> {
    public static ChangeQuickRedirect h;
    private i<C, S> a;
    private j<C, S> b;
    private l<C, S, R> c;
    private h<C> d;
    private g<C> e;
    private m f;
    protected p<C, ? super S2, R2> i;
    protected c<C, S, R, ? super S2, R2> j;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a<S2, S> {
        S2 a(S s);
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ Object a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6da22ae1bf830ae558df8b935ddd56bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6da22ae1bf830ae558df8b935ddd56bf");
        }
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8963a288a01cf1c06a420d69d419a076", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8963a288a01cf1c06a420d69d419a076");
        }
        if (this.a != null) {
            return this.a.a(obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
        a((o<C, S, R, S2, R2>) ((w) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.h
    public final /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar, Throwable th) {
        w wVar = (w) cVar;
        Object[] objArr = {wVar, th};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62fb610a11221da90adf3541a365e868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62fb610a11221da90adf3541a365e868");
            return;
        }
        Object[] objArr2 = {wVar, th};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ef88eaef478661fe41019f5ccfc7119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ef88eaef478661fe41019f5ccfc7119");
        } else if (this.d != null) {
            this.d.a(wVar, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        a((o<C, S, R, S2, R2>) obj, (Object) ((w) obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, byte b) {
        a((o<C, S, R, S2, R2>) obj, (Object) ((w) obj2), b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, int i) {
        a((o<C, S, R, S2, R2>) obj, (Object) ((w) obj2), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, long j, int i, byte b) {
        a((o<C, S, R, S2, R2>) obj, (Object) ((w) obj2), j, i, b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void b(com.dianping.nvtunnelkit.conn.c cVar) {
        b((o<C, S, R, S2, R2>) ((w) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return b((o<C, S, R, S2, R2>) obj, (Object) ((w) obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ void c(Object obj, Object obj2) {
        w wVar = (w) obj2;
        Object[] objArr = {obj, wVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3e7e93dc876aa49ecebc0873ef1bcc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3e7e93dc876aa49ecebc0873ef1bcc6");
            return;
        }
        Object[] objArr2 = {obj, wVar};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8290d8fb159a00144c4da9a5449f7a8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8290d8fb159a00144c4da9a5449f7a8a");
        } else if (this.a != null) {
            this.a.c(obj, wVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.k
    public final /* synthetic */ void d(Object obj, Object obj2) {
        w wVar = (w) obj2;
        Object[] objArr = {obj, wVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b0ed56027807df21176934bba2e286e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b0ed56027807df21176934bba2e286e");
        } else if (this.j != null) {
            ((c<C, S, R, ? super S2, R2>) this.j).d(obj, wVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.g.a
    public final void a(g<C> gVar) {
        this.e = gVar;
    }

    @Override // com.dianping.nvtunnelkit.kit.h.a
    public final void a(h<C> hVar) {
        this.d = hVar;
    }

    public void b(S s) {
        Object[] objArr = {s};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d41bc6fc1cc13029bb85678ddf8e9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d41bc6fc1cc13029bb85678ddf8e9c");
            return;
        }
        Object[] objArr2 = {s};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e18b626166aac4c9bfea371054e82ba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e18b626166aac4c9bfea371054e82ba2");
        } else if (this.a != null) {
            this.a.b(s);
        }
    }

    public boolean b(S s, C c) {
        Object[] objArr = {s, c};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19acdf88d1f42f856427b680fdcd9e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19acdf88d1f42f856427b680fdcd9e1")).booleanValue();
        }
        Object[] objArr2 = {s, c};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59e27c3c8a79aa5f50c002b86ee51c2a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59e27c3c8a79aa5f50c002b86ee51c2a")).booleanValue() : this.a != null && this.a.b(s, c);
    }

    public void a(S s, C c) {
        Object[] objArr = {s, c};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad73e90b3cd96f99aba97a3c6849045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad73e90b3cd96f99aba97a3c6849045");
            return;
        }
        Object[] objArr2 = {s, c};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98ae0c2769074831c31ae31b073635f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98ae0c2769074831c31ae31b073635f1");
        } else if (this.a != null) {
            this.a.a(s, c);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final void a_(S s, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {s, dVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b30738e703cc0d2801be695ee2aa98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b30738e703cc0d2801be695ee2aa98");
            return;
        }
        Object[] objArr2 = {s, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e4c6d37b024b3ab7e6bccae65f7e3c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e4c6d37b024b3ab7e6bccae65f7e3c0");
        } else if (this.a != null) {
            this.a.a_(s, dVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final void a_(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ccc207fae7c42b72258a3d6b2118a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ccc207fae7c42b72258a3d6b2118a3");
            return;
        }
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b5bc97f8e5c7f6bcc735266035586be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b5bc97f8e5c7f6bcc735266035586be");
        } else if (this.a != null) {
            this.a.a_(th);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i.a
    public final void a(i<C, S> iVar) {
        this.a = iVar;
    }

    @Override // com.dianping.nvtunnelkit.kit.l.a
    public final void a(l<C, S, R> lVar) {
        this.c = lVar;
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae1a5168b2c347afc03145d02ac24c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae1a5168b2c347afc03145d02ac24c4");
        } else {
            this.i.f();
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9b178204aa550253ee483dd6dd0f4b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9b178204aa550253ee483dd6dd0f4b")).booleanValue() : this.i.i();
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final com.dianping.nvtunnelkit.core.e<C> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef791d5c890ecedd0126b1fac1cc89c6", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.nvtunnelkit.core.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef791d5c890ecedd0126b1fac1cc89c6") : this.i.a();
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final v t_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1980150bdded1dbe4d259e9c7c079c", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1980150bdded1dbe4d259e9c7c079c") : this.i.t_();
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c61add846c6a33ae1b2400c4c3a41d7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c61add846c6a33ae1b2400c4c3a41d7")).booleanValue() : this.i.j();
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    /* renamed from: c */
    public final void d(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a8dbcbba6caa89ad9fe891486080a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a8dbcbba6caa89ad9fe891486080a1");
        } else {
            this.i.d(c);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80f7d6a1ece90cb7a609b62543c8552c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80f7d6a1ece90cb7a609b62543c8552c");
        } else {
            this.i.k();
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.g
    /* renamed from: a */
    public C b(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress) {
        Object[] objArr = {aVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9d38b8ab5f15fa78a18d2df94dff60", RobustBitConfig.DEFAULT_VALUE)) {
            return (C) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9d38b8ab5f15fa78a18d2df94dff60");
        }
        Object[] objArr2 = {aVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "173493ecb92983008642c75b3c1f8bcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (C) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "173493ecb92983008642c75b3c1f8bcc");
        }
        if (this.e != null) {
            return this.e.b(aVar, socketAddress);
        }
        return null;
    }

    public void b(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ec82fa310d474e80c4631fa5d3abfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ec82fa310d474e80c4631fa5d3abfd");
            return;
        }
        if (this.j != null) {
            c<C, S, R, ? super S2, R2> cVar = this.j;
            Object[] objArr2 = {c};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9f3e18445b2bbace96a880356ffe7a31", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9f3e18445b2bbace96a880356ffe7a31");
            } else {
                com.dianping.nvtunnelkit.logger.b.a("tl-luoheng", cVar.a() + ", onConnectionOpened");
                b<C, S, ? super S2, R2, R> bVar = new b<>(cVar.b, cVar.c);
                bVar.b(c);
                cVar.g.put(c, bVar);
            }
        }
        Object[] objArr3 = {c};
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e669dc840b4d056680c692b94eed8031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e669dc840b4d056680c692b94eed8031");
        } else if (this.d != null) {
            this.d.b(c);
        }
    }

    public void a(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1878949d1a266c62300b7fbf60f38070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1878949d1a266c62300b7fbf60f38070");
            return;
        }
        if (this.j != null) {
            c<C, S, R, ? super S2, R2> cVar = this.j;
            Object[] objArr2 = {c};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "bffa6b514e940503f108761fd11f914d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "bffa6b514e940503f108761fd11f914d");
            } else {
                b<C, S, ? super S2, R2, R> remove = cVar.g.remove(c);
                if (remove != null) {
                    remove.a(c);
                }
            }
        }
        Object[] objArr3 = {c};
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d8040a067fa44b16362036ebaafa46d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d8040a067fa44b16362036ebaafa46d6");
        } else if (this.d != null) {
            this.d.a(c);
        }
    }

    public void a_(S s) {
        Object[] objArr = {s};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60429595c20916aa0688ae5e73f1ce83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60429595c20916aa0688ae5e73f1ce83");
        } else if (this.j != null) {
            c<C, S, R, ? super S2, R2> cVar = this.j;
            Object[] objArr2 = {s};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "ccb6e6258b97a29414dcd43f043cf1e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "ccb6e6258b97a29414dcd43f043cf1e4");
            } else {
                cVar.d(s, null);
            }
        }
    }

    public void cancel(S s) {
        Object[] objArr = {s};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b598dac197f802a1dd57faffcf75a69f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b598dac197f802a1dd57faffcf75a69f");
        } else if (this.j != null) {
            this.j.cancel(s);
        }
    }

    public void a(R r, C c, int i) {
        Object[] objArr = {r, c, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "196c562eb0fc695692b9c68f588e0f7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "196c562eb0fc695692b9c68f588e0f7d");
            return;
        }
        Object[] objArr2 = {r, c, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fd2b156aec89b5ecb501cd4c3de97ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fd2b156aec89b5ecb501cd4c3de97ba");
        } else if (this.c != null) {
            this.c.a(r, c, i);
        }
    }

    public void a(S s, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {s, dVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca8c6e05d87f584dd506dd7ced04a4b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca8c6e05d87f584dd506dd7ced04a4b7");
            return;
        }
        Object[] objArr2 = {s, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fc12b06ea0c3217e3352d0d85647594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fc12b06ea0c3217e3352d0d85647594");
        } else if (this.c != null) {
            this.c.a(s, dVar);
        }
    }

    public void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2152dba74b88f6a6d036d52956abce36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2152dba74b88f6a6d036d52956abce36");
            return;
        }
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af8696a5e285828c8bd750be21fbf7dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af8696a5e285828c8bd750be21fbf7dc");
        } else if (this.c != null) {
            this.c.a(th);
        }
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e9805431b1c8382dda15b5bbded724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e9805431b1c8382dda15b5bbded724");
            return;
        }
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21d9dc16628fe9a950be63aac26b7216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21d9dc16628fe9a950be63aac26b7216");
        } else if (this.f != null) {
            this.f.a(z);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.m.a
    public final void a(m mVar) {
        this.f = mVar;
    }

    public void a(S s, C c, byte b) {
        Object[] objArr = {s, c, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "769775a70b67e0206d359a2c136d9b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "769775a70b67e0206d359a2c136d9b47");
            return;
        }
        Object[] objArr2 = {s, c, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa8e4069738d075d05e056d3dd75e6c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa8e4069738d075d05e056d3dd75e6c3");
        } else if (this.b != null) {
            this.b.a(s, c, b);
        }
    }

    public void a(S s, C c, long j, int i, byte b) {
        Object[] objArr = {s, c, new Long(j), Integer.valueOf(i), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b866af90b56e966453d0352fc2eca24e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b866af90b56e966453d0352fc2eca24e");
            return;
        }
        Object[] objArr2 = {s, c, new Long(j), Integer.valueOf(i), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cbeb1c49f6219867b5312a2a41ee109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cbeb1c49f6219867b5312a2a41ee109");
        } else if (this.b != null) {
            this.b.a(s, c, j, i, b);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.j.a
    public final void a(j<C, S> jVar) {
        this.b = jVar;
    }

    public final d<C> l() {
        p<C, ? super S2, R2> pVar = this.i;
        while (pVar instanceof o) {
            pVar = ((o) pVar).i;
        }
        if (pVar instanceof d) {
            return (d) pVar;
        }
        return null;
    }
}
