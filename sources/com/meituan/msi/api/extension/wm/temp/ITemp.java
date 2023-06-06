package com.meituan.msi.api.extension.wm.temp;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ITemp implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, RequestWMApiParam requestWMApiParam, i<RequestWMApiResponse> iVar);

    @MsiApiMethod(name = "requestWMApi", request = RequestWMApiParam.class, response = RequestWMApiResponse.class, scope = "wm")
    public void msiRequestWMApi(RequestWMApiParam requestWMApiParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {requestWMApiParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afac6c168de697c584f464fca86d498b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afac6c168de697c584f464fca86d498b");
        } else {
            a(msiCustomContext, requestWMApiParam, new i<RequestWMApiResponse>() { // from class: com.meituan.msi.api.extension.wm.temp.ITemp.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(RequestWMApiResponse requestWMApiResponse) {
                    RequestWMApiResponse requestWMApiResponse2 = requestWMApiResponse;
                    Object[] objArr2 = {requestWMApiResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "301ec3788842460824574951c3c67326", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "301ec3788842460824574951c3c67326");
                    } else {
                        msiCustomContext.onSuccess(requestWMApiResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04723b55b64c0390c2ad8a9e0fc1c0e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04723b55b64c0390c2ad8a9e0fc1c0e7");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
