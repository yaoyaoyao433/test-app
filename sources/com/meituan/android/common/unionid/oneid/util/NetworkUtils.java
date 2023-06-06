package com.meituan.android.common.unionid.oneid.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NetworkUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Pair<String, String> macAddress;

    public static String mac(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "086e7b96e73e238eb3d4ca6a4d8ff2f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "086e7b96e73e238eb3d4ca6a4d8ff2f3");
        }
        String str = (String) macCompatibility().first;
        if (TextUtils.isEmpty(str) && Build.VERSION.SDK_INT < 23) {
            str = macMarshmallowEarlier(context);
        }
        return str == null ? "" : str;
    }

    public static String p2pMac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3bb5c6fada2c9e7d16da132c751cc857", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3bb5c6fada2c9e7d16da132c751cc857");
        }
        String str = (String) macCompatibility().second;
        return str == null ? "" : str;
    }

    public static Pair<String, String> macCompatibility() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "184b14e79b4c19fdab42fdb5fd6c960b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "184b14e79b4c19fdab42fdb5fd6c960b");
        }
        if (macAddress != null) {
            return macAddress;
        }
        String str2 = "";
        String str3 = "";
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0") || networkInterface.getName().equalsIgnoreCase("p2p0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                            str2 = "";
                        }
                        if (networkInterface.getName().equalsIgnoreCase("p2p0")) {
                            str = "";
                            str3 = str;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (byte b : hardwareAddress) {
                            sb.append(Integer.toHexString(b & 255));
                            sb.append(CommonConstant.Symbol.COLON);
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                            str2 = sb.toString();
                        }
                        if (networkInterface.getName().equalsIgnoreCase("p2p0")) {
                            str = sb.toString();
                            str3 = str;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Pair<String, String> pair = new Pair<>(str2, str3);
        macAddress = pair;
        return pair;
    }

    public static String macCompatibility(List<NetworkInterface> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4273e8eacb2d4c7c1c44127f2b78559", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4273e8eacb2d4c7c1c44127f2b78559");
        }
        if (list == null) {
            return "";
        }
        try {
            for (NetworkInterface networkInterface : list) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(Integer.toHexString(b & 255));
                        sb.append(CommonConstant.Symbol.COLON);
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @SuppressLint({"HardwareIds", "WifiManagerPotentialLeak"})
    public static String macMarshmallowEarlier(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53cecfdf5df8e6b7f763bbc90ffcf439", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53cecfdf5df8e6b7f763bbc90ffcf439");
        }
        try {
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    @SuppressLint({"HardwareIds", "WifiManagerPotentialLeak"})
    public static String macMarshmallowEarlier(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "841efc510a96440861dfb79434ec4ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "841efc510a96440861dfb79434ec4ee2");
        }
        if (wifiInfo == null) {
            return "";
        }
        try {
            return wifiInfo.getMacAddress();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
