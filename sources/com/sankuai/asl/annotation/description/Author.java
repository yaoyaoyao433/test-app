package com.sankuai.asl.annotation.description;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface Author {
    String email() default "";

    String mis();

    String name() default "";
}
