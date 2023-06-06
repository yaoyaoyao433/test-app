package com.sankuai.wme.react.x.api;

import android.text.TextUtils;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.wme.react.x.a;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ReactXParameterModule extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME = "ReactXParameterBridge";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public ReactXParameterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9b83ac752930b0146fb9b9d461a29e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9b83ac752930b0146fb9b9d461a29e6");
        }
    }

    @ReactMethod
    public void getOceanParameter(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42d4475f7d448c8bf89d44f59cb53aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42d4475f7d448c8bf89d44f59cb53aa6");
            return;
        }
        try {
            HashMap<String, String> hashMap = a.a().b;
            String json = hashMap == null ? null : new Gson().toJson(hashMap);
            if (!TextUtils.isEmpty(json)) {
                promise.resolve(json);
            } else {
                promise.reject(new IllegalAccessException("OceanParameter is empty"));
            }
        } catch (Exception e) {
            promise.reject(new IllegalAccessException(e.getMessage()));
        }
    }

    @ReactMethod
    public void getBusinessParameter(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f969788fd3cd56e4208e71996d18ae0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f969788fd3cd56e4208e71996d18ae0c");
            return;
        }
        try {
            HashMap<String, String> hashMap = a.a().c;
            String json = hashMap == null ? null : new Gson().toJson(hashMap);
            if (!TextUtils.isEmpty(json)) {
                promise.resolve(json);
            } else {
                promise.reject(new IllegalAccessException("BusinessParameter is empty"));
            }
        } catch (Exception e) {
            promise.reject(new IllegalAccessException(e.getMessage()));
        }
    }
}
