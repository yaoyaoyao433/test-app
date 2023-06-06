package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.weaver.impl.blank.BlankConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes6.dex */
public final class fd {

    /* loaded from: classes6.dex */
    public enum a {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        
        final int d;

        a(int i) {
            this.d = i;
        }
    }

    public static int a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.android.systemui", 128);
                if (applicationInfo == null || applicationInfo.metaData == null) {
                    return 0;
                }
                return applicationInfo.metaData.getInt("SupportForPushVersionCode");
            } catch (PackageManager.NameNotFoundException unused) {
                return 0;
            }
        }
        return 0;
    }

    private static a a(Context context, ApplicationInfo applicationInfo) {
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo == null || i < 24) {
            return a.UNKNOWN;
        }
        Boolean bool = null;
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                bool = Boolean.valueOf(((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled());
            } else {
                Object a2 = i >= 29 ? am.a(context.getSystemService(RemoteMessageConst.NOTIFICATION), "getService", new Object[0]) : context.getSystemService("security");
                if (a2 != null) {
                    bool = (Boolean) am.b(a2, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid));
                }
            }
            if (bool != null) {
                return bool.booleanValue() ? a.ALLOWED : a.NOT_ALLOWED;
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("are notifications enabled error " + e);
        }
        return a.UNKNOWN;
    }

    @TargetApi(19)
    public static a a(Context context, String str, boolean z) {
        ApplicationInfo applicationInfo;
        a a2;
        if (context == null || TextUtils.isEmpty(str)) {
            return a.UNKNOWN;
        }
        try {
            applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            a2 = a(context, applicationInfo);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("get app op error " + th);
        }
        if (a2 != a.UNKNOWN) {
            return a2;
        }
        Integer num = (Integer) am.a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
        if (num == null) {
            return a.UNKNOWN;
        }
        Integer num2 = (Integer) am.a((Object) ((AppOpsManager) context.getSystemService("appops")), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
        int i = (Integer) am.a((Class<? extends Object>) AppOpsManager.class, "MODE_ALLOWED");
        int i2 = (Integer) am.a((Class<? extends Object>) AppOpsManager.class, "MODE_IGNORED");
        com.xiaomi.channel.commonutils.logger.c.b(String.format("get app mode %s|%s|%s", num2, i, i2));
        if (i == null) {
            i = 0;
        }
        if (i2 == null) {
            i2 = 1;
        }
        if (num2 != null) {
            return z ? !num2.equals(i2) ? a.ALLOWED : a.NOT_ALLOWED : num2.equals(i) ? a.ALLOWED : a.NOT_ALLOWED;
        }
        return a.UNKNOWN;
    }

    public static String a(Context context, int i) {
        List<ActivityManager.RunningAppProcessInfo> list;
        if (context == null) {
            return null;
        }
        try {
            list = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        } catch (Exception unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static String a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    public static int b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static String b(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String[] strArr = runningAppProcessInfo.pkgList;
                for (int i = 0; strArr != null && i < strArr.length; i++) {
                    if (!arrayList.contains(strArr[i])) {
                        arrayList.add(strArr[i]);
                        if (arrayList.size() == 1) {
                            str = (String) arrayList.get(0);
                        } else {
                            sb.append("#");
                            str = strArr[i];
                        }
                        sb.append(str.hashCode() % BlankConfig.MAX_SAMPLE);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static boolean c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == Process.myPid() && runningAppProcessInfo.processName.equals(context.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Arrays.asList(runningAppProcessInfo.pkgList).contains(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean d(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static String e(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    public static int f(Context context, String str) {
        ApplicationInfo i = i(context, str);
        if (i != null) {
            int i2 = i.icon;
            return i2 == 0 ? i.logo : i2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Drawable g(android.content.Context r2, java.lang.String r3) {
        /*
            android.content.pm.ApplicationInfo r3 = i(r2, r3)
            r0 = 0
            if (r3 == 0) goto L31
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: java.lang.Exception -> L1f
            android.graphics.drawable.Drawable r1 = r3.loadIcon(r1)     // Catch: java.lang.Exception -> L1f
            if (r1 != 0) goto L1d
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L1a
            android.graphics.drawable.Drawable r0 = r3.loadLogo(r2)     // Catch: java.lang.Exception -> L1a
            goto L31
        L1a:
            r2 = move-exception
            r0 = r1
            goto L20
        L1d:
            r0 = r1
            goto L31
        L1f:
            r2 = move-exception
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "get app icon drawable failed, "
            r3.<init>(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.xiaomi.channel.commonutils.logger.c.a(r2)
        L31:
            if (r0 == 0) goto L34
            return r0
        L34:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fd.g(android.content.Context, java.lang.String):android.graphics.drawable.Drawable");
    }

    public static boolean h(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(com.sankuai.meituan.takeoutnew.util.aop.l.a(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static ApplicationInfo i(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.c.a("not found app info " + str);
            return null;
        }
    }
}
