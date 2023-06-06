package com.meituan.msi.api.extension.medicine;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IRequestCommonParam implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, i<RequestCommonResponse> iVar);

    @MsiApiMethod(name = "getRequestNativeCommonParam", response = RequestCommonResponse.class, scope = "medicine")
    public void msiGetRequestNativeCommonParam(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d795d818bd8368ecfbc7f4a28f59de1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d795d818bd8368ecfbc7f4a28f59de1");
        } else {
            a(msiCustomContext, new i<RequestCommonResponse>() { // from class: com.meituan.msi.api.extension.medicine.IRequestCommonParam.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(RequestCommonResponse requestCommonResponse) {
                    RequestCommonResponse requestCommonResponse2 = requestCommonResponse;
                    Object[] objArr2 = {requestCommonResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5011e5b9b64d494889a9195e3c85592f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5011e5b9b64d494889a9195e3c85592f");
                    } else {
                        msiCustomContext.onSuccess(requestCommonResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2aa354d503e59598d45a8a76017281b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2aa354d503e59598d45a8a76017281b");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
