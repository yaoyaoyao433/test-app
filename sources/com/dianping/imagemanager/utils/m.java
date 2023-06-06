package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
        return com.meituan.android.privacy.interfaces.Privacy.createContentResolver(com.dianping.imagemanager.base.b.a().e, r20).b(android.net.Uri.parse(r19));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream a(java.lang.String r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10 = 0
            r2[r10] = r0
            r11 = 1
            r2[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r12 = com.dianping.imagemanager.utils.m.a
            java.lang.String r13 = "885599560dda106b9e45b52a823ad10c"
            r4 = 0
            r6 = 1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r2
            r5 = r12
            r7 = r13
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L25
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r4, r12, r11, r13)
            java.io.InputStream r0 = (java.io.InputStream) r0
            return r0
        L25:
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch: java.io.FileNotFoundException -> L71
            r2[r10] = r0     // Catch: java.io.FileNotFoundException -> L71
            com.meituan.robust.ChangeQuickRedirect r3 = com.dianping.imagemanager.utils.m.a     // Catch: java.io.FileNotFoundException -> L71
            java.lang.String r5 = "2c96c8abd1b6c06e26926bcfe1f6e909"
            r13 = 0
            r15 = 1
            r17 = 4611686018427387904(0x4000000000000000, double:2.0)
            r12 = r2
            r14 = r3
            r16 = r5
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17)     // Catch: java.io.FileNotFoundException -> L71
            if (r6 == 0) goto L46
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r2, r4, r3, r11, r5)     // Catch: java.io.FileNotFoundException -> L71
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.io.FileNotFoundException -> L71
            boolean r10 = r2.booleanValue()     // Catch: java.io.FileNotFoundException -> L71
            goto L55
        L46:
            if (r0 == 0) goto L55
            int r2 = r19.length()     // Catch: java.io.FileNotFoundException -> L71
            if (r2 != 0) goto L4f
            goto L55
        L4f:
            java.lang.String r2 = "content://"
            boolean r10 = r0.startsWith(r2)     // Catch: java.io.FileNotFoundException -> L71
        L55:
            if (r10 == 0) goto L6a
            com.dianping.imagemanager.base.b r2 = com.dianping.imagemanager.base.b.a()     // Catch: java.io.FileNotFoundException -> L71
            android.content.Context r2 = r2.e     // Catch: java.io.FileNotFoundException -> L71
            com.meituan.android.privacy.interfaces.t r1 = com.meituan.android.privacy.interfaces.Privacy.createContentResolver(r2, r1)     // Catch: java.io.FileNotFoundException -> L71
            android.net.Uri r0 = android.net.Uri.parse(r19)     // Catch: java.io.FileNotFoundException -> L71
            java.io.InputStream r0 = r1.b(r0)     // Catch: java.io.FileNotFoundException -> L71
            goto L76
        L6a:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L71
            r1.<init>(r0)     // Catch: java.io.FileNotFoundException -> L71
            r0 = r1
            goto L76
        L71:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r4
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.imagemanager.utils.m.a(java.lang.String, java.lang.String):java.io.InputStream");
    }
}
