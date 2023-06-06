package com.meituan.android.common.fingerprint.info;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConnectWifiInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String bssid;
    public final int rssi;
    public final String ssid;

    public ConnectWifiInfo(String str, String str2, int i) {
        this.ssid = str == null ? "" : str;
        this.bssid = str2 == null ? "" : str2;
        this.rssi = i;
    }
}
