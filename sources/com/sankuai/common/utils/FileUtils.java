package com.sankuai.common.utils;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Enumeration;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FileUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isSdcardValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d3b5003568bebcf21c62f9147a81641", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d3b5003568bebcf21c62f9147a81641")).booleanValue() : Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isFileExist(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bda99fd55ab20e204d5f467bb736153d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bda99fd55ab20e204d5f467bb736153d")).booleanValue();
        }
        try {
            return new File(str).exists();
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean createFolder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5fb99f752defc2d2defb7d270246ec09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5fb99f752defc2d2defb7d270246ec09")).booleanValue();
        }
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                return true;
            }
            return file.mkdirs();
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void createFileFolder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7bd45b30fc561534b1e472c91aeb521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7bd45b30fc561534b1e472c91aeb521");
            return;
        }
        try {
            new File(str).getParentFile().mkdirs();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[Catch: IOException -> 0x009d, TRY_ENTER, TryCatch #16 {IOException -> 0x009d, blocks: (B:57:0x0099, B:61:0x00a1, B:63:0x00a6, B:65:0x00ab, B:73:0x00bc, B:75:0x00c1, B:77:0x00c6, B:79:0x00cb), top: B:101:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1 A[Catch: IOException -> 0x009d, TryCatch #16 {IOException -> 0x009d, blocks: (B:57:0x0099, B:61:0x00a1, B:63:0x00a6, B:65:0x00ab, B:73:0x00bc, B:75:0x00c1, B:77:0x00c6, B:79:0x00cb), top: B:101:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6 A[Catch: IOException -> 0x009d, TryCatch #16 {IOException -> 0x009d, blocks: (B:57:0x0099, B:61:0x00a1, B:63:0x00a6, B:65:0x00ab, B:73:0x00bc, B:75:0x00c1, B:77:0x00c6, B:79:0x00cb), top: B:101:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab A[Catch: IOException -> 0x009d, TRY_LEAVE, TryCatch #16 {IOException -> 0x009d, blocks: (B:57:0x0099, B:61:0x00a1, B:63:0x00a6, B:65:0x00ab, B:73:0x00bc, B:75:0x00c1, B:77:0x00c6, B:79:0x00cb), top: B:101:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc A[Catch: IOException -> 0x009d, TRY_ENTER, TryCatch #16 {IOException -> 0x009d, blocks: (B:57:0x0099, B:61:0x00a1, B:63:0x00a6, B:65:0x00ab, B:73:0x00bc, B:75:0x00c1, B:77:0x00c6, B:79:0x00cb), top: B:101:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c1 A[Catch: IOException -> 0x009d, TryCatch #16 {IOException -> 0x009d, blocks: (B:57:0x0099, B:61:0x00a1, B:63:0x00a6, B:65:0x00ab, B:73:0x00bc, B:75:0x00c1, B:77:0x00c6, B:79:0x00cb), top: B:101:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6 A[Catch: IOException -> 0x009d, TryCatch #16 {IOException -> 0x009d, blocks: (B:57:0x0099, B:61:0x00a1, B:63:0x00a6, B:65:0x00ab, B:73:0x00bc, B:75:0x00c1, B:77:0x00c6, B:79:0x00cb), top: B:101:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cb A[Catch: IOException -> 0x009d, TRY_LEAVE, TryCatch #16 {IOException -> 0x009d, blocks: (B:57:0x0099, B:61:0x00a1, B:63:0x00a6, B:65:0x00ab, B:73:0x00bc, B:75:0x00c1, B:77:0x00c6, B:79:0x00cb), top: B:101:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00db A[Catch: IOException -> 0x00d7, TryCatch #3 {IOException -> 0x00d7, blocks: (B:84:0x00d3, B:88:0x00db, B:90:0x00e0, B:92:0x00e5), top: B:96:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e0 A[Catch: IOException -> 0x00d7, TryCatch #3 {IOException -> 0x00d7, blocks: (B:84:0x00d3, B:88:0x00db, B:90:0x00e0, B:92:0x00e5), top: B:96:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e5 A[Catch: IOException -> 0x00d7, TRY_LEAVE, TryCatch #3 {IOException -> 0x00d7, blocks: (B:84:0x00d3, B:88:0x00db, B:90:0x00e0, B:92:0x00e5), top: B:96:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.meituan.robust.ChangeQuickRedirect] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.nio.channels.WritableByteChannel, java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.nio.channels.FileChannel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean copyFile(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.FileUtils.copyFile(java.lang.String, java.lang.String):boolean");
    }

    public static boolean moveFile(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "478164a31c158e8f35f3e604f638c9a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "478164a31c158e8f35f3e604f638c9a9")).booleanValue();
        }
        try {
            File file = new File(str);
            File file2 = new File(str2);
            if (file.exists()) {
                return file.renameTo(file2);
            }
            return false;
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0568d0e2cfb2bc25b34181af566ba4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0568d0e2cfb2bc25b34181af566ba4f")).booleanValue();
        }
        try {
            return new File(str).delete();
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean cleanDirectory(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6dd44b18a965d65f4511385d168302c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6dd44b18a965d65f4511385d168302c1")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (File file : new File(str).listFiles()) {
                if (file.isDirectory()) {
                    cleanDirectory(file.getPath());
                }
                file.delete();
            }
            return true;
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static long getTotalInternalMemorySize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86088ec14ce59c4db0ffecc2ea79c947", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86088ec14ce59c4db0ffecc2ea79c947")).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    public static long getAvailableInternalMemorySize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a7262362e606e293125386d63af57fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a7262362e606e293125386d63af57fb")).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public static long getAvailableExternalMemorySize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6543ca681ba5064fb1c2645f6a6fadd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6543ca681ba5064fb1c2645f6a6fadd5")).longValue();
        }
        if (isSdcardValid()) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        }
        return -1L;
    }

    public static long getTotalExternalMemorySize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19dd6b8ef0d8ffdfaf7c4434e7690b0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19dd6b8ef0d8ffdfaf7c4434e7690b0f")).longValue();
        }
        if (isSdcardValid()) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        }
        return -1L;
    }

    public static String fileSize(long j) {
        String str;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c28306c7cde40a4c9155c735cd9291b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c28306c7cde40a4c9155c735cd9291b7");
        }
        if (j >= 1024) {
            str = "KB";
            j /= 1024;
            if (j >= 1024) {
                str = "MB";
                j /= 1024;
            }
        } else {
            str = "Byte";
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        return decimalFormat.format(j) + str;
    }

    public static boolean writeFile(String str, String str2, boolean z) {
        FileWriter fileWriter;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileWriter fileWriter2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ebe145ce83438f2d49150892fb102a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ebe145ce83438f2d49150892fb102a6")).booleanValue();
        }
        try {
            fileWriter = new FileWriter(str, z);
            try {
                fileWriter.write(str2);
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            } catch (Exception unused) {
                if (fileWriter != null) {
                    try {
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileWriter2 = fileWriter;
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.flush();
                        fileWriter2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileWriter = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean writeFile(File file, String str, boolean z) {
        FileWriter fileWriter;
        Object[] objArr = {file, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileWriter fileWriter2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3792c7fccf4d246bdeb46e0edfab21a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3792c7fccf4d246bdeb46e0edfab21a")).booleanValue();
            }
            try {
                fileWriter = new FileWriter(file, z);
            } catch (Exception e) {
                e = e;
            }
            try {
                fileWriter.write(str);
                try {
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (Exception e3) {
                e = e3;
                fileWriter2 = fileWriter;
                e.printStackTrace();
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.flush();
                        fileWriter2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileWriter2 = fileWriter;
                if (fileWriter2 != null) {
                    try {
                        fileWriter2.flush();
                        fileWriter2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007b A[Catch: IOException -> 0x0077, TRY_LEAVE, TryCatch #1 {IOException -> 0x0077, blocks: (B:40:0x0073, B:44:0x007b), top: B:48:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readFile(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.common.utils.FileUtils.changeQuickRedirect
            java.lang.String r10 = "c633ed12ca866a7ab1aa3d18f7c62e6f"
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
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
        L2d:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L6f
            if (r3 == 0) goto L3c
            r0.append(r3)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L6f
            r3 = 10
            r0.append(r3)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L6f
            goto L2d
        L3c:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L6f
            r1.close()     // Catch: java.io.IOException -> L47
            r11.close()     // Catch: java.io.IOException -> L47
            goto L6e
        L47:
            r11 = move-exception
            r11.printStackTrace()
            goto L6e
        L4c:
            r0 = move-exception
            goto L59
        L4e:
            r0 = move-exception
            goto L71
        L50:
            r0 = move-exception
            r11 = r2
            goto L59
        L53:
            r0 = move-exception
            r1 = r2
            goto L71
        L56:
            r0 = move-exception
            r11 = r2
            r1 = r11
        L59:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.io.IOException -> L62
            goto L64
        L62:
            r11 = move-exception
            goto L6a
        L64:
            if (r11 == 0) goto L6d
            r11.close()     // Catch: java.io.IOException -> L62
            goto L6d
        L6a:
            r11.printStackTrace()
        L6d:
            r0 = r2
        L6e:
            return r0
        L6f:
            r0 = move-exception
            r2 = r11
        L71:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.io.IOException -> L77
            goto L79
        L77:
            r11 = move-exception
            goto L7f
        L79:
            if (r2 == 0) goto L82
            r2.close()     // Catch: java.io.IOException -> L77
            goto L82
        L7f:
            r11.printStackTrace()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.FileUtils.readFile(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[Catch: IOException -> 0x0072, TRY_LEAVE, TryCatch #1 {IOException -> 0x0072, blocks: (B:40:0x006e, B:44:0x0076), top: B:48:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readFile(java.io.File r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.common.utils.FileUtils.changeQuickRedirect
            java.lang.String r10 = "7c40ac126d92e736d9b3e718b766a8a1"
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
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L2d:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            if (r3 == 0) goto L37
            r0.append(r3)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            goto L2d
        L37:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L6a
            r1.close()     // Catch: java.io.IOException -> L42
            r11.close()     // Catch: java.io.IOException -> L42
            goto L69
        L42:
            r11 = move-exception
            r11.printStackTrace()
            goto L69
        L47:
            r0 = move-exception
            goto L54
        L49:
            r0 = move-exception
            goto L6c
        L4b:
            r0 = move-exception
            r11 = r2
            goto L54
        L4e:
            r0 = move-exception
            r1 = r2
            goto L6c
        L51:
            r0 = move-exception
            r11 = r2
            r1 = r11
        L54:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.io.IOException -> L5d
            goto L5f
        L5d:
            r11 = move-exception
            goto L65
        L5f:
            if (r11 == 0) goto L68
            r11.close()     // Catch: java.io.IOException -> L5d
            goto L68
        L65:
            r11.printStackTrace()
        L68:
            r0 = r2
        L69:
            return r0
        L6a:
            r0 = move-exception
            r2 = r11
        L6c:
            if (r1 == 0) goto L74
            r1.close()     // Catch: java.io.IOException -> L72
            goto L74
        L72:
            r11 = move-exception
            goto L7a
        L74:
            if (r2 == 0) goto L7d
            r2.close()     // Catch: java.io.IOException -> L72
            goto L7d
        L7a:
            r11.printStackTrace()
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.FileUtils.readFile(java.io.File):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readAssetsFile(android.content.Context r11, java.lang.String r12) {
        /*
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r11
            r8 = 1
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.common.utils.FileUtils.changeQuickRedirect
            java.lang.String r10 = "bdb866c5cff06f57a69782445aec3f86"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r9, r8, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L21:
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            java.io.InputStream r11 = r11.open(r12)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3d
            java.lang.String r12 = readInputStream(r11)     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L4e
            if (r11 == 0) goto L4d
            r11.close()     // Catch: java.io.IOException -> L33
            goto L4d
        L33:
            r11 = move-exception
            r11.printStackTrace()
            goto L4d
        L38:
            r12 = move-exception
            goto L3f
        L3a:
            r12 = move-exception
            r11 = r2
            goto L4f
        L3d:
            r12 = move-exception
            r11 = r2
        L3f:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r11 == 0) goto L4c
            r11.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r11 = move-exception
            r11.printStackTrace()
        L4c:
            r12 = r2
        L4d:
            return r12
        L4e:
            r12 = move-exception
        L4f:
            if (r11 == 0) goto L59
            r11.close()     // Catch: java.io.IOException -> L55
            goto L59
        L55:
            r11 = move-exception
            r11.printStackTrace()
        L59:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.FileUtils.readAssetsFile(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static String readRawFile(Context context, int i) {
        InputStream inputStream;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "533dcbb6aca96eb74d4c54cd7af09751", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "533dcbb6aca96eb74d4c54cd7af09751");
            }
            try {
                inputStream = context.getResources().openRawResource(i);
                try {
                    String readInputStream = readInputStream(inputStream);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            return readInputStream;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return readInputStream;
                        }
                    }
                    return readInputStream;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    context = inputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            context = inputStream;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            context = e3;
                        }
                    }
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                context = 0;
                if (context != 0) {
                    try {
                        context.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String readInputStream(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b8c31ce93a8fdaabcb62cc214e028a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b8c31ce93a8fdaabcb62cc214e028a9");
        }
        byte[] bArr = new byte[inputStream.available()];
        inputStream.read(bArr);
        return new String(bArr, "UTF-8");
    }

    public static boolean writeGzipFile(Context context, String str, String str2) {
        GZIPOutputStream gZIPOutputStream;
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62797009341770c8fb9c2bbea9d2e21e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62797009341770c8fb9c2bbea9d2e21e")).booleanValue();
        }
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(new File(str), false)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            gZIPOutputStream.write(str2.getBytes());
            try {
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            gZIPOutputStream2 = gZIPOutputStream;
            e.printStackTrace();
            try {
                gZIPOutputStream2.finish();
                gZIPOutputStream2.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            try {
                gZIPOutputStream2.finish();
                gZIPOutputStream2.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            throw th;
        }
    }

    private static void zip(String str, File file, ZipOutputStream zipOutputStream) throws IOException {
        Object[] objArr = {str, file, zipOutputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedInputStream bufferedInputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a180569a9b44cb07ea157fd7d13addc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a180569a9b44cb07ea157fd7d13addc7");
        } else if (file != null) {
            if (file.isFile()) {
                String canonicalPath = file.getCanonicalPath();
                if (canonicalPath.indexOf(str) != -1) {
                    canonicalPath = canonicalPath.substring(str.length() + File.separator.length());
                }
                zipOutputStream.putNextEntry(new ZipEntry(canonicalPath));
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        IOUtils.copy(bufferedInputStream2, zipOutputStream);
                        IOUtils.close(bufferedInputStream2);
                        zipOutputStream.closeEntry();
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        IOUtils.close(bufferedInputStream);
                        zipOutputStream.closeEntry();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                for (File file2 : file.listFiles()) {
                    zip(str, file2, zipOutputStream);
                }
            }
        }
    }

    public static boolean zip(File file, File file2) throws IOException {
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ZipOutputStream zipOutputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4340396ddfeab7d823d47f31fa4ed75c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4340396ddfeab7d823d47f31fa4ed75c")).booleanValue();
        }
        if (file2 == null || file == null || !file.exists()) {
            return false;
        }
        try {
            if (file.isDirectory() && file2.getParentFile().equals(file)) {
                throw new IOException("recursive error");
            }
            file2.getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new CheckedOutputStream(new FileOutputStream(file2), new CRC32()));
            try {
                zip(file.isFile() ? file.getParentFile().getCanonicalPath() : file.getCanonicalPath(), file, zipOutputStream2);
                zipOutputStream2.flush();
                IOUtils.close(zipOutputStream2);
                return true;
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                IOUtils.close(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean unzip(File file, File file2) throws IOException {
        InputStream inputStream;
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileOutputStream fileOutputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72e4d585df7b277eede3bb29c1f73fb4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72e4d585df7b277eede3bb29c1f73fb4")).booleanValue();
        }
        if (file2 == null || file == null || !file.exists() || !file.isFile()) {
            return false;
        }
        if (file2.exists() || file2.mkdirs()) {
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                String canonicalPath = file2.getCanonicalPath();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement != null) {
                        File file3 = new File(file2, nextElement.getName());
                        if (!file3.getCanonicalPath().startsWith(canonicalPath)) {
                            throw new IOException("potential coverage");
                        }
                        File parentFile = file3.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        if (nextElement.isDirectory()) {
                            file3.mkdirs();
                        } else {
                            try {
                                inputStream = zipFile.getInputStream(nextElement);
                                try {
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                                    try {
                                        IOUtils.copy(inputStream, fileOutputStream2);
                                        IOUtils.close(fileOutputStream2);
                                        IOUtils.close(inputStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                        IOUtils.close(fileOutputStream);
                                        IOUtils.close(inputStream);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        }
                    }
                }
                return true;
            } finally {
                zipFile.close();
            }
        }
        return false;
    }
}
