package com.meituan.android.privacy.interfaces;

import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WpsInfo;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MtWifiManager {
    @RequiresPermission("Locate.once")
    List<WifiConfiguration> getConfiguredNetworks();

    @RequiresPermission("Locate.once")
    WifiInfo getConnectionInfo();

    DhcpInfo getDhcpInfo();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    byte[] getHardwareAddress() throws SocketException;

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    String getMacAddress();

    @RequiresPermission(PermissionGuard.PERMISSION_PHONE_READ)
    String getP2pMacAddress();

    @RequiresPermission("Locate.once")
    List<ScanResult> getScanResults();

    int getWifiState();

    boolean isScanAlwaysAvailable();

    boolean isWifiEnabled();

    @RequiresPermission("Locate.once")
    @RequiresApi(api = 19)
    void setTdlsEnabled(InetAddress inetAddress, boolean z);

    @RequiresPermission("Locate.once")
    @RequiresApi(api = 19)
    void setTdlsEnabledWithMacAddress(String str, boolean z);

    @RequiresPermission("Locate.once")
    @RequiresApi(api = 26)
    void startLocalOnlyHotspot(WifiManager.LocalOnlyHotspotCallback localOnlyHotspotCallback, @Nullable Handler handler);

    @RequiresPermission("Locate.once")
    boolean startScan();

    @RequiresPermission("Locate.once")
    @RequiresApi(api = 21)
    void startWps(WpsInfo wpsInfo, WifiManager.WpsCallback wpsCallback);
}
