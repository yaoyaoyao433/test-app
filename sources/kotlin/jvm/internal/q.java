package kotlin.jvm.internal;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class q extends p {
    private final kotlin.reflect.d a;
    private final String b;
    private final String c;

    public q(kotlin.reflect.d dVar, String str, String str2) {
        this.a = dVar;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.internal.b
    public final kotlin.reflect.d getOwner() {
        return this.a;
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return this.b;
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return this.c;
    }

    @Override // kotlin.reflect.j
    public final Object get() {
        return mo39getGetter().call(new Object[0]);
    }
}
