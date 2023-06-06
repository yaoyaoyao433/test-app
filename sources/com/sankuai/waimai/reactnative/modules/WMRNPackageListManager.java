package com.sankuai.waimai.reactnative.modules;

import android.content.pm.PackageManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNPackageListManager extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNPackageListManager";
    }

    public WMRNPackageListManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a7aca3c6cfee8bd3070f49933373f12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a7aca3c6cfee8bd3070f49933373f12");
        }
    }

    @ReactMethod
    public void isInstall(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c51fc1b600c9386b6c239bc315dc8a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c51fc1b600c9386b6c239bc315dc8a04");
            return;
        }
        try {
            getReactApplicationContext().getPackageManager().getPackageInfo(str, 1);
            promise.resolve(Boolean.TRUE);
        } catch (PackageManager.NameNotFoundException unused) {
            promise.resolve(Boolean.FALSE);
        }
    }
}
