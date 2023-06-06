package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.TbsExtensionFunctionManager;
import com.tencent.smtt.sdk.TbsPVConfig;
import com.tencent.smtt.sdk.TbsShareManager;
import java.io.File;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public class a {
    public static int a(Context context, File file) {
        return a(context, file, 0);
    }

    public static int a(Context context, File file, int i) {
        try {
            return a(context, file, Build.VERSION.SDK_INT >= 20 ? !TbsExtensionFunctionManager.getInstance().canUseFunction(context, TbsExtensionFunctionManager.DISABLE_GET_APK_VERSION_SWITCH_FILE_NAME) : false, i);
        } catch (Exception unused) {
            TbsLog.i("ApkUtil", "getApkVersion Failed");
            return 0;
        }
    }

    public static int a(Context context, File file, boolean z, int i) {
        if (file != null) {
            try {
                if (file.exists()) {
                    boolean contains = file.getName().contains("tbs.org");
                    boolean contains2 = file.getName().contains("x5.tbs.decouple");
                    if (contains || contains2) {
                        int a = a(contains2, file, i);
                        if (a > 0) {
                            return a;
                        }
                        if (!TbsShareManager.isThirdPartyApp(context) && !file.getAbsolutePath().contains(context.getApplicationInfo().packageName)) {
                            return 0;
                        }
                    }
                    boolean z2 = (Build.VERSION.SDK_INT == 23 || Build.VERSION.SDK_INT == 25) && Build.MANUFACTURER.toLowerCase().contains("mi");
                    TbsPVConfig.releaseInstance();
                    int readApk = TbsPVConfig.getInstance(context).getReadApk();
                    if (readApk == 1) {
                        z = false;
                        z2 = false;
                    } else if (readApk == 2) {
                        return 0;
                    }
                    if (z || z2) {
                        int b = b(file);
                        if (b > 0) {
                            return b;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (file == null || !file.exists()) {
            return 0;
        }
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.versionCode;
            }
            return 0;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return -1;
        }
    }

    private static int a(boolean z, File file, int i) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                File[] listFiles = parentFile.listFiles();
                Pattern compile = Pattern.compile(a(z, i) + "(.*)");
                for (File file2 : listFiles) {
                    if (compile.matcher(file2.getName()).find() && file2.isFile() && file2.exists()) {
                        return Integer.parseInt(file2.getName().substring(file2.getName().lastIndexOf(CommonConstant.Symbol.DOT) + 1));
                    }
                }
                return -1;
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r10) {
        /*
            r0 = 16
            char[] r1 = new char[r0]
            r1 = {x0074: FILL_ARRAY_DATA  , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            r2 = 32
            char[] r2 = new char[r2]
            r3 = 0
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L58
            r10 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
        L1b:
            int r6 = r5.read(r10)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            r7 = -1
            r8 = 0
            if (r6 == r7) goto L27
            r4.update(r10, r8, r6)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            goto L1b
        L27:
            byte[] r10 = r4.digest()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            r4 = 0
        L2c:
            if (r8 >= r0) goto L45
            r6 = r10[r8]     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            int r7 = r4 + 1
            int r9 = r6 >>> 4
            r9 = r9 & 15
            char r9 = r1[r9]     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            r2[r4] = r9     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            int r4 = r7 + 1
            r6 = r6 & 15
            char r6 = r1[r6]     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            r2[r7] = r6     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            int r8 = r8 + 1
            goto L2c
        L45:
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            r10.<init>(r2)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L68
            r5.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r0 = move-exception
            r0.printStackTrace()
        L52:
            return r10
        L53:
            r10 = move-exception
            goto L5a
        L55:
            r10 = move-exception
            r5 = r3
            goto L69
        L58:
            r10 = move-exception
            r5 = r3
        L5a:
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L67
            r5.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r10 = move-exception
            r10.printStackTrace()
        L67:
            return r3
        L68:
            r10 = move-exception
        L69:
            if (r5 == 0) goto L73
            r5.close()     // Catch: java.io.IOException -> L6f
            goto L73
        L6f:
            r0 = move-exception
            r0.printStackTrace()
        L73:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.a.a(java.io.File):java.lang.String");
    }

    public static final String a(boolean z) {
        return a(z, 0);
    }

    public static final String a(boolean z, int i) {
        return i == 64 ? true : i == 32 ? false : b.c() ? z ? "x5.64.decouple.backup" : "x5.64.backup" : z ? "x5.decouple.backup" : "x5.backup";
    }

    public static boolean a(Context context, File file, long j, int i) {
        if (file == null || !file.exists()) {
            TbsLog.i("ApkUtil", "verifyTbsApk return false #1");
            return false;
        } else if (j > 0 && j != file.length()) {
            TbsLog.i("ApkUtil", "verifyTbsApk return false #2");
            return false;
        } else {
            try {
                int a = a(context, file);
                if (i == a) {
                    return "3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a".equals(b.a(context, true, file));
                }
                TbsLog.i("ApkUtil", "verifyTbsApk return false #3  versionCode is " + a + " apkVersion is " + i);
                return false;
            } catch (Exception e) {
                TbsLog.i("ApkUtil", "verifyTbsApk false  stack is " + Log.getStackTraceString(e));
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        r1 = r1[1].trim();
        com.tencent.smtt.utils.TbsLog.i(com.tencent.smtt.sdk.TbsDownloader.LOGTAG, "getApkVersionByReadFile version is " + r1);
        r1 = java.lang.Integer.parseInt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
        r7.close();
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[Catch: all -> 0x00ad, Exception -> 0x00c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c0, blocks: (B:45:0x00b8, B:47:0x00bd), top: B:54:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.io.File r7) {
        /*
            java.lang.String r0 = "TbsDownload"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getApkVersionByReadFile"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = "exists:"
            r1.append(r2)
            boolean r2 = r7.exists()
            r1.append(r2)
            java.lang.String r2 = ";canread:"
            r1.append(r2)
            boolean r2 = r7.canRead()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.smtt.utils.TbsLog.i(r0, r1)
            java.lang.Class<com.tencent.smtt.utils.a> r0 = com.tencent.smtt.utils.a.class
            monitor-enter(r0)
            r1 = 0
            java.util.jar.JarFile r2 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> La0
            java.lang.String r7 = "assets/webkit/tbs.conf"
            java.util.jar.JarEntry r7 = r2.getJarEntry(r7)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L96
            java.io.InputStream r7 = r2.getInputStream(r7)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L96
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L96
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L96
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L96
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L96
        L48:
            java.lang.String r1 = r7.readLine()     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            if (r1 == 0) goto L88
            java.lang.String r3 = "tbs_core_version"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            if (r3 == 0) goto L48
            java.lang.String r3 = "="
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            if (r1 == 0) goto L48
            int r3 = r1.length     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            r4 = 2
            if (r3 != r4) goto L48
            r3 = 1
            r1 = r1[r3]     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            java.lang.String r3 = "TbsDownload"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            java.lang.String r5 = "getApkVersionByReadFile version is "
            r4.<init>(r5)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            r4.append(r1)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            com.tencent.smtt.utils.TbsLog.i(r3, r4)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L8f java.lang.Throwable -> Lb5
            r7.close()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> Lad
            r2.close()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> Lad
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            return r1
        L88:
            r7.close()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
        L8b:
            r2.close()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
            goto Lb2
        L8f:
            r1 = move-exception
            goto La4
        L91:
            r7 = move-exception
            r6 = r1
            r1 = r7
            r7 = r6
            goto Lb6
        L96:
            r7 = move-exception
            r6 = r1
            r1 = r7
            r7 = r6
            goto La4
        L9b:
            r7 = move-exception
            r2 = r1
            r1 = r7
            r7 = r2
            goto Lb6
        La0:
            r7 = move-exception
            r2 = r1
            r1 = r7
            r7 = r2
        La4:
            com.tencent.smtt.utils.TbsLog.i(r1)     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto Laf
            r7.close()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lb2
            goto Laf
        Lad:
            r7 = move-exception
            goto Lc1
        Laf:
            if (r2 == 0) goto Lb2
            goto L8b
        Lb2:
            r7 = -1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            return r7
        Lb5:
            r1 = move-exception
        Lb6:
            if (r7 == 0) goto Lbb
            r7.close()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lc0
        Lbb:
            if (r2 == 0) goto Lc0
            r2.close()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Lc0
        Lc0:
            throw r1     // Catch: java.lang.Throwable -> Lad
        Lc1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.a.b(java.io.File):int");
    }
}
