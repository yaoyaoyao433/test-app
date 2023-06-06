package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WifiManagerProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;
    private final MtWifiManager mtWifiManager;
    private final WifiManager wifiManager;

    public WifiManagerProvider(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bc126b318f013f19b3954f5e01e9bc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bc126b318f013f19b3954f5e01e9bc1");
            return;
        }
        this.mContext = context;
        this.wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.mtWifiManager = Privacy.createWifiManager(context, str);
    }

    public Context getContext() {
        return this.mContext;
    }

    public WifiInfo getConnectionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1897b4c4ec718893f61a649afa6703c", RobustBitConfig.DEFAULT_VALUE) ? (WifiInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1897b4c4ec718893f61a649afa6703c") : this.mtWifiManager.getConnectionInfo();
    }

    public List<WifiConfiguration> getConfiguredNetworks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c788aae3002841158ff9a8ed7a01c02", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c788aae3002841158ff9a8ed7a01c02") : this.mtWifiManager.getConfiguredNetworks();
    }

    public boolean enableNetwork(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c205afa64b2af9b0b4b420fa5de70f0a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c205afa64b2af9b0b4b420fa5de70f0a")).booleanValue() : this.wifiManager.enableNetwork(i, z);
    }

    public int addNetwork(WifiConfiguration wifiConfiguration) {
        Object[] objArr = {wifiConfiguration};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfed770b9af7e8fbf81a2c6c68b00bf1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfed770b9af7e8fbf81a2c6c68b00bf1")).intValue() : this.wifiManager.addNetwork(wifiConfiguration);
    }

    public boolean startScan() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae77df197a4b5a5128d7a6b4e8e41878", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae77df197a4b5a5128d7a6b4e8e41878")).booleanValue() : this.mtWifiManager.startScan();
    }

    public List<ScanResult> getScanResults() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bae187a2ed8f03d2ed997fff9c2bb01b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bae187a2ed8f03d2ed997fff9c2bb01b") : this.mtWifiManager.getScanResults();
    }

    public List<WifiConfiguration> configurationList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52230660fe1f0c5ad849337640c8c4a1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52230660fe1f0c5ad849337640c8c4a1") : this.mtWifiManager.getConfiguredNetworks();
    }

    public boolean removeNetwork(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8518b48ef33b33193216aa06554eb85c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8518b48ef33b33193216aa06554eb85c")).booleanValue() : this.wifiManager.removeNetwork(i);
    }

    public boolean saveConfiguration() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70186d089dde25f9b4bc04a9adb49c7c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70186d089dde25f9b4bc04a9adb49c7c")).booleanValue() : this.wifiManager.saveConfiguration();
    }

    public boolean isWifiEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac0d542a4c0330c8da32446b5622c3e5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac0d542a4c0330c8da32446b5622c3e5")).booleanValue() : this.wifiManager.isWifiEnabled();
    }

    public boolean setWifiEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f4acd44cd7eba423b25b085b08b025f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f4acd44cd7eba423b25b085b08b025f")).booleanValue() : this.wifiManager.setWifiEnabled(z);
    }
}
