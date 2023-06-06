package com.meituan.android.common.aidata.ai.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.BundleUtil;
import com.meituan.android.common.aidata.ai.bundle.download.model.DownloadInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ZipUtil {
    private static final byte[] ZIP_HEADER_1 = {80, 75, 3, 4};
    private static final byte[] ZIP_HEADER_2 = {80, 75, 5, 6};
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Callback {
        void unzipFailed(Exception exc);

        void unzipSuccess();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (java.util.Arrays.equals(com.meituan.android.common.aidata.ai.utils.ZipUtil.ZIP_HEADER_2, r2) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isZipFile(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.aidata.ai.utils.ZipUtil.changeQuickRedirect
            java.lang.String r11 = "687a0b031b9240cade33ead9db1835f7"
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
            if (r12 != 0) goto L25
            return r9
        L25:
            boolean r1 = r12.isDirectory()
            if (r1 == 0) goto L2c
            return r9
        L2c:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L57
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L54 java.io.IOException -> L57
            r12 = 4
            byte[] r2 = new byte[r12]     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            int r3 = r1.read(r2, r9, r12)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            if (r3 != r12) goto L4b
            byte[] r12 = com.meituan.android.common.aidata.ai.utils.ZipUtil.ZIP_HEADER_1     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            boolean r12 = java.util.Arrays.equals(r12, r2)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            if (r12 != 0) goto L4a
            byte[] r12 = com.meituan.android.common.aidata.ai.utils.ZipUtil.ZIP_HEADER_2     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            boolean r12 = java.util.Arrays.equals(r12, r2)     // Catch: java.lang.Throwable -> L4f java.io.IOException -> L51
            if (r12 == 0) goto L4b
        L4a:
            r9 = 1
        L4b:
            r1.close()     // Catch: java.io.IOException -> L60
            goto L60
        L4f:
            r12 = move-exception
            goto L61
        L51:
            r12 = move-exception
            r2 = r1
            goto L58
        L54:
            r12 = move-exception
            r1 = r2
            goto L61
        L57:
            r12 = move-exception
        L58:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L60
        L60:
            return r9
        L61:
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.io.IOException -> L66
        L66:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.utils.ZipUtil.isZipFile(java.io.File):boolean");
    }

    public static String getUnzipFilePath(File file, DownloadInfo downloadInfo) {
        File parentFile;
        Object[] objArr = {file, downloadInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b45ac0f66195fd1415e8516336817951", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b45ac0f66195fd1415e8516336817951");
        }
        if (file == null || downloadInfo == null || (parentFile = file.getParentFile()) == null) {
            return null;
        }
        return parentFile + File.separator + BundleUtil.getBundleFullName(downloadInfo.getBundleInfo());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void unZipFile(java.io.File r12, com.meituan.android.common.aidata.ai.bundle.download.model.DownloadInfo r13, java.lang.String r14, com.meituan.android.common.aidata.ai.utils.ZipUtil.Callback r15) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.utils.ZipUtil.unZipFile(java.io.File, com.meituan.android.common.aidata.ai.bundle.download.model.DownloadInfo, java.lang.String, com.meituan.android.common.aidata.ai.utils.ZipUtil$Callback):void");
    }

    public static String getUnzipFilePath2(DownloadInfo downloadInfo) {
        Object[] objArr = {downloadInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4d709ee4458ecce715ae29a2eea0bf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4d709ee4458ecce715ae29a2eea0bf0");
        }
        if (downloadInfo == null) {
            return null;
        }
        File file = new File(downloadInfo.getDownloadDirPath());
        if (file.exists()) {
            return file + File.separator + BundleUtil.getBundleFullName(downloadInfo.getBundleInfo());
        } else if (file.mkdir()) {
            return file + File.separator + BundleUtil.getBundleFullName(downloadInfo.getBundleInfo());
        } else {
            return null;
        }
    }

    public static void unZipFile(@NonNull File file, @NonNull String str, @Nullable Callback callback) {
        ZipInputStream zipInputStream;
        Object[] objArr = {file, str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c8d5388afcc2d5ac1cf30e99b3a479d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c8d5388afcc2d5ac1cf30e99b3a479d");
        } else if (TextUtils.isEmpty(str)) {
            if (callback != null) {
                callback.unzipFailed(new RuntimeException("文件解压目录无效"));
            }
        } else {
            File file2 = new File(str);
            if (!file2.exists()) {
                if (!file2.mkdirs()) {
                    if (callback != null) {
                        callback.unzipFailed(new RuntimeException("文件解压目录创建失败"));
                        return;
                    }
                    return;
                }
                new StringBuilder("ZipUtil-->unZipFile,解压缩目录创建成功：path=").append(file2.getAbsolutePath());
            }
            try {
                zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null) {
                            String replaceAll = (str + File.separator + nextEntry.getName()).replaceAll("\\*", "/");
                            File file3 = new File(replaceAll.substring(0, replaceAll.lastIndexOf(47)));
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            if (!new File(replaceAll).isDirectory()) {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(replaceAll, false));
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                    bufferedOutputStream.flush();
                                }
                                bufferedOutputStream.close();
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        if (zipInputStream != null) {
                            try {
                                zipInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (callback != null) {
                            callback.unzipFailed(e);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (zipInputStream != null) {
                            try {
                                zipInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (callback != null) {
                            callback.unzipSuccess();
                        }
                        throw th;
                    }
                }
                zipInputStream.close();
                if (callback != null) {
                    callback.unzipSuccess();
                }
            } catch (Exception e2) {
                e = e2;
                zipInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                zipInputStream = null;
            }
        }
    }
}
