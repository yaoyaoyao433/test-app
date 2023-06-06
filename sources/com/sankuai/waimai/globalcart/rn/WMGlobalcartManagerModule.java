package com.sankuai.waimai.globalcart.rn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.GlobalCartBrief;
import com.sankuai.waimai.platform.utils.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMGlobalcartManagerModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isToPreview;
    private Gson mGson;
    private String mVolleyTag;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "GlobalCartManager";
    }

    public WMGlobalcartManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ab8c560b010e8b12fe80c4492b6e938", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ab8c560b010e8b12fe80c4492b6e938");
            return;
        }
        this.mGson = new Gson();
        this.mVolleyTag = getClass().getSimpleName() + System.currentTimeMillis();
    }

    @ReactMethod
    public void getLocalShopAndStatus(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ded7202f3b30b29136e71bc55aaad6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ded7202f3b30b29136e71bc55aaad6d");
        } else {
            l.a(new Runnable() { // from class: com.sankuai.waimai.globalcart.rn.WMGlobalcartManagerModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "538a5519e9ea88e06cfd1e90c972c52a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "538a5519e9ea88e06cfd1e90c972c52a");
                        return;
                    }
                    String cartListToJsonStr = WMGlobalcartManagerModule.this.cartListToJsonStr(WMGlobalcartManagerModule.this.getLocalCartData(), true);
                    String cartBriefListToJsonStr = WMGlobalcartManagerModule.this.cartBriefListToJsonStr(WMGlobalcartManagerModule.this.getLocalCartBriefData(true, WMGlobalcartManagerModule.this.getLocalCartData()));
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("localCart", cartListToJsonStr);
                    createMap.putString("shopcartStatus", cartBriefListToJsonStr);
                    promise.resolve(createMap);
                }
            }, (String) null);
        }
    }

    @ReactMethod
    public void updateLocalShopAndStatus(final ReadableArray readableArray, final ReadableArray readableArray2) {
        Object[] objArr = {readableArray, readableArray2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c88dc457120de27f39f40b56fa8d6737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c88dc457120de27f39f40b56fa8d6737");
        } else {
            l.a(new Runnable() { // from class: com.sankuai.waimai.globalcart.rn.WMGlobalcartManagerModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a2be4f51bb1a9fa1e0c56fddf4635241", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a2be4f51bb1a9fa1e0c56fddf4635241");
                        return;
                    }
                    try {
                        if (readableArray != null && readableArray.size() > 0) {
                            WMGlobalcartManagerModule.this.setLocalData((List) WMGlobalcartManagerModule.this.mGson.fromJson(readableArray.toString(), new TypeToken<List<GlobalCart>>() { // from class: com.sankuai.waimai.globalcart.rn.WMGlobalcartManagerModule.2.1
                            }.getType()));
                        }
                        if (readableArray2 != null && readableArray2.size() > 0) {
                            GlobalCartManager.getInstance().refreshPoiId(false, WMGlobalcartManagerModule.this.getLocalCartBriefData(true, WMGlobalcartManagerModule.this.getLocalCartData()), (List) WMGlobalcartManagerModule.this.mGson.fromJson(readableArray2.toString(), new TypeToken<List<GlobalCartBrief>>() { // from class: com.sankuai.waimai.globalcart.rn.WMGlobalcartManagerModule.2.2
                            }.getType()));
                        }
                        GlobalCartManager.getInstance().resetDataChange();
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
            }, (String) null);
        }
    }

    @ReactMethod
    public void updateShoppingCartWithNewCheckStatusGlobalCartProductList(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4744a47012939c0215cfb202099d5138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4744a47012939c0215cfb202099d5138");
        } else if (readableArray != null && readableArray.size() > 0) {
            for (GlobalCart globalCart : (List) this.mGson.fromJson(readableArray.toString(), new TypeToken<List<GlobalCart>>() { // from class: com.sankuai.waimai.globalcart.rn.WMGlobalcartManagerModule.3
            }.getType())) {
                GlobalCartManager.getInstance().changeFoodCheckStatus(globalCart);
            }
        }
    }

    @ReactMethod
    public void isPoiidEqual(String str, String str2, Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0786936a7881338fc3423e23562aa1c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0786936a7881338fc3423e23562aa1c7");
            return;
        }
        try {
            long a = r.a(str, 0L);
            long a2 = r.a(str2, 0L);
            if (a > 0 && a2 > 0) {
                str = b.a(a);
                str2 = b.a(a2);
            }
            promise.resolve(Boolean.valueOf(GlobalCartManager.getInstance().isSamePoi(str, str2)));
        } catch (Exception unused) {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void updateDeleteProductList(final ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b5061191f2edda253886d45e70aabc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b5061191f2edda253886d45e70aabc9");
        } else {
            l.a(new Runnable() { // from class: com.sankuai.waimai.globalcart.rn.WMGlobalcartManagerModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e59c92722b6278bfcd8fe59eb21726d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e59c92722b6278bfcd8fe59eb21726d2");
                    } else if (readableArray == null || readableArray.size() <= 0) {
                    } else {
                        WMGlobalcartManagerModule.this.deleteLocalCart((List) WMGlobalcartManagerModule.this.mGson.fromJson(readableArray.toString(), new TypeToken<List<com.sankuai.waimai.globalcart.model.a>>() { // from class: com.sankuai.waimai.globalcart.rn.WMGlobalcartManagerModule.4.1
                        }.getType()));
                    }
                }
            }, "update_shopcart");
        }
    }

    @ReactMethod
    public void transferToSingleOrder(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9747c827de51cf7fb965cde1b920d2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9747c827de51cf7fb965cde1b920d2f");
        } else if (readableMap != null) {
            try {
                GlobalCart globalCart = (GlobalCart) this.mGson.fromJson(new JSONObject(readableMap.toString()).optString("NativeMap"), (Class<Object>) GlobalCart.class);
                this.isToPreview = true;
                ((ISubmitOrderManager) com.sankuai.waimai.router.a.a(ISubmitOrderManager.class, "IOrderSubmitService")).shopCartPreOrder(getCurrentActivity(), null, a.EnumC0947a.FROM_GLOBAL_SHOP_CART, this.mVolleyTag, 102, new com.sankuai.waimai.platform.domain.core.response.a(), globalCart);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @ReactMethod
    public void transferToCrossOrder(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73cc236ee53c68d178f8a3f941196cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73cc236ee53c68d178f8a3f941196cce");
        } else if (readableArray == null || readableArray.size() <= 0) {
        } else {
            List<GlobalCart> list = (List) this.mGson.fromJson(readableArray.toString(), new TypeToken<List<GlobalCart>>() { // from class: com.sankuai.waimai.globalcart.rn.WMGlobalcartManagerModule.5
            }.getType());
            this.isToPreview = true;
            ((ISubmitOrderManager) com.sankuai.waimai.router.a.a(ISubmitOrderManager.class, "IOrderSubmitService")).shopCartCrossOrder(getCurrentActivity(), null, this.mVolleyTag, 102, a.EnumC0947a.FROM_GLOBAL_SHOP_CART, list);
        }
    }

    @ReactMethod
    public void needRefresh(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d27f5d44956e0345b6fc9d918d5949d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d27f5d44956e0345b6fc9d918d5949d5");
            return;
        }
        callback.invoke(null, Boolean.valueOf(this.isToPreview || GlobalCartManager.getInstance().isCartDataChange()));
        this.isToPreview = false;
    }

    private List<OrderedFood> getHasCheckedGoodItem(GlobalCart globalCart) {
        Object[] objArr = {globalCart};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03ed91f7d6b12a233234d026296b0f78", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03ed91f7d6b12a233234d026296b0f78");
        }
        List<GlobalCart.g> list = globalCart.productList;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            GlobalCart.g gVar = list.get(i);
            if (gVar.j != null && gVar.j.c == 1) {
                arrayList.add(GlobalCart.g.a(gVar));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteLocalCart(List<com.sankuai.waimai.globalcart.model.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb7bb5603e4a329b1abc127b7df9a1ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb7bb5603e4a329b1abc127b7df9a1ca");
            return;
        }
        for (com.sankuai.waimai.globalcart.model.a aVar : list) {
            if (aVar != null) {
                String str = aVar.c;
                int i = aVar.h == 1 ? 15 : 14;
                if (aVar.d) {
                    if (getOrderManager(i) != null) {
                        getOrderManager(i).a(str);
                    }
                    com.sankuai.waimai.platform.domain.manager.order.b.a().clearOrder();
                } else {
                    List<CartProduct> list2 = aVar.e;
                    if (!com.sankuai.waimai.foundation.utils.b.b(list2)) {
                        for (CartProduct cartProduct : list2) {
                            if (cartProduct.isDelete && getOrderManager(i) != null) {
                                getOrderManager(i).b(str, cartProduct);
                            }
                        }
                    }
                }
                if (getOrderManager(i) != null) {
                    getOrderManager(i).b("");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalData(List<GlobalCart> list) {
        List<GlobalCart.g> list2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20b590b1f82e811880390fbfa5557cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20b590b1f82e811880390fbfa5557cdc");
        } else if (list != null && list.size() > 0) {
            for (GlobalCart globalCart : list) {
                if (globalCart != null && (list2 = globalCart.productList) != null && list2.size() > 0) {
                    String str = globalCart.poiIdStr;
                    if (getOrderManager(globalCart.getBizType()).j(str) <= 0) {
                        setPoiCartData(str, globalCart.getBizType(), list2);
                    }
                }
            }
        }
    }

    private com.sankuai.waimai.foundation.core.service.globalcart.b getOrderManager(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8566dad3adb3e7a4e1cd26852b576762", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.foundation.core.service.globalcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8566dad3adb3e7a4e1cd26852b576762") : GlobalCartManager.getInstance().getOrderManager(i);
    }

    private void setPoiCartData(String str, int i, List<GlobalCart.g> list) {
        Object[] objArr = {str, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6d79fc153255c2568e69664121e2569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6d79fc153255c2568e69664121e2569");
            return;
        }
        com.sankuai.waimai.foundation.core.service.globalcart.b orderManager = getOrderManager(i);
        if (orderManager != null) {
            orderManager.e(str, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String cartBriefListToJsonStr(List<GlobalCartBrief> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "208d3f178fba37ed784f874f81728911", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "208d3f178fba37ed784f874f81728911") : getGlobalCartBriefJson(list).toString();
    }

    private JSONArray getGlobalCartBriefJson(List<GlobalCartBrief> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e9d7d2f994d6798302f5c87dd68315f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e9d7d2f994d6798302f5c87dd68315f");
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (GlobalCartBrief globalCartBrief : list) {
                if (globalCartBrief != null) {
                    jSONArray.put(globalCartBrief.toJson());
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.sankuai.waimai.globalcart.model.a> getLocalCartData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cc960bccf019ba2631aaf99d6019b38", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cc960bccf019ba2631aaf99d6019b38") : GlobalCartManager.getInstance().getLocalCartData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String cartListToJsonStr(List<com.sankuai.waimai.globalcart.model.a> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10e6ea270c3c317dd8d68eca28a3facf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10e6ea270c3c317dd8d68eca28a3facf") : com.sankuai.waimai.globalcart.model.a.a(list, z).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<GlobalCartBrief> getLocalCartBriefData(boolean z, List<com.sankuai.waimai.globalcart.model.a> list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b5d232cd5395f7749d23994c20d3e10", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b5d232cd5395f7749d23994c20d3e10");
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            for (com.sankuai.waimai.globalcart.model.a aVar : list) {
                if (aVar != null && !com.sankuai.waimai.foundation.utils.b.b(aVar.e)) {
                    arrayList.add(new GlobalCartBrief().fromPoiShopcart(aVar, z));
                }
            }
        }
        return arrayList;
    }
}
