package com.meituan.msi.api.extension.sgc.order;

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
public abstract class IOrder implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, SubmitOrderWithoutShopCartParam submitOrderWithoutShopCartParam, i<EmptyResponse> iVar);

    @MsiApiMethod(name = "submitOrderWithoutShopCart", request = SubmitOrderWithoutShopCartParam.class, scope = "sgc")
    public void msiSubmitOrderWithoutShopCart(SubmitOrderWithoutShopCartParam submitOrderWithoutShopCartParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {submitOrderWithoutShopCartParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f83107f6d31d6d8e20f7921844fde53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f83107f6d31d6d8e20f7921844fde53");
        } else {
            a(msiCustomContext, submitOrderWithoutShopCartParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.order.IOrder.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d264c609325c95df39c91f358fc3122b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d264c609325c95df39c91f358fc3122b");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3987ab7eca67670de8a4db981907a9ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3987ab7eca67670de8a4db981907a9ba");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }
}
