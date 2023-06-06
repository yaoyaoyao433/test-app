package com.sankuai.waimai.bussiness.order.crossconfirm.block.floatpoisign;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a<MultiPoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    public int p;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950ffaef9dee7bf4389fb498a1ad556c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950ffaef9dee7bf4389fb498a1ad556c");
        } else {
            this.p = 0;
        }
    }

    public final int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cab53aa6d1182f2fbac9ec289c768b3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cab53aa6d1182f2fbac9ec289c768b3e")).intValue();
        }
        if (this.c == 0 || ((MultiPoiOrderPreviewResult) this.c).poiOrders == null) {
            return 0;
        }
        return ((MultiPoiOrderPreviewResult) this.c).poiOrders.size();
    }
}
