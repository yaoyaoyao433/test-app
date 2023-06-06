package com.sankuai.titans.protocol.lifecycle.annotation;

import com.sankuai.titans.protocol.lifecycle.LifeCycle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface TitansPlugin {
    LifeCycle.Event[] events();

    String name();

    String version();
}
