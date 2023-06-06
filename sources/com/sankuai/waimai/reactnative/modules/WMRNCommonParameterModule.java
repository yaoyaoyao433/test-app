package com.sankuai.waimai.reactnative.modules;

import android.support.annotation.Keep;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.net.e;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WMRNCommonParameterModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMCommonParameterModule";
    }

    public WMRNCommonParameterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f2a9f31b4327572e10e5129eecee69d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f2a9f31b4327572e10e5129eecee69d");
        }
    }

    @ReactMethod
    public void commonParameter(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17f2e9dbbaa7c24b405c2965c5609f19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17f2e9dbbaa7c24b405c2965c5609f19");
        } else if (promise != null) {
            try {
                Map<String, String> b = e.b();
                if (b != null && !b.isEmpty()) {
                    WritableMap createMap = Arguments.createMap();
                    for (Map.Entry<String, String> entry : b.entrySet()) {
                        createMap.putString(entry.getKey(), entry.getValue());
                    }
                    promise.resolve(createMap);
                    return;
                }
                promise.reject("-1", "getStatsParams exception");
            } catch (Exception e) {
                promise.reject(e);
            }
        }
    }
}
