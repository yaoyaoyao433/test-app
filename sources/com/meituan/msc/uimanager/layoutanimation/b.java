package com.meituan.msc.uimanager.layoutanimation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;
    
    public static ChangeQuickRedirect a;

    b() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea383b5c6fef7395323fed8c5f7afaa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea383b5c6fef7395323fed8c5f7afaa7");
        }
    }

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ee0ab1049e4bab3dbc81e0a2960a5f3", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ee0ab1049e4bab3dbc81e0a2960a5f3") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6b91d12c60f669f920e9bfa8fb309b5", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6b91d12c60f669f920e9bfa8fb309b5") : (b[]) values().clone();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r12.equals(com.meituan.android.recce.views.anim.RecceAnimUtils.SCALE_X) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.msc.uimanager.layoutanimation.b a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.layoutanimation.b.a
            java.lang.String r11 = "b0a197d4461429ee451dac9fe1bad9b8"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            com.meituan.msc.uimanager.layoutanimation.b r12 = (com.meituan.msc.uimanager.layoutanimation.b) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1267206133: goto L48;
                case -908189618: goto L3e;
                case -908189617: goto L33;
                case 1910893003: goto L28;
                default: goto L27;
            }
        L27:
            goto L53
        L28:
            java.lang.String r0 = "scaleXY"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L53
            r0 = 3
            goto L54
        L33:
            java.lang.String r0 = "scaleY"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L53
            r0 = 2
            goto L54
        L3e:
            java.lang.String r2 = "scaleX"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L53
            goto L54
        L48:
            java.lang.String r0 = "opacity"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L53
            r0 = 0
            goto L54
        L53:
            r0 = -1
        L54:
            switch(r0) {
                case 0: goto L74;
                case 1: goto L71;
                case 2: goto L6e;
                case 3: goto L6b;
                default: goto L57;
            }
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported animated property: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L6b:
            com.meituan.msc.uimanager.layoutanimation.b r12 = com.meituan.msc.uimanager.layoutanimation.b.SCALE_XY
            return r12
        L6e:
            com.meituan.msc.uimanager.layoutanimation.b r12 = com.meituan.msc.uimanager.layoutanimation.b.SCALE_Y
            return r12
        L71:
            com.meituan.msc.uimanager.layoutanimation.b r12 = com.meituan.msc.uimanager.layoutanimation.b.SCALE_X
            return r12
        L74:
            com.meituan.msc.uimanager.layoutanimation.b r12 = com.meituan.msc.uimanager.layoutanimation.b.OPACITY
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.layoutanimation.b.a(java.lang.String):com.meituan.msc.uimanager.layoutanimation.b");
    }
}
