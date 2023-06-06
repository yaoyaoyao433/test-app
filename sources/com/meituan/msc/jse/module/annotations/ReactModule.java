package com.meituan.msc.jse.module.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface ReactModule {
    boolean canOverrideExistingModule() default false;

    boolean hasConstants() default true;

    String name();

    boolean needsEagerInit() default false;
}
