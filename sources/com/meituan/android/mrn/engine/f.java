package com.meituan.android.mrn.engine;

import android.content.Context;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r12.equals("test") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.mrn.engine.f.a
            java.lang.String r11 = "de3f2bef79d23239cd42c11902e8efb6"
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
            java.lang.String r1 = "mrn-mrn_check_update_environment"
            java.lang.String r2 = "product"
            java.lang.String r12 = com.meituan.android.mrn.common.b.b(r12, r1, r2)
            r1 = -1
            int r2 = r12.hashCode()
            r3 = -309474065(0xffffffffed8dccef, float:-5.485642E27)
            if (r2 == r3) goto L43
            r3 = 3556498(0x364492, float:4.983715E-39)
            if (r2 == r3) goto L39
            goto L4e
        L39:
            java.lang.String r2 = "test"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L4e
            goto L4f
        L43:
            java.lang.String r0 = "product"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L4e
            r0 = 0
            goto L4f
        L4e:
            r0 = -1
        L4f:
            switch(r0) {
                case 0: goto L59;
                case 1: goto L55;
                default: goto L52;
            }
        L52:
            java.lang.String r12 = ""
            goto L5b
        L55:
            java.lang.String r12 = "test/"
            goto L5b
        L59:
            java.lang.String r12 = ""
        L5b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.engine.f.a(android.content.Context):java.lang.String");
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6e7c9251bb696a30cf2c4e48dc36d7c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6e7c9251bb696a30cf2c4e48dc36d7c") : com.meituan.android.mrn.common.b.b(context, "mrn-mrn_check_update_environment", PTFloatInfo.TYPE_PRODUCT);
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d20507aa2bf4e2e8ffa8fa2d0b1c0eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d20507aa2bf4e2e8ffa8fa2d0b1c0eb")).booleanValue() : b(context).equals(PTFloatInfo.TYPE_PRODUCT);
    }
}
