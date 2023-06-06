package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.goods.list.delegate.c;
import com.sankuai.waimai.store.goods.list.views.cell.view.SupportSCPhysicalMainCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.sankuai.waimai.store.newwidgets.list.g<GoodsSpu, com.sankuai.waimai.store.goods.list.delegate.c> implements View.OnClickListener, c.a {
    public static ChangeQuickRedirect a;
    int b;
    private SupportSCPhysicalMainCellView c;
    private com.sankuai.waimai.store.cell.core.b d;
    private com.sankuai.waimai.store.goods.list.delegate.impl.c e;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(GoodsSpu goodsSpu, int i) {
        GoodsSpu goodsSpu2 = goodsSpu;
        Object[] objArr = {goodsSpu2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5198c7a238d3fe73ebbabc070c6bd1f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5198c7a238d3fe73ebbabc070c6bd1f9");
            return;
        }
        GoodsPoiCategory a2 = ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).a();
        Object[] objArr2 = {goodsSpu2, a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f88127f0662c5a9b23327bafb1ce6cac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f88127f0662c5a9b23327bafb1ce6cac");
        } else if (p.a(goodsSpu2, a2)) {
        } else {
            boolean z = ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).e().getChosenSpuId() == goodsSpu2.getId() && a2.isSelected();
            this.c.a(z, ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).e().getChosenSpuNeedAdd());
            if (z && ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).e().getChosenSpuNeedAdd()) {
                ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).e().setChosenSpu(((com.sankuai.waimai.store.goods.list.delegate.c) this.o).e().getChosenSpuId(), false);
            }
            CellUiConfig a3 = CellUiConfig.a();
            a3.c = true;
            if (this.b != 1) {
                if (this.b == 2) {
                    if (i == 0) {
                        a3.e = 2;
                    } else if (i == 1) {
                        a3.e = 3;
                    }
                } else if (i != 0) {
                    if (i == this.b - 1) {
                        a3.e = 3;
                    } else {
                        a3.e = 0;
                    }
                } else {
                    a3.e = 2;
                }
            } else {
                a3.e = 1;
            }
            this.c.setCellConfig(a3);
            this.c.a(goodsSpu2, i, this.b);
            long j = a2.floorId;
            int b = ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).b();
            Object[] objArr3 = {goodsSpu2, new Long(j), Integer.valueOf(i), Integer.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b474e7a3031cc7d74fd33b20ba6dd4fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b474e7a3031cc7d74fd33b20ba6dd4fe");
                return;
            }
            int i2 = 0;
            if (this.o != 0 && ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).c() != null && k.b(((com.sankuai.waimai.store.goods.list.delegate.c) this.o).c().b, goodsSpu2) != null) {
                i2 = 1;
            }
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_xk7c3zbh", this.c);
            bVar.e = String.valueOf(goodsSpu2.getId());
            bVar.a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu2)).a("spu_id", Long.valueOf(goodsSpu2.getId())).a("product_id", Long.valueOf(goodsSpu2.getId())).a("sg_spu_tag", Integer.valueOf(goodsSpu2.isFreeget ? 1 : 0)).a("activity_id", goodsSpu2.isFreeget ? goodsSpu2.activityID : "").a("food_activity_type", Integer.valueOf(goodsSpu2.activityType)).a("product_index", Integer.valueOf(i)).a("poi_id", ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).c().d()).a("floor_id", Long.valueOf(j)).a("floor_index", Integer.valueOf(b)).a("final_price", Integer.valueOf(i2)).a("stid", com.sankuai.waimai.store.util.j.a(goodsSpu2.getPicture())).a("spu_search_type", Integer.valueOf(goodsSpu2.spuSearchType));
            com.sankuai.waimai.store.expose.v2.b.a().a(((com.sankuai.waimai.store.goods.list.delegate.c) this.o).d(), bVar);
        }
    }

    public i(com.sankuai.waimai.store.goods.list.delegate.impl.c cVar, com.sankuai.waimai.store.cell.core.b bVar, int i) {
        Object[] objArr = {cVar, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9010f088b35c776c1cafa23fab48dd4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9010f088b35c776c1cafa23fab48dd4b");
            return;
        }
        this.d = bVar;
        this.b = i;
        this.e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53e5e7764395b21d4207537d5c6a4a4", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53e5e7764395b21d4207537d5c6a4a4");
        } else {
            this.c.onClick(view);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f44161ca753b57219d143daac5e84603", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f44161ca753b57219d143daac5e84603");
        }
        this.c = new SupportSCPhysicalMainCellView(this.e) { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.i.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
            public final int getLayoutId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5aa2d3bb2a54242c1df70c5a33914ea", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5aa2d3bb2a54242c1df70c5a33914ea")).intValue();
                }
                int i = i.this.b;
                return (i >= 4 || i == 3) ? R.layout.wm_st_poi_market_hot_sale_cell : R.layout.wm_st_poi_market_hot_sale_cell_1;
            }
        };
        return this.c;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "988199823bd071ecaf3a7623d279985f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "988199823bd071ecaf3a7623d279985f");
            return;
        }
        this.c = (SupportSCPhysicalMainCellView) view;
        this.c.setPoiHelper(((com.sankuai.waimai.store.goods.list.delegate.c) this.o).c());
        this.c.setActionCallback(this.d);
        ((com.sankuai.waimai.store.goods.list.delegate.c) this.o).a(this);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.c.a
    public final void bn_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4e032ace44e8fa288637e905f2ecda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4e032ace44e8fa288637e905f2ecda");
        } else {
            this.c.ba_();
        }
    }
}
