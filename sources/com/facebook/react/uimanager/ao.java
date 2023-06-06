package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ao extends ReactContext {
    private final ReactApplicationContext a;
    @Nullable
    private final String b;
    private WeakReference<ad> c;

    public ao(ReactApplicationContext reactApplicationContext, Context context, @Nullable String str) {
        super(context);
        if (reactApplicationContext.hasCatalystInstance()) {
            initializeWithInstance(reactApplicationContext.getCatalystInstance());
        }
        this.a = reactApplicationContext;
        this.b = str;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.a.addLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.a.removeLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean hasCurrentActivity() {
        return this.a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    @Nullable
    public final Activity getCurrentActivity() {
        Context baseContext = getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return this.a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final boolean isBridgeless() {
        return this.a.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public final JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        if (isBridgeless()) {
            return this.a.getJSIModule(jSIModuleType);
        }
        return super.getJSIModule(jSIModuleType);
    }

    public final void a(ad adVar) {
        if (adVar != null) {
            this.c = new WeakReference<>(adVar);
        }
    }

    public final ad a() {
        if (this.c != null) {
            return this.c.get();
        }
        return null;
    }
}
