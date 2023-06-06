package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum h {
    FLEX(0),
    NONE(1),
    MSCFLEX(2),
    BlockFlow(3),
    Inline(4),
    Block(5);
    
    public static ChangeQuickRedirect a;
    final int h;

    public static h valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf97072e114039e8fa646c482ac4d428", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf97072e114039e8fa646c482ac4d428") : (h) Enum.valueOf(h.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72e8e623a93c250df4b999c50e9febdd", RobustBitConfig.DEFAULT_VALUE) ? (h[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72e8e623a93c250df4b999c50e9febdd") : (h[]) values().clone();
    }

    h(int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce3420fc6b9119bd4ee6e6f3ef4a2447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce3420fc6b9119bd4ee6e6f3ef4a2447");
        } else {
            this.h = i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r12.equals("none") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.android.msc.yoga.h a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.msc.yoga.h.a
            java.lang.String r11 = "863298fc442aa6e27312fc9edb5a1a3f"
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
            com.meituan.android.msc.yoga.h r12 = (com.meituan.android.msc.yoga.h) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1183997287: goto L51;
                case 3145721: goto L47;
                case 3387192: goto L3d;
                case 93832333: goto L33;
                case 1340580086: goto L28;
                default: goto L27;
            }
        L27:
            goto L5c
        L28:
            java.lang.String r0 = "mscflex"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 2
            goto L5d
        L33:
            java.lang.String r0 = "block"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 3
            goto L5d
        L3d:
            java.lang.String r2 = "none"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L5c
            goto L5d
        L47:
            java.lang.String r0 = "flex"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 0
            goto L5d
        L51:
            java.lang.String r0 = "inline"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 4
            goto L5d
        L5c:
            r0 = -1
        L5d:
            switch(r0) {
                case 0: goto L80;
                case 1: goto L7d;
                case 2: goto L7a;
                case 3: goto L77;
                case 4: goto L74;
                default: goto L60;
            }
        L60:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown enum value: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L74:
            com.meituan.android.msc.yoga.h r12 = com.meituan.android.msc.yoga.h.Inline
            return r12
        L77:
            com.meituan.android.msc.yoga.h r12 = com.meituan.android.msc.yoga.h.Block
            return r12
        L7a:
            com.meituan.android.msc.yoga.h r12 = com.meituan.android.msc.yoga.h.MSCFLEX
            return r12
        L7d:
            com.meituan.android.msc.yoga.h r12 = com.meituan.android.msc.yoga.h.NONE
            return r12
        L80:
            com.meituan.android.msc.yoga.h r12 = com.meituan.android.msc.yoga.h.FLEX
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.msc.yoga.h.a(java.lang.String):com.meituan.android.msc.yoga.h");
    }
}
