package com.sankuai.waimai.store.mrn;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGShoppingCartModule extends ReactContextBaseJavaModule {
    private static final String TAG = "com.sankuai.waimai.store.mrn.SGShoppingCartModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNShoppingCart";
    }

    public SGShoppingCartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "073f2d5abbf31f899a09c8eefe9ab126", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "073f2d5abbf31f899a09c8eefe9ab126");
        }
    }

    @ReactMethod
    public void getAddedGoodsNumByCategory(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "266cb27ed75bbfca03a00ffc968ac08f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "266cb27ed75bbfca03a00ffc968ac08f");
            return;
        }
        String string = readableMap.hasKey("poi_id") ? readableMap.getString("poi_id") : "";
        if (string == null) {
            string = "0";
        }
        final long longValue = Double.valueOf(string).longValue();
        final String string2 = readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) ? readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
        al.a(new al.b<List<GoodsPoiCategory>>() { // from class: com.sankuai.waimai.store.mrn.SGShoppingCartModule.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.al.b
            public final /* synthetic */ List<GoodsPoiCategory> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "12a15c5208cafe4353b923a8785a3e72", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "12a15c5208cafe4353b923a8785a3e72");
                }
                return (List) i.b().create().fromJson(readableMap.getString("categories"), new TypeToken<List<GoodsPoiCategory>>() { // from class: com.sankuai.waimai.store.mrn.SGShoppingCartModule.1.1
                }.getType());
            }

            @Override // com.sankuai.waimai.store.util.al.b
            public final /* synthetic */ void a(List<GoodsPoiCategory> list) {
                List<GoodsPoiCategory> list2 = list;
                Object[] objArr2 = {list2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b62e7c6023cf880e1798393aa2437081", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b62e7c6023cf880e1798393aa2437081");
                } else if ((longValue <= 0 && TextUtils.isEmpty(string2)) || com.sankuai.shangou.stone.util.a.b(list2)) {
                    promise.reject(new RuntimeException("error input, need valid poi id or categories"));
                } else {
                    WritableMap createMap = Arguments.createMap();
                    for (GoodsPoiCategory goodsPoiCategory : list2) {
                        if (goodsPoiCategory != null) {
                            createMap.putInt(SGShoppingCartModule.this.readUniqueCategoryId(goodsPoiCategory), SGShoppingCartModule.this.getSpusInShopCartCount(goodsPoiCategory, com.sankuai.waimai.store.platform.domain.manager.poi.a.a(string2, longValue)));
                            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsPoiCategory.childGoodPoiCategory)) {
                                Iterator<GoodsPoiCategory> it = goodsPoiCategory.childGoodPoiCategory.iterator();
                                while (it.hasNext()) {
                                    GoodsPoiCategory next = it.next();
                                    if (next != null) {
                                        createMap.putInt(SGShoppingCartModule.this.readUniqueCategoryId(next), SGShoppingCartModule.this.getSpusInShopCartCount(next, com.sankuai.waimai.store.platform.domain.manager.poi.a.a(string2, longValue)));
                                    }
                                }
                            }
                        }
                    }
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putString("poi_id", String.valueOf(longValue));
                    createMap2.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, string2);
                    createMap2.putMap("datas", createMap);
                    promise.resolve(createMap2);
                }
            }
        }, TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String readUniqueCategoryId(@NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e8633f0044eafc0733bd07d7b54f9f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e8633f0044eafc0733bd07d7b54f9f6");
        }
        if (!TextUtils.isEmpty(goodsPoiCategory.activityTag)) {
            return goodsPoiCategory.activityTag;
        }
        return goodsPoiCategory.getTagCode();
    }

    public int getSpusInShopCartCount(GoodsPoiCategory goodsPoiCategory, String str) {
        int i = 0;
        Object[] objArr = {goodsPoiCategory, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "183edaa1217dcee439611e572fdb2085", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "183edaa1217dcee439611e572fdb2085")).intValue();
        }
        if (goodsPoiCategory == null) {
            return 0;
        }
        if (goodsPoiCategory.aggregationActivityTags && goodsPoiCategory.isCloneCategory) {
            return 0;
        }
        if (com.sankuai.shangou.stone.util.a.b(goodsPoiCategory.childGoodPoiCategory)) {
            return getSubCategorySupInShopCartCount(goodsPoiCategory, str) + 0;
        }
        Iterator<GoodsPoiCategory> it = goodsPoiCategory.childGoodPoiCategory.iterator();
        while (it.hasNext()) {
            i += getSpusInShopCartCount(it.next(), str);
        }
        return i;
    }

    private int getSubCategorySupInShopCartCount(GoodsPoiCategory goodsPoiCategory, String str) {
        Integer num;
        Object[] objArr = {goodsPoiCategory, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfe40b7744e513a8cc49272b8ed56a4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfe40b7744e513a8cc49272b8ed56a4e")).intValue();
        }
        if (goodsPoiCategory == null) {
            return 0;
        }
        String readUniqueCategoryId = readUniqueCategoryId(goodsPoiCategory);
        HashMap<String, Integer> a = com.sankuai.waimai.store.order.a.e().c.a(str);
        if (a == null || (num = a.get(readUniqueCategoryId)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @ReactMethod
    public void getPoiAddedGoodsNum(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4f3ff402fdfa448b15a4a5394920d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4f3ff402fdfa448b15a4a5394920d0b");
            return;
        }
        a a = b.a(str);
        if (a == null) {
            d.a(promise, null);
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("poi_id", String.valueOf(a.b));
            createMap.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, String.valueOf(a.c));
            createMap.putInt("total", com.sankuai.waimai.store.order.a.e().a(a.a()));
            promise.resolve(createMap);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void getPoiListAddedGoodsNum(ReadableArray readableArray, Promise promise) {
        Object[] objArr = {readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f3b581b07598ddfd4a72dea16199dc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f3b581b07598ddfd4a72dea16199dc6");
            return;
        }
        try {
            if (readableArray == null) {
                throw new IllegalArgumentException("poiIds为null");
            }
            if (readableArray.size() == 0) {
                throw new IllegalArgumentException("poiIds长度为0");
            }
            WritableArray createArray = Arguments.createArray();
            for (int i = 0; i < readableArray.size(); i++) {
                if (readableArray.getType(0) != ReadableType.String) {
                    throw new IllegalArgumentException("poiIds(" + i + ")类型不是String");
                } else if (readableArray.getString(i) == null) {
                    throw new IllegalArgumentException("poiIds(" + i + ")为null");
                } else {
                    WritableMap createMap = Arguments.createMap();
                    String string = readableArray.getString(i);
                    a a = b.a(string);
                    if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "getPoiListAddedGoodsNum", a, string)) {
                        return;
                    }
                    createMap.putString("poi_id", String.valueOf(a.b));
                    createMap.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, a.c);
                    createMap.putInt("total", com.sankuai.waimai.store.order.a.e().a(a.a()));
                    createArray.pushMap(createMap);
                }
            }
            promise.resolve(createArray);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }
}
