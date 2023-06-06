package com.dianping.titans.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NetworkUtil {
    public static final String NAME_NETWORK_5G = "5g";
    public static final int NETWORK_2G = 3;
    public static final int NETWORK_3G4G = 4;
    public static final int NETWORK_4G = 5;
    public static final int NETWORK_5G = 6;
    public static final int NETWORK_MOBILE = 2;
    public static final int NETWORK_NONE = 0;
    public static final int NETWORK_UNKNOWN = -1;
    public static final int NETWORK_WIFI = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getNetworkType(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28952b698e1db4a3f13c96f6b4111c75", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28952b698e1db4a3f13c96f6b4111c75")).intValue() : getNetworkType(context, "");
    }

    public static int getNetworkType(Context context, String str) {
        MtTelephonyManager createTelephonyManager;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "901dd5082b77504e2491f7a7ae8913bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "901dd5082b77504e2491f7a7ae8913bb")).intValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return 0;
            }
            if (TextUtils.equals(activeNetworkInfo.getTypeName().toLowerCase(), "wifi")) {
                return 1;
            }
            if (!TextUtils.equals(activeNetworkInfo.getTypeName().toLowerCase(), "mobile") || (createTelephonyManager = Privacy.createTelephonyManager(context, str)) == null) {
                return -1;
            }
            int networkType = createTelephonyManager.getNetworkType();
            if (networkType != 4) {
                if (networkType != 13) {
                    if (networkType != 20) {
                        switch (networkType) {
                            case 0:
                                return -1;
                            case 1:
                            case 2:
                                break;
                            default:
                                return 4;
                        }
                    } else {
                        return 6;
                    }
                } else {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getNetworkTypeString(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f257ea29546291cb62bec5781ad964cb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f257ea29546291cb62bec5781ad964cb") : getNetworkTypeString(context, "");
    }

    public static String getNetworkTypeString(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1680e3c5294483e1a6c078175026aa7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1680e3c5294483e1a6c078175026aa7e");
        }
        switch (getNetworkType(context.getApplicationContext(), str)) {
            case -1:
                return "unknown";
            case 0:
                return "none";
            case 1:
                return "wifi";
            case 2:
                return "mobile";
            case 3:
            case 4:
                return "LowG";
            case 5:
                return "4g";
            case 6:
                return NAME_NETWORK_5G;
            default:
                return "unknown";
        }
    }
}
