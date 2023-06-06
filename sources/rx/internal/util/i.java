package rx.internal.util;

import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class i {
    public static void a(Throwable th) {
        try {
            rx.plugins.e.a().b();
        } catch (Throwable th2) {
            b(th2);
        }
    }

    private static void b(Throwable th) {
        PrintStream printStream = System.err;
        printStream.println("RxJavaErrorHandler threw an Exception. It shouldn't. => " + th.getMessage());
        th.printStackTrace();
    }
}
