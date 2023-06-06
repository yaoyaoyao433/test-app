package com.sankuai.waimai.reactnative.modules;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNPOIModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNPOIManager";
    }

    public WMRNPOIModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23528028efdb6e3bc589ba9860992a36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23528028efdb6e3bc589ba9860992a36");
        }
    }

    @ReactMethod
    public void getOrderedGoodCount(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9b43f319d2c90a955b9837dbc8b6852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9b43f319d2c90a955b9837dbc8b6852");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNPOIModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9050f7d7098901f077995e9af4ef9ad4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9050f7d7098901f077995e9af4ef9ad4");
                        return;
                    }
                    try {
                        String str2 = str;
                        long a2 = r.a(str, 0L);
                        if (a2 > 0) {
                            str2 = com.sankuai.waimai.platform.domain.core.poi.b.a(a2);
                        }
                        int orderedNum = GlobalCartManager.getInstance().getOrderedNum(str2);
                        WritableMap createMap = Arguments.createMap();
                        createMap.putInt("count", orderedNum);
                        createMap.putString("poi_id", str);
                        promise.resolve(createMap);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getMultipleOrderedGoodCount(final ReadableArray readableArray, final Promise promise) {
        Object[] objArr = {readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3b12e11e6fae07dc41115dece7a1a82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3b12e11e6fae07dc41115dece7a1a82");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNPOIModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "592416f70a102198bfc57f433c68fc69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "592416f70a102198bfc57f433c68fc69");
                        return;
                    }
                    try {
                        WritableMap createMap = Arguments.createMap();
                        for (int i = 0; i < readableArray.size(); i++) {
                            String string = readableArray.getString(i);
                            long a2 = r.a(string, 0L);
                            if (a2 > 0) {
                                string = com.sankuai.waimai.platform.domain.core.poi.b.a(a2);
                            }
                            createMap.putInt(string, GlobalCartManager.getInstance().getOrderedNum(string));
                        }
                        promise.resolve(createMap);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }
}
