package kotlin.jvm.internal;

import kotlin.reflect.k;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class r extends o implements kotlin.reflect.k {
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
        return ((kotlin.reflect.k) getReflected()).a();
    }
}
