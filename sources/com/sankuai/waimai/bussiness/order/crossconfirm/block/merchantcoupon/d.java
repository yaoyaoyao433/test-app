package com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1068320adf4b5f819deedb854b4de6d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1068320adf4b5f819deedb854b4de6d6");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1d30f14fd975a160dbc5ffdf30c7243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1d30f14fd975a160dbc5ffdf30c7243");
            return;
        }
        super.d();
        this.p.a = true;
        if (this.c != 0) {
            this.p.b = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.c = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr : "";
            this.p.d = ((PoiOrderPreviewResult) this.c).canUseCouponPrice;
            this.p.e = ((PoiOrderPreviewResult) this.c).couponInfoList;
            ((PoiOrderPreviewResult) this.c).extendsInfo.activityInfo = ((PoiOrderPreviewResult) this.c).extendsInfo.activityInfoForCoupon;
            this.p.i = ((PoiOrderPreviewResult) this.c).extendsInfo;
            if (((PoiOrderPreviewResult) this.c).poiInfo != null) {
                this.p.h = ((PoiOrderPreviewResult) this.c).poiInfo.bizType;
                return;
            }
            return;
        }
        this.p.b = -1L;
        this.p.c = "";
        this.p.d = 0.0d;
        this.p.e = null;
    }
}
