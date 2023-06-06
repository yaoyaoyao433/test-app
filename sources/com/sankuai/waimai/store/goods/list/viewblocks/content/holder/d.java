package com.sankuai.waimai.store.goods.list.viewblocks.content.holder;

import android.view.View;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.goods.list.views.floor.GuessLikeFloorView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.h;
import com.sankuai.waimai.store.util.j;
import com.sankuai.waimai.store.util.k;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends e implements GuessLikeFloorView.a {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.store.expose.v2.entity.b b;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    public GuessLikeFloorView d;
    private final com.sankuai.waimai.store.goods.list.delegate.d e;
    private a.InterfaceC1266a f;

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, h hVar, int i) {
    }

    public d(com.sankuai.waimai.store.goods.list.delegate.d dVar, a.InterfaceC1266a interfaceC1266a) {
        super(new GuessLikeFloorView(dVar));
        Object[] objArr = {dVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f8f5a4a916a611678da6ec02ceb29a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f8f5a4a916a611678da6ec02ceb29a5");
            return;
        }
        this.e = dVar;
        this.f = interfaceC1266a;
        this.c = dVar.d();
        this.d = (GuessLikeFloorView) this.itemView;
        this.d.setPoiHelper(this.c);
        this.b = new com.sankuai.waimai.store.expose.v2.entity.b("b_uzunod3r", this.d);
        com.sankuai.waimai.store.expose.v2.b.a().a(this.e.k(), this.b);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "334e771a85f9507d3a1d60da0e9eaeee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "334e771a85f9507d3a1d60da0e9eaeee");
        } else if (p.a(goodsSpu, this.c)) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.e.b(), "b_b166zz9x").a(this.e.k()).a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu)).a("poi_id", this.c.d()).a("spu_id", Long.valueOf(goodsSpu.getId())).a("product_id", Long.valueOf(goodsSpu.getId())).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(k.b(this.c.b, goodsSpu) == null ? 0 : 1)).a("sg_spu_tag", Integer.valueOf(goodsSpu.isFreeget ? 1 : 0)).a("activity_id", goodsSpu.isFreeget ? goodsSpu.activityID : "").a("food_activity_type", Integer.valueOf(goodsSpu.activityType)).a("stid", j.a(goodsSpu.getPicture())).a();
            g.a(this.e.k(), goodsSpu, this.c.b, hVar);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2f3bdf3327310b14fdde6da60de107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2f3bdf3327310b14fdde6da60de107");
        } else if (p.a(this.f)) {
        } else {
            try {
                com.sankuai.waimai.store.manager.judas.b.a(this.e.b(), "b_mc0fv5y1").a(this.e.k()).a("poi_id", this.c.d()).a("spu_id", Long.valueOf(goodsSpu.getId())).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("product_index", Integer.valueOf(i)).a();
                this.e.a(this.e.k(), goodsSpu, null);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd38557a8b87d9aa2ac0a111ab81d0ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd38557a8b87d9aa2ac0a111ab81d0ca");
        } else if (p.a(goodsSpu, this.f) || this.c == null) {
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.e.b(), "b_iaj11du9").a(this.e.k()).a("sku_id", com.sankuai.waimai.store.helper.b.a(goodsSpu)).a("poi_id", this.c.d()).a("product_id", Long.valueOf(goodsSpu.getId())).a("spu_id", Long.valueOf(goodsSpu.getId())).a("product_index", Integer.valueOf(i)).a("final_price", Integer.valueOf(k.b(this.c.b, goodsSpu) != null ? 1 : 0)).a("stid", j.a(goodsSpu.getPicture())).a();
            this.e.a(this.e.k(), view, this.c.d(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "719512f4cce795ef80a8ce97e9077a99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "719512f4cce795ef80a8ce97e9077a99");
        } else {
            this.e.a(goodsSpu, this.e.d().b);
        }
    }
}
