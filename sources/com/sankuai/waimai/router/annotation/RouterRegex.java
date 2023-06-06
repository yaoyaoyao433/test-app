package com.sankuai.waimai.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes5.dex */
public @interface RouterRegex {
    boolean exported() default false;

    Class[] interceptors() default {};

    int priority() default 0;

    String regex();
}
