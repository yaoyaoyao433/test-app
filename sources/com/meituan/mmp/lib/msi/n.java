package com.meituan.mmp.lib.msi;

import com.meituan.mmp.lib.msi.tabbar.TabBarApi;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements com.meituan.msi.interceptor.b {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.engine.m b;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 50;
    }

    public n(com.meituan.mmp.lib.engine.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21242f9a7d54958b6a23f786863324cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21242f9a7d54958b6a23f786863324cb");
        } else {
            this.b = mVar;
        }
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd11bdf4fd0115fd2e5001186ed77e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd11bdf4fd0115fd2e5001186ed77e6");
        }
        ApiRequest<?> a2 = aVar.a();
        if (a2.getApiImpl() instanceof TabBarApi) {
            ((TabBarApi) a2.getApiImpl()).b = this.b.q;
        }
        return aVar.a(a2);
    }
}
