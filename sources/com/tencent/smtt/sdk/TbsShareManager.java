package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.StringUtil;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.tencent.connect.common.Constants;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/* loaded from: classes6.dex */
public class TbsShareManager {
    private static Context a = null;
    private static boolean b = false;
    private static String c = null;
    private static String d = "";
    private static String e = null;
    private static int f = 0;
    private static String g = null;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static String k = null;
    private static boolean l = false;
    private static boolean m = false;
    public static boolean mHasQueryed = false;

    private static int a(Context context, String str, int i2) {
        File file;
        try {
            file = new File(new File(FileUtil.a(getPackageContext(context, str, false), i2)), TbsDownloader.getBackupFileName(false));
        } catch (Throwable unused) {
            TbsLog.i("TbsShareManager", "getSDCoreVersion exception,pkg=" + str + ", SDCardStatus: " + com.tencent.smtt.utils.b.l(context));
        }
        if (file.exists() && file.canRead()) {
            return com.tencent.smtt.utils.a.b(file);
        }
        TbsLog.i("TbsShareManager", "getSDCoreVersion,file not exist" + file);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, boolean z) {
        b(context, z);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        TbsLog.i("TbsShareManager", "shareTbsCore #1");
        try {
            TbsLinuxToolsJni tbsLinuxToolsJni = new TbsLinuxToolsJni(context);
            a(context, tbsLinuxToolsJni, p.a().r(context));
            File s = p.a().s(context);
            TbsLog.i("TbsShareManager", "shareTbsCore tbsShareDir is " + s.getAbsolutePath());
            tbsLinuxToolsJni.a(s.getAbsolutePath(), "755");
        } catch (Throwable th) {
            TbsLog.i("TbsShareManager", "shareTbsCore tbsShareDir error is " + th.getMessage() + " ## " + th.getCause());
        }
    }

