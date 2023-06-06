package com.reactnativecommunity.netinfo.types;

import com.meituan.metrics.traffic.report.NetLogConstants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum b {
    BLUETOOTH("bluetooth"),
    CELLULAR("cellular"),
    ETHERNET("ethernet"),
    NONE("none"),
    UNKNOWN("unknown"),
    WIFI("wifi"),
    WIMAX("wimax"),
    VPN(NetLogConstants.Environment.VPN);
    
    public final String i;

    b(String str) {
        this.i = str;
    }
}
