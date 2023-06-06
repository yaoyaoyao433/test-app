package com.sankuai.waimai.mach.model.value;

import com.facebook.yoga.YogaPositionType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum f {
    RELATIVE("relative", YogaPositionType.RELATIVE),
    ABSOLUTE("absolute", YogaPositionType.ABSOLUTE);
    
    public static ChangeQuickRedirect a;
    public String d;
    public YogaPositionType e;

    public static f valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf3cf322d0e8278e63fcafbcc91430fc", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf3cf322d0e8278e63fcafbcc91430fc") : (f) Enum.valueOf(f.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c714b828cae02c44b37adf6d3918fef4", RobustBitConfig.DEFAULT_VALUE) ? (f[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c714b828cae02c44b37adf6d3918fef4") : (f[]) values().clone();
    }

    f(String str, YogaPositionType yogaPositionType) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, yogaPositionType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af398c3631008568705db9becf3c768d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af398c3631008568705db9becf3c768d");
            return;
        }
        this.d = str;
        this.e = yogaPositionType;
    }

    public final YogaPositionType a() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r12.equals("absolute") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.f a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.f.a
            java.lang.String r11 = "800aa86191e33abc6771e7d4593337f5"
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
            com.sankuai.waimai.mach.model.value.f r12 = (com.sankuai.waimai.mach.model.value.f) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            r3 = -554435892(0xffffffffdef3facc, float:-8.7902942E18)
            if (r2 == r3) goto L38
            r3 = 1728122231(0x67010d77, float:6.0943366E23)
            if (r2 == r3) goto L2f
            goto L43
        L2f:
            java.lang.String r2 = "absolute"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L43
            goto L44
        L38:
            java.lang.String r0 = "relative"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L43
            r0 = 0
            goto L44
        L43:
            r0 = -1
        L44:
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L4a;
                default: goto L47;
            }
        L47:
            com.sankuai.waimai.mach.model.value.f r12 = com.sankuai.waimai.mach.model.value.f.RELATIVE
            return r12
        L4a:
            com.sankuai.waimai.mach.model.value.f r12 = com.sankuai.waimai.mach.model.value.f.ABSOLUTE
            return r12
        L4d:
            com.sankuai.waimai.mach.model.value.f r12 = com.sankuai.waimai.mach.model.value.f.RELATIVE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.f.a(java.lang.String):com.sankuai.waimai.mach.model.value.f");
    }
}
