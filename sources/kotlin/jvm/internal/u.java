package kotlin.jvm.internal;

import kotlin.SinceKotlin;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class u {
    private static final v a;
    private static final kotlin.reflect.c[] b;

    public static kotlin.reflect.e a(g gVar) {
        return gVar;
    }

    public static kotlin.reflect.g a(k kVar) {
        return kVar;
    }

    public static kotlin.reflect.h a(l lVar) {
        return lVar;
    }

    public static kotlin.reflect.j a(p pVar) {
        return pVar;
    }

    public static kotlin.reflect.k a(r rVar) {
        return rVar;
    }

    static {
        v vVar = null;
        try {
            vVar = (v) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (vVar == null) {
            vVar = new v();
        }
        a = vVar;
        b = new kotlin.reflect.c[0];
    }

    @SinceKotlin(version = "1.1")
    public static String a(i iVar) {
        v vVar = a;
        String obj = iVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public static kotlin.reflect.d a(Class cls, String str) {
        return new n(cls, str);
    }

    public static kotlin.reflect.c a(Class cls) {
        return new d(cls);
    }
}