    private static void a(Context context, int i2) {
        String str;
        StringBuilder sb;
        File stableCoreFile;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        if (TbsPVConfig.getInstance(a).isDisableHostBackupCore()) {
            TbsLog.i("TbsShareManager", "installCoreWithUnzip do nothing #1");
        } else if (!p.a().u(context)) {
            TbsLog.i("TbsShareManager", "installCoreWithUnzip do nothing #2");
        } else {
            String[] strArr = {TbsConfig.APP_DEMO, "com.tencent.mm", "com.tencent.mobileqq", "com.qzone", context.getPackageName()};
            TbsLog.i("TbsShareManager", "find host backup core to unzip #1" + Log.getStackTraceString(new Throwable()));
            for (int i3 = 0; i3 < 5; i3++) {
                String str3 = strArr[i3];
                int backupCoreVersion = getBackupCoreVersion(context, str3);
                if (i2 != backupCoreVersion) {
                    TbsLog.i("TbsShareManager", "installCoreWithUnzip getBackupCoreVersion fail, packageName is " + str3 + " result version is " + backupCoreVersion);
                    int backupDecoupleCoreVersion = getBackupDecoupleCoreVersion(context, str3);
                    if (i2 == backupDecoupleCoreVersion) {
                        TbsLog.i("TbsShareManager", "installCoreWithUnzip getBackupDecoupleCoreVersion ok, packageName is " + str3 + " result version is " + backupDecoupleCoreVersion);
                        if (p.a().g(getPackageContext(context, str3, false))) {
                            stableCoreFile = getBackupDecoupleCoreFile(context, str3);
                            if (com.tencent.smtt.utils.a.a(context, stableCoreFile, 0L, i2)) {
                                TbsLog.i("TbsShareManager", "find host backup core to unzip decouple coreVersion is " + i2 + " packageName is " + str3);
                                String str4 = "";
                                try {
                                    str4 = str3.substring(str3.length() - 2);
                                } catch (Throwable th) {
                                    TbsLog.i(TbsDownloader.LOGTAG, "throwable is " + Log.getStackTraceString(th));
                                }
                                com.tencent.smtt.utils.r.a("7is" + i2 + str4);
                                sb2 = new StringBuilder("coreVersionIs");
                            }
                        } else {
                            continue;
                        }
                    } else {
                        TbsLog.i("TbsShareManager", "installCoreWithUnzip getBackupDecoupleCoreVersion fail, packageName is " + str3 + " result version is " + backupDecoupleCoreVersion);
                        int stableCoreVersion = getStableCoreVersion(context, str3);
                        if (i2 == stableCoreVersion) {
                            TbsLog.i("TbsShareManager", "installCoreWithUnzip getStableCoreVersion ok, packageName is " + str3 + " result version is " + stableCoreVersion);
                            if (p.a().g(getPackageContext(context, str3, false))) {
                                stableCoreFile = getStableCoreFile(context, str3);
                                if (com.tencent.smtt.utils.a.a(context, stableCoreFile, 0L, i2)) {
                                    TbsLog.i("TbsShareManager", "find host backup core to unzip normal coreVersion is " + i2 + " packageName is " + str3);
                                    String str5 = "";
                                    try {
                                        str5 = str3.substring(str3.length() - 2);
                                    } catch (Throwable th2) {
                                        TbsLog.i(TbsDownloader.LOGTAG, "throwable is " + Log.getStackTraceString(th2));
                                    }
                                    com.tencent.smtt.utils.r.a("7is" + i2 + str5);
                                    sb2 = new StringBuilder("coreVersionIs");
                                } else {
                                    str = "TbsShareManager";
                                    sb = new StringBuilder("find host backup core to unzip,verify apk failed,pkgName=");
                                    sb.append(str3);
                                    sb.append(";apk=");
                                    sb.append(stableCoreFile.getAbsolutePath());
                                    TbsLog.i(str, sb.toString());
                                }
                            } else {
                                str2 = "TbsShareManager";
                                sb3 = new StringBuilder("find host backup core to unzip,verify app failed,pkgName=");
                                sb3.append(str3);
                                TbsLog.i(str2, sb3.toString());
                            }
                        } else {
                            str = "TbsShareManager";
                            sb = new StringBuilder("installCoreWithUnzip getBackupCoreVersion fail, packageName is ");
                            sb.append(str3);
                            sb.append(" result version is ");
                            sb.append(stableCoreVersion);
                            TbsLog.i(str, sb.toString());
                        }
                    }
                    sb2.append(i2);
                    com.tencent.smtt.utils.r.a(a, "copy_host_core_v2", sb2.toString());
                    p.a().b(context, stableCoreFile, i2);
                    break;
                }
                TbsLog.i("TbsShareManager", "installCoreWithUnzip getBackupCoreVersion ok, packageName is " + str3 + " result version is " + backupCoreVersion);
                if (p.a().g(getPackageContext(context, str3, false))) {
                    stableCoreFile = getBackupCoreFile(context, str3);
                    if (com.tencent.smtt.utils.a.a(context, stableCoreFile, 0L, i2)) {
                        TbsLog.i("TbsShareManager", "find host backup core to unzip normal coreVersion is " + i2 + " packageName is " + str3);
                        String str6 = "";
                        try {
                            str6 = str3.substring(str3.length() - 2);
                        } catch (Throwable th3) {
                            TbsLog.i(TbsDownloader.LOGTAG, "throwable is " + Log.getStackTraceString(th3));
                        }
                        com.tencent.smtt.utils.r.a("7is" + i2 + str6);
                        sb2 = new StringBuilder("coreVersionIs");
                        sb2.append(i2);
                        com.tencent.smtt.utils.r.a(a, "copy_host_core_v2", sb2.toString());
                        p.a().b(context, stableCoreFile, i2);
                        break;
                    }
                    str = "TbsShareManager";
                    sb = new StringBuilder("find host backup core to unzip,verify apk failed,pkgName=");
                    sb.append(str3);
                    sb.append(";apk=");
                    sb.append(stableCoreFile.getAbsolutePath());
                    TbsLog.i(str, sb.toString());
                } else {
                    str2 = "TbsShareManager";
                    sb3 = new StringBuilder("find host backup core to unzip,verify app failed,pkgName=");
                    sb3.append(str3);
                    TbsLog.i(str2, sb3.toString());
                }
            }
            p.a().b();
        }
    }

