package com.sankuai.waimai.store.mrn.shopcartbridge;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
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
import com.sankuai.shangou.stone.util.f;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.cyclepurchase.a;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.e;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.i;
import com.sankuai.waimai.store.mrn.shopcartbridge.event.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = SMMRNShopCartModule.NAME)
/* loaded from: classes5.dex */
public class SMMRNShopCartModule extends ReactContextBaseJavaModule {
    private static final String ADD_FOOD_NEED_LOAD_RECOMMEND = "add_food_need_load_recommend";
    public static final String NAME = "SMMRNShoppingCartViewManager";
    private static final String TAG = "SMMRNShopCartModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String COMPONENT_NAME_DRUG_INNER_SHOP;
    private a.C1240a mCyclePurchaseLifeCycleCallbacks;
    private Dialog mLoadingDialog;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a mPoiHelper;
    private b mPreSellCallback;
    public static final SparseArray<e> successEventMap = new SparseArray<>();
    public static final SparseArray<Boolean> ShopcartVisibleMap = new SparseArray<>();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public SMMRNShopCartModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b91dc0debd87bd2d775524f6b721723", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b91dc0debd87bd2d775524f6b721723");
            return;
        }
        this.COMPONENT_NAME_DRUG_INNER_SHOP = "flashbuy-drug-search";
        this.mPoiHelper = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        this.mLoadingDialog = null;
        Context applicationContext = reactApplicationContext.getApplicationContext();
        if (applicationContext instanceof Application) {
            this.mCyclePurchaseLifeCycleCallbacks = new a.C1240a();
            Application application = (Application) applicationContext;
            application.registerActivityLifecycleCallbacks(this.mCyclePurchaseLifeCycleCallbacks);
            this.mPreSellCallback = new b();
            application.registerActivityLifecycleCallbacks(this.mPreSellCallback);
        }
    }

    public void updatePoiHelper(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        if (aVar != null) {
            this.mPoiHelper = aVar;
        }
    }

    @ReactMethod
    public void loadPoiInfo(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d731f7bdc317fd5863d03163d3ba4cbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d731f7bdc317fd5863d03163d3ba4cbf");
        } else {
            loadPoiInfoNative(str, null, 990, promise);
        }
    }

    @ReactMethod
    public void loadPoiInfoWithExtra(String str, String str2, Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "671f41e981b3ae0a5ce9d9c96dcd8def", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "671f41e981b3ae0a5ce9d9c96dcd8def");
        } else {
            loadPoiInfoNative(str, str2, 990, promise);
        }
    }

    @ReactMethod
    public void loadPoiInfoWithComponentName(String str, String str2, String str3, Promise promise) {
        Object[] objArr = {str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b5328e663d7f49fe830182b52aceb21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b5328e663d7f49fe830182b52aceb21");
        } else {
            loadPoiInfoNative(str, str2, "flashbuy-drug-search".equals(str3) ? 110 : 990, promise);
        }
    }

    @ReactMethod
    public void increaseFood(final ReadableMap readableMap, String str, String str2, final String str3, final Promise promise) {
        Object[] objArr = {readableMap, str, str2, str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91e0e0477610f9ee6afe4f2a8f36bc9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91e0e0477610f9ee6afe4f2a8f36bc9a");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "468197b0a59485be9ae3971b3253eb2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "468197b0a59485be9ae3971b3253eb2c");
                    } else if (SMMRNShopCartModule.this.getCurrentActivity() == null || SMMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("increaseFood activity is null or finishing"));
                    } else if (readableMap == null) {
                    } else {
                        final GoodsSpu goodsSpu = new GoodsSpu();
                        goodsSpu.parseJson(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                        HashMap<String, Object> hashMap = readableMap.toHashMap();
                        final boolean booleanValue = hashMap.get(SMMRNShopCartModule.ADD_FOOD_NEED_LOAD_RECOMMEND) instanceof Boolean ? ((Boolean) hashMap.get(SMMRNShopCartModule.ADD_FOOD_NEED_LOAD_RECOMMEND)).booleanValue() : false;
                        if (goodsSpu.isManySku()) {
                            g.a(SMMRNShopCartModule.this.getCurrentActivity(), goodsSpu, SMMRNShopCartModule.this.mPoiHelper.b);
                        } else if (goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
                        } else {
                            com.sankuai.waimai.store.order.a.e().a(SMMRNShopCartModule.this.mPoiHelper.f(), goodsSpu, goodsSpu.getSkuList().get(0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "40872883172a2d7f4dc9bff3a0be59ec", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "40872883172a2d7f4dc9bff3a0be59ec");
                                    }
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1b1a767578150ff0924d36d861b1e029", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1b1a767578150ff0924d36d861b1e029");
                                        return;
                                    }
                                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.shopcartbridge.event.c(SMMRNShopCartModule.this.mPoiHelper.d(), str3, booleanValue, goodsSpu, goodsSpu.getSkuList().get(0)));
                                    d.a(promise);
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                    Object[] objArr3 = {aVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "41fc9eafb76084f09fd78e00899675f5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "41fc9eafb76084f09fd78e00899675f5");
                                        return;
                                    }
                                    am.a(SMMRNShopCartModule.this.getReactApplicationContext(), aVar.getMessage());
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
    public void decreaseFood(final ReadableMap readableMap, String str, final Promise promise) {
        Object[] objArr = {readableMap, str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09ec4410e609b38327f3fab2184edf38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09ec4410e609b38327f3fab2184edf38");
        } else if (com.sankuai.waimai.store.util.b.a(getCurrentActivity())) {
            d.a(promise, new Exception("decreaseFood activity is null or finishing"));
        } else if (readableMap == null) {
        } else {
            al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.12
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ GoodsSpu a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5854026dc208552b928d34d24684a02f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (GoodsSpu) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5854026dc208552b928d34d24684a02f");
                    }
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                    return goodsSpu;
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                    GoodsSpu goodsSpu2 = goodsSpu;
                    Object[] objArr2 = {goodsSpu2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "58560a8776fcd9cac9c762ac6a88b4e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "58560a8776fcd9cac9c762ac6a88b4e3");
                    } else if (goodsSpu2 != null) {
                        if (goodsSpu2.isManySku()) {
                            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.12.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2f57e1cc0e621c19d7519857a02596da", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2f57e1cc0e621c19d7519857a02596da");
                                        return;
                                    }
                                    com.sankuai.waimai.store.mrn.shopcartbridge.event.g gVar = new com.sankuai.waimai.store.mrn.shopcartbridge.event.g();
                                    gVar.a = SMMRNShopCartModule.this.getCurrentActivity() != null ? SMMRNShopCartModule.this.getCurrentActivity().hashCode() : 0;
                                    com.meituan.android.bus.a.a().c(gVar);
                                }
                            });
                        } else if (goodsSpu2.getSkuList() == null || goodsSpu2.getSkuList().size() <= 0) {
                        } else {
                            com.sankuai.waimai.store.order.a.e().b(SMMRNShopCartModule.this.mPoiHelper.d(), goodsSpu2, goodsSpu2.getSkuList().get(0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.12.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "50857721fa7d45308f711e3845df12b1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "50857721fa7d45308f711e3845df12b1");
                                    }
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6454a0f7b7151584e776272acf392e67", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6454a0f7b7151584e776272acf392e67");
                                    } else {
                                        SMMRNShopCartModule.this.resolveSuccessAndCallbackPrice(bVar, promise);
                                    }
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                    Object[] objArr3 = {aVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ae7cfe00d7ed2f578750746e2064b9da", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ae7cfe00d7ed2f578750746e2064b9da");
                                        return;
                                    }
                                    am.a(SMMRNShopCartModule.this.getReactApplicationContext(), aVar.getMessage());
                                    d.a(promise, aVar);
                                }
                            });
                        }
                    } else {
                        promise.reject(new RuntimeException("wrong result!"));
                    }
                }
            }, TAG);
        }
    }

    @ReactMethod
    public void decreaseFoodWithPoiInfo(final ReadableMap readableMap, final ReadableMap readableMap2, final Promise promise) {
        Object[] objArr = {readableMap, readableMap2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f993754f9a2e587b38487e9ccef5f9ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f993754f9a2e587b38487e9ccef5f9ff");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "798823f3c80f035b9505d4f1a7f89fb4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "798823f3c80f035b9505d4f1a7f89fb4");
                    } else if (com.sankuai.waimai.store.util.b.a(SMMRNShopCartModule.this.getCurrentActivity())) {
                        d.a(promise, new Exception("decreaseFoodWithPoiInfo activity is null or finishing"));
                    } else {
                        Poi poi = new Poi();
                        poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                        GoodsSpu goodsSpu = new GoodsSpu();
                        goodsSpu.parseJson(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap2));
                        if (goodsSpu.isManySku()) {
                            g.a(SMMRNShopCartModule.this.getCurrentActivity(), goodsSpu, SMMRNShopCartModule.this.mPoiHelper.b);
                        } else if (goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
                        } else {
                            com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), poi);
                            com.sankuai.waimai.store.order.a.e().b(poi.getOfficialPoiId(), goodsSpu, goodsSpu.getSkuList().get(0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.14.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e6f839318276f3771b87b87c4af867c1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e6f839318276f3771b87b87c4af867c1");
                                    }
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cf7cf26deeee963def266ed5f848259e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cf7cf26deeee963def266ed5f848259e");
                                    } else {
                                        SMMRNShopCartModule.this.resolveSuccessAndCallbackPrice(bVar, promise);
                                    }
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                    Object[] objArr3 = {aVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f987b85ec6c546bc6f54664b0b4454ba", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f987b85ec6c546bc6f54664b0b4454ba");
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
    public void numberOfGoods(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddcf30ab6f535c384f62e2d5f0d99067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddcf30ab6f535c384f62e2d5f0d99067");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25edd5d28019759be7d79804f088d806", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25edd5d28019759be7d79804f088d806");
                        return;
                    }
                    com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str2);
                    if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "numberOfGoods", a2, str2)) {
                        return;
                    }
                    int a3 = com.sankuai.waimai.store.order.a.e().a(a2.a(), r.a(str, 0L));
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
    public void pushToDetailPage(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27e6acdad457ee4419374baa41b0a436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27e6acdad457ee4419374baa41b0a436");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e4e87cf1e1127b3563d609f7ce34dd0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e4e87cf1e1127b3563d609f7ce34dd0a");
                    } else if (readableMap != null) {
                        if (SMMRNShopCartModule.this.getCurrentActivity() == null || SMMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                            d.a(promise, new Exception("pushToDetailPage activity is null or finishing"));
                            return;
                        }
                        try {
                            g.a(SMMRNShopCartModule.this.getCurrentActivity(), com.sankuai.waimai.store.mrn.shopcartbridge.a.b(readableMap.getMap("food")), SMMRNShopCartModule.this.mPoiHelper.b);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdb8acb371b3271954257c309cec23b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdb8acb371b3271954257c309cec23b1");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.17
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3885fa61b36f3aec9be366d02615c773", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3885fa61b36f3aec9be366d02615c773");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5261f36e385a93377b84dca2e379956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5261f36e385a93377b84dca2e379956");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.18
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ae680f0baa57c9e600c2cddf7859c558", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ae680f0baa57c9e600c2cddf7859c558");
                        return;
                    }
                    try {
                        j jVar = new j(SMMRNShopCartModule.this.mPoiHelper.d(), SMMRNShopCartModule.this.mPoiHelper, com.sankuai.waimai.store.mrn.shopcartbridge.a.b(readableMap));
                        jVar.c = SMMRNShopCartModule.this.getCurrentActivity() != null ? SMMRNShopCartModule.this.getCurrentActivity().hashCode() : 0;
                        com.meituan.android.bus.a.a().c(jVar);
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void goodsListInShoppingCartWithPoiId(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfbb688e7ea6bbaf85322293872ed23a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfbb688e7ea6bbaf85322293872ed23a");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.19
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb7ce6faecbc7ae7e48e93088b1b8be5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb7ce6faecbc7ae7e48e93088b1b8be5");
                        return;
                    }
                    com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                    if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "goodsListInShoppingCartWithPoiId", a2, str)) {
                        return;
                    }
                    List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(a2.a());
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
                                    createMap.putString("activity_tag", orderedFood.spu.activityTag);
                                    createMap.putInt("activity_type", orderedFood.spu.activityType);
                                    handPriceInfo = com.sankuai.waimai.store.order.a.e().b(a2.a(), orderedFood.spu.id, orderedFood.sku.id);
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
    public void setShopCartVisibility(final boolean z, final Promise promise) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7787e9cec55876cd023d29bc22657190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7787e9cec55876cd023d29bc22657190");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            d.a(promise, new Exception("setShopCartVisibility; activity is null or finishing"));
        } else {
            ShopcartVisibleMap.put(getCurrentActivity().hashCode(), Boolean.valueOf(z));
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.20
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e95beca6456f5f9b2bad8277ba7ac56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e95beca6456f5f9b2bad8277ba7ac56");
                        return;
                    }
                    com.meituan.android.bus.a.a().c(new i(SMMRNShopCartModule.this.mPoiHelper.d(), z));
                    d.a(promise);
                }
            });
        }
    }

    @ReactMethod
    public void increaseFoodWithPoiInfo(final ReadableMap readableMap, final ReadableMap readableMap2, final Promise promise) {
        Object[] objArr = {readableMap, readableMap2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8facbe8ff990e17872425cf17bc6712c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8facbe8ff990e17872425cf17bc6712c");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "548502a7b37bb03f5caec2c157e97893", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "548502a7b37bb03f5caec2c157e97893");
                        return;
                    }
                    try {
                        if (SMMRNShopCartModule.this.getCurrentActivity() != null && !SMMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                            Poi poi = new Poi();
                            poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                            GoodsSpu goodsSpu = new GoodsSpu();
                            goodsSpu.parseJson(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap2));
                            if (goodsSpu.isManySku()) {
                                g.a(SMMRNShopCartModule.this.getReactApplicationContext(), goodsSpu, poi);
                                return;
                            } else if (goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
                                return;
                            } else {
                                com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), poi);
                                com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), goodsSpu, goodsSpu.getSkuList().get(0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.2.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f0e86c555fd40997e5dc214f1c067e4f", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f0e86c555fd40997e5dc214f1c067e4f");
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                        Object[] objArr3 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9df6fdb084d002194fe35d3e8f724965", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9df6fdb084d002194fe35d3e8f724965");
                                        } else {
                                            SMMRNShopCartModule.this.resolveSuccessAndCallbackPrice(bVar, promise);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                        Object[] objArr3 = {aVar};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e9358c527a458dc9882c537cd6fdbe97", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e9358c527a458dc9882c537cd6fdbe97");
                                            return;
                                        }
                                        if (!t.a(aVar.getMessage())) {
                                            am.a(SMMRNShopCartModule.this.getReactApplicationContext(), aVar.getMessage());
                                        }
                                        d.a(promise, aVar);
                                    }
                                });
                                return;
                            }
                        }
                        d.a(promise, new com.sankuai.waimai.store.repository.net.b(com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shop_cart_init_error)));
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dadd2f6935bea848d284a7ed425bd8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dadd2f6935bea848d284a7ed425bd8c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffb98ba6021c81979980539ccbf5cb57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffb98ba6021c81979980539ccbf5cb57");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "72c92e7bcd8c8f07690ae9b79349c079", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "72c92e7bcd8c8f07690ae9b79349c079");
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
    public void clearShoppingCartWithPoiId(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30e8a8c075749af3c578ce8e38aa6e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30e8a8c075749af3c578ce8e38aa6e3c");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8dd0927e044271d0bb5978cd0c0da060", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8dd0927e044271d0bb5978cd0c0da060");
                        return;
                    }
                    try {
                        com.sankuai.waimai.store.order.a.e().a(Long.parseLong(str), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void submitOrder(final ReadableMap readableMap, final ReadableMap readableMap2, final Promise promise) {
        Object[] objArr = {readableMap, readableMap2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da17ddb22bd22a57f691fd3f27e74b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da17ddb22bd22a57f691fd3f27e74b24");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf45bdbf15ce60dad05ae896a55e2547", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf45bdbf15ce60dad05ae896a55e2547");
                    } else if (SMMRNShopCartModule.this.getCurrentActivity() == null || SMMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("submitOrder activity is null or finishing"));
                    } else {
                        JSONObject a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap2);
                        Poi poi = new Poi();
                        poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap));
                        if (poi.id < 0) {
                            d.a(promise, new Exception("submitOrder poi id is less than zero"));
                            return;
                        }
                        d.a aVar = new d.a();
                        aVar.b = SMMRNShopCartModule.this.getCurrentActivity();
                        d.a a3 = aVar.a(poi.id);
                        a3.c = poi.getStringPoiId();
                        a3.f = SMMRNShopCartModule.TAG;
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
    public void getGoodsHandPrice(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce3ece3d7467d8f93ccf4efc328cc70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce3ece3d7467d8f93ccf4efc328cc70c");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7f85f8289ac42fd21015ba11d96b52e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7f85f8289ac42fd21015ba11d96b52e2");
                        return;
                    }
                    try {
                        String string = readableMap.getString("poi_id");
                        String string2 = readableMap.getString("spu_id");
                        String string3 = readableMap.getString("sku_id");
                        try {
                            long parseLong = Long.parseLong(string);
                            try {
                                long parseLong2 = Long.parseLong(string2);
                                try {
                                    long parseLong3 = Long.parseLong(string3);
                                    com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
                                    Object[] objArr3 = {new Long(parseLong), new Long(parseLong2), new Long(parseLong3)};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.order.a.a;
                                    HandPriceInfo b2 = PatchProxy.isSupport(objArr3, e, changeQuickRedirect4, false, "46fd779846cbcaed740f7d8c91be0d80", RobustBitConfig.DEFAULT_VALUE) ? (HandPriceInfo) PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect4, false, "46fd779846cbcaed740f7d8c91be0d80") : e.b(String.valueOf(parseLong), parseLong2, parseLong3);
                                    WritableMap createMap = Arguments.createMap();
                                    createMap.putInt("code", 0);
                                    createMap.putString("message", "success");
                                    if (b2 != null) {
                                        WritableMap createMap2 = Arguments.createMap();
                                        createMap2.putDouble("hand_activity_price", b2.getHandActivityPrice());
                                        createMap2.putString("hand_price_label", b2.getHandPriceLabel());
                                        createMap.putMap("data", createMap2);
                                    }
                                    promise.resolve(createMap);
                                } catch (Exception unused) {
                                    Promise promise2 = promise;
                                    com.sankuai.waimai.store.mrn.d.a(promise2, new Exception("skuIdString parseLong exception. id: " + string3));
                                }
                            } catch (Exception unused2) {
                                Promise promise3 = promise;
                                com.sankuai.waimai.store.mrn.d.a(promise3, new Exception("spuIdString parseLong exception. id: " + string2));
                            }
                        } catch (Exception unused3) {
                            Promise promise4 = promise;
                            com.sankuai.waimai.store.mrn.d.a(promise4, new Exception("poiIdString parseLong exception. id: " + string));
                        }
                    } catch (Exception e2) {
                        com.sankuai.waimai.store.mrn.d.a(promise, e2);
                    }
                }
            });
        }
    }

    private void loadPoiInfoNative(final String str, final String str2, final int i, final Promise promise) {
        Object[] objArr = {str, str2, Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe968ecaef9f6c84d0ecfd86a413eb83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe968ecaef9f6c84d0ecfd86a413eb83");
            return;
        }
        final com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
        if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "loadPoiInfoNative", a2, str)) {
            return;
        }
        ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ad4f577e96f4b4e29bf007607583d2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ad4f577e96f4b4e29bf007607583d2b");
                    return;
                }
                com.sankuai.waimai.store.downgrade.b.a(null, a2.b, a2.c, str2, new k<PoiShoppingCartAndPoi>() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.7.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(Object obj) {
                        Poi poi;
                        PoiShoppingCartAndPoi poiShoppingCartAndPoi = (PoiShoppingCartAndPoi) obj;
                        Object[] objArr3 = {poiShoppingCartAndPoi};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d559f3a1f9d7dceeb814f64dbae6b37f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d559f3a1f9d7dceeb814f64dbae6b37f");
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
                        if (poi != null && SMMRNShopCartModule.this.mPoiHelper.b != null) {
                            if (poi.id == SMMRNShopCartModule.this.mPoiHelper.b.id) {
                                poi = SMMRNShopCartModule.this.completionPoi(SMMRNShopCartModule.this.mPoiHelper, poi);
                            } else {
                                com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(poi.getOfficialPoiId());
                                if (l != null && l.b != null) {
                                    poi = SMMRNShopCartModule.this.completionPoi(l, poi);
                                }
                            }
                        }
                        SMMRNShopCartModule.this.mPoiHelper.a(poi, 1);
                        com.sankuai.waimai.store.order.a.e().a(a2.a(), poi);
                        if (poiShoppingCartAndPoi != null && poiShoppingCartAndPoi.poi != null) {
                            com.sankuai.waimai.store.order.a.e().a(a2.b, a2.a(), poiShoppingCartAndPoi.poi.id, poiShoppingCartAndPoi.poi.getOfficialPoiId());
                        }
                        com.sankuai.waimai.store.shopping.cart.cache.b.a(poiShoppingCartAndPoi);
                        e eVar = new e(a2.a(), SMMRNShopCartModule.this.mPoiHelper, SMMRNShopCartModule.ShopcartVisibleMap.get(SMMRNShopCartModule.this.getCurrentActivity().hashCode(), Boolean.TRUE).booleanValue());
                        SMMRNShopCartModule.successEventMap.put(SMMRNShopCartModule.this.getCurrentActivity().hashCode(), eVar);
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
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b55413f6a459bfbe6dd26a6d130a5cf1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b55413f6a459bfbe6dd26a6d130a5cf1");
                            return;
                        }
                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.shopcartbridge.event.d(com.sankuai.waimai.store.mrn.b.a(str).a()));
                        com.sankuai.waimai.store.mrn.d.a(promise, bVar);
                    }
                }, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Poi completionPoi(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, Poi poi) {
        Object[] objArr = {aVar, poi};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0143d84140d6bc2e4bc9338017ef7e20", RobustBitConfig.DEFAULT_VALUE) ? (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0143d84140d6bc2e4bc9338017ef7e20") : com.sankuai.waimai.store.platform.domain.manager.poi.a.a(aVar, poi);
    }

    @ReactMethod
    public void cyclePurchaseCalculate(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ee3833090e03f935db43499cb638671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ee3833090e03f935db43499cb638671");
        } else if (readableMap == null || promise == null) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "55044b658630faf41dd895d1e6e095cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "55044b658630faf41dd895d1e6e095cb");
                    } else if (SMMRNShopCartModule.this.getCurrentActivity() != null && !SMMRNShopCartModule.this.getCurrentActivity().isFinishing()) {
                        com.sankuai.waimai.store.manager.user.a.a(SMMRNShopCartModule.this.getCurrentActivity(), new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.8.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                String str2;
                                Promise promise2;
                                int i;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ceb4c5578e43954556d32a97b92fa9ff", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ceb4c5578e43954556d32a97b92fa9ff");
                                    return;
                                }
                                ReadableMap readableMap2 = readableMap;
                                Promise promise3 = promise;
                                a.C1240a c1240a = SMMRNShopCartModule.this.mCyclePurchaseLifeCycleCallbacks;
                                Activity currentActivity = SMMRNShopCartModule.this.getCurrentActivity();
                                Object[] objArr4 = {readableMap2, promise3, c1240a, currentActivity};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.mrn.shopcartbridge.cyclepurchase.a.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "08d61240090535f686957f1ef5169763", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "08d61240090535f686957f1ef5169763");
                                    return;
                                }
                                JSONObject a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap2);
                                if (a2 == null) {
                                    com.sankuai.waimai.store.mrn.d.a(promise3, new Exception("cyclePurchase param error"));
                                    return;
                                }
                                try {
                                    str = readableMap2.getString("extra");
                                } catch (Exception unused) {
                                    str = "";
                                }
                                if (t.a(str)) {
                                    com.sankuai.waimai.store.mrn.d.a(promise3, new Exception("extra is null"));
                                    return;
                                }
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    String optString = jSONObject.optString("poi_id");
                                    String optString2 = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
                                    long a3 = f.a((Object) optString, -1L);
                                    if (a3 < 0 && t.a(optString2)) {
                                        com.sankuai.waimai.store.mrn.d.a(promise3, new Exception("poi id is error"));
                                        return;
                                    }
                                    try {
                                        str2 = readableMap2.getString("recommend_coupon_info");
                                    } catch (Exception unused2) {
                                        str2 = "";
                                    }
                                    if (com.sankuai.waimai.store.util.b.a(currentActivity)) {
                                        com.sankuai.waimai.store.mrn.d.a(promise3, new Exception("cyclePurchase activity is null or finishing"));
                                        return;
                                    }
                                    int hashCode = currentActivity.hashCode();
                                    if (c1240a != null) {
                                        String jSONObject2 = a2.toString();
                                        Object[] objArr5 = {Integer.valueOf(hashCode), new Long(a3), optString2, jSONObject2, str2};
                                        ChangeQuickRedirect changeQuickRedirect6 = a.C1240a.a;
                                        String str3 = str2;
                                        promise2 = promise3;
                                        if (PatchProxy.isSupport(objArr5, c1240a, changeQuickRedirect6, false, "c6e5b2a93884d4cf028e63d5441084d6", RobustBitConfig.DEFAULT_VALUE)) {
                                            i = 0;
                                            PatchProxy.accessDispatch(objArr5, c1240a, changeQuickRedirect6, false, "c6e5b2a93884d4cf028e63d5441084d6");
                                        } else {
                                            i = 0;
                                            c1240a.b = hashCode;
                                            c1240a.c = a3;
                                            c1240a.d = optString2;
                                            c1240a.e = jSONObject2;
                                            c1240a.f = str3;
                                        }
                                    } else {
                                        promise2 = promise3;
                                        i = 0;
                                    }
                                    currentActivity.finish();
                                    currentActivity.overridePendingTransition(i, R.anim.wm_sc_common_dialog_alpha_out);
                                    com.sankuai.waimai.store.mrn.d.a(promise2);
                                } catch (Exception e) {
                                    com.sankuai.waimai.store.mrn.d.a(promise3, e);
                                }
                            }
                        });
                    } else {
                        com.sankuai.waimai.store.mrn.d.a(promise, new Exception("activity is null or finishing"));
                    }
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96e6170a109a4149ecb51b880229b236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96e6170a109a4149ecb51b880229b236");
            return;
        }
        super.onCatalystInstanceDestroy();
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        if (this.mCyclePurchaseLifeCycleCallbacks != null && (applicationContext instanceof Application)) {
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.mCyclePurchaseLifeCycleCallbacks);
            this.mCyclePurchaseLifeCycleCallbacks = null;
        }
        if (this.mPreSellCallback != null && (applicationContext instanceof Application)) {
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.mPreSellCallback);
            this.mPreSellCallback = null;
        }
        ShopcartVisibleMap.clear();
        successEventMap.clear();
    }

    private void dismissLoadingView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35009d78a1a2e6751fe1612322761acc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35009d78a1a2e6751fe1612322761acc");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cea63d9bc9ca8935eccfd54dd805914e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cea63d9bc9ca8935eccfd54dd805914e");
                        return;
                    }
                    com.sankuai.waimai.store.util.d.a(SMMRNShopCartModule.this.mLoadingDialog);
                    SMMRNShopCartModule.this.mLoadingDialog = null;
                }
            }, TAG);
        }
    }

    private void showLoadingView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c07b832570fd67dc1fd86ba197a2e52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c07b832570fd67dc1fd86ba197a2e52");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88ccf43c4179ad112a5302fd08a927a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88ccf43c4179ad112a5302fd08a927a9");
                    } else if (SMMRNShopCartModule.this.mLoadingDialog == null || !SMMRNShopCartModule.this.mLoadingDialog.isShowing()) {
                        SMMRNShopCartModule.this.mLoadingDialog = com.sankuai.waimai.store.util.d.a(SMMRNShopCartModule.this.getCurrentActivity());
                    }
                }
            }, TAG);
        }
    }

    @ReactMethod
    public void preSellPurchaseCalculate(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56250c47cce27bba2e822934c05ce74f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56250c47cce27bba2e822934c05ce74f");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb6b636a0200ed26c3bec720bcf0e3d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb6b636a0200ed26c3bec720bcf0e3d0");
                    } else if (readableMap != null && promise != null) {
                        if (SMMRNShopCartModule.this.mPreSellCallback != null && SMMRNShopCartModule.this.getCurrentActivity() != null) {
                            SMMRNShopCartModule.this.mPreSellCallback.b = readableMap;
                            SMMRNShopCartModule.this.mPreSellCallback.c = SMMRNShopCartModule.this.getCurrentActivity().hashCode();
                            SMMRNShopCartModule.this.getCurrentActivity().finish();
                            SMMRNShopCartModule.this.getCurrentActivity().overridePendingTransition(0, R.anim.wm_sc_common_dialog_alpha_out);
                        }
                        com.sankuai.waimai.store.mrn.d.a(promise);
                    } else {
                        com.sankuai.waimai.store.mrn.d.a(promise, new RuntimeException("input error!"));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public final com.sankuai.waimai.store.platform.domain.manager.poi.a a;
        public final List<WmOrderedFood> b;

        public a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, List<WmOrderedFood> list) {
            this.a = aVar;
            this.b = list;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;
        public ReadableMap b;
        public int c;
        private boolean d;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c72bb8afb3e350ef111c386700d1c8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c72bb8afb3e350ef111c386700d1c8a");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2559b039f2c0a200b9ae551fc0879b0c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2559b039f2c0a200b9ae551fc0879b0c");
            } else {
                this.c = -1;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a89e59b6c9fe745a96c36b8f46135e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a89e59b6c9fe745a96c36b8f46135e7");
            } else if (this.d) {
                this.d = false;
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c19ee389ba6eac4cec6ed8382fb4667b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c19ee389ba6eac4cec6ed8382fb4667b");
                } else {
                    al.a(new al.b<a>() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.b.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.util.al.b
                        public final /* synthetic */ void a(a aVar) {
                            final a aVar2 = aVar;
                            Object[] objArr3 = {aVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f7fc201cb0a6d3646f9d63ff1a4081d6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f7fc201cb0a6d3646f9d63ff1a4081d6");
                                return;
                            }
                            Activity c = activity != null ? activity : com.sankuai.waimai.foundation.utils.activity.a.a().c();
                            if (aVar2 == null || aVar2.a == null || com.sankuai.shangou.stone.util.a.b(aVar2.b)) {
                                return;
                            }
                            try {
                                new JSONObject().put("preview_order_callback_info", aVar2.a.H());
                                c.a aVar3 = new c.a() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.b.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.shopping.cart.c.a
                                    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
                                        Object[] objArr4 = {jSONObject, jSONObject2};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0150d7354d1cbcd2eaeb57005dc303b5", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0150d7354d1cbcd2eaeb57005dc303b5");
                                        } else {
                                            com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.shopping.cart.c.a
                                    public final void a(d.a aVar4) {
                                        Object[] objArr4 = {aVar4};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f8e049c28331282612a606d59b305a5", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f8e049c28331282612a606d59b305a5");
                                        } else {
                                            aVar4.n = aVar2.b;
                                        }
                                    }
                                };
                                d.a aVar4 = new d.a();
                                aVar4.b = c;
                                d.a a2 = aVar4.a(aVar2.a.f());
                                a2.c = aVar2.a.h();
                                a2.d = aVar2.a.i();
                                a2.f = SMMRNShopCartModule.TAG;
                                a2.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
                                a2.j = false;
                                a2.g = "from_sc_restaurant";
                                a2.n = aVar2.b;
                                a2.m = a(aVar2, aVar3);
                                com.sankuai.waimai.store.manager.order.b.a(aVar4.a(), aVar2.a.t());
                            } catch (Exception e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                            }
                        }

                        private String a(@NonNull a aVar, c.a aVar2) {
                            Object[] objArr3 = {aVar, aVar2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b3c1e6ec775e98bdb190571a4ff8a2f", RobustBitConfig.DEFAULT_VALUE)) {
                                return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b3c1e6ec775e98bdb190571a4ff8a2f");
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                JSONObject H = aVar.a.H();
                                aVar2.a(H, jSONObject);
                                jSONObject.put("preview_order_callback_info", H);
                            } catch (Exception e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                            }
                            return jSONObject.toString();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.sankuai.waimai.store.util.al.b
                        /* renamed from: b */
                        public a a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0bf50c442279cae38b8a9f38cc1c3ea", RobustBitConfig.DEFAULT_VALUE)) {
                                return (a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0bf50c442279cae38b8a9f38cc1c3ea");
                            }
                            if (b.this.b == null) {
                                return null;
                            }
                            try {
                                ReadableArray array = b.this.b.hasKey("food_list") ? b.this.b.getArray("food_list") : null;
                                ReadableMap map = b.this.b.hasKey("poi_info") ? b.this.b.getMap("poi_info") : null;
                                Poi poi = new Poi();
                                poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(map));
                                ArrayList arrayList = new ArrayList();
                                JSONArray a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(array);
                                int length = a2.length();
                                for (int i = 0; i < length; i++) {
                                    JSONObject optJSONObject = a2.optJSONObject(i);
                                    if (optJSONObject != null) {
                                        String optString = optJSONObject.optString("id");
                                        int optInt = optJSONObject.optInt("count");
                                        String optString2 = optJSONObject.optString("spu_id");
                                        String optString3 = optJSONObject.optString("attrs");
                                        arrayList.add(new WmOrderedFood(Long.parseLong(optString2), Long.parseLong(optString), !TextUtils.isEmpty(optString3) ? (GoodsAttr[]) com.sankuai.waimai.store.util.i.a(optString3, new TypeToken<GoodsAttr[]>() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.b.1.2
                                        }.getType()) : null, optInt, 0, 0, optJSONObject.optString("activity_tag"), optJSONObject.optString("product_extra_info")));
                                    }
                                }
                                return new a(new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi), arrayList);
                            } catch (Exception e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                                return null;
                            }
                        }
                    }, SMMRNShopCartModule.TAG);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690d63e481e804d46f64a4abde179e95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690d63e481e804d46f64a4abde179e95");
            } else if (activity == null || activity.hashCode() != this.c) {
            } else {
                this.d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03202e6b041b1d24dee45bb8ff6e3db8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03202e6b041b1d24dee45bb8ff6e3db8");
                return;
            }
            SMMRNShopCartModule.ShopcartVisibleMap.remove(activity.hashCode());
            com.sankuai.waimai.store.shopping.cart.delegate.c.a(activity);
        }
    }

    @ReactMethod
    public void addFoodWithBatch(final ReadableMap readableMap, final ReadableArray readableArray, final boolean z, final Promise promise) {
        Object[] objArr = {readableMap, readableArray, Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "602576de8b64750e42ac3ca558174e2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "602576de8b64750e42ac3ca558174e2f");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    GoodsSku goodsSku;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b25f2cf3f969fa21ff51ebac9a99d003", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b25f2cf3f969fa21ff51ebac9a99d003");
                        return;
                    }
                    try {
                        if (com.sankuai.waimai.store.util.b.a(SMMRNShopCartModule.this.getCurrentActivity())) {
                            com.sankuai.waimai.store.mrn.d.a(promise, new com.sankuai.waimai.store.repository.net.b(com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shop_cart_init_error)));
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
                            com.sankuai.waimai.store.order.a.e().a(poi.getId(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
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
}
