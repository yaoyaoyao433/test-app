package com.sankuai.waimai.bussiness.order.crossconfirm.block.publicawelfare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPoiResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewPoiResult> {
    public static ChangeQuickRedirect o;
    PoiOrderPreviewPoiResult p;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5317135d2c8196c8d7025ab998a93e2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5317135d2c8196c8d7025ab998a93e2d");
        } else {
            this.p = new PoiOrderPreviewPoiResult();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae47aa8d911564bb66da3c370c128ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae47aa8d911564bb66da3c370c128ccf");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.poiProjectIcon = ((PoiOrderPreviewPoiResult) this.c).poiProjectIcon;
            this.p.poiProjectDescription = ((PoiOrderPreviewPoiResult) this.c).poiProjectDescription;
            this.p.poiProjectDescriptionUrl = ((PoiOrderPreviewPoiResult) this.c).poiProjectDescriptionUrl;
            return;
        }
        this.p.poiProjectIcon = "";
        this.p.poiProjectDescription = "";
        this.p.poiProjectDescriptionUrl = "";
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9675fad6490f15374c8272e330b89265", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9675fad6490f15374c8272e330b89265");
        }
        if (this.c != 0 && ((PoiOrderPreviewPoiResult) this.c).poiProjectDescription != null && !((PoiOrderPreviewPoiResult) this.c).poiProjectDescription.equals("")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
