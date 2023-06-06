package com.sankuai.waimai.landing;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.landing.report.d;
import com.sankuai.waimai.landing.state.a;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Executor d = c.b();
    private volatile com.sankuai.waimai.landing.state.c b;
    private d c;
    private volatile boolean e;

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "61304a0c34d8a15095c838dd9e91b658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "61304a0c34d8a15095c838dd9e91b658");
        } else if (bVar.e) {
        } else {
            bVar.c = new d();
            bVar.c.a(new com.sankuai.waimai.landing.report.b());
            if (com.sankuai.waimai.ad.gray.b.a().a) {
                bVar.c.a(new com.sankuai.waimai.landing.report.c());
            }
            bVar.b = new com.sankuai.waimai.landing.state.c();
            bVar.b.e = bVar.c;
            bVar.e = true;
        }
    }

    public b() {
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39278460e75c2a6ab3ecf66d3d09a444", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39278460e75c2a6ab3ecf66d3d09a444") : a.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final b a = new b();
    }

    public final void a(final com.sankuai.waimai.landing.state.b bVar, final com.sankuai.waimai.landing.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a3a9e62f979a501534073a879c71925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a3a9e62f979a501534073a879c71925");
        } else if (aVar.c()) {
            if (d == null) {
                com.sankuai.waimai.foundation.utils.log.a.e("LandingRate", "have no executor.", new Object[0]);
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(d, new Runnable() { // from class: com.sankuai.waimai.landing.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "880f060a1d02bd1d056883768bc53335", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "880f060a1d02bd1d056883768bc53335");
                            return;
                        }
                        try {
                            b.a(b.this);
                            if (b.this.b != null) {
                                com.sankuai.waimai.landing.state.c cVar = b.this.b;
                                com.sankuai.waimai.landing.state.b bVar2 = bVar;
                                com.sankuai.waimai.landing.a aVar2 = aVar;
                                Object[] objArr3 = {bVar2, aVar2};
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.landing.state.a.a;
                                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c04501d847988fe68296540eed12e1fe", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c04501d847988fe68296540eed12e1fe");
                                    return;
                                } else if (bVar2 == com.sankuai.waimai.landing.state.b.IDLE) {
                                    cVar.a();
                                    return;
                                } else {
                                    a.EnumC0985a b = cVar.b(bVar2, aVar2);
                                    if (b == a.EnumC0985a.ABANDON) {
                                        com.sankuai.waimai.foundation.utils.log.a.b("AbsLandingStateMachine", "state error, abandon data.", new Object[0]);
                                        return;
                                    } else if (b == a.EnumC0985a.RESET) {
                                        com.sankuai.waimai.foundation.utils.log.a.b("AbsLandingStateMachine", "state error, abandon data.", new Object[0]);
                                        cVar.a();
                                        return;
                                    } else {
                                        cVar.a(bVar2, aVar2);
                                        cVar.b();
                                        return;
                                    }
                                }
                            }
                            com.sankuai.waimai.foundation.utils.log.a.e("LandingRate", "have no state machine.", new Object[0]);
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.b(e);
                        }
                    }
                });
            }
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e21f1f3f3529a8cea487477faaab1362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e21f1f3f3529a8cea487477faaab1362");
            return;
        }
        com.sankuai.waimai.router.common.a a2 = com.sankuai.waimai.foundation.router.impl.a.a();
        if (a2 == null) {
            return;
        }
        a2.c.a(new com.sankuai.waimai.landing.route.b());
        a2.a("ad", new com.sankuai.waimai.landing.route.a());
    }
}
