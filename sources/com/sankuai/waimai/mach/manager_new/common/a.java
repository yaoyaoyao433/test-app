package com.sankuai.waimai.mach.manager_new.common;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;

    public static String a(boolean z) {
        return z ? "test" : "prod";
    }

    public static String a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1f4163856441ceb29b70f3982db358f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1f4163856441ceb29b70f3982db358f") : bundleInfo.getName();
    }

    public static String b(BundleInfo bundleInfo) {
        String version;
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e85cb12125681c28104877226ca3b2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e85cb12125681c28104877226ca3b2e");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bundleInfo.getName());
        sb.append("@");
        Object[] objArr2 = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6112d91840432f0377a6c7366fa5dc28", RobustBitConfig.DEFAULT_VALUE)) {
            version = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6112d91840432f0377a6c7366fa5dc28");
        } else if (!TextUtils.isEmpty(bundleInfo.getBundleVersion())) {
            version = bundleInfo.getBundleVersion();
        } else {
            version = !TextUtils.isEmpty(bundleInfo.getVersion()) ? bundleInfo.getVersion() : "";
        }
        sb.append(version);
        return sb.toString();
    }

    public static boolean c(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e47e00c9aa602eaaeced927cba0bf6ae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e47e00c9aa602eaaeced927cba0bf6ae")).booleanValue() : bundleInfo != null && (bundleInfo.isMachProBundle() || (!TextUtils.isEmpty(bundleInfo.getName()) && bundleInfo.getName().startsWith("mach_pro")));
    }

    public static boolean d(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "739546399faf67def20486a323e7284b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "739546399faf67def20486a323e7284b")).booleanValue() : c(bundleInfo) && "1".equals(bundleInfo.getBundleType());
    }

    public static boolean e(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1aa370b38d2ee6bb00da54e1a30142fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1aa370b38d2ee6bb00da54e1a30142fb")).booleanValue();
        }
        if (c(bundleInfo)) {
            return a(new File(com.sankuai.waimai.mach.manager_new.download.d.b() + File.separator + bundleInfo.getMachId() + File.separator + b(bundleInfo)));
        }
        return b(new File(com.sankuai.waimai.mach.manager_new.download.d.a(bundleInfo)));
    }

    private static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50b212ee130fb9653a84add2beacf81f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50b212ee130fb9653a84add2beacf81f")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (!file.isDirectory()) {
            c.d("is not directory | " + file.getPath());
            return false;
        }
        SystemClock.elapsedRealtime();
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.sankuai.waimai.mach.manager_new.common.a.1
            public static ChangeQuickRedirect a;

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                Object[] objArr2 = {file2, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11c5cf5a10c5e80ccec0e160190ee66c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11c5cf5a10c5e80ccec0e160190ee66c")).booleanValue() : "bundle.qbc.zip".equals(str) || "bundle.qbc".equals(str);
            }
        });
        return listFiles != null && listFiles.length > 0;
    }

    private static boolean b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3c00ff6f237ea2ca5fdb9a1ea250600", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3c00ff6f237ea2ca5fdb9a1ea250600")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (!file.isDirectory()) {
            c.d("is not directory | " + file.getPath());
            return false;
        }
        SystemClock.elapsedRealtime();
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.sankuai.waimai.mach.manager_new.common.a.2
            public static ChangeQuickRedirect a;

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                Object[] objArr2 = {file2, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ceb9f32a49bed852893a1af04990942", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ceb9f32a49bed852893a1af04990942")).booleanValue() : "template.json".equals(str);
            }
        });
        return listFiles != null && listFiles.length > 0;
    }

    public static String a(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12187ee5bb8f3723ab88cba837c61e70", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12187ee5bb8f3723ab88cba837c61e70");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(com.sankuai.waimai.mach.manager_new.download.d.b() + File.separator + str);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return "";
        }
        for (File file2 : listFiles) {
            if (!com.sankuai.waimai.mach.utils.e.b(file2) && a(file2)) {
                return file2.getName();
            }
        }
        return "";
    }

    public static String b(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52dabb72fd961c14f3489b757b0228f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52dabb72fd961c14f3489b757b0228f0");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(com.sankuai.waimai.mach.manager_new.download.d.a() + File.separator + str);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return "";
        }
        for (File file2 : listFiles) {
            if (!com.sankuai.waimai.mach.utils.e.b(file2) && b(file2)) {
                return file2.getName();
            }
        }
        return "";
    }

    public static String a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d924029c0dc86316f34ac59bd651813", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d924029c0dc86316f34ac59bd651813");
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.mach.manager_new.common.a.a
            java.lang.String r10 = "4d40eda8c306820229e4abf9318b0b29"
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
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.lang.String r0 = a(r1)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L6a
            r1.close()     // Catch: java.io.IOException -> L36
        L36:
            return r0
        L37:
            r0 = move-exception
            goto L3e
        L39:
            r11 = move-exception
            r1 = r2
            goto L6b
        L3c:
            r0 = move-exception
            r1 = r2
        L3e:
            java.lang.String r3 = "app.js"
            boolean r3 = r11.contains(r3)     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L64
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L6a
            r3.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "filePath"
            r3.put(r4, r11)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r11 = "errorMsg"
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L6a
            r3.put(r11, r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.Class<com.sankuai.waimai.mach.manager_new.common.a> r11 = com.sankuai.waimai.mach.manager_new.common.a.class
            java.lang.String r0 = "JSLoadFailed"
            java.lang.String r3 = com.sankuai.waimai.mach.utils.e.b(r3)     // Catch: java.lang.Throwable -> L6a
            com.dianping.codelog.b.b(r11, r0, r3)     // Catch: java.lang.Throwable -> L6a
        L64:
            if (r1 == 0) goto L69
            r1.close()     // Catch: java.io.IOException -> L69
        L69:
            return r2
        L6a:
            r11 = move-exception
        L6b:
            if (r1 == 0) goto L70
            r1.close()     // Catch: java.io.IOException -> L70
        L70:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.manager_new.common.a.c(java.lang.String):java.lang.String");
    }
}
