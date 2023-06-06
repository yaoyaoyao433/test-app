package kotlin.internal;

import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", LogMonitor.EXCEPTION_TAG, "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "ReflectAddSuppressedMethod", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public class b {

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectAddSuppressedMethod;", "", "()V", "method", "Ljava/lang/reflect/Method;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    static final class a {
        @JvmField
        @Nullable
        public static final Method a;
        public static final a b = new a();

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
            if (kotlin.jvm.internal.h.a((java.lang.Class) (r7.length == 1 ? r7[0] : null), java.lang.Throwable.class) != false) goto L11;
         */
        static {
            /*
                kotlin.internal.b$a r0 = new kotlin.internal.b$a
                r0.<init>()
                kotlin.internal.b.a.b = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                kotlin.jvm.internal.h.a(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L50
                r6 = r1[r4]
                java.lang.String r7 = "it"
                kotlin.jvm.internal.h.a(r6, r7)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.h.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L48
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                kotlin.jvm.internal.h.a(r7, r9)
                java.lang.String r9 = "$this$singleOrNull"
                kotlin.jvm.internal.h.b(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L3f
                r5 = r7[r3]
            L3f:
                java.lang.Class r5 = (java.lang.Class) r5
                boolean r5 = kotlin.jvm.internal.h.a(r5, r0)
                if (r5 == 0) goto L48
                goto L49
            L48:
                r8 = 0
            L49:
                if (r8 == 0) goto L4d
                r5 = r6
                goto L50
            L4d:
                int r4 = r4 + 1
                goto L15
            L50:
                kotlin.internal.b.a.a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.b.a.<clinit>():void");
        }

        private a() {
        }
    }

    public void a(@NotNull Throwable th, @NotNull Throwable th2) {
        h.b(th, "cause");
        h.b(th2, LogMonitor.EXCEPTION_TAG);
        Method method = a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
