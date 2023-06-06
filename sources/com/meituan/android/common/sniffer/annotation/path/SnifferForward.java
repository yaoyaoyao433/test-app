package com.meituan.android.common.sniffer.annotation.path;

import com.meituan.android.common.sniffer.annotation.type.SnifferCondition;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface SnifferForward {
    String business() default "default";

    SnifferCondition[] conditions() default {};

    String describe() default "";

    String module();

    int step() default 1;

    String targetClass() default "";

    String type() default "";
}
