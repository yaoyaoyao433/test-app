package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.net.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMNetMonitorModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private d.b netChangeObserver;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMNetMonitorModule";
    }

    public WMNetMonitorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79ac443462858b9981aacc99f6fca461", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79ac443462858b9981aacc99f6fca461");
        }
    }

    @ReactMethod
    public boolean isWeakNetWork() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f402dc84cb204aba930c2f9eb85d68", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f402dc84cb204aba930c2f9eb85d68")).booleanValue() : d.a().d;
    }

    @ReactMethod
    public void getCurrentNetState(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d050a74e94e46ab9b2fbf2354fe55b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d050a74e94e46ab9b2fbf2354fe55b4");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("activity_error", "activity is null");
        } else if (!(currentActivity instanceof BaseActivity)) {
            promise.reject("activity_error", "activity is not BaseActivity");
        } else {
            if (this.netChangeObserver == null) {
                this.netChangeObserver = new d.a() { // from class: com.sankuai.waimai.reactnative.modules.WMNetMonitorModule.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.d.a, com.sankuai.waimai.platform.net.d.b
                    public final void a(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b44f1dd658cee33f5422f2a3ee3bd8ae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b44f1dd658cee33f5422f2a3ee3bd8ae");
                            return;
                        }
                        promise.resolve(Boolean.valueOf(z));
                        d.a().a(this);
                    }
                };
            }
            d.a().a(currentActivity, this.netChangeObserver);
        }
    }
}
