package com.meituan.msi.api.extension.medicine;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ICoupon implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, CouponStateParam couponStateParam, i<EmptyResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, CouponStateParam couponStateParam, j<CouponStateResponse> jVar);

    @MsiApiMethod(isCallback = true, name = "onMMPCouponStateChange", response = CouponStateResponse.class, scope = "medicine")
    public void onMMPCouponStateChange(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "notifyNativeCouponStateChange", request = CouponStateParam.class, scope = "medicine")
    public void msiNotifyNativeCouponStateChange(CouponStateParam couponStateParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {couponStateParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "720cfc6bc9a9ac9557cf7e1c67d96b3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "720cfc6bc9a9ac9557cf7e1c67d96b3b");
        } else {
            a(msiCustomContext, couponStateParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.medicine.ICoupon.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57b337f1e595fdb7e25787db22e28991", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57b337f1e595fdb7e25787db22e28991");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "843fb28a10fba7b58d3801f9a5fffd28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "843fb28a10fba7b58d3801f9a5fffd28");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "addMMPCouponStateChangeListener", request = CouponStateParam.class, scope = "medicine")
    public void msiAddMMPCouponStateChangeListener(CouponStateParam couponStateParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {couponStateParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fb977f14a2a8a41f82761c7316870c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fb977f14a2a8a41f82761c7316870c");
        } else {
            a(msiCustomContext, couponStateParam, new j<CouponStateResponse>() { // from class: com.meituan.msi.api.extension.medicine.ICoupon.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.j
                public final /* synthetic */ void a(CouponStateResponse couponStateResponse) {
                    CouponStateResponse couponStateResponse2 = couponStateResponse;
                    Object[] objArr2 = {couponStateResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83fdc0dd3b6fb02882b9024270eecb6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83fdc0dd3b6fb02882b9024270eecb6a");
                    } else {
                        msiCustomContext.dispatchEvent("onMMPCouponStateChange", couponStateResponse2);
                    }
                }
            });
        }
    }
}
