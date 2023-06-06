package com.meituan.msc.modules.preload;

import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.msc.modules.container.o;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.engine.r;
import com.meituan.msc.modules.engine.s;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.modules.preload.executor.c {
    public static ChangeQuickRedirect a = null;
    private static boolean g = false;
    final com.meituan.msc.common.support.java.util.concurrent.a<h> b;
    private final String h;
    private final String i;

    public static /* synthetic */ boolean a(boolean z) {
        g = true;
        return true;
    }

    public a(String str, String str2) {
        super("BasePackagePreload");
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c51c8afecd017b0d938e76bee61a9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c51c8afecd017b0d938e76bee61a9b");
            return;
        }
        this.b = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        this.h = str;
        this.i = str2;
    }

    @Override // com.meituan.msc.modules.preload.executor.c
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f22497a9a6a90f7d93eef01e73700a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f22497a9a6a90f7d93eef01e73700a4");
            return;
        }
        com.meituan.msc.modules.reporter.g.b(this.h, exc, "[MSC][Preload]preload engine error");
        e a2 = e.a();
        a2.b = "preload engine error:" + exc.toString();
        this.b.b((Throwable) exc);
    }

    @Override // com.meituan.msc.modules.preload.executor.c
    public final void a(com.meituan.msc.modules.preload.executor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271467a9f84f7682cc26ac3e1d21ee5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271467a9f84f7682cc26ac3e1d21ee5e");
            return;
        }
        com.meituan.msc.util.perf.g gVar = new com.meituan.msc.util.perf.g(LaunchMode.LAUNCH_MODE_PRELOAD, ErrorCode.ERROR_TYPE_B);
        if (o.b.a()) {
            com.meituan.msc.modules.reporter.g.d(this.h, "already launching,cancel preload base");
            this.b.d((com.meituan.msc.common.support.java.util.concurrent.a<h>) null);
            return;
        }
        final h g2 = q.g();
        if (g2 == null) {
            com.meituan.msc.modules.reporter.g.d(this.h, "already exist base preload");
            this.b.d((com.meituan.msc.common.support.java.util.concurrent.a<h>) null);
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.h, "[MSC][Preload]preload engine start", g2, this.i);
        e.a().b = "base preloading";
        g2.i = r.BASE_PRELOAD;
        g2.H = s.BASE_PRELOADING;
        g2.r.l = this.i;
        g2.a(System.currentTimeMillis());
        g2.o.a(gVar);
        com.meituan.msc.modules.apploader.a aVar = (com.meituan.msc.modules.apploader.a) g2.c(com.meituan.msc.modules.apploader.a.class);
        if (!(aVar instanceof com.meituan.msc.modules.apploader.e)) {
            this.b.b((Throwable) new IllegalArgumentException("AppLoader type error"));
        } else {
            ((com.meituan.msc.modules.apploader.e) aVar).a(this.h, this.i).a(new com.meituan.msc.common.support.java.util.function.b<PackageInfoWrapper, Throwable, Void>() { // from class: com.meituan.msc.modules.preload.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.support.java.util.function.b
                public final /* synthetic */ Void a(PackageInfoWrapper packageInfoWrapper, Throwable th) {
                    PackageInfoWrapper packageInfoWrapper2 = packageInfoWrapper;
                    Throwable th2 = th;
                    Object[] objArr2 = {packageInfoWrapper2, th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "072ba7258f3bf8bcdcaad89feb5b3eff", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "072ba7258f3bf8bcdcaad89feb5b3eff");
                    }
                    if (th2 == null) {
                        if (!a.g) {
                            a.a(true);
                            com.meituan.msc.modules.service.codecache.c.a().a((String) null, packageInfoWrapper2.getVersion(), packageInfoWrapper2);
                        }
                        e a2 = e.a();
                        a2.b = "preload engine end:" + packageInfoWrapper2.getVersion();
                        com.meituan.msc.modules.reporter.g.d(a.this.h, "[MSC][Preload]preload engine end:", packageInfoWrapper2.getVersion());
                        a.this.b.d((com.meituan.msc.common.support.java.util.concurrent.a) g2);
                    } else {
                        e a3 = e.a();
                        a3.b = "preload engine fail:" + packageInfoWrapper2.getVersion();
                        com.meituan.msc.modules.reporter.g.d(a.this.h, "[MSC][Preload]preload engine fail");
                        a.this.b.b(th2);
                    }
                    return null;
                }
            });
        }
    }
}
