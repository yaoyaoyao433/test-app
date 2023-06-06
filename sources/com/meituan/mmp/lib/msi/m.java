package com.meituan.mmp.lib.msi;

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
public final class m implements com.meituan.msi.interceptor.b {
    public static ChangeQuickRedirect a;
    private SystemInfoApi.a b;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 50;
    }

    public m(SystemInfoApi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21ea12b4f6fc8e111bfd288f62d821e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21ea12b4f6fc8e111bfd288f62d821e");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fa359a7127687773672d1e09794f563", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fa359a7127687773672d1e09794f563");
        }
        ApiRequest<?> a2 = aVar.a();
        if (a2.getApiImpl() instanceof SystemInfoApi) {
            ((SystemInfoApi) a2.getApiImpl()).a(this.b);
        }
        return aVar.a(a2);
    }
}
