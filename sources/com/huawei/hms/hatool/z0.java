package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import com.meituan.robust.common.StringUtil;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class z0 extends f {
    public static String c() {
        String str;
        String str2;
        String str3;
        try {
            str = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", new Class[0]).invoke(null, new Object[0]);
            try {
                y.c("hmsSdk", "getUDID success");
            } catch (AndroidRuntimeException unused) {
                str2 = "hmsSdk";
                str3 = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
                y.f(str2, str3);
                return str;
            } catch (ClassNotFoundException unused2) {
                str2 = "hmsSdk";
                str3 = "getUDID method invoke failed";
                y.f(str2, str3);
                return str;
            } catch (IllegalAccessException unused3) {
                str2 = "hmsSdk";
                str3 = "getUDID method invoke failed : Illegal AccessException";
                y.f(str2, str3);
                return str;
            } catch (IllegalArgumentException unused4) {
                str2 = "hmsSdk";
                str3 = "getUDID method invoke failed : Illegal ArgumentException";
                y.f(str2, str3);
                return str;
            } catch (NoSuchMethodException unused5) {
                str2 = "hmsSdk";
                str3 = "getUDID method invoke failed : NoSuchMethodException";
                y.f(str2, str3);
                return str;
            } catch (InvocationTargetException unused6) {
                str2 = "hmsSdk";
                str3 = "getUDID method invoke failed : InvocationTargetException";
                y.f(str2, str3);
                return str;
            }
        } catch (AndroidRuntimeException unused7) {
            str = "";
        } catch (ClassNotFoundException unused8) {
            str = "";
        } catch (IllegalAccessException unused9) {
            str = "";
        } catch (IllegalArgumentException unused10) {
            str = "";
        } catch (NoSuchMethodException unused11) {
            str = "";
        } catch (InvocationTargetException unused12) {
            str = "";
        }
        return str;
    }

    public static Pair<String, String> e(Context context) {
        if (p0.a(context, "android.permission.READ_PHONE_STATE")) {
            y.f("hmsSdk", "getMccAndMnc() Pair value is empty");
            return new Pair<>("", "");
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            String networkOperator = telephonyManager.getNetworkOperator();
            return (TextUtils.isEmpty(networkOperator) || TextUtils.equals(networkOperator, StringUtil.NULL)) ? new Pair<>("", "") : networkOperator.length() > 3 ? new Pair<>(networkOperator.substring(0, 3), networkOperator.substring(3)) : new Pair<>("", "");
        }
        return new Pair<>("", "");
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    public static String f(Context context) {
        if (p0.a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return com.meituan.android.privacy.aop.d.a(telephonyManager);
            }
        } catch (SecurityException unused) {
            y.b("hmsSdk", "getDeviceID Incorrect permissions!");
        }
        return "";
    }

    public static String g(Context context) {
        y.a("hmsSdk", "getSerial : is executed.");
        if (context == null || p0.a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            return Build.VERSION.SDK_INT >= 26 ? com.meituan.android.privacy.aop.d.a() : "";
        } catch (SecurityException unused) {
            y.f("hmsSdk", "getSerial() Incorrect permissions!");
            return "";
        }
    }

    public static String h(Context context) {
        String str = Build.SERIAL;
        return (TextUtils.isEmpty(str) || str.equalsIgnoreCase("unknown")) ? g(context) : str;
    }
}
