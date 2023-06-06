package com.meituan.android.mrn.module;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.module.utils.b;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.mrn.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = MRNUtilsModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNUtilsModule extends ReactContextBaseJavaModule {
    private static final String ERROR_CODE = "E_MRN_INFO";
    public static final String MODULE_NAME = "MRNUtilsModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNUtilsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8393959fbd32fed8a01bbb321988e469", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8393959fbd32fed8a01bbb321988e469");
        }
    }

    @ReactMethod
    public void getMRNInfo(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54f3ee12a4817f6705bdf7b50a01e8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54f3ee12a4817f6705bdf7b50a01e8b1");
            return;
        }
        JSONObject a = b.a(getReactApplicationContext());
        if (a == null) {
            promise.reject(ERROR_CODE, "data is null");
            return;
        }
        JSONObject optJSONObject = a.optJSONObject("data");
        if (optJSONObject != null) {
            try {
                promise.resolve(g.a(optJSONObject));
                return;
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        String optString = a.optString("errorMsg");
        if (TextUtils.isEmpty(optString)) {
            optString = "data is null";
        }
        promise.reject(ERROR_CODE, optString);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getInitialProperties() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6acf45f29c06ceaa047aa393812f4291", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6acf45f29c06ceaa047aa393812f4291");
        }
        k a = r.a(getReactApplicationContext());
        if (a == null) {
            return Arguments.createMap();
        }
        Bundle bundle = a.s;
        if (bundle == null) {
            return Arguments.createMap();
        }
        return Arguments.fromBundle(bundle);
    }
}
