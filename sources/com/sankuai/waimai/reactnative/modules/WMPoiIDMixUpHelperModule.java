package com.sankuai.waimai.reactnative.modules;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.globalcart.poimix.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMPoiIDMixUpHelperModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMPoiIDMixUpHelper";
    }

    public WMPoiIDMixUpHelperModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d8bbb7fd5e1ee0eeb6b305eb96c30ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d8bbb7fd5e1ee0eeb6b305eb96c30ca");
        }
    }

    @ReactMethod
    public void updatePoiIDIfNeeded(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f701be39fe00440e37ba73b06bcff674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f701be39fe00440e37ba73b06bcff674");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMPoiIDMixUpHelperModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "666fae91895f0bdc3a48ca05d8b8181f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "666fae91895f0bdc3a48ca05d8b8181f");
                        return;
                    }
                    try {
                        String string = readableMap.getString("poiID");
                        String string2 = readableMap.getString("lastID");
                        long a2 = r.a(string, 0L);
                        long a3 = r.a(string2, 0L);
                        if (a2 > 0 && a3 > 0) {
                            string = com.sankuai.waimai.platform.domain.core.poi.b.a(a2);
                            string2 = com.sankuai.waimai.platform.domain.core.poi.b.a(a3);
                        }
                        GlobalCartManager.getInstance().addNewPoiId(string2, string);
                        promise.resolve(Arguments.createMap());
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void reportException(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6cc2b6dad16121bac83fad94f5183b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6cc2b6dad16121bac83fad94f5183b4");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMPoiIDMixUpHelperModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "70cc63b88969d6750354cc6e0151a575", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "70cc63b88969d6750354cc6e0151a575");
                        return;
                    }
                    try {
                        String string = readableMap.getString("poiID");
                        String string2 = readableMap.getString("key");
                        String string3 = readableMap.getString("lastID");
                        long a2 = r.a(string, 0L);
                        long a3 = r.a(string3, 0L);
                        if (a2 > 0 && a3 > 0) {
                            string = com.sankuai.waimai.platform.domain.core.poi.b.a(a2);
                            string3 = com.sankuai.waimai.platform.domain.core.poi.b.a(a3);
                        }
                        long parseLong = Long.parseLong(string3);
                        long parseLong2 = Long.parseLong(string);
                        Object[] objArr3 = {string2, new Long(parseLong), new Long(parseLong2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a.C1052a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "efe453a261ca12d1e93805448a2cea75", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "efe453a261ca12d1e93805448a2cea75");
                        } else {
                            a.C1052a.a(string2, String.valueOf(parseLong), String.valueOf(parseLong2));
                        }
                        promise.resolve(Arguments.createMap());
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }
}
