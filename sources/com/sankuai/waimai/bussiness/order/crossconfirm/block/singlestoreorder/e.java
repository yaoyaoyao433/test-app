package com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import com.sankuai.waimai.foundation.utils.aa;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    d p;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876cec34decf66b119f45585f06273d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876cec34decf66b119f45585f06273d4");
        } else {
            this.p = new d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb10c76d50dbc5f3ef101bc1660b5da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb10c76d50dbc5f3ef101bc1660b5da");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.b = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr : "";
            this.p.c = ((PoiOrderPreviewResult) this.c).orderToken;
            this.p.d = ((PoiOrderPreviewResult) this.c).poiInfo;
            this.p.e = ((PoiOrderPreviewResult) this.c).templateType;
            this.p.f = (((PoiOrderPreviewResult) this.c).extendsInfo == null || aa.a(((PoiOrderPreviewResult) this.c).extendsInfo.activityInfoForCoupon)) ? "" : ((PoiOrderPreviewResult) this.c).extendsInfo.activityInfoForCoupon;
            this.p.g = ((PoiOrderPreviewResult) this.c).canUseCouponPrice;
            this.p.h = ((PoiOrderPreviewResult) this.c).total;
            this.p.i = ((PoiOrderPreviewResult) this.c).originalPrice;
            this.p.j = ((PoiOrderPreviewResult) this.c).foodList;
            this.p.k = ((PoiOrderPreviewResult) this.c).index;
            return;
        }
        this.p.a = -1L;
        this.p.b = "";
        this.p.c = null;
        this.p.d = null;
        this.p.e = 0;
        this.p.f = "";
        this.p.g = 0.0d;
        this.p.h = 0.0d;
        this.p.i = 0.0d;
        this.p.j = null;
        this.p.k = -1;
    }
}
