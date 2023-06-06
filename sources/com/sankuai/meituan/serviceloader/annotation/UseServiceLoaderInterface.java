package com.sankuai.meituan.serviceloader.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface UseServiceLoaderInterface {
    Class<?>[] interfaceClasses();

    String[] keys();
}
