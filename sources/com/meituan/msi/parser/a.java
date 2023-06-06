package com.meituan.msi.parser;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.BaseJavaModule;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.GsonApiRequest;
import com.meituan.msi.api.c;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.StringRequestData;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static ApiRequest<?> a(@Nullable StringRequestData stringRequestData, c<String> cVar) throws ApiException {
        Object[] objArr = {stringRequestData, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b13c8f414f5728a04d3526490033c1cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b13c8f414f5728a04d3526490033c1cc");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        if (stringRequestData == null || stringRequestData.getRequestData() == null) {
            throw new ApiException(400, "params is empty");
        }
        com.meituan.msi.log.a.a(stringRequestData.getRequestData(), cVar == null ? BaseJavaModule.METHOD_TYPE_SYNC : BaseJavaModule.METHOD_TYPE_ASYNC);
        ApiRequest<?> apiRequest = (ApiRequest) w.a(stringRequestData.getRequestData(), GsonApiRequest.class);
        if (apiRequest == null) {
            throw new ApiException(400, "fail to parse params");
        }
        apiRequest.setExtra(stringRequestData, elapsedRealtime, currentTimeMillis);
        return apiRequest;
    }

    public static ApiRequest<?> a(ApiPortal.b bVar, c<String> cVar) {
        Object[] objArr = {bVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27e659697f568afa3658f3861134bfb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27e659697f568afa3658f3861134bfb0");
        }
        GsonApiRequest gsonApiRequest = new GsonApiRequest();
        gsonApiRequest.setContainerContext(bVar);
        gsonApiRequest.setApiCallback(null);
        return gsonApiRequest;
    }
}
