package com.sankuai.waimai.store.goods.list.viewblocks.content.holder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.views.sale.OnSaleView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.g;
import com.sankuai.waimai.store.util.h;
import com.sankuai.waimai.store.util.j;
import com.sankuai.waimai.store.util.k;
import com.sankuai.waimai.store.widgets.recycler.e;
import com.sankuai.waimai.store.widgets.recycler.l;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends e implements com.sankuai.waimai.store.cell.core.b, com.sankuai.waimai.store.goods.list.delegate.impl.c {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.store.expose.v2.entity.b b;
    public final com.sankuai.waimai.store.expose.v2.entity.b c;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    public int e;
    public GoodsPoiCategory f;
    public g g;
    public com.sankuai.waimai.store.goods.list.delegate.d h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public ImageView m;
    public OnSaleView n;
    public com.sankuai.waimai.store.goods.list.viewblocks.content.controller.a o;
    public int p;
    private final String q;
    private a.InterfaceC1266a r;

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, h hVar, int i) {
    }

    public b(View view, com.sankuai.waimai.store.goods.list.delegate.d dVar, a.InterfaceC1266a interfaceC1266a) {
        super(view);
        Object[] objArr = {view, dVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f1553ee48feb80a3c60a128e79a089a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f1553ee48feb80a3c60a128e79a089a");
            return;
        }
        this.q = "MarketFloorViewHolder";
        this.h = dVar;
        this.r = interfaceC1266a;
        this.d = dVar.d();
        this.b = new com.sankuai.waimai.store.expose.v2.entity.b("b_qowv75gj", this.itemView);
        com.sankuai.waimai.store.expose.v2.b.a().a(dVar.k(), this.b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea8da2d9200729c78381f048878e13b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea8da2d9200729c78381f048878e13b0");
        } else {
            this.o = new com.sankuai.waimai.store.goods.list.viewblocks.content.controller.a(this, this);
            this.i = (TextView) a(R.id.wm_sc_tv_floor_title);
            this.k = (TextView) a(R.id.wm_sc_tv_tip);
            this.l = (TextView) a(R.id.describe);
            this.m = (ImageView) a(R.id.wm_sc_iv_bg);
            this.j = (TextView) a(R.id.wm_sc_tv_more);
            this.n = (OnSaleView) a(R.id.on_sale_view);
            final com.sankuai.waimai.store.goods.list.viewblocks.content.controller.a aVar = this.o;
            View view2 = this.itemView;
            Object[] objArr3 = {view2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.viewblocks.content.controller.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b70f5b3ee8f589b88343828b63382433", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b70f5b3ee8f589b88343828b63382433");
            } else {
                aVar.e = (RecyclerView) view2.findViewById(R.id.list_floor_food);
                aVar.d = new LinearLayoutManager(aVar.b.d());
                aVar.d.setOrientation(0);
                aVar.e.setLayoutManager(aVar.d);
                aVar.e.setNestedScrollingEnabled(false);
                aVar.c = new com.sankuai.waimai.store.goods.list.adapter.e(aVar.b, aVar.i);
                aVar.c.z = 0;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.list.viewblocks.content.controller.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "44f686d6cb06edbcdc552138f1c7d5f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "44f686d6cb06edbcdc552138f1c7d5f2");
                } else if (aVar.a()) {
                    aVar.f = LayoutInflater.from(aVar.b.d()).inflate(R.layout.wm_sc_goods_list_floor_more, (ViewGroup) null, false);
                    aVar.l = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_bcx85pqp_mv", aVar.f);
                    aVar.g = (TextView) aVar.f.findViewById(R.id.txt_floor_more);
                    aVar.h = (ImageView) aVar.f.findViewById(R.id.txt_floor_more_of_image);
                    aVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.content.controller.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Object[] objArr5 = {view3};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "724f469ac9147d976059f51be3fb0021", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "724f469ac9147d976059f51be3fb0021");
                            } else {
                                a.a(aVar, 2);
                            }
                        }
                    });
                    aVar.c.d(aVar.f);
                }
                aVar.e.setAdapter(new l(aVar.c));
            }
        }
        this.c = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_bcx85pqp_mv", this.j);
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66151242b7e18c54ccdd970d54d82f56", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66151242b7e18c54ccdd970d54d82f56") : (this.d == null || this.d.b == null || t.a(this.d.b.abExpInfo)) ? "" : this.d.b.abExpInfo;
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cfa9c3b73d3ae1f372b020c2972e38b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cfa9c3b73d3ae1f372b020c2972e38b");
        } else if (goodsSpu == null || this.d == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.h.b(), "b_o4cmatay").a(this.h.k()).a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu)).a("poi_id", this.d.d()).a("floor_id", Long.valueOf(this.f == null ? -1L : this.f.floorId)).a("floor_index", Integer.valueOf(this.e)).a("spu_id", Long.valueOf(goodsSpu.getId())).a("product_id", Long.valueOf(goodsSpu.getId())).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(k.b(this.d.b, goodsSpu) != null ? 1 : 0)).a("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0)).a("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "").a("food_activity_type", Integer.valueOf(goodsSpu.activityType)).a("stid", t.a(b(goodsSpu)) ? "-999" : b(goodsSpu)).a("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType)).a();
            com.sankuai.waimai.store.router.g.a(this.h.k(), goodsSpu, this.d.b, hVar);
        }
    }

    private String b(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "466b8513bfe065fa75422a8c35c3bc0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "466b8513bfe065fa75422a8c35c3bc0e");
        }
        String a2 = j.a(goodsSpu.getPicture());
        if (TextUtils.isEmpty(a2)) {
            return a();
        }
        return a2 + ";" + a();
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1744ee2f09f20ae2ccd67cf5bb146b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1744ee2f09f20ae2ccd67cf5bb146b3");
        } else if (this.r != null) {
            try {
                com.sankuai.waimai.store.manager.judas.b.a(this.h.b(), "b_i14jpkmy").a(this.h.k()).a("poi_id", this.d.d()).a("floor_id", Long.valueOf(this.f.floorId)).a("floor_index", Integer.valueOf(this.e)).a("spu_id", Long.valueOf(goodsSpu.getId())).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("product_index", Integer.valueOf(i)).a();
                this.h.a(this.h.k(), goodsSpu, null);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec315de5ce1605962811475ae90260f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec315de5ce1605962811475ae90260f");
        } else if (this.d == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.h.b(), "b_fvpawmpp").a(this.h.k()).a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu)).a("poi_id", this.d.d()).a("floor_id", Long.valueOf(this.f == null ? -1L : this.f.floorId)).a("floor_index", Integer.valueOf(this.e)).a("spu_id", Long.valueOf(goodsSpu.getId())).a("product_id", Long.valueOf(goodsSpu.getId())).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(k.b(this.d.b, goodsSpu) != null ? 1 : 0)).a("spu_search_type", Integer.valueOf(goodsSpu.spuSearchType)).a("stid", t.a(b(goodsSpu)) ? "-999" : b(goodsSpu)).a();
            this.h.a(this.h.k(), view, this.d.d(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8d392d93ad42a3147548414fdc38c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8d392d93ad42a3147548414fdc38c2")).booleanValue();
        }
        if (p.a(this.g)) {
            return true;
        }
        return this.g.i;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a957a24c4f7b010de3fd671bfb02c8", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a957a24c4f7b010de3fd671bfb02c8") : this.h.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final SCBaseActivity d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ae1d04eed3130e9e91bb19463f024b", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ae1d04eed3130e9e91bb19463f024b") : this.h.k();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final com.sankuai.shangou.stone.whiteboard.e e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04805dec93360a171984427c57c529cc", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04805dec93360a171984427c57c529cc") : this.h.m();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.c
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7294d725485890b34c980d166f8bb59e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7294d725485890b34c980d166f8bb59e") : this.h.b();
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f744d7c9462eae8fe7ccd3726086a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f744d7c9462eae8fe7ccd3726086a2");
        } else {
            this.h.a(goodsSpu, c().b);
        }
    }
}
