package com.meituan.android.common.metricx.utils;

import android.content.Context;
import com.meituan.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WebViewUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static a compat;

    public static String getChromeWebviewVersion(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c62dbaa155fd3cbac228612d2da19272", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c62dbaa155fd3cbac228612d2da19272");
        }
        if (checkCompat(context)) {
            return compat.b;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r1.c == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean checkCompat(android.content.Context r13) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.metricx.utils.WebViewUtils.changeQuickRedirect
            java.lang.String r11 = "37157e5954642affb54556be0227ce53"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r13 = 0
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r10, r0, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L23:
            com.meituan.a r1 = com.meituan.android.common.metricx.utils.WebViewUtils.compat
            if (r1 != 0) goto L92
            if (r13 != 0) goto L2a
            return r9
        L2a:
            com.meituan.a r1 = new com.meituan.a
            r1.<init>()
            com.meituan.android.common.metricx.utils.WebViewUtils.compat = r1
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.a.a
            java.lang.String r12 = "ae7cd1815ffa697a5024c501ff6e201e"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r10
            r3 = r1
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L4a
            com.meituan.robust.PatchProxy.accessDispatch(r10, r1, r11, r9, r12)
            goto L92
        L4a:
            boolean r2 = r1.d
            if (r2 != 0) goto L92
            android.content.pm.PackageInfo r13 = r1.a(r13)
            if (r13 != 0) goto L63
            r1.d = r0
            java.lang.String r13 = r1.b
            if (r13 != 0) goto L5e
            java.lang.String r13 = ""
            r1.b = r13
        L5e:
            java.lang.String r13 = r1.c
            if (r13 != 0) goto L92
            goto L79
        L63:
            java.lang.String r2 = r13.versionName     // Catch: java.lang.Throwable -> L7e
            r1.b = r2     // Catch: java.lang.Throwable -> L7e
            java.lang.String r13 = r13.packageName     // Catch: java.lang.Throwable -> L7e
            r1.c = r13     // Catch: java.lang.Throwable -> L7e
            r1.d = r0
            java.lang.String r13 = r1.b
            if (r13 != 0) goto L75
            java.lang.String r13 = ""
            r1.b = r13
        L75:
            java.lang.String r13 = r1.c
            if (r13 != 0) goto L92
        L79:
            java.lang.String r13 = ""
            r1.c = r13
            goto L92
        L7e:
            r13 = move-exception
            r1.d = r0
            java.lang.String r0 = r1.b
            if (r0 != 0) goto L89
            java.lang.String r0 = ""
            r1.b = r0
        L89:
            java.lang.String r0 = r1.c
            if (r0 != 0) goto L91
            java.lang.String r0 = ""
            r1.c = r0
        L91:
            throw r13
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.metricx.utils.WebViewUtils.checkCompat(android.content.Context):boolean");
    }

    public static String getChromePackageName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "993ed5dd504867f191002dc02afcb11f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "993ed5dd504867f191002dc02afcb11f");
        }
        if (checkCompat(context)) {
            return compat.c;
        }
        return null;
    }
}
