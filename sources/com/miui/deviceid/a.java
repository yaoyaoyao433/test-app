package com.miui.deviceid;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    private static Object a;
    private static Class<?> b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            b = cls;
            a = cls.newInstance();
            c = b.getMethod("getUDID", Context.class);
            d = b.getMethod("getOAID", Context.class);
            e = b.getMethod("getVAID", Context.class);
            f = b.getMethod("getAAID", Context.class);
        } catch (Exception e2) {
            Log.e("IdentifierManager", "reflect exception!", e2);
        }
    }

    public static boolean a() {
        return (b == null || a == null) ? false : true;
    }

    public static String a(Context context) {
        return a(context, d);
    }

    private static String a(Context context, Method method) {
        if (a == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(a, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e2) {
            Log.e("IdentifierManager", "invoke exception!", e2);
            return null;
        }
    }
}
