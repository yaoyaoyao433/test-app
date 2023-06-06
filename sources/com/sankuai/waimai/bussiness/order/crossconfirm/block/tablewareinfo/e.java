package com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    d p;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83dee5c72fbb72391b91d5f661eb750", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83dee5c72fbb72391b91d5f661eb750");
        } else {
            this.p = new d();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa7cec5ac60dc7b2c853d93486e7489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa7cec5ac60dc7b2c853d93486e7489");
            return;
        }
        super.d();
        this.p.a = true;
        if (this.c != 0) {
            this.p.b = Long.valueOf(((PoiOrderPreviewResult) this.c).poiInfo.poiId);
            this.p.c = ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr;
            this.p.g = ((PoiOrderPreviewResult) this.c).dinersOptionList;
            this.p.i = ((PoiOrderPreviewResult) this.c).tablewareAdvocateTip;
            this.p.h = ((PoiOrderPreviewResult) this.c).tablewareTip;
            this.p.f = ((PoiOrderPreviewResult) this.c).tablewareSettingsInfo;
            this.p.j = ((PoiOrderPreviewResult) this.c).extendsInfo.previewOrderCallbackInfo;
            return;
        }
        this.p.b = -1L;
        this.p.c = "";
        this.p.g = null;
        this.p.i = null;
        this.p.h = null;
        this.p.f = null;
    }
}
