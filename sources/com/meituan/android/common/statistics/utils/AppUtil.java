package com.meituan.android.common.statistics.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import com.dianping.codelog.b;
import com.meituan.android.common.channel.ChannelReader;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Interface.AbsExtraParameter;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AppUtil {
    public static final int LOCATION_LATITUDE = 0;
    public static final int LOCATION_LONGITUDE = 1;
    private static final int MAX_UPLOAD_NUM = 5000000;
    private static final int NETWORK_CLASS_2_G = 1;
    private static final int NETWORK_CLASS_3_G = 2;
    private static final int NETWORK_CLASS_4_G = 3;
    private static final int NETWORK_CLASS_5_G = 4;
    private static final int NETWORK_CLASS_UNAVAILABLE = -1;
    private static final int NETWORK_CLASS_UNKNOWN = 0;
    private static final int NETWORK_CLASS_WIFI = -101;
    public static final int NETWORK_TYPE_1xRTT = 7;
    public static final int NETWORK_TYPE_CDMA = 4;
    public static final int NETWORK_TYPE_EDGE = 2;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_EVDO_0 = 5;
    public static final int NETWORK_TYPE_EVDO_A = 6;
    public static final int NETWORK_TYPE_EVDO_B = 12;
    public static final int NETWORK_TYPE_GPRS = 1;
    public static final int NETWORK_TYPE_HSDPA = 8;
    public static final int NETWORK_TYPE_HSPA = 10;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_HSUPA = 9;
    public static final int NETWORK_TYPE_IDEN = 11;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_NR = 20;
    public static final int NETWORK_TYPE_UMTS = 3;
    private static final int NETWORK_TYPE_UNAVAILABLE = -1;
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI = -101;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile String mAppName;

    @Deprecated
    public static String getBluetoothState(Context context) {
        return "";
    }

    @Deprecated
    public static String getIPAddress(Context context) {
        return "";
    }

    private static int getNetworkClassByType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "634cfc0085c0dfd0382e51344e1f06e3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "634cfc0085c0dfd0382e51344e1f06e3")).intValue();
        }
        if (i != -101) {
            if (i != -1) {
                if (i != 20) {
                    switch (i) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 1;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 2;
                        case 13:
                            return 3;
                        default:
                            return 0;
                    }
                }
                return 4;
            }
            return -1;
        }
        return -101;
    }

    public static String getCurrentClassNetworkType(Context context, ConnectivityManager connectivityManager) {
        Object[] objArr = {context, connectivityManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4bc43a21ba0a3b841fde65e219afe86", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4bc43a21ba0a3b841fde65e219afe86");
        }
        if (context == null) {
            return "";
        }
        switch (getNetworkClass(context, connectivityManager)) {
            case -1:
                return "";
            case 0:
                return "";
            case 1:
                return "2G";
            case 2:
                return "3G";
            case 3:
                return "4G";
            case 4:
                return "5G";
            default:
                return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    private static int getNetworkClass(Context context, ConnectivityManager connectivityManager) {
        int i = 0;
        Object[] objArr = {context, connectivityManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ec5e81d328620c23cda80c966b10762", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ec5e81d328620c23cda80c966b10762")).intValue();
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    i = -101;
                } else if (type == 0) {
                    if (context == null || Privacy.createTelephonyManager(context, "com.meituan.android.common.analyse") == null) {
                        return 0;
                    }
                    i = Privacy.createTelephonyManager(context, "com.meituan.android.common.analyse").getNetworkType();
                }
            } else {
                i = -1;
            }
        } catch (Exception e) {
            LogUtil.log("statistics", "AppUtil - getNetworkClass:" + e.getMessage());
        }
        return getNetworkClassByType(i);
    }

    public static String getNetWorkType(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab3a786880b6ea7548d7420b9bc10cb6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab3a786880b6ea7548d7420b9bc10cb6");
        }
        if (context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager != null && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) ? activeNetworkInfo.getType() == 1 ? "WIFI" : getCurrentClassNetworkType(context, connectivityManager) : "";
        } catch (Exception e) {
            LogUtil.log("statistics", "AppUtil - getNetWorkType:" + e.getMessage());
            return "";
        }
    }

    public static String getDeviceId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ac45cc4d1367e5fc73fdb01749a26b3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ac45cc4d1367e5fc73fdb01749a26b3") : com.meituan.android.common.unionid.oneid.util.AppUtil.getDeviceId(context);
    }

    public static String getIMEI(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06ea54c5f3a0282e3c00d6e73bd3b8e4", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06ea54c5f3a0282e3c00d6e73bd3b8e4") : com.meituan.android.common.unionid.oneid.util.AppUtil.getIMEI1(context);
    }

    public static String getIMEI2(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "281c3eb91f603a65f52c39956ee8e7dd", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "281c3eb91f603a65f52c39956ee8e7dd") : com.meituan.android.common.unionid.oneid.util.AppUtil.getIMEI2(context);
    }

    public static String getMEID(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af77db9b463f1ecf21dc95564a1c5d4d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af77db9b463f1ecf21dc95564a1c5d4d") : com.meituan.android.common.unionid.oneid.util.AppUtil.getMEID(context);
    }

    public static Object reflectField(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "812e5c238c1222aa75593dd982330e29", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "812e5c238c1222aa75593dd982330e29");
        }
        try {
            Class<?> cls = Class.forName(str);
            Field declaredField = cls.getDeclaredField(str2);
            declaredField.setAccessible(true);
            return declaredField.get(cls);
        } catch (Exception unused) {
            LogUtil.log("AppUtil.reflectField(): " + str + " : " + str2);
            return null;
        }
    }

    public static String getVersionName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1bf2c64a2a65360931c6257069aa680b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1bf2c64a2a65360931c6257069aa680b");
        }
        if (context == null) {
            return "";
        }
        try {
            String str = (String) reflectField(context.getPackageName() + ".BuildConfig", "VERSION_NAME");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } catch (Exception e) {
            LogUtil.log("AppUtil.getVersionName() " + e.getMessage());
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
            return packageInfo.versionName != null ? packageInfo.versionName : "";
        } catch (Throwable th) {
            LogUtil.log("AppUtil.getVersionName() " + th.getMessage());
            return "";
        }
    }

    public static String getVersionCode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7017e9f36df713c3266a4518bd2b431", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7017e9f36df713c3266a4518bd2b431");
        }
        if (context == null) {
            return "0";
        }
        try {
            Object reflectField = reflectField(context.getPackageName() + ".BuildConfig", "VERSION_CODE");
            if (reflectField != null) {
                return String.valueOf(reflectField);
            }
        } catch (Exception e) {
            LogUtil.log("AppUtil.getVersionCode() " + e.getMessage());
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (Exception e2) {
            LogUtil.log("AppUtil.getVersionCode() " + e2.getMessage());
            return "0";
        }
    }

    public static String getApplicationName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36fbe9c8eb234c04c58591b2645e603e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36fbe9c8eb234c04c58591b2645e603e");
        }
        if (TextUtils.isEmpty(mAppName)) {
            if (context == null) {
                return "";
            }
            try {
                mAppName = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("APP_NAME");
                return mAppName == null ? "" : mAppName;
            } catch (Exception e) {
                LogUtil.log("statistics", "AppUtil - getApplicationName:" + e.getMessage());
                return "";
            }
        }
        return mAppName;
    }

    public static String getMNO(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "794e86c4060a2b9c1ec0b42f5ab91292", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "794e86c4060a2b9c1ec0b42f5ab91292") : com.meituan.android.common.unionid.oneid.util.AppUtil.getMNO(context);
    }

    public static String getIMSI(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20a0a7f7f7f8ee95d61595300b14fd5c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20a0a7f7f7f8ee95d61595300b14fd5c") : com.meituan.android.common.unionid.oneid.util.AppUtil.getIMSI(context);
    }

    public static String getICCID(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "137363e6e3f12a87011a8def41f63dff", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "137363e6e3f12a87011a8def41f63dff") : com.meituan.android.common.unionid.oneid.util.AppUtil.getICCID(context);
    }

    public static String getDisplayScreenResolution(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8753cf880d3bc36cb84e400784a1001", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8753cf880d3bc36cb84e400784a1001");
        }
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return displayMetrics.heightPixels + "*" + displayMetrics.widthPixels;
        } catch (Throwable th) {
            LogUtil.log("statistics", "AppUtil - getDisplayScreenResolution:" + th.getMessage());
            return "";
        }
    }

    public static String getWifiState(Context context) {
        NetworkInfo networkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e52f8953385c12b07d45fa295eb433f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e52f8953385c12b07d45fa295eb433f");
        }
        if (context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0 || (networkInfo = connectivityManager.getNetworkInfo(1)) == null) ? "unknown" : networkInfo.isConnectedOrConnecting() ? "on" : "off";
        } catch (Exception e) {
            LogUtil.log("statistics", "AppUtil - getWifiState:" + e.getMessage());
            return "unknown";
        }
    }

    public static String getAPN(Context context) {
        WifiInfo connectionInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3269fa629634aa90ab7bfaedbbdc9a1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3269fa629634aa90ab7bfaedbbdc9a1");
        }
        String str = "unknown";
        if (context == null) {
            return "unknown";
        }
        try {
            if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") == 0 && (connectionInfo = Privacy.createWifiManager(context, "com.meituan.android.common.analyse").getConnectionInfo()) != null && !TextUtils.isEmpty(connectionInfo.getSSID())) {
                str = connectionInfo.getSSID();
            }
        } catch (Throwable th) {
            LogUtil.log("statistics", "AppUtil - getAPN:" + th.getMessage());
        }
        return str == null ? "" : str.replaceAll(CommonConstant.Symbol.DOUBLE_QUOTES, "");
    }

    @Deprecated
    public static boolean isWifiConnected(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12982161fc432694373532c9f6a82af8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12982161fc432694373532c9f6a82af8")).booleanValue() : context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    public static boolean getNetWorkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9af365e547e3e5311fc31ff6cb043651", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9af365e547e3e5311fc31ff6cb043651")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && connectivityManager != null && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LogUtil.log("statistics", "AppUtil - getNetWorkAvailable:" + e.getMessage());
            return false;
        }
    }

    public static String getAndroidId(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ec67f79d79b9596b1b731fc39c488806", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ec67f79d79b9596b1b731fc39c488806");
        }
        if (context == null) {
            return "";
        }
        try {
            str = Privacy.createTelephonyManager(context, "com.meituan.android.common.analyse").getAndroidId();
        } catch (Exception e) {
            LogUtil.log("statistics", "AppUtil - getAndroidId:" + e.getMessage());
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String generatePageInfoKey(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c83de79802e0f86a4b959a552660b834", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c83de79802e0f86a4b959a552660b834");
        }
        if (obj == null) {
            return "";
        }
        return obj.getClass().getName() + "__" + obj.hashCode();
    }

    public static String getClassName(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c6a29cc96c742a6fca581e9a4d67adc", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c6a29cc96c742a6fca581e9a4d67adc") : (TextUtils.isEmpty(str) || (split = str.split("__")) == null || split.length <= 0) ? "" : split[0];
    }

    public static String generateRequestId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c81af94ac3b8060b01646ce162a313b3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c81af94ac3b8060b01646ce162a313b3");
        }
        try {
            return UUID.randomUUID().toString().toUpperCase();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static boolean isEmpty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7cdb90addbf942cff18ec91ce3c5142", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7cdb90addbf942cff18ec91ce3c5142")).booleanValue() : str == null || str.length() == 0 || str.trim().length() == 0;
    }

    public static void LogReport(Class cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2e7796dfb6ff306987a40ebaebc0ee2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2e7796dfb6ff306987a40ebaebc0ee2");
            return;
        }
        b.b(cls, "ling_xi: " + ((Object) DateFormat.format("yyyy-MM-dd HH:mm:ss", System.currentTimeMillis())) + ": " + str);
    }

    public static String getHttpProtocol(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c38644f8839a2ada6152b12ed2b19a28", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c38644f8839a2ada6152b12ed2b19a28") : ConfigManager.getInstance(context).isHttpSwitchOn() ? "http" : "https";
    }

    public static String getReportUrl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1de3a04f91001bf88c581105e68bff9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1de3a04f91001bf88c581105e68bff9");
        }
        if (LogUtil.isLogEnabled()) {
            String testReportUrl = Constants.getTestReportUrl();
            if (TextUtils.isEmpty(testReportUrl)) {
                return getRealUrl(context);
            }
            return AbsApiFactory.HTTP + testReportUrl;
        }
        return getRealUrl(context);
    }

    private static String getRealUrl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0429d4aa8151a39b11a6ca76c65958e0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0429d4aa8151a39b11a6ca76c65958e0");
        }
        AbsExtraParameter extraParameter = Statistics.getExtraParameter();
        String reportUrl = extraParameter != null ? extraParameter.getReportUrl() : "";
        if (TextUtils.isEmpty(reportUrl)) {
            return getHttpProtocol(context) + Constants.REPORT_URL;
        }
        return reportUrl;
    }

    public static boolean isAppDebugable(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86852643ae2c44796d43831d6fba46ed", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86852643ae2c44796d43831d6fba46ed")).booleanValue();
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean areNotificationsEnabled(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99482540a109449ec410466f60b23d16", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99482540a109449ec410466f60b23d16")).booleanValue();
        }
        if (context != null) {
            try {
                return NotificationManagerCompat.from(context).areNotificationsEnabled();
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static String getBrand(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f2829975ef8e5a01eab621e0ea1617d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f2829975ef8e5a01eab621e0ea1617d") : TextUtils.isEmpty(Build.BRAND) ? getManufacture(context) : Build.BRAND;
    }

    public static String getManufacture(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77715b995f7ffc7a9e68afc550bb95af", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77715b995f7ffc7a9e68afc550bb95af") : TextUtils.isEmpty(Build.MANUFACTURER) ? "unknown" : Build.MANUFACTURER;
    }

    public static String getPageInfoKeyChecked(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b251fbe2b8218a8c5310f6367a0e4225", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b251fbe2b8218a8c5310f6367a0e4225");
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                return "null_page_key";
            }
            return "null_page_key##" + str2;
        }
        return str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.String unzipFile(java.io.File r13) throws java.io.IOException {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.statistics.utils.AppUtil.changeQuickRedirect
            java.lang.String r11 = "e8b0f3f6755b85dfa0b461d533d2c377"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L1e:
            if (r13 == 0) goto L7c
            boolean r1 = r13.exists()
            if (r1 != 0) goto L27
            goto L7c
        L27:
            r1 = 2
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L70
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L70
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L70
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L70
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L62
            r13.<init>()     // Catch: java.lang.Throwable -> L62
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L72
        L3b:
            int r5 = r3.read(r4)     // Catch: java.lang.Throwable -> L72
            r6 = -1
            if (r5 == r6) goto L46
            r13.write(r4, r9, r5)     // Catch: java.lang.Throwable -> L72
            goto L3b
        L46:
            r13.flush()     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "utf-8"
            java.lang.String r4 = r13.toString(r4)     // Catch: java.lang.Throwable -> L72
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r9] = r3
            r1[r0] = r13
            close(r1)
            r2 = r4
            goto L7b
        L5b:
            r2 = move-exception
            r12 = r2
            r2 = r13
            r13 = r12
            goto L66
        L60:
            r13 = move-exception
            goto L66
        L62:
            r13 = r2
            goto L72
        L64:
            r13 = move-exception
            r3 = r2
        L66:
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r9] = r3
            r1[r0] = r2
            close(r1)
            throw r13
        L70:
            r13 = r2
            r3 = r13
        L72:
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r9] = r3
            r1[r0] = r13
            close(r1)
        L7b:
            return r2
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.utils.AppUtil.unzipFile(java.io.File):java.lang.String");
    }

    public static void close(Closeable... closeableArr) {
        Object[] objArr = {closeableArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aae41a0babfe46ecd0c4189483ac2e35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aae41a0babfe46ecd0c4189483ac2e35");
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getBuildNum(Context context) {
        String[] split;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85739ce56be803467b26154e6ec7da1b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85739ce56be803467b26154e6ec7da1b");
        }
        try {
            if ("group".equalsIgnoreCase(getApplicationName(context))) {
                String channelInfo = ChannelReader.getChannelInfo(context, "mtbuildtime");
                LogUtil.log("getBuildNum:" + channelInfo);
                return (TextUtils.isEmpty(channelInfo) || (split = channelInfo.split("\\.")) == null || split.length <= 1) ? "" : split[1];
            } else if ("dianping_nova".equalsIgnoreCase(getApplicationName(context))) {
                Class<?> cls = Class.forName("com.dianping.app.DPStaticConstant");
                Field field = cls.getField("hpxBuildNumber");
                LogUtil.log("getBuildNum:" + ((String) field.get(cls)));
                return (String) field.get(cls);
            } else {
                String channelInfo2 = ChannelReader.getChannelInfo(context, "buildNum");
                return TextUtils.isEmpty(channelInfo2) ? ChannelReader.getChannelInfo(context, "buildnum") : channelInfo2;
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean isMmpActivity(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2faace7a2910e2ad99bf5e99277609d3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2faace7a2910e2ad99bf5e99277609d3")).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        for (Class<?> cls = activity.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (cls.getName().equals("com.meituan.mmp.lib.MMPBaseActivity")) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    @Deprecated
    public static boolean isDualSimSupported(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4fcf8c6b5f9034c1e6054e0d0aac8f10", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4fcf8c6b5f9034c1e6054e0d0aac8f10")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneCount() > 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @RequiresApi(api = 26)
    @Deprecated
    public static String getMeidForO(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "52f7f149da719035b643e71089af3d8d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "52f7f149da719035b643e71089af3d8d") : com.meituan.android.common.unionid.oneid.util.AppUtil.getMEID(context);
    }

    @RequiresApi(api = 26)
    @Deprecated
    public static String getImeiForO(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7035c8131ce0de35d376c744484bd63f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7035c8131ce0de35d376c744484bd63f") : com.meituan.android.common.unionid.oneid.util.AppUtil.getImei(context, i);
    }

    @RequiresApi(api = 26)
    @Deprecated
    public static String getImei1ForO(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "461cf5b9cad7f3e0c3d43e36cf0c775f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "461cf5b9cad7f3e0c3d43e36cf0c775f") : com.meituan.android.common.unionid.oneid.util.AppUtil.getIMEI1(context);
    }

    @RequiresApi(api = 26)
    @Deprecated
    public static String getImei2ForO(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2342f3a06a66908566898f3fa0b153c2", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2342f3a06a66908566898f3fa0b153c2") : com.meituan.android.common.unionid.oneid.util.AppUtil.getIMEI2(context);
    }

    @Deprecated
    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0c529fc9c9389cb5fd2f2013ec702b0", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0c529fc9c9389cb5fd2f2013ec702b0")).booleanValue() : (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || connectivityManager == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @Deprecated
    public static String getBuildVersion(Context context) {
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e69ac40218435a9b26f9dde000811b75", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e69ac40218435a9b26f9dde000811b75");
        }
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).versionCode;
        } catch (Throwable th) {
            th.printStackTrace();
            i = 0;
        }
        return String.valueOf(i);
    }

    @Deprecated
    public static final String filterFileName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37e4dc32d527cd6fa0c8dce8079b637e", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37e4dc32d527cd6fa0c8dce8079b637e") : str.replaceAll("[^a-zA-Z0-9]", CommonConstant.Symbol.UNDERLINE).replaceAll("\\s+", CommonConstant.Symbol.UNDERLINE);
    }
}
