package com.meituan.android.cube.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface DynamicBinder {
    Class modelType() default String.class;

    String[] nativeId();

    Class viewModel() default Object.class;
}
