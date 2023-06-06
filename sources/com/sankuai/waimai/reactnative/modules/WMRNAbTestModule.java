package com.sankuai.waimai.reactnative.modules;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.xm.im.message.bean.Message;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WMRNAbTestModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNAbTestModule";
    }

    public WMRNAbTestModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddaef4818b07c936cf631f0fc5380bda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddaef4818b07c936cf631f0fc5380bda");
        }
    }

    @ReactMethod
    public void getStrategy(String str, @NonNull Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18d7e76d702b9f7f18503a7da78b693f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18d7e76d702b9f7f18503a7da78b693f");
        } else if (getReactApplicationContext() == null || promise == null) {
        } else {
            try {
                ABStrategy strategy = ABTestManager.getInstance(getReactApplicationContext()).getStrategy(str, null);
                if (strategy != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("expName", strategy.expName);
                    createMap.putString("sceneName", strategy.sceneName);
                    createMap.putString("modelName", strategy.modelName);
                    createMap.putString(Message.GROUP_NAME, strategy.groupName);
                    createMap.putString("configInfo", strategy.configInfo);
                    createMap.putString("configName", strategy.configName);
                    promise.resolve(createMap);
                    return;
                }
                promise.reject("-1", " AB strategy key is empty!");
            } catch (Exception e) {
                promise.reject(e);
            }
        }
    }
}
