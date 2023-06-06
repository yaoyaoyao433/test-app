package com.meituan.android.common.locate.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.locate.platform.sniffer.b;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.j;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public class MtWifiManager extends MtBaseManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private WifiManager c;
    private com.meituan.android.privacy.interfaces.MtWifiManager d;

    public MtWifiManager(@NonNull Context context, @NonNull String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16ec41c8e439081e2e91bfd314084310", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16ec41c8e439081e2e91bfd314084310");
        } else if (this.a == null) {
        } else {
            try {
                this.d = Privacy.createWifiManager(context, str);
            } catch (Exception e) {
                LogUtils.a("TAGinit exception: " + e.getMessage());
            }
            try {
                this.c = (WifiManager) this.a.getSystemService("wifi");
            } catch (Exception e2) {
                LogUtils.a("TAGinit exception: " + e2.getMessage());
            }
        }
    }

    public MtWifiManager(@Nullable WifiManager wifiManager, @NonNull Context context, @NonNull String str) {
        super(context, str);
        Object[] objArr = {wifiManager, context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ab522271bdacb3f06ef01de76230b63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ab522271bdacb3f06ef01de76230b63");
        } else if (this.a == null) {
        } else {
            this.d = Privacy.createWifiManager(context, str);
            this.c = wifiManager;
        }
    }

    public int addNetwork(WifiConfiguration wifiConfiguration) {
        Object[] objArr = {wifiConfiguration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e4714eb8562a85ad77d8a0c77a8da95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e4714eb8562a85ad77d8a0c77a8da95")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return this.c.addNetwork(wifiConfiguration);
    }

    public int calculateSignalLevel(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b299438fc545c5cfa64317ed205721f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b299438fc545c5cfa64317ed205721f0")).intValue();
        }
        if (this.c == null) {
            return 0;
        }
        return WifiManager.calculateSignalLevel(i, i2);
    }

    public WifiManager.WifiLock createWifiLock(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cc5fad5a575433a5a0d0b2e7d54c4e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiManager.WifiLock) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cc5fad5a575433a5a0d0b2e7d54c4e2");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.createWifiLock(i, str);
    }

    public boolean disableNetwork(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e100a39b616ca2e8cd157dd73f8b47d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e100a39b616ca2e8cd157dd73f8b47d7")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.disableNetwork(i);
    }

    public boolean enableNetwork(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20b107d390dff257afb477f316b61101", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20b107d390dff257afb477f316b61101")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.enableNetwork(i, z);
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public List<WifiConfiguration> getConfiguredNetworks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7f1198dbd6523abfc75ebbd702ba98b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7f1198dbd6523abfc75ebbd702ba98b");
        }
        if (this.d != null && j.d(this.a)) {
            return this.d.getConfiguredNetworks();
        }
        return null;
    }

    @Nullable
    public WifiInfo getConnectionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49aa71fa0cdd62e425d3197dda7153bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49aa71fa0cdd62e425d3197dda7153bf");
        }
        if (this.d != null && j.d(this.a)) {
            return this.d.getConnectionInfo();
        }
        return null;
    }

    public DhcpInfo getDhcpInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dad65170666f8bb95d560d733008cc18", RobustBitConfig.DEFAULT_VALUE)) {
            return (DhcpInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dad65170666f8bb95d560d733008cc18");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.getDhcpInfo();
    }

    @Nullable
    public List<ScanResult> getScanResults() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87efa1cf95eaab03b3637303e5434696", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87efa1cf95eaab03b3637303e5434696");
        }
        if (this.d != null && j.d(this.a)) {
            return this.d.getScanResults();
        }
        return null;
    }

    public int getWifiState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1632f6089f54d466e6511b41bd278f5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1632f6089f54d466e6511b41bd278f5d")).intValue();
        }
        b.a(this.b, "getWifiState");
        if (this.d != null) {
            return this.d.getWifiState();
        }
        return 0;
    }

    public boolean isScanAlwaysAvailable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca5959a05ad5bc9d33f098c09ab66577", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca5959a05ad5bc9d33f098c09ab66577")).booleanValue();
        }
        if (this.d != null && Build.VERSION.SDK_INT >= 18) {
            return this.d.isScanAlwaysAvailable();
        }
        return false;
    }

    public boolean isWifiEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c38ba139cccb6082cd35056973ca167", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c38ba139cccb6082cd35056973ca167")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return this.d.isWifiEnabled();
    }

    public boolean removeNetwork(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1954cf8319a9195da38f664b66c5732e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1954cf8319a9195da38f664b66c5732e")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.removeNetwork(i);
    }

    public boolean saveConfiguration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e2b2f68dfa6483a2083f18b5aafe3ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e2b2f68dfa6483a2083f18b5aafe3ed")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.saveConfiguration();
    }

    public void setTdlsEnabled(InetAddress inetAddress, boolean z) {
        Object[] objArr = {inetAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35ce6232488148030deb3c7967978455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35ce6232488148030deb3c7967978455");
        } else if (this.d != null && Build.VERSION.SDK_INT >= 19) {
            this.d.setTdlsEnabled(inetAddress, z);
            a.a("setTdlsEnabled_" + this.b, 1);
            b.a(new c.a("sniffer_module_perm_count", "setTdlsEnabled"));
        }
    }

    public void setTdlsEnabledWithMacAddress(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a588fb39549732cf62b1348680f5a57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a588fb39549732cf62b1348680f5a57b");
        } else if (this.d != null && Build.VERSION.SDK_INT >= 19) {
            this.d.setTdlsEnabledWithMacAddress(str, z);
            a.a("setTdlsEnabledWithMacAddress_" + this.b, 1);
            b.a(new c.a("sniffer_module_perm_count", "setTdlsEnabledWithMacAddress"));
        }
    }

    public boolean setWifiEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c6bbf1757fcaa66b6e110a9863cd522", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c6bbf1757fcaa66b6e110a9863cd522")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.setWifiEnabled(z);
    }

    public boolean startScan() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e24542dd05be128b1921f1627760108", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e24542dd05be128b1921f1627760108")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return this.d.startScan();
    }
}
