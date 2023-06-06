package com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e10a6cf22c0d1478360edc98551416", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e10a6cf22c0d1478360edc98551416");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088f1ff3f58d6c1e5f288e8e5cd3c364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088f1ff3f58d6c1e5f288e8e5cd3c364");
            return;
        }
        super.d();
        this.p.a = true;
        if (this.c != 0) {
            this.p.b = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.c = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr : "";
            this.p.d = ((PoiOrderPreviewResult) this.c).couponInfoList;
            this.p.e = ((PoiOrderPreviewResult) this.c).realShippingFee >= 0.0d ? ((PoiOrderPreviewResult) this.c).realShippingFee : 0.0d;
            this.p.f = ((PoiOrderPreviewResult) this.c).bizLine;
            return;
        }
        this.p.b = -1L;
        this.p.c = "";
        this.p.d = null;
        this.p.e = 0.0d;
        this.p.f = "";
    }
}
