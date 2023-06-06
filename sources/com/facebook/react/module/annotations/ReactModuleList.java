package com.facebook.react.module.annotations;

import com.facebook.react.bridge.NativeModule;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface ReactModuleList {
    Class<? extends NativeModule>[] nativeModules();
}
