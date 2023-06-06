package com.meituan.android.neohybrid.v2.neo.http.shark;

import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.g;
import com.meituan.android.paybase.utils.ah;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private final a.InterfaceC0637a c;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44402e23bee138d62c833d0665885d72", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44402e23bee138d62c833d0665885d72");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public a() {
        com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6474337e276def8ff08c3b26434a7db3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6474337e276def8ff08c3b26434a7db3");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2b9f5ccbd4d6803b4b1a032756764c5", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2b9f5ccbd4d6803b4b1a032756764c5");
        } else if (g.u()) {
            NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.meituan.android.neohybrid.init.a.d());
            SharkWrapper.addInterceptorToBuilder(aVar);
            aVar.a(new b());
            aVar.a(new com.meituan.android.paybase.retrofit.interceptor.b(com.meituan.android.neohybrid.init.a.d()));
            if (ah.a(com.meituan.android.neohybrid.init.a.d())) {
                aVar.a(true);
            }
            a2 = com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(aVar.a());
        } else {
            a2 = null;
        }
        this.c = a2;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40709515bb3c325307e591c562c5d414", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40709515bb3c325307e591c562c5d414") : this.c.get(ajVar);
    }
}
