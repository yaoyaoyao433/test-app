package com.heytap.openid.sdk;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static boolean a = false;
    public static boolean b = false;

    public static Context a(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }
}
