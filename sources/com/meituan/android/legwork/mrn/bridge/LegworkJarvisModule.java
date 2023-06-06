package com.meituan.android.legwork.mrn.bridge;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LegworkJarvisModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "BMLWJarvisModule";
    }

    public LegworkJarvisModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1978f75b1741e8c4abfc496c2bdbd61c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1978f75b1741e8c4abfc496c2bdbd61c");
        }
    }

    @ReactMethod
    public void getDegradeInfo(String str, int i, String str2, Promise promise) {
        Object[] objArr = {str, Integer.valueOf(i), str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddc94fcc10800314aef3c345076e045e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddc94fcc10800314aef3c345076e045e");
        } else if (TextUtils.isEmpty(str)) {
            promise.reject("2", "uri参数为空");
        } else if (!TextUtils.equals("scrollBarConfig", str2) && !TextUtils.equals("pageDegradeConfig", str2)) {
            promise.reject("3", "degradeType需要是[scrollBarConfig, pageDegradeConfig]一种");
        } else if (i != 1 && i != 2 && i != 9) {
            promise.reject("4", "pageType值是错误，1:Native; 2:H5; 9:MRN");
        } else {
            Map<String, Object> a = com.meituan.android.legwork.common.jarvis.a.a().a(str, i, str2);
            if (a != null) {
                promise.resolve(Arguments.makeNativeMap(a));
            } else {
                promise.resolve(null);
            }
        }
    }
}
