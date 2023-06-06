package com.sankuai.waimai.business.search.ui.mrn;

import android.app.Activity;
import android.support.annotation.Keep;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.GlobalSearchActivity;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SearchKeyboardNativeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMSearchKeyboardNativeModule";
    }

    public SearchKeyboardNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cc2215a0f458217aef444d70073689f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cc2215a0f458217aef444d70073689f");
        }
    }

    @ReactMethod
    public void dismissKeyboard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cce1dc80e7d720153bf55b9de810811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cce1dc80e7d720153bf55b9de810811");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.mrn.SearchKeyboardNativeModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bea60062f6ea137ab79503dba3bcff53", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bea60062f6ea137ab79503dba3bcff53");
                } else if (currentActivity instanceof GlobalSearchActivity) {
                    ((GlobalSearchActivity) currentActivity).d();
                }
            }
        });
    }
}
