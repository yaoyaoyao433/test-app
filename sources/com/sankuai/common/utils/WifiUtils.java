package com.sankuai.common.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WifiUtils {
    public static final String DELIMITER = "\b";
    private static final int MAX_WIFI_INFO_DEFAULT = 3;
    public static final String WIFI_CURRENT_INDEX = "wifi-cur";
    public static final String WIFI_MAC = "wifi-mac";
    public static final String WIFI_NAME = "wifi-name";
    private static final int WIFI_SIGNAL_LEVEL = 100;
    public static final String WIFI_STRENGTH = "wifi-strength";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public static Map<String, String> buildWiFiParams(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad85d4066d7c5c9593c025eb4c4cdb02", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad85d4066d7c5c9593c025eb4c4cdb02") : buildWiFiParams("", context, 3);
    }

    public static Map<String, String> buildWiFiParams(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "468f3b8270e8ae7aae109fb00520752f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "468f3b8270e8ae7aae109fb00520752f") : buildWiFiParams(str, context, 3);
    }

    @Deprecated
    public static Map<String, String> buildWiFiParams(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1e316d3b20904ff6821b909382ba71a", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1e316d3b20904ff6821b909382ba71a") : buildWiFiParams("", context, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> buildWiFiParams(java.lang.String r12, android.content.Context r13, int r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.WifiUtils.buildWiFiParams(java.lang.String, android.content.Context, int):java.util.Map");
    }

    public static /* synthetic */ int lambda$buildWiFiParams$0(ScanResult scanResult, ScanResult scanResult2) {
        Object[] objArr = {scanResult, scanResult2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a498b28ab8a73b55333cedab808886f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a498b28ab8a73b55333cedab808886f")).intValue() : WifiManager.calculateSignalLevel(scanResult2.level, 100) - WifiManager.calculateSignalLevel(scanResult.level, 100);
    }

    private static boolean isWifiConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "220a62b0f70c0cf075adea3f834e969a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "220a62b0f70c0cf075adea3f834e969a")).booleanValue();
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                if (1 == activeNetworkInfo.getType()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Deprecated
    public static List<ScanResult> getWifis(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "655316de86733536e0d6084deeee2e13", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "655316de86733536e0d6084deeee2e13") : getWifis("", context);
    }

    public static List<ScanResult> getWifis(String str, Context context) {
        List<ScanResult> list;
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac8c6f6622abca2a292468d7d1c21cbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac8c6f6622abca2a292468d7d1c21cbc");
        }
        try {
            list = Privacy.createWifiManager(context, str).getScanResults();
        } catch (Throwable unused) {
            list = null;
        }
        return list == null ? new ArrayList() : list;
    }

    @Deprecated
    public static List<String> getWifiSSIDs(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c52dadc2edf49876f431cdcafa7a093", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c52dadc2edf49876f431cdcafa7a093") : getWifiSSIDs("", context);
    }

    public static List<String> getWifiSSIDs(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "664012c9ca91dbfcf8868871a142c68b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "664012c9ca91dbfcf8868871a142c68b");
        }
        ArrayList arrayList = new ArrayList();
        try {
            List<ScanResult> wifis = getWifis(str, context);
            if (!CollectionUtils.isEmpty(wifis)) {
                for (ScanResult scanResult : wifis) {
                    if (scanResult != null && !arrayList.contains(scanResult.SSID)) {
                        arrayList.add(scanResult.SSID);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    @Deprecated
    public static WifiInfo getWifiInfo(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb617679e7c0d61784b1e5cf7b81dd29", RobustBitConfig.DEFAULT_VALUE) ? (WifiInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb617679e7c0d61784b1e5cf7b81dd29") : getWifiInfo("", context);
    }

    public static WifiInfo getWifiInfo(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0afb22007a0c444cf23c6da4eb36a948", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0afb22007a0c444cf23c6da4eb36a948");
        }
        try {
            return Privacy.createWifiManager(context, str).getConnectionInfo();
        } catch (Throwable unused) {
            return null;
        }
    }
}
