package com.sankuai.waimai.bussiness.order.crossconfirm.block.closeinfo;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1dd4ca3cee9e7ca7b793d1dd83787b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1dd4ca3cee9e7ca7b793d1dd83787b9");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38aa73f70e18871b8d1ce9827d5ffa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38aa73f70e18871b8d1ce9827d5ffa7");
            return;
        }
        super.d();
        if (this.c != 0) {
            this.p.a = null;
            this.p.b = ((PoiOrderPreviewPoiResult) this.c).poiCloseNotification;
            this.p.c = 0;
            return;
        }
        this.p.a = null;
        this.p.b = null;
        this.p.c = 0;
    }
}
