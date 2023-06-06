package com.meituan.msi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface MsiParamChecker {
    boolean encoding() default false;

    String[] in() default {};

    int max() default Integer.MAX_VALUE;

    int maxLength() default Integer.MAX_VALUE;

    int min() default Integer.MIN_VALUE;

    int minLength() default 0;

    boolean required() default false;
}
