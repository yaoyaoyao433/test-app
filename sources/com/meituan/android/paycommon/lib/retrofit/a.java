package com.meituan.android.paycommon.lib.retrofit;

import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.g;
import com.meituan.android.common.candy.OkCandyInterceptor;
import com.meituan.android.paybase.net.a;
import com.meituan.android.paybase.utils.ah;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
import com.squareup.okhttp.v;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private a.InterfaceC0637a c;
    private a.InterfaceC0637a d;
    private a.InterfaceC0637a e;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "204137f81d437b28ec47b73f3951f939", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "204137f81d437b28ec47b73f3951f939");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9888d2ce0c25b568068f8a66de108f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9888d2ce0c25b568068f8a66de108f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7764f4d1ea2ed088d43cc2c93000ae8e", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7764f4d1ea2ed088d43cc2c93000ae8e");
        } else if (!g.u()) {
            com.meituan.android.paybase.common.analyse.a.a("PayOkNvCallFactory", "createNvCallFactory", "error: NVGlobal is not init", "");
            a2 = null;
        } else {
            NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.meituan.android.paycommon.lib.config.a.a().a);
            SharkWrapper.addInterceptorToBuilder(aVar);
            aVar.a(new com.meituan.android.paybase.retrofit.interceptor.b(com.meituan.android.paycommon.lib.config.a.a().a));
            if (ah.a(com.meituan.android.paycommon.lib.config.a.a().a)) {
                aVar.a(true);
            }
            a2 = com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(aVar.a());
        }
        this.e = a2;
        this.c = a(60);
        this.d = a(30);
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94424b6360f4c6308906fd861b12eaab", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94424b6360f4c6308906fd861b12eaab");
        }
        if (this.e != null && com.meituan.android.paycommon.lib.retrofit.channel.a.b(ajVar.b())) {
            return this.e.get(ajVar);
        }
        if (this.d != null && com.meituan.android.paycommon.lib.retrofit.channel.a.a(ajVar.b())) {
            return this.d.get(ajVar);
        }
        return this.c.get(ajVar);
    }

    private com.sankuai.meituan.retrofit2.callfactory.okhttp.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b2a04b91337963ed3bdebfcf78a9df", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.callfactory.okhttp.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b2a04b91337963ed3bdebfcf78a9df");
        }
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        v a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
        long j = i;
        a2.a(j, TimeUnit.SECONDS);
        a2.b(j, TimeUnit.SECONDS);
        a2.c(j, TimeUnit.SECONDS);
        a2.a().add(new com.meituan.android.paybase.net.cat.c());
        if (ah.a(com.meituan.android.paycommon.lib.config.a.a().a)) {
            a2.a().add(new OkCandyInterceptor(com.meituan.android.paycommon.lib.config.a.a().a));
            a2.a().add(new a.C0335a());
        } else {
            a2.b().add(new OkCandyInterceptor(com.meituan.android.paycommon.lib.config.a.a().a));
        }
        a2.a().add(new com.meituan.android.paybase.net.cat.a());
        return com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a2);
    }
}
