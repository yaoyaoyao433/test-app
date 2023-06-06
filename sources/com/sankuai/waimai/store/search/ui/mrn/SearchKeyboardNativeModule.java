package com.sankuai.waimai.store.search.ui.mrn;

import android.app.Activity;
import android.support.annotation.Keep;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.ui.GlobalSearchActivity;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchKeyboardNativeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SGSearchKeyboardNativeModule";
    }

    public SearchKeyboardNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ebc5888bceff41c278bbaef68e403b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ebc5888bceff41c278bbaef68e403b3");
        }
    }

    @ReactMethod
    public void dismissKeyboard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e718f9cc3914643c38949d460ca5c774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e718f9cc3914643c38949d460ca5c774");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.mrn.SearchKeyboardNativeModule.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1a45769e79d6f136f58ef97a4a346561", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1a45769e79d6f136f58ef97a4a346561");
                } else if (currentActivity instanceof GlobalSearchActivity) {
                    ((GlobalSearchActivity) currentActivity).g();
                }
            }
        });
    }
}
