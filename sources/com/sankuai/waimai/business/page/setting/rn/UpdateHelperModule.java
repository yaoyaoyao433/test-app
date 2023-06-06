package com.sankuai.waimai.business.page.setting.rn;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.manager.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UpdateHelperModule extends ReactContextBaseJavaModule {
    public static final String REACT_NATIVE_MODULE = "WaiMaiUpdateHelper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_NATIVE_MODULE;
    }

    public UpdateHelperModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3229070a196aa07b4aac01c8a636ecff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3229070a196aa07b4aac01c8a636ecff");
        }
    }

    @ReactMethod
    public void checkUpdate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc347c1a83eaa9b8a5f0db2cf4f1d0fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc347c1a83eaa9b8a5f0db2cf4f1d0fb");
        } else {
            c.b();
        }
    }
}
