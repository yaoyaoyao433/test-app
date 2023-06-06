package com.meituan.android.privacy.interfaces.def;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WpsInfo;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class v extends c implements MtWifiManager {
    public static ChangeQuickRedirect c;
    private WifiManager d;

    public v(Context context, String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a221d2db5955b20ec6cded9e9b5447e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a221d2db5955b20ec6cded9e9b5447e");
        } else if (this.a != null) {
            try {
                this.d = (WifiManager) this.a.getApplicationContext().getSystemService("wifi");
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    @SuppressLint({"MissingPermission"})
    public final List<WifiConfiguration> getConfiguredNetworks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b36c287c4993fce7bd30ef652e173ca", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b36c287c4993fce7bd30ef652e173ca") : this.d == null ? new ArrayList() : com.meituan.android.privacy.aop.e.a(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final List<ScanResult> getScanResults() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d56e2aa61360c070ea5a9e97cafe66d7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d56e2aa61360c070ea5a9e97cafe66d7") : this.d == null ? new ArrayList() : com.meituan.android.privacy.aop.e.b(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final WifiInfo getConnectionInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc4fcdc647e75be99e7bca52995c5ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc4fcdc647e75be99e7bca52995c5ef");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.e.c(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final boolean startScan() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44fddaf105436f2e166d61d23f48fec2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44fddaf105436f2e166d61d23f48fec2")).booleanValue() : this.d != null && com.meituan.android.privacy.aop.e.d(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    @RequiresApi(api = 19)
    public final void setTdlsEnabled(InetAddress inetAddress, boolean z) {
        Object[] objArr = {inetAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa9c2275135f5a44623aef0acbf72204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa9c2275135f5a44623aef0acbf72204");
        } else {
            com.meituan.android.privacy.interfaces.a.a();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    @RequiresApi(api = 19)
    public final void setTdlsEnabledWithMacAddress(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2dcaed0c095701d4ec0848433f21c22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2dcaed0c095701d4ec0848433f21c22");
        } else {
            com.meituan.android.privacy.interfaces.a.a();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    @RequiresApi(api = 26)
    public final void startLocalOnlyHotspot(WifiManager.LocalOnlyHotspotCallback localOnlyHotspotCallback, @Nullable Handler handler) {
        Object[] objArr = {localOnlyHotspotCallback, handler};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32ff6d92aeea69dbae256cb66199938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32ff6d92aeea69dbae256cb66199938");
        } else if (this.d != null) {
            this.d.startLocalOnlyHotspot(localOnlyHotspotCallback, handler);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    @RequiresApi(api = 21)
    public final void startWps(WpsInfo wpsInfo, WifiManager.WpsCallback wpsCallback) {
        Object[] objArr = {wpsInfo, wpsCallback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1db79664590684ac134d9d95359d1647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1db79664590684ac134d9d95359d1647");
        } else if (this.d != null) {
            this.d.startWps(wpsInfo, wpsCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final int getWifiState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d263f63bb981fdad0ef5ed50f55b1e3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d263f63bb981fdad0ef5ed50f55b1e3f")).intValue();
        }
        if (this.d == null) {
            return 4;
        }
        return this.d.getWifiState();
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final DhcpInfo getDhcpInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd57074746c2ff258eefed0edff839bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (DhcpInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd57074746c2ff258eefed0edff839bf");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.getDhcpInfo();
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    @SuppressLint({"HardwareIds"})
    public final String getMacAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff4f28776a2756749a4e3a8fc44912e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff4f28776a2756749a4e3a8fc44912e0");
        }
        if (this.d != null) {
            return com.meituan.android.privacy.aop.e.a(com.meituan.android.privacy.aop.e.c(this.d));
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final String getP2pMacAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50db2916b000fc7c0d5d154b9b46a431", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50db2916b000fc7c0d5d154b9b46a431");
        }
        String str = "";
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("p2p0")) {
                    byte[] a = com.meituan.android.privacy.aop.e.a(networkInterface);
                    if (a == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : a) {
                        sb.append(Integer.toHexString(b & 255));
                        sb.append(CommonConstant.Symbol.COLON);
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    str = sb.toString();
                }
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final boolean isScanAlwaysAvailable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc99d7217c5ab77c1319b21ef099142c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc99d7217c5ab77c1319b21ef099142c")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return this.d.isScanAlwaysAvailable();
    }

    @Override // com.meituan.android.privacy.interfaces.MtWifiManager
    public final boolean isWifiEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c881cbc330cf690c9b94a4ed5cb7cd1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c881cbc330cf690c9b94a4ed5cb7cd1e")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return this.d.isWifiEnabled();
    }

    private static byte[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f207377c44ffaef311fa03c3e807cad2", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f207377c44ffaef311fa03c3e807cad2");
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
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3422f4e15c306a0e65945d111aca63ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3422f4e15c306a0e65945d111aca63ec");
        }
        String str = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement != null) {
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) && (TextUtils.equals("wlan0", name) || TextUtils.equals("eth0", name))) {
                            byte[] a = com.meituan.android.privacy.aop.e.a(nextElement);
                            if (a != null && a.length > 0) {
                                StringBuilder sb = new StringBuilder();
                                int length = a.length;
                                for (int i = 0; i < length; i++) {
                                    sb.append(String.format("%02X:", Byte.valueOf(a[i])));
                                }
                                if (sb.length() > 0) {
                                    sb.deleteCharAt(sb.length() - 1);
                                }
                                String sb2 = sb.toString();
                                if (sb2 == null) {
                                    sb2 = "";
                                }
                                str = sb2;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return a(str);
    }
}
