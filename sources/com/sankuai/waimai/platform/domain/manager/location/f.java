package com.sankuai.waimai.platform.domain.manager.location;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.t;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "111947a50075d3af36e61b1634448cc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "111947a50075d3af36e61b1634448cc5");
        }
        aj request = aVar.request();
        t.a m = t.e(request.b()).m();
        m.a("uuid", com.sankuai.waimai.platform.b.A().c());
        return aVar.a(request.a().b(m.b().toString()).a());
    }
}
