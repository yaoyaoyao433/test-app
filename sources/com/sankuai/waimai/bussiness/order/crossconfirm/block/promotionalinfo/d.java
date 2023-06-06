package com.sankuai.waimai.bussiness.order.crossconfirm.block.promotionalinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abac718c22d538955aa282f96c79255e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abac718c22d538955aa282f96c79255e");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d051dc834c2de076a94c2dec5671919", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d051dc834c2de076a94c2dec5671919");
            return;
        }
        super.d();
        this.p.a = true;
        if (this.c != 0) {
            this.p.b = ((PoiOrderPreviewResult) this.c).originalPrice;
            this.p.c = ((PoiOrderPreviewResult) this.c).actualPayTotal;
            this.p.d = ((PoiOrderPreviewResult) this.c).totalDiscountPrice;
            this.p.f = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.g = ((PoiOrderPreviewResult) this.c).poiInfo == null ? "" : ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr;
            return;
        }
        this.p.b = 0.0d;
        this.p.c = 0.0d;
        this.p.d = 0.0d;
        this.p.f = -1L;
        this.p.g = "";
    }
}
