package com.meizu.cloud.pushsdk.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
/* loaded from: classes3.dex */
public final class c {
    private static String a = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static String b(Context context) {
        String a2;
        try {
            com.meizu.cloud.pushsdk.b.b.d a3 = com.meizu.cloud.pushsdk.b.b.a.a("android.telephony.MzTelephonyManager").a("getDeviceId", new Class[0]).a(new Object[0]);
            if (a3.a) {
                a2 = (String) a3.b;
            } else {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return null;
                }
                a2 = com.meituan.android.privacy.aop.d.a(telephonyManager);
            }
            return a2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(Context context) {
        boolean z;
        if (TextUtils.isEmpty(a)) {
            String a2 = i.a("ro.target.product");
            if (TextUtils.isEmpty(a2)) {
                DebugLogger.i("DeviceUtils", "current product is phone");
                z = true;
            } else {
                DebugLogger.i("DeviceUtils", "current product is " + a2);
                z = false;
            }
            if (z) {
                a = b(context);
            } else {
                StringBuilder sb = new StringBuilder();
                String str = Build.SERIAL;
                DebugLogger.i("DeviceUtils", "device serial " + str);
                String str2 = null;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    String macAddress = MzSystemUtils.getMacAddress(context);
                    DebugLogger.e("DeviceUtils", "mac address " + macAddress);
                    if (!TextUtils.isEmpty(macAddress)) {
                        sb.append(macAddress.replace(CommonConstant.Symbol.COLON, "").toUpperCase());
                        str2 = sb.toString();
                    }
                }
                a = str2;
            }
            return a;
        }
        return a;
    }
}
