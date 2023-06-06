package org.mp4parser.aspectj.internal.lang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface ajcDeclareParents {
    boolean isExtends();

    String parentTypes();

    String targetTypePattern();
}
