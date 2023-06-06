package com.sankuai.mesh.core;

import android.support.annotation.Keep;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Keep
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface MeshMethod {
    String value();
}
