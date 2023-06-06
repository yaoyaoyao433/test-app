package com.sankuai.meituan.kernel.net.msi.progress;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements Interceptor {
    public static ChangeQuickRedirect a;
    private final e b;

    public d(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83819a596c896617fdd06970d3b9c098", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83819a596c896617fdd06970d3b9c098");
        } else {
            this.b = eVar;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112b7a6cbea897844692174b1a2c5692", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112b7a6cbea897844692174b1a2c5692");
        }
        aj request = aVar.request();
        aj.a a2 = request.a();
        a2.c = "POST";
        a2.d = new f(request.h, this.b);
        return aVar.a(a2.a());
    }
}
