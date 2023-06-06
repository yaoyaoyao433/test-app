package com.sankuai.waimai.business.page.home.utils;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o {
    public static ChangeQuickRedirect a;
    public static Map<String, String> b;
    private static String c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r1.equals("1") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a() {
        /*
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.page.home.utils.o.a
            java.lang.String r10 = "e931e383de026c03b8ce0eec3c5ec5fd"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r2 = 1
            if (r1 == 0) goto L21
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r0, r9, r2, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L21:
            java.lang.String r1 = com.sankuai.waimai.business.page.home.utils.o.c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = -1
            if (r1 == 0) goto L2b
            return r3
        L2b:
            java.lang.String r1 = com.sankuai.waimai.business.page.home.utils.o.c
            int r4 = r1.hashCode()
            switch(r4) {
                case 49: goto L3f;
                case 50: goto L35;
                default: goto L34;
            }
        L34:
            goto L48
        L35:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L48
            r0 = 1
            goto L49
        L3f:
            java.lang.String r4 = "1"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L48
            goto L49
        L48:
            r0 = -1
        L49:
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L4d;
                default: goto L4c;
            }
        L4c:
            return r3
        L4d:
            r0 = 2
            return r0
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.utils.o.a():int");
    }
}
