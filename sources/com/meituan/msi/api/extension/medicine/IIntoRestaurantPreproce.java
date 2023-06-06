package com.meituan.msi.api.extension.medicine;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IIntoRestaurantPreproce implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(IIntoRestaurantPreproceParam iIntoRestaurantPreproceParam, MsiCustomContext msiCustomContext, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "intoRestaurantPreproce", onUiThread = true, request = IIntoRestaurantPreproceParam.class, scope = "medicine")
    public void msiIntoRestaurantPreproce(IIntoRestaurantPreproceParam iIntoRestaurantPreproceParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {iIntoRestaurantPreproceParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e52d8bf62640c7e5002da1b937ab57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e52d8bf62640c7e5002da1b937ab57");
        } else {
            a(iIntoRestaurantPreproceParam, msiCustomContext, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.medicine.IIntoRestaurantPreproce.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6242a4acdac710a8553f276361c1f408", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6242a4acdac710a8553f276361c1f408");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d915c268da3228ff0c12ace272f637f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d915c268da3228ff0c12ace272f637f7");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
