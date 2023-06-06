package com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantinfo;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10589fec7389822fd2cfc27f9974746b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10589fec7389822fd2cfc27f9974746b");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "185c179fcb5a91e136e02f256fe80e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "185c179fcb5a91e136e02f256fe80e2e");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.b = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiName : null;
            this.p.c = false;
            this.p.d = ((PoiOrderPreviewResult) this.c).deliveryTypeIcon;
            this.p.e = ((PoiOrderPreviewResult) this.c).deliveryType;
            this.p.f = ((PoiOrderPreviewResult) this.c).appDeliveryTipExplain;
            return;
        }
        this.p.b = null;
        this.p.c = false;
        this.p.d = null;
        this.p.e = 0;
        this.p.f = null;
    }
}
