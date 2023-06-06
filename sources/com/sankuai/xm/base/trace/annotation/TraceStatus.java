package com.sankuai.xm.base.trace.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Inherited
@Target({ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface TraceStatus {
    StatusInfo[] error() default {};

    int[] errorRange() default {};

    StatusInfo[] normal() default {@StatusInfo};
}
