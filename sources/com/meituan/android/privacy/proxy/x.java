package com.meituan.android.privacy.proxy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WpsInfo;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@SuppressLint({"MissingPermission"})
/* loaded from: classes3.dex */
public final class x implements MtWifiManager {
    public static ChangeQuickRedirect a;
    private Context b;
    private WifiManager c;
    private u d;
    private String e;

    public x(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1efae98caaa675de3b8c5baf6ba2ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1efae98caaa675de3b8c5baf6ba2ed");
            return;
        }
        this.e = str;
        this.b = context;
        this.d = new u();
        if (context != null) {
            try {
                this.c = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            } catch (Exception e) {
                Log.e("MtTelephonyManagerImpl", e.toString());
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final List<WifiConfiguration> getConfiguredNetworks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a21ebfacf73cf40b3a1cfe0c6417aa1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a21ebfacf73cf40b3a1cfe0c6417aa1");
        }
        if (this.c == null) {
            return new ArrayList();
        }
        return ContextCompat.checkSelfPermission(this.b, "android.permission.ACCESS_WIFI_STATE") != 0 ? new ArrayList() : (List) this.d.a("wifi.gCNetworks", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<List<WifiConfiguration>>() { // from class: com.meituan.android.privacy.proxy.x.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ List<WifiConfiguration> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2a373d4f8c5543bd231f9691338ec6f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2a373d4f8c5543bd231f9691338ec6f") : x.this.c.getConfiguredNetworks();
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final List<ScanResult> getScanResults() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4b53baf1e74808fe5d911fbcacf8da", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4b53baf1e74808fe5d911fbcacf8da") : this.c == null ? new ArrayList() : (List) this.d.a("wifi.gSResults", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<List<ScanResult>>() { // from class: com.meituan.android.privacy.proxy.x.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ List<ScanResult> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee6695cd8777ccb75afc12702365fe03", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee6695cd8777ccb75afc12702365fe03") : x.this.c.getScanResults();
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final WifiInfo getConnectionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759339aad5b92cbdb855fd2a73f52308", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759339aad5b92cbdb855fd2a73f52308");
        }
        if (this.c == null) {
            return null;
        }
        return (WifiInfo) this.d.a("wifi.gCInfo", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<WifiInfo>() { // from class: com.meituan.android.privacy.proxy.x.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ WifiInfo a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a081316ad39b2ae1980df8f33377bc14", RobustBitConfig.DEFAULT_VALUE) ? (WifiInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a081316ad39b2ae1980df8f33377bc14") : x.this.c.getConnectionInfo();
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final boolean startScan() {
        Boolean bool;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15df40df827586fefd3af96ea61671b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15df40df827586fefd3af96ea61671b3")).booleanValue();
        }
        if (this.c == null || ContextCompat.checkSelfPermission(this.b, "android.permission.CHANGE_WIFI_STATE") != 0 || (bool = (Boolean) this.d.a("wifi.sScan", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.x.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72eaf988dbc1b8c3d5203537d81a0902", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72eaf988dbc1b8c3d5203537d81a0902") : Boolean.valueOf(x.this.c.startScan());
            }
        }, false)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final void setTdlsEnabled(InetAddress inetAddress, boolean z) {
        Object[] objArr = {inetAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5230a8744a471c45dd990f649d2b1e9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5230a8744a471c45dd990f649d2b1e9b");
        } else {
            com.meituan.android.privacy.interfaces.a.a();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final void setTdlsEnabledWithMacAddress(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c68456fdf1d0866680eaa14909e57a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c68456fdf1d0866680eaa14909e57a80");
        } else {
            com.meituan.android.privacy.interfaces.a.a();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    @RequiresApi(api = 26)
    public final void startLocalOnlyHotspot(final WifiManager.LocalOnlyHotspotCallback localOnlyHotspotCallback, @Nullable final Handler handler) {
        Object[] objArr = {localOnlyHotspotCallback, handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e8bfd4a99b868c26bedc3db73708fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e8bfd4a99b868c26bedc3db73708fb");
        } else if (this.c != null && ContextCompat.checkSelfPermission(this.b, "android.permission.CHANGE_WIFI_STATE") == 0) {
            this.d.a("wifi.sLOHotspot", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.x.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b9cd5c0c6c34921836be176325185e4", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b9cd5c0c6c34921836be176325185e4");
                    }
                    x.this.c.startLocalOnlyHotspot(localOnlyHotspotCallback, handler);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    @RequiresApi(api = 21)
    public final void startWps(final WpsInfo wpsInfo, final WifiManager.WpsCallback wpsCallback) {
        Object[] objArr = {wpsInfo, wpsCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69b615c37025307b646e9c5f347f0d57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69b615c37025307b646e9c5f347f0d57");
        } else if (this.c == null) {
        } else {
            this.d.a("wifi.sWps", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.x.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8efa9b6eb6c94b94c6e4f75b8e653cec", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8efa9b6eb6c94b94c6e4f75b8e653cec");
                    }
                    x.this.c.startWps(wpsInfo, wpsCallback);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final int getWifiState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fa868f843cc64db994831df28c74d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fa868f843cc64db994831df28c74d4")).intValue();
        }
        if (this.c == null) {
            return 4;
        }
        return this.c.getWifiState();
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final DhcpInfo getDhcpInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9826e5e12901652d179c04f817890acd", RobustBitConfig.DEFAULT_VALUE)) {
            return (DhcpInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9826e5e12901652d179c04f817890acd");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.getDhcpInfo();
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final boolean isScanAlwaysAvailable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4971371acc434ff9b8a7200bb1d3ef8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4971371acc434ff9b8a7200bb1d3ef8")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.isScanAlwaysAvailable();
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final boolean isWifiEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae6505a0253ab44b61c0b8f0a944191", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae6505a0253ab44b61c0b8f0a944191")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.isWifiEnabled();
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final String getMacAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c9085198024a8262bdea3359cf9d11", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c9085198024a8262bdea3359cf9d11");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "wifi.gMAddress")) {
            return AppUtil.macMarshmallowEarlier(this.b);
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final String getP2pMacAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cefc4bb3a86304e895aefdb32c13fd72", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cefc4bb3a86304e895aefdb32c13fd72");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "wifi.gPMAddress")) {
            return AppUtil.getP2pMac(this.b);
        }
        return null;
    }

    private static byte[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74cadadce145af5c6ad4d1662f86607b", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74cadadce145af5c6ad4d1662f86607b");
        }
        if (str == null || str.length() != 17) {
            return null;
        }
        String[] split = str.split(CommonConstant.Symbol.COLON);
        if (split.length != 6) {
            return null;
        }
        byte[] bArr = new byte[6];
        for (int i = 0; i < split.length; i++) {
            try {
                bArr[i] = (byte) Integer.parseInt(split[i], 16);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final byte[] getHardwareAddress() throws SocketException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523ef27b37a27ac530281032a28cb3e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523ef27b37a27ac530281032a28cb3e9");
        }
        if (z.a(PermissionGuard.PERMISSION_PHONE_READ, this.e, "wifi.gHAddress")) {
            return a(AppUtil.macCompatibility(this.b));
        }
        return null;
    }
}
