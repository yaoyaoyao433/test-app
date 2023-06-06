package com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu;

import android.app.Activity;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.d;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.h;
import com.sankuai.waimai.business.restaurant.base.manager.order.i;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.RequiredTagInfo;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.f;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.business.restaurant.base.shopcart.protocol.GoodsSpuAttrs;
import com.sankuai.waimai.business.restaurant.base.util.d;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.MachProJsonUtil;
import com.sankuai.waimai.business.restaurant.rn.bridge.ShopCartRNBridgeDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPShopCartModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final com.sankuai.waimai.platform.domain.core.response.a mServerExpController;

    public MPShopCartModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58e32d2eefc2a3b584e2dca3e0f7884f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58e32d2eefc2a3b584e2dca3e0f7884f");
        } else {
            this.mServerExpController = new com.sankuai.waimai.platform.domain.core.response.a();
        }
    }

    @Override // com.sankuai.waimai.machpro.module.MPModule
    public MPContext getMachContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba2b4f0af419618d8521695cbbeaf6b9", RobustBitConfig.DEFAULT_VALUE) ? (MPContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba2b4f0af419618d8521695cbbeaf6b9") : super.getMachContext();
    }

    @JSMethod(methodName = "syncMPCartData")
    public void syncMPCartData(MachMap machMap, MachArray machArray) {
        Object[] objArr = {machMap, machArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03db987644b08f97d97f4fd41477bfbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03db987644b08f97d97f4fd41477bfbb");
            return;
        }
        g poiHelper = getPoiHelper();
        if (poiHelper == null) {
            return;
        }
        String f = poiHelper.f();
        Gson a = d.a();
        Object[] objArr2 = {machMap};
        ChangeQuickRedirect changeQuickRedirect3 = MachProJsonUtil.a;
        f fVar = (f) a.fromJson(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2e87e2c59de9e08f3b97060f71d32aaf", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2e87e2c59de9e08f3b97060f71d32aaf") : new GsonBuilder().registerTypeAdapterFactory(new MachProJsonUtil.MachMapTypeAdapter.MachMapTypeAdapterFactory(null)).setPrettyPrinting().serializeSpecialFloatingPointValues().create().toJsonTree(machMap, MachMap.class), (Class<Object>) f.class);
        List<GoodsSpuAttrs> goodsSpuList = GoodsSpuAttrs.getGoodsSpuList(machArray);
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.waimai.foundation.utils.b.b(goodsSpuList)) {
            for (GoodsSpuAttrs goodsSpuAttrs : goodsSpuList) {
                arrayList.add(convertToOrderedFood(goodsSpuAttrs));
            }
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b d = k.a().n(f).d();
        if (d != null) {
            d.b(arrayList);
            RequiredTagInfo updateRequiredTagInfo = RequiredTagInfo.updateRequiredTagInfo(k.a().n(f).n, fVar.q);
            com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(f);
            if (d != n && n != null) {
                n.n = updateRequiredTagInfo;
            }
            d.n = updateRequiredTagInfo;
            k a2 = k.a();
            e eVar = new e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPShopCartModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "421790d014b1588efd3e46fbd4f096eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "421790d014b1588efd3e46fbd4f096eb");
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                }
            };
            Object[] objArr3 = {f, fVar, d, eVar};
            ChangeQuickRedirect changeQuickRedirect4 = k.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "099cc4609fa2d937fd3bb5ae60a77827", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "099cc4609fa2d937fd3bb5ae60a77827");
                return;
            }
            try {
                h.a().c();
                i iVar = a2.b;
                k.a aVar = new k.a(f, eVar);
                Object[] objArr4 = {f, fVar, d, aVar};
                ChangeQuickRedirect changeQuickRedirect5 = i.a;
                if (PatchProxy.isSupport(objArr4, iVar, changeQuickRedirect5, false, "5fd5034e35e58511ec5e4afad3111729", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, iVar, changeQuickRedirect5, false, "5fd5034e35e58511ec5e4afad3111729");
                } else if (d != null) {
                    i.a aVar2 = new i.a(f, aVar);
                    if (fVar != null) {
                        try {
                            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(d, fVar);
                            aVar2.a(d);
                        } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
                            e.printStackTrace();
                            aVar2.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(""));
                        }
                    }
                }
            } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e2) {
                eVar.a(e2);
            }
        }
    }

    @JSMethod(methodName = "getCartDataForMultiApp")
    public MachArray getCartDataForMultiApp(String str) {
        List list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1873fc4da9aa08697106de8c65b96188", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1873fc4da9aa08697106de8c65b96188");
        }
        ArrayList arrayList = new ArrayList();
        k a = k.a();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = k.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "dab2243c02dec64ac0108b7e62b4954d", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "dab2243c02dec64ac0108b7e62b4954d");
        } else {
            i iVar = a.b;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = i.a;
            if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect4, false, "7cba25b2931253ed4c376c2d20aad5ae", RobustBitConfig.DEFAULT_VALUE)) {
                list = (ArrayList) PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect4, false, "7cba25b2931253ed4c376c2d20aad5ae");
            } else {
                final com.sankuai.waimai.business.restaurant.base.shopcart.b g = iVar.g(str);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
                if (PatchProxy.isSupport(objArr4, g, changeQuickRedirect5, false, "683f8eb49b8a2a678d831b06e32572ab", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (ArrayList) PatchProxy.accessDispatch(objArr4, g, changeQuickRedirect5, false, "683f8eb49b8a2a678d831b06e32572ab");
                } else {
                    final ArrayList arrayList2 = new ArrayList();
                    h.a.b(g, new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.b.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                        public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                            Object[] objArr5 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "b139a8e046ca5bc16e77d2e69c80a1d1", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "b139a8e046ca5bc16e77d2e69c80a1d1")).booleanValue();
                            }
                            if (shopCartItem.food != null) {
                                OrderedFood orderedFood = shopCartItem.food;
                                if (i4 == 0) {
                                    OrderedFood m19clone = orderedFood.m19clone();
                                    m19clone.setItemIndex(i3);
                                    arrayList2.add(m19clone);
                                }
                            }
                            return true;
                        }
                    });
                    list = arrayList2;
                }
            }
        }
        if (list == null || list.isEmpty()) {
            return new MachArray();
        }
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(convertToGoodsSpuAttrs((OrderedFood) list.get(i)));
        }
        return MachProJsonUtil.a(d.a().toJsonTree(arrayList).getAsJsonArray());
    }

    private GoodsSpuAttrs convertToGoodsSpuAttrs(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7ece52c0b9176dcc9858b5f2004ce07", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpuAttrs) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7ece52c0b9176dcc9858b5f2004ce07");
        }
        GoodsSpuAttrs goodsSpuAttrs = null;
        if (orderedFood.spu != null && orderedFood.sku != null) {
            goodsSpuAttrs = new GoodsSpuAttrs();
            goodsSpuAttrs.spu = orderedFood.getFoodSpu();
            goodsSpuAttrs.skuId = orderedFood.getSkuId();
            if (!com.sankuai.waimai.foundation.utils.b.a(orderedFood.getAttrIds())) {
                goodsSpuAttrs.attrs = Arrays.asList(orderedFood.getAttrIds());
            }
            goodsSpuAttrs.itemIndex = orderedFood.getItemIndex();
            goodsSpuAttrs.cartId = orderedFood.getCartId();
            goodsSpuAttrs.count = orderedFood.getCount();
            goodsSpuAttrs.groupId = orderedFood.getGroupId();
            List<OrderedFood> comboItems = orderedFood.getComboItems();
            if (!com.sankuai.waimai.foundation.utils.b.b(comboItems)) {
                goodsSpuAttrs.comboGroup = new ArrayList();
                for (OrderedFood orderedFood2 : comboItems) {
                    GoodsSpuAttrs convertToGoodsSpuAttrs = convertToGoodsSpuAttrs(orderedFood2);
                    if (convertToGoodsSpuAttrs != null) {
                        goodsSpuAttrs.comboGroup.add(convertToGoodsSpuAttrs);
                    }
                }
            }
        }
        return goodsSpuAttrs;
    }

    private OrderedFood convertToOrderedFood(GoodsSpuAttrs goodsSpuAttrs) {
        Object[] objArr = {goodsSpuAttrs};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09bc90b6efb6c8b79feb92061e9d38d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09bc90b6efb6c8b79feb92061e9d38d1");
        }
        OrderedFood orderedFood = null;
        if (goodsSpuAttrs.spu != null && goodsSpuAttrs.sku != null) {
            orderedFood = new OrderedFood(goodsSpuAttrs.spu, goodsSpuAttrs.sku, goodsSpuAttrs.getAttrsArray(), goodsSpuAttrs.count);
            orderedFood.setCartId(goodsSpuAttrs.cartId);
            orderedFood.setProductType(goodsSpuAttrs.productType);
            orderedFood.setItemIndex(goodsSpuAttrs.itemIndex);
            orderedFood.setGroupId(goodsSpuAttrs.groupId);
            List<GoodsSpuAttrs> list = goodsSpuAttrs.comboGroup;
            if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
                ArrayList arrayList = new ArrayList();
                for (GoodsSpuAttrs goodsSpuAttrs2 : list) {
                    OrderedFood convertToOrderedFood = convertToOrderedFood(goodsSpuAttrs2);
                    if (convertToOrderedFood != null) {
                        arrayList.add(convertToOrderedFood);
                    }
                }
                orderedFood.setComboItemList(arrayList);
            }
        }
        return orderedFood;
    }

    @JSMethod(methodName = "getSelectedMemberCardInfo")
    public MachArray getSelectedMemberCardInfo(String str) {
        ShopCartMemberInfo shopCartMemberInfo;
        ShopCartMemberInfo.MemberVpParam memberVpParam;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c817e34bbc0dfd9432e22563ff357c22", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c817e34bbc0dfd9432e22563ff357c22");
        }
        if (!TextUtils.isEmpty(str) && (shopCartMemberInfo = k.a().n(str).v) != null && (memberVpParam = shopCartMemberInfo.getMemberVpParam()) != null && !com.sankuai.waimai.foundation.utils.b.b(memberVpParam.productParams)) {
            return MachProJsonUtil.a(d.a().toJsonTree(memberVpParam.productParams).getAsJsonArray());
        }
        return new MachArray();
    }

    @JSMethod(methodName = "previewOrder")
    public void previewOrder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f2125236cc21c2554bc750e35ab30e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f2125236cc21c2554bc750e35ab30e8");
            return;
        }
        g poiHelper = getPoiHelper();
        if (poiHelper == null) {
            return;
        }
        String f = poiHelper.f();
        if (k.a().g(f)) {
            com.sankuai.waimai.restaurant.shopcart.config.a pageConfig = getPageConfig();
            if (pageConfig == null) {
                pageConfig = com.sankuai.waimai.restaurant.shopcart.config.a.a(1, 22);
            }
            String str = k.a().n(f).r;
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.d dVar = k.a().n(f).y;
            String str2 = "";
            String str3 = "";
            if (dVar != null) {
                str2 = dVar.a;
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("wmCouponViewId")) {
                        str3 = jSONObject.optString("wmCouponViewId");
                    }
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
            d.a aVar = new d.a();
            aVar.b = getActivity();
            aVar.c = this.mServerExpController;
            aVar.d = f;
            d.a a = aVar.a(com.sankuai.waimai.platform.domain.core.poi.b.a(f));
            a.e = poiHelper.g();
            a.g = getVolleyTAG();
            a.m = 15;
            a.n = poiHelper.q;
            a.i = pageConfig.d;
            a.k = poiHelper.o;
            a.l = poiHelper.x();
            a.o = poiHelper.b();
            a.p = poiHelper.c();
            a.r = str2;
            a.s = str3;
            a.q = str;
            a.t = getCommonParams();
            if (k.a().n(f).v != null) {
                a.u = k.a().n(f).v.getApParams();
            }
            switch (pageConfig.c) {
                case 1:
                case 5:
                    a.h = "from_restaurant";
                    com.sankuai.waimai.business.order.api.submit.d a2 = a.a();
                    com.sankuai.waimai.business.restaurant.base.log.c.d(a2.a());
                    com.sankuai.waimai.business.order.api.submit.c.a().preOrder(a2);
                    return;
                case 2:
                    a.h = "from_goods_detail";
                    com.sankuai.waimai.business.order.api.submit.d a3 = a.a();
                    com.sankuai.waimai.business.restaurant.base.log.c.d(a3.a());
                    com.sankuai.waimai.business.order.api.submit.c.a().preOrder(a3);
                    return;
                case 3:
                    a.l = false;
                    a.h = "from_poi_productset";
                    com.sankuai.waimai.business.order.api.submit.d a4 = a.a();
                    com.sankuai.waimai.business.restaurant.base.log.c.d(a4.a());
                    com.sankuai.waimai.business.order.api.submit.c.a().preOrder(a4);
                    return;
                case 4:
                    a.k = 0;
                    a.l = false;
                    a.h = "from_search_in_shop";
                    com.sankuai.waimai.business.order.api.submit.d a5 = a.a();
                    com.sankuai.waimai.business.restaurant.base.log.c.d(a5.a());
                    com.sankuai.waimai.business.order.api.submit.c.a().preOrder(a5);
                    return;
                default:
                    return;
            }
        }
    }

    @JSMethod(methodName = "submitCrossOrder")
    public void submitCrossOrder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3a6fdd61dd3a876d4c76930ca89e685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3a6fdd61dd3a876d4c76930ca89e685");
        } else if (com.sankuai.waimai.business.order.api.submit.c.a().checkAccount(getActivity(), com.sankuai.waimai.platform.domain.core.poi.b.a(str), str, a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER)) {
            com.sankuai.waimai.restaurant.shopcart.utils.c.a(getPoiHelper(), getActivity());
        }
    }

    private g getPoiHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37d8f922678d3b699d09ee4052bea815", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37d8f922678d3b699d09ee4052bea815");
        }
        Activity activity = getActivity();
        if (activity instanceof WMRestaurantActivity) {
            com.sankuai.waimai.business.restaurant.poicontainer.b bVar = ((WMRestaurantActivity) activity).b;
            if (bVar != null) {
                return bVar.O();
            }
            return null;
        } else if (!(activity instanceof GoodDetailActivity)) {
            if (activity instanceof TransferActivity) {
                BaseActivityDelegate baseActivityDelegate = ((TransferActivity) activity).c;
                if (baseActivityDelegate instanceof ShopCartRNBridgeDelegate) {
                    return ((ShopCartRNBridgeDelegate) baseActivityDelegate).c;
                }
            }
            return null;
        } else {
            return ((GoodDetailActivity) activity).i;
        }
    }

    public String getVolleyTAG() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e25d427916fffb3b6ba5b99f9d378ef7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e25d427916fffb3b6ba5b99f9d378ef7");
        }
        Activity activity = getActivity();
        if (activity instanceof WMRestaurantActivity) {
            return ((WMRestaurantActivity) activity).w();
        }
        if (activity instanceof GoodDetailActivity) {
            return ((GoodDetailActivity) activity).w();
        }
        if ((activity instanceof TransferActivity) && (((TransferActivity) activity).c instanceof ShopCartRNBridgeDelegate)) {
            return "ProductSetOperationActivity";
        }
        return null;
    }

    public com.sankuai.waimai.restaurant.shopcart.config.a getPageConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46a8ef5e86ef3ead19428155787bac53", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.restaurant.shopcart.config.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46a8ef5e86ef3ead19428155787bac53");
        }
        Activity activity = getActivity();
        if (!(activity instanceof WMRestaurantActivity)) {
            if (!(activity instanceof GoodDetailActivity)) {
                if (activity instanceof TransferActivity) {
                    BaseActivityDelegate baseActivityDelegate = ((TransferActivity) activity).c;
                    if (baseActivityDelegate instanceof ShopCartRNBridgeDelegate) {
                        return ((ShopCartRNBridgeDelegate) baseActivityDelegate).d;
                    }
                    return null;
                }
                return null;
            }
            return ((GoodDetailActivity) activity).f;
        }
        return ((WMRestaurantActivity) activity).e.F.a.a().b;
    }

    private String getCommonParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e314a4fb684d142f93d2aaeebbc0bada", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e314a4fb684d142f93d2aaeebbc0bada");
        }
        try {
            if (getActivity() == null) {
                return "";
            }
            String a = com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(getActivity().getIntent(), "preview_order_callback_info", "preview_order_callback_info", "");
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("preview_order_callback_info", a);
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d945b03df2459fe62e8725f088cfe0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d945b03df2459fe62e8725f088cfe0a");
        }
        if (getMachContext() == null || !(getMachContext().getContext() instanceof Activity)) {
            return null;
        }
        return (Activity) getMachContext().getContext();
    }
}
