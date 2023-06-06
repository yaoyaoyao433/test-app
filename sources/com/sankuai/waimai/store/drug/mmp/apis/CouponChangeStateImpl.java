package com.sankuai.waimai.store.drug.mmp.apis;

import android.support.annotation.NonNull;
import com.meituan.msi.api.extension.medicine.CouponStateParam;
import com.meituan.msi.api.extension.medicine.CouponStateResponse;
import com.meituan.msi.api.extension.medicine.ICoupon;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CouponChangeStateImpl extends ICoupon {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.medicine.ICoupon
    public final void a(MsiCustomContext msiCustomContext, final CouponStateParam couponStateParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, couponStateParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48463f3cd85a606b020b43773a448e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48463f3cd85a606b020b43773a448e75");
        } else if (couponStateParam == null || msiCustomContext == null) {
        } else {
            msiCustomContext.getActivity().runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.store.drug.mmp.apis.CouponChangeStateImpl.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de1e8b3e707185fe31b262e99022e242", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de1e8b3e707185fe31b262e99022e242");
                        return;
                    }
                    String str = couponStateParam.coupon_item;
                    if (t.a(str)) {
                        return;
                    }
                    c.a().a((Poi.PoiCouponItem) com.sankuai.waimai.store.util.i.a(str, Poi.PoiCouponItem.class));
                }
            });
        }
    }

    @Override // com.meituan.msi.api.extension.medicine.ICoupon
    public final void a(MsiCustomContext msiCustomContext, CouponStateParam couponStateParam, @NonNull j<CouponStateResponse> jVar) {
        Object[] objArr = {msiCustomContext, couponStateParam, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aed08e0de054bff75103bd5cbf4f574a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aed08e0de054bff75103bd5cbf4f574a");
        } else {
            c.a().c = jVar;
        }
    }
}
