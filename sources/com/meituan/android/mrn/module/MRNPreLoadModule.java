package com.meituan.android.mrn.module;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.engine.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNPreLoadModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNPreLoadModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNPreLoadModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNPreLoadModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4341b4b9502d3cc2bde6491b7256138", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4341b4b9502d3cc2bde6491b7256138");
        }
    }

    @ReactMethod
    public void preLoadByBundleName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ac2ebd380955b7a575fbe3318648e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ac2ebd380955b7a575fbe3318648e3");
        } else {
            u.a(getReactApplicationContext(), str);
        }
    }
}
