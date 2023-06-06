package com.meituan.mmp.lib.msi;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.interceptor.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.meituan.msi.interceptor.b {
    public static ChangeQuickRedirect a;
    b.a b;
    public com.meituan.mmp.lib.api.auth.f c;
    private com.meituan.mmp.lib.config.a d;
    private com.meituan.mmp.lib.engine.m e;

    @Override // com.meituan.msi.interceptor.b
    public final int a() {
        return 10;
    }

    public d(com.meituan.mmp.lib.engine.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d697e0c1942daf42c299809c64e4d4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d697e0c1942daf42c299809c64e4d4b");
            return;
        }
        this.b = null;
        this.d = null;
        this.e = null;
        this.c = com.meituan.mmp.lib.api.auth.d.a();
        this.d = mVar.d;
        this.e = mVar;
    }

    @Override // com.meituan.msi.interceptor.b
    public final ApiResponse<?> a(b.a aVar) throws ApiException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b40f5982aab679cf36329865a3f514c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b40f5982aab679cf36329865a3f514c6");
        }
        final ApiRequest<?> a2 = aVar.a();
        String a3 = this.c != null ? this.c.a(a2.getName()) : "";
        if (this.d == null || this.d.a() || TextUtils.isEmpty(a3)) {
            return aVar.a(a2);
        }
        com.meituan.mmp.lib.trace.b.b("MMPMsi", "MMPAuthInterceptor need auth check");
        if (!this.c.a(this.d, a3)) {
            return a(a2, "api call failed, auth denied, need to configure the necessary fields in app.json!");
        }
        if (a2.callback() == null) {
            return a(a2, "api call failed, need auth check, you need use api by asynInvoke");
        }
        this.b = aVar;
        JsonObject innerArgs = a2.getInnerArgs();
        String asString = (innerArgs == null || !innerArgs.has("from")) ? null : innerArgs.get("from").getAsString();
        Object[] objArr2 = {a2, a3, asString};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19f17cbd27f798ee8b2f51d7d2140f03", RobustBitConfig.DEFAULT_VALUE)) {
            String str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19f17cbd27f798ee8b2f51d7d2140f03");
        } else if (this.e == null || this.e.r == null) {
            ApiResponse.notifyNegativeResult(a2.callback(), ApiResponse.negativeResponse(a2, 401, "api call failed, auth denied, need to configure the necessary fields in app.json!", ApiResponse.a.callbackValue));
        } else {
            this.c.a(this.e.r.f, this.d, a3, asString, new com.meituan.mmp.lib.api.auth.i() { // from class: com.meituan.mmp.lib.msi.d.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.api.auth.i
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b385dc68c798c4469cc6c508baf1ef5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b385dc68c798c4469cc6c508baf1ef5");
                        return;
                    }
                    switch (i) {
                        case -1:
                            d.this.a(a2, "api call failed, auth denied");
                            return;
                        case 0:
                            d.this.a(a2, "api call failed, auth cancel");
                            return;
                        case 1:
                            if (d.this.b != null) {
                                try {
                                    com.meituan.mmp.lib.trace.b.b("MMPMsi", "MMPAuthInterceptor go on after auth");
                                    d.this.b.a(a2);
                                    return;
                                } catch (ApiException e) {
                                    e.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        default:
                            return;
                    }
                }
            });
        }
        return null;
    }

    ApiResponse a(ApiRequest apiRequest, String str) {
        Object[] objArr = {apiRequest, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd886ecdef667be4511602d08d04317", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd886ecdef667be4511602d08d04317");
        }
        ApiResponse<?> negativeResponse = ApiResponse.negativeResponse(apiRequest, 401, str, ApiResponse.a.callbackValue);
        ApiResponse.notifyNegativeResult(apiRequest.callback(), negativeResponse);
        return negativeResponse;
    }
}
