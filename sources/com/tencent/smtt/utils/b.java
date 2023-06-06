package com.tencent.smtt.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.resource.APKStructure;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsPrivacyAccess;
import com.tencent.smtt.sdk.c;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public class b {
    public static String a = "";
    public static String b = "";
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static String f = "";
    private static String g = "";
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static boolean k = false;
    private static boolean l = false;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String a() {
        /*
            boolean r0 = com.tencent.smtt.utils.b.j
            if (r0 != 0) goto L81
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "getprop ro.product.cpu.abi"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L4e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4e
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L47
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "x86"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L30
            java.lang.String r3 = "i686"
        L2b:
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L42
            goto L37
        L30:
            java.lang.String r3 = "os.arch"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.Throwable -> L42
            goto L2b
        L37:
            if (r3 == 0) goto L3b
            com.tencent.smtt.utils.b.c = r3
        L3b:
            r1.close()     // Catch: java.io.IOException -> L3e
        L3e:
            r2.close()     // Catch: java.io.IOException -> L6a
            goto L6a
        L42:
            r3 = move-exception
            goto L51
        L44:
            r3 = move-exception
            r1 = r0
            goto L72
        L47:
            r3 = move-exception
            r1 = r0
            goto L51
        L4a:
            r3 = move-exception
            r1 = r0
            r2 = r1
            goto L72
        L4e:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L51:
            java.lang.String r4 = "os.arch"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = a(r4)     // Catch: java.lang.Throwable -> L71
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L62
            com.tencent.smtt.utils.b.c = r4
        L62:
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.io.IOException -> L67
        L67:
            if (r2 == 0) goto L6a
            goto L3e
        L6a:
            r0 = 1
            com.tencent.smtt.utils.b.j = r0
            goto L81
        L6e:
            r3 = move-exception
            r0 = r4
            goto L72
        L71:
            r3 = move-exception
        L72:
            if (r0 == 0) goto L76
            com.tencent.smtt.utils.b.c = r0
        L76:
            if (r1 == 0) goto L7b
            r1.close()     // Catch: java.io.IOException -> L7b
        L7b:
            if (r2 == 0) goto L80
            r2.close()     // Catch: java.io.IOException -> L80
        L80:
            throw r3
        L81:
            java.lang.String r0 = com.tencent.smtt.utils.b.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.b.a():java.lang.String");
    }

    public static String a(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:9:0x001a, B:13:0x002a, B:10:0x0020), top: B:17:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r3, java.io.File r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L30
            r2 = 65
            android.content.pm.PackageInfo r3 = r3.getPackageArchiveInfo(r1, r2)     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L27
            android.content.pm.Signature[] r1 = r3.signatures     // Catch: java.lang.Exception -> L30
            if (r1 == 0) goto L20
            android.content.pm.Signature[] r1 = r3.signatures     // Catch: java.lang.Exception -> L30
            int r1 = r1.length     // Catch: java.lang.Exception -> L30
            if (r1 <= 0) goto L20
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Exception -> L30
            r1 = 0
            r3 = r3[r1]     // Catch: java.lang.Exception -> L30
            goto L28
        L20:
            java.lang.String r3 = "AppUtil"
            java.lang.String r1 = "[getSignatureFromApk] pkgInfo is not null BUT signatures is null!"
            com.tencent.smtt.utils.TbsLog.w(r3, r1)     // Catch: java.lang.Exception -> L30
        L27:
            r3 = r0
        L28:
            if (r3 == 0) goto L48
            java.lang.String r3 = r3.toCharsString()     // Catch: java.lang.Exception -> L30
            r0 = r3
            goto L48
        L30:
            java.lang.String r3 = "AppUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getSign "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "failed"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.tencent.smtt.utils.TbsLog.i(r3, r4)
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.b.a(android.content.Context, java.io.File):java.lang.String");
    }

    public static String a(Context context, String str) {
        try {
            String valueOf = String.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
            try {
                return String.valueOf(Integer.toHexString(Integer.parseInt(valueOf)));
            } catch (Exception unused) {
                return valueOf;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0064 A[Catch: Throwable -> 0x0079, TryCatch #7 {Throwable -> 0x0079, blocks: (B:36:0x0054, B:38:0x0064, B:40:0x0071), top: B:61:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r3, boolean r4, java.io.File r5) {
        /*
            if (r5 == 0) goto Lb8
            boolean r0 = r5.exists()
            if (r0 != 0) goto La
            goto Lb8
        La:
            if (r4 == 0) goto L54
            r4 = 0
            r0 = 2
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            java.lang.String r2 = "r"
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3b
            r1.read(r0)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L4a
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L4a
            r4.<init>(r0)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L4a
            java.lang.String r0 = "PK"
            boolean r4 = r4.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L4a
            if (r4 != 0) goto L32
            java.lang.String r4 = ""
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L31
        L2d:
            r3 = move-exception
            r3.printStackTrace()
        L31:
            return r4
        L32:
            r1.close()     // Catch: java.io.IOException -> L45
            goto L54
        L36:
            r4 = move-exception
            goto L3e
        L38:
            r3 = move-exception
            r1 = r4
            goto L4b
        L3b:
            r0 = move-exception
            r1 = r4
            r4 = r0
        L3e:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            r1.close()     // Catch: java.io.IOException -> L45
            goto L54
        L45:
            r4 = move-exception
            r4.printStackTrace()
            goto L54
        L4a:
            r3 = move-exception
        L4b:
            r1.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r4 = move-exception
            r4.printStackTrace()
        L53:
            throw r3
        L54:
            android.content.Context r4 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "com.jd.jrapp"
            boolean r4 = r4.contains(r0)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L80
            java.lang.String r4 = "AppUtil"
            java.lang.String r0 = "[AppUtil.getSignatureFromApk]  #1"
            com.tencent.smtt.utils.TbsLog.i(r4, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = a(r5)     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L80
            java.lang.String r0 = "AppUtil"
            java.lang.String r1 = "[AppUtil.getSignatureFromApk]  #2"
            com.tencent.smtt.utils.TbsLog.i(r0, r1)     // Catch: java.lang.Throwable -> L79
            return r4
        L79:
            java.lang.String r4 = "AppUtil"
            java.lang.String r0 = "[AppUtil.getSignatureFromApk]  #3"
            com.tencent.smtt.utils.TbsLog.i(r4, r0)
        L80:
            java.lang.String r4 = "AppUtil"
            java.lang.String r0 = "[AppUtil.getSignatureFromApk]  #4"
            com.tencent.smtt.utils.TbsLog.i(r4, r0)
            java.lang.String r3 = a(r3, r5)
            java.lang.String r4 = "AppUtil"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[AppUtil.getSignatureFromApk]  android api signature="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.smtt.utils.TbsLog.i(r4, r0)
            if (r3 != 0) goto Lb7
            java.lang.String r3 = a(r5)
            java.lang.String r4 = "AppUtil"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "[AppUtil.getSignatureFromApk]  java get signature="
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.smtt.utils.TbsLog.i(r4, r5)
        Lb7:
            return r3
        Lb8:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.b.a(android.content.Context, boolean, java.io.File):java.lang.String");
    }

    private static String a(File file) {
        try {
            JarFile jarFile = new JarFile(file);
            byte[] bArr = new byte[8192];
            String a2 = a(a(jarFile, jarFile.getJarEntry(APKStructure.AndroidManifest_Type), bArr)[0].getEncoded());
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                String name = nextElement.getName();
                if (name != null) {
                    Certificate[] a3 = a(jarFile, nextElement, bArr);
                    String a4 = a3 != null ? a(a3[0].getEncoded()) : null;
                    if (a4 == null) {
                        if (!name.startsWith("META-INF/")) {
                            return null;
                        }
                    } else if (!a4.equals(a2)) {
                        return null;
                    }
                }
            }
            return a2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    private static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            byte b2 = bArr[i2];
            int i3 = (b2 >> 4) & 15;
            int i4 = i2 * 2;
            cArr[i4] = (char) (i3 >= 10 ? (i3 + 97) - 10 : i3 + 48);
            int i5 = b2 & 15;
            cArr[i4 + 1] = (char) (i5 >= 10 ? (i5 + 97) - 10 : i5 + 48);
        }
        return new String(cArr);
    }

    private static Certificate[] a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) throws Exception {
        InputStream inputStream = jarFile.getInputStream(jarEntry);
        do {
        } while (inputStream.read(bArr, 0, bArr.length) != -1);
        inputStream.close();
        if (jarEntry != null) {
            return jarEntry.getCertificates();
        }
        return null;
    }

    public static int b(Context context) {
        if (TbsPrivacyAccess.AndroidVersion.isDisabled()) {
            return 0;
        }
        return Build.VERSION.SDK_INT;
    }

    public static void b(Context context, String str) {
        try {
            TbsDownloadConfig tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
            tbsDownloadConfig.mSyncMap.put(TbsDownloadConfig.TbsConfigKey.KEY_GUID, str);
            tbsDownloadConfig.commit();
        } catch (Exception unused) {
        }
    }

    public static boolean b() {
        Matcher matcher;
        try {
            matcher = Pattern.compile("i686|mips|x86_64|x86").matcher(c);
        } catch (Exception unused) {
            matcher = null;
        }
        return matcher == null || !matcher.find();
    }

    public static String c(Context context) {
        if (TbsPrivacyAccess.DeviceModel.isDisabled()) {
            return "";
        }
        if (!l) {
            String d2 = r.d(context);
            try {
                f = new String(d2.getBytes("UTF-8"), "ISO8859-1");
            } catch (Exception unused) {
                f = d2;
            }
            l = true;
        }
        return f;
    }

    public static boolean c() {
        Class<?> cls;
        Method declaredMethod;
        Object invoke;
        Method declaredMethod2;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (Build.VERSION.SDK_INT < 21 || (cls = Class.forName("dalvik.system.VMRuntime")) == null || (declaredMethod = cls.getDeclaredMethod("getRuntime", new Class[0])) == null || (invoke = declaredMethod.invoke(null, new Object[0])) == null || (declaredMethod2 = cls.getDeclaredMethod("is64Bit", new Class[0])) == null) {
            return false;
        }
        Object invoke2 = declaredMethod2.invoke(invoke, new Object[0]);
        if (invoke2 instanceof Boolean) {
            return ((Boolean) invoke2).booleanValue();
        }
        return false;
    }

    public static String d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String f(Context context) {
        try {
            return TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_GUID, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean g(final Context context) {
        boolean z;
        try {
            z = context.getSharedPreferences("sai", 0).getBoolean("gi", false);
            try {
                TbsLog.i("AppUtil", "getImeiEnable is " + z);
                com.tencent.smtt.sdk.c.a().a(context, (Integer) 1001, new c.a() { // from class: com.tencent.smtt.utils.b.1
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = context.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("gi", true);
                        edit.commit();
                        TbsLog.e("TBSEmergency", "Execute command [1001](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("AppUtil", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public static String h(Context context) {
        if (!h) {
            try {
                String m = m(context);
                a = m;
                if (TextUtils.isEmpty(m)) {
                    a = j.a(context);
                }
            } catch (Exception e2) {
                TbsLog.i(e2);
            }
            h = true;
        }
        return a;
    }

    public static String i(Context context) {
        String str;
        String str2;
        if (!QbSdk.isEnableSensitiveApi()) {
            str = "AppUtil";
            str2 = "getImsi isEnableSensitiveApi = false";
        } else if (QbSdk.isEnableCanGetSubscriberId()) {
            if (!i) {
                try {
                } catch (Exception e2) {
                    TbsLog.i(e2);
                }
                if (context.getApplicationInfo().packageName.contains("com.tencent.mobileqq")) {
                    return "";
                }
                b = com.meituan.android.privacy.aop.d.e((TelephonyManager) context.getSystemService("phone"));
                i = true;
            }
            return b;
        } else {
            str = "AppUtil";
            str2 = "getImsi isEnableCanGetSubscriberId is false";
        }
        TbsLog.i(str, str2);
        return "";
    }

    public static String j(Context context) {
        return "02:00:00:00:00:00";
    }

    public static String k(Context context) {
        if (!QbSdk.isEnableSensitiveApi()) {
            TbsLog.i("AppUtil", "getAndroidID isEnableSensitiveApi = false");
            return "";
        } else if (!QbSdk.isEnableGetAndroidID()) {
            TbsLog.i("AppUtil", "getAndroidID isEnableGetAndroidID is false");
            return "";
        } else if (!o(context)) {
            TbsLog.i("AppUtil", "getAndroidID isAndroidIDEnable is false");
            return "";
        } else {
            if (!k) {
                try {
                    e = com.sankuai.meituan.takeoutnew.util.aop.l.a(context.getContentResolver(), "android_id");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                k = true;
            }
            TbsLog.i("AppUtil", "getAndroidID mAndroidID is " + e);
            return e;
        }
    }

    public static boolean l(Context context) {
        return context != null && context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    private static String m(Context context) {
        try {
        } catch (Exception e2) {
            TbsLog.i(e2);
        }
        if (!QbSdk.isEnableGetDeviceID()) {
            TbsLog.i("AppUtil", "getDeviceID isEnableGetDeviceID is false");
            return "";
        } else if (!n(context)) {
            TbsLog.i("AppUtil", "getDeviceID isDeviceIDEnable is false");
            return "";
        } else {
            g = com.meituan.android.privacy.aop.d.a((TelephonyManager) context.getSystemService("phone"));
            TbsLog.i("AppUtil", "getDeviceID mDeviceID is " + g);
            return g;
        }
    }

    private static boolean n(final Context context) {
        boolean z;
        try {
            z = context.getSharedPreferences("sai", 0).getBoolean("pdi", false);
            try {
                TbsLog.i("AppUtil", "isDeviceIDEnable is " + z);
                com.tencent.smtt.sdk.c a2 = com.tencent.smtt.sdk.c.a();
                a2.a(context, (Integer) 1004, new c.a() { // from class: com.tencent.smtt.utils.b.2
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = context.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("pdi", false);
                        edit.commit();
                        TbsLog.e("TBSEmergency", "Execute command [1004](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
                a2.a(context, (Integer) 1010, new c.a() { // from class: com.tencent.smtt.utils.b.3
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = context.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("pdi", true);
                        edit.commit();
                        TbsLog.e("TBSEmergency", "Execute command [1010](+extra+)");
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("AppUtil", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    private static boolean o(final Context context) {
        boolean z;
        try {
            z = context.getSharedPreferences("sai", 0).getBoolean("gpai", false);
            try {
                TbsLog.i("AppUtil", "isAndroidIDEnable is " + z);
                com.tencent.smtt.sdk.c a2 = com.tencent.smtt.sdk.c.a();
                a2.a(context, (Integer) 1012, new c.a() { // from class: com.tencent.smtt.utils.b.4
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = context.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("gpai", false);
                        edit.commit();
                        TbsLog.e("TBSEmergency", "Execute command [1012](+extra+)");
                    }
                });
                a2.a(context, (Integer) 1011, new c.a() { // from class: com.tencent.smtt.utils.b.5
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = context.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("gpai", true);
                        edit.commit();
                        TbsLog.e("TBSEmergency", "Execute command [1011](+extra+)");
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("AppUtil", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }
}
