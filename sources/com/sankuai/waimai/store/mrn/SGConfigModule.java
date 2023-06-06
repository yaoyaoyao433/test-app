package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.j;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGConfigModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNConfiguration";
    }

    public SGConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42a468bc233638b86fdf79405f717d77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42a468bc233638b86fdf79405f717d77");
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6aecc2b4ffa5e95701e049f179154f8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6aecc2b4ffa5e95701e049f179154f8e");
        }
        WritableMap createMap = Arguments.createMap();
        JsonObject g = j.h().g();
        createMap.putString("hornConfig", g != null ? g.toString() : "");
        JsonObject g2 = com.sankuai.waimai.store.config.d.h().g();
        createMap.putString("drugHornConfig", g2 != null ? g2.toString() : "");
        return createMap.toHashMap();
    }

    @ReactMethod
    public void getDrugHornConfigDataString(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dec3b23c7ad672467a554de06b306130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dec3b23c7ad672467a554de06b306130");
            return;
        }
        JsonObject g = com.sankuai.waimai.store.config.d.h().g();
        promise.resolve(g != null ? g.toString() : "{}");
    }
}
