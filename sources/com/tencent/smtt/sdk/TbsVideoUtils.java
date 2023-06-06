package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.DexLoader;
/* loaded from: classes6.dex */
public class TbsVideoUtils {
    private static t a;

    private static void a(Context context) {
        synchronized (TbsVideoUtils.class) {
            if (a == null) {
                g.a(true).a(context, false, false);
                v a2 = g.a(true).a();
                DexLoader b = a2 != null ? a2.b() : null;
                if (b != null) {
                    a = new t(b);
                }
            }
        }
    }

    public static void deleteVideoCache(Context context, String str) {
        a(context);
        if (a != null) {
            a.a(context, str);
        }
    }

    public static String getCurWDPDecodeType(Context context) {
        a(context);
        return a != null ? a.a(context) : "";
    }
}
