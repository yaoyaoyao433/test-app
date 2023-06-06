package com.sankuai.waimai.reactnative.modules;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.widget.tag.api.d;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNDynamicTagModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNDynamicTagManager";
    }

    public WMRNDynamicTagModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "559262ea17a81eb363b74a87f0b40fd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "559262ea17a81eb363b74a87f0b40fd3");
        }
    }

    @ReactMethod
    public void getDynamicTagWidth(String str, Promise promise) {
        List emptyList;
        int i;
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed330a08f8550a8c5e39dfec8741a685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed330a08f8550a8c5e39dfec8741a685");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        try {
            emptyList = (List) k.a().fromJson(str, new TypeToken<List<d>>() { // from class: com.sankuai.waimai.reactnative.modules.WMRNDynamicTagModule.1
            }.getType());
        } catch (Exception unused) {
            emptyList = Collections.emptyList();
        }
        List<com.sankuai.waimai.platform.widget.tag.model.d> a = com.sankuai.waimai.platform.widget.tag.util.a.a(reactApplicationContext, emptyList);
        int a2 = g.a(reactApplicationContext, 5.0f);
        try {
            i = 0;
            for (com.sankuai.waimai.platform.widget.tag.model.d dVar : a) {
                try {
                    i += dVar.a(reactApplicationContext, Integer.MAX_VALUE)[0] + a2;
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
            i = 0;
        }
        int max = Math.max(0, i - a2);
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("width", g.c(reactApplicationContext, max) + 1);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("result", createMap);
        promise.resolve(createMap2);
    }
}
