package com.meituan.msc.modules.api.msi.interceptor;

import com.meituan.msc.common.utils.f;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.api.msi.api.PageBeforeUnloadParam;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.meituan.msi.interceptor.b {
    public static ChangeQuickRedirect a;
    private final Set<String> b;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 50;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af9bed48067982f8f3163b852c79118a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af9bed48067982f8f3163b852c79118a");
        } else {
            this.b = f.a("navigateBackMiniProgram", "navigateBackNative", PageBeforeUnloadParam.NAVIGATION_TYPE_EXITMINIPROGRAM, "navigateBack", "setNavigationBarColor", "setNavigationBarTitle", "showNavigationBarLoading", "hideNavigationBarLoading", "showShareMenu", "hideShareMenu", "getMenuButtonBoundingClientRect");
        }
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357377533e5d34180171cfa824c4dc35", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357377533e5d34180171cfa824c4dc35");
        }
        ApiRequest<?> a2 = aVar.a();
        String name = a2.getName();
        IMsiApi apiImpl = a2.getApiImpl();
        if ((apiImpl instanceof MSCApi) && ((MSCApi) apiImpl).a(aVar.b()) && this.b.contains(name)) {
            ApiResponse<?> negativeResponse = ApiResponse.negativeResponse(a2, 500, "api " + name + " not supported in widget", ApiResponse.a.callbackValue);
            ApiResponse.notifyNegativeResult(a2.callback(), negativeResponse);
            return negativeResponse;
        }
        return aVar.a(a2);
    }
}
