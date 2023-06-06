package com.heytap.openid.sdk;

import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static boolean a = false;

    public static void a(String str, String str2) {
        if (a) {
            new StringBuilder("OpenID-").append(str);
        }
    }

    public static void b(String str, String str2) {
        if (a) {
            Log.e("OpenID-" + str, str2);
        }
    }

    public static void a(String str, Throwable th) {
        if (a) {
            Log.w("OpenID-" + str, th);
        }
    }
}
