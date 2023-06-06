package com.sankuai.waimai.business.page.common.mrn.nativemodules;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AddressModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNAddress";
    }

    public AddressModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1bc04f45f4eb5ca3a12b0aab7446f74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1bc04f45f4eb5ca3a12b0aab7446f74");
        }
    }

    @ReactMethod
    public void getAddress(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3481ff4558d34eff422336362bf22ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3481ff4558d34eff422336362bf22ec");
            return;
        }
        WmAddress k = g.a().k();
        if (k == null || !k.hasAddress()) {
            if (promise != null) {
                promise.reject("0", "地址获取错误");
            }
        } else if (promise != null) {
            promise.resolve(k.getAddress());
        }
    }
}
