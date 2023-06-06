package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.d;
import com.meituan.android.mrn.utils.ak;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = DeviceInfoModule.NAME)
/* loaded from: classes.dex */
public class DeviceInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String NAME = "DeviceInfo";
    private float mFontScale;
    @Nullable
    private ReadableMap mPreviousDisplayMetrics;
    @Nullable
    private ReactApplicationContext mReactApplicationContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public void invalidate() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        d.a(reactApplicationContext);
        this.mFontScale = reactApplicationContext.getResources().getConfiguration().fontScale;
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactApplicationContext.addLifecycleEventListener(this);
    }

    public DeviceInfoModule(Context context) {
        super(null);
        this.mReactApplicationContext = null;
        d.a(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }

    @Nullable
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        double d = this.mFontScale;
        boolean z = false;
        a.a(Boolean.valueOf(reactApplicationContext != null));
        a.a(Boolean.valueOf((d.a == null && d.b == null) ? true : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        HashMap hashMap2 = new HashMap();
        Map<String, Object> a = d.a(d.a, d);
        int b = ak.b(reactApplicationContext);
        int a2 = ak.a(reactApplicationContext, d.b.heightPixels, d.a.heightPixels, b);
        boolean a3 = ak.a(d.b.heightPixels, a2, b);
        a.put("softMenuBarHeight", Float.valueOf(a3 ? b / d.b.density : 0.0f));
        a.put("softMenuBarEnabled", Boolean.valueOf(a3));
        a.put("realHeight", Float.valueOf(a2 / d.a.density));
        hashMap2.put("windowPhysicalPixels", a);
        hashMap2.put("screenPhysicalPixels", d.a(d.b, d));
        hashMap.put("Dimensions", hashMap2);
        hashMap.put("privacy", Boolean.TRUE);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (this.mReactApplicationContext == null) {
            return;
        }
        float f = this.mReactApplicationContext.getResources().getConfiguration().fontScale;
        if (this.mFontScale != f) {
            this.mFontScale = f;
            emitUpdateDimensionsEvent();
        }
    }

    public void emitUpdateDimensionsEvent() {
        int a;
        if (this.mReactApplicationContext == null) {
            return;
        }
        if (this.mReactApplicationContext.hasActiveCatalystInstance()) {
            ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
            double d = this.mFontScale;
            boolean z = false;
            a.a(Boolean.valueOf(reactApplicationContext != null));
            a.a(Boolean.valueOf((d.a == null && d.b == null) ? true : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap b = d.b(d.a, d);
            int b2 = ak.b(reactApplicationContext);
            boolean a2 = ak.a(d.b.heightPixels, ak.a(reactApplicationContext, d.b.heightPixels, d.a.heightPixels, b2), b2);
            b.putDouble("softMenuBarHeight", a2 ? b2 / d.b.density : 0.0d);
            b.putBoolean("softMenuBarEnabled", a2);
            b.putDouble("realHeight", a / d.a.density);
            writableNativeMap.putMap("windowPhysicalPixels", (WritableMap) b);
            writableNativeMap.putMap("screenPhysicalPixels", (WritableMap) d.b(d.b, d));
            if (this.mPreviousDisplayMetrics == null) {
                this.mPreviousDisplayMetrics = writableNativeMap.copy();
                return;
            } else if (writableNativeMap.equals(this.mPreviousDisplayMetrics)) {
                return;
            } else {
                this.mPreviousDisplayMetrics = writableNativeMap.copy();
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", writableNativeMap);
                return;
            }
        }
        ReactSoftException.logSoftException(NAME, new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @javax.annotation.Nullable
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }
}
