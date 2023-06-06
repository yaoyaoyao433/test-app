package org.mp4parser.aspectj.lang.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface SuppressAjWarnings {
    String[] value() default {""};
}
