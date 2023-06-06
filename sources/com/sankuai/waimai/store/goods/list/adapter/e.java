package com.sankuai.waimai.store.goods.list.adapter;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.goods.list.views.cell.view.DrugSupportMainCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.k;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.widgets.recycler.a<com.sankuai.waimai.store.widgets.recycler.e> {
    public static ChangeQuickRedirect a;
    GoodsPoiCategory b;
    public ArrayList<GoodsSpu> c;
    long d;
    boolean e;
    int f;
    private final com.sankuai.waimai.store.goods.list.delegate.impl.c g;
    private com.sankuai.waimai.store.cell.core.b h;

    public e(com.sankuai.waimai.store.goods.list.delegate.impl.c cVar, com.sankuai.waimai.store.cell.core.b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb163d277f91985b078a28bed4b118e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb163d277f91985b078a28bed4b118e");
            return;
        }
        this.c = new ArrayList<>();
        this.g = cVar;
        this.h = bVar;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4873c628093b49d0ad752c09c93dd56", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4873c628093b49d0ad752c09c93dd56") : new com.sankuai.waimai.store.goods.list.viewblocks.content.holder.a(this.g, this.h, this.f, a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, byte] */
    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(com.sankuai.waimai.store.widgets.recycler.e eVar, int i) {
        boolean z;
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4a4e2a551f7d699f6812f87464154d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4a4e2a551f7d699f6812f87464154d");
            return;
        }
        GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        if (goodsSpu == null || this.b == null) {
            return;
        }
        ?? r1 = (goodsSpu.getId() == this.d && this.b.isSelected()) ? 1 : 0;
        com.sankuai.waimai.store.goods.list.viewblocks.content.holder.a aVar = (com.sankuai.waimai.store.goods.list.viewblocks.content.holder.a) eVar;
        long j = this.b.floorId;
        boolean z2 = this.e;
        Object[] objArr2 = {goodsSpu, new Long(j), Integer.valueOf(i), Byte.valueOf((byte) r1), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.content.holder.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "60a505f170fcfce060f187529806e9f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "60a505f170fcfce060f187529806e9f2");
        } else if (p.a(goodsSpu) || aVar.d == null) {
        } else {
            aVar.c.a((boolean) r1, z2);
            CellUiConfig a2 = CellUiConfig.a();
            a2.c = true;
            DrugSupportMainCellView drugSupportMainCellView = aVar.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = DrugSupportMainCellView.c;
            if (PatchProxy.isSupport(objArr3, drugSupportMainCellView, changeQuickRedirect3, false, "f7ff592946325d5b48b5f6cbe19593de", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, drugSupportMainCellView, changeQuickRedirect3, false, "f7ff592946325d5b48b5f6cbe19593de")).booleanValue();
            } else {
                z = drugSupportMainCellView.d.t() && drugSupportMainCellView.i >= 3;
            }
            if (z) {
                a2.d = 1;
            }
            aVar.c.setCellConfig(a2);
            aVar.c.setHasLabelOrHandPrice(aVar.d.b());
            aVar.c.a(goodsSpu, i, aVar.e);
            Object[] objArr4 = {goodsSpu, new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.list.viewblocks.content.holder.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "4f355635b33419f04e7fdcf6f1b96e77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "4f355635b33419f04e7fdcf6f1b96e77");
            } else if (aVar.d == null || aVar.d.c() == null || goodsSpu == null) {
            } else {
                com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_xk7c3zbh", aVar.c);
                bVar.e = String.valueOf(goodsSpu.getId());
                bVar.a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu)).a("spu_id", Long.valueOf(goodsSpu.getId())).a("product_id", Long.valueOf(goodsSpu.getId())).a("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0)).a("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "").a("food_activity_type", Integer.valueOf(goodsSpu.activityType)).a("product_index", Integer.valueOf(i)).a("poi_id", aVar.d.c().d()).a("floor_id", Long.valueOf(j)).a("floor_index", Integer.valueOf(aVar.b)).a("final_price", Integer.valueOf(k.b(aVar.d.c().b, goodsSpu) == null ? 0 : 1)).a("spu_tag", k.b(aVar.d.c().b, goodsSpu, null)).a("stid", t.a(aVar.a(goodsSpu)) ? "-999" : aVar.a(goodsSpu)).a("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType));
                com.sankuai.waimai.store.expose.v2.b.a().a(aVar.d.d(), bVar);
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f89cea9fad52bedd1bb7236378bc1862", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f89cea9fad52bedd1bb7236378bc1862")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.c);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b1b3b72b2de0f666c923dfc45847af0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b1b3b72b2de0f666c923dfc45847af0")).intValue();
        }
        switch (a()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 4;
        }
    }
}
