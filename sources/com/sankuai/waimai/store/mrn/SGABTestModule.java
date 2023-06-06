package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGABTestModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNABTest";
    }

    public SGABTestModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fa12fde16c3a05a6ad30910c4ca80c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fa12fde16c3a05a6ad30910c4ca80c1");
        }
    }

    @ReactMethod
    public void getSimpleStrategy(@Nullable String str, String str2, Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3ce04a5c24d8b196cc9f3ff2cacdea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3ce04a5c24d8b196cc9f3ff2cacdea8");
        } else if (promise == null) {
        } else {
            if (t.a(str) || t.a(str2)) {
                promise.reject("Wrong Parameters", "group = " + str + ", defExpName = " + str2);
            }
            promise.resolve(com.sankuai.waimai.store.manager.abtest.a.a(str, str2).e);
        }
    }
}
