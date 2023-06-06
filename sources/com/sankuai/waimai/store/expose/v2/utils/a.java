package com.sankuai.waimai.store.expose.v2.utils;

import android.graphics.Rect;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.view.View r12, android.graphics.Rect r13) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.store.expose.v2.utils.a.a
            java.lang.String r11 = "7c64bb120d99f23db986bc3a1ff14f7d"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r9, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L26:
            if (r12 == 0) goto L68
            if (r13 != 0) goto L2b
            goto L68
        L2b:
            boolean r0 = b(r12)
            if (r0 != 0) goto L32
            return r8
        L32:
            android.graphics.Rect r0 = a(r12)
            boolean r13 = android.graphics.Rect.intersects(r13, r0)
            if (r13 == 0) goto L67
        L3c:
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            int r1 = r12.getId()
            if (r13 == r1) goto L66
            android.view.ViewParent r13 = r12.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 != 0) goto L4e
            return r8
        L4e:
            android.view.ViewParent r12 = r12.getParent()
            android.view.View r12 = (android.view.View) r12
            boolean r13 = b(r12)
            if (r13 != 0) goto L5b
            return r8
        L5b:
            android.graphics.Rect r13 = a(r12)
            boolean r13 = android.graphics.Rect.intersects(r13, r0)
            if (r13 != 0) goto L3c
            return r8
        L66:
            return r9
        L67:
            return r8
        L68:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.expose.v2.utils.a.a(android.view.View, android.graphics.Rect):boolean");
    }

    private static boolean b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21779aef9b44befd2d717bbb83e48dd5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21779aef9b44befd2d717bbb83e48dd5")).booleanValue() : (view == null || view.getVisibility() != 0 || view.getWidth() == 0 || view.getHeight() == 0 || 0.0f == view.getAlpha()) ? false : true;
    }

    public static Rect a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99a6921fdec24c388e34dcebe5392908", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99a6921fdec24c388e34dcebe5392908");
        }
        if (view == null) {
            return new Rect(0, 0, 0, 0);
        }
        int top = view.getTop();
        int bottom = view.getBottom();
        int left = view.getLeft();
        int right = view.getRight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], (right - left) + iArr[0], (bottom - top) + iArr[1]);
    }
}
