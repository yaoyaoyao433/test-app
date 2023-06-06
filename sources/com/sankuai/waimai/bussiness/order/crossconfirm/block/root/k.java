package com.sankuai.waimai.bussiness.order.crossconfirm.block.root;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k extends com.meituan.android.cube.pga.viewmodel.a<MultiPoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb8277f42df60a882d2a34ce0de2413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb8277f42df60a882d2a34ce0de2413");
        } else {
            super.d();
        }
    }

    @Nullable
    public final List<PoiOrderPreviewResult> n() {
        if (this.c != 0) {
            return ((MultiPoiOrderPreviewResult) this.c).poiOrders;
        }
        return null;
    }

    public final List<Map<String, Object>> o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d19b507a97986c36464e45de25b11e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d19b507a97986c36464e45de25b11e");
        }
        if (this.c == 0 || com.sankuai.waimai.foundation.utils.b.b(((MultiPoiOrderPreviewResult) this.c).poiOrders)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (PoiOrderPreviewResult poiOrderPreviewResult : ((MultiPoiOrderPreviewResult) this.c).poiOrders) {
            if (poiOrderPreviewResult != null && poiOrderPreviewResult.poiInfo != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(poiOrderPreviewResult.poiInfo.poiId, poiOrderPreviewResult.poiInfo.poiIdStr));
                hashMap.put("order_mark", Integer.valueOf(poiOrderPreviewResult.isLargeOrderTag()));
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }
}
