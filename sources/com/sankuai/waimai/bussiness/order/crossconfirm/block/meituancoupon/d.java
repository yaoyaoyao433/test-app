package com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c57ea3c2a3e0083930ef2fcf13b5940", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c57ea3c2a3e0083930ef2fcf13b5940");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0230009a56f1a4e105680ac5d0c4e224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0230009a56f1a4e105680ac5d0c4e224");
            return;
        }
        super.d();
        this.p.a = true;
        if (this.c != 0) {
            this.p.b = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.c = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr : "";
            this.p.e = ((PoiOrderPreviewResult) this.c).couponInfoList;
            this.p.f = ((PoiOrderPreviewResult) this.c).canUseCouponPrice;
            this.p.g = null;
            this.p.h = null;
            return;
        }
        this.p.b = -1L;
        this.p.c = "";
        this.p.e = null;
        this.p.f = 0.0d;
        this.p.g = null;
        this.p.h = null;
    }
}
