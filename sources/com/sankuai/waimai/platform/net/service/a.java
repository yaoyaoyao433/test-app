package com.sankuai.waimai.platform.net.service;

import com.google.gson.Gson;
import com.meituan.android.singleton.e;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aa;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.t;
import com.sankuai.waimai.platform.capacity.network.interceptor.BusinessInterceptor;
import com.sankuai.waimai.platform.capacity.network.interceptor.CrawlerInterceptor;
import com.sankuai.waimai.platform.net.util.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends e<ar> {
    public static ChangeQuickRedirect d;

    public abstract String c();

    public abstract Gson d();

    @Override // com.meituan.android.singleton.e
    public final /* synthetic */ ar a() {
        Interceptor interceptor;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f3a2d6ae0194aee8ff8e97fe831fd52", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f3a2d6ae0194aee8ff8e97fe831fd52");
        }
        String c = c();
        if (t.e(c) == null) {
            c = com.sankuai.waimai.platform.net.c.b + f.a;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "850da493ed68976cfbacb1c26e16dc6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "850da493ed68976cfbacb1c26e16dc6a");
        } else if (!aa.a().contains(com.sankuai.waimai.platform.net.c.b)) {
            aa.a().add(com.sankuai.waimai.platform.net.c.b);
        }
        ar.a a = new ar.a().a(c).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(new com.sankuai.waimai.platform.modular.network.adapter.b());
        Gson d2 = d();
        Object[] objArr3 = {d2};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        ar.a a2 = a.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "90cfc6308047e9670ae5f3be2e2ef359", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "90cfc6308047e9670ae5f3be2e2ef359") : new b(d2)).a(i.a("oknv")).a(new com.sankuai.waimai.platform.capacity.network.interceptor.b()).a(new CrawlerInterceptor()).a(new BusinessInterceptor());
        if (com.sankuai.waimai.foundation.core.a.b() && (interceptor = (Interceptor) com.sankuai.waimai.router.a.a(Interceptor.class, "local_mock_server")) != null) {
            a2.a(interceptor);
        }
        return a2.a();
    }
}
