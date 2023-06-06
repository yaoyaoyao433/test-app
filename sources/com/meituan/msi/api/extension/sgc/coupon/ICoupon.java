package com.meituan.msi.api.extension.sgc.coupon;

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

    public abstract void a(MsiCustomContext msiCustomContext, AddCouponStateChangeListenerParam addCouponStateChangeListenerParam, j<OnCouponStateChangeResponse> jVar);

    public abstract void a(MsiCustomContext msiCustomContext, NotifyNativeCouponStateChangeParam notifyNativeCouponStateChangeParam, i<EmptyResponse> iVar);

    @MsiApiMethod(isCallback = true, name = "onCouponStateChange", response = OnCouponStateChangeResponse.class, scope = "sgc")
    public void onCouponStateChange(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "notifyNativeCouponStateChange", request = NotifyNativeCouponStateChangeParam.class, scope = "sgc")
    public void msiNotifyNativeCouponStateChange(NotifyNativeCouponStateChangeParam notifyNativeCouponStateChangeParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {notifyNativeCouponStateChangeParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a9f7bd80a71bb5853802f3f53111805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a9f7bd80a71bb5853802f3f53111805");
        } else {
            a(msiCustomContext, notifyNativeCouponStateChangeParam, new i<EmptyResponse>() { // from class: com.meituan.msi.api.extension.sgc.coupon.ICoupon.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(EmptyResponse emptyResponse) {
                    EmptyResponse emptyResponse2 = emptyResponse;
                    Object[] objArr2 = {emptyResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12dfaf989c16894d316c829b02c23a21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12dfaf989c16894d316c829b02c23a21");
                    } else {
                        msiCustomContext.onSuccess(emptyResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad8e7f3d709fcbc5adf40eee69c33f97", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad8e7f3d709fcbc5adf40eee69c33f97");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "addCouponStateChangeListener", request = AddCouponStateChangeListenerParam.class, scope = "sgc")
    public void msiAddCouponStateChangeListener(AddCouponStateChangeListenerParam addCouponStateChangeListenerParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {addCouponStateChangeListenerParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40f603c7eef0dceb0df8dc3c819dd78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40f603c7eef0dceb0df8dc3c819dd78");
            return;
        }
        a(msiCustomContext, addCouponStateChangeListenerParam, new j<OnCouponStateChangeResponse>() { // from class: com.meituan.msi.api.extension.sgc.coupon.ICoupon.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.j
            public final /* synthetic */ void a(OnCouponStateChangeResponse onCouponStateChangeResponse) {
                OnCouponStateChangeResponse onCouponStateChangeResponse2 = onCouponStateChangeResponse;
                Object[] objArr2 = {onCouponStateChangeResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd9917124723dfd0c74f278f3daf34a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd9917124723dfd0c74f278f3daf34a2");
                } else {
                    msiCustomContext.dispatchEvent("sgc", "onCouponStateChange", onCouponStateChangeResponse2);
                }
            }
        });
        msiCustomContext.onSuccess("");
    }
}
