package com.meituan.msi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface MsiComponent {
    String[] env() default {};

    Class<?> invokeParamType() default Void.class;

    String name();

    Class<?> property() default Void.class;

    String scope() default "default";
}
