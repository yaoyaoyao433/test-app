package com.sankuai.waimai.mach.model.value;

import com.facebook.yoga.YogaJustify;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum c {
    flex_start("flex-start", YogaJustify.FLEX_START),
    flex_end("flex-end", YogaJustify.FLEX_END),
    center("center", YogaJustify.CENTER),
    space_between("space-between", YogaJustify.SPACE_BETWEEN),
    space_around("space-around", YogaJustify.SPACE_AROUND);
    
    public static ChangeQuickRedirect a;
    public String g;
    public YogaJustify h;

    public static c valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae5505db6dfcd9f1d05773825feea5c6", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae5505db6dfcd9f1d05773825feea5c6") : (c) Enum.valueOf(c.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942854ef396a693d8499d4aaf50a108e", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942854ef396a693d8499d4aaf50a108e") : (c[]) values().clone();
    }

    c(String str, YogaJustify yogaJustify) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, yogaJustify};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b962de1abdad8e843fc8db07b66b21f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b962de1abdad8e843fc8db07b66b21f");
            return;
        }
        this.g = str;
        this.h = yogaJustify;
    }

    public final YogaJustify a() {
        return this.h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r12.equals("flex-end") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.c a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.c.a
            java.lang.String r11 = "e355e44ac33a313b6742677a15b4f9b8"
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
            com.sankuai.waimai.mach.model.value.c r12 = (com.sankuai.waimai.mach.model.value.c) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1364013995: goto L51;
                case -46581362: goto L47;
                case 441309761: goto L3c;
                case 1742952711: goto L33;
                case 1937124468: goto L28;
                default: goto L27;
            }
        L27:
            goto L5b
        L28:
            java.lang.String r0 = "space-around"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L5b
            r0 = 4
            goto L5c
        L33:
            java.lang.String r2 = "flex-end"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L5b
            goto L5c
        L3c:
            java.lang.String r0 = "space-between"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L5b
            r0 = 3
            goto L5c
        L47:
            java.lang.String r0 = "flex-start"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L5b
            r0 = 0
            goto L5c
        L51:
            java.lang.String r0 = "center"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L5b
            r0 = 2
            goto L5c
        L5b:
            r0 = -1
        L5c:
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L6b;
                case 2: goto L68;
                case 3: goto L65;
                case 4: goto L62;
                default: goto L5f;
            }
        L5f:
            com.sankuai.waimai.mach.model.value.c r12 = com.sankuai.waimai.mach.model.value.c.flex_start
            return r12
        L62:
            com.sankuai.waimai.mach.model.value.c r12 = com.sankuai.waimai.mach.model.value.c.space_around
            return r12
        L65:
            com.sankuai.waimai.mach.model.value.c r12 = com.sankuai.waimai.mach.model.value.c.space_between
            return r12
        L68:
            com.sankuai.waimai.mach.model.value.c r12 = com.sankuai.waimai.mach.model.value.c.center
            return r12
        L6b:
            com.sankuai.waimai.mach.model.value.c r12 = com.sankuai.waimai.mach.model.value.c.flex_end
            return r12
        L6e:
            com.sankuai.waimai.mach.model.value.c r12 = com.sankuai.waimai.mach.model.value.c.flex_start
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.c.a(java.lang.String):com.sankuai.waimai.mach.model.value.c");
    }
}
