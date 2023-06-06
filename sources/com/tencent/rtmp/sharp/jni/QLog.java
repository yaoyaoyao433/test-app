package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class QLog {
    public static final int CLR = 2;
    public static final int DEV = 4;
    public static final String ERR_KEY = "qq_error|";
    public static final int LOG_ITEM_MAX_CACHE_SIZE = 50;
    public static final String TAG_REPORTLEVEL_COLORUSER = "W";
    public static final String TAG_REPORTLEVEL_DEVELOPER = "D";
    public static final String TAG_REPORTLEVEL_USER = "E";
    public static final int USR = 1;
    public static String sBuildNumber = "";

    public static void dumpCacheToFile() {
    }

    public static String getReportLevel(int i) {
        if (i != 4) {
            switch (i) {
                case 1:
                    return "E";
                case 2:
                    return "W";
                default:
                    return "E";
            }
        }
        return "D";
    }

    public static void init(Context context) {
    }

    public static boolean isColorLevel() {
        return true;
    }

    public static boolean isDevelopLevel() {
        return true;
    }

    public static void p(String str, String str2) {
    }

    public static String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static void e(String str, int i, String str2) {
        TXCLog.e(str, "[" + getReportLevel(i) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str2);
    }

    public static void e(String str, int i, String str2, Throwable th) {
        e(str, i, str2);
    }

    public static void w(String str, int i, String str2) {
        TXCLog.w(str, "[" + getReportLevel(i) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str2);
    }

    public static void w(String str, int i, String str2, Throwable th) {
        TXCLog.w(str, "[" + getReportLevel(i) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str2);
    }

    public static void i(String str, int i, String str2) {
        TXCLog.i(str, "[" + getReportLevel(i) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str2);
    }

    public static void i(String str, int i, String str2, Throwable th) {
        TXCLog.i(str, "[" + getReportLevel(i) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str2);
    }

    public static void d(String str, int i, String str2) {
        TXCLog.d(str, "[" + getReportLevel(i) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str2);
    }

    public static void d(String str, int i, String str2, Throwable th) {
        TXCLog.d(str, "[" + getReportLevel(i) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str2);
    }
}
