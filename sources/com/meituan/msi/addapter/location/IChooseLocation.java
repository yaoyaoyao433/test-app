package com.meituan.msi.addapter.location;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IChooseLocation implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, ChooseLocationParam chooseLocationParam, i<ChooseLocationResponse> iVar);

    @MsiApiMethod(name = "chooseLocation", request = ChooseLocationParam.class, response = ChooseLocationResponse.class)
    public void msiChooseLocation(ChooseLocationParam chooseLocationParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {chooseLocationParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9f438b567013a8e1e0b4d61dd4fcc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9f438b567013a8e1e0b4d61dd4fcc2");
        } else {
            a(msiCustomContext, chooseLocationParam, new i<ChooseLocationResponse>() { // from class: com.meituan.msi.addapter.location.IChooseLocation.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(ChooseLocationResponse chooseLocationResponse) {
                    ChooseLocationResponse chooseLocationResponse2 = chooseLocationResponse;
                    Object[] objArr2 = {chooseLocationResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee82aabdc2206c003feace84d59b0268", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee82aabdc2206c003feace84d59b0268");
                    } else {
                        msiCustomContext.onSuccess(chooseLocationResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c665b09e0f8018a2644a0a358ad3958", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c665b09e0f8018a2644a0a358ad3958");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
