package com.meituan.android.common.mtguard.wtscore.plugin.sign.core;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.URI;
import java.util.Map;
/* loaded from: classes2.dex */
public final class a {
    private static boolean a = true;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static URI a(Context context, URI uri, String str, String str2, Map<String, String> map, Map<String, String> map2) {
        Object[] objArr = {context, uri, str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a7eb78b79e12518be3483daf2ff730e", 6917529027641081856L) ? (URI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a7eb78b79e12518be3483daf2ff730e") : a(context, uri, false, null, str, str2, map, null, map2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
        if (r1.b == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fc, code lost:
        if (android.text.TextUtils.isEmpty(r1.b.i()) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("");
        r4.append("/");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010b, code lost:
        r3 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("");
        r4.append(r1.b.i());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0128, code lost:
        r4 = new java.util.ArrayList();
        r1.a(r4, r0, false);
        r0 = r1.a(r4);
        java.util.Collections.sort(r0, new com.meituan.android.common.mtguard.wtscore.plugin.sign.core.d.AnonymousClass1(r1));
        java.util.Collections.sort(r0, new com.meituan.android.common.mtguard.wtscore.plugin.sign.core.d.AnonymousClass2(r1));
        r0 = r1.b.j() + com.meituan.robust.common.StringUtil.SPACE + r3 + com.meituan.robust.common.StringUtil.SPACE + com.meituan.android.common.mtguard.wtscore.plugin.sign.core.d.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0170, code lost:
        if (r1.b.c() != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0172, code lost:
        r0 = r0.getBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0177, code lost:
        r0 = r0.getBytes();
        r3 = java.lang.Math.min(r1.b.c().length, 16200);
        r4 = new byte[r0.length + r3];
        java.lang.System.arraycopy(r0, 0, r4, 0, r0.length);
        java.lang.System.arraycopy(r1.b.c(), 0, r4, r0.length, r3);
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019c, code lost:
        if (r0.length != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019e, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a0, code lost:
        r1 = r1.b.f().getBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01aa, code lost:
        if (r0 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ac, code lost:
        r0 = "-2003";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01af, code lost:
        r0 = com.meituan.android.common.mtguard.NBridge.main3(2, new java.lang.Object[]{com.meituan.android.common.mtguard.MTGuard.sAppKey, r0, r1});
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bd, code lost:
        if (r0 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01bf, code lost:
        r0 = "-1001";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c6, code lost:
        if ((r0[0] instanceof java.lang.Integer) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c8, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0[0]);
        r0 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d7, code lost:
        r0 = (java.lang.String) r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01db, code lost:
        r1 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
        if ("sig_ignore".equals(r0) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e9, code lost:
        r1.put(com.meituan.android.common.mtguard.MTGConfigs.c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f3, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f9, code lost:
        if (com.meituan.android.common.dfingerprint.DFPConfigs.isReport() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fb, code lost:
        com.meituan.android.common.dfingerprint.MTGlibInterface.raptorAPI(com.meituan.android.common.dfingerprint.MTGlibInterface.API_KEY_addSigProcessor, 9402, 0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020f, code lost:
        if (r0.equals("-1001") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0215, code lost:
        if (com.meituan.android.common.dfingerprint.DFPConfigs.isReport() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0217, code lost:
        com.meituan.android.common.dfingerprint.MTGlibInterface.raptorAPI(com.meituan.android.common.dfingerprint.MTGlibInterface.API_KEY_addSigProcessor, 9403, 0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022b, code lost:
        if (r0.equals("-2003") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0231, code lost:
        if (com.meituan.android.common.dfingerprint.DFPConfigs.isReport() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0233, code lost:
        com.meituan.android.common.dfingerprint.MTGlibInterface.raptorAPI(com.meituan.android.common.dfingerprint.MTGlibInterface.API_KEY_addSigProcessor, 9404, 0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0242, code lost:
        if (com.meituan.android.common.dfingerprint.DFPConfigs.isMtgsigFirst == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0244, code lost:
        r3 = com.meituan.android.common.mtguard.utils.b.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x024f, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0251, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0253, code lost:
        r4 = com.meituan.android.common.mtguard.MTGuard.sPackageName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0259, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x025c, code lost:
        r6 = r4.equals(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0260, code lost:
        if (r6 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0262, code lost:
        r3 = 200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0265, code lost:
        r3 = 2001;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0267, code lost:
        com.meituan.android.common.dfingerprint.MTGlibInterface.raptorFakeAPI(com.meituan.android.common.dfingerprint.MTGlibInterface.API_mtgsig_duration, r3, java.lang.System.currentTimeMillis() - com.meituan.android.common.mtguard.MTGuard.sFirstLaunchTime);
        com.meituan.android.common.dfingerprint.DFPConfigs.isMtgsigFirst = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0274, code lost:
        r21 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0292, code lost:
        throw new java.lang.Exception(com.meituan.android.common.mtguard.wtscore.plugin.sign.core.d.a + "getParametersSignature normalizedURI is null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ab, code lost:
        throw new java.lang.Exception(com.meituan.android.common.mtguard.wtscore.plugin.sign.core.d.a + "baseString candyOriginalMaterial is null");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.URI a(android.content.Context r22, final java.net.URI r23, final boolean r24, final byte[] r25, final java.lang.String r26, final java.lang.String r27, java.util.Map<java.lang.String, java.lang.String> r28, java.lang.String r29, java.util.Map<java.lang.String, java.lang.String> r30) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.wtscore.plugin.sign.core.a.a(android.content.Context, java.net.URI, boolean, byte[], java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map):java.net.URI");
    }

    public static URI a(Context context, URI uri, byte[] bArr, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2) {
        Object[] objArr = {context, uri, bArr, str, str2, map, str3, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71cca7f0244c52d3854b1f590ae94f91", 6917529027641081856L) ? (URI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71cca7f0244c52d3854b1f590ae94f91") : a(context, uri, true, bArr, str, str2, map, str3, map2);
    }

    public static URI a(Context context, URI uri, byte[] bArr, String str, String str2, Map<String, String> map, Map<String, String> map2) {
        Object[] objArr = {context, uri, bArr, str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5902749713313c2f07d5a63c2ec7d1c2", 6917529027641081856L) ? (URI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5902749713313c2f07d5a63c2ec7d1c2") : a(context, uri, true, bArr, str, str2, map, null, map2);
    }
}
