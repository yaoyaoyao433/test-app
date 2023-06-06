package com.huawei.agconnect;

import android.annotation.SuppressLint;
import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b {
    @SuppressLint({"StaticFieldLeak"})
    private static b a;

    public static synchronized void a(Context context) {
        synchronized (b.class) {
            com.huawei.agconnect.config.a.a.a(context);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (a == null) {
                a = new com.huawei.agconnect.core.a.a(context);
            }
        }
    }
}
