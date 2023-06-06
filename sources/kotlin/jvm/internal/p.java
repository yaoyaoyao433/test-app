package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class p extends o implements kotlin.reflect.j {
    @Override // kotlin.jvm.internal.b
    protected kotlin.reflect.b computeReflected() {
        return u.a(this);
    }

    @Override // kotlin.jvm.functions.a
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.j
    /* renamed from: getGetter */
    public j.a mo39getGetter() {
        return ((kotlin.reflect.j) getReflected()).mo39getGetter();
    }

    @Override // kotlin.reflect.j
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((kotlin.reflect.j) getReflected()).getDelegate();
    }
}