    private static void a(Context context, TbsLinuxToolsJni tbsLinuxToolsJni, File file) {
        File[] listFiles;
        String absolutePath;
        String str;
        TbsLog.i("TbsShareManager", "shareAllDirsAndFiles #1");
        if (file != null && file.exists() && file.isDirectory()) {
            TbsLog.i("TbsShareManager", "shareAllDirsAndFiles dir is " + file.getAbsolutePath());
            tbsLinuxToolsJni.a(file.getAbsolutePath(), "755");
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    if (file2.getAbsolutePath().indexOf(".so") > 0) {
                        absolutePath = file2.getAbsolutePath();
                        str = "755";
                    } else {
                        absolutePath = file2.getAbsolutePath();
                        str = "644";
                    }
                    tbsLinuxToolsJni.a(absolutePath, str);
                } else if (file2.isDirectory()) {
                    a(context, tbsLinuxToolsJni, file2);
                } else {
                    TbsLog.e("TbsShareManager", "unknown file type.", true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        try {
            a(context, new TbsLinuxToolsJni(context), p.a().q(context));
        } catch (Throwable th) {
            TbsLog.i(th);
        }
    }

    static boolean b(Context context, boolean z) {
        if (i(context)) {
            return true;
        }
        if (z) {
            QbSdk.a(context, "TbsShareManager::isShareTbsCoreAvailable forceSysWebViewInner!");
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Context context) {
        j(context);
        return e;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static void c(android.content.Context r6, boolean r7) {
        /*
            r0 = 0
            java.lang.String r1 = "core_info"
            java.io.File r1 = getTbsShareFile(r6, r1)     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto La
            return
        La:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L71
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L71
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L71
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L71
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L6a
            r2.load(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "core_disabled"
            java.lang.String r5 = "false"
            r2.setProperty(r4, r5)     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L50
            com.tencent.smtt.sdk.p r7 = com.tencent.smtt.sdk.p.a()     // Catch: java.lang.Throwable -> L6a
            java.io.File r7 = r7.r(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L6a
            android.content.Context r4 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L6a
            int r6 = com.tencent.smtt.utils.b.e(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "core_packagename"
            r2.setProperty(r5, r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = "core_path"
            r2.setProperty(r4, r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = "app_version"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L6a
            r2.setProperty(r7, r6)     // Catch: java.lang.Throwable -> L6a
        L50:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6a
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L6a
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            r2.store(r7, r0)     // Catch: java.lang.Throwable -> L66
            r3.close()     // Catch: java.lang.Exception -> L60
        L60:
            r7.close()     // Catch: java.lang.Exception -> L63
        L63:
            return
        L64:
            r6 = move-exception
            goto L84
        L66:
            r6 = move-exception
            goto L6c
        L68:
            r6 = move-exception
            goto L85
        L6a:
            r6 = move-exception
            r7 = r0
        L6c:
            r0 = r3
            goto L73
        L6e:
            r6 = move-exception
            r3 = r0
            goto L85
        L71:
            r6 = move-exception
            r7 = r0
        L73:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7b
            r0.close()     // Catch: java.lang.Exception -> L7b
        L7b:
            if (r7 == 0) goto L81
            r7.close()     // Catch: java.lang.Exception -> L81
        L81:
            return
        L82:
            r6 = move-exception
            r3 = r0
        L84:
            r0 = r7
        L85:
            if (r3 == 0) goto L8a
            r3.close()     // Catch: java.lang.Exception -> L8a
        L8a:
            if (r0 == 0) goto L8f
            r0.close()     // Catch: java.lang.Exception -> L8f
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsShareManager.c(android.content.Context, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Context context) {
        return a(context, true);
    }

    private static String[] d(Context context, boolean z) {
        if (QbSdk.getOnlyDownload()) {
            return new String[]{context.getApplicationContext().getPackageName()};
        }
        return z ? new String[]{context.getApplicationContext().getPackageName()} : getCoreProviderAppList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context e(Context context) {
        j(context);
        Context context2 = null;
        if (g != null) {
            Context packageContext = getPackageContext(context, g, true);
            if (p.a().g(packageContext)) {
                context2 = packageContext;
            }
        }
        return c != null ? a : context2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized String f(Context context) {
        BufferedInputStream bufferedInputStream;
        synchronized (TbsShareManager.class) {
            try {
                File tbsShareFile = getTbsShareFile(context, "core_info");
                if (tbsShareFile == null) {
                    return null;
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(tbsShareFile));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    String property = properties.getProperty("core_packagename", "");
                    if ("".equals(property)) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused) {
                        }
                        return null;
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused2) {
                    }
                    return property;
                } catch (Throwable th) {
                    th = th;
                    th.printStackTrace();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        }
    }

    public static int findCoreForThirdPartyApp(Context context) {
        String str;
        String str2;
        m(context);
        TbsLog.i("TbsShareManager", "findCoreForThirdPartyApp", "core_info mAvailableCoreVersion is " + f + " mAvailableCorePath is " + e + " mSrcPackageName is " + g);
        if (g == null || !g.equals("AppDefined")) {
            if (!k(context)) {
                f = 0;
                e = null;
                g = null;
                str = "TbsShareManager";
                str2 = "checkCoreInfo is false and checkCoreInOthers is false ";
                TbsLog.w(str, "findCoreForThirdPartyApp", str2);
            }
        } else if (f != p.a().a(c)) {
            f = 0;
            e = null;
            g = null;
            str = "TbsShareManager";
            str2 = "check AppDefined core is error src is " + f + " dest is " + p.a().a(c);
            TbsLog.w(str, "findCoreForThirdPartyApp", str2);
        }
        if (f > 0 && (h || !QbSdk.isCoreVerEnabled(context, f))) {
            f = 0;
            e = null;
            g = null;
            TbsLog.i("TbsShareManager", "findCoreForThirdPartyApp", "mCoreDisabled");
        }
        return f;
    }

    public static boolean forceLoadX5FromTBSDemo(Context context) {
        int sharedTbsCoreVersion;
        if (context == null || p.a().a(context, (File[]) null) || (sharedTbsCoreVersion = getSharedTbsCoreVersion(context, TbsConfig.APP_DEMO)) <= 0) {
            return false;
        }
        writeProperties(context, Integer.toString(sharedTbsCoreVersion), TbsConfig.APP_DEMO, p.a().r(getPackageContext(context, TbsConfig.APP_DEMO, true)).getAbsolutePath(), "1");
        return true;
    }

    public static void forceToLoadX5ForThirdApp(Context context, boolean z) {
        File s;
        int a2;
        try {
            if (QbSdk.isNeedInitX5FirstTime() && isThirdPartyApp(context) && !QbSdk.getOnlyDownload() && (s = p.a().s(context)) != null) {
                if (z && new File(s, "core_info").exists()) {
                    return;
                }
                if (c != null && (a2 = p.a().a(c)) > 0) {
                    e = c;
                    g = "AppDefined";
                    f = a2;
                    TbsLog.i("TbsShareManager", "forceToLoadX5ForThirdApp #1 -- mAvailableCoreVersion: " + f + StringUtil.SPACE + Log.getStackTraceString(new Throwable("#")));
                    writeProperties(context, Integer.toString(f), g, e, Integer.toString(1));
                    return;
                }
                TbsLog.i("TbsShareManager", "forceToLoadX5ForThirdApp #1");
                int h2 = h(context);
                int j2 = p.a().j(context);
                TbsLog.i("TbsShareManager", "forceToLoadX5ForThirdApp coreVersionFromConfig is " + h2);
                TbsLog.i("TbsShareManager", "forceToLoadX5ForThirdApp coreVersionFromCoreShare is " + j2);
                String[] coreProviderAppList = getCoreProviderAppList();
                for (String str : coreProviderAppList) {
                    int coreShareDecoupleCoreVersion = getCoreShareDecoupleCoreVersion(context, str);
                    if (coreShareDecoupleCoreVersion >= h2 && coreShareDecoupleCoreVersion >= j2 && coreShareDecoupleCoreVersion > 0) {
                        e = p.a().c(context, getPackageContext(context, str, true)).getAbsolutePath();
                        g = str;
                        f = coreShareDecoupleCoreVersion;
                        TbsLog.i("TbsShareManager", "forceToLoadX5ForThirdApp #2 -- mAvailableCoreVersion: " + f + StringUtil.SPACE + Log.getStackTraceString(new Throwable("#")));
                        if (QbSdk.canLoadX5FirstTimeThirdApp(context)) {
                            int e2 = com.tencent.smtt.utils.b.e(context);
                            TbsLog.i("TbsShareManager", "forceToLoadX5ForThirdApp #2");
                            writeProperties(context, Integer.toString(f), g, e, Integer.toString(e2));
                            return;
                        }
                        f = 0;
                        e = null;
                        g = null;
                    }
                }
                for (String str2 : coreProviderAppList) {
                    int sharedTbsCoreVersion = getSharedTbsCoreVersion(context, str2);
                    if (sharedTbsCoreVersion >= h2 && sharedTbsCoreVersion >= j2 && sharedTbsCoreVersion > 0) {
                        e = p.a().b(context, getPackageContext(context, str2, true)).getAbsolutePath();
                        g = str2;
                        f = sharedTbsCoreVersion;
                        TbsLog.i("TbsShareManager", "forceToLoadX5ForThirdApp #3 -- mAvailableCoreVersion: " + f + StringUtil.SPACE + Log.getStackTraceString(new Throwable("#")));
                        if (QbSdk.canLoadX5FirstTimeThirdApp(context)) {
                            writeProperties(context, Integer.toString(f), g, e, Integer.toString(com.tencent.smtt.utils.b.e(context)));
                            return;
                        }
                        f = 0;
                        e = null;
                        g = null;
                    }
                }
                if (TbsPVConfig.getInstance(a).isDisableHostBackupCore()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    TbsLog.i("TbsShareManager", "in mainthread so do not find host backup core to install ");
                    return;
                }
                for (String str3 : coreProviderAppList) {
                    int backupCoreVersion = getBackupCoreVersion(context, str3);
                    if (backupCoreVersion >= h2 && backupCoreVersion >= j2 && backupCoreVersion > 0) {
                        TbsLog.i("TbsShareManager", "find host backup core to unzip forceload coreVersion is " + backupCoreVersion + " packageName is " + str3);
                        p.a().a(context, getBackupCoreFile(context, str3), backupCoreVersion);
                        TbsLog.i("TbsShareManager", "find host backup core to unzip forceload after unzip ");
                        return;
                    }
                    int backupDecoupleCoreVersion = getBackupDecoupleCoreVersion(context, str3);
                    if (backupDecoupleCoreVersion >= h2 && backupDecoupleCoreVersion >= j2 && backupDecoupleCoreVersion > 0) {
                        TbsLog.i("TbsShareManager", "find host backup core to unzip forceload decouple coreVersion is " + backupDecoupleCoreVersion + " packageName is " + str3);
                        p.a().a(context, getBackupCoreFile(context, str3), backupDecoupleCoreVersion);
                        TbsLog.i("TbsShareManager", "find host backup decouple core to unzip forceload after unzip ");
                        return;
                    }
                    int stableCoreVersion = getStableCoreVersion(context, str3);
                    if (stableCoreVersion >= h2 && stableCoreVersion >= j2 && stableCoreVersion > 0) {
                        TbsLog.i("TbsShareManager", "find host stable core to unzip forceload coreVersion is " + stableCoreVersion + " packageName is " + str3);
                        p.a().a(context, getStableCoreFile(context, str3), stableCoreVersion);
                        TbsLog.i("TbsShareManager", "find host stable core to unzip forceload after unzip ");
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(Context context) {
        try {
            m(context);
            if (e != null && !TextUtils.isEmpty(e)) {
                return e + File.separator + "res.apk";
            }
            return null;
        } catch (Throwable th) {
            Log.e("", "getTbsResourcesPath exception: " + Log.getStackTraceString(th));
            return null;
        }
    }

    public static File getBackupCoreFile(Context context, String str) {
        return getSDCoreFile(context, str, 3);
    }

    public static int getBackupCoreVersion(Context context, String str) {
        return a(context, str, 3);
    }

    public static File getBackupDecoupleCoreFile(Context context, String str) {
        try {
            File file = new File(new File(FileUtil.a(getPackageContext(context, str, false), 4)), TbsDownloader.getBackupFileName(true));
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getBackupDecoupleCoreVersion(Context context, String str) {
        try {
            File file = new File(new File(FileUtil.a(getPackageContext(context, str, false), 4)), TbsDownloader.getBackupFileName(true));
            if (file.exists() && file.canRead()) {
                return com.tencent.smtt.utils.a.b(file);
            }
        } catch (Throwable unused) {
            TbsLog.i("TbsShareManager", "getBackupDecoupleCoreVersion exception,pkg=" + str + ",package not found.");
        }
        return 0;
    }

    public static boolean getCoreDisabled() {
        return h;
    }

    public static boolean getCoreFormOwn() {
        return l;
    }

    public static String[] getCoreProviderAppList() {
        return new String[]{TbsConfig.APP_DEMO, "com.tencent.mm", "com.tencent.mobileqq", "com.qzone", Constants.PACKAGE_QQ_SPEED};
    }

    public static int getCoreShareDecoupleCoreVersion(Context context, String str) {
        Context packageContext = getPackageContext(context, str, true);
        if (packageContext != null) {
            return p.a().i(packageContext);
        }
        return 0;
    }

    public static String getHostCorePathAppDefined() {
        return c;
    }

    public static long getHostCoreVersions(Context context) {
        String[] coreProviderAppList;
        long sharedTbsCoreVersion;
        long sharedTbsCoreVersion2;
        long j2;
        long j3 = 0;
        for (String str : getCoreProviderAppList()) {
            if (str.equalsIgnoreCase("com.tencent.mm")) {
                sharedTbsCoreVersion2 = getSharedTbsCoreVersion(context, str);
                j2 = 10000000000L;
            } else if (str.equalsIgnoreCase("com.tencent.mobileqq")) {
                sharedTbsCoreVersion2 = getSharedTbsCoreVersion(context, str);
                j2 = 100000;
            } else if (str.equalsIgnoreCase("com.qzone")) {
                sharedTbsCoreVersion = getSharedTbsCoreVersion(context, str);
                j3 += sharedTbsCoreVersion;
            }
            sharedTbsCoreVersion = sharedTbsCoreVersion2 * j2;
            j3 += sharedTbsCoreVersion;
        }
        return j3;
    }

    public static Context getPackageContext(Context context, String str, boolean z) {
        if (z) {
            try {
                if (!context.getPackageName().equals(str) && (TbsPVConfig.getInstance(context).isEnableNoCoreGray() || Build.VERSION.SDK_INT >= 29)) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return (context == null || !context.getPackageName().equals(str)) ? context.createPackageContext(str, 2) : context;
    }

    public static File getSDCoreFile(Context context, String str, int i2) {
        try {
            File file = new File(new File(FileUtil.a(getPackageContext(context, str, false), i2)), TbsDownloader.getBackupFileName(false));
            if (file.exists()) {
                if (file.canRead()) {
                    return file;
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getSharedTbsCoreVersion(Context context, String str) {
        Context packageContext = getPackageContext(context, str, true);
        if (packageContext != null) {
            return p.a().j(packageContext);
        }
        return 0;
    }

    public static File getStableCoreFile(Context context, String str) {
        return getSDCoreFile(context, str, 4);
    }

    public static int getStableCoreVersion(Context context, String str) {
        return a(context, str, 4);
    }

    public static String getStableCoreZeroReason() {
        return d;
    }

    public static File getTbsShareFile(Context context, String str) {
        File s = p.a().s(context);
        if (s == null) {
            return null;
        }
        File file = new File(s, str);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int getTbsStableCoreVersion(Context context, int i2) {
        try {
        } catch (Throwable th) {
            TbsLog.i(TbsDownloader.LOGTAG, "getTbsStableCoreVersion stack is " + Log.getStackTraceString(th));
            d = Log.getStackTraceString(th);
        }
        if (context.getApplicationInfo().packageName.contains("com.tencent.mm")) {
            Context packageContext = getPackageContext(context, "com.tencent.mm", false);
            File file = new File(packageContext == null ? new File(FileUtil.a(context, "com.tencent.mm", 4, true)) : new File(FileUtil.a(packageContext, 4)), TbsDownloader.getBackupFileName(false, i2));
            TbsLog.i(TbsDownloader.LOGTAG, "getTbsStableCoreVersion, coreStable is " + file.getAbsolutePath());
            d = "none";
            if (file.exists() && file.canRead()) {
                int b2 = com.tencent.smtt.utils.a.b(file);
                return b2 <= 0 ? com.tencent.smtt.utils.a.a(context, file, i2) : b2;
            }
            TbsLog.i(TbsDownloader.LOGTAG, "getTbsStableCoreVersion,core stable not exist" + file);
            d = file.getAbsolutePath() + " exist is " + file.exists() + " canRead is " + file.canRead();
            return 0;
        }
        return 0;
    }

    static synchronized int h(Context context) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        synchronized (TbsShareManager.class) {
            TbsLog.i("TbsShareManager", "readCoreVersionFromConfig #1");
            try {
                File tbsShareFile = getTbsShareFile(context, "core_info");
                if (tbsShareFile == null) {
                    TbsLog.i("TbsShareManager", "readCoreVersionFromConfig #2");
                    return 0;
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(tbsShareFile));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    String property = properties.getProperty("core_version", "");
                    if ("".equals(property)) {
                        TbsLog.i("TbsShareManager", "readCoreVersionFromConfig #4");
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        return 0;
                    }
                    TbsLog.i("TbsShareManager", "readCoreVersionFromConfig #3");
                    int max = Math.max(Integer.parseInt(property), 0);
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    return max;
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    TbsLog.i("TbsShareManager", "readCoreVersionFromConfig #5");
                    return -2;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Context context) {
        TbsLog.i("TbsShareManager", "isShareTbsCoreAvailableInner", "#1# mAvailableCoreVersion: " + f);
        try {
            if (f == 0) {
                findCoreForThirdPartyApp(context);
            }
            if (f == 0) {
                TbsLog.w("TbsShareManager", "isShareTbsCoreAvailableInner", "can not findCoreForThirdPartyApp");
                return false;
            }
            if (c == null) {
                TbsLog.i("TbsShareManager", "isShareTbsCoreAvailableInner", "#2# check if the installed version is online version");
                if (f != 0 && getSharedTbsCoreVersion(context, g) == f) {
                    return true;
                }
            } else if (f != 0 && p.a().a(c) == f) {
                return true;
            }
            TbsLog.i("TbsShareManager", "isShareTbsCoreAvailableInner", "#3# Core Resource path has been changed!");
            TbsLog.i("TbsShareManager", "isShareTbsCoreAvailableInner", "#4# Can not find core in others, mAvailableCoreVersion is " + f);
            TbsCoreLoadStat tbsCoreLoadStat = TbsCoreLoadStat.getInstance();
            tbsCoreLoadStat.a(context, TbsListener.ErrorCode.INFO_CORE_EXIST_NOT_LOAD, new Throwable("mAvailableCoreVersion=" + f + "; mSrcPackageName=" + g + "; getSharedTbsCoreVersion(ctx, mSrcPackageName) is " + getSharedTbsCoreVersion(context, g) + "; getHostCoreVersions is " + getHostCoreVersions(context)));
            e = null;
            f = 0;
            TbsLog.w("TbsShareManager", "isShareTbsCoreAvailableInner", "[share] conflict x5core cannot share");
            QbSdk.a(context, "TbsShareManager::isShareTbsCoreAvailableInner forceSysWebViewInner!");
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            TbsLog.w("TbsShareManager", "isShareTbsCoreAvailableInner", "final available core inner false.");
            return false;
        }
    }

    public static boolean isThirdPartyApp(Context context) {
        try {
        } catch (Throwable th) {
            TbsLog.i(th);
        }
        if (a == null || !a.equals(context.getApplicationContext())) {
            Context applicationContext = context.getApplicationContext();
            a = applicationContext;
            String packageName = applicationContext.getPackageName();
            for (String str : getCoreProviderAppList()) {
                if (packageName.equals(str)) {
                    b = false;
                    return false;
                }
            }
            b = true;
            return true;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(Context context) {
        return b(context, true);
    }

    private static boolean k(Context context) {
        String str;
        String str2;
        String str3;
        StringBuilder sb;
        String str4;
        if (g != null) {
            if (f == getSharedTbsCoreVersion(context, g)) {
                str3 = "TbsShareManager";
                sb = new StringBuilder("checkCoreInfo mAvailableCoreVersion is ");
                sb.append(f);
                sb.append(" mSrcPackageName is ");
                sb.append(g);
                str4 = " and return true #01";
            } else {
                TbsLog.i("TbsShareManager", "checkCoreInfo mAvailableCoreVersion is " + f + " mSrcPackageName is " + g + " getSharedTbsCoreVersion(ctx, mSrcPackageName) is " + getSharedTbsCoreVersion(context, g) + " and return false #01");
                if (f == getCoreShareDecoupleCoreVersion(context, g)) {
                    str3 = "TbsShareManager";
                    sb = new StringBuilder("checkCoreInfo mAvailableCoreVersion is ");
                    sb.append(f);
                    sb.append(" mSrcPackageName is ");
                    sb.append(g);
                    str4 = " and return true #02";
                } else {
                    str = "TbsShareManager";
                    str2 = "checkCoreInfo return false end";
                }
            }
            sb.append(str4);
            TbsLog.i(str3, sb.toString());
            return true;
        }
        str = "TbsShareManager";
        str2 = "checkCoreInfo mSrcPackageName is null";
        TbsLog.i(str, str2);
        return false;
    }

    private static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        writeProperties(context, Integer.toString(0), "", "", Integer.toString(0));
        return true;
    }

    private static void m(Context context) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        File tbsShareFile;
        TbsLog.i("TbsShareManager", "loadProperties -- core_info_already_read " + m);
        if (m) {
            return;
        }
        synchronized (TbsShareManager.class) {
            if (m) {
                return;
            }
            try {
                tbsShareFile = getTbsShareFile(context, "core_info");
                TbsLog.i("TbsShareManager", "loadProperties -- propFile: " + tbsShareFile);
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
            if (tbsShareFile == null) {
                return;
            }
            bufferedInputStream = new BufferedInputStream(new FileInputStream(tbsShareFile));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty("core_version", "");
                TbsLog.i("TbsShareManager", "loadProperties -- tmp core version : " + property);
                if (!"".equals(property)) {
                    f = Math.max(Integer.parseInt(property), 0);
                    TbsLog.i("TbsShareManager", "loadProperties -- mAvailableCoreVersion: " + f);
                }
                String property2 = properties.getProperty("core_packagename", "");
                if (!"".equals(property2)) {
                    g = property2;
                }
                if (g != null && a != null) {
                    if (g.equals(a.getPackageName())) {
                        l = true;
                    } else {
                        l = false;
                    }
                }
                String property3 = properties.getProperty("core_path", "");
                if (!"".equals(property3)) {
                    e = property3;
                }
                String property4 = properties.getProperty(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, "");
                if (!"".equals(property4)) {
                    k = property4;
                }
                h = Boolean.parseBoolean(properties.getProperty("core_disabled", "false"));
                m = true;
            } catch (Throwable th3) {
                th = th3;
                th.printStackTrace();
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                }
            }
            try {
                bufferedInputStream.close();
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
            }
        }
    }

    public static void setHostCorePathAppDefined(String str) {
        c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x03d7, code lost:
        if (r6.equals(r12.getApplicationContext().getPackageName()) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03d9, code lost:
        com.tencent.smtt.utils.TbsLog.i("TbsShareManager", "thirdAPP pre--> delete old core_share Directory:" + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03f4, code lost:
        com.tencent.smtt.utils.FileUtil.b(com.tencent.smtt.sdk.p.a().r(r12));
        com.tencent.smtt.utils.TbsLog.i("TbsShareManager", "thirdAPP success--> delete old core_share Directory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03ff, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0400, code lost:
        r7.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02aa, code lost:
        if (r6.equals(r12.getApplicationContext().getPackageName()) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02ac, code lost:
        com.tencent.smtt.utils.TbsLog.i("TbsShareManager", "thirdAPP pre--> delete old core_share Directory:" + r13);
        com.tencent.smtt.sdk.n.a(com.tencent.smtt.sdk.TbsShareManager.a).a("remove_old_core", 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02ca, code lost:
        com.tencent.smtt.utils.r.a(com.tencent.smtt.sdk.TbsShareManager.a, "write_core_info", ("packageName=is=" + r6) + "_coreVersion=is=" + r13);
        writeProperties(r12, java.lang.Integer.toString(r13), r6, r8, java.lang.Integer.toString(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0300, code lost:
        r6 = r6.substring(r6.length() - 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x030b, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x030c, code lost:
        com.tencent.smtt.utils.TbsLog.i(com.tencent.smtt.sdk.TbsDownloader.LOGTAG, "throwable is " + android.util.Log.getStackTraceString(r6));
        r6 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04cb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void writeCoreInfoForThirdPartyApp(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsShareManager.writeCoreInfoForThirdPartyApp(android.content.Context, int, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void writeProperties(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsShareManager.writeProperties(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
