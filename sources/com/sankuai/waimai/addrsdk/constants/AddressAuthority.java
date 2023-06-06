package com.sankuai.waimai.addrsdk.constants;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public enum AddressAuthority {
    WM("meituanwaimai://waimai.meituan.com"),
    MT("imeituan://www.meituan.com"),
    DP("dianping:/"),
    NULL("");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String type;

    public static AddressAuthority valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4ff454ef1d5916a44c0858336610e73", RobustBitConfig.DEFAULT_VALUE) ? (AddressAuthority) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4ff454ef1d5916a44c0858336610e73") : (AddressAuthority) Enum.valueOf(AddressAuthority.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AddressAuthority[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e08e04c0b641a97bce4d341f2a5a4708", RobustBitConfig.DEFAULT_VALUE) ? (AddressAuthority[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e08e04c0b641a97bce4d341f2a5a4708") : (AddressAuthority[]) values().clone();
    }

    AddressAuthority(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f2017821a25ec3e4d26788ebd5da5f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f2017821a25ec3e4d26788ebd5da5f0");
        } else {
            this.type = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r12.equals("mt") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String flexValueOf(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.addrsdk.constants.AddressAuthority.changeQuickRedirect
            java.lang.String r11 = "2889e087f3ef83a4a2276377d97f1575"
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
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            r3 = 3212(0xc8c, float:4.501E-42)
            if (r2 == r3) goto L46
            r3 = 3495(0xda7, float:4.898E-42)
            if (r2 == r3) goto L3c
            r0 = 3798(0xed6, float:5.322E-42)
            if (r2 == r0) goto L31
            goto L50
        L31:
            java.lang.String r0 = "wm"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L50
            r0 = 0
            goto L51
        L3c:
            java.lang.String r2 = "mt"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L50
            goto L51
        L46:
            java.lang.String r0 = "dp"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L50
            r0 = 2
            goto L51
        L50:
            r0 = -1
        L51:
            switch(r0) {
                case 0: goto L5e;
                case 1: goto L5a;
                case 2: goto L57;
                default: goto L54;
            }
        L54:
            java.lang.String r12 = ""
            return r12
        L57:
            java.lang.String r12 = "dianping:/"
            return r12
        L5a:
            java.lang.String r12 = "imeituan://www.meituan.com"
            return r12
        L5e:
            java.lang.String r12 = "meituanwaimai://waimai.meituan.com"
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.addrsdk.constants.AddressAuthority.flexValueOf(java.lang.String):java.lang.String");
    }
}
