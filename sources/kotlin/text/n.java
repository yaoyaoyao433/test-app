package kotlin.text;

import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"numberFormatError", "", TensorConfig.KEY_INPUT_ARRAY, "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/text/StringsKt")
/* loaded from: classes7.dex */
public class n extends m {
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Integer b(@NotNull String str) {
        kotlin.jvm.internal.h.b(str, "$this$toIntOrNull");
        return g.a(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037 A[LOOP:0: B:20:0x0037->B:31:0x0052, LOOP_START, PHI: r2 r3 
      PHI: (r2v2 int) = (r2v0 int), (r2v4 int) binds: [B:19:0x0035, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:19:0x0035, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    @kotlin.SinceKotlin(version = "1.1")
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer a(@org.jetbrains.annotations.NotNull java.lang.String r8, int r9) {
        /*
            java.lang.String r9 = "$this$toIntOrNull"
            kotlin.jvm.internal.h.b(r8, r9)
            r9 = 10
            kotlin.text.a.a(r9)
            int r0 = r8.length()
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            r2 = 0
            char r3 = r8.charAt(r2)
            r4 = 48
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 1
            if (r3 >= r4) goto L32
            if (r0 != r6) goto L22
            return r1
        L22:
            r4 = 45
            if (r3 != r4) goto L2b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 1
            goto L34
        L2b:
            r4 = 43
            if (r3 != r4) goto L31
            r3 = 1
            goto L33
        L31:
            return r1
        L32:
            r3 = 0
        L33:
            r4 = 0
        L34:
            int r0 = r0 - r6
            if (r3 > r0) goto L55
        L37:
            char r6 = r8.charAt(r3)
            int r6 = java.lang.Character.digit(r6, r9)
            if (r6 >= 0) goto L42
            return r1
        L42:
            r7 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r2 >= r7) goto L48
            return r1
        L48:
            int r2 = r2 * 10
            int r7 = r5 + r6
            if (r2 >= r7) goto L4f
            return r1
        L4f:
            int r2 = r2 - r6
            if (r3 == r0) goto L55
            int r3 = r3 + 1
            goto L37
        L55:
            if (r4 == 0) goto L5c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            return r8
        L5c:
            int r8 = -r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.n.a(java.lang.String, int):java.lang.Integer");
    }
}
