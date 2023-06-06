package com.sankuai.meituan.location.collector.provider;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public int e;
    public boolean f;
    public byte g;
    public String h;
    public transient ScanResult i;

    public l(ScanResult scanResult) {
        long j;
        long j2;
        Object[] objArr = {scanResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "773fb1cdeca220ffcbeb2bb2351825cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "773fb1cdeca220ffcbeb2bb2351825cb");
        } else if (scanResult == null) {
        } else {
            this.i = scanResult;
            this.c = com.sankuai.meituan.location.collector.utils.m.a(scanResult);
            this.b = scanResult.BSSID;
            this.d = scanResult.level;
            this.e = scanResult.frequency;
            String str = scanResult.capabilities;
            if (!TextUtils.isEmpty(str)) {
                this.f = true ^ str.startsWith("[ESS]");
            }
            if (Build.VERSION.SDK_INT >= 17) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (com.meituan.android.common.locate.provider.g.a() == null || !u.a(com.meituan.android.common.locate.provider.g.a()).a()) {
                    j2 = scanResult.timestamp;
                } else {
                    j2 = com.meituan.android.common.locate.wifi.a.a().a(scanResult.BSSID);
                    if (j2 <= 0) {
                        j2 = SystemClock.elapsedRealtime() - (scanResult.timestamp / 1000);
                    }
                }
                j = j2 / 1000;
                LogUtils.a("CollectorWifi SystemClock.elapsedRealtime(): " + elapsedRealtime + " tmpwifisubage: " + j);
            } else {
                j = 0;
            }
            if (j > 0) {
                this.g = j > 127 ? Byte.MAX_VALUE : (byte) j;
            }
            LogUtils.a("CollectorWifi wifisubage: " + ((int) this.g));
            this.h = scanResult.capabilities;
        }
    }

    public l(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b17e15d9f7fb6668a083f356bd3f8c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b17e15d9f7fb6668a083f356bd3f8c2");
        } else if (wifiInfo == null) {
        } else {
            this.b = wifiInfo.getBSSID();
            this.c = com.sankuai.meituan.location.collector.utils.m.a(wifiInfo);
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e853218be1b1b24c4f1cb854700c47c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e853218be1b1b24c4f1cb854700c47c2");
        }
        return "CollectorWifi{bssid='" + this.b + "', ssid='" + this.c + "', wifisig=" + this.d + ", wififrequency=" + this.e + ", wifiencrypt=" + this.f + ", wifisubage=" + ((int) this.g) + ", wifiencrypttype='" + this.h + "'}";
    }
}
