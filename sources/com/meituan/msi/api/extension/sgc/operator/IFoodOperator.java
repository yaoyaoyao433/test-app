package com.meituan.msi.api.extension.sgc.operator;

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
public abstract class IFoodOperator implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, FoodOperatorParam foodOperatorParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "increaseFoodWithPoiID", request = FoodOperatorParam.class, scope = "sgc")
    public void msiIncreaseFoodWithPoiID(FoodOperatorParam foodOperatorParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {foodOperatorParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11099743431dc44789c9273c22354956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11099743431dc44789c9273c22354956");
        } else {
            a(msiCustomContext, foodOperatorParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.operator.IFoodOperator.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e42155a69227dcaa1b4b6f4673d8b4d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e42155a69227dcaa1b4b6f4673d8b4d1");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2f918c2578f86bffdf6368306c034e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2f918c2578f86bffdf6368306c034e7");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
