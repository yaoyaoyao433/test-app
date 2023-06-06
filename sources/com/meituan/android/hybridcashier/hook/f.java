package com.meituan.android.hybridcashier.hook;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.neohybrid.util.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r1.equals("com.meituan.android.mrn.container.MRNBaseActivity") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.app.Activity r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.hybridcashier.hook.f.a
            java.lang.String r11 = "0f5e75af9ebbad0e1dc110ed77487c08"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            if (r12 != 0) goto L21
            return r2
        L21:
            java.lang.Class r1 = r12.getClass()
            java.lang.String r1 = r1.getName()
            boolean r3 = a(r1)
            if (r3 != 0) goto L30
            return r1
        L30:
            android.content.Intent r12 = r12.getIntent()
            if (r12 != 0) goto L37
            return r2
        L37:
            android.net.Uri r3 = r12.getData()
            r4 = -1
            int r5 = r1.hashCode()
            r6 = 548282238(0x20ae1f7e, float:2.9497586E-19)
            if (r5 == r6) goto L63
            r6 = 702350618(0x29dd051a, float:9.8152565E-14)
            if (r5 == r6) goto L59
            r6 = 2003214684(0x7766a15c, float:4.6777384E33)
            if (r5 == r6) goto L50
            goto L6d
        L50:
            java.lang.String r5 = "com.meituan.android.mrn.container.MRNBaseActivity"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L6d
            goto L6e
        L59:
            java.lang.String r0 = "com.meituan.android.base.knb.KNBWebViewActivity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 0
            goto L6e
        L63:
            java.lang.String r0 = "com.meituan.mmp.lib.HeraActivity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6d
            r0 = 2
            goto L6e
        L6d:
            r0 = -1
        L6e:
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L77;
                case 2: goto L72;
                default: goto L71;
            }
        L71:
            return r2
        L72:
            java.lang.String r12 = a(r12)
            return r12
        L77:
            java.lang.String r12 = b(r3)
            return r12
        L7c:
            java.lang.String r12 = a(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.hybridcashier.hook.f.a(android.app.Activity):java.lang.String");
    }

    private static String a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "151f5ce9152da96680e076b1c335b6b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "151f5ce9152da96680e076b1c335b6b0");
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        return n.a(queryParameter);
    }

    private static String b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56172b2b23ded9e4387e418dab3632fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56172b2b23ded9e4387e418dab3632fb");
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("mrn_biz");
        String queryParameter2 = uri.getQueryParameter("mrn_entry");
        String queryParameter3 = uri.getQueryParameter("mrn_component");
        return queryParameter + CommonConstant.Symbol.COMMA + queryParameter2 + CommonConstant.Symbol.COMMA + queryParameter3;
    }

    private static String a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08b589f3cda6aeec5565c06ac98e440e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08b589f3cda6aeec5565c06ac98e440e");
        }
        if (intent == null) {
            return null;
        }
        String a2 = a(intent, "appId");
        String a3 = a(intent, "targetPath");
        return a2 + CommonConstant.Symbol.COMMA + n.a(a3);
    }

    private static String a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f55784431bda880380b0083e79e28b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f55784431bda880380b0083e79e28b8");
        }
        if (intent == null) {
            return null;
        }
        try {
            if (intent.hasExtra(str)) {
                return com.sankuai.waimai.platform.utils.f.a(intent, str);
            }
            Uri data = intent.getData();
            if (data != null) {
                return data.getQueryParameter(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "910c1daf24b5dae82c4cb15afd9fd8fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "910c1daf24b5dae82c4cb15afd9fd8fe")).booleanValue() : "com.meituan.android.base.knb.KNBWebViewActivity".equals(str) || "com.meituan.android.mrn.container.MRNBaseActivity".equals(str) || "com.meituan.mmp.lib.HeraActivity".equals(str);
    }
}
