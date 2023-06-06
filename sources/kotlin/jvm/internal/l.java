package kotlin.jvm.internal;

import kotlin.reflect.k;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class l extends j implements kotlin.reflect.h {
    @Override // kotlin.jvm.internal.b
    protected kotlin.reflect.b computeReflected() {
        return u.a(this);
    }

    @Override // kotlin.jvm.functions.b
    public Object invoke(Object obj) {
        return a(obj);
    }

    @Override // kotlin.reflect.k
    public final k.a a() {
        return ((kotlin.reflect.h) getReflected()).a();
    }
}
