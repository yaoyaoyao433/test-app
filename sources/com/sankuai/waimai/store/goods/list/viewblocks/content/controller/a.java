package com.sankuai.waimai.store.goods.list.viewblocks.content.controller;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.cell.core.b;
import com.sankuai.waimai.store.goods.list.adapter.e;
import com.sankuai.waimai.store.goods.list.delegate.impl.c;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.router.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public c b;
    public e c;
    public LinearLayoutManager d;
    public RecyclerView e;
    public View f;
    public TextView g;
    public ImageView h;
    public b i;
    public GoodsPoiCategory j;
    public int k;
    public com.sankuai.waimai.store.expose.v2.entity.b l;

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "159162f7e8df087763becd5d7bf9ff47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "159162f7e8df087763becd5d7bf9ff47");
        } else if (p.a(aVar.j) || aVar.b == null || aVar.b.c() == null) {
        } else {
            if (i == 1) {
                com.sankuai.waimai.store.manager.judas.b.c(aVar.b.f(), "b_7ql4i0d7").a(AppUtil.generatePageInfoKey(aVar.b.d())).a("poi_id", aVar.b.c().d()).a("floor_id", Long.valueOf(aVar.j.floorId)).a("floor_index", Integer.valueOf(aVar.k)).a("stid", aVar.b()).a("type", 3).a();
            } else {
                com.sankuai.waimai.store.manager.judas.b.a(aVar.b.f(), "b_7ql4i0d7").a(AppUtil.generatePageInfoKey(aVar.b.d())).a("poi_id", aVar.b.c().d()).a("floor_id", Long.valueOf(aVar.j.floorId)).a("floor_index", Integer.valueOf(aVar.k)).a("stid", aVar.b()).a("type", 2).a();
            }
            d.a(aVar.b.d(), aVar.j.scheme);
        }
    }

    public a(c cVar, b bVar) {
        Object[] objArr = {cVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab8e278d69569dad76884dac3112797", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab8e278d69569dad76884dac3112797");
            return;
        }
        this.b = cVar;
        this.i = bVar;
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc0c4bcc4ca5cdd4fb86dbeae84e6b53", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc0c4bcc4ca5cdd4fb86dbeae84e6b53")).booleanValue() : this.b.c() == null || !this.b.c().t();
    }

    String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1716213468b760bc461463e0644a8674", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1716213468b760bc461463e0644a8674") : (this.b == null || this.b.c() == null || this.b.c().b == null || t.a(this.b.c().b.abExpInfo)) ? "-999" : this.b.c().b.abExpInfo;
    }
}
