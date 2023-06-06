package com.sankuai.waimai.manipulator.annotation;

import com.sankuai.waimai.manipulator.scope.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface WrapReturnValue {
    a autoExcludeScope() default a.CLASS;

    String className();

    boolean enable() default true;

    String[] exclude() default {};

    String[] include() default {};

    String methodDesc();

    String methodName();

    boolean skipValidation() default false;
}
