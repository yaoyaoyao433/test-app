package com.sankuai.waimai.mach.model.value;

import com.facebook.yoga.YogaDirection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum i {
    ltr("ltr", YogaDirection.LTR),
    rtl("rtl", YogaDirection.RTL);
    
    public static ChangeQuickRedirect a;
    public String d;
    public YogaDirection e;

    public static i valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3253ab2a319ae5556021fafd74a466dc", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3253ab2a319ae5556021fafd74a466dc") : (i) Enum.valueOf(i.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06cc13549bf7b12f98db53ab89b12bf8", RobustBitConfig.DEFAULT_VALUE) ? (i[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06cc13549bf7b12f98db53ab89b12bf8") : (i[]) values().clone();
    }

    i(String str, YogaDirection yogaDirection) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, yogaDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22835216ff13329e8b80720dace7807", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22835216ff13329e8b80720dace7807");
            return;
        }
        this.d = str;
        this.e = yogaDirection;
    }

    public final YogaDirection a() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r12.equals("rtl") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.i a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.i.a
            java.lang.String r11 = "e1b35e8bf40645ba1c754cc9c5d4aab8"
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
            com.sankuai.waimai.mach.model.value.i r12 = (com.sankuai.waimai.mach.model.value.i) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            r3 = 107498(0x1a3ea, float:1.50637E-40)
            if (r2 == r3) goto L39
            r3 = 113258(0x1ba6a, float:1.58708E-40)
            if (r2 == r3) goto L2f
            goto L44
        L2f:
            java.lang.String r2 = "rtl"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L44
            goto L45
        L39:
            java.lang.String r0 = "ltr"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L44
            r0 = 0
            goto L45
        L44:
            r0 = -1
        L45:
            switch(r0) {
                case 0: goto L4e;
                case 1: goto L4b;
                default: goto L48;
            }
        L48:
            com.sankuai.waimai.mach.model.value.i r12 = com.sankuai.waimai.mach.model.value.i.ltr
            return r12
        L4b:
            com.sankuai.waimai.mach.model.value.i r12 = com.sankuai.waimai.mach.model.value.i.rtl
            return r12
        L4e:
            com.sankuai.waimai.mach.model.value.i r12 = com.sankuai.waimai.mach.model.value.i.ltr
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.i.a(java.lang.String):com.sankuai.waimai.mach.model.value.i");
    }
}
