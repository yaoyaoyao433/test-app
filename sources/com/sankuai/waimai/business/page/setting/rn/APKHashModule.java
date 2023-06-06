package com.sankuai.waimai.business.page.setting.rn;

import android.support.constraint.R;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class APKHashModule extends ReactContextBaseJavaModule {
    public static final String REACT_NATIVE_MODULE = "APKHashHelper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_NATIVE_MODULE;
    }

    public APKHashModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8231d34bc9e0afdad548f05eeb488d45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8231d34bc9e0afdad548f05eeb488d45");
        }
    }

    @ReactMethod
    public void getNativeClickLogoToast(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b241482fde595edcd8e74bebcd0b6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b241482fde595edcd8e74bebcd0b6d8");
        } else if (TextUtils.isEmpty(getClickLogoToast()) || callback == null) {
        } else {
            callback.invoke(getClickLogoToast());
        }
    }

    public static String getClickLogoToast() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b484d33904839caced1ba484f6c47f3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b484d33904839caced1ba484f6c47f3") : b.a.getString(R.string.wm_page_setting_apk_info, com.sankuai.waimai.platform.b.A().d(), com.sankuai.waimai.platform.b.A().G());
    }
}
