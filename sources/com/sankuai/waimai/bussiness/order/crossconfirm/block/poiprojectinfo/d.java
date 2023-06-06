package com.sankuai.waimai.bussiness.order.crossconfirm.block.poiprojectinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPoiResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewPoiResult> {
    public static ChangeQuickRedirect o;
    c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9240fd74a1f0bfe8e55e683d71dccbed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9240fd74a1f0bfe8e55e683d71dccbed");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1ca86c6de4123ba9defed3e672710c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1ca86c6de4123ba9defed3e672710c");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = ((PoiOrderPreviewPoiResult) this.c).poiProjectDescription;
            this.p.b = ((PoiOrderPreviewPoiResult) this.c).poiProjectDescriptionUrl;
            return;
        }
        this.p.b = "";
        this.p.a = "";
    }
}
