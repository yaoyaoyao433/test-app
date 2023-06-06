package com.sankuai.waimai.store.msi.shopcart;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.msi.view.b;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodAttrValue;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodSkuAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodSpuAttr;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.b;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    static WeakReference<Activity> b;

    public static void a(final Activity activity, final String str, Object obj, i<EmptyResponse> iVar) {
        JSONObject jSONObject;
        GoodsSku goodsSku;
        GoodsAttr[] goodsAttrArr;
        int i = 0;
        Object[] objArr = {activity, str, obj, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15767939d6c3486bc782bd53c8bf7235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15767939d6c3486bc782bd53c8bf7235");
            return;
        }
        try {
            long a2 = r.a(str, 0L);
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = obj instanceof Map ? new JSONObject((Map) obj) : null;
            }
            String optString = jSONObject.optString("optType", "0");
            final String optString2 = jSONObject.optString("addSuccessToastText");
            final boolean optBoolean = jSONObject.optBoolean("showCollectOrderLayer");
            if ("update".equals(optString)) {
                com.sankuai.waimai.store.order.a.e().b(a2);
            } else if (optString.equals("add_list")) {
                Activity c = SGMSCShopcartDelegate.c();
                if (c != null) {
                    i = c.hashCode();
                }
                a(str, jSONObject, i);
            } else if ("order_again".equals(optString)) {
                final boolean optBoolean2 = jSONObject.optBoolean("add_show_shopCart");
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                com.sankuai.waimai.store.order.a.e().a(a2);
                com.sankuai.waimai.store.order.a.e().a(a2, OrderedFood.fromOrderAgain(optJSONArray));
                com.sankuai.waimai.store.order.a.e().b(a2, new AbstractC1245a(activity) { // from class: com.sankuai.waimai.store.msi.shopcart.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(b bVar) {
                        final Activity c2;
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d9d5f1a3625bb95a58a7a4a80b42e81", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d9d5f1a3625bb95a58a7a4a80b42e81");
                        } else if (!optBoolean2 || (c2 = c()) == null) {
                        } else {
                            al.a(new Runnable() { // from class: com.sankuai.waimai.store.msi.shopcart.a.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e50878417ea3161c843ae9405948a0d5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e50878417ea3161c843ae9405948a0d5");
                                        return;
                                    }
                                    com.sankuai.waimai.store.shopping.cart.event.b bVar2 = new com.sankuai.waimai.store.shopping.cart.event.b();
                                    bVar2.b = false;
                                    bVar2.a = c2.hashCode();
                                    com.meituan.android.bus.a.a().c(bVar2);
                                }
                            }, 200, com.sankuai.waimai.store.msi.listener.a.a(c2));
                        }
                    }
                });
            } else {
                JSONObject optJSONObject = jSONObject.optJSONObject("goods_spu");
                int optInt = jSONObject.optInt("count");
                GoodsSpu goodsSpu = new GoodsSpu();
                goodsSpu.parseJson(optJSONObject);
                String optString3 = jSONObject.optString("isMul", "0");
                boolean optBoolean3 = jSONObject.optBoolean("add_show_shopCart");
                if (!"1".equals(optString3)) {
                    if (optInt > 0) {
                        final JSONObject optJSONObject2 = jSONObject.optJSONObject("screenPoint");
                        final boolean optBoolean4 = jSONObject.optBoolean("auto_add", false);
                        com.sankuai.waimai.store.order.a.e().a(a2, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0), (GoodsAttr[]) null, new AbstractC1245a(activity) { // from class: com.sankuai.waimai.store.msi.shopcart.a.5
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efb9df5c0ee0e707414a80107aaaa7bf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efb9df5c0ee0e707414a80107aaaa7bf");
                                }
                            }

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(b bVar) {
                                Object[] objArr2 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da30577a1dc8bc5969c9db200d34919e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da30577a1dc8bc5969c9db200d34919e");
                                    return;
                                }
                                Activity c2 = c();
                                if (optJSONObject2 != null && c2 != null && !com.sankuai.waimai.store.util.b.a(c2) && c2.getApplicationContext() != null && !optBoolean4) {
                                    int[] iArr = {h.a(c2.getApplicationContext(), optJSONObject2.optInt(Constants.GestureMoveEvent.KEY_X)), h.a(c2.getApplicationContext(), optJSONObject2.optInt(Constants.GestureMoveEvent.KEY_Y))};
                                    f a3 = f.a();
                                    long a4 = r.a(str, 0L);
                                    Object[] objArr3 = {iArr, c2, null, (byte) 0, new Long(a4)};
                                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                                    if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "b8bb46f7d6e8bfd7d8e212831ec88f38", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "b8bb46f7d6e8bfd7d8e212831ec88f38");
                                    } else {
                                        a3.a(iArr, (Context) c2, (ViewGroup) null, false, String.valueOf(a4));
                                    }
                                }
                                if (!TextUtils.isEmpty(optString2)) {
                                    am.a(c2, optString2);
                                }
                                if (optBoolean) {
                                    b.a.a.a(c2, bVar);
                                }
                            }

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                Object[] objArr2 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab2212575db0bd21aaa96dbf11c63bdc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab2212575db0bd21aaa96dbf11c63bdc");
                                    return;
                                }
                                Activity c2 = c();
                                if (TextUtils.isEmpty(aVar.getMessage()) || com.sankuai.waimai.store.util.b.a(c2)) {
                                    return;
                                }
                                am.a(c2, aVar.getMessage());
                            }
                        });
                        return;
                    } else if (!p.a(goodsSpu) && goodsSpu.isManySku()) {
                        ad.a(new Runnable() { // from class: com.sankuai.waimai.store.msi.shopcart.a.6
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1bc2cff12ef828d9e94f48000e3f23c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1bc2cff12ef828d9e94f48000e3f23c");
                                    return;
                                }
                                com.sankuai.waimai.store.shopping.cart.event.b bVar = new com.sankuai.waimai.store.shopping.cart.event.b();
                                bVar.a = activity != null ? activity.hashCode() : 0;
                                com.meituan.android.bus.a.a().c(bVar);
                            }
                        });
                        return;
                    } else {
                        com.sankuai.waimai.store.order.a.e().b(a2, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0), (GoodsAttr[]) null, new AbstractC1245a(activity) { // from class: com.sankuai.waimai.store.msi.shopcart.a.7
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                            }

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                Object[] objArr2 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed3c547f9fe55682de26828576034ea1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed3c547f9fe55682de26828576034ea1");
                                    return;
                                }
                                Activity c2 = c();
                                if (TextUtils.isEmpty(aVar.getMessage()) || com.sankuai.waimai.store.util.b.a(c2)) {
                                    return;
                                }
                                am.a(c2, aVar.getMessage());
                            }
                        });
                        return;
                    }
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("lxParams");
                long optLong = jSONObject.optLong("sku_id", -1L);
                if (optJSONObject3 != null) {
                    goodsSpu.stid = optJSONObject3.optString("stid", "");
                }
                if (optLong > 0) {
                    Iterator<GoodsSku> it = goodsSpu.skus.iterator();
                    goodsSku = null;
                    while (it.hasNext()) {
                        GoodsSku next = it.next();
                        Iterator<GoodsSku> it2 = it;
                        if (next.id == optLong) {
                            goodsSku = next;
                        }
                        it = it2;
                    }
                } else {
                    goodsSku = null;
                }
                boolean optBoolean5 = jSONObject.optBoolean("is_need_attrs", false);
                GoodsAttr[] a3 = goodsSku != null ? a(goodsSpu, goodsSku) : null;
                if (optBoolean5) {
                    String optString4 = jSONObject.optString("skuAttrs");
                    goodsAttrArr = !t.a(optString4) ? (GoodsAttr[]) com.sankuai.waimai.store.util.i.a(optString4, new TypeToken<GoodsAttr[]>() { // from class: com.sankuai.waimai.store.msi.shopcart.a.2
                    }.getType()) : null;
                } else {
                    goodsAttrArr = a3;
                }
                boolean optBoolean6 = jSONObject.optBoolean("is_need_count", false);
                if (optBoolean3) {
                    com.sankuai.waimai.store.order.a.e().a(a2);
                    if (optBoolean6) {
                        com.sankuai.waimai.store.order.a.e().a(a2, goodsSpu, goodsSku, goodsAttrArr, optInt, new AbstractC1245a(activity) { // from class: com.sankuai.waimai.store.msi.shopcart.a.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                Object[] objArr2 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31a7c4dff48b8c5996971cd506f139fa", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31a7c4dff48b8c5996971cd506f139fa");
                                    return;
                                }
                                Activity c2 = c();
                                if (c2 == null) {
                                    return;
                                }
                                com.sankuai.waimai.store.shopping.cart.event.b bVar2 = new com.sankuai.waimai.store.shopping.cart.event.b();
                                bVar2.b = false;
                                bVar2.a = c2.hashCode();
                                com.meituan.android.bus.a.a().c(bVar2);
                            }
                        });
                        return;
                    } else {
                        com.sankuai.waimai.store.order.a.e().a(a2, goodsSpu, goodsSku, goodsAttrArr, new AbstractC1245a(activity) { // from class: com.sankuai.waimai.store.msi.shopcart.a.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                Object[] objArr2 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc84293c054bf8a154334dc25c95debc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc84293c054bf8a154334dc25c95debc");
                                    return;
                                }
                                Activity c2 = c();
                                if (c2 == null) {
                                    return;
                                }
                                com.sankuai.waimai.store.shopping.cart.event.b bVar2 = new com.sankuai.waimai.store.shopping.cart.event.b();
                                bVar2.b = false;
                                bVar2.a = c2.hashCode();
                                com.meituan.android.bus.a.a().c(bVar2);
                            }
                        });
                        return;
                    }
                }
                a(activity, str, jSONObject, goodsSpu, goodsSku);
            }
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a("handleInnerShopCartOp", "poiId" + str + ";goodInfo=" + obj, e);
        }
    }

    private static void a(final Activity activity, String str, final JSONObject jSONObject, final GoodsSpu goodsSpu, final GoodsSku goodsSku) {
        Object[] objArr = {activity, str, jSONObject, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "778da5fb449ed735a9585205a1a9ef77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "778da5fb449ed735a9585205a1a9ef77");
            return;
        }
        final JSONObject optJSONObject = jSONObject.optJSONObject("poi_info");
        final int optInt = jSONObject.optInt("show_type", 0);
        if (optJSONObject != null) {
            final Poi poi = new Poi();
            poi.parseJsonToPoi(optJSONObject);
            poi.id = r.a(str, 0L);
            String optString = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
            if (!t.a(optString)) {
                poi.poiIdStr = optString;
            }
            String optString2 = jSONObject.optString("bridge_config_extra");
            if (!t.a(optString2) && !p.a(goodsSpu)) {
                goodsSpu.bridgeConfigExtra = optString2;
            }
            com.sankuai.waimai.store.msi.view.b.a(activity, new Runnable() { // from class: com.sankuai.waimai.store.msi.shopcart.a.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10b593901a50aa09ece884e4bc614315", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10b593901a50aa09ece884e4bc614315");
                        return;
                    }
                    a.b = new WeakReference<>(activity);
                    if (optInt != 0) {
                        g.a(activity, goodsSpu, poi, optInt, jSONObject.optString("unique_stype"), optJSONObject.toString());
                    } else if (goodsSku != null) {
                        g.a(activity, poi.getTemplateType(), goodsSpu, goodsSku, poi, (Map<String, Object>) null);
                    } else {
                        g.a(activity, goodsSpu, poi, 7);
                    }
                }
            });
        }
    }

    public static Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d10865f7e359c6e1cd32bb2037325c80", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d10865f7e359c6e1cd32bb2037325c80");
        }
        if (b == null) {
            return null;
        }
        return b.get();
    }

    private static GoodsAttr[] a(@NonNull GoodsSpu goodsSpu, @NonNull GoodsSku goodsSku) {
        Object[] objArr = {goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39021e9930ba823ece678cc74273f73f", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39021e9930ba823ece678cc74273f73f");
        }
        ArrayList arrayList = new ArrayList();
        List<SGGoodSpuAttr> list = goodsSpu.spuAttrsList;
        List<SGGoodSkuAttr> list2 = goodsSpu.serverSkuAttrsMap == null ? null : goodsSpu.serverSkuAttrsMap.get(Long.valueOf(goodsSku.id));
        if (com.sankuai.shangou.stone.util.a.b(list2) || com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (SGGoodSkuAttr sGGoodSkuAttr : list2) {
            if (sGGoodSkuAttr != null) {
                hashSet.add(sGGoodSkuAttr.name + '-' + sGGoodSkuAttr.value);
                hashSet2.add(sGGoodSkuAttr.spuAttrId);
            }
        }
        for (SGGoodSpuAttr sGGoodSpuAttr : list) {
            if (sGGoodSpuAttr != null && !com.sankuai.shangou.stone.util.a.b(sGGoodSpuAttr.valueList)) {
                for (SGGoodAttrValue sGGoodAttrValue : sGGoodSpuAttr.valueList) {
                    if (sGGoodAttrValue != null) {
                        if (!hashSet2.contains(String.valueOf(sGGoodAttrValue.id))) {
                            if (hashSet.contains(sGGoodSpuAttr.name + '-' + sGGoodAttrValue.value)) {
                            }
                        }
                        arrayList.add(sGGoodAttrValue.convertToServerAttr(sGGoodSpuAttr.name));
                        break;
                    }
                }
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
            return null;
        }
        return (GoodsAttr[]) arrayList.toArray(new GoodsAttr[com.sankuai.shangou.stone.util.a.a((List) arrayList)]);
    }

    private static void a(String str, final JSONObject jSONObject, final int i) {
        Object[] objArr = {str, jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77a80af1627c03d983af7debd350f64d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77a80af1627c03d983af7debd350f64d");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return;
        }
        List<OrderedFood> a2 = a(optJSONArray);
        com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
        e.f(str, a2);
        e.b(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.msi.shopcart.a.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "baea4e18f351607a4bfd43bc0b64955d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "baea4e18f351607a4bfd43bc0b64955d");
                } else if (jSONObject.optBoolean("popShopCart", true)) {
                    com.sankuai.waimai.store.shopping.cart.event.b bVar2 = new com.sankuai.waimai.store.shopping.cart.event.b();
                    bVar2.b = false;
                    bVar2.a = i;
                    com.meituan.android.bus.a.a().c(bVar2);
                }
            }
        });
    }

    private static List<OrderedFood> a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf2b448a86b33b0a98dfe773ffc7f4b9", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf2b448a86b33b0a98dfe773ffc7f4b9") : OrderedFood.fromOrderAgain(jSONArray);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.msi.shopcart.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1245a extends com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b {
        public static ChangeQuickRedirect g;
        private final WeakReference<Activity> a;
        private final Activity b;

        public AbstractC1245a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "625e031108e24e98b86cf394625a8f5d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "625e031108e24e98b86cf394625a8f5d");
            } else if (d()) {
                this.b = null;
                this.a = new WeakReference<>(activity);
            } else {
                this.b = activity;
                this.a = null;
            }
        }

        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
        public final String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd29d4dabe8629cae7df5f9932081fde", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd29d4dabe8629cae7df5f9932081fde");
            }
            Activity c = c();
            if (c != null && d()) {
                return com.sankuai.waimai.store.msi.listener.a.a(c);
            }
            return super.b();
        }

        public final Activity c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb6cf2bdf80f45b49f5ee56edff5888", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb6cf2bdf80f45b49f5ee56edff5888");
            }
            if (this.a != null) {
                return this.a.get();
            }
            return this.b;
        }

        private boolean d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = g;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f737dc3e4c169c9b50fc178ab95bbcef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f737dc3e4c169c9b50fc178ab95bbcef")).booleanValue() : j.h().a("msc_activity_leak", true);
        }
    }
}
