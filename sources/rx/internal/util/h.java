package rx.internal.util;

import java.security.AccessController;
import java.security.PrivilegedAction;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class h {
    private static final int a;
    private static final boolean b;

    static {
        int c = c();
        a = c;
        b = c != 0;
    }

    public static boolean a() {
        return b;
    }

    public static int b() {
        return a;
    }

    private static int c() {
        ClassLoader classLoader;
        try {
            if (System.getSecurityManager() == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            } else {
                classLoader = (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() { // from class: rx.internal.util.h.1
                    @Override // java.security.PrivilegedAction
                    public final /* synthetic */ ClassLoader run() {
                        return ClassLoader.getSystemClassLoader();
                    }
                });
            }
            return ((Integer) Class.forName("android.os.Build$VERSION", true, classLoader).getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
