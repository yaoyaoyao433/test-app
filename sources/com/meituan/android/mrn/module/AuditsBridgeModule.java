package com.meituan.android.mrn.module;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.utils.r;
import com.meituan.hotel.android.hplus.diagnoseTool.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = AuditsBridgeModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class AuditsBridgeModule extends ReactContextBaseJavaModule {
    public static final double JS_METHOD_TIME_MIN_LIMIT = 20.0d;
    public static final String MODULE_NAME = "AuditsBridge";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public AuditsBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4002fd9d7c5e4a8a2554383eb148ad2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4002fd9d7c5e4a8a2554383eb148ad2");
        }
    }

    @ReactMethod
    public void addCustomStep(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e4e645afdb7fc91aa495cba823e2450", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e4e645afdb7fc91aa495cba823e2450");
        } else {
            b.b();
        }
    }

    @ReactMethod
    public void reportCustomEvent(String str, String str2, double d, double d2, String str3) {
        Object[] objArr = {str, str2, Double.valueOf(d), Double.valueOf(d2), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adc65f2d92b4d6ddb44fecd8418f5b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adc65f2d92b4d6ddb44fecd8418f5b0c");
        } else {
            b.b();
        }
    }

    @ReactMethod
    public void reportMeasureResult(String str, double d, double d2, String str2) {
        Object[] objArr = {str, Double.valueOf(d), Double.valueOf(d2), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b90ac5939c384ed72c5eec99a9c03055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b90ac5939c384ed72c5eec99a9c03055");
        } else if (Double.compare(d2 - d, 20.0d) >= 0) {
            b.b();
        }
    }

    @ReactMethod
    public void auditsLogJSFunctionCallInfos(ReadableArray readableArray) {
        k a;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ec449ca1e8acf9347521010f7f79136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ec449ca1e8acf9347521010f7f79136");
        } else if (readableArray != null) {
            try {
                if (readableArray.size() != 0 && (a = r.a(getReactApplicationContext())) != null && !TextUtils.isEmpty(a.k)) {
                    b.b();
                }
            } catch (Exception unused) {
            }
        }
    }
}
