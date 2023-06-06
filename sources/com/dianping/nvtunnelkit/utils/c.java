package com.dianping.nvtunnelkit.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("NetworkUtils");
    @SuppressLint({"StaticFieldLeak"})
    private static Context c;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a12bc8293ff102215945300cbbe1346b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a12bc8293ff102215945300cbbe1346b");
        } else if (c == null) {
            c = context.getApplicationContext();
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90871baf024572043dc44e2bb9e9ad71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90871baf024572043dc44e2bb9e9ad71")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = b(c).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable();
            }
        } catch (Exception e) {
            com.dianping.nvtunnelkit.logger.b.a(b, e);
        }
        return false;
    }

    private static ConnectivityManager b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "839dd0329d4199817ee1231842800e8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ConnectivityManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "839dd0329d4199817ee1231842800e8b");
        }
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            com.dianping.nvtunnelkit.logger.b.a(b, e);
            return null;
        }
    }

    private static MtTelephonyManager c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "191841cfd276ee935cb31130d50f6150", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtTelephonyManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "191841cfd276ee935cb31130d50f6150");
        }
        try {
            return Privacy.createTelephonyManager(context, "jcyf-b0be16ca63b0ef3a");
        } catch (Throwable th) {
            com.dianping.nvtunnelkit.logger.b.a("network", "cannot get telephony manager, maybe the permission is missing in AndroidManifest.xml?", th);
            return null;
        }
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12ad87fc2c22e25a7c2a627d4e6f1db9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12ad87fc2c22e25a7c2a627d4e6f1db9");
        }
        int c2 = c();
        if (c2 == 0) {
            return "unknown";
        }
        if (c2 == 1) {
            return "wifi";
        }
        MtTelephonyManager c3 = c(c);
        return c3 != null ? String.valueOf(c3.getNetworkType()) : "unknown";
    }

    public static int c() {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "484141e299dc31c872d684bd809f2a4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "484141e299dc31c872d684bd809f2a4a")).intValue();
        }
        ConnectivityManager b2 = b(c);
        if (b2 == null) {
            return 0;
        }
        try {
            activeNetworkInfo = b2.getActiveNetworkInfo();
        } catch (Exception e) {
            com.dianping.nvtunnelkit.logger.b.a(b, e);
        }
        if (activeNetworkInfo == null) {
            return 0;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
                MtTelephonyManager c2 = c(c);
                int networkType = c2 != null ? c2.getNetworkType() : 0;
                if (networkType == 0) {
                    networkType = activeNetworkInfo.getSubtype();
                }
                switch (networkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
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
                        return 3;
                    case 13:
                    case 19:
                        return 4;
                    case 20:
                        return 5;
                }
            case 1:
                return 1;
        }
        return 0;
    }

    public static String d() {
        WifiInfo connectionInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61e27f41a01f8148034293ebf21e7c7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61e27f41a01f8148034293ebf21e7c7d");
        }
        try {
            MtWifiManager createWifiManager = Privacy.createWifiManager(c, "jcyf-97211ab88208d92c");
            if (createWifiManager == null || !createWifiManager.isWifiEnabled() || (connectionInfo = createWifiManager.getConnectionInfo()) == null) {
                return "";
            }
            NetworkInfo.DetailedState detailedStateOf = WifiInfo.getDetailedStateOf(connectionInfo.getSupplicantState());
            return (detailedStateOf == NetworkInfo.DetailedState.CONNECTED || detailedStateOf == NetworkInfo.DetailedState.OBTAINING_IPADDR) ? connectionInfo.getSSID() : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
