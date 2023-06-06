package com.sankuai.waimai.bussiness.order.crossconfirm.block.root;

import android.support.v4.util.LongSparseArray;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderCouponParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.b<k, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect f;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ k L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb106985d5b42ceff682f22c5edf9b40", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb106985d5b42ceff682f22c5edf9b40") : new k();
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed0b209f133d6f3141ffb7433c135a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed0b209f133d6f3141ffb7433c135a2");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f237c97d283db311cd028b5fff829410", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f237c97d283db311cd028b5fff829410");
            return;
        }
        super.s();
        F().u.b = new com.meituan.android.cube.pga.action.d<LongSparseArray<PoiOrderCouponParam>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ LongSparseArray<PoiOrderCouponParam> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a2ffbfb787a9bd806e48caeb794b0d8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (LongSparseArray) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a2ffbfb787a9bd806e48caeb794b0d8");
                }
                LongSparseArray<PoiOrderCouponParam> longSparseArray = new LongSparseArray<>(4);
                List<PoiOrderPreviewResult> n = ((k) a.this.n).n();
                if (n != null && n.size() > 0) {
                    for (PoiOrderPreviewResult poiOrderPreviewResult : n) {
                        if (poiOrderPreviewResult != null && poiOrderPreviewResult.poiInfo != null) {
                            long j = poiOrderPreviewResult.poiInfo.poiId;
                            PoiOrderCouponParam poiOrderCouponParam = new PoiOrderCouponParam();
                            a.this.F().z.a((com.meituan.android.cube.pga.common.b<i.c<Long, PoiOrderCouponParam>>) com.meituan.android.cube.pga.common.i.a(Long.valueOf(j), poiOrderCouponParam));
                            longSparseArray.append(j, poiOrderCouponParam);
                        }
                    }
                }
                return longSparseArray;
            }
        };
        F().w.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cb28ab25cfd4faa81c19004c713c455", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cb28ab25cfd4faa81c19004c713c455") : ((k) a.this.n).o();
            }
        };
    }
}
