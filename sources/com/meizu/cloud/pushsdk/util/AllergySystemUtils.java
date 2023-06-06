package com.meizu.cloud.pushsdk.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.android.privacy.aop.e;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* loaded from: classes3.dex */
public class AllergySystemUtils {
    private static final String TAG = "AllergySystemUtils";

    public static String getBssId(Context context) {
        WifiInfo c;
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null || (c = e.c(wifiManager)) == null) {
                return null;
            }
            return c.getBSSID();
        } catch (Exception e) {
            DebugLogger.e(TAG, "getBssId error " + e.getMessage());
            return null;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String getMacAddress(Context context) {
        WifiInfo c;
        String a;
        String str;
        String str2 = null;
        try {
            if (Build.VERSION.SDK_INT < 23) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager != null && (c = e.c(wifiManager)) != null) {
                    a = e.a(c);
                }
                return null;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 1) {
                    str = "wlan0";
                } else if (activeNetworkInfo.getType() != 9) {
                    return null;
                } else {
                    str = "eth0";
                }
                a = getMacAddressWithIfName(str);
            } else {
                a = getMacAddressWithIfName("wlan0");
                try {
                    if (TextUtils.isEmpty(a)) {
                        return getMacAddressWithIfName("eth0");
                    }
                } catch (Exception unused) {
                    str2 = a;
                    DebugLogger.e(TAG, "get address exception ");
                    return str2;
                }
            }
            return a;
        } catch (Exception unused2) {
        }
    }

    private static String getMacAddressWithIfName(String str) {
        String str2;
        String str3;
        try {
            FileInputStream fileInputStream = new FileInputStream("/sys/class/net/" + str + "/address");
            Scanner scanner = new Scanner(fileInputStream);
            r0 = scanner.hasNextLine() ? scanner.nextLine().trim() : null;
            fileInputStream.close();
        } catch (FileNotFoundException unused) {
            str2 = TAG;
            str3 = "getMacAddressWithIfName File not found Exception";
            DebugLogger.e(str2, str3);
            return r0;
        } catch (IOException unused2) {
            str2 = TAG;
            str3 = "getMacAddressWithIfName IOException";
            DebugLogger.e(str2, str3);
            return r0;
        } catch (Exception unused3) {
            str2 = TAG;
            str3 = "getMacAddressWithIfName Exception ";
            DebugLogger.e(str2, str3);
            return r0;
        }
        return r0;
    }

    public static String getOperator(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return com.meituan.android.privacy.aop.d.f(telephonyManager);
            }
            return null;
        } catch (Exception e) {
            DebugLogger.e(TAG, "getOperator error " + e.getMessage());
            return null;
        }
    }

    public static List<String> getWifiList(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                List<ScanResult> b = e.b(wifiManager);
                ArrayList arrayList2 = new ArrayList();
                if (b != null) {
                    for (ScanResult scanResult : b) {
                        if (!arrayList2.contains(scanResult.SSID)) {
                            arrayList.add(scanResult.SSID + ";" + scanResult.BSSID + ";" + scanResult.level);
                            arrayList2.add(scanResult.SSID);
                        }
                        if (arrayList.size() >= 10) {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            DebugLogger.e(TAG, "getWifiList error " + e.getMessage());
        }
        return arrayList;
    }
}
