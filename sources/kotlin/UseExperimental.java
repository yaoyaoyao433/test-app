package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@SinceKotlin(version = "1.2")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B$\u0012\"\u0010\u0002\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00040\u0003\"\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004R\u001f\u0010\u0002\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009120\u0001¨\u0006\u0006"}, d2 = {"Lkotlin/UseExperimental;", "", "markerClass", "", "Lkotlin/reflect/KClass;", "()[Ljava/lang/Class;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.b.CLASS, kotlin.annotation.b.PROPERTY, kotlin.annotation.b.LOCAL_VARIABLE, kotlin.annotation.b.VALUE_PARAMETER, kotlin.annotation.b.CONSTRUCTOR, kotlin.annotation.b.FUNCTION, kotlin.annotation.b.PROPERTY_GETTER, kotlin.annotation.b.PROPERTY_SETTER, kotlin.annotation.b.EXPRESSION, kotlin.annotation.b.FILE, kotlin.annotation.b.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.a.SOURCE)
/* loaded from: classes7.dex */
public @interface UseExperimental {
    Class<? extends Annotation>[] markerClass();
}
