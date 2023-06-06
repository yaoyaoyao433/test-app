package kotlin.jvm.internal;

import com.meituan.robust.common.CommonConstant;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class h {
    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private h() {
    }

    public static void a() {
        throw ((kotlin.c) a(new kotlin.c()));
    }

    public static void a(String str) {
        throw ((kotlin.q) a(new kotlin.q("lateinit property " + str + " has not been initialized")));
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) a(new IllegalStateException(str + " must not be null")));
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static <T extends Throwable> T a(T t) {
        return (T) a((Throwable) t, h.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        throw ((IllegalArgumentException) a(new IllegalArgumentException("Parameter specified as non-null is null: method " + className + CommonConstant.Symbol.DOT + methodName + ", parameter " + str)));
    }

    public static void a(int i, String str) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
