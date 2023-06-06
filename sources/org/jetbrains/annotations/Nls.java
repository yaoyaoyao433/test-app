package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes7.dex */
public @interface Nls {

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum a {
        NotSpecified,
        Title,
        Sentence
    }

    a capitalization() default a.NotSpecified;
}
