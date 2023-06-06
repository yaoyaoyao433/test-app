package com.sankuai.waimai.drug.mrn;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.c;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.e;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.i;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.f;
import com.sankuai.waimai.store.util.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = DrugMRNShopCartModule.NAME)
/* loaded from: classes4.dex */
public class DrugMRNShopCartModule extends ReactContextBaseJavaModule {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ADD_FOOD_FROM_PAGE_CID = "add_food_from_page_cid";
    private static final String ADD_FOOD_NEED_LOAD_RECOMMEND = "add_food_need_load_recommend";
    public static final String NAME = "MEDMRNShoppingCartViewManager";
    private static final String TAG = "DrugMRNShopCartModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String COMPONENT_NAME_DRUG_INNER_SHOP;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a mPoiHelper;
    public static final SparseArray<e> successEventMap = new SparseArray<>();
    public static final SparseArray<Boolean> ShopcartVisibleMap = new SparseArray<>();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public DrugMRNShopCartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5e81e3978d3fa3ee32db90416a7a919", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5e81e3978d3fa3ee32db90416a7a919");
            return;
        }
        this.COMPONENT_NAME_DRUG_INNER_SHOP = "flashbuy-drug-search";
        this.mPoiHelper = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
    }

    public void updatePoiHelper(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        if (aVar != null) {
            this.mPoiHelper = aVar;
        }
    }

    @ReactMethod
    public void loadPoiInfoWithExtra(String str, String str2, Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e11e9952103677daf226f6a20e5a6b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e11e9952103677daf226f6a20e5a6b8");
        } else {
            loadPoiInfoNative(str, "", str2, 990, promise);
        }
    }

    @ReactMethod
    public void loadPoiInfoWithExtraNew(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eccc675d11d09303daa11171e47297fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eccc675d11d09303daa11171e47297fe");
        } else if (readableMap == null) {
        } else {
            loadPoiInfoNative(getStringFromReadableMap(readableMap, "poiId"), getStringFromReadableMap(readableMap, FoodDetailNetWorkPreLoader.URI_POI_STR), getStringFromReadableMap(readableMap, "extra"), 990, promise);
        }
    }

    @ReactMethod
    public void loadPoiInfoWithComponentNameNew(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8677d84236b162828d6d69cb80c27d12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8677d84236b162828d6d69cb80c27d12");
        } else if (readableMap == null) {
        } else {
            loadPoiInfoNative(getStringFromReadableMap(readableMap, "poiId"), getStringFromReadableMap(readableMap, FoodDetailNetWorkPreLoader.URI_POI_STR), getStringFromReadableMap(readableMap, "extra"), "flashbuy-drug-search".equals(getStringFromReadableMap(readableMap, "componentName")) ? 110 : 990, promise);
        }
    }

    private static String getStringFromReadableMap(ReadableMap readableMap, @NonNull String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57baeefb0d5c909d39274ec71d8c7d6b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57baeefb0d5c909d39274ec71d8c7d6b") : readableMap.hasKey(str) ? readableMap.getString(str) : "";
    }

    @ReactMethod
    public void loadPoiInfoWithComponentName(String str, String str2, String str3, Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "872e9f6df29aeb59ced316e29020a1e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "872e9f6df29aeb59ced316e29020a1e4");
        } else {
            loadPoiInfoNative(str, "", str2, "flashbuy-drug-search".equals(str3) ? 110 : 990, promise);
        }
    }

    @ReactMethod
    public void increaseFoodWithSkuAndAtts(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a64237864dec927759702237bb1eafd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a64237864dec927759702237bb1eafd");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3e7c73e693cdd9e353f57fc685fb5b9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3e7c73e693cdd9e353f57fc685fb5b9b");
                    } else if (DrugMRNShopCartModule.this.getCurrentActivity() == null || DrugMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("increaseFood activity is null or finishing"));
                    } else {
                        final b a2 = b.a(readableMap);
                        if (a2 == null || !a2.a() || a2.d == null) {
                            return;
                        }
                        com.sankuai.waimai.store.order.a.e().a(a2.b(), a2.d, a2.e, a2.f, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8adf1e921f01fc350a11e33ee91f60b7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8adf1e921f01fc350a11e33ee91f60b7");
                                }
                            }

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0cfe395d0b22b6a433f22acf497a6f9a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0cfe395d0b22b6a433f22acf497a6f9a");
                                    return;
                                }
                                com.meituan.android.bus.a.a().c(new c(String.valueOf(DrugMRNShopCartModule.this.mPoiHelper.g()), DrugMRNShopCartModule.this.mPoiHelper.h(), "", false, a2.d, a2.e));
                                d.a(promise);
                            }

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                Object[] objArr3 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "840aed617c96b035c77bad439d0f70b3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "840aed617c96b035c77bad439d0f70b3");
                                    return;
                                }
                                am.a(DrugMRNShopCartModule.this.getReactApplicationContext(), aVar.getMessage());
                                d.a(promise, aVar);
                            }
                        });
                    }
                }
            });
        }
    }

    @ReactMethod
    public void increaseFood(final ReadableMap readableMap, String str, String str2, final String str3, final Promise promise) {
        Object[] objArr = {readableMap, str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1906f32b8bb885599a8fc6963e09b2db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1906f32b8bb885599a8fc6963e09b2db");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8085a73806d6bdea59ad0480ee2c158", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8085a73806d6bdea59ad0480ee2c158");
                    } else if (DrugMRNShopCartModule.this.getCurrentActivity() == null || DrugMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("increaseFood activity is null or finishing"));
                    } else if (readableMap == null) {
                    } else {
                        final GoodsSpu goodsSpu = new GoodsSpu();
                        goodsSpu.parseJson(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                        HashMap<String, Object> hashMap = readableMap.toHashMap();
                        final boolean booleanValue = hashMap.get(DrugMRNShopCartModule.ADD_FOOD_NEED_LOAD_RECOMMEND) instanceof Boolean ? ((Boolean) hashMap.get(DrugMRNShopCartModule.ADD_FOOD_NEED_LOAD_RECOMMEND)).booleanValue() : false;
                        final String str4 = hashMap.get(DrugMRNShopCartModule.ADD_FOOD_FROM_PAGE_CID) instanceof String ? (String) hashMap.get(DrugMRNShopCartModule.ADD_FOOD_FROM_PAGE_CID) : "";
                        if (goodsSpu.isManySku()) {
                            if (com.sankuai.waimai.store.config.d.h().a("drug_poi_auto_add_multi_sku", true)) {
                                try {
                                    com.meituan.android.bus.a.a().c(new j(String.valueOf(DrugMRNShopCartModule.this.mPoiHelper.g()), DrugMRNShopCartModule.this.mPoiHelper.h(), DrugMRNShopCartModule.this.mPoiHelper, goodsSpu));
                                    d.a(promise);
                                    return;
                                } catch (Exception e) {
                                    d.a(promise, e);
                                    return;
                                }
                            }
                            com.sankuai.waimai.store.drug.util.d.a(DrugMRNShopCartModule.this.getCurrentActivity(), goodsSpu, DrugMRNShopCartModule.this.mPoiHelper.b);
                        } else if (goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
                        } else {
                            com.sankuai.waimai.store.order.a.e().a(DrugMRNShopCartModule.this.mPoiHelper.d(), goodsSpu, goodsSpu.getSkuList().get(0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.12.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "83f2fece1a976c9636d4548f9eec976f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "83f2fece1a976c9636d4548f9eec976f");
                                    }
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final f a(f fVar) {
                                    Object[] objArr3 = {fVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "53575a2fa45096ffbf3d5dd1d86871c1", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "53575a2fa45096ffbf3d5dd1d86871c1") : new com.sankuai.waimai.store.drug.order.a(DrugMRNShopCartModule.this.getCurrentActivity(), fVar, str4).a();
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7f40ca9e6fa4a8ff2df62adb51891ab1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7f40ca9e6fa4a8ff2df62adb51891ab1");
                                        return;
                                    }
                                    com.meituan.android.bus.a.a().c(new c(String.valueOf(DrugMRNShopCartModule.this.mPoiHelper.g()), DrugMRNShopCartModule.this.mPoiHelper.h(), str3, booleanValue, goodsSpu, goodsSpu.getSkuList().get(0)));
                                    d.a(promise);
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                    Object[] objArr3 = {aVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "afa0258f116889bbe4e016fee75fa767", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "afa0258f116889bbe4e016fee75fa767");
                                        return;
                                    }
                                    am.a(DrugMRNShopCartModule.this.getReactApplicationContext(), aVar.getMessage());
                                    d.a(promise, aVar);
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void buyNow(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d55099308b57636eae024651526a9f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d55099308b57636eae024651526a9f7");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    b a2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c576c2aa0fb19cc98dc0633b4e795f56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c576c2aa0fb19cc98dc0633b4e795f56");
                    } else if (readableMap == null || (a2 = b.a(readableMap)) == null) {
                    } else {
                        a aVar = new a();
                        aVar.d = a2.f;
                        aVar.e = a2.g;
                        aVar.c = a2.e;
                        aVar.b = a2.d;
                        aVar.f = a2.b;
                        aVar.g = a2.c;
                        aVar.a = a2.j;
                        com.meituan.android.bus.a.a().c(aVar);
                        d.a(promise);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void decreaseFoodWithSkuAndAtts(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "382b3b90b5629810152da6c7bd9ecdbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "382b3b90b5629810152da6c7bd9ecdbd");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9fa9276fe219d151e3510039ab80f9af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9fa9276fe219d151e3510039ab80f9af");
                    } else if (DrugMRNShopCartModule.this.getCurrentActivity() == null || DrugMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("increaseFood activity is null or finishing"));
                    } else {
                        b a2 = b.a(readableMap);
                        if (a2 == null || !a2.a() || a2.d == null) {
                            return;
                        }
                        com.sankuai.waimai.store.order.a.e().b(a2.b(), a2.d, a2.e, a2.f, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.16.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "96a89adda71f1cf13b70b6b6e04ad374", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "96a89adda71f1cf13b70b6b6e04ad374");
                                }
                            }

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d56b4f32181ca5f92a607ee2624ffc31", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d56b4f32181ca5f92a607ee2624ffc31");
                                } else {
                                    DrugMRNShopCartModule.this.resolveSuccessAndCallbackPrice(bVar, promise);
                                }
                            }

                            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                Object[] objArr3 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c7efec77ab2ab70bafe3ccf7b0181f92", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c7efec77ab2ab70bafe3ccf7b0181f92");
                                } else {
                                    d.a(promise, aVar);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @ReactMethod
    public void decreaseFoodWithPoiInfo(final ReadableMap readableMap, final ReadableMap readableMap2, final Promise promise) {
        Object[] objArr = {readableMap, readableMap2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e48f320a581f9b16205b5b68331af6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e48f320a581f9b16205b5b68331af6e");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.17
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4fd0d4ab5b888e5a4e97d885a2578dc3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4fd0d4ab5b888e5a4e97d885a2578dc3");
                    } else if (com.sankuai.waimai.store.util.b.a(DrugMRNShopCartModule.this.getCurrentActivity())) {
                        d.a(promise, new Exception("decreaseFoodWithPoiInfo activity is null or finishing"));
                    } else {
                        Poi poi = new Poi();
                        poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                        GoodsSpu goodsSpu = new GoodsSpu();
                        goodsSpu.parseJson(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap2));
                        if (goodsSpu.isManySku()) {
                            com.sankuai.waimai.store.drug.util.d.a(DrugMRNShopCartModule.this.getCurrentActivity(), goodsSpu, DrugMRNShopCartModule.this.mPoiHelper.b);
                        } else if (goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
                        } else {
                            com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), poi);
                            com.sankuai.waimai.store.order.a.e().b(poi.getOfficialPoiId(), goodsSpu, goodsSpu.getSkuList().get(0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.17.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "88ef352379e6f216d0c0a283ee0ded67", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "88ef352379e6f216d0c0a283ee0ded67");
                                    }
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "10ae119e5123b517eed3d9b0f5de7340", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "10ae119e5123b517eed3d9b0f5de7340");
                                    } else {
                                        DrugMRNShopCartModule.this.resolveSuccessAndCallbackPrice(bVar, promise);
                                    }
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                    Object[] objArr3 = {aVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "590ff650cdc09d1c3184865fad6ca741", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "590ff650cdc09d1c3184865fad6ca741");
                                    } else {
                                        d.a(promise, aVar);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void numberOfGoodSku(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dab96ff92c343cf670b9f4f0f993c326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dab96ff92c343cf670b9f4f0f993c326");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.18
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "79c16152dc586f09ac5e0973b26d78bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "79c16152dc586f09ac5e0973b26d78bb");
                        return;
                    }
                    b a2 = b.a(readableMap);
                    if (a2 == null) {
                        return;
                    }
                    int a3 = com.sankuai.waimai.store.order.a.e().a(a2.b(), a2.h, a2.i, a2.f);
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("count", String.valueOf(a3));
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putMap("data", createMap);
                    createMap2.putInt("code", 0);
                    createMap2.putString("message", "success");
                    promise.resolve(createMap2);
                }
            });
        }
    }

    @ReactMethod
    public void numberOfGoodsNew(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff3e8f0f26472e72f576003dca173901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff3e8f0f26472e72f576003dca173901");
        } else if (readableMap == null) {
        } else {
            getNumberOfGoods(readableMap.hasKey("productId") ? readableMap.getString("productId") : "-1", getOfficialPoiIdFromReadableMap(readableMap), promise);
        }
    }

    private void getNumberOfGoods(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7af4206e6c1bd2a76649874085303028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7af4206e6c1bd2a76649874085303028");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.19
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4fe68abca1585d08a2c94c09c314e289", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4fe68abca1585d08a2c94c09c314e289");
                        return;
                    }
                    int a2 = com.sankuai.waimai.store.order.a.e().a(str2, r.a(str, 0L));
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("count", String.valueOf(a2));
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putMap("data", createMap);
                    createMap2.putInt("code", 0);
                    createMap2.putString("message", "success");
                    promise.resolve(createMap2);
                }
            });
        }
    }

    @ReactMethod
    public void numberOfGoods(String str, String str2, Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c5f8e9e9b42b45553095bbd0365fe0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c5f8e9e9b42b45553095bbd0365fe0d");
        } else {
            getNumberOfGoods(str, str2, promise);
        }
    }

    @ReactMethod
    public void pushToDetailPage(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07ee3bdfbde39094978dfe5f6fa83ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07ee3bdfbde39094978dfe5f6fa83ef0");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.20
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b01f5d5916ca8da436d301001f72f168", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b01f5d5916ca8da436d301001f72f168");
                    } else if (readableMap != null) {
                        if (DrugMRNShopCartModule.this.getCurrentActivity() == null || DrugMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                            d.a(promise, new Exception("pushToDetailPage activity is null or finishing"));
                            return;
                        }
                        try {
                            com.sankuai.waimai.store.drug.util.d.a(DrugMRNShopCartModule.this.getCurrentActivity(), com.sankuai.waimai.store.mrn.shopcartbridge.a.b(readableMap.getMap("food")), DrugMRNShopCartModule.this.mPoiHelper.b);
                            d.a(promise);
                        } catch (Exception e) {
                            d.a(promise, e);
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void didGetGoodsList(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb83da00864f657c70a27e2cae9b51a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb83da00864f657c70a27e2cae9b51a2");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.21
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "77ce038dd8c50d6e840f6b2b4eca49ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "77ce038dd8c50d6e840f6b2b4eca49ee");
                    } else {
                        d.a(promise);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void showSpecPopViewWithFood(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "264d8220f0dea2551deff25447d36d9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "264d8220f0dea2551deff25447d36d9a");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d9491d725cf3a9f884b23f8012992426", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d9491d725cf3a9f884b23f8012992426");
                        return;
                    }
                    try {
                        com.meituan.android.bus.a.a().c(new j(String.valueOf(DrugMRNShopCartModule.this.mPoiHelper.g()), DrugMRNShopCartModule.this.mPoiHelper.h(), DrugMRNShopCartModule.this.mPoiHelper, com.sankuai.waimai.store.mrn.shopcartbridge.a.b(readableMap)));
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    private void goodsListInShoppingCartWithPoiIdNative(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4c986d4174b86ae95548755ee84cf00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4c986d4174b86ae95548755ee84cf00");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cd186b867e9a3bea3905fc904259f405", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cd186b867e9a3bea3905fc904259f405");
                        return;
                    }
                    List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(str);
                    WritableArray createArray = Arguments.createArray();
                    if (com.sankuai.shangou.stone.util.a.a((List) p) > 0) {
                        for (int i = 0; i < p.size(); i++) {
                            OrderedFood orderedFood = p.get(i);
                            if (orderedFood.sku != null) {
                                String valueOf = String.valueOf(orderedFood.sku.id);
                                int i2 = orderedFood.count;
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("id", valueOf);
                                createMap.putInt("count", i2);
                                HandPriceInfo handPriceInfo = null;
                                if (orderedFood.spu != null) {
                                    createMap.putString("spu_id", String.valueOf(orderedFood.spu.id));
                                    handPriceInfo = com.sankuai.waimai.store.order.a.e().b(str, orderedFood.spu.id, orderedFood.sku.id);
                                }
                                if (handPriceInfo != null) {
                                    WritableMap createMap2 = Arguments.createMap();
                                    createMap2.putDouble("hand_activity_price", handPriceInfo.getHandActivityPrice());
                                    createMap2.putString("hand_price_label", handPriceInfo.getHandPriceLabel());
                                    createMap.putMap("hand_price_info", createMap2);
                                }
                                createArray.pushMap(createMap);
                            }
                        }
                    }
                    WritableMap createMap3 = Arguments.createMap();
                    createMap3.putArray("products_in_shoppingcart", createArray);
                    WritableMap createMap4 = Arguments.createMap();
                    createMap4.putInt("code", 0);
                    createMap4.putString("message", "success");
                    createMap4.putMap("data", createMap3);
                    promise.resolve(createMap4);
                }
            });
        }
    }

    @ReactMethod
    public void goodsListInShoppingCartWithPoiIdNew(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c51bf035806ed510fb5ba928018bfdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c51bf035806ed510fb5ba928018bfdf");
        } else if (readableMap == null) {
        } else {
            goodsListInShoppingCartWithPoiIdNative(getOfficialPoiIdFromReadableMap(readableMap), promise);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getOfficialPoiIdFromReadableMap(@NonNull ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e57b39c24cd7f636a0f876c271883ef4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e57b39c24cd7f636a0f876c271883ef4") : getOfficialPoiIdFromReadableMap(readableMap, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getOfficialPoiIdFromReadableMap(@NonNull ReadableMap readableMap, String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00c64347c4bc87550b7d721030857e8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00c64347c4bc87550b7d721030857e8c");
        }
        String string = readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR) ? readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
        if (TextUtils.isEmpty(str)) {
            str = "poiId";
        }
        return com.sankuai.waimai.store.platform.domain.manager.poi.a.a(readableMap.hasKey(str) ? r.a(readableMap.getString(str), -1L) : -1L, string);
    }

    @ReactMethod
    public void goodsListInShoppingCartWithPoiId(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdd9952ac6b0d0615bf6f22a998064b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdd9952ac6b0d0615bf6f22a998064b6");
        } else {
            goodsListInShoppingCartWithPoiIdNative(str, promise);
        }
    }

    @ReactMethod
    public void setShopCartVisibility(final boolean z, final Promise promise) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f851b8ebe7f6994d160be17e62150cac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f851b8ebe7f6994d160be17e62150cac");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            d.a(promise, new Exception("setShopCartVisibility; activity is null or finishing"));
        } else {
            ShopcartVisibleMap.put(getCurrentActivity().hashCode(), Boolean.valueOf(z));
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6515973ba6515ff76697b53f1c75c327", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6515973ba6515ff76697b53f1c75c327");
                        return;
                    }
                    com.meituan.android.bus.a.a().c(new i(String.valueOf(DrugMRNShopCartModule.this.mPoiHelper.g()), DrugMRNShopCartModule.this.mPoiHelper.h(), z));
                    d.a(promise);
                }
            });
        }
    }

    @ReactMethod
    public void increaseFoodWithPoiInfo(final ReadableMap readableMap, final ReadableMap readableMap2, final Promise promise) {
        Object[] objArr = {readableMap, readableMap2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "915a7fa9dcdeae3f2774b32a7362f6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "915a7fa9dcdeae3f2774b32a7362f6ed");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34fce3afeb39c13d9f8c2861ad7ce8d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34fce3afeb39c13d9f8c2861ad7ce8d4");
                        return;
                    }
                    try {
                        if (DrugMRNShopCartModule.this.getCurrentActivity() != null && !DrugMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                            Poi poi = new Poi();
                            poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                            GoodsSpu goodsSpu = new GoodsSpu();
                            goodsSpu.parseJson(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap2));
                            if (goodsSpu.isManySku()) {
                                com.sankuai.waimai.store.drug.util.d.a(DrugMRNShopCartModule.this.getReactApplicationContext(), goodsSpu, poi);
                                return;
                            } else if (goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
                                return;
                            } else {
                                com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), poi);
                                com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), goodsSpu, goodsSpu.getSkuList().get(0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.5.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "de7aceba38bb9fffcd8e1910557444d4", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "de7aceba38bb9fffcd8e1910557444d4");
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                        Object[] objArr3 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f7f27581c99e3449f794074d08bdd800", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f7f27581c99e3449f794074d08bdd800");
                                        } else {
                                            DrugMRNShopCartModule.this.resolveSuccessAndCallbackPrice(bVar, promise);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                        Object[] objArr3 = {aVar};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6e02e41fc523292da07ad302532b8982", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6e02e41fc523292da07ad302532b8982");
                                            return;
                                        }
                                        if (!t.a(aVar.getMessage())) {
                                            am.a(DrugMRNShopCartModule.this.getReactApplicationContext(), aVar.getMessage());
                                        }
                                        d.a(promise, aVar);
                                    }
                                });
                                return;
                            }
                        }
                        d.a(promise, new com.sankuai.waimai.store.repository.net.b(com.sankuai.waimai.store.util.b.a((int) R.string.wm_drug_shop_cart_init_error)));
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveSuccessAndCallbackPrice(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, @NonNull Promise promise) {
        Object[] objArr = {bVar, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4819a39b567ead2afdb4521128585fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4819a39b567ead2afdb4521128585fb7");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        createMap.putString("message", "success");
        if (bVar != null) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("origin_total_price", bVar.g.mTotalAndBoxPrice);
            createMap2.putDouble("total_price", bVar.g());
            createMap2.putDouble("actual_total_price", bVar.f());
            createMap.putMap("data", createMap2);
        }
        promise.resolve(createMap);
    }

    @ReactMethod
    public void goodsListInShoppingCartWithPoiIds(final ReadableArray readableArray, final Promise promise) {
        Object[] objArr = {readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65cb189e9ae4bc7b6a1283c54e8e9b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65cb189e9ae4bc7b6a1283c54e8e9b57");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c1230e487eb1a3ff53f1f3c7d022bd1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c1230e487eb1a3ff53f1f3c7d022bd1");
                        return;
                    }
                    try {
                        if (readableArray == null || readableArray.size() <= 0) {
                            return;
                        }
                        WritableMap createMap = Arguments.createMap();
                        WritableMap createMap2 = Arguments.createMap();
                        WritableMap createMap3 = Arguments.createMap();
                        createMap.putInt("code", 0);
                        createMap.putString("message", "success");
                        for (int i = 0; i < readableArray.size(); i++) {
                            String string = readableArray.getString(i);
                            List<OrderedFood> g = com.sankuai.waimai.store.order.a.e().g(r.a(string, 0L));
                            WritableArray createArray = Arguments.createArray();
                            if (com.sankuai.shangou.stone.util.a.a((List) g) > 0) {
                                for (int i2 = 0; i2 < g.size(); i2++) {
                                    OrderedFood orderedFood = g.get(i2);
                                    if (orderedFood.sku != null) {
                                        String valueOf = String.valueOf(orderedFood.sku.id);
                                        int i3 = orderedFood.count;
                                        WritableMap createMap4 = Arguments.createMap();
                                        createMap4.putString("id", valueOf);
                                        createMap4.putInt("count", i3);
                                        createArray.pushMap(createMap4);
                                    }
                                }
                            }
                            WritableMap createMap5 = Arguments.createMap();
                            com.sankuai.waimai.store.platform.domain.core.shopcart.b d = com.sankuai.waimai.store.order.a.e().d(r.a(string, 0L));
                            createMap5.putDouble("origin_total_price", d.g.mTotalAndBoxPrice);
                            createMap5.putDouble("total_price", d.g());
                            createMap5.putDouble("actual_total_price", d.f());
                            createMap3.putMap(string, createMap5);
                            createMap2.putArray(string, createArray);
                        }
                        WritableMap createMap6 = Arguments.createMap();
                        createMap6.putMap("products_in_shoppingcart", createMap2);
                        createMap6.putMap("total_prices", createMap3);
                        createMap.putMap("data", createMap6);
                        promise.resolve(createMap);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void goodsListInShoppingCartWithPoiIdsNew(final ReadableArray readableArray, final Promise promise) {
        Object[] objArr = {readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77e89208c4978be571e159e56bb8c87d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77e89208c4978be571e159e56bb8c87d");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b5254feeaf35b5a5bf52ba96ee7fc045", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b5254feeaf35b5a5bf52ba96ee7fc045");
                        return;
                    }
                    try {
                        if (readableArray == null || readableArray.size() <= 0) {
                            return;
                        }
                        WritableMap createMap = Arguments.createMap();
                        WritableMap createMap2 = Arguments.createMap();
                        WritableMap createMap3 = Arguments.createMap();
                        createMap.putInt("code", 0);
                        createMap.putString("message", "success");
                        for (int i = 0; i < readableArray.size(); i++) {
                            String string = readableArray.getString(i);
                            List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(string);
                            WritableArray createArray = Arguments.createArray();
                            if (com.sankuai.shangou.stone.util.a.a((List) p) > 0) {
                                for (int i2 = 0; i2 < p.size(); i2++) {
                                    OrderedFood orderedFood = p.get(i2);
                                    if (orderedFood.sku != null) {
                                        String valueOf = String.valueOf(orderedFood.sku.id);
                                        int i3 = orderedFood.count;
                                        WritableMap createMap4 = Arguments.createMap();
                                        createMap4.putString("id", valueOf);
                                        createMap4.putInt("count", i3);
                                        createArray.pushMap(createMap4);
                                    }
                                }
                            }
                            WritableMap createMap5 = Arguments.createMap();
                            com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(string);
                            createMap5.putDouble("origin_total_price", k.g.mTotalAndBoxPrice);
                            createMap5.putDouble("total_price", k.g());
                            createMap5.putDouble("actual_total_price", k.f());
                            createMap3.putMap(string, createMap5);
                            createMap2.putArray(string, createArray);
                        }
                        WritableMap createMap6 = Arguments.createMap();
                        createMap6.putMap("products_in_shoppingcart", createMap2);
                        createMap6.putMap("total_prices", createMap3);
                        createMap.putMap("data", createMap6);
                        promise.resolve(createMap);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    private void clearShoppingCartWithPoiIdNative(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bfa8429b8e345dee5ed06bf2b8fb791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bfa8429b8e345dee5ed06bf2b8fb791");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c2f2580ccdc6e25465cc4a919f715055", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c2f2580ccdc6e25465cc4a919f715055");
                        return;
                    }
                    try {
                        com.sankuai.waimai.store.order.a.e().a(str, (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void clearShoppingCartWithPoiId(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ecdc74f2b7802d5244d0eac34319bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ecdc74f2b7802d5244d0eac34319bfe");
        } else {
            clearShoppingCartWithPoiIdNative(str, promise);
        }
    }

    @ReactMethod
    public void clearShoppingCartWithPoiIdNew(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a12ec9976c619020e483334ae48c16a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a12ec9976c619020e483334ae48c16a");
        } else if (readableMap == null) {
        } else {
            clearShoppingCartWithPoiIdNative(getOfficialPoiIdFromReadableMap(readableMap, "poi_id"), promise);
        }
    }

    @ReactMethod
    public void submitOrder(final ReadableMap readableMap, final ReadableMap readableMap2, final Promise promise) {
        Object[] objArr = {readableMap, readableMap2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "299912b063a9286ea876a28cd85ea4ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "299912b063a9286ea876a28cd85ea4ec");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d1a239d585ef39220009beada54d26a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d1a239d585ef39220009beada54d26a2");
                    } else if (DrugMRNShopCartModule.this.getCurrentActivity() == null || DrugMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("submitOrder activity is null or finishing"));
                    } else {
                        JSONObject a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap2);
                        Poi poi = new Poi();
                        poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                        if (poi.getLongPoiId() < 0 && TextUtils.isEmpty(poi.getOfficialPoiId())) {
                            d.a(promise, new Exception("submitOrder poi id is less than zero"));
                            return;
                        }
                        d.a aVar = new d.a();
                        aVar.b = DrugMRNShopCartModule.this.getCurrentActivity();
                        d.a a3 = aVar.a(poi.getLongPoiId());
                        a3.c = poi.getStringPoiId();
                        a3.f = DrugMRNShopCartModule.TAG;
                        a3.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
                        a3.j = false;
                        a3.m = a2 == null ? "" : a2.toString();
                        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(poi.getOfficialPoiId());
                        if (k != null && k.u != null && poi.getBuzType() == 9) {
                            a3.l = k.u.recommendCouponInfo;
                        }
                        a3.g = "from_sc_restaurant";
                        com.sankuai.waimai.store.manager.order.b.a(a3.a(), poi.getBuzType() == 9);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void doOrderPreview(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "053ab16f4934b32fb8469b14e098979f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "053ab16f4934b32fb8469b14e098979f");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            com.sankuai.waimai.store.mrn.d.a(promise, new Exception("submitOrder activity is null or finishing"));
        } else if (readableMap == null || !readableMap.hasKey("food")) {
            com.sankuai.waimai.store.mrn.d.a(promise, new Exception("参数不合法"));
        } else {
            String stringFromReadableMap = getStringFromReadableMap(readableMap, "poi_id");
            String stringFromReadableMap2 = getStringFromReadableMap(readableMap, FoodDetailNetWorkPreLoader.URI_POI_STR);
            String stringFromReadableMap3 = getStringFromReadableMap(readableMap, "common_params");
            String stringFromReadableMap4 = getStringFromReadableMap(readableMap, "recommend_coupon_info");
            ArrayList arrayList = new ArrayList();
            JSONArray a = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap.getArray("food"));
            if (a != null) {
                for (int i = 0; i < a.length(); i++) {
                    Object opt = a.opt(i);
                    if (opt instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) opt;
                        arrayList.add(new WmOrderedFood(jSONObject.optLong("spu_id"), jSONObject.optLong("sku_id"), null, jSONObject.optInt("count"), 0, 0, ""));
                    }
                }
            }
            d.a aVar = new d.a();
            aVar.b = getCurrentActivity();
            d.a a2 = aVar.a(r.a(stringFromReadableMap, 0L));
            a2.c = stringFromReadableMap2;
            a2.f = TAG;
            a2.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
            a2.j = false;
            a2.g = "from_drug_restaurant";
            a2.m = stringFromReadableMap3;
            a2.l = stringFromReadableMap4;
            a2.n = arrayList;
            com.sankuai.waimai.store.manager.order.b.a(a2.a(), true);
        }
    }

    private void loadPoiInfoNative(final String str, final String str2, final String str3, final int i, final Promise promise) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9682a8bb70a6b4200e58d390fc028c4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9682a8bb70a6b4200e58d390fc028c4f");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1169903aad3b36bce3c34ef8f64a7f2a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1169903aad3b36bce3c34ef8f64a7f2a");
                        return;
                    }
                    com.sankuai.waimai.store.drug.base.net.b.c().a(str, str2, str3, new com.sankuai.waimai.store.shopcart.b(r.a(str, 0L), str2, new k<PoiShoppingCartAndPoi>() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.10.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(Object obj) {
                            Poi poi;
                            PoiShoppingCartAndPoi poiShoppingCartAndPoi = (PoiShoppingCartAndPoi) obj;
                            Object[] objArr3 = {poiShoppingCartAndPoi};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "93323ee83a51847974ee87f5e5810627", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "93323ee83a51847974ee87f5e5810627");
                                return;
                            }
                            if (poiShoppingCartAndPoi != null) {
                                try {
                                    poi = poiShoppingCartAndPoi.poi;
                                } catch (Exception e) {
                                    com.sankuai.waimai.store.mrn.d.a(promise, e);
                                    return;
                                }
                            } else {
                                poi = null;
                            }
                            if (poi != null && DrugMRNShopCartModule.this.mPoiHelper.b != null) {
                                if (com.sankuai.waimai.store.platform.domain.manager.poi.a.a(DrugMRNShopCartModule.this.mPoiHelper.b.getStringPoiId(), poi.getStringPoiId(), DrugMRNShopCartModule.this.mPoiHelper.b.getLongPoiId(), poi.getLongPoiId())) {
                                    poi = DrugMRNShopCartModule.this.completionPoi(DrugMRNShopCartModule.this.mPoiHelper, poi);
                                } else {
                                    com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(poi.getOfficialPoiId());
                                    if (l != null && l.b != null) {
                                        poi = DrugMRNShopCartModule.this.completionPoi(l, poi);
                                    }
                                }
                            }
                            DrugMRNShopCartModule.this.mPoiHelper.a(poi, 1);
                            com.sankuai.waimai.store.order.a.e().a(str, poi);
                            com.sankuai.waimai.store.order.a.e().a(str2, poi);
                            if (poiShoppingCartAndPoi != null && poiShoppingCartAndPoi.poi != null) {
                                com.sankuai.waimai.store.order.a.e().a(r.a(str, 0L), str2, poiShoppingCartAndPoi.poi.getLongPoiId(), poiShoppingCartAndPoi.poi.getStringPoiId());
                            }
                            com.sankuai.waimai.store.shopping.cart.cache.b.a(poiShoppingCartAndPoi);
                            e eVar = new e(str, str2, DrugMRNShopCartModule.this.mPoiHelper, DrugMRNShopCartModule.ShopcartVisibleMap.get(DrugMRNShopCartModule.this.getCurrentActivity().hashCode(), Boolean.TRUE).booleanValue());
                            DrugMRNShopCartModule.successEventMap.put(DrugMRNShopCartModule.this.getCurrentActivity().hashCode(), eVar);
                            com.meituan.android.bus.a.a().c(eVar);
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("poiState", String.valueOf(poi != null ? poi.getState() : 0));
                            createMap.putInt("buzType", poi != null ? poi.getBuzType() : 0);
                            if (poiShoppingCartAndPoi != null && poiShoppingCartAndPoi.poiShoppingCart != null) {
                                createMap.putInt("shop_cart_exp", poiShoppingCartAndPoi.poiShoppingCart.cartExp);
                            }
                            WritableMap createMap2 = Arguments.createMap();
                            createMap2.putMap("data", createMap);
                            createMap2.putInt("code", 0);
                            createMap2.putString("message", "success");
                            createMap2.putMap("poi_info", (WritableMap) Arguments.makeNativeMap((Map) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(poi), Map.class)));
                            promise.resolve(createMap2);
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                            Object[] objArr3 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "76332273ec5c339b877f0e040a70d6d4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "76332273ec5c339b877f0e040a70d6d4");
                                return;
                            }
                            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.shopcartbridge.event.d(str, str2));
                            com.sankuai.waimai.store.mrn.d.a(promise, bVar);
                        }
                    }), i);
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e506fafe51ec97cabaa657114f987c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e506fafe51ec97cabaa657114f987c1");
            return;
        }
        super.onCatalystInstanceDestroy();
        ShopcartVisibleMap.clear();
        successEventMap.clear();
    }

    @ReactMethod
    public void addFoodWithBatchForMatchPurchase(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "331b3310f03388408943e4841696e46c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "331b3310f03388408943e4841696e46c");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    GoodsSku goodsSku;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1fefaddc9a0511774a5c6ea171bcb2b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1fefaddc9a0511774a5c6ea171bcb2b2");
                        return;
                    }
                    try {
                        if (!com.sankuai.waimai.store.util.b.a(DrugMRNShopCartModule.this.getCurrentActivity())) {
                            String officialPoiIdFromReadableMap = DrugMRNShopCartModule.this.getOfficialPoiIdFromReadableMap(readableMap, "poi_id");
                            ArrayList arrayList = new ArrayList();
                            JSONArray a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap.getArray("spus"));
                            if (a2 != null) {
                                for (int i = 0; i < a2.length(); i++) {
                                    Object obj = a2.get(i);
                                    if (obj instanceof JSONObject) {
                                        GoodsSpu goodsSpu = new GoodsSpu();
                                        goodsSpu.parseJson((JSONObject) obj);
                                        if (!com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkus()) && (goodsSku = goodsSpu.getSkus().get(0)) != null) {
                                            arrayList.add(new OrderedFood(goodsSpu, goodsSku, null, goodsSku.count > goodsSku.minOrderCount ? goodsSku.count : goodsSku.minOrderCount));
                                        }
                                    }
                                }
                            }
                            com.sankuai.waimai.store.order.a.e().f(officialPoiIdFromReadableMap, arrayList);
                            com.sankuai.waimai.store.order.a.e().c(officialPoiIdFromReadableMap, (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                            com.sankuai.waimai.store.mrn.d.a(promise);
                            return;
                        }
                        com.sankuai.waimai.store.mrn.d.a(promise, new com.sankuai.waimai.store.repository.net.b(com.sankuai.waimai.store.util.b.a((int) R.string.wm_drug_shop_cart_init_error)));
                    } catch (Exception e) {
                        com.sankuai.waimai.store.mrn.d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void addFoodWithBatch(final ReadableMap readableMap, final ReadableArray readableArray, final boolean z, final Promise promise) {
        Object[] objArr = {readableMap, readableArray, Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db4f06ef7174c7b6ffd1b23bec0e0ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db4f06ef7174c7b6ffd1b23bec0e0ed0");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    GoodsSku goodsSku;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "50b20e8a3a6c59032eff0d172575215b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "50b20e8a3a6c59032eff0d172575215b");
                        return;
                    }
                    try {
                        if (com.sankuai.waimai.store.util.b.a(DrugMRNShopCartModule.this.getCurrentActivity())) {
                            com.sankuai.waimai.store.mrn.d.a(promise, new com.sankuai.waimai.store.repository.net.b(com.sankuai.waimai.store.util.b.a((int) R.string.wm_drug_shop_cart_init_error)));
                            return;
                        }
                        Poi poi = new Poi();
                        poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                        JSONArray a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableArray);
                        ArrayList arrayList = new ArrayList();
                        if (a2 != null) {
                            for (int i = 0; i < a2.length(); i++) {
                                Object obj = a2.get(i);
                                if (obj instanceof JSONObject) {
                                    GoodsSpu goodsSpu = new GoodsSpu();
                                    goodsSpu.parseJson((JSONObject) obj);
                                    if (!com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkus()) && (goodsSku = goodsSpu.getSkus().get(0)) != null) {
                                        arrayList.add(new OrderedFood(goodsSpu, goodsSku, null, goodsSku.count > goodsSku.minOrderCount ? goodsSku.count : goodsSku.minOrderCount));
                                    }
                                }
                            }
                        }
                        if (z) {
                            com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                        }
                        com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), poi);
                        com.sankuai.waimai.store.order.a.e().e(poi.getOfficialPoiId(), arrayList);
                        com.sankuai.waimai.store.mrn.d.a(promise);
                    } catch (Exception e) {
                        com.sankuai.waimai.store.mrn.d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void increaseFoodWithCount(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80959ce53c1368fe36663148f0b541a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80959ce53c1368fe36663148f0b541a4");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e379dbb02d9c3e351d69cd465f795897", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e379dbb02d9c3e351d69cd465f795897");
                        return;
                    }
                    try {
                        if (DrugMRNShopCartModule.this.getCurrentActivity() != null && !DrugMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                            if (readableMap != null) {
                                String officialPoiIdFromReadableMap = DrugMRNShopCartModule.this.getOfficialPoiIdFromReadableMap(readableMap);
                                int a2 = r.a(readableMap.getString("addNum"), 1);
                                JSONObject a3 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap.getMap("spu"));
                                String string = readableMap.getString("callbackKey");
                                GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.waimai.store.util.i.a(a3.toString(), new TypeToken<GoodsSpu>() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.14.1
                                }.getType());
                                if (goodsSpu == null) {
                                    com.sankuai.waimai.store.mrn.d.a(promise, new Exception("参数错误"));
                                    return;
                                }
                                com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c a4 = com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a();
                                Object[] objArr3 = {string};
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a;
                                if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect4, false, "08971e16e1218dc5fd475687f4503da0", RobustBitConfig.DEFAULT_VALUE)) {
                                    bVar = (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect4, false, "08971e16e1218dc5fd475687f4503da0");
                                } else {
                                    bVar = a4.c == null ? null : a4.c.get(string);
                                }
                                com.sankuai.waimai.store.order.a.e().a(officialPoiIdFromReadableMap, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, a2, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule.14.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                                        Object[] objArr4 = {bVar2};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "de0972e451a343c819ae7abbeb0bf187", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "de0972e451a343c819ae7abbeb0bf187");
                                            return;
                                        }
                                        com.sankuai.waimai.store.mrn.d.a(promise);
                                        if (bVar != null) {
                                            bVar.a(bVar2);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                        Object[] objArr4 = {aVar};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "c71aca3bf46c47b4f817d34366318c93", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "c71aca3bf46c47b4f817d34366318c93");
                                            return;
                                        }
                                        com.sankuai.waimai.store.mrn.d.a(promise, aVar);
                                        if (bVar != null) {
                                            bVar.a(aVar);
                                        } else {
                                            super.a(aVar);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "d42f1088b83e0670d9b7b28ce76ba0da", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "d42f1088b83e0670d9b7b28ce76ba0da");
                                            return;
                                        }
                                        super.a();
                                        if (bVar != null) {
                                            bVar.a();
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final String b() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "f2af059e00b1cbad3bd84f1a30220726", RobustBitConfig.DEFAULT_VALUE)) {
                                            return (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "f2af059e00b1cbad3bd84f1a30220726");
                                        }
                                        if (bVar != null) {
                                            return bVar.b();
                                        }
                                        return super.b();
                                    }
                                });
                                return;
                            }
                            com.sankuai.waimai.store.mrn.d.a(promise, new Exception("参数错误"));
                            return;
                        }
                        com.sankuai.waimai.store.mrn.d.a(promise, new Exception("increaseFood activity is null or finishing"));
                    } catch (Exception e) {
                        com.sankuai.waimai.store.mrn.d.a(promise, e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Poi completionPoi(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, Poi poi) {
        Object[] objArr = {aVar, poi};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94318417be94416e736a0e8c8272172a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94318417be94416e736a0e8c8272172a");
        }
        poi.setNewPoiLabels(aVar.b.getNewPoiLabels());
        poi.setShareTip(aVar.b.shareTip);
        poi.setBulletin(aVar.b.bulletin);
        poi.isFlashShow = !aVar.t();
        poi.setPoiCouponEntity(aVar.b.getPoiCoupon());
        poi.poiDetailStoryInfo = aVar.b.poiDetailStoryInfo;
        poi.setLabelInfoList(aVar.b.getLabelInfoList());
        poi.discounts = aVar.b.discounts;
        poi.setBottomActivities(aVar.b.discounts);
        poi.isNewPage = aVar.b.isNewPage;
        poi.isUserNewCardPage = aVar.b.isUserNewCardPage;
        poi.couponPoiCardInfo = aVar.b.couponPoiCardInfo;
        poi.friendAssistance = aVar.b.friendAssistance;
        poi.isOneLine = aVar.b.isOneLine;
        poi.score = aVar.b.score;
        if (t.a(poi.schemeForInshop)) {
            poi.schemeForInshop = aVar.b.schemeForInshop;
        }
        return poi;
    }
}
