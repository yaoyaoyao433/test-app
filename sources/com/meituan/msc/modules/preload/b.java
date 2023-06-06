package com.meituan.msc.modules.preload;

import android.text.TextUtils;
import com.meituan.msc.modules.container.o;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.engine.r;
import com.meituan.msc.modules.engine.s;
import com.meituan.msc.modules.preload.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.msc.modules.preload.executor.c {
    public static ChangeQuickRedirect a;
    final com.meituan.msc.common.support.java.util.concurrent.a<h> b;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final boolean k;
    private final com.meituan.msc.common.framework.a<h> l;

    public b(String str, String str2, String str3, String str4, boolean z, com.meituan.msc.common.framework.a<h> aVar) {
        super("BizPackagePreloadTask:" + str2);
        Object[] objArr = {str, str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf0d6d590e32a897f7f84a054c5c62f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf0d6d590e32a897f7f84a054c5c62f");
            return;
        }
        this.b = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = z;
        this.l = aVar;
    }

    @Override // com.meituan.msc.modules.preload.executor.c
    public final void a(com.meituan.msc.modules.preload.executor.d dVar) {
        com.meituan.msc.common.support.java.util.concurrent.a<Void> a2;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4875a5341ae276e7dc62eefd82ff2de1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4875a5341ae276e7dc62eefd82ff2de1");
            return;
        }
        com.meituan.msc.util.perf.g gVar = new com.meituan.msc.util.perf.g("preload_biz", ErrorCode.ERROR_TYPE_B);
        com.meituan.msc.modules.reporter.g.d("BizPackagePreloadTask", "[MSC][Preload]preloadBiz engine start:", this.h);
        if (o.b.a() && !MSCHornRollbackConfig.d().c().isRollbackPendingPreloadBiz && !MSCHornPreloadConfig.f(this.h)) {
            d.a aVar = new d.a(this.h, this.j, this.l);
            d a3 = d.a();
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "c52dc92fff825d3aee7482e305271e7e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "c52dc92fff825d3aee7482e305271e7e");
            } else {
                com.meituan.msc.modules.reporter.g.d("PendingBizPreloadTasksManager", "addBizPreloadPending", aVar);
                a3.b.add(aVar);
            }
            this.b.d((com.meituan.msc.common.support.java.util.concurrent.a<h>) null);
            return;
        }
        final h c = q.c();
        if (!TextUtils.isEmpty(this.g) || c == null) {
            c = q.c(this.h);
            if (c == null) {
                this.b.b((Throwable) new com.meituan.msc.modules.apploader.events.a(-1, "already exist runtime"));
                return;
            }
            com.meituan.msc.modules.reporter.g.d("BizPackagePreloadTask", "create runtime:", c, CommonConstant.Symbol.COMMA + this.g);
            c.H = s.BIZ_PRELOADING_FROM_NEW;
            com.meituan.msc.modules.apploader.e eVar = (com.meituan.msc.modules.apploader.e) c.c(com.meituan.msc.modules.apploader.a.class);
            eVar.f = this.g;
            eVar.e = this.i;
        } else {
            com.meituan.msc.modules.reporter.g.d("BizPackagePreloadTask", "reuse runtime:", c);
            c.H = s.BIZ_PRELOADING_FROM_BASE;
            ((com.meituan.msc.modules.apploader.e) c.c(com.meituan.msc.modules.apploader.a.class)).e = this.i;
            c.a(this.h);
            c.E = true;
            g.b.a(MSCHornPreloadConfig.m() * 1000);
        }
        c.i = r.BIZ_PRELOAD;
        c.a(System.currentTimeMillis());
        c.o.a(gVar);
        com.meituan.msc.modules.apploader.a aVar2 = (com.meituan.msc.modules.apploader.a) c.c(com.meituan.msc.modules.apploader.a.class);
        if (aVar2 instanceof com.meituan.msc.modules.apploader.e) {
            com.meituan.msc.modules.apploader.e eVar2 = (com.meituan.msc.modules.apploader.e) aVar2;
            String str = this.g;
            String str2 = this.h;
            String str3 = this.j;
            boolean z = this.k;
            Object[] objArr3 = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.apploader.e.a;
            if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "278a12d57b439b640513db1f52ce59a8", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "278a12d57b439b640513db1f52ce59a8");
            } else {
                com.meituan.msc.modules.reporter.g.d(eVar2.b, "preloadAppPackage", str2, str3, str);
                eVar2.d(str);
                a2 = eVar2.a("PreloadBiz", str3, z);
            }
            a2.a(new com.meituan.msc.common.support.java.util.function.b<Void, Throwable, Void>() { // from class: com.meituan.msc.modules.preload.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.support.java.util.function.b
                public final /* synthetic */ Void a(Void r13, Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr4 = {r13, th2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4fa2f12d86790e8c7185b658b39b6af2", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4fa2f12d86790e8c7185b658b39b6af2");
                    }
                    if (th2 != null) {
                        com.meituan.msc.modules.reporter.g.d("BizPackagePreloadTask", "[MSC][Preload]preloadBiz engine fail", b.this.h);
                        b.this.b.b(th2);
                        return null;
                    }
                    com.meituan.msc.modules.reporter.g.d("BizPackagePreloadTask", "[MSC][Preload]preloadBiz engine end:", b.this.h);
                    b.this.b.d((com.meituan.msc.common.support.java.util.concurrent.a) c);
                    return null;
                }
            });
        }
    }
}
