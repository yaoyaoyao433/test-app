package com.facebook.react.bridge;

import android.support.annotation.Nullable;
import com.facebook.common.logging.a;
import com.facebook.react.module.annotations.ReactModule;
import javax.inject.Provider;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ModuleSpec {
    private static final String TAG = "ModuleSpec";
    private final String mName;
    private final Provider<? extends NativeModule> mProvider;
    @Nullable
    private final Class<? extends NativeModule> mType;

    public static ModuleSpec viewManagerSpec(Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider);
    }

    public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, Provider<? extends NativeModule> provider) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule == null) {
            a.c(TAG, "Could not find @ReactModule annotation on " + cls.getName() + ". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy");
            return new ModuleSpec(provider, provider.get().getName());
        }
        return new ModuleSpec(provider, reactModule.name());
    }

    public static ModuleSpec nativeModuleSpec(String str, Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider, str);
    }

    private ModuleSpec(Provider<? extends NativeModule> provider) {
        this.mType = null;
        this.mProvider = provider;
        this.mName = null;
    }

    private ModuleSpec(Provider<? extends NativeModule> provider, String str) {
        this.mType = null;
        this.mProvider = provider;
        this.mName = str;
    }

    @Nullable
    public Class<? extends NativeModule> getType() {
        return this.mType;
    }

    public String getName() {
        return this.mName;
    }

    public Provider<? extends NativeModule> getProvider() {
        return this.mProvider;
    }
}
