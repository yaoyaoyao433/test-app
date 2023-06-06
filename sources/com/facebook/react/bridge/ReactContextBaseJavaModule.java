package com.facebook.react.bridge;

import android.app.Activity;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    @Nullable
    private final ReactApplicationContext mReactApplicationContext;

    public ReactContextBaseJavaModule() {
        this.mReactApplicationContext = null;
    }

    public ReactContextBaseJavaModule(@Nullable ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    public final ReactApplicationContext getReactApplicationContext() {
        return (ReactApplicationContext) a.a(this.mReactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
    }

    @ThreadConfined(ThreadConfined.ANY)
    @Nullable
    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.hasActiveCatalystInstance() || this.mReactApplicationContext.isBridgeless()) {
            return this.mReactApplicationContext;
        }
        ReactSoftException.logSoftException("ReactContextBaseJavaModule", new RuntimeException("Catalyst Instance has already disappeared: requested by " + getName()));
        return null;
    }

    @Nullable
    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }
}
