package com.sankuai.meituan.trafficcontroller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Interceptor {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.trafficcontroller.manager.b b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de88147e131671adbb9aaf890467137", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de88147e131671adbb9aaf890467137");
        } else {
            this.b = new com.sankuai.meituan.trafficcontroller.manager.b();
        }
    }

    public final com.sankuai.meituan.trafficcontroller.manager.b a() {
        return this.b;
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        boolean z;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3537852e03976dd805a7a3787d390ad6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3537852e03976dd805a7a3787d390ad6");
        }
        aj request = aVar.request();
        try {
            z = this.b.a(request.b());
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            if (this.b.a()) {
                throw new com.sankuai.meituan.trafficcontroller.exception.a();
            }
            return new a(request.b());
        }
        return aVar.a(request);
    }
}
