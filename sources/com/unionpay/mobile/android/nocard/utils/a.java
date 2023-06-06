package com.unionpay.mobile.android.nocard.utils;

import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.utils.k;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
/* loaded from: classes6.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.os.Bundle r1) {
        /*
            if (r1 == 0) goto L1c
            java.lang.String r0 = "paydata"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = "paydata"
        Lc:
            java.lang.String r1 = r1.getString(r0)
            goto L1d
        L11:
            java.lang.String r0 = "tn"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L1c
            java.lang.String r0 = "tn"
            goto Lc
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L21
            java.lang.String r1 = ""
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.nocard.utils.a.a(android.os.Bundle):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r4) {
        /*
            java.lang.String r0 = "uppay"
            java.lang.String r1 = "decodePayInfo +++ \n"
            com.unionpay.mobile.android.utils.k.a(r0, r1)
            r0 = 0
            if (r4 == 0) goto Lf
            java.lang.String r4 = java.net.URLDecoder.decode(r4)
            goto L10
        Lf:
            r4 = r0
        L10:
            java.lang.String r1 = "uppay"
            java.lang.String r2 = "url deocode result:"
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r2.concat(r3)
            com.unionpay.mobile.android.utils.k.b(r1, r2)
            if (r4 == 0) goto L2a
            byte[] r4 = com.unionpay.mobile.android.utils.a.a(r4)     // Catch: java.io.IOException -> L26
            goto L2b
        L26:
            r4 = move-exception
            r4.printStackTrace()
        L2a:
            r4 = r0
        L2b:
            if (r4 == 0) goto L3a
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L36
            java.lang.String r2 = "UTF-8"
            r1.<init>(r4, r2)     // Catch: java.io.UnsupportedEncodingException -> L36
            r0 = r1
            goto L3a
        L36:
            r4 = move-exception
            r4.printStackTrace()
        L3a:
            java.lang.String r4 = "uppay"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "order info:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.unionpay.mobile.android.utils.k.a(r4, r1)
            java.lang.String r4 = "uppay"
            java.lang.String r1 = "decodePayInfo --- \n"
            com.unionpay.mobile.android.utils.k.a(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.nocard.utils.a.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
        if (android.text.TextUtils.isEmpty(r8.d) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a6, code lost:
        if (r8.I.h.trim().length() > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a8, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Intent r7, com.unionpay.mobile.android.model.b r8) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.nocard.utils.a.a(android.content.Intent, com.unionpay.mobile.android.model.b):boolean");
    }

    private static boolean a(String str, com.unionpay.mobile.android.model.b bVar) {
        boolean z = false;
        if (str != null) {
            String[] split = str.split("\\?");
            if (split.length < 2) {
                k.c("uppay", "uppay protocol params error!");
            } else {
                String str2 = split[1];
                k.a("uppay", "parseUPPayURIParams() +++ ");
                k.a("uppay", str2);
                String str3 = null;
                String str4 = null;
                for (String str5 : str2.split("&")) {
                    String[] split2 = str5.split("=");
                    if (split2.length >= 2) {
                        if (split2[0].equalsIgnoreCase("style")) {
                            str3 = split2[1];
                        } else if (split2[0].equalsIgnoreCase("paydata")) {
                            str4 = split2[1];
                        }
                    }
                }
                if (str3 != null && str3.equalsIgnoreCase("token") && str4 != null) {
                    k.a("uppay", "paydata=".concat(String.valueOf(str4)));
                    z = b(a(str4), bVar);
                }
                k.a("uppay", "parseUPPayURIParams() ---");
            }
        }
        return z;
    }

    private static boolean b(String str, com.unionpay.mobile.android.model.b bVar) {
        com.unionpay.mobile.android.plugin.c cVar;
        String str2;
        if (str == null || str.length() == 0) {
            return false;
        }
        bVar.I.c = "00";
        for (String str3 : str.split(CommonConstant.Symbol.COMMA)) {
            String[] split = str3.trim().split("=");
            if (split.length >= 2) {
                if (split[0].trim().equalsIgnoreCase(Constants.Environment.KEY_TN)) {
                    bVar.b = split[1].trim();
                } else if (split[0].trim().equalsIgnoreCase("usetestmode")) {
                    if (split[1].trim().equalsIgnoreCase("true")) {
                        cVar = bVar.I;
                        str2 = "01";
                    } else if (split[1].trim().equalsIgnoreCase("test")) {
                        cVar = bVar.I;
                        str2 = "02";
                    } else if (split[1].trim().equalsIgnoreCase(PackageLoadReporter.LoadType.INNER)) {
                        cVar = bVar.I;
                        str2 = "98";
                    }
                    cVar.c = str2;
                } else if (split[0].trim().equalsIgnoreCase("ResultURL")) {
                    try {
                        bVar.r = URLDecoder.decode(split[1].trim(), "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return bVar.b != null && bVar.b.length() > 0;
    }
}
