package com.meituan.android.mrn.services;

import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.p;
import com.meituan.android.mrn.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class KNBBridgeModule extends ReactContextBaseJavaModule {
    private static String KEY_PARAM_USE_NEW_KNB = "useNewNativeCall";
    private static String TAG = "KNBBridgeModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private KNBCompatJsHandler compatJsHandler;
    private boolean mUseNewNativeCall;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNNativeCall";
    }

    public KNBBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9582efe49a93ed9ef34bb4d0b6bb802", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9582efe49a93ed9ef34bb4d0b6bb802");
            return;
        }
        this.mUseNewNativeCall = true;
        this.compatJsHandler = new KNBCompatJsHandler(reactApplicationContext);
    }

    @ReactMethod
    public void invoke(String str, String str2, String str3, Callback callback) {
        Object[] objArr = {str, str2, str3, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb1a68ce9755a0fd96b5e6416aa330f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb1a68ce9755a0fd96b5e6416aa330f1");
        } else {
            invokeInner(str, str2, str3, callback, false);
        }
    }

    @ReactMethod
    public void continuousInvoke(String str, String str2, String str3, Callback callback) {
        Object[] objArr = {str, str2, str3, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7849fcf2ef372f0311ef678f2e29bd63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7849fcf2ef372f0311ef678f2e29bd63");
        } else {
            invokeInner(str, str2, str3, callback, true);
        }
    }

    @ReactMethod
    public void useNewNativeCall(boolean z) {
        this.mUseNewNativeCall = z;
    }

    private void invokeInner(final String str, final String str2, final String str3, final Callback callback, final boolean z) {
        Object[] objArr = {str, str2, str3, callback, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c904ad02a75270db176befb46b51a272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c904ad02a75270db176befb46b51a272");
        } else if (this.compatJsHandler.processCompatJsHandler(str, str2)) {
        } else {
            final String appendCompatParam = this.compatJsHandler.appendCompatParam(getReactApplicationContext(), str, str2);
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.services.KNBBridgeModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b9498cf347951f1bda1836107fa8cc53", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b9498cf347951f1bda1836107fa8cc53");
                    } else if (KNBBridgeModule.this.ifUseNewNativeCall(str, str2)) {
                        Activity currentActivity = KNBBridgeModule.this.getCurrentActivity();
                        if (currentActivity == null || currentActivity.isFinishing()) {
                            try {
                                currentActivity = com.meituan.android.mrn.router.c.a().b();
                            } catch (Throwable th) {
                                th.printStackTrace();
                                com.facebook.common.logging.a.d("KNBBridgeModule@run", "", th);
                            }
                        }
                        if (currentActivity == null) {
                            currentActivity = v.a();
                        }
                        KNBBridgeModule.this.compatJsHandler.preInvoke(KNBBridgeModule.this.getReactApplicationContext(), str, str2, str3, callback);
                        b.a(currentActivity, KNBBridgeModule.this.getReactApplicationContext(), str, appendCompatParam, str3, callback, z);
                    } else if (KNBBridgeModule.this.getCurrentActivity() == null) {
                        p.a("[KNBBridgeModule@run]", String.format("knb continuousInvoke, activity is null, method:%s params:%s callbackId:%s", str, str2, str3));
                    } else {
                        KNBBridgeModule.this.compatJsHandler.preInvoke(KNBBridgeModule.this.getReactApplicationContext(), str, str2, str3, callback);
                        c.a(KNBBridgeModule.this.getCurrentActivity(), KNBBridgeModule.this.getReactApplicationContext(), str, appendCompatParam, str3, callback, z);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ifUseNewNativeCall(String str, String str2) {
        boolean z = true;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2387d3b3b1478d6aa6f3a55f5d56f532", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2387d3b3b1478d6aa6f3a55f5d56f532")).booleanValue();
        }
        if (!((str2 == null || !str2.contains(KEY_PARAM_USE_NEW_KNB)) ? false : false)) {
            return this.mUseNewNativeCall;
        }
        try {
            return new JSONObject(str2).optBoolean(KEY_PARAM_USE_NEW_KNB, false);
        } catch (Throwable unused) {
            return this.mUseNewNativeCall;
        }
    }
}
