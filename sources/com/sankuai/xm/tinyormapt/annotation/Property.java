package com.sankuai.xm.tinyormapt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface Property {
    boolean deprecated() default false;

    String[] exclude() default {};

    String name() default "";
}
