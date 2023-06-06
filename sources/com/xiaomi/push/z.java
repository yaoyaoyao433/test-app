package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Method;
/* loaded from: classes6.dex */
public final class z implements v {
    private Context a;
    private Class<?> b;
    private Object c;
    private Method d;
    private Method e;
    private Method f;
    private Method g;

    private String a(Context context, Method method) {
        if (this.c == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(this.c, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("miui invoke error", e);
            return null;
        }
    }

    @Override // com.xiaomi.push.v
    public final boolean a() {
        return (this.b == null || this.c == null) ? false : true;
    }

    @Override // com.xiaomi.push.v
    public final String b() {
        return a(this.a, this.e);
    }

    public z(Context context) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.a = context;
        try {
            this.b = jr.a(context, "com.android.id.impl.IdProviderImpl");
            this.c = this.b.newInstance();
            this.d = this.b.getMethod("getUDID", Context.class);
            this.e = this.b.getMethod("getOAID", Context.class);
            this.f = this.b.getMethod("getVAID", Context.class);
            this.g = this.b.getMethod("getAAID", Context.class);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("miui load class error", e);
        }
    }
}
