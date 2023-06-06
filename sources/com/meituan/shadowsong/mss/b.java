package com.meituan.shadowsong.mss;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aec9df66e2bcdf1ece173d2d9976450b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aec9df66e2bcdf1ece173d2d9976450b");
        }
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str);
        return TextUtils.isEmpty(contentTypeFor) ? PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM : contentTypeFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.shadowsong.mss.b.a
            java.lang.String r11 = "754ee294c323a7fcabdf34152446999c"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            byte[] r12 = (byte[]) r12
            return r12
        L1e:
            boolean r0 = r12.isFile()
            if (r0 == 0) goto L77
            boolean r0 = r12.exists()
            if (r0 != 0) goto L2b
            goto L77
        L2b:
            java.lang.System.currentTimeMillis()
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
        L3d:
            int r12 = r3.read(r0)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6a
            r4 = -1
            if (r12 == r4) goto L48
            r1.update(r0, r9, r12)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6a
            goto L3d
        L48:
            byte[] r12 = r1.digest()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6a
            r3.close()     // Catch: java.io.IOException -> L50
            goto L69
        L50:
            r0 = move-exception
            r0.printStackTrace()
            goto L69
        L55:
            r12 = move-exception
            goto L5b
        L57:
            r12 = move-exception
            goto L6c
        L59:
            r12 = move-exception
            r3 = r2
        L5b:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r12 = move-exception
            r12.printStackTrace()
        L68:
            r12 = r2
        L69:
            return r12
        L6a:
            r12 = move-exception
            r2 = r3
        L6c:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r0 = move-exception
            r0.printStackTrace()
        L76:
            throw r12
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.shadowsong.mss.b.a(java.io.File):byte[]");
    }

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25d8a5799c6aa64334d7d2da4d230678", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25d8a5799c6aa64334d7d2da4d230678");
        }
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public static String a(File file, File file2) {
        String message;
        ILogger babelLogger;
        String str;
        Object[] objArr;
        Object[] objArr2 = {file, file2};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipOutputStream zipOutputStream = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "497385f990c14b99b940cbd1e0ca0aa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "497385f990c14b99b940cbd1e0ca0aa2");
        }
        if (file2.exists()) {
            file2.delete();
        }
        if (file.exists()) {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file2.getAbsolutePath()));
                try {
                    message = a(zipOutputStream2, file, "");
                    try {
                        zipOutputStream2.close();
                    } catch (Throwable th) {
                        babelLogger = Logger.getBabelLogger();
                        str = "FileUtils";
                        objArr = new Object[]{th.getMessage()};
                        babelLogger.e(str, objArr);
                        return message;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zipOutputStream = zipOutputStream2;
                    try {
                        message = th.getMessage();
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (Throwable th3) {
                                babelLogger = Logger.getBabelLogger();
                                str = "FileUtils";
                                objArr = new Object[]{th3.getMessage()};
                                babelLogger.e(str, objArr);
                                return message;
                            }
                        }
                        return message;
                    } catch (Throwable th4) {
                        if (zipOutputStream != null) {
                            try {
                                zipOutputStream.close();
                            } catch (Throwable th5) {
                                Logger.getBabelLogger().e("FileUtils", th5.getMessage());
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            return message;
        }
        return "file doesn't exist!";
    }

    private static String a(ZipOutputStream zipOutputStream, File file, String str) {
        ILogger babelLogger;
        String str2;
        Object[] objArr;
        FileInputStream fileInputStream;
        Object[] objArr2 = {zipOutputStream, file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "60c0170f6436c5079ea6a4e3f1916d3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "60c0170f6436c5079ea6a4e3f1916d3a");
        }
        String str3 = "success";
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(str + file.getName() + "/"));
                    zipOutputStream.closeEntry();
                    return "success";
                } catch (Exception e) {
                    return e.getMessage();
                }
            }
            for (File file2 : listFiles) {
                if (!file2.getName().startsWith("metricx_upload_")) {
                    a(zipOutputStream, file2, str + file.getName() + "/");
                }
            }
        } else {
            try {
                zipOutputStream.putNextEntry(new ZipEntry(str + file.getName()));
                fileInputStream = new FileInputStream(file.getAbsolutePath());
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    zipOutputStream.write(bArr, 0, read);
                }
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.closeEntry();
                    } catch (Throwable th2) {
                        Logger.getBabelLogger().e("FileUtils", th2.getMessage());
                    }
                }
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    babelLogger = Logger.getBabelLogger();
                    str2 = "FileUtils";
                    objArr = new Object[]{th3.getMessage()};
                    babelLogger.e(str2, objArr);
                    return str3;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream2 = fileInputStream;
                try {
                    str3 = th.getMessage();
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.closeEntry();
                        } catch (Throwable th5) {
                            Logger.getBabelLogger().e("FileUtils", th5.getMessage());
                        }
                    }
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Throwable th6) {
                            babelLogger = Logger.getBabelLogger();
                            str2 = "FileUtils";
                            objArr = new Object[]{th6.getMessage()};
                            babelLogger.e(str2, objArr);
                            return str3;
                        }
                    }
                    return str3;
                } catch (Throwable th7) {
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.closeEntry();
                        } catch (Throwable th8) {
                            Logger.getBabelLogger().e("FileUtils", th8.getMessage());
                        }
                    }
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Throwable th9) {
                            Logger.getBabelLogger().e("FileUtils", th9.getMessage());
                        }
                    }
                    throw th7;
                }
            }
        }
        return str3;
    }
}
