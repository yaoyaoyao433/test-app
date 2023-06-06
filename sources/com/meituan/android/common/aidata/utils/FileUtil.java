package com.meituan.android.common.aidata.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FileUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String convertStreamToString(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "10bf09d4ef7517b2c53e0d3ea8e5d4b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "10bf09d4ef7517b2c53e0d3ea8e5d4b4");
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
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.aidata.utils.FileUtil.changeQuickRedirect
            java.lang.String r10 = "7bb4d118130c0c5eccfcd2c9457fbe1f"
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
            r0.getMessage()     // Catch: java.lang.Throwable -> L46
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
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.utils.FileUtil.readFileAsString(java.lang.String):java.lang.String");
    }

    public static String readFileFromAsset(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a4d47d418fe7577f7e3c9a713767ecb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a4d47d418fe7577f7e3c9a713767ecb");
        }
        try {
            return convertStreamToString(context.getAssets().open(str));
        } catch (Exception unused) {
            return "";
        }
    }

    public static void copyFileUsingStream(File file, File file2) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50cbcf8390f4fe991a056ee216a6d642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50cbcf8390f4fe991a056ee216a6d642");
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            fileInputStream.close();
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Exception unused3) {
            fileOutputStream2 = fileOutputStream;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static void deleteFileInDir(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ede2b057ad93f98a02d6f475f926c998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ede2b057ad93f98a02d6f475f926c998");
        } else if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                    for (File file2 : listFiles) {
                        if (file2 != null) {
                            delFile(file2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean delFile(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47258d2235d3ffd673a25e194b7026bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47258d2235d3ffd673a25e194b7026bc")).booleanValue();
        }
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                delFile(file2);
            }
        }
        return file.delete();
    }
}
