package com.meituan.msc.modules.api.msi.interceptor;

import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.api.systeminfo.SystemInfoApi;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.msi.interceptor.b {
    public static ChangeQuickRedirect a;
    private SystemInfoApi.a b;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 50;
    }

    public b(SystemInfoApi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb5198c5a3645e3dc6a1517ebd9df95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb5198c5a3645e3dc6a1517ebd9df95");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5266b407eddf9b03782e0e09967e8cdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5266b407eddf9b03782e0e09967e8cdd");
        }
        ApiRequest<?> a2 = aVar.a();
        if (a2.getApiImpl() instanceof SystemInfoApi) {
            ((SystemInfoApi) a2.getApiImpl()).a(this.b);
        }
        return aVar.a(a2);
    }
}
