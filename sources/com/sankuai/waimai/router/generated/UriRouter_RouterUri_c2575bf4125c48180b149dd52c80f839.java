package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.store.goods.list.d;
import com.sankuai.waimai.store.mrn.c;
import com.sankuai.waimai.store.mrn.schemehander.b;
import com.sankuai.waimai.store.router.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_c2575bf4125c48180b149dd52c80f839 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50dbb1f05811942d285a3e247e2c4f3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50dbb1f05811942d285a3e247e2c4f3f");
            return;
        }
        hVar.a("", "", "/supermarket/detail", new com.sankuai.waimai.store.goods.detail.preload.a(), true, new i[0]);
        hVar.a("", "", "/supermarket/submenu", "com.sankuai.waimai.store.goods.list.SCSuperMarketSubActivity", true, new i[0]);
        hVar.a("", "", "/supermarket/menu", new d(), false, new i[0]);
        hVar.a("", "", "/supermarket/flashbuy/home", new com.sankuai.waimai.store.poi.list.newp.a(), true, new i[0]);
        hVar.a("", "", "/supermarket/quickbuy/home", new com.sankuai.waimai.store.poi.list.newp.a(), true, new i[0]);
        hVar.a("", "", "/supermarket/superstore/home", new com.sankuai.waimai.store.poi.list.newp.a(), true, new i[0]);
        hVar.a("", "", "/supermarketfilter", new com.sankuai.waimai.store.poi.list.newp.a(), true, new i[0]);
        hVar.a("", "", "/chat/1031", new k(), true, new i[0]);
        hVar.a("", "", "/chat/1024", new k(), true, new i[0]);
        hVar.a("", "", "/smshopcardmrn", new k(), true, new i[0]);
        hVar.a("", "", "/drugshopcardmrn", new k(), true, new i[0]);
        hVar.a("", "", "/chat/1029", new k(), true, new i[0]);
        hVar.a("", "", "/supermarket/orders", new k(), true, new i[0]);
        hVar.a("", "", "/smmrnhalfpage", new k(), true, new i[0]);
        hVar.a("", "", "/supermarket/promotionaggregation", new k(), true, new i[0]);
        hVar.a("", "", "/supermarket/machcontainer/index", new k(), true, new i[0]);
        hVar.a("", "", "/supermarket/superstore/shelves", new k(), true, new i[0]);
        hVar.a("", "", "/chat/1052", new k(), true, new i[0]);
        hVar.a("", "", "/supermarket/scanproduct", new k(), true, new i[0]);
        hVar.a("", "", "/smmschalfpage", new k(), true, new i[0]);
        hVar.a("", "", "/supermarket/sgnewuserland", new k(), true, new i[0]);
        hVar.a("", "", "/supermarket/goodscomments", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/poiinfo", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/toofar", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/coupon2poiset", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/membercard/bind", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/membercard/detail", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/membercard/home", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/descriptionlist", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/activityset", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/productset", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/restaurantsearch", new b(), true, new i[0]);
        hVar.a("", "", "/supermarket/order/shippingcouponlist", new b(), true, new i[0]);
        hVar.a("", "", "/chat/1038", new com.sankuai.waimai.store.mrn.schemehander.a(), true, new i[0]);
        hVar.a("", "", "/mlivemrn", new c(), true, new i[0]);
    }
}
