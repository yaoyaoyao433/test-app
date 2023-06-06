package com.dianping.networklog;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static final Object b = new Object();
    private static volatile String c;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "235518f84f3d6c53d45a35310cadacbe", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "235518f84f3d6c53d45a35310cadacbe")).booleanValue() : com.dianping.logreportswitcher.utils.e.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r18) {
        /*
            r1 = 1
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r10 = 0
            r9[r10] = r18
            com.meituan.robust.ChangeQuickRedirect r11 = com.dianping.networklog.j.a
            java.lang.String r12 = "6f327b1458be140676cb1dae35c1079c"
            r3 = 0
            r5 = 1
            r7 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r2 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L1e
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r3, r11, r1, r12)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1e:
            java.lang.String r2 = com.dianping.networklog.j.c
            if (r2 != 0) goto L88
            java.lang.Object r4 = com.dianping.networklog.j.b
            monitor-enter(r4)
            java.lang.String r2 = com.dianping.networklog.j.c     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L83
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L85
            r5[r10] = r18     // Catch: java.lang.Throwable -> L85
            com.meituan.robust.ChangeQuickRedirect r6 = com.dianping.networklog.j.a     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = "0d52268ec26ad0d9892d97356fb977be"
            r12 = 0
            r14 = 1
            r16 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r11 = r5
            r13 = r6
            r15 = r7
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L45
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r5, r3, r6, r1, r7)     // Catch: java.lang.Throwable -> L85
        L42:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L85
            goto L63
        L45:
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L85
            r12[r10] = r18     // Catch: java.lang.Throwable -> L85
            com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.logreportswitcher.utils.e.a     // Catch: java.lang.Throwable -> L85
            java.lang.String r14 = "bc2c5186d70f2b715a7d951059825b6e"
            r6 = 0
            r8 = 1
            r10 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r5 = r12
            r7 = r13
            r9 = r14
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L85
            if (r5 == 0) goto L5f
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r3, r13, r1, r14)     // Catch: java.lang.Throwable -> L85
            goto L42
        L5f:
            java.lang.String r3 = com.sankuai.common.utils.ProcessUtils.getCurrentProcessName(r18)     // Catch: java.lang.Throwable -> L85
        L63:
            java.lang.String r0 = r18.getPackageName()     // Catch: java.lang.Throwable -> L85
            boolean r0 = android.text.TextUtils.equals(r3, r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L70
            java.lang.String r2 = "main"
            goto L81
        L70:
            if (r3 == 0) goto L81
            r0 = 58
            int r0 = r3.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 < 0) goto L80
            int r0 = r0 + r1
            java.lang.String r2 = r3.substring(r0)     // Catch: java.lang.Throwable -> L85
            goto L81
        L80:
            r2 = r3
        L81:
            com.dianping.networklog.j.c = r2     // Catch: java.lang.Throwable -> L85
        L83:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L85
            goto L88
        L85:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L85
            throw r0
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.networklog.j.b(android.content.Context):java.lang.String");
    }
}
