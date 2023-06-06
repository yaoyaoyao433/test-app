package com.alipay.a.a;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g implements i, j {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC] */
    @Override // com.alipay.a.a.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.Class r1 = r9.getClass()
        L9:
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L58
            if (r2 == 0) goto L53
            int r3 = r2.length
            if (r3 <= 0) goto L53
            int r3 = r2.length
            r4 = 0
        L1c:
            if (r4 >= r3) goto L53
            r5 = r2[r4]
            if (r5 == 0) goto L46
            if (r9 == 0) goto L46
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "this$0"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L46
            boolean r6 = r5.isAccessible()
            r7 = 1
            r5.setAccessible(r7)
            java.lang.Object r7 = r5.get(r9)
            if (r7 == 0) goto L46
            r5.setAccessible(r6)
            java.lang.Object r6 = com.alipay.a.a.f.b(r7)
            goto L47
        L46:
            r6 = 0
        L47:
            if (r6 == 0) goto L50
            java.lang.String r5 = r5.getName()
            r0.put(r5, r6)
        L50:
            int r4 = r4 + 1
            goto L1c
        L53:
            java.lang.Class r1 = r1.getSuperclass()
            goto L9
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.a.a.g.a(java.lang.Object):java.lang.Object");
    }

    @Override // com.alipay.a.a.i
    public final Object a(Object obj, Type type) {
        if (obj.getClass().equals(org.json.alipay.b.class)) {
            org.json.alipay.b bVar = (org.json.alipay.b) obj;
            Class cls = (Class) type;
            Object newInstance = cls.newInstance();
            while (!cls.equals(Object.class)) {
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields != null && declaredFields.length > 0) {
                    for (Field field : declaredFields) {
                        String name = field.getName();
                        Type genericType = field.getGenericType();
                        if (bVar.b(name)) {
                            field.setAccessible(true);
                            field.set(newInstance, e.a(bVar.a(name), genericType));
                        }
                    }
                }
                cls = cls.getSuperclass();
            }
            return newInstance;
        }
        return null;
    }

    @Override // com.alipay.a.a.i, com.alipay.a.a.j
    public final boolean a(Class<?> cls) {
        return true;
    }
}
