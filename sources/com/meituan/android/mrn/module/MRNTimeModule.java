package com.meituan.android.mrn.module;

import android.os.SystemClock;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ReactModule(name = "MRNTimeModule")
/* loaded from: classes2.dex */
public class MRNTimeModule extends ReactContextBaseJavaModule {
    public static final String ERROR_CODE = "JSON_CONVERT_ERROR";
    public static final String MODULENAME = "MRNTimeModule";
    private static final String TAG = "MRNTimeModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNTimeModule";
    }

    public MRNTimeModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8e64068eab74a6bd295b97fdc28a2bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8e64068eab74a6bd295b97fdc28a2bd");
        }
    }

    @ReactMethod
    public void getCurrentTime(Promise promise) {
        WritableMap writableMap;
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c1762ad0e85f23d9f783c1f5e2bba59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c1762ad0e85f23d9f783c1f5e2bba59");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceStartupTime", elapsedRealtime);
            jSONObject.put("deviceTime", currentTimeMillis);
            jSONObject.put("systemSleepTime", elapsedRealtime2);
            writableMap = g.a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            writableMap = null;
        }
        if (writableMap != null) {
            p.a("[MRNTimeModule@getCurrentTime]", writableMap.toString());
            promise.resolve(writableMap);
            return;
        }
        promise.reject("JSON_CONVERT_ERROR", new Throwable("getCurrentTime failed"));
    }
}
