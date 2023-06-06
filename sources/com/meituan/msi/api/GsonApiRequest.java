package com.meituan.msi.api;

import android.support.annotation.Keep;
import com.google.gson.JsonElement;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class GsonApiRequest<T> extends ApiRequest<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JsonElement args;

    @Override // com.meituan.msi.api.ApiRequest
    public w.a<T> pareBody() {
        a apiCall;
        n nVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73a7312e57b8ccb51cbcff169e632eaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (w.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73a7312e57b8ccb51cbcff169e632eaa");
        }
        if (this.bodyData == null && (apiCall = getApiCall()) != null && (nVar = apiCall.c) != null) {
            this.bodyData = w.a(this.args, nVar.f);
        }
        return this.bodyData;
    }

    public JsonElement getArgs() {
        return this.args;
    }
}
