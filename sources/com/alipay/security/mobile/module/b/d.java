package com.alipay.security.mobile.module.b;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.sankuai.meituan.takeoutnew.util.aop.l;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static d a = new d();

    public static d a() {
        return a;
    }

    private static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static boolean a(Context context) {
        boolean z;
        int length;
        try {
            if (Build.HARDWARE.contains("goldfish") || Build.PRODUCT.contains("sdk") || Build.FINGERPRINT.contains("generic")) {
                return true;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String a2 = com.meituan.android.privacy.aop.d.a(telephonyManager);
                if (a2 != null && (length = a2.length()) != 0) {
                    for (int i = 0; i < length; i++) {
                        if (!Character.isWhitespace(a2.charAt(i)) && a2.charAt(i) != '0') {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
            return com.alipay.security.mobile.module.a.a.a(l.a(context.getContentResolver(), "android_id"));
        } catch (Exception unused) {
            return false;
        }
    }

    public static String b() {
        return "android";
    }

    public static boolean c() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < 5; i++) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String d() {
        return Build.BOARD;
    }

    public static String e() {
        return Build.BRAND;
    }

    public static String f() {
        return Build.DEVICE;
    }

    public static String g() {
        return Build.DISPLAY;
    }

    public static String h() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String i() {
        return Build.MANUFACTURER;
    }

    public static String j() {
        return Build.MODEL;
    }

    public static String k() {
        return Build.PRODUCT;
    }

    public static String l() {
        return Build.VERSION.RELEASE;
    }

    public static String m() {
        return Build.VERSION.SDK;
    }

    public static String n() {
        return Build.TAGS;
    }

    public static String o() {
        return a("ro.kernel.qemu", "0");
    }
}
