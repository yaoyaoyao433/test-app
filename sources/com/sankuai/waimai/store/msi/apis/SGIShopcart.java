package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.msi.api.extension.sgc.shopcart.AddShopcartChangeListenerParam;
import com.meituan.msi.api.extension.sgc.shopcart.IShopcart;
import com.meituan.msi.api.extension.sgc.shopcart.OnShopcartStatusChangeResponse;
import com.meituan.msi.api.extension.sgc.shopcart.ShowShopcartParam;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.goods.list.delegate.impl.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.AddProdctResult;
import com.sankuai.waimai.store.msi.listener.a;
import com.sankuai.waimai.store.msi.shopcart.SGMSCShopcartDelegate;
import com.sankuai.waimai.store.msi.view.b;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.shopcart.b;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIShopcart extends IShopcart {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.sgc.shopcart.IShopcart
    public final void a(MsiCustomContext msiCustomContext, final AddShopcartChangeListenerParam addShopcartChangeListenerParam, final j<OnShopcartStatusChangeResponse> jVar) {
        Object[] objArr = {msiCustomContext, addShopcartChangeListenerParam, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678195febcf68156fef6df7264ac36db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678195febcf68156fef6df7264ac36db");
        } else if (a.a(msiCustomContext)) {
        } else {
            final String str = addShopcartChangeListenerParam.poi_id;
            final long a = r.a(str, 0L);
            final com.sankuai.waimai.store.observers.a aVar = new com.sankuai.waimai.store.observers.a() { // from class: com.sankuai.waimai.store.msi.apis.SGIShopcart.1
                public static ChangeQuickRedirect a;

                @Subscribe(threadMode = ThreadMode.MAIN)
                public void onRecommendPairEvent(d.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "524016dcc74c685aa335fb2cfb6184af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "524016dcc74c685aa335fb2cfb6184af");
                    } else if (aVar2 == null || !aVar2.f) {
                    } else {
                        GoodsSpu goodsSpu = aVar2.b;
                        GoodsSku goodsSku = aVar2.c;
                        OnShopcartStatusChangeResponse onShopcartStatusChangeResponse = new OnShopcartStatusChangeResponse();
                        HashMap hashMap = new HashMap();
                        hashMap.put("type", "muti_add_goods");
                        hashMap.put("current_spu_id", Long.valueOf(goodsSpu.getId()));
                        hashMap.put("current_activity_tag", goodsSpu.getActivityTag());
                        hashMap.put("current_sku_id", Long.valueOf(goodsSku.getSkuId()));
                        onShopcartStatusChangeResponse.poi_id = str;
                        onShopcartStatusChangeResponse.shopping_cart = hashMap;
                        jVar.a(onShopcartStatusChangeResponse);
                    }
                }

                @Override // com.sankuai.waimai.store.observers.a
                public final void ba_() {
                    boolean z;
                    b k;
                    AddProdctResult.FoodsBean foodsBean;
                    char c = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "359dfa16c5fb9c51a0d76164ed62284e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "359dfa16c5fb9c51a0d76164ed62284e");
                        return;
                    }
                    OnShopcartStatusChangeResponse onShopcartStatusChangeResponse = new OnShopcartStatusChangeResponse();
                    try {
                        List<OrderedFood> g = com.sankuai.waimai.store.order.a.e().g(a);
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList = null;
                        for (OrderedFood orderedFood : g) {
                            if (orderedFood != null) {
                                long j = orderedFood.spu == null ? 0L : orderedFood.spu.id;
                                int count = orderedFood.getCount();
                                if (orderedFood.spu != null && !TextUtils.equals(orderedFood.spu.activityTag, GoodsSpu.ITEM_COLLECTION_REDEEM)) {
                                    if (hashMap.containsKey(Long.valueOf(j))) {
                                        hashMap.put(Long.valueOf(j), Integer.valueOf(count + ((Integer) hashMap.get(Long.valueOf(j))).intValue()));
                                    } else {
                                        hashMap.put(Long.valueOf(j), Integer.valueOf(count));
                                    }
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("skuId", Long.valueOf(orderedFood.getSkuId()));
                                hashMap2.put("price", Double.valueOf(orderedFood.getPrice()));
                                hashMap2.put("skuCount", Integer.valueOf(orderedFood.getCount()));
                                hashMap2.put("activityTag", orderedFood.getActivityTag());
                                hashMap2.put("spuId", Long.valueOf(orderedFood.getSpuId()));
                                Object[] objArr3 = new Object[1];
                                objArr3[c] = orderedFood;
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.utils.a.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "07811390fdfa4cb04213d6fa1e43f616", RobustBitConfig.DEFAULT_VALUE)) {
                                    foodsBean = (AddProdctResult.FoodsBean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "07811390fdfa4cb04213d6fa1e43f616");
                                } else {
                                    foodsBean = new AddProdctResult.FoodsBean();
                                    if (orderedFood != null) {
                                        if (orderedFood.spu != null) {
                                            foodsBean.setSpu_id(orderedFood.spu.id);
                                            foodsBean.setName(orderedFood.spu.name);
                                            foodsBean.setTagId(orderedFood.spu.physicalTag);
                                        }
                                        if (orderedFood.sku != null) {
                                            foodsBean.setPrice(orderedFood.sku.price);
                                            foodsBean.setOriginalPrice(orderedFood.sku.originPrice);
                                            foodsBean.setPicture(orderedFood.sku.picture);
                                            foodsBean.setMinOrderCount(orderedFood.sku.minOrderCount);
                                            foodsBean.setSkuId(orderedFood.sku.id);
                                            foodsBean.setSpec(orderedFood.sku.spec);
                                            foodsBean.setDescription(orderedFood.sku.description);
                                        }
                                        foodsBean.setCount(orderedFood.count);
                                        if (!com.sankuai.shangou.stone.util.a.b(orderedFood.getAttrIds())) {
                                            foodsBean.setAttrs(com.sankuai.shangou.stone.util.a.d(orderedFood.getAttrIds()));
                                        }
                                    }
                                }
                                hashMap2.put("shopCarData", i.a(foodsBean));
                                arrayList.add(hashMap2);
                            }
                            c = 0;
                        }
                        onShopcartStatusChangeResponse.poi_id = str;
                        onShopcartStatusChangeResponse.shopping_cart = hashMap;
                        HashMap hashMap3 = new HashMap();
                        String s = com.sankuai.waimai.store.order.a.e().s(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(addShopcartChangeListenerParam.poi_id_str, a));
                        HashMap<String, Integer> b2 = com.sankuai.waimai.store.order.a.e().c.b(s);
                        HashMap<String, Integer> a2 = com.sankuai.waimai.store.order.a.e().c.a(s);
                        hashMap3.put("physicalCategoryCount", b2);
                        hashMap3.put("categoryCount", a2);
                        hashMap3.put("orderedFoodList", arrayList);
                        com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
                        long j2 = a;
                        Object[] objArr4 = {new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.order.a.a;
                        double doubleValue = PatchProxy.isSupport(objArr4, e, changeQuickRedirect4, false, "4973d307032cb14f2f60201480db422f", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr4, e, changeQuickRedirect4, false, "4973d307032cb14f2f60201480db422f")).doubleValue() : e.n(String.valueOf(j2));
                        double s2 = com.sankuai.waimai.store.order.a.e().e(a).s();
                        BigDecimal subtract = new BigDecimal(String.valueOf(s2)).subtract(new BigDecimal(String.valueOf(doubleValue)));
                        hashMap3.put("totalSendPrice", Double.valueOf(doubleValue));
                        hashMap3.put("minPrice", Double.valueOf(s2));
                        hashMap3.put("diffPrice", subtract);
                        hashMap3.put("cartType", addShopcartChangeListenerParam.cartType);
                        String str2 = addShopcartChangeListenerParam.cartType;
                        Object[] objArr5 = {str2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "48277fb153bc18bafcecc8cd0139fcc5", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "48277fb153bc18bafcecc8cd0139fcc5")).booleanValue();
                        } else {
                            if (!TextUtils.isEmpty(str2)) {
                                HashSet hashSet = new HashSet(Arrays.asList(str2.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR)));
                                if (hashSet.contains("goodDetail") && hashSet.contains("nonFood")) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            Object[] objArr6 = {hashMap3, s};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "abcd94dbc750d8e62fa0a5500f063c31", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "abcd94dbc750d8e62fa0a5500f063c31");
                            } else {
                                com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(s);
                                if (l != null && (k = com.sankuai.waimai.store.order.a.e().k(s)) != null) {
                                    hashMap3.put("shippingFee", Double.valueOf(l.b.shippingFee));
                                    hashMap3.put("packingFee", Double.valueOf(l.b.packingFee));
                                    hashMap3.put("cartExtendInfo", (String) k.e.a("cart_extend_info"));
                                    hashMap3.put("poiSpType", Integer.valueOf(l.b.originalDeliveryType));
                                    ArrayList arrayList2 = new ArrayList();
                                    com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a(arrayList2, k.b, 0, new ArrayList());
                                    com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a(arrayList2, k.c, 1, new ArrayList());
                                    hashMap3.put("productList", arrayList2);
                                    ArrayList arrayList3 = new ArrayList();
                                    com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a(arrayList3, k.d, 0, new ArrayList());
                                    hashMap3.put("invalidProductList", arrayList3);
                                }
                            }
                        }
                        onShopcartStatusChangeResponse.shopping_cart_info = hashMap3;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    jVar.a(onShopcartStatusChangeResponse);
                }
            };
            com.sankuai.waimai.store.msi.listener.a.a((Context) msiCustomContext.getActivity()).a(msiCustomContext.getActivity(), new a.c() { // from class: com.sankuai.waimai.store.msi.apis.SGIShopcart.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.msi.listener.a.c
                public final void a(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27241efc452c3b42806101255b9b0391", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27241efc452c3b42806101255b9b0391");
                        return;
                    }
                    com.sankuai.waimai.store.order.a.e().a(aVar);
                    com.meituan.android.bus.a.a().a(aVar);
                    aVar.ba_();
                }

                @Override // com.sankuai.waimai.store.msi.listener.a.c
                public final void b(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c4637b2de8d9eacdb6c66de55d1b701", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c4637b2de8d9eacdb6c66de55d1b701");
                        return;
                    }
                    com.sankuai.waimai.store.order.a.e().b(aVar);
                    com.meituan.android.bus.a.a().b(aVar);
                }
            });
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.shopcart.IShopcart
    public final void a(final MsiCustomContext msiCustomContext, com.meituan.msi.api.i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438c6bada62619098fb9379ab52d078e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438c6bada62619098fb9379ab52d078e");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "openWMGlobalShopcart msiCustomContext.getActivity() is dead or null");
        } else {
            com.sankuai.waimai.store.manager.user.a.a(msiCustomContext.getActivity(), new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGIShopcart.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d05b7cc09e167a7c4f09ab9c3fafe75", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d05b7cc09e167a7c4f09ab9c3fafe75");
                    } else {
                        g.a(msiCustomContext.getActivity(), 103);
                    }
                }
            });
            iVar.a(EmptyResponse.INSTANCE);
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.shopcart.IShopcart
    public final void a(final MsiCustomContext msiCustomContext, final ShowShopcartParam showShopcartParam, final com.meituan.msi.api.i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, showShopcartParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12de85f9e7e5c9fd6478405b5bcf02a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12de85f9e7e5c9fd6478405b5bcf02a3");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "showShopcart msiCustomContext.getActivity() is dead or null");
        } else {
            com.sankuai.waimai.store.msi.view.b.a(msiCustomContext.getActivity(), new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGIShopcart.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    View findViewById;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc92e586d38bdcc1f33049f5df00b08b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc92e586d38bdcc1f33049f5df00b08b");
                        return;
                    }
                    try {
                        com.sankuai.waimai.store.msi.view.b bVar = b.a.a;
                        FragmentActivity fragmentActivity = (FragmentActivity) msiCustomContext.getActivity();
                        ShowShopcartParam showShopcartParam2 = showShopcartParam;
                        Object[] objArr3 = {fragmentActivity, showShopcartParam2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.msi.view.b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "15e16bc4e4ce0e5c971d14276ea7ace7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "15e16bc4e4ce0e5c971d14276ea7ace7");
                        } else if (showShopcartParam2.data instanceof Map) {
                            Object[] objArr4 = {fragmentActivity};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.msi.view.b.a;
                            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "6b4483881ccb3785e60525ad3060c2b8", RobustBitConfig.DEFAULT_VALUE)) {
                                findViewById = (View) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "6b4483881ccb3785e60525ad3060c2b8");
                            } else {
                                ViewGroup viewGroup = (ViewGroup) fragmentActivity.getWindow().getDecorView().findViewById(fragmentActivity.hashCode());
                                findViewById = viewGroup != null ? viewGroup.findViewById(10000) : null;
                            }
                            if (findViewById != null) {
                                ((ViewGroup) findViewById.getParent()).removeView(findViewById);
                                if (findViewById instanceof SGMSCShopcartDelegate.a) {
                                    SGMSCShopcartDelegate.a aVar = (SGMSCShopcartDelegate.a) findViewById;
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = SGMSCShopcartDelegate.a.a;
                                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "586dbc164d8605df59d1cdc4918cc5d3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "586dbc164d8605df59d1cdc4918cc5d3");
                                    } else if (aVar.b != null) {
                                        aVar.b.a();
                                    }
                                }
                            }
                            SGMSCShopcartDelegate.a aVar2 = new SGMSCShopcartDelegate(fragmentActivity, showShopcartParam2).b;
                            if (aVar2 != null) {
                                bVar.a(bVar.a(fragmentActivity), aVar2, null, 10);
                            }
                        }
                        iVar.a(EmptyResponse.INSTANCE);
                    } catch (Exception e) {
                        iVar.a(1000, e.getMessage());
                    }
                }
            });
        }
    }
}
