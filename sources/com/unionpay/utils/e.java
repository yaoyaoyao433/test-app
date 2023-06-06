package com.unionpay.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.meituan.robust.common.CommonConstant;
import java.net.NetworkInterface;
/* loaded from: classes6.dex */
public final class e {
    public static String a() {
        try {
            return Build.getRadioVersion();
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String a(Context context) {
        String str = "";
        if (Build.VERSION.SDK_INT < 23) {
            try {
                WifiInfo c = com.meituan.android.privacy.aop.e.c((WifiManager) context.getSystemService("wifi"));
                if (c != null && com.meituan.android.privacy.aop.e.a(c) != null) {
                    str = com.meituan.android.privacy.aop.e.a(c);
                }
                if (str == null || str.length() == 0) {
                    str = a("wlan0");
                }
            } catch (Exception unused) {
            }
            return (str == null || str == "") ? "" : str.replaceAll(CommonConstant.Symbol.COLON, "");
        }
        str = a("wlan0");
        if (str == null) {
            return "";
        }
    }

    @SuppressLint({"NewApi"})
    private static String a(String str) {
        try {
            byte[] a = com.meituan.android.privacy.aop.e.a(NetworkInterface.getByName(str));
            if (a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int length = a.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02x:", Byte.valueOf(a[i])));
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        try {
            return com.meituan.android.privacy.aop.d.a((TelephonyManager) context.getSystemService("phone"));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context) {
        try {
            String e = com.meituan.android.privacy.aop.d.e((TelephonyManager) context.getSystemService("phone"));
            return e == null ? "" : e;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:17:0x003a). Please submit an issue!!! */
    public static Location d(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (!com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "gps")) {
            if (com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "network")) {
                return com.meituan.android.privacy.aop.c.a(locationManager, "network");
            }
            return null;
        }
        Location a = com.meituan.android.privacy.aop.c.a(locationManager, "gps");
        if (a == null) {
            try {
                if (com.sankuai.meituan.takeoutnew.util.aop.g.a(locationManager, "network")) {
                    return com.meituan.android.privacy.aop.c.a(locationManager, "network");
                }
            } catch (Exception unused) {
            }
        }
        return a;
    }

    public static String e(Context context) {
        try {
            return com.meituan.android.privacy.aop.d.g((TelephonyManager) context.getSystemService("phone"));
        } catch (Exception unused) {
            return "";
        }
    }
}
