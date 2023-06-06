package com.tencent.map.geolocation.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.net.NetworkInterface;
import java.util.Enumeration;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    private static String a = "01234567890ABCDEF";
    private static String b = "01234567890ABCDEF";
    private static String c = "01234567890ABCDEF";

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends Enum<a> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {a, b, c};
    }

    private static boolean e() {
        return Build.VERSION.SDK_INT > 28;
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Context context) {
        if (!TextUtils.isEmpty(a) && !"01234567890ABCDEF".equals(a)) {
            return a;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (e()) {
                a = d(context);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a = com.meituan.android.privacy.aop.d.b(telephonyManager);
            } else {
                a = com.meituan.android.privacy.aop.d.a(telephonyManager);
            }
        } catch (Throwable unused) {
            a = "01234567890ABCDEF";
        }
        return a;
    }

    @SuppressLint({"MissingPermission"})
    public static String b(Context context) {
        if (!TextUtils.isEmpty(b) && !"01234567890ABCDEF".equals(b)) {
            return b;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (e()) {
                b = "01234567890ABCDEF";
            } else {
                b = com.meituan.android.privacy.aop.d.e(telephonyManager);
            }
        } catch (Throwable unused) {
            b = "01234567890ABCDEF";
        }
        return b;
    }

    private static String d(Context context) {
        try {
            return Settings.System.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return "01234567890ABCDEF";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static int c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (Build.VERSION.SDK_INT >= 16) {
                    return connectivityManager.isActiveNetworkMetered() ? a.b : a.c;
                } else if (1 == activeNetworkInfo.getType()) {
                    return a.c;
                } else {
                    return a.b;
                }
            }
            return a.a;
        } catch (Throwable unused) {
            return a.a;
        }
    }

    public static String a() {
        byte[] a2;
        if (!TextUtils.isEmpty(c) && !"01234567890ABCDEF".equals(c)) {
            return c;
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces != null) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null && nextElement.getName().equalsIgnoreCase("wlan0") && (a2 = com.meituan.android.privacy.aop.e.a(nextElement)) != null && a2.length != 0) {
                    StringBuilder sb = new StringBuilder();
                    int length = a2.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02X:", Byte.valueOf(a2[i])));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    c = sb.toString();
                }
            }
        } catch (Throwable unused) {
            c = "01234567890ABCDEF";
        }
        return c;
    }

    public static String b() {
        try {
            return Build.MODEL.replaceAll("[_]", "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String c() {
        try {
            return Build.MANUFACTURER.replaceAll("[_]", "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int d() {
        return Build.VERSION.SDK_INT;
    }
}
