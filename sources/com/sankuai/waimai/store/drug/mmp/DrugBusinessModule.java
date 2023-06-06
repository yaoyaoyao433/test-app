package com.sankuai.waimai.store.drug.mmp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.drug.AbsDrugBusinessModule;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.im.api.a;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.platform.domain.core.shopcart.b;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.platform.domain.manager.order.c;
import com.sankuai.waimai.store.platform.domain.manager.order.d;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.util.i;
import com.sankuai.xm.im.session.SessionId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class DrugBusinessModule extends AbsDrugBusinessModule {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ResultShopCartInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("shop_cart_request_data")
        private String requestData;
    }

    public static /* synthetic */ void a(JSONObject jSONObject, Activity activity, IApiCallback iApiCallback) throws JSONException {
        Object[] objArr = {jSONObject, activity, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30c26c5fc7a919748a0a2392d8aacd6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30c26c5fc7a919748a0a2392d8aacd6e");
            return;
        }
        long b = b(jSONObject);
        if (b <= 0) {
            iApiCallback.onFail(a());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("sg-dx-im-from", "sg-from-Restaurant");
        bundle.putString("sg-msgOriginId", "c_waimai_qeknbhm9");
        a.a().a(activity, (SessionId) null, 1, 0L, b, 0L, 10, "", false, bundle);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class GetNativeShopCartData extends AbsDrugBusinessModule.AbsGetNativeShopCartData {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsDrugBusinessModule.RequestInfo requestInfo, IApiCallback iApiCallback) {
            AbsDrugBusinessModule.RequestInfo requestInfo2 = requestInfo;
            Object[] objArr = {str, requestInfo2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802d644c906e8e298383c8be7b777661", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802d644c906e8e298383c8be7b777661");
                return;
            }
            com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
            if (requestInfo2 == null || t.a(requestInfo2.jsonInfo)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(requestInfo2.jsonInfo);
                String optString = jSONObject.optString("origin_poi_id");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("poi_info"));
                if (t.a(optString)) {
                    return;
                }
                try {
                    Long valueOf = Long.valueOf(optString);
                    if (valueOf == null) {
                        return;
                    }
                    Poi poi = new Poi();
                    poi.parseJsonToPoi(jSONObject2);
                    e.a(valueOf.longValue(), poi.getLongPoiId());
                    e.a(valueOf.longValue(), poi);
                    b d = e.d(poi.getLongPoiId());
                    if (d.h()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<OrderedFood> it = d.i().iterator();
                        while (it.hasNext()) {
                            OrderedFood next = it.next();
                            if (next != null) {
                                arrayList.add(next.sku);
                            }
                        }
                        String json = new Gson().toJson(com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a((GoodsSpu) null, e.e(valueOf.longValue()), d, new com.sankuai.waimai.store.platform.domain.manager.order.b().b));
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("shop_cart_request_data", json);
                        jSONObject3.put("sku_list", i.a(arrayList));
                        iApiCallback.onSuccess(jSONObject3);
                        return;
                    }
                    iApiCallback.onSuccess(null);
                } catch (Exception unused) {
                    iApiCallback.onFail(new JSONObject());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class GetShopCartData extends AbsDrugBusinessModule.AbsGetShopCartData {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsDrugBusinessModule.RequestInfo requestInfo, IApiCallback iApiCallback) {
            AbsDrugBusinessModule.RequestInfo requestInfo2 = requestInfo;
            Object[] objArr = {str, requestInfo2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94af137f8313c4675abc604a67837fe2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94af137f8313c4675abc604a67837fe2");
                return;
            }
            com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
            if (requestInfo2 != null) {
                try {
                    if (t.a(requestInfo2.jsonInfo)) {
                        return;
                    }
                    long b2 = DrugBusinessModule.b(new JSONObject(requestInfo2.jsonInfo));
                    if (b2 <= 0) {
                        iApiCallback.onFail(DrugBusinessModule.a());
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    b d = e.d(b2);
                    if (d.h()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<OrderedFood> it = d.i().iterator();
                        while (it.hasNext()) {
                            OrderedFood next = it.next();
                            if (next != null) {
                                arrayList.add(next.sku);
                            }
                        }
                        c cVar = e.c;
                        Object[] objArr2 = {new Long(b2)};
                        ChangeQuickRedirect changeQuickRedirect2 = c.a;
                        HashMap<String, Integer> a = PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "a7128e4c224bb216995933884b92157b", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "a7128e4c224bb216995933884b92157b") : cVar.a(String.valueOf(b2));
                        c cVar2 = e.c;
                        Object[] objArr3 = {new Long(b2)};
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        HashMap<String, Integer> b3 = PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "6df53fa4e3d391ed5be672e6a1d56937", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "6df53fa4e3d391ed5be672e6a1d56937") : cVar2.b(String.valueOf(b2));
                        jSONObject.put("category_count", i.a(a));
                        jSONObject.put("physical_category_count", i.a(b3));
                        jSONObject.put("shop_cart_data", i.a(d.x));
                        jSONObject.put("sku_list", i.a(arrayList));
                        iApiCallback.onSuccess(jSONObject);
                        return;
                    }
                    iApiCallback.onSuccess(jSONObject);
                } catch (JSONException e2) {
                    com.dianping.judas.util.a.a(e2);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class UpdateNativeShopCartData extends AbsDrugBusinessModule.AbsUpdateNativeShopCartDataextends {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsDrugBusinessModule.RequestInfo requestInfo, IApiCallback iApiCallback) {
            AbsDrugBusinessModule.RequestInfo requestInfo2 = requestInfo;
            Object[] objArr = {str, requestInfo2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb5c006dceb62581d93dd6ba3e4f1bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb5c006dceb62581d93dd6ba3e4f1bd");
            } else if (requestInfo2 != null) {
                try {
                    if (t.a(requestInfo2.jsonInfo)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(requestInfo2.jsonInfo);
                    long b2 = DrugBusinessModule.b(jSONObject);
                    if (b2 <= 0) {
                        iApiCallback.onFail(DrugBusinessModule.a());
                        return;
                    }
                    String optString = jSONObject.optString("shop_cart_data");
                    String optString2 = jSONObject.optString("sku_list");
                    NetPriceCalculatorResult netPriceCalculatorResult = (NetPriceCalculatorResult) i.a(optString, NetPriceCalculatorResult.class);
                    if (netPriceCalculatorResult != null && netPriceCalculatorResult.r != null) {
                        com.sankuai.waimai.store.order.a.e().a(b2, netPriceCalculatorResult.b);
                        b d = com.sankuai.waimai.store.order.a.e().d(b2);
                        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a(d, netPriceCalculatorResult);
                        com.sankuai.waimai.store.order.a.e().g(b2);
                        final ArrayList arrayList = (ArrayList) i.a(optString2, new TypeToken<ArrayList<GoodsSku>>() { // from class: com.sankuai.waimai.store.drug.mmp.DrugBusinessModule.UpdateNativeShopCartData.1
                        }.getType());
                        d.a.d(d, new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.drug.mmp.DrugBusinessModule.UpdateNativeShopCartData.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                            public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                                Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d05ee5e30b1473f31f7fc874a71ad00", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d05ee5e30b1473f31f7fc874a71ad00")).booleanValue();
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
                        com.sankuai.waimai.store.order.a.e().a(b2);
                    }
                    com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
                    Object[] objArr2 = {new Long(b2), (byte) 0};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.a.a;
                    if (PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "829afacffc9aebd0e15723df3cb77399", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "829afacffc9aebd0e15723df3cb77399");
                    } else {
                        e.a(String.valueOf(b2), false);
                    }
                } catch (JSONException e2) {
                    com.dianping.judas.util.a.a(e2);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class CollectPoi extends AbsDrugBusinessModule.AbsCollectPoi {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsDrugBusinessModule.RequestInfo requestInfo, IApiCallback iApiCallback) {
            AbsDrugBusinessModule.RequestInfo requestInfo2 = requestInfo;
            Object[] objArr = {str, requestInfo2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f65d78d3466f1666ab4ca1d2a1e940b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f65d78d3466f1666ab4ca1d2a1e940b7");
            } else if (requestInfo2 != null) {
                try {
                    if (t.a(requestInfo2.jsonInfo)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(requestInfo2.jsonInfo);
                    long b2 = DrugBusinessModule.b(jSONObject);
                    boolean optBoolean = jSONObject.optBoolean("is_collected");
                    if (b2 <= 0) {
                        iApiCallback.onFail(DrugBusinessModule.a());
                    } else {
                        com.sankuai.waimai.store.drug.manager.collection.b.a().a(b2, optBoolean, true);
                    }
                } catch (JSONException e) {
                    com.dianping.judas.util.a.a(e);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class SubmitOrder extends AbsDrugBusinessModule.AbsSubmitOrder {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsDrugBusinessModule.RequestInfo requestInfo, IApiCallback iApiCallback) {
            AbsDrugBusinessModule.RequestInfo requestInfo2 = requestInfo;
            Object[] objArr = {str, requestInfo2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2aebe639480850bafa768438a718ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2aebe639480850bafa768438a718ed");
                return;
            }
            com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
            if (requestInfo2 != null) {
                try {
                    if (t.a(requestInfo2.jsonInfo)) {
                        return;
                    }
                    final long b2 = DrugBusinessModule.b(new JSONObject(requestInfo2.jsonInfo));
                    if (b2 <= 0) {
                        iApiCallback.onFail(DrugBusinessModule.a());
                    } else if (e.c(b2)) {
                        new com.sankuai.waimai.store.shopping.cart.c(getActivity(), e.e(b2), SCPageConfig.b, null).a(new c.a() { // from class: com.sankuai.waimai.store.drug.mmp.DrugBusinessModule.SubmitOrder.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.shopping.cart.c.a
                            public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
                                Object[] objArr2 = {jSONObject, jSONObject2};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c60289ebb40796f11fed9b14ada73c0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c60289ebb40796f11fed9b14ada73c0");
                                    return;
                                }
                                com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject);
                                b d = com.sankuai.waimai.store.order.a.e().d(b2);
                                if (d != null) {
                                    try {
                                        jSONObject2.put("drug_extra", d.d().drugExtra);
                                    } catch (Exception unused) {
                                    }
                                }
                            }

                            @Override // com.sankuai.waimai.store.shopping.cart.c.a
                            public final void a(d.a aVar) {
                                Object[] objArr2 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cb9bad7a50e4f7b3ae012c5c49580fb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cb9bad7a50e4f7b3ae012c5c49580fb");
                                    return;
                                }
                                b d = com.sankuai.waimai.store.order.a.e().d(b2);
                                if (d == null || d.u == null) {
                                    return;
                                }
                                aVar.l = d.u.recommendCouponInfo;
                            }
                        });
                    }
                } catch (JSONException e2) {
                    com.dianping.judas.util.a.a(e2);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class JumpToPoiChatPage extends ApiFunction<AbsDrugBusinessModule.RequestInfo, AbsDrugBusinessModule.RequestInfo> {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsDrugBusinessModule.RequestInfo requestInfo, IApiCallback iApiCallback) {
            int a;
            Bundle bundle;
            AbsDrugBusinessModule.RequestInfo requestInfo2 = requestInfo;
            Object[] objArr = {str, requestInfo2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad563ac04ee6d6b523ff07410cfd430e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad563ac04ee6d6b523ff07410cfd430e");
            } else if (requestInfo2 != null) {
                try {
                    if (t.a(requestInfo2.jsonInfo)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(requestInfo2.jsonInfo);
                    if (1 != DrugBusinessModule.a(jSONObject)) {
                        DrugBusinessModule.a(jSONObject, getActivity(), iApiCallback);
                        return;
                    }
                    Order a2 = DrugBusinessModule.a(jSONObject.optString("order"));
                    if (a2 != null) {
                        Activity activity = getActivity();
                        Object[] objArr2 = {activity, a2};
                        ChangeQuickRedirect changeQuickRedirect2 = DrugBusinessModule.a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b533839ee2e6c65e43e90079ab204bb2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b533839ee2e6c65e43e90079ab204bb2");
                            return;
                        }
                        a a3 = a.a();
                        long b2 = DrugBusinessModule.b(a2.getHashId());
                        long poiId = a2.getPoiId();
                        Object[] objArr3 = {activity, a2};
                        ChangeQuickRedirect changeQuickRedirect3 = DrugBusinessModule.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f18142f1e9f5684584452033679e0f8d", RobustBitConfig.DEFAULT_VALUE)) {
                            bundle = (Bundle) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f18142f1e9f5684584452033679e0f8d");
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("status_desc", a2.getStatusDescription());
                            bundle2.putInt("status", a2.getStatus());
                            bundle2.putDouble("total", a2.getTotal());
                            bundle2.putLong("order_time", DrugBusinessModule.b(a2.getOrderTime()));
                            bundle2.putLong("order_view_id", DrugBusinessModule.b(a2.getHashId()));
                            String str2 = "";
                            Order.b bVar = (Order.b) com.sankuai.shangou.stone.util.a.a((List<Object>) a2.productList, 0);
                            if (TextUtils.isEmpty("") && bVar != null) {
                                str2 = bVar.b;
                            }
                            if (com.sankuai.shangou.stone.util.a.a((List) a2.productList) > 1) {
                                str2 = str2 + activity.getString(R.string.wm_sc_order_list_order_count_desc, Integer.valueOf(a));
                            }
                            bundle2.putString("food_desc", str2);
                            bundle = bundle2;
                        }
                        a3.a(activity, (SessionId) null, 3, b2, poiId, 0L, 10, "", false, bundle);
                        return;
                    }
                    DrugBusinessModule.a(jSONObject, getActivity(), iApiCallback);
                } catch (Exception e) {
                    com.dianping.judas.util.a.a(e);
                }
            }
        }
    }

    static Order a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4bd7dcaa01b715bcab2e328a2625684", RobustBitConfig.DEFAULT_VALUE)) {
            return (Order) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4bd7dcaa01b715bcab2e328a2625684");
        }
        if (t.a(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Order order = new Order();
            order.setStatusDescription(jSONObject.optString("status_description", ""));
            order.setStatus(jSONObject.optInt("status", -1));
            order.setTotal(jSONObject.optDouble("total", 0.0d));
            order.setOrderTime(jSONObject.optString("order_time", ""));
            order.setOrderId(jSONObject.optLong("wm_order_id", -1L));
            order.setPoiId(jSONObject.optLong("wm_poi_id"));
            order.setHashId(jSONObject.optString("hash_id", ""));
            JSONArray optJSONArray = jSONObject.optJSONArray("product_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList<Order.b> arrayList = new ArrayList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    order.getClass();
                    Order.b bVar = new Order.b();
                    bVar.a(jSONObject2);
                    arrayList.add(bVar);
                }
                order.productList = arrayList;
            }
            return order;
        } catch (Exception unused) {
            return null;
        }
    }

    static int a(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "768ff7e0377d5b7de8c2900baaba1881", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "768ff7e0377d5b7de8c2900baaba1881")).intValue();
        }
        try {
            return jSONObject.optInt("type");
        } catch (Exception unused) {
            return 0;
        }
    }

    static long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d45158c1c268adc90ea3647f95ca79d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d45158c1c268adc90ea3647f95ca79d4")).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
            return -1L;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class PurchaseNow extends ApiFunction<AbsDrugBusinessModule.RequestInfo, AbsDrugBusinessModule.RequestInfo> {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsDrugBusinessModule.RequestInfo requestInfo, IApiCallback iApiCallback) {
            AbsDrugBusinessModule.RequestInfo requestInfo2 = requestInfo;
            Object[] objArr = {str, requestInfo2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d1636bd5acbef56c2331eb2fcbf39c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d1636bd5acbef56c2331eb2fcbf39c");
            } else if (requestInfo2 != null) {
                try {
                    if (t.a(requestInfo2.jsonInfo)) {
                        return;
                    }
                    ShopcartBean shopcartBean = (ShopcartBean) i.a(requestInfo2.jsonInfo, ShopcartBean.class);
                    long j = 0;
                    if (!t.a(shopcartBean.poiId)) {
                        long longValue = Long.valueOf(shopcartBean.poiId).longValue();
                        if (longValue <= 0) {
                            iApiCallback.onFail(DrugBusinessModule.a());
                            return;
                        }
                        j = longValue;
                    }
                    List<GoodsSpu> list = shopcartBean.productList;
                    if (com.sankuai.shangou.stone.util.a.b(list)) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    int a = com.sankuai.shangou.stone.util.a.a((List) list);
                    int i = 0;
                    for (int i2 = 0; i2 < a; i2++) {
                        GoodsSpu goodsSpu = list.get(i2);
                        if (goodsSpu != null) {
                            arrayList.add(new WmOrderedFood(goodsSpu.getId(), goodsSpu.getCycleSkuId(), goodsSpu.getFirstGoodAttr(), Math.max(goodsSpu.inCartCount, 1), 0, 0, goodsSpu.activityTag));
                            if (i == 0) {
                                sb.append(goodsSpu.id);
                            } else {
                                sb.append(CommonConstant.Symbol.COMMA + goodsSpu.id);
                            }
                            i++;
                        }
                    }
                    if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                        return;
                    }
                    com.sankuai.waimai.store.order.a.e().a(getActivity(), com.sankuai.waimai.store.order.a.e().e(j), SCPageConfig.a(1, 22, ""), (String) null, arrayList, (String) null, (TextView) null, shopcartBean.drugExtra);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static JSONObject a() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abe3b182a75d32fa11c539f21511f79c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abe3b182a75d32fa11c539f21511f79c");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", "poi_id is null");
        return jSONObject;
    }

    public static long b(@NonNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7165fec6df8cd2de148bbadf798609ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7165fec6df8cd2de148bbadf798609ac")).longValue();
        }
        String optString = jSONObject.optString("poi_id");
        if (t.a(optString)) {
            return jSONObject.optLong("wm_poi_id");
        }
        Long valueOf = Long.valueOf(optString);
        if (valueOf == null) {
            return jSONObject.optLong("wm_poi_id");
        }
        return valueOf.longValue();
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class ShopcartBean implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("collect_type")
        public int collectType;
        @SerializedName("drug_extra")
        public String drugExtra;
        @SerializedName("group_id")
        public int groupId;
        @SerializedName(DataConstants.IS_AUTO)
        public int isAuto;
        @SerializedName("poi_id")
        public String poiId;
        @SerializedName("product_list")
        public List<GoodsSpu> productList;

        public ShopcartBean() {
        }
    }
}
