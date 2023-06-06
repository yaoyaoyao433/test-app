package com.sankuai.waimai.mach.model.value;

import com.facebook.yoga.YogaWrap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum g {
    wrap("wrap", YogaWrap.WRAP),
    no_wrap("no-wrap", YogaWrap.NO_WRAP),
    wrap_reverse("wrap-reverse", YogaWrap.WRAP_REVERSE);
    
    public static ChangeQuickRedirect a;
    public String e;
    public YogaWrap f;

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "362d2a32f86b11f04f7cd223c2583dd2", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "362d2a32f86b11f04f7cd223c2583dd2") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "473d602bb39ee611744b835a470ea2d1", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "473d602bb39ee611744b835a470ea2d1") : (g[]) values().clone();
    }

    g(String str, YogaWrap yogaWrap) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, yogaWrap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f95173ff2a1237af799cc75697b58c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f95173ff2a1237af799cc75697b58c8");
            return;
        }
        this.e = str;
        this.f = yogaWrap;
    }

    public final YogaWrap a() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r12.equals("no-wrap") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.g a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.g.a
            java.lang.String r11 = "ea6babcb92d5f5a73b5122e68ef57274"
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
            com.sankuai.waimai.mach.model.value.g r12 = (com.sankuai.waimai.mach.model.value.g) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            r3 = -749527969(0xffffffffd3531c5f, float:-9.0671409E11)
            if (r2 == r3) goto L49
            r3 = 3657802(0x37d04a, float:5.125672E-39)
            if (r2 == r3) goto L3e
            r3 = 2064209110(0x7b0954d6, float:7.1306535E35)
            if (r2 == r3) goto L34
            goto L54
        L34:
            java.lang.String r2 = "no-wrap"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L54
            goto L55
        L3e:
            java.lang.String r0 = "wrap"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L54
            r0 = 0
            goto L55
        L49:
            java.lang.String r0 = "wrap-reverse"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L54
            r0 = 2
            goto L55
        L54:
            r0 = -1
        L55:
            switch(r0) {
                case 0: goto L61;
                case 1: goto L5e;
                case 2: goto L5b;
                default: goto L58;
            }
        L58:
            com.sankuai.waimai.mach.model.value.g r12 = com.sankuai.waimai.mach.model.value.g.no_wrap
            return r12
        L5b:
            com.sankuai.waimai.mach.model.value.g r12 = com.sankuai.waimai.mach.model.value.g.wrap_reverse
            return r12
        L5e:
            com.sankuai.waimai.mach.model.value.g r12 = com.sankuai.waimai.mach.model.value.g.no_wrap
            return r12
        L61:
            com.sankuai.waimai.mach.model.value.g r12 = com.sankuai.waimai.mach.model.value.g.wrap
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.g.a(java.lang.String):com.sankuai.waimai.mach.model.value.g");
    }
}
