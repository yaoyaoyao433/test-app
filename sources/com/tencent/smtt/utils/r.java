package com.tencent.smtt.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.msc.modules.api.msi.navigation.MiniProgramApi;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsPrivacyAccess;
import com.tencent.smtt.sdk.TbsShareManager;
import com.tencent.smtt.sdk.c;
import java.io.File;
/* loaded from: classes6.dex */
public class r {
    private static File a = null;
    private static String b = "";
    private static String c = "";
    private static int d = -1;
    private static String e = "";
    private static String f = null;
    private static int g = 0;
    private static String h = null;
    private static boolean i = false;
    private static boolean j = false;
    private static String k = "unknown";
    private static int l = -1;
    private static int m = -1;
    private static int n = -1;
    private static int o = -1;
    private static int p = -1;
    private static String q = "";
    private static String r = "";

    private static int a(Context context, String str, int i2, int i3) {
        File file = new File(FileUtil.a(context, str, i2, true), TbsDownloader.getBackupFileName(false, i3));
        if (file.exists() && file.canRead()) {
            int b2 = a.b(file);
            return b2 <= 0 ? a.a(context, file) : b2;
        }
        return -1;
    }

    public static long a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSize() * statFs.getAvailableBlocks();
    }

    public static void a(int i2) {
        d = i2;
    }

    public static void a(Context context, Bundle bundle) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("sai", 0).edit();
            if (bundle.containsKey(QbSdk.KEY_THIRD_PARTY_TURING)) {
                boolean z = bundle.getBoolean(QbSdk.KEY_THIRD_PARTY_TURING);
                edit.putBoolean("itge", z);
                TbsLog.e("TbsUtils", "setEnableForThirdParty key is itge value is " + z);
            }
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str, String str2) {
        String str3;
        try {
            if (TbsShareManager.isThirdPartyApp(context) && k(context)) {
                String str4 = "thirdapp_" + str;
                if (TextUtils.isEmpty(str2)) {
                    str3 = "";
                } else {
                    str3 = str2 + CommonConstant.Symbol.UNDERLINE;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append("mycpuis");
                sb.append(b.c() ? 64 : 32);
                String str5 = (sb.toString() + "_64scoreis" + TbsShareManager.getTbsStableCoreVersion(context, 64)) + "_32scoreis" + TbsShareManager.getTbsStableCoreVersion(context, 32);
                com.tencent.smtt.sdk.stat.b.a(context, str4, str5);
                TbsLog.i("uploadThirdAppCoreUpdate", "action is " + str4 + " p1 is " + str5);
            }
        } catch (Throwable th) {
            TbsLog.i("uploadThirdAppCoreUpdate", "stack is  " + Log.getStackTraceString(th));
        }
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(b)) {
            b = str;
            return;
        }
        b += "&" + str;
    }

    public static void a(String str, String str2) {
        q = str;
        r = str2;
    }

    @TargetApi(9)
    public static boolean a(Context context) {
        File tbsFolderDir;
        if (context == null) {
            return false;
        }
        if (a == null) {
            try {
                if (context.getApplicationInfo().processName.contains("com.tencent.mm") && (tbsFolderDir = QbSdk.getTbsFolderDir(context)) != null && tbsFolderDir.isDirectory()) {
                    File file = new File(tbsFolderDir, "share");
                    if (file.isDirectory() || file.mkdir()) {
                        a = file;
                        file.setExecutable(true, false);
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public static String b() {
        if (QbSdk.getIsSysWebViewForcedByOuter()) {
            return "SysWebViewForcedByOuter";
        }
        String str = (QbSdk.getIsInitX5Environment() ? "pre" : "nopre") + "&" + b;
        if (QbSdk.getCoreMinVersion() > 0) {
            return "coremin_" + QbSdk.getCoreMinVersion() + "&" + str;
        }
        return str;
    }

    public static void b(Context context, String str, String str2) {
    }

    public static void b(String str) {
        e = str;
    }

    public static boolean b(Context context) {
        boolean z;
        try {
            if (TbsShareManager.isThirdPartyApp(context)) {
                TbsLog.i("TbsUtils", "isStableCoreForHostEnable app is thirdapp return is false ");
                return false;
            }
        } catch (Throwable th) {
            TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
        }
        try {
            final Context applicationContext = context.getApplicationContext();
            z = applicationContext.getSharedPreferences("sai", 0).getBoolean("scfh", true);
            try {
                TbsLog.i("TbsUtils", "isStableCoreForHostEnable is " + z);
                com.tencent.smtt.sdk.c a2 = com.tencent.smtt.sdk.c.a();
                a2.a(context, (Integer) 1003, new c.a() { // from class: com.tencent.smtt.utils.r.1
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("scfh", true);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1003](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
                a2.a(context, (Integer) 1009, new c.a() { // from class: com.tencent.smtt.utils.r.10
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("scfh", false);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1009](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
            } catch (Throwable th2) {
                th = th2;
                TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        return z;
    }

    public static void c() {
        b = "";
    }

    public static boolean c(Context context) {
        boolean z;
        final Context applicationContext;
        try {
            applicationContext = context.getApplicationContext();
            z = applicationContext.getSharedPreferences("sai", 0).getBoolean("ucup", true);
        } catch (Throwable th) {
            th = th;
            z = true;
        }
        try {
            TbsLog.i("TbsUtils", "isUploadCoreUpdateEnable is " + z);
            com.tencent.smtt.sdk.c.a().a(context, (Integer) 1005, new c.a() { // from class: com.tencent.smtt.utils.r.12
                @Override // com.tencent.smtt.sdk.c.a
                public final void a(String str) {
                    SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                    edit.putBoolean("ucup", false);
                    edit.commit();
                    TbsLog.e("TbsUtils", "Execute command [1005](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                }
            });
        } catch (Throwable th2) {
            th = th2;
            TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
            return z;
        }
        return z;
    }

    public static String d() {
        return e;
    }

    public static String d(Context context) {
        SharedPreferences sharedPreferences;
        String string;
        if (TextUtils.isEmpty(c)) {
            try {
                sharedPreferences = context.getSharedPreferences("sai", 0);
                string = sharedPreferences.getString("bmo", "");
                c = string;
            } catch (Throwable th) {
                TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
            }
            if (TextUtils.isEmpty(string)) {
                c = TbsPrivacyAccess.getConfigurePrivacy(context, TbsPrivacyAccess.ConfigurablePrivacy.MODEL, "");
                TbsLog.i("TbsUtils", "getBuildModel from sp is " + c);
                if (TextUtils.isEmpty(c)) {
                    if (TextUtils.isEmpty(c) && !context.getApplicationInfo().packageName.contains("com.tencent.mobileqq")) {
                        c = Build.MODEL;
                    }
                    TbsLog.i("TbsUtils", "getBuildModel is " + c);
                    if (!TextUtils.isEmpty(c)) {
                        TbsPrivacyAccess.configurePrivacy(context, TbsPrivacyAccess.ConfigurablePrivacy.MODEL, c);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString("bmo", c);
                        edit.commit();
                    }
                    return c;
                }
                return c;
            }
            return c;
        }
        return c;
    }

    public static boolean e(Context context) {
        boolean z;
        try {
            final Context applicationContext = context.getApplicationContext();
            z = applicationContext.getSharedPreferences("sai", 0).getBoolean("rrff", false);
            try {
                TbsLog.i("TbsUtils", "isReadResponseFromFileEnable is " + z);
                com.tencent.smtt.sdk.c.a().a(context, (Integer) 1006, new c.a() { // from class: com.tencent.smtt.utils.r.13
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("rrff", true);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1006](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public static boolean f(Context context) {
        boolean z;
        try {
            final Context applicationContext = context.getApplicationContext();
            z = applicationContext.getSharedPreferences("sai", 0).getBoolean("fwdn", false);
            try {
                TbsLog.i("TbsUtils", "isReadResponseFromFileEnable is " + z);
                com.tencent.smtt.sdk.c a2 = com.tencent.smtt.sdk.c.a();
                a2.a(context, (Integer) 1007, new c.a() { // from class: com.tencent.smtt.utils.r.14
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("fwdn", true);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command 1007(" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
                a2.a(context, (Integer) 1008, new c.a() { // from class: com.tencent.smtt.utils.r.15
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("fwdn", false);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command 1008(" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public static boolean g(Context context) {
        boolean z;
        try {
            final Context applicationContext = context.getApplicationContext();
            z = applicationContext.getSharedPreferences("sai", 0).getBoolean("cbau", true);
            try {
                TbsLog.i("TbsUtils", "isClearBackupEnable is " + z);
                com.tencent.smtt.sdk.c a2 = com.tencent.smtt.sdk.c.a();
                a2.a(context, (Integer) 1013, new c.a() { // from class: com.tencent.smtt.utils.r.16
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("cbau", true);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1013](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
                a2.a(context, (Integer) 1014, new c.a() { // from class: com.tencent.smtt.utils.r.17
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("cbau", false);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1014](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
        return z;
    }

    public static boolean h(Context context) {
        boolean z;
        final Context applicationContext;
        if (QbSdk.getTbsVersion(context) == d) {
            TbsLog.i("TbsUtils", "isUploadCoreSourceEnable core source version " + d + " already uploaded and return ");
            return false;
        }
        try {
            applicationContext = context.getApplicationContext();
            z = applicationContext.getSharedPreferences("sai", 0).getBoolean("ucst", true);
        } catch (Throwable th) {
            th = th;
            z = true;
        }
        try {
            TbsLog.i("TbsUtils", "isUploadCoreSourceEnable is " + z);
            com.tencent.smtt.sdk.c a2 = com.tencent.smtt.sdk.c.a();
            a2.a(context, (Integer) 1016, new c.a() { // from class: com.tencent.smtt.utils.r.18
                @Override // com.tencent.smtt.sdk.c.a
                public final void a(String str) {
                    SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                    edit.putBoolean("ucst", false);
                    edit.commit();
                    TbsLog.e("TbsUtils", "Execute command [1016](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                }
            });
            a2.a(context, (Integer) 1015, new c.a() { // from class: com.tencent.smtt.utils.r.2
                @Override // com.tencent.smtt.sdk.c.a
                public final void a(String str) {
                    SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                    edit.putBoolean("ucst", true);
                    edit.commit();
                    TbsLog.e("TbsUtils", "Execute command [1015](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                }
            });
        } catch (Throwable th2) {
            th = th2;
            TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
            return z;
        }
        return z;
    }

    public static boolean i(Context context) {
        boolean z;
        try {
            z = context.getApplicationInfo().packageName.contains("com.tencent.qqmusic");
        } catch (Throwable unused) {
            z = false;
        }
        TbsLog.i("TbsUtils", "shouldUploadDestroyCode is " + z);
        return z;
    }

    public static String j(Context context) {
        l = a(context, "com.tencent.mm", 3, 32);
        m = a(context, "com.tencent.mm", 3, 64);
        n = a(context, "com.tencent.mobileqq", 3, 32);
        o = a(context, "com.tencent.mm", 4, 32);
        p = a(context, "com.tencent.mm", 4, 64);
        q(context);
        String str = "coretype=ctis=" + k;
        int sharedTbsCoreVersion = TbsShareManager.getSharedTbsCoreVersion(context, "com.tencent.mm");
        int sharedTbsCoreVersion2 = TbsShareManager.getSharedTbsCoreVersion(context, "com.tencent.mobileqq");
        return str + "=split=" + (MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX + "=ceis=" + sharedTbsCoreVersion + "_wxd=ceis=" + TbsShareManager.getCoreShareDecoupleCoreVersion(context, "com.tencent.mm") + "_qq=ceis=" + sharedTbsCoreVersion2 + "_qqd=ceis=" + TbsShareManager.getCoreShareDecoupleCoreVersion(context, "com.tencent.mobileqq") + "_wxb32=ceis=" + l + "_wxb64=ceis=" + m + "_qqb=ceis=" + n + "_s32=ceis=" + o + "_s64=ceis=" + p);
    }

    public static boolean k(Context context) {
        boolean z;
        try {
            final Context applicationContext = context.getApplicationContext();
            z = applicationContext.getSharedPreferences("sai", 0).getBoolean("utcu", false);
            try {
                TbsLog.i("TbsUtils", "isUploadThirdAppCoreUpdateEnable is " + z);
                com.tencent.smtt.sdk.c a2 = com.tencent.smtt.sdk.c.a();
                a2.a(context, (Integer) 1019, new c.a() { // from class: com.tencent.smtt.utils.r.3
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("utcu", true);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1019](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
                a2.a(context, (Integer) 1020, new c.a() { // from class: com.tencent.smtt.utils.r.4
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("utcu", false);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1020](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    public static boolean l(Context context) {
        boolean z;
        try {
            final Context applicationContext = context.getApplicationContext();
            z = applicationContext.getSharedPreferences("sai", 0).getBoolean("itge", true);
            try {
                TbsLog.i("TbsUtils", "isTuringEnable is " + z);
                com.tencent.smtt.sdk.c a2 = com.tencent.smtt.sdk.c.a();
                a2.a(context, (Integer) 1021, new c.a() { // from class: com.tencent.smtt.utils.r.5
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("itge", true);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1021](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
                a2.a(context, (Integer) 1022, new c.a() { // from class: com.tencent.smtt.utils.r.6
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("itge", false);
                        edit.commit();
                        TbsLog.e("TbsUtils", "Execute command [1022](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
        return z;
    }

    public static void m(Context context) {
        String[] split;
        try {
            if (context.getApplicationInfo().packageName.contains("com.tencent.mm")) {
                TbsLog.i("TbsUtils", "deleteStableCoreIfNeed #00 ");
                final Context applicationContext = context.getApplicationContext();
                String string = applicationContext.getSharedPreferences("sai", 0).getString("dscin", "");
                TbsLog.i("TbsUtils", "deleteStableCoreIfNeed is " + string);
                com.tencent.smtt.sdk.c.a().a(context, (Integer) 1023, new c.a() { // from class: com.tencent.smtt.utils.r.7
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        String[] split2;
                        TbsLog.i("TbsUtils", "Execute command [1023](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                        if (TextUtils.isEmpty(str) || (split2 = str.split("cl")) == null || split2.length <= 0) {
                            return;
                        }
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putString("dscin", str);
                        edit.commit();
                    }
                });
                if (!TextUtils.isEmpty(string) && (split = string.split("cl")) != null && split.length > 0) {
                    int tbsStableCoreVersion = TbsShareManager.getTbsStableCoreVersion(applicationContext, 32);
                    int tbsStableCoreVersion2 = TbsShareManager.getTbsStableCoreVersion(applicationContext, 64);
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            int parseInt = Integer.parseInt(split[i2]);
                            if (parseInt == tbsStableCoreVersion || parseInt == tbsStableCoreVersion2) {
                                QbSdk.deleteStableCore(applicationContext, parseInt);
                                split[i2] = "";
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    String str = "";
                    boolean z = true;
                    for (int i3 = 0; i3 < split.length; i3++) {
                        try {
                            if (!TextUtils.isEmpty(split[i3])) {
                                if (z) {
                                    str = split[i3];
                                    z = false;
                                } else {
                                    str = str + "cl" + split[i3];
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                    edit.putString("dscin", str);
                    edit.commit();
                }
            }
        } catch (Throwable th) {
            TbsLog.i("TbsUtils", "stack is " + Log.getStackTraceString(th));
        }
    }

    public static boolean n(Context context) {
        boolean z;
        try {
            final Context applicationContext = context.getApplicationContext();
            z = context.getSharedPreferences("sai", 0).getBoolean("ex5i", false);
            try {
                com.tencent.smtt.sdk.c.a().a(context, (Integer) 1024, new c.a() { // from class: com.tencent.smtt.utils.r.8
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("ex5i", "1".equals(str));
                        edit.commit();
                    }
                });
            } catch (Throwable unused) {
                TbsLog.e("TbsUtils", "isX5InitIgnoreSystemCore failed ctx = " + context);
                return z;
            }
        } catch (Throwable unused2) {
            z = false;
        }
        return z;
    }

    public static boolean o(Context context) {
        boolean z;
        try {
            final Context applicationContext = context.getApplicationContext();
            z = context.getSharedPreferences("sai", 0).getBoolean("eitr", false);
            try {
                com.tencent.smtt.sdk.c.a().a(context, (Integer) 1025, new c.a() { // from class: com.tencent.smtt.utils.r.9
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("eitr", "1".equals(str));
                        edit.commit();
                    }
                });
            } catch (Throwable unused) {
                TbsLog.e("TbsUtils", "isInitTimeNeedReport failed ctx = " + context);
                return z;
            }
        } catch (Throwable unused2) {
            z = false;
        }
        return z;
    }

    public static boolean p(Context context) {
        boolean z;
        final Context applicationContext;
        try {
            applicationContext = context.getApplicationContext();
            z = context.getSharedPreferences("sai", 0).getBoolean("easmcv", true);
        } catch (Throwable unused) {
            z = true;
        }
        try {
            com.tencent.smtt.sdk.c.a().a(context, Integer.valueOf((int) TXLiteAVCode.EVT_RTMP_PUSH_PUBLISH_START), new c.a() { // from class: com.tencent.smtt.utils.r.11
                @Override // com.tencent.smtt.sdk.c.a
                public final void a(String str) {
                    SharedPreferences.Editor edit = applicationContext.getSharedPreferences("sai", 0).edit();
                    edit.putBoolean("easmcv", "1".equals(str));
                    edit.commit();
                }
            });
        } catch (Throwable unused2) {
            TbsLog.e("TbsUtils", "isEnableAppSetMinCoreVersion failed ctx = " + context);
            return z;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[Catch: Throwable -> 0x00bf, TryCatch #0 {Throwable -> 0x00bf, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x002b, B:8:0x0036, B:10:0x0046, B:11:0x0048, B:13:0x0058, B:16:0x0064, B:20:0x0074, B:22:0x0082, B:24:0x008c, B:27:0x0093, B:29:0x0099, B:32:0x00a0, B:35:0x00a8, B:17:0x0067, B:38:0x00b1), top: B:41:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void q(android.content.Context r3) {
        /*
            java.lang.String r0 = "core_info"
            java.io.File r0 = com.tencent.smtt.sdk.TbsShareManager.getTbsShareFile(r3, r0)     // Catch: java.lang.Throwable -> Lbf
            if (r0 != 0) goto L9
            return
        L9:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lbf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lbf
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbf
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Throwable -> Lbf
            r1.<init>()     // Catch: java.lang.Throwable -> Lbf
            r1.load(r0)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = "core_version"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getProperty(r0, r2)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lbf
            if (r2 != 0) goto L36
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> Lbf
            r2 = 0
            int r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> Lbf
            com.tencent.smtt.utils.r.g = r0     // Catch: java.lang.Throwable -> Lbf
        L36:
            java.lang.String r0 = "core_packagename"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getProperty(r0, r2)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lbf
            if (r2 != 0) goto L48
            com.tencent.smtt.utils.r.h = r0     // Catch: java.lang.Throwable -> Lbf
        L48:
            java.lang.String r0 = "core_path"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getProperty(r0, r2)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lbf
            if (r2 != 0) goto Lb1
            com.tencent.smtt.utils.r.f = r0     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "com.tencent.mm"
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L67
            java.lang.String r0 = "shareFromWX"
        L64:
            com.tencent.smtt.utils.r.k = r0     // Catch: java.lang.Throwable -> Lbf
            goto L74
        L67:
            java.lang.String r0 = com.tencent.smtt.utils.r.f     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = "com.tencent.mobileqq"
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L74
            java.lang.String r0 = "shareFromQQ"
            goto L64
        L74:
            java.lang.String r0 = com.tencent.smtt.utils.r.f     // Catch: java.lang.Throwable -> Lbf
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> Lbf
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto Lb1
            java.lang.String r3 = "downloadOWN"
            com.tencent.smtt.utils.r.k = r3     // Catch: java.lang.Throwable -> Lbf
            int r3 = com.tencent.smtt.utils.r.g     // Catch: java.lang.Throwable -> Lbf
            int r0 = com.tencent.smtt.utils.r.o     // Catch: java.lang.Throwable -> Lbf
            if (r3 == r0) goto Lae
            int r3 = com.tencent.smtt.utils.r.g     // Catch: java.lang.Throwable -> Lbf
            int r0 = com.tencent.smtt.utils.r.p     // Catch: java.lang.Throwable -> Lbf
            if (r3 != r0) goto L93
            goto Lae
        L93:
            int r3 = com.tencent.smtt.utils.r.g     // Catch: java.lang.Throwable -> Lbf
            int r0 = com.tencent.smtt.utils.r.l     // Catch: java.lang.Throwable -> Lbf
            if (r3 == r0) goto Lab
            int r3 = com.tencent.smtt.utils.r.g     // Catch: java.lang.Throwable -> Lbf
            int r0 = com.tencent.smtt.utils.r.m     // Catch: java.lang.Throwable -> Lbf
            if (r3 != r0) goto La0
            goto Lab
        La0:
            int r3 = com.tencent.smtt.utils.r.g     // Catch: java.lang.Throwable -> Lbf
            int r0 = com.tencent.smtt.utils.r.n     // Catch: java.lang.Throwable -> Lbf
            if (r3 != r0) goto Lb1
            java.lang.String r3 = "copyBackupFromQQ"
        La8:
            com.tencent.smtt.utils.r.k = r3     // Catch: java.lang.Throwable -> Lbf
            goto Lb1
        Lab:
            java.lang.String r3 = "copyBackupFromWX"
            goto La8
        Lae:
            java.lang.String r3 = "copyFromStable"
            goto La8
        Lb1:
            java.lang.String r3 = "core_disabled"
            java.lang.String r0 = "false"
            java.lang.String r3 = r1.getProperty(r3, r0)     // Catch: java.lang.Throwable -> Lbf
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch: java.lang.Throwable -> Lbf
            com.tencent.smtt.utils.r.i = r3     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.r.q(android.content.Context):void");
    }
}
