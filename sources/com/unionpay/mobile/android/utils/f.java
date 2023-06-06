package com.unionpay.mobile.android.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.File;
import java.net.NetworkInterface;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes6.dex */
public final class f {
    public static String a() {
        return Locale.getDefault().toString().startsWith("zh") ? "zh_CN" : "en_US";
    }

    public static String a(Context context) {
        Activity activity = (Activity) context;
        try {
            String str = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 4160).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return com.unionpay.mobile.android.languages.c.bD.a;
    }

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

    public static String b() {
        return new File("/system/bin/su").exists() ? "1" : "0";
    }

    public static String b(Context context) {
        String packageName;
        return (context == null || !(context instanceof Activity) || (packageName = ((Activity) context).getPackageName()) == null) ? "" : packageName;
    }

    public static String c() {
        String trim = Build.MODEL.trim();
        if (trim != null) {
            trim.replace(StringUtil.SPACE, "");
        }
        return trim;
    }

    public static final String c(Context context) {
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

    public static String d() {
        return (com.unionpay.mobile.android.global.a.I + "*" + com.unionpay.mobile.android.global.a.t).trim();
    }

    public static String d(Context context) {
        String str;
        try {
            str = new File("/system/bin/su").exists() ? c(context) : com.meituan.android.privacy.aop.d.a((TelephonyManager) context.getSystemService("phone"));
        } catch (Exception unused) {
            str = "";
        }
        if (str == null || str.length() == 0) {
            str = PreferenceUtils.a(context);
        }
        k.a("uppay", "user=".concat(String.valueOf(str)));
        return str;
    }

    public static String e() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String e(Context context) {
        try {
            String e = com.meituan.android.privacy.aop.d.e((TelephonyManager) context.getSystemService("phone"));
            return e == null ? "" : e;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String f() {
        return TimeZone.getDefault().getDisplayName(false, 0);
    }

    public static String f(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
            if (activeNetworkInfo.getType() != 0) {
                return activeNetworkInfo.getType() == 1 ? "wifi" : "other";
            } else if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                return "mobile:" + activeNetworkInfo.getExtraInfo();
            } else {
                return "mobile";
            }
        }
        return "disConnect";
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:17:0x003a). Please submit an issue!!! */
    public static Location g(Context context) {
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

    public static String h(Context context) {
        try {
            return com.meituan.android.privacy.aop.d.g((TelephonyManager) context.getSystemService("phone"));
        } catch (Exception unused) {
            return "";
        }
    }
}
