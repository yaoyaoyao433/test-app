package com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.business.restaurant.base.shopcart.protocol.GoodsSpuAttrs;
import com.sankuai.waimai.business.restaurant.base.skuchoose.b;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.domain.core.goods.FoodMultiSpuResponse;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ComboModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static long sLastShowMultiSpecTime;
    private final HashMap<Long, GoodsSpu> cacheGoodsSpu;
    private a manager;

    public ComboModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaf8e989f82811b63ed1fbff56431c88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaf8e989f82811b63ed1fbff56431c88");
            return;
        }
        this.cacheGoodsSpu = new HashMap<>();
        this.manager = new a();
        mPContext.getInstance().a(new com.sankuai.waimai.machpro.instance.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.ComboModule.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.instance.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "631a04e47471c4ef98898af556910e36", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "631a04e47471c4ef98898af556910e36");
                    return;
                }
                super.a();
                if (ComboModule.this.getMachContext() != null) {
                    a aVar = ComboModule.this.manager;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "bf7a2a1c3549f30ca9cb6f176693b3a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "bf7a2a1c3549f30ca9cb6f176693b3a2");
                    } else {
                        aVar.d.getInstance().b(aVar.e);
                        aVar.b.clear();
                        aVar.d = null;
                    }
                    ComboModule.this.getMachContext().getInstance().b(this);
                }
            }
        });
        a aVar = this.manager;
        Object[] objArr2 = {mPContext};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "02b646f8ed37068a73abb2b27b6d8910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "02b646f8ed37068a73abb2b27b6d8910");
            return;
        }
        aVar.d = mPContext;
        aVar.d.getInstance().a(aVar.e);
    }

    @Override // com.sankuai.waimai.machpro.module.MPModule
    public MPContext getMachContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d82899ba74d39bd5f616285e12a0b3", RobustBitConfig.DEFAULT_VALUE) ? (MPContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d82899ba74d39bd5f616285e12a0b3") : super.getMachContext();
    }

    @JSMethod(methodName = "showMultiSpecView")
    public void showMultiSpecView(MachMap machMap, final String str, String str2, String str3, final int i) {
        Object[] objArr = {machMap, str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77fd86881b6504dab86d250a5f356a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77fd86881b6504dab86d250a5f356a7c");
        } else if (System.currentTimeMillis() - sLastShowMultiSpecTime < 1000) {
        } else {
            sLastShowMultiSpecTime = System.currentTimeMillis();
            final GoodsSpu parseGoodSpu = parseGoodSpu(str2);
            if (parseGoodSpu == null) {
                return;
            }
            final Poi poi = new Poi();
            poi.id = machMap.containsKey("poi_id") ? Long.parseLong((String) machMap.get("poi_id")) : -1L;
            poi.setPoiIDStr(machMap.containsKey(FoodDetailNetWorkPreLoader.URI_POI_STR) ? (String) machMap.get(FoodDetailNetWorkPreLoader.URI_POI_STR) : "");
            poi.origin_brand_id = machMap.containsKey("brand_id") ? Long.parseLong((String) machMap.get("brand_id")) : -1L;
            poi.state = 1;
            final List<OrderedFood> parseOrderedFoodList = parseOrderedFoodList(str3);
            final Activity activity = (Activity) getMachContext().getContext();
            final b.InterfaceC0826b interfaceC0826b = new b.InterfaceC0826b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.ComboModule.2
                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.InterfaceC0826b
                public final View a() {
                    return null;
                }
            };
            final a aVar = this.manager;
            Object[] objArr2 = {activity, parseGoodSpu, interfaceC0826b, poi, parseOrderedFoodList, str, Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.skuchoose.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "775aea822c98e550468622986329361b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "775aea822c98e550468622986329361b");
            } else {
                com.sankuai.waimai.business.restaurant.base.skuchoose.b.a(activity, parseGoodSpu, poi, true, new b.a() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                    public final void a(FoodMultiSpuResponse foodMultiSpuResponse) {
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                    public final void a(String str4) {
                        Object[] objArr3 = {str4};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "44b3d37a25788bbf4212bbb79d9d73b7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "44b3d37a25788bbf4212bbb79d9d73b7");
                        } else {
                            b.a(activity, parseGoodSpu, interfaceC0826b, poi, parseOrderedFoodList, str, i, aVar);
                        }
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1c7d594abb020b4db0255dde6ac677bc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1c7d594abb020b4db0255dde6ac677bc");
                        } else {
                            b.a(activity, parseGoodSpu, interfaceC0826b, poi, parseOrderedFoodList, str, i, aVar);
                        }
                    }
                });
            }
            this.cacheGoodsSpu.put(Long.valueOf(parseGoodSpu.getId()), parseGoodSpu);
        }
    }

    @JSMethod(methodName = "addToNativeShopCart")
    public void addToNativeShopCart(String str, String str2, String str3, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {str, str2, str3, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dee51282708d2f8b1c0f0a0d530a5896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dee51282708d2f8b1c0f0a0d530a5896");
        } else if (System.currentTimeMillis() - sLastShowMultiSpecTime < 1000) {
        } else {
            sLastShowMultiSpecTime = System.currentTimeMillis();
            String a = com.sankuai.waimai.business.restaurant.base.util.c.a(str);
            GoodsSpu parseGoodSpu = parseGoodSpu(str2);
            if (parseGoodSpu == null) {
                return;
            }
            List<OrderedFood> parseOrderedFoodList = parseOrderedFoodList(str3);
            OrderedFood orderedFood = new OrderedFood(parseGoodSpu, parseGoodSpu.getSkuList().get(0), parseGoodSpu.hasMultiSaleAttr ? parseGoodSpu.getAttrValuesArr() : null, 1);
            orderedFood.setComboItemList(parseOrderedFoodList);
            k.a().a((Activity) getMachContext().getContext(), a, -1, orderedFood, 0, new e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.ComboModule.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "150e847f5638490c881ce5edfc5d8606", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "150e847f5638490c881ce5edfc5d8606");
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8cb99a547b182162ef8bd202f52df3e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8cb99a547b182162ef8bd202f52df3e9");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put("code", 0);
                    mPJSCallBack.invoke(machMap);
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e39bf6fa05a5dede6987537d26157341", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e39bf6fa05a5dede6987537d26157341");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put("code", 1);
                    mPJSCallBack.invoke(machMap);
                }
            });
        }
    }

    private GoodsSpu parseGoodSpu(String str) {
        GoodsSpu goodsSpu;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd8b45915003056abc83b6298bd1d035", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd8b45915003056abc83b6298bd1d035");
        }
        try {
            goodsSpu = new GoodsSpu();
        } catch (Exception e) {
            e = e;
            goodsSpu = null;
        }
        try {
            goodsSpu.parseJson(new JSONObject(str));
            if (this.cacheGoodsSpu.containsKey(Long.valueOf(goodsSpu.getId()))) {
                GoodsSpu goodsSpu2 = this.cacheGoodsSpu.get(Long.valueOf(goodsSpu.getId()));
                goodsSpu.setFoodMultiSpuResponseNew(goodsSpu2.getFoodMultiSpuResponseNew());
                goodsSpu.setFoodMultiSpuResponse(goodsSpu2.getFoodMultiSpuResponse());
            }
        } catch (Exception e2) {
            e = e2;
            com.sankuai.waimai.imbase.log.a.a(e);
            return goodsSpu;
        }
        return goodsSpu;
    }

    private List<OrderedFood> parseOrderedFoodList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88519ef921df308403fb6494d521dc3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88519ef921df308403fb6494d521dc3c");
        }
        ArrayList arrayList = null;
        List<GoodsSpuAttrs> goodsSpuList = GoodsSpuAttrs.getGoodsSpuList(str);
        if (!com.sankuai.waimai.foundation.utils.b.b(goodsSpuList)) {
            arrayList = new ArrayList();
            for (GoodsSpuAttrs goodsSpuAttrs : goodsSpuList) {
                OrderedFood orderedFood = new OrderedFood(goodsSpuAttrs.spu, goodsSpuAttrs.sku, goodsSpuAttrs.getAttrsArray(), goodsSpuAttrs.count);
                orderedFood.setGroupId(goodsSpuAttrs.groupId);
                arrayList.add(orderedFood);
            }
        }
        return arrayList;
    }
}
