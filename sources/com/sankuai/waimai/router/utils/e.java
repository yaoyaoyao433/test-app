package com.sankuai.waimai.router.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static final HashMap<Class, Method> b = new HashMap<>();
    private static final Method c = e.class.getDeclaredMethods()[0];

    public static <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de5c1cd9d68d7d15a47cf01a1a6c7a82", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de5c1cd9d68d7d15a47cf01a1a6c7a82");
        }
        if (cls == null) {
            return null;
        }
        Method b2 = b(cls);
        if (b2 == c) {
            com.sankuai.waimai.router.core.d.a("[ProviderPool] provider not found: %s", cls);
            return null;
        }
        com.sankuai.waimai.router.core.d.a("[ProviderPool] provider found: %s", b2);
        try {
            return (T) b2.invoke(null, new Object[0]);
        } catch (Exception e) {
            com.sankuai.waimai.router.core.d.b(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        r1 = r6;
     */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <T> java.lang.reflect.Method b(@android.support.annotation.NonNull java.lang.Class<T> r18) {
        /*
            r0 = r18
            r1 = 1
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r10 = 0
            r9[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.router.utils.e.a
            java.lang.String r12 = "f14629c2ae6c5fbab84069d171a6997e"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r3, r11, r1, r12)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L20:
            java.util.HashMap<java.lang.Class, java.lang.reflect.Method> r2 = com.sankuai.waimai.router.utils.e.b
            java.lang.Object r2 = r2.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 != 0) goto La5
            java.util.HashMap<java.lang.Class, java.lang.reflect.Method> r4 = com.sankuai.waimai.router.utils.e.b
            monitor-enter(r4)
            java.util.HashMap<java.lang.Class, java.lang.reflect.Method> r2 = com.sankuai.waimai.router.utils.e.b     // Catch: java.lang.Throwable -> La2
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> La2
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> La2
            if (r2 != 0) goto La0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La2
            r2[r10] = r0     // Catch: java.lang.Throwable -> La2
            com.meituan.robust.ChangeQuickRedirect r5 = com.sankuai.waimai.router.utils.e.a     // Catch: java.lang.Throwable -> La2
            java.lang.String r6 = "e0585d527333ea3cf6382c89de7cac7f"
            r12 = 0
            r14 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r11 = r2
            r13 = r5
            r15 = r6
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> La2
            if (r7 == 0) goto L53
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r5, r1, r6)     // Catch: java.lang.Throwable -> La2
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> La2
            goto L9a
        L53:
            java.lang.String r2 = "[ProviderPool] >>> find provider with reflection: %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La2
            r3[r10] = r0     // Catch: java.lang.Throwable -> La2
            com.sankuai.waimai.router.core.d.a(r2, r3)     // Catch: java.lang.Throwable -> La2
            java.lang.reflect.Method[] r2 = r18.getDeclaredMethods()     // Catch: java.lang.Throwable -> La2
            int r3 = r2.length     // Catch: java.lang.Throwable -> La2
            r5 = 0
        L62:
            if (r5 >= r3) goto L98
            r6 = r2[r5]     // Catch: java.lang.Throwable -> La2
            java.lang.Class<com.sankuai.waimai.router.annotation.RouterProvider> r7 = com.sankuai.waimai.router.annotation.RouterProvider.class
            java.lang.annotation.Annotation r7 = r6.getAnnotation(r7)     // Catch: java.lang.Throwable -> La2
            if (r7 == 0) goto L95
            int r2 = r6.getModifiers()     // Catch: java.lang.Throwable -> La2
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L8d
            java.lang.Class r2 = r6.getReturnType()     // Catch: java.lang.Throwable -> La2
            if (r2 != r0) goto L8d
            java.lang.Class[] r2 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L89
            int r2 = r2.length     // Catch: java.lang.Throwable -> La2
            if (r2 != 0) goto L88
            goto L89
        L88:
            r1 = 0
        L89:
            if (r1 == 0) goto L8d
            r1 = r6
            goto L9a
        L8d:
            java.lang.String r1 = "[ProviderPool] RouterProvider注解的应该是静态无参数方法，且返回值类型为当前Class"
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> La2
            com.sankuai.waimai.router.core.d.d(r1, r2)     // Catch: java.lang.Throwable -> La2
            goto L98
        L95:
            int r5 = r5 + 1
            goto L62
        L98:
            java.lang.reflect.Method r1 = com.sankuai.waimai.router.utils.e.c     // Catch: java.lang.Throwable -> La2
        L9a:
            java.util.HashMap<java.lang.Class, java.lang.reflect.Method> r2 = com.sankuai.waimai.router.utils.e.b     // Catch: java.lang.Throwable -> La2
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> La2
            r2 = r1
        La0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La2
            goto La5
        La2:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La2
            throw r0
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.router.utils.e.b(java.lang.Class):java.lang.reflect.Method");
    }
}
