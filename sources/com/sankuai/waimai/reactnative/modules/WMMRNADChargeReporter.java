package com.sankuai.waimai.reactnative.modules;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.ad.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMMRNADChargeReporter extends ReactContextBaseJavaModule {
    public static final int ACTION_BANNER_SHOW = 4;
    public static final int ACTION_CLICK = 2;
    public static final int ACTION_ORDER_LIST_SHOW = 9;
    public static final int ACTION_POI_LIST_PRODUCT_SHOW = 8;
    public static final int ACTION_POI_LIST_SHOW = 5;
    public static final int ACTION_SEARCH_FLEXBOX_PT_AD_SHOW = 7;
    public static final int ACTION_SHOW = 3;
    public static final int ACTION_SKYFALL_SHOW = 6;
    private static final String KEY_EVENT_ID = "eventId";
    public static ChangeQuickRedirect changeQuickRedirect;

    @ReactMethod
    public void clearExposeLogs(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMMRNADChargeReporter";
    }

    public WMMRNADChargeReporter(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea4490ab113c8d0d8fc3f445cf1498fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea4490ab113c8d0d8fc3f445cf1498fb");
        }
    }

    @ReactMethod
    public void report(String str, int i, int i2, ReadableMap readableMap) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbc374652d83f9f41aac459aef1a94dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbc374652d83f9f41aac459aef1a94dd");
            return;
        }
        String str2 = null;
        if (readableMap != null && readableMap.hasKey(KEY_EVENT_ID)) {
            str2 = readableMap.getString(KEY_EVENT_ID);
        }
        if (2 == i) {
            com.sankuai.waimai.foundation.core.service.ad.b.a().b(new a.C0946a(i2, str2, str).b);
        } else if (3 == i) {
            com.sankuai.waimai.foundation.core.service.ad.b.a().a(new a.C0946a(i2, str2, str).b);
        }
    }
}
