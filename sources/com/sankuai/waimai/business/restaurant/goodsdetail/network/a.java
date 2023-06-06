package com.sankuai.waimai.business.restaurant.goodsdetail.network;

import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.net.ShopApiService;
import com.sankuai.waimai.platform.capacity.network.rxsupport.c;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCartAndPoi;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.restaurant.base.repository.net.a {
    public static ChangeQuickRedirect a;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f9339c37864a9ebb50f225e7cfaacf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f9339c37864a9ebb50f225e7cfaacf");
        } else {
            this.d = b.a;
        }
    }

    public final void a(long j, String str, boolean z, String str2, final com.sankuai.waimai.business.restaurant.base.repository.net.b<PoiShoppingCartAndPoi> bVar) {
        Object[] objArr = {new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420bdc82612cc7305502fe4cfa193cf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420bdc82612cc7305502fe4cfa193cf9");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getPoiAndShopCartInfo-->start", new Object[0]);
        String q = k.a().q(str);
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(com.sankuai.waimai.business.restaurant.composeorder.a.b);
            jSONObject.put("share_bill_mode", sb.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ShopApiService shopApiService = this.f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j);
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<PoiShoppingCartAndPoi>() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.network.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(PoiShoppingCartAndPoi poiShoppingCartAndPoi) {
                PoiShoppingCartAndPoi poiShoppingCartAndPoi2 = poiShoppingCartAndPoi;
                Object[] objArr2 = {poiShoppingCartAndPoi2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38e67826aae764f14463070953f67c46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38e67826aae764f14463070953f67c46");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getPoiAndShopCartInfo-->onSuccess", new Object[0]);
                if (bVar != null) {
                    bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) poiShoppingCartAndPoi2);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1150a291174fe4bfc28a75bf7f87076a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1150a291174fe4bfc28a75bf7f87076a");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.e("Restaurant", "RestApiManager#getPoiAndShopCartInfo-->onFailure::e=" + aVar, new Object[0]);
                if (bVar != null) {
                    bVar.a(aVar);
                }
            }
        }, shopApiService.getPoiAndShopcartInfo(sb2.toString(), str, q, 1, z ? "1" : "0", jSONObject.toString(), str2).a(c.a(b.a)).b(new rx.functions.a() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.network.a.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb7e8cabaac6277c1472fb2a5e87f2de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb7e8cabaac6277c1472fb2a5e87f2de");
                } else if (bVar != null) {
                    bVar.a();
                }
            }
        }).c(new rx.functions.a() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.network.a.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fed05be9a18b5b50ee086dae9d702086", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fed05be9a18b5b50ee086dae9d702086");
                } else if (bVar != null) {
                    bVar.b();
                }
            }
        })));
    }
}
