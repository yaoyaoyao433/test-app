package com.sankuai.waimai.store.poilist.viewholders;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.goods.list.views.cell.view.SpuFlowerCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.SpuInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.widgets.recycler.e {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.expose.v2.entity.b b;
    private SpuFlowerCellView c;
    private com.sankuai.waimai.store.param.a d;

    public d(SpuFlowerCellView spuFlowerCellView, com.sankuai.waimai.store.param.a aVar) {
        super(spuFlowerCellView);
        Object[] objArr = {spuFlowerCellView, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8ad853cc1d0a78734b71ec2d51ef7f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8ad853cc1d0a78734b71ec2d51ef7f4");
            return;
        }
        this.c = spuFlowerCellView;
        this.d = aVar;
        this.b = new com.sankuai.waimai.store.expose.v2.entity.b(aVar.G, "b_waimai_7s9v2dsb_mv", spuFlowerCellView);
        if (spuFlowerCellView.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) spuFlowerCellView.getContext(), this.b);
        }
    }

    public final void a(@NonNull SpuInfo spuInfo, int i) {
        Object[] objArr = {spuInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10cccee689b024a9df67b20b7cb3d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10cccee689b024a9df67b20b7cb3d8b");
            return;
        }
        this.c.a(spuInfo, i);
        if (p.a(spuInfo.poi, spuInfo.spu)) {
            return;
        }
        GoodsSpu goodsSpu = spuInfo.spu;
        Poi poi = spuInfo.poi;
        String str = this.d.l.get(this.d.f);
        com.sankuai.waimai.store.expose.v2.entity.b bVar = this.b;
        bVar.e = "b_waimai_7s9v2dsb_mv_" + i + CommonConstant.Symbol.UNDERLINE + spuInfo.hashCode();
        com.sankuai.waimai.store.expose.v2.entity.b a2 = bVar.a("poi_id", poi.getOfficialPoiId()).a("spu_id", Long.valueOf(goodsSpu.id)).a("index", Integer.valueOf(i)).a("cat_id", Long.valueOf(this.d.c)).a("sec_cat_id", this.d.f == null ? "" : this.d.f).a("sort", Long.valueOf(this.d.g)).a("filter", this.d.n()).a("delivery_fee", i.a(Double.valueOf(poi.shippingFee), Double.valueOf(0.0d)) ? this.itemView.getContext().getString(R.string.wm_sc_goods_label_delivery_fee_free) : "").a("delivery_time", poi.mtDeliveryTime == null ? "" : poi.mtDeliveryTime).a("score", Double.valueOf(poi.poiScore)).a("activity_type", Integer.valueOf(goodsSpu.activityType)).a("orig_price", Double.valueOf(goodsSpu.getOriginPrice())).a("current_price", Double.valueOf(goodsSpu.getMinPrice())).a("sale", Integer.valueOf(goodsSpu.monthSaled));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        a2.a("rank_trace_id", str);
    }
}
