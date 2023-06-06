package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hms.base.log.a;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HMSLog {
    public static final a a = new a();

    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + CommonConstant.Symbol.BRACKET_LEFT + packageInfo.versionCode + CommonConstant.Symbol.BRACKET_RIGHT;
            } catch (PackageManager.NameNotFoundException unused) {
                return "HMS-[unknown-version]";
            }
        }
        return "HMS-[unknown-version]";
    }

    public static void d(String str, String str2) {
        a.a(3, str, str2);
    }

    public static void e(String str, String str2) {
        a.a(6, str, str2);
    }

    public static void i(String str, String str2) {
        a.a(4, str, str2);
    }

    public static void init(Context context, int i, String str) {
        a.a(context, i, str);
        a.a(str, "============================================================================\n====== " + a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return a.a(6);
    }

    public static boolean isInfoEnable() {
        return a.a(4);
    }

    public static boolean isWarnEnable() {
        return a.a(5);
    }

    public static void w(String str, String str2) {
        a.a(5, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        a.b(6, str, str2, th);
    }

    public static void e(String str, long j, String str2) {
        a aVar = a;
        aVar.a(6, str, "[" + j + "] " + str2);
    }

    public static void e(String str, long j, String str2, Throwable th) {
        a aVar = a;
        aVar.b(6, str, "[" + j + "] " + str2, th);
    }
}
