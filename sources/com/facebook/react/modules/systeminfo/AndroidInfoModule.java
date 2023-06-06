package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = AndroidInfoModule.NAME)
@SuppressLint({"HardwareIds"})
/* loaded from: classes.dex */
public class AndroidInfoModule extends ReactContextBaseJavaModule implements com.facebook.react.turbomodule.core.interfaces.a {
    private static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "PlatformConstants";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public void invalidate() {
    }

    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService("uimode")).getCurrentModeType();
        if (currentModeType != 6) {
            switch (currentModeType) {
                case 1:
                    return "normal";
                case 2:
                    return "desk";
                case 3:
                    return "car";
                case 4:
                    return "tv";
                default:
                    return "unknown";
            }
        }
        return "watch";
    }

    @Nullable
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("Release", Build.VERSION.RELEASE);
        String str = "";
        try {
            str = AppUtil.getSerial(getReactApplicationContext());
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[AndroidInfoModule@getTypedExportedConstants]", "get Serial error: ", th);
        }
        hashMap.put("Serial", str);
        hashMap.put("Fingerprint", Build.FINGERPRINT);
        hashMap.put("Model", Build.MODEL);
        hashMap.put("isTesting", Boolean.valueOf("true".equals(System.getProperty(IS_TESTING)) || isRunningScreenshotTest().booleanValue()));
        hashMap.put("reactNativeVersion", b.a);
        hashMap.put("uiMode", uiMode());
        return hashMap;
    }

    @ReactMethod
    public String getAndroidID() {
        return Privacy.createTelephonyManager(getReactApplicationContext(), "com.meituan.android.mrn:mrn").getAndroidId();
    }

    @ReactMethod
    public String getAndroidIDForPrivacy(String str) {
        return Privacy.createTelephonyManager(getReactApplicationContext(), str).getAndroidId();
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    private String getServerHost() {
        return a.a(Integer.valueOf(getReactApplicationContext().getApplicationContext().getResources().getInteger(R.integer.react_native_dev_server_port)));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @javax.annotation.Nullable
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }
}
