package com.sankuai.waimai.alita.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.download.model.DownloadInfo;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static byte[] b = {80, 75, 3, 4};
    private static byte[] c = {80, 75, 5, 6};

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(Exception exc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (java.util.Arrays.equals(com.sankuai.waimai.alita.core.utils.l.c, r2) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.alita.core.utils.l.a
            java.lang.String r11 = "cda773c21119cef0901e858222110afb"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L22:
            boolean r1 = r12.isDirectory()
            if (r1 == 0) goto L29
            return r9
        L29:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r12 = 4
            byte[] r2 = new byte[r12]     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            int r3 = r1.read(r2, r9, r12)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            if (r3 != r12) goto L48
            byte[] r12 = com.sankuai.waimai.alita.core.utils.l.b     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            boolean r12 = java.util.Arrays.equals(r12, r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            if (r12 != 0) goto L47
            byte[] r12 = com.sankuai.waimai.alita.core.utils.l.c     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            boolean r12 = java.util.Arrays.equals(r12, r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            if (r12 == 0) goto L48
        L47:
            r9 = 1
        L48:
            r1.close()     // Catch: java.io.IOException -> L5d
            goto L5d
        L4c:
            r12 = move-exception
            goto L5e
        L4e:
            r12 = move-exception
            r2 = r1
            goto L55
        L51:
            r12 = move-exception
            r1 = r2
            goto L5e
        L54:
            r12 = move-exception
        L55:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.io.IOException -> L5d
        L5d:
            return r9
        L5e:
            if (r1 == 0) goto L63
            r1.close()     // Catch: java.io.IOException -> L63
        L63:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.utils.l.a(java.io.File):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.File r19, com.sankuai.waimai.alita.bundle.download.model.DownloadInfo r20, com.sankuai.waimai.alita.core.utils.l.a r21) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.utils.l.a(java.io.File, com.sankuai.waimai.alita.bundle.download.model.DownloadInfo, com.sankuai.waimai.alita.core.utils.l$a):void");
    }

    public static String a(File file, DownloadInfo downloadInfo) {
        File parentFile;
        Object[] objArr = {file, downloadInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71d52e48b6ab6749c312374dce39f8aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71d52e48b6ab6749c312374dce39f8aa");
        }
        if (file == null || downloadInfo == null || (parentFile = file.getParentFile()) == null) {
            return null;
        }
        return parentFile + File.separator + com.sankuai.waimai.alita.bundle.d.a(downloadInfo.d);
    }
}
