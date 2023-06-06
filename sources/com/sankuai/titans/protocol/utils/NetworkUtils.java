package com.sankuai.titans.protocol.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NetworkUtils {
    public static final int NETWORK_2G = 3;
    public static final int NETWORK_3G4G = 4;
    public static final int NETWORK_4G = 5;
    public static final int NETWORK_MOBILE = 2;
    public static final int NETWORK_NONE = 0;
    public static final int NETWORK_UNKNOWN = -1;
    public static final int NETWORK_WIFI = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getNetworkType(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e97a19cb12a8808136d4c14cbc8199cb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e97a19cb12a8808136d4c14cbc8199cb")).intValue() : getNetworkType(context, "");
    }

    public static int getNetworkType(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f219e13a1e9426056c901eae330a6a5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f219e13a1e9426056c901eae330a6a5f")).intValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return 0;
            }
            if (TextUtils.equals(activeNetworkInfo.getTypeName().toLowerCase(), "wifi")) {
                return 1;
            }
            if (TextUtils.equals(activeNetworkInfo.getTypeName().toLowerCase(), "mobile")) {
                int networkType = Privacy.createTelephonyManager(context, str).getNetworkType();
                if (networkType != 4) {
                    if (networkType != 13) {
                        switch (networkType) {
                            case 0:
                                break;
                            case 1:
                            case 2:
                                break;
                            default:
                                return 4;
                        }
                    } else {
                        return 5;
                    }
                }
                return 3;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getNetworkTypeString(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7dacda20e08547a47fe622040ae042c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7dacda20e08547a47fe622040ae042c9");
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
            default:
                return "unknown";
        }
    }
}
