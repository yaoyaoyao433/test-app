package com.huawei.agconnect.config.a;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.huawei.agconnect.a {
    private static final Map<String, com.huawei.agconnect.a> a = new HashMap();
    private static final Object b = new Object();
    private static String c;
    private com.huawei.agconnect.config.a d;

    private a(Context context, String str) {
        this.d = com.huawei.agconnect.config.a.a(context, str);
    }

    public static com.huawei.agconnect.a a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        c = packageName;
        return a(context, packageName);
    }

    private static com.huawei.agconnect.a a(Context context, String str) {
        com.huawei.agconnect.a aVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName can not be empty");
        }
        synchronized (b) {
            aVar = a.get(str);
            if (aVar == null) {
                a.put(str, new a(context, str));
            }
        }
        return aVar;
    }
}
