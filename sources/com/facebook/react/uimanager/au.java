package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.UIManager;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class au {
    @Nullable
    public static UIManager a(ReactContext reactContext, int i, boolean z) {
        if (reactContext.isBridgeless()) {
            return (UIManager) reactContext.getJSIModule(JSIModuleType.UIManager);
        }
        if (!reactContext.hasCatalystInstance()) {
            ReactSoftException.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        }
        if (!reactContext.hasActiveCatalystInstance()) {
            ReactSoftException.logSoftException("UIManagerHelper", new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
            if (z) {
                return null;
            }
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        if (i == 2) {
            return (UIManager) catalystInstance.getJSIModule(JSIModuleType.UIManager);
        }
        return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
    }

    @Nullable
    public static com.facebook.react.uimanager.events.c a(ReactContext reactContext, int i) {
        UIManager a = a(reactContext, com.facebook.react.uimanager.common.a.a(i), false);
        if (a == null) {
            return null;
        }
        return (com.facebook.react.uimanager.events.c) a.getEventDispatcher();
    }

    public static ReactContext a(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }
}
