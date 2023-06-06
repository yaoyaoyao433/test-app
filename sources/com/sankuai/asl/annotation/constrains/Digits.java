package com.sankuai.asl.annotation.constrains;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface Digits {
    int fraction();

    int integer();

    String message() default "{com.sankuai.asl.annotation.validate.Digits.message}";
}
