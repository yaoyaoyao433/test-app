package com.sankuai.common.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NetWorkUtils {
    public static final int NETWORK_2G = 2;
    public static final int NETWORK_3G = 3;
    public static final int NETWORK_4G = 4;
    public static final int NETWORK_5G = 5;
    public static final int NETWORK_NONE = -1;
    public static final int NETWORK_UNKNOWN = -2;
    public static final int NETWORK_WAP = 1;
    public static final int NETWORK_WIFI = 0;
    private static final long UPDATE_INTERVAL = 60000;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean hasRegistered = false;
    private static long lastUpdateTime;
    private static final BroadcastReceiver networkChangeReceiver = new BroadcastReceiver() { // from class: com.sankuai.common.utils.NetWorkUtils.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "762a82a3f922afd5af64a7423e303193", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "762a82a3f922afd5af64a7423e303193");
            } else {
                NetWorkUtils.forceUpdate();
            }
        }
    };
    private static NetworkInfo networkInfoCache;

    @Deprecated
    public static String getMACAddress() {
        return "";
    }

    @Deprecated
    public static String getMACAddress(String str) {
        return "";
    }

    private static int getNetworkClass(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dddee96af228292512230c649f2c9a27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dddee96af228292512230c649f2c9a27")).intValue();
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
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
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return -2;
        }
    }

    private static NetworkInfo getActiveNetworkInfo(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6d01424db08f81ad2a092a0da8916bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (NetworkInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6d01424db08f81ad2a092a0da8916bf");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (networkInfoCache == null || lastUpdateTime == 0 || elapsedRealtime - lastUpdateTime >= 60000) {
            try {
                networkInfoCache = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                lastUpdateTime = elapsedRealtime;
                if (!hasRegistered) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.getApplicationContext().registerReceiver(networkChangeReceiver, intentFilter);
                    hasRegistered = true;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return networkInfoCache;
    }

    public static void forceUpdate() {
        lastUpdateTime = 0L;
    }

    public static boolean isNetworkConnected(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7c247011ec3012bcec6ab59519f3c36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7c247011ec3012bcec6ab59519f3c36")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static int getConnectionType(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8ac656acd8be6c535a0fb384c19e57b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8ac656acd8be6c535a0fb384c19e57b")).intValue();
        }
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getType();
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static boolean isWifiConnected(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d730662d054e14d963eb8dc1e9e4eb9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d730662d054e14d963eb8dc1e9e4eb9a")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
                return activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    public static boolean isMobileConnected(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d992af292fec86c8fcfeaed944cdd45", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d992af292fec86c8fcfeaed944cdd45")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                return activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    @Deprecated
    public static int getNetworkType(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9e8fb04331d5680bc5a975000dae6b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9e8fb04331d5680bc5a975000dae6b1")).intValue() : getNetworkType("", context);
    }

    public static int getNetworkType(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ce9081e5128fb61ff1ea82d9c9a98eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ce9081e5128fb61ff1ea82d9c9a98eb")).intValue();
        }
        if (isNetworkConnected(context)) {
            try {
                int type = getActiveNetworkInfo(context).getType();
                if (type == 1) {
                    return 0;
                }
                if (type == 0) {
                    if (TextUtils.isEmpty(Proxy.getDefaultHost())) {
                        return getNetworkClass(Privacy.createTelephonyManager(context, str).getNetworkType());
                    }
                    return 1;
                }
                return -2;
            } catch (Throwable th) {
                th.printStackTrace();
                return -2;
            }
        }
        return -1;
    }

    public static String getIPAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbd0a6903f22eae40cf5b430efc4f5cc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbd0a6903f22eae40cf5b430efc4f5cc") : getIPAddress(true);
    }

    public static String getIPAddress(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "569379f0cb154377426a54f0d104fe58", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "569379f0cb154377426a54f0d104fe58");
        }
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        boolean z2 = hostAddress.indexOf(58) < 0;
                        if (z) {
                            if (z2) {
                                return hostAddress;
                            }
                        } else if (!z2) {
                            int indexOf = hostAddress.indexOf(37);
                            return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                        }
                    }
                }
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String getNormalIPAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        boolean z = true;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4aec4bb98464b960f9ff63f354e568b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4aec4bb98464b960f9ff63f354e568b");
        }
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) >= 0) {
                            z = false;
                        }
                        if (z) {
                            return hostAddress;
                        }
                        int indexOf = hostAddress.indexOf(37);
                        return indexOf < 0 ? hostAddress.toUpperCase() : hostAddress.substring(0, indexOf).toUpperCase();
                    }
                }
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
