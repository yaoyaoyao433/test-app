package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e0 {
    public static boolean a() {
        if (d0.a) {
            return d0.b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (d0.a) {
            return h0.f.a(d0.a(context), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void c(Context context) {
        d0.b = h0.f.a(d0.a(context));
        d0.a = true;
    }

    public static String a(Context context) {
        if (d0.a) {
            return h0.f.a(d0.a(context), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
