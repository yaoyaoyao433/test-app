package com.sankuai.waimai.reactnative.modules;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.platform.preload.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PreloadManagerModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "PreloadManager";
    }

    public PreloadManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "469a7c64ec89e6864d9852e60a02a218", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "469a7c64ec89e6864d9852e60a02a218");
        }
    }

    @ReactMethod
    public void getPreloadResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4dca8bee7d85650478ed734a4c33005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4dca8bee7d85650478ed734a4c33005");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.PreloadManagerModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5f4f2e7e663b5b2989ffcd00ed2649fa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5f4f2e7e663b5b2989ffcd00ed2649fa");
                    } else {
                        e.a().a(PreloadManagerModule.this.getCurrentActivity(), new com.sankuai.waimai.platform.preload.c<String>() { // from class: com.sankuai.waimai.reactnative.modules.PreloadManagerModule.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.preload.c
                            public final void a(f<String> fVar) {
                                Object[] objArr3 = {fVar};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "efefe6cdcee2245577ab050f4579a5d0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "efefe6cdcee2245577ab050f4579a5d0");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("state", fVar.b.f);
                                createMap.putDouble("startTime", fVar.e);
                                createMap.putString("rawData", fVar.c);
                                createMap.putBoolean("isFinished", fVar.d);
                                com.sankuai.waimai.foundation.utils.log.a.c("PreloadManagerModule", "sending evt: state=%s, isFinished:%b, rawData=%s", fVar.b.f, Boolean.valueOf(fVar.d), fVar.c);
                                ((DeviceEventManagerModule.RCTDeviceEventEmitter) PreloadManagerModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("WMRouterPreloadResult", createMap);
                            }
                        });
                    }
                }
            });
        }
    }
}
