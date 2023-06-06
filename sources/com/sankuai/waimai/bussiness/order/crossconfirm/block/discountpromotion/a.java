package com.sankuai.waimai.bussiness.order.crossconfirm.block.discountpromotion;

import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.CollectOrder;
import com.sankuai.waimai.bussiness.order.confirm.adapter.c;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPoiResult;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    public static /* synthetic */ void a(a aVar, int i, double d, double d2, double d3, List list, double d4) {
        Object[] objArr = {4, Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(d3), list, Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "7cf8611a81622d584c9eec7c4c73b8b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "7cf8611a81622d584c9eec7c4c73b8b8");
        } else if (aVar.n != 0) {
            long j = ((d) aVar.n).p.b;
            String str = ((d) aVar.n).p.c;
            ArrayList arrayList = new ArrayList();
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) aVar.F()).al.a((com.meituan.android.cube.pga.common.b<i.c<Long, List<OrderedFood>>>) i.a(Long.valueOf(j), arrayList));
            PoiOrderPreviewPoiResult poiOrderPreviewPoiResult = ((d) aVar.n).e().poiInfo;
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) aVar.F()).Y.a(new CollectOrderFoodParams(4, 0.0d, ((d) aVar.n).n(), 0.0d, d3, j, str, arrayList, list, d4, poiOrderPreviewPoiResult == null ? 0L : poiOrderPreviewPoiResult.poiFirstCateId));
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ec836625245e2002c3a2697c4179a4", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ec836625245e2002c3a2697c4179a4") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e9400c4c429403b8ba38b2ce9abf887", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e9400c4c429403b8ba38b2ce9abf887") : new b(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e829bde751135da5db6e3e09ce53f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e829bde751135da5db6e3e09ce53f5");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7027ad79dffef27d0d702dfb2f02e92e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7027ad79dffef27d0d702dfb2f02e92e");
            return;
        }
        super.s();
        b bVar = (b) this.g;
        c.b bVar2 = new c.b() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.discountpromotion.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.adapter.c.b
            public final void a(double d, double d2, List<CollectOrder.DiscountStageInfo> list) {
                Object[] objArr2 = {Double.valueOf(d), Double.valueOf(d2), list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba48d1c4eded2a38a432679bc00a3f65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba48d1c4eded2a38a432679bc00a3f65");
                } else {
                    a.a(a.this, 4, 0.0d, 0.0d, d, list, d2);
                }
            }
        };
        Object[] objArr2 = {bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6b008e07e3800fa84ed6e064c83fdd56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6b008e07e3800fa84ed6e064c83fdd56");
            return;
        }
        bVar.g = bVar2;
        if (bVar.f != null) {
            bVar.f.e = bVar.g;
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cb95af857ae2fd5c6f97e9d8651678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cb95af857ae2fd5c6f97e9d8651678");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2aed14ad62756998f1d2b57a598fe21c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2aed14ad62756998f1d2b57a598fe21c");
            return;
        }
        if (cVar.e == null || cVar.e.size() <= 0) {
            bVar.e.setVisibility(8);
        } else {
            bVar.e.setVisibility(0);
        }
        bVar.a(cVar.e, cVar.b, cVar.c);
    }
}
