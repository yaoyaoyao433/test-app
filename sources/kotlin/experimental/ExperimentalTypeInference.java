package kotlin.experimental;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Experimental;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.a;
import kotlin.annotation.b;
/* compiled from: ProGuard */
@Target({ElementType.ANNOTATION_TYPE})
@SinceKotlin(version = "1.3")
@kotlin.annotation.Target(allowedTargets = {b.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(a.BINARY)
@MustBeDocumented
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlin/experimental/ExperimentalTypeInference;", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@Experimental(level = Experimental.a.ERROR)
@Documented
/* loaded from: classes7.dex */
public @interface ExperimentalTypeInference {
}
