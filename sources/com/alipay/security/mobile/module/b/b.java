package com.alipay.security.mobile.module.b;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.meituan.android.privacy.aop.e;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.meituan.takeoutnew.util.aop.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static b a = new b();

    public static b a() {
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r1) {
        /*
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r0 = a(r1, r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = ""
            return r1
        Lb:
            if (r1 == 0) goto L1c
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L1c
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1c
            java.lang.String r1 = com.meituan.android.privacy.aop.d.a(r1)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L21
            java.lang.String r1 = ""
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.b.b.a(android.content.Context):java.lang.String");
    }

    private static boolean a(Context context, String str) {
        return !(f.a(context.getPackageManager(), str, context.getPackageName()) == 0);
    }

    public static String b() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j = 0;
        }
        return String.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = a(r2, r1)
            if (r1 == 0) goto Ld
            java.lang.String r2 = ""
            return r2
        Ld:
            if (r2 == 0) goto L1e
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1e
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1e
            java.lang.String r2 = com.meituan.android.privacy.aop.d.e(r2)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r2 = r0
        L1f:
            if (r2 != 0) goto L23
            java.lang.String r2 = ""
        L23:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.b.b.b(android.content.Context):java.lang.String");
    }

    public static String c() {
        long j;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(com.alipay.security.mobile.module.a.a.a().getPath());
            j = statFs.getBlockSize() * statFs.getAvailableBlocks();
            return String.valueOf(j);
        }
        j = 0;
        return String.valueOf(j);
    }

    public static String c(Context context) {
        int i;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
            i = 0;
        }
        return i == 1 ? "1" : "0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (r2 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d() {
        /*
            java.lang.String r0 = "0000000000000000"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L52
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L52
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L52
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L50
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L50
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L4e
            r1 = 1
            r5 = 1
        L1b:
            r6 = 100
            if (r5 >= r6) goto L47
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            java.lang.String r7 = "Serial"
            int r7 = r6.indexOf(r7)     // Catch: java.lang.Throwable -> L45
            if (r7 < 0) goto L42
            java.lang.String r5 = ":"
            int r5 = r6.indexOf(r5)     // Catch: java.lang.Throwable -> L45
            int r5 = r5 + r1
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r6.substring(r5, r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L45
            r0 = r1
            goto L47
        L42:
            int r5 = r5 + 1
            goto L1b
        L45:
            r1 = r4
            goto L54
        L47:
            r4.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            r3.close()     // Catch: java.lang.Throwable -> L65
            goto L65
        L4e:
            goto L54
        L50:
            r3 = r1
            goto L54
        L52:
            r2 = r1
            r3 = r2
        L54:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Throwable -> L5a
            goto L5b
        L5a:
        L5b:
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.lang.Throwable -> L61
            goto L62
        L61:
        L62:
            if (r2 != 0) goto L65
            goto L68
        L65:
            r2.close()     // Catch: java.lang.Throwable -> L68
        L68:
            if (r0 != 0) goto L6c
            java.lang.String r0 = ""
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.b.b.d():java.lang.String");
    }

    public static String d(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i));
            jSONObject.put("call", String.valueOf(streamVolume));
            jSONObject.put("system", String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put(NotificationCompat.CATEGORY_ALARM, String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static String e() {
        String v = v();
        return !com.alipay.security.mobile.module.a.a.a(v) ? v : w();
    }

    public static String e(Context context) {
        TelephonyManager telephonyManager;
        String networkOperatorName;
        if (context != null) {
            try {
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
            if (telephonyManager != null) {
                networkOperatorName = telephonyManager.getNetworkOperatorName();
                return (networkOperatorName != null || StringUtil.NULL.equals(networkOperatorName)) ? "" : networkOperatorName;
            }
        }
        networkOperatorName = null;
        if (networkOperatorName != null) {
        }
    }

    public static String f() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    String[] split = bufferedReader.readLine().split(":\\s+", 2);
                    if (split != null && split.length > 1) {
                        String str = split[1];
                        try {
                            fileReader.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                        return str;
                    }
                    try {
                        fileReader.close();
                    } catch (Throwable unused3) {
                        try {
                            bufferedReader.close();
                            return "";
                        } catch (Throwable unused4) {
                            return "";
                        }
                    }
                } catch (Throwable unused5) {
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    if (bufferedReader == null) {
                        return "";
                    }
                    bufferedReader.close();
                    return "";
                }
            } catch (Throwable unused7) {
                bufferedReader = null;
            }
        } catch (Throwable unused8) {
            fileReader = null;
            bufferedReader = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(android.content.Context r3) {
        /*
            if (r3 == 0) goto L4d
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L4d
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            r0 = -1
            java.util.List r3 = r3.getSensorList(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L4d
            if (r0 <= 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4d
        L22:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L44
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L4d
            android.hardware.Sensor r1 = (android.hardware.Sensor) r1     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.getVersion()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.getVendor()     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            goto L22
        L44:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = com.alipay.security.mobile.module.a.a.e(r3)     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 != 0) goto L52
            java.lang.String r3 = ""
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.b.b.f(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r2 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2b
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L25
            java.lang.String r5 = "\\s+"
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Throwable -> L29
            r5 = 1
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L29
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L29
            long r2 = (long) r1
        L25:
            r4.close()     // Catch: java.lang.Throwable -> L39
            goto L39
        L29:
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r0 = r1
            r4 = r0
        L2f:
            if (r4 == 0) goto L36
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L36
        L35:
        L36:
            if (r0 != 0) goto L39
            goto L3c
        L39:
            r0.close()     // Catch: java.lang.Throwable -> L3c
        L3c:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.b.b.g():java.lang.String");
    }

    public static String g(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public static String h() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j = 0;
        }
        return String.valueOf(j);
    }

    public static String h(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String i() {
        long j;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            j = statFs.getBlockSize() * statFs.getBlockCount();
            return String.valueOf(j);
        }
        j = 0;
        return String.valueOf(j);
    }

    public static String i(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String j() {
        String str = "";
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
        }
        return str == null ? "" : str;
    }

    public static String j(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String k() {
        String str = "";
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
        }
        return str == null ? "" : str;
    }

    public static String k(Context context) {
        if (a(context, "android.permission.ACCESS_WIFI_STATE")) {
            return "";
        }
        try {
            String a2 = e.a(e.c((WifiManager) context.getSystemService("wifi")));
            if (a2 != null) {
                try {
                    if (a2.length() != 0 && !"02:00:00:00:00:00".equals(a2)) {
                        return a2;
                    }
                } catch (Throwable unused) {
                    return a2;
                }
            }
            return u();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String l() {
        String str = "";
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
        }
        return str == null ? "" : str;
    }

    public static String l(Context context) {
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            String d = com.meituan.android.privacy.aop.d.d((TelephonyManager) context.getSystemService("phone"));
            if (d != null) {
                if (d == null) {
                    return d;
                }
                try {
                    if (d.length() != 0) {
                        return d;
                    }
                } catch (Throwable unused) {
                    return d;
                }
            }
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String m() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis - (currentTimeMillis % 1000));
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String m(Context context) {
        String str;
        try {
            str = l.a(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String n() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String n(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String o() {
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00" + CommonConstant.Symbol.COLON);
            for (int i = 0; i < 7; i++) {
                sb.append(new File(strArr[i]).exists() ? "1" : "0");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String o(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = a(r2, r1)
            if (r1 == 0) goto Ld
            java.lang.String r2 = ""
            return r2
        Ld:
            java.lang.String r1 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L25
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2     // Catch: java.lang.Throwable -> L25
            boolean r1 = r2.isWifiEnabled()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L25
            android.net.wifi.WifiInfo r2 = com.meituan.android.privacy.aop.e.c(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r2.getBSSID()     // Catch: java.lang.Throwable -> L25
            goto L26
        L25:
            r2 = r0
        L26:
            if (r2 != 0) goto L2a
            java.lang.String r2 = ""
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.b.b.o(android.content.Context):java.lang.String");
    }

    public static String p() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb = new StringBuilder("00");
        sb.append(CommonConstant.Symbol.COLON);
        for (int i = 0; i <= 0; i++) {
            try {
                Class.forName(strArr[0]);
                sb.append("1");
            } catch (Throwable unused) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static String p(Context context) {
        int i = context.getApplicationInfo().targetSdkVersion;
        String str = "";
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "";
            } else {
                str = (Build.VERSION.SDK_INT < 26 || i < 28) ? Build.SERIAL : com.meituan.android.privacy.aop.d.a();
            }
        } catch (Throwable unused) {
        }
        return str == null ? "" : str;
    }

    public static String q() {
        LineNumberReader lineNumberReader;
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        sb.append("00" + CommonConstant.Symbol.COLON);
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String readLine = lineNumberReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (readLine.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        sb.append('0');
                        if (lineNumberReader == null) {
                        }
                        lineNumberReader.close();
                    }
                }
                sb.append(c);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb.toString();
    }

    public static String q(Context context) {
        try {
            String t = t(context);
            String x = x();
            if (com.alipay.security.mobile.module.a.a.b(t) && com.alipay.security.mobile.module.a.a.b(x)) {
                return t + CommonConstant.Symbol.COLON + x();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String r() {
        StringBuilder sb = new StringBuilder();
        sb.append("00" + CommonConstant.Symbol.COLON);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                String str2 = (String) Build.class.getField(str).get(null);
                String str3 = (String) linkedHashMap.get(str);
                String lowerCase = str2 != null ? str2.toLowerCase() : null;
                if (lowerCase != null && lowerCase.contains(str3)) {
                    c = '1';
                }
            } catch (Throwable unused) {
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String r(Context context) {
        try {
            long j = 0;
            if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
                for (int i = 0; i < 5; i++) {
                    long j2 = -1;
                    try {
                        j2 = new File(strArr[i]).lastModified();
                    } catch (Throwable unused) {
                    }
                    j = Math.max(j2, j);
                }
                return "1:" + j;
            }
            return "0:0";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String s() {
        StringBuilder sb = new StringBuilder();
        sb.append("00" + CommonConstant.Symbol.COLON);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            String str2 = (String) linkedHashMap.get(str);
            String b = com.alipay.security.mobile.module.a.a.b(str, "");
            if (b != null && b.contains(str2)) {
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String s(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int a2 = com.sankuai.waimai.platform.utils.f.a(registerReceiver, "level", -1);
            int a3 = com.sankuai.waimai.platform.utils.f.a(registerReceiver, "status", -1);
            boolean z = a3 == 2 || a3 == 5;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "1" : "0");
            sb.append(CommonConstant.Symbol.COLON);
            sb.append(a2);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String t(Context context) {
        if (a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                return (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) ? "2G" : (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) ? "3G" : subtype == 13 ? "4G" : "UNKNOW";
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String u() {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list != null) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface != null && networkInterface.getName() != null && networkInterface.getName().equalsIgnoreCase("wlan0")) {
                        byte[] a2 = e.a(networkInterface);
                        if (a2 == null) {
                            return "02:00:00:00:00:00";
                        }
                        StringBuilder sb = new StringBuilder();
                        int length = a2.length;
                        for (int i = 0; i < length; i++) {
                            sb.append(String.format("%02X:", Integer.valueOf(a2[i] & 255)));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        return sb.toString();
                    }
                }
                return "02:00:00:00:00:00";
            }
            return "02:00:00:00:00:00";
        } catch (Throwable unused) {
            return "02:00:00:00:00:00";
        }
    }

    private static String v() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                    try {
                        fileReader.close();
                        return "";
                    } catch (Throwable unused3) {
                        return "";
                    }
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        if (com.alipay.security.mobile.module.a.a.a(readLine)) {
            try {
                bufferedReader.close();
            } catch (Throwable unused6) {
            }
            fileReader.close();
            return "";
        }
        String trim = readLine.trim();
        try {
            bufferedReader.close();
        } catch (Throwable unused7) {
        }
        try {
            fileReader.close();
        } catch (Throwable unused8) {
        }
        return trim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        r1 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r0 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String w() {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L43
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L43
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41
            r4 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L41
        L11:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L3b
            boolean r4 = com.alipay.security.mobile.module.a.a.a(r2)     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L11
            java.lang.String r4 = ":"
            java.lang.String[] r2 = r2.split(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L11
            int r4 = r2.length     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            if (r4 <= r5) goto L11
            r4 = 0
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "BogoMIPS"
            boolean r4 = r4.contains(r6)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L11
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L3f
            r1 = r2
        L3b:
            r3.close()     // Catch: java.lang.Throwable -> L4f
            goto L4f
        L3f:
            goto L45
        L41:
            r0 = r2
            goto L45
        L43:
            r0 = r2
            r3 = r0
        L45:
            if (r3 == 0) goto L4c
            r3.close()     // Catch: java.lang.Throwable -> L4b
            goto L4c
        L4b:
        L4c:
            if (r0 != 0) goto L4f
            goto L52
        L4f:
            r0.close()     // Catch: java.lang.Throwable -> L52
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.b.b.w():java.lang.String");
    }

    private static String x() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String t() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }
}
