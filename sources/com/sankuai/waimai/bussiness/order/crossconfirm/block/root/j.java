package com.sankuai.waimai.bussiness.order.crossconfirm.block.root;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends com.meituan.android.cube.pga.viewmodel.a<MultiPoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;

    public final int a(PoiOrderPreviewResult poiOrderPreviewResult) {
        Object[] objArr = {poiOrderPreviewResult};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e988b1cea5c25d8ef9863d65a18f384b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e988b1cea5c25d8ef9863d65a18f384b")).intValue() : ((MultiPoiOrderPreviewResult) this.c).poiOrders.indexOf(poiOrderPreviewResult);
    }
}
