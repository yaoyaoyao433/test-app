package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class g {
    public static String a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(a.a(str, str2))) {
            y.c("hmsSdk", "getAndroidId(): to getConfigByType()");
            return c(context, str, str2);
        }
        return a.a(str, str2);
    }

    public static String b(Context context, String str, String str2) {
        if (!str2.equals("oper") && !str2.equals("maint") && !str2.equals("diffprivacy") && !str2.equals("preins")) {
            y.f("hmsSdk", "getChannel(): Invalid type: " + str2);
            return "";
        }
        return d(context, str, str2);
    }

    public static String c(Context context, String str, String str2) {
        if (a.b(str, str2)) {
            if (TextUtils.isEmpty(b.b())) {
                i.c().b().b(f.a(context));
            }
            return b.b();
        }
        return "";
    }

    public static String d(Context context, String str, String str2) {
        if (TextUtils.isEmpty(c.d(str, str2))) {
            l b = i.c().b();
            if (TextUtils.isEmpty(b.g())) {
                String b2 = f.b(context);
                if (!q0.a("channel", b2, 256)) {
                    b2 = "";
                }
                b.d(b2);
            }
            return b.g();
        }
        return c.d(str, str2);
    }
}
