package com.sankuai.waimai.touchmatrix.dialog.gesture;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (java.lang.Math.abs(r23) <= android.view.ViewConfiguration.get(com.meituan.android.singleton.b.a).getScaledMinimumFlingVelocity()) goto L13;
     */
    @Override // com.sankuai.waimai.touchmatrix.dialog.gesture.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.View r21, float r22, float r23, boolean r24) {
        /*
            r20 = this;
            r1 = r23
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10 = 0
            r2[r10] = r21
            java.lang.Float r3 = java.lang.Float.valueOf(r22)
            r11 = 1
            r2[r11] = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r23)
            r12 = 2
            r2[r12] = r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r24)
            r4 = 3
            r2[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.sankuai.waimai.touchmatrix.dialog.gesture.a.a
            java.lang.String r14 = "afcef3aec61bf97e859eadf6f47a1a13"
            r6 = 0
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r2
            r4 = r20
            r5 = r13
            r7 = r14
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L3c
            r3 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r13, r10, r14)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L3c:
            r3 = r20
            if (r21 != 0) goto L41
            return r10
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "DefaultGestureDismissStrategy, YVelocity: "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r4 = " dis: "
            r2.append(r4)
            float r0 = r21.getTranslationY()
            float r0 = java.lang.Math.abs(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.a(r0, r2)
            r0 = 0
            if (r24 == 0) goto L6c
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L83
            goto L70
        L6c:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L83
        L70:
            float r0 = java.lang.Math.abs(r23)
            android.content.Context r1 = com.meituan.android.singleton.b.a
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledMinimumFlingVelocity()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc9
        L83:
            float r0 = java.lang.Math.abs(r22)
            android.content.Context r1 = com.meituan.android.singleton.b.a
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r10] = r1
            r4 = 1101004800(0x41a00000, float:20.0)
            java.lang.Float r5 = java.lang.Float.valueOf(r4)
            r2[r11] = r5
            com.meituan.robust.ChangeQuickRedirect r5 = com.sankuai.waimai.touchmatrix.utils.g.a
            java.lang.String r6 = "d9ad5aeb88e53a49816f9274c05daf55"
            r14 = 0
            r16 = 1
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            r13 = r2
            r15 = r5
            r17 = r6
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18)
            if (r7 == 0) goto Lb4
            r1 = 0
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r2, r1, r5, r11, r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto Lc4
        Lb4:
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r4
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
        Lc4:
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lca
        Lc9:
            return r11
        Lca:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.touchmatrix.dialog.gesture.a.a(android.view.View, float, float, boolean):boolean");
    }
}
