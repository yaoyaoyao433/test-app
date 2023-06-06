package com.sankuai.xm.base.component.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface Component {
    Class<?>[] interceptor() default {};

    String name() default "";

    String path() default "";

    boolean singleton() default true;

    Class<?> type() default Object.class;
}
