package com.sankuai.waimai.alita.bundle;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65cced6aed2e482c456798dbe2108734", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65cced6aed2e482c456798dbe2108734");
        }
        return bundleInfo.getName() + "@" + b(bundleInfo);
    }

    public static String b(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c7bf3406dc4765a0bf3043921f9e5dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c7bf3406dc4765a0bf3043921f9e5dc");
        }
        if (!TextUtils.isEmpty(bundleInfo.getBundleVersion())) {
            return bundleInfo.getBundleVersion();
        }
        if (TextUtils.isEmpty(bundleInfo.getVersion())) {
            return null;
        }
        return bundleInfo.getVersion();
    }

    private static String a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78842bba5b4a49275bef7f8edf669aa3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78842bba5b4a49275bef7f8edf669aa3");
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.alita.bundle.d.a
            java.lang.String r10 = "16766c230e8d0e2ea8199bcfe80c4a3b"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L25
            return r2
        L25:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3b
            java.lang.String r0 = a(r11)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L4a
            r11.close()     // Catch: java.io.IOException -> L36
        L36:
            return r0
        L37:
            r0 = move-exception
            goto L3d
        L39:
            r0 = move-exception
            goto L4c
        L3b:
            r0 = move-exception
            r11 = r2
        L3d:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L4a
            com.sankuai.waimai.alita.core.utils.c.a(r0)     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L49
            r11.close()     // Catch: java.io.IOException -> L49
        L49:
            return r2
        L4a:
            r0 = move-exception
            r2 = r11
        L4c:
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.bundle.d.a(java.lang.String):java.lang.String");
    }
}
