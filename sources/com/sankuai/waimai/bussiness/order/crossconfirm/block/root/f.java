package com.sankuai.waimai.bussiness.order.crossconfirm.block.root;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.meituan.android.cube.pga.viewmodel.a<MultiPoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9274cfa72db8a7681a0ae222875b46c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9274cfa72db8a7681a0ae222875b46c0");
        } else {
            super.d();
        }
    }
}
