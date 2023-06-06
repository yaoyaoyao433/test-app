package com.sankuai.waimai.mach.utils;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r12.equals("top bottom") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.GradientDrawable.Orientation a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.utils.d.a
            java.lang.String r11 = "378fd18542eed521f2fb3963cc2fca55"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            android.graphics.drawable.GradientDrawable$Orientation r12 = (android.graphics.drawable.GradientDrawable.Orientation) r12
            return r12
        L1e:
            r1 = -1
            int r3 = r12.hashCode()
            switch(r3) {
                case -1684088352: goto La5;
                case -1592353692: goto L99;
                case -1570660015: goto L8e;
                case -1446068341: goto L83;
                case -1383228885: goto L79;
                case -1211365546: goto L6f;
                case 115029: goto L64;
                case 3317767: goto L58;
                case 108511772: goto L4d;
                case 655955139: goto L41;
                case 1621092527: goto L35;
                case 1716883900: goto L28;
                default: goto L26;
            }
        L26:
            goto Laf
        L28:
            java.lang.String r0 = "left top"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 11
            goto Lb0
        L35:
            java.lang.String r0 = "right bottom"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 5
            goto Lb0
        L41:
            java.lang.String r0 = "left right"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 10
            goto Lb0
        L4d:
            java.lang.String r0 = "right"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 3
            goto Lb0
        L58:
            java.lang.String r0 = "left"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 9
            goto Lb0
        L64:
            java.lang.String r0 = "top"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 0
            goto Lb0
        L6f:
            java.lang.String r3 = "top bottom"
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto Laf
            goto Lb0
        L79:
            java.lang.String r0 = "bottom"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 6
            goto Lb0
        L83:
            java.lang.String r0 = "right left"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 4
            goto Lb0
        L8e:
            java.lang.String r0 = "right top"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 2
            goto Lb0
        L99:
            java.lang.String r0 = "left bottom"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 8
            goto Lb0
        La5:
            java.lang.String r0 = "bottom top"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto Laf
            r0 = 7
            goto Lb0
        Laf:
            r0 = -1
        Lb0:
            switch(r0) {
                case 0: goto Lc9;
                case 1: goto Lc9;
                case 2: goto Lc6;
                case 3: goto Lc3;
                case 4: goto Lc3;
                case 5: goto Lc0;
                case 6: goto Lbd;
                case 7: goto Lbd;
                case 8: goto Lba;
                case 9: goto Lb7;
                case 10: goto Lb7;
                case 11: goto Lb4;
                default: goto Lb3;
            }
        Lb3:
            return r2
        Lb4:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            return r12
        Lb7:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            return r12
        Lba:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR
            return r12
        Lbd:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            return r12
        Lc0:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.BR_TL
            return r12
        Lc3:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            return r12
        Lc6:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            return r12
        Lc9:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.utils.d.a(java.lang.String):android.graphics.drawable.GradientDrawable$Orientation");
    }
}
