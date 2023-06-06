package kotlin.jvm.internal;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class s extends r {
    private final kotlin.reflect.d a;
    private final String b;
    private final String c;

    public s(kotlin.reflect.d dVar, String str, String str2) {
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

    @Override // kotlin.reflect.k
    public final Object a(Object obj) {
        return a().call(obj);
    }
}
