package com.sankuai.xm.base.trace.annotation;

import com.sankuai.xm.base.trace.e;
import com.sankuai.xm.base.trace.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Inherited
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface Trace {
    String action() default "single";

    String[] belong() default {};

    String name() default "";

    e strategy() default e.NORMAL;

    String traceName() default "";

    i type() default i.begin;
}
