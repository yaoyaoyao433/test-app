package com.sankuai.asl.annotation.titans;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface WebApp {
    String description() default "";

    String label();
}
