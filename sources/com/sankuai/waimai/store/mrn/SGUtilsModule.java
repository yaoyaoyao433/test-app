package com.sankuai.waimai.store.mrn;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.f;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.i.poi.PoiDrugService;
import com.sankuai.waimai.store.im.poi.model.ImSendSpuCardEvent;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.search.ui.result.ResultFragment;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.v;
import com.sankuai.xm.im.session.SessionId;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGUtilsModule extends ReactContextBaseJavaModule {
    private static final String REQUEST_TAG = "SGUtilsModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mHasCheckMethod;
    private Method mRequestSignatureMethod;
    private Method mRequestSignatureMethodV4;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFromRestaurantAndDetail(int i) {
        return i == 1 || i == 9 || i == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isImEnable(int i, int i2) {
        return (i == 1 || i == 2 || i2 == 0) ? false : true;
    }

    @ReactMethod
    public void checkVersionUpdate() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNUtils";
    }

    public SGUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25de1549a411e9a65797f87ca6e1008a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25de1549a411e9a65797f87ca6e1008a");
            return;
        }
        this.mHasCheckMethod = false;
        prepare();
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4042f3ed75669bc1ebbfb820844e25be", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4042f3ed75669bc1ebbfb820844e25be");
        }
        int b = h.b(getReactApplicationContext(), u.a(getReactApplicationContext()));
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("statusBarHeight", b);
        return createMap.toHashMap();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29f1cc02cf4abeffc44bb52d1633f445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29f1cc02cf4abeffc44bb52d1633f445");
            return;
        }
        super.onCatalystInstanceDestroy();
        com.meituan.android.bus.a.a().b(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onHomePageTabChanged(com.sankuai.waimai.store.poi.list.newp.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "add924089dc379d0073d1d0bde49e697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "add924089dc379d0073d1d0bde49e697");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("type", aVar.a);
        com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getReactApplicationContext(), "onHomePageTabChanged", createMap);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onShotScreenJudasManual(com.sankuai.waimai.store.poi.list.newp.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71d70000d509ec1393d4e43e12b529f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71d70000d509ec1393d4e43e12b529f9");
        } else {
            com.sankuai.waimai.store.mrn.shopcartbridge.a.a(getReactApplicationContext(), "receiveDishesScreenShot", Arguments.createMap());
        }
    }

    @ReactMethod
    public void selectTabByIndex(@Nullable final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1d5524f500ed261f63e9bc6f6ba6b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1d5524f500ed261f63e9bc6f6ba6b68");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eec49553606604ead12ffa245dd1d574", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eec49553606604ead12ffa245dd1d574");
                        return;
                    }
                    try {
                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.event.c(str));
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void selectMedicineHomeTabBarItemAtIndex(@Nullable final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "807165dbf753f0f379c99074ab01e516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "807165dbf753f0f379c99074ab01e516");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1f3104d8c881dccb41b699468723bcf9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1f3104d8c881dccb41b699468723bcf9");
                        return;
                    }
                    try {
                        PoiDrugService poiDrugService = (PoiDrugService) com.sankuai.waimai.router.a.a(PoiDrugService.class, PoiDrugService.KEY_DRUG);
                        if (poiDrugService != null) {
                            poiDrugService.onDrugHomeTabChanged(f.a((Object) str, 0), true);
                            d.a(promise);
                            return;
                        }
                        d.a(promise, null);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void selectMedicineHomeTabBarItemByTabType(@Nullable final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d898bd69e3ceed2088ea782637862532", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d898bd69e3ceed2088ea782637862532");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4390a0fe3cb9665d58158d4c3dcdcd26", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4390a0fe3cb9665d58158d4c3dcdcd26");
                        return;
                    }
                    try {
                        PoiDrugService poiDrugService = (PoiDrugService) com.sankuai.waimai.router.a.a(PoiDrugService.class, PoiDrugService.KEY_DRUG);
                        if (poiDrugService != null) {
                            poiDrugService.onDrugHomeTabChanged(f.a((Object) str, 0), false);
                            d.a(promise);
                            return;
                        }
                        d.a(promise, null);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void shareRNView(String str, String str2, Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5325a758a4566e81398967e8a79316d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5325a758a4566e81398967e8a79316d6");
        } else {
            shareRNViewToWXCircle(str, str2, promise);
        }
    }

    @ReactMethod
    public void setSoftInputMode(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ef0c72cb6591f4884dbb1885a4c55d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ef0c72cb6591f4884dbb1885a4c55d3");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Window window;
                    char c;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "be6c6807f5dbdaeda370d5f98e1e6855", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "be6c6807f5dbdaeda370d5f98e1e6855");
                    } else if (SGUtilsModule.this.getCurrentActivity() == null || (window = SGUtilsModule.this.getCurrentActivity().getWindow()) == null || t.a(str)) {
                    } else {
                        String str2 = str;
                        int hashCode = str2.hashCode();
                        if (hashCode == 830576931) {
                            if (str2.equals("adjustResize")) {
                                c = 1;
                            }
                            c = 65535;
                        } else if (hashCode != 1010202942) {
                            if (hashCode == 2003411598 && str2.equals("adjustPan")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals("adjustNothing")) {
                                c = 2;
                            }
                            c = 65535;
                        }
                        switch (c) {
                            case 0:
                                window.setSoftInputMode(32);
                                return;
                            case 1:
                                window.setSoftInputMode(16);
                                return;
                            case 2:
                                window.setSoftInputMode(48);
                                return;
                            default:
                                window.setSoftInputMode(0);
                                return;
                        }
                    }
                }
            }, "");
        }
    }

    private void shareRNViewToWXCircle(String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "815f5d74eee34bae2a3dfaf9c6f91c6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "815f5d74eee34bae2a3dfaf9c6f91c6d");
            return;
        }
        final Bitmap createBitmapByViewId = createBitmapByViewId(str);
        if (createBitmapByViewId == null) {
            return;
        }
        al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.15
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4cf308be1160815184cfb804004ae78a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4cf308be1160815184cfb804004ae78a");
                    return;
                }
                Activity currentActivity = SGUtilsModule.this.getCurrentActivity();
                if (com.sankuai.waimai.store.util.b.a(currentActivity)) {
                    return;
                }
                Bitmap bitmap = createBitmapByViewId;
                final com.sankuai.waimai.store.i.share.b bVar = new com.sankuai.waimai.store.i.share.b() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.15.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.i.share.b
                    public final void a(int i, int i2) {
                        Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ebe66095c0e1515e0cc44f274b7b1857", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ebe66095c0e1515e0cc44f274b7b1857");
                            return;
                        }
                        Activity currentActivity2 = SGUtilsModule.this.getCurrentActivity();
                        if (com.sankuai.waimai.store.util.b.a(currentActivity2)) {
                            return;
                        }
                        if (i2 == 1) {
                            d.a(promise);
                            currentActivity2.finish();
                        } else if (i2 == 2) {
                            ae.a(currentActivity2, currentActivity2.getString(R.string.wm_sc_share_fail));
                        }
                    }
                };
                String str3 = str2;
                Object[] objArr3 = {currentActivity, bitmap, 1, 1, bVar, str3};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.manager.share.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "d3a5ad6bef10e2d7884bf0ca697f5617", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "d3a5ad6bef10e2d7884bf0ca697f5617");
                } else if (com.sankuai.waimai.store.manager.share.a.a(currentActivity)) {
                    com.sankuai.waimai.share.b.a(currentActivity, bitmap, 1, 1, new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.store.manager.share.a.4
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
                        public final void a(int i, int i2) {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "d3d5c670988eb1956e92d20035b5d2a3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "d3d5c670988eb1956e92d20035b5d2a3");
                            } else if (bVar != null) {
                                bVar.a(i, i2);
                            }
                        }
                    }, str3);
                }
            }
        }, "");
    }

    @ReactMethod
    public void orderPayByAnother(String str, String str2, ReadableMap readableMap, Promise promise) {
        View findShareViewByViewId;
        Object[] objArr = {str, str2, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28dacd2e4e4cc34bf277472a20a808fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28dacd2e4e4cc34bf277472a20a808fb");
        } else if (readableMap == null || (findShareViewByViewId = findShareViewByViewId(str)) == null) {
        } else {
            shareMRNViewWithWXMiniProgramToWeiXinFriends(findShareViewByViewId, str2, readableMap.toHashMap(), ContextCompat.getDrawable(findShareViewByViewId.getContext(), R.drawable.wm_sc_mrn_order_share_bg), promise);
        }
    }

    @ReactMethod
    public void shareAPP() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9ad2f3a8d3ede14442a373ba56ed8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9ad2f3a8d3ede14442a373ba56ed8b0");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || reactApplicationContext.getCurrentActivity() == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", reactApplicationContext.getString(R.string.wm_sc_setting_share_messages));
        reactApplicationContext.getCurrentActivity().startActivity(Intent.createChooser(intent, reactApplicationContext.getString(R.string.wm_sc_setting_share_select)));
    }

    @ReactMethod
    public void getWMApiHost(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66b4a22ba52e9eb32df647f4b6d53954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66b4a22ba52e9eb32df647f4b6d53954");
            return;
        }
        try {
            promise.resolve(com.sankuai.waimai.platform.net.c.a().e());
        } catch (Exception e) {
            promise.reject("", "");
            com.dianping.judas.util.a.a(e);
        }
    }

    @ReactMethod
    public void couponStatusChanged(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95663e3ff4f147ccfd950117a1bc4efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95663e3ff4f147ccfd950117a1bc4efa");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "888029fcb3d9bd129d8334113fc754d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "888029fcb3d9bd129d8334113fc754d2");
                        return;
                    }
                    try {
                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poilist.event.b(str, str2));
                        d.a(promise);
                    } catch (Exception e) {
                        promise.reject("", "");
                        com.dianping.judas.util.a.a(e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void multipleCouponsStatusChanged(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5f82d60a62183d8c7281a5a59a5dc27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5f82d60a62183d8c7281a5a59a5dc27");
        } else if (promise == null) {
        } else {
            if (readableMap == null) {
                d.a(promise, new Exception("multipleCouponsStatusChanged param is Empty"));
            } else {
                al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.17
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "edbe8fb85e41cc254de409b48b5991fa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "edbe8fb85e41cc254de409b48b5991fa");
                            return;
                        }
                        try {
                            HashMap<String, Object> hashMap = readableMap.toHashMap();
                            if (hashMap != null) {
                                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poilist.event.a(hashMap));
                                d.a(promise);
                                return;
                            }
                            d.a(promise, new Exception("multipleCouponsStatusChanged data error"));
                        } catch (Exception e) {
                            d.a(promise, e);
                            com.dianping.judas.util.a.a(e);
                        }
                    }
                }, "");
            }
        }
    }

    @ReactMethod
    public void showNativeActionSheet(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a5a23748bbe1254d005e0901c5a40f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a5a23748bbe1254d005e0901c5a40f9");
        } else if (readableMap == null) {
            d.a(promise, new Exception("showNativeActionSheet param is Empty"));
        } else {
            final com.sankuai.waimai.store.mrn.shopcartbridge.event.b bVar = new com.sankuai.waimai.store.mrn.shopcartbridge.event.b();
            bVar.a = readableMap.getString("action");
            bVar.b = readableMap.getString("title");
            ReadableArray array = readableMap.getArray("options");
            bVar.c = array == null ? null : array.toArrayList();
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.18
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a42d9ecf13676526a718e9a5db1a6289", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a42d9ecf13676526a718e9a5db1a6289");
                        return;
                    }
                    com.meituan.android.bus.a.a().c(bVar);
                    d.a(promise);
                }
            }, "");
        }
    }

    private void shareMRNViewWithWXMiniProgramToWeiXinFriends(View view, final String str, final Map<String, Object> map, Drawable drawable, final Promise promise) {
        Object[] objArr = {view, str, map, drawable, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cd608bdb54a973b0d41472d9599bbca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cd608bdb54a973b0d41472d9599bbca");
        } else if (map == null) {
        } else {
            Object[] objArr2 = {view, drawable};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.manager.share.b.a;
            final String a2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "82f361ec4ad7a95b38b481ca936611ae", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "82f361ec4ad7a95b38b481ca936611ae") : com.sankuai.waimai.store.manager.share.b.a(view, 0, drawable);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.19
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "37024067cf76e0a8dfa71cda8dbd221e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "37024067cf76e0a8dfa71cda8dbd221e");
                        return;
                    }
                    String valueOf = String.valueOf(map.get("share_card_title"));
                    String valueOf2 = String.valueOf(map.get("share_card_url"));
                    String valueOf3 = String.valueOf(map.get("program_id"));
                    SCShareTip sCShareTip = new SCShareTip();
                    sCShareTip.setContent(valueOf);
                    sCShareTip.setIcon(a2);
                    sCShareTip.setWeixinUrl(valueOf2);
                    sCShareTip.setTitle(valueOf);
                    sCShareTip.setUrl("test");
                    sCShareTip.setCid(str);
                    if (!t.a(valueOf3)) {
                        sCShareTip.setMiniProgramId(valueOf3);
                    }
                    if (k.b()) {
                        sCShareTip.setMiniprogramType(0);
                    } else {
                        sCShareTip.setMiniprogramType(2);
                    }
                    Activity currentActivity = SGUtilsModule.this.getCurrentActivity();
                    final com.sankuai.waimai.store.i.share.b bVar = new com.sankuai.waimai.store.i.share.b() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.19.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.i.share.b
                        public final void a(int i, int i2) {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "f517b622f956bc4a964b1a73b26abb42", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "f517b622f956bc4a964b1a73b26abb42");
                                return;
                            }
                            Activity currentActivity2 = SGUtilsModule.this.getCurrentActivity();
                            if (com.sankuai.waimai.store.util.b.a(currentActivity2)) {
                                return;
                            }
                            if (i2 == 1) {
                                d.a(promise);
                            } else if (i2 == 2) {
                                ae.a(currentActivity2, currentActivity2.getString(R.string.wm_sc_share_fail));
                            }
                        }
                    };
                    Object[] objArr4 = {currentActivity, sCShareTip, 2, bVar, null};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.manager.share.a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "753c8c45d1cd2adc69f1ec6c07760c2f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "753c8c45d1cd2adc69f1ec6c07760c2f");
                    } else if (!com.sankuai.waimai.store.util.b.a(currentActivity) && com.sankuai.waimai.store.manager.share.a.a(currentActivity)) {
                        if (TextUtils.isEmpty(sCShareTip.getCid())) {
                            sCShareTip.setCid(com.sankuai.waimai.store.manager.judas.b.a((Context) currentActivity));
                        }
                        if (TextUtils.isEmpty(sCShareTip.getMiniProgramId())) {
                            String b = v.c ? j.h().b(SCConfigPath.MT_MINI_PROGRAM_ID) : null;
                            if (TextUtils.isEmpty(b)) {
                                b = "gh_3d18695c9521";
                            }
                            sCShareTip.setMiniProgramId(b);
                        }
                        com.sankuai.waimai.share.b.a(currentActivity, sCShareTip, 2, new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.store.manager.share.a.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
                            public final void a(int i, int i2) {
                                Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "6eac702e25fa9b85d5f780463d303625", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "6eac702e25fa9b85d5f780463d303625");
                                } else if (bVar != null) {
                                    bVar.a(i, i2);
                                }
                            }
                        }, (Bundle) null);
                    }
                }
            }, "");
        }
    }

    public static String getScreenShot(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0da0b8a78f16bedd467a0a9be14a5484", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0da0b8a78f16bedd467a0a9be14a5484") : (activity == null || activity.getWindow() == null) ? "" : com.sankuai.waimai.store.manager.share.b.a(activity.getWindow().getDecorView(), u.a(), (h.a((Context) activity) * 4) / 5);
    }

    public static Bitmap getScreenShotImg(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09e95dc4280c204c12bfe85b21b5923d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09e95dc4280c204c12bfe85b21b5923d");
        }
        if (activity != null && activity.getWindow() != null) {
            try {
                return com.sankuai.waimai.store.manager.share.b.a(activity.getWindow().getDecorView(), false, u.a(), (h.a((Context) activity) * 4) / 5);
            } catch (Throwable th) {
                com.dianping.judas.util.a.a(th);
            }
        }
        return null;
    }

    private View findShareViewByViewId(String str) {
        Window window;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3081625034e1852bafaf8565a03764d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3081625034e1852bafaf8565a03764d2");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Activity currentActivity = getCurrentActivity();
        if (com.sankuai.waimai.store.util.b.a(currentActivity) || (window = currentActivity.getWindow()) == null) {
            return null;
        }
        return com.sankuai.waimai.store.mrn.shopcartbridge.a.a(window.getDecorView(), str);
    }

    private Bitmap createBitmapByViewId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6f2ddf4c3f95bb2fc649789f4d6abe8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6f2ddf4c3f95bb2fc649789f4d6abe8");
        }
        View findShareViewByViewId = findShareViewByViewId(str);
        if (findShareViewByViewId == null) {
            return null;
        }
        try {
            return com.sankuai.shangou.stone.util.b.a(findShareViewByViewId, 0, true);
        } catch (OutOfMemoryError e) {
            com.dianping.judas.util.a.a(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0168 A[Catch: Throwable -> 0x01b9, TryCatch #0 {Throwable -> 0x01b9, blocks: (B:6:0x0025, B:8:0x005a, B:23:0x0120, B:26:0x0144, B:32:0x015e, B:34:0x0168, B:36:0x01b5, B:35:0x0193, B:27:0x0149, B:29:0x0151, B:9:0x0062, B:11:0x0093, B:12:0x009b, B:13:0x00cd, B:15:0x00d3, B:17:0x0105, B:19:0x010e, B:21:0x0118, B:22:0x011c), top: B:41:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0193 A[Catch: Throwable -> 0x01b9, TryCatch #0 {Throwable -> 0x01b9, blocks: (B:6:0x0025, B:8:0x005a, B:23:0x0120, B:26:0x0144, B:32:0x015e, B:34:0x0168, B:36:0x01b5, B:35:0x0193, B:27:0x0149, B:29:0x0151, B:9:0x0062, B:11:0x0093, B:12:0x009b, B:13:0x00cd, B:15:0x00d3, B:17:0x0105, B:19:0x010e, B:21:0x0118, B:22:0x011c), top: B:41:0x0025 }] */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addRequestSignature(com.facebook.react.bridge.ReadableMap r24, com.facebook.react.bridge.Promise r25) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mrn.SGUtilsModule.addRequestSignature(com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise):void");
    }

    private boolean prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "383a110b5cdb709028befcc90816ee46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "383a110b5cdb709028befcc90816ee46")).booleanValue();
        }
        if (!this.mHasCheckMethod) {
            try {
                try {
                    this.mRequestSignatureMethodV4 = Class.forName("com.meituan.android.common.mtguard.NBridge").getDeclaredMethod("requestSignatureForWebViewV4", String.class, String.class, String.class, String.class, String.class, byte[].class);
                } catch (Exception unused) {
                    this.mRequestSignatureMethod = Class.forName("com.meituan.android.common.mtguard.MTGuard").getDeclaredMethod("requestSignatureForWebView", String.class, String.class, String.class, String.class, String.class, byte[].class);
                } catch (Throwable th) {
                    this.mHasCheckMethod = true;
                    throw th;
                }
            } catch (Throwable unused2) {
            }
            this.mHasCheckMethod = true;
        }
        return (this.mRequestSignatureMethodV4 == null && this.mRequestSignatureMethod == null) ? false : true;
    }

    @ReactMethod
    public void getStringSize(final ReadableArray readableArray, final Promise promise) {
        Object[] objArr = {readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac8501474f4a385ca65d1557a64972ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac8501474f4a385ca65d1557a64972ae");
        } else if (readableArray != null && promise != null && readableArray.size() > 0) {
            al.a(new al.b<WritableArray>() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(WritableArray writableArray) {
                    WritableArray writableArray2 = writableArray;
                    Object[] objArr2 = {writableArray2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5528b54fe959eac5110e45ee15f46b56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5528b54fe959eac5110e45ee15f46b56");
                    } else if (writableArray2 != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("code", 0);
                        createMap.putString("message", "success");
                        createMap.putArray("data", writableArray2);
                        promise.resolve(createMap);
                    } else {
                        promise.reject(new RuntimeException("wrong result!"));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                public WritableArray a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "00ae28f51d1312394db802895b03fe98", RobustBitConfig.DEFAULT_VALUE)) {
                        return (WritableArray) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "00ae28f51d1312394db802895b03fe98");
                    }
                    try {
                        WritableArray createArray = Arguments.createArray();
                        for (int i = 0; i < readableArray.size(); i++) {
                            ReadableMap map = readableArray.getMap(i);
                            int i2 = map.hasKey("width") ? map.getInt("width") : 0;
                            int i3 = map.hasKey("font_size") ? map.getInt("font_size") : 0;
                            String string = map.hasKey("text") ? map.getString("text") : "";
                            if (t.a(string)) {
                                string = "";
                            }
                            createArray.pushMap(SGUtilsModule.this.getTextHeightAndLines(string, i2, i3, map.hasKey(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD) ? map.getBoolean(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD) : false, map.hasKey("line_height") ? map.getInt("line_height") : 0, map.hasKey("font_family") ? map.getString("font_family") : ""));
                        }
                        return createArray;
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                        return null;
                    }
                }
            }, REQUEST_TAG);
        } else if (promise != null) {
            promise.reject(new RuntimeException("error param!"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getTextHeightAndLines(@NonNull String str, int i, int i2, boolean z, int i3, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i3), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6bc27e5ec059abc4938fcf43eb543ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6bc27e5ec059abc4938fcf43eb543ff");
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(h.a(getReactApplicationContext(), i2));
        try {
            textPaint.setTypeface(Typeface.create(str2, z ? 1 : 0));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        int a2 = h.a(getReactApplicationContext(), i3);
        int a3 = h.a(getReactApplicationContext(), i);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, a3 < 0 ? 0 : a3, Layout.Alignment.ALIGN_NORMAL, 1.0f, a2, false);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        int lineCount = staticLayout.getLineCount();
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int b = h.b(getReactApplicationContext(), rect.width());
        int min = Math.min(i, b);
        int b2 = h.b(getReactApplicationContext(), fontMetrics.bottom - fontMetrics.top);
        WritableMap createMap = Arguments.createMap();
        try {
            createMap.putInt("width", min);
            createMap.putInt("height", b2 * lineCount);
            createMap.putInt("lines", lineCount);
            createMap.putInt("total_width", b);
        } catch (Exception e2) {
            com.sankuai.waimai.store.base.log.a.a(e2);
        }
        return createMap;
    }

    @ReactMethod
    public void setHomeTabMsgCount(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2ffe33a61c83169a6b49f686e4d047f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2ffe33a61c83169a6b49f686e4d047f");
        } else if (i == 1) {
        } else {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.event.j(i, i2));
        }
    }

    @ReactMethod
    public void storeSPData(String str, String str2, Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9634b61689f0620a773e083bb00017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9634b61689f0620a773e083bb00017");
            return;
        }
        try {
            ab.b().a(getReactApplicationContext(), str, str2);
            d.a(promise);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void getSPData(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c163f55d95b389f2df857d15f728bd47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c163f55d95b389f2df857d15f728bd47");
            return;
        }
        try {
            String b = ab.b().b(getReactApplicationContext(), str, "");
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", 0);
            createMap.putString("data", b);
            createMap.putString("message", "success");
            promise.resolve(createMap);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void requestReceivedcoupons(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e9f8d20255597dea6e89c5f2845db58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e9f8d20255597dea6e89c5f2845db58");
        } else if (readableMap != null && promise != null) {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.newp.block.rxevent.a(getCurrentActivity(), readableMap.toHashMap()));
            d.a(promise);
        } else if (promise != null) {
            promise.reject(new RuntimeException("error param!"));
        }
    }

    @ReactMethod
    public void getSearchSuggestGlobalID(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a99ea4b89e2a684d2a27c2051572829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a99ea4b89e2a684d2a27c2051572829");
        } else if (promise == null) {
            if (promise != null) {
                promise.reject(new RuntimeException("error param!"));
            }
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", 0);
            createMap.putString("message", "success");
            createMap.putString("data", ResultFragment.i());
            promise.resolve(createMap);
            d.a(promise);
        }
    }

    @ReactMethod
    public void jumpToGlobalCart(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01161642ae604321d7d886dc94ffc3b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01161642ae604321d7d886dc94ffc3b1");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (!com.sankuai.waimai.store.util.b.a(currentActivity)) {
            com.sankuai.waimai.store.manager.user.a.a(currentActivity, new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3d8506730c28b02607d4615c650b2af1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3d8506730c28b02607d4615c650b2af1");
                        return;
                    }
                    g.a(currentActivity);
                    d.a(promise);
                }
            });
        } else if (promise != null) {
            promise.reject(new RuntimeException("Context is dead!"));
        }
    }

    @ReactMethod
    public void jumpToGlobalSearch(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75dbc2d2812764862e57b48e8c92c287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75dbc2d2812764862e57b48e8c92c287");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (com.sankuai.waimai.store.util.b.a(currentActivity)) {
            if (promise != null) {
                promise.reject(new RuntimeException("Context is dead!"));
            }
        } else if (readableMap == null) {
            if (promise != null) {
                promise.reject(new IllegalArgumentException("Parameter is null!"));
            }
        } else {
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            if (hashMap.isEmpty()) {
                if (promise != null) {
                    promise.reject(new IllegalArgumentException("Parameter is null!"));
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && value != null) {
                        if (value instanceof String) {
                            bundle.putString(key, (String) value);
                        } else if (value instanceof Integer) {
                            bundle.putInt(key, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(key, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(key, ((Float) value).floatValue());
                        } else if (value instanceof Double) {
                            bundle.putDouble(key, ((Double) value).doubleValue());
                        } else if (value instanceof Boolean) {
                            bundle.putBoolean(key, ((Boolean) value).booleanValue());
                        }
                    }
                }
            }
            com.sankuai.waimai.store.router.d.a(currentActivity, j.h().a(SCConfigPath.SEARCH_DOWNGRADING, false) ? com.sankuai.waimai.store.router.c.i : com.sankuai.waimai.store.router.c.e, bundle);
            d.a(promise);
        }
    }

    @ReactMethod
    public void dispatchBackHomePageSchemeJump(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44e572bbfd5a955cff1cfcb650cebca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44e572bbfd5a955cff1cfcb650cebca2");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            d.a(promise, new Exception("[dispatchBackHomePageSchemeJump] activity is null or finishing"));
        } else if (readableMap != null && readableMap.hasKey("platform_os") && "android".equals(readableMap.getString("platform_os")) && readableMap.hasKey(NetLogConstants.Details.SCHEME)) {
            final String string = readableMap.getString(NetLogConstants.Details.SCHEME);
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "329fbbb60b20a0245aa75d65effb785d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "329fbbb60b20a0245aa75d65effb785d");
                        return;
                    }
                    try {
                        if (TextUtils.isEmpty(string) || SGUtilsModule.isSchemePageValue(com.sankuai.waimai.store.util.b.b(), string)) {
                            if (SGUtilsModule.this.getCurrentActivity() != null) {
                                SGUtilsModule.this.getCurrentActivity().finish();
                            }
                        } else if (SGUtilsModule.this.getCurrentActivity() != null) {
                            com.sankuai.waimai.store.router.d.a().a(SGUtilsModule.this.getCurrentActivity(), string);
                            SGUtilsModule.this.getCurrentActivity().overridePendingTransition(R.anim.wm_common_slide_in_from_left, R.anim.wm_sc_slide_out_to_right);
                            SGUtilsModule.this.getCurrentActivity().finish();
                        }
                        d.a(promise);
                    } catch (Exception e) {
                        promise.reject("", "");
                        com.dianping.judas.util.a.a(e);
                    }
                }
            }, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSchemePageValue(List<Activity> list, @NonNull String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5694d72ad6760c2c6e093328cd0a3290", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5694d72ad6760c2c6e093328cd0a3290")).booleanValue();
        }
        String path = Uri.parse(str).getPath();
        int c = com.sankuai.shangou.stone.util.a.c(list);
        for (int i = 0; i < c; i++) {
            if (TextUtils.equals(readSchemePathFrom((Activity) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i)), path)) {
                return true;
            }
        }
        return false;
    }

    private static String readSchemePathFrom(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d771276a0c4acaba64a078affdb38c6b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d771276a0c4acaba64a078affdb38c6b") : (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) ? "" : activity.getIntent().getData().getPath();
    }

    @ReactMethod
    public void buyNowWithGoods(final ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2145cfd6d3f2df28c375ac479687156a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2145cfd6d3f2df28c375ac479687156a");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            d.a(promise, new Exception("[buyNowWithGoods] activity is null or finishing"));
        } else {
            al.a(new al.b<a>() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(a aVar) {
                    Activity c;
                    final a aVar2 = aVar;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa0cf9dc51c7bf01a3f6d88f404b8b9c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa0cf9dc51c7bf01a3f6d88f404b8b9c");
                        return;
                    }
                    if (SGUtilsModule.this.getCurrentActivity() != null) {
                        c = SGUtilsModule.this.getCurrentActivity();
                    } else {
                        c = com.sankuai.waimai.foundation.utils.activity.a.a().c();
                    }
                    if (aVar2 == null || aVar2.a == null || com.sankuai.shangou.stone.util.a.b(aVar2.b)) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("preview_order_callback_info", aVar2.a.H());
                        if (!t.a(aVar2.c)) {
                            jSONObject.put("act_page_code", aVar2.c);
                        }
                        c.a aVar3 = new c.a() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.5.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.shopping.cart.c.a
                            public final void a(JSONObject jSONObject2, JSONObject jSONObject3) {
                                Object[] objArr3 = {jSONObject2, jSONObject3};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8e730722f1b277557cf99d0d7f383d09", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8e730722f1b277557cf99d0d7f383d09");
                                } else {
                                    com.sankuai.waimai.store.shopping.cart.d.a().a("order_business_channel", jSONObject2);
                                }
                            }

                            @Override // com.sankuai.waimai.store.shopping.cart.c.a
                            public final void a(d.a aVar4) {
                                Object[] objArr3 = {aVar4};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4fff88b7d4d0b571136cbcd1dc2994df", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4fff88b7d4d0b571136cbcd1dc2994df");
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
                        a2.f = SGUtilsModule.class.getSimpleName();
                        a2.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
                        a2.j = false;
                        a2.g = "from_sc_restaurant";
                        a2.i = 3;
                        a2.n = aVar2.b;
                        a2.m = a(aVar2, aVar3);
                        com.sankuai.waimai.store.manager.order.b.a(aVar4.b(), aVar2.a.t());
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                }

                private String a(@NonNull a aVar, c.a aVar2) {
                    Object[] objArr2 = {aVar, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b2b22766a581b5c97b5c9794a0d86ba7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b2b22766a581b5c97b5c9794a0d86ba7");
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject H = aVar.a.H();
                        aVar2.a(H, jSONObject);
                        if (aVar.d != null && !aVar.d.isEmpty()) {
                            for (Map.Entry<String, Object> entry : aVar.d.entrySet()) {
                                if (entry != null && !t.a(entry.getKey())) {
                                    if (H == null) {
                                        H = new JSONObject();
                                    }
                                    H.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        jSONObject.put("preview_order_callback_info", H);
                        if (!t.a(aVar.c)) {
                            jSONObject.put("act_page_code", aVar.c);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                    return jSONObject.toString();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[Catch: Exception -> 0x0114, TryCatch #0 {Exception -> 0x0114, blocks: (B:9:0x0024, B:11:0x0031, B:13:0x003d, B:15:0x004a, B:16:0x0053, B:18:0x0068, B:23:0x0077, B:25:0x0082, B:27:0x008f, B:29:0x009a, B:30:0x00a4, B:32:0x00b1, B:33:0x00b9, B:35:0x00c7, B:36:0x00cf, B:38:0x00ef, B:40:0x00fa, B:42:0x0109), top: B:47:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x009a A[Catch: Exception -> 0x0114, TryCatch #0 {Exception -> 0x0114, blocks: (B:9:0x0024, B:11:0x0031, B:13:0x003d, B:15:0x004a, B:16:0x0053, B:18:0x0068, B:23:0x0077, B:25:0x0082, B:27:0x008f, B:29:0x009a, B:30:0x00a4, B:32:0x00b1, B:33:0x00b9, B:35:0x00c7, B:36:0x00cf, B:38:0x00ef, B:40:0x00fa, B:42:0x0109), top: B:47:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[Catch: Exception -> 0x0114, TryCatch #0 {Exception -> 0x0114, blocks: (B:9:0x0024, B:11:0x0031, B:13:0x003d, B:15:0x004a, B:16:0x0053, B:18:0x0068, B:23:0x0077, B:25:0x0082, B:27:0x008f, B:29:0x009a, B:30:0x00a4, B:32:0x00b1, B:33:0x00b9, B:35:0x00c7, B:36:0x00cf, B:38:0x00ef, B:40:0x00fa, B:42:0x0109), top: B:47:0x0024 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00c7 A[Catch: Exception -> 0x0114, TryCatch #0 {Exception -> 0x0114, blocks: (B:9:0x0024, B:11:0x0031, B:13:0x003d, B:15:0x004a, B:16:0x0053, B:18:0x0068, B:23:0x0077, B:25:0x0082, B:27:0x008f, B:29:0x009a, B:30:0x00a4, B:32:0x00b1, B:33:0x00b9, B:35:0x00c7, B:36:0x00cf, B:38:0x00ef, B:40:0x00fa, B:42:0x0109), top: B:47:0x0024 }] */
                @Override // com.sankuai.waimai.store.util.al.b
                /* renamed from: b */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.sankuai.waimai.store.mrn.SGUtilsModule.a a() {
                    /*
                        Method dump skipped, instructions count: 281
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mrn.SGUtilsModule.AnonymousClass5.a():com.sankuai.waimai.store.mrn.SGUtilsModule$a");
                }
            }, SGUtilsModule.class.getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public final com.sankuai.waimai.store.platform.domain.manager.poi.a a;
        public final List<WmOrderedFood> b;
        public final String c;
        public final Map<String, Object> d;

        public a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, List<WmOrderedFood> list, String str, Map<String, Object> map) {
            this.a = aVar;
            this.b = list;
            this.c = str;
            this.d = map;
        }
    }

    @ReactMethod
    public void getShopContentMrnTabData(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fea3a626eda13d8691e6943f07f6df51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fea3a626eda13d8691e6943f07f6df51");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        com.sankuai.waimai.store.shopping.cart.d.a().a("type_get_shop_content_mrn_tab_data", jSONObject);
        promise.resolve(i.a(jSONObject.opt("mrn_tab_data")));
    }

    @ReactMethod
    public void scrollPoiToTop(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22efebf5fcada691ea1a8367c1115957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22efebf5fcada691ea1a8367c1115957");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d8e8c51fb854fbe032bc7971c6a0efbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d8e8c51fb854fbe032bc7971c6a0efbf");
                        return;
                    }
                    try {
                        if (com.sankuai.waimai.store.util.b.a(SGUtilsModule.this.getCurrentActivity())) {
                            d.a(promise, new RuntimeException("[商家页锚点]Context is dead!"));
                            return;
                        }
                        com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.event.c(str));
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void onPoiImClick(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee64a4ddc4e4683c9c3e0e2bd2d4a0c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee64a4ddc4e4683c9c3e0e2bd2d4a0c0");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            d.a(promise, new Exception("[onIMClick] activity is null or finishing"));
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d2ea6d3be955ef3d9a8e0c8590efb58", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d2ea6d3be955ef3d9a8e0c8590efb58");
                        return;
                    }
                    try {
                        int i = readableMap.getInt("sourcePage");
                        String string = readableMap.getString("volleyTag");
                        int i2 = readableMap.getInt("dx_source");
                        String string2 = readableMap.getString("poi_id");
                        String string3 = readableMap.getString("spu_id");
                        String string4 = readableMap.getString(Constants.EventConstants.KEY_ORDER_ID);
                        ReadableArray array = readableMap.getArray("phone_list");
                        final ArrayList arrayList = new ArrayList();
                        Iterator<Object> it = array.toArrayList().iterator();
                        while (true) {
                            String str = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (next != null) {
                                str = next.toString();
                            }
                            arrayList.add(str);
                        }
                        ReadableMap map = readableMap.getMap("bottom_poi_im_info");
                        if (SGUtilsModule.this.isImEnable(map.getInt("poi_im_entrance_status"), map.getInt("poi_dx_id"))) {
                            if (SGUtilsModule.this.isFromRestaurantAndDetail(i)) {
                                Bundle bundle = new Bundle();
                                if (i != 1 && i != 9) {
                                    if (i == 2) {
                                        bundle.putString("sg-dx-im-from", "sg-from-Detail");
                                        bundle.putString("sg-msgOriginId", "c_u4fk4kw");
                                    }
                                    com.sankuai.waimai.business.im.api.a.a().a(SGUtilsModule.this.getReactApplicationContext().getCurrentActivity(), (SessionId) null, 1, 0L, Long.valueOf(string2).longValue(), Long.valueOf(string3).longValue(), 10, string, false, bundle);
                                    return;
                                }
                                bundle.putString("sg-dx-im-from", "sg-from-Restaurant");
                                bundle.putString("sg-msgOriginId", "c_waimai_qeknbhm9");
                                com.sankuai.waimai.business.im.api.a.a().a(SGUtilsModule.this.getReactApplicationContext().getCurrentActivity(), (SessionId) null, 1, 0L, Long.valueOf(string2).longValue(), Long.valueOf(string3).longValue(), 10, string, false, bundle);
                                return;
                            }
                            com.sankuai.waimai.business.im.api.a.a().a(SGUtilsModule.this.getReactApplicationContext().getCurrentActivity(), (SessionId) null, i2, Long.valueOf(string4).longValue(), Long.valueOf(string2).longValue(), Long.valueOf(string3).longValue(), 10, string, false);
                            return;
                        }
                        new CustomDialog.a(SGUtilsModule.this.getReactApplicationContext().getCurrentActivity()).b(R.string.wm_st_shop_cart_phone_dialog).b(R.string.cancel, (DialogInterface.OnClickListener) null).a(R.string.wm_st_shop_cart_dial, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.7.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "049fb0f4e029cc9afd9c5212338606ff", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "049fb0f4e029cc9afd9c5212338606ff");
                                } else {
                                    SGUtilsModule.this.makeCall(SGUtilsModule.this.getReactApplicationContext().getCurrentActivity(), arrayList);
                                }
                            }
                        }).b();
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeCall(final Activity activity, final ArrayList<String> arrayList) {
        Object[] objArr = {activity, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e34b02689b6e73200f50d4ac1dc3aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e34b02689b6e73200f50d4ac1dc3aaa");
        } else if (activity != null) {
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                ae.a(activity, (int) R.string.wm_st_shop_cart_none_phones);
            } else {
                new CustomDialog.a(activity).a(R.string.wm_st_shop_cart_dial).a((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.8
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1b3cd616ae8f78cf07fdb90c0d46470c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1b3cd616ae8f78cf07fdb90c0d46470c");
                        } else {
                            z.a(activity, (String) arrayList.get(i));
                        }
                    }
                }).b(R.string.cancel, (DialogInterface.OnClickListener) null).c();
            }
        }
    }

    @ReactMethod
    public void initCouponAnim(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b47f424521758acf7179d845179d7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b47f424521758acf7179d845179d7db");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cfaafe88a9a123473c24381e24afd4ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cfaafe88a9a123473c24381e24afd4ec");
                        return;
                    }
                    try {
                        Activity currentActivity = SGUtilsModule.this.getCurrentActivity();
                        if (currentActivity != null && !currentActivity.isFinishing()) {
                            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.event.b(str2, com.sankuai.waimai.store.mrn.shopcartbridge.a.a(currentActivity.getWindow().getDecorView(), str)));
                        }
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void getShopDataForFood(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b222567803e4eb73bc74820f5ada23d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b222567803e4eb73bc74820f5ada23d");
            return;
        }
        try {
            if (t.a(str)) {
                promise.resolve(null);
                return;
            }
            JSONObject jSONObject = (JSONObject) com.sankuai.waimai.store.manager.data.a.a().a(str, (Class<Object>) JSONObject.class);
            promise.resolve(jSONObject != null ? jSONObject.toString() : null);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }

    @ReactMethod
    public void shopKingkongClick(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "224f3973ca226df763d78e4207dc4b1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "224f3973ca226df763d78e4207dc4b1b");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "459fd0737dc4650a8bdf87b7f96636fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "459fd0737dc4650a8bdf87b7f96636fb");
                        return;
                    }
                    try {
                        if (com.sankuai.waimai.store.util.b.a(SGUtilsModule.this.getCurrentActivity())) {
                            d.a(promise, new RuntimeException("[shopKingkongClick]Context is dead!"));
                            return;
                        }
                        ReadableMap map = readableMap.getMap("navigateItem");
                        String string = readableMap.getString("poiId");
                        JSONObject a2 = com.sankuai.waimai.store.mrn.shopcartbridge.a.a(map);
                        RestMenuResponse.NavigateItem navigateItem = new RestMenuResponse.NavigateItem();
                        if (a2 != null) {
                            navigateItem.parseJson(a2);
                            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.event.a(navigateItem, string));
                        }
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void sendSpuCard(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "432ed8e48b317dfd79849a05059105b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "432ed8e48b317dfd79849a05059105b7");
        } else {
            al.a(new al.b<ReadableMap>() { // from class: com.sankuai.waimai.store.mrn.SGUtilsModule.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ ReadableMap a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab218c7180f63c048629e8c756e22c90", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ReadableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab218c7180f63c048629e8c756e22c90");
                    }
                    if (readableMap != null && readableMap.hasKey("name") && readableMap.hasKey("detail_scheme") && readableMap.hasKey("id")) {
                        return readableMap;
                    }
                    return null;
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(ReadableMap readableMap2) {
                    ReadableMap readableMap3 = readableMap2;
                    Object[] objArr2 = {readableMap3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "888c3138dc06e3b6f10c01b3fb92538f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "888c3138dc06e3b6f10c01b3fb92538f");
                        return;
                    }
                    if (!p.a(readableMap3)) {
                        ImSendSpuCardEvent imSendSpuCardEvent = new ImSendSpuCardEvent();
                        imSendSpuCardEvent.spuInfo = readableMap3;
                        com.meituan.android.bus.a.a().c(imSendSpuCardEvent);
                    }
                    d.a(promise);
                }
            }, SGUtilsModule.class.getSimpleName());
        }
    }
}
