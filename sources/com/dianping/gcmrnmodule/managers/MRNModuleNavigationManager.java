package com.dianping.gcmrnmodule.managers;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ViewUtil;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleNavigationManager.MODULE_NAME)
/* loaded from: classes.dex */
public class MRNModuleNavigationManager extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME = "MRNModuleNavigationManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ReactContext mReactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNModuleNavigationManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45b1505e21212fef4788ae3db5beb9a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45b1505e21212fef4788ae3db5beb9a9");
        } else {
            this.mReactContext = reactApplicationContext;
        }
    }

    @ReactMethod
    public void getNavigationBarHeight(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7315cc1997084a1d33cc47bc095be2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7315cc1997084a1d33cc47bc095be2c");
        } else {
            promise.resolve(Integer.valueOf((int) ((ViewUtil.getNavigationBarHeight(this.mReactContext) / this.mReactContext.getResources().getDisplayMetrics().density) + 0.5f)));
        }
    }
}
