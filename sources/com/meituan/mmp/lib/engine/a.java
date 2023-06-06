package com.meituan.mmp.lib.engine;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.mmp.a;
import com.meituan.mmp.lib.engine.b;
import com.meituan.mmp.lib.engine.f;
import com.meituan.mmp.lib.remote.RemoteService;
import com.meituan.mmp.lib.service.IServiceEngine;
import com.meituan.mmp.lib.service.b;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final m b;
    com.meituan.mmp.lib.a c;
    public final AtomicInteger d;
    public final List<c> e;
    private final com.meituan.mmp.lib.web.f f;
    private final Runnable g;
    private final Handler h;

    public static /* synthetic */ void a(a aVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "135d823b5d184df7ff984449fd20abe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "135d823b5d184df7ff984449fd20abe4");
            return;
        }
        aVar.f();
        if (aVar.b.t) {
            com.meituan.mmp.lib.trace.b.c("AppEngine", "already destroyed: " + aVar.b.b);
            return;
        }
        aVar.b.t = true;
        a.c cVar = com.meituan.mmp.a.c;
        Runnable runnable = aVar.g;
        Object[] objArr2 = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = a.c.b;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4ccf5af05744bb62541f34724d628cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4ccf5af05744bb62541f34724d628cdf");
        } else if (runnable != null) {
            cVar.a(a.c.C0391a.b).remove(runnable);
        }
        aVar.b.g.c();
        d dVar = aVar.b.i;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "832708a4f0d1ed308e9e42fc29fcfe4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "832708a4f0d1ed308e9e42fc29fcfe4b");
        } else {
            dVar.f = true;
            dVar.a();
        }
        final com.meituan.mmp.lib.config.f fVar = aVar.b.j;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.config.f.a;
        if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "bb79546461449324dbefc77b91331e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "bb79546461449324dbefc77b91331e7e");
        } else if (fVar.d != null) {
            com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.config.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a11837917a39124d5f4d4db483134525", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a11837917a39124d5f4d4db483134525");
                    } else if (fVar.d != null) {
                        fVar.d.a();
                        fVar.d = null;
                    }
                }
            });
        }
        j.a(aVar.b);
        aVar.j();
        com.meituan.mmp.lib.pip.e.c(aVar.b.b);
        aVar.b.l.b();
        e eVar = aVar.b.h;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = e.a;
        if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "d03fca324b0d5154745c1ce609480e0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "d03fca324b0d5154745c1ce609480e0a");
        } else if (eVar.c != null) {
            eVar.c.release();
            if (eVar.c instanceof com.meituan.mmp.lib.service.c) {
                com.meituan.mmp.lib.p.b(eVar.b == null ? null : eVar.b.b);
            }
        }
        com.meituan.mmp.lib.t.b(aVar.b.b, aVar.b.g);
        com.meituan.mmp.lib.w.a().d.clear();
        RemoteService.a();
        com.meituan.mmp.lib.mp.ipc.g.a(aVar.b.b);
        if (z) {
            final String str = aVar.b.b;
            Object[] objArr6 = {str};
            ChangeQuickRedirect changeQuickRedirect6 = r.a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "3553371e45346ada89e29cec14e7a1de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "3553371e45346ada89e29cec14e7a1de");
            } else if (MMPHornPreloadConfig.a().d.enableRePreloadAppWhenNormalDestroy) {
                com.meituan.mmp.lib.executor.a.g(new Runnable() { // from class: com.meituan.mmp.lib.engine.r.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "46dc0d7a71e1f28900e20389130faceb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "46dc0d7a71e1f28900e20389130faceb");
                            return;
                        }
                        bb.b("引擎正常销毁，尝试再次预加载", new Object[0]);
                        r.a("rePreloadWhenAppNormalDestroy", str);
                    }
                });
            }
        }
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad9d7a54b00ed2f14d7655ecf4b4619", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad9d7a54b00ed2f14d7655ecf4b4619");
            return;
        }
        this.f = new com.meituan.mmp.lib.web.f() { // from class: com.meituan.mmp.lib.engine.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.web.f
            public final void a(final Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a359cb6c1d038f2b92a5b971ffaaa2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a359cb6c1d038f2b92a5b971ffaaa2c");
                } else {
                    com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.engine.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37343e26af58784d1ab288bc974f3007", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37343e26af58784d1ab288bc974f3007");
                            } else {
                                a.this.b.g.a(exc);
                            }
                        }
                    });
                }
            }
        };
        this.g = new Runnable() { // from class: com.meituan.mmp.lib.engine.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da7fa031c59ae8b965026b2139dcc9da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da7fa031c59ae8b965026b2139dcc9da");
                    return;
                }
                IServiceEngine iServiceEngine = a.this.b.h.c;
                if ((iServiceEngine instanceof com.meituan.mmp.lib.service.b) && com.meituan.mmp.lib.config.b.t()) {
                    ((com.meituan.mmp.lib.service.b) iServiceEngine).a();
                }
            }
        };
        this.d = new AtomicInteger(0);
        this.h = new Handler(Looper.getMainLooper());
        this.e = new LinkedList();
        this.b = new m(str);
    }

    private com.meituan.mmp.lib.config.a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8487c7d948dd7141aee425494b81484c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.config.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8487c7d948dd7141aee425494b81484c");
        }
        com.meituan.mmp.lib.config.a aVar = new com.meituan.mmp.lib.config.a(this.b);
        aVar.h = new com.meituan.mmp.lib.trace.h(MMPEnvHelper.getContext(), this.b.b);
        return aVar;
    }

    public final synchronized h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff7ee7c362ba3ff326fc52210f817b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff7ee7c362ba3ff326fc52210f817b8");
        }
        com.meituan.mmp.lib.config.a i = i();
        return new h(MMPEnvHelper.getContext(), i, i.h);
    }

    public final synchronized b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e146a6ea0f5cf5b67f779e65174278", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e146a6ea0f5cf5b67f779e65174278");
        }
        this.b.d = i();
        this.b.e = this.b.d.h;
        this.b.f = this;
        this.b.g = new b(MMPEnvHelper.getContext(), this.b);
        this.b.c = this.b.g.g();
        this.b.j = new com.meituan.mmp.lib.config.f(this.b);
        this.b.p = new k(this.b);
        this.b.h = new e(this.b, this.b.p, this.f);
        com.meituan.mmp.lib.api.update.a m = this.b.g.m();
        m.f = this.b.p;
        m.g = this.b.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.update.a.a;
        if (PatchProxy.isSupport(objArr2, m, changeQuickRedirect2, false, "7f255fe719262d2170ce534f629c8be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, m, changeQuickRedirect2, false, "7f255fe719262d2170ce534f629c8be9");
        } else if (m.f != null) {
            com.meituan.mmp.lib.trace.b.b("backgroundUpdateManager", "backgroundUpdateStatusReplay");
            if (m.d.a(f.c.APP_PROP_UPDATED)) {
                m.a(m.e);
            }
            if (m.d.a(f.c.ALL_PACKAGE_PREPARED)) {
                m.a((MMPAppProp) null, (List<MMPPackageInfo>) null);
            }
            if (m.d == f.c.FAILED) {
                m.a(null, "backgroundUpdateFailReplay", null);
            }
            m.d = f.c.INITIAL;
        }
        m mVar = this.b;
        m mVar2 = this.b;
        k kVar = this.b.p;
        b bVar = this.b.g;
        bVar.getClass();
        mVar.l = new com.meituan.mmp.lib.api.h(mVar2, kVar, new b.a());
        this.b.h.d = this.b.l;
        this.b.i = new d(this.b);
        this.b.i.e = this.f;
        this.b.k = new u(this.b.d, this.b.p);
        this.b.o = new com.meituan.mmp.lib.api.r(this.b);
        a.c cVar = com.meituan.mmp.a.c;
        Runnable runnable = this.g;
        Object[] objArr3 = {runnable};
        ChangeQuickRedirect changeQuickRedirect3 = a.c.b;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "fdaf5586360467b68094620613de7b37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "fdaf5586360467b68094620613de7b37");
        } else if (runnable != null) {
            cVar.a(a.c.C0391a.b).add(runnable);
        }
        return this.b.g;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af729ae6fc8ce822cfbfc6c3956d0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af729ae6fc8ce822cfbfc6c3956d0e7");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("AppEngine", "onServiceReady");
        this.b.e.b.a("service.load.file");
        this.b.e.b.a("service.load");
        this.b.e.c("mmp.launch.point.service.ready");
        this.b.e.b("mmp.launch.duration.load.service");
        this.b.e.b("mmp.launch.duration.app.route.to.service.ready");
        this.b.v = true;
        final b bVar = this.b.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "fa0776e247c13ba81a8e1c204671d1bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "fa0776e247c13ba81a8e1c204671d1bb");
        } else {
            bVar.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eb295a3041a39b99721ed893d416cffa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eb295a3041a39b99721ed893d416cffa");
                        return;
                    }
                    bVar.q.a();
                    q c = o.c(bVar.h);
                    if (c != null) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = q.a;
                        if (PatchProxy.isSupport(objArr4, c, changeQuickRedirect4, false, "43688ac18ede79003259db488ff9f53c", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, c, changeQuickRedirect4, false, "43688ac18ede79003259db488ff9f53c")).booleanValue();
                        } else if ("preloadAll".equals(c.b) || "preloadService".equals(c.b)) {
                            z = true;
                        }
                        if (z) {
                            com.meituan.mmp.lib.trace.a.b(bVar.h, "preloadJSC");
                        }
                    }
                    o.c();
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1f14744e85b10dae000fec7a18ba050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1f14744e85b10dae000fec7a18ba050");
            return;
        }
        Iterator<c> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a();
            synchronized (this.e) {
                it.remove();
            }
        }
    }

    public final void a(com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c6b65293a829e412e6c3706c714623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c6b65293a829e412e6c3706c714623");
        } else {
            b(aVar);
        }
    }

    public void b(com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6decb578d513adc805fe13be621d305a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6decb578d513adc805fe13be621d305a");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("AppEngine", "set top container: " + aVar);
        this.c = aVar;
        this.b.r = aVar;
        this.b.q = aVar.y();
        this.b.l.a(aVar);
    }

    public final void c(com.meituan.mmp.lib.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52966e68bc86b298a39c2ed291eb9a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52966e68bc86b298a39c2ed291eb9a71");
            return;
        }
        if (this.c != null && this.c == aVar) {
            j();
        }
        this.b.l.b(aVar);
        d(aVar);
        this.b.s.remove(aVar);
        for (com.meituan.mmp.lib.a aVar2 : this.b.s) {
            if (!aVar2.M && !aVar2.h()) {
                a(aVar2);
                com.meituan.mmp.lib.trace.b.b("AppEngine", String.format("find next resumed container after current ContainerDestroy, controller:%s", aVar));
                return;
            }
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534e19ff0287272bb882949c3c9d7997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534e19ff0287272bb882949c3c9d7997");
            return;
        }
        this.c = null;
        this.b.r = null;
        this.b.q = null;
        com.meituan.mmp.lib.trace.b.b("AppEngine", "already releaseActivityRef");
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812c08bd97f600ece74d564427a781e0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812c08bd97f600ece74d564427a781e0")).intValue() : this.d.get();
    }

    private void d(com.meituan.mmp.lib.a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd663ec7783c14b6e082d5eb25a45a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd663ec7783c14b6e082d5eb25a45a2");
        } else if (this.b.g.l().equals(f.c.FAILED) || !this.b.v) {
            g();
            b.a.b("AppEngine", "cannot be reused by state");
        } else if (this.b.g.l().equals(f.c.DESTROYED)) {
            b.a.c("AppEngine", "already destroyed when release");
        } else if (this.d.get() == 0) {
            b.a.c("AppEngine", "released when retain count is already 0");
            com.meituan.mmp.lib.trace.b.a(new Exception());
        } else if (this.d.decrementAndGet() != 0) {
        } else {
            final boolean z2 = !aVar.b();
            if (!aVar.u()) {
                z2 = false;
            }
            if (z2 && this.b.h.a()) {
                z2 = false;
            }
            if (z2 && !this.b.d.e()) {
                z = (!com.meituan.mmp.lib.config.b.i() || com.meituan.mmp.main.fusion.c.a(this.b.b)) ? false : false;
                com.meituan.mmp.lib.trace.b.b("AppEngine", "standard mode keep alive: " + z);
                if (!z) {
                    z2 = false;
                }
            }
            IServiceEngine iServiceEngine = this.b.h.c;
            if (iServiceEngine instanceof com.meituan.mmp.lib.service.b) {
                ((com.meituan.mmp.lib.service.b) iServiceEngine).a(new b.a() { // from class: com.meituan.mmp.lib.engine.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.service.b.a
                    public final void a(long j) {
                        Object[] objArr2 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "994634206432f72cd13a59b6222b6ecd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "994634206432f72cd13a59b6222b6ecd");
                        } else if (a.this.d.get() == 0) {
                            long j2 = j / 1024;
                            if (com.meituan.mmp.lib.config.b.y() && j2 > com.meituan.mmp.lib.config.b.A()) {
                                a.this.a(false);
                                b.a.b("AppEngine", "MMP JSEngine memory heap size too large: " + j2 + " MB, AppEngine is released");
                                return;
                            }
                            a.this.a(z2);
                        }
                    }
                });
            } else {
                a(z2);
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e601cba2f4c907f2d7430f64e57c602b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e601cba2f4c907f2d7430f64e57c602b");
        } else if (this.d.get() == 0) {
            g();
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "340279ff6764fb4a5fc6168492bd8c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "340279ff6764fb4a5fc6168492bd8c69");
        } else {
            this.h.removeCallbacksAndMessages(null);
        }
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c57fdc7e097617be02bc64c6ae2ce85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c57fdc7e097617be02bc64c6ae2ce85");
        } else if (z) {
            k();
        } else {
            b.a.a("AppEngine", "normal destroy app engine and keep alive not allowed");
            this.h.post(new Runnable() { // from class: com.meituan.mmp.lib.engine.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c16029ce331ebd67f62fc6ea496b167", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c16029ce331ebd67f62fc6ea496b167");
                    } else {
                        a.a(a.this, com.meituan.mmp.lib.config.b.z());
                    }
                }
            });
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e68dbc78847589c8ba604f716655306f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e68dbc78847589c8ba604f716655306f");
        } else {
            this.h.post(new Runnable() { // from class: com.meituan.mmp.lib.engine.a.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "579329320b09432ab5bce14a8514db86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "579329320b09432ab5bce14a8514db86");
                    } else {
                        a.a(a.this, false);
                    }
                }
            });
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d085743c6d3e48c080264e060a226f5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d085743c6d3e48c080264e060a226f5b");
            return;
        }
        j.b(this.b);
        this.b.u = true;
        final long p = com.meituan.mmp.lib.config.b.p();
        this.h.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.engine.a.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1987dad19514235dd0bf52e09a553f38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1987dad19514235dd0bf52e09a553f38");
                    return;
                }
                b.a.a("AppEngine", "normal destroy app engine by keep alive time out: " + (p / 1000));
                bb.b("保活时间到，销毁引擎：" + a.this.b.b, new Object[0]);
                a.a(a.this, true);
            }
        }, p);
        this.b.e.a();
        com.meituan.mmp.lib.w.a().d.clear();
        if (!MMPHornPreloadConfig.a().d.preloadPageWhenKeepAlive || p <= 0) {
            return;
        }
        com.meituan.mmp.lib.executor.a.d(new Runnable() { // from class: com.meituan.mmp.lib.engine.a.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e2744c1fe22273f30a4cf6b9f032a4a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e2744c1fe22273f30a4cf6b9f032a4a");
                } else if (a.this.b.g.l().a() && a.this.d.get() == 0) {
                    com.meituan.mmp.lib.trace.b.b("AppEngine", "re-preloadPage when engine enter keep alive");
                    final Context context = MMPEnvHelper.getContext();
                    if (!MMPHornPreloadConfig.a().b(a.this.b.b)) {
                        a.this.b.i.a(context, (com.meituan.mmp.lib.trace.h) null);
                        com.meituan.mmp.lib.executor.a.d(new Runnable() { // from class: com.meituan.mmp.lib.engine.a.7.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "824a31ee8dec6ffc9428306a043336ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "824a31ee8dec6ffc9428306a043336ca");
                                } else {
                                    a.this.b.i.a(context, null, null);
                                }
                            }
                        }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                        return;
                    }
                    a.this.b.i.a(context, null, null);
                }
            }
        }, 1000L);
    }

    public final void a(String str, Context context, boolean z) {
        Object[] objArr = {str, context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1a52d12accd118c039b539c7d22bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1a52d12accd118c039b539c7d22bfd");
        } else if (TextUtils.isEmpty(str) || com.meituan.mmp.lib.devtools.a.a() == null) {
        } else {
            this.b.m = com.meituan.mmp.lib.devtools.a.a().a(context, this.b, str, z);
        }
    }

    public final u h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33e7b1be3dae93d805923f66700858e", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33e7b1be3dae93d805923f66700858e");
        }
        if (this.b.k.a()) {
            this.b.k.cancel();
        }
        this.b.k = new u(this.b.d, this.b.p);
        return this.b.k;
    }
}
