package com.meituan.android.common.aidata.ai.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiUtils {
    private static final String DELETE_FLAG_FILE_NAME = "__deleted__";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean deleteDir(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e05281082694fd4a0339239823e732f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e05281082694fd4a0339239823e732f")).booleanValue();
        }
        if (file != null && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        deleteDir(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            return file.delete();
        }
        return false;
    }

    public static <T> boolean isEmpty(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06ef2a7910d1b29a3a37b9fe4e55f2ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06ef2a7910d1b29a3a37b9fe4e55f2ee")).booleanValue() : list == null || list.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r12 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        if (r12 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r12 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean setDirDeleteFlag(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.aidata.ai.utils.AiUtils.changeQuickRedirect
            java.lang.String r11 = "35afcb05610abe0c4494420e85d17427"
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
            if (r12 == 0) goto L80
            boolean r1 = r12.exists()
            if (r1 == 0) goto L80
            boolean r1 = r12.isDirectory()
            if (r1 == 0) goto L80
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r12 = r12.getAbsolutePath()
            r3.append(r12)
            java.lang.String r12 = java.io.File.separator
            r3.append(r12)
            java.lang.String r12 = "__deleted__"
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r1.<init>(r12)
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L71 java.io.IOException -> L78 java.io.FileNotFoundException -> L7c
            r12.<init>(r1, r9)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L71 java.io.IOException -> L78 java.io.FileNotFoundException -> L7c
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            r12.write(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L72 java.io.IOException -> L79 java.io.FileNotFoundException -> L7d
            r12.close()     // Catch: java.io.IOException -> L81
            goto L81
        L67:
            r0 = move-exception
            goto L6b
        L69:
            r0 = move-exception
            r12 = r2
        L6b:
            if (r12 == 0) goto L70
            r12.close()     // Catch: java.io.IOException -> L70
        L70:
            throw r0
        L71:
            r12 = r2
        L72:
            if (r12 == 0) goto L80
        L74:
            r12.close()     // Catch: java.io.IOException -> L80
            goto L80
        L78:
            r12 = r2
        L79:
            if (r12 == 0) goto L80
            goto L74
        L7c:
            r12 = r2
        L7d:
            if (r12 == 0) goto L80
            goto L74
        L80:
            r0 = 0
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.utils.AiUtils.setDirDeleteFlag(java.io.File):boolean");
    }

    public static boolean isEmpty(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42fef94d60438a4ef763b349c1bc1250", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42fef94d60438a4ef763b349c1bc1250")).booleanValue();
        }
        if (map == null) {
            return true;
        }
        return map.isEmpty();
    }

    public static int compareAppVersion(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e5926b4f622243dbae41ae09ab1f7406", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e5926b4f622243dbae41ae09ab1f7406")).intValue();
        }
        if (str == null || str2 == null) {
            throw new RuntimeException("版本号不能为空");
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i = split[i2].length() - split2[i2].length();
            if (i != 0 || (i = split[i2].compareTo(split2[i2])) != 0) {
                break;
            }
        }
        return i != 0 ? i : split.length - split2.length;
    }

    public static void recursiveClearDirDeleteFlag(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3fb4775f54cdc577717d817332a6a6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3fb4775f54cdc577717d817332a6a6cb");
        } else if (file != null && file.exists() && file.isDirectory()) {
            clearDirDeleteFlag(file);
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2 != null && file2.isDirectory()) {
                    recursiveClearDirDeleteFlag(file2);
                }
            }
        }
    }

    public static void clearDirDeleteFlag(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ad35ab6e9b208a8744b3014fd921acc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ad35ab6e9b208a8744b3014fd921acc");
        } else if (file != null && file.exists() && file.isDirectory()) {
            File file2 = new File(file.getAbsolutePath() + File.separator + DELETE_FLAG_FILE_NAME);
            if (file2.isFile()) {
                file2.delete();
            }
        }
    }

    public static boolean isDirHasDeleteFlag(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbc831fb3ae9a1862c94c040330e5d5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbc831fb3ae9a1862c94c040330e5d5d")).booleanValue();
        }
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2.isFile() && DELETE_FLAG_FILE_NAME.equals(file2.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
