package com.airbnb.lottie;

import android.support.annotation.RestrictTo;
import android.support.v4.os.TraceCompat;
import com.meituan.robust.common.CommonConstant;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class d {
    public static boolean a = false;
    private static String[] d;
    private static long[] e;
    private static final Set<String> b = new HashSet();
    private static boolean c = false;
    private static int f = 0;
    private static int g = 0;

    public static void a(String str) {
    }

    public static void b(String str) {
        if (b.contains(str)) {
            return;
        }
        b.add(str);
    }

    public static void c(String str) {
        if (c) {
            if (f == 20) {
                g++;
                return;
            }
            d[f] = str;
            e[f] = System.nanoTime();
            TraceCompat.beginSection(str);
            f++;
        }
    }

    public static float d(String str) {
        if (g > 0) {
            g--;
            return 0.0f;
        } else if (c) {
            int i = f - 1;
            f = i;
            if (i == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            }
            if (!str.equals(d[f])) {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + d[f] + CommonConstant.Symbol.DOT);
            }
            TraceCompat.endSection();
            return ((float) (System.nanoTime() - e[f])) / 1000000.0f;
        } else {
            return 0.0f;
        }
    }
}
