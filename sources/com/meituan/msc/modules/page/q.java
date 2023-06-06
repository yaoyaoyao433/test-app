package com.meituan.msc.modules.page;

import com.meituan.msc.common.utils.am;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q extends com.meituan.msc.modules.reporter.f {
    public static ChangeQuickRedirect d;
    public static AtomicInteger e = new AtomicInteger();
    private final com.meituan.msc.modules.engine.h f;

    private q(com.meituan.msc.modules.engine.h hVar) {
        super(com.meituan.msc.modules.reporter.a.a(hVar));
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8faa00580a0472eb0403de8102b46040", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8faa00580a0472eb0403de8102b46040");
        } else {
            this.f = hVar;
        }
    }

    public static q a(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7eacdc2e3d36da145e3451cc148b1152", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7eacdc2e3d36da145e3451cc148b1152") : new q(hVar);
    }

    public final void a(String str, int i, String str2, String str3, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dccdf8171a657472a325cd9b08b71a55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dccdf8171a657472a325cd9b08b71a55");
            return;
        }
        b("msc.page.route.start.count").a("openType", str).a("pageId", Integer.valueOf(i)).a("widget", Boolean.valueOf(z)).a("pagePath", am.b(str2)).a("prePagePath", am.b(str3)).a("originUrl", str2).a("preOriginUrl", str3).c();
        com.meituan.msc.modules.reporter.g.d("MSCReporter", "reportRouteStart routeExceptCount", Integer.valueOf(e.incrementAndGet()), this.f, str);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a5a4b37f37c293bfdfe9348fd3fb21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a5a4b37f37c293bfdfe9348fd3fb21");
        } else {
            b("msc.page.route.exception.count").a("routeExceptCount", e).c();
        }
    }
}
