package com.meituan.mmp.lib.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.dianping.titans.utils.NetworkUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class am {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05d0d52615eb0715f503eeb92325a238", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05d0d52615eb0715f503eeb92325a238")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
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

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7eea7f17480a9e82d21ef111fcd2a525", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7eea7f17480a9e82d21ef111fcd2a525")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
                return activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    private static int b(Context context, String str) {
        int type;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "514096d9551d6abd94f17d5f460725de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "514096d9551d6abd94f17d5f460725de")).intValue();
        }
        if (a(context)) {
            try {
                type = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo().getType();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (type == 1) {
                return 0;
            }
            if (type == 0) {
                int networkType = Privacy.createTelephonyManager(context, str).getNetworkType();
                Object[] objArr2 = {Integer.valueOf(networkType)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "081205d11bb657ca25c592f3e196e661", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "081205d11bb657ca25c592f3e196e661")).intValue();
                }
                switch (networkType) {
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
            return -2;
        }
        return -1;
    }

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5193f15b3460f88ef661f78a13a39122", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5193f15b3460f88ef661f78a13a39122");
        }
        switch (b(context, str)) {
            case -1:
                return "none";
            case 0:
                return "wifi";
            case 1:
            default:
                return "unknown";
            case 2:
                return "2g";
            case 3:
                return "3g";
            case 4:
                return "4g";
            case 5:
                return NetworkUtil.NAME_NETWORK_5G;
        }
    }
}
