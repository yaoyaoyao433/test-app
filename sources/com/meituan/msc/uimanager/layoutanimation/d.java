package com.meituan.msc.uimanager.layoutanimation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum d {
    LINEAR,
    EASE_IN,
    EASE_OUT,
    EASE_IN_EASE_OUT,
    SPRING;
    
    public static ChangeQuickRedirect a;

    d() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fa20eb8b7dac4da1e193a49a5921304", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fa20eb8b7dac4da1e193a49a5921304");
        }
    }

    public static d valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff0e792b76e7da39d6e43cdcda3fd1db", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff0e792b76e7da39d6e43cdcda3fd1db") : (d) Enum.valueOf(d.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e2978718d8678c02de87cda6bf5c383", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e2978718d8678c02de87cda6bf5c383") : (d[]) values().clone();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r1.equals("easein") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.msc.uimanager.layoutanimation.d a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.uimanager.layoutanimation.d.a
            java.lang.String r11 = "1033e4c5c35abb2f5967cf5bbc40b0c9"
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
            com.meituan.msc.uimanager.layoutanimation.d r12 = (com.meituan.msc.uimanager.layoutanimation.d) r12
            return r12
        L1f:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = r12.toLowerCase(r1)
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1965056864: goto L57;
                case -1310315117: goto L4e;
                case -1102672091: goto L43;
                case -895679987: goto L38;
                case 1164546989: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L61
        L2e:
            java.lang.String r0 = "easeineaseout"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L61
            r0 = 3
            goto L62
        L38:
            java.lang.String r0 = "spring"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L61
            r0 = 4
            goto L62
        L43:
            java.lang.String r0 = "linear"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L61
            r0 = 0
            goto L62
        L4e:
            java.lang.String r3 = "easein"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L61
            goto L62
        L57:
            java.lang.String r0 = "easeout"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L61
            r0 = 2
            goto L62
        L61:
            r0 = -1
        L62:
            switch(r0) {
                case 0: goto L85;
                case 1: goto L82;
                case 2: goto L7f;
                case 3: goto L7c;
                case 4: goto L79;
                default: goto L65;
            }
        L65:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported interpolation type : "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L79:
            com.meituan.msc.uimanager.layoutanimation.d r12 = com.meituan.msc.uimanager.layoutanimation.d.SPRING
            return r12
        L7c:
            com.meituan.msc.uimanager.layoutanimation.d r12 = com.meituan.msc.uimanager.layoutanimation.d.EASE_IN_EASE_OUT
            return r12
        L7f:
            com.meituan.msc.uimanager.layoutanimation.d r12 = com.meituan.msc.uimanager.layoutanimation.d.EASE_OUT
            return r12
        L82:
            com.meituan.msc.uimanager.layoutanimation.d r12 = com.meituan.msc.uimanager.layoutanimation.d.EASE_IN
            return r12
        L85:
            com.meituan.msc.uimanager.layoutanimation.d r12 = com.meituan.msc.uimanager.layoutanimation.d.LINEAR
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.layoutanimation.d.a(java.lang.String):com.meituan.msc.uimanager.layoutanimation.d");
    }
}
