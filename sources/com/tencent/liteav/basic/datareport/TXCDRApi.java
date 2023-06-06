package com.tencent.liteav.basic.datareport;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.takeoutnew.util.aop.l;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.g;
import java.security.MessageDigest;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCDRApi {
    static final int NETWORK_TYPE_2G = 4;
    static final int NETWORK_TYPE_3G = 3;
    static final int NETWORK_TYPE_4G = 2;
    static final int NETWORK_TYPE_UNKNOWN = 255;
    static final int NETWORK_TYPE_WIFI = 1;
    private static final String TAG = "TXCDRApi";
    private static String g_simulate_idfa = "";
    private static String mAppName = "";
    private static String mDevId = "";
    private static String mDevType = "";
    private static String mDevUUID = "";
    private static String mNetType = "";
    private static String mSysVersion = "";
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    static boolean initRpt = false;

    public static native int nativeGetStatusReportInterval();

    private static native void nativeInitDataReport();

    private static native void nativeInitEventInternal(String str, int i, int i2, TXCDRExtInfo tXCDRExtInfo);

    public static native void nativeReportAVRoomEvent(int i, long j, String str, int i2, int i3, String str2, String str3);

    private static native void nativeReportDAUInterval(int i, int i2, String str);

    public static native void nativeReportEvent(String str, int i);

    public static native void nativeReportEvent40003(String str, int i, int i2, String str2, String str3);

    public static native void nativeSetCommonValue(String str, String str2);

    private static native void nativeSetEventValueInterval(String str, int i, String str2, String str3);

    private static native void nativeUninitDataReport();

    public static void InitEvent(Context context, String str, int i, int i2, TXCDRExtInfo tXCDRExtInfo) {
        setCommonInfo(context);
        if (str == null) {
            return;
        }
        nativeInitEventInternal(str, i, i2, tXCDRExtInfo);
    }

    public static void txSetEventValue(String str, int i, String str2, String str3) {
        nativeSetEventValueInterval(str, i, str2, str3);
    }

    public static void txSetEventIntValue(String str, int i, String str2, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        nativeSetEventValueInterval(str, i, str2, sb.toString());
    }

    public static void txReportDAU(Context context, int i) {
        if (context != null) {
            setCommonInfo(context);
        }
        nativeReportDAUInterval(i, 0, "");
    }

    public static void txReportDAU(Context context, int i, int i2, String str) {
        if (context != null) {
            setCommonInfo(context);
        }
        nativeReportDAUInterval(i, i2, str);
    }

    public static void reportEvent40003(String str, int i, int i2, String str2, String str3) {
        nativeReportEvent40003(str, i, i2, str2, str3);
    }

    public static void reportAVRoomEvent(int i, long j, String str, int i2, int i3, String str2, String str3) {
        nativeReportAVRoomEvent(i, j, str, i2, i3, str2, str3);
    }

    public static int getStatusReportInterval() {
        return nativeGetStatusReportInterval();
    }

    public static void setCommonInfo(Context context) {
        mDevType = Build.MODEL;
        mNetType = Integer.toString(getNetworkType(context));
        if (mDevId.isEmpty()) {
            mDevId = getSimulateIDFA(context);
        }
        if (mDevUUID.isEmpty()) {
            mDevUUID = getDevUUID(context, mDevId);
        }
        String packageName = getPackageName(context);
        mAppName = getApplicationNameByPackageName(context, packageName) + CommonConstant.Symbol.COLON + packageName;
        mSysVersion = String.valueOf(Build.VERSION.SDK_INT);
        TXCLog.i(TAG, "devType= " + mDevType + ", netType= " + mNetType + ", devId= " + mDevId + ", devUUID= " + mDevUUID + ", appName = " + mAppName + ", sysVersion= " + mSysVersion);
        txSetCommonInfo();
    }

    public static void txSetCommonInfo() {
        if (mDevType != null) {
            nativeSetCommonValue(a.f, mDevType);
        }
        if (mNetType != null) {
            nativeSetCommonValue(a.g, mNetType);
        }
        if (mDevId != null) {
            nativeSetCommonValue(a.h, mDevId);
        }
        if (mDevUUID != null) {
            nativeSetCommonValue(a.i, mDevUUID);
        }
        if (mAppName != null) {
            nativeSetCommonValue(a.j, mAppName);
        }
        if (mSysVersion != null) {
            nativeSetCommonValue(a.l, mSysVersion);
        }
    }

    public static void txSetAppVersion(String str) {
        if (str != null) {
            nativeSetCommonValue(a.k, str);
        }
    }

    public static String txCreateToken() {
        return UUID.randomUUID().toString();
    }

    private static String byteArrayToHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i + 1;
            cArr[i] = DIGITS_LOWER[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = DIGITS_LOWER[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    static {
        g.f();
        nativeInitDataReport();
    }

    public static String string2Md5(String str) {
        String str2;
        if (str == null) {
            return "";
        }
        try {
            str2 = byteArrayToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (Exception e) {
            TXCLog.e(TAG, "string2Md5 failed.", e);
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    public static String getOrigAndroidID(Context context) {
        String str;
        try {
            str = l.a(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            str = "";
        }
        return string2Md5(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf A[LOOP:0: B:42:0x00ba->B:44:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea A[LOOP:1: B:46:0x00e8->B:47:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184 A[Catch: Exception -> 0x01ba, TryCatch #1 {Exception -> 0x01ba, blocks: (B:53:0x0164, B:55:0x0184, B:56:0x0187, B:58:0x01a7, B:59:0x01aa), top: B:71:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7 A[Catch: Exception -> 0x01ba, TryCatch #1 {Exception -> 0x01ba, blocks: (B:53:0x0164, B:55:0x0184, B:56:0x0187, B:58:0x01a7, B:59:0x01aa), top: B:71:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7 A[EDGE_INSN: B:75:0x00e7->B:45:0x00e7 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getSimulateIDFA(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.basic.datareport.TXCDRApi.getSimulateIDFA(android.content.Context):java.lang.String");
    }

    public static String getDevUUID(Context context, String str) {
        return getSimulateIDFA(context);
    }

    public static int getNetworkType(Context context) {
        if (context == null) {
            return 255;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 255;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0) {
                try {
                    switch (telephonyManager.getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 4;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 3;
                        case 13:
                            return 2;
                        default:
                            return 2;
                    }
                } catch (Exception e) {
                    TXCLog.e(TAG, "TXCDRApi: get network type fail, exception occurred.", e);
                    return 2;
                }
            }
            return 255;
        } catch (Exception e2) {
            TXCLog.e(TAG, "getActiveNetworkInfo exception:", e2);
            return 255;
        }
    }

    private static String getPackageName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e) {
            TXCLog.e(TAG, "get package name failed.", e);
            return "";
        }
    }

    public static String getApplicationNameByPackageName(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void initCrashReport(Context context) {
        String sDKVersionStr;
        try {
            synchronized (TXCDRApi.class) {
                if (!initRpt && context != null && (sDKVersionStr = TXCCommonUtil.getSDKVersionStr()) != null) {
                    SharedPreferences.Editor edit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
                    edit.putString("8e50744bf0", sDKVersionStr);
                    edit.commit();
                    initRpt = true;
                }
            }
        } catch (Exception e) {
            TXCLog.e(TAG, "init crash report failed.", e);
        }
    }
}
