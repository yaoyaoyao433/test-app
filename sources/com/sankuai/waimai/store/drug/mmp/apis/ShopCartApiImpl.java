package com.sankuai.waimai.store.drug.mmp.apis;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.msi.api.extension.medicine.shopcart.AddNotifyNativeShopCartChangeListenerParam;
import com.meituan.msi.api.extension.medicine.shopcart.GetNativeShopCartDataParam;
import com.meituan.msi.api.extension.medicine.shopcart.GetNativeShopCartDataResponse;
import com.meituan.msi.api.extension.medicine.shopcart.GetShopCartDataParam;
import com.meituan.msi.api.extension.medicine.shopcart.GetShopCartDataResponse;
import com.meituan.msi.api.extension.medicine.shopcart.IShopcart;
import com.meituan.msi.api.extension.medicine.shopcart.JumpToPoiChatPageParam;
import com.meituan.msi.api.extension.medicine.shopcart.NotifyNativeShopCartChangeResponse;
import com.meituan.msi.api.extension.medicine.shopcart.PurchaseNowForSkuParam;
import com.meituan.msi.api.extension.medicine.shopcart.PurchaseNowParam;
import com.meituan.msi.api.extension.medicine.shopcart.SubmitOrderParam;
import com.meituan.msi.api.extension.medicine.shopcart.UpdateNativeShopCartDataParam;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.platform.domain.core.shopcart.b;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e;
import com.sankuai.waimai.store.platform.domain.manager.order.d;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.util.al;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopCartApiImpl extends IShopcart {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public final void a(final MsiCustomContext msiCustomContext, final PurchaseNowParam purchaseNowParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, purchaseNowParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283491aa603759ade7623faca88d6f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283491aa603759ade7623faca88d6f82");
            return;
        }
        try {
            msiCustomContext.getActivity().runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.store.drug.mmp.apis.ShopCartApiImpl.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c2b29c3b07170e8bcdd590afb8241b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c2b29c3b07170e8bcdd590afb8241b7");
                    } else if (purchaseNowParam != null && purchaseNowParam.jsonInfo != null) {
                        PurchaseNowParam.JsonInfo jsonInfo = purchaseNowParam.jsonInfo;
                        List list = (List) com.sankuai.waimai.store.util.i.a(jsonInfo.product_list, new TypeToken<List<GoodsSpu>>() { // from class: com.sankuai.waimai.store.drug.mmp.apis.ShopCartApiImpl.1.1
                        }.getType());
                        if (com.sankuai.shangou.stone.util.a.b(list)) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        int a2 = com.sankuai.shangou.stone.util.a.a(list);
                        for (int i = 0; i < a2; i++) {
                            GoodsSpu goodsSpu = (GoodsSpu) list.get(i);
                            if (goodsSpu != null) {
                                arrayList.add(new WmOrderedFood(goodsSpu.getId(), goodsSpu.getCycleSkuId(), goodsSpu.getFirstGoodAttr(), Math.max(goodsSpu.inCartCount, 1), 0, 0, goodsSpu.activityTag));
                            }
                        }
                        if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                            return;
                        }
                        com.sankuai.waimai.store.order.a.e().a(msiCustomContext.getActivity(), com.sankuai.waimai.store.order.a.e().l(ShopCartApiImpl.a(jsonInfo.poi_id, jsonInfo.poi_id_str)), SCPageConfig.a(1, 22, ""), (String) null, arrayList, jsonInfo.cart_recommend_couponInfo, (TextView) null, jsonInfo.drug_extra);
                    }
                }
            });
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public final void a(MsiCustomContext msiCustomContext, AddNotifyNativeShopCartChangeListenerParam addNotifyNativeShopCartChangeListenerParam, j<NotifyNativeShopCartChangeResponse> jVar) {
        Object[] objArr = {msiCustomContext, addNotifyNativeShopCartChangeListenerParam, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e740ffd238605132e88586c304509e0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e740ffd238605132e88586c304509e0a");
        } else {
            com.sankuai.waimai.store.order.a.e().e = jVar;
        }
    }

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public final void a(MsiCustomContext msiCustomContext, GetNativeShopCartDataParam getNativeShopCartDataParam, i<GetNativeShopCartDataResponse> iVar) {
        Object[] objArr = {msiCustomContext, getNativeShopCartDataParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9e23492b0396877ac505c490ae6d27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9e23492b0396877ac505c490ae6d27");
            return;
        }
        com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
        if (getNativeShopCartDataParam == null || getNativeShopCartDataParam.jsonInfo == null) {
            return;
        }
        GetNativeShopCartDataParam.JsonInfo jsonInfo = getNativeShopCartDataParam.jsonInfo;
        try {
            String str = jsonInfo.origin_poi_id;
            String str2 = jsonInfo.poi_id_str;
            JSONObject jSONObject = new JSONObject(jsonInfo.poi_info);
            if (t.a(str)) {
                return;
            }
            try {
                Long valueOf = Long.valueOf(str);
                if (valueOf == null && t.a(str2)) {
                    return;
                }
                Poi poi = new Poi();
                poi.parseJsonToPoi(jSONObject);
                e.a(valueOf.longValue(), str2, poi.id, poi.getStringPoiId());
                e.a(poi.getOfficialPoiId(), poi);
                b k = e.k(poi.getOfficialPoiId());
                if (k.h()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<OrderedFood> it = k.i().iterator();
                    while (it.hasNext()) {
                        OrderedFood next = it.next();
                        if (next != null) {
                            arrayList.add(next.sku);
                        }
                    }
                    e a = com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a((GoodsSpu) null, e.l(poi.getOfficialPoiId()), k, new com.sankuai.waimai.store.platform.domain.manager.order.b().b);
                    GetNativeShopCartDataResponse getNativeShopCartDataResponse = new GetNativeShopCartDataResponse();
                    getNativeShopCartDataResponse.shop_cart_request_data = new Gson().toJson(a);
                    getNativeShopCartDataResponse.sku_list = com.sankuai.waimai.store.util.i.a(arrayList);
                    iVar.a(getNativeShopCartDataResponse);
                    return;
                }
                iVar.a(null);
            } catch (Exception unused) {
                iVar.a(null);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public final void a(MsiCustomContext msiCustomContext, GetShopCartDataParam getShopCartDataParam, i<GetShopCartDataResponse> iVar) {
        Object[] objArr = {msiCustomContext, getShopCartDataParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d9d091c37c8192ceaf38c31347222fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d9d091c37c8192ceaf38c31347222fd");
            return;
        }
        com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
        if (getShopCartDataParam == null || getShopCartDataParam.jsonInfo == null) {
            return;
        }
        GetShopCartDataParam.JsonInfo jsonInfo = getShopCartDataParam.jsonInfo;
        b k = e.k(a(jsonInfo.poi_id, jsonInfo.poi_id_str));
        if (k.h()) {
            ArrayList arrayList = new ArrayList();
            Iterator<OrderedFood> it = k.i().iterator();
            while (it.hasNext()) {
                OrderedFood next = it.next();
                if (next != null) {
                    arrayList.add(next.sku);
                }
            }
            GetShopCartDataResponse getShopCartDataResponse = new GetShopCartDataResponse();
            HashMap<String, Integer> a = e.c.a(a(jsonInfo.poi_id, jsonInfo.poi_id_str));
            HashMap<String, Integer> b2 = e.c.b(a(jsonInfo.poi_id, jsonInfo.poi_id_str));
            getShopCartDataResponse.category_count = com.sankuai.waimai.store.util.i.a(a);
            getShopCartDataResponse.physical_category_count = com.sankuai.waimai.store.util.i.a(b2);
            getShopCartDataResponse.shop_cart_data = com.sankuai.waimai.store.util.i.a(k.x);
            getShopCartDataResponse.sku_list = com.sankuai.waimai.store.util.i.a(arrayList);
            iVar.a(getShopCartDataResponse);
            return;
        }
        iVar.a(null);
    }

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public final void a(MsiCustomContext msiCustomContext, final UpdateNativeShopCartDataParam updateNativeShopCartDataParam, final i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, updateNativeShopCartDataParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f68fe59e822a6e3b800bcba81dab3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f68fe59e822a6e3b800bcba81dab3f");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.drug.mmp.apis.ShopCartApiImpl.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "729b9b2225bfbce49fd7a29c6c8f3faf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "729b9b2225bfbce49fd7a29c6c8f3faf");
                    } else if (updateNativeShopCartDataParam == null || updateNativeShopCartDataParam.jsonInfo == null) {
                    } else {
                        UpdateNativeShopCartDataParam.JsonInfo jsonInfo = updateNativeShopCartDataParam.jsonInfo;
                        String a2 = ShopCartApiImpl.a(jsonInfo.poi_id, jsonInfo.poi_id_str);
                        NetPriceCalculatorResult netPriceCalculatorResult = (NetPriceCalculatorResult) com.sankuai.waimai.store.util.i.a(jsonInfo.shop_cart_data, NetPriceCalculatorResult.class);
                        netPriceCalculatorResult.G = null;
                        netPriceCalculatorResult.k = "";
                        if (netPriceCalculatorResult != null && netPriceCalculatorResult.r != null) {
                            com.sankuai.waimai.store.order.a.e().a(Long.valueOf(jsonInfo.poi_id).longValue(), jsonInfo.poi_id_str, netPriceCalculatorResult.b, netPriceCalculatorResult.c);
                            b k = com.sankuai.waimai.store.order.a.e().k(a2);
                            com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a(k, netPriceCalculatorResult);
                            final ArrayList arrayList = (ArrayList) com.sankuai.waimai.store.util.i.a(jsonInfo.sku_list, new TypeToken<ArrayList<GoodsSku>>() { // from class: com.sankuai.waimai.store.drug.mmp.apis.ShopCartApiImpl.2.1
                            }.getType());
                            d.a.d(k, new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.drug.mmp.apis.ShopCartApiImpl.2.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                                public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                                    Object[] objArr3 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb1cd749060cfa9cab7557e4cf6c2428", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb1cd749060cfa9cab7557e4cf6c2428")).booleanValue();
                                    }
                                    OrderedFood orderedFood = shopCartItem.food;
                                    if (orderedFood != null) {
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            GoodsSku goodsSku = (GoodsSku) it.next();
                                            if (goodsSku != null && goodsSku.id == orderedFood.sku.id) {
                                                orderedFood.sku = goodsSku;
                                            }
                                        }
                                    }
                                    return true;
                                }
                            });
                        } else {
                            com.sankuai.waimai.store.order.a.e().b(a2);
                        }
                        com.sankuai.waimai.store.order.a.e().a(a2, false);
                        com.sankuai.waimai.store.order.a.e().f(a2);
                        iVar.a(null);
                    }
                }
            }, (String) null);
        }
    }

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public final void a(MsiCustomContext msiCustomContext, PurchaseNowForSkuParam purchaseNowForSkuParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, purchaseNowForSkuParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974789df2548c9cd5a5f8937b192ccc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974789df2548c9cd5a5f8937b192ccc2");
        } else if (purchaseNowForSkuParam != null && purchaseNowForSkuParam.jsonInfo != null) {
            try {
                PurchaseNowForSkuParam.JsonInfo jsonInfo = purchaseNowForSkuParam.jsonInfo;
                GoodsSpu goodsSpu = new GoodsSpu();
                goodsSpu.parseJson(new JSONObject(jsonInfo.goods_spu));
                GoodsSku goodsSku = new GoodsSku();
                goodsSku.parseJson(new JSONObject(jsonInfo.goods_sku));
                JSONArray jSONArray = new JSONArray(jsonInfo.goods_attr);
                GoodsAttr[] goodsAttrArr = new GoodsAttr[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        GoodsAttr goodsAttr = new GoodsAttr();
                        goodsAttr.parseJson(optJSONObject);
                        goodsAttrArr[i] = goodsAttr;
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WmOrderedFood(goodsSpu.id, goodsSku.id, goodsAttrArr, jsonInfo.count, 0, 0, goodsSpu.activityTag));
                com.sankuai.waimai.store.order.a.e().a(msiCustomContext.getActivity(), com.sankuai.waimai.store.order.a.e().l(a(jsonInfo.poi_id, jsonInfo.poi_id_str)), SCPageConfig.a(1, 22, ""), (String) null, arrayList, jsonInfo.cart_recommend_couponInfo, (TextView) null, jsonInfo.drug_extra);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public final void a(MsiCustomContext msiCustomContext, SubmitOrderParam submitOrderParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, submitOrderParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c48ea0574650f0f4c6de78c0c31fa9be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c48ea0574650f0f4c6de78c0c31fa9be");
            return;
        }
        com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
        if (submitOrderParam == null || submitOrderParam.jsonInfo == null) {
            return;
        }
        final SubmitOrderParam.JsonInfo jsonInfo = submitOrderParam.jsonInfo;
        final String a = a(jsonInfo.poi_id, jsonInfo.poi_id_str);
        if (e.i(a)) {
            new c(msiCustomContext.getActivity(), e.l(a), SCPageConfig.b, null).a(new c.a() { // from class: com.sankuai.waimai.store.drug.mmp.apis.ShopCartApiImpl.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.shopping.cart.c.a
                public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
                    Object[] objArr2 = {jSONObject, jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b0fa9a95969c35c164e0901ee0c509c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b0fa9a95969c35c164e0901ee0c509c");
                        return;
                    }
                    com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject);
                    b k = com.sankuai.waimai.store.order.a.e().k(a);
                    if (k != null) {
                        try {
                            jSONObject2.put("drug_extra", k.d().drugExtra);
                        } catch (Exception unused) {
                        }
                    }
                }

                @Override // com.sankuai.waimai.store.shopping.cart.c.a
                public final void a(d.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af9ec7ced1f85e1f8ff0d3b460b77397", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af9ec7ced1f85e1f8ff0d3b460b77397");
                        return;
                    }
                    b k = com.sankuai.waimai.store.order.a.e().k(a);
                    if (k == null || k.u == null) {
                        return;
                    }
                    aVar.l = jsonInfo.cart_recommend_couponInfo;
                }
            });
        }
    }

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public final void a(MsiCustomContext msiCustomContext, JumpToPoiChatPageParam jumpToPoiChatPageParam, i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, jumpToPoiChatPageParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c01873e7b97a50cf55753d0c0d5a47a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c01873e7b97a50cf55753d0c0d5a47a");
        } else if (jumpToPoiChatPageParam != null) {
            try {
                if (jumpToPoiChatPageParam.jsonInfo == null) {
                    return;
                }
                String str = jumpToPoiChatPageParam.jsonInfo.poi_id;
                String str2 = jumpToPoiChatPageParam.jsonInfo.spu_id;
                Activity activity = msiCustomContext.getActivity();
                Object[] objArr2 = {str, str2, activity};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f420f519bfdaa0d6f8a73d6c598c4cb2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f420f519bfdaa0d6f8a73d6c598c4cb2");
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("sg-dx-im-from", "sg-from-Restaurant");
                bundle.putString("sg-msgOriginId", "c_waimai_qeknbhm9");
                com.sankuai.waimai.business.im.api.a.a().a(activity, (SessionId) null, 1, 0L, Long.valueOf(str).longValue(), Long.valueOf(str2).longValue(), 10, "", false, bundle);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2eb179a02571f8a94fe2d64074f0b168", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2eb179a02571f8a94fe2d64074f0b168") : !t.a(str2) ? str2 : str;
    }

    @Override // com.meituan.msi.api.extension.medicine.shopcart.IShopcart
    public void notifyNativeShopCartChange(MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45dddbdd78eb94ed9ce6c9eb0c62d441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45dddbdd78eb94ed9ce6c9eb0c62d441");
        } else {
            super.notifyNativeShopCartChange(msiCustomContext);
        }
    }
}
