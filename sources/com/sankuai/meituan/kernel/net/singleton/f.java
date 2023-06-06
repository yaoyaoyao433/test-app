package com.sankuai.meituan.kernel.net.singleton;

import android.app.Application;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.nvnetwork.k;
import com.sankuai.meituan.kernel.net.nvnetwork.l;
import com.sankuai.meituan.kernel.net.nvnetwork.m;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b {
        public static ChangeQuickRedirect a;
        private static com.dianping.nvnetwork.j b;

        static {
            com.dianping.nvnetwork.j a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37de6bf72308193eed99d3b49856059d", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (com.dianping.nvnetwork.j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37de6bf72308193eed99d3b49856059d");
            } else {
                Application application = com.sankuai.meituan.kernel.net.base.c.b;
                NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(application);
                SharkWrapper.addInterceptorToBuilder(aVar);
                NVDefaultNetworkService.a a3 = aVar.a(new com.sankuai.meituan.kernel.net.nvnetwork.f()).a(new m("nvnetwork")).a(new com.sankuai.meituan.kernel.net.nvnetwork.d()).a(new l(application)).a(new com.sankuai.meituan.kernel.net.nvnetwork.c()).a(new com.sankuai.meituan.kernel.net.nvnetwork.a(com.sankuai.meituan.kernel.net.singleton.a.a(), com.sankuai.meituan.kernel.net.base.c.a(), false)).a(new k()).a(new com.sankuai.meituan.kernel.net.nvnetwork.e(application)).a(new com.sankuai.meituan.kernel.net.nvnetwork.j()).a(new com.sankuai.meituan.kernel.net.nvnetwork.b(application)).a(new com.sankuai.meituan.kernel.net.nvnetwork.h(application)).a(new com.sankuai.meituan.kernel.net.nvnetwork.i()).a(new com.sankuai.meituan.kernel.net.nvnetwork.g());
                a3.e = true;
                a2 = a3.a();
            }
            b = a2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public static ChangeQuickRedirect a;
        private static com.dianping.nvnetwork.j b;

        static {
            com.dianping.nvnetwork.j a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce7b5b747c63b4e51bd8e9c647862027", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (com.dianping.nvnetwork.j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce7b5b747c63b4e51bd8e9c647862027");
            } else {
                NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.sankuai.meituan.kernel.net.base.c.b);
                SharkWrapper.addInterceptorToBuilder(aVar);
                NVDefaultNetworkService.a a3 = aVar.a(new com.sankuai.meituan.kernel.net.nvnetwork.f()).a(new m("defaultnvnetwork"));
                a3.e = true;
                a2 = a3.a();
            }
            b = a2;
        }
    }
}
