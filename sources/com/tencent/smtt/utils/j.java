package com.tencent.smtt.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.TbsPrivacyAccess;
import com.tencent.smtt.sdk.c;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
/* loaded from: classes6.dex */
public class j {
    private static SharedPreferences a;
    private static SharedPreferences.Editor b;

    private static String a() {
        int nextInt = new Random().nextInt(2147483646);
        return Build.FINGERPRINT + nextInt;
    }

    public static String a(Context context) {
        if (d(context)) {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("tsui", 0);
            a = sharedPreferences;
            if (sharedPreferences != null) {
                String string = a.getString("tsui", "");
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            }
            StringBuilder sb = new StringBuilder();
            String a2 = a();
            String k = b.k(context);
            String c = c(context);
            String replace = b(context).replace(CommonConstant.Symbol.MINUS, "");
            if (a2 != null && a2.length() > 0) {
                sb.append(a2);
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            if (k != null && k.length() > 0) {
                sb.append(k);
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            if (c != null && c.length() > 0) {
                sb.append(c);
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            if (replace != null && replace.length() > 0) {
                sb.append(replace);
            }
            if (sb.length() > 0) {
                try {
                    String a3 = a(a(sb.toString()));
                    if (a3 != null && a3.length() > 0) {
                        a(context, "tsui", a3);
                        return a3;
                    }
                } catch (Exception unused) {
                }
            }
            String replace2 = UUID.randomUUID().toString().replace(CommonConstant.Symbol.MINUS, "");
            a(context, "tsui", replace2);
            return replace2;
        }
        return "";
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase(Locale.CHINA);
    }

    private static void a(Context context, String str, String str2) {
        if (a == null) {
            a = context.getApplicationContext().getSharedPreferences("tsui", 0);
        }
        SharedPreferences.Editor edit = a.edit();
        b = edit;
        edit.putString(str, str2);
        b.commit();
    }

    private static byte[] a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (Exception unused) {
            return "".getBytes();
        }
    }

    private static String b(Context context) {
        try {
            String d = r.d(context);
            int nextInt = new Random().nextInt(2147483646);
            StringBuilder sb = new StringBuilder();
            sb.append(nextInt);
            sb.append(Build.BOARD.length() % 10);
            sb.append(Build.BRAND.length() % 10);
            sb.append(Build.DEVICE.length() % 10);
            sb.append(Build.HARDWARE.length() % 10);
            sb.append(Build.ID.length() % 10);
            sb.append(d.length() % 10);
            sb.append(Build.PRODUCT.length() % 10);
            sb.append(c(context).length() % 10);
            return new UUID(sb.toString().hashCode(), c(context).hashCode()).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String c(Context context) {
        try {
            String configurePrivacy = TbsPrivacyAccess.getConfigurePrivacy(context, TbsPrivacyAccess.ConfigurablePrivacy.SERIAL, "");
            if (!TextUtils.isEmpty(configurePrivacy) && !configurePrivacy.contains("unknown")) {
                return configurePrivacy;
            }
            return a();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    private static boolean d(final Context context) {
        boolean z;
        try {
            z = context.getSharedPreferences("sai", 0).getBoolean("sui", true);
            try {
                TbsLog.i("SDKUID", "isSDKUIDEnable is " + z);
                com.tencent.smtt.sdk.c.a().a(context, (Integer) 1002, new c.a() { // from class: com.tencent.smtt.utils.j.1
                    @Override // com.tencent.smtt.sdk.c.a
                    public final void a(String str) {
                        SharedPreferences.Editor edit = context.getSharedPreferences("sai", 0).edit();
                        edit.putBoolean("sui", false);
                        edit.commit();
                        TbsLog.e("TBSEmergency", "Execute command [1002](" + str + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                });
            } catch (Throwable th) {
                th = th;
                TbsLog.i("SDKUID", "stack is " + Log.getStackTraceString(th));
                return z;
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
        return z;
    }
}
