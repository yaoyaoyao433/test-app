package com.meituan.android.common.fingerprint.info;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WifiMacInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String bssid;
    public final String ssid;

    public WifiMacInfo(String str, String str2) {
        this.ssid = str == null ? "" : str;
        this.bssid = str2 == null ? "" : str2;
    }
}
