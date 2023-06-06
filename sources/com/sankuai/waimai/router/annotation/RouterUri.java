package com.sankuai.waimai.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes5.dex */
public @interface RouterUri {
    boolean exported() default false;

    String host() default "";

    Class[] interceptors() default {};

    String[] path();

    String scheme() default "";
}
