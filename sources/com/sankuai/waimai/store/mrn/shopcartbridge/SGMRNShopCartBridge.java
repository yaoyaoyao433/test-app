package com.sankuai.waimai.store.mrn.shopcartbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.submit.model.CollectOrder;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.mrn.shopcartbridge.AddProdctResult;
import com.sankuai.waimai.store.mrn.shopcartbridge.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.shopping.cart.e;
import com.sankuai.waimai.store.shopping.cart.event.C1560a;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = SGMRNShopCartBridge.NAME)
/* loaded from: classes5.dex */
public class SGMRNShopCartBridge extends ReactContextBaseJavaModule {
    public static final String NAME = "SGMRNShopCartBridge";
    public static final String SUBMIT_ORDER_BY_COMBINED_PRODUCTS = "mrn_shopcart_submit_order_by_combined_products";
    public static final String SUBMIT_ORDER_WITH_COUPONS_INFO = "mrn_shopcart_submit_order_with_coupons_info";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int ADD_OPERATION_SOURCE_ACTIVITY;
    private final int ADD_OPERATION_SOURCE_COMMON;
    private final int ADD_OPERATION_SOURCE_PLUS;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }

    public SGMRNShopCartBridge(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f80e9485498b921141166b2a1ae9a2fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f80e9485498b921141166b2a1ae9a2fd");
            return;
        }
        this.ADD_OPERATION_SOURCE_PLUS = 1;
        this.ADD_OPERATION_SOURCE_COMMON = 2;
        this.ADD_OPERATION_SOURCE_ACTIVITY = 3;
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b3b0e4906eaf312b56050e0a69a7706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b3b0e4906eaf312b56050e0a69a7706");
            return;
        }
        super.onCatalystInstanceDestroy();
        com.meituan.android.bus.a.a().b(this);
    }

    public static boolean doFailPromiseWhenInvalidatePoiId(Promise promise, String str, com.sankuai.waimai.store.mrn.a aVar, String str2) {
        Object[] objArr = {promise, str, aVar, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3247b677310f5ff1097a1f8936c3e952", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3247b677310f5ff1097a1f8936c3e952")).booleanValue();
        }
        if (aVar == null || !com.sankuai.waimai.store.platform.domain.manager.poi.a.b(aVar.a())) {
            d.a(promise, new Exception(String.format("[%s] poiID is not valid; mrnPoiIdStr=[%s]", str, str2)));
            return true;
        }
        return false;
    }

    @ReactMethod
    public void isSamePoi(String str, String str2, Promise promise) {
        com.sankuai.waimai.store.mrn.a a;
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25d15b14fc7fa88f129ae989d46d852e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25d15b14fc7fa88f129ae989d46d852e");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        try {
            a = com.sankuai.waimai.store.mrn.b.a(str);
        } catch (Exception e) {
            createMap.putString("error", e.getMessage());
        }
        if (doFailPromiseWhenInvalidatePoiId(promise, "isSamePoi poiID1", a, str)) {
            return;
        }
        com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str2);
        if (doFailPromiseWhenInvalidatePoiId(promise, "isSamePoi poiID2", a2, str2)) {
            return;
        }
        createMap.putBoolean("value", com.sankuai.waimai.store.order.a.e().b(a.b, a.c, a2.b, a2.c));
        promise.resolve(createMap);
    }

    @ReactMethod
    public void initShopCart(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99a1aa3046ddf568009cccbea0c58aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99a1aa3046ddf568009cccbea0c58aea");
            return;
        }
        try {
            final String a = com.sankuai.waimai.store.mrn.b.a(str).a();
            if ("-1".equals(a) || promise == null) {
                return;
            }
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "35f1ef6f6be44dae538bace185a20fec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "35f1ef6f6be44dae538bace185a20fec");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() == null || SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("[initShopCart] activity is null or finishing"));
                    } else {
                        try {
                            promise.resolve(SGMRNShopCartBridge.getMrnShopCartData(a));
                        } catch (Exception e) {
                            d.a(promise, e);
                        }
                    }
                }
            });
        } catch (Exception unused) {
            d.a(promise, new Exception("[initShopCart] poiId is not valid"));
        }
    }

    @ReactMethod
    public void sendToShopCartAnimationEndPointWithPoiID(final String str, final int i, final int i2, final Promise promise) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5965aa760098bf3f017d682051f1365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5965aa760098bf3f017d682051f1365");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1793cac876f0d2077c92c35454003cdb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1793cac876f0d2077c92c35454003cdb");
                        return;
                    }
                    try {
                        if (SGMRNShopCartBridge.this.getCurrentActivity() != null && !SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                            com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                            if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "sendToShopCartAnimationEndPointWithPoiID", a2, str)) {
                                return;
                            }
                            SGMRNShopCartBridge.this.setMrnLocation(a2.a(), i, i2);
                            d.a(promise);
                            return;
                        }
                        d.a(promise, new Exception("[sendToShopCartAnimationEndPointWithPoiID] activity is null or finishing"));
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMrnLocation(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dae7a7e1c46c740179ff905daf6d888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dae7a7e1c46c740179ff905daf6d888");
            return;
        }
        int[] a = f.a().a(str);
        if (i <= 0) {
            if (a == null || a.length <= 0 || a[0] != i) {
                setMrnLocalLocation(str, getCurrentActivity());
                return;
            }
            return;
        }
        int a2 = h.a(getCurrentActivity(), i);
        if (a == null || a.length <= 0 || a[0] != a2) {
            f.a().a(new int[]{a2, h.a(getCurrentActivity(), i2)}, str);
        }
    }

    private void setMrnLocalLocation(String str, @NonNull Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e72456320272eecbbc61fe0a7f1d0b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e72456320272eecbbc61fe0a7f1d0b90");
            return;
        }
        int b = h.b(getCurrentActivity());
        boolean B = com.sankuai.waimai.store.order.a.e().l(str).B();
        int c = com.sankuai.waimai.store.util.b.c(context, R.dimen.wm_sc_common_dimen_45);
        int c2 = com.sankuai.waimai.store.util.b.c(context, R.dimen.wm_sc_common_dimen_67);
        int c3 = b - com.sankuai.waimai.store.util.b.c(context, R.dimen.wm_sc_common_dimen_76);
        if (B) {
            c += c2;
        }
        f.a().a(new int[]{c, c3}, str);
    }

    @Subscribe
    public void onMRNAnimEndEventSuccess(com.sankuai.waimai.store.mrn.shopcartbridge.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd18c822d6720de513cd8078971947b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd18c822d6720de513cd8078971947b4");
        } else {
            a.a(getReactApplicationContext(), "WMSMBottomDockShrinkAnimationNotificaion", Arguments.createMap());
        }
    }

    @ReactMethod
    public void confirmGoods(String str, final ReadableArray readableArray, final Promise promise) {
        Object[] objArr = {str, readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99fd4eb18a753721a2655741907689b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99fd4eb18a753721a2655741907689b3");
            return;
        }
        final com.sankuai.waimai.store.mrn.a a = com.sankuai.waimai.store.mrn.b.a(str);
        if (doFailPromiseWhenInvalidatePoiId(promise, "confirmGoods", a, str)) {
            return;
        }
        ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.15
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e3cce1f9af059790e2648aac614a13d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e3cce1f9af059790e2648aac614a13d4");
                } else if (SGMRNShopCartBridge.this.getCurrentActivity() == null || SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                    d.a(promise, new Exception("[decreaseInnerFoodWithPoiID] activity is null or finishing"));
                } else {
                    try {
                        ArrayList arrayList = new ArrayList();
                        JSONArray a2 = a.a(readableArray);
                        for (int i = 0; i < a2.length(); i++) {
                            JSONObject optJSONObject = a2.optJSONObject(i);
                            GoodsSpu goodsSpu = new GoodsSpu();
                            goodsSpu.parseJson(optJSONObject);
                            arrayList.add(goodsSpu);
                        }
                        com.meituan.android.bus.a.a().c(new CollectOrder.OrderCollectEvent(String.valueOf(a.b), a.c, arrayList));
                        promise.resolve(null);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }
        });
    }

    @ReactMethod
    public void increaseInnerFoodWithPoiID(final String str, final int i, final ReadableMap readableMap, final int i2, final Promise promise) {
        Object[] objArr = {str, Integer.valueOf(i), readableMap, Integer.valueOf(i2), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d685ace50d3b0374427a36a3ff982bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d685ace50d3b0374427a36a3ff982bf");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67aa86deafc874bd0f0156bcbe071c42", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67aa86deafc874bd0f0156bcbe071c42");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() != null && !SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        SGMRNShopCartBridge.this.handleInnerShopCartOp(str, i, readableMap, i2, promise, true);
                    } else {
                        d.a(promise, new Exception("[increaseInnerFoodWithPoiID] activity is null or finishing"));
                    }
                }
            });
        }
    }

    @ReactMethod
    public void decreaseInnerFoodWithPoiID(final String str, final int i, final ReadableMap readableMap, final int i2, final Promise promise) {
        Object[] objArr = {str, Integer.valueOf(i), readableMap, Integer.valueOf(i2), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cdb8bb41287c5f2af957effde80c22c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cdb8bb41287c5f2af957effde80c22c");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.17
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19ff04b80f763a0b2421163618d8b58e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19ff04b80f763a0b2421163618d8b58e");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() != null && !SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        SGMRNShopCartBridge.this.handleInnerShopCartOp(str, i, readableMap, i2, promise, false);
                    } else {
                        d.a(promise, new Exception("[decreaseInnerFoodWithPoiID] activity is null or finishing"));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleInnerShopCartOp(java.lang.String r22, int r23, com.facebook.react.bridge.ReadableMap r24, int r25, com.facebook.react.bridge.Promise r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.handleInnerShopCartOp(java.lang.String, int, com.facebook.react.bridge.ReadableMap, int, com.facebook.react.bridge.Promise, boolean):void");
    }

    @ReactMethod
    public void increaseFoodWithPoiID(final String str, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc22420bd6629190da62b9a0aa974cc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc22420bd6629190da62b9a0aa974cc3");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.20
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0b0b61c4751433d9acdbe6048614948b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0b0b61c4751433d9acdbe6048614948b");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() == null || SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("[increaseFoodWithPoiID] activity is null or finishing"));
                    } else {
                        try {
                            com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu b = a.b(readableMap);
                            com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                            if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "increaseFoodWithPoiID", a2, str)) {
                                return;
                            }
                            b.couponPageSource = 10;
                            com.sankuai.waimai.store.order.a.e().a(a2.a(), b, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) b.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.20.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                    Object[] objArr3 = {aVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2105905ebd48d2b2e361de97995d86a1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2105905ebd48d2b2e361de97995d86a1");
                                    } else if (TextUtils.isEmpty(aVar.getMessage())) {
                                    } else {
                                        am.a(SGMRNShopCartBridge.this.getCurrentActivity(), aVar.getMessage());
                                    }
                                }
                            });
                            promise.resolve(d.a());
                        } catch (Exception e) {
                            d.a(promise, e);
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void decreaseFoodWithPoiID(final String str, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29b8f809812a505b62a6fd6f1d49dd8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29b8f809812a505b62a6fd6f1d49dd8b");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.21
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "430d83d38d4ff93c201f57055ef2526d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "430d83d38d4ff93c201f57055ef2526d");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() == null || SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("[decreaseFoodWithPoiID] activity is null or finishing"));
                    } else {
                        try {
                            com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu b = a.b(readableMap);
                            com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                            if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "decreaseFoodWithPoiID", a2, str)) {
                                return;
                            }
                            b.couponPageSource = 10;
                            if (b.isManySku()) {
                                com.sankuai.waimai.store.mrn.shopcartbridge.event.h hVar = new com.sankuai.waimai.store.mrn.shopcartbridge.event.h();
                                hVar.a = SGMRNShopCartBridge.this.getCurrentActivity() != null ? SGMRNShopCartBridge.this.getCurrentActivity().hashCode() : 0;
                                com.meituan.android.bus.a.a().c(hVar);
                                d.a(promise);
                                return;
                            }
                            com.sankuai.waimai.store.order.a.e().b(a2.a(), b, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) b.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.21.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                                }

                                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                                    Object[] objArr3 = {aVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "05f7c6257dd926607a8dfe83b744b453", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "05f7c6257dd926607a8dfe83b744b453");
                                    } else if (TextUtils.isEmpty(aVar.getMessage())) {
                                    } else {
                                        am.a(SGMRNShopCartBridge.this.getCurrentActivity(), aVar.getMessage());
                                    }
                                }
                            });
                            promise.resolve(d.a());
                        } catch (Exception e) {
                            d.a(promise, e);
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void showChooseSkuWithPoiID(final String str, final ReadableMap readableMap, final int i, final Promise promise) {
        Object[] objArr = {str, readableMap, Integer.valueOf(i), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f4021fcf8f00ba3c0039545a3fc8328", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f4021fcf8f00ba3c0039545a3fc8328");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "69d83d9fa9522d024e871b43664974a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "69d83d9fa9522d024e871b43664974a8");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() == null || SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("[showChooseSkuWithPoiID] activity is null or finishing"));
                    } else {
                        try {
                            com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu b = a.b(readableMap);
                            com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                            if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "showChooseSkuWithPoiID", a2, str)) {
                                return;
                            }
                            g.a(SGMRNShopCartBridge.this.getCurrentActivity(), b, com.sankuai.waimai.store.order.a.e().l(a2.a()).b, i);
                            d.a(promise);
                        } catch (Exception e) {
                            d.a(promise, e);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSameFood(long j, long j2, GoodsAttr[] goodsAttrArr, @NonNull OrderedFood orderedFood) {
        Object[] objArr = {new Long(j), new Long(j2), goodsAttrArr, orderedFood};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8642b0a12a65f86be08d10befabd7a2f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8642b0a12a65f86be08d10befabd7a2f")).booleanValue() : j == orderedFood.getSpuId() && j2 == orderedFood.getSkuId() && com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.a.a(goodsAttrArr, orderedFood.getAttrIds());
    }

    @ReactMethod
    public void clearShopCartWithPoiID(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dd09da5cfed4b1dfa7ce9772937036c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dd09da5cfed4b1dfa7ce9772937036c");
            return;
        }
        com.sankuai.waimai.store.mrn.a a = com.sankuai.waimai.store.mrn.b.a(str);
        if (doFailPromiseWhenInvalidatePoiId(promise, "clearShopCartWithPoiID", a, str) || promise == null) {
            return;
        }
        final String a2 = a.a();
        ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8e82a3deed680c3520fa2a0663322e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8e82a3deed680c3520fa2a0663322e8");
                    return;
                }
                com.sankuai.waimai.store.order.a.e().a(a2, (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                com.sankuai.waimai.store.order.a.e().c(a2);
            }
        });
    }

    @ReactMethod
    public void clearInvalidGoodsWithPoiID(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f297e85008d1c51d0eea60d85bedc745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f297e85008d1c51d0eea60d85bedc745");
            return;
        }
        com.sankuai.waimai.store.mrn.a a = com.sankuai.waimai.store.mrn.b.a(str);
        if (doFailPromiseWhenInvalidatePoiId(promise, "clearInvalidGoodsWithPoiID", a, str)) {
            return;
        }
        final String a2 = a.a();
        ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Map<String, Object> map;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f596df23e17c6b9841559b63f34aa264", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f596df23e17c6b9841559b63f34aa264");
                    return;
                }
                com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(a2);
                if (k != null && (map = k.x) != null) {
                    map.remove("invalid_product_list");
                }
                com.sankuai.waimai.store.order.a.e().g(a2);
                d.a(promise);
            }
        });
    }

    @ReactMethod
    public void clickIMButtonWithPoiID(final String str, String str2, final String str3, final String str4, final Promise promise) {
        Object[] objArr = {str, str2, str3, str4, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39c1dce7525a0d6894ad22176f28142f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39c1dce7525a0d6894ad22176f28142f");
        } else if (promise == null) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3caf388714a2fb25a21023f3e46ca7a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3caf388714a2fb25a21023f3e46ca7a5");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() == null || SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("[clickIMButtonWithPoiID] activity is null or finishing"));
                    } else {
                        try {
                            com.sankuai.waimai.store.event.b bVar = new com.sankuai.waimai.store.event.b(SGMRNShopCartBridge.this.getReactApplicationContext(), str3, r.a(str4, 0));
                            com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                            if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "clickIMButtonWithPoiID", a2, str)) {
                                return;
                            }
                            bVar.a = a2.a();
                            com.meituan.android.bus.a.a().c(bVar);
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
    public void startGoodDetailPageWithPoiID(final String str, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a24849a3a80e1a8b596e76f29d4bd73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a24849a3a80e1a8b596e76f29d4bd73");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0497193b6cd7d067b695cd607ba342b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0497193b6cd7d067b695cd607ba342b1");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() == null || SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("[startGoodDetailPageWithPoiID] activity is null or finishing"));
                    } else {
                        try {
                            com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                            if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "startGoodDetailPageWithPoiID", a2, str)) {
                                return;
                            }
                            Poi poi = com.sankuai.waimai.store.order.a.e().l(a2.a()).b;
                            g.a(SGMRNShopCartBridge.this.getCurrentActivity(), a.b(readableMap), poi);
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
    public void shopCartGoToGoodDetailPageWithPoiID(final String str, final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d79a2782cbc5fa4c742b6976470d60c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d79a2782cbc5fa4c742b6976470d60c6");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    int length;
                    int i2 = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dfdf61b1d467e9018aa6bc16da4cd407", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dfdf61b1d467e9018aa6bc16da4cd407");
                    } else if (SGMRNShopCartBridge.this.getCurrentActivity() == null || SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                        d.a(promise, new Exception("[shopCartGoToGoodDetailPageWithPoiID] activity is null or finishing"));
                    } else {
                        try {
                            com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                            if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "shopCartGoToGoodDetailPageWithPoiID", a2, str)) {
                                return;
                            }
                            Poi poi = com.sankuai.waimai.store.order.a.e().l(a2.a()).b;
                            JSONObject jSONObject = new JSONObject(readableMap.toHashMap());
                            long optLong = jSONObject.optLong("spu_id");
                            long optLong2 = jSONObject.optLong("sku_id");
                            JSONArray optJSONArray = jSONObject.optJSONArray("attrs");
                            ArrayList arrayList = new ArrayList();
                            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                                for (int i3 = 0; i3 < length; i3++) {
                                    JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                                    GoodsAttr fromJson = GoodsAttr.fromJson(optJSONObject);
                                    if (fromJson != null) {
                                        fromJson.id = optJSONObject.optLong("id");
                                        arrayList.add(fromJson);
                                    }
                                }
                            }
                            GoodsAttr[] goodsAttrArr = (GoodsAttr[]) arrayList.toArray(new GoodsAttr[0]);
                            List<com.sankuai.waimai.store.platform.domain.core.order.a> a3 = new e().a(com.sankuai.waimai.store.order.a.e().k(a2.a()));
                            if (a3 != null) {
                                int size = a3.size();
                                while (true) {
                                    if (i2 >= size) {
                                        break;
                                    }
                                    com.sankuai.waimai.store.platform.domain.core.order.a aVar = a3.get(i2);
                                    if (aVar != null && aVar.h != null && aVar.h.food != null) {
                                        OrderedFood orderedFood = aVar.h.food;
                                        i = size;
                                        if (SGMRNShopCartBridge.this.isSameFood(optLong, optLong2, goodsAttrArr, orderedFood)) {
                                            g.a(SGMRNShopCartBridge.this.getCurrentActivity(), orderedFood.spu, poi);
                                            break;
                                        }
                                    } else {
                                        i = size;
                                    }
                                    i2++;
                                    size = i;
                                }
                            }
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
    public void submitOrderWithOptions(final ReadableMap readableMap, final String str, final Promise promise) {
        Object[] objArr = {readableMap, str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaeea0491f0a91066de5a4597c1d3d02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaeea0491f0a91066de5a4597c1d3d02");
        } else if (readableMap == null) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    JSONArray a2;
                    GoodsSku goodsSku;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d9b90bad83783ec68f51b503d340744", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d9b90bad83783ec68f51b503d340744");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(readableMap.toHashMap());
                        jSONObject.optString("rootTag");
                        boolean optBoolean = jSONObject.optBoolean("clear_shopcart");
                        String optString = jSONObject.optString("recommend_coupon_info");
                        String optString2 = jSONObject.optString("preview_order_callback_info");
                        ReadableMap map = readableMap.hasKey("poi_info") ? readableMap.getMap("poi_info") : null;
                        Poi poi = new Poi();
                        JSONObject a3 = a.a(map);
                        if (a3 != null) {
                            poi.parseJsonToPoi(a3);
                        }
                        ArrayList arrayList = new ArrayList();
                        if (readableMap.hasKey("spu_list") && (a2 = a.a(readableMap.getArray("spu_list"))) != null && a2.length() > 0) {
                            for (int i = 0; i < a2.length(); i++) {
                                Object obj = a2.get(i);
                                if (obj instanceof JSONObject) {
                                    com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu goodsSpu = new com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu();
                                    goodsSpu.parseJson((JSONObject) obj);
                                    if (!com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkus()) && (goodsSku = goodsSpu.getSkus().get(0)) != null) {
                                        arrayList.add(new OrderedFood(goodsSpu, goodsSku, null, goodsSku.count > goodsSku.minOrderCount ? goodsSku.count : goodsSku.minOrderCount));
                                    }
                                }
                            }
                        }
                        if (optBoolean) {
                            com.sankuai.waimai.store.order.a.e().a(poi.getOfficialPoiId(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                        }
                        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                            com.sankuai.waimai.store.order.a.e().e(poi.getOfficialPoiId(), arrayList);
                            com.sankuai.waimai.store.order.a.e().h(poi.getOfficialPoiId());
                        }
                        d.a aVar = new d.a();
                        aVar.b = SGMRNShopCartBridge.this.getCurrentActivity();
                        d.a a4 = aVar.a(poi.id);
                        a4.c = poi.getOfficialPoiId();
                        a4.f = SGMRNShopCartBridge.NAME;
                        a4.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
                        a4.j = false;
                        if (TextUtils.equals(str, SGMRNShopCartBridge.SUBMIT_ORDER_WITH_COUPONS_INFO)) {
                            if (!t.a(optString2)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("preview_order_callback_info", optString2);
                                a4.m = new JSONObject(hashMap).toString();
                            }
                            if (!t.a(optString)) {
                                a4.l = optString;
                            }
                        }
                        a4.g = "from_sc_restaurant";
                        com.sankuai.waimai.store.manager.order.b.a(a4.a(), poi.getBuzType() == 9);
                        com.sankuai.waimai.store.mrn.d.a(promise);
                    } catch (Exception e) {
                        e.printStackTrace();
                        com.sankuai.waimai.store.mrn.d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void submitOrder(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bcd84051dc67095d645b868ceb7e5e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bcd84051dc67095d645b868ceb7e5e8");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "abfebcabdaf3431617f64a859fa41638", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "abfebcabdaf3431617f64a859fa41638");
                        return;
                    }
                    try {
                        com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                        if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "submitOrder", a2, str)) {
                            return;
                        }
                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.shopping.cart.event.e(SGMRNShopCartBridge.this.getReactApplicationContext(), a2.b, a2.c, r.a(str2, 0)));
                        com.sankuai.waimai.store.mrn.d.a(promise);
                    } catch (Exception e) {
                        e.printStackTrace();
                        com.sankuai.waimai.store.mrn.d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void crossShopPreiviewOrderWithPoiID(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17653d4f0db7a1d04b921c5f2adb9868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17653d4f0db7a1d04b921c5f2adb9868");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "98e6a143553b96aa79d3fc0a476451df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "98e6a143553b96aa79d3fc0a476451df");
                        return;
                    }
                    try {
                        if (SGMRNShopCartBridge.this.getCurrentActivity() != null && !SGMRNShopCartBridge.this.getCurrentActivity().isFinishing()) {
                            com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                            if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "crossShopPreiviewOrderWithPoiID", a2, str)) {
                                return;
                            }
                            AddProdctResult addProductResult = SGMRNShopCartBridge.this.getAddProductResult(a2.b, a2.c, com.sankuai.waimai.store.order.a.e().p(a2.a()));
                            Intent intent = new Intent();
                            intent.putExtra("resultData", i.a(addProductResult));
                            SGMRNShopCartBridge.this.getCurrentActivity().setResult(-1, intent);
                            SGMRNShopCartBridge.this.getCurrentActivity().finish();
                            com.sankuai.waimai.store.mrn.d.a(promise);
                            return;
                        }
                        com.sankuai.waimai.store.mrn.d.a(promise, new Exception("[crossShopPreiviewOrderWithPoiID] activity is null or finishing"));
                    } catch (Exception e) {
                        e.printStackTrace();
                        com.sankuai.waimai.store.mrn.d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void refreshCalculatePrice(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b103fb56f9488c25098817470dcd253e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b103fb56f9488c25098817470dcd253e");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "879db0e696b9025380de52bc47b8c3b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "879db0e696b9025380de52bc47b8c3b3");
                        return;
                    }
                    com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                    if (SGMRNShopCartBridge.doFailPromiseWhenInvalidatePoiId(promise, "refreshCalculatePrice", a2, str)) {
                        return;
                    }
                    com.sankuai.waimai.store.order.a.e().h(a2.a());
                }
            });
        }
    }

    @ReactMethod
    public void refreshShopCartCouponInfo(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c078c4cae7bc2003a43e33c281f0cbc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c078c4cae7bc2003a43e33c281f0cbc0");
        } else {
            al.a(new al.b<String>() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.13
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(String str3) {
                    String str4 = str3;
                    Object[] objArr2 = {str4};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "65580545e6ce5e92b51a26ad85bd1aa5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "65580545e6ce5e92b51a26ad85bd1aa5");
                    } else if (TextUtils.isEmpty(str4)) {
                    } else {
                        com.sankuai.waimai.store.order.a.e().c(str4);
                        com.sankuai.waimai.store.mrn.d.a(promise);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                public String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2a32f20c8a929dbc93c4ff28eb06f73a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2a32f20c8a929dbc93c4ff28eb06f73a");
                    }
                    try {
                        com.sankuai.waimai.store.mrn.a a2 = com.sankuai.waimai.store.mrn.b.a(str);
                        if (a2 == null) {
                            com.sankuai.waimai.store.mrn.d.a(promise, new NullPointerException(String.format(Locale.CHINESE, "cannot parse %s", str)));
                            return null;
                        }
                        com.sankuai.waimai.store.manager.coupon.c.a().a(a2.a(), str2);
                        return a2.a();
                    } catch (Exception e) {
                        com.sankuai.waimai.store.mrn.d.a(promise, e);
                        return null;
                    }
                }
            }, (String) null);
        }
    }

    @ReactMethod
    public void submitOrderByMRNCartData(final ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db2abc66bb3c7fb7d2d8e54aa3d7d1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db2abc66bb3c7fb7d2d8e54aa3d7d1e1");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            com.sankuai.waimai.store.mrn.d.a(promise, new Exception("[submitOrderByMRNCartData] activity is null or finishing"));
        } else {
            final c cVar = new c(getCurrentActivity());
            Object[] objArr2 = {readableMap};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "5009ed8665dd96bdde51a8dc92db0b9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "5009ed8665dd96bdde51a8dc92db0b9e");
                return;
            }
            Object[] objArr3 = {readableMap};
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect4, false, "b997433fbcc54d498bb1f0d0d6b329c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect4, false, "b997433fbcc54d498bb1f0d0d6b329c5");
            } else {
                al.a(new al.b<c.a>() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.al.b
                    public final /* synthetic */ void a(a aVar) {
                        final a aVar2 = aVar;
                        Object[] objArr4 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "b1edba2ca0fb02e04918ccf2929a47a4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "b1edba2ca0fb02e04918ccf2929a47a4");
                        } else if (aVar2 == null || aVar2.a == null || com.sankuai.shangou.stone.util.a.b(aVar2.b) || cVar.c == null || cVar.c.isFinishing()) {
                            if (cVar.c == null || cVar.c.isFinishing()) {
                                return;
                            }
                            am.a(cVar.c, "数据异常，请稍后重试");
                        } else {
                            try {
                                new JSONObject().put("preview_order_callback_info", aVar2.a.H());
                                c.a aVar3 = new c.a() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.c.1.2
                                    public static ChangeQuickRedirect a;

                                    {
                                        AnonymousClass1.this = this;
                                    }

                                    @Override // com.sankuai.waimai.store.shopping.cart.c.a
                                    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
                                        Object[] objArr5 = {jSONObject, jSONObject2};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "bef958da35cf56da7e99ac8ce01f7ecf", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "bef958da35cf56da7e99ac8ce01f7ecf");
                                        } else {
                                            com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.shopping.cart.c.a
                                    public final void a(d.a aVar4) {
                                        Object[] objArr5 = {aVar4};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "01e2f3ad4e021858599bb1b797f60a39", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "01e2f3ad4e021858599bb1b797f60a39");
                                        } else {
                                            aVar4.n = aVar2.b;
                                        }
                                    }
                                };
                                d.a aVar4 = new d.a();
                                aVar4.b = cVar.c;
                                d.a a2 = aVar4.a(aVar2.a.f());
                                a2.c = aVar2.a.h();
                                a2.d = aVar2.a.i();
                                a2.f = c.b;
                                a2.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
                                a2.j = false;
                                a2.g = "from_sc_restaurant";
                                a2.n = aVar2.b;
                                a2.m = a(aVar2, aVar3);
                                if (!t.a(aVar2.d)) {
                                    aVar4.l = aVar2.d;
                                }
                                com.sankuai.waimai.store.manager.order.b.a(aVar4.a(), aVar2.a.t());
                            } catch (Exception e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                            }
                        }
                    }

                    @Override // com.sankuai.waimai.store.util.al.b
                    /* renamed from: b */
                    public a a() {
                        JSONArray a2;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "e3f6b08444b7e7485b9adc3d6627cdce", RobustBitConfig.DEFAULT_VALUE)) {
                            return (a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "e3f6b08444b7e7485b9adc3d6627cdce");
                        }
                        if (readableMap == null) {
                            return null;
                        }
                        try {
                            ArrayList arrayList = new ArrayList();
                            if (readableMap.hasKey("food_list") && (a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(readableMap.getArray("food_list"))) != null && a2.length() > 0) {
                                for (int i = 0; i < a2.length(); i++) {
                                    JSONObject optJSONObject = a2.optJSONObject(i);
                                    long optLong = optJSONObject.optLong("sku_id", 0L);
                                    int optInt = optJSONObject.optInt("count");
                                    long optLong2 = optJSONObject.optLong("spu_id", 0L);
                                    String optString = optJSONObject.optString("activity_tag");
                                    String optString2 = optJSONObject.optString("attrs");
                                    arrayList.add(new WmOrderedFood(optLong2, optLong, !TextUtils.isEmpty(optString2) ? (GoodsAttr[]) i.a(optString2, new TypeToken<GoodsAttr[]>() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.c.1.1
                                        {
                                            AnonymousClass1.this = this;
                                        }
                                    }.getType()) : null, optInt, 0, 0, optString, ""));
                                }
                            }
                            ReadableMap map = readableMap.hasKey("poi_info") ? readableMap.getMap("poi_info") : null;
                            Poi poi = new Poi();
                            poi.parseJsonToPoi(com.sankuai.waimai.store.mrn.shopcartbridge.a.a(map));
                            return new a(new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi), arrayList, (!readableMap.hasKey("preview_extra") || readableMap.getMap("preview_extra") == null) ? null : readableMap.getMap("preview_extra").toHashMap(), (!readableMap.hasKey("recommend_coupon_info") || readableMap.getString("recommend_coupon_info") == null) ? null : readableMap.getString("recommend_coupon_info"));
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    private String a(@NonNull a aVar, c.a aVar2) {
                        Object[] objArr4 = {aVar, aVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "7dfd8c36492aa9bf3241b3a6a41d10ac", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "7dfd8c36492aa9bf3241b3a6a41d10ac");
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject H = aVar.a.H();
                            aVar2.a(H, jSONObject);
                            if (aVar.c != null && !aVar.c.isEmpty()) {
                                for (Map.Entry<String, Object> entry : aVar.c.entrySet()) {
                                    if (entry != null && !t.a(entry.getKey())) {
                                        if (H == null) {
                                            H = new JSONObject();
                                        }
                                        if (entry.getKey().equals("coupon_view_id")) {
                                            if (entry.getValue() instanceof String) {
                                                jSONObject.put("sg_brand_selected_coupon", URLDecoder.decode(String.valueOf(entry.getValue()), "utf-8"));
                                            }
                                        } else if (entry.getValue() instanceof Map) {
                                            H.put(entry.getKey(), new JSONObject(i.a(entry.getValue())));
                                        } else if (entry.getValue() instanceof List) {
                                            H.put(entry.getKey(), new JSONArray(i.a(entry.getValue())));
                                        }
                                    }
                                }
                            }
                            jSONObject.put("preview_order_callback_info", H);
                        } catch (Exception e) {
                            com.sankuai.waimai.store.base.log.a.a(e);
                        }
                        return jSONObject.toString();
                    }
                }, c.b);
            }
        }
    }

    @ReactMethod
    public void hideSelfOnMsc(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e8171486d9429de161d95cfda8155d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e8171486d9429de161d95cfda8155d2");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            com.sankuai.waimai.store.mrn.d.a(promise, new Exception("[hideSelf] activity is null or finishing"));
        } else if (j.h().d("hide_shopcart_by_root_tag")) {
            com.meituan.android.bus.a.a().c(new C1560a(str));
        } else {
            final Activity currentActivity = getCurrentActivity();
            com.sankuai.waimai.store.msi.view.b.a(currentActivity, new Runnable() { // from class: com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d6d086b4b0f404e89bbd20b6316dd8c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d6d086b4b0f404e89bbd20b6316dd8c");
                        return;
                    }
                    Activity activity = currentActivity;
                    Object[] objArr3 = {activity};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.msi.view.b.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "47abe334d4748355fc06d2489edcfd82", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "47abe334d4748355fc06d2489edcfd82");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(activity.hashCode());
                    View findViewById = viewGroup != null ? viewGroup.findViewById(10000) : null;
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void onSubscribeClickedWithPoiID(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f131466093240a4b48571ca24bf63a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f131466093240a4b48571ca24bf63a4");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            com.sankuai.waimai.store.mrn.d.a(promise, new Exception("[onSubscribeClickedWithPoiID] activity is null or finishing"));
        } else {
            com.sankuai.waimai.store.mrn.a a = com.sankuai.waimai.store.mrn.b.a(str);
            if (a == null) {
                com.sankuai.waimai.store.mrn.d.a(promise, new Exception("[onSubscribeClickedWithPoiID] poiID is null"));
                return;
            }
            com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(a.a());
            if (l == null) {
                com.sankuai.waimai.store.mrn.d.a(promise, new Exception("[onSubscribeClickedWithPoiID] poiHelper is null"));
            } else {
                com.sankuai.waimai.store.poi.subscribe.a.a().a(getCurrentActivity(), new com.sankuai.waimai.store.poi.subscribe.c(getCurrentActivity(), a.b, a.c, l.b.subscribe, ShopCartViewDelegate.a(getCurrentActivity())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AddProdctResult getAddProductResult(long j, String str, List<OrderedFood> list) {
        Object[] objArr = {new Long(j), str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbef178e5a3e29e2650acb52561f0ac7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddProdctResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbef178e5a3e29e2650acb52561f0ac7");
        }
        AddProdctResult addProdctResult = new AddProdctResult();
        addProdctResult.setPoiId(j);
        addProdctResult.setPoiIdStr(str);
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (OrderedFood orderedFood : list) {
                AddProdctResult.FoodsBean foodsBean = new AddProdctResult.FoodsBean();
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
                    arrayList.add(foodsBean);
                }
            }
            addProdctResult.setFoods(arrayList);
        }
        return addProdctResult;
    }

    public static WritableMap getMrnShopCartData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "984a42942a8609e2c7c20736aa18ce65", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "984a42942a8609e2c7c20736aa18ce65");
        }
        WritableMap a = com.sankuai.waimai.store.mrn.d.a();
        try {
            com.sankuai.waimai.store.platform.domain.manager.poi.a l = com.sankuai.waimai.store.order.a.e().l(str);
            com.sankuai.waimai.store.platform.domain.core.shopcart.b k = com.sankuai.waimai.store.order.a.e().k(str);
            if (l != null) {
                a.putString("api_stids", l.b.abExpInfo);
                a.putString("poi_id", String.valueOf(l.f()));
                a.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, l.h());
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("sg_msc_poi_menu", com.sankuai.waimai.store.base.abtest.a.c().e);
                a.putMap("ab_test", createMap);
            } catch (Exception unused) {
            }
            if (k != null && k.z != null) {
                a.putMap("poi_info", (WritableMap) Arguments.makeNativeMap(k.z));
            } else {
                JSONObject jSONObject = new JSONObject();
                if (k != null) {
                    jSONObject.put("cartData", k.hashCode());
                }
                if (l != null) {
                    long j = l.b.id;
                    jSONObject.put("name", l.b.name);
                    jSONObject.put("id", j);
                    jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, l.h());
                }
                jSONObject.put("threadTrace", getThreadStackTrace());
                com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.a.a;
                JSONArray a2 = PatchProxy.isSupport(objArr2, e, changeQuickRedirect3, false, "c5af93c42164074adf9dc554c8e74387", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect3, false, "c5af93c42164074adf9dc554c8e74387") : e.b.a();
                jSONObject.put("poiId", str);
                jSONObject.put("others", a2);
                jSONObject.put("traces", getTraces());
                String str2 = ae.b;
                ae.a(str2, "PoiInfoNullException_init_native; " + jSONObject.toString());
            }
            if (k != null && k.y != null) {
                a.putMap("shopping_cart", (WritableMap) Arguments.makeNativeMap(k.y));
            } else {
                ae.a(ae.b, "PoiInfoNullException_init_native; shoppingCartString=null");
            }
            if (k != null && k.x != null) {
                fillImageData(k.x, k);
                a.putMap("calc_info", (WritableMap) Arguments.makeNativeMap(k.x));
            } else {
                ae.a(ae.b, "PoiInfoNullException_init_native; calculateResultString=null");
            }
        } catch (Exception e2) {
            String str3 = ae.b;
            ae.a(str3, "Execption getMrnShopCartData;" + e2.getMessage());
        }
        return a;
    }

    private static String getThreadStackTrace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20cdd1d98219edea14e0b5427ff809e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20cdd1d98219edea14e0b5427ff809e7");
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                sb.append(stackTraceElement.getClassName());
                sb.append("#");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":L");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(");");
            }
        }
        return sb.toString();
    }

    private static JSONArray getTraces() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "880c84df0b19da72476de8057b285c1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "880c84df0b19da72476de8057b285c1c");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Activity activity : com.sankuai.waimai.store.util.b.b()) {
                if (activity.getIntent() != null && activity.getIntent().getData() != null) {
                    jSONArray.put(activity.getIntent().getData());
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    private static void fillImageData(Map<String, Object> map, com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {map, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3d1838ccfc593c903c6503412c0be42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3d1838ccfc593c903c6503412c0be42");
        } else if (map != null && bVar != null) {
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list = bVar.d;
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list2 = bVar.c;
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list3 = bVar.b;
            try {
                Object obj = map.get("invalid_product_list");
                if (obj instanceof List) {
                    fillDataWithPocket((List) obj, (com.sankuai.waimai.store.platform.domain.core.shopcart.c) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
                }
                Object obj2 = map.get("cart_info");
                if (obj2 instanceof List) {
                    List<Map> list4 = (List) obj2;
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list4)) {
                        for (Map map2 : list4) {
                            try {
                                Double d = (Double) map2.get("cart_id");
                                if (d != null && d.intValue() == -1) {
                                    fillDataWithPocketList((List) map2.get("product_list"), list2);
                                } else {
                                    List<Map> list5 = (List) map2.get("activity_group_list");
                                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list5)) {
                                        for (Map map3 : list5) {
                                            if (map3 != null) {
                                                fillDataWithPocketList((List) map3.get("product_list"), list3);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    private static void fillDataWithPocket(List<Map> list, com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar) {
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6558ed1ec0d319da7ab1629203d06a4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6558ed1ec0d319da7ab1629203d06a4e");
            return;
        }
        try {
            if (!com.sankuai.shangou.stone.util.a.b(list) && cVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(cVar);
                fillDataWithPocketList(list, arrayList);
            }
        } catch (Exception unused) {
        }
    }

    private static void fillDataWithPocketList(List<Map> list, List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list2) {
        OrderedFood findOrderedFood;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62a409dcc00101c548768c103df38072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62a409dcc00101c548768c103df38072");
            return;
        }
        try {
            if (!com.sankuai.shangou.stone.util.a.b(list) && !com.sankuai.shangou.stone.util.a.b(list2)) {
                for (Map map : list) {
                    if (map != null) {
                        long longValue = ((Double) map.get("sku_id")).longValue();
                        for (com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar : list2) {
                            if (cVar != null && (findOrderedFood = findOrderedFood(longValue, cVar.j)) != null) {
                                String a = com.sankuai.waimai.store.shopping.cart.viewHolder.b.a(findOrderedFood);
                                if (a != null) {
                                    map.put("picture", a);
                                }
                                map.put("real_stock", Integer.valueOf(findOrderedFood.sku.realStock));
                                map.put("restrict", Integer.valueOf(findOrderedFood.sku.restrict));
                                map.put("activity_stock", Integer.valueOf(findOrderedFood.sku.activityStock));
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static OrderedFood findOrderedFood(long j, List<ShopCartItem> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a21853539834d8d50881ac798399ca64", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a21853539834d8d50881ac798399ca64");
        }
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ShopCartItem shopCartItem = list.get(i);
                if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSkuId() == j) {
                    return shopCartItem.food;
                }
            }
        }
        return null;
    }
}
