package com.meizu.cloud.pushsdk.b.b;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes3.dex */
public final class c {
    private static final HashMap<String, Method> a = new HashMap<>();
    private final com.meizu.cloud.pushsdk.b.b.a b;
    private final String c;
    private Class<?>[] d;

    /* loaded from: classes3.dex */
    public class a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.meizu.cloud.pushsdk.b.b.a aVar, String str, Class<?>... clsArr) {
        this.b = aVar;
        this.c = str;
        this.d = clsArr;
    }

    private static Class<?> a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    private Method a() throws NoSuchMethodException, ClassNotFoundException {
        Method[] methods;
        Method[] declaredMethods;
        Class<?> a2 = this.b.a();
        for (Method method : a2.getMethods()) {
            if (a(method, this.c, this.d)) {
                return method;
            }
        }
        for (Method method2 : a2.getDeclaredMethods()) {
            if (a(method2, this.c, this.d)) {
                return method2;
            }
        }
        throw new NoSuchMethodException("No similar method " + this.c + " with params " + Arrays.toString(this.d) + " could be found on type " + a2);
    }

    public final <T> d<T> a(Object... objArr) {
        try {
            return a(this.b.a(), objArr);
        } catch (ClassNotFoundException unused) {
            return new d<>();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.lang.reflect.Method r5, java.lang.String r6, java.lang.Class<?>[] r7) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getName()
            boolean r6 = r0.equals(r6)
            r0 = 0
            if (r6 == 0) goto L3a
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r6 = r5.length
            int r1 = r7.length
            r2 = 1
            if (r6 != r1) goto L36
            r6 = 0
        L15:
            int r1 = r7.length
            if (r6 >= r1) goto L34
            r1 = r7[r6]
            java.lang.Class<com.meizu.cloud.pushsdk.b.b.c$a> r3 = com.meizu.cloud.pushsdk.b.b.c.a.class
            if (r1 == r3) goto L31
            r1 = r5[r6]
            java.lang.Class r1 = a(r1)
            r3 = r7[r6]
            java.lang.Class r3 = a(r3)
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 != 0) goto L31
            goto L36
        L31:
            int r6 = r6 + 1
            goto L15
        L34:
            r5 = 1
            goto L37
        L36:
            r5 = 0
        L37:
            if (r5 == 0) goto L3a
            return r2
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.b.b.c.a(java.lang.reflect.Method, java.lang.String, java.lang.Class[]):boolean");
    }

    public final <T> d<T> a(Object obj, Object... objArr) {
        d<T> dVar = new d<>();
        try {
            StringBuilder sb = new StringBuilder(this.b.a().getName());
            sb.append(this.c);
            for (Class<?> cls : this.d) {
                sb.append(cls.getName());
            }
            String sb2 = sb.toString();
            Method method = a.get(sb2);
            if (method == null) {
                if (this.d.length == objArr.length) {
                    method = this.b.a().getMethod(this.c, this.d);
                } else {
                    if (objArr.length > 0) {
                        this.d = new Class[objArr.length];
                        for (int i = 0; i < objArr.length; i++) {
                            this.d[i] = objArr[i].getClass();
                        }
                    }
                    method = a();
                }
                a.put(sb2, method);
            }
            method.setAccessible(true);
            dVar.b = (T) method.invoke(obj, objArr);
            dVar.a = true;
        } catch (Exception e) {
            DebugLogger.e("ReflectMethod", "invoke", e);
        }
        return dVar;
    }
}
