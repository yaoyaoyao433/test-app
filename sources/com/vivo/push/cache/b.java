package com.vivo.push.cache;

import android.content.Context;
import com.vivo.push.util.p;
import com.vivo.push.util.z;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    private static volatile b a;
    private d b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }

    public final d a(Context context) {
        if (this.b != null) {
            return this.b;
        }
        try {
            String str = z.a(context) ? "com.vivo.push.cache.ServerConfigManagerImpl" : "com.vivo.push.cache.ClientConfigManagerImpl";
            Method method = Class.forName(str).getMethod("getInstance", Context.class);
            p.d("ConfigManagerFactory", "createConfig success is ".concat(String.valueOf(str)));
            this.b = (d) method.invoke(null, context);
            return this.b;
        } catch (Exception e) {
            e.printStackTrace();
            p.b("ConfigManagerFactory", "createConfig error", e);
            return null;
        }
    }
}
