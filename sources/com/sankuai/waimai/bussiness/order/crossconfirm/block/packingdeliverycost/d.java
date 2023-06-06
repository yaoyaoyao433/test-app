package com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    @NonNull
    c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4eb8241d90109dd24cb039b8b889f5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4eb8241d90109dd24cb039b8b889f5a");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "659ee995c446ae8db5cbd6b5fe1dc0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "659ee995c446ae8db5cbd6b5fe1dc0e5");
            return;
        }
        super.d();
        this.p.a = true;
        if (this.c != 0) {
            this.p.b = ((PoiOrderPreviewResult) this.c).boxTotalPrice;
            this.p.s = ((PoiOrderPreviewResult) this.c).totalBoxPrice;
            this.p.t = ((PoiOrderPreviewResult) this.c).stid;
            this.p.c = ((PoiOrderPreviewResult) this.c).boxTotalName;
            this.p.d = null;
            this.p.e = ((PoiOrderPreviewResult) this.c).shippingFee;
            this.p.f = ((PoiOrderPreviewResult) this.c).realShippingFee;
            this.p.h = ((PoiOrderPreviewResult) this.c).shippingFeeInfo;
            this.p.g = ((PoiOrderPreviewResult) this.c).shippingFeeUpdateReason;
            this.p.i = ((PoiOrderPreviewResult) this.c).shippingFeeDiscountTip;
            this.p.j = null;
            this.p.k = null;
            this.p.l = null;
            this.p.m = ((PoiOrderPreviewResult) this.c).productWeightTip;
            this.p.n = ((PoiOrderPreviewResult) this.c).mCityDeliveryShippingDetails;
            this.p.o = ((PoiOrderPreviewResult) this.c).mShippingRuleUrl;
            this.p.p = 0;
            this.p.q = ((PoiOrderPreviewResult) this.c).packingBag;
            this.p.r = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.bizType : 0;
            this.p.u = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.v = ((PoiOrderPreviewResult) this.c).poiInfo == null ? "" : ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr;
            return;
        }
        this.p.b = 0.0d;
        this.p.c = null;
        this.p.d = null;
        this.p.e = 0.0d;
        this.p.f = 0.0d;
        this.p.g = null;
        this.p.i = null;
        this.p.j = null;
        this.p.k = null;
        this.p.l = null;
        this.p.m = null;
        this.p.n = null;
        this.p.o = null;
        this.p.p = 0;
        this.p.r = 0;
        this.p.u = -1L;
        this.p.v = "";
    }
}
