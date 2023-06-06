package com.sankuai.waimai.business.restaurant.rn.bridge;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.business.restaurant.base.shopcart.protocol.GoodsSpuAttrs;
import com.sankuai.waimai.business.restaurant.base.skuchoose.b;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.l;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.MachProJsonUtil;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.domain.core.goods.FoodMultiSpuResponse;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsRemind;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.a;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.restaurant.shopcart.ui.r;
import com.sankuai.waimai.restaurant.shopcart.utils.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMRNShoppingCartManager extends ReactContextBaseJavaModule implements LifecycleEventListener, d {
    public static final String JS_PAUSE_VIDEO = "pauseVideoPlayer";
    private static final String RN_MODEL_NAME = "WMRNShoppingCartManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int from;
    private boolean isFromInShopSearch;
    private r mGoodsListVisibilityChangeListener;
    private String mPoiSearchGlobalId;
    private String mPoiSearchLogId;
    private String mSearchKeyWord;

    @ReactMethod
    public void didGetGoodsList(ReadableMap readableMap) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RN_MODEL_NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    public WMRNShoppingCartManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "876d41a935ac6d078cb5e809139b32ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "876d41a935ac6d078cb5e809139b32ed");
            return;
        }
        this.isFromInShopSearch = false;
        this.from = 3;
        this.mGoodsListVisibilityChangeListener = new r() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.ui.r
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "26021ab11499ae5dcdc2277ed6a0b1ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "26021ab11499ae5dcdc2277ed6a0b1ac");
                } else if (z && (WMRNShoppingCartManager.this.getCurrentDelegate() instanceof GoodDetailActivity) && WMRNShoppingCartManager.this.getReactApplicationContext() != null) {
                    a.a(WMRNShoppingCartManager.this.getReactApplicationContext(), "pauseVideoPlayer", null);
                }
            }
        };
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "676ad77ca503efae14c4251d98ad785c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "676ad77ca503efae14c4251d98ad785c");
            return;
        }
        super.initialize();
        try {
            com.sankuai.waimai.restaurant.shopcart.ui.c cVar = getCurrentDelegate().d().e;
            r rVar = this.mGoodsListVisibilityChangeListener;
            Object[] objArr2 = {rVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.restaurant.shopcart.ui.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "9c9b106f298b23e36ceeb74912fe0d48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "9c9b106f298b23e36ceeb74912fe0d48");
            } else if (cVar.l.contains(rVar)) {
            } else {
                cVar.l.add(rVar);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    private void sendShopCartMsg(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28e96f574c0e90f78abdc07b01e8f93f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28e96f574c0e90f78abdc07b01e8f93f");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("hasTip", z);
        if (getReactApplicationContext() != null) {
            a.a(getReactApplicationContext(), "AdjustContentInset", createMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c getCurrentDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb58f5a1c0750372ef017dd894d86f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb58f5a1c0750372ef017dd894d86f2");
        }
        if (!(getCurrentActivity() instanceof TransferActivity)) {
            if (getCurrentActivity() instanceof GoodDetailActivity) {
                return (c) getCurrentActivity();
            }
            return null;
        }
        BaseActivityDelegate baseActivityDelegate = ((TransferActivity) getCurrentActivity()).c;
        if (baseActivityDelegate instanceof ShopCartRNBridgeDelegate) {
            return (c) baseActivityDelegate;
        }
        return null;
    }

    @ReactMethod
    public void decreaseFood(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5bc0a2a8f10d78cedcd4495de0a3613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5bc0a2a8f10d78cedcd4495de0a3613");
            return;
        }
        final GoodsSpu b = a.b(readableMap);
        ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7eb4afe2ec845731fc23c11784034dc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7eb4afe2ec845731fc23c11784034dc6");
                    return;
                }
                final c currentDelegate = WMRNShoppingCartManager.this.getCurrentDelegate();
                if (currentDelegate == null) {
                    return;
                }
                if (b.isManySku()) {
                    GoodDetailActivity.a(WMRNShoppingCartManager.this.getCurrentActivity(), b, currentDelegate.b(), "");
                } else if (b.getSkuList() == null || b.getSkuList().size() <= 0) {
                } else {
                    k.a().a(currentDelegate.b().f(), b, b.getSkuList().get(0), b.hasMultiSaleAttr ? b.getAttrValuesArr() : null, new e() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "95ed7982e1775d5c773663ad4befe0da", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "95ed7982e1775d5c773663ad4befe0da");
                            }
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                            Object[] objArr3 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "55b85598016786a155a488389f02e8cf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "55b85598016786a155a488389f02e8cf");
                                return;
                            }
                            if (aVar != null && !TextUtils.isEmpty(aVar.getMessage())) {
                                ae.a(WMRNShoppingCartManager.this.getCurrentActivity(), aVar.getMessage());
                            }
                            WMRNShoppingCartManager.this.logError("delete_food", currentDelegate, aVar);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logError(String str, c cVar, com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
        Object[] objArr = {str, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9d7595a6c3e53eecdfce880c6aa8a2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9d7595a6c3e53eecdfce880c6aa8a2d");
        } else if (aVar == null || cVar == null) {
        } else {
            i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a(str).c(aVar.getMessage()).b(cVar.f() ? "search_in_shop" : "goods_collections").b());
        }
    }

    @ReactMethod
    public void loadPoiInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1702467a019c66de73a1d5b7458c2af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1702467a019c66de73a1d5b7458c2af1");
            return;
        }
        final String a = com.sankuai.waimai.business.restaurant.base.util.c.a(str);
        ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d7a7b69b64c421f5daaf95a648a84a03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d7a7b69b64c421f5daaf95a648a84a03");
                    return;
                }
                final c currentDelegate = WMRNShoppingCartManager.this.getCurrentDelegate();
                if (currentDelegate == null) {
                    return;
                }
                try {
                    if (aa.a(a)) {
                        WMRNShoppingCartManager.this.sniffer("invalid_poiId", currentDelegate.f(), a);
                    } else if (currentDelegate.f()) {
                        WMRNShoppingCartManager.this.initPoiFromLocalData(a, currentDelegate);
                        return;
                    }
                    final g b = currentDelegate.b();
                    com.sankuai.waimai.business.restaurant.productset.a.a(WMRNShoppingCartManager.this.getCurrentActivity()).a(a, b.m, b.y, new com.sankuai.waimai.business.restaurant.base.repository.net.c<PoiShoppingCartAndPoi>() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.9.1
                        public static ChangeQuickRedirect b;

                        @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                        public final /* synthetic */ void a(Object obj) {
                            PoiShoppingCartAndPoi poiShoppingCartAndPoi = (PoiShoppingCartAndPoi) obj;
                            Object[] objArr3 = {poiShoppingCartAndPoi};
                            ChangeQuickRedirect changeQuickRedirect4 = b;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "929f94eec52ee1350a45001514f36437", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "929f94eec52ee1350a45001514f36437");
                                return;
                            }
                            try {
                                String poiIDStr = poiShoppingCartAndPoi.poi.getPoiIDStr();
                                if (!a.equals(poiIDStr)) {
                                    GlobalCartManager.getInstance().addNewPoiId(a, poiIDStr);
                                    a.C1052a.a("poi_cart_info", a, poiIDStr);
                                    com.sankuai.waimai.platform.domain.core.poi.b.a(poiShoppingCartAndPoi.poi.getId(), poiIDStr);
                                }
                            } catch (Exception unused) {
                            }
                            if (currentDelegate.h() != null) {
                                poiShoppingCartAndPoi.poi.setAllowanceAllianceScenes(currentDelegate.h().getAllowanceAllianceScenes());
                                poiShoppingCartAndPoi.poi.setAdActivityFlag(currentDelegate.h().getAdActivityFlag());
                                poiShoppingCartAndPoi.poi.setIsSelfDelivery(currentDelegate.h().isSelfDelivery);
                            }
                            b.a(poiShoppingCartAndPoi.poi, 1);
                            if (currentDelegate.i() != null) {
                                b.o = currentDelegate.i().o;
                            }
                            if (poiShoppingCartAndPoi.functionControl != null) {
                                b.a(poiShoppingCartAndPoi.functionControl);
                            }
                            b.z = poiShoppingCartAndPoi.shopType;
                            currentDelegate.d().n();
                            k.a().a(b.f(), b);
                            if (poiShoppingCartAndPoi != null && poiShoppingCartAndPoi.poi != null) {
                                WMRNShoppingCartManager.this.sendPoiRest(poiShoppingCartAndPoi.poi.getState() == 3);
                                if (currentDelegate.g()) {
                                    WMRNShoppingCartManager.this.reCalculatePrice();
                                }
                            }
                            a.a(WMRNShoppingCartManager.this.getReactApplicationContext(), "RefreshGoodsList", Arguments.createMap());
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = b;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d831fbed753d6cd9fd6d973474995cfb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d831fbed753d6cd9fd6d973474995cfb");
                            } else {
                                super.a();
                            }
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.repository.net.c, com.sankuai.waimai.business.restaurant.base.repository.net.b
                        public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                            Object[] objArr3 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect4 = b;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e980544fa45379c657a9f835ded2fd5f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e980544fa45379c657a9f835ded2fd5f");
                                return;
                            }
                            try {
                                WMRNShoppingCartManager.this.initPoiFromLocalData(a, currentDelegate);
                                if (aVar == null || aVar.d() == null) {
                                    return;
                                }
                                com.sankuai.waimai.foundation.utils.log.a.b(aVar.d());
                            } catch (Exception unused) {
                            }
                        }
                    });
                } catch (NullPointerException unused) {
                    if (currentDelegate.bB_() == null || currentDelegate.bB_().isFinishing()) {
                        return;
                    }
                    currentDelegate.bB_().finish();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initPoiFromLocalData(@NonNull String str, @NonNull c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "409e0dc6f612c6b9107823c1c426c1a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "409e0dc6f612c6b9107823c1c426c1a4");
            return;
        }
        g h = k.a().h(str);
        if (h != null && h.g != null) {
            cVar.b().a(h.g, 1);
            cVar.b().z = h.z;
            cVar.b().a(h.b);
            cVar.d().n();
            k.a().a(cVar.b().f(), cVar.b());
            sendPoiRest(h.t());
            if (cVar.g()) {
                reCalculatePrice();
            }
            a.a(getReactApplicationContext(), "RefreshGoodsList", Arguments.createMap());
            return;
        }
        sniffer("invalid_poiHelper", cVar.f(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sniffer(@NonNull String str, boolean z, String str2) {
        String str3;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1871498d7a101b82703f865e249e1a33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1871498d7a101b82703f865e249e1a33");
            return;
        }
        if (z) {
            str3 = str + "SearchInShop";
        } else {
            str3 = str + "goodsCollections";
        }
        if (str2 == null) {
            str2 = "";
        }
        i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("search_in_shop").b(str3).d(str2).b());
    }

    @ReactMethod
    public void increaseFood(final ReadableMap readableMap, float f, float f2, final String str) {
        Object[] objArr = {readableMap, Float.valueOf(f), Float.valueOf(f2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d67d3040e440e30519fcf06936a8867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d67d3040e440e30519fcf06936a8867");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5712648639de9c8a2d8e1a563fb02732", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5712648639de9c8a2d8e1a563fb02732");
                        return;
                    }
                    final c currentDelegate = WMRNShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    final View a2 = a.a(WMRNShoppingCartManager.this.getCurrentActivity().getWindow().getDecorView(), str);
                    final GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(a.a(readableMap));
                    if (goodsSpu.isManySku()) {
                        GoodDetailActivity.a(WMRNShoppingCartManager.this.getCurrentActivity(), goodsSpu, currentDelegate.b(), "");
                    } else if (goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
                    } else {
                        k.a().a(WMRNShoppingCartManager.this.getCurrentActivity(), currentDelegate.b().f(), goodsSpu, goodsSpu.getSkuList().get(0), goodsSpu.hasMultiSaleAttr ? goodsSpu.getAttrValuesArr() : null, new e() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.10.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "660441d1d7391b8603f86dc971c71cf7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "660441d1d7391b8603f86dc971c71cf7");
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "79227e14a4993ef1a06778a55894e157", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "79227e14a4993ef1a06778a55894e157");
                                    return;
                                }
                                if (WMRNShoppingCartManager.this.getCurrentOrderCount(goodsSpu) >= com.sankuai.waimai.restaurant.shopcart.utils.d.a(goodsSpu) && com.sankuai.waimai.restaurant.shopcart.utils.d.a(goodsSpu) != -1) {
                                    com.sankuai.waimai.restaurant.shopcart.utils.d.a(WMRNShoppingCartManager.this.getCurrentActivity());
                                    if (a2 != null) {
                                        a2.setEnabled(false);
                                    }
                                }
                                currentDelegate.d().a(a2);
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                                Object[] objArr3 = {aVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bcdcd277f936d37e192a0099a09865b4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bcdcd277f936d37e192a0099a09865b4");
                                    return;
                                }
                                if (aVar != null && !TextUtils.isEmpty(aVar.getMessage())) {
                                    ae.a(WMRNShoppingCartManager.this.getCurrentActivity(), aVar.getMessage());
                                }
                                WMRNShoppingCartManager.this.logError("add_food", currentDelegate, aVar);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentOrderCount(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6480047701315eb6a2b92d74f699b8fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6480047701315eb6a2b92d74f699b8fa")).intValue();
        }
        if (getCurrentDelegate() == null || getCurrentDelegate().b() == null) {
            return 0;
        }
        return com.sankuai.waimai.restaurant.shopcart.utils.d.a(getCurrentDelegate().b().f(), goodsSpu);
    }

    @ReactMethod
    public void setIsFromInShopSearch() {
        this.from = 1;
    }

    @ReactMethod
    public void setFromSource(int i) {
        this.from = i;
    }

    @ReactMethod
    public void updateNativeSearchData(String str, String str2, String str3) {
        this.mSearchKeyWord = str;
        this.mPoiSearchLogId = str2;
        this.mPoiSearchGlobalId = str3;
    }

    @ReactMethod
    public void showSpecPopViewWithFood(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53ca36908172f8e075cbd51d59b4886f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53ca36908172f8e075cbd51d59b4886f");
        } else {
            showSpecPopViewWithFoodV2(readableMap, false);
        }
    }

    @ReactMethod
    public void showSpecPopViewWithFoodV2(final ReadableMap readableMap, final boolean z) {
        Object[] objArr = {readableMap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75c9b5f080bd087e11bd00839f3f17e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75c9b5f080bd087e11bd00839f3f17e0");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.11
                public static ChangeQuickRedirect a;

                /* JADX WARN: Type inference failed for: r10v1 */
                /* JADX WARN: Type inference failed for: r10v11 */
                /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    char c;
                    ?? r10;
                    GoodsSpu goodsSpu;
                    char c2;
                    int i;
                    Object obj;
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "76a5937063f84346ffaa4059ba6d3264", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "76a5937063f84346ffaa4059ba6d3264");
                        return;
                    }
                    final c currentDelegate = WMRNShoppingCartManager.this.getCurrentDelegate();
                    final b.InterfaceC0826b interfaceC0826b = new b.InterfaceC0826b() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.11.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.InterfaceC0826b
                        public final View a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "056588a565eb0368008449def880f38b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "056588a565eb0368008449def880f38b") : currentDelegate.d().o();
                        }
                    };
                    if (currentDelegate == null) {
                        return;
                    }
                    final GoodsSpu b = a.b(readableMap);
                    try {
                        b.logData = new JSONObject(new JSONObject(b.mpTransparentData).getString("log_data"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String str2 = "";
                    if (WMRNShoppingCartManager.this.from == 1) {
                        final Activity currentActivity = WMRNShoppingCartManager.this.getCurrentActivity();
                        final Poi poi = currentDelegate.b().g;
                        final String str3 = WMRNShoppingCartManager.this.mSearchKeyWord;
                        final String str4 = WMRNShoppingCartManager.this.mPoiSearchLogId;
                        final String str5 = WMRNShoppingCartManager.this.mPoiSearchGlobalId;
                        boolean z2 = z;
                        Object[] objArr3 = {currentActivity, b, interfaceC0826b, poi, str3, str4, str5, 1, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.skuchoose.b.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "6c5acaf302f6c37a7153725ce42df2ef", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "6c5acaf302f6c37a7153725ce42df2ef");
                            c = 2;
                        } else {
                            c = 2;
                            com.sankuai.waimai.business.restaurant.base.skuchoose.b.a(currentActivity, b, poi, z2, new b.a() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.b.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                                public final void a(FoodMultiSpuResponse foodMultiSpuResponse) {
                                    Object[] objArr4 = {foodMultiSpuResponse};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "b0096afec30fa31266a4bd1cd2e9333b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "b0096afec30fa31266a4bd1cd2e9333b");
                                    } else {
                                        b.a(currentActivity, b, interfaceC0826b, poi, str3, str4, str5, r8, false);
                                    }
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                                public final void a(String str6) {
                                    Object[] objArr4 = {str6};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "127ac80cbcfe47be6b4e1b98f1d71554", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "127ac80cbcfe47be6b4e1b98f1d71554");
                                    } else {
                                        b.a(currentActivity, b, interfaceC0826b, poi, str3, str4, str5, r8, true);
                                    }
                                }

                                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.a
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "927d302fe63cbe9fc7cd37cd4803da8e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "927d302fe63cbe9fc7cd37cd4803da8e");
                                    } else {
                                        b.a(currentActivity, b, interfaceC0826b, poi, str3, str4, str5, r8, b.getFoodMultiSpuResponseNew() != null);
                                    }
                                }
                            });
                        }
                        str = "c_1b9anm4";
                        goodsSpu = b;
                        r10 = 1;
                        c2 = 3;
                        i = 4;
                        obj = null;
                    } else {
                        c = 2;
                        r10 = 1;
                        if (WMRNShoppingCartManager.this.from != 3) {
                            goodsSpu = b;
                            c2 = 3;
                            i = 4;
                            obj = null;
                            if (WMRNShoppingCartManager.this.from == 2) {
                                str2 = "c_u4fk4kw";
                                com.sankuai.waimai.business.restaurant.base.skuchoose.b.a(WMRNShoppingCartManager.this.getCurrentActivity(), goodsSpu, interfaceC0826b, currentDelegate.b().g, 2, z);
                            }
                        } else {
                            str2 = "c_5y4tc0m";
                            c2 = 3;
                            i = 4;
                            obj = null;
                            goodsSpu = b;
                            com.sankuai.waimai.business.restaurant.base.skuchoose.b.a(WMRNShoppingCartManager.this.getCurrentActivity(), b, interfaceC0826b, currentDelegate.b().g, 3, z);
                        }
                        str = str2;
                    }
                    g b2 = currentDelegate.b();
                    Activity currentActivity2 = WMRNShoppingCartManager.this.getCurrentActivity();
                    Object[] objArr4 = new Object[i];
                    objArr4[0] = currentActivity2;
                    objArr4[r10] = str;
                    objArr4[c] = goodsSpu;
                    objArr4[c2] = b2;
                    ChangeQuickRedirect changeQuickRedirect5 = l.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "e5c0d5139d17570803640e04e43ec1ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, obj, changeQuickRedirect5, r10, "e5c0d5139d17570803640e04e43ec1ca");
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("poi_id", b2.f());
                        hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
                        hashMap.put("brand_id", Long.valueOf(b2.A()));
                        try {
                            Map<String, Object> javaMap = MachProJsonUtil.a(goodsSpu.logData.toString()).getJavaMap();
                            if (javaMap != null) {
                                hashMap.putAll(javaMap);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        JudasManualManager.a a2 = JudasManualManager.a("b_JLdQv").a(str);
                        a2.b = AppUtil.generatePageInfoKey(currentActivity2);
                        a2.b(hashMap).a();
                    }
                    if (!com.sankuai.waimai.business.restaurant.poicontainer.helper.e.a(goodsSpu) || b2 == null) {
                        return;
                    }
                    JudasManualManager.a a3 = JudasManualManager.a("b_waimai_50ygv2aw_mc").a(str);
                    a3.b = str + WMRNShoppingCartManager.this.getName();
                    a3.a("poi_id", b2.f()).a(KernelConfig.KEY_CONTAINER_TYPE, b2.s()).a("spu_id", goodsSpu.id).a("spu_type", goodsSpu.spuType).a();
                }
            });
        }
    }

    @ReactMethod
    public void showSoldOutGuide(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e925f766457e1216f2dfb57cf4054c2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e925f766457e1216f2dfb57cf4054c2f");
        } else if (readableMap != null) {
            final GoodsSpu b = a.b(readableMap);
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9927349d54d6c8b4b92271712558a43e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9927349d54d6c8b4b92271712558a43e");
                        return;
                    }
                    c currentDelegate = WMRNShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.base.soldoutguide.a.a(WMRNShoppingCartManager.this.getCurrentActivity(), b, currentDelegate.b().g, WMRNShoppingCartManager.this.from);
                }
            });
        }
    }

    @ReactMethod
    public void showNotInSaleTimeWithFood(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2cc6758a991d376d728e5b0b847ef04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2cc6758a991d376d728e5b0b847ef04");
            return;
        }
        List<GoodsRemind> list = a.b(readableMap).getmRemindList();
        if (list == null || list.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getCurrentActivity());
        if (list.size() > 1) {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(getCurrentActivity());
            textView.setHeight(com.sankuai.waimai.foundation.utils.g.a(getCurrentActivity(), 30.0f));
            linearLayout.addView(textView);
            for (int i = 0; i < list.size(); i++) {
                View inflate = LayoutInflater.from(getCurrentActivity()).inflate(R.layout.wm_restaurant_sold_status_mul_layout, (ViewGroup) null);
                ((LinearLayout) inflate.findViewById(R.id.ll_singleline)).setVisibility(8);
                ((TextView) inflate.findViewById(R.id.multiline_takeout_sold_status_title)).setText(list.get(i).getTitle());
                ((TextView) inflate.findViewById(R.id.multiline_takeout_sold_status_content)).setText(list.get(i).getContent());
                linearLayout.addView(inflate);
            }
        } else {
            linearLayout = (LinearLayout) LayoutInflater.from(getCurrentActivity()).inflate(R.layout.wm_restaurant_sold_status_mul_layout, (ViewGroup) null);
            ((LinearLayout) linearLayout.findViewById(R.id.ll_multiline)).setVisibility(8);
            ((TextView) linearLayout.findViewById(R.id.singleline_takeout_sold_status_title)).setText(list.get(0).getTitle());
            ((TextView) linearLayout.findViewById(R.id.singleline_takeout_sold_status_content)).setText(list.get(0).getContent());
        }
        new CustomDialog.a(getCurrentActivity()).a(linearLayout).b(getCurrentActivity().getString(R.string.wm_restaurant_i_know), (DialogInterface.OnClickListener) null).a().show();
    }

    @ReactMethod
    public void orderedCount(final String str, String str2, final Callback callback) {
        Object[] objArr = {str, str2, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97b8152354821c0fe1c0b4acccfdddee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97b8152354821c0fe1c0b4acccfdddee");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "014d59bfc60854759c6056b40ced588b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "014d59bfc60854759c6056b40ced588b");
                        return;
                    }
                    c currentDelegate = WMRNShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    try {
                        callback.invoke(Integer.valueOf(k.a().n(currentDelegate.b().f()).a(Long.parseLong(str))));
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void totalOrderedCount(final String str, final Callback callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f2db3300684b06289ed5de97e9a68ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f2db3300684b06289ed5de97e9a68ed");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b92df88e5a8d7b4afb3f5937eb59c701", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b92df88e5a8d7b4afb3f5937eb59c701");
                    } else if (WMRNShoppingCartManager.this.getCurrentDelegate() == null) {
                    } else {
                        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(com.sankuai.waimai.business.restaurant.base.util.c.a(str));
                        callback.invoke(Integer.valueOf(n == null ? 0 : n.e()));
                    }
                }
            });
        }
    }

    @ReactMethod
    public void pushToDetailPage(final ReadableMap readableMap) {
        final c currentDelegate;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4c22b901a8a67bc25baa9a4adb09a3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4c22b901a8a67bc25baa9a4adb09a3a");
        } else if (readableMap == null || (currentDelegate = getCurrentDelegate()) == null) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba7316ea104575e7cc3d29ff16af1dc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba7316ea104575e7cc3d29ff16af1dc2");
                        return;
                    }
                    JSONObject a2 = a.a(readableMap.getMap("food"));
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(a2);
                    g b = currentDelegate.b();
                    if (readableMap.hasKey("extra")) {
                        b.m = com.sankuai.waimai.restaurant.shopcart.utils.c.a(readableMap.getString("extra"));
                    }
                    GoodDetailActivity.a(currentDelegate.bB_(), goodsSpu, b, "");
                }
            });
        }
    }

    @ReactMethod
    public void notifyShopCartView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "467e3c9a30b32f9e844235de424a8173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "467e3c9a30b32f9e844235de424a8173");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "99285b542d70bbe0ab0e29ae6e607e2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "99285b542d70bbe0ab0e29ae6e607e2c");
                        return;
                    }
                    c currentDelegate = WMRNShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    currentDelegate.d().k.setVisibility(0);
                }
            });
        }
    }

    @ReactMethod
    public void hiddenShopCart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f5fc85e839e291f6271c31dd701a0ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f5fc85e839e291f6271c31dd701a0ad");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "893ea6c1636952d77165e072b28ead12", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "893ea6c1636952d77165e072b28ead12");
                        return;
                    }
                    c currentDelegate = WMRNShoppingCartManager.this.getCurrentDelegate();
                    if (currentDelegate == null) {
                        return;
                    }
                    currentDelegate.d().k.setVisibility(4);
                }
            });
        }
    }

    @ReactMethod
    public void increaseByRecommend(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e441e959596d2cafd8584c151b660398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e441e959596d2cafd8584c151b660398");
            return;
        }
        final c currentDelegate = getCurrentDelegate();
        if (currentDelegate != null) {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7529067bad16847e7105b0167d49c6a3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7529067bad16847e7105b0167d49c6a3");
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.goodsdetail.widget.b bVar = new com.sankuai.waimai.business.restaurant.goodsdetail.widget.b(currentDelegate.b(), currentDelegate.bB_(), currentDelegate.d());
                    RecommendPackage.a aVar = new RecommendPackage.a();
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    aVar.a(jSONObject);
                    bVar.a(aVar.i);
                }
            });
        }
    }

    @ReactMethod
    public void increaseMultiAttrFood(String str, double d, double d2, boolean z, ReadableMap readableMap, final Promise promise) {
        final c currentDelegate;
        Object[] objArr = {str, Double.valueOf(d), Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : (byte) 0), readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34ecb50d814f25e40d30accb5018e029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34ecb50d814f25e40d30accb5018e029");
            return;
        }
        List<GoodsSpuAttrs> goodsSpuList = GoodsSpuAttrs.getGoodsSpuList(str);
        if (goodsSpuList == null || (currentDelegate = getCurrentDelegate()) == null) {
            return;
        }
        final String f = currentDelegate.b().f();
        final com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(f);
        if (readableMap.hasKey("show_health_food")) {
            int i = readableMap.getInt("show_health_food");
            if (n != null) {
                n.u = i;
            }
        }
        if (z) {
            k.a().a(f);
        }
        final boolean z2 = (d == -1.0d || d2 == -1.0d) ? false : true;
        final f fVar = new f(currentDelegate.bB_());
        fVar.a((int) com.sankuai.waimai.machpro.util.b.b((float) d), (int) com.sankuai.waimai.machpro.util.b.b((float) d2));
        com.sankuai.waimai.business.restaurant.base.shopcart.protocol.a.a(currentDelegate.bB_(), f, goodsSpuList, new e() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8abe76460c6c3ba236551ed3d3514198", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8abe76460c6c3ba236551ed3d3514198");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c7adeed334153db0e65d1171ac4c1e74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c7adeed334153db0e65d1171ac4c1e74");
                    return;
                }
                if (z2) {
                    currentDelegate.d().a(fVar);
                }
                k.a().b(f);
                k.a().e(f);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", 0);
                createMap.putString("msg", "success");
                promise.resolve(createMap);
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "75adc32e78d613ee13694286d98cb244", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "75adc32e78d613ee13694286d98cb244");
                    return;
                }
                n.u = -1;
                promise.reject("1", "error", aVar);
            }
        });
    }

    @ReactMethod
    public void decreaseMultiAttrFood(String str, ReadableMap readableMap, final Promise promise) {
        final c currentDelegate;
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e4bba5389c998395a62e2998fb3a081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e4bba5389c998395a62e2998fb3a081");
            return;
        }
        GoodsSpuAttrs goodsSpu = GoodsSpuAttrs.getGoodsSpu(str);
        if (goodsSpu == null || (currentDelegate = getCurrentDelegate()) == null) {
            return;
        }
        String f = currentDelegate.b().f();
        if (readableMap.hasKey("show_health_food")) {
            int i = readableMap.getInt("show_health_food");
            com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(f);
            if (n != null) {
                n.u = i;
            }
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.protocol.a.a(f, goodsSpu, new e() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "158febc1e302208453aacd2c9defb1aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "158febc1e302208453aacd2c9defb1aa");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6458275b42f3346b45f862dd0169f2b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6458275b42f3346b45f862dd0169f2b6");
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", 0);
                createMap.putString("msg", "success");
                promise.resolve(createMap);
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb3ae1daccfee3193376c679d243b6f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb3ae1daccfee3193376c679d243b6f5");
                    return;
                }
                promise.reject("1", "error", aVar);
                if (!TextUtils.isEmpty(aVar.getMessage())) {
                    ae.a(currentDelegate.bB_(), aVar.getMessage());
                }
                i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("delete_food").c(aVar.getMessage()).b());
            }
        });
    }

    @ReactMethod
    public void orderedMultiAttrFoodCount(String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b9cd5cd51cbb8c548d27491799108cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b9cd5cd51cbb8c548d27491799108cb");
            return;
        }
        GoodsSpuAttrs goodsSpu = GoodsSpuAttrs.getGoodsSpu(str);
        if (goodsSpu == null) {
            return;
        }
        final long j = goodsSpu.spu.id;
        final long j2 = goodsSpu.skuId;
        final GoodsAttr[] attrsArray = goodsSpu.getAttrsArray();
        ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "95a72f2b9690b3106a553a4c9d9d3624", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "95a72f2b9690b3106a553a4c9d9d3624");
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    promise.reject("1", "poiId is empty");
                }
                String a2 = com.sankuai.waimai.business.restaurant.base.util.c.a(str2);
                if (TextUtils.isEmpty(str2)) {
                    promise.reject("1", "poiId is not long");
                    return;
                }
                WritableMap shopCartOrderCount = WMRNShoppingCartManager.this.getShopCartOrderCount(a2, j, j2, attrsArray);
                if (shopCartOrderCount != null) {
                    promise.resolve(shopCartOrderCount);
                } else {
                    promise.reject("1", "CartData empty");
                }
            }
        });
    }

    @ReactMethod
    public void handlePressEvent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f038fec6a0e937854950bae11b65d74f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f038fec6a0e937854950bae11b65d74f");
        } else if (getCurrentDelegate() != null) {
            getCurrentDelegate().a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPoiRest(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75ae1db58eeee535b56ef142a6d3e6ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75ae1db58eeee535b56ef142a6d3e6ee");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("poiRest", z);
        if (getReactApplicationContext() != null) {
            a.a(getReactApplicationContext(), "RefreshPoiRest", createMap);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.rn.bridge.d
    public void uponTipShopCartStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80a92c44e902321df5b27384f2e05611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80a92c44e902321df5b27384f2e05611");
        } else {
            sendShopCartMsg(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reCalculatePrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aeb2a5eed40eb9b159f3951df90f7e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aeb2a5eed40eb9b159f3951df90f7e5");
            return;
        }
        final c currentDelegate = getCurrentDelegate();
        if (currentDelegate == null) {
            return;
        }
        k.a().c(currentDelegate.b().f(), new e() { // from class: com.sankuai.waimai.business.restaurant.rn.bridge.WMRNShoppingCartManager.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c069bb3c65b7fc6fef5eba590ba4cabb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c069bb3c65b7fc6fef5eba590ba4cabb");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e96743b51ac0d4322ea91bf50cc47ed8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e96743b51ac0d4322ea91bf50cc47ed8");
                } else {
                    currentDelegate.d().n();
                }
            }
        });
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8f2548e09c0ef6f52dd50275e243fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8f2548e09c0ef6f52dd50275e243fe5");
            return;
        }
        c currentDelegate = getCurrentDelegate();
        if (currentDelegate == null) {
            return;
        }
        currentDelegate.d().g.y = this;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c948d08bffc911ff6da0b0be287be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c948d08bffc911ff6da0b0be287be2");
            return;
        }
        try {
            com.sankuai.waimai.restaurant.shopcart.ui.c cVar = getCurrentDelegate().d().e;
            r rVar = this.mGoodsListVisibilityChangeListener;
            Object[] objArr2 = {rVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.restaurant.shopcart.ui.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "7a3055aa28287f70cdf005ff750cfa4e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "7a3055aa28287f70cdf005ff750cfa4e");
            } else {
                cVar.l.remove(rVar);
            }
            com.sankuai.waimai.business.restaurant.productset.a.a(getCurrentActivity()).a();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public WritableMap getShopCartOrderCount(String str, long j, long j2, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {str, new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab4df7c0fb6bad25d72695798b4db98f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab4df7c0fb6bad25d72695798b4db98f");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(str);
        if (n != null) {
            int e = n.e();
            int a = n.a(j);
            int a2 = n.a(j, j2);
            int a3 = n.a(j, j2, goodsAttrArr);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("countWithTotal", e);
            createMap.putInt("countWithSpu", a);
            createMap.putInt("countWithSku", a2);
            createMap.putInt("countWithAttrs", a3);
            return createMap;
        }
        return null;
    }
}
