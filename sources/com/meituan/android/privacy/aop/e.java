package com.meituan.android.privacy.aop;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile MtWifiManager b;

    public static List<WifiConfiguration> a(WifiManager wifiManager) {
        Object[] objArr = {wifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "747313e8b6ed6f3daa28501ebfa1a37c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "747313e8b6ed6f3daa28501ebfa1a37c") : a() == null ? new ArrayList() : a().getConfiguredNetworks();
    }

    public static List<ScanResult> b(WifiManager wifiManager) {
        Object[] objArr = {wifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "398ae5c398945517b6cdeff0e1f23539", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "398ae5c398945517b6cdeff0e1f23539") : a() == null ? new ArrayList() : a().getScanResults();
    }

    public static WifiInfo c(WifiManager wifiManager) {
        Object[] objArr = {wifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d73db569ac0e8464fa91b88a80458e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d73db569ac0e8464fa91b88a80458e1");
        }
        if (a() == null) {
            return null;
        }
        return a().getConnectionInfo();
    }

    public static boolean d(WifiManager wifiManager) {
        Object[] objArr = {wifiManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2010308b5293739f42330293fe3a3353", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2010308b5293739f42330293fe3a3353")).booleanValue() : a() != null && a().startScan();
    }

    public static byte[] a(NetworkInterface networkInterface) throws SocketException {
        Object[] objArr = {networkInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b18983bf5a75eeb94ba1a32db0803493", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b18983bf5a75eeb94ba1a32db0803493") : a() == null ? new byte[0] : a().getHardwareAddress();
    }

    public static String a(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb86a79285b484157e8d69173a0510dd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb86a79285b484157e8d69173a0510dd") : a() == null ? "" : a().getMacAddress();
    }

    private static MtWifiManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c19ae789894be37b8b43b76f7a90acd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtWifiManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c19ae789894be37b8b43b76f7a90acd");
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    if (com.meituan.android.privacy.impl.d.a() == null) {
                        return null;
                    }
                    b = Privacy.createWifiManager(com.meituan.android.privacy.impl.d.a(), "privacy-hook");
                }
            }
        }
        return b;
    }
}
