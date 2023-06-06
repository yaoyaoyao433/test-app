package com.meituan.android.mrn.module;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.config.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNABTestStrategyModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNABTestStrategyModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNABTestStrategyModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNABTestStrategyModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfd22edc52cf543a8d924df5729afb36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfd22edc52cf543a8d924df5729afb36");
        }
    }

    @ReactMethod
    public void getABStrategy(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc8a104fc5f369a273cf11cb82759a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc8a104fc5f369a273cf11cb82759a83");
        } else if (promise == null) {
        } else {
            String a = z.a().a(str);
            if (a == null) {
                a = "";
            }
            promise.resolve(a);
        }
    }
}
