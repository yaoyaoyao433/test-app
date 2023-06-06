package com.dianping.shield.dynamic.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.a;
import kotlin.annotation.b;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003R\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/dynamic/model/DynamicInfo;", "", "arg1", "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
@kotlin.annotation.Target(allowedTargets = {b.CLASS})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(a.SOURCE)
/* loaded from: classes.dex */
public @interface DynamicInfo {
    Class<?> arg1();
}
