package com.meizu.cloud.pushsdk.b.b;

import java.util.HashMap;
/* loaded from: classes3.dex */
public final class a {
    private static final HashMap<String, Class<?>> a = new HashMap<>();
    private Class<?> b;
    private String c;
    private Object d;

    private a(Object obj) {
        this.d = obj;
    }

    private a(String str) {
        this.c = str;
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    public static a a(String str) {
        return new a(str);
    }

    public final c a(String str, Class<?>... clsArr) {
        return new c(this, str, clsArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> a() throws ClassNotFoundException {
        if (this.b != null) {
            return this.b;
        }
        if (this.d != null) {
            return this.d.getClass();
        }
        Class<?> cls = a.get(this.c);
        if (cls == null) {
            Class<?> cls2 = Class.forName(this.c);
            a.put(this.c, cls2);
            return cls2;
        }
        return cls;
    }
}
