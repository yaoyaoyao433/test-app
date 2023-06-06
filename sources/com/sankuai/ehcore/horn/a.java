package com.sankuai.ehcore.horn;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    static Context b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29426213d56fa1d735054589ef2e3f6c", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29426213d56fa1d735054589ef2e3f6c") : q.a(b, "jinrong_eh_default_kv", str, u.e);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String b(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.ehcore.horn.a.a
            java.lang.String r10 = "cc9bbf0385a1689cbbb359100f461f85"
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
            java.io.File r11 = a(r11)
            boolean r0 = r11.exists()
            if (r0 != 0) goto L2b
            java.lang.String r11 = ""
            return r11
        L2b:
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L51
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L51
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L51
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r11 = r0.readObject()     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L52
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L43
            java.lang.String r11 = ""
        L43:
            r0.close()     // Catch: java.lang.Exception -> L46
        L46:
            return r11
        L47:
            r11 = move-exception
            goto L4b
        L49:
            r11 = move-exception
            r0 = r2
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.lang.Exception -> L50
        L50:
            throw r11
        L51:
            r0 = r2
        L52:
            java.lang.String r11 = ""
            if (r0 == 0) goto L59
            r0.close()     // Catch: java.lang.Exception -> L59
        L59:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.ehcore.horn.a.b(java.lang.String):java.lang.String");
    }

    public static String a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "515899935e7f0841477a740c77894eb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "515899935e7f0841477a740c77894eb0");
        }
        File[] listFiles = a("eh/eh_skeleton/").listFiles();
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            if (listFiles[i].getName().contains(strArr[0])) {
                listFiles[i].delete();
            }
        }
        return "eh/eh_skeleton/eh_skeleton_" + strArr[0] + CommonConstant.Symbol.UNDERLINE + strArr[1];
    }

    public static String[] c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d023d2424d37b1f06f552c0e43407c0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d023d2424d37b1f06f552c0e43407c0a");
        }
        File a2 = a(str);
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2.list();
    }

    public static boolean b(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89c3a17172f282dbb13b0f15860030fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89c3a17172f282dbb13b0f15860030fd")).booleanValue();
        }
        if (strArr == null) {
            return false;
        }
        File[] listFiles = a("eh/eh_skeleton/").listFiles();
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            if (listFiles[i].getName().contains(strArr[0])) {
                return Boolean.parseBoolean(strArr[2]) || !listFiles[i].getName().contains(strArr[1]);
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a83ad029933562f1873d1c90ec74637f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a83ad029933562f1873d1c90ec74637f")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File[] listFiles = a(str2).listFiles();
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            if (listFiles[i].getName().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public static void a(String[] strArr, String str) {
        boolean z;
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb7132d6e7823a3d57f36fc8ad9ce231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb7132d6e7823a3d57f36fc8ad9ce231");
            return;
        }
        File[] listFiles = a(str).listFiles();
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else if (listFiles[i].getName().contains(strArr[i2])) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                listFiles[i].delete();
            }
        }
    }

    public static q a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e1ca6cf0098e8e6e8bafd96f8f24338", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e1ca6cf0098e8e6e8bafd96f8f24338") : q.a(b, "jinrong_eh_default_kv");
    }
}
