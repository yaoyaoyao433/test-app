package com.facebook.react.modules.appearance;

import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
/* compiled from: ProGuard */
@ReactModule(name = AppearanceModule.NAME)
/* loaded from: classes.dex */
public class AppearanceModule extends ReactContextBaseJavaModule {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final String NAME = "Appearance";
    private String mColorScheme;
    @Nullable
    private final a mOverrideColorScheme;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        String a();
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void removeListeners(double d) {
    }

    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null);
    }

    public AppearanceModule(ReactApplicationContext reactApplicationContext, @Nullable a aVar) {
        super(reactApplicationContext);
        this.mColorScheme = "light";
        this.mOverrideColorScheme = aVar;
        this.mColorScheme = colorSchemeForCurrentConfiguration(reactApplicationContext);
    }

    private String colorSchemeForCurrentConfiguration(Context context) {
        if (this.mOverrideColorScheme != null) {
            return this.mOverrideColorScheme.a();
        }
        int i = context.getResources().getConfiguration().uiMode & 48;
        return (i == 16 || i != 32) ? "light" : "dark";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getColorScheme() {
        this.mColorScheme = colorSchemeForCurrentConfiguration(getReactApplicationContext());
        return this.mColorScheme;
    }

    public void onConfigurationChanged(Context context) {
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (this.mColorScheme.equals(colorSchemeForCurrentConfiguration)) {
            return;
        }
        this.mColorScheme = colorSchemeForCurrentConfiguration;
        emitAppearanceChanged(this.mColorScheme);
    }

    public void emitAppearanceChanged(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("colorScheme", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(APPEARANCE_CHANGED_EVENT_NAME, createMap);
        }
    }
}
