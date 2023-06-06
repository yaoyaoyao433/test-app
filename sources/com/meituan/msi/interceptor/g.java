package com.meituan.msi.interceptor;

import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements b {
    public static ChangeQuickRedirect a;
    private final com.meituan.msi.api.b b;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 20;
    }

    public g(com.meituan.msi.api.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66dc985fd9a574d8de3dc10a51dd0b06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66dc985fd9a574d8de3dc10a51dd0b06");
        } else {
            this.b = bVar;
        }
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d3dbbaa38672f1bba8cb2fa660a2a31", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d3dbbaa38672f1bba8cb2fa660a2a31");
        }
        ApiRequest<?> a2 = aVar.a();
        if (a2.attachApiCall(this.b) == null) {
            ApiResponse<?> negativeResponse = ApiResponse.negativeResponse(a2, ApiResponse.NOT_FUND, " not implement ", ApiResponse.a.callbackValue);
            ApiResponse.notifyNegativeResult(a2.callback(), negativeResponse);
            return negativeResponse;
        }
        return aVar.a(a2);
    }
}
