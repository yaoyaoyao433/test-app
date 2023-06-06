package com.huawei.agconnect.config;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    private static final Map<String, a> a = new HashMap();
    private static final Object b = new Object();

    public static a a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return a(context, context.getPackageName());
    }

    public static a a(Context context, String str) {
        a aVar;
        synchronized (b) {
            aVar = a.get(str);
            if (aVar == null) {
                aVar = new com.huawei.agconnect.config.a.b(context, str);
                a.put(str, aVar);
            }
        }
        return aVar;
    }

    public abstract String a(String str);

    public abstract void a(InputStream inputStream);
}
