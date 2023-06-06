package com.sankuai.waimai.business.restaurant.goodsdetail.module;

import android.app.Activity;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.gson.Gson;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.comment.model.CartInfo;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.business.restaurant.goodsdetail.module.a;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.a;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.platform.preload.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GoodDetailLogicModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final int FROM_RECOMMEND = 1;
    public static final String JS_PAUSE_VIDEO = "pauseVideoPlayer";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isLoading;
    private final ArrayList<GoodsSpu> mGoodItems;
    private a.g mOnChatUnReadCountChange;
    private a.g mOnMsgCenterUnReadCountChange;
    private a.f onShareDialogStatus;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMGoodDetailLogicModule";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    public GoodDetailLogicModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "506eeccf1de3e0b60f777a261f8e805d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "506eeccf1de3e0b60f777a261f8e805d");
            return;
        }
        this.mOnMsgCenterUnReadCountChange = new a.g() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.13
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.g
            public final void a(int i, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "119dd57ef7f6d584a87f7a04eadec25a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "119dd57ef7f6d584a87f7a04eadec25a");
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("count", i);
                createMap.putBoolean("forceShow", z);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) GoodDetailLogicModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("actionRedPoint", createMap);
            }
        };
        this.mOnChatUnReadCountChange = new a.g() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.14
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.g
            public final void a(int i, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67b9e6c00c9ca9d933c8baba02b8ce1b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67b9e6c00c9ca9d933c8baba02b8ce1b");
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("count", i);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) GoodDetailLogicModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("chatRedPoint", createMap);
            }
        };
        this.onShareDialogStatus = new a.f() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.goodsdetail.module.a.f
            public final void a(boolean z) {
                Object[] objArr2 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8dbc30d381921e66b839e2077e25fb09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8dbc30d381921e66b839e2077e25fb09");
                } else if (!(GoodDetailLogicModule.this.getCurrentActivity() instanceof GoodDetailActivity) || GoodDetailLogicModule.this.getReactApplicationContext() == null) {
                } else {
                    com.sankuai.waimai.business.restaurant.rn.bridge.a.a(GoodDetailLogicModule.this.getReactApplicationContext(), "pauseVideoPlayer", null);
                }
            }
        };
        this.isLoading = false;
        this.mGoodItems = GoodDetailActivity.e;
        init();
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81e8f3d55af2caa8713ccb774346db7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81e8f3d55af2caa8713ccb774346db7d");
            return;
        }
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeLifecycleEventListener(this);
        destroy();
    }

    @ReactMethod
    public void selectedShopGood(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12187cd1c4b65c207cb1a296b24eb011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12187cd1c4b65c207cb1a296b24eb011");
        } else if (readableMap == null) {
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "342cb1a8dfe04391993e9a751ce4746d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "342cb1a8dfe04391993e9a751ce4746d");
                        return;
                    }
                    try {
                        String a2 = com.sankuai.waimai.business.restaurant.base.util.c.a(readableMap.getString("getCardInfo"));
                        String string = readableMap.getString("tag");
                        long j = readableMap.getInt("id");
                        int a3 = readableMap.hasKey("from") ? r.a(readableMap.getString("from"), 0) : 0;
                        com.sankuai.waimai.platform.domain.manager.poi.a a4 = com.sankuai.waimai.platform.domain.manager.poi.a.a();
                        byte b = a3 == 1 ? (byte) 1 : (byte) 0;
                        Object[] objArr3 = {a2, string, new Long(j), Byte.valueOf(b)};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.domain.manager.poi.a.a;
                        if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect4, false, "4caaf3178b979ab9912645f5f1fd3683", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect4, false, "4caaf3178b979ab9912645f5f1fd3683");
                        } else if (a4.b != null) {
                            for (com.sankuai.waimai.foundation.core.service.poi.b bVar : (com.sankuai.waimai.foundation.core.service.poi.b[]) a4.b.toArray(new com.sankuai.waimai.foundation.core.service.poi.b[a4.b.size()])) {
                                bVar.a(a2, string, j, b);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @ReactMethod
    public void addNewPoiId(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f29b252a06e60ed5d61b10812314004e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f29b252a06e60ed5d61b10812314004e");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f13ea52011aa2fd36b8926876ead792a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f13ea52011aa2fd36b8926876ead792a");
                        return;
                    }
                    String a2 = com.sankuai.waimai.business.restaurant.base.util.c.a(str);
                    String a3 = com.sankuai.waimai.business.restaurant.base.util.c.a(str2);
                    if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
                        return;
                    }
                    GlobalCartManager.getInstance().addNewPoiId(str, str2);
                    a.C1052a.a("poi_product_info", str, str2);
                }
            });
        }
    }

    @ReactMethod
    public void getCardInfo(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a32f0c1766f9721a221c5760da6de96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a32f0c1766f9721a221c5760da6de96");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a44b6ef58f3654a9becca3f76fe10f51", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a44b6ef58f3654a9becca3f76fe10f51");
                        return;
                    }
                    CartInfo cartInfo = null;
                    com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(com.sankuai.waimai.business.restaurant.base.util.c.a(str));
                    if (n != null) {
                        cartInfo = new CartInfo();
                        if (!com.sankuai.waimai.foundation.utils.b.b(n.b)) {
                            cartInfo.shoppingCartSkuList = new ArrayList<>();
                            for (com.sankuai.waimai.business.restaurant.base.shopcart.d dVar : n.b) {
                                if (!com.sankuai.waimai.foundation.utils.b.b(dVar.c)) {
                                    for (ShopCartItem shopCartItem : dVar.c) {
                                        if (shopCartItem.food != null) {
                                            cartInfo.getClass();
                                            CartInfo.a aVar = new CartInfo.a();
                                            if (shopCartItem.food.sku != null && shopCartItem.food.spu != null) {
                                                aVar.a = shopCartItem.food.sku.id;
                                                aVar.b = shopCartItem.food.spu.id;
                                                cartInfo.shoppingCartSkuList.add(aVar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (cartInfo == null || com.sankuai.waimai.foundation.utils.b.b(cartInfo.shoppingCartSkuList)) {
                        promise.resolve("");
                    } else {
                        promise.resolve(com.sankuai.waimai.foundation.utils.k.a().toJson(cartInfo));
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getListID(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a42973a273683818b7bbf7a7d411234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a42973a273683818b7bbf7a7d411234");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dc7f0fa294d56f12232e6ee2609562a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dc7f0fa294d56f12232e6ee2609562a9");
                        return;
                    }
                    promise.resolve(ListIDHelper.a.a.a());
                }
            });
        }
    }

    @ReactMethod
    public void getGoodsSpuList(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "743e9ab5a854072628bd92c2bd7e3e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "743e9ab5a854072628bd92c2bd7e3e51");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "590f3794dc37cbcb5b6e5e1ba574f1eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "590f3794dc37cbcb5b6e5e1ba574f1eb");
                        return;
                    }
                    try {
                        Gson gson = new Gson();
                        if (GoodDetailLogicModule.this.mGoodItems == null || GoodDetailLogicModule.this.mGoodItems.size() <= 0) {
                            return;
                        }
                        promise.resolve(gson.toJson(GoodDetailLogicModule.this.mGoodItems));
                    } catch (Exception unused) {
                        promise.resolve("");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a getActionBarConnector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f0a68f079138200c931908e375dcadf", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f0a68f079138200c931908e375dcadf");
        }
        if (getCurrentActivity() instanceof d) {
            return ((d) getCurrentActivity()).j();
        }
        return null;
    }

    private void runOnUiThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d39a51191adc86ca1dda7f4843142a96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d39a51191adc86ca1dda7f4843142a96");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }

    @ReactMethod
    public void readMsgCenterInfo(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3fe68647c2b65eb87dda2189f880bc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3fe68647c2b65eb87dda2189f880bc8");
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f779517f5985e2e4cd68eb7f680f13a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f779517f5985e2e4cd68eb7f680f13a0");
                    } else if (GoodDetailLogicModule.this.getActionBarConnector() == null) {
                    } else {
                        promise.resolve(com.sankuai.waimai.foundation.utils.k.a().toJson(GoodDetailLogicModule.this.getActionBarConnector().d.b()));
                    }
                }
            });
        }
    }

    @ReactMethod
    public void startChatPage(String str, String str2) {
        final long j;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d00a2f9299d0ac0b64342fd0176bf1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d00a2f9299d0ac0b64342fd0176bf1c");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        final String a = com.sankuai.waimai.business.restaurant.base.util.c.a(str2);
        try {
            j = Long.parseLong(str);
        } catch (Exception unused) {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE || TextUtils.isEmpty(a) || currentActivity == null || !(currentActivity instanceof BaseActivity)) {
            return;
        }
        ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3bf317c36bc458ef738a64b11a0dfd21", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3bf317c36bc458ef738a64b11a0dfd21");
                } else if (GoodDetailLogicModule.this.getActionBarConnector() == null) {
                } else {
                    GoodDetailLogicModule.this.getActionBarConnector().f.a(a, j);
                }
            }
        });
    }

    @ReactMethod
    public void readChatCount(String str, String str2) {
        final Long l;
        final int i;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3584b7ef99b6cda75a62546b821bd6c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3584b7ef99b6cda75a62546b821bd6c9");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        try {
            l = Long.valueOf(Long.parseLong(str));
            try {
                i = Integer.parseInt(str2);
            } catch (Exception unused) {
                i = Integer.MIN_VALUE;
                if (l.longValue() != Long.MIN_VALUE) {
                    return;
                }
                return;
            }
        } catch (Exception unused2) {
            l = Long.MIN_VALUE;
        }
        if (l.longValue() != Long.MIN_VALUE || i == Integer.MIN_VALUE || currentActivity == null || !(currentActivity instanceof BaseActivity)) {
            return;
        }
        ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "32f026ae5aaa221aa65d98772217bf95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "32f026ae5aaa221aa65d98772217bf95");
                } else if (GoodDetailLogicModule.this.getActionBarConnector() == null) {
                } else {
                    GoodDetailLogicModule.this.getActionBarConnector().f.a(l.longValue(), (short) i);
                }
            }
        });
    }

    @ReactMethod
    public void handleClickActionBarPopMenu(final int i, final String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08512596d77fc9c92f62a06b57a999b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08512596d77fc9c92f62a06b57a999b7");
        } else if (i == 0) {
        } else {
            runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "00c03acf268902df885e44846dcf9ca3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "00c03acf268902df885e44846dcf9ca3");
                    } else if (GoodDetailLogicModule.this.getActionBarConnector() == null) {
                    } else {
                        int i2 = i;
                        if (i2 == 1) {
                            GoodDetailLogicModule.this.getActionBarConnector().b();
                        } else if (i2 == 4) {
                            String str2 = "";
                            try {
                                str2 = new JSONObject(str).optString(Constants.TRAFFIC_URI);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            GoodDetailLogicModule.this.getActionBarConnector().a(str2);
                        } else if (i2 != 7) {
                        } else {
                            JSONObject jSONObject = null;
                            try {
                                jSONObject = new JSONObject(str);
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            GoodsSpu goodsSpu = new GoodsSpu();
                            goodsSpu.parseJson(jSONObject);
                            GoodDetailLogicModule.this.getActionBarConnector().a(goodsSpu);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPreLoadData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a0ae56ad8435159532838b7f28d5744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a0ae56ad8435159532838b7f28d5744");
        } else {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("preLoadCallback", str);
        }
    }

    @ReactMethod
    public void preLoadGoodDetailData(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c3bb314f06cf26228270212227c514f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c3bb314f06cf26228270212227c514f");
            return;
        }
        final HashMap hashMap = new HashMap();
        if (f.a(getCurrentActivity())) {
            this.isLoading = false;
            hashMap.put("state", -1);
            promise.resolve(com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJson(hashMap));
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4f65acd19723bb124f4de5ae94c76818", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4f65acd19723bb124f4de5ae94c76818");
                } else {
                    e.a().a(GoodDetailLogicModule.this.getCurrentActivity(), new com.sankuai.waimai.platform.preload.c<String>() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.5.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.preload.c
                        public final void a(com.sankuai.waimai.platform.preload.f<String> fVar) {
                            Object[] objArr3 = {fVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c08600a550621725ba9da52d0870394d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c08600a550621725ba9da52d0870394d");
                            } else if (f.a(GoodDetailLogicModule.this.getCurrentActivity())) {
                            } else {
                                switch (AnonymousClass8.a[fVar.b.ordinal()]) {
                                    case 1:
                                        String str = fVar.c;
                                        if (GoodDetailLogicModule.this.isLoading) {
                                            GoodDetailLogicModule.this.isLoading = false;
                                            GoodDetailLogicModule.this.sendPreLoadData(str);
                                            return;
                                        }
                                        promise.resolve(str);
                                        return;
                                    case 2:
                                        GoodDetailLogicModule.this.isLoading = true;
                                        hashMap.put("state", 0);
                                        promise.resolve(com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJson(hashMap));
                                        return;
                                    default:
                                        GoodDetailLogicModule.this.isLoading = false;
                                        hashMap.put("state", -1);
                                        promise.resolve(com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJson(hashMap));
                                        return;
                                }
                            }
                        }
                    });
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule$8  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass8 {
        public static final /* synthetic */ int[] a = new int[f.a.valuesCustom().length];

        static {
            try {
                a[f.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.a.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a356dea2fd45c6630828b2ff92cd6d44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a356dea2fd45c6630828b2ff92cd6d44");
        } else {
            init();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1995a3177e69581bdc2918a79dac9f16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1995a3177e69581bdc2918a79dac9f16");
        } else {
            destroy();
        }
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34988c63bc7ddb98de02ab8267f79e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34988c63bc7ddb98de02ab8267f79e84");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "814e090ba7158cb9dec3000899cb8794", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "814e090ba7158cb9dec3000899cb8794");
                    } else if (GoodDetailLogicModule.this.getActionBarConnector() != null) {
                        GoodDetailLogicModule.this.getActionBarConnector().d.a(GoodDetailLogicModule.this.mOnMsgCenterUnReadCountChange);
                        GoodDetailLogicModule.this.getActionBarConnector().f.a(GoodDetailLogicModule.this.mOnChatUnReadCountChange);
                        GoodDetailLogicModule.this.getActionBarConnector().c.a(GoodDetailLogicModule.this.onShareDialogStatus);
                    }
                }
            });
        }
    }

    private void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02f8d56442c1ca3347ff7b8247d3ce1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02f8d56442c1ca3347ff7b8247d3ce1a");
        } else if (getActionBarConnector() != null) {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.module.GoodDetailLogicModule.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "65962c68f13f9b3941616da29e29665e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "65962c68f13f9b3941616da29e29665e");
                        return;
                    }
                    GoodDetailLogicModule.this.getActionBarConnector().d.a();
                    GoodDetailLogicModule.this.getActionBarConnector().f.a();
                    GoodDetailLogicModule.this.getActionBarConnector().c.a();
                }
            });
        }
    }
}
