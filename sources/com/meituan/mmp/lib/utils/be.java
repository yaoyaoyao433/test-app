package com.meituan.mmp.lib.utils;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class be {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0.isHorizontallyScrollable() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.View r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.utils.be.a
            java.lang.String r11 = "0dc424123a2db385610805507ee6e638"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r12 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            return
        L1c:
            boolean r0 = r12 instanceof android.widget.TextView
            if (r0 == 0) goto L3b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L35
            r0 = r12
            android.widget.TextView r0 = (android.widget.TextView) r0
            boolean r1 = r0.isSingleLine()
            if (r1 == 0) goto L3b
            boolean r0 = r0.isHorizontallyScrollable()
            if (r0 == 0) goto L3b
        L35:
            r0 = r12
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setHorizontallyScrolling(r9)
        L3b:
            boolean r0 = r12 instanceof android.view.ViewGroup
            if (r0 == 0) goto L52
        L3f:
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            if (r9 >= r1) goto L52
            android.view.View r0 = r0.getChildAt(r9)
            a(r0)
            int r9 = r9 + 1
            goto L3f
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.utils.be.a(android.view.View):void");
    }
}
