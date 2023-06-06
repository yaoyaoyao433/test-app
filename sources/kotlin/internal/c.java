package kotlin.internal;

import com.meituan.robust.common.CommonConstant;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0083\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class c {
    @JvmField
    @NotNull
    public static final b a;

    static {
        b bVar;
        Object newInstance;
        Object newInstance2;
        int a2 = a();
        if (a2 >= 65544) {
            try {
                newInstance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                h.a(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = b.class.getClassLoader();
                        Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                        h.a((Object) initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause;
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                h.a(newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    bVar = (b) newInstance3;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = b.class.getClassLoader();
                    Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                    h.a((Object) initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause2;
                }
            }
            if (newInstance == null) {
                throw new o("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            bVar = (b) newInstance;
            a = bVar;
        }
        if (a2 >= 65543) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk7.a").newInstance();
                h.a(newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = b.class.getClassLoader();
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                        h.a((Object) initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object newInstance4 = Class.forName("kotlin.internal.a").newInstance();
                h.a(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new o("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    bVar = (b) newInstance4;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = b.class.getClassLoader();
                    Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                    h.a((Object) initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause4;
                }
            }
            if (newInstance2 == null) {
                throw new o("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            bVar = (b) newInstance2;
            a = bVar;
        }
        bVar = new b();
        a = bVar;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        String str = property;
        int a2 = g.a((CharSequence) str, (char) CommonConstant.Symbol.DOT_CHAR, 0, false, 6, (Object) null);
        if (a2 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i = a2 + 1;
        int a3 = g.a((CharSequence) str, (char) CommonConstant.Symbol.DOT_CHAR, i, false, 4, (Object) null);
        if (a3 < 0) {
            a3 = property.length();
        }
        if (property != null) {
            String substring = property.substring(0, a2);
            h.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (property != null) {
                String substring2 = property.substring(i, a3);
                h.a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                try {
                    return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                } catch (NumberFormatException unused2) {
                    return 65542;
                }
            }
            throw new o("null cannot be cast to non-null type java.lang.String");
        }
        throw new o("null cannot be cast to non-null type java.lang.String");
    }
}
