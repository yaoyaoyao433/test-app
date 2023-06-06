package com.sankuai.waimai.mach.model.value;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum k {
    left("left", 3),
    right("right", 5),
    center("center", 17),
    top("top", 48),
    bottom("bottom", 80),
    center_vertical("center-vertical", 16);
    
    public static ChangeQuickRedirect a;
    public String h;
    public int i;

    public static k valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61fdb33e7a5649d456800d666a718fdc", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61fdb33e7a5649d456800d666a718fdc") : (k) Enum.valueOf(k.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3f4960a9d8bc89afce0c06faf3a9579", RobustBitConfig.DEFAULT_VALUE) ? (k[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3f4960a9d8bc89afce0c06faf3a9579") : (k[]) values().clone();
    }

    k(String str, int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a036226ff96f80db25e8568cee36c68f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a036226ff96f80db25e8568cee36c68f");
            return;
        }
        this.h = str;
        this.i = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r12.equals("right") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.k a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.k.a
            java.lang.String r11 = "fcaa7690cb24fe10ef807dde0e7870ff"
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
            com.sankuai.waimai.mach.model.value.k r12 = (com.sankuai.waimai.mach.model.value.k) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1383228885: goto L5c;
                case -1364013995: goto L52;
                case -170316306: goto L48;
                case 115029: goto L3d;
                case 3317767: goto L32;
                case 108511772: goto L28;
                default: goto L27;
            }
        L27:
            goto L66
        L28:
            java.lang.String r2 = "right"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L66
            goto L67
        L32:
            java.lang.String r0 = "left"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 0
            goto L67
        L3d:
            java.lang.String r0 = "top"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 3
            goto L67
        L48:
            java.lang.String r0 = "center-vertical"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 5
            goto L67
        L52:
            java.lang.String r0 = "center"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 2
            goto L67
        L5c:
            java.lang.String r0 = "bottom"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 4
            goto L67
        L66:
            r0 = -1
        L67:
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L79;
                case 2: goto L76;
                case 3: goto L73;
                case 4: goto L70;
                case 5: goto L6d;
                default: goto L6a;
            }
        L6a:
            com.sankuai.waimai.mach.model.value.k r12 = com.sankuai.waimai.mach.model.value.k.left
            return r12
        L6d:
            com.sankuai.waimai.mach.model.value.k r12 = com.sankuai.waimai.mach.model.value.k.center_vertical
            return r12
        L70:
            com.sankuai.waimai.mach.model.value.k r12 = com.sankuai.waimai.mach.model.value.k.bottom
            return r12
        L73:
            com.sankuai.waimai.mach.model.value.k r12 = com.sankuai.waimai.mach.model.value.k.top
            return r12
        L76:
            com.sankuai.waimai.mach.model.value.k r12 = com.sankuai.waimai.mach.model.value.k.center
            return r12
        L79:
            com.sankuai.waimai.mach.model.value.k r12 = com.sankuai.waimai.mach.model.value.k.right
            return r12
        L7c:
            com.sankuai.waimai.mach.model.value.k r12 = com.sankuai.waimai.mach.model.value.k.left
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.k.a(java.lang.String):com.sankuai.waimai.mach.model.value.k");
    }
}
