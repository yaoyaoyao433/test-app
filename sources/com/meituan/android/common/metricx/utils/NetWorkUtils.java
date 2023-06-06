package com.meituan.android.common.metricx.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.WifiUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NetWorkUtils {
    private static String MCCMNC = null;
    private static final int MCC_ZERO = 0;
    private static final long NETWORK_TYPE_CACHE_TIME = 2000;
    private static final long VPN_STATE_CACHE_TIME = 10000;
    private static final long WIFI_INFO_CACHE_TIME = 60000;
    private static int cacheNetWorkType = 0;
    private static String cachedVpnState = "unknown";
    private static String cachedWiFiName = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static long queryNetWorkTime;
    private static long queryVpnStateTime;
    private static long queryWiFiInfoTime;

    @SuppressLint({"DefaultLocale"})
    public static String getMccmnc(@Nullable Context context) {
        Configuration configuration;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b27e9cadaabeeed93d05a5a40510c2e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b27e9cadaabeeed93d05a5a40510c2e1");
        }
        if (TextUtils.isEmpty(MCCMNC)) {
            if (context == null) {
                return "";
            }
            try {
                Resources resources = context.getResources();
                if (resources == null || (configuration = resources.getConfiguration()) == null) {
                    return "";
                }
                int i = configuration.mcc;
                int i2 = configuration.mnc;
                if (i != 0 && i2 != 65535) {
                    MCCMNC = String.format("%03d", Integer.valueOf(i)) + String.format("%02d", Integer.valueOf(i2));
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        return MCCMNC;
    }

    public static String getNetWorkTypeForBabel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27e0cfd2d1d7e2928c73912af05ccff3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27e0cfd2d1d7e2928c73912af05ccff3");
        }
        switch (getNetWorkTypeByCache(context)) {
            case -2:
                return "未知网络状态";
            case -1:
                return "没有网络";
            case 0:
                return "WIFI网络";
            case 1:
                return "wap";
            case 2:
                return "2G网络";
            case 3:
                return "3G网络";
            case 4:
                return "4G网络";
            case 5:
                return "5G网络";
            default:
                return "代码未知";
        }
    }

    public static String getNetWorkTypeForCrashAndSniffer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2239cc4e2955de11bf4510f0d0fe7e6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2239cc4e2955de11bf4510f0d0fe7e6a");
        }
        switch (getNetWorkTypeByCache(context)) {
            case -2:
                return "未知";
            case -1:
                return "无";
            case 0:
                return "Wi-Fi";
            case 1:
                return "wap";
            case 2:
                return "2G";
            case 3:
                return "3G";
            case 4:
                return "4G";
            case 5:
                return "5G";
            default:
                return "未知";
        }
    }

    public static String getNetWorkTypeForMetrics(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55768a2f0987a50b8e9568451504f855", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55768a2f0987a50b8e9568451504f855");
        }
        switch (getNetWorkTypeByCache(context)) {
            case -2:
                return "未知";
            case -1:
                return "无";
            case 0:
                return "Wi-Fi";
            case 1:
                return "wap";
            case 2:
                return "2G";
            case 3:
                return "3G";
            case 4:
                return "4G";
            case 5:
                return "5G";
            default:
                return "未知";
        }
    }

    public static String getVpnState(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        NetworkInfo networkInfo = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b3f4b22136e93bb955be87dd3e5f877f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b3f4b22136e93bb955be87dd3e5f877f");
        }
        if (context == null) {
            return "unknown";
        }
        if (queryVpnStateTime == 0 || SystemClock.elapsedRealtime() - queryVpnStateTime > 10000) {
            if (Build.VERSION.SDK_INT < 21) {
                cachedVpnState = "unknown";
            } else {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    if (connectivityManager != null) {
                        networkInfo = connectivityManager.getNetworkInfo(17);
                    }
                    if (networkInfo == null) {
                        cachedVpnState = "off";
                    } else {
                        cachedVpnState = networkInfo.isConnectedOrConnecting() ? "on" : "off";
                    }
                } catch (Throwable unused) {
                    cachedVpnState = "unknown";
                }
            }
        }
        return cachedVpnState;
    }

    public static String getWiFiName(Context context) {
        WifiInfo wifiInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7efddc60dd8dea2e530e713d9dd0e7d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7efddc60dd8dea2e530e713d9dd0e7d4");
        }
        if (context != null && getNetWorkTypeByCache(context) == 0) {
            if ((queryWiFiInfoTime == 0 || SystemClock.elapsedRealtime() - queryWiFiInfoTime > 60000) && (wifiInfo = WifiUtils.getWifiInfo("", context)) != null) {
                String ssid = wifiInfo.getSSID();
                if (!TextUtils.isEmpty(ssid)) {
                    return ssid.replaceAll("^\"|\"$", "");
                }
            }
            return cachedWiFiName;
        }
        return "";
    }

    private static int getNetWorkTypeByCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "148df4b2c6d6b48938cc21459f495748", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "148df4b2c6d6b48938cc21459f495748")).intValue();
        }
        if (queryNetWorkTime == 0 || SystemClock.elapsedRealtime() - queryNetWorkTime > 2000) {
            queryNetWorkTime = SystemClock.elapsedRealtime();
            cacheNetWorkType = com.sankuai.common.utils.NetWorkUtils.getNetworkType("metricx", context);
        }
        return cacheNetWorkType;
    }
}
