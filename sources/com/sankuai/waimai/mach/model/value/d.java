package com.sankuai.waimai.mach.model.value;

import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.yoga.YogaAlign;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum d {
    flex_start("flex-start", YogaAlign.FLEX_START),
    flex_end("flex-end", YogaAlign.FLEX_END),
    stretch(DynamicTitleParser.PARSER_KEY_STRETCH, YogaAlign.STRETCH),
    center("center", YogaAlign.CENTER),
    space_between("space-between", YogaAlign.SPACE_BETWEEN),
    space_around("space-around", YogaAlign.SPACE_AROUND);
    
    public static ChangeQuickRedirect a;
    public String h;
    public YogaAlign i;

    public static d valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c60438ae902cc8cca96f74677a424678", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c60438ae902cc8cca96f74677a424678") : (d) Enum.valueOf(d.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "900f46ddb4c3737b1de621b90d088abd", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "900f46ddb4c3737b1de621b90d088abd") : (d[]) values().clone();
    }

    d(String str, YogaAlign yogaAlign) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, yogaAlign};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6735b77920763a04cc0a46b2ee29824", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6735b77920763a04cc0a46b2ee29824");
            return;
        }
        this.h = str;
        this.i = yogaAlign;
    }

    public final YogaAlign a() {
        return this.i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r12.equals("flex-end") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.d a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.d.a
            java.lang.String r11 = "897ebdfc28ea6f6f9c777e0da009e43c"
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
            com.sankuai.waimai.mach.model.value.d r12 = (com.sankuai.waimai.mach.model.value.d) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1881872635: goto L5b;
                case -1364013995: goto L51;
                case -46581362: goto L47;
                case 441309761: goto L3c;
                case 1742952711: goto L33;
                case 1937124468: goto L28;
                default: goto L27;
            }
        L27:
            goto L66
        L28:
            java.lang.String r0 = "space-around"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 5
            goto L67
        L33:
            java.lang.String r2 = "flex-end"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L66
            goto L67
        L3c:
            java.lang.String r0 = "space-between"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 4
            goto L67
        L47:
            java.lang.String r0 = "flex-start"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 0
            goto L67
        L51:
            java.lang.String r0 = "center"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 3
            goto L67
        L5b:
            java.lang.String r0 = "stretch"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L66
            r0 = 2
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
            com.sankuai.waimai.mach.model.value.d r12 = com.sankuai.waimai.mach.model.value.d.stretch
            return r12
        L6d:
            com.sankuai.waimai.mach.model.value.d r12 = com.sankuai.waimai.mach.model.value.d.space_around
            return r12
        L70:
            com.sankuai.waimai.mach.model.value.d r12 = com.sankuai.waimai.mach.model.value.d.space_between
            return r12
        L73:
            com.sankuai.waimai.mach.model.value.d r12 = com.sankuai.waimai.mach.model.value.d.center
            return r12
        L76:
            com.sankuai.waimai.mach.model.value.d r12 = com.sankuai.waimai.mach.model.value.d.stretch
            return r12
        L79:
            com.sankuai.waimai.mach.model.value.d r12 = com.sankuai.waimai.mach.model.value.d.flex_end
            return r12
        L7c:
            com.sankuai.waimai.mach.model.value.d r12 = com.sankuai.waimai.mach.model.value.d.flex_start
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.d.a(java.lang.String):com.sankuai.waimai.mach.model.value.d");
    }
}
