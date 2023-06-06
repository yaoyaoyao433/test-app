package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiTensorUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r1.getFloatData() != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r1.getIntData() != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkInputValid(java.util.List<com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor> r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.aidata.ai.mlmodel.predictor.AiTensorUtils.changeQuickRedirect
            java.lang.String r11 = "3bb0d328067588e3a1773fb0864fb15f"
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
            goto L6f
        L2b:
            java.util.Iterator r12 = r12.iterator()
            r1 = 1
        L30:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r1 = r12.next()
            com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor r1 = (com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor) r1
            if (r1 == 0) goto L6e
            java.lang.String r2 = r1.getName()
            if (r2 != 0) goto L45
            goto L6e
        L45:
            com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.DataType r2 = r1.getDataType()
            if (r2 == 0) goto L6a
            int[] r2 = com.meituan.android.common.aidata.ai.mlmodel.predictor.AiTensorUtils.AnonymousClass1.$SwitchMap$com$meituan$android$common$aidata$ai$mlmodel$predictor$bean$DataType
            com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.DataType r3 = r1.getDataType()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L63;
                case 2: goto L5b;
                default: goto L5a;
            }
        L5a:
            goto L6a
        L5b:
            float[] r1 = r1.getFloatData()
            if (r1 == 0) goto L6a
        L61:
            r1 = 1
            goto L6b
        L63:
            int[] r1 = r1.getIntData()
            if (r1 == 0) goto L6a
            goto L61
        L6a:
            r1 = 0
        L6b:
            if (r1 == 0) goto L6f
            goto L30
        L6e:
            return r9
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.mlmodel.predictor.AiTensorUtils.checkInputValid(java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkOutputValid(java.util.List<com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor> r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.aidata.ai.mlmodel.predictor.AiTensorUtils.changeQuickRedirect
            java.lang.String r11 = "ab430ed39f1d9765cb21283e9978eaa9"
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
            r0 = 0
            goto L44
        L2b:
            java.util.Iterator r12 = r12.iterator()
        L2f:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r12.next()
            com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor r1 = (com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor) r1
            if (r1 == 0) goto L43
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L2f
        L43:
            return r9
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.mlmodel.predictor.AiTensorUtils.checkOutputValid(java.util.List):boolean");
    }
}
