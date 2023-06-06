package com.sankuai.xm.tinyormapt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface Entity {
    Index[] indexes() default {};

    String name() default "";
}
