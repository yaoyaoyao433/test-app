package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class j1 {
    public static h1 a;

    public static synchronized h1 a() {
        h1 h1Var;
        synchronized (j1.class) {
            if (a == null) {
                a = m1.c().b();
            }
            h1Var = a;
        }
        return h1Var;
    }

    public static void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !u0.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            a.a(i, str, linkedHashMap);
            return;
        }
        y.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            a.a(context, str, str2);
        }
    }

    public static boolean b() {
        return m1.c().a();
    }

    public static void c() {
        if (a() == null || !u0.b().a()) {
            return;
        }
        a.a(-1);
    }
}
