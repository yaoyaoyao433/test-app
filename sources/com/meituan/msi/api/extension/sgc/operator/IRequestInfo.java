package com.meituan.msi.api.extension.sgc.operator;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IRequestInfo implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, i<RequestInfoResponse> iVar);

    @MsiApiMethod(name = "getRequestNativeCommonParam", response = RequestInfoResponse.class, scope = "sgc")
    public void msiGetRequestNativeCommonParam(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb01f1156f664a105c654b5beab315a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb01f1156f664a105c654b5beab315a");
        } else {
            a(msiCustomContext, new i<RequestInfoResponse>() { // from class: com.meituan.msi.api.extension.sgc.operator.IRequestInfo.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(RequestInfoResponse requestInfoResponse) {
                    RequestInfoResponse requestInfoResponse2 = requestInfoResponse;
                    Object[] objArr2 = {requestInfoResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0ef0b5058e612427255ff7809b58075", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0ef0b5058e612427255ff7809b58075");
                    } else {
                        msiCustomContext.onSuccess(requestInfoResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a18a84a1da68777ab22a0dff6850bfa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a18a84a1da68777ab22a0dff6850bfa");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
