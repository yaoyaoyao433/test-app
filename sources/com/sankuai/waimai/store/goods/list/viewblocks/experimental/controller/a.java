package com.sankuai.waimai.store.goods.list.viewblocks.experimental.controller;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.delegate.c;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter.b;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.router.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a b;
    public b c;
    public LinearLayoutManager d;
    public SCRecyclerView e;
    public View f;
    public TextView g;
    public com.sankuai.waimai.store.cell.core.b h;
    public GoodsPoiCategory i;
    public int j;
    public com.sankuai.waimai.store.goods.list.delegate.impl.c k;

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c4d28e4818aa07a0e1767071279dc3a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c4d28e4818aa07a0e1767071279dc3a0");
        } else if (p.a(aVar.i)) {
        } else {
            if (i == 1) {
                com.sankuai.waimai.store.manager.judas.b.c(aVar.b.k(), "b_7ql4i0d7").a(AppUtil.generatePageInfoKey(aVar.b.j())).a("poi_id", aVar.b.i().d()).a("floor_id", Long.valueOf(aVar.i.floorId)).a("floor_index", Integer.valueOf(aVar.j)).a("type", 3).a();
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(aVar.b.k(), "b_7ql4i0d7").a(AppUtil.generatePageInfoKey(aVar.b.j())).a("poi_id", aVar.b.i().d()).a("floor_id", Long.valueOf(aVar.i.floorId)).a("floor_index", Integer.valueOf(aVar.j)).a("type", 2).a();
            }
            d.a(aVar.b.j(), aVar.i.scheme);
        }
    }

    public a(com.sankuai.waimai.store.goods.list.delegate.impl.c cVar, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar, com.sankuai.waimai.store.cell.core.b bVar) {
        Object[] objArr = {cVar, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7d3079427440a5e7c5918b1db8ad45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7d3079427440a5e7c5918b1db8ad45");
            return;
        }
        this.b = aVar;
        this.k = cVar;
        this.h = bVar;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.c
    public final GoodsPoiCategory a() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.c
    public final int b() {
        return this.j;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.c
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17fb49ccb6a9ddb7fac92f20231f2f42", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17fb49ccb6a9ddb7fac92f20231f2f42") : this.b.i();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.c
    public final SCBaseActivity d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd17501e4719196f6b8d952febe7343", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd17501e4719196f6b8d952febe7343") : this.b.j();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.c
    public final void a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d7cdb077ec507b7674dc1faad2c918a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d7cdb077ec507b7674dc1faad2c918a");
        } else {
            this.b.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.c
    public final RestMenuResponse e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cad0bda1f8010d865929a5d82d7a9a9", RobustBitConfig.DEFAULT_VALUE) ? (RestMenuResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cad0bda1f8010d865929a5d82d7a9a9") : this.b.l();
    }
}
