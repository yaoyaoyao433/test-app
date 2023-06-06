package com.sankuai.waimai.foundation.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.android.common.locate.api.MtWifiManager;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class p {
    public static ChangeQuickRedirect a;

    private static String h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbfa387729afa20fcc383b539a248f75", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbfa387729afa20fcc383b539a248f75");
        }
        switch (Privacy.createTelephonyManager(context, "com.sankuai.waimai.foundation:utils").getNetworkType()) {
            case 0:
                return "invalid";
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
            case 19:
                return "4G";
            case 20:
                return "5G";
            default:
                return "invalid";
        }
    }

    private static NetworkInfo i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3712032d8f15cd70ba15b361aa32af0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (NetworkInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3712032d8f15cd70ba15b361aa32af0f");
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0af44e2a9d81605f80a52613d493011b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0af44e2a9d81605f80a52613d493011b")).booleanValue();
        }
        NetworkInfo i = i(context);
        return i != null && i.isAvailable();
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "351c00ef6f69a027993d359357bec53f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "351c00ef6f69a027993d359357bec53f");
        }
        String str = "invalid";
        NetworkInfo i = i(context);
        if (i == null || !i.isConnected()) {
            return "Unavailable";
        }
        String typeName = i.getTypeName();
        if (typeName.equalsIgnoreCase("wifi")) {
            return "WiFi";
        }
        if (typeName.equalsIgnoreCase("mobile")) {
            str = h(context);
            if (str.equals("invalid")) {
                str = i.getSubtypeName();
                if (MTCellInfo.TYPE_TDSCDMA.equalsIgnoreCase(str) || MTCellInfo.TYPE_WCDMA.equalsIgnoreCase(str) || "CDMA2000".equalsIgnoreCase(str)) {
                    str = "3G";
                }
            }
        }
        return str;
    }

    public static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "328dbc8e4802ea435fa49b1ff530bc19", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "328dbc8e4802ea435fa49b1ff530bc19") : f(context) ? d(context) ? "WiFi" : "WWAN" : "";
    }

    public static boolean d(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "219b629a66f1e6393568e9aeb01a0704", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "219b629a66f1e6393568e9aeb01a0704")).booleanValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && "WIFI".equalsIgnoreCase(activeNetworkInfo.getTypeName());
    }

    public static boolean e(Context context) {
        MtTelephonyManager createTelephonyManager;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fd086729a5d1b0c2138217fe3b5172f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fd086729a5d1b0c2138217fe3b5172f")).booleanValue() : (context == null || (createTelephonyManager = Privacy.createTelephonyManager(context, "com.sankuai.waimai.foundation:utils")) == null || createTelephonyManager.getSimState() != 5) ? false : true;
    }

    public static boolean f(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f9abfbdc1bd1165df8f279dc0cf8e14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f9abfbdc1bd1165df8f279dc0cf8e14")).booleanValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
    }

    public static String g(Context context) {
        NetworkInfo i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e16ed8dc45669240496bd83bc534b1a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e16ed8dc45669240496bd83bc534b1a0");
        }
        if (context == null || (i = i(context)) == null || !i.isConnected()) {
            return "";
        }
        if (i.getType() == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces == null) {
                    return "";
                }
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            return nextElement.getHostAddress();
                        }
                    }
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        } else if (i.getType() == 1) {
            int ipAddress = new MtWifiManager(context, "wm").getConnectionInfo().getIpAddress();
            Object[] objArr2 = {Integer.valueOf(ipAddress)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a6074b0c444fa6060a1ec4a4383ace09", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a6074b0c444fa6060a1ec4a4383ace09");
            }
            return (ipAddress & 255) + CommonConstant.Symbol.DOT + ((ipAddress >> 8) & 255) + CommonConstant.Symbol.DOT + ((ipAddress >> 16) & 255) + CommonConstant.Symbol.DOT + ((ipAddress >> 24) & 255);
        } else {
            return "";
        }
    }
}
