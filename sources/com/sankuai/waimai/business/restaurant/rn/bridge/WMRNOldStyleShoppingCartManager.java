package com.sankuai.waimai.business.restaurant.rn.bridge;

import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.business.restaurant.base.shopcart.g;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.restaurant.shopcart.utils.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMRNOldStyleShoppingCartManager extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String JS_REFRESH_SPU = "RefreshGoodsList";
    private static final String RN_MODEL_NAME = "WMRNOldStyleShoppingCartManager";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RN_MODEL_NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public WMRNOldStyleShoppingCartManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbf3dd3f78bcea94cd5f64185a56e8a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbf3dd3f78bcea94cd5f64185a56e8a3");
        } else {
            reactApplicationContext.addLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc275f351f309aa3e84af2bc18df0a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc275f351f309aa3e84af2bc18df0a8e");
        } else {
            super.initialize();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b getCurrentDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d10127c3cfb0db71ff7db8c5c39eea4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d10127c3cfb0db71ff7db8c5c39eea4f");
        }
        if (getCurrentActivity() instanceof b) {
            return (b) getCurrentActivity();
        }
        return null;
    }

    @ReactMethod
    public void hideCart(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33a8ac4a6351dc7d186db3322ed97bd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33a8ac4a6351dc7d186db3322ed97bd3");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8e05b57484d55c94f1a7a7d72551f636", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8e05b57484d55c94f1a7a7d72551f636");
                        return;
                    }
                    b currentDelegate = WMRNOldStyleShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    try {
                        currentDelegate.l();
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void locateGoodsFromShopCart(String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6057b57774c448fa350bf4e41192968a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6057b57774c448fa350bf4e41192968a");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String physicalTag;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c8aaaa53289d0af62deef9c166b116b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c8aaaa53289d0af62deef9c166b116b9");
                        return;
                    }
                    b currentDelegate = WMRNOldStyleShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    try {
                        List<OrderedFood> b = k.a().b(currentDelegate.k(), Long.parseLong(str2));
                        if (b != null && !b.isEmpty()) {
                            OrderedFood orderedFood = b.get(0);
                            com.sankuai.waimai.platform.domain.manager.poi.a a2 = com.sankuai.waimai.platform.domain.manager.poi.a.a();
                            String k = currentDelegate.k();
                            Object[] objArr3 = {orderedFood};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.restaurant.shopcart.viewHolder.c.f;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "363a15bed0c2098009a49dbe106b85bf", RobustBitConfig.DEFAULT_VALUE)) {
                                physicalTag = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "363a15bed0c2098009a49dbe106b85bf");
                            } else if (orderedFood.spu.getActivityTag() != null && orderedFood.spu.getActivityTag().length() > 0) {
                                physicalTag = orderedFood.spu.getActivityTag();
                            } else if (orderedFood.spu.getTag() != null && orderedFood.spu.getTag().length() > 0) {
                                physicalTag = orderedFood.spu.getTag();
                            } else {
                                physicalTag = orderedFood.spu.getPhysicalTag();
                            }
                            a2.a(k, physicalTag, orderedFood.getSpuId());
                            currentDelegate.l();
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void clearCart(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e92d89a6925227f2a374073a99f0125b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e92d89a6925227f2a374073a99f0125b");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7db9aa6f367281cf7f4ca062651860d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7db9aa6f367281cf7f4ca062651860d7");
                        return;
                    }
                    b currentDelegate = WMRNOldStyleShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    try {
                        k.a().a(currentDelegate.k(), new e() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "dde02ac5197b8ba49a1cc37c79dee48a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "dde02ac5197b8ba49a1cc37c79dee48a");
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "15ebe899a3ed8de83f3a657079ecfc2f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "15ebe899a3ed8de83f3a657079ecfc2f");
                                } else {
                                    a.a(WMRNOldStyleShoppingCartManager.this.getReactApplicationContext(), WMRNOldStyleShoppingCartManager.JS_REFRESH_SPU, Arguments.createMap());
                                }
                            }
                        });
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void decGoods(String str, final String str2, final String str3, final ReadableArray readableArray) {
        Object[] objArr = {str, str2, str3, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70a4c844913d8cfab8ca5bb11304473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70a4c844913d8cfab8ca5bb11304473");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    long[] jArr;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c14a7f7d804459ad1118008b3679ad3e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c14a7f7d804459ad1118008b3679ad3e");
                        return;
                    }
                    b currentDelegate = WMRNOldStyleShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    try {
                        jArr = WMRNOldStyleShoppingCartManager.this.transformData(readableArray);
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        jArr = null;
                    }
                    try {
                        OrderedFood a2 = com.sankuai.waimai.restaurant.shopcart.popup.b.a(currentDelegate.k(), Long.parseLong(str2), Long.parseLong(str3), jArr);
                        if (a2 == null) {
                            return;
                        }
                        k.a().a(currentDelegate.k(), a2.spu, a2.sku, a2.getAttrIds(), new e() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.4.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bfebfdf0a0561ac74c4bd132cf3506a6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bfebfdf0a0561ac74c4bd132cf3506a6");
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "24ab71dc3e2f1f64dfa7f41ca40f424b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "24ab71dc3e2f1f64dfa7f41ca40f424b");
                                } else {
                                    a.a(WMRNOldStyleShoppingCartManager.this.getReactApplicationContext(), WMRNOldStyleShoppingCartManager.JS_REFRESH_SPU, Arguments.createMap());
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                                Object[] objArr3 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e078875edfed1b2bafc9c412da28735d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e078875edfed1b2bafc9c412da28735d");
                                } else if (aVar == null || TextUtils.isEmpty(aVar.getMessage())) {
                                } else {
                                    ae.a(WMRNOldStyleShoppingCartManager.this.getCurrentActivity(), aVar.getMessage());
                                }
                            }
                        });
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void addGoods(String str, final String str2, final String str3, final ReadableArray readableArray) {
        Object[] objArr = {str, str2, str3, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55a5f51fea5a38232cc35d29af20d332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55a5f51fea5a38232cc35d29af20d332");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    long[] jArr;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "43238b7cb928b84c8165fef0dd008cc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "43238b7cb928b84c8165fef0dd008cc2");
                        return;
                    }
                    b currentDelegate = WMRNOldStyleShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    try {
                        jArr = WMRNOldStyleShoppingCartManager.this.transformData(readableArray);
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        jArr = null;
                    }
                    try {
                        OrderedFood a2 = com.sankuai.waimai.restaurant.shopcart.popup.b.a(currentDelegate.k(), Long.parseLong(str2), Long.parseLong(str3), jArr);
                        if (a2 == null) {
                            return;
                        }
                        k.a().a(WMRNOldStyleShoppingCartManager.this.getCurrentActivity(), currentDelegate.k(), a2.spu, a2.sku, a2.getAttrIds(), new e() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.5.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2f4a17d7edabf36fc88c820d8a7bd206", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2f4a17d7edabf36fc88c820d8a7bd206");
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "114e03624108b4cfaf7d5fefed51a879", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "114e03624108b4cfaf7d5fefed51a879");
                                } else {
                                    a.a(WMRNOldStyleShoppingCartManager.this.getReactApplicationContext(), WMRNOldStyleShoppingCartManager.JS_REFRESH_SPU, Arguments.createMap());
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                                Object[] objArr3 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fad5ec9f473d363d84c26b869c4a376b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fad5ec9f473d363d84c26b869c4a376b");
                                } else if (aVar == null || TextUtils.isEmpty(aVar.getMessage())) {
                                } else {
                                    ae.a(WMRNOldStyleShoppingCartManager.this.getCurrentActivity(), aVar.getMessage());
                                }
                            }
                        });
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getShopCartList(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e27135f349efca9102311f2bd037684b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e27135f349efca9102311f2bd037684b");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String jSONObject;
                    ArrayList arrayList;
                    JSONArray jSONArray;
                    Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> it;
                    com.sankuai.waimai.business.restaurant.base.shopcart.d dVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ffdeb676ce745d50cf0c333576f311f4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ffdeb676ce745d50cf0c333576f311f4");
                        return;
                    }
                    b currentDelegate = WMRNOldStyleShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null || TextUtils.isEmpty(currentDelegate.k())) {
                        return;
                    }
                    try {
                        Promise promise2 = promise;
                        String k = currentDelegate.k();
                        Object[] objArr3 = {k};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.restaurant.shopcart.popup.b.r;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "22e0e131926c3b6480fa3e57ba83f110", RobustBitConfig.DEFAULT_VALUE)) {
                            jSONObject = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "22e0e131926c3b6480fa3e57ba83f110");
                        } else {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONArray jSONArray2 = new JSONArray();
                            jSONObject2.put("cartList", jSONArray2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(com.sankuai.waimai.platform.domain.core.poi.b.a(k));
                            jSONObject2.put("poiId", sb.toString());
                            jSONObject2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, k);
                            com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(k);
                            if (!TextUtils.isEmpty(k) && n != null) {
                                ArrayList arrayList2 = new ArrayList();
                                List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list = n.b;
                                if (list != null && !list.isEmpty()) {
                                    arrayList2.addAll(list);
                                }
                                double d = 0.0d;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    com.sankuai.waimai.business.restaurant.base.shopcart.d next = it2.next();
                                    if (next == null || next.c == null || next.c.isEmpty()) {
                                        arrayList3 = arrayList3;
                                        jSONArray2 = jSONArray2;
                                        it2 = it2;
                                    } else {
                                        d += next.e;
                                        int i = 0;
                                        jSONArray2 = jSONArray2;
                                        while (i < next.c.size()) {
                                            ShopCartItem shopCartItem = next.c.get(i);
                                            if (shopCartItem != null) {
                                                OrderedFood orderedFood = shopCartItem.food;
                                                GoodsSpu foodSpu = shopCartItem.getFoodSpu();
                                                GoodsSku foodSku = shopCartItem.getFoodSku();
                                                if (orderedFood != null && foodSpu != null && foodSku != null) {
                                                    GoodsAttr[] foodAttrArr = shopCartItem.getFoodAttrArr();
                                                    int a2 = com.sankuai.waimai.restaurant.shopcart.popup.b.a(orderedFood, arrayList3);
                                                    if (a2 >= 0) {
                                                        JSONObject optJSONObject = jSONArray2.optJSONObject(a2);
                                                        optJSONObject.put("goodsCount", optJSONObject.optInt("goodsCount") + 1);
                                                        arrayList = arrayList3;
                                                        jSONArray = jSONArray2;
                                                        it = it2;
                                                        dVar = next;
                                                    } else {
                                                        arrayList3.add(orderedFood);
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        jSONArray2.put(jSONObject3);
                                                        arrayList = arrayList3;
                                                        jSONArray = jSONArray2;
                                                        StringBuilder sb2 = new StringBuilder();
                                                        it = it2;
                                                        dVar = next;
                                                        sb2.append(foodSpu.id);
                                                        jSONObject3.put("spuId", sb2.toString());
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(foodSku.id);
                                                        jSONObject3.put("skuId", sb3.toString());
                                                        long[] a3 = com.sankuai.waimai.restaurant.shopcart.popup.b.a(foodAttrArr);
                                                        if (a3 != null && a3.length > 0) {
                                                            JSONArray jSONArray3 = new JSONArray();
                                                            int length = a3.length;
                                                            int i2 = 0;
                                                            while (i2 < length) {
                                                                long j = a3[i2];
                                                                long[] jArr = a3;
                                                                StringBuilder sb4 = new StringBuilder();
                                                                sb4.append(j);
                                                                jSONArray3.put(sb4.toString());
                                                                i2++;
                                                                a3 = jArr;
                                                            }
                                                            jSONObject3.put("attrIds", jSONArray3);
                                                        }
                                                        jSONObject3.put("goodsPic", com.sankuai.waimai.restaurant.shopcart.viewHolder.c.a(shopCartItem, orderedFood));
                                                        jSONObject3.put("goodsName", orderedFood.getName());
                                                        jSONObject3.put("goodsSpecDesc", orderedFood.getFoodDesc());
                                                        jSONObject3.put("goodsPrice", orderedFood.getSubTotal());
                                                        jSONObject3.put("goodsOriginPrice", orderedFood.getSubTotalOriginalPrice());
                                                        jSONObject3.put("goodsCount", orderedFood.getCount());
                                                    }
                                                    i++;
                                                    arrayList3 = arrayList;
                                                    jSONArray2 = jSONArray;
                                                    it2 = it;
                                                    next = dVar;
                                                }
                                            }
                                            arrayList = arrayList3;
                                            jSONArray = jSONArray2;
                                            it = it2;
                                            dVar = next;
                                            i++;
                                            arrayList3 = arrayList;
                                            jSONArray2 = jSONArray;
                                            it2 = it;
                                            next = dVar;
                                        }
                                    }
                                }
                                jSONObject2.put("boxFee", d);
                                jSONObject = jSONObject2.toString();
                            }
                            jSONObject = jSONObject2.toString();
                        }
                        promise2.resolve(jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @ReactMethod
    public void openBoxFeeDetails(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05dea26e7235652834ec93b67f703464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05dea26e7235652834ec93b67f703464");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "de29a9441bb0d7871d10fd0ee8a012ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "de29a9441bb0d7871d10fd0ee8a012ff");
                        return;
                    }
                    b currentDelegate = WMRNOldStyleShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null || TextUtils.isEmpty(currentDelegate.k())) {
                        return;
                    }
                    try {
                        String string = WMRNOldStyleShoppingCartManager.this.getCurrentActivity().getString(R.string.wm_restaurant_scheme_mrn_boxfee);
                        Bundle bundle = new Bundle();
                        bundle.putString("buckets", g.a(h.a(k.a().n(currentDelegate.k()), new com.sankuai.waimai.business.restaurant.base.manager.order.g())));
                        com.sankuai.waimai.foundation.router.a.a(WMRNOldStyleShoppingCartManager.this.getCurrentActivity(), string, bundle);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public long[] transformData(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fd1dc3ada1f6cbef6b45cbefc2692c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fd1dc3ada1f6cbef6b45cbefc2692c4");
        }
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        long[] jArr = new long[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            jArr[i] = Long.parseLong(readableArray.getString(i));
        }
        return jArr;
    }
}
