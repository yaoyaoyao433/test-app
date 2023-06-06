package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes6.dex */
public final class bb {
    private static int a = -1;

    public static y a(Context context) {
        try {
            return (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) == null || !a()) ? y.OTHER : y.HUAWEI;
        } catch (Exception unused) {
            return y.OTHER;
        }
    }

    private static boolean a() {
        try {
            String str = (String) com.xiaomi.push.am.a("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            if (!TextUtils.isEmpty(str)) {
                if (Integer.parseInt(str) >= 9) {
                    return true;
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
        return false;
    }

    public static boolean b(Context context) {
        Object a2 = com.xiaomi.push.am.a(com.xiaomi.push.am.a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a3 = com.xiaomi.push.am.a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (a3 == null || !(a3 instanceof Integer)) {
            com.xiaomi.channel.commonutils.logger.c.c("google service is not avaliable");
            a = 0;
            return false;
        }
        int intValue = ((Integer) Integer.class.cast(a3)).intValue();
        if (a2 != null) {
            if (a2 instanceof Integer) {
                a = ((Integer) Integer.class.cast(a2)).intValue() == intValue ? 1 : 0;
            } else {
                a = 0;
                com.xiaomi.channel.commonutils.logger.c.c("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder("is google service can be used");
        sb.append(a > 0);
        com.xiaomi.channel.commonutils.logger.c.c(sb.toString());
        return a > 0;
    }

    public static boolean c(Context context) {
        boolean z = false;
        Object a2 = com.xiaomi.push.am.a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (a2 != null && (a2 instanceof Boolean)) {
            z = ((Boolean) Boolean.class.cast(a2)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.c.c("color os push  is avaliable ? :" + z);
        return z;
    }

    public static boolean d(Context context) {
        boolean z = false;
        Object a2 = com.xiaomi.push.am.a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (a2 != null && (a2 instanceof Boolean)) {
            z = ((Boolean) Boolean.class.cast(a2)).booleanValue();
        }
        com.xiaomi.channel.commonutils.logger.c.c("fun touch os push  is avaliable ? :" + z);
        return z;
    }
}
