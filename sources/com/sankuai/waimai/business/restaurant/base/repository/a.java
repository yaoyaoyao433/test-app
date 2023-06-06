package com.sankuai.waimai.business.restaurant.base.repository;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.log.c;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.FullReduceEntrance;
import com.sankuai.waimai.business.restaurant.base.repository.model.PoiCommentResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackageFloatResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendWithPackageFloatResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.RestMenuBaseResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.h;
import com.sankuai.waimai.business.restaurant.base.repository.model.i;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.poicontainer.base.repository.model.FullReduceAnim;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.domain.core.goods.FoodMultiSpuResponse;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.internal.operators.t;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.restaurant.base.repository.net.a {
    public static ChangeQuickRedirect a;
    boolean b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0721c601c3556c633ec5c3c1f3f6f1fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0721c601c3556c633ec5c3c1f3f6f1fd");
        } else {
            this.d = com.meituan.android.singleton.b.a;
        }
    }

    public final void a(String str, final long j, final String str2, long j2, i iVar, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Set<Long> set, boolean z, int i2, String str11, String str12, String str13, String str14, String str15, final com.sankuai.waimai.business.restaurant.base.repository.net.b<h> bVar) {
        Object[] objArr = {str, new Long(j), str2, new Long(j2), iVar, str3, Integer.valueOf(i), str4, str5, str6, str7, str8, str9, str10, set, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), str11, str12, str13, str14, str15, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d87fdba9703324ce55f56f4aca24672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d87fdba9703324ce55f56f4aca24672");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getShopMenuData-->start", new Object[0]);
        Long valueOf = j2 == -1 ? null : Long.valueOf(j2);
        HashSet hashSet = set == null ? new HashSet() : set;
        for (OrderedFood orderedFood : k.a().o(str2)) {
            if (orderedFood != null) {
                hashSet.add(Long.valueOf(orderedFood.getSpuId()));
            }
        }
        String json = com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJson(hashSet);
        String str16 = "";
        WmAddress k = g.a().k();
        if (k != null && k.hasAddress()) {
            str16 = k.getAddress();
        }
        d b = d.b(this.f.getShopMenuStr(str, j, str2, valueOf, iVar.a, iVar.b, iVar.c, 0, str3, i, str4, str5, str6, str7, str8, str9, str10, json, z, true, str16, i2, str11, str12, str13, str14, 1, true, true, com.sankuai.waimai.restaurant.shopcart.utils.g.a() ? 1 : 0, str15).b(rx.schedulers.a.e()), this.f.getFoodList(str, j, str2, valueOf, iVar.a, iVar.b, iVar.c, 0, str3, i, str4, str5, str6, str7, str8, str9, str10, json, z, true, str16, i2, str11, str13, str14, true, true, com.sankuai.waimai.restaurant.shopcart.utils.g.a() ? 1 : 0, str15).b(rx.schedulers.a.e()), new rx.functions.h<RestMenuBaseResponse, RestMenuBaseResponse, RestMenuBaseResponse>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.h
            public final /* synthetic */ RestMenuBaseResponse a(RestMenuBaseResponse restMenuBaseResponse, RestMenuBaseResponse restMenuBaseResponse2) {
                RestMenuBaseResponse restMenuBaseResponse3 = restMenuBaseResponse;
                RestMenuBaseResponse restMenuBaseResponse4 = restMenuBaseResponse2;
                Object[] objArr2 = {restMenuBaseResponse3, restMenuBaseResponse4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e5481bbd2ab3b5890f86955d9d04bbd", RobustBitConfig.DEFAULT_VALUE)) {
                    return (RestMenuBaseResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e5481bbd2ab3b5890f86955d9d04bbd");
                }
                if (restMenuBaseResponse3.isSuccess() && restMenuBaseResponse4.isSuccess()) {
                    RestMenuBaseResponse restMenuBaseResponse5 = new RestMenuBaseResponse();
                    restMenuBaseResponse5.data = new JsonObject();
                    for (Map.Entry<String, JsonElement> entry : restMenuBaseResponse3.data.entrySet()) {
                        restMenuBaseResponse5.data.add(entry.getKey(), entry.getValue());
                    }
                    for (Map.Entry<String, JsonElement> entry2 : restMenuBaseResponse4.data.entrySet()) {
                        restMenuBaseResponse5.data.add(entry2.getKey(), entry2.getValue());
                    }
                    return restMenuBaseResponse5;
                } else if (!restMenuBaseResponse3.isSuccess()) {
                    throw new com.sankuai.waimai.platform.modular.network.error.a(restMenuBaseResponse3.code, restMenuBaseResponse3.msg);
                } else {
                    if (!restMenuBaseResponse4.isSuccess()) {
                        throw new com.sankuai.waimai.platform.modular.network.error.a(restMenuBaseResponse4.code, restMenuBaseResponse4.msg);
                    }
                    throw new com.sankuai.waimai.platform.modular.network.error.a("请求异常，请重试");
                }
            }
        });
        Object[] objArr2 = {new Long(j), str2, b, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ed07cc4a3a5ef09aa0584fca2301ed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ed07cc4a3a5ef09aa0584fca2301ed4");
        } else if (b != null) {
            this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<h>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final /* synthetic */ void a(h hVar) {
                    h hVar2 = hVar;
                    Object[] objArr3 = {hVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd7b3d21a94a63d0bbccb8409e03eb08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd7b3d21a94a63d0bbccb8409e03eb08");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getShopMenuData-->success", new Object[0]);
                    if (bVar != null) {
                        bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) hVar2);
                    }
                }

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c03482602a81063e3f2edbd37d0786f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c03482602a81063e3f2edbd37d0786f6");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.e("Restaurant", "RestApiManager#getShopMenuData-->fail cause::" + aVar, new Object[0]);
                    if (bVar != null) {
                        bVar.a(aVar);
                    }
                }
            }, b.d(new rx.functions.g<RestMenuBaseResponse, h>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.14
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ h call(RestMenuBaseResponse restMenuBaseResponse) {
                    RestMenuBaseResponse restMenuBaseResponse2 = restMenuBaseResponse;
                    Object[] objArr3 = {restMenuBaseResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2993e9e94140ac109df11b877c598819", RobustBitConfig.DEFAULT_VALUE)) {
                        return (h) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2993e9e94140ac109df11b877c598819");
                    }
                    if (restMenuBaseResponse2 == null) {
                        throw new com.sankuai.waimai.platform.modular.network.error.a("预加载异常，请重试");
                    }
                    if (!restMenuBaseResponse2.isSuccess()) {
                        throw new com.sankuai.waimai.platform.modular.network.error.a(restMenuBaseResponse2.code, restMenuBaseResponse2.msg);
                    }
                    c.a("Data process start, poiId: %d %s", Long.valueOf(j), str2);
                    com.sankuai.waimai.business.restaurant.base.config.d dVar = new com.sankuai.waimai.business.restaurant.base.config.d();
                    dVar.a = restMenuBaseResponse2.data;
                    c.a("Data process end, poiId: %d %s", Long.valueOf(j), str2);
                    return new h(dVar);
                }
            }).b(rx.schedulers.a.e()).b(new rx.functions.a() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.13
                public static ChangeQuickRedirect a;

                @Override // rx.functions.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2165f46eaa85570f693c8d4a137c83a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2165f46eaa85570f693c8d4a137c83a");
                    } else if (bVar != null) {
                        bVar.a();
                    }
                }
            }).b(rx.android.schedulers.a.a()).c(new rx.functions.a() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.12
                public static ChangeQuickRedirect a;

                @Override // rx.functions.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7c2ef54002a9acb6ef0d91694413dc41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7c2ef54002a9acb6ef0d91694413dc41");
                    } else if (bVar != null) {
                        bVar.b();
                    }
                }
            }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
        }
    }

    public final void a(String str, GoodsSpu goodsSpu, final com.sankuai.waimai.business.restaurant.base.repository.net.b<FoodMultiSpuResponse> bVar) {
        Object[] objArr = {str, goodsSpu, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f13f4e0f05b7d40159ad2c1f5ae921d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f13f4e0f05b7d40159ad2c1f5ae921d");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (!com.sankuai.waimai.foundation.utils.d.a(goodsSpu.getSkuList())) {
            for (GoodsSku goodsSku : goodsSpu.getSkuList()) {
                if (goodsSku != null) {
                    jSONArray.put(goodsSku.id);
                }
            }
        }
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<FoodMultiSpuResponse>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(FoodMultiSpuResponse foodMultiSpuResponse) {
                FoodMultiSpuResponse foodMultiSpuResponse2 = foodMultiSpuResponse;
                Object[] objArr2 = {foodMultiSpuResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e32f3da280013e8125fb397a9672cbb5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e32f3da280013e8125fb397a9672cbb5");
                } else if (bVar != null) {
                    bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) foodMultiSpuResponse2);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc157efe88e5c56ee479cd3a09296d3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc157efe88e5c56ee479cd3a09296d3b");
                } else if (bVar != null) {
                    bVar.a(aVar);
                }
            }
        }, this.f.getFoodMultiSpu(com.sankuai.waimai.platform.domain.core.poi.b.a(str), str, goodsSpu.id, jSONArray.toString(), new GsonBuilder().create().toJson(goodsSpu.getAttrsList())).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
    }

    public final void b(String str, GoodsSpu goodsSpu, final com.sankuai.waimai.business.restaurant.base.repository.net.b<String> bVar) {
        Object[] objArr = {str, goodsSpu, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b89f2fbe33e2eeed039bd9c34b505046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b89f2fbe33e2eeed039bd9c34b505046");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wmPoiId", com.sankuai.waimai.platform.domain.core.poi.b.a(str));
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            jSONObject.put("spuId", goodsSpu.id);
            jSONObject.put("needPremiumAttr", goodsSpu.isPremiumSpu);
            JSONArray jSONArray = new JSONArray();
            if (!com.sankuai.waimai.foundation.utils.d.a(goodsSpu.getSkuList())) {
                for (GoodsSku goodsSku : goodsSpu.getSkuList()) {
                    if (goodsSku != null) {
                        jSONArray.put(goodsSku.id);
                    }
                }
            }
            jSONObject.put("skuIds", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<String>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.16
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(String str2) {
                String str3 = str2;
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d3cae65b0032a4e12684addcf46164b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d3cae65b0032a4e12684addcf46164b");
                } else if (bVar != null) {
                    bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) str3);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9390e59e52fab12d18210c451877afa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9390e59e52fab12d18210c451877afa");
                } else if (bVar != null) {
                    bVar.a(aVar);
                }
            }
        }, this.f.getFoodMultiSpuNew(jSONObject.toString()).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
    }

    public final void a(String str, GoodsSpu goodsSpu, JSONArray jSONArray, final com.sankuai.waimai.business.restaurant.base.repository.net.b<String> bVar) {
        Object[] objArr = {str, goodsSpu, jSONArray, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae7113893ff071dd5fe2fdb078d71bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae7113893ff071dd5fe2fdb078d71bc");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wm_poi_id", com.sankuai.waimai.platform.domain.core.poi.b.a(str));
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            jSONObject.put("spu_id", goodsSpu.getId());
            jSONObject.put("spu_name", goodsSpu.getName());
            jSONObject.put("shopping_cart_list", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<String>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.17
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(String str2) {
                String str3 = str2;
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "961035b3a2ee456396adc880df05f69c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "961035b3a2ee456396adc880df05f69c");
                } else if (bVar != null) {
                    bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) str3);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6cad6272146a6f8002397c47a75b832", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6cad6272146a6f8002397c47a75b832");
                } else if (bVar != null) {
                    bVar.a(aVar);
                }
            }
        }, this.f.getSoldOutGuideCopies(jSONObject.toString()).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
    }

    public final void a(int i, int i2, int i3, long j, String str, final com.sankuai.waimai.business.restaurant.base.repository.net.b<PoiCommentResponse> bVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7954b46bde3e3f1143f5912b01aae95e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7954b46bde3e3f1143f5912b01aae95e");
        } else if (this.b) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getCommentList-->start", new Object[0]);
            this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<PoiCommentResponse>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final /* synthetic */ void a(PoiCommentResponse poiCommentResponse) {
                    PoiCommentResponse poiCommentResponse2 = poiCommentResponse;
                    Object[] objArr2 = {poiCommentResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad99cc0cf93db79d6050225af8f9e842", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad99cc0cf93db79d6050225af8f9e842");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getCommentList-->success!!", new Object[0]);
                    if (bVar != null) {
                        bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) poiCommentResponse2);
                    }
                }

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c96699c058144d8e0b7ad17dda344408", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c96699c058144d8e0b7ad17dda344408");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getCommentList-->fail,cause::" + aVar, new Object[0]);
                    if (bVar != null) {
                        bVar.a(aVar);
                    }
                }
            }, this.f.getComments(com.sankuai.waimai.platform.domain.core.poi.b.a(str), str, i, i2, i3, j).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d)).a((d.b<? extends R, ? super R>) new t(new rx.functions.b<Long>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.4
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Long l) {
                    Object[] objArr2 = {l};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2510297c72464dd913e52e404684e2e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2510297c72464dd913e52e404684e2e5");
                    } else {
                        a.this.b = true;
                    }
                }
            })).c(new rx.functions.a() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.3
                public static ChangeQuickRedirect a;

                @Override // rx.functions.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "410a4da31964afd5bf27bd5191339278", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "410a4da31964afd5bf27bd5191339278");
                    } else {
                        a.this.b = false;
                    }
                }
            })));
        }
    }

    public final void a(String str, String str2, String str3, String str4, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, final com.sankuai.waimai.business.restaurant.base.repository.net.b<String> bVar2) {
        Object[] objArr = {str, str2, str3, str4, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d38df78d95b7e749212b0e0627c2917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d38df78d95b7e749212b0e0627c2917");
            return;
        }
        String str5 = com.dianping.mainboard.a.b().h;
        if (TextUtils.isEmpty(str5)) {
            str5 = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wm_poi_id", com.sankuai.waimai.platform.domain.core.poi.b.a(str));
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("cart_id", str2);
            }
            jSONObject.put("poi_location", str4);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("identity_id", str3);
            }
            jSONObject.put("product_list", a(bVar));
            jSONObject.put("push_token", str5);
        } catch (JSONException unused) {
        }
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<String>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(String str6) {
                String str7 = str6;
                Object[] objArr2 = {str7};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59332c9faf9ce1fd90490bbea7e8d003", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59332c9faf9ce1fd90490bbea7e8d003");
                } else if (bVar2 != null) {
                    bVar2.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) str7);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3740078ba30a2a696a52d35d4aabffca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3740078ba30a2a696a52d35d4aabffca");
                } else if (bVar2 != null) {
                    bVar2.a(aVar);
                }
            }
        }, this.f.modifyCart(jSONObject.toString()).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
    }

    public final void a(String str, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, final com.sankuai.waimai.business.restaurant.base.repository.net.b<String> bVar2) {
        Object[] objArr = {str, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b056fae7a31f5002acc9c19476fe84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b056fae7a31f5002acc9c19476fe84");
            return;
        }
        String str2 = com.dianping.mainboard.a.b().h;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String str3 = "";
            WmAddress k = g.a().k();
            if (k != null && k.hasAddress()) {
                str3 = k.getAddress();
            }
            jSONObject.put("wm_poi_id", com.sankuai.waimai.platform.domain.core.poi.b.a(str));
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            jSONObject.put("product_list", a(bVar));
            jSONObject.put("push_token", str2);
            jSONObject.put("user_recipient_address_text", str3);
        } catch (JSONException unused) {
        }
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<String>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(String str4) {
                String str5 = str4;
                Object[] objArr2 = {str5};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77c0a760bd9d48a85b9a5488581e9841", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77c0a760bd9d48a85b9a5488581e9841");
                } else if (bVar2 != null) {
                    bVar2.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) str5);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ea0e36178840c989636fd1e593a1dc9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ea0e36178840c989636fd1e593a1dc9");
                } else if (bVar2 != null) {
                    bVar2.a(aVar);
                }
            }
        }, this.f.startCart(jSONObject.toString()).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
    }

    private JSONArray a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c35d594bb4d68dca0fec1528afe903", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c35d594bb4d68dca0fec1528afe903");
        }
        JSONArray jSONArray = new JSONArray();
        if (bVar != null) {
            try {
                List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list = bVar.b;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    com.sankuai.waimai.business.restaurant.base.shopcart.d dVar = list.get(i2);
                    if (dVar != null) {
                        for (ShopCartItem shopCartItem : dVar.c) {
                            OrderedFood orderedFood = shopCartItem.food;
                            if (orderedFood != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("id", orderedFood.getSkuId());
                                jSONObject.put("count", orderedFood.getCount());
                                jSONObject.put(Constants.PACKAGE_ID, i);
                                jSONObject.put("activity_tag", orderedFood.getActivityTag());
                                JSONArray jSONArray2 = new JSONArray();
                                JSONArray jSONArray3 = new JSONArray();
                                GoodsAttr[] attrIds = orderedFood.getAttrIds();
                                if (attrIds != null && attrIds.length > 0) {
                                    for (GoodsAttr goodsAttr : attrIds) {
                                        new JSONObject();
                                        if (goodsAttr.mode == 999) {
                                            jSONArray3.put(goodsAttr.toAddPriceJson());
                                        } else {
                                            jSONArray2.put(goodsAttr.id);
                                        }
                                    }
                                }
                                jSONObject.put("attrs", jSONArray2);
                                jSONObject.put("premium_attr_list", jSONArray3);
                                jSONArray.put(jSONObject);
                            }
                        }
                        i++;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public final void a(String str, boolean z, final com.sankuai.waimai.business.restaurant.base.repository.net.b<FullReduceEntrance> bVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512dff0fc5863f4fc422f27498c6ca14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512dff0fc5863f4fc422f27498c6ca14");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#showFullReduceEntrance-->start", new Object[0]);
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<FullReduceEntrance>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(FullReduceEntrance fullReduceEntrance) {
                FullReduceEntrance fullReduceEntrance2 = fullReduceEntrance;
                Object[] objArr2 = {fullReduceEntrance2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b4919b99f758870a675ec83fcd76db8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b4919b99f758870a675ec83fcd76db8");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#showFullReduceEntrance-->onSuccess", new Object[0]);
                if (bVar != null) {
                    bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) fullReduceEntrance2);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cf6d64e3215b18e6243b3ac23f3b211", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cf6d64e3215b18e6243b3ac23f3b211");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.e("Restaurant", "RestApiManager#showFullReduceEntrance-->onFailure::e=" + aVar, new Object[0]);
                if (bVar != null) {
                    bVar.a(aVar);
                }
            }
        }, this.f.showFullReduceEntrance(com.sankuai.waimai.platform.domain.core.poi.b.a(str), str, z, com.sankuai.waimai.business.restaurant.base.repository.model.b.a()).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
    }

    public final void a(String str, long j, long j2, final com.sankuai.waimai.business.restaurant.base.repository.net.b<FullReduceAnim> bVar) {
        Object[] objArr = {str, new Long(j), new Long(j2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c4b9ed294b4dc2a17aaa545fba68c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c4b9ed294b4dc2a17aaa545fba68c2");
        } else {
            this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<FullReduceAnim>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final /* synthetic */ void a(FullReduceAnim fullReduceAnim) {
                    FullReduceAnim fullReduceAnim2 = fullReduceAnim;
                    Object[] objArr2 = {fullReduceAnim2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de40ab128867257f19df19a304f6eb29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de40ab128867257f19df19a304f6eb29");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#showFullReduceAnim-->onSuccess", new Object[0]);
                    if (bVar != null) {
                        bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) fullReduceAnim2);
                    }
                }

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acbbc178aaae5aa4c121ecc377db36bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acbbc178aaae5aa4c121ecc377db36bd");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.e("Restaurant", "RestApiManager#showFullReduceAnim-->onFailure::e=" + aVar, new Object[0]);
                    if (bVar != null) {
                        bVar.a(aVar);
                    }
                }
            }, this.f.showFullReduceAnim(com.sankuai.waimai.platform.domain.core.poi.b.a(str), str, j, j2, com.sankuai.waimai.business.restaurant.base.repository.model.b.a()).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
        }
    }

    public final void a(HashMap<String, String> hashMap, final com.sankuai.waimai.business.restaurant.base.repository.net.b<RecommendPackageFloatResponse> bVar) {
        Object[] objArr = {hashMap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf254b60397d137092e94dc1e4b557d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf254b60397d137092e94dc1e4b557d2");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getRecommendPackageFloat-->start", new Object[0]);
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<RecommendPackageFloatResponse>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(RecommendPackageFloatResponse recommendPackageFloatResponse) {
                RecommendPackageFloatResponse recommendPackageFloatResponse2 = recommendPackageFloatResponse;
                Object[] objArr2 = {recommendPackageFloatResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ddcc378eb5142be30734b426ebc3f0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ddcc378eb5142be30734b426ebc3f0a");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getRecommendPackageFloat-->onSuccess", new Object[0]);
                if (bVar != null) {
                    bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) recommendPackageFloatResponse2);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4aa4a373b8c641a0c4ddb6db3061cad8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4aa4a373b8c641a0c4ddb6db3061cad8");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.e("Restaurant", "RestApiManager#getRecommendPackageFloat-->onFailure::e=" + aVar, new Object[0]);
                if (bVar != null) {
                    bVar.a(aVar);
                }
            }
        }, this.f.getRecommendPackageFloat(hashMap).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
    }

    public final void a(String str, long j, String str2, long j2, final com.sankuai.waimai.business.restaurant.base.repository.net.b<RecommendWithPackageFloatResponse> bVar) {
        Object[] objArr = {str, new Long(j), str2, new Long(j2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067e571cd7d6d5582873abd856782646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067e571cd7d6d5582873abd856782646");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getRecommendWithPackageFloat-->start", new Object[0]);
        this.e.a(d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<RecommendWithPackageFloatResponse>() { // from class: com.sankuai.waimai.business.restaurant.base.repository.a.11
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(RecommendWithPackageFloatResponse recommendWithPackageFloatResponse) {
                RecommendWithPackageFloatResponse recommendWithPackageFloatResponse2 = recommendWithPackageFloatResponse;
                Object[] objArr2 = {recommendWithPackageFloatResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7bc0a11dc06b0ef21916e701293a16b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7bc0a11dc06b0ef21916e701293a16b");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("Restaurant", "RestApiManager#getRecommendWithPackageFloat-->onSuccess", new Object[0]);
                if (bVar != null) {
                    bVar.a((com.sankuai.waimai.business.restaurant.base.repository.net.b) recommendWithPackageFloatResponse2);
                }
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62e4058a0c426447bd8a1095a777c734", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62e4058a0c426447bd8a1095a777c734");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.e("Restaurant", "RestApiManager#getRecommendWithPackageFloat-->onFailure::e=" + aVar, new Object[0]);
                if (bVar != null) {
                    bVar.a(aVar);
                }
            }
        }, this.f.getRecommendWithPackageFloat(str, j, str2, j2, com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.g.c().b()).a(com.sankuai.waimai.platform.capacity.network.rxsupport.c.a(this.d))));
    }
}
