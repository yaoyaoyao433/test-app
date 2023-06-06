package com.meituan.android.common.locate.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class s {
    private static String[] a = {"02:00:00:00:00:00", "01:80:C2:00:00:03", "12:34:56:78:9A:BC", "FF:FF:FF:FF:FF:FF", "00:00:00:00:00:00", "00:02:00:00:00:00"};
    private static long b = 0;
    private static WifiInfo c;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static WifiInfo a(MtWifiManager mtWifiManager, Context context) {
        Object[] objArr = {mtWifiManager, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69f187a632372b0c10139d9f1ef70734", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69f187a632372b0c10139d9f1ef70734");
        }
        LogUtils.a("get connectioninfo start");
        if (c != null && SystemClock.elapsedRealtime() - b < u.a(context).i()) {
            LogUtils.a("get connectioninfo too much,return");
            return c;
        }
        LogUtils.a("real get connectioninfo");
        b = SystemClock.elapsedRealtime();
        com.meituan.android.common.locate.api.a.a("getConnectionInfo_sdk", 1);
        WifiInfo connectionInfo = mtWifiManager.getConnectionInfo();
        c = connectionInfo;
        return connectionInfo;
    }

    public static String a(ScanResult scanResult) {
        Object[] objArr = {scanResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "665d164230a72910d9bc805626af65b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "665d164230a72910d9bc805626af65b1");
        }
        try {
            Object a2 = l.a(scanResult, "wifiSsid");
            if (a2 != null) {
                return a(a2);
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
        return scanResult.SSID;
    }

    public static String a(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fe70dd77da8c39babe383bf285c2de2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fe70dd77da8c39babe383bf285c2de2");
        }
        try {
            Object a2 = l.a(wifiInfo, "getWifiSsid", new Object[0]);
            if (a2 != null) {
                return a(a2);
            }
        } catch (Exception e) {
            LogUtils.a(e);
        }
        return wifiInfo.getSSID();
    }

    private static String a(Object obj) throws Exception {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c4f0469f50248d42446081b8e4370c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c4f0469f50248d42446081b8e4370c6");
        }
        if (obj != null) {
            byte[] bArr = (byte[]) l.a(obj, "getOctets", new Object[0]);
            return new String(bArr, b.a(bArr, bArr.length));
        }
        throw new Exception();
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f38e98894eec476d1c1cbd63579ccb6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f38e98894eec476d1c1cbd63579ccb6")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            LogUtils.a("WifiUtils " + th.getMessage());
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            LogUtils.a("WifiUtils failed in get connectMgr");
            return false;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.getType() == 1;
    }

    public static boolean a(Context context, String str) {
        boolean z;
        Exception e;
        boolean z2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f779eafa7584b73136caadeb4f1c5360", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f779eafa7584b73136caadeb4f1c5360")).booleanValue();
        }
        MtWifiManager createWifiManager = Privacy.createWifiManager(context, str);
        if (createWifiManager == null) {
            LogUtils.a("WifiUtils WifiManager is null");
            return false;
        }
        try {
            z = createWifiManager.isWifiEnabled();
            try {
                LogUtils.a("WifiUtils  mWifiManager.isWifiEnabled(): " + z);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            z = false;
        }
        if (z || Build.VERSION.SDK_INT <= 17) {
            return z;
        }
        try {
            z2 = createWifiManager.isScanAlwaysAvailable();
        } catch (Exception e2) {
            boolean z3 = z;
            e = e2;
            z2 = z3;
        }
        try {
            LogUtils.a("WifiUtils  mWifiManager.isScanAlwaysAvailable(): " + z2);
            if (z2) {
                LogUtils.a("WifiUtils  sdk version: " + Build.VERSION.SDK_INT + StringUtil.SPACE + z2);
                return z2;
            }
            return z2;
        } catch (Exception e3) {
            e = e3;
            LogUtils.a("WifiUtils get wifiEnabled exception: " + e.getMessage());
            return z2;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c909abe4c3a8fd93033d2e04c9f936d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c909abe4c3a8fd93033d2e04c9f936d")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.equals("00:00:00:00:00:00") || str.contains(" :")) {
            return false;
        }
        if (a != null && a.length > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != null && a[i].equalsIgnoreCase(str.trim())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static long b(String str) {
        long j;
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef8589549fc46f1d1b3a97fa40eb129e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef8589549fc46f1d1b3a97fa40eb129e")).longValue();
        }
        if (str == null || str.length() == 0) {
            return 0L;
        }
        long j2 = 0;
        for (int length = str.length() - 1; length >= 0; length--) {
            long charAt = str.charAt(length);
            if (charAt < 48 || charAt > 57) {
                long j3 = 97;
                if (charAt < 97 || charAt > 102) {
                    j3 = 65;
                    if (charAt < 65 || charAt > 70) {
                        if (charAt != 58 && charAt != 124) {
                            return 0L;
                        }
                    }
                }
                j = (charAt - j3) + 10;
            } else {
                j = charAt - 48;
            }
            j2 += j << i;
            i += 4;
        }
        if (i != 48) {
            return 0L;
        }
        return j2;
    }

    public static boolean b(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b168596c154fe1376ffba5c5fa00d4b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b168596c154fe1376ffba5c5fa00d4b0")).booleanValue() : (wifiInfo == null || TextUtils.isEmpty(wifiInfo.getBSSID()) || wifiInfo.getSSID() == null || wifiInfo.getBSSID().equals("00:00:00:00:00:00") || wifiInfo.getBSSID().contains(" :") || TextUtils.isEmpty(wifiInfo.getSSID())) ? false : true;
    }
}
