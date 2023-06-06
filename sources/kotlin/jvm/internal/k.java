package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.g;
import kotlin.reflect.j;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class k extends j implements kotlin.reflect.g {
    public k() {
    }

    @SinceKotlin(version = "1.1")
    public k(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.b
    protected kotlin.reflect.b computeReflected() {
        return u.a(this);
    }

    @Override // kotlin.jvm.functions.a
    public Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.j
    public j.a getGetter() {
        return ((kotlin.reflect.g) getReflected()).mo39getGetter();
    }

    @Override // kotlin.reflect.g
    public g.a getSetter() {
        return ((kotlin.reflect.g) getReflected()).mo40getSetter();
    }

    @Override // kotlin.reflect.j
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((kotlin.reflect.g) getReflected()).getDelegate();
    }
}
