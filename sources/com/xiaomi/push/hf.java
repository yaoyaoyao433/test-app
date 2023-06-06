package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes6.dex */
public final class hf {
    private static String a = null;
    private static String b = null;
    private static String c = "";
    private static String d = null;
    private static String e = null;
    private static final String f = "\u0002";
    private static final String[] g = {"--", "a-", "u-", "v-", "o-", "g-"};
    private static final Set<String> h;
    private static boolean i;

    static {
        HashSet hashSet = new HashSet();
        h = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        h.add("com.xiaomi.finddevice");
        h.add("com.miui.securitycenter");
        i = true;
    }

    @TargetApi(17)
    public static int a() {
        Object a2 = am.a("android.os.UserHandle", "myUserId", new Object[0]);
        if (a2 == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(a2)).intValue();
    }

    private static long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public static boolean a(Context context, String str) {
        PackageInfo packageInfo = (PackageInfo) am.a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        return packageInfo == null || packageInfo.applicationInfo == null || ((packageInfo.applicationInfo.flags & 2097152) == 2097152 && (packageInfo.applicationInfo.flags & 8388608) != 8388608);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i2 = 0; i2 < g.length; i2++) {
            if (str.startsWith(g[i2])) {
                return true;
            }
        }
        return false;
    }

    public static String b(Context context) {
        int f2 = f();
        String c2 = c(context);
        while (c2 == null) {
            int i2 = f2 - 1;
            if (f2 <= 0) {
                break;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
            }
            c2 = c(context);
            f2 = i2;
        }
        return c2;
    }

    private static boolean b(String str) {
        if (str == null) {
            return true;
        }
        String trim = str.trim();
        return trim.length() == 0 || trim.equalsIgnoreCase(StringUtil.NULL) || trim.equalsIgnoreCase("unknown");
    }

    public static String c(Context context) {
        String str;
        Object a2;
        Object a3;
        Object a4;
        if (jj.f()) {
            return "";
        }
        if (a != null) {
            return a;
        }
        try {
            if (n(context)) {
                String str2 = (!jj.a() || (a3 = am.a("miui.telephony.TelephonyManager", "getDefault", new Object[0])) == null || (a4 = am.a(a3, "getMiuiDeviceId", new Object[0])) == null || !(a4 instanceof String)) ? null : (String) String.class.cast(a4);
                if (str2 == null) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (Build.VERSION.SDK_INT < 26) {
                        str = com.meituan.android.privacy.aop.d.a(telephonyManager);
                    } else {
                        if (1 == telephonyManager.getPhoneType()) {
                            a2 = am.a((Object) telephonyManager, "getImei", (Object[]) null);
                        } else if (2 == telephonyManager.getPhoneType()) {
                            a2 = am.a((Object) telephonyManager, "getMeid", (Object[]) null);
                        }
                        str = (String) a2;
                    }
                }
                str = str2;
            } else {
                str = null;
            }
            if (c(str)) {
                a = str;
                return str;
            }
            return "";
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.a("failure to get id:" + th);
            return null;
        }
    }

    private static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 15 && str.length() >= 14 && ar.e(str) && !ar.f(str);
    }

    public static String d() {
        return g() + "KB";
    }

    public static String d(Context context) {
        int f2 = f();
        String e2 = e(context);
        while (e2 == null) {
            int i2 = f2 - 1;
            if (f2 <= 0) {
                break;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
            }
            e2 = e(context);
            f2 = i2;
        }
        return e2;
    }

    public static String e() {
        long a2 = a(Environment.getDataDirectory());
        return (a2 / 1024) + "KB";
    }

    public static String e(Context context) {
        m(context);
        if (TextUtils.isEmpty(c)) {
            return "";
        }
        String str = "";
        for (String str2 : c.split(CommonConstant.Symbol.COMMA)) {
            if (c(str2)) {
                str = str + ar.a(str2) + CommonConstant.Symbol.COMMA;
            }
        }
        int length = str.length();
        return length > 0 ? str.substring(0, length - 1) : str;
    }

    private static int f() {
        return Build.VERSION.SDK_INT < 29 ? 10 : 0;
    }

    public static synchronized String f(Context context) {
        synchronized (hf.class) {
            if (e != null) {
                return e;
            }
            String k = k(context);
            String b2 = ar.b(k + ((String) null));
            e = b2;
            return b2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r1 = r1.exists()
            r2 = 0
            if (r1 == 0) goto L55
            r1 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L51
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L51
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L51
            r4 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L51
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L52
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L52
            if (r3 != 0) goto L41
            java.lang.String r3 = "\\s+"
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L52
            if (r1 == 0) goto L41
            int r3 = r1.length     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L52
            r4 = 2
            if (r3 < r4) goto L41
            r3 = 1
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L52
            boolean r4 = android.text.TextUtils.isDigitsOnly(r4)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L52
            if (r4 == 0) goto L41
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L52
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L52
            r2 = r1
        L41:
            r0.close()     // Catch: java.io.IOException -> L55
            goto L55
        L45:
            r1 = move-exception
            goto L4b
        L47:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L4b:
            if (r0 == 0) goto L50
            r0.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r1
        L51:
            r0 = r1
        L52:
            if (r0 == 0) goto L55
            goto L41
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hf.g():int");
    }

    public static synchronized String g(Context context) {
        String b2;
        synchronized (hf.class) {
            String k = k(context);
            b2 = ar.b(k + ((String) null));
        }
        return b2;
    }

    public static String h(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    public static boolean i(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int a2 = com.sankuai.waimai.platform.utils.f.a(registerReceiver, "status", -1);
            return a2 == 2 || a2 == 5;
        }
        return false;
    }

    public static boolean j(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    private static String k(Context context) {
        if (b == null && i) {
            boolean o = o(context);
            i = o;
            if (o) {
                try {
                    b = com.sankuai.meituan.takeoutnew.util.aop.l.a(context.getContentResolver(), "android_id");
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.c.a("failure to get androidId: " + th);
                }
                return b;
            }
            return null;
        }
        return b;
    }

    private static String l(Context context) {
        int f2 = f();
        String c2 = c(context);
        while (TextUtils.isEmpty(c2)) {
            int i2 = f2 - 1;
            if (f2 <= 0) {
                break;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
            }
            c2 = c(context);
            f2 = i2;
        }
        return c2;
    }

    private static String m(Context context) {
        Object a2;
        if (!jj.f() && Build.VERSION.SDK_INT >= 22) {
            if (TextUtils.isEmpty(c)) {
                c(context);
                if (TextUtils.isEmpty(a)) {
                    return "";
                }
                try {
                    if (n(context)) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        Integer num = (Integer) am.a((Object) telephonyManager, "getPhoneCount", new Object[0]);
                        if (num == null || num.intValue() <= 1) {
                            return "";
                        }
                        String str = null;
                        for (int i2 = 0; i2 < num.intValue(); i2++) {
                            if (Build.VERSION.SDK_INT < 26) {
                                a2 = am.a((Object) telephonyManager, "getDeviceId", Integer.valueOf(i2));
                            } else if (1 == telephonyManager.getPhoneType()) {
                                a2 = am.a((Object) telephonyManager, "getImei", Integer.valueOf(i2));
                            } else {
                                if (2 == telephonyManager.getPhoneType()) {
                                    a2 = am.a((Object) telephonyManager, "getMeid", Integer.valueOf(i2));
                                }
                                if (!TextUtils.isEmpty(str) && !TextUtils.equals(a, str) && c(str)) {
                                    c += str + CommonConstant.Symbol.COMMA;
                                }
                            }
                            str = (String) a2;
                            if (!TextUtils.isEmpty(str)) {
                                c += str + CommonConstant.Symbol.COMMA;
                            }
                        }
                        int length = c.length();
                        if (length > 0) {
                            c = c.substring(0, length - 1);
                        }
                        return c;
                    }
                    return "";
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.c.a("failure to get ids: " + e2);
                    return "";
                }
            }
            return c;
        }
        return "";
    }

    private static boolean n(Context context) {
        String packageName = context.getPackageName();
        if (jj.a() && h.contains(packageName)) {
            return com.sankuai.meituan.takeoutnew.util.aop.f.a(context.getPackageManager(), "android.permission.READ_PHONE_STATE", packageName) == 0 || com.sankuai.meituan.takeoutnew.util.aop.f.a(context.getPackageManager(), "android.permission.READ_PRIVILEGED_PHONE_STATE", packageName) == 0;
        }
        return false;
    }

    private static boolean o(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
        intent.setComponent(componentName);
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(componentName, 128);
            if (serviceInfo.metaData != null) {
                String string = serviceInfo.metaData.getString("supportGetAndroidID");
                if (TextUtils.isEmpty(string)) {
                    return true;
                }
                return Boolean.parseBoolean(string);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static String a(Context context, boolean z) {
        if (d == null) {
            String k = k(context);
            String l = jj.f() ? "" : l(context);
            int i2 = 1;
            if (!(Build.VERSION.SDK_INT < 26) && b(l) && b((String) null)) {
                ab.a(context);
                if (TextUtils.isEmpty(null)) {
                    String b2 = ab.a(context).b();
                    if (TextUtils.isEmpty(b2) || b2.startsWith("00000000-0000-0000-0000-000000000000")) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                        k = b2;
                    }
                } else {
                    k = ((String) null) + k;
                    i2 = 2;
                }
            } else {
                k = l + k + ((String) null);
            }
            com.xiaomi.channel.commonutils.logger.c.b("devid rule select:" + i2);
            if (i2 == 3) {
                d = k;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append((i2 <= 0 || i2 >= g.length) ? g[0] : g[i2]);
                sb.append(ar.b(k));
                d = sb.toString();
            }
        }
        return d;
    }

    public static String a(Context context) {
        try {
            return j.a(context).a;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a("failure to get gaid:" + e2.getMessage());
            return null;
        }
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        float g2 = ((((((g() + 102400) / 524288) + 1) * 512) * 1024) / 1024.0f) / 1024.0f;
        double d2 = g2;
        if (d2 > 0.5d) {
            g2 = (float) Math.ceil(d2);
        }
        sb.append(g2);
        sb.append("GB");
        return sb.toString();
    }

    public static String c() {
        int i2 = 1;
        while (true) {
            double d2 = i2;
            if (d2 >= ((a(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) {
                return d2 + "GB";
            }
            i2 <<= 1;
        }
    }
}
