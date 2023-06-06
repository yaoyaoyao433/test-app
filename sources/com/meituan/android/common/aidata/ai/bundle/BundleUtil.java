package com.meituan.android.common.aidata.ai.bundle;

import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.ai.utils.L;
import com.meituan.android.common.aidata.async.AsyncManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BundleUtil {
    private static final int BUFFER_SIZE = 10240;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getBundleFullName(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99a58859a0022ac63b6cc2b5cd9f48f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99a58859a0022ac63b6cc2b5cd9f48f6");
        }
        return bundleInfo.getDDBundleName() + "@" + getBundleVersion(bundleInfo);
    }

    public static String getBundleVersion(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9cbf8f1687d1f396c388fdfc6549c40", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9cbf8f1687d1f396c388fdfc6549c40");
        }
        if (!TextUtils.isEmpty(bundleInfo.getBundleVersion())) {
            return bundleInfo.getBundleVersion();
        }
        if (TextUtils.isEmpty(bundleInfo.getVersion())) {
            return null;
        }
        return bundleInfo.getVersion();
    }

    public static String convertStreamToString(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd701c8c179b7410f00fe854aaf7d884", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd701c8c179b7410f00fe854aaf7d884");
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

    /* JADX WARN: Removed duplicated region for block: B:38:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readFileAsString(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.aidata.ai.bundle.BundleUtil.changeQuickRedirect
            java.lang.String r10 = "a5ecc0a2ed4be99bdfe45a27251e0917"
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
            java.lang.String r0 = convertStreamToString(r11)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L46
            r11.close()     // Catch: java.io.IOException -> L36
        L36:
            return r0
        L37:
            r0 = move-exception
            goto L3d
        L39:
            r0 = move-exception
            goto L48
        L3b:
            r0 = move-exception
            r11 = r2
        L3d:
            com.meituan.android.common.aidata.ai.utils.L.e(r0)     // Catch: java.lang.Throwable -> L46
            if (r11 == 0) goto L45
            r11.close()     // Catch: java.io.IOException -> L45
        L45:
            return r2
        L46:
            r0 = move-exception
            r2 = r11
        L48:
            if (r2 == 0) goto L4d
            r2.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.bundle.BundleUtil.readFileAsString(java.lang.String):java.lang.String");
    }

    private static void unzip(InputStream inputStream, String str) {
        ZipInputStream zipInputStream;
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "723ce2c578febb93f6a257611c68ce8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "723ce2c578febb93f6a257611c68ce8d");
            return;
        }
        dirChecker(str, "");
        try {
            zipInputStream = new ZipInputStream(inputStream);
            try {
                byte[] bArr = new byte[10240];
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        L.v("[mach-preset]", "Unzipping " + nextEntry.getName(), new Object[0]);
                        if (nextEntry.isDirectory()) {
                            dirChecker(str, nextEntry.getName());
                        } else {
                            File file = new File(str, nextEntry.getName());
                            if (!file.exists()) {
                                if (!file.createNewFile()) {
                                    L.w("[mach-preset]", "Failed to create file " + file.getName(), new Object[0]);
                                } else {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    zipInputStream.closeEntry();
                                    fileOutputStream.close();
                                }
                            }
                        }
                    } else {
                        try {
                            zipInputStream.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                }
            } catch (Exception unused2) {
                if (zipInputStream != null) {
                    try {
                        zipInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (zipInputStream != null) {
                    try {
                        zipInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            zipInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream = null;
        }
    }

    private static void dirChecker(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1ef4141da7239efe157261fd7a3c500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1ef4141da7239efe157261fd7a3c500");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            File file = new File(str, str2);
            if (file.isDirectory()) {
                return;
            }
            file.mkdirs();
        }
    }

    public static void write2File(final String str, final File file) {
        Object[] objArr = {str, file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c2595de6e3d20eec9e06722af772d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c2595de6e3d20eec9e06722af772d6f");
        } else if (TextUtils.isEmpty(str) || file == null) {
        } else {
            if (file.exists()) {
                file.delete();
            }
            AsyncManager.execute(new Runnable() { // from class: com.meituan.android.common.aidata.ai.bundle.BundleUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    BufferedWriter bufferedWriter;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa999fc96181d7a38414edd182c40f5d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa999fc96181d7a38414edd182c40f5d");
                        return;
                    }
                    BufferedWriter bufferedWriter2 = null;
                    try {
                        try {
                            file.createNewFile();
                            bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        bufferedWriter.write(str);
                        bufferedWriter.close();
                        try {
                            bufferedWriter.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bufferedWriter2 = bufferedWriter;
                        e.printStackTrace();
                        if (file.exists()) {
                            file.delete();
                        }
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter2 = bufferedWriter;
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            }, 2);
        }
    }
}
