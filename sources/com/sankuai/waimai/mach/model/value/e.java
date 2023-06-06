package com.sankuai.waimai.mach.model.value;

import com.facebook.yoga.YogaFlexDirection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum e {
    row("row", YogaFlexDirection.ROW),
    column("column", YogaFlexDirection.COLUMN),
    row_reverse("row-reverse", YogaFlexDirection.ROW_REVERSE),
    column_reverse("column-reverse", YogaFlexDirection.COLUMN_REVERSE);
    
    public static ChangeQuickRedirect a;
    public String f;
    public YogaFlexDirection g;

    public static e valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b91cdbb69f87c1e8d53bcbbe47f5b41", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b91cdbb69f87c1e8d53bcbbe47f5b41") : (e) Enum.valueOf(e.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "892f7e6451825b0e732a2469ed5b91d4", RobustBitConfig.DEFAULT_VALUE) ? (e[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "892f7e6451825b0e732a2469ed5b91d4") : (e[]) values().clone();
    }

    e(String str, YogaFlexDirection yogaFlexDirection) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, yogaFlexDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e01561fb1da74a606d44ecb9689c02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e01561fb1da74a606d44ecb9689c02");
            return;
        }
        this.f = str;
        this.g = yogaFlexDirection;
    }

    public final YogaFlexDirection a() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r12.equals("column") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.model.value.e a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.model.value.e.a
            java.lang.String r11 = "87983ee6bc04ae6f781db7818df39e1f"
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
            com.sankuai.waimai.mach.model.value.e r12 = (com.sankuai.waimai.mach.model.value.e) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            r3 = -1448970769(0xffffffffa9a275ef, float:-7.2147034E-14)
            if (r2 == r3) goto L57
            r3 = -1354837162(0xffffffffaf3ed356, float:-1.7355481E-10)
            if (r2 == r3) goto L4e
            r0 = 113114(0x1b9da, float:1.58506E-40)
            if (r2 == r0) goto L43
            r0 = 1272730475(0x4bdc536b, float:2.887855E7)
            if (r2 == r0) goto L39
            goto L62
        L39:
            java.lang.String r0 = "column-reverse"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L62
            r0 = 3
            goto L63
        L43:
            java.lang.String r0 = "row"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L62
            r0 = 0
            goto L63
        L4e:
            java.lang.String r2 = "column"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L62
            goto L63
        L57:
            java.lang.String r0 = "row-reverse"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L62
            r0 = 2
            goto L63
        L62:
            r0 = -1
        L63:
            switch(r0) {
                case 0: goto L72;
                case 1: goto L6f;
                case 2: goto L6c;
                case 3: goto L69;
                default: goto L66;
            }
        L66:
            com.sankuai.waimai.mach.model.value.e r12 = com.sankuai.waimai.mach.model.value.e.row
            return r12
        L69:
            com.sankuai.waimai.mach.model.value.e r12 = com.sankuai.waimai.mach.model.value.e.column_reverse
            return r12
        L6c:
            com.sankuai.waimai.mach.model.value.e r12 = com.sankuai.waimai.mach.model.value.e.row_reverse
            return r12
        L6f:
            com.sankuai.waimai.mach.model.value.e r12 = com.sankuai.waimai.mach.model.value.e.column
            return r12
        L72:
            com.sankuai.waimai.mach.model.value.e r12 = com.sankuai.waimai.mach.model.value.e.row
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.model.value.e.a(java.lang.String):com.sankuai.waimai.mach.model.value.e");
    }
}
