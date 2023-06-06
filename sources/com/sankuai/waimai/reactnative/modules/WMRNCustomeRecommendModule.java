package com.sankuai.waimai.reactnative.modules;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.settings.PersonalizedSetting;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNCustomeRecommendModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMMRNCustomeRecommendBridge";
    }

    public WMRNCustomeRecommendModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c5fc4007be4306acf62da9b554f9fab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c5fc4007be4306acf62da9b554f9fab");
        }
    }

    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r13v6 */
    @ReactMethod
    public void customRecommendUserSetOptions(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6a596bff8007c99386a5180ee125070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6a596bff8007c99386a5180ee125070");
        } else if (readableMap == null || !readableMap.hasKey("actionType")) {
        } else {
            int i = readableMap.getInt("actionType");
            if (i != 1) {
                if (i == 2) {
                    PersonalizedSetting.a().c();
                    return;
                }
                return;
            }
            int i2 = readableMap.getInt("value");
            PersonalizedSetting a = PersonalizedSetting.a();
            ?? r13 = i2 == 1 ? 1 : 0;
            Object[] objArr2 = {Byte.valueOf((byte) r13)};
            ChangeQuickRedirect changeQuickRedirect3 = PersonalizedSetting.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "221f5781f3bdd8d281022a3cbc97c6e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "221f5781f3bdd8d281022a3cbc97c6e8");
                return;
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "waimai_key_personalized_enabled", (boolean) r13);
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "waimai_key_personalized_disabled_time", r13 != 0 ? 0L : a.d());
        }
    }

    @ReactMethod
    public void getCustomRecommendUserSetting(Promise promise) {
        int i = 1;
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e4d62579f1d871180057105603a958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e4d62579f1d871180057105603a958");
        } else if (promise != null) {
            try {
                WritableMap createMap = Arguments.createMap();
                if (!PersonalizedSetting.a().b()) {
                    i = 2;
                }
                createMap.putInt("value", i);
                promise.resolve(createMap);
            } catch (Exception unused) {
                promise.reject("error", LogMonitor.EXCEPTION_TAG);
            }
        }
    }
}
