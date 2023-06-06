package com.sankuai.waimai.alita.core.mlmodel.predictor;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r1.getFloatData() != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r1.getIntData() != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.util.List<com.sankuai.waimai.alita.core.mlmodel.predictor.bean.AlitaTensor> r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.alita.core.mlmodel.predictor.e.a
            java.lang.String r11 = "2d03e7a8cb60d9edcb1ff5094c339af1"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L23:
            boolean r1 = com.sankuai.common.utils.CollectionUtils.isEmpty(r12)
            if (r1 == 0) goto L2b
            r1 = 0
            goto L69
        L2b:
            java.util.Iterator r12 = r12.iterator()
            r1 = 1
        L30:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r1 = r12.next()
            com.sankuai.waimai.alita.core.mlmodel.predictor.bean.AlitaTensor r1 = (com.sankuai.waimai.alita.core.mlmodel.predictor.bean.AlitaTensor) r1
            if (r1 == 0) goto L68
            java.lang.String r2 = r1.getName()
            if (r2 != 0) goto L45
            goto L68
        L45:
            int[] r2 = com.sankuai.waimai.alita.core.mlmodel.predictor.e.AnonymousClass1.a
            com.sankuai.waimai.alita.core.mlmodel.predictor.bean.DataType r3 = r1.getDataType()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L5e;
                case 2: goto L56;
                default: goto L54;
            }
        L54:
            r1 = 0
            goto L65
        L56:
            float[] r1 = r1.getFloatData()
            if (r1 == 0) goto L54
        L5c:
            r1 = 1
            goto L65
        L5e:
            int[] r1 = r1.getIntData()
            if (r1 == 0) goto L54
            goto L5c
        L65:
            if (r1 == 0) goto L69
            goto L30
        L68:
            return r9
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.mlmodel.predictor.e.a(java.util.List):boolean");
    }
}
