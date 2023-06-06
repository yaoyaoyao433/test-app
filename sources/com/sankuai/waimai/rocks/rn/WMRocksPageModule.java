package com.sankuai.waimai.rocks.rn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRocksPageModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "WMRocksNativeModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public WMRocksPageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b00d5ef009a14c91fd245fa2506248a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b00d5ef009a14c91fd245fa2506248a9");
        }
    }

    @ReactMethod
    public void getNativeParams(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f18f73d1e4ffd85fbbe0599f552e710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f18f73d1e4ffd85fbbe0599f552e710");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("rank_list_id", create32UUID());
            promise.resolve(createMap);
        } catch (Exception e) {
            promise.reject(new IllegalAccessException(e.getMessage()));
        }
    }

    private String create32UUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c14b60b247f8e1d5dbc4773c603c2e2a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c14b60b247f8e1d5dbc4773c603c2e2a") : UUID.randomUUID().toString().replaceAll(CommonConstant.Symbol.MINUS, "");
    }
}
