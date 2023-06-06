package com.sankuai.waimai.alita.core.base.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaBundleUtil {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ModelType {
        public static final int JS = 1;
        public static final int MODEL = 2;
        public static final int UNKNOWN = 0;
    }

    @NonNull
    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "484d63cfc9c9de4ec5f4aee895706c39", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "484d63cfc9c9de4ec5f4aee895706c39") : a(str, "alita_default_biz");
    }

    @NonNull
    public static String a(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd30f0fcbd48c9f2972270408f92ea9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd30f0fcbd48c9f2972270408f92ea9a");
        }
        try {
            String[] b = b(str);
            return !TextUtils.isEmpty(b[1]) ? b[1] : str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    @NonNull
    public static String b(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4294e3dd3e900ca8780679575624785a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4294e3dd3e900ca8780679575624785a");
        }
        try {
            String[] b = b(str);
            return !TextUtils.isEmpty(b[2]) ? b[2] : str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11c0b3f14270e7a2c384c2f8eb622e24", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11c0b3f14270e7a2c384c2f8eb622e24")).intValue();
        }
        try {
            String str2 = b(str)[0];
            if (AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS.equalsIgnoreCase(str2)) {
                return 1;
            }
            return "alitamodel".equalsIgnoreCase(str2) ? 2 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] b(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil.a
            java.lang.String r11 = "9d5f71cdd4d806ad952df0bc11ec5c33"
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
            java.lang.String[] r12 = (java.lang.String[]) r12
            return r12
        L1f:
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            new java.lang.String[]{r1, r2, r3, r4}
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r5 = 3
            r6 = 2
            java.lang.String r7 = "_"
            java.lang.String[] r12 = r12.split(r7, r6)     // Catch: java.lang.Exception -> L4b
            r7 = r12[r9]     // Catch: java.lang.Exception -> L4b
            r12 = r12[r0]     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = "-"
            java.lang.String[] r12 = r12.split(r1, r5)     // Catch: java.lang.Exception -> L4c
            r1 = r12[r9]     // Catch: java.lang.Exception -> L4c
            r2 = r12[r0]     // Catch: java.lang.Exception -> L4d
            r12 = r12[r6]     // Catch: java.lang.Exception -> L4e
            goto L4f
        L4b:
            r7 = r1
        L4c:
            r1 = r2
        L4d:
            r2 = r3
        L4e:
            r12 = r4
        L4f:
            if (r7 != 0) goto L53
            java.lang.String r7 = ""
        L53:
            if (r1 != 0) goto L57
            java.lang.String r1 = ""
        L57:
            if (r2 != 0) goto L5b
            java.lang.String r2 = ""
        L5b:
            if (r12 != 0) goto L5f
            java.lang.String r12 = ""
        L5f:
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r9] = r7
            r3[r0] = r1
            r3[r6] = r2
            r3[r5] = r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil.b(java.lang.String):java.lang.String[]");
    }
}
