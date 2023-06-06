package com.meituan.msi.interceptor;

import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 30;
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8d60a87e6f1d1ca1b722a5f39bc611", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8d60a87e6f1d1ca1b722a5f39bc611");
        }
        ApiRequest<?> a2 = aVar.a();
        w.a<?> pareBody = a2.pareBody();
        if (pareBody != null && !pareBody.a()) {
            ApiResponse<?> negativeResponse = ApiResponse.negativeResponse(a2, 400, a2.bodyData().c, ApiResponse.a.callbackValue);
            ApiResponse.notifyNegativeResult(a2.callback(), negativeResponse);
            return negativeResponse;
        }
        return aVar.a(aVar.a());
    }
}
